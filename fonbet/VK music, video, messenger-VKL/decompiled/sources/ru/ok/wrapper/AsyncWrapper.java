package ru.ok.wrapper;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import ru.ok.tensorflow.util.Producer;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.qo2;

/* loaded from: classes9.dex */
public class AsyncWrapper<T> implements Closeable {
    private long cooldownTime;
    private T lastResult;
    private final ExecutorService executor = Executors.newFixedThreadPool(1);
    private long lastSubmitTime = 0;
    private ConditionLock isReady = new ConditionLock(true);

    public AsyncWrapper(long j, T t) {
        this.cooldownTime = j;
        this.lastResult = t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submitTask$0(Producer producer) {
        this.lastResult = (T) producer.apply();
        this.isReady.set(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.executor.shutdown();
        try {
            this.executor.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    public T fetchResult() {
        return this.lastResult;
    }

    public boolean isReady() {
        return this.isReady.get() && System.currentTimeMillis() - this.lastSubmitTime > this.cooldownTime;
    }

    public void submitTask(Producer<T> producer) {
        this.isReady.set(false);
        this.lastSubmitTime = System.currentTimeMillis();
        this.executor.execute(new qo2(1, this, producer));
    }

    public T fetchResult(long j) {
        this.isReady.await(true, j);
        return this.lastResult;
    }
}

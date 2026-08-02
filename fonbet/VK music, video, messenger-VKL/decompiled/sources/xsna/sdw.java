package xsna;

import com.vk.stories.StoriesVideoEncoder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ImStoryConverter.kt */
/* loaded from: classes7.dex */
public final class sdw implements StoriesVideoEncoder.a {
    public final /* synthetic */ yjt a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ Ref$ObjectRef<Throwable> c;

    public sdw(yjt yjtVar, CountDownLatch countDownLatch, Ref$ObjectRef ref$ObjectRef) {
        this.a = yjtVar;
        this.b = countDownLatch;
        this.c = ref$ObjectRef;
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void c(boolean z) {
        this.b.countDown();
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void onCancel() {
        this.b.countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void onError(Throwable th) {
        this.c.element = th;
        this.b.countDown();
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void r(int i) {
        this.a.onProgress(Math.min(i, 100) * 10, 1000);
    }

    @Override // com.vk.stories.StoriesVideoEncoder.a
    public final void s(int i) {
    }
}

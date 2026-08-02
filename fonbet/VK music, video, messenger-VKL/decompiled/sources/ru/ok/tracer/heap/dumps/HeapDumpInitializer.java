package ru.ok.tracer.heap.dumps;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.startup.Initializer;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import xsna.j1q;

/* compiled from: HeapDumpInitializer.kt */
/* loaded from: classes11.dex */
public final class HeapDumpInitializer implements Initializer<HeapDumps> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$0(Context context) {
        Logger.d$default("Heap dumps installed", null, 2, null);
        HeapDumps.INSTANCE.install$tracer_heap_dumps_release(context);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public HeapDumps create(Context context) {
        TracerThreads.INSTANCE.runInBgSequential(new j1q(context, 1));
        return HeapDumps.INSTANCE;
    }
}

package ru.ok.tracer.utils;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread invoke$lambda$0;
        invoke$lambda$0 = TracerThreads$bgExecutor$2.invoke$lambda$0(runnable);
        return invoke$lambda$0;
    }
}

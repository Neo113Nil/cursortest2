package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes10.dex */
public final class i30 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new h30(0, runnable), "glide-active-resources");
            case 1:
                return new wht(runnable);
            case 2:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 3:
                return new wht(runnable, "ImageThreadFactory");
            default:
                return new e6j0(runnable);
        }
    }
}

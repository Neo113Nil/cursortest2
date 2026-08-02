package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class of3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public of3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                break;
            case 2:
                this.b = new AtomicInteger(0);
                break;
            case 3:
                this.b = new AtomicInteger(1);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(new nf3(0, runnable));
                Locale locale = Locale.US;
                thread.setName("CameraX-camerax_audio_" + atomicInteger.getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(new nf3(1, runnable));
                thread2.setPriority(7);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                Locale locale3 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread3;
            default:
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(20);
                sb.append("gcm-task#");
                sb.append(andIncrement);
                Thread thread4 = new Thread(runnable, sb.toString());
                thread4.setPriority(4);
                return thread4;
        }
    }
}

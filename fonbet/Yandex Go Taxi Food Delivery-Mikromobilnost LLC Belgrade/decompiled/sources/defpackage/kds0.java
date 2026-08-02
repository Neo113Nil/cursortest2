package defpackage;

import android.app.ActivityManager;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.License;

/* loaded from: classes10.dex */
public final class kds0 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kds0(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        boolean z;
        switch (this.a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        ny61.o(e);
                        return;
                    }
                } while (((n06) this.b).h());
                return;
            case 1:
                break;
            case 2:
                ((yow) this.b).invoke();
                return;
            case 3:
                try {
                    ((License) this.b).setNewLicense();
                    return;
                } catch (Exception e2) {
                    JCPLogger.warning(e2);
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e3) {
                        ny61.o(e3);
                        return;
                    }
                } while (((zt71) this.b).e());
                return;
        }
        while (true) {
            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = (SkiaPooledImageRegionDecoder) this.b;
            hhs0 hhs0Var = skiaPooledImageRegionDecoder.a;
            if (hhs0Var == null) {
                return;
            }
            synchronized (hhs0Var) {
                size = ((ConcurrentHashMap) hhs0Var.c).size();
            }
            long j = ((SkiaPooledImageRegionDecoder) this.b).f;
            if (size >= 4 || size * j > 20971520) {
                return;
            }
            if (size >= Runtime.getRuntime().availableProcessors()) {
                Runtime.getRuntime().availableProcessors();
                return;
            }
            ActivityManager activityManager = (ActivityManager) skiaPooledImageRegionDecoder.d.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                z = memoryInfo.lowMemory;
            } else {
                z = true;
            }
            if (z) {
                return;
            }
            try {
                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = (SkiaPooledImageRegionDecoder) this.b;
                if (skiaPooledImageRegionDecoder2.a != null) {
                    skiaPooledImageRegionDecoder2.d();
                }
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ kds0(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
    }
}

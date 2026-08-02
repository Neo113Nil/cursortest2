package xsna;

import android.os.SystemClock;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ImageBackground.kt */
/* loaded from: classes16.dex */
public final class xfw implements b780 {
    public final /* synthetic */ VKImageView b;
    public final /* synthetic */ long c;
    public final /* synthetic */ yfw d;
    public final /* synthetic */ String e;

    public xfw(VKImageView vKImageView, long j, yfw yfwVar, String str) {
        this.b = vKImageView;
        this.c = j;
        this.d = yfwVar;
        this.e = str;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        final long j = this.c;
        final yfw yfwVar = this.d;
        final String str2 = this.e;
        Runnable runnable = new Runnable() { // from class: xsna.wfw
            @Override // java.lang.Runnable
            public final void run() {
                yfwVar.a.invoke(Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
            }
        };
        VKImageView vKImageView = this.b;
        vKImageView.post(runnable);
        vKImageView.setOnLoadCallback(null);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}

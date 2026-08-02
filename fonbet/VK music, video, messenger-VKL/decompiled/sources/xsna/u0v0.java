package xsna;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.vk.update.core.InAppUpdateUi;

/* compiled from: VkInAppUpdateUiImpl.kt */
/* loaded from: classes7.dex */
public final class u0v0 implements InAppUpdateUi {
    public final Activity a;
    public final int b;
    public final int c;
    public final bpn0 d = new bpn0(new fcs0(this, 7));
    public final int e = g().g;

    public u0v0(ComponentActivity componentActivity, int i, int i2) {
        this.a = componentActivity;
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void a(Throwable th) {
        g().a(th);
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void b(long j, long j2) {
        g().b(j, j2);
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void c(InAppUpdateUi.DownloadInfo downloadInfo) {
        g().c(downloadInfo);
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void d(fy0 fy0Var) {
        g().d(fy0Var);
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final int e() {
        return this.e;
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void f(Throwable th, ni0 ni0Var) {
        g().f(th, ni0Var);
    }

    public final bdr0 g() {
        return (bdr0) this.d.getValue();
    }
}

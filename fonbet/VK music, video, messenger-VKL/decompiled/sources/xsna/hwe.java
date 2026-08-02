package xsna;

import android.content.Context;
import android.os.PowerManager;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipsPrecacheExternalProviderImpl.kt */
/* loaded from: classes16.dex */
public final class hwe {
    public final bpn0 a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e = new bpn0(new xm1(this, 23));
    public final bpn0 f;

    public hwe(g8m g8mVar) {
        this.a = new bpn0(new oo(g8mVar, 22));
        this.b = new bpn0(new com.vk.movika.sdk.base.logic.interactor.h(g8mVar, 22));
        this.c = new bpn0(new wm1(g8mVar, 22));
        this.d = new bpn0(new com.vk.movika.sdk.base.logic.interactor.j(g8mVar, 26));
        this.f = new bpn0(new ka0(g8mVar, 26));
    }

    public final zof a() {
        return (zof) this.d.getValue();
    }

    public final io.reactivex.rxjava3.core.w b() {
        asu0.a.getClass();
        return asu0.i();
    }

    public final boolean c() {
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            return false;
        }
        r6m r6mVar = r6m.a;
        r6mVar.getClass();
        Context context = r6m.e;
        if (context == null) {
            context = null;
        }
        if (((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
            return false;
        }
        r6mVar.getClass();
        return r6m.h(1);
    }

    public final void d(Context context, SdkVideoFile sdkVideoFile) {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        if (frd.a()) {
            i0q0.f(new dyc(context, this, sdkVideoFile));
        } else {
            i0q0.f(new com.vk.movika.sdk.base.logic.interactor.c(10, this, sdkVideoFile));
        }
    }

    public final void e(SdkVideoFile sdkVideoFile) {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        if (frd.a()) {
            i0q0.f(new ie3(5, this, sdkVideoFile));
        } else {
            i0q0.f(new qg1(7, this, sdkVideoFile));
        }
    }
}

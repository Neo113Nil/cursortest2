package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import xsna.it80;

/* compiled from: ScreenCaptureManagerImpl.kt */
/* loaded from: classes7.dex */
public final class rah0 implements ScreenCapturePermissionProvider {
    public final pvw0 a;
    public final com.vk.voip.b b;
    public final Context c;
    public final v3q d;
    public final io.reactivex.rxjava3.subjects.f<s3q0> e = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.d<Boolean> f = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    public final io.reactivex.rxjava3.subjects.d<it80<Intent>> g;
    public io.reactivex.rxjava3.disposables.c h;
    public Intent i;
    public final io.reactivex.rxjava3.disposables.c j;
    public volatile boolean k;

    public rah0(pvw0 pvw0Var, com.vk.voip.b bVar, Context context, j1t0 j1t0Var, v3q v3qVar) {
        this.a = pvw0Var;
        this.b = bVar;
        this.c = context;
        this.d = v3qVar;
        it80.b.getClass();
        this.g = io.reactivex.rxjava3.subjects.d.O0(it80.a.a());
        this.h = EmptyDisposable.INSTANCE;
        this.j = io.reactivex.rxjava3.kotlin.c.f(2, c(), null, new l140(12), new bq00(this, 29));
    }

    public final boolean a() {
        boolean z;
        if (!com.vk.voip.ui.c.K0.h()) {
            return false;
        }
        MediaOptionState screenshareState = this.b.getMediaOptionsForCurrentUser().getScreenshareState();
        try {
            z = ((KeyguardManager) this.c.getSystemService("keyguard")).isKeyguardLocked();
        } catch (Throwable th) {
            L.f("ScreenCaptureManagerImpl", "Keyguard access error", th);
            z = false;
        }
        return (z || screenshareState == MediaOptionState.MUTED_PERMANENT) ? false : true;
    }

    public final boolean b() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.D;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y c() {
        io.reactivex.rxjava3.core.q o0 = ysg0.b.a.b0(h3x0.class).U(new fe60(new p010(this, 26), 10)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new v640(this, 2)));
        o0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final void d() {
        vv20 vv20Var = new vv20(this, 21);
        if (i0q0.b()) {
            vv20Var.invoke();
        } else {
            this.d.d().c(new d2g0(1, vv20Var));
        }
    }

    public final void e(Intent intent) {
        this.i = intent;
        it80.b.getClass();
        this.g.onNext(new it80<>(intent));
    }

    @Override // ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider
    public final Intent getPermissions() {
        return this.i;
    }
}

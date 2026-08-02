package xsna;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.vk.device.store.AppStore;
import com.vk.update.core.DownloadState;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;

/* compiled from: RustoreInAppUpdateEngine.kt */
/* loaded from: classes6.dex */
public final class lsg0 implements vrw {
    public final Activity a;
    public final boolean b;
    public final boolean c;
    public final ro d;
    public final bpn0 e = new bpn0(new io60(this, 23));
    public final String f = AppStore.RUSTORE.j();

    public lsg0(ComponentActivity componentActivity, boolean z, boolean z2, ro roVar) {
        this.a = componentActivity;
        this.b = z;
        this.c = z2;
        this.d = roVar;
    }

    @Override // xsna.vrw
    public final String a() {
        return this.f;
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.q<wrw> b(final wrw wrwVar) {
        this.d.l("download rustore update:" + wrwVar);
        Object obj = wrwVar.f;
        final AppUpdateInfo appUpdateInfo = obj instanceof AppUpdateInfo ? (AppUpdateInfo) obj : null;
        return appUpdateInfo == null ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("payload is null")) : new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.jsg0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [xsna.fsg0] */
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(final io.reactivex.rxjava3.core.r rVar) {
                final lsg0 lsg0Var = lsg0.this;
                final wrw wrwVar2 = wrwVar;
                final ?? r0 = new h6x() { // from class: xsna.fsg0
                    @Override // xsna.h6x
                    public final void a(InstallState installState) {
                        lsg0.this.d.l("rustore install state updated:" + installState);
                        int installStatus = installState.getInstallStatus();
                        io.reactivex.rxjava3.core.r rVar2 = rVar;
                        wrw wrwVar3 = wrwVar2;
                        if (installStatus == 1) {
                            rVar2.onNext(wrw.a(wrwVar3, 0L, DownloadState.DOWNLOADED, new v8o(installState.getBytesDownloaded(), installState.getTotalBytesToDownload()), 39));
                            rVar2.onComplete();
                        } else if (installStatus == 2) {
                            rVar2.onNext(wrw.a(wrwVar3, 0L, DownloadState.DOWNLOADING, new v8o(installState.getBytesDownloaded(), installState.getTotalBytesToDownload()), 39));
                        } else {
                            if (installStatus != 3) {
                                return;
                            }
                            rVar2.onError(new IllegalStateException("Download failed!"));
                        }
                    }
                };
                bpn0 bpn0Var = lsg0Var.e;
                ((wqg0) bpn0Var.getValue()).d(r0);
                AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
                boolean z = appUpdateInfo2.getUpdateAvailability() == 3;
                AppUpdateOptions.Builder builder = new AppUpdateOptions.Builder();
                if (z) {
                    builder.appUpdateType(1);
                } else {
                    builder.appUpdateType(0);
                }
                ((wqg0) bpn0Var.getValue()).e(appUpdateInfo2, builder.build()).b(null, new wx40(rVar, 4));
                rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.gsg0
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        ((wqg0) lsg0.this.e.getValue()).c(r0);
                    }
                });
            }
        }).r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.x<wrw> c(int i) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new isg0(0)).q(io.reactivex.rxjava3.schedulers.a.b()).o(Boolean.FALSE), new k6c0(new ksg0(this, 0), 2));
    }

    @Override // xsna.vrw
    public final boolean d() {
        return false;
    }

    @Override // xsna.vrw
    public final boolean e() {
        return this.b;
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.a f(wrw wrwVar) {
        return new io.reactivex.rxjava3.internal.operators.completable.e(new bzc0(this, wrwVar));
    }
}

package xsna;

import android.app.Activity;
import android.hardware.camera2.params.SessionConfiguration;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallState;
import com.ironsource.X3;
import com.vk.update.core.DownloadState;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d3u implements io.reactivex.rxjava3.core.s, ub9.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d3u(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        String str;
        xon0 xon0Var = (xon0) this.b;
        mh9 mh9Var = (mh9) this.c;
        zsi0 zsi0Var = (zsi0) this.d;
        synchronized (xon0Var.a) {
            obr.f("The openCaptureSessionCompleter can only set once!", xon0Var.h == null);
            xon0Var.h = aVar;
            ph9 ph9Var = mh9Var.a;
            ph9Var.getClass();
            SessionConfiguration sessionConfiguration = zsi0Var.a.a;
            sessionConfiguration.getClass();
            ph9Var.a.createCaptureSession(sessionConfiguration);
            str = "openCaptureSession[session=" + xon0Var + X3.j.e;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [xsna.a3u] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final e3u e3uVar = (e3u) this.b;
        final wrw wrwVar = (wrw) this.c;
        qa3 qa3Var = (qa3) this.d;
        Activity activity = e3uVar.a;
        final ?? r4 = new suk0() { // from class: xsna.a3u
            @Override // xsna.suk0
            public final void a(Object obj) {
                InstallState installState = (InstallState) obj;
                e3u e3uVar2 = e3u.this;
                e3uVar2.d.l("gms install state updated:" + installState);
                int c = installState.c();
                io.reactivex.rxjava3.core.r rVar2 = rVar;
                wrw wrwVar2 = wrwVar;
                if (c == 2) {
                    rVar2.onNext(wrw.a(wrwVar2, 0L, DownloadState.DOWNLOADING, new v8o(installState.a(), installState.e()), 39));
                    return;
                }
                if (c == 11) {
                    Task<qa3> a = e3uVar2.g().a();
                    rVar2.onNext(wrw.a(wrwVar2, (!a.isComplete() || a.getResult() == null) ? -1L : a.getResult().b, DownloadState.DOWNLOADED, new v8o(installState.a(), installState.e()), 37));
                    rVar2.onComplete();
                } else if (c == 4) {
                    io.reactivex.rxjava3.internal.operators.completable.i iVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                } else if (c == 5 || c == 6) {
                    rVar2.onError(new IllegalStateException("Download failed!"));
                }
            }
        };
        e3uVar.g().d(r4);
        if (!(qa3Var.c == 3 ? e3uVar.g().b(qa3Var, 1, activity) : e3uVar.g().b(qa3Var, 0, activity))) {
            rVar.onError(new IllegalStateException("Can't perform update flow"));
        }
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.z2u
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                e3u.this.g().c(r4);
            }
        });
    }
}

package xsna;

import android.os.SystemClock;
import android.util.SparseArray;
import com.vk.core.preference.Preference;
import com.vk.log.L;

/* compiled from: ActivateStickersInteractor.kt */
/* loaded from: classes6.dex */
public final class d80 implements p7f0, ulv, fkc0, t96, a5a {
    public Object b;

    public /* synthetic */ d80(Object obj) {
        this.b = obj;
    }

    @Override // xsna.t96, xsna.a5a
    public void a() {
        ((a5a) this.b).a();
    }

    @Override // xsna.ulv
    public boolean b() {
        boolean b = ((hr80) this.b).b();
        if (b) {
            Preference.F(SystemClock.elapsedRealtime(), "fcm_action_last_time", "last_time_key");
        }
        return b;
    }

    @Override // xsna.t96, xsna.a5a
    public boolean c() {
        return ((a5a) this.b).c();
    }

    @Override // xsna.fkc0
    public void d() {
        e3j0 e3j0Var = ((f3j0) this.b).o;
        if (e3j0Var != null) {
            e3j0Var.g();
        }
    }

    @Override // xsna.fkc0
    public void e() {
        e3j0 e3j0Var = ((f3j0) this.b).o;
        if (e3j0Var != null) {
            e3j0Var.b.e1(null);
        }
    }

    public void f() {
        L.A("CameraUIPresenter", "audio track playback finished");
    }

    public void g(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.b = cVar;
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return (io.reactivex.rxjava3.disposables.c) this.b;
    }

    @Override // xsna.p7f0
    public /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Object obj2) {
        g((io.reactivex.rxjava3.disposables.c) obj2);
    }

    public /* synthetic */ d80(mbl mblVar) {
        cbb cbbVar = new cbb(mblVar, 7);
        this.b = bvz0.a(new byt(bvz0.a(new lvc0(bvz0.a(new ah3(cbbVar, bvz0.a(new cbb(cbbVar, 8)))), bvz0.a(new m0g0(cbbVar)), cbbVar, 3))));
    }

    public d80(int i) {
        switch (i) {
            case 5:
                this.b = new hr80();
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }
}

package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: GeopickerPresenter.kt */
/* loaded from: classes6.dex */
public final class xnt implements unt {
    public final vnt b;
    public boolean c;
    public boolean d;
    public final io.reactivex.rxjava3.subjects.d<List<qwz>> e = io.reactivex.rxjava3.subjects.d.N0();
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public String i;
    public qwz j;
    public qwz k;

    public xnt(vnt vntVar) {
        this.b = vntVar;
    }

    @Override // xsna.unt
    public final void A() {
        g(this.i, true);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b() {
        qwz qwzVar = this.k;
        if (qwzVar != null) {
            String str = qwzVar.d;
            qwz qwzVar2 = this.j;
            if (!epx.f(str, qwzVar2 != null ? qwzVar2.d : null)) {
                ynt.a.a(new swz(qwzVar));
                this.j = qwzVar;
            }
        }
        this.k = null;
    }

    @Override // xsna.gm6
    public final void d() {
        this.c = true;
        g(this.i, false);
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = this.e.a0(asu0.a.d()).subscribe(new jv(new dwg(this, 17), 22));
    }

    public final void g(CharSequence charSequence, boolean z) {
        String str;
        if (z || (!((((str = this.i) == null || str.length() == 0) && (charSequence == null || charSequence.length() == 0)) || brm0.r(str, charSequence)) || this.g == null)) {
            this.i = charSequence != null ? charSequence.toString() : null;
            io.reactivex.rxjava3.disposables.c cVar = this.g;
            if (cVar != null) {
                cVar.dispose();
            }
            this.g = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new zzr0(charSequence != null ? charSequence.toString() : null, 2), null, null, 3), new bg1(new r9k(this, 13), 26), io.reactivex.rxjava3.internal.functions.a.c), new g30(this, 4)).subscribe(new wnt(new pcg(this, 26), 0), new hv(new kdn(this, 8), 24));
        }
    }

    @Override // xsna.unt
    public final void k0(CharSequence charSequence) {
        g(charSequence, false);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.c = false;
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.g = null;
    }

    @Override // xsna.gm6
    public final void onStart() {
        this.d = true;
    }

    @Override // xsna.gm6
    public final void onStop() {
        b();
        this.d = false;
    }

    @Override // xsna.unt
    public final void w1(uwz uwzVar) {
        qwz qwzVar = uwzVar.a;
        if (!epx.f(qwzVar.d, "auto_select")) {
            x(qwzVar);
            return;
        }
        FragmentActivity activity = this.b.getActivity();
        if (activity == null) {
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.g(permissionHelper, activity, PermissionHelper.h, PermissionHelper.i, 0, R.string.vk_geopicker_permission_description, new k75(10, this, qwzVar), null, null, 200);
    }

    public final void x(qwz qwzVar) {
        String str = qwzVar.d;
        ibn0 ibn0Var = new ibn0("superApp.setLocality");
        ibn0Var.K("locality_hash", str);
        new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(ibn0Var, null, null, 3), new ho1(new k7f(this, 17), 24), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new io1(new com.vk.libvideo.design.view.video.a(16, this, qwzVar), 27), new gn0(new qcl(this, 15), 23));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }
}

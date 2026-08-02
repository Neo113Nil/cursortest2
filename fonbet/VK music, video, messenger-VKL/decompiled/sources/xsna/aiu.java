package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.uhu;

/* compiled from: GroupCallInviteVc.kt */
/* loaded from: classes7.dex */
public final class aiu extends pe {
    public static final int r = iah0.a(48);
    public ViewGroup e;
    public BottomSheetBehavior<ViewGroup> f;
    public ViewFlipper g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public TextView m;
    public TextView n;
    public q2x0 o;
    public ViewStub p;
    public uhu.a q;

    @Override // xsna.pe
    public final void a() {
        q2x0 q2x0Var = this.o;
        if (q2x0Var != null) {
            q2x0Var.a();
        }
    }

    @Override // xsna.pe
    public final void b(s89 s89Var) {
        ViewFlipper viewFlipper = this.g;
        if (viewFlipper == null) {
            viewFlipper = null;
        }
        sp.g(viewFlipper, 0);
        super.b(s89Var);
    }

    public final void c() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X(5);
        q2x0 q2x0Var = this.o;
        if (q2x0Var != null) {
            s2x0 s2x0Var = q2x0Var.e;
            com.vk.core.tips.b bVar = s2x0Var.g;
            if (bVar != null) {
                bVar.b(false);
            }
            s2x0Var.g = null;
            q2x0Var.d.d.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup] */
    public final void d(izs<? super View, s3q0> izsVar) {
        ViewStub viewStub = this.p;
        if (viewStub == null) {
            viewStub = null;
        }
        if (bwt0.J(viewStub)) {
            ?? r0 = this.e;
            izsVar.invoke(r0 != 0 ? r0 : null);
            return;
        }
        ViewStub viewStub2 = this.p;
        View inflate = (viewStub2 != null ? viewStub2 : null).inflate();
        inflate.setBackground(inflate.getContext().getDrawable(R.drawable.bg_caller_item));
        bwt0.i0(inflate, new t1e(this, 28));
        izsVar.invoke(inflate);
    }
}

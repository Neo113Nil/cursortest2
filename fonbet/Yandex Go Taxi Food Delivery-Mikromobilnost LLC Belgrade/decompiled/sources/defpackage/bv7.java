package defpackage;

import android.content.Context;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class bv7 extends pgd {
    public final Context F;
    public final w030 G;
    public final co40 H;
    public final gv7 I;
    public final md6 J;
    public final p1b K;

    public bv7(Context context, w030 w030Var, co40 co40Var, gv7 gv7Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = co40Var;
        this.I = gv7Var;
        this.J = new md6(14, co40Var, new sr4(22, this));
        this.K = new p1b(gv7Var, new zu7(this, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        av7 av7Var = (av7) obj;
        co40 co40Var = this.H;
        co40Var.getClass();
        co40Var.a.a("TaxiOrderCancel.CancelCommentModalView.Shown", new HashMap(), 1, new HashMap());
        CancelReasonsGrouped.Comment.CommentModal commentModal = av7Var.a;
        String str = av7Var.b;
        r0 r0Var = this.I.a;
        String str2 = commentModal.a;
        if (str == null) {
            str = "";
        }
        fv7 fv7Var = new fv7(str2, str, commentModal.b);
        r0Var.getClass();
        r0Var.m(null, fv7Var);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}

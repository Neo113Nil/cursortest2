package defpackage;

import com.yandex.go.design.view.GoImageView;
import java.util.Set;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.model.BoardingWagon;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class pr1 extends lys implements t7u {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S;
    public eiy T;
    public eiy U;
    public epu V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(aj40 aj40Var) {
        super(aj40Var);
        this.S = 3;
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        this.V = new cpu(aj40Var.c, aj40Var.a);
    }

    public static void c0(GoImageView goImageView, boolean z) {
        goImageView.setImageResource(z ? q2h0.mt_train_car_selected : q2h0.mt_train_car);
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.X();
            case 2:
                return false;
            case 3:
                return false;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.S) {
            case 1:
                super.applyTheme(themeType);
                ((rn4) ((zo31) this.R)).c.setTextColor(c.c(xng0.textMinor, this.a));
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                jr1 jr1Var = (jr1) obj;
                vr1 vr1Var = (vr1) ((zo31) obj2);
                this.T = lob1.g(jr1Var.d);
                this.U = lob1.g(jr1Var.d);
                vr1Var.c.setText(jr1Var.b);
                GoImageView goImageView = vr1Var.b;
                obm obmVar = jr1Var.a;
                goImageView.setImageDrawable(obmVar != null ? obmVar.b : null);
                break;
            case 1:
                sn4 sn4Var = (sn4) obj;
                rn4 rn4Var = (rn4) ((zo31) obj2);
                this.T = lob1.g(sn4Var.c);
                this.U = lob1.g(sn4Var.d);
                rn4Var.b.setText(sn4Var.a);
                rn4Var.c.setText(sn4Var.b);
                break;
            case 2:
                ux11 ux11Var = (ux11) obj;
                this.T = lob1.g(ux11Var.c);
                this.U = lob1.g(ux11Var.c);
                bd30 bd30Var = (bd30) ((zo31) obj2);
                GoImageView goImageView2 = bd30Var.b;
                Set set = ux11Var.a;
                c0(goImageView2, set.contains(BoardingWagon.HEAD));
                c0(bd30Var.f, set.contains(BoardingWagon.NEAR_THE_HEAD));
                c0(bd30Var.e, set.contains(BoardingWagon.MIDDLE));
                c0(bd30Var.g, set.contains(BoardingWagon.NEAR_THE_TAIL));
                c0(bd30Var.c, set.contains(BoardingWagon.TAIL));
                bd30Var.h.setContentDescription(ux11Var.b);
                break;
            default:
                jt01 jt01Var = (jt01) obj;
                aj40 aj40Var = (aj40) ((zo31) obj2);
                jt01Var.getClass();
                this.T = lob1.g(g911.a);
                this.U = lob1.g(f911.a);
                obm obmVar2 = jt01Var.a;
                if (obmVar2 != null) {
                    aj40Var.c.setImageDrawable(obmVar2.b);
                }
                aj40Var.f.setText(jt01Var.b);
                aj40Var.d.setText(jt01Var.c);
                aj40Var.b.setText(jt01Var.e);
                aj40Var.e.setText(jt01Var.d);
                this.a.setContentDescription(jt01Var.f);
                break;
        }
    }

    @Override // defpackage.t7u
    public final eiy g() {
        switch (this.S) {
        }
        return this.T;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        switch (this.S) {
        }
        return this.U;
    }

    @Override // defpackage.t7u
    public final epu x() {
        switch (this.S) {
            case 0:
                return (dpu) this.V;
            case 1:
                return (dpu) this.V;
            case 2:
                return (dpu) this.V;
            default:
                return (cpu) this.V;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr1(zo31 zo31Var, int i) {
        super(zo31Var);
        this.S = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr1(bd30 bd30Var) {
        super(bd30Var);
        this.S = 2;
        aiy aiyVar = aiy.a;
        this.T = aiyVar;
        this.U = aiyVar;
        this.V = new dpu(bd30Var.d, null);
    }
}

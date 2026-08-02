package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.NestedScrollableHost;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class ca1 extends lys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public static final /* synthetic */ int c0 = 0;
    public static final /* synthetic */ int d0 = 0;
    public static final /* synthetic */ int e0 = 0;
    public static final /* synthetic */ int f0 = 0;
    public static final /* synthetic */ int g0 = 0;
    public static final /* synthetic */ int h0 = 0;
    public static final /* synthetic */ int i0 = 0;
    public static final /* synthetic */ int j0 = 0;
    public static final /* synthetic */ int k0 = 0;
    public static final /* synthetic */ int l0 = 0;
    public static final /* synthetic */ int m0 = 0;
    public static final /* synthetic */ int n0 = 0;
    public static final /* synthetic */ int o0 = 0;
    public static final /* synthetic */ int p0 = 0;
    public static final /* synthetic */ int q0 = 0;
    public static final /* synthetic */ int r0 = 0;
    public static final /* synthetic */ int s0 = 0;
    public static final /* synthetic */ int t0 = 0;
    public static final /* synthetic */ int u0 = 0;
    public static final /* synthetic */ int v0 = 0;
    public static final /* synthetic */ int w0 = 0;
    public static final /* synthetic */ int x0 = 0;
    public static final /* synthetic */ int y0 = 0;
    public final /* synthetic */ int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca1(View view, int i) {
        super(view);
        this.S = i;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 17:
            case 23:
            case 24:
            case 26:
            default:
                return super.X();
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 14:
                return false;
            case 15:
                return false;
            case 16:
                return false;
            case 18:
                return false;
            case 19:
                return false;
            case 20:
                return false;
            case 21:
                return false;
            case 22:
                return false;
            case 25:
                return false;
            case 27:
                return false;
            case 28:
                return false;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        int i = this.S;
        Object obj = this.R;
        switch (i) {
            case 1:
                super.applyTheme(themeType);
                View view = (View) obj;
                ((ListItemComponent) view).setLeadImage(c.l(q0h0.ic_scooters_agreement_point, view));
                break;
            case 6:
                super.applyTheme(themeType);
                ((ButtonComponent) ((View) obj)).setButtonBackground(c.c(xng0.controlMinor, this.a));
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        int i2 = 0;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                szu szuVar = (szu) obj;
                SourceDestinationComponent sourceDestinationComponent = (SourceDestinationComponent) ((View) obj2);
                sourceDestinationComponent.render(szuVar.a);
                gx0 gx0Var = szuVar.b;
                sourceDestinationComponent.applyDrawables(gx0Var.a, gx0Var.b);
                sourceDestinationComponent.setStopPointsDelegate(new ba1(i2, szuVar));
                break;
            case 1:
                ((ListItemComponent) ((View) obj2)).setTitle((String) obj);
                break;
            case 2:
                qo9 qo9Var = (qo9) obj;
                ButtonComponent buttonComponent = (ButtonComponent) ((View) obj2);
                buttonComponent.setText(qo9Var.b);
                buttonComponent.setButtonBackground(s8o.m(qo9Var.c, buttonComponent.getContext()));
                kdc kdcVar = qo9Var.d;
                if (kdcVar != null) {
                    buttonComponent.setOutline(c.g(1.0f, this.a), kdcVar);
                } else {
                    buttonComponent.setOutline(0, null);
                }
                buttonComponent.setClickable(!qo9Var.e.equals(tj9.a));
                break;
            case 3:
                ((ButtonComponent) ((View) obj2)).setText(((l9p0) obj).a);
                break;
            case 4:
                ((ButtonComponent) ((View) obj2)).setText(((fap0) obj).a);
                break;
            case 5:
                ((ButtonComponent) ((View) obj2)).setText(((a3p0) obj).a);
                break;
            case 6:
                break;
            case 7:
                vhj0 vhj0Var = (vhj0) obj;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                listItemComponent.setTitle(vhj0Var.a.a);
                listItemComponent.setSubtitle(vhj0Var.a.b);
                listItemComponent.setDividers(vhj0Var.c ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
                break;
            case 8:
                whj0 whj0Var = (whj0) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj2);
                listItemComponent2.setTitle(whj0Var.a.a);
                listItemComponent2.setSubtitle(whj0Var.a.b);
                listItemComponent2.setDividers(whj0Var.c ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
                break;
            case 9:
                ((ListItemComponent) ((View) obj2)).setTitle(((l1f) obj).a);
                break;
            case 10:
                break;
            case 11:
                ((RobotoTextView) ((View) obj2)).setText(((qqo0) obj).a);
                break;
            case 12:
                ((DividerAwareComponent) ((View) obj2)).setDividers(DividerPosition.TOP, ((rql) obj).a);
                break;
            case 13:
                if (obj != null) {
                    ny61.u();
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                ((FrameLayout) ((View) obj2)).setLayoutParams(new ViewGroup.LayoutParams(0, ((ier) obj).a));
                break;
            case 16:
                ((ListTitleComponent) ((View) obj2)).setTitle(((u8n0) obj).a);
                break;
            case 17:
                ((ListGroupHeaderComponent) ((View) obj2)).setTitle(((yhj0) obj).a);
                break;
            case 18:
                n9p0 n9p0Var = (n9p0) obj;
                ListItemComponent listItemComponent3 = (ListItemComponent) ((View) obj2);
                listItemComponent3.setTitleTypeface(3);
                listItemComponent3.setTitle(n9p0Var.a);
                listItemComponent3.setSubtitle((CharSequence) null);
                listItemComponent3.setTrailCompanionTextColorAttr(xng0.textMain);
                listItemComponent3.setTrailCompanionTextTypeface(3);
                listItemComponent3.setTrailCompanionText(n9p0Var.b);
                if (n9p0Var.c) {
                    listItemComponent3.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                    break;
                }
                break;
            case 19:
                o9p0 o9p0Var = (o9p0) obj;
                ListItemComponent listItemComponent4 = (ListItemComponent) ((View) obj2);
                listItemComponent4.setTitle(o9p0Var.a);
                listItemComponent4.setSubtitle(o9p0Var.b);
                listItemComponent4.setTrailMode(2);
                listItemComponent4.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                break;
            case 20:
                ((ListItemComponent) ((View) obj2)).setTitle(((ym40) obj).a);
                break;
            case 21:
                ((ListGroupHeaderComponent) ((View) obj2)).setTitle(((c3p0) obj).a);
                break;
            case 22:
                nnn0 nnn0Var = (nnn0) obj;
                ListItemComponent listItemComponent5 = (ListItemComponent) ((View) obj2);
                listItemComponent5.setTitle(nnn0Var.b);
                listItemComponent5.setSubtitle(nnn0Var.a);
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                ((FrameLayout) ((View) obj2)).setLayoutParams(new ViewGroup.LayoutParams(0, ((duv0) obj).a));
                break;
            case 26:
                ((NestedScrollableHost) ((View) obj2)).addView(((rnx0) obj).a);
                break;
            case 27:
                ((RobotoTextView) ((View) obj2)).setText(((eij0) obj).a);
                break;
            case 28:
                ((ListGroupHeaderComponent) ((View) obj2)).setTitle(((eij0) obj).a);
                break;
            default:
                break;
        }
    }
}

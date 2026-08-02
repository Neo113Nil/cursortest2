package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import java.util.List;
import ru.yandex.taxi.communications.stepsinstructions.components.StepsDashedLine;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.recycler.PlaceholderType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class b0b extends lys {
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
    public final /* synthetic */ int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0b(zo31 zo31Var, int i) {
        super(zo31Var);
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
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            default:
                return super.X();
            case 7:
                return false;
            case 9:
                return false;
            case 16:
                return false;
            case 18:
                return false;
            case 19:
                return false;
            case 20:
                return false;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.S) {
            case 20:
                super.applyTheme(themeType);
                ((wau0) ((zo31) this.R)).b.applyTheme(themeType);
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i;
        int i2 = this.S;
        View view = this.a;
        int i3 = 0;
        Object obj2 = this.R;
        switch (i2) {
            case 0:
                a0b a0bVar = (a0b) obj;
                mqw0 mqw0Var = (mqw0) ((zo31) obj2);
                mqw0Var.b.setImageDrawable(a0bVar.a);
                mqw0Var.c.setText(a0bVar.b);
                return;
            case 1:
                xfe xfeVar = (xfe) obj;
                mqw0 mqw0Var2 = (mqw0) ((zo31) obj2);
                mqw0Var2.b.setImageDrawable(xfeVar.a);
                mqw0Var2.c.setText(xfeVar.b);
                return;
            case 2:
                gap0 gap0Var = (gap0) obj;
                kap0 kap0Var = (kap0) ((zo31) obj2);
                kap0Var.c.setText(gap0Var.a);
                RobotoTextView robotoTextView = kap0Var.b;
                CharSequence charSequence = gap0Var.b;
                robotoTextView.setVisibility(charSequence.length() > 0 ? 0 : 8);
                robotoTextView.setText(charSequence);
                return;
            case 3:
                cr70 cr70Var = (cr70) obj;
                ky20 ky20Var = (ky20) ((zo31) obj2);
                UiStateDrawableWrapper uiStateDrawableWrapper = cr70Var.a;
                CharSequence charSequence2 = cr70Var.c;
                boolean z = cr70Var.d;
                boolean z2 = uiStateDrawableWrapper != null;
                if (z2 && z) {
                    AppCompatImageView appCompatImageView = ky20Var.c;
                    RoundedCornersImageView roundedCornersImageView = ky20Var.b;
                    appCompatImageView.setImageDrawable(null);
                    roundedCornersImageView.setVisibility(0);
                    roundedCornersImageView.setImageDrawable(uiStateDrawableWrapper);
                    i = 8;
                } else if (!z2 || z) {
                    i = 8;
                    RoundedCornersImageView roundedCornersImageView2 = ky20Var.b;
                    roundedCornersImageView2.setImageDrawable(null);
                    roundedCornersImageView2.setVisibility(8);
                    ky20Var.c.setImageDrawable(null);
                } else {
                    ky20Var.b.setImageDrawable(null);
                    i = 8;
                    ky20Var.b.setVisibility(8);
                    ky20Var.c.setImageDrawable(uiStateDrawableWrapper);
                }
                ky20Var.e.setText(cr70Var.b);
                RobotoTextView robotoTextView2 = ky20Var.d;
                robotoTextView2.setText(charSequence2);
                if (charSequence2.length() > 0) {
                    i = 0;
                }
                robotoTextView2.setVisibility(i);
                ky20Var.f.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
                return;
            case 4:
                ((kyu) ((zo31) obj2)).a.setText(((uzu) obj).a);
                return;
            case 5:
                yxu yxuVar = (yxu) obj;
                ayu ayuVar = (ayu) ((zo31) obj2);
                GoLinearLayout goLinearLayout = ayuVar.a;
                goLinearLayout.setBackgroundColor(s8o.m(yxuVar.f, goLinearLayout.getContext()));
                RobotoTextView robotoTextView3 = ayuVar.c;
                robotoTextView3.setText(yxuVar.b);
                robotoTextView3.setTextColor(yxuVar.c);
                Drawable drawable = yxuVar.d;
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                kdc kdcVar = yxuVar.e;
                if (kdcVar != null && mutate != null) {
                    mutate.setTint(s8o.m(kdcVar, ayuVar.a.getContext()));
                }
                ayuVar.b.setImageDrawable(mutate);
                return;
            case 6:
                q5a q5aVar = (q5a) obj;
                e4a e4aVar = (e4a) ((zo31) obj2);
                e4aVar.b.setText(q5aVar.b);
                e4aVar.c.setVisibility(q5aVar.c ? 0 : 8);
                return;
            case 7:
                return;
            case 8:
                zzu zzuVar = (zzu) obj;
                xt60 xt60Var = (xt60) ((zo31) obj2);
                xt60Var.c.render(zzuVar.a);
                xt60Var.d.setText(zzuVar.b);
                gf91.c(xt60Var.b, zzuVar.c);
                return;
            case 9:
                dr70 dr70Var = (dr70) obj;
                j9e0 j9e0Var = (j9e0) ((zo31) obj2);
                UiStateDrawableWrapper uiStateDrawableWrapper2 = dr70Var.a;
                CharSequence charSequence3 = dr70Var.c;
                if (uiStateDrawableWrapper2 != null) {
                    j9e0Var.c.setImageDrawable(uiStateDrawableWrapper2);
                    j9e0Var.c.setVisibility(0);
                } else {
                    j9e0Var.c.setImageDrawable(null);
                    j9e0Var.c.setVisibility(8);
                }
                j9e0Var.e.setText(dr70Var.b);
                RobotoTextView robotoTextView4 = j9e0Var.d;
                robotoTextView4.setText(charSequence3);
                robotoTextView4.setVisibility(charSequence3.length() > 0 ? 0 : 8);
                j9e0Var.b.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
                return;
            case 10:
                ((i1x) ((zo31) obj2)).a.setText(((n36) obj).a);
                return;
            case 11:
                c1j c1jVar = (c1j) obj;
                h1x h1xVar = (h1x) ((zo31) obj2);
                h1xVar.b.setText(c1jVar.a);
                h1xVar.c.setText(c1jVar.b);
                return;
            case 12:
                j1x j1xVar = (j1x) ((zo31) obj2);
                View view2 = j1xVar.b;
                PlaceholderType placeholderType = ((q3c0) obj).a;
                view2.setVisibility(placeholderType == PlaceholderType.BLOCK ? 0 : 8);
                j1xVar.f.setVisibility(placeholderType == PlaceholderType.TITLE ? 0 : 8);
                j1xVar.e.setVisibility(placeholderType == PlaceholderType.SUBTITLE ? 0 : 8);
                j1xVar.d.setVisibility(placeholderType == PlaceholderType.CONDITION ? 0 : 8);
                return;
            case 13:
                ((k1x) ((zo31) obj2)).a.setText(((qyu0) obj).a);
                return;
            case 14:
                ((l1x) ((zo31) obj2)).a.setText(((hiz0) obj).a);
                return;
            case 15:
                return;
            case 16:
                ((qqw0) ((zo31) obj2)).a.setTitle(((nrq0) obj).a);
                return;
            case 17:
                p57 p57Var = (p57) obj;
                z6r0 z6r0Var = (z6r0) ((zo31) obj2);
                z6r0Var.c.setText(p57Var.a.a);
                GoLinearLayout goLinearLayout2 = z6r0Var.b;
                goLinearLayout2.removeAllViews();
                a5r0 a5r0Var = p57Var.a;
                List list = a5r0Var.b;
                for (Object obj3 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    j5r0 j5r0Var = (j5r0) obj3;
                    boolean l = jl40.l(j5r0Var.b, a5r0Var.c);
                    int i5 = l ? xng0.controlMain : xng0.controlMinor;
                    int i6 = l ? xng0.textOnControl : xng0.textMain;
                    ButtonComponent buttonComponent = new ButtonComponent(z6r0Var.a.getContext(), null, 0, 6, null);
                    buttonComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    vh91.f(buttonComponent, j5r0Var.c, buttonComponent.getContext().getString(j5r0Var.a), true, null, false, 0, 32);
                    buttonComponent.setMaxLines(3);
                    buttonComponent.setTextTypeface(3);
                    buttonComponent.setButtonBackground(c.c(i5, view));
                    buttonComponent.setButtonTitleColor(qje.t(i6, view.getContext()));
                    buttonComponent.setTextSize(j5r0Var.c != null ? 13.0f : 16.0f);
                    goLinearLayout2.addView(buttonComponent);
                    if (i3 != scc.f(list)) {
                        xw31.F(buttonComponent, null, null, Integer.valueOf(tje.u(8, view.getContext())), null);
                    }
                    buttonComponent.setDebounceClickListener(new epo0(15, p57Var, j5r0Var));
                    ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        return;
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.weight = 1.0f;
                    buttonComponent.setLayoutParams(layoutParams2);
                    i3 = i4;
                }
                return;
            case 18:
                return;
            case 19:
                ((obu0) ((zo31) obj2)).b.setTitle(((rbu0) obj).a);
                return;
            case 20:
                nau0 nau0Var = (nau0) obj;
                wau0 wau0Var = (wau0) ((zo31) obj2);
                RobotoTextView robotoTextView5 = wau0Var.h;
                RoundedCornersImageView roundedCornersImageView3 = wau0Var.e;
                ShimmeringFrameLayout shimmeringFrameLayout = wau0Var.f;
                ShimmeringFrameLayout shimmeringFrameLayout2 = wau0Var.d;
                CharSequence charSequence4 = nau0Var.a;
                UiStateDrawableWrapper uiStateDrawableWrapper3 = nau0Var.d;
                robotoTextView5.setText(charSequence4);
                CharSequence charSequence5 = nau0Var.b;
                RobotoTextView robotoTextView6 = wau0Var.g;
                if (charSequence5 != null) {
                    robotoTextView6.setVisibility(0);
                    robotoTextView6.setText(charSequence5);
                } else {
                    robotoTextView6.setVisibility(8);
                }
                int i7 = pau0.a[nau0Var.e.ordinal()];
                if (i7 == 1) {
                    shimmeringFrameLayout.setShimmering(true);
                    shimmeringFrameLayout2.setShimmering(true);
                    shimmeringFrameLayout2.setBackground(c.k(y1h0.bg_step_icon, view));
                } else {
                    if (i7 != 2) {
                        w511.b();
                        return;
                    }
                    shimmeringFrameLayout.setShimmering(false);
                    shimmeringFrameLayout2.setShimmering(false);
                    shimmeringFrameLayout2.setBackground(null);
                    if (uiStateDrawableWrapper3 == null) {
                        roundedCornersImageView3.setForeground(c.k(y1h0.bg_step_placeholder_image, view));
                    } else {
                        roundedCornersImageView3.setForeground(null);
                        roundedCornersImageView3.setImageDrawable(uiStateDrawableWrapper3);
                    }
                    UiStateDrawableWrapper uiStateDrawableWrapper4 = nau0Var.c;
                    GoImageView goImageView = wau0Var.c;
                    if (uiStateDrawableWrapper4 == null) {
                        goImageView.setImageResource(y1h0.ic_step_circle);
                    } else {
                        goImageView.setImageDrawable(uiStateDrawableWrapper4);
                    }
                }
                boolean z3 = nau0Var.f;
                StepsDashedLine stepsDashedLine = wau0Var.b;
                if (z3) {
                    stepsDashedLine.setVisibility(4);
                    return;
                } else {
                    stepsDashedLine.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }
}

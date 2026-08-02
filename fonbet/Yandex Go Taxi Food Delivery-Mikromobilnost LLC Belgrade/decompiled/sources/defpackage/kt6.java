package defpackage;

import android.graphics.Outline;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class kt6 extends dy4 {
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int T;
    public final pav U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt6(zo31 zo31Var, pav pavVar, int i) {
        super(zo31Var, 1);
        this.T = i;
        this.U = pavVar;
    }

    public static /* synthetic */ void d0(kt6 kt6Var, ImageView imageView, kbv kbvVar, sls slsVar, int i) {
        if ((i & 4) != 0) {
            slsVar = new mvt(19);
        }
        kt6Var.c0(imageView, kbvVar, null, slsVar);
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.T) {
        }
        return false;
    }

    @Override // defpackage.dy4, defpackage.wys
    public final void c(Object obj) {
        int i = this.T;
        pav pavVar = this.U;
        Object obj2 = this.R;
        final int i2 = 0;
        switch (i) {
            case 0:
                t7e0 t7e0Var = (t7e0) obj;
                ListItemComponent listItemComponent = ((e9e0) ((zo31) obj2)).a;
                String str = t7e0Var.b;
                CharSequence charSequence = t7e0Var.d;
                if (str.length() > 0) {
                    a0(((nac) pavVar.a(listItemComponent.getLeadImageView())).c(t7e0Var.b));
                } else {
                    listItemComponent.getLeadImageView().setImageDrawable(null);
                }
                listItemComponent.setTitle(t7e0Var.c);
                listItemComponent.setSubtitle(charSequence);
                if (!t7e0Var.e) {
                    listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.bottomMargin = c.h(charSequence.length() == 0 ? 4 : 12, this.a);
                    listItemComponent.setLayoutParams(marginLayoutParams);
                    break;
                } else {
                    listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                    break;
                }
            case 1:
                a8e0 a8e0Var = (a8e0) obj;
                final g9e0 g9e0Var = (g9e0) ((zo31) obj2);
                z7e0 z7e0Var = a8e0Var.b;
                CharSequence charSequence2 = a8e0Var.d;
                final int i3 = 1;
                if (!(z7e0Var instanceof x7e0)) {
                    if (!(z7e0Var instanceof w7e0)) {
                        if (!(z7e0Var instanceof y7e0)) {
                            w511.b();
                            break;
                        } else {
                            g9e0Var.c.setVisibility(8);
                            g9e0Var.b.setVisibility(8);
                            g9e0Var.h.setVisibility(8);
                            g9e0Var.g.setVisibility(8);
                        }
                    } else {
                        w7e0 w7e0Var = (w7e0) z7e0Var;
                        kbv kbvVar = w7e0Var.a;
                        if (w7e0Var.b) {
                            d0(this, g9e0Var.b, kbvVar, new sls(g9e0Var, this, i2) { // from class: iau
                                public final /* synthetic */ int a;
                                public final /* synthetic */ g9e0 b;

                                {
                                    this.a = i2;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i4 = this.a;
                                    zy11 zy11Var = zy11.a;
                                    g9e0 g9e0Var2 = this.b;
                                    switch (i4) {
                                        case 0:
                                            g9e0Var2.c.setVisibility(8);
                                            g9e0Var2.h.setVisibility(8);
                                            g9e0Var2.g.setVisibility(8);
                                            break;
                                        default:
                                            g9e0Var2.b.setVisibility(8);
                                            g9e0Var2.h.setVisibility(8);
                                            g9e0Var2.g.setVisibility(8);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, 2);
                        } else {
                            d0(this, g9e0Var.c, kbvVar, new sls(g9e0Var, this, i3) { // from class: iau
                                public final /* synthetic */ int a;
                                public final /* synthetic */ g9e0 b;

                                {
                                    this.a = i3;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i4 = this.a;
                                    zy11 zy11Var = zy11.a;
                                    g9e0 g9e0Var2 = this.b;
                                    switch (i4) {
                                        case 0:
                                            g9e0Var2.c.setVisibility(8);
                                            g9e0Var2.h.setVisibility(8);
                                            g9e0Var2.g.setVisibility(8);
                                            break;
                                        default:
                                            g9e0Var2.b.setVisibility(8);
                                            g9e0Var2.h.setVisibility(8);
                                            g9e0Var2.g.setVisibility(8);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, 2);
                        }
                    }
                } else {
                    x7e0 x7e0Var = (x7e0) z7e0Var;
                    AppCompatImageView appCompatImageView = g9e0Var.i;
                    appCompatImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.modal.popup.adapter.HeaderItemVH$applyCircleClip$1
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            int min = Math.min(view.getWidth(), view.getHeight());
                            outline.setOval(0, 0, min, min);
                        }
                    });
                    appCompatImageView.setClipToOutline(true);
                    c0(g9e0Var.i, x7e0Var.a, g9e0Var.h, new t7j(18, this, g9e0Var, x7e0Var));
                }
                RobotoTextView robotoTextView = g9e0Var.e;
                robotoTextView.setText(a8e0Var.c);
                Typeface typeface = a8e0Var.e;
                if (typeface != null) {
                    robotoTextView.setTypeface(typeface);
                }
                RobotoTextView robotoTextView2 = g9e0Var.d;
                robotoTextView2.setText(charSequence2);
                robotoTextView2.setVisibility(charSequence2.length() > 0 ? 0 : 8);
                g9e0Var.f.setDividers(DividerPosition.NONE, DividerType.NONE);
                break;
            default:
                b8e0 b8e0Var = (b8e0) obj;
                j9e0 j9e0Var = (j9e0) ((zo31) obj2);
                b8e0Var.getClass();
                CharSequence charSequence3 = b8e0Var.d;
                tbv tbvVar = b8e0Var.b;
                if (jl40.l(tbvVar, tbv.a)) {
                    j9e0Var.c.setImageDrawable(null);
                    j9e0Var.c.setVisibility(8);
                } else {
                    a0(((nac) pavVar.a(j9e0Var.c)).b(tbvVar));
                    j9e0Var.c.setVisibility(0);
                }
                j9e0Var.e.setText(b8e0Var.c);
                RobotoTextView robotoTextView3 = j9e0Var.d;
                robotoTextView3.setText(charSequence3);
                robotoTextView3.setVisibility(charSequence3.length() > 0 ? 0 : 8);
                j9e0Var.b.setDividers(DividerPosition.NONE, DividerType.NONE);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c0(ImageView imageView, kbv kbvVar, FrameLayout frameLayout, sls slsVar) {
        ImageView imageView2 = frameLayout;
        if (frameLayout == 0) {
            imageView2 = imageView;
        }
        nac nacVar = (nac) this.U.a(imageView);
        nacVar.h = new sxo(28, imageView2, slsVar);
        nacVar.i = new bdp(25, imageView2, slsVar);
        a0(nacVar.b(kbvVar));
    }
}

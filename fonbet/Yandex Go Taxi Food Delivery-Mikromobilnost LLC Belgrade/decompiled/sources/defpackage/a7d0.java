package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.PlusPanelFamilyView;
import defpackage.a7d0;
import defpackage.acp;
import defpackage.af0;
import defpackage.aob1;
import defpackage.ej40;
import defpackage.h2d0;
import defpackage.kgx;
import defpackage.mm91;
import defpackage.rng0;
import defpackage.s2d0;
import defpackage.vng;
import defpackage.wv5;
import java.util.ArrayList;
import kotlin.collections.a;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class a7d0 {
    public static final /* synthetic */ kgx[] r = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", a7d0.class), b64.x(qoi0.a, a7d0.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("arrowIconImageView", 0, "getArrowIconImageView()Landroid/widget/ImageView;", a7d0.class), new PropertyReference1Impl("addInFamilyView", 0, "getAddInFamilyView()Landroid/view/View;", a7d0.class), new PropertyReference1Impl("membersAvatarsLayout", 0, "getMembersAvatarsLayout()Landroid/view/ViewGroup;", a7d0.class)};
    public final PlusPanelFamilyView a;
    public final sls b;
    public final d06 c;
    public f2v0 d;
    public af0 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final ArrayList k = new ArrayList();
    public final float l;
    public final float m;
    public final int n;
    public String o;
    public String p;
    public String q;

    public a7d0(PlusPanelFamilyView plusPanelFamilyView, sls slsVar, d06 d06Var, acp acpVar) {
        this.a = plusPanelFamilyView;
        this.b = slsVar;
        this.c = d06Var;
        this.d = new f2v0(acpVar.b, acpVar.d, acpVar.i);
        this.e = acpVar.h;
        this.f = new wv5(new z6d0(plusPanelFamilyView, u9h0.plus_panel_family_title_text_view, 0));
        this.g = new wv5(new z6d0(plusPanelFamilyView, u9h0.plus_panel_family_subtitle_text_view, 1));
        this.h = new wv5(new z6d0(plusPanelFamilyView, u9h0.plus_panel_family_arrow_forward_image_view, 2));
        this.i = new wv5(new z6d0(plusPanelFamilyView, u9h0.plus_panel_family_add_view, 3));
        this.j = new wv5(new z6d0(plusPanelFamilyView, u9h0.plus_panel_family_members_avatars_layout, 4));
        this.l = plusPanelFamilyView.getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius);
        this.m = plusPanelFamilyView.getResources().getDimension(nvg0.plus_sdk_panel_family_action_button_corner_radius);
        this.n = plusPanelFamilyView.getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_family_avatar_margin);
        b.p(plusPanelFamilyView, new y6d0());
        c(acpVar);
    }

    public static final void a(a7d0 a7d0Var, PlusColor plusColor) {
        ((ImageView) a7d0Var.h.a(r[2])).setImageDrawable(plusColor != null ? s2d0.e(plusColor, a7d0Var.a.getContext(), jxg0.plus_sdk_panel_ic_arrow_forward) : null);
    }

    public final View b() {
        return (View) this.i.a(r[3]);
    }

    public final void c(final acp acpVar) {
        PlusPanelFamilyView plusPanelFamilyView = this.a;
        if (!plusPanelFamilyView.isLaidOut() || plusPanelFamilyView.isLayoutRequested()) {
            plusPanelFamilyView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.PlusPanelFamilyViewController$setupViewOnLayout$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    a7d0 a7d0Var = a7d0.this;
                    acp acpVar2 = acpVar;
                    String str = acpVar2.a;
                    h2d0 h2d0Var = acpVar2.c;
                    wv5 wv5Var = a7d0Var.f;
                    kgx[] kgxVarArr = a7d0.r;
                    ((TextView) wv5Var.a(kgxVarArr[0])).setText(str);
                    aob1.c((TextView) a7d0Var.f.a(kgxVarArr[0]), h2d0Var, new ej40(8));
                    a7d0.a(a7d0.this, acpVar.e);
                    a7d0 a7d0Var2 = a7d0.this;
                    acp acpVar3 = acpVar;
                    PlusColor plusColor = acpVar3.f;
                    int i = acpVar3.g;
                    float f = a7d0Var2.l;
                    Drawable b = s2d0.b(plusColor, i, f, f, f, f);
                    PlusPanelFamilyView plusPanelFamilyView2 = a7d0Var2.a;
                    int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, plusPanelFamilyView2.getThemedContext());
                    float f2 = a7d0Var2.l;
                    plusPanelFamilyView2.setBackground(mm91.a(b, p, f2, f2, f2, f2));
                    a7d0.this.getClass();
                    a7d0 a7d0Var3 = a7d0.this;
                    acp acpVar4 = acpVar;
                    a7d0Var3.o = acpVar4.a;
                    af0 af0Var = acpVar4.h;
                    a7d0Var3.q = af0Var != null ? af0Var.a : null;
                    a7d0Var3.d();
                }
            });
            return;
        }
        String str = acpVar.a;
        h2d0 h2d0Var = acpVar.c;
        kgx[] kgxVarArr = r;
        kgx kgxVar = kgxVarArr[0];
        wv5 wv5Var = this.f;
        ((TextView) wv5Var.a(kgxVar)).setText(str);
        aob1.c((TextView) wv5Var.a(kgxVarArr[0]), h2d0Var, new ej40(8));
        a(this, acpVar.e);
        PlusColor plusColor = acpVar.f;
        int i = acpVar.g;
        float f = this.l;
        Drawable b = s2d0.b(plusColor, i, f, f, f, f);
        int p = vng.p(rng0.plus_sdk_panelDefaultRippleColor, plusPanelFamilyView.getThemedContext());
        float f2 = this.l;
        plusPanelFamilyView.setBackground(mm91.a(b, p, f2, f2, f2, f2));
        this.o = acpVar.a;
        af0 af0Var = acpVar.h;
        this.q = af0Var != null ? af0Var.a : null;
        d();
    }

    public final void d() {
        this.a.setContentDescription(a.X(j73.A(new String[]{this.o, this.p, this.q}), null, null, null, null, 63));
    }
}

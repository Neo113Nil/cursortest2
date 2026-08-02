package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.text.BidiFormatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.li91;
import defpackage.ph;
import defpackage.rs11;
import defpackage.uc20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u extends com.lightside.slab.a {
    public final com.yandex.passport.internal.ui.bouncer.t E;
    public final com.yandex.passport.internal.ui.bouncer.roundabout.a F;
    public final v G;

    public u(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar, com.yandex.passport.internal.ui.bouncer.roundabout.a aVar) {
        this.E = tVar;
        this.F = aVar;
        this.G = new v(activity);
    }

    @Override // defpackage.ins0
    public final ViewGroup.LayoutParams j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) view).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics = uc20.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics.density * 24.0f));
            marginLayoutParams.setMarginEnd((int) (24.0f * displayMetrics.density));
            f = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            DisplayMetrics displayMetrics2 = uc20.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics2.density * 24.0f));
            marginLayoutParams.setMarginEnd((int) (24.0f * displayMetrics2.density));
            f = displayMetrics2.density;
        }
        marginLayoutParams.topMargin = (int) (6.0f * f);
        return marginLayoutParams;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.G;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        b0 b0Var = (b0) obj;
        v vVar = this.G;
        LinearLayout linearLayout = (LinearLayout) vVar.getRoot();
        li91.e(new PhonishSlab$performBind$2$1$1(this, b0Var, null), linearLayout);
        linearLayout.setOnLongClickListener(new com.lightside.visum.b(linearLayout, new PhonishSlab$performBind$2$1$2(this, b0Var, null)));
        View root = vVar.getRoot();
        ph phVar = ph.h;
        Context context = vVar.a;
        androidx.core.view.b.o(root, phVar, context.getText(R.string.passport_recyclerview_item_description_long_press), null);
        String unicodeWrap = BidiFormatter.getInstance().unicodeWrap(b0Var.b);
        TextView textView = vVar.w;
        textView.setText(unicodeWrap);
        ((LinearLayout) vVar.getRoot()).setContentDescription(context.getString(R.string.passport_recyclerview_item_description_account, textView.getText(), "", ""));
        return zy11.a;
    }
}

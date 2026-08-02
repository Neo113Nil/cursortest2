package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.text.BidiFormatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import defpackage.g2i0;
import defpackage.li91;
import defpackage.rs11;
import defpackage.uc20;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class t extends com.lightside.slab.a {
    public final Activity E;
    public final com.yandex.passport.internal.ui.bouncer.t F;
    public final f G;

    public t(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar) {
        this.E = activity;
        this.F = tVar;
        this.G = new f(new ContextThemeWrapper(activity, g2i0.ThemeOverlay_MaterialComponents_Light));
    }

    @Override // defpackage.ins0
    public final ViewGroup.LayoutParams j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) view).getLayoutParams();
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
        String str;
        a0 a0Var = (a0) obj;
        f fVar = this.G;
        li91.e(new MemberAccountSlab$performBind$2$1$1(this, a0Var, null), fVar.getRoot());
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = fVar.y;
        textView.setText(bidiFormatter.unicodeWrap(a0Var.d));
        r.d(fVar, a0Var);
        r.c(fVar, a0Var);
        List list = a0Var.g;
        List list2 = list.isEmpty() ? null : list;
        Activity activity = this.E;
        if (list2 == null || (str = activity.getString(R.string.passport_recyclerview_item_description_badges, kotlin.collections.a.X(list2, Extension.FIX_SPACE, null, null, new com.yandex.passport.internal.core.announcing.f(16), 30))) == null) {
            str = "";
        }
        fVar.getRoot().setContentDescription(activity.getString(R.string.passport_recyclerview_item_description_account, textView.getText(), fVar.z.getText(), str));
        r.b(fVar, a0Var);
        r.e(fVar, a0Var);
        r.a(fVar, a0Var);
        return zy11.a;
    }
}

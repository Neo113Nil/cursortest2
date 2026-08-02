package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.li91;
import defpackage.ny61;
import defpackage.rs11;
import defpackage.uc20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p extends com.lightside.slab.a {
    public final com.yandex.passport.internal.ui.bouncer.t E;
    public final b F;

    public p(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar) {
        this.E = tVar;
        this.F = new b(activity);
    }

    @Override // defpackage.ins0
    public final ViewGroup.LayoutParams j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) view).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics = uc20.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics.density * 24.0f));
            marginLayoutParams.setMarginEnd((int) (displayMetrics.density * 24.0f));
            f = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            DisplayMetrics displayMetrics2 = uc20.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics2.density * 24.0f));
            marginLayoutParams.setMarginEnd((int) (displayMetrics2.density * 24.0f));
            f = displayMetrics2.density;
        }
        marginLayoutParams.topMargin = (int) (24.0f * f);
        return marginLayoutParams;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.F;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        float f;
        float f2;
        w wVar = (w) obj;
        b bVar = this.F;
        TextView textView = bVar.c;
        Context context = bVar.a;
        textView.setText(context.getResources().getString(wVar.a ? R.string.passport_acc_list_add_new_account_another : R.string.passport_acc_list_add_new_account));
        li91.e(new AddNewSlab$performBind$2$1(this, null), textView);
        textView.setContentDescription(((Object) textView.getText()) + ". " + context.getResources().getString(R.string.passport_recyclerview_item_description) + '.');
        View root = bVar.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (wVar.a) {
            f = uc20.a.density;
            f2 = 8.0f;
        } else {
            f = uc20.a.density;
            f2 = 24.0f;
        }
        marginLayoutParams.bottomMargin = (int) (f2 * f);
        root.setLayoutParams(marginLayoutParams);
        return zy11.a;
    }
}

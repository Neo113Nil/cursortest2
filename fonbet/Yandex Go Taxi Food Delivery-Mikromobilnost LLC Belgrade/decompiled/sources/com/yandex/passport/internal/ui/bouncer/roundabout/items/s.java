package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.report.p5;
import defpackage.li91;
import defpackage.rs11;
import defpackage.uc20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s extends com.lightside.slab.a {
    public final com.yandex.passport.internal.ui.bouncer.t E;
    public final com.yandex.passport.internal.report.reporters.s F;
    public final b G;

    public s(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar, com.yandex.passport.internal.report.reporters.s sVar) {
        this.E = tVar;
        this.F = sVar;
        this.G = new b(activity);
    }

    @Override // defpackage.ins0
    public final void f(Bundle bundle) {
        if (bundle == null) {
            com.yandex.passport.internal.report.reporters.s sVar = this.F;
            sVar.getClass();
            sVar.h(p5.w);
        }
    }

    @Override // defpackage.ins0
    public final ViewGroup.LayoutParams j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) view).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            DisplayMetrics displayMetrics = uc20.a;
            int i = (int) (displayMetrics.density * 24.0f);
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.setMarginStart(i);
            f = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            DisplayMetrics displayMetrics2 = uc20.a;
            int i2 = (int) (displayMetrics2.density * 24.0f);
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.setMarginStart(i2);
            f = displayMetrics2.density;
        }
        marginLayoutParams.setMarginEnd((int) (24.0f * f));
        return marginLayoutParams;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.G;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        b bVar = this.G;
        TextView textView = bVar.c;
        Context context = bVar.a;
        textView.setText(context.getResources().getString(R.string.passport_acc_list_create_new_profile));
        TextView textView2 = bVar.c;
        li91.e(new CreateProfileSlab$performBind$2$1(this, (y) obj, null), textView2);
        textView2.setContentDescription(((Object) textView2.getText()) + ". " + context.getResources().getString(R.string.passport_recyclerview_item_description) + '.');
        return zy11.a;
    }
}

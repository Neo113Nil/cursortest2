package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.view.HorizontalScrollViewBuilder;
import defpackage.b64;
import defpackage.bev;
import defpackage.h2b1;
import defpackage.li91;
import defpackage.lzx;
import defpackage.pw01;
import defpackage.rs11;
import defpackage.scc;
import defpackage.tcc;
import defpackage.uc20;
import defpackage.wj91;
import defpackage.y4h0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class f1 extends com.lightside.slab.a {
    public final q1 E;

    public f1(q1 q1Var) {
        this.E = q1Var;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q1, t2y] */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.coroutines.Continuation] */
    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        float f;
        float f2;
        Continuation continuation2;
        float f3;
        float f4;
        final n0 n0Var = (n0) obj;
        ?? r1 = this.E;
        final View root = r1.getRoot();
        if (root.isAttachedToWindow()) {
            n0Var.f.invoke();
        } else {
            root.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutNewBottomSheetSlab$performBind$lambda$7$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    root.removeOnAttachStateChangeListener(this);
                    n0Var.f.invoke();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        TextView textView = r1.w;
        HorizontalScrollViewBuilder horizontalScrollViewBuilder = r1.B;
        LinearLayoutBuilder linearLayoutBuilder = r1.z;
        View view = r1.x;
        List list = n0Var.b;
        boolean z = n0Var.e;
        textView.setText(list.size() < 2 ? R.string.passport_logout_sheet_title : R.string.passport_logout_sheet_title_profiles);
        Throwable th = null;
        int i = 0;
        if (n0Var.d) {
            r1.y.setText(R.string.passport_logout_delete_account);
            li91.e(new LogoutNewBottomSheetSlab$performBind$2$2$1(n0Var, null), linearLayoutBuilder);
            linearLayoutBuilder.setVisibility(0);
        } else {
            linearLayoutBuilder.setVisibility(8);
        }
        List list2 = n0Var.b;
        if (list2.size() < 2) {
            horizontalScrollViewBuilder.setVisibility(8);
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            }
            if (layoutParams != null) {
                if (z) {
                    f3 = uc20.a.density;
                    f4 = 32.0f;
                } else {
                    f3 = uc20.a.density;
                    f4 = 44.0f;
                }
                layoutParams.height = (int) (f4 * f3);
                view.setLayoutParams(layoutParams);
            }
        } else {
            horizontalScrollViewBuilder.setVisibility(0);
            Context context = ((LinearLayout) r1.getRoot()).getContext();
            int i2 = R.string.passport_logout_profiles_item_description;
            List list3 = list2;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.yandex.passport.internal.entities.k) it.next()).e);
            }
            horizontalScrollViewBuilder.setContentDescription(context.getString(i2, kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62)));
            view.setVisibility(8);
            if (list2.size() > 2) {
                f = uc20.a.density;
                f2 = 72.0f;
            } else {
                f = uc20.a.density;
                f2 = 96.0f;
            }
            int i3 = (int) (f2 * f);
            int i4 = 0;
            for (Object obj2 : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    Throwable th2 = th;
                    scc.m();
                    throw th2;
                }
                com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) obj2;
                int i6 = i4 == scc.f(list2) ? i : (int) (uc20.a.density * 12.0f);
                Integer valueOf = Integer.valueOf(i);
                Throwable th3 = th;
                LinearLayoutBuilder linearLayoutBuilder2 = new LinearLayoutBuilder(wj91.e(i, r1.a), i, i);
                if (r1 instanceof lzx) {
                    ((lzx) r1).addToParent(linearLayoutBuilder2);
                }
                linearLayoutBuilder2.setOrientation(1);
                View view2 = (View) LogoutNewBottomSheetUi$avatarItem$lambda$51$$inlined$imageView$default$1.b.invoke(wj91.e(i, linearLayoutBuilder2.getCtx()), valueOf, valueOf);
                linearLayoutBuilder2.addToParent(view2);
                ImageView imageView = (ImageView) view2;
                ViewGroup.LayoutParams generateLayoutParams = linearLayoutBuilder2.generateLayoutParams(i3, i3);
                int i7 = i;
                ((LinearLayout.LayoutParams) generateLayoutParams).bottomMargin = (int) (uc20.a.density * 8.0f);
                imageView.setLayoutParams(generateLayoutParams);
                String str = kVar.g;
                if (str != null) {
                    coil.c f5 = h2b1.f(imageView.getContext());
                    bev bevVar = new bev(imageView.getContext());
                    bevVar.c = str;
                    bevVar.o(imageView);
                    String e = b64.e(com.yandex.passport.internal.properties.u.z(imageView.getContext()), str);
                    bevVar.g = e;
                    bevVar.i(e);
                    bevVar.e();
                    bevVar.j(R.drawable.passport_icon_user_unknown);
                    pw01[] pw01VarArr = new pw01[1];
                    pw01VarArr[i7] = new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c(kVar.h.contains("has_plus"), i3);
                    bevVar.p(pw01VarArr);
                    f5.b(bevVar.d());
                }
                View view3 = (View) LogoutNewBottomSheetUi$avatarItem$lambda$51$$inlined$textView$default$1.b.invoke(wj91.e(i7, linearLayoutBuilder2.getCtx()), valueOf, valueOf);
                linearLayoutBuilder2.addToParent(view3);
                TextView textView2 = (TextView) view3;
                textView2.setLayoutParams(linearLayoutBuilder2.generateLayoutParams(-1, -2));
                com.yandex.passport.internal.ui.bouncer.roundabout.c0.e.getClass();
                textView2.setTextSize(12.0f);
                li91.l(textView2, R.color.passport_roundabout_text_primary);
                li91.k(textView2, y4h0.ys_text_regular);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine(true);
                textView2.setFocusable(false);
                textView2.setFocusableInTouchMode(false);
                textView2.setGravity(1);
                textView2.setText(kVar.e);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginEnd(i6);
                linearLayoutBuilder2.setLayoutParams(layoutParams2);
                linearLayoutBuilder2.setImportantForAccessibility(2);
                r1.A.addView(linearLayoutBuilder2);
                i4 = i5;
                i = 0;
                th = th3;
            }
        }
        Throwable th4 = th;
        r1.C.setText(R.string.passport_logout_current_app_option);
        r1.D.setText(R.string.passport_logout_current_app_hint);
        r1.E.setText(R.string.passport_logout_all_apps_option);
        r1.F.setText(n0Var.c ? R.string.passport_logout_all_apps_hint : R.string.passport_logout_all_apps_hint_whitelabel);
        LinearLayoutBuilder linearLayoutBuilder3 = r1.G;
        if (z) {
            linearLayoutBuilder3.setVisibility(0);
        } else {
            linearLayoutBuilder3.setVisibility(8);
        }
        TextView textView3 = r1.H;
        textView3.setText(R.string.passport_logout_exit);
        if (z) {
            ?? r4 = th4;
            li91.e(new LogoutNewBottomSheetSlab$performBind$2$6$1(r1, n0Var, r4), textView3);
            continuation2 = r4;
        } else {
            ?? r42 = th4;
            li91.e(new LogoutNewBottomSheetSlab$performBind$2$6$2(n0Var, r42), textView3);
            continuation2 = r42;
        }
        TextView textView4 = r1.I;
        textView4.setText(R.string.passport_reg_cancel);
        li91.e(new LogoutNewBottomSheetSlab$performBind$2$7$1(n0Var, continuation2), textView4);
        return zy11.a;
    }
}

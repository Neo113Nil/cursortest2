package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.menu.a;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import xsna.ikv0;
import xsna.r7v;

/* compiled from: NewsfeedBottomNavigationHintDelegate.kt */
/* loaded from: classes.dex */
public final class fd60 implements r7v.a {
    public static final int a = an10.b(45.9f);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.r7v.a
    public final void a(NavigationDelegateActivity navigationDelegateActivity, FragmentImpl fragmentImpl, td5 td5Var) {
        View view;
        b68 b68Var = b68.b;
        a.C0910a c0910a = b68.e().a().c;
        final a.c a2 = c0910a != null ? c0910a.a() : null;
        if (a2 == null) {
            return;
        }
        TabMenuItemUiData.a aVar = TabMenuItemUiData.Companion;
        String c = a2.c();
        aVar.getClass();
        TabMenuItemUiData b = TabMenuItemUiData.a.b(c);
        if (b == null || (view = (View) td5Var.invoke(Integer.valueOf(b.h()))) == null || pla.e().b().n() || f4m.g(view)) {
            return;
        }
        Rect d = w11.d(view);
        if (d.isEmpty() || d.height() < view.getHeight()) {
            return;
        }
        RectF rectF = new RectF();
        u5k0 u5k0Var = new u5k0(view.getContext());
        u5k0Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        LinearLayout tabBarContainer = u5k0Var.getTabBarContainer();
        tabBarContainer.setBackgroundTintList(ColorStateList.valueOf(n8g.l(-1, a)));
        Iterator it = j5g.W0(b68Var.g()).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.hasNext()) {
                break;
            }
            xtw xtwVar = (xtw) ztwVar.next();
            int i = xtwVar.a;
            int intValue = ((Number) xtwVar.b).intValue();
            com.vk.menu.presentation.entity.a aVar2 = com.vk.menu.presentation.entity.a.a;
            int f = aVar2.f(intValue);
            int c2 = aVar2.c(intValue);
            TabMenuItemUiData.Companion.getClass();
            TabMenuItemUiData a3 = TabMenuItemUiData.a.a(intValue);
            s770 el60Var = epx.f(a3 != null ? a3.i() : null, a2.c()) ? new el60(view.getContext()) : new ml60(view.getContext());
            el60Var.g(i, f, c2);
            tabBarContainer.addView(el60Var.l());
        }
        final TextView switchButton = u5k0Var.getSwitchButton();
        xo9.A(switchButton, a2.d());
        TextView okButton = u5k0Var.getOkButton();
        xo9.A(okButton, a2.b());
        ed60 ed60Var = new ed60();
        hl60 hl60Var = hl60.a;
        final dcn h = hl60.h(view.getContext(), view, a2.a(), new eqq(u5k0Var, 24), new bv3(view, d, rectF, 3), ed60Var);
        if (h == null) {
            return;
        }
        okButton.setOnClickListener(new l44(h, this));
        switchButton.setOnClickListener(new View.OnClickListener(switchButton, a2, this) { // from class: xsna.cd60
            public final /* synthetic */ TextView c;
            public final /* synthetic */ a.c d;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dcn.this.dismiss();
                b68.l("hint_button", false);
                TextView textView = this.c;
                Activity h2 = e3m.h(textView.getContext());
                if (h2 != null) {
                    b68.k(h2, false);
                }
                a.f fVar = this.d.f;
                if (fVar == null) {
                    return;
                }
                Context context = textView.getContext();
                ikv0.a aVar3 = new ikv0.a(context);
                String str = fVar.b;
                if (str.length() > 0) {
                    aVar3.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
                }
                String str2 = fVar.c;
                if (str2.length() > 0) {
                    aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, str2, new dd60(context, 0));
                }
                aVar3.t = new ikv0.c.C3058c(R.drawable.ic_done_in_blue_circle, (Integer) null, (Size) null, 14);
                i0q0.f(new cf00(aVar3, 10));
                b68.e().d();
            }
        });
    }

    @Override // xsna.r7v.a
    public final boolean b(FragmentImpl fragmentImpl) {
        boolean z;
        if (!pla.e().b().n()) {
            b68 b68Var = b68.b;
            a.C0910a c0910a = b68.e().a().c;
            if ((c0910a != null ? c0910a.a() : null) != null) {
                z = true;
                return !z && (fragmentImpl == null && !(fragmentImpl instanceof ies));
            }
        }
        z = false;
        if (z) {
        }
    }
}

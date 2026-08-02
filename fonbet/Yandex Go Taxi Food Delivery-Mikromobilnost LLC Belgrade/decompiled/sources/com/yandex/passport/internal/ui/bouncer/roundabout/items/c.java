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
import defpackage.ph;
import defpackage.rs11;
import defpackage.uc20;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class c extends com.lightside.slab.a {
    public final Activity E;
    public final com.yandex.passport.internal.ui.bouncer.t F;
    public final com.yandex.passport.internal.ui.bouncer.roundabout.a G;
    public final f H;

    public c(Activity activity, com.yandex.passport.internal.ui.bouncer.t tVar, com.yandex.passport.internal.ui.bouncer.roundabout.a aVar) {
        this.E = activity;
        this.F = tVar;
        this.G = aVar;
        this.H = new f(new ContextThemeWrapper(activity, g2i0.ThemeOverlay_MaterialComponents_Light));
    }

    @Override // defpackage.ins0
    public final ViewGroup.LayoutParams j(View view) {
        ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) view).getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(-1, -2);
        DisplayMetrics displayMetrics = uc20.a;
        marginLayoutParams.setMarginStart((int) (displayMetrics.density * 24.0f));
        marginLayoutParams.setMarginEnd((int) (24.0f * displayMetrics.density));
        return marginLayoutParams;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.H;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        String str;
        z zVar = (z) obj;
        f fVar = this.H;
        ConstraintLayout root = fVar.getRoot();
        li91.e(new AccountSlab$performBind$2$1$1(this, zVar, null), root);
        root.setOnLongClickListener(new com.lightside.visum.b(root, new AccountSlab$performBind$2$1$2(this, zVar, null)));
        ConstraintLayout root2 = fVar.getRoot();
        ph phVar = ph.h;
        int i = R.string.passport_recyclerview_item_description_long_press;
        Activity activity = this.E;
        androidx.core.view.b.o(root2, phVar, activity.getText(i), null);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = fVar.y;
        textView.setText(bidiFormatter.unicodeWrap(zVar.b));
        r.d(fVar, zVar);
        r.c(fVar, zVar);
        List list = zVar.j;
        List list2 = list.isEmpty() ? null : list;
        if (list2 == null || (str = activity.getString(R.string.passport_recyclerview_item_description_badges, kotlin.collections.a.X(list2, Extension.FIX_SPACE, null, null, new com.yandex.passport.internal.core.announcing.f(14), 30))) == null) {
            str = "";
        }
        fVar.getRoot().setContentDescription(activity.getString(R.string.passport_recyclerview_item_description_account, textView.getText(), fVar.z.getText(), str));
        r.b(fVar, zVar);
        r.e(fVar, zVar);
        r.a(fVar, zVar);
        return zy11.a;
    }
}

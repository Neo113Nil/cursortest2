package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: VideoTabsBadgeRenderer.kt */
/* loaded from: classes16.dex */
public final class jjt0 {
    public ValueAnimator a;

    public final void a(UIBlockCatalog uIBlockCatalog, rou0 rou0Var) {
        TabLayout.i iVar;
        View findViewById;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        Iterator it = g5g.E(uIBlockCatalog.A, UIBlockList.class).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlockList uIBlockList = (UIBlockList) next;
            TabLayout.g b = rou0Var.b(i);
            if (b != null && (iVar = b.h) != null && (findViewById = iVar.findViewById(R.id.badge_indicator)) != null) {
                bwt0.p0(findViewById, uIBlockList.H != null);
            }
            i = i2;
        }
    }
}

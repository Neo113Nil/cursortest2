package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.UserProfileDialogs;
import xsna.tlo0;
import xsna.zp0;

/* compiled from: SecondaryHolder.kt */
/* loaded from: classes5.dex */
public final class v0i0 extends yp0<zp0.b.C4193b> {
    public static final int s = iah0.a(28);
    public final VkCell o;
    public final wzs<ProfileAction, UserProfileDialogs.ItemCallPlace, s3q0> p;
    public final VkImage q;
    public final t0i0 r;

    public v0i0(VkCell vkCell, xwl xwlVar) {
        super(vkCell);
        this.o = vkCell;
        this.p = xwlVar;
        VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
        int i = s;
        vkImage.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        this.q = vkImage;
        this.r = new t0i0(this);
    }

    public static void s6(VkCell vkCell, tlo0 tlo0Var) {
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tlo0Var, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        zp0.b.C4193b c4193b = (zp0.b.C4193b) obj;
        ProfileAction profileAction = c4193b.d;
        Integer num = c4193b.e;
        boolean z = num != null;
        VkCell vkCell = this.o;
        if (num != null) {
            int intValue = num.intValue();
            tlo0.Companion.getClass();
            s6(vkCell, new tlo0.f(intValue));
        }
        ztu a = profileAction.a();
        if (a != null) {
            if (!z) {
                tlo0.a aVar = tlo0.Companion;
                int i = a.a;
                aVar.getClass();
                s6(vkCell, new tlo0.f(i));
            }
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(a.b, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12)));
        } else {
            vv5 b = profileAction.b();
            if (b != null) {
                if (!z) {
                    tlo0.a aVar2 = tlo0.Companion;
                    String str = b.a;
                    aVar2.getClass();
                    s6(vkCell, new tlo0.h(str));
                }
                String str2 = b.b;
                vkCell.setLeftMainViewController(this.r);
                VkImage vkImage = this.q;
                vkImage.clear();
                vkImage.o0(str2, null);
                VkCell.Left.a aVar3 = VkCell.Left.Companion;
                u0i0 u0i0Var = new u0i0();
                int i2 = s;
                vkCell.setLeft(VkCell.Left.a.a(aVar3, new VkCell.Left.Main.e(u0i0Var, new Size(i2, i2))));
            }
        }
        bwt0.i0(this.itemView, new tn0(26, this, c4193b));
    }
}

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

/* compiled from: ThirdPartyHolder.kt */
/* loaded from: classes5.dex */
public final class iqo0 extends yp0<zp0.b.c> {
    public static final int s = iah0.a(28);
    public final VkCell o;
    public final wzs<ProfileAction, UserProfileDialogs.ItemCallPlace, s3q0> p;
    public final VkImage q;
    public final gqo0 r;

    public iqo0(VkCell vkCell, xwl xwlVar) {
        super(vkCell);
        this.o = vkCell;
        this.p = xwlVar;
        VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
        int i = s;
        vkImage.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        this.q = vkImage;
        this.r = new gqo0(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        VkCell.Middle.e eVar;
        zp0.b.c cVar = (zp0.b.c) obj;
        vv5 b = cVar.e.b();
        VkCell vkCell = this.o;
        if (b != null) {
            vkCell.setLeftMainViewController(this.r);
            VkImage vkImage = this.q;
            vkImage.clear();
            vkImage.o0(b.b, null);
        }
        VkCell.Left.a aVar = VkCell.Left.Companion;
        hqo0 hqo0Var = new hqo0();
        int i = s;
        vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(hqo0Var, new Size(i, i))));
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        VkCell.Middle.d dVar = new VkCell.Middle.d(oq.d(tlo0.Companion, cVar.d), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        if (b != null) {
            eVar = new VkCell.Middle.e(new tlo0.h(b.a), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        } else {
            eVar = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, dVar, null, 12));
        bwt0.i0(this.itemView, new wqb(25, this, cVar));
    }
}

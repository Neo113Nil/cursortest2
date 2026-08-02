package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.passport.VkPassportView;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.group.GroupLikeRecentBusinessesVh;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.popup.b;
import com.vkontakte.android.sdk.SDKInviteDialog;
import xsna.ptw0;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Group group;
        izs<? super brj0, s3q0> izsVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((w01) obj).b.a(zz0.b);
                break;
            case 1:
                pp2 pp2Var = (pp2) obj;
                x64 x64Var = pp2Var.Q;
                if (x64Var != null) {
                    x64Var.c(pp2Var.E);
                    break;
                }
                break;
            case 2:
                mh7 mh7Var = (mh7) obj;
                x64 x64Var2 = mh7Var.p;
                if (x64Var2 != null) {
                    x64Var2.c(mh7Var.d);
                    break;
                }
                break;
            case 3:
                ((q2e) obj).b();
                break;
            case 4:
                ((cai) obj).b.invoke();
                break;
            case 5:
                GroupLikeRecentBusinessesVh groupLikeRecentBusinessesVh = (GroupLikeRecentBusinessesVh) obj;
                UIBlockGroup uIBlockGroup = groupLikeRecentBusinessesVh.e;
                if (uIBlockGroup != null && (group = uIBlockGroup.y) != null) {
                    GroupLikes groupLikes = group.T;
                    boolean z = groupLikes != null ? groupLikes.c : false;
                    rl7 rl7Var = new rl7(group, z, groupLikeRecentBusinessesVh, 1);
                    sd4 sd4Var = new sd4(27);
                    cpu a = xg5.a();
                    Context context = view.getContext();
                    boolean z2 = !z;
                    UserId e = fkq0.e(group.c);
                    UIBlockGroup uIBlockGroup2 = groupLikeRecentBusinessesVh.e;
                    a.o(context, z2, e, uIBlockGroup2 != null ? uIBlockGroup2.r() : null, rl7Var, sd4Var);
                    break;
                }
                break;
            case 6:
                zn30.a aVar = ((us30) obj).k;
                if (aVar != null) {
                    aVar.c();
                    break;
                }
                break;
            case 7:
                b.c.a.C1131a c1131a = (b.c.a.C1131a) obj;
                brj0 brj0Var = c1131a.m;
                if (brj0Var != null && (izsVar = c1131a.n) != null) {
                    izsVar.invoke(brj0Var);
                    break;
                }
                break;
            case 8:
                ((cqc0) obj).X0(PostingVisibilityMode.ONLY_ME);
                break;
            case 9:
                SDKInviteDialog sDKInviteDialog = (SDKInviteDialog) obj;
                int i2 = SDKInviteDialog.X;
                sDKInviteDialog.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(String.valueOf(sDKInviteDialog.O))));
                break;
            case 10:
                bth0 bth0Var = (bth0) obj;
                if (!bth0Var.v.f) {
                    bth0Var.P4(bth0Var.B, bth0Var.u.b.a, new kb40(bth0Var, 22));
                    break;
                }
                break;
            case 11:
                h0r0 h0r0Var = (h0r0) obj;
                gei0 gei0Var = h0r0Var.l;
                ldi0 ldi0Var = h0r0Var.n;
                gei0Var.j(ldi0Var != null ? ldi0Var : null);
                break;
            case 12:
                int i3 = VkCheckboxItem.x;
                ((VkCheckboxItem) obj).toggle();
                break;
            case 13:
                int i4 = VkPassportView.A;
                ((q3s0) obj).invoke(view);
                break;
            case 14:
                ((cuw0) obj).c.invoke(ptw0.d.b);
                break;
            default:
                ((mxy0) obj).a();
                break;
        }
    }
}

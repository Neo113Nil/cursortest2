package xsna;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vkontakte.android.actionlinks.views.holders.user.ItemUser$OnlineStatus;
import xsna.kvx;
import xsna.tlo0;

/* compiled from: ItemUserPresenter.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class jvx implements hvx {
    public kvx b;
    public gzs<s3q0> c;
    public gzs<s3q0> d;
    public final pxo0 e = new pxo0(1000);

    @Override // xsna.bux
    public final gzs<s3q0> H1() {
        return this.c;
    }

    @Override // xsna.bux
    public final gzs<s3q0> J0() {
        return this.d;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.bux
    public final pxo0 q3() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hvx
    public final void t7(UserProfile userProfile, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        String str;
        ItemUser$OnlineStatus itemUser$OnlineStatus;
        kvx kvxVar = this.b;
        if (kvxVar == null) {
            kvxVar = null;
        }
        if (userProfile.B.Cb()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(userProfile.e);
            spannableStringBuilder.append((char) 160);
            spannableStringBuilder.append((char) 160);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfo verifyInfo = userProfile.B;
            kvx kvxVar2 = this.b;
            if (kvxVar2 == null) {
                kvxVar2 = null;
            }
            spannableStringBuilder.setSpan(new dqa(VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, kvxVar2.getContext(), null, 28)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            str = spannableStringBuilder;
        } else {
            str = userProfile.e;
        }
        String str2 = userProfile.r;
        if (str2 == null) {
            str2 = "";
        }
        VkCell vkCell = kvxVar.c;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.h f = u11.f(tlo0.Companion, str);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(str2), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        kvx kvxVar3 = this.b;
        if (kvxVar3 == null) {
            kvxVar3 = null;
        }
        String str3 = userProfile.h;
        OnlineInfo onlineInfo = userProfile.n;
        if (onlineInfo == null || onlineInfo.Ab()) {
            itemUser$OnlineStatus = ItemUser$OnlineStatus.OFFLINE;
        } else {
            VisibleStatus zb = onlineInfo.zb();
            itemUser$OnlineStatus = (zb != null ? zb.e : null) == Platform.WEB ? ItemUser$OnlineStatus.ONLINE_WEB : ItemUser$OnlineStatus.ONLINE_MOBILE;
        }
        kvxVar3.c.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new kvx.c(str3, itemUser$OnlineStatus), VkCell.Left.Main.Size.Medium)));
        this.c = gzsVar;
        this.d = gzsVar2;
    }
}

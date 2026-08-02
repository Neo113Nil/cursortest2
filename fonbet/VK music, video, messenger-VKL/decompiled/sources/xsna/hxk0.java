package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.item.common.ads.bottomsheet.AdsBottomSheetOption;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.wih0;

/* compiled from: StaticAdsMoreMenuBottomSheetDelegateImpl.kt */
/* loaded from: classes17.dex */
public final class hxk0 implements gxk0 {
    public final md8 a;
    public final evk0 b;

    public hxk0(md8 md8Var, b1r b1rVar, lkh0 lkh0Var, qw6 qw6Var, r8a0 r8a0Var) {
        this.a = md8Var;
        this.b = new evk0(b1rVar, lkh0Var, qw6Var, r8a0Var);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, xsna.f11] */
    @Override // xsna.gxk0
    public final void a(Context context, String str, wih0.d.a aVar, String str2) {
        char c;
        gfz gfzVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        hkh0 hkh0Var = (hkh0) this.a.invoke(context, new myd0(ref$ObjectRef, 11));
        evk0 evk0Var = this.b;
        emi emiVar = evk0Var.e;
        String str3 = aVar.g;
        String str4 = aVar.a;
        if (str4 == null) {
            str4 = context.getString(R.string.video_ad_title);
        }
        tvu tvuVar = new tvu(str4, 2);
        gfz gfzVar2 = new gfz(AdsBottomSheetOption.ADVERTISER_INFO.ordinal(), ModalActionSheetListItem.Appearance.Default, context.getString(R.string.video_advertiser_info), R.drawable.vk_icon_link_circle_outline_28, new xcg(evk0Var, str2, aVar, context, 1));
        int i = 0;
        if (str3 == null || str3.length() == 0) {
            c = 2;
            gfzVar = new gfz(AdsBottomSheetOption.COPY_LINK.ordinal(), context.getString(R.string.copy_link), R.drawable.vk_icon_copy_outline_28, new dvk0(i, context, aVar));
        } else {
            c = 2;
            gfzVar = new gfz(AdsBottomSheetOption.COPY_AD_MARKER.ordinal(), context.getString(R.string.ad_marker_template, str3), R.drawable.vk_icon_copy_outline_28, new nps(context, aVar, evk0Var, str2));
        }
        gfz gfzVar3 = gfzVar;
        gfz gfzVar4 = new gfz(AdsBottomSheetOption.NOT_INTERESTED.ordinal(), context.getString(R.string.clip_feed_not_interested), R.drawable.vk_icon_remove_circle_outline_28, new y37(evk0Var, str2, aVar, str, 1));
        gfz gfzVar5 = new gfz(AdsBottomSheetOption.REPORT.ordinal(), ModalActionSheetListItem.Appearance.Negative, context.getString(R.string.report_content), R.drawable.vk_icon_report_outline_28, new d5f(evk0Var, str2, context, 6));
        vu0[] vu0VarArr = new vu0[5];
        vu0VarArr[0] = tvuVar;
        vu0VarArr[1] = gfzVar2;
        vu0VarArr[c] = gfzVar3;
        vu0VarArr[3] = gfzVar4;
        vu0VarArr[4] = gfzVar5;
        ?? f11Var = new f11(context, hkh0Var, rl3.I(vu0VarArr));
        f11Var.a();
        ref$ObjectRef.element = f11Var;
    }
}

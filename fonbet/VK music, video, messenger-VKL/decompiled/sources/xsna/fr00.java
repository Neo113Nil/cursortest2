package xsna;

import android.content.Context;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.item.common.ads.bottomsheet.AdsBottomSheetOption;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.wih0;
import xsna.yt0;

/* compiled from: MarketAdsMoreMenuBottomSheetDelegateImpl.kt */
/* loaded from: classes17.dex */
public final class fr00 implements er00 {
    public final pv7 a;
    public final zo00 b;

    public fr00(pv7 pv7Var, b1r b1rVar, tp00 tp00Var, up00 up00Var, izs izsVar) {
        this.a = pv7Var;
        this.b = new zo00(b1rVar, tp00Var, up00Var, izsVar);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [T, xsna.f11] */
    @Override // xsna.er00
    public final void a(Context context, final String str, wih0.b.a aVar, final String str2) {
        Context context2;
        gfz gfzVar;
        List<SdkAdsChoicesOptions> list;
        Object obj;
        final wih0.b.a aVar2 = aVar;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        hkh0 hkh0Var = (hkh0) this.a.invoke(context, new tvj(ref$ObjectRef, 21));
        final zo00 zo00Var = this.b;
        emi emiVar = zo00Var.e;
        String str3 = aVar2.b;
        String str4 = null;
        if (!myc0.f(str3) || aVar2.c != null) {
            str3 = null;
        }
        if (str3 == null && (str3 = aVar2.a) == null) {
            str3 = context.getString(R.string.video_ad_title);
        }
        tvu tvuVar = new tvu(str3, Integer.MAX_VALUE);
        gfz gfzVar2 = new gfz(AdsBottomSheetOption.ADVERTISER_INFO.ordinal(), ModalActionSheetListItem.Appearance.Default, context.getString(R.string.video_advertiser_info), R.drawable.vk_icon_link_circle_outline_28, new xo00(zo00Var, str2, aVar2, context));
        String str5 = aVar2.h;
        if (str5 == null) {
            SdkAdsChoices sdkAdsChoices = aVar2.l;
            if (sdkAdsChoices != null && (list = sdkAdsChoices.f) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((SdkAdsChoicesOptions) obj).b, "ad_marker_template")) {
                            break;
                        }
                    }
                }
                SdkAdsChoicesOptions sdkAdsChoicesOptions = (SdkAdsChoicesOptions) obj;
                if (sdkAdsChoicesOptions != null) {
                    str4 = sdkAdsChoicesOptions.d;
                }
            }
        } else {
            str4 = str5;
        }
        if (str4 == null || str4.length() == 0) {
            context2 = context;
            gfzVar = new gfz(AdsBottomSheetOption.COPY_LINK.ordinal(), context2.getString(R.string.copy_link), R.drawable.vk_icon_copy_outline_28, new uk(13, context2, aVar2));
        } else {
            int ordinal = AdsBottomSheetOption.COPY_AD_MARKER.ordinal();
            String string = context.getString(R.string.ad_marker_template, str4);
            y1n y1nVar = new y1n(context, str4, zo00Var, str2, aVar2, 2);
            context2 = context;
            aVar2 = aVar2;
            gfzVar = new gfz(ordinal, string, R.drawable.vk_icon_copy_outline_28, y1nVar);
        }
        ?? f11Var = new f11(context2, hkh0Var, rl3.I(new vu0[]{tvuVar, gfzVar2, gfzVar, new gfz(AdsBottomSheetOption.NOT_INTERESTED.ordinal(), context2.getString(R.string.clip_feed_not_interested), R.drawable.vk_icon_remove_circle_outline_28, new h1z(1, str2, zo00Var, aVar2, str)), new gfz(AdsBottomSheetOption.REPORT.ordinal(), ModalActionSheetListItem.Appearance.Negative, context2.getString(R.string.report_content), R.drawable.vk_icon_report_outline_28, new gzs() { // from class: xsna.yo00
            @Override // xsna.gzs
            public final Object invoke() {
                zo00 zo00Var2 = zo00.this;
                zo00Var2.d.invoke(new yt0.h.b(new zt0(str2, null)));
                zo00Var2.c.invoke(str, aVar2.l);
                return s3q0.a;
            }
        })}));
        f11Var.a();
        ref$ObjectRef.element = f11Var;
    }
}

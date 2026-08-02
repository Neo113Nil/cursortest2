package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vkontakte.android.R;

/* compiled from: AdsHeader.kt */
/* loaded from: classes17.dex */
public final class zv0 extends ckd {
    public static final zv0 b = new zv0(ClipsBottomSheetOptions.COPY_DISCLAIMER_INFO.ordinal());

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        String string;
        Good good;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        String str = null;
        if (ikdVar.a()) {
            SdkVideoAdInfo X0 = sdkVideoFile.X0();
            String str2 = X0 != null ? X0.c : null;
            if (str2 != null && str2.length() != 0) {
                str = str2;
            }
            if (str == null) {
                str = activity.getString(R.string.video_ad_title);
            }
            return new xu20(null, str, 3, new com.vk.movika.sdk.base.observable.w(ikdVar, 1), 1);
        }
        SdkVideoFile sdkVideoFile2 = ikdVar.a;
        if (sdkVideoFile2 instanceof SdkClipVideoFile) {
            ClickableStickers clickableStickers = k15.z((SdkClipVideoFile) sdkVideoFile2).C1;
            ClickableMarketItem Bb = clickableStickers != null ? clickableStickers.Bb() : null;
            if (myc0.f(Bb != null ? Bb.l : null)) {
                if (((Bb == null || (good = Bb.j) == null) ? null : good.f) == MarketItemType.OZON) {
                    SdkOrdAdsInfo p1 = sdkVideoFile.p1();
                    return new xu20(null, p1 != null ? p1.b : activity.getString(R.string.video_ad_title), 0, null, 13);
                }
            }
        }
        VideoFile A = k15.A(sdkVideoFile);
        if (!g620.f().c(A) || (A.X0() == null && A.p1() == null)) {
            return null;
        }
        SdkVideoAdInfo X02 = sdkVideoFile.X0();
        if (X02 == null || (string = X02.b) == null) {
            string = activity.getString(R.string.video_ad_title);
        }
        return new xu20(null, string, 0, null, 13);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoAdInfo X0 = ikdVar.a.X0();
        String str = X0 != null ? X0.c : null;
        if (!ikdVar.a() || str == null || str.length() == 0) {
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        bpn0 bpn0Var = cqm0.a;
        clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
        cvk.u(R.string.copied_ad_choice_disclaimer, false);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zv0);
    }

    public final int hashCode() {
        return -612079728;
    }

    public final String toString() {
        return "AdsHeader";
    }
}

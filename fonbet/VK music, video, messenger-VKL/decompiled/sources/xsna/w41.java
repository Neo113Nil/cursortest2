package xsna;

import android.app.Activity;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.models.ads.SdkOrdAdvertiser;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.xp50;

/* compiled from: AdvertiserInfo.kt */
/* loaded from: classes17.dex */
public final class w41 extends ckd {
    public final ile b;
    public final zp50 c;

    public w41(sua suaVar, ile ileVar, zp50 zp50Var) {
        super(ClipsBottomSheetOptions.ADVERTISER_INFO.ordinal());
        this.b = ileVar;
        this.c = zp50Var;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkAdsChoices sdkAdsChoices;
        List<SdkAdsChoicesOptions> list;
        SdkOrdAdvertiser sdkOrdAdvertiser;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkOrdAdsInfo p1 = sdkVideoFile.p1();
        boolean f = myc0.f((p1 == null || (sdkOrdAdvertiser = (SdkOrdAdvertiser) j5g.a0(p1.c)) == null) ? null : sdkOrdAdvertiser.b);
        SdkVideoAdInfo X0 = sdkVideoFile.X0();
        boolean f2 = myc0.f(X0 != null ? X0.j : null);
        SdkVideoAdInfo X02 = sdkVideoFile.X0();
        boolean z = false;
        if (X02 != null && (sdkAdsChoices = X02.n) != null && (list = sdkAdsChoices.f) != null) {
            List<SdkAdsChoicesOptions> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (epx.f(((SdkAdsChoicesOptions) it.next()).b, "show_advertiser_info")) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (ci90.h(ikdVar) && (f2 || f || z)) {
            return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.video_advertiser_info), null, null, R.drawable.vk_icon_link_circle_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
        }
        return null;
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        String str;
        SdkOrdAdvertiser sdkOrdAdvertiser;
        SdkAdsChoices sdkAdsChoices;
        List<SdkAdsChoicesOptions> list;
        Object obj;
        String str2;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        zp50 zp50Var = this.c;
        if (zp50Var != null) {
            SdkVideoAdInfo X0 = sdkVideoFile.X0();
            if (X0 != null && (sdkAdsChoices = X0.n) != null && (list = sdkAdsChoices.f) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((SdkAdsChoicesOptions) obj).b, "show_advertiser_info")) {
                            break;
                        }
                    }
                }
                SdkAdsChoicesOptions sdkAdsChoicesOptions = (SdkAdsChoicesOptions) obj;
                if (sdkAdsChoicesOptions != null && (str2 = sdkAdsChoicesOptions.b) != null) {
                    zp50Var.f(new xp50.a(str2));
                }
            }
        } else {
            SdkVideoAdInfo X02 = sdkVideoFile.X0();
            if (X02 == null || (str = X02.j) == null) {
                SdkOrdAdsInfo p1 = sdkVideoFile.p1();
                str = (p1 == null || (sdkOrdAdvertiser = (SdkOrdAdvertiser) j5g.a0(p1.c)) == null) ? null : sdkOrdAdvertiser.b;
            }
            rk8 browser = xwk.d().getBrowser();
            if (str == null) {
                return;
            } else {
                browser.f(activity, null, LaunchContext.A, str);
            }
        }
        ile ileVar = this.b;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.SHOW_ADS_INFO, ileVar.a, null);
        }
    }
}

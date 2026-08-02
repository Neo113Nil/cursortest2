package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.models.ads.SdkOrdAdvertiser;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.xp50;

/* compiled from: CopyAdMarker.kt */
/* loaded from: classes17.dex */
public final class ctj extends ckd {
    public final ile b;
    public final zp50 c;
    public final zof d;

    public ctj(sua suaVar, ile ileVar, zp50 zp50Var, zof zofVar) {
        super(ClipsBottomSheetOptions.COPY_AD_MARKER.ordinal());
        this.b = ileVar;
        this.c = zp50Var;
        this.d = zofVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkAdsChoicesOptions sdkAdsChoicesOptions;
        SdkOrdAdvertiser sdkOrdAdvertiser;
        String string;
        SdkOrdAdvertiser sdkOrdAdvertiser2;
        SdkAdsChoices sdkAdsChoices;
        List<SdkAdsChoicesOptions> list;
        Object obj;
        String str;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkVideoAdInfo X0 = sdkVideoFile.X0();
        String str2 = null;
        String a = (X0 == null || (str = X0.k) == null) ? null : cqm0.a(str);
        SdkVideoAdInfo X02 = sdkVideoFile.X0();
        if (X02 == null || (sdkAdsChoices = X02.n) == null || (list = sdkAdsChoices.f) == null) {
            sdkAdsChoicesOptions = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((SdkAdsChoicesOptions) obj).b, "ad_marker_template")) {
                    break;
                }
            }
            sdkAdsChoicesOptions = (SdkAdsChoicesOptions) obj;
        }
        if (!ci90.h(ikdVar) || !myc0.f(a)) {
            SdkOrdAdsInfo p1 = sdkVideoFile.p1();
            if (!myc0.f((p1 == null || (sdkOrdAdvertiser = (SdkOrdAdvertiser) j5g.a0(p1.c)) == null) ? null : sdkOrdAdvertiser.c) && sdkAdsChoicesOptions == null) {
                return null;
            }
        }
        if (sdkAdsChoicesOptions != null) {
            string = sdkAdsChoicesOptions.d;
        } else {
            if (a == null) {
                SdkOrdAdsInfo p12 = sdkVideoFile.p1();
                if (p12 != null && (sdkOrdAdvertiser2 = (SdkOrdAdvertiser) j5g.a0(p12.c)) != null) {
                    str2 = sdkOrdAdvertiser2.c;
                }
            } else {
                str2 = a;
            }
            string = activity.getString(R.string.ad_marker_template, str2);
        }
        ModalActionSheetListItem.Appearance appearance = ModalActionSheetListItem.Appearance.Default;
        if (this.d.X() && this.c != null) {
            string = go9.b("(sdk) ", string);
        }
        return new ModalActionSheetListItem(this.a, appearance, string, null, null, R.drawable.vk_icon_copy_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        String str;
        SdkOrdAdvertiser sdkOrdAdvertiser;
        String str2;
        SdkAdsChoices sdkAdsChoices;
        List<SdkAdsChoicesOptions> list;
        Object obj;
        String str3;
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
                        if (epx.f(((SdkAdsChoicesOptions) obj).b, "ad_marker_template")) {
                            break;
                        }
                    }
                }
                SdkAdsChoicesOptions sdkAdsChoicesOptions = (SdkAdsChoicesOptions) obj;
                if (sdkAdsChoicesOptions != null && (str3 = sdkAdsChoicesOptions.b) != null) {
                    zp50Var.f(new xp50.a(str3));
                }
            }
        } else {
            SdkVideoAdInfo X02 = sdkVideoFile.X0();
            if (X02 == null || (str2 = X02.k) == null || (str = cqm0.a(str2)) == null) {
                SdkOrdAdsInfo p1 = sdkVideoFile.p1();
                str = (p1 == null || (sdkOrdAdvertiser = (SdkOrdAdvertiser) j5g.a0(p1.c)) == null) ? null : sdkOrdAdvertiser.c;
            }
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            bpn0 bpn0Var = cqm0.a;
            String str4 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str4, str));
        }
        cvk.u(R.string.ad_marker_copied, false);
        ile ileVar = this.b;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.COPY_ERID, ileVar.a, null);
        }
    }
}

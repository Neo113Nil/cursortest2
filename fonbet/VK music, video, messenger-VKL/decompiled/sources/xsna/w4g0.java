package xsna;

import android.app.Activity;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.MusicVideoFile;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Report.kt */
/* loaded from: classes17.dex */
public final class w4g0 extends ckd {
    public final pkd b;
    public final ile c;
    public final n11 d;
    public final xne e;
    public final zp50 f;

    public w4g0(sua suaVar, pkd pkdVar, ile ileVar, n11 n11Var, xne xneVar, zp50 zp50Var) {
        super(ClipsBottomSheetOptions.REPORT.ordinal());
        this.b = pkdVar;
        this.c = ileVar;
        this.d = n11Var;
        this.e = xneVar;
        this.f = zp50Var;
    }

    public static List c(SdkAdsChoices sdkAdsChoices, boolean z) {
        List<SdkAdsChoicesOptions> list;
        ArrayList arrayList = null;
        if (sdkAdsChoices != null && (list = sdkAdsChoices.f) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SdkAdsChoicesOptions sdkAdsChoicesOptions : list) {
                Integer num = z ? -1 : sdkAdsChoicesOptions.h;
                String str = sdkAdsChoicesOptions.d;
                String str2 = sdkAdsChoicesOptions.b;
                MyTargetAdsComplainOptions myTargetAdsComplainOptions = (!epx.f(sdkAdsChoicesOptions.c, "complain") || num == null || str == null || str2 == null) ? null : new MyTargetAdsComplainOptions(num.intValue(), str, str2);
                if (myTargetAdsComplainOptions != null) {
                    arrayList2.add(myTargetAdsComplainOptions);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r1 != null ? r1.h : null) == com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType.MY_TARGET_VIDEO) goto L22;
     */
    @Override // xsna.ckd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yu20 a(Activity activity, ikd ikdVar) {
        boolean j = ci90.j(ikdVar);
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!j && !ci90.g(ikdVar) && !(k15.A(sdkVideoFile) instanceof MusicVideoFile) && ci90.m(ikdVar) && sdkVideoFile.k1() == 0 && !sdkVideoFile.Q0()) {
            if (this.e.a(sdkVideoFile)) {
                SdkVideoAdInfo X0 = sdkVideoFile.X0();
            }
            return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Negative, activity.getString(R.string.report_content), null, null, R.drawable.vk_icon_report_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
        }
        return null;
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        zp50 zp50Var = this.f;
        n11 n11Var = this.d;
        if (zp50Var != null) {
            SdkVideoAdInfo X0 = sdkVideoFile.X0();
            List c = c(X0 != null ? X0.n : null, true);
            List list = c.isEmpty() ? null : c;
            if (list != null) {
                n11Var.g(activity, sdkVideoFile, (MyTargetAdsComplainOptions[]) list.toArray(new MyTargetAdsComplainOptions[0]));
                return;
            }
            return;
        }
        SdkVideoAdInfo X02 = sdkVideoFile.X0();
        SdkAdsChoices sdkAdsChoices = X02 != null ? X02.n : null;
        String str = sdkAdsChoices != null ? sdkAdsChoices.d : null;
        List c2 = c(sdkAdsChoices, false);
        if (str != null) {
            List list2 = c2;
            if (!list2.isEmpty()) {
                n11Var.f(activity, sdkVideoFile, str, (MyTargetAdsComplainOptions[]) list2.toArray(new MyTargetAdsComplainOptions[0]));
                return;
            }
        }
        this.b.y(activity, new fju(ikdVar, 29));
        ile ileVar = this.c;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.REPORT, ileVar.a, null);
        }
    }
}

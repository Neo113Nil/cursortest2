package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import xsna.wlc;

/* compiled from: ShowStatistic.kt */
/* loaded from: classes17.dex */
public final class ljj0 extends ckd {
    public final ile b;
    public final xne c;
    public final xlc d;

    public ljj0(sua suaVar, ile ileVar, xne xneVar, xlc xlcVar) {
        super(ClipsBottomSheetOptions.SHOW_STATISTIC.ordinal());
        this.b = ileVar;
        this.c = xneVar;
        this.d = xlcVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (this.c.a(sdkVideoFile)) {
            SdkVideoAdInfo X0 = sdkVideoFile.X0();
            if ((X0 != null ? X0.h : null) != SdkVideoAdsType.MY_TARGET_VIDEO && ci90.m(ikdVar) && ci90.h(ikdVar) && sdkVideoFile.k1() == 0 && !sdkVideoFile.Q0()) {
                return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_show_statistic), null, null, R.drawable.vk_icon_statistics_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
            }
        }
        return null;
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        this.d.b(activity, new wlc.e(k15.A(ikdVar.a)));
        ile ileVar = this.b;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.VIEW_ANALYTICS, ileVar.a, null);
        }
    }
}

package xsna;

import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClipsBottomSheetActionTracker.kt */
/* loaded from: classes17.dex */
public final class dkd implements sih0 {
    public final SearchStatsLoggingInfo a;

    /* compiled from: ClipsBottomSheetActionTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsBottomSheetOptions.values().length];
            try {
                iArr[ClipsBottomSheetOptions.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsBottomSheetOptions.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dkd(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    @Override // xsna.sih0
    public final void a(ClipsBottomSheetOptions clipsBottomSheetOptions) {
        int i = a.$EnumSwitchMapping$0[clipsBottomSheetOptions.ordinal()];
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = i != 1 ? i != 2 ? null : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
        if (action == null) {
            return;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(action, searchStatsLoggingInfo.f);
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, Ab, uzp0Var.a).q();
    }
}

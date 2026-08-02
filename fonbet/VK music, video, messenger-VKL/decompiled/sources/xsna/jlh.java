package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabItemView;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hzp0;
import xsna.klh;

/* compiled from: CommunityProfileContentUiViewTracker.kt */
/* loaded from: classes5.dex */
public final class jlh extends d680<klh.b> {
    public final /* synthetic */ UserId b;

    public jlh(klh.a aVar, UserId userId) {
        this.b = userId;
    }

    @Override // xsna.d680
    public final List j(klh.b bVar) {
        klh.b bVar2 = bVar;
        int i = bVar2.c;
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = bVar2.b;
        if (commonCommunitiesStat$TypeTabContentType == null) {
            return EmptyList.b;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP;
        hzp0.g gVar = new hzp0.g(schemeStat$EventItem, mobileOfficialAppsCoreNavStat$EventScreen, new CommonCommunitiesStat$TypeTabItemView(this.b.b, bVar2.a, commonCommunitiesStat$TypeTabContentType), i);
        String str = bVar2.d;
        return rl3.I(new hzp0[]{gVar, str == null ? null : new hzp0.o0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, str, null, 46, null), i, mobileOfficialAppsCoreNavStat$EventScreen, new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW))});
    }
}

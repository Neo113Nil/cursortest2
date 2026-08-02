package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fha;

/* compiled from: GroupCellVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class gju extends FunctionReferenceImpl implements izs<View, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        View view2 = view;
        GroupCellVh groupCellVh = (GroupCellVh) this.receiver;
        groupCellVh.getClass();
        groupCellVh.m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.ShowStory));
        m3a m3aVar = groupCellVh.h;
        if (m3aVar != null) {
            m3aVar.j(new fha.a(view2, new StoryOwner.Community(groupCellVh.p, null, 2, null), MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST, new z0h(groupCellVh, 19)));
        }
        return s3q0.a;
    }
}

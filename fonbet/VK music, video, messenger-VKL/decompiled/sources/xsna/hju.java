package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t8a;

/* compiled from: GroupCellVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class hju extends FunctionReferenceImpl implements izs<View, s3q0> {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        UserId userId;
        m3a m3aVar;
        View view2 = view;
        GroupCellVh groupCellVh = (GroupCellVh) this.receiver;
        if (((Boolean) groupCellVh.g.getValue()).booleanValue() && groupCellVh.g()) {
            Group group = groupCellVh.p;
            if (group != null && (userId = group.c) != null && (m3aVar = groupCellVh.h) != null) {
                Context context = view2.getContext();
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                m3aVar.j(new t8a.a(context, userId, uiTrackingScreen != null ? uiTrackingScreen.a : null, new fju(groupCellVh, 0)));
            }
        } else {
            groupCellVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
            groupCellVh.onClick(view2);
        }
        return s3q0.a;
    }
}

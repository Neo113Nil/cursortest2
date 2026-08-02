package xsna;

import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;
import xsna.ryv;

/* compiled from: ImChannelDonutActionAnalytics.kt */
/* loaded from: classes5.dex */
public final class qyv extends axv<ryv> implements lwv.b {
    public static final a b = new a();

    /* compiled from: ImChannelDonutActionAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof ryv;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof ryv)) {
            return false;
        }
        a((ryv) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(ryv ryvVar) {
        SchemeStat$TypeMessagingActionItem schemeStat$TypeMessagingActionItem;
        if (ryvVar instanceof ryv.b) {
            SchemeStat$TypeMessagingActionItem.ActionType actionType = SchemeStat$TypeMessagingActionItem.ActionType.IM_CHANNEL_ENTRY_DONUT_CLICK;
            long j = ((ryv.b) ryvVar).b;
            schemeStat$TypeMessagingActionItem = new SchemeStat$TypeMessagingActionItem(actionType, null, Integer.valueOf((int) j), null, null, Long.valueOf(j), null, null, null, null, null, null, 4058, null);
        } else if (ryvVar instanceof ryv.c) {
            SchemeStat$TypeMessagingActionItem.ActionType actionType2 = SchemeStat$TypeMessagingActionItem.ActionType.IM_PROFILE_CHANNEL_DONUT_CLICK;
            long j2 = ((ryv.c) ryvVar).b;
            schemeStat$TypeMessagingActionItem = new SchemeStat$TypeMessagingActionItem(actionType2, null, Integer.valueOf((int) j2), null, null, Long.valueOf(j2), null, null, null, null, null, null, 4058, null);
        } else if (ryvVar instanceof ryv.a) {
            SchemeStat$TypeMessagingActionItem.ActionType actionType3 = SchemeStat$TypeMessagingActionItem.ActionType.CHANGE_DONUT;
            ryv.a aVar = (ryv.a) ryvVar;
            long j3 = aVar.b;
            schemeStat$TypeMessagingActionItem = new SchemeStat$TypeMessagingActionItem(actionType3, null, Integer.valueOf((int) j3), null, null, Long.valueOf(j3), null, aVar.c ? "on" : "off", null, null, null, null, 3930, null);
        } else {
            if (!(ryvVar instanceof ryv.d)) {
                throw new NoWhenBranchMatchedException();
            }
            schemeStat$TypeMessagingActionItem = new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CHANNEL_POST_DONUT_SUB_CLICK, null, Integer.valueOf((int) ((ryv.d) ryvVar).a), null, null, null, Long.valueOf(r0.b), null, null, null, null, null, 4026, null);
        }
        axv.c(this, schemeStat$TypeMessagingActionItem);
    }
}

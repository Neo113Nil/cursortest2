package xsna;

import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.lwv;
import xsna.mwv;
import xsna.pyv;

/* compiled from: ImChannelChatActionAnalytics.kt */
/* loaded from: classes5.dex */
public final class oyv extends axv<pyv> implements lwv.b {
    public static final a b = new a();

    /* compiled from: ImChannelChatActionAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof pyv;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof pyv)) {
            return false;
        }
        a((pyv) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(pyv pyvVar) {
        if (!(pyvVar instanceof pyv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeMessagingActionItem.ActionType actionType = SchemeStat$TypeMessagingActionItem.ActionType.IM_CHANNEL_ENTRY_SHOW;
        long j = ((pyv.a) pyvVar).b;
        axv.c(this, new SchemeStat$TypeMessagingActionItem(actionType, null, Integer.valueOf((int) j), null, null, Long.valueOf(j), null, null, null, null, null, null, 4058, null));
    }
}

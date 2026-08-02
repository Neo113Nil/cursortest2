package xsna;

import android.database.Cursor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.internal.storage.delegates.messages.MsgDbType;
import com.vk.im.engine.models.SourceType;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChannelMessageReader.kt */
/* loaded from: classes2.dex */
public final class w1b {
    public final boolean a;
    public final String b;

    /* compiled from: ChannelMessageReader.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgDbType.values().length];
            try {
                iArr[MsgDbType.FROM_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w1b(boolean z) {
        this.a = z;
        List l = e43.l(ChannelMessageColumn.CHANNEL_ID, ChannelMessageColumn.LOCAL_ID, ChannelMessageColumn.CNV_MSG_ID, ChannelMessageColumn.HAS_SPACE_BEFORE, ChannelMessageColumn.HAS_SPACE_AFTER, ChannelMessageColumn.WEIGHT_BEFORE, ChannelMessageColumn.WEIGHT_AFTER, ChannelMessageColumn.WEIGHT, ChannelMessageColumn.PHASE_ID, ChannelMessageColumn.SYNC_STATE, ChannelMessageColumn.TIME);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChannelMessageColumn) it.next()).getKey());
        }
        this.b = p4g.k(arrayList, StringUtils.COMMA, null);
    }

    public static lj30 b(Cursor cursor) {
        long C = fl3.C(cursor, ChannelMessageColumn.WEIGHT.getKey());
        int A = fl3.A(cursor, ChannelMessageColumn.CNV_MSG_ID.getKey());
        long C2 = fl3.C(cursor, ChannelMessageColumn.CHANNEL_ID.getKey());
        int A2 = fl3.A(cursor, ChannelMessageColumn.LOCAL_ID.getKey());
        gkx0 gkx0Var = new gkx0(C);
        boolean x = fl3.x(cursor, ChannelMessageColumn.HAS_SPACE_BEFORE.getKey());
        boolean x2 = fl3.x(cursor, ChannelMessageColumn.HAS_SPACE_AFTER.getKey());
        gkx0 gkx0Var2 = new gkx0(fl3.C(cursor, ChannelMessageColumn.WEIGHT_BEFORE.getKey()));
        gkx0 gkx0Var3 = new gkx0(fl3.C(cursor, ChannelMessageColumn.WEIGHT_AFTER.getKey()));
        int A3 = fl3.A(cursor, ChannelMessageColumn.PHASE_ID.getKey());
        int A4 = fl3.A(cursor, ChannelMessageColumn.SYNC_STATE.getKey());
        MsgSyncState.Companion.getClass();
        return new lj30(C2, A2, A, false, gkx0Var2, gkx0Var3, gkx0Var, x, x2, MsgSyncState.a.a(A4), A3, A == 0, fl3.C(cursor, ChannelMessageColumn.TIME.getKey()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x02d2, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0369, code lost:
    
        if (r0 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MsgFromChannel a(Cursor cursor) {
        PostDonut postDonut;
        UserId userId;
        AuthorAd authorAd;
        AttachComments attachComments;
        ItemReactions itemReactions;
        PaidReaction paidReaction;
        ArrayList arrayList;
        MsgFromChannel.ExternalViewTracking externalViewTracking;
        MsgDbType.a aVar = MsgDbType.Companion;
        int A = fl3.A(cursor, "type");
        aVar.getClass();
        MsgDbType a2 = MsgDbType.a.a(A);
        if (a.$EnumSwitchMapping$0[a2.ordinal()] != 1) {
            throw new IllegalArgumentException("message type = " + a2 + " not supported in channels");
        }
        Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
        int A2 = fl3.A(cursor, ChannelMessageColumn.LOCAL_ID.getKey());
        long C = fl3.C(cursor, ChannelMessageColumn.CHANNEL_ID.getKey());
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        Peer b = Peer.a.b(fl3.C(cursor, ChannelMessageColumn.PARENT_ID.getKey()));
        int A3 = fl3.A(cursor, ChannelMessageColumn.CNV_MSG_ID.getKey());
        long C2 = fl3.C(cursor, ChannelMessageColumn.TIME.getKey());
        Peer.Type.a aVar2 = Peer.Type.Companion;
        int A4 = fl3.A(cursor, ChannelMessageColumn.FROM_MEMBER_TYPE.getKey());
        aVar2.getClass();
        Peer a3 = Peer.a.a(fl3.C(cursor, ChannelMessageColumn.FROM_MEMBER_ID.getKey()), Peer.Type.a.a(A4));
        gkx0 gkx0Var = new gkx0(fl3.C(cursor, ChannelMessageColumn.WEIGHT.getKey()));
        boolean x = fl3.x(cursor, ChannelMessageColumn.HAS_SPACE_BEFORE.getKey());
        boolean x2 = fl3.x(cursor, ChannelMessageColumn.HAS_SPACE_AFTER.getKey());
        gkx0 gkx0Var2 = new gkx0(fl3.C(cursor, ChannelMessageColumn.WEIGHT_BEFORE.getKey()));
        gkx0 gkx0Var3 = new gkx0(fl3.C(cursor, ChannelMessageColumn.WEIGHT_AFTER.getKey()));
        String E = fl3.E(cursor, ChannelMessageColumn.POST_TEXT.getKey());
        String E2 = fl3.E(cursor, ChannelMessageColumn.ACCESS_KEY.getKey());
        long C3 = fl3.C(cursor, ChannelMessageColumn.OWNER_ID.getKey());
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId2 = new UserId(C3);
        int A5 = fl3.A(cursor, ChannelMessageColumn.POST_ID.getKey());
        UserId userId3 = new UserId(fl3.C(cursor, ChannelMessageColumn.FROM_ID.getKey()));
        String E3 = fl3.E(cursor, ChannelMessageColumn.POST_TYPE.getKey());
        byte[] v = fl3.v(cursor, ChannelMessageColumn.DONUT.getKey());
        if (v != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            postDonut = (PostDonut) Serializer.b.a(v, PostDonut.class.getClassLoader());
        } else {
            postDonut = null;
        }
        String F = fl3.F(cursor, ChannelMessageColumn.AUTHOR_AD_INFO_URL.getKey());
        String F2 = fl3.F(cursor, ChannelMessageColumn.AUTHOR_AD_MARKER.getKey());
        if (F == null || F2 == null) {
            userId = userId2;
            authorAd = null;
        } else {
            userId = userId2;
            authorAd = new AuthorAd(F, F2);
        }
        String E4 = fl3.E(cursor, ChannelMessageColumn.TRACK_CODE.getKey());
        String E5 = fl3.E(cursor, ChannelMessageColumn.DELETED_REASON.getKey());
        String E6 = fl3.E(cursor, ChannelMessageColumn.DELETED_DETAILS.getKey());
        Integer B = fl3.B(cursor, ChannelMessageColumn.COMMENTS_COUNT.getKey());
        Boolean y = fl3.y(cursor, ChannelMessageColumn.COMMENTS_CAN_VIEW.getKey());
        Boolean y2 = fl3.y(cursor, ChannelMessageColumn.COMMENTS_CAN_POST.getKey());
        Boolean y3 = fl3.y(cursor, ChannelMessageColumn.COMMENTS_CAN_CLOSE.getKey());
        Boolean y4 = fl3.y(cursor, ChannelMessageColumn.COMMENTS_CAN_OPEN.getKey());
        if (B == null || y == null || y2 == null || y3 == null || y4 == null) {
            attachComments = null;
        } else {
            attachComments = new AttachComments(B.intValue(), y.booleanValue(), y2.booleanValue(), y4.booleanValue(), y3.booleanValue());
        }
        Peer b2 = Peer.a.b(fl3.C(cursor, ChannelMessageColumn.SIGNER_ID.getKey()));
        boolean x3 = fl3.x(cursor, ChannelMessageColumn.IS_ADVERTISEMENT.getKey());
        byte[] v2 = fl3.v(cursor, ChannelMessageColumn.ITEM_REACTIONS.getKey());
        if (v2 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            itemReactions = (ItemReactions) Serializer.b.a(v2, ItemReactions.class.getClassLoader());
        } else {
            itemReactions = null;
        }
        int A6 = fl3.A(cursor, ChannelMessageColumn.REPOSTS_COUNT.getKey());
        int A7 = fl3.A(cursor, ChannelMessageColumn.VIEWS_COUNT.getKey());
        long C4 = fl3.C(cursor, ChannelMessageColumn.PUBLISH_DATE.getKey());
        String F3 = fl3.F(cursor, ChannelMessageColumn.TEXT_LIVE_TITLE.getKey());
        String F4 = fl3.F(cursor, ChannelMessageColumn.TEXT_LIVE_URL.getKey());
        AttachWall.TextLive textLive = (F3 == null || F4 == null) ? null : new AttachWall.TextLive(F3, F4);
        SourceType.a aVar3 = SourceType.Companion;
        int A8 = fl3.A(cursor, ChannelMessageColumn.SOURCE_TYPE.getKey());
        aVar3.getClass();
        SourceType a4 = SourceType.a.a(A8);
        long C5 = fl3.C(cursor, ChannelMessageColumn.SOURCE_ID.getKey());
        boolean x4 = fl3.x(cursor, ChannelMessageColumn.IS_VIEWED.getKey());
        boolean x5 = fl3.x(cursor, ChannelMessageColumn.IS_VERIFIED.getKey());
        boolean x6 = fl3.x(cursor, ChannelMessageColumn.IS_FAKE_NEWS.getKey());
        boolean x7 = fl3.x(cursor, ChannelMessageColumn.IS_DONUT_PHOTOS.getKey());
        byte[] v3 = fl3.v(cursor, ChannelMessageColumn.PAID_REACTION.getKey());
        if (v3 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
            paidReaction = (PaidReaction) Serializer.b.a(v3, PaidReaction.class.getClassLoader());
        } else {
            paidReaction = null;
        }
        MsgFromChannel.b bVar = new MsgFromChannel.b(E, E2, userId, A5, userId3, E3, postDonut, authorAd, E4, E5, E6, attachComments, b2, x3, paidReaction, itemReactions, A6, A7, C4, textLive, a4, C5, x4, x5, x6, x7);
        String F5 = fl3.F(cursor, ChannelMessageColumn.BODY_FORMAT.getKey());
        MsgTextFormat msgTextFormat = MsgTextFormat.d;
        MsgTextFormat a5 = MsgTextFormat.a.a(F5);
        byte[] v4 = fl3.v(cursor, ChannelMessageColumn.ATTACH.getKey());
        if (v4 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
            arrayList = Serializer.b.b(v4, Attach.class.getClassLoader());
        }
        arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        Long D = fl3.D(cursor, ChannelMessageColumn.UPDATE_TIME.getKey());
        int A9 = fl3.A(cursor, ChannelMessageColumn.PHASE_ID.getKey());
        Integer B2 = fl3.B(cursor, ChannelMessageColumn.LOCAL_REACTION.getKey());
        boolean z = this.a;
        boolean x8 = fl3.x(cursor, ChannelMessageColumn.IS_MSG_PINNED.getKey());
        String F6 = fl3.F(cursor, ChannelMessageColumn.GUID.getKey());
        int A10 = fl3.A(cursor, ChannelMessageColumn.SYNC_STATE.getKey());
        MsgSyncState.Companion.getClass();
        MsgSyncState a6 = MsgSyncState.a.a(A10);
        String F7 = fl3.F(cursor, ChannelMessageColumn.SYNC_CONFIG.getKey());
        boolean x9 = fl3.x(cursor, ChannelMessageColumn.IS_MUTE_NOTIFICATION.getKey());
        MessageSource.a aVar4 = MessageSource.Companion;
        int A11 = fl3.A(cursor, ChannelMessageColumn.SOURCE.getKey());
        aVar4.getClass();
        MessageSource a7 = MessageSource.a.a(A11);
        byte[] v5 = fl3.v(cursor, ChannelMessageColumn.EXTERNAL_VIEW_TRACKING.getKey());
        if (v5 != null) {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
            externalViewTracking = (MsgFromChannel.ExternalViewTracking) Serializer.b.a(v5, MsgFromChannel.ExternalViewTracking.class.getClassLoader());
        }
        externalViewTracking = MsgFromChannel.ExternalViewTracking.d;
        return MsgFromChannel.a.a(A2, C, b, A3, C2, a3, gkx0Var, x, x2, gkx0Var2, gkx0Var3, bVar, a5, arrayList2, D, A9, B2, z, x8, x9, F6, a6, F7, a7, externalViewTracking);
    }
}

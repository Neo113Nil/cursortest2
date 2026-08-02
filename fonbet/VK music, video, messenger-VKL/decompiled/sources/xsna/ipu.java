package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.messages.dto.MessagesAllowMessagesFromGroupTypeDto;
import com.vk.api.generated.messages.dto.MessagesDenyMessagesFromGroupTypeDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.group.MessagesFromGroupType;
import kotlin.NoWhenBranchMatchedException;
import xsna.tg20;

/* compiled from: GroupsChangeCanSendToMeApiCmd.kt */
/* loaded from: classes2.dex */
public final class ipu extends nx2<Boolean> {
    public final Peer b;
    public final boolean c;
    public final boolean d = true;
    public final MessagesFromGroupType e;

    /* compiled from: GroupsChangeCanSendToMeApiCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesFromGroupType.values().length];
            try {
                iArr[MessagesFromGroupType.BUSINESS_NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesFromGroupType.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagesFromGroupType.DIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ipu(Peer peer, boolean z, MessagesFromGroupType messagesFromGroupType) {
        this.b = peer;
        this.c = z;
        this.e = messagesFromGroupType;
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalStateException(yq.b(peer, "Required group peer. Got ").toString());
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        MessagesDenyMessagesFromGroupTypeDto messagesDenyMessagesFromGroupTypeDto;
        BaseOkResponseDto baseOkResponseDto;
        MessagesAllowMessagesFromGroupTypeDto messagesAllowMessagesFromGroupTypeDto;
        boolean z = this.c;
        boolean z2 = this.d;
        Peer peer = this.b;
        MessagesFromGroupType messagesFromGroupType = this.e;
        if (z) {
            int i = a.$EnumSwitchMapping$0[messagesFromGroupType.ordinal()];
            if (i == 1) {
                messagesAllowMessagesFromGroupTypeDto = MessagesAllowMessagesFromGroupTypeDto.BUSINESS_NOTIFY;
            } else if (i == 2) {
                messagesAllowMessagesFromGroupTypeDto = MessagesAllowMessagesFromGroupTypeDto.ALL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                messagesAllowMessagesFromGroupTypeDto = MessagesAllowMessagesFromGroupTypeDto.DIRECT;
            }
            baseOkResponseDto = (BaseOkResponseDto) bz2.l(tg20.a.a(new UserId(peer.d), null, null, null, null, null, (126 & 128) != 0 ? null : messagesAllowMessagesFromGroupTypeDto), z2);
        } else {
            int i2 = a.$EnumSwitchMapping$0[messagesFromGroupType.ordinal()];
            if (i2 == 1) {
                messagesDenyMessagesFromGroupTypeDto = MessagesDenyMessagesFromGroupTypeDto.BUSINESS_NOTIFY;
            } else if (i2 == 2) {
                messagesDenyMessagesFromGroupTypeDto = MessagesDenyMessagesFromGroupTypeDto.ALL;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                messagesDenyMessagesFromGroupTypeDto = MessagesDenyMessagesFromGroupTypeDto.DIRECT;
            }
            UserId userId = new UserId(peer.d);
            tfx tfxVar = new tfx("messages.denyMessagesFromGroup", new br(23), new cr(19));
            tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
            if (messagesDenyMessagesFromGroupTypeDto != null) {
                tfx.o(tfxVar, "type", messagesDenyMessagesFromGroupTypeDto.i(), 0, 0, 12);
            }
            baseOkResponseDto = (BaseOkResponseDto) bz2.l(tfxVar, z2);
        }
        return Boolean.valueOf(baseOkResponseDto == BaseOkResponseDto.OK);
    }
}

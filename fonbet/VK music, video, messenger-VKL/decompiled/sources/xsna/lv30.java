package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.CallParticipants;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatMemberInvite;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCall;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByMr;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.MsgChatMemberKickCallBlock;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.cor;

/* compiled from: MsgRelatedProfilesFinder.kt */
/* loaded from: classes2.dex */
public final class lv30 {
    public static f1e0 a(Msg msg) {
        f1e0 f1e0Var = new f1e0();
        b(msg, f1e0Var);
        return f1e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Msg msg, f1e0 f1e0Var) {
        d(msg.getFrom(), f1e0Var);
        if (msg instanceof aux0) {
            cor.a aVar = new cor.a(dli0.d(new ulp0(new i5g(((aux0) msg).K()), new xht(11))));
            while (aVar.hasNext()) {
                long longValue = ((Number) aVar.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                f1e0Var.c(Peer.a.b(longValue));
            }
        }
        if (msg instanceof MsgMrAccepted) {
            d(((MsgMrAccepted) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatMemberInviteByMr) {
            d(((MsgChatMemberInviteByMr) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatMemberInvite) {
            d(((MsgChatMemberInvite) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatMemberInviteByCall) {
            d(((MsgChatMemberInviteByCall) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatMemberKick) {
            d(((MsgChatMemberKick) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatMemberKickCallBlock) {
            d(((MsgChatMemberKickCallBlock) msg).E, f1e0Var);
            return;
        }
        if (msg instanceof MsgChatOwnerUpdate) {
            d(((MsgChatOwnerUpdate) msg).F, f1e0Var);
            return;
        }
        if (msg instanceof MsgFromUser) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            c(msgFromUser.H, f1e0Var);
            e(msgFromUser.I, f1e0Var);
        } else if (msg instanceof MsgFromChannel) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            c(msgFromChannel.E, f1e0Var);
            g(msgFromChannel.I.c, f1e0Var);
            g(msgFromChannel.I.e, f1e0Var);
            f(msgFromChannel.I.m, f1e0Var);
            d(msgFromChannel.O, f1e0Var);
        }
    }

    public static void c(List list, f1e0 f1e0Var) {
        List<Attach> list2 = list;
        if (!(list2 instanceof RandomAccess)) {
            for (Attach attach : list2) {
                if (attach instanceof AttachArticle) {
                    g(((AttachArticle) attach).d, f1e0Var);
                } else if (attach instanceof AttachStory) {
                    g(((AttachStory) attach).b.d, f1e0Var);
                } else if (attach instanceof AttachWall) {
                    AttachWall attachWall = (AttachWall) attach;
                    g(attachWall.d, f1e0Var);
                    g(attachWall.f, f1e0Var);
                    f(attachWall.B, f1e0Var);
                    Iterator<T> it = attachWall.g.iterator();
                    while (it.hasNext()) {
                        g((UserId) it.next(), f1e0Var);
                    }
                    c(attachWall.o, f1e0Var);
                } else if (attach instanceof AttachVideo) {
                    g(((AttachVideo) attach).b.I0(), f1e0Var);
                } else if (attach instanceof AttachEvent) {
                    g(((AttachEvent) attach).d, f1e0Var);
                } else if (attach instanceof AttachGroupCall) {
                    List<Long> list3 = ((AttachGroupCall) attach).B6().b;
                    CallParticipants callParticipants = CallParticipants.d;
                    f1e0Var.d(j5g.H0(CallParticipants.a.a(list3), 3));
                } else if (attach instanceof AttachDonutLink) {
                    g(((AttachDonutLink) attach).d, f1e0Var);
                } else if (attach instanceof AttachChannelMessage) {
                    if (BuildInfo.s()) {
                        f(new Peer.Channel(((AttachChannelMessage) attach).b.b), f1e0Var);
                    }
                    f(((AttachChannelMessage) attach).d, f1e0Var);
                }
            }
            return;
        }
        List list4 = list2;
        int size = list4.size();
        for (int i = 0; i < size; i++) {
            Attach attach2 = (Attach) list4.get(i);
            if (attach2 instanceof AttachArticle) {
                g(((AttachArticle) attach2).d, f1e0Var);
            } else if (attach2 instanceof AttachStory) {
                g(((AttachStory) attach2).b.d, f1e0Var);
            } else if (attach2 instanceof AttachWall) {
                AttachWall attachWall2 = (AttachWall) attach2;
                g(attachWall2.d, f1e0Var);
                g(attachWall2.f, f1e0Var);
                f(attachWall2.B, f1e0Var);
                Iterator<T> it2 = attachWall2.g.iterator();
                while (it2.hasNext()) {
                    g((UserId) it2.next(), f1e0Var);
                }
                c(attachWall2.o, f1e0Var);
            } else if (attach2 instanceof AttachVideo) {
                g(((AttachVideo) attach2).b.I0(), f1e0Var);
            } else if (attach2 instanceof AttachEvent) {
                g(((AttachEvent) attach2).d, f1e0Var);
            } else if (attach2 instanceof AttachGroupCall) {
                List<Long> list5 = ((AttachGroupCall) attach2).B6().b;
                CallParticipants callParticipants2 = CallParticipants.d;
                f1e0Var.d(j5g.H0(CallParticipants.a.a(list5), 3));
            } else if (attach2 instanceof AttachDonutLink) {
                g(((AttachDonutLink) attach2).d, f1e0Var);
            } else if (attach2 instanceof AttachChannelMessage) {
                if (BuildInfo.s()) {
                    f(new Peer.Channel(((AttachChannelMessage) attach2).b.b), f1e0Var);
                }
                f(((AttachChannelMessage) attach2).d, f1e0Var);
            }
        }
    }

    public static void d(Peer peer, f1e0 f1e0Var) {
        if (peer == null) {
            return;
        }
        f1e0Var.c(peer);
    }

    public static void e(List list, f1e0 f1e0Var) {
        List<NestedMsg> list2 = list;
        if (!(list2 instanceof RandomAccess)) {
            for (NestedMsg nestedMsg : list2) {
                d(nestedMsg.f, f1e0Var);
                c(nestedMsg.j, f1e0Var);
                e(nestedMsg.k, f1e0Var);
            }
            return;
        }
        List list3 = list2;
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            NestedMsg nestedMsg2 = (NestedMsg) list3.get(i);
            d(nestedMsg2.f, f1e0Var);
            c(nestedMsg2.j, f1e0Var);
            e(nestedMsg2.k, f1e0Var);
        }
    }

    public static void f(Peer peer, f1e0 f1e0Var) {
        peer.getClass();
        if (peer.Ab(Peer.Type.USER) || peer.Ab(Peer.Type.GROUP) || peer.Ab(Peer.Type.CHANNEL)) {
            f1e0Var.c(peer);
        }
    }

    public static void g(UserId userId, f1e0 f1e0Var) {
        Peer a = com.vk.dto.common.a.a(userId);
        a.getClass();
        if (a.Ab(Peer.Type.USER) || a.Ab(Peer.Type.GROUP)) {
            f1e0Var.c(a);
        }
    }
}

package defpackage;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.base.rights.OrganizationRightsFlag;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.MessageMenuActions$MessageActionsBehaviour;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class cu10 implements s3z {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ du10 a;
    public final /* synthetic */ j3b b;
    public final /* synthetic */ ServerMessageRef c;
    public final /* synthetic */ x4b0 w;
    public final /* synthetic */ s8b x;
    public final /* synthetic */ ru10 y;
    public final /* synthetic */ boolean z;

    public cu10(du10 du10Var, j3b j3bVar, ServerMessageRef serverMessageRef, x4b0 x4b0Var, s8b s8bVar, ru10 ru10Var, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = du10Var;
        this.b = j3bVar;
        this.c = serverMessageRef;
        this.w = x4b0Var;
        this.x = s8bVar;
        this.y = ru10Var;
        this.z = z;
        this.A = z2;
        this.B = str;
        this.C = z3;
        this.D = z4;
        this.E = z5;
        this.F = z6;
        this.G = z7;
        this.H = z8;
        this.I = z9;
        this.J = z10;
        this.K = z11;
    }

    public final boolean a(MessageData messageData) {
        if (this.b.M) {
            return false;
        }
        if (!(messageData instanceof VoiceMessageData) && (messageData instanceof PollMessageData)) {
            return this.a.g.a(tz10.h);
        }
        return true;
    }

    @Override // defpackage.s3z
    public final Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        this.y.a = true;
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        this.y.a = true;
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final Object l(Date date) {
        this.y.a = true;
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final Object m(Date date, RemovedMessageData removedMessageData) {
        this.y.a = true;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cb  */
    @Override // defpackage.s3z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(my40 my40Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ServerMessageRef serverMessageRef;
        long j;
        r96 r96Var;
        boolean z5;
        boolean z6;
        my40 my40Var2;
        long j2;
        ru10 ru10Var;
        boolean z7;
        LocalMessageRef a;
        k020 k020Var;
        ServerMessageRef serverMessageRef2;
        ServerMessageRef serverMessageRef3;
        lv10 lv10Var;
        boolean z8;
        boolean z9;
        boolean z10;
        int i;
        j3b l;
        boolean z11;
        s8b s8bVar;
        ChatRightsFlag chatRightsFlag;
        MessageReactions messageReactions;
        j3b j3bVar = this.b;
        boolean z12 = j3bVar.J;
        String str = j3bVar.b;
        du10 du10Var = this.a;
        k020 k020Var2 = du10Var.d;
        lqo lqoVar = du10Var.g;
        long j3 = my40Var.b;
        MessageData messageData = my40Var.g;
        boolean z13 = my40Var.c;
        boolean z14 = my40Var.i;
        boolean z15 = my40Var.k;
        boolean z16 = messageData instanceof VoiceMessageData;
        boolean z17 = a(messageData) && z14;
        boolean z18 = messageData instanceof PollMessageData;
        boolean z19 = (z18 ? lqoVar.a(tz10.h) : true) && z14;
        v0b v0bVar = du10Var.h;
        boolean c = xf4.c(v0bVar.b.a().getPublicReactions().getRestrictions(), v0bVar.a);
        if (!c || (messageReactions = messageData.reactions) == null) {
            z2 = c;
        } else {
            z2 = c;
            if (messageReactions.sumCount != 0 && messageReactions.recentUserReactionsCount != 0) {
                z3 = true;
                tyf0 tyf0Var = du10Var.l;
                z4 = z3;
                serverMessageRef = this.c;
                if (z4) {
                    Long valueOf = serverMessageRef != null ? Long.valueOf(serverMessageRef.getTimestamp()) : null;
                    j = j3;
                    x22 x22Var = tyf0Var.a;
                    MessageReactions messageReactions2 = messageData.reactions;
                    int i2 = messageReactions2 != null ? messageReactions2.sumCount : 0;
                    Pair pair = new Pair("chatId", str);
                    Pair pair2 = new Pair(ClidProvider.TIMESTAMP, valueOf);
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    Long l2 = valueOf;
                    Pair pair3 = new Pair("reactionsEnabledIntoConfig", valueOf2);
                    Pair pair4 = new Pair("haveReactions", Boolean.valueOf(messageData.reactions != null));
                    Pair pair5 = new Pair("sumCount", Integer.valueOf(i2));
                    MessageReactions messageReactions3 = messageData.reactions;
                    Map i3 = b.i(pair, pair2, pair3, pair4, pair5, new Pair("recentUserReactionsCount", messageReactions3 != null ? Integer.valueOf(messageReactions3.recentUserReactionsCount) : null));
                    x22Var.reportEvent("pub_reactions_hidden", i3);
                    if (l2 != null && i2 > 0 && tyf0Var.b.contains(new syf0(str, l2.longValue()))) {
                        x22Var.reportEvent("pub_reactions_lost_error", i3);
                    }
                } else {
                    j = j3;
                    Long valueOf3 = serverMessageRef != null ? Long.valueOf(serverMessageRef.getTimestamp()) : null;
                    x22 x22Var2 = tyf0Var.a;
                    Pair pair6 = new Pair("chatId", str);
                    Pair pair7 = new Pair(ClidProvider.TIMESTAMP, valueOf3);
                    Long l3 = valueOf3;
                    Pair pair8 = new Pair("haveReactions", Boolean.valueOf(messageData.reactions != null));
                    MessageReactions messageReactions4 = messageData.reactions;
                    Pair pair9 = new Pair("sumCount", messageReactions4 != null ? Integer.valueOf(messageReactions4.sumCount) : null);
                    MessageReactions messageReactions5 = messageData.reactions;
                    x22Var2.reportEvent("pub_reactions_shown", b.i(pair6, pair7, pair8, pair9, new Pair("recentUserReactionsCount", messageReactions5 != null ? Integer.valueOf(messageReactions5.recentUserReactionsCount) : null)));
                    if (l3 != null) {
                        tyf0Var.b.add(new syf0(str, l3.longValue()));
                    }
                }
                r96Var = tz10.L;
                if (lqoVar.a(r96Var)) {
                    long c2 = du10Var.k.c();
                    x4b0 x4b0Var = this.w;
                    if (x4b0Var != null) {
                        z5 = x4b0Var.c(OrganizationRightsFlag.CanHaveSavedMessages, c2);
                        boolean a2 = lqoVar.a(r96Var);
                        s8b s8bVar2 = this.x;
                        boolean j4 = a2 ? s8bVar2.j() : true;
                        if (lqoVar.a(r96Var)) {
                            ChatRightsFlag chatRightsFlag2 = ChatRightsFlag.Share;
                            kgx kgxVar = s8b.d[22];
                            z6 = chatRightsFlag2.c(s8bVar2).booleanValue();
                        } else {
                            z6 = true;
                        }
                        ru10 ru10Var2 = this.y;
                        ru10Var2.w = z6;
                        ru10Var2.v = j4;
                        ru10Var2.u = z5;
                        if (z13) {
                            MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour = MessageMenuActions$MessageActionsBehaviour.DEFAULT;
                        } else if (z15) {
                            MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour2 = MessageMenuActions$MessageActionsBehaviour.DEFAULT;
                        } else {
                            MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour3 = MessageMenuActions$MessageActionsBehaviour.DEFAULT;
                        }
                        boolean a3 = v0bVar.a();
                        if (xf4.c(v0bVar.b.a().getStarredMessagesConfig().getRestrictions(), v0bVar.a) && this.z && z14 && !(messageData instanceof StickerMessageData)) {
                            wbz0 wbz0Var = s8b.c;
                            int i4 = j3bVar.i;
                            wbz0Var.getClass();
                            s8bVar = new s8b(i4);
                            chatRightsFlag = ChatRightsFlag.MarkAsImportant;
                            kgx kgxVar2 = s8b.d[10];
                            if (chatRightsFlag.c(s8bVar).booleanValue()) {
                                j2 = j;
                                ota0 ota0Var = (ota0) du10Var.i.d.get(MessageRef.a(j2, str));
                                Boolean valueOf4 = ota0Var != null ? Boolean.valueOf(ota0Var.b) : null;
                                my40Var2 = my40Var;
                                if (valueOf4 == null) {
                                    valueOf4 = my40Var2.n;
                                }
                                ru10Var2.r = valueOf4;
                                ru10Var2.s = my40Var2.o;
                                ru10Var2.o = messageData.detentionReason == 0;
                                if (z13) {
                                    ru10Var = ru10Var2;
                                    z7 = true;
                                    LocalMessageRef.Companion.getClass();
                                    a = t3z.a(j2);
                                } else {
                                    t3z t3zVar = LocalMessageRef.Companion;
                                    String str2 = my40Var2.e;
                                    Long l4 = my40Var2.d;
                                    t3zVar.getClass();
                                    z83.h(null, j2 > 0);
                                    ru10Var = ru10Var2;
                                    z7 = true;
                                    a = new LocalMessageRef(j2, null, str2, l4);
                                }
                                ru10Var.k = a;
                                ru10Var.b = !z4 ? serverMessageRef : null;
                                MessageReactions messageReactions6 = messageData.reactions;
                                Integer valueOf5 = messageReactions6 == null ? Integer.valueOf(messageReactions6.sumCount) : null;
                                if (!z4) {
                                    valueOf5 = null;
                                }
                                ru10Var.c = valueOf5 == null ? valueOf5.intValue() : 0;
                                boolean z20 = j3bVar.q;
                                boolean z21 = (z12 && z14 && xf4.b(du10Var.j.a.a().getThreadsConfig().getRestrictions(), j3bVar)) ? z7 : false;
                                if (serverMessageRef != null) {
                                    k020Var = k020Var2;
                                    serverMessageRef2 = null;
                                } else if (z21) {
                                    serverMessageRef2 = null;
                                    boolean z22 = (j3bVar.G || z20 || ("U".equals(k020Var2.r()) && (s8bVar2.m() || j3bVar.C))) ? z7 : false;
                                    ChatId a4 = ChatId.Companion.a(serverMessageRef.getRequiredChatId());
                                    if (a4 instanceof ChatId.ThreadId) {
                                        k020Var = k020Var2;
                                    } else {
                                        k020Var = k020Var2;
                                        j3b l5 = k020Var.l(a4.b(serverMessageRef.getTimestamp()).a);
                                        if ((l5 != null ? l5.x : 0) > 0) {
                                            z11 = z7;
                                            boolean z23 = (z22 || j3bVar.m || z11) ? false : z7;
                                            ru10Var.h = (z23 && z11) ? serverMessageRef : null;
                                            ru10Var.i = !z23 ? serverMessageRef : null;
                                        }
                                    }
                                    z11 = false;
                                    if (z22) {
                                    }
                                    ru10Var.h = (z23 && z11) ? serverMessageRef : null;
                                    ru10Var.i = !z23 ? serverMessageRef : null;
                                } else {
                                    serverMessageRef2 = null;
                                    ru10Var.h = null;
                                    ru10Var.i = null;
                                    k020Var = k020Var2;
                                }
                                if (lqoVar.a(tz10.G) || serverMessageRef == null) {
                                    serverMessageRef3 = serverMessageRef;
                                    z8 = false;
                                    lv10Var = new lv10(0);
                                } else {
                                    if (z12) {
                                        j3b l6 = k020Var.l(new ChatId.ThreadId(serverMessageRef.getRequiredChatId()).c().a);
                                        z9 = (l6 == null || l6.L != z7) ? false : z7;
                                    } else {
                                        z9 = j3bVar.L;
                                    }
                                    if (z9) {
                                        if (z21) {
                                            ChatId a5 = ChatId.Companion.a(serverMessageRef.getRequiredChatId());
                                            if (!(a5 instanceof ChatId.ThreadId)) {
                                                j3b l7 = k020Var.l(a5.b(serverMessageRef.getTimestamp()).a);
                                                if ((l7 != null ? l7.x : 0) > 0 && (l = k020Var.l(ChatId.Companion.a(serverMessageRef.getRequiredChatId()).b(serverMessageRef.getTimestamp()).a)) != null) {
                                                    i = l.d;
                                                    if (i > 0) {
                                                        z10 = z7;
                                                        serverMessageRef3 = serverMessageRef;
                                                        lv10Var = new lv10(serverMessageRef3, !z10, z10);
                                                        z8 = false;
                                                    }
                                                }
                                            }
                                            i = 0;
                                            if (i > 0) {
                                            }
                                        }
                                        z10 = false;
                                        serverMessageRef3 = serverMessageRef;
                                        lv10Var = new lv10(serverMessageRef3, !z10, z10);
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                        lv10Var = new lv10(0);
                                        serverMessageRef3 = serverMessageRef;
                                    }
                                }
                                ru10Var.x = lv10Var;
                                String str3 = this.B;
                                boolean z24 = this.J;
                                boolean z25 = this.I;
                                boolean z26 = this.G;
                                if (z) {
                                    String str4 = my40Var2.h;
                                    boolean a6 = a(messageData);
                                    ru10Var.p = this.K ? str4 : serverMessageRef2;
                                    ru10Var.f = a6 ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.g = (z19 && z26 && !z13) ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.d = (z14 && z20) ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.j = (!z25 || messageData.hiddenByModeration || z13 || z24) ? serverMessageRef2 : serverMessageRef3;
                                    boolean z27 = this.C;
                                    if (z16 || !z27 || z13 || z18) {
                                        serverMessageRef3 = serverMessageRef2;
                                    }
                                    ru10Var.e = serverMessageRef3;
                                    ru10Var.m = j3bVar.I;
                                    ru10Var.l = (z27 || !this.D || z13 || (!this.E && this.F)) ? z8 : true;
                                    ru10Var.n = !z14;
                                    ru10Var.q = (z13 || !z14 || a3) ? serverMessageRef2 : str3;
                                } else {
                                    ru10Var.f = z17 ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.g = (z19 && z26 && !z13) ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.d = (z14 && this.H) ? serverMessageRef3 : serverMessageRef2;
                                    ru10Var.j = (!z25 || messageData.hiddenByModeration || z13 || z24) ? serverMessageRef2 : serverMessageRef3;
                                    if (z16 || !this.A || z13 || z18) {
                                        serverMessageRef3 = serverMessageRef2;
                                    }
                                    ru10Var.e = serverMessageRef3;
                                    ru10Var.n = !z14;
                                    ru10Var.q = (z13 || !z14 || a3) ? serverMessageRef2 : str3;
                                }
                                return zy11.a;
                            }
                        }
                        my40Var2 = my40Var;
                        j2 = j;
                        ru10Var2.r = null;
                        ru10Var2.s = my40Var2.o;
                        ru10Var2.o = messageData.detentionReason == 0;
                        if (z13) {
                        }
                        ru10Var.k = a;
                        ru10Var.b = !z4 ? serverMessageRef : null;
                        MessageReactions messageReactions62 = messageData.reactions;
                        if (messageReactions62 == null) {
                        }
                        if (!z4) {
                        }
                        ru10Var.c = valueOf5 == null ? valueOf5.intValue() : 0;
                        boolean z202 = j3bVar.q;
                        if (z12) {
                        }
                        if (serverMessageRef != null) {
                        }
                        if (lqoVar.a(tz10.G)) {
                        }
                        serverMessageRef3 = serverMessageRef;
                        z8 = false;
                        lv10Var = new lv10(0);
                        ru10Var.x = lv10Var;
                        String str32 = this.B;
                        boolean z242 = this.J;
                        boolean z252 = this.I;
                        boolean z262 = this.G;
                        if (z) {
                        }
                        return zy11.a;
                    }
                }
                z5 = true;
                boolean a22 = lqoVar.a(r96Var);
                s8b s8bVar22 = this.x;
                if (a22) {
                }
                if (lqoVar.a(r96Var)) {
                }
                ru10 ru10Var22 = this.y;
                ru10Var22.w = z6;
                ru10Var22.v = j4;
                ru10Var22.u = z5;
                if (z13) {
                }
                boolean a32 = v0bVar.a();
                if (xf4.c(v0bVar.b.a().getStarredMessagesConfig().getRestrictions(), v0bVar.a)) {
                    wbz0 wbz0Var2 = s8b.c;
                    int i42 = j3bVar.i;
                    wbz0Var2.getClass();
                    s8bVar = new s8b(i42);
                    chatRightsFlag = ChatRightsFlag.MarkAsImportant;
                    kgx kgxVar22 = s8b.d[10];
                    if (chatRightsFlag.c(s8bVar).booleanValue()) {
                    }
                }
                my40Var2 = my40Var;
                j2 = j;
                ru10Var22.r = null;
                ru10Var22.s = my40Var2.o;
                ru10Var22.o = messageData.detentionReason == 0;
                if (z13) {
                }
                ru10Var.k = a;
                ru10Var.b = !z4 ? serverMessageRef : null;
                MessageReactions messageReactions622 = messageData.reactions;
                if (messageReactions622 == null) {
                }
                if (!z4) {
                }
                ru10Var.c = valueOf5 == null ? valueOf5.intValue() : 0;
                boolean z2022 = j3bVar.q;
                if (z12) {
                }
                if (serverMessageRef != null) {
                }
                if (lqoVar.a(tz10.G)) {
                }
                serverMessageRef3 = serverMessageRef;
                z8 = false;
                lv10Var = new lv10(0);
                ru10Var.x = lv10Var;
                String str322 = this.B;
                boolean z2422 = this.J;
                boolean z2522 = this.I;
                boolean z2622 = this.G;
                if (z) {
                }
                return zy11.a;
            }
        }
        z3 = false;
        tyf0 tyf0Var2 = du10Var.l;
        z4 = z3;
        serverMessageRef = this.c;
        if (z4) {
        }
        r96Var = tz10.L;
        if (lqoVar.a(r96Var)) {
        }
        z5 = true;
        boolean a222 = lqoVar.a(r96Var);
        s8b s8bVar222 = this.x;
        if (a222) {
        }
        if (lqoVar.a(r96Var)) {
        }
        ru10 ru10Var222 = this.y;
        ru10Var222.w = z6;
        ru10Var222.v = j4;
        ru10Var222.u = z5;
        if (z13) {
        }
        boolean a322 = v0bVar.a();
        if (xf4.c(v0bVar.b.a().getStarredMessagesConfig().getRestrictions(), v0bVar.a)) {
        }
        my40Var2 = my40Var;
        j2 = j;
        ru10Var222.r = null;
        ru10Var222.s = my40Var2.o;
        ru10Var222.o = messageData.detentionReason == 0;
        if (z13) {
        }
        ru10Var.k = a;
        ru10Var.b = !z4 ? serverMessageRef : null;
        MessageReactions messageReactions6222 = messageData.reactions;
        if (messageReactions6222 == null) {
        }
        if (!z4) {
        }
        ru10Var.c = valueOf5 == null ? valueOf5.intValue() : 0;
        boolean z20222 = j3bVar.q;
        if (z12) {
        }
        if (serverMessageRef != null) {
        }
        if (lqoVar.a(tz10.G)) {
        }
        serverMessageRef3 = serverMessageRef;
        z8 = false;
        lv10Var = new lv10(0);
        ru10Var.x = lv10Var;
        String str3222 = this.B;
        boolean z24222 = this.J;
        boolean z25222 = this.I;
        boolean z26222 = this.G;
        if (z) {
        }
        return zy11.a;
    }
}

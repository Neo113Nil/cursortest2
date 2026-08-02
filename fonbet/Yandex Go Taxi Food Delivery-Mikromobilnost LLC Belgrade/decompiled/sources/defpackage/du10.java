package defpackage;

import android.text.TextUtils;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.data.a;
import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class du10 {
    public final naz0 a;
    public final vcz0 b;
    public final oy80 c;
    public final k020 d;
    public final MessengerEnvironment e;
    public final r1s f;
    public final lqo g;
    public final v0b h;
    public final a i;
    public final izy0 j;
    public final e k;
    public final tyf0 l;

    public du10(naz0 naz0Var, vcz0 vcz0Var, oy80 oy80Var, k020 k020Var, MessengerEnvironment messengerEnvironment, r1s r1sVar, lqo lqoVar, v0b v0bVar, a aVar, izy0 izy0Var, e eVar, tyf0 tyf0Var) {
        this.a = naz0Var;
        this.b = vcz0Var;
        this.c = oy80Var;
        this.d = k020Var;
        this.e = messengerEnvironment;
        this.f = r1sVar;
        this.g = lqoVar;
        this.h = v0bVar;
        this.i = aVar;
        this.j = izy0Var;
        this.k = eVar;
        this.l = tyf0Var;
    }

    public final ru10 a(LocalMessageRef localMessageRef) {
        vcz0 vcz0Var = this.b;
        r3z b = vcz0Var.b(localMessageRef);
        if (b == null) {
            return null;
        }
        ServerMessageRef g = vcz0Var.g(localMessageRef);
        long j = this.a.a.a;
        k020 k020Var = this.d;
        j3b k = k020Var.k(j);
        return b(g != null ? ServerMessageRef.copy$default(g, 0L, k.b, 1, null) : null, b, k, k020Var.A());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ru10 b(ServerMessageRef serverMessageRef, r3z r3zVar, j3b j3bVar, x4b0 x4b0Var) {
        boolean z;
        boolean z2;
        k020 k020Var;
        boolean z3;
        boolean z4;
        s8b s8bVar;
        boolean z5;
        MessengerEnvironment messengerEnvironment;
        p220 p220Var;
        naz0 naz0Var;
        String d;
        String chatId;
        q220 q220Var;
        boolean z6;
        String a;
        String format;
        boolean z7 = j3bVar.q;
        boolean z8 = j3bVar.C;
        wbz0 wbz0Var = s8b.c;
        int i = j3bVar.i;
        wbz0Var.getClass();
        s8b s8bVar2 = new s8b(i);
        boolean a2 = this.g.a(tz10.j);
        boolean z9 = this.k.c() == 0;
        boolean isModerated = this.e.getIsModerated();
        boolean z10 = z8 && !j3bVar.G && !j3bVar.D && isModerated && (z9 || !a2);
        boolean f = s8bVar2.f(ChatRightsFlag.Write);
        k020 k020Var2 = this.d;
        boolean z11 = f && "U".equals(k020Var2.r());
        if (z11) {
            ChatRightsFlag chatRightsFlag = ChatRightsFlag.EditMessage;
            kgx kgxVar = s8b.d[13];
            if (chatRightsFlag.c(s8bVar2).booleanValue()) {
                z = true;
                if (!z7) {
                    ChatRightsFlag chatRightsFlag2 = ChatRightsFlag.EditMessage;
                    kgx kgxVar2 = s8b.d[13];
                    if (!chatRightsFlag2.c(s8bVar2).booleanValue()) {
                        z2 = false;
                        if (z11 || j3bVar.m) {
                            k020Var = k020Var2;
                            z3 = false;
                        } else {
                            k020Var = k020Var2;
                            z3 = true;
                        }
                        boolean z12 = !j3bVar.I && z7;
                        boolean z13 = (!s8bVar2.f(ChatRightsFlag.PinMessage) || z8) && "U".equals(k020Var.r());
                        if (serverMessageRef != null) {
                            oy80 oy80Var = this.c;
                            x2c0 D = ((at2) oy80Var.c).D();
                            naz0 naz0Var2 = (naz0) oy80Var.b;
                            s8bVar = s8bVar2;
                            z4 = false;
                            long longValue = ((Number) androidx.room.util.a.b(D.a, true, false, new vh10(naz0Var2.a.a, 20))).longValue();
                            if (serverMessageRef.equals(longValue > 0 ? new ServerMessageRef(naz0Var2.a.b, longValue) : null)) {
                                z5 = true;
                                r1s r1sVar = this.f;
                                q220 q220Var2 = (q220) r1sVar.c;
                                messengerEnvironment = (MessengerEnvironment) r1sVar.w;
                                p220Var = (p220) r1sVar.b;
                                if (serverMessageRef != null && (d = (naz0Var = this.a).d()) != null) {
                                    String a3 = naz0Var.a();
                                    chatId = serverMessageRef.getChatId();
                                    if (chatId == null) {
                                        ChatId a4 = ChatId.Companion.a(chatId);
                                        q220Var = q220Var2;
                                        if ((a4 instanceof ChatId.ThreadId) && ((ChatId.ThreadId) a4).d >= 0) {
                                            ChatId.ThreadId threadId = new ChatId.ThreadId(chatId);
                                            long timestamp = serverMessageRef.getTimestamp();
                                            TextUtils.isEmpty(d);
                                            z83.i();
                                            String a5 = p220Var.a(messengerEnvironment);
                                            if (a5 != null) {
                                                q220Var.getClass();
                                                z6 = z11;
                                                format = String.format(clb1.d(messengerEnvironment) ? "https://%s/#/join/%s/%d" : "https://%s/chat/#/join/%s/%d", Arrays.copyOf(new Object[]{a5, d, Long.valueOf(threadId.d)}, 3)) + "/" + timestamp;
                                                ru10 ru10Var = new ru10();
                                                r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                                                return ru10Var;
                                            }
                                        }
                                    } else {
                                        q220Var = q220Var2;
                                    }
                                    z6 = z11;
                                    long timestamp2 = serverMessageRef.getTimestamp();
                                    TextUtils.isEmpty(d);
                                    z83.i();
                                    a = p220Var.a(messengerEnvironment);
                                    if (a != null) {
                                        if (TextUtils.isEmpty(a3)) {
                                            q220Var.getClass();
                                            format = String.format(clb1.d(messengerEnvironment) ? "https://%s/#/join/%s/%d" : "https://%s/chat/#/join/%s/%d", Arrays.copyOf(new Object[]{a, d, Long.valueOf(timestamp2)}, 3));
                                        } else {
                                            q220Var.getClass();
                                            format = String.format("https://%s/chat/#/c/%s/%d", Arrays.copyOf(new Object[]{a, a3, Long.valueOf(timestamp2)}, 3));
                                        }
                                        ru10 ru10Var2 = new ru10();
                                        r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var2, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                                        return ru10Var2;
                                    }
                                    format = null;
                                    ru10 ru10Var22 = new ru10();
                                    r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var22, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                                    return ru10Var22;
                                }
                                z6 = z11;
                                format = null;
                                ru10 ru10Var222 = new ru10();
                                r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var222, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                                return ru10Var222;
                            }
                        } else {
                            z4 = false;
                            s8bVar = s8bVar2;
                        }
                        z5 = z4;
                        r1s r1sVar2 = this.f;
                        q220 q220Var22 = (q220) r1sVar2.c;
                        messengerEnvironment = (MessengerEnvironment) r1sVar2.w;
                        p220Var = (p220) r1sVar2.b;
                        if (serverMessageRef != null) {
                            String a32 = naz0Var.a();
                            chatId = serverMessageRef.getChatId();
                            if (chatId == null) {
                            }
                            z6 = z11;
                            long timestamp22 = serverMessageRef.getTimestamp();
                            TextUtils.isEmpty(d);
                            z83.i();
                            a = p220Var.a(messengerEnvironment);
                            if (a != null) {
                            }
                            format = null;
                            ru10 ru10Var2222 = new ru10();
                            r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var2222, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                            return ru10Var2222;
                        }
                        z6 = z11;
                        format = null;
                        ru10 ru10Var22222 = new ru10();
                        r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var22222, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                        return ru10Var22222;
                    }
                }
                z2 = true;
                if (z11) {
                }
                k020Var = k020Var2;
                z3 = false;
                if (j3bVar.I) {
                }
                if (s8bVar2.f(ChatRightsFlag.PinMessage)) {
                }
                if (serverMessageRef != null) {
                }
                z5 = z4;
                r1s r1sVar22 = this.f;
                q220 q220Var222 = (q220) r1sVar22.c;
                messengerEnvironment = (MessengerEnvironment) r1sVar22.w;
                p220Var = (p220) r1sVar22.b;
                if (serverMessageRef != null) {
                }
                z6 = z11;
                format = null;
                ru10 ru10Var222222 = new ru10();
                r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var222222, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
                return ru10Var222222;
            }
        }
        z = false;
        if (!z7) {
        }
        z2 = true;
        if (z11) {
        }
        k020Var = k020Var2;
        z3 = false;
        if (j3bVar.I) {
        }
        if (s8bVar2.f(ChatRightsFlag.PinMessage)) {
        }
        if (serverMessageRef != null) {
        }
        z5 = z4;
        r1s r1sVar222 = this.f;
        q220 q220Var2222 = (q220) r1sVar222.c;
        messengerEnvironment = (MessengerEnvironment) r1sVar222.w;
        p220Var = (p220) r1sVar222.b;
        if (serverMessageRef != null) {
        }
        z6 = z11;
        format = null;
        ru10 ru10Var2222222 = new ru10();
        r3zVar.b(new cu10(this, j3bVar, serverMessageRef, x4b0Var, s8bVar, ru10Var2222222, z6, z, format, z12, isModerated, z9, a2, z3, z2, z13, z5, z10));
        return ru10Var2222222;
    }
}

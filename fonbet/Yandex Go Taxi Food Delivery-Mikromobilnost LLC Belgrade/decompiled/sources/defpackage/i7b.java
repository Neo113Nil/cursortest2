package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.analytics.msgsent.MessageSentReporter$Source;
import com.yandex.messaging.chat.activation.a;
import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageStyle;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.EmptyMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.net.c;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class i7b implements fta0 {
    public final Looper a;
    public final o1b0 b;
    public final k020 c;
    public final at2 d;
    public final ax80 e;
    public final h3y f;
    public final m g;
    public final bdu0 h;
    public final vv10 i;
    public final oab j;
    public final a k;
    public final apq0 l;
    public final h3y m;
    public final h3y n;
    public final fk51 o;
    public final ck51 p;
    public final at10 q;
    public final lqo r;
    public final h3y s;
    public final h3y t;
    public final a201 u;
    public final ike v;
    public final Resources w;
    public final i3y x;
    public final j3b y;
    public final boolean z;

    public i7b(Looper looper, o1b0 o1b0Var, k020 k020Var, at2 at2Var, ax80 ax80Var, h3y h3yVar, m mVar, bdu0 bdu0Var, vv10 vv10Var, oab oabVar, a aVar, apq0 apq0Var, h3y h3yVar2, kse kseVar, Context context, h3y h3yVar3, h3y h3yVar4, fk51 fk51Var, ck51 ck51Var, at10 at10Var, lqo lqoVar, h3y h3yVar5, h3y h3yVar6, a201 a201Var) {
        this.a = looper;
        this.b = o1b0Var;
        this.c = k020Var;
        this.d = at2Var;
        this.e = ax80Var;
        this.f = h3yVar;
        this.g = mVar;
        this.h = bdu0Var;
        this.i = vv10Var;
        this.j = oabVar;
        this.k = aVar;
        this.l = apq0Var;
        this.m = h3yVar2;
        this.n = h3yVar4;
        this.o = fk51Var;
        this.p = ck51Var;
        this.q = at10Var;
        this.r = lqoVar;
        this.s = h3yVar5;
        this.t = h3yVar6;
        this.u = a201Var;
        this.v = g8e.f(kseVar.e);
        this.w = context.getResources();
        this.x = kotlin.a.a(new l0b(h3yVar3, 1));
        this.y = k020Var.k(o1b0Var.a);
        String str = o1b0Var.c;
        this.z = str != null ? at2Var.a().c(str) : false;
        z83.g(null, looper, Looper.myLooper());
    }

    public static final void a(i7b i7bVar, long j) {
        apq0 apq0Var = i7bVar.l;
        zoq0 n = apq0Var.b.n(j);
        if (n == null) {
            return;
        }
        vv10 vv10Var = i7bVar.i;
        j3b j3bVar = i7bVar.y;
        vv10Var.a(n, j3bVar.N, j3bVar.H, MessageSentReporter$Source.RESPONSE);
        ((LinkedHashMap) apq0Var.b.c).remove(Long.valueOf(j));
    }

    public final void b(LocalMessageRef localMessageRef) {
        String messageId = localMessageRef.getMessageId();
        if (messageId == null) {
            ny61.g("messageId cannot be null");
        } else {
            this.c.d(new a7b(0, this, messageId));
        }
    }

    public final boolean c(yw80 yw80Var, jsa0 jsa0Var) {
        by10 b = this.d.b();
        long j = this.b.a;
        String str = yw80Var.a;
        Long l = (Long) androidx.room.util.a.b(b.a, true, false, new qo6(j, str, 15));
        if (l == null) {
            return false;
        }
        this.i.a.reportEvent("tech_cancel_sent_message", b.i(new Pair("id", str), new Pair(ClidProvider.TIMESTAMP, l)));
        LocalMessageRef.Companion.getClass();
        b(t3z.b(str));
        ((qsa0) jsa0Var).b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.yandex.messaging.core.net.entities.proto.message.PlainMessage$Card, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x08 d(yw80 yw80Var, long j, jsa0 jsa0Var) {
        int i;
        x08 x08Var;
        MessageRef[] messageRefArr;
        PlainMessage plainMessage;
        PlainMessage plainMessage2;
        int i2;
        yfi0 yfi0Var;
        boolean c = c(yw80Var, jsa0Var);
        MessageData messageData = yw80Var.b;
        if (c) {
            return wfz.z;
        }
        if (messageData instanceof StickerMessageData) {
            StickerMessageData stickerMessageData = (StickerMessageData) messageData;
            bdu0 bdu0Var = this.h;
            pcu0 pcu0Var = bdu0Var.b;
            r4z r4zVar = pcu0Var.a;
            odu0 odu0Var = r4zVar.b;
            zfi0 zfi0Var = new zfi0(odu0Var.b);
            List g = odu0Var.b().g(zfi0Var.c);
            if (g.isEmpty()) {
                zfi0Var = null;
                i = 1;
                x08Var = null;
            } else {
                List<ubu0> list = g;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (ubu0 ubu0Var : list) {
                    yfi0 yfi0Var2 = new yfi0(ubu0Var.a, ubu0Var.c, ubu0Var.d);
                    Long l = ubu0Var.f;
                    yfi0Var2.d = l != null ? l.longValue() : 0L;
                    arrayList.add(yfi0Var2);
                }
                i = 1;
                x08Var = null;
                zfi0Var.e = arrayList;
            }
            if (zfi0Var == null) {
                zfi0Var = new zfi0(r4zVar.a);
            }
            yfi0 yfi0Var3 = new yfi0(stickerMessageData.id, stickerMessageData.setId, odu0Var.b().f(stickerMessageData.id, stickerMessageData.setId));
            r4zVar.c.getClass();
            yfi0Var3.d = System.currentTimeMillis();
            List list2 = zfi0Var.e;
            int min = Math.min(20, list2.size() + (!list2.contains(yfi0Var3) ? 1 : 0));
            ArrayList arrayList2 = new ArrayList(min);
            int i3 = i;
            for (int i4 = 0; i4 < min; i4++) {
                if (i4 == 0) {
                    yfi0Var = yfi0Var3;
                } else {
                    if (jl40.l(list2.get(i4 - i3), yfi0Var3)) {
                        i3--;
                    }
                    if (i3 < 0) {
                        ny61.r("array contains not unique elements");
                        return x08Var;
                    }
                    yfi0Var = (yfi0) list2.get(i4 - i3);
                }
                arrayList2.add(yfi0Var);
            }
            zfi0Var.e = arrayList2;
            odu0Var.a.P(new scs0(23, odu0Var, zfi0Var));
            pcu0Var.a(pcu0Var.b.b().h());
            bdu0Var.d.a(bdu0Var.e.r().b());
        } else {
            i = 1;
            x08Var = null;
        }
        e7b e7bVar = new e7b(this, yw80Var, j, jsa0Var);
        String str = yw80Var.a;
        m mVar = this.g;
        fhc0 fhc0Var = (fhc0) mVar.i;
        String str2 = ((naz0) mVar.a).a.b;
        ForwardMessageRef[] forwardMessageRefArr = yw80Var.g;
        if (forwardMessageRefArr != null) {
            int length = forwardMessageRefArr.length;
            Object[] objArr = forwardMessageRefArr;
            if (length == 0) {
                objArr = x08Var;
            }
            if (objArr != 0) {
                ArrayList arrayList3 = new ArrayList(objArr.length);
                for (ForwardMessageRef forwardMessageRef : objArr) {
                    MessageRef messageRef = new MessageRef();
                    messageRef.chatId = forwardMessageRef.chatId;
                    messageRef.timestamp = forwardMessageRef.timestamp;
                    arrayList3.add(messageRef);
                }
                messageRefArr = (MessageRef[]) arrayList3.toArray(new MessageRef[0]);
                String str3 = yw80Var.l;
                plainMessage = new PlainMessage(null, null, null, null, null, null, null, null, str2, 0L, messageRefArr, yw80Var.c, yw80Var.f, str, jl40.l(messageData.urlPreviewDisabled, Boolean.TRUE), null, yw80Var.i, null, null, str3 != null ? x08Var : new ForwardedMessageStyle[]{new ForwardedMessageStyle(str3)}, 426239, null);
                if (!(messageData instanceof RemovedMessageData) || (messageData instanceof EmptyMessageData)) {
                    plainMessage2 = plainMessage;
                } else if (messageData instanceof TextMessageData) {
                    String str4 = messageData.text;
                    if (str4 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    ?? r6 = x08Var;
                    plainMessage2 = PlainMessage.copy$default(plainMessage, new PlainMessage.Text(str4, r6, 2, r6), null, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048574, null);
                } else if (messageData instanceof MediaMessageData) {
                    plainMessage2 = (PlainMessage) ((MediaMessageData) messageData).a(new ehc0(plainMessage, fhc0Var));
                } else {
                    if (!(messageData instanceof PollMessageData)) {
                        ny61.r("Not a message!");
                        return null;
                    }
                    PollMessageData pollMessageData = (PollMessageData) messageData;
                    String str5 = pollMessageData.title;
                    if (str5 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    String[] strArr = pollMessageData.answers;
                    if (strArr == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    boolean z = pollMessageData.isAnonymous;
                    if (pollMessageData.isMultiselect) {
                        String[] strArr3 = pollMessageData.answers;
                        if (strArr3 == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        i2 = strArr3.length;
                    } else {
                        i2 = i;
                    }
                    int[] iArr = pollMessageData.myChoices;
                    plainMessage2 = PlainMessage.copy$default(plainMessage, null, null, null, null, null, null, null, new PlainMessage.Poll(str5, strArr2, z, i2, null, iArr != null ? Arrays.copyOf(iArr, iArr.length) : null, 16, null), null, 0L, null, null, null, null, false, null, false, null, null, null, 1048447, null);
                }
                return ((n5t0) mVar.b).f(new y560(mVar, plainMessage2, yw80Var, str, e7bVar));
            }
        }
        messageRefArr = x08Var;
        String str32 = yw80Var.l;
        if (str32 != null) {
        }
        plainMessage = new PlainMessage(null, null, null, null, null, null, null, null, str2, 0L, messageRefArr, yw80Var.c, yw80Var.f, str, jl40.l(messageData.urlPreviewDisabled, Boolean.TRUE), null, yw80Var.i, null, null, str32 != null ? x08Var : new ForwardedMessageStyle[]{new ForwardedMessageStyle(str32)}, 426239, null);
        if (messageData instanceof RemovedMessageData) {
        }
        plainMessage2 = plainMessage;
        return ((n5t0) mVar.b).f(new y560(mVar, plainMessage2, yw80Var, str, e7bVar));
    }

    public final ReplyData e(ForwardMessageRef[] forwardMessageRefArr, String str) {
        ReplyData replyData = null;
        if (forwardMessageRefArr != null) {
            ForwardMessageRef forwardMessageRef = (ForwardMessageRef) j73.C(forwardMessageRefArr);
            o1b0 o1b0Var = this.b;
            if (jl40.l(o1b0Var.b, forwardMessageRef.chatId)) {
                long j = o1b0Var.a;
                long j2 = forwardMessageRef.timestamp;
                k020 k020Var = this.c;
                yab i = alb1.i(k020Var.b.B(), (Moshi) k020Var.h.get(), j, j2);
                try {
                    if (i.moveToFirst()) {
                        ReplyData.Companion companion = ReplyData.INSTANCE;
                        Resources resources = this.w;
                        long j3 = forwardMessageRef.timestamp;
                        companion.getClass();
                        replyData = ReplyData.Companion.a(resources, i.R(), i.a(), j3, str);
                    }
                    i.close();
                    return replyData;
                } finally {
                }
            }
        }
        return null;
    }

    public final x08 f(yw80 yw80Var, long j, jsa0 jsa0Var) {
        a201 a201Var = this.u;
        boolean z = ((d041) ((h3y) a201Var.b).get()).c;
        at10 at10Var = this.q;
        if (z && ((Boolean) ((c) ((h3y) a201Var.c).get()).d.a.getValue()).booleanValue()) {
            t3z t3zVar = LocalMessageRef.Companion;
            String str = yw80Var.a;
            t3zVar.getClass();
            at10Var.a(t3z.b(str), 7);
            ((qsa0) jsa0Var).a();
            return wfz.z;
        }
        MessageData messageData = yw80Var.b;
        String str2 = yw80Var.a;
        Integer num = null;
        if (messageData instanceof VoiceMessageData) {
            z83.h(null, true);
            String str3 = yw80Var.e;
            z83.d(str3, null);
            return new h7b(this, new bz31(Uri.parse(str3), this.b.b, str2, ((VoiceMessageData) messageData).wasRecognized), yw80Var, j, jsa0Var);
        }
        uw80[] uw80VarArr = yw80Var.d;
        if (uw80VarArr == null || uw80VarArr.length == 0) {
            return d(yw80Var, j, jsa0Var);
        }
        LocalMessageRef.Companion.getClass();
        at10Var.a(t3z.b(str2), 0);
        if (messageData instanceof FileMessageData) {
            num = ((FileMessageData) messageData).fileSource;
        } else if (messageData instanceof ImageMessageData) {
            num = ((ImageMessageData) messageData).fileSource;
        } else if (messageData instanceof GalleryMessageData) {
            num = ((GalleryMessageData) messageData).b();
        }
        return new c18(0, new k1k(new f7b(this.v, this, num, yw80Var, uw80VarArr, jsa0Var, j), 0));
    }
}

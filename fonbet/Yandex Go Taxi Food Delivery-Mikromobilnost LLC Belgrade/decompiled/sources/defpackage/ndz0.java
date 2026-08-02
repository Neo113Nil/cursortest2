package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.message.CustomFromUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.EmptyMessageData;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.entities.ModeratedOutMessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import defpackage.iaz0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class ndz0 {
    public final Context a;
    public final at2 b;
    public final az10 c;
    public final by10 d;
    public final xw10 e;
    public final xu10 f;
    public final uc7 g;
    public final Moshi h;
    public final poy0 i;
    public final usg j;
    public final ph9 k;
    public final x22 l;
    public final lqo m;
    public final k5o n;
    public final String o;
    public final JsonAdapter p;
    public final JsonAdapter q;
    public final JsonAdapter r;
    public final JsonAdapter s;
    public final v3k0 t;

    public ndz0(Context context, at2 at2Var, az10 az10Var, by10 by10Var, xw10 xw10Var, xu10 xu10Var, uc7 uc7Var, Moshi moshi, el21 el21Var, poy0 poy0Var, usg usgVar, ph9 ph9Var, x22 x22Var, lqo lqoVar, k5o k5oVar) {
        this.a = context;
        this.b = at2Var;
        this.c = az10Var;
        this.d = by10Var;
        this.e = xw10Var;
        this.f = xu10Var;
        this.g = uc7Var;
        this.h = moshi;
        this.i = poy0Var;
        this.j = usgVar;
        this.k = ph9Var;
        this.l = x22Var;
        this.m = lqoVar;
        this.n = k5oVar;
        this.o = el21Var.c();
        this.p = moshi.adapter(MessageData.class);
        this.q = moshi.adapter(CustomPayload.class);
        this.r = moshi.adapter(NotificationMeta.class);
        this.s = moshi.adapter(ReplyData.class);
        this.t = (v3k0) poy0Var.a();
    }

    public static final int a(ndz0 ndz0Var, hz10 hz10Var) {
        String str = hz10Var.a;
        Integer num = hz10Var.b;
        if (num != null && str != null) {
            if (num.intValue() == -3) {
                return 1;
            }
            if (num.intValue() == -1) {
                try {
                    MessageData messageData = (MessageData) ndz0Var.p.fromJson(str);
                    if (messageData instanceof RemovedMessageData) {
                        return ((RemovedMessageData) messageData).removedGroupSize;
                    }
                } catch (IOException e) {
                    ny61.j(e);
                }
            }
        }
        return 0;
    }

    public static String b(Cursor cursor) {
        Object valueOf;
        if (cursor == null) {
            return "<null>";
        }
        if (!cursor.moveToFirst()) {
            return "<empty>";
        }
        StringBuilder sb = new StringBuilder("|");
        for (String str : cursor.getColumnNames()) {
            sb.append(str);
            sb.append(HexString.CHAR_COMMA);
        }
        sb.append('|');
        do {
            int columnCount = cursor.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                String str2 = null;
                if (!cursor.isNull(i)) {
                    g0c a = qoi0.a(String.class);
                    if (a.equals(qoi0.a(String.class))) {
                        valueOf = cursor.getString(i);
                    } else if (a.equals(qoi0.a(Long.TYPE))) {
                        valueOf = Long.valueOf(cursor.getLong(i));
                    } else if (a.equals(qoi0.a(Integer.TYPE))) {
                        valueOf = Integer.valueOf(cursor.getInt(i));
                    } else if (a.equals(qoi0.a(Short.TYPE))) {
                        valueOf = Short.valueOf(cursor.getShort(i));
                    } else if (a.equals(qoi0.a(Float.TYPE))) {
                        valueOf = Float.valueOf(cursor.getFloat(i));
                    } else if (a.equals(qoi0.a(Double.TYPE))) {
                        valueOf = Double.valueOf(cursor.getDouble(i));
                    } else if (a.equals(qoi0.a(byte[].class))) {
                        valueOf = cursor.getBlob(i);
                    } else {
                        if (!a.equals(qoi0.a(Boolean.TYPE))) {
                            qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                            return null;
                        }
                        valueOf = Boolean.valueOf(cursor.getInt(i) != 0);
                    }
                    str2 = (String) valueOf;
                }
                sb.append(str2);
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append('|');
        } while (cursor.moveToNext());
        return sb.toString();
    }

    public final Long c(long j, long j2, long j3) {
        Long f = this.b.Y().f(j);
        if (f != null && j3 <= f.longValue()) {
            return null;
        }
        if (f != null && f.longValue() >= j2) {
            j2 = 0;
        }
        return Long.valueOf(j2);
    }

    public final void d(long j, long j2, String str) {
        hz10 z;
        int i;
        long j3;
        long j4;
        ph9 ph9Var;
        Moshi moshi;
        Object obj;
        at2 at2Var;
        az10 az10Var;
        int i2;
        double d;
        ndz0 ndz0Var;
        double d2;
        int i3;
        long j5;
        long j6;
        long j7 = j2;
        az10 az10Var2 = this.c;
        if ((f(az10Var2.q(j, j7), j7) ? true : f(az10Var2.o(j, j7), j7)) || (z = az10Var2.z(j, j7)) == null) {
            return;
        }
        long j8 = z.e;
        hz10 p = az10Var2.p(j, j7);
        if (p != null) {
            j3 = p.e;
            j4 = p.c;
            i = j8 == j4 ? a(this, p) : 0;
        } else {
            i = 0;
            j3 = 0;
            j4 = 0;
        }
        at2 at2Var2 = this.b;
        Moshi moshi2 = this.h;
        ph9 ph9Var2 = this.k;
        if (i > 0) {
            int i4 = i;
            z83.h(null, j4 > 0);
            ph9Var2.h(j, alb1.b(az10Var2, j, j4));
            ph9Var2.h(j, alb1.b(az10Var2, j, j7));
            RemovedMessageData removedMessageData = new RemovedMessageData();
            removedMessageData.removedGroupSize = i4 + 1;
            at2Var = at2Var2;
            moshi = moshi2;
            ph9Var = ph9Var2;
            obj = RemovedMessageData.class;
            j7 = j2;
            ph9Var.h(j, alb1.f(this.c, j, str, at2Var2.i(), UUID.randomUUID().toString(), j7, j3, z.d, 0L, 16L, z.f, "yamb", moshi2.adapter(RemovedMessageData.class).toJson(removedMessageData), null, null, null, null, null, 0L, null, null, 0L, null, null, null));
            i2 = removedMessageData.removedGroupSize;
            az10Var = az10Var2;
        } else {
            ph9Var = ph9Var2;
            moshi = moshi2;
            obj = RemovedMessageData.class;
            at2Var = at2Var2;
            az10Var = az10Var2;
            j3 = j8;
            i2 = 1;
        }
        hz10 o = az10Var.o(j, j7);
        if (o != null) {
            long j9 = o.e;
            j6 = o.c;
            d = 0.0d;
            long j10 = o.d;
            double d3 = o.f;
            if (j9 == j7) {
                ndz0Var = this;
                i3 = a(ndz0Var, o);
                d2 = d3;
                j5 = j10;
            } else {
                ndz0Var = this;
                d2 = d3;
                j5 = j10;
                i3 = 0;
            }
        } else {
            d = 0.0d;
            ndz0Var = this;
            d2 = 0.0d;
            i3 = 0;
            j5 = 0;
            j6 = 0;
        }
        if (i3 > 0) {
            int i5 = i2;
            z83.h(null, j6 > 0);
            z83.h(null, j5 > 0);
            z83.h(null, d2 > d);
            ph9Var.h(j, alb1.b(az10Var, j, j6));
            ph9Var.h(j, alb1.b(az10Var, j, j7));
            RemovedMessageData removedMessageData2 = new RemovedMessageData();
            removedMessageData2.removedGroupSize = i3 + i5;
            ph9Var.h(j, alb1.f(ndz0Var.c, j, str, at2Var.i(), UUID.randomUUID().toString(), j6, j3, j5, 0L, 16L, d2, "yamb", moshi.adapter((Class) obj).toJson(removedMessageData2), null, null, null, null, null, 0L, null, null, 0L, null, null, null));
        }
    }

    public final haz0 e(long j, String str, long j2, String str2, long j3, long j4, long j5, long j6, long j7, double d, String str3, String str4, String str5, String str6, String str7, long j8, long j9, long j10, String str8, String str9, String str10) {
        fy10 fy10Var = new fy10(null, j, j3, j4, j5, j2, j7, str2, d, str3, str4, str5, str7, j8, j9, j10, str8);
        by10 by10Var = this.d;
        ((Number) a.b(by10Var.a, false, true, new vmz(19, by10Var, fy10Var))).longValue();
        if (wkb1.k(j7, 128L)) {
            return null;
        }
        return alb1.f(this.c, j, str, j2, str2, j3, j5, j4, j6, j7, d, str3, str4, str5, str6, str7, null, null, j9, null, null, j10, str8, str9, str10);
    }

    public final boolean f(hz10 hz10Var, long j) {
        String str;
        Integer num;
        if (hz10Var != null && (str = hz10Var.a) != null && (num = hz10Var.b) != null && num.intValue() == -1) {
            try {
                MessageData messageData = (MessageData) this.p.fromJson(str);
                RemovedMessageData removedMessageData = messageData instanceof RemovedMessageData ? (RemovedMessageData) messageData : null;
                if (removedMessageData != null) {
                    long j2 = hz10Var.c;
                    long j3 = hz10Var.e;
                    if (removedMessageData.removedGroupSize > 1 && j3 < j && j <= j2) {
                        return true;
                    }
                }
            } catch (IOException e) {
                ny61.j(e);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (((java.lang.Boolean) androidx.room.util.a.b(r0.a, true, false, new defpackage.qo6(r2, r13, 13))).booleanValue() == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x03c2, code lost:
    
        if (r0 != false) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0335, code lost:
    
        if (r2 > 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x05b4, code lost:
    
        if (r1.longValue() >= r12) goto L463;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e69 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0eab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ec4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ef3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0723 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x078e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(o1b0 o1b0Var, Message message, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        k5o k5oVar;
        long j;
        Object obj;
        MessageData messageData;
        long j2;
        o1b0 o1b0Var2;
        long j3;
        Object obj2;
        MessageData messageData2;
        Long l;
        long j4;
        Long c;
        Object obj3;
        Object obj4;
        ph9 ph9Var;
        boolean z3;
        boolean z4;
        String str5;
        boolean z5;
        boolean z6;
        x22 x22Var;
        boolean z7;
        String str6;
        ph9 ph9Var2;
        long j5;
        ey10 a;
        long j6;
        Long l2;
        Long l3;
        String str7;
        long j7;
        Long l4;
        long j8;
        boolean z8;
        boolean k;
        boolean k2;
        boolean k3;
        String b;
        boolean z9;
        String str8;
        boolean z10;
        JsonAdapter jsonAdapter;
        NotificationMeta notificationMeta;
        long j9;
        String str9;
        MessageData messageData3;
        long j10;
        RoomDatabase roomDatabase;
        String str10;
        String str11;
        Message[] messageArr;
        ReplyData replyData;
        String str12;
        at2 at2Var;
        Message[] messageArr2;
        at2 at2Var2;
        ReplyData replyData2;
        by10 by10Var;
        String str13;
        long j11;
        o1b0 o1b0Var3;
        az10 az10Var;
        JsonAdapter jsonAdapter2;
        ph9 ph9Var3;
        ph9 ph9Var4;
        String str14;
        Message message2;
        long j12;
        RoomDatabase roomDatabase2;
        long j13;
        by10 by10Var2;
        String str15;
        az10 az10Var2;
        xw10 xw10Var;
        Long l5;
        x22 x22Var2;
        long j14;
        String str16;
        tls tlsVar;
        long j15;
        long j16;
        String str17;
        xw10 xw10Var2;
        ndz0 ndz0Var;
        Message message3;
        ph9 ph9Var5;
        o1b0 o1b0Var4;
        long j17;
        AtomicLong atomicLong;
        long j18;
        long j19;
        ey10 a2;
        long j20;
        az10 az10Var3;
        String str18;
        String str19;
        ph9 ph9Var6;
        String str20;
        long j21;
        long j22;
        String str21;
        int i;
        Message message4;
        xu10 xu10Var;
        by10 by10Var3;
        int i2;
        az10 az10Var4;
        ph9 ph9Var7;
        o1b0 o1b0Var5;
        MessageData messageData4;
        long j23;
        String str22;
        CustomPayload customPayload;
        long j24;
        String str23;
        Object obj5;
        by10 by10Var4;
        m5o m5oVar;
        k5o k5oVar2;
        String str24;
        MessageData messageData5;
        Object obj6;
        String str25;
        Object obj7;
        String str26;
        long j25;
        boolean z11;
        Long valueOf;
        boolean z12;
        boolean z13;
        MessageData messageData6;
        Long F;
        long j26 = o1b0Var.a;
        String str27 = o1b0Var.b;
        boolean z14 = message.v;
        long j27 = message.j;
        long j28 = message.e;
        long j29 = message.k;
        String str28 = message.a;
        String str29 = message.f;
        MessageData messageData7 = message.h;
        z83.d(message.g, null);
        boolean z15 = message.w;
        if (z15) {
            str = str29;
        } else {
            z83.h(null, message.b > 0);
            str = str29;
            z83.h(null, message.b > message.c);
        }
        z83.i();
        long j30 = o1b0Var.a;
        k5o k5oVar3 = this.n;
        if (z15) {
            m5o m5oVar2 = k5oVar3.a;
            x22 x22Var3 = m5oVar2.b;
            by10 by10Var5 = m5oVar2.e;
            z2 = z15;
            az10 az10Var5 = m5oVar2.d;
            str3 = str28;
            if (str != null) {
                by10Var4 = by10Var5;
                m5oVar = m5oVar2;
                k5oVar2 = k5oVar3;
                str24 = str;
                messageData5 = messageData7;
            } else {
                by10Var4 = by10Var5;
                m5oVar = m5oVar2;
                k5oVar2 = k5oVar3;
                str24 = str;
                messageData5 = messageData7;
            }
            if (j29 > 1) {
                x22Var3.reportEvent("tech_ephemeral_message_ignored", b.i(new Pair(CRLReasonCodeExtension.REASON, "updating unexisted message"), new Pair("prevTs", Long.valueOf(message.c)), new Pair("chatId", str27), new Pair("payloadId", str24)));
                obj = "prevTs";
                str4 = str24;
                str2 = str27;
                messageData = messageData5;
                k5oVar = k5oVar2;
                j = j26;
                z13 = true;
                j2 = j30;
            }
            long longValue = (str24 == null || (F = az10Var5.F(j30, str24)) == null) ? -1L : F.longValue();
            if (longValue >= j29) {
                x22Var3.reportEvent("tech_ephemeral_message_ignored", b.i(new Pair(CRLReasonCodeExtension.REASON, "new version less than existed"), new Pair("prevTs", Long.valueOf(message.c)), new Pair("chatId", str27), new Pair("payloadId", str24), new Pair("current_version", Long.valueOf(longValue)), new Pair("new_version", Long.valueOf(j29))));
                obj = "prevTs";
                str4 = str24;
                str2 = str27;
                messageData = messageData5;
                k5oVar = k5oVar2;
                j = j26;
                z13 = true;
                j2 = j30;
            } else {
                MessageData messageData8 = messageData5;
                int i3 = 12;
                if (messageData8 instanceof RemovedMessageData) {
                    k5o k5oVar4 = k5oVar2;
                    by10 by10Var6 = k5oVar4.b;
                    x22 x22Var4 = k5oVar4.d;
                    if (str24 == null) {
                        x22Var4.reportEvent("tech_ephemeral_message_ignored", b.i(new Pair(CRLReasonCodeExtension.REASON, "try to delete message with empty payloadId"), new Pair("prevTs", Long.valueOf(message.c)), new Pair("chatId", str27), new Pair("payloadId", str24)));
                        messageData6 = messageData8;
                    } else {
                        messageData6 = messageData8;
                        dy10 dy10Var = (dy10) a.b(by10Var6.a, true, false, new qo6(j30, str24, i3));
                        if (dy10Var == null) {
                            x22Var4.reportEvent("tech_ephemeral_message_ignored", b.i(new Pair(CRLReasonCodeExtension.REASON, "try to delete not existed message"), new Pair("prevTs", Long.valueOf(message.c)), new Pair("chatId", str27), new Pair("payloadId", str24)));
                            k5oVar4 = k5oVar4;
                        } else {
                            ((Number) a.b(by10Var6.a, false, true, new qo6(j30, str24, 10))).intValue();
                            k5oVar4 = k5oVar4;
                            k5oVar4.e.h(j30, alb1.b(k5oVar4.c, j30, dy10Var.e));
                        }
                    }
                    obj = "prevTs";
                    str4 = str24;
                    str2 = str27;
                    messageData = messageData6;
                    j = j26;
                    z13 = true;
                    j2 = j30;
                    k5oVar = k5oVar4;
                } else {
                    m5o m5oVar3 = m5oVar;
                    k5o k5oVar5 = k5oVar2;
                    ecz0 ecz0Var = m5oVar3.c;
                    if (z2) {
                        obj6 = CRLReasonCodeExtension.REASON;
                        long j31 = message.b;
                        String str30 = str24;
                        long j32 = message.c;
                        messageData = messageData8;
                        k5oVar = k5oVar5;
                        String str31 = messageData.text;
                        str25 = "tech_ephemeral_message_ignored";
                        obj7 = "payloadId";
                        StringBuilder w = unr0.w(j31, "\n                before handle ephemeral message: ts = ", ", prevTs = ");
                        uw51.v(j32, ",\n                text = ", str31, w);
                        w.append(", payloadId = ");
                        w.append(str30);
                        w.append("\n            ");
                        vuu0.c(w.toString());
                        ecz0Var.getClass();
                        dy10 dy10Var2 = str30 != null ? (dy10) a.b(by10Var4.a, true, false, new qo6(j30, str30, 12)) : null;
                        if (dy10Var2 != null) {
                            message.b = dy10Var2.e;
                            message.c = dy10Var2.d;
                            message.d = dy10Var2.c;
                            obj = "prevTs";
                            str26 = str30;
                            str2 = str27;
                            j = j26;
                            j25 = j30;
                        } else {
                            str26 = str30;
                            j = j26;
                            hz10 z16 = az10Var5.z(j, message.c);
                            boolean z17 = z16 != null;
                            str2 = str27;
                            message.d = z16 != null ? z16.d : 0L;
                            if (message.c == 0 || !z17) {
                                Long y = az10Var5.y(j);
                                long longValue2 = y != null ? y.longValue() : 0L;
                                fz10 D = az10Var5.D(j, longValue2);
                                if (D != null) {
                                    obj = "prevTs";
                                    j25 = j30;
                                    if (wkb1.k(D.b, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                                        z11 = true;
                                        if (z11) {
                                            message.c = longValue2;
                                        } else {
                                            Long w2 = az10Var5.w(j);
                                            message.c = w2 != null ? w2.longValue() : 0L;
                                        }
                                        vuu0.c("ephemeral will added after last message,\n                    havePrevTs = " + z17 + ",\n                    lastSentMessageTs = " + longValue2 + ",\n                    isLastMessageEphemeral = " + z11);
                                        Long x = az10Var5.x(j);
                                        message.d = x == null ? x.longValue() : 0L;
                                    }
                                } else {
                                    j25 = j30;
                                    obj = "prevTs";
                                }
                                z11 = false;
                                if (z11) {
                                }
                                vuu0.c("ephemeral will added after last message,\n                    havePrevTs = " + z17 + ",\n                    lastSentMessageTs = " + longValue2 + ",\n                    isLastMessageEphemeral = " + z11);
                                Long x2 = az10Var5.x(j);
                                message.d = x2 == null ? x2.longValue() : 0L;
                            } else {
                                j25 = j30;
                                obj = "prevTs";
                            }
                            yab yabVar = new yab(az10Var5.a0(j, message.c), m5oVar3.a, 0L);
                            if (yabVar.moveToFirst()) {
                                long j33 = -1;
                                do {
                                    if (yabVar.Q0() && yabVar.U() > j33) {
                                        j33 = yabVar.U();
                                    }
                                } while (yabVar.moveToNext());
                                valueOf = Long.valueOf(j33);
                            }
                            valueOf = null;
                            long longValue3 = (valueOf != null ? valueOf.longValue() : message.c) + 1;
                            yabVar.close();
                            message.b = longValue3;
                            long j34 = message.c;
                            String str32 = messageData.text;
                            StringBuilder w3 = unr0.w(longValue3, "after handle ephemeral message: ts = ", ",\n            prevTs = ");
                            w3.append(j34);
                            w3.append(", text = ");
                            w3.append(str32);
                            vuu0.c(w3.toString());
                        }
                    } else {
                        obj6 = CRLReasonCodeExtension.REASON;
                        str25 = "tech_ephemeral_message_ignored";
                        str26 = str24;
                        str2 = str27;
                        obj7 = "payloadId";
                        messageData = messageData8;
                        j = j26;
                        j25 = j30;
                        k5oVar = k5oVar5;
                        obj = "prevTs";
                    }
                    j2 = j25;
                    fz10 D2 = az10Var5.D(j2, message.b);
                    if (jl40.l(D2 != null ? Boolean.valueOf(wkb1.k(D2.b, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) : null, Boolean.FALSE)) {
                        str4 = str26;
                        m5oVar3.b.reportEvent(str25, b.i(new Pair(obj6, "real message with generated ephemeral timestamp already existed"), new Pair(obj, Long.valueOf(message.c)), new Pair("chatId", str2), new Pair(obj7, str4)));
                        z12 = false;
                    } else {
                        str4 = str26;
                        z12 = true;
                    }
                    z13 = !z12;
                }
            }
        } else {
            z2 = z15;
            str2 = str27;
            str3 = str28;
            str4 = str;
            k5oVar = k5oVar3;
            j = j26;
            obj = "prevTs";
            messageData = messageData7;
            j2 = j30;
        }
        k5o k5oVar6 = k5oVar;
        by10 by10Var7 = k5oVar6.b;
        az10 az10Var6 = k5oVar6.c;
        if (z2) {
            o1b0Var2 = o1b0Var;
            j3 = j2;
            obj2 = obj;
            messageData2 = messageData;
        } else {
            o1b0Var2 = o1b0Var;
            long j35 = o1b0Var2.a;
            j3 = j2;
            long j36 = message.b;
            obj2 = obj;
            messageData2 = messageData;
            long j37 = message.c;
            Boolean c2 = by10Var7.c(j35, j36);
            RoomDatabase roomDatabase3 = by10Var7.a;
            if (jl40.l(c2, Boolean.TRUE) && (l = (Long) a.b(roomDatabase3, true, false, new j2b(10, j35, j36))) != null) {
                long longValue4 = l.longValue();
                z83.i();
                j4 = j;
                yab yabVar2 = new yab(az10Var6.a0(j35, longValue4), k5oVar6.f, 0L);
                try {
                    int count = yabVar2.getCount();
                    yabVar2.close();
                    long j38 = longValue4 + 1;
                    k5oVar6.d.reportEvent("tech_ephemeral_timestamp_conflict", b.i(new Pair("chatId", str2), new Pair("messageTs", Long.valueOf(message.b)), new Pair("realMessagePrevTs", Long.valueOf(j37)), new Pair("existedMessagePrevTs", l), new Pair("count messages with existedPrevTs", Integer.valueOf(count)), new Pair("deleted messages", Integer.valueOf(((Number) a.b(roomDatabase3, false, true, new jeb(3, j35, longValue4, j38))).intValue()))));
                    ph9 ph9Var8 = k5oVar6.e;
                    az10Var6.f(j35, j38, longValue4);
                    ph9Var8.h(j35, new iaz0.a());
                    String str33 = str4;
                    MessageData messageData9 = messageData2;
                    boolean z18 = z2;
                    Object obj8 = obj2;
                    long j39 = j3;
                    c = c(o1b0Var2.a, message.c, message.b);
                    if (c != null) {
                        long longValue5 = c.longValue();
                        uc7 uc7Var = this.g;
                        Long l6 = (Long) a.b(uc7Var.a, true, false, new cs0(j39, 8));
                        boolean z19 = l6 != null;
                        xw10 xw10Var3 = this.e;
                        by10 by10Var8 = this.d;
                        az10 az10Var7 = this.c;
                        ph9 ph9Var9 = this.k;
                        if (l6 == null || j28 > l6.longValue()) {
                            if (z19) {
                                obj4 = obj8;
                                obj3 = "chatId";
                                ((Number) a.b(by10Var8.a, false, true, new vh10(j39, 3))).intValue();
                                az10Var7.d(j39);
                                ((Number) a.b(xw10Var3.a, false, true, new vh10(j39, 1))).intValue();
                                ph9Var9.h(j39, new iaz0.a());
                            } else {
                                obj3 = "chatId";
                                obj4 = obj8;
                            }
                            ph9Var = ph9Var9;
                            vc7 vc7Var = new vc7(j39, j28);
                            RoomDatabase roomDatabase4 = uc7Var.a;
                            w04 w04Var = new w04(21, uc7Var, vc7Var);
                            z3 = true;
                            z4 = false;
                            ((Number) a.b(roomDatabase4, false, true, w04Var)).longValue();
                        } else if (j28 >= l6.longValue()) {
                            obj3 = "chatId";
                            obj4 = obj8;
                            z3 = true;
                            z4 = false;
                            ph9Var = ph9Var9;
                        }
                        if (!z18) {
                            Long l7 = (Long) a.b(by10Var8.a, z3, z4, new j2b(11, message.b, j39));
                            if (l7 == null && str33 != null) {
                                l7 = (Long) a.b(by10Var8.a, z3, z4, new qo6(str33, j39, 7));
                            }
                            if (l7 != null) {
                            }
                        }
                        z83.f(messageData9.moderationUserChoice, null);
                        long j40 = message.b;
                        xu10 xu10Var2 = this.f;
                        messageData9.moderationUserChoice = xu10Var2.a(j40, str2);
                        double d = message.b / 1000000.0d;
                        o1b0 o1b0Var6 = o1b0Var;
                        long j41 = o1b0Var6.a;
                        boolean z20 = messageData9 instanceof RemovedMessageData;
                        boolean z21 = messageData9 instanceof EmptyMessageData;
                        boolean z22 = j29 > 1;
                        boolean z23 = messageData9 instanceof ModeratedOutMessageData;
                        String str34 = message.g;
                        String str35 = this.o;
                        if (jl40.l(str35, str34)) {
                            str5 = str35;
                        } else {
                            str5 = str35;
                            if (!jl40.l(o1b0Var6.h, message.g)) {
                                z5 = false;
                                z6 = message.x;
                                x22 x22Var5 = this.l;
                                if (z18) {
                                    x22Var = x22Var5;
                                    z7 = z5;
                                    str6 = str33;
                                    ph9Var2 = ph9Var;
                                    j5 = j41;
                                    a = by10Var8.a(j5, message.b);
                                } else {
                                    z7 = z5;
                                    if (str33 == null) {
                                        j24 = j41;
                                        obj5 = obj3;
                                        ph9Var2 = ph9Var;
                                        str23 = str33;
                                        x22Var5.reportEvent("ephemeral_with_empty_payloadId", b.i(new Pair(obj5, str2), new Pair(obj4, Long.valueOf(message.c))));
                                    } else {
                                        j24 = j41;
                                        str23 = str33;
                                        ph9Var2 = ph9Var;
                                        obj5 = obj3;
                                    }
                                    if (str23 != null) {
                                        str6 = str23;
                                        x22Var = x22Var5;
                                        obj3 = obj5;
                                        j5 = j24;
                                        a = (ey10) a.b(by10Var8.a, true, false, new zx10(str6, j24, 0L, 0));
                                    } else {
                                        x22Var = x22Var5;
                                        obj3 = obj5;
                                        str6 = str23;
                                        j5 = j24;
                                        a = null;
                                    }
                                }
                                if (a == null) {
                                    Long valueOf2 = Long.valueOf(a.a);
                                    j6 = a.b;
                                    l2 = valueOf2;
                                } else {
                                    j6 = 0;
                                    l2 = null;
                                }
                                if (l2 == null || str6 == null) {
                                    l3 = l2;
                                    str7 = str6;
                                    j7 = j6;
                                } else {
                                    RoomDatabase roomDatabase5 = by10Var8.a;
                                    zx10 zx10Var = new zx10(str6, j5, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET, 0);
                                    str7 = str6;
                                    l3 = l2;
                                    j7 = j6;
                                    ey10 ey10Var = (ey10) a.b(roomDatabase5, true, false, zx10Var);
                                    if (ey10Var != null) {
                                        Long valueOf3 = Long.valueOf(ey10Var.a);
                                        j8 = ey10Var.b;
                                        l4 = valueOf3;
                                        z8 = true;
                                        k = z22 | wkb1.k(j8, 8L);
                                        k2 = z21 | wkb1.k(j8, 128L);
                                        k3 = z20 | wkb1.k(j8, 16L);
                                        long j42 = z7 ? 1L : 0L;
                                        if (k3) {
                                            j42 |= 16;
                                        }
                                        if (k2) {
                                            j42 |= 128;
                                        }
                                        if (k) {
                                            j42 |= 8;
                                        }
                                        if (z14) {
                                            j42 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                                        }
                                        if (z18) {
                                            j42 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                                        }
                                        if (z6) {
                                            j42 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                                        }
                                        boolean z24 = j42 != j8;
                                        b = by10Var8.b(j39, message.b);
                                        RoomDatabase roomDatabase6 = by10Var8.a;
                                        JsonAdapter jsonAdapter3 = this.p;
                                        if (b != null) {
                                            try {
                                                MessageData messageData10 = (MessageData) jsonAdapter3.fromJson(b);
                                                z9 = z8;
                                                str8 = str7;
                                                long j43 = messageData10.reactionsVersion;
                                                z10 = z24;
                                                jsonAdapter = jsonAdapter3;
                                                if (j43 > messageData9.reactionsVersion) {
                                                    messageData9.reactionsVersion = j43;
                                                    messageData9.reactions = messageData10.reactions;
                                                }
                                                if ((messageData9 instanceof PollMessageData) && (messageData10 instanceof PollMessageData) && ((PollMessageData) messageData10).results.version > ((PollMessageData) messageData9).results.version) {
                                                    ((PollMessageData) messageData9).results = ((PollMessageData) messageData10).results;
                                                    ((PollMessageData) messageData9).myChoices = ((PollMessageData) messageData10).myChoices;
                                                    ((PollMessageData) messageData9).answerVotes = ((PollMessageData) messageData10).answerVotes;
                                                }
                                            } catch (IOException e) {
                                                ny61.j(e);
                                                return 0L;
                                            }
                                        } else {
                                            z10 = z24;
                                            jsonAdapter = jsonAdapter3;
                                            z9 = z8;
                                            str8 = str7;
                                        }
                                        if (z23) {
                                            message.g = "yamb";
                                        }
                                        String json2 = (!k3 || k2 || (customPayload = message.i) == null) ? null : this.q.toJson(customPayload);
                                        notificationMeta = message.s;
                                        if (notificationMeta != null) {
                                            j9 = j27;
                                            str9 = this.r.toJson(notificationMeta);
                                        } else {
                                            j9 = j27;
                                            str9 = null;
                                        }
                                        if (k3) {
                                            if (!z7) {
                                                message.g = "yamb";
                                            }
                                            if (!z20) {
                                                RemovedMessageData removedMessageData = new RemovedMessageData();
                                                removedMessageData.removedGroupSize = 1;
                                                messageData3 = removedMessageData;
                                                j10 = message.b;
                                                if (!(!f(az10Var7.q(j39, j10), j10) ? true : f(az10Var7.o(j39, j10), j10))) {
                                                    Message[] messageArr3 = message.l;
                                                    if (messageArr3 != null) {
                                                        if (messageArr3.length == 0) {
                                                            messageArr3 = null;
                                                        }
                                                        if (messageArr3 != null) {
                                                            if (k2) {
                                                                roomDatabase = roomDatabase6;
                                                                str10 = json2;
                                                                str11 = str3;
                                                            } else {
                                                                str11 = str3;
                                                                if (jl40.l(messageArr3[0].a, str11)) {
                                                                    roomDatabase = roomDatabase6;
                                                                    if (messageArr3.length == 1) {
                                                                        ReplyData.Companion companion = ReplyData.INSTANCE;
                                                                        Resources resources = this.a.getResources();
                                                                        String str36 = message.m;
                                                                        companion.getClass();
                                                                        Message message5 = messageArr3[0];
                                                                        str10 = json2;
                                                                        ReplyData a3 = ReplyData.Companion.a(resources, message5.h, message5.g, message5.b, str36);
                                                                        str22 = this.s.toJson(a3);
                                                                        replyData = a3;
                                                                        messageArr = null;
                                                                        str12 = str22;
                                                                        at2Var = this.b;
                                                                        if (!k3 || z23 || messageArr == null) {
                                                                            messageArr2 = messageArr;
                                                                            at2Var2 = at2Var;
                                                                            replyData2 = replyData;
                                                                            by10Var = by10Var8;
                                                                            str13 = str11;
                                                                            j11 = j39;
                                                                            o1b0Var3 = o1b0Var6;
                                                                            az10Var = az10Var7;
                                                                            jsonAdapter2 = jsonAdapter;
                                                                            ph9Var3 = ph9Var2;
                                                                        } else {
                                                                            at2Var2 = at2Var;
                                                                            ReplyData replyData3 = replyData;
                                                                            long j44 = o1b0Var6.a;
                                                                            long j45 = z7 ? 33L : 32L;
                                                                            if (z14) {
                                                                                j45 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                                                                            }
                                                                            replyData2 = replyData3;
                                                                            str13 = str11;
                                                                            long j46 = j45;
                                                                            j11 = j39;
                                                                            int i4 = 1;
                                                                            while (i4 <= messageArr.length && i4 < 101) {
                                                                                Message message6 = messageArr[i4 - 1];
                                                                                Message[] messageArr4 = messageArr;
                                                                                MessageData messageData11 = message6.h;
                                                                                long j47 = j46;
                                                                                long j48 = message.b - i4;
                                                                                vkb1.e(messageData11, (v3k0) this.i.a());
                                                                                messageData11.hiddenByModeration = messageData3.hiddenByModeration;
                                                                                messageData11.moderationUserChoice = xu10Var2.a(j48, str2);
                                                                                if (i4 == 1 && z21) {
                                                                                    messageData11.reactions = messageData9.reactions;
                                                                                    i = i4;
                                                                                    message4 = message6;
                                                                                    messageData11.reactionsVersion = messageData9.reactionsVersion;
                                                                                } else {
                                                                                    i = i4;
                                                                                    message4 = message6;
                                                                                }
                                                                                JsonAdapter jsonAdapter4 = jsonAdapter;
                                                                                String json3 = jsonAdapter4.toJson(messageData11);
                                                                                Long E = az10Var7.E(j44, j48);
                                                                                if (E != null) {
                                                                                    long j49 = j44;
                                                                                    ph9 ph9Var10 = ph9Var2;
                                                                                    j23 = j49;
                                                                                    ph9Var10.h(j23, alb1.j(this.c, j49, E.longValue(), json3));
                                                                                    xu10Var = xu10Var2;
                                                                                    by10Var3 = by10Var8;
                                                                                    ((Number) a.b(by10Var8.a, false, true, new jeb(2, message.t, message.u, E.longValue()))).intValue();
                                                                                    long longValue6 = E.longValue();
                                                                                    Message message7 = message4;
                                                                                    az10 az10Var8 = az10Var7;
                                                                                    az10Var8.d0(longValue6, message7.t, message7.u);
                                                                                    az10Var4 = az10Var8;
                                                                                    ph9Var7 = ph9Var10;
                                                                                    ph9Var7.h(j23, new jaz0(az10Var4.l(j23, longValue6)));
                                                                                    str2 = str2;
                                                                                    long longValue7 = E.longValue();
                                                                                    i2 = i;
                                                                                    az10Var4.g0(longValue7, j47);
                                                                                    ph9Var7.h(j23, new jaz0(az10Var4.l(j23, longValue7)));
                                                                                    o1b0Var5 = o1b0Var;
                                                                                    messageData4 = messageData9;
                                                                                } else {
                                                                                    xu10Var = xu10Var2;
                                                                                    long j50 = j44;
                                                                                    by10Var3 = by10Var8;
                                                                                    i2 = i;
                                                                                    az10Var4 = az10Var7;
                                                                                    Message message8 = message4;
                                                                                    ph9Var7 = ph9Var2;
                                                                                    String uuid = UUID.randomUUID().toString();
                                                                                    o1b0Var5 = o1b0Var;
                                                                                    String str37 = o1b0Var5.b;
                                                                                    long i5 = at2Var2.i();
                                                                                    messageData4 = messageData9;
                                                                                    long j51 = message.d;
                                                                                    long j52 = message.k;
                                                                                    long j53 = message.b;
                                                                                    long j54 = longValue5;
                                                                                    haz0 f = alb1.f(this.c, j50, str37, i5, uuid, j48, j54, j51, j52, j47, j53 / 1000000.0d, message.g, json3, null, null, null, message8.g, Long.valueOf(j53), message8.t, message8.a, Long.valueOf(message8.b), message8.u, null, null, null);
                                                                                    j23 = j50;
                                                                                    longValue5 = j54;
                                                                                    ph9Var7.h(j23, f);
                                                                                }
                                                                                int i6 = i2 + 1;
                                                                                o1b0Var6 = o1b0Var5;
                                                                                ph9Var2 = ph9Var7;
                                                                                az10Var7 = az10Var4;
                                                                                j44 = j23;
                                                                                xu10Var2 = xu10Var;
                                                                                by10Var8 = by10Var3;
                                                                                messageData9 = messageData4;
                                                                                j46 = j47;
                                                                                jsonAdapter = jsonAdapter4;
                                                                                i4 = i6;
                                                                                messageArr = messageArr4;
                                                                            }
                                                                            messageArr2 = messageArr;
                                                                            by10Var = by10Var8;
                                                                            o1b0Var3 = o1b0Var6;
                                                                            az10Var = az10Var7;
                                                                            jsonAdapter2 = jsonAdapter;
                                                                            ph9Var3 = ph9Var2;
                                                                            ph9Var3.e(j44, message.b);
                                                                        }
                                                                        vkb1.e(messageData3, this.t);
                                                                        final String json4 = jsonAdapter2.toJson(messageData3);
                                                                        CustomFromUserInfo customFromUserInfo = message.o;
                                                                        if (messageArr2 != null) {
                                                                            j42 |= 512;
                                                                        }
                                                                        long j55 = j42;
                                                                        boolean z25 = z | (!z9 || k || z10 || k3 || z23 || ((j29 > 1L ? 1 : (j29 == 1L ? 0 : -1)) != 0 && (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1)) > 0));
                                                                        String str38 = customFromUserInfo != null ? customFromUserInfo.userId : null;
                                                                        if (l4 == null) {
                                                                            if (!this.m.a(tz10.s) || str12 == null || replyData2 == null) {
                                                                                j20 = j11;
                                                                                az10Var3 = az10Var;
                                                                                str18 = str2;
                                                                                str19 = null;
                                                                            } else {
                                                                                j20 = j11;
                                                                                str19 = az10Var.s(j20, replyData2.getTimestamp());
                                                                                az10Var3 = az10Var;
                                                                                str18 = str2;
                                                                            }
                                                                            long i7 = at2Var2.i();
                                                                            l5 = Long.valueOf(i7);
                                                                            usg usgVar = this.j;
                                                                            if (kotlin.collections.a.G(usgVar.c, usgVar.b)) {
                                                                                ph9Var6 = ph9Var3;
                                                                                usgVar.a.reportEvent("tech_insert_message", b.i(new Pair("trace", (String) new b020().c.getValue()), new Pair("chatId_fromChat", str18), new Pair("chatId_fromMessage", str13), new Pair(ClidProvider.TIMESTAMP, Long.valueOf(message.b)), new Pair("prevTimestamp", Long.valueOf(message.c)), new Pair("parentMessageTimestamp", o1b0Var3.j), new Pair("seqNo", Long.valueOf(message.d))));
                                                                            } else {
                                                                                ph9Var6 = ph9Var3;
                                                                            }
                                                                            String str39 = message.f;
                                                                            long j56 = message.b;
                                                                            ph9 ph9Var11 = ph9Var6;
                                                                            long j57 = j20;
                                                                            long j58 = message.d;
                                                                            long j59 = message.k;
                                                                            String str40 = message.g;
                                                                            if (str10 != null) {
                                                                                str20 = str39;
                                                                                j21 = j56;
                                                                                if (str10.length() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                                                                                    this.l.f("custom_payload too big", "chat_id", message.a, "message_id", Long.valueOf(message.b));
                                                                                    j22 = j59;
                                                                                    x22Var.reportError("custom_payload too big", null);
                                                                                    str21 = null;
                                                                                    j12 = 128;
                                                                                    by10Var2 = by10Var;
                                                                                    str15 = str5;
                                                                                    ph9Var4 = ph9Var11;
                                                                                    message2 = message;
                                                                                    String str41 = str18;
                                                                                    j13 = j57;
                                                                                    str14 = str41;
                                                                                    ph9Var4.h(j13, e(j57, str41, i7, str20, j21, j58, longValue5, j22, j55, d, str40, json4, str21, str38, str12, message.j, message.t, message.u, str9, null, str19));
                                                                                    roomDatabase2 = roomDatabase;
                                                                                    az10Var2 = az10Var3;
                                                                                    xw10Var = xw10Var3;
                                                                                }
                                                                            } else {
                                                                                str20 = str39;
                                                                                j21 = j56;
                                                                            }
                                                                            j22 = j59;
                                                                            str21 = str10;
                                                                            j12 = 128;
                                                                            by10Var2 = by10Var;
                                                                            str15 = str5;
                                                                            ph9Var4 = ph9Var11;
                                                                            message2 = message;
                                                                            String str412 = str18;
                                                                            j13 = j57;
                                                                            str14 = str412;
                                                                            ph9Var4.h(j13, e(j57, str412, i7, str20, j21, j58, longValue5, j22, j55, d, str40, json4, str21, str38, str12, message.j, message.t, message.u, str9, null, str19));
                                                                            roomDatabase2 = roomDatabase;
                                                                            az10Var2 = az10Var3;
                                                                            xw10Var = xw10Var3;
                                                                        } else {
                                                                            ph9Var4 = ph9Var3;
                                                                            az10 az10Var9 = az10Var;
                                                                            str14 = str2;
                                                                            message2 = message;
                                                                            String str42 = str13;
                                                                            j12 = 128;
                                                                            final String str43 = str9;
                                                                            roomDatabase2 = roomDatabase;
                                                                            String str44 = str38;
                                                                            j13 = j11;
                                                                            by10Var2 = by10Var;
                                                                            final long j60 = j55;
                                                                            str15 = str5;
                                                                            x22 x22Var6 = x22Var;
                                                                            final String str45 = str12;
                                                                            if (z25) {
                                                                                final long longValue8 = l4.longValue();
                                                                                final long j61 = message2.b;
                                                                                final long j62 = message2.d;
                                                                                final double d2 = j61 / 1000000.0d;
                                                                                final String str46 = message2.g;
                                                                                final long j63 = message2.j;
                                                                                final long j64 = message2.t;
                                                                                final long j65 = message2.u;
                                                                                try {
                                                                                    final String str47 = str10;
                                                                                    final long j66 = longValue5;
                                                                                    try {
                                                                                        tlsVar = new tls() { // from class: ay10
                                                                                            @Override // defpackage.tls
                                                                                            public final Object invoke(Object obj9) {
                                                                                                long j67 = j61;
                                                                                                long j68 = j66;
                                                                                                long j69 = j62;
                                                                                                long j70 = j60;
                                                                                                double d3 = d2;
                                                                                                long j71 = j63;
                                                                                                long j72 = j64;
                                                                                                long j73 = j65;
                                                                                                long j74 = longValue8;
                                                                                                oll0 oll0Var = (oll0) obj9;
                                                                                                ull0 T0 = oll0Var.T0("UPDATE messages SET message_history_id = ?, message_prev_history_id = ?, message_sequence_number = ?, flags = ?,data = ?, custom_payload = ?, time = ?, reply_data = ?, author = ?, edit_time = ?, views_count = ?, forwards_count = ?, notification_meta = ? WHERE msg_internal_id = ?");
                                                                                                try {
                                                                                                    T0.b(1, j67);
                                                                                                    T0.b(2, j68);
                                                                                                    T0.b(3, j69);
                                                                                                    T0.b(4, j70);
                                                                                                    String str48 = json4;
                                                                                                    if (str48 == null) {
                                                                                                        T0.p(5);
                                                                                                    } else {
                                                                                                        T0.g1(5, str48);
                                                                                                    }
                                                                                                    String str49 = str47;
                                                                                                    if (str49 == null) {
                                                                                                        T0.p(6);
                                                                                                    } else {
                                                                                                        T0.g1(6, str49);
                                                                                                    }
                                                                                                    T0.z(d3, 7);
                                                                                                    String str50 = str45;
                                                                                                    if (str50 == null) {
                                                                                                        T0.p(8);
                                                                                                    } else {
                                                                                                        T0.g1(8, str50);
                                                                                                    }
                                                                                                    String str51 = str46;
                                                                                                    if (str51 == null) {
                                                                                                        T0.p(9);
                                                                                                    } else {
                                                                                                        T0.g1(9, str51);
                                                                                                    }
                                                                                                    T0.b(10, j71);
                                                                                                    T0.b(11, j72);
                                                                                                    T0.b(12, j73);
                                                                                                    String str52 = str43;
                                                                                                    if (str52 == null) {
                                                                                                        T0.p(13);
                                                                                                    } else {
                                                                                                        T0.g1(13, str52);
                                                                                                    }
                                                                                                    T0.b(14, j74);
                                                                                                    T0.q();
                                                                                                    int x3 = jx81.x(oll0Var);
                                                                                                    T0.close();
                                                                                                    return Integer.valueOf(x3);
                                                                                                } catch (Throwable th) {
                                                                                                    T0.close();
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        j61 = j61;
                                                                                        j60 = j60;
                                                                                        j14 = longValue8;
                                                                                        x22Var2 = x22Var6;
                                                                                    } catch (SQLiteConstraintException e2) {
                                                                                        e = e2;
                                                                                        x22Var2 = x22Var6;
                                                                                        j61 = j61;
                                                                                        j60 = j60;
                                                                                        j14 = longValue8;
                                                                                        TreeMap treeMap = iwk0.B;
                                                                                        iwk0 e3 = udq0.e(4, "SELECT\n            chat_internal_id,\n            msg_internal_id,\n            message_history_id,\n            message_id,\n            message_sequence_number,\n            flags,\n            author,\n            (edit_time > 0) as edited,\n            message_history_id > ? as ougoing\n        FROM messages WHERE (msg_internal_id = ?\n            OR message_history_id = ?\n            OR message_id = ?\n        )\n    ");
                                                                                        e3.b(1, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                                                                                        e3.b(2, j14);
                                                                                        e3.b(3, j61);
                                                                                        if (str8 != null) {
                                                                                            e3.p(4);
                                                                                            str16 = str8;
                                                                                        } else {
                                                                                            str16 = str8;
                                                                                            e3.m0(4, str16);
                                                                                        }
                                                                                        Cursor O0 = roomDatabase2.O0(e3);
                                                                                        try {
                                                                                            String b2 = b(O0);
                                                                                            ooc.g(O0, null);
                                                                                            long j67 = j61;
                                                                                            wrw g = at2Var2.g();
                                                                                            g.getClass();
                                                                                            Cursor O02 = g.a.O0(udq0.e(0, "SELECT * FROM internal_id"));
                                                                                            try {
                                                                                                String b3 = b(O02);
                                                                                                ooc.g(O02, null);
                                                                                                x22Var2.reportEvent("SQLiteConstraintException", b.i(new Pair(obj3, str42), new Pair("chatInternalId", Long.valueOf(j4)), new Pair("msgInternalId", l4), new Pair("messageHistoryId", Long.valueOf(j67)), new Pair("messageId", str16), new Pair("seqNo", Long.valueOf(j62)), new Pair("flags", Long.valueOf(j60)), new Pair("outgoing", Boolean.valueOf(j67 < ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET)), new Pair(Constants.KEY_DATA, b2), new Pair("internal_id_data", b3)));
                                                                                                throw e;
                                                                                            } finally {
                                                                                            }
                                                                                        } finally {
                                                                                            try {
                                                                                                throw th;
                                                                                            } finally {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        ((Number) a.b(roomDatabase2, false, true, tlsVar)).intValue();
                                                                                        if (k2) {
                                                                                            j15 = j60;
                                                                                            az10Var2 = az10Var9;
                                                                                        } else {
                                                                                            long longValue9 = l4.longValue();
                                                                                            long j68 = message2.b;
                                                                                            az10Var9.c0(j68 / 1000000.0d, longValue9, j68, j66, message2.d, message2.k, j60, message2.t, message2.u, alb1.h(json4), json4, str47, str45, message2.g, str43);
                                                                                            az10Var2 = az10Var9;
                                                                                            j15 = j60;
                                                                                            json4 = json4;
                                                                                            str47 = str47;
                                                                                            str45 = str45;
                                                                                            ph9Var4.h(j13, new jaz0(az10Var2.j(j13, j68)));
                                                                                        }
                                                                                        if (k3) {
                                                                                            long j69 = message2.b;
                                                                                            dy10 dy10Var3 = (dy10) a.b(roomDatabase2, true, false, new j2b(12, j13, j69));
                                                                                            if (dy10Var3 != null) {
                                                                                                if (az10Var2.H(j13, j69)) {
                                                                                                    ph9Var4.h(j13, alb1.b(az10Var2, j13, j69));
                                                                                                    xw10Var2 = xw10Var3;
                                                                                                    xw10Var2.a(j13, j69);
                                                                                                } else {
                                                                                                    xw10Var2 = xw10Var3;
                                                                                                }
                                                                                                Iterator it = az10Var2.t(j69).iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    long longValue10 = ((Number) it.next()).longValue();
                                                                                                    ph9Var4.h(j13, alb1.b(az10Var2, j13, longValue10));
                                                                                                    xw10Var2.a(j13, longValue10);
                                                                                                    j15 = j15;
                                                                                                }
                                                                                                j16 = j15;
                                                                                                ndz0Var = this;
                                                                                                JsonAdapter adapter = ndz0Var.h.adapter(RemovedMessageData.class);
                                                                                                RemovedMessageData removedMessageData2 = new RemovedMessageData();
                                                                                                removedMessageData2.removedGroupSize = 1;
                                                                                                str17 = str42;
                                                                                                ph9Var4.h(j13, alb1.f(ndz0Var.c, j13, str14, dy10Var3.a, dy10Var3.b, j69, dy10Var3.d, dy10Var3.c, 0L, 16L, dy10Var3.f, "yamb", adapter.toJson(removedMessageData2), null, null, null, null, null, 0L, null, null, 0L, null, null, null));
                                                                                                if (z23) {
                                                                                                    long longValue11 = l4.longValue();
                                                                                                    long j70 = message2.t;
                                                                                                    String str48 = str17;
                                                                                                    long j71 = message2.u;
                                                                                                    if (!az10Var2.G(longValue11)) {
                                                                                                        ph9Var4.h(j13, alb1.f(ndz0Var.c, j13, str48, longValue11, message2.f, message2.b, j66, message2.d, 0L, j16, d, message2.g, json4, str47, str44, str45, null, null, j70, null, null, j71, str43, null, null));
                                                                                                    }
                                                                                                    Iterator it2 = az10Var2.t(message2.b).iterator();
                                                                                                    while (it2.hasNext()) {
                                                                                                        long longValue12 = ((Number) it2.next()).longValue();
                                                                                                        ph9Var4.h(j13, alb1.b(az10Var2, j13, longValue12));
                                                                                                        xw10Var2.a(j13, longValue12);
                                                                                                    }
                                                                                                }
                                                                                                if (k) {
                                                                                                    az10Var2.a(j13, l4.longValue());
                                                                                                }
                                                                                                xw10Var = xw10Var2;
                                                                                            }
                                                                                        }
                                                                                        j16 = j15;
                                                                                        str17 = str42;
                                                                                        xw10Var2 = xw10Var3;
                                                                                        ndz0Var = this;
                                                                                        if (z23) {
                                                                                        }
                                                                                        if (k) {
                                                                                        }
                                                                                        xw10Var = xw10Var2;
                                                                                    } catch (SQLiteConstraintException e4) {
                                                                                        e = e4;
                                                                                        TreeMap treeMap2 = iwk0.B;
                                                                                        iwk0 e32 = udq0.e(4, "SELECT\n            chat_internal_id,\n            msg_internal_id,\n            message_history_id,\n            message_id,\n            message_sequence_number,\n            flags,\n            author,\n            (edit_time > 0) as edited,\n            message_history_id > ? as ougoing\n        FROM messages WHERE (msg_internal_id = ?\n            OR message_history_id = ?\n            OR message_id = ?\n        )\n    ");
                                                                                        e32.b(1, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                                                                                        e32.b(2, j14);
                                                                                        e32.b(3, j61);
                                                                                        if (str8 != null) {
                                                                                        }
                                                                                        Cursor O03 = roomDatabase2.O0(e32);
                                                                                        String b22 = b(O03);
                                                                                        ooc.g(O03, null);
                                                                                        long j672 = j61;
                                                                                        wrw g2 = at2Var2.g();
                                                                                        g2.getClass();
                                                                                        Cursor O022 = g2.a.O0(udq0.e(0, "SELECT * FROM internal_id"));
                                                                                        String b32 = b(O022);
                                                                                        ooc.g(O022, null);
                                                                                        x22Var2.reportEvent("SQLiteConstraintException", b.i(new Pair(obj3, str42), new Pair("chatInternalId", Long.valueOf(j4)), new Pair("msgInternalId", l4), new Pair("messageHistoryId", Long.valueOf(j672)), new Pair("messageId", str16), new Pair("seqNo", Long.valueOf(j62)), new Pair("flags", Long.valueOf(j60)), new Pair("outgoing", Boolean.valueOf(j672 < ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET)), new Pair(Constants.KEY_DATA, b22), new Pair("internal_id_data", b32)));
                                                                                        throw e;
                                                                                    }
                                                                                } catch (SQLiteConstraintException e5) {
                                                                                    e = e5;
                                                                                    x22Var2 = x22Var6;
                                                                                }
                                                                            } else {
                                                                                az10Var2 = az10Var9;
                                                                                xw10Var = xw10Var3;
                                                                            }
                                                                            l5 = l4;
                                                                        }
                                                                        if (k2 && !k3 && !z23 && (a2 = by10Var2.a((j19 = j4), (j18 = message2.b))) != null && az10Var2.H(j19, j18)) {
                                                                            ((Number) a.b(roomDatabase2, false, true, new j2b(7, a2.b | j12, a2.a))).intValue();
                                                                            ph9Var4.h(j19, alb1.b(az10Var2, j19, j18));
                                                                            xw10Var.a(j19, j18);
                                                                        }
                                                                        if (!k3 || z23) {
                                                                            message3 = message2;
                                                                            ph9Var5 = ph9Var4;
                                                                            String str49 = str14;
                                                                            o1b0Var4 = o1b0Var;
                                                                            d(j13, message2.b, str49);
                                                                        } else {
                                                                            o1b0Var4 = o1b0Var;
                                                                            message3 = message2;
                                                                            ph9Var5 = ph9Var4;
                                                                        }
                                                                        if (o1b0Var4.d && !o1b0Var4.e && jl40.l(message3.g, str15)) {
                                                                            j17 = message3.b;
                                                                            if (j9 >= j17) {
                                                                                j17 = j9;
                                                                            }
                                                                            atomicLong = ph9Var5.w;
                                                                            if (atomicLong != null) {
                                                                                AtomicLong atomicLong2 = new AtomicLong();
                                                                                ph9Var5.w = atomicLong2;
                                                                                atomicLong2.set(j17);
                                                                                ph9Var5.c.d(e9h0.payload_last_own_message_changed, ph9Var5.w);
                                                                            } else if (atomicLong.get() < j17) {
                                                                                ph9Var5.w.set(j17);
                                                                            }
                                                                        }
                                                                        ph9Var5.e(j13, message3.b);
                                                                        return l5.longValue();
                                                                    }
                                                                } else {
                                                                    roomDatabase = roomDatabase6;
                                                                }
                                                                str10 = json2;
                                                            }
                                                            messageArr = message.l;
                                                            str22 = null;
                                                            replyData = null;
                                                            str12 = str22;
                                                            at2Var = this.b;
                                                            if (k3) {
                                                            }
                                                            messageArr2 = messageArr;
                                                            at2Var2 = at2Var;
                                                            replyData2 = replyData;
                                                            by10Var = by10Var8;
                                                            str13 = str11;
                                                            j11 = j39;
                                                            o1b0Var3 = o1b0Var6;
                                                            az10Var = az10Var7;
                                                            jsonAdapter2 = jsonAdapter;
                                                            ph9Var3 = ph9Var2;
                                                            vkb1.e(messageData3, this.t);
                                                            final String json42 = jsonAdapter2.toJson(messageData3);
                                                            CustomFromUserInfo customFromUserInfo2 = message.o;
                                                            if (messageArr2 != null) {
                                                            }
                                                            long j552 = j42;
                                                            boolean z252 = z | (!z9 || k || z10 || k3 || z23 || ((j29 > 1L ? 1 : (j29 == 1L ? 0 : -1)) != 0 && (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1)) > 0));
                                                            if (customFromUserInfo2 != null) {
                                                            }
                                                            if (l4 == null) {
                                                            }
                                                            if (k2) {
                                                                ((Number) a.b(roomDatabase2, false, true, new j2b(7, a2.b | j12, a2.a))).intValue();
                                                                ph9Var4.h(j19, alb1.b(az10Var2, j19, j18));
                                                                xw10Var.a(j19, j18);
                                                            }
                                                            if (k3) {
                                                            }
                                                            message3 = message2;
                                                            ph9Var5 = ph9Var4;
                                                            String str492 = str14;
                                                            o1b0Var4 = o1b0Var;
                                                            d(j13, message2.b, str492);
                                                            if (o1b0Var4.d) {
                                                                j17 = message3.b;
                                                                if (j9 >= j17) {
                                                                }
                                                                atomicLong = ph9Var5.w;
                                                                if (atomicLong != null) {
                                                                }
                                                            }
                                                            ph9Var5.e(j13, message3.b);
                                                            return l5.longValue();
                                                        }
                                                    }
                                                    roomDatabase = roomDatabase6;
                                                    str10 = json2;
                                                    str11 = str3;
                                                    messageArr = null;
                                                    replyData = null;
                                                    str12 = null;
                                                    at2Var = this.b;
                                                    if (k3) {
                                                    }
                                                    messageArr2 = messageArr;
                                                    at2Var2 = at2Var;
                                                    replyData2 = replyData;
                                                    by10Var = by10Var8;
                                                    str13 = str11;
                                                    j11 = j39;
                                                    o1b0Var3 = o1b0Var6;
                                                    az10Var = az10Var7;
                                                    jsonAdapter2 = jsonAdapter;
                                                    ph9Var3 = ph9Var2;
                                                    vkb1.e(messageData3, this.t);
                                                    final String json422 = jsonAdapter2.toJson(messageData3);
                                                    CustomFromUserInfo customFromUserInfo22 = message.o;
                                                    if (messageArr2 != null) {
                                                    }
                                                    long j5522 = j42;
                                                    boolean z2522 = z | (!z9 || k || z10 || k3 || z23 || ((j29 > 1L ? 1 : (j29 == 1L ? 0 : -1)) != 0 && (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1)) > 0));
                                                    if (customFromUserInfo22 != null) {
                                                    }
                                                    if (l4 == null) {
                                                    }
                                                    if (k2) {
                                                    }
                                                    if (k3) {
                                                    }
                                                    message3 = message2;
                                                    ph9Var5 = ph9Var4;
                                                    String str4922 = str14;
                                                    o1b0Var4 = o1b0Var;
                                                    d(j13, message2.b, str4922);
                                                    if (o1b0Var4.d) {
                                                    }
                                                    ph9Var5.e(j13, message3.b);
                                                    return l5.longValue();
                                                }
                                            }
                                        }
                                        messageData3 = messageData9;
                                        j10 = message.b;
                                        if (!(!f(az10Var7.q(j39, j10), j10) ? true : f(az10Var7.o(j39, j10), j10))) {
                                        }
                                    }
                                }
                                l4 = l3;
                                j8 = j7;
                                z8 = false;
                                k = z22 | wkb1.k(j8, 8L);
                                k2 = z21 | wkb1.k(j8, 128L);
                                k3 = z20 | wkb1.k(j8, 16L);
                                if (z7) {
                                }
                                if (k3) {
                                }
                                if (k2) {
                                }
                                if (k) {
                                }
                                if (z14) {
                                }
                                if (z18) {
                                }
                                if (z6) {
                                }
                                if (j42 != j8) {
                                }
                                b = by10Var8.b(j39, message.b);
                                RoomDatabase roomDatabase62 = by10Var8.a;
                                JsonAdapter jsonAdapter32 = this.p;
                                if (b != null) {
                                }
                                if (z23) {
                                }
                                if (k3) {
                                }
                                notificationMeta = message.s;
                                if (notificationMeta != null) {
                                }
                                if (k3) {
                                }
                                messageData3 = messageData9;
                                j10 = message.b;
                                if (!(!f(az10Var7.q(j39, j10), j10) ? true : f(az10Var7.o(j39, j10), j10))) {
                                }
                            }
                        }
                        z5 = true;
                        z6 = message.x;
                        x22 x22Var52 = this.l;
                        if (z18) {
                        }
                        if (a == null) {
                        }
                        if (l2 == null) {
                        }
                        l3 = l2;
                        str7 = str6;
                        j7 = j6;
                        l4 = l3;
                        j8 = j7;
                        z8 = false;
                        k = z22 | wkb1.k(j8, 8L);
                        k2 = z21 | wkb1.k(j8, 128L);
                        k3 = z20 | wkb1.k(j8, 16L);
                        if (z7) {
                        }
                        if (k3) {
                        }
                        if (k2) {
                        }
                        if (k) {
                        }
                        if (z14) {
                        }
                        if (z18) {
                        }
                        if (z6) {
                        }
                        if (j42 != j8) {
                        }
                        b = by10Var8.b(j39, message.b);
                        RoomDatabase roomDatabase622 = by10Var8.a;
                        JsonAdapter jsonAdapter322 = this.p;
                        if (b != null) {
                        }
                        if (z23) {
                        }
                        if (k3) {
                        }
                        notificationMeta = message.s;
                        if (notificationMeta != null) {
                        }
                        if (k3) {
                        }
                        messageData3 = messageData9;
                        j10 = message.b;
                        if (!(!f(az10Var7.q(j39, j10), j10) ? true : f(az10Var7.o(j39, j10), j10))) {
                        }
                    }
                    return -1L;
                } finally {
                }
            }
        }
        j4 = j;
        String str332 = str4;
        MessageData messageData92 = messageData2;
        boolean z182 = z2;
        Object obj82 = obj2;
        long j392 = j3;
        c = c(o1b0Var2.a, message.c, message.b);
        if (c != null) {
        }
        return -1L;
    }

    public final boolean h(long j, long j2, MessageData messageData) {
        Boolean bool;
        String json2 = this.p.toJson(messageData);
        yab i = alb1.i(this.c, this.h, j, j2);
        try {
            if (!i.moveToFirst()) {
                bool = null;
            } else if (wkb1.k(i.a.getLong(2), 16L)) {
                bool = Boolean.FALSE;
            } else {
                long G = i.G();
                this.d.d(G, json2);
                this.k.h(j, alb1.j(this.c, j, G, json2));
                bool = Boolean.TRUE;
            }
            i.close();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(i, th);
                throw th2;
            }
        }
    }

    public final ArrayList i(long j, long j2) {
        az10 az10Var;
        iz10 b0;
        yw10 yw10Var;
        long j3 = j;
        String a = this.b.z().a(j3);
        if (a == null || (b0 = (az10Var = this.c).b0(j3, j2)) == null) {
            return null;
        }
        yw10 b = this.e.b(j3, j2, a, b0.a);
        ArrayList arrayList = new ArrayList();
        yab yabVar = new yab(az10Var.Z(j3, j2), this.h, 0L);
        yw10 yw10Var2 = null;
        while (true) {
            try {
                Cursor cursor = yabVar.a;
                if (!((cursor.isClosed() || yabVar.getCount() <= 0 || cursor.isLast()) ? false : true)) {
                    break;
                }
                yabVar.moveToNext();
                if (yabVar.n0() != null && yabVar.getCount() == 1 && yabVar.U() == j2) {
                    yw10Var2 = this.e.b(j3, j2 - 1, a, b0.a);
                    j3 = j;
                } else {
                    if (yabVar.R0()) {
                        yw10Var = yw10Var2;
                        j3 = j;
                        yw10 b2 = this.e.b(j3, yabVar.U(), a, b0.a);
                        if (b2 != null) {
                            jaz0 k = alb1.k(this.c, b2.b, b2.c, b2.d, b2.f, b2.e, b2.g, null, null, null);
                            if (k != null) {
                                arrayList.add(k);
                            }
                        }
                    } else {
                        j3 = j;
                        yw10Var = yw10Var2;
                    }
                    yw10Var2 = yw10Var;
                }
            } finally {
            }
        }
        yw10 yw10Var3 = yw10Var2;
        yabVar.close();
        yw10 yw10Var4 = b == null ? yw10Var3 : b;
        az10 az10Var2 = this.c;
        if (yw10Var4 == null) {
            jaz0 jaz0Var = az10Var2.c(j3, j2) < 1 ? null : new jaz0(az10Var2.j(j3, j2));
            if (jaz0Var != null) {
                arrayList.add(jaz0Var);
                return arrayList;
            }
        } else {
            jaz0 k2 = alb1.k(az10Var2, yw10Var4.b, yw10Var4.c, yw10Var4.d, yw10Var4.f, b != null ? b.e : null, b != null ? b.g : null, yw10Var3 != null ? yw10Var3.e : null, yw10Var3 != null ? yw10Var3.g : null, b != null ? b.h : null);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        return arrayList;
    }

    public final jaz0 j(long j, long j2, String str, long j3, long j4, MessageReactions messageReactions) {
        long j5;
        String B;
        Integer h = alb1.h(str);
        az10 az10Var = this.c;
        jaz0 jaz0Var = az10Var.f0(j, j2, h, str) == 0 ? null : new jaz0(az10Var.j(j, j2));
        if (jaz0Var != null) {
            return jaz0Var;
        }
        if (wkb1.k(j3, 512L) && wkb1.k(j3, 128L) && (B = az10Var.B(j, (j5 = j2 - 1))) != null) {
            JsonAdapter jsonAdapter = this.p;
            MessageData messageData = (MessageData) jsonAdapter.fromJson(B);
            if (messageData != null && messageData.reactionsVersion < j4) {
                messageData.reactionsVersion = j4;
                messageData.reactions = messageReactions;
                String json2 = jsonAdapter.toJson(messageData);
                if (az10Var.f0(j, j5, alb1.h(json2), json2) == 0) {
                    return null;
                }
                return new jaz0(az10Var.j(j, j5));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (r5 == null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList k(long j, MessageTranslation messageTranslation) {
        ?? r16;
        yw10 yw10Var;
        String a;
        Object obj;
        MessageTranslation.Message message = messageTranslation.a;
        long j2 = message.b;
        MessageTranslation.Text text = messageTranslation.b;
        yw10 l = text != null ? l(j, message, text) : null;
        ArrayList arrayList = new ArrayList();
        List list = messageTranslation.c;
        az10 az10Var = this.c;
        int i = 0;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                r16 = 0;
                yab yabVar = new yab(az10Var.Z(j, j2), this.h, 0L);
                yw10Var = null;
                while (true) {
                    try {
                        Cursor cursor = yabVar.a;
                        if (((cursor.isClosed() || yabVar.getCount() <= 0 || cursor.isLast()) ? i : 1) == 0) {
                            break;
                        }
                        yabVar.moveToNext();
                        if (yabVar.n0() != null && yabVar.getCount() == 1 && yabVar.U() == j2) {
                            yw10Var = l(j, MessageTranslation.Message.a(message, j2 - 1), ((MessageTranslation.Forward) list.get(i)).b);
                        } else if (yabVar.R0()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                Iterator it2 = it;
                                long j3 = ((MessageTranslation.Forward) obj).a;
                                Long g0 = yabVar.g0();
                                if (g0 != null && j3 == g0.longValue()) {
                                    break;
                                }
                                it = it2;
                            }
                            MessageTranslation.Forward forward = (MessageTranslation.Forward) obj;
                            if (forward != null) {
                                arrayList.add(l(j, MessageTranslation.Message.a(message, yabVar.U()), forward.b));
                            }
                        }
                        i = 0;
                    } finally {
                    }
                }
                yabVar.close();
                a = this.b.z().a(j);
                if (a != null) {
                    iz10 b0 = az10Var.b0(j, j2);
                    if (b0 == null) {
                        yw10 yw10Var2 = (yw10) kotlin.collections.a.S(0, arrayList);
                        b0 = yw10Var2 != null ? az10Var.b0(j, yw10Var2.c) : r16;
                    }
                    if (b0.a == message.c && a.equals(message.d)) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            yw10 yw10Var3 = (yw10) it3.next();
                            jaz0 k = alb1.k(this.c, yw10Var3.b, yw10Var3.c, yw10Var3.d, yw10Var3.f, yw10Var3.e, yw10Var3.g, null, null, null);
                            if (k != null) {
                                arrayList2.add(k);
                            }
                        }
                        yw10 yw10Var4 = l == null ? yw10Var : l;
                        if (yw10Var4 != null) {
                            jaz0 k2 = alb1.k(this.c, yw10Var4.b, yw10Var4.c, yw10Var4.d, yw10Var4.f, l != null ? l.e : r16, l != null ? l.g : r16, yw10Var != null ? yw10Var.e : r16, yw10Var != null ? yw10Var.g : r16, l != null ? l.h : r16);
                            if (k2 != null) {
                                arrayList2.add(k2);
                            }
                        }
                        return arrayList2;
                    }
                }
                return r16;
            }
        }
        r16 = 0;
        yw10Var = null;
        a = this.b.z().a(j);
        if (a != null) {
        }
        return r16;
    }

    public final yw10 l(long j, MessageTranslation.Message message, MessageTranslation.Text text) {
        long j2 = message.b;
        long j3 = message.c;
        yw10 b = this.e.b(j, j2, message.d, j3);
        if (b != null) {
            return b;
        }
        yw10 yw10Var = new yw10(null, j, message.b, message.c, text.a, message.d, text.b, (String) text.d.getValue());
        xw10 xw10Var = this.e;
        ((Number) a.b(xw10Var.a, false, true, new vmz(18, xw10Var, yw10Var))).longValue();
        return yw10Var;
    }
}

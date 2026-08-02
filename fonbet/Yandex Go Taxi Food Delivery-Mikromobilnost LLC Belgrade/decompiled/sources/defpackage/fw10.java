package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.util.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.ReducedChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedServerMessage;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import com.yandex.messaging.core.net.entities.proto.message.HistoryTranslationDataFilter;
import com.yandex.messaging.core.net.entities.proto.message.ThreadState;
import com.yandex.messaging.core.net.entities.proto.message.Translation;
import com.yandex.messaging.core.net.entities.proto.message.TranslationMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.translator.b;
import com.yandex.messaging.internal.view.timeline.translations.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class fw10 {
    public final naz0 a;
    public final sue0 b;
    public final k020 c;
    public final o1b0 d;
    public final n5t0 e;
    public final x0j0 f;
    public final w3c g;
    public final x22 h;
    public final vw10 i;
    public final Object j = new Object();
    public final Handler k = new Handler();
    public final zq60 l;
    public final sq60 m;
    public final rnz n;
    public w0j0 o;
    public x08 p;

    public fw10(naz0 naz0Var, sue0 sue0Var, k020 k020Var, o1b0 o1b0Var, n5t0 n5t0Var, x0j0 x0j0Var, w3c w3cVar, x22 x22Var, vw10 vw10Var) {
        this.a = naz0Var;
        this.b = sue0Var;
        this.c = k020Var;
        this.d = o1b0Var;
        this.e = n5t0Var;
        this.f = x0j0Var;
        this.g = w3cVar;
        this.h = x22Var;
        this.i = vw10Var;
        zq60 zq60Var = new zq60();
        this.l = zq60Var;
        this.m = new sq60(zq60Var);
        this.n = new rnz((Object) null);
    }

    public static final void a(fw10 fw10Var, l020 l020Var, ReducedServerMessage reducedServerMessage) {
        MessageTranslation messageTranslation;
        ReducedChatHistoryResponse.ReducedPlainMessage reducedPlainMessage;
        String str;
        ReducedChatHistoryResponse.ReducedForwardedMessageInfo reducedForwardedMessageInfo;
        ReducedChatHistoryResponse.ReducedServerMessageInfo reducedServerMessageInfo;
        Translation translation;
        String languageCode;
        Long l;
        vw10 vw10Var = fw10Var.i;
        if (reducedServerMessage == null) {
            return;
        }
        TranslationMessage translationMessage = reducedServerMessage.clientMessage.translationMessage;
        if (translationMessage == null || (messageTranslation = vw10Var.a(translationMessage)) == null) {
            messageTranslation = null;
            ArrayList arrayList = null;
            messageTranslation = null;
            messageTranslation = null;
            messageTranslation = null;
            messageTranslation = null;
            messageTranslation = null;
            messageTranslation = null;
            if (vw10Var.a.a(tz10.s) && (reducedPlainMessage = reducedServerMessage.clientMessage.plain) != null && (str = reducedPlainMessage.chatId) != null) {
                ReducedChatHistoryResponse.ReducedServerMessageInfo reducedServerMessageInfo2 = reducedServerMessage.serverMessageInfo;
                ReducedChatHistoryResponse.ReducedForwardedMessageInfo[] reducedForwardedMessageInfoArr = reducedServerMessage.forwardedMessages;
                Translation translation2 = reducedServerMessageInfo2.translation;
                if (translation2 == null || (languageCode = translation2.getLanguageCode()) == null) {
                    if (reducedForwardedMessageInfoArr != null && (reducedForwardedMessageInfo = (ReducedChatHistoryResponse.ReducedForwardedMessageInfo) j73.G(0, reducedForwardedMessageInfoArr)) != null && (reducedServerMessageInfo = reducedForwardedMessageInfo.serverMessageInfo) != null && (translation = reducedServerMessageInfo.translation) != null) {
                        languageCode = translation.getLanguageCode();
                    }
                }
                String str2 = languageCode;
                Translation translation3 = reducedServerMessageInfo2.translation;
                if (translation3 != null) {
                    l = Long.valueOf(translation3.getStatus());
                } else {
                    if (reducedForwardedMessageInfoArr != null) {
                        for (ReducedChatHistoryResponse.ReducedForwardedMessageInfo reducedForwardedMessageInfo2 : reducedForwardedMessageInfoArr) {
                            Translation translation4 = reducedForwardedMessageInfo2.serverMessageInfo.translation;
                            Long valueOf = translation4 != null ? Long.valueOf(translation4.getStatus()) : null;
                            if (valueOf != null) {
                                l = valueOf;
                                break;
                            }
                        }
                    }
                    l = null;
                }
                MessageTranslation.Message message = new MessageTranslation.Message(reducedServerMessageInfo2.timestamp, str, reducedServerMessageInfo2.version, str2);
                MessageTranslation.Text e = vw10.e(reducedServerMessageInfo2.translation);
                if (reducedForwardedMessageInfoArr != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ReducedChatHistoryResponse.ReducedForwardedMessageInfo reducedForwardedMessageInfo3 : reducedForwardedMessageInfoArr) {
                        Translation translation5 = reducedForwardedMessageInfo3.serverMessageInfo.translation;
                        Pair pair = translation5 != null ? new Pair(reducedForwardedMessageInfo3, translation5) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Pair pair2 = (Pair) it.next();
                        ReducedChatHistoryResponse.ReducedForwardedMessageInfo reducedForwardedMessageInfo4 = (ReducedChatHistoryResponse.ReducedForwardedMessageInfo) pair2.getFirst();
                        Translation translation6 = (Translation) pair2.getSecond();
                        translation6.getLanguageCode();
                        z83.i();
                        MessageTranslation.Forward d = vw10.d(translation6, reducedForwardedMessageInfo4.serverMessageInfo.timestamp);
                        if (d != null) {
                            arrayList.add(d);
                        }
                    }
                }
                messageTranslation = new MessageTranslation(message, e, arrayList, vw10.c(l));
            }
            if (messageTranslation == null) {
                return;
            }
        }
        l020Var.f0(fw10Var.d, messageTranslation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0100, code lost:
    
        if (r22 < r5.B().longValue()) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        long j;
        sq60 sq60Var;
        long j2;
        zv10 zv10Var;
        Long[] translationFor;
        c9v c9vVar;
        b bVar;
        boolean z2;
        boolean z3;
        long j3;
        String b;
        yab yabVar;
        Handler handler = this.k;
        String str = null;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        z83.c(null, this.l.isEmpty());
        if (this.p != null) {
            return;
        }
        Object obj = this.j;
        handler.removeCallbacksAndMessages(obj);
        if (!z) {
            handler.postDelayed(new bw10(this, 0), obj, 30000L);
            return;
        }
        w3c w3cVar = this.g;
        w3cVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        z83.g(null, handler.getLooper(), Looper.myLooper());
        sq60 sq60Var2 = this.m;
        sq60Var2.rewind();
        long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        while (true) {
            if (!sq60Var2.hasNext()) {
                j = elapsedRealtime;
                sq60Var = sq60Var2;
                j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                zv10Var = new zv10(null, j4, 1);
                break;
            }
            aw10 aw10Var = (aw10) sq60Var2.next();
            Pair pair = new Pair(aw10Var.a, aw10Var.c);
            TimestampRange timestampRange = (TimestampRange) pair.getFirst();
            Long[] lArr = (Long[]) pair.getSecond();
            Looper looper = handler.getLooper();
            j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            z83.g(str, looper, Looper.myLooper());
            w3cVar.getClass();
            long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            vcz0 vcz0Var = (vcz0) this.b.b;
            k020 k020Var = vcz0Var.b;
            w3c w3cVar2 = w3cVar;
            long j5 = vcz0Var.a.a;
            at2 at2Var = k020Var.b;
            j = elapsedRealtime;
            yab yabVar2 = new yab(at2Var.B().T(j5, timestampRange.min, timestampRange.max), (Moshi) k020Var.h.get(), at2Var.Y().g(j5));
            q43 q43Var = new q43(yabVar2);
            sq60Var = sq60Var2;
            long j6 = Long.MAX_VALUE;
            long j7 = 0;
            long j8 = 0;
            while (true) {
                try {
                    if (yabVar2.a.getPosition() < 0) {
                        z3 = yabVar2.moveToNext();
                    } else {
                        long k0 = yabVar2.k0();
                        if (yabVar2.moveToNext()) {
                            if (!yabVar2.R0()) {
                                z2 = k0 < yabVar2.z0();
                            }
                            q43Var.b = z2;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (!z3) {
                        j3 = j8;
                        break;
                    }
                    if (yabVar2.R0()) {
                        yabVar = yabVar2;
                        j3 = j8;
                    } else if (q43Var.b || yabVar2.S0()) {
                        yabVar = yabVar2;
                        j3 = j8;
                        if (j3 != 0) {
                            break;
                        }
                    } else {
                        j3 = j8;
                        long w0 = yabVar2.w0();
                        yabVar = yabVar2;
                        z83.h(null, w0 > 0);
                        long longValue = micros - ((Number) this.n.d(w0, Long.valueOf(w0))).longValue();
                        if (longValue < 30000000) {
                            j6 = Math.min(j6, 30000000 - longValue);
                            if (j3 != 0) {
                                break;
                            }
                        } else {
                            if (j3 == 0) {
                                j3 = w0;
                            }
                            j7 = w0;
                        }
                    }
                    j8 = j3;
                    yabVar2 = yabVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ooc.g(q43Var, th);
                        throw th2;
                    }
                }
            }
            q43Var.close();
            z83.h(null, j3 >= j7);
            if (j3 == 0) {
                zv10Var = new zv10(null, j6 / 1000, 1);
            } else {
                HistoryRequest historyRequest = new HistoryRequest();
                naz0 naz0Var = this.a;
                historyRequest.chatId = naz0Var.a.b;
                historyRequest.inviteHash = naz0Var.e();
                MessageDataFilter messageDataFilter = new MessageDataFilter();
                messageDataFilter.dropPayload = true;
                historyRequest.messageDataFilter = messageDataFilter;
                historyRequest.limit = 50L;
                historyRequest.minTimestamp = j7;
                historyRequest.maxTimestamp = j3 + 1;
                if (lArr != null) {
                    if ((lArr.length == 0 ? null : lArr) != null && (b = naz0Var.b()) != null) {
                        historyRequest.translationDataFilter = new HistoryTranslationDataFilter(b, lArr);
                    }
                }
                zv10Var = new zv10(historyRequest, 0L, 2);
            }
            if (zv10Var.a != null) {
                break;
            }
            j4 = Math.min(j4, zv10Var.b);
            sq60Var2 = sq60Var;
            w3cVar = w3cVar2;
            elapsedRealtime = j;
            str = null;
        }
        this.h.c("tech reactions build request", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - j));
        HistoryRequest historyRequest2 = zv10Var.a;
        if (historyRequest2 == null) {
            long j9 = zv10Var.b;
            if (j9 != j2) {
                handler.postDelayed(new bw10(this, 1), obj, j9);
                return;
            }
            return;
        }
        this.p = this.e.f(new cw10(historyRequest2, this));
        HistoryTranslationDataFilter historyTranslationDataFilter = historyRequest2.translationDataFilter;
        if (historyTranslationDataFilter == null || (translationFor = historyTranslationDataFilter.getTranslationFor()) == null) {
            return;
        }
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            f5b f5bVar = ((aw10) sq60Var.next()).w;
            if (f5bVar != null) {
                for (Long l : translationFor) {
                    e5b e5bVar = (e5b) f5bVar.x.c(l.longValue());
                    if (e5bVar != null && (c9vVar = e5bVar.b) != null && (bVar = ((c) c9vVar.b).u) != null) {
                        bVar.d(((ServerMessageRef) c9vVar.c).getTimestamp(), new rfa(22));
                    }
                }
            }
        }
    }

    public final aw10 c(TimestampRange timestampRange, cbi0 cbi0Var, Long[] lArr, f5b f5bVar) {
        z83.g(null, this.k.getLooper(), Looper.myLooper());
        if (this.o == null && this.a.e() != null) {
            this.o = this.f.a(25L, TimeUnit.SECONDS, new dw10(0, this));
        }
        return new aw10(this, timestampRange, cbi0Var, lArr, f5bVar);
    }

    public final boolean d(l020 l020Var, final long j, final long j2, final MessageReactions messageReactions) {
        String str;
        if (j2 != 0) {
            long j3 = this.a.a.a;
            ndz0 ndz0Var = l020Var.D;
            ph9 ph9Var = ndz0Var.k;
            by10 by10Var = ndz0Var.d;
            JsonAdapter jsonAdapter = ndz0Var.p;
            cy10 cy10Var = (cy10) a.b(by10Var.a, true, false, new j2b(15, j3, j));
            if (cy10Var != null && (str = cy10Var.c) != null) {
                try {
                    MessageData messageData = (MessageData) jsonAdapter.fromJson(str);
                    if (messageData.reactionsVersion < j2) {
                        messageData.reactionsVersion = j2;
                        messageData.reactions = messageReactions;
                        String json2 = jsonAdapter.toJson(messageData);
                        ((Number) a.b(by10Var.a, false, true, new zx10(json2, j3, j, 1))).intValue();
                        jaz0 j4 = ndz0Var.j(j3, j, json2, cy10Var.b, j2, messageReactions);
                        if (j4 != null) {
                            ph9Var.i(j3, Collections.singletonList(j4));
                            ph9Var.e(j3, j);
                            l020Var.y.a(new vx60() { // from class: yv10
                                @Override // defpackage.vx60
                                public final void a() {
                                    sq60 sq60Var = fw10.this.m;
                                    sq60Var.rewind();
                                    while (sq60Var.hasNext()) {
                                        aw10 aw10Var = (aw10) sq60Var.next();
                                        fw10 fw10Var = aw10Var.x;
                                        z83.g(null, fw10Var.k.getLooper(), Looper.myLooper());
                                        TimestampRange timestampRange = aw10Var.a;
                                        long j5 = timestampRange.min;
                                        long j6 = j;
                                        if (j6 >= j5 && j6 <= timestampRange.max) {
                                            cbi0 cbi0Var = aw10Var.b;
                                            naz0 naz0Var = fw10Var.a;
                                            naz0Var.getClass();
                                            cbi0Var.c(new ServerMessageRef(naz0Var.a.b, j6), j2, messageReactions);
                                        }
                                    }
                                }
                            });
                            return true;
                        }
                    }
                } catch (IOException e) {
                    ny61.j(e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void e(l020 l020Var, long j, ThreadState threadState) {
        if (threadState != null) {
            o1b0 o1b0Var = this.a.a;
            l020Var.B.i(o1b0Var.a, ChatId.Companion.a(o1b0Var.b).b(j).a, threadState);
        }
    }
}

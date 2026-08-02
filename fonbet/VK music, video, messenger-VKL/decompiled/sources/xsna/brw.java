package xsna;

import android.os.SystemClock;
import com.vk.core.preference.Preference;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.inappreview.impl.InAppReviewConditionGroup;
import com.vk.log.L;
import com.vk.toggle.Features;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.brw;

/* compiled from: InAppReviewConditionManagerImpl.kt */
/* loaded from: classes2.dex */
public final class brw implements zqw {
    public static final long j;
    public static final long k;
    public final long a;
    public final long b;
    public final long c;
    public bm01 d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Object g;
    public gzs<? extends io.reactivex.rxjava3.core.x<hgg0>> h;
    public izs<? super InAppReviewConditionKey, s3q0> i;

    /* compiled from: InAppReviewConditionManagerImpl.kt */
    public static final class a {
        public final InAppReviewConditionGroup a;
        public boolean b;

        public a(InAppReviewConditionGroup inAppReviewConditionGroup) {
            this.a = inAppReviewConditionGroup;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        j = timeUnit.toMillis(1L);
        k = timeUnit.toMillis(30L);
    }

    public brw(long j2, long j3, long j4) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        InAppReviewConditionKey inAppReviewConditionKey = InAppReviewConditionKey.ADD_POST_BY_ADMIN;
        Pair pair = new Pair(inAppReviewConditionKey, new oto0(inAppReviewConditionKey.h(), 3));
        InAppReviewConditionKey inAppReviewConditionKey2 = InAppReviewConditionKey.BUY_GIFT_OR_PACK;
        Pair pair2 = new Pair(inAppReviewConditionKey2, new oto0(inAppReviewConditionKey2.h(), 2));
        InAppReviewConditionKey inAppReviewConditionKey3 = InAppReviewConditionKey.LOAD_3_USER_PROFILE_COVER;
        Pair pair3 = new Pair(inAppReviewConditionKey3, new vwj(inAppReviewConditionKey3.h(), 3));
        InAppReviewConditionKey inAppReviewConditionKey4 = InAppReviewConditionKey.OPEN_3_NEW_GIFT_FROM_NOTIFICATION;
        Pair pair4 = new Pair(inAppReviewConditionKey4, new vwj(inAppReviewConditionKey4.h(), 3));
        Pair pair5 = new Pair(InAppReviewConditionKey.LIKE_3_MORE_POSTS, new ati0(3));
        Pair pair6 = new Pair(InAppReviewConditionKey.ADD_MUSIC_ALBUM_WITH_SUBSCRIPTION, new n940());
        Pair pair7 = new Pair(InAppReviewConditionKey.OPEN_3_NEW_GIFT_FROM_MESSENGER, new gh20());
        Pair pair8 = new Pair(InAppReviewConditionKey.REFRESH_FEED_3_TIMES_AND_WATCH_GARLAND, new bht());
        Pair pair9 = new Pair(InAppReviewConditionKey.SEND_VIDEO_OR_AUDIO_MESSAGES, new ati0(8));
        InAppReviewConditionKey inAppReviewConditionKey5 = InAppReviewConditionKey.SEND_IM_REACTIONS;
        Pair pair10 = new Pair(inAppReviewConditionKey5, new vwj(inAppReviewConditionKey5.h(), 7));
        InAppReviewConditionKey inAppReviewConditionKey6 = InAppReviewConditionKey.REQUEST_AUDIO_MSG_TRANSCRIPTION;
        Pair pair11 = new Pair(inAppReviewConditionKey6, new vwj(inAppReviewConditionKey6.h(), 1));
        InAppReviewConditionKey inAppReviewConditionKey7 = InAppReviewConditionKey.CREATE_FOLDER;
        Pair pair12 = new Pair(inAppReviewConditionKey7, new vwj(inAppReviewConditionKey7.h(), 2));
        Pair pair13 = new Pair(InAppReviewConditionKey.SEND_MESSAGE, new zhi0());
        InAppReviewConditionKey inAppReviewConditionKey8 = InAppReviewConditionKey.MINIAPP_IN_APP_REVIEW_BRIDGE;
        this.g = pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair(inAppReviewConditionKey8, new vwj(inAppReviewConditionKey8.h(), 1)));
    }

    @Override // xsna.zqw
    public final void a(long j2) {
        L.e("InAppReview", defpackage.k0.a(j2, "Pause in-app review for "));
        Preference.F(SystemClock.elapsedRealtime() + j2, "in_app_review_prefs", "in_app_pause_to_time");
    }

    @Override // xsna.zqw
    public final io.reactivex.rxjava3.core.a b(final InAppReviewConditionKey inAppReviewConditionKey, final Map<String, ? extends Object> map) {
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.arw
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
            
                if (android.os.SystemClock.elapsedRealtime() >= (r7 + r0.a)) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
            
                if ((android.os.SystemClock.elapsedRealtime() >= r11 + r0.b) != false) goto L53;
             */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                brw brwVar = brw.this;
                bm01 bm01Var = brwVar.d;
                InAppReviewConditionKey inAppReviewConditionKey2 = inAppReviewConditionKey;
                if (bm01Var != null) {
                    bm01Var.b("IN_APP_REVIEW_TRIGGER", inAppReviewConditionKey2.h(), null);
                }
                brw.a aVar = (brw.a) brwVar.f.get(inAppReviewConditionKey2);
                if (aVar == null) {
                    L.e("InAppReview", "Can't find descriptor for the key " + inAppReviewConditionKey2.h());
                    return Boolean.FALSE;
                }
                InAppReviewConditionGroup inAppReviewConditionGroup = aVar.a;
                boolean z = true;
                aVar.b = true;
                if (inAppReviewConditionGroup != InAppReviewConditionGroup.DEFAULT) {
                    List list = (List) brwVar.e.get(inAppReviewConditionGroup);
                    if (list != null) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (!((brw.a) it.next()).b) {
                                }
                            }
                        }
                    }
                    L.e("InAppReview", "Waiting for all conditions in group " + inAppReviewConditionGroup + " triggered");
                    return Boolean.FALSE;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime >= brwVar.c + brw.j && elapsedRealtime >= Preference.m(-1L, "in_app_review_prefs", "in_app_pause_to_time")) {
                    long m = Preference.m(-1L, "in_app_review_prefs", "in_app_review_key");
                    if (m != -1) {
                    }
                    zqp0 zqp0Var = (zqp0) brwVar.g.get(inAppReviewConditionKey2);
                    if (!(zqp0Var != null ? zqp0Var.a(map) : true)) {
                        L.e("InAppReview", "Waiting for the key conditions.");
                        return Boolean.FALSE;
                    }
                    Features.Type type = Features.Type.FEATURE_CORE_FAKE_IAR;
                    type.getClass();
                    boolean a2 = com.vk.toggle.b.A.a(type);
                    long m2 = Preference.m(-1L, "in_app_review_prefs", "fake_iar_last_key");
                    if (m2 == -1) {
                        z = a2;
                    } else {
                        if (a2) {
                        }
                        z = false;
                    }
                    if (!z) {
                        return Boolean.TRUE;
                    }
                    L.e("InAppReview", "Try show fake iar");
                    izs<? super InAppReviewConditionKey, s3q0> izsVar = brwVar.i;
                    if (izsVar == null) {
                        L.e("InAppReview", "Cant show fake iar. Try show real dialog");
                        return Boolean.TRUE;
                    }
                    izsVar.invoke(inAppReviewConditionKey2);
                    Preference.F(SystemClock.elapsedRealtime(), "in_app_review_prefs", "fake_iar_last_key");
                    brwVar.d(inAppReviewConditionKey2, null);
                    return Boolean.FALSE;
                }
                bm01 bm01Var2 = brwVar.d;
                if (bm01Var2 != null) {
                    bm01Var2.b("IN_APP_REVIEW_WAIT_TIME", inAppReviewConditionKey2.h(), null);
                }
                return Boolean.FALSE;
            }
        }).q(io.reactivex.rxjava3.android.schedulers.a.b()), new q40(new eaa(17, this, inAppReviewConditionKey), 20));
    }

    public final void d(InAppReviewConditionKey inAppReviewConditionKey, String str) {
        bm01 bm01Var = this.d;
        if (bm01Var != null) {
            bm01Var.b("IN_APP_REVIEW_SUCCESS", inAppReviewConditionKey.h(), str);
        }
        Preference.F(SystemClock.elapsedRealtime(), "in_app_review_prefs", "in_app_review_key");
        a aVar = (a) this.f.get(inAppReviewConditionKey);
        if (aVar == null) {
            return;
        }
        aVar.b = false;
        List list = (List) this.e.get(aVar.a);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b = false;
            }
        }
    }
}

package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import com.google.android.gms.internal.measurement.zzpg;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBreakingNewsTrendFeedIntentDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: ReplyCreateResponse.kt */
/* loaded from: classes18.dex */
public final class c4g0 implements lfi0, q701, hx2, dsz, a8g0, io.reactivex.rxjava3.functions.l, vv60 {
    public static volatile xxv h;
    public static String k;
    public static Long l;
    public static final jai b = new jai(486633673, new sbi(0), false);
    public static final jai c = new jai(-315893904, new pbi(1), false);
    public static final jai d = new jai(-1623017259, new k3i(2), false);
    public static final jai e = new jai(1524289712, new f21(1), false);
    public static final jai f = new jai(-1741933697, new ali(), false);
    public static final Object g = new Object();
    public static final c4g0 i = new c4g0();
    public static final /* synthetic */ c4g0 j = new c4g0();

    public static final long A(nuw nuwVar, Orientation orientation, muw muwVar) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        if (orientation == null) {
            return nuwVar.c;
        }
        int i2 = muwVar.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (nuwVar.c >> 32));
        } else {
            if (i2 != 2) {
                return nuwVar.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (nuwVar.c & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            j2 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & floatToRawIntBits);
    }

    public static void B(Long l2) {
        k = null;
        l = l2;
    }

    public static final void C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    public static final String D(vjp vjpVar) {
        return Base64.encodeToString(vjpVar.a, 0) + '|' + Base64.encodeToString(vjpVar.b, 0);
    }

    public static final String E(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public static final vjp F(String str) {
        List c0 = drm0.c0(str, new String[]{HiAnalyticsConstant.REPORT_VAL_SEPARATOR}, 0, 6);
        if (c0.size() == 2) {
            return new vjp(Base64.decode((String) c0.get(0), 0), Base64.decode((String) c0.get(1), 0));
        }
        throw new IllegalArgumentException("Invalid encrypted data format");
    }

    public static /* synthetic */ boolean G(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void a(com.vk.comments.impl.a aVar, nuw nuwVar, Orientation orientation, muw muwVar, ouw ouwVar, long j2) {
        float intBitsToFloat;
        fh50 fh50Var = (fh50) ouwVar.b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (nuwVar.c >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (nuwVar.c & 4294967295L));
        if (h(nuwVar)) {
            ouwVar.a = 0;
            fh50Var.m();
        }
        if (!g(nuwVar) && !h(nuwVar)) {
            if (fh50Var.b == 3) {
                int i2 = ouwVar.a;
                ouwVar.a = i2 + 1;
                fh50Var.r(i2, nuwVar);
            } else {
                fh50Var.j(nuwVar);
            }
            if (ouwVar.a == 3) {
                ouwVar.a = 0;
            }
            Object[] objArr = fh50Var.a;
            int i3 = fh50Var.b;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (((nuw) objArr[i4]).c >> 32));
            }
            int i5 = fh50Var.b;
            intBitsToFloat2 = f2 / i5;
            Object[] objArr2 = fh50Var.a;
            float f3 = 0.0f;
            for (int i6 = 0; i6 < i5; i6++) {
                f3 += Float.intBitsToFloat((int) (((nuw) objArr2[i6]).c & 4294967295L));
            }
            intBitsToFloat3 = f3 / fh50Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (orientation != null) {
            int i7 = muwVar.a;
            if (i7 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i7 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = orientation == Orientation.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) : (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((androidx.compose.ui.input.pointer.util.a) aVar.b).a(nuwVar.b, ov70.f(floatToRawIntBits, j2));
    }

    public static final boolean g(nuw nuwVar) {
        return nuwVar.h && !nuwVar.d;
    }

    public static final boolean h(nuw nuwVar) {
        return !nuwVar.h && nuwVar.d;
    }

    public static void i(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final void j(View view, Context context, float f2, int i2) {
        view.setContentDescription(context.getString(R.string.reviews_rating_accessibility) + " " + context.getString(R.string.rating_view_state_content_accessibility, Float.valueOf(f2), Integer.valueOf(i2)));
    }

    public static Socket k(InetAddress inetAddress, int i2) throws IOException {
        Socket socket = new Socket();
        socket.setSoTimeout(5000);
        socket.connect(new InetSocketAddress(inetAddress, i2), 10000);
        socket.setSoTimeout(20000);
        return socket;
    }

    public static ArrayList l(List list, yzs yzsVar) {
        Msg msg = (Msg) j5g.Y(list);
        Msg msg2 = (Msg) j5g.i0(list);
        ArrayList arrayList = new ArrayList(list);
        List list2 = (List) yzsVar.invoke(msg.p, gkx0.d, 2);
        if (!list2.isEmpty()) {
            Msg msg3 = (Msg) j5g.Y(list2);
            if (msg3.b == msg.b || epx.f(msg3.p, msg.p)) {
                msg3 = (Msg) j5g.b0(1, list2);
            }
            if (msg3 != null) {
                if (!epx.f(msg3.t, msg.p) && msg.q) {
                    msg3 = null;
                }
                if (msg3 != null) {
                    msg3.t = msg.p;
                    msg.s = msg3.p;
                    arrayList.add(0, msg3);
                }
            }
        }
        List list3 = (List) yzsVar.invoke(msg2.p, gkx0.e, 2);
        if (!list3.isEmpty()) {
            Msg msg4 = (Msg) j5g.Y(list3);
            if (msg4.b == msg2.b || epx.f(msg4.p, msg2.p)) {
                msg4 = (Msg) j5g.b0(1, list3);
            }
            if (msg4 != null) {
                Msg msg5 = (epx.f(msg4.s, msg2.p) || !msg2.r) ? msg4 : null;
                if (msg5 != null) {
                    msg5.s = msg2.p;
                    msg2.t = msg5.p;
                    arrayList.add(msg5);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Peer peer, List list, Boolean bool, Boolean bool2, boolean z, boolean z2, exf exfVar) {
        boolean b2;
        yg20 yg20Var = exfVar.a;
        Msg msg = (Msg) j5g.Y(list);
        Msg msg2 = (Msg) j5g.i0(list);
        boolean z3 = false;
        boolean z4 = bool == null && !z;
        boolean z5 = bool2 == null && !z2;
        if (z4 || z5) {
            if (list.size() == 1) {
                gkx0 gkx0Var = msg.p;
                if (z4 && z5) {
                    xgk0 a = yg20Var.a(peer, gkx0Var);
                    r3 = a.a;
                    b2 = a.b;
                } else if (z4) {
                    r3 = yg20Var.c(peer, gkx0Var);
                    b2 = true;
                } else if (z5) {
                    b2 = yg20Var.b(peer, gkx0Var);
                }
            } else {
                boolean c2 = z4 ? yg20Var.c(peer, msg.p) : true;
                b2 = z5 ? yg20Var.b(peer, msg2.p) : true;
                r3 = c2;
            }
            if (bool == null) {
                r3 = bool.booleanValue();
            } else if (z) {
                r3 = false;
            }
            msg.q = r3;
            if (bool2 == null) {
                z3 = bool2.booleanValue();
            } else if (!z2) {
                z3 = b2;
            }
            msg2.r = z3;
        }
        b2 = true;
        if (bool == null) {
        }
        msg.q = r3;
        if (bool2 == null) {
        }
        msg2.r = z3;
    }

    public static final int n(int i2, List list) {
        int i3;
        int i4 = ((ah90) j5g.i0(list)).c;
        if (i2 > ((ah90) j5g.i0(list)).c) {
            vzw.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            ah90 ah90Var = (ah90) list.get(i3);
            char c2 = ah90Var.b > i2 ? (char) 1 : ah90Var.c <= i2 ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder b2 = ji.b(i3, "Found paragraph index ", " should be in range [0, ");
        b2.append(list.size());
        b2.append(").\nDebug info: index=");
        b2.append(i2);
        b2.append(", paragraphs=[");
        b2.append(hgz.b(list, null, new fo20(3), 31));
        b2.append(']');
        vzw.a(b2.toString());
        return i3;
    }

    public static final int o(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ah90 ah90Var = (ah90) list.get(i4);
            char c2 = ah90Var.d > i2 ? (char) 1 : ah90Var.e <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int p(ArrayList arrayList, float f2) {
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (f2 >= ((ah90) j5g.i0(arrayList)).g) {
            return e43.h(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ah90 ah90Var = (ah90) arrayList.get(i3);
            char c2 = ah90Var.f > f2 ? (char) 1 : ah90Var.g <= f2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void q(ArrayList arrayList, long j2, izs izsVar) {
        int size = arrayList.size();
        for (int n = n(qko0.f(j2), arrayList); n < size; n++) {
            ah90 ah90Var = (ah90) arrayList.get(n);
            if (ah90Var.b >= qko0.e(j2)) {
                return;
            }
            if (ah90Var.b != ah90Var.c) {
                izsVar.invoke(ah90Var);
            }
        }
    }

    public static final byte[] r(String str) {
        return Base64.decode(str, 0);
    }

    public static String s() {
        return UUID.randomUUID().toString();
    }

    public static final int t(DialogTheme dialogTheme) {
        DialogThemeImpl dialogThemeImpl = dialogTheme.d.get(dhr0.C());
        if (dialogThemeImpl != null) {
            return dialogThemeImpl.zb(R.attr.vk_legacy_accent).intValue();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final ArrayList u(PostEditableData postEditableData) {
        List<PostingAttachment> list = postEditableData.p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((PostingAttachment) obj) instanceof FileDto.Gif)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int v(int i2) {
        return (i2 >> 1) & 15;
    }

    public static final boolean w(DialogTheme dialogTheme) {
        int[] iArr = dialogTheme.Ab(dhr0.C(), 0L, false).D;
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(iArr.length));
        for (int i2 : iArr) {
            linkedHashSet.add(Integer.valueOf(i2));
        }
        return j5g.O0(linkedHashSet).size() > 1;
    }

    public static void x(Context context) {
        if (h != null) {
            return;
        }
        synchronized (g) {
            try {
                if (h == null) {
                    h = new xxv(context);
                    h.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean y(Uri uri) {
        return uri != null && HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(uri.getScheme()) && X3.i.I0.equals(uri.getAuthority());
    }

    public static final long z(nuw nuwVar, Orientation orientation, muw muwVar, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        long j3 = nuwVar.g;
        if (orientation != null) {
            int i2 = muwVar.a;
            if (i2 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (orientation == Orientation.Horizontal) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                j2 = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j2 = floatToRawIntBits3 << 32;
            }
            j3 = j2 | (floatToRawIntBits & 4294967295L);
        }
        long e2 = ov70.e(A(nuwVar, orientation, muwVar), j3);
        if (z || !nuwVar.i) {
            return e2;
        }
        return 0L;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((io.reactivex.rxjava3.core.q) obj).L(new l7(new f6w(6), 29), false);
    }

    @Override // xsna.hx2
    public void b(Object obj) {
        cvk.w(((JSONObject) obj).toString(), false);
    }

    @Override // xsna.vv60
    public io.reactivex.rxjava3.internal.operators.observable.j1 c(vg60 vg60Var) {
        Object obj;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto;
        tfx tfxVar;
        String str;
        int i2;
        String str2;
        Long l2;
        boolean z;
        ArrayList arrayList;
        tfx tfxVar2;
        NewsfeedGetBreakingNewsTrendFeedIntentDto newsfeedGetBreakingNewsTrendFeedIntentDto2;
        String str3 = vg60Var.d;
        String str4 = vg60Var.a;
        String str5 = vg60Var.b;
        DiscoverCustomIntent discoverCustomIntent = vg60Var.e;
        Integer num = vg60Var.k;
        dk60 dk60Var = new dk60(str3, str4, str5, discoverCustomIntent, num);
        dk60Var.e = vg60Var.h;
        dk60Var.f = vg60Var.i;
        dk60Var.g = vg60Var.j;
        dk60Var.j = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        dk60Var.h = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        dk60Var.i = jSONObject != null ? jSONObject.toString() : null;
        xuo0.a.getClass();
        znm znmVar = new znm(dk60Var, xuo0.a());
        String str6 = dk60Var.e;
        List O0 = str6 != null ? j5g.O0(drm0.c0(str6, new String[]{StringUtils.COMMA}, 0, 6)) : null;
        String str7 = dk60Var.g;
        Iterator<E> it = NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto) obj).j(), com.vk.core.utils.newtork.b.c().b())) {
                break;
            }
        }
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto = (NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto) obj;
        String a = com.vk.core.utils.newtork.b.c().a();
        String str8 = dk60Var.f;
        DiscoverCustomIntent discoverCustomIntent2 = dk60Var.d;
        if (discoverCustomIntent2 != null) {
            int i3 = ek60.$EnumSwitchMapping$0[discoverCustomIntent2.ordinal()];
            if (i3 == 1) {
                newsfeedGetBreakingNewsTrendFeedIntentDto2 = NewsfeedGetBreakingNewsTrendFeedIntentDto.PRELOAD;
            } else if (i3 == 2) {
                newsfeedGetBreakingNewsTrendFeedIntentDto2 = NewsfeedGetBreakingNewsTrendFeedIntentDto.INITIAL;
            } else if (i3 == 3) {
                newsfeedGetBreakingNewsTrendFeedIntentDto2 = NewsfeedGetBreakingNewsTrendFeedIntentDto.PTR;
            } else if (i3 == 4) {
                newsfeedGetBreakingNewsTrendFeedIntentDto2 = NewsfeedGetBreakingNewsTrendFeedIntentDto.NEXT_PAGE;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                newsfeedGetBreakingNewsTrendFeedIntentDto2 = NewsfeedGetBreakingNewsTrendFeedIntentDto.FEED_BLOCK;
            }
            newsfeedGetBreakingNewsTrendFeedIntentDto = newsfeedGetBreakingNewsTrendFeedIntentDto2;
        } else {
            newsfeedGetBreakingNewsTrendFeedIntentDto = null;
        }
        List<BaseUserGroupFieldsDto> list = gw60.a;
        String str9 = dk60Var.h;
        Long l3 = dk60Var.j;
        String str10 = dk60Var.i;
        tfx tfxVar3 = new tfx("newsfeed.getBreakingNewsTrendFeed", new ur(25), new vr(23));
        if (num != null) {
            tfxVar3.f(num.intValue(), 0, 50, "count");
        }
        if (str3 != null) {
            tfx.o(tfxVar3, "start_from", str3, 0, 0, 12);
        }
        if (O0 != null) {
            tfxVar3.i("filters", O0);
        }
        if (str7 != null) {
            str = str8;
            i2 = 3;
            z = true;
            l2 = l3;
            str2 = str9;
            tfx.o(tfxVar3, "device_info", str7, 0, 0, 12);
            tfxVar = tfxVar3;
        } else {
            tfxVar = tfxVar3;
            str = str8;
            i2 = 3;
            str2 = str9;
            l2 = l3;
            z = true;
        }
        if (newsfeedGetBreakingNewsTrendFeedConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetBreakingNewsTrendFeedConnectionTypeDto.j(), 0, 0, 12);
        }
        tfx tfxVar4 = tfxVar;
        tfx.o(tfxVar4, "connection_subtype", a, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar4, "user_options", str, 0, 0, 12);
        }
        if (newsfeedGetBreakingNewsTrendFeedIntentDto != null) {
            tfx.o(tfxVar4, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetBreakingNewsTrendFeedIntentDto.i(), 0, 0, 12);
        }
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar4.i("fields", arrayList);
        }
        if (str2 != null) {
            tfxVar2 = tfxVar4;
            tfx.o(tfxVar2, "track_code", str2, 0, 0, 12);
        } else {
            tfxVar2 = tfxVar4;
        }
        if (l2 != null) {
            tfx.m(tfxVar2, CommonUrlParts.REQUEST_ID, l2.longValue(), 0L, 12);
        }
        if (str10 != null) {
            tfx.o(tfxVar2, "geo_data", str10, 0, 0, 12);
        }
        tfx tfxVar5 = tfxVar2;
        tfxVar5.j("extended", z);
        return rsg0.y0(yfb.z(tfxVar5, znmVar), null, null, i2).U(new i630(new f6w(13), 5));
    }

    @Override // xsna.dsz
    public boolean d(frz frzVar) {
        return ((xrm) frzVar).b.i();
    }

    @Override // xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        cvk.w(vKApiExecutionException.toString(), false);
    }

    @Override // xsna.lfi0
    public s470 f(snt sntVar, List list) {
        return (s470) j5g.r0(new w6i(sntVar.d(), 0), list);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpg.zzc());
    }
}

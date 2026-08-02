package xsna;

import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.ParserException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.external.exceptions.NonSecretMethodCallException;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemCaptionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import java.io.EOFException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.json.JSONObject;

/* compiled from: CallDebugMenuEvent.kt */
/* loaded from: classes7.dex */
public class x19 implements axp, elm0 {
    public static final x19 b = new x19();
    public static final jai c = new jai(194890411, new b76((byte) 0, 1), false);
    public static final jai d = new jai(-433532997, new nfi(0, 1), false);
    public static final jai e = new jai(-2049198726, new hne(3), false);
    public static final jai f = new jai(237628827, new c80(1), false);
    public static final x19 g;

    static {
        new jai(1826725713, new e6g(3), false);
        new jai(926007213, new pfi(1), false);
        new jai(-641020822, new dmi((byte) 0, 1), false);
        new jai(2025275458, new ldi((byte) 0, 1), false);
        new jai(554276929, new nrb(2), false);
        g = new x19();
    }

    public static h4o0 A(mc90 mc90Var, gc90 gc90Var, androidx.compose.runtime.a aVar, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            gc90Var = new gc90(1);
        }
        l7l a = ilk0.a(aVar);
        Object obj = c5u0.a;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, Float.valueOf(1), 1);
        float f2 = (i2 & 16) != 0 ? 0.5f : 0.35f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:386)");
        }
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f2 || f2 > 1.0f) {
            xzw.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2);
        }
        Object obj2 = (azl) aVar.r(uvi.h);
        LayoutDirection layoutDirection = (LayoutDirection) aVar.r(uvi.n);
        boolean J = ((((i & 14) ^ 6) > 4 && aVar.J(mc90Var)) || (i & 6) == 4) | aVar.J(a) | aVar.J(c2);
        if ((((i & 112) ^ 48) <= 32 || !aVar.J(gc90Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean J2 = J | z | aVar.J(obj2) | aVar.o(layoutDirection.ordinal());
        Object x = aVar.x();
        if (J2 || x == a.C0011a.a) {
            hc90 hc90Var = new hc90(mc90Var, new za90(mc90Var, layoutDirection, f2), gc90Var);
            float f3 = r9k0.a;
            x = new m9k0(hc90Var, a, c2);
            aVar.R(x);
        }
        h4o0 h4o0Var = (h4o0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h4o0Var;
    }

    public static final boolean B(UsersUserFullDto usersUserFullDto) {
        Boolean T2 = usersUserFullDto.T2();
        boolean booleanValue = T2 != null ? T2.booleanValue() : false;
        Boolean l = usersUserFullDto.l();
        return !booleanValue || (l != null ? l.booleanValue() : true);
    }

    public static int D(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final mr1 E(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1598055784, 0, -1, "com.vk.core.compose.component.defaults.<get-VkAlertDefaults> (VkAlertDefaults.kt:9)");
        }
        mr1 mr1Var = ((qsu0) aVar.r(rrv0.e)).a() ? q7u0.a : u7u0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mr1Var;
    }

    public static final boolean F(Throwable th) {
        CancellationException cancellationException;
        while (true) {
            cancellationException = null;
            if (th == null) {
                break;
            }
            if (th.getClass().equals(CancellationException.class)) {
                cancellationException = (CancellationException) th;
                break;
            }
            if (th.equals(th.getCause())) {
                break;
            }
            th = th.getCause();
        }
        return cancellationException != null;
    }

    public static final boolean G(PrivacyPostType privacyPostType) {
        return (privacyPostType instanceof PrivacyPostType.AllDonuts) || (privacyPostType instanceof PrivacyPostType.SingleDonutLevel);
    }

    public static final boolean H(ScreenState screenState) {
        return M(screenState) || I(screenState);
    }

    public static final boolean I(ScreenState screenState) {
        return screenState == ScreenState.FULLSCREEN_HORIZONTAL;
    }

    public static final boolean J(ScreenState screenState) {
        return screenState == ScreenState.INLINE || H(screenState);
    }

    public static final boolean K(Throwable th) {
        return (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof SSLException) || (th instanceof EOFException) || (th instanceof NoNetworkConnectionException) || (th instanceof ProtocolException);
    }

    public static final boolean L(Throwable th) {
        NonSecretMethodCallException nonSecretMethodCallException;
        while (true) {
            nonSecretMethodCallException = null;
            if (th == null) {
                break;
            }
            if (th.getClass().equals(NonSecretMethodCallException.class)) {
                nonSecretMethodCallException = (NonSecretMethodCallException) th;
                break;
            }
            if (th.equals(th.getCause())) {
                break;
            }
            th = th.getCause();
        }
        return nonSecretMethodCallException != null;
    }

    public static final boolean M(ScreenState screenState) {
        return screenState == ScreenState.FULLSCREEN_VERTICAL;
    }

    public static final void N(ohp0 ohp0Var, IllegalStateException illegalStateException) {
        if (BuildInfo.h()) {
            throw illegalStateException;
        }
        ohp0Var.a(illegalStateException);
    }

    public static final void O(xgx0 xgx0Var, String str) {
        String concat = "MA_ADS: ".concat(str);
        xgx0Var.getClass();
        xgx0.b(concat);
    }

    public static Caption P(NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Map map) {
        ArrayList arrayList;
        Owner owner;
        new ne6();
        UserId j = newsfeedNewsfeedItemCaptionDto.j();
        if (j == null) {
            j = UserId.d;
        }
        UserId userId = j;
        String type = newsfeedNewsfeedItemCaptionDto.getType();
        String str = type == null ? "" : type;
        String l = newsfeedNewsfeedItemCaptionDto.l();
        String str2 = l == null ? "" : l;
        String d2 = newsfeedNewsfeedItemCaptionDto.d();
        String str3 = d2 == null ? "" : d2;
        String e2 = newsfeedNewsfeedItemCaptionDto.e();
        String str4 = e2 == null ? "" : e2;
        List<List<BaseImageDto>> i = newsfeedNewsfeedItemCaptionDto.i();
        String str5 = null;
        if (i != null) {
            ArrayList arrayList2 = new ArrayList(i.size());
            Iterator<T> it = i.iterator();
            while (it.hasNext()) {
                arrayList2.add(ne6.a((List) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String k = newsfeedNewsfeedItemCaptionDto.k();
        if (map != null && (owner = (Owner) map.get(userId)) != null) {
            str5 = owner.c;
        }
        return new Caption(str, str2, false, str3, str4, arrayList, userId, k, str5, newsfeedNewsfeedItemCaptionDto.g(), newsfeedNewsfeedItemCaptionDto.f(), newsfeedNewsfeedItemCaptionDto.r(), 4, null);
    }

    public static final int Q(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        }
        if (length != 4) {
            if (length == 7) {
                return Color.parseColor(str);
            }
            if (length != 9) {
                return 0;
            }
            return Color.parseColor(str);
        }
        return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
    }

    public static q630 R(q630 q630Var, izs izsVar) {
        return qri.a(q630Var, a5x.a, new hmb0(izsVar));
    }

    public static io.reactivex.rxjava3.internal.operators.single.b S(sgt0 sgt0Var) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new qca0(sgt0Var, 3));
    }

    public static final up2 t() {
        return new up2();
    }

    public static final LinkedHashMap u(XmlResourceParser xmlResourceParser) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(xmlResourceParser.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static void v(AtomicReference atomicReference, yvj yvjVar, kotlin.coroutines.d dVar, wzs wzsVar, int i) {
        if ((i & 2) != 0) {
            dVar = EmptyCoroutineContext.b;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        while (true) {
            eyx eyxVar = (eyx) atomicReference.get();
            if (eyxVar != null) {
                eyxVar.b(null);
            }
            yok0 g2 = myc0.g(yvjVar, dVar, coroutineStart, new t04(wzsVar, null));
            while (!atomicReference.compareAndSet(eyxVar, g2)) {
                if (atomicReference.get() != eyxVar) {
                    break;
                }
            }
            return;
        }
    }

    public static void w(@Nullable String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static long x(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date y(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static final void z(izs izsVar) {
        p490 a = r99.a.a();
        izsVar.invoke(a.v());
        a.w();
    }

    public JSONObject C() {
        return new JSONObject().put("sync_strategy", "one_day");
    }

    @Override // xsna.elm0
    public boolean a() {
        return false;
    }

    @Override // xsna.elm0
    public boolean f() {
        return true;
    }

    @Override // xsna.elm0
    public boolean g() {
        return true;
    }

    @Override // xsna.elm0
    public int getCurrentIdlePagerPosition() {
        return 0;
    }

    @Override // xsna.elm0
    public String getRef() {
        return "unknown";
    }

    @Override // xsna.elm0
    public Parcelable getTransferableState() {
        return null;
    }

    @Override // xsna.elm0
    public StoriesContainer n(boolean z) {
        return null;
    }

    @Override // xsna.elm0
    public String r(int i) {
        return "";
    }

    @Override // xsna.elm0
    public void b() {
    }

    @Override // xsna.elm0
    public void finish() {
    }

    @Override // xsna.elm0
    public void h() {
    }

    @Override // xsna.elm0
    public void j() {
    }

    @Override // xsna.elm0
    public void l() {
    }

    @Override // xsna.elm0
    public void m() {
    }

    @Override // xsna.elm0
    public void o() {
    }

    @Override // xsna.elm0
    public void R2(Object obj) {
    }

    @Override // xsna.elm0
    public void d(boolean z) {
    }

    @Override // xsna.elm0
    public void e(SourceTransitionStory sourceTransitionStory) {
    }

    @Override // xsna.elm0
    public void i(ArrayList arrayList) {
    }

    @Override // xsna.elm0
    public void k(Intent intent) {
    }

    @Override // xsna.elm0
    public void p(boolean z) {
    }

    @Override // xsna.elm0
    public void q(StoriesContainer storiesContainer) {
    }

    @Override // xsna.elm0
    public void s(int i, String str) {
    }
}

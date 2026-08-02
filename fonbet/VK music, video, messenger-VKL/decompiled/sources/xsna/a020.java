package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.reactions.ReactionMeta;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;

/* compiled from: MediaStoreLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class a020 implements wq5, x2f0, gn60 {
    public static final a020 b = new a020();

    public static final q630 k(q630 q630Var, wzs wzsVar) {
        return q630Var.g(new xn0(wzsVar));
    }

    public static szy0 l(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor = u5o0.c.a;
        g5o0 g5o0Var = new g5o0();
        try {
            threadPoolExecutor.execute(new i1z0(g5o0Var, callable));
        } catch (Exception e) {
            g5o0Var.a(e);
        }
        return g5o0Var.a;
    }

    public static final float m(mc90 mc90Var) {
        return mc90Var.n().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (mc90Var.s() >> 32)) : Float.intBitsToFloat((int) (mc90Var.s() & 4294967295L));
    }

    @NonNull
    public static sse0 n(@NonNull tg9 tg9Var) {
        ArrayList arrayList = new ArrayList();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num = (Integer) tg9Var.a(key);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new a51(tg9Var));
        }
        HashSet hashSet = w0y.a;
        Integer num2 = (Integer) tg9Var.a(key);
        num2.getClass();
        if (w0y.a.contains(Build.DEVICE.toLowerCase(Locale.US)) && w0y.b.contains(num2)) {
            arrayList.add(new w0y());
        }
        return new sse0(arrayList);
    }

    public static final String o(int i) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        long j = i * 1000;
        Calendar d = pvo0.d();
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        d.setTimeInMillis(j);
        return resources.getString(R.string.date_format_day_month, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.vk_months_full)[Math.min(d.get(2), 11)]);
    }

    public static final String p(AudioAudioRawIdTrackedDto audioAudioRawIdTrackedDto) {
        return j5g.g0(j5g.H0(drm0.b0(audioAudioRawIdTrackedDto.d(), new char[]{'_'}, 0, 6), 2), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62);
    }

    public static Object q(wm60 wm60Var) {
        if (wm60Var instanceof aag) {
            aag aagVar = (aag) wm60Var;
            Object q = q(aagVar.b);
            return q == null ? q(aagVar.a) : q;
        }
        if (wm60Var instanceof k37) {
            return ((k37) wm60Var).a;
        }
        if (wm60Var instanceof u2n) {
            return ((u2n) wm60Var).a;
        }
        return null;
    }

    public static final String r(int i) {
        String concat;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        long j = i * 1000;
        Calendar d = pvo0.d();
        int i2 = d.get(1);
        d.set(12, 0);
        d.set(11, 0);
        d.set(13, 0);
        d.set(14, 0);
        long timeInMillis = d.getTimeInMillis();
        long j2 = timeInMillis + TimeUtils.MILLISECONDS_PER_DAY;
        long j3 = timeInMillis - TimeUtils.MILLISECONDS_PER_DAY;
        d.setTimeInMillis(j);
        if (timeInMillis <= j && j < j2) {
            concat = String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources.getString(R.string.today), resources.getString(d.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))}, 4));
        } else if (j3 <= j && j < timeInMillis) {
            concat = String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources.getString(R.string.yesterday), resources.getString(d.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))}, 4));
        } else if (d.get(1) != i2) {
            concat = resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d.get(2), 11)], Integer.valueOf(d.get(1)));
        } else {
            concat = resources.getString(R.string.date_format_day_month, Integer.valueOf(d.get(5)), resources.getStringArray(R.array.vk_months_full)[Math.min(d.get(2), 11)]).concat(String.format(Locale.ENGLISH, " %s %d:%02d", Arrays.copyOf(new Object[]{resources.getString(d.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))}, 3)));
        }
        d.clear();
        return concat;
    }

    public static final ResolvedTextDirection s(ljo0 ljo0Var, int i) {
        kjo0 kjo0Var = ljo0Var.a;
        m540 m540Var = ljo0Var.b;
        if (kjo0Var.a.length() != 0) {
            int d = m540Var.d(i);
            if ((i != 0 && d == m540Var.d(i - 1)) || (i != ljo0Var.a.a.c.length() && d == m540Var.d(i + 1))) {
                return ljo0Var.a(i);
            }
        }
        return ljo0Var.j(i);
    }

    public static boolean t(MethodSelectorCodeState methodSelectorCodeState) {
        if ((methodSelectorCodeState instanceof MethodSelectorCodeState.Loading) || (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) {
            return true;
        }
        if ((methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) || (methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) || (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) || (methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) || (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) || (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush)) {
            int d = methodSelectorCodeState.d();
            return 4 <= d && d < 7;
        }
        if ((methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) || (methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean u(mc90 mc90Var, float f) {
        boolean i = mc90Var.n().i();
        boolean z = (mc90Var.t() ? -f : m(mc90Var)) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return (z && i) || !(z || i);
    }

    public static final boolean v(xvy xvyVar) {
        fvy j = xvyVar.j();
        xuy xuyVar = (xuy) j5g.k0(j.f());
        return (xuyVar != null ? xuyVar.getIndex() : -9) >= j.d() + (-6);
    }

    public static ArrayList w(int i, List list, wm60 wm60Var) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u1c0 u1c0Var = (u1c0) it.next();
            int i2 = u1c0Var.c;
            int intValue = ((Number) hashMap.getOrDefault(Integer.valueOf(i2), -1)).intValue() + 1;
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(intValue));
            arrayList.add(new z1c0(u1c0Var, i, intValue, q(wm60Var)));
        }
        return arrayList;
    }

    @Override // xsna.x2f0
    public a2f0 h(u5f0 u5f0Var, ReactionMeta reactionMeta, boolean z) {
        return new a2f0(false, false);
    }

    @Override // xsna.wq5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(String str, final yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-1264007307);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = this;
            i2 |= M.J(obj) ? 256 : 128;
        } else {
            obj = this;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1264007307, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsAcceptableUserStackCell.<anonymous>.<anonymous>.<no name provided>.Content (PrivacySettingsAcceptableUserStackCell.kt:77)");
            }
            fwu0.c(null, null, str, null, null, null, null, kai.c(-173700922, new a0t() { // from class: xsna.ued0
                @Override // xsna.a0t
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    lg90 lg90Var = (lg90) obj4;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-173700922, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsAcceptableUserStackCell.<anonymous>.<anonymous>.<no name provided>.Content.<anonymous> (PrivacySettingsAcceptableUserStackCell.kt:78)");
                        }
                        if (as.a(((intValue >> 6) & 14) | 8, yzs.this, lg90Var, aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 6) & 896) | 100663296, 251);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx9(i, 5, obj, str, yzsVar);
        }
    }

    @Override // xsna.x2f0
    public void a() {
    }

    @Override // xsna.x2f0
    public void b() {
    }

    @Override // xsna.x2f0
    public void c() {
    }

    @Override // xsna.x2f0
    public void f(m3r m3rVar) {
    }

    @Override // xsna.x2f0
    public void d(Context context, Badgeable badgeable) {
    }

    @Override // xsna.x2f0
    public void g(Context context, Badgeable badgeable) {
    }

    @Override // xsna.x2f0
    public void i(Context context, u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var, p2f0 p2f0Var) {
    }
}

package xsna;

import android.graphics.PointF;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.dto.Push;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.EOFException;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: QrButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class ine0 implements hjx0, uch0, jp70, l420, rpr {
    public static final String[] b = new String[0];
    public static final ine0 c = new ine0();
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final ine0 e = new ine0();

    public static final String c(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        return sb.toString();
    }

    public static int d(float f, float f2) {
        if (Math.abs(f - f2) < 5.0E-4d) {
            return 0;
        }
        return f < f2 ? -1 : 1;
    }

    public static mz50 e(LinkedHashSet linkedHashSet) {
        return new mz50(linkedHashSet);
    }

    public static final int f(int i, androidx.compose.foundation.lazy.layout.b bVar, Object obj) {
        int b2;
        return (obj == null || bVar.getItemCount() == 0 || (i < bVar.getItemCount() && obj.equals(bVar.h(i))) || (b2 = bVar.b(obj)) == -1) ? i : b2;
    }

    public static boolean g(Push push) {
        String str;
        return (push.c || !j5g.P(ule0.a, push.c()) || (str = push.a.get(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT)) == null || drm0.N(str)) ? false : true;
    }

    public static boolean j(PointF[] pointFArr, float f, float f2) {
        int length = pointFArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                break;
            }
            PointF pointF = pointFArr[i];
            PointF pointF2 = i == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i + 1];
            float f3 = pointF.y;
            boolean z2 = f3 >= f2;
            float f4 = pointF2.y;
            if (z2 != (f4 >= f2)) {
                float f5 = pointF2.x;
                float f6 = pointF.x;
                if (f <= (((f2 - f3) * (f5 - f6)) / (f4 - f3)) + f6) {
                    z = !z;
                }
            }
            i++;
        }
        if (!z) {
            int length2 = pointFArr.length;
            int i2 = 0;
            while (i2 < length2) {
                PointF pointF3 = pointFArr[i2];
                PointF pointF4 = i2 == pointFArr.length - 1 ? pointFArr[0] : pointFArr[i2 + 1];
                float f7 = pointF3.y;
                float f8 = pointF4.x;
                float f9 = pointF3.x;
                if (d(Math.abs(((f8 - f9) * (f2 - f7)) - ((pointF4.y - f7) * (f - f9))), 5.0E-4f) <= 0) {
                    float f10 = pointF3.x;
                    float f11 = (pointF4.x - f10) * (f - f10);
                    float f12 = pointF3.y;
                    float b2 = u11.b(pointF4.y, f12, f2 - f12, f11);
                    if (d(b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) < 0) {
                        continue;
                    } else {
                        float f13 = pointF4.x - pointF3.x;
                        float f14 = pointF4.y - pointF3.y;
                        if (d(b2, (f14 * f14) + (f13 * f13)) <= 0) {
                            return true;
                        }
                    }
                }
                i2++;
            }
        }
        return z;
    }

    public static boolean k(PointF[] pointFArr, PointF[] pointFArr2) {
        int i;
        for (PointF pointF : pointFArr2) {
            if (pointFArr.length >= 3) {
                PointF pointF2 = pointFArr[0];
                float f = pointF2.x;
                PointF pointF3 = pointFArr[2];
                i = (!(f == pointF3.x && pointF2.y == pointF3.y) && j(pointFArr, pointF.x, pointF.y)) ? i + 1 : 0;
            }
            return false;
        }
        return true;
    }

    public static final boolean l(vl8 vl8Var) {
        vl8 vl8Var2;
        int i;
        try {
            vl8Var2 = new vl8();
            long j = vl8Var.c;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            vl8Var.p(vl8Var2, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (vl8Var2.W1()) {
                return true;
            }
            int y = vl8Var2.y();
            if (Character.isISOControl(y) && !Character.isWhitespace(y)) {
                return false;
            }
        }
        return true;
    }

    public static void m(Push push, ahe0 ahe0Var) {
        if (g(push)) {
            p(push, ahe0Var);
        }
    }

    public static final String n(Image image, String str) {
        ImageSize Cb;
        int a = glw.a().a();
        if (myc0.f(str)) {
            return js5.a(a, str);
        }
        if (image == null || (Cb = image.Cb(a, true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }

    public static void p(Push push, ahe0 ahe0Var) {
        l5m l5mVar = new l5m(null, null, 3);
        String h = DevNullEventKey.PUSH_CANCEL_REASON.h();
        String c2 = push.c();
        String str = push.a.get(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
        String str2 = ahe0Var != null ? ahe0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, c2, null, str, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
        l5mVar.q();
    }

    public static final CharSequence q(CharSequence charSequence) {
        if (!drm0.D(charSequence, "[id", false) && !drm0.D(charSequence, "[club", false)) {
            return charSequence;
        }
        return pj90.b.matcher(pj90.a.matcher(charSequence).replaceAll("$2")).replaceAll("$2");
    }

    public static final pnf0 r(jkv jkvVar, int i) {
        return new pnf0(Integer.valueOf(i), Integer.valueOf(jkvVar.a), Integer.valueOf(jkvVar.b), Integer.valueOf(jkvVar.c), Integer.valueOf(jkvVar.d), Boolean.valueOf(jkvVar.e), String.valueOf(jkvVar.f), jkvVar.j, jkvVar.i, Integer.valueOf(jkvVar.k), jkvVar.l, Boolean.valueOf(jkvVar.n), jkvVar.o, jkvVar.p, jkvVar.q, jkvVar.s, jkvVar.t, jkvVar.u, jkvVar.v, jkvVar.w, Boolean.valueOf(jkvVar.x), jkvVar.y);
    }

    public static final Mask s(SdkMask sdkMask) {
        Parcelable parcelable = sdkMask.d;
        Mask mask = parcelable instanceof Mask ? (Mask) parcelable : null;
        if (mask != null) {
            return mask;
        }
        throw new IllegalStateException("SdkMask.extendedModel isn't Mask model");
    }

    public static final boolean t(String str, gzs gzsVar) {
        try {
            boolean booleanValue = ((Boolean) gzsVar.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    @Override // xsna.rpr
    public ppr b(boolean z, gzs gzsVar) {
        return !z ? new mv9(gzsVar) : new lgu(gzsVar);
    }

    @Override // xsna.hjx0
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // xsna.hjx0
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // xsna.hjx0
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // xsna.jp70
    public Object h() {
        return new ConcurrentHashMap();
    }

    @Override // xsna.hjx0
    @NonNull
    public String[] i() {
        return b;
    }

    @Override // xsna.l420
    public void Y0() {
    }

    @Override // xsna.l420
    public void N3(UserId userId) {
    }

    @Override // xsna.l420
    public void x0(String str) {
    }
}

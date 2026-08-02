package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.offline.f;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.plus.home.common.utils.InvalidViewBindingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.cert.CertPathValidatorException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;
import org.bouncycastle.cert.CertIOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import yads.aa2;

/* loaded from: classes7.dex */
public final /* synthetic */ class dy31 implements fy31, gy31, RequestPointStyleProvider, ev31, w001, bx60, pn71, re71 {
    public final /* synthetic */ int a;

    public /* synthetic */ dy31(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d(int i, Object obj, Object obj2) {
        throw new SSLProtocolException("Invalid " + obj + obj2 + i + ((Object) Extension.C_BRAKE));
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new RuntimeException(str + i);
    }

    public static void f(kgx kgxVar, ClassCastException classCastException) {
        throw new InvalidViewBindingException("Invalid view binding (see cause) for " + kgxVar, classCastException);
    }

    public static /* synthetic */ void g(Exception exc, String str) {
        throw new aa2(str, exc, true, 1);
    }

    public static /* synthetic */ void h(Object obj) {
        throw new AssertionError("code must working only in " + obj + ((Object) " thread"));
    }

    public static /* synthetic */ void j(Object obj, Object obj2) {
        throw new SSLProtocolException("Invalid " + obj + obj2);
    }

    public static /* synthetic */ void k(Object obj, Object obj2, BigInteger bigInteger) {
        throw new UnsupportedOperationException("TooLarge " + obj + obj2 + ((Object) bigInteger.toString()));
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new SSLProtocolException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Exception exc) {
        throw new CertIOException(str + obj, exc);
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new StructException(th);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new CertPathValidatorException(str);
    }

    public static /* synthetic */ void s(Throwable th) {
        throw new InvalidKeyException(th);
    }

    public static /* synthetic */ void t(String str) {
        throw new KeyStoreException(str);
    }

    public static /* synthetic */ void u(String str) {
        throw new SSLHandshakeException(str);
    }

    public static /* synthetic */ void v(String str) {
        throw new InvalidKeyException(str);
    }

    @Override // defpackage.pn71
    public kq71 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        a291 a291Var = new a291();
        a291Var.a = bundle.getCharSequence(Integer.toString(0, 36));
        a291Var.b = bundle.getCharSequence(Integer.toString(1, 36));
        a291Var.c = bundle.getCharSequence(Integer.toString(2, 36));
        a291Var.d = bundle.getCharSequence(Integer.toString(3, 36));
        a291Var.e = bundle.getCharSequence(Integer.toString(4, 36));
        a291Var.f = bundle.getCharSequence(Integer.toString(5, 36));
        a291Var.g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        a291Var.j = byteArray != null ? (byte[]) byteArray.clone() : null;
        a291Var.k = valueOf;
        a291Var.l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        a291Var.w = bundle.getCharSequence(Integer.toString(22, 36));
        a291Var.x = bundle.getCharSequence(Integer.toString(23, 36));
        a291Var.y = bundle.getCharSequence(Integer.toString(24, 36));
        a291Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        a291Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        a291Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        a291Var.E = bundle.getBundle(Integer.toString(1000, 36));
        boolean containsKey = bundle.containsKey(Integer.toString(8, 36));
        su71 su71Var = ui81.a;
        if (containsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            a291Var.h = (ui81) su71Var.a(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            a291Var.i = (ui81) su71Var.a(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            a291Var.m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            a291Var.n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            a291Var.o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            a291Var.p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            a291Var.q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            a291Var.r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            a291Var.s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            a291Var.t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            a291Var.u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            a291Var.v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            a291Var.z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            a291Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new oi61(a291Var);
    }

    @Override // defpackage.gy31
    public vw01 b(kk2 kk2Var) {
        return new vw01(kk2Var, hv60.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.re71
    public Object c(wl71 wl71Var) {
        return new ep71((ut71) wl71Var);
    }

    @Override // defpackage.fy31
    public void i(int i, int i2) {
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, Math.max(p7b1.e(n751Var).d, p7b1.f(n751Var).d));
        view.setLayoutParams(marginLayoutParams);
        return n751Var;
    }

    @Override // defpackage.w001
    public void onTrackSelectionsInvalidated() {
        int i = f.o;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider
    public void provideIconsStyle(int i, int i2, RequestPointType requestPointType, String str, float f, boolean z, boolean z2, PlacemarkStyle placemarkStyle) {
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        hu41 hu41Var = (hu41) obj;
        mm91 mm91Var = hu41Var.b;
        if (mm91Var instanceof eu41) {
            return new ov41(false, false, r501.a(((eu41) mm91Var).b, null, null, null, null, hu41Var.g, null, null, null, null, null, null, null, 65470), "");
        }
        if (mm91Var instanceof fu41) {
            return new ov41(true, false, null, "");
        }
        if (mm91Var.equals(gu41.b)) {
            String str = hu41Var.d;
            return new ov41(false, true, null, str != null ? str : "");
        }
        w511.b();
        return null;
    }
}

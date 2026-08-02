package defpackage;

import android.net.Uri;
import androidx.compose.runtime.f;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.AttributeNameEnumeration;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class n {
    public static void A(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, String str, String str2, Themes themes, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(themes);
        sb.append(str3);
    }

    public static void C(StringBuilder sb, FormattedText formattedText, String str, FormattedText formattedText2, String str2) {
        sb.append(formattedText);
        sb.append(str);
        sb.append(formattedText2);
        sb.append(str2);
    }

    public static void D(Result.Failure failure, gv40 gv40Var) {
        gv40Var.invoke(new Result(failure));
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int b(wp2 wp2Var, int i, int i2) {
        return (wp2Var.hashCode() + i) * i2;
    }

    public static int c(Text text, int i, int i2) {
        return (text.hashCode() + i) * i2;
    }

    public static x2y d(bts btsVar, f530 f530Var, wls wlsVar, float f, boolean z) {
        qje.W(btsVar, wlsVar, f530Var);
        return new x2y(f, z);
    }

    public static f530 e(c530 c530Var, float f, bts btsVar, c530 c530Var2, float f2) {
        oeb1.c(btsVar, ljs0.e(c530Var, f));
        return ljs0.c(c530Var2, f2);
    }

    public static oz40 f(boolean z, bts btsVar) {
        oz40 j = f.j(Boolean.valueOf(z));
        btsVar.o0(j);
        return j;
    }

    public static Uri g(String str, String str2, String str3, String str4, String str5) {
        Uri.Builder path = new Uri.Builder().scheme(str).authority(str2).path(str3);
        path.appendQueryParameter(str4, str5);
        return path.build();
    }

    public static Asn1Tag h(Asn1BerDecodeBuffer asn1BerDecodeBuffer, int i) {
        Asn1Tag asn1Tag = new Asn1Tag();
        asn1BerDecodeBuffer.mark(i);
        return asn1Tag;
    }

    public static String i(String str, n0t0 n0t0Var, String str2) {
        return str + n0t0Var + str2;
    }

    public static String j(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public static String k(String str, String str2, String str3, String str4, ArrayList arrayList) {
        return str + str2 + str3 + arrayList + str4;
    }

    public static String l(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String n(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, ColorModel colorModel, String str) {
        sb.append(colorModel);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(String str, Text text, String str2, Text text2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(text);
        sb.append(str2);
        sb.append(text2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, Integer num, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(num);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str, FormattedText formattedText, String str2, FormattedText formattedText2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(formattedText);
        sb.append(str2);
        sb.append(formattedText2);
        sb.append(str3);
        return sb;
    }

    public static Enumeration s(String str) {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(str);
        return attributeNameEnumeration.elements();
    }

    public static HashMap t(e51 e51Var) {
        e51Var.getClass();
        return new HashMap();
    }

    public static HashMap u(i650 i650Var) {
        i650Var.getClass();
        return new HashMap();
    }

    public static List v(tfx tfxVar) {
        return Collections.singletonList(new s5o(tfxVar));
    }

    public static JSONObject w(yf90 yf90Var, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, str, str2);
        return jSONObject;
    }

    public static void x(float f, g131 g131Var, String str) {
        g131Var.b(str, new y7m(f));
    }

    public static void y(bts btsVar, boolean z, c530 c530Var, float f, bts btsVar2) {
        btsVar.t(z);
        oeb1.c(btsVar2, ljs0.e(c530Var, f));
    }

    public static void z(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
    }
}

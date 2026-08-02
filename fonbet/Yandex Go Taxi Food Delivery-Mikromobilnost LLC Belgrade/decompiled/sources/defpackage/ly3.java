package defpackage;

import android.net.Uri;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ly3 {
    public static void A(bts btsVar, boolean z, boolean z2, boolean z3, boolean z4) {
        btsVar.t(z);
        btsVar.t(z2);
        btsVar.t(z3);
        btsVar.t(z4);
    }

    public static void B(c530 c530Var, float f, bts btsVar, boolean z) {
        oeb1.c(btsVar, ljs0.e(c530Var, f));
        btsVar.t(z);
    }

    public static void C(StringBuilder sb, Text text, String str, Text text2, String str2) {
        sb.append(text);
        sb.append(str);
        sb.append(text2);
        sb.append(str2);
    }

    public static /* synthetic */ void D(List list) {
        if (list == null) {
            return;
        }
        ny61.u();
    }

    public static int a(int i, int i2, tls tlsVar) {
        return (tlsVar.hashCode() + i) * i2;
    }

    public static int b(int i, int i2, ArrayList arrayList) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static int c(rbv rbvVar, int i, int i2) {
        return (rbvVar.hashCode() + i) * i2;
    }

    public static int d(MoneyEntity moneyEntity, int i, int i2) {
        return (moneyEntity.hashCode() + i) * i2;
    }

    public static int e(AttributedTextDto attributedTextDto, int i, int i2) {
        return (attributedTextDto.hashCode() + i) * i2;
    }

    public static t2 f(String str) {
        return new t2(str).t();
    }

    public static wp2 g(long j, yp2 yp2Var, String str) {
        return yp2Var.a(str, new up2(j));
    }

    public static y7m h(float f, bts btsVar) {
        y7m y7mVar = new y7m(f);
        btsVar.o0(y7mVar);
        return y7mVar;
    }

    public static ay40 i(bts btsVar) {
        ay40 ay40Var = new ay40();
        btsVar.o0(ay40Var);
        return ay40Var;
    }

    public static Uri.Builder j(String str, String str2, String str3, String str4, String str5) {
        Uri.Builder path = new Uri.Builder().scheme(str).authority(str2).path(str3);
        path.appendQueryParameter(str4, str5);
        return path;
    }

    public static String k(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(CharSequence charSequence, CharSequence charSequence2, String str, String str2, String str3) {
        return str + ((Object) charSequence) + str2 + ((Object) charSequence2) + str3;
    }

    public static String m(String str, cy9 cy9Var, String str2) {
        return str + cy9Var + str2;
    }

    public static String n(String str, kao kaoVar, String str2) {
        return str + kaoVar + str2;
    }

    public static String o(String str, String str2, String str3, boolean z, boolean z2) {
        return str + z + str2 + z2 + str3;
    }

    public static String p(String str, String str2, FormattedText formattedText) {
        return str + formattedText + str2;
    }

    public static String q(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
        return sb.toString();
    }

    public static String r(StringBuilder sb, sls slsVar, String str) {
        sb.append(slsVar);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder t(CharSequence charSequence, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append((Object) charSequence);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder u(String str, Text.Constant constant, String str2, Text.Constant constant2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(constant);
        sb.append(str2);
        sb.append(constant2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static List w(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void x(int i, zls zlsVar, cj6 cj6Var, bts btsVar, boolean z) {
        zlsVar.invoke(cj6Var, btsVar, Integer.valueOf(i));
        btsVar.t(z);
    }

    public static void y(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(j);
    }

    public static void z(u2 u2Var, String str, String str2, String str3, String str4) {
        u2Var.u(str);
        u2Var.u(str2);
        u2Var.u(str3);
        u2Var.u(str4);
    }
}

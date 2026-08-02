package defpackage;

import android.os.Build;
import com.yandex.go.drive.delegates.b;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public final class bfm {
    public static final bfm i = new bfm();
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference(Boolean.FALSE);
    public final ArrayList g = new ArrayList();
    public b h;

    public static String a(String str) {
        if (str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public final HashMap b() {
        String p;
        String str;
        String str2;
        String l;
        b bVar = this.h;
        String str3 = null;
        ucm b = bVar != null ? bVar.b() : null;
        d42 d42Var = (d42) this.b.get();
        HashMap hashMap = new HashMap();
        if (b != null) {
            hashMap.put("Authorization", "OAuth ".concat(b.c));
        }
        if (b != null) {
            hashMap.put("X-YaTaxi-UserId", b.a);
        }
        String str4 = (String) this.c.get();
        if (str4 != null) {
            hashMap.put("X-Ya-Phone-Verified", str4);
        }
        if (b != null && (l = Long.valueOf(b.b).toString()) != null) {
            str3 = l;
        } else if (d42Var != null) {
            str3 = d42Var.b;
        }
        if (str3 != null) {
            hashMap.put("X-Ya-UserSplit-Id", e991.c(new ByteArrayInputStream(str3.getBytes(uza.a))));
        }
        if (d42Var != null && (str2 = d42Var.a) != null) {
            hashMap.put("UUID", str2);
        }
        if (d42Var != null && (str = d42Var.b) != null) {
            hashMap.put("DeviceID", str);
        }
        hashMap.put("Timezone-Offset", String.valueOf(TimeZone.getDefault().getRawOffset() * 1000));
        s6z s6zVar = (s6z) this.e.get();
        if (s6zVar != null) {
            hashMap.put("Lat", cvu0.v(String.valueOf(s6zVar.b), ",", Extension.DOT_CHAR, false));
            hashMap.put("Lon", cvu0.v(String.valueOf(s6zVar.a), ",", Extension.DOT_CHAR, false));
        }
        AtomicReference atomicReference = this.d;
        String str5 = (String) atomicReference.get();
        if (str5 == null || evu0.J(str5)) {
            String str6 = Build.MANUFACTURER;
            String str7 = Build.MODEL;
            Locale locale = Locale.getDefault();
            p = unr0.p("com.yandex.mobile.drive.sdk/378.0.7 (", cvu0.x(str7.toLowerCase(locale), str6.toLowerCase(locale), false) ? a(str7) : g8e.p(a(str6), " ", str7), "; Android ", Build.VERSION.RELEASE, Extension.C_BRAKE);
        } else {
            p = (String) atomicReference.get();
            if (p == null) {
                p = "";
            }
        }
        hashMap.put(ExtFunctionsKt.HEADER_USER_AGENT, cvu0.v(p, Extension.C_BRAKE, "; Drive378.0.7)", false));
        hashMap.put("connection", "keep-alive");
        hashMap.put("Drive-Android-Go-Version", "378.0.7");
        String v = cvu0.v("378.0.7", Extension.DOT_CHAR, "", false);
        hashMap.put("TC_AppBuild", v);
        hashMap.put("ASDK_AppBuild", v);
        return hashMap;
    }
}

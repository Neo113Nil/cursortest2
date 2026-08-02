package defpackage;

import android.os.Build;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class of91 {
    public static final byte[] a = {126, -80, Alerts.alert_unsupported_certificate, 109, Byte.MAX_VALUE, 26, -115, -2};
    public static final byte[] b = {DerValue.tag_UniversalString, -47, 69, 6, 95, 118, -20, -100, DerValue.tag_GeneralString, -36};
    public static final byte[] c = {DerValue.tag_UniversalString, -47, 69, 6, BlobHeaderStructure.BLOB_VERSION, 115, -23};
    public static final byte[] d = {DerValue.tag_UniversalString, -47, 69, 6, BlobHeaderStructure.BLOB_VERSION, 105, -8, -103, 25, -43, 88, 25, BlobHeaderStructure.BLOB_VERSION, 115, -23};

    public static final boolean a(String str, String str2) {
        return jl40.l(str, str2);
    }

    public static int b(String str) {
        return str.hashCode();
    }

    public static final String c(int i, g0v g0vVar) {
        if (g0vVar instanceof wzu) {
            return g8e.o("offer_icon_", ((wzu) g0vVar).a);
        }
        if (g0vVar instanceof a0v) {
            return g8e.o("offer_transport_", ((a0v) g0vVar).a);
        }
        if (g0vVar instanceof yzu) {
            return g8e.o("offer_text_", ((yzu) g0vVar).a);
        }
        if (g0vVar instanceof rzu) {
            return "addresses";
        }
        if (g0vVar instanceof e0v) {
            return "verticals";
        }
        if (g0vVar instanceof tzu) {
            return oyr.i(((tzu) g0vVar).a.hashCode(), "header_");
        }
        if (g0vVar instanceof c0v) {
            return oyr.i(i, "shimmer_");
        }
        if (g0vVar instanceof vzu) {
            return oyr.i(i, "offer_table_");
        }
        w511.b();
        return null;
    }

    public static final boolean d() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MANUFACTURER;
            if ("Spreadtrum".equalsIgnoreCase(str)) {
                return true;
            }
        }
        String str2 = Build.HARDWARE;
        Locale locale = Locale.ROOT;
        if (cvu0.x(str2.toLowerCase(locale), "ums", false)) {
            return true;
        }
        return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && cvu0.x(str2.toLowerCase(locale), "sp", false);
    }

    public static String e(String str) {
        return oyr.p("Disabled(message=", str, Extension.C_BRAKE);
    }
}

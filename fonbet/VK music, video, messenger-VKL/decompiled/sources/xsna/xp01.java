package xsna;

import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class xp01 {

    @Nullable
    public final String a;

    @Nullable
    public final Collection b;

    public /* synthetic */ xp01(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = this.a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(upperCase);
        }
        boolean z = false;
        Collection<String> collection = this.b;
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            boolean z2 = str != null;
            if (str == null) {
                sb.append(DomExceptionUtils.SEPARATOR);
            }
            sb.append(DomExceptionUtils.SEPARATOR);
            boolean z3 = true;
            for (String str2 : collection) {
                o0a.b(str2);
                if (!z3) {
                    sb.append(StringUtils.COMMA);
                }
                if (!o0a.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z3 = false;
            }
            z = z2;
        } else if (str != null) {
            z = true;
        }
        if (true != z && collection == null) {
            sb.append(DomExceptionUtils.SEPARATOR);
        }
        if (collection == null) {
            sb.append(DomExceptionUtils.SEPARATOR);
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}

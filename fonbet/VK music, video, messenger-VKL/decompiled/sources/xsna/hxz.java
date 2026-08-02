package xsna;

import java.util.Locale;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public interface hxz {

    /* compiled from: LocalizedText.kt */
    public static final class a implements hxz {
        public static final a a = new a();

        @Override // xsna.hxz
        public final String a(String str) {
            String valueOf;
            if (str.length() <= 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                if (valueOf.length() <= 1) {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                } else if (charAt != 329) {
                    valueOf = valueOf.charAt(0) + valueOf.substring(1).toLowerCase(locale);
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }

        public final String toString() {
            return "capitalize";
        }
    }

    /* compiled from: LocalizedText.kt */
    public static final class b implements hxz {
        public static final b a = new b();

        @Override // xsna.hxz
        public final String a(String str) {
            if (str.length() <= 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            boolean isUpperCase = Character.isUpperCase(charAt);
            String valueOf = String.valueOf(charAt);
            if (isUpperCase) {
                valueOf = valueOf.toLowerCase(Locale.ROOT);
            }
            sb.append((Object) valueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }

        public final String toString() {
            return "decapitalize";
        }
    }

    String a(String str);
}

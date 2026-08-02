package xsna;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Regex;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PackageValidator.kt */
/* loaded from: classes16.dex */
public final class d890 {
    public static final Regex e = new Regex("\\s|\\n");
    public final PackageManager a;
    public final LinkedHashMap b;
    public final String c;
    public final LinkedHashMap d = new LinkedHashMap();

    /* compiled from: PackageValidator.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final String d;
        public final Set<String> e;

        public a(String str, String str2, int i, String str3, Set<String> set) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
            String str = this.d;
            return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallerPackageInfo(name=");
            sb.append(this.a);
            sb.append(", packageName=");
            sb.append(this.b);
            sb.append(", uid=");
            sb.append(this.c);
            sb.append(", signature=");
            sb.append(this.d);
            sb.append(", permissions=");
            return ur.c(sb, this.e, ')');
        }
    }

    /* compiled from: PackageValidator.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final Set<c> c;

        public b(Set set, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KnownCallerInfo(name=");
            sb.append(this.a);
            sb.append(", packageName=");
            sb.append(this.b);
            sb.append(", signatures=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: PackageValidator.kt */
    public static final class c {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KnownSignature(signature=");
            sb.append(this.a);
            sb.append(", release=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public d890(Application application) {
        XmlResourceParser xml = application.getResources().getXml(R.xml.allowed_media_browser_callers);
        this.a = application.getPackageManager();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        try {
            for (int next = xml.next(); next != 1; next = xml.next()) {
                if (next == 2) {
                    String name = xml.getName();
                    b b2 = epx.f(name, "signing_certificate") ? b(xml) : epx.f(name, InAppPurchaseMetaData.KEY_SIGNATURE) ? c(xml) : null;
                    if (b2 != null) {
                        String str2 = b2.b;
                        b bVar = (b) linkedHashMap.get(str2);
                        if (bVar != null) {
                            g5g.y(b2.c, bVar.c);
                        } else {
                            linkedHashMap.put(str2, b2);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            L.f("PackageValidator", "Could not read allowed callers from XML.", e2);
        } catch (XmlPullParserException e3) {
            L.f("PackageValidator", "Could not read allowed callers from XML.", e3);
        }
        this.b = linkedHashMap;
        PackageInfo packageInfo = this.a.getPackageInfo("android", 4160);
        if (packageInfo != null) {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && signatureArr.length == 1) {
                str = a(signatureArr[0].toByteArray());
            }
            if (str != null) {
                this.c = str;
                return;
            }
        }
        throw new IllegalStateException("Platform signature not found");
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(bArr);
            return rl3.Y(messageDigest.digest(), StringUtils.PROCESS_POSTFIX_DELIMITER, new hyu(12), 30);
        } catch (NoSuchAlgorithmException e2) {
            L.l("PackageValidator", "No such algorithm: " + e2);
            throw new RuntimeException("Could not find SHA256 hash algorithm", e2);
        }
    }

    public static b b(XmlResourceParser xmlResourceParser) {
        return new b(izi0.i(new c(a(Base64.decode(e.g(xmlResourceParser.nextText(), ""), 0)), xmlResourceParser.getAttributeBooleanValue(null, "release", false))), xmlResourceParser.getAttributeValue(null, "name"), xmlResourceParser.getAttributeValue(null, "package"));
    }

    public static b c(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int next = xmlResourceParser.next();
        while (next != 3) {
            linkedHashSet.add(new c(e.g(xmlResourceParser.nextText(), "").toLowerCase(Locale.US), xmlResourceParser.getAttributeBooleanValue(null, "release", false)));
            next = xmlResourceParser.next();
        }
        return new b(linkedHashSet, attributeValue, attributeValue2);
    }
}

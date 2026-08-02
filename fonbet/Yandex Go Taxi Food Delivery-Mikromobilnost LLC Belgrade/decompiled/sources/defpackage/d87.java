package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d87 {
    public static final String c;
    public static final Set d;
    public static final d87 e;
    public static final d87 f;
    public final String a;
    public final String b;

    static {
        String a = xtu0.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = xtu0.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a3 = xtu0.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new pzn("proto"), new pzn("json"))));
        e = new d87(a, null);
        f = new d87(a2, a3);
    }

    public d87(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static d87 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            ny61.g("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            ny61.g("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            ny61.g("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new d87(str2, str3.isEmpty() ? null : str3);
    }
}

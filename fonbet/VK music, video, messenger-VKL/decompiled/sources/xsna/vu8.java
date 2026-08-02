package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class vu8 implements qip {
    public static final String c;
    public static final Set<ijp> d;
    public static final vu8 e;
    public static final vu8 f;

    @NonNull
    public final String a;

    @Nullable
    public final String b;

    static {
        String b = r870.b("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = b;
        String b2 = r870.b("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String b3 = r870.b("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new ijp("proto"), new ijp("json"))));
        e = new vu8(b, null);
        f = new vu8(b2, b3);
    }

    public vu8(@NonNull String str, @Nullable String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public static vu8 b(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new vu8(str2, str3);
    }

    @Override // xsna.qip
    public final Set<ijp> a() {
        return d;
    }

    @Override // xsna.qip
    @Nullable
    public final byte[] getExtras() {
        String str = this.a;
        String str2 = this.b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return y57.a("1$", str, "\\", str2).getBytes(Charset.forName(C.UTF8_NAME));
    }
}

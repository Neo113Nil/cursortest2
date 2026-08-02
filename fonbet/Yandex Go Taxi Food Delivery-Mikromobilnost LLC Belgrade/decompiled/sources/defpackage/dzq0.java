package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class dzq0 {
    public static final Pattern a = Pattern.compile("([a-z])=\\s?(.+)");
    public static final Pattern b = Pattern.compile("^([a-z])=$");
    public static final Pattern c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    public static final Pattern d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0222, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        throw androidx.media3.common.ParserException.b(null, "Malformed SDP line: " + r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static czq0 a(String str) {
        String str2;
        bzq0 bzq0Var = new bzq0();
        String str3 = ojl0.h;
        if (!str.contains(str3)) {
            str3 = ojl0.g;
        }
        int i = tw21.a;
        String[] split = str.split(str3, -1);
        int length = split.length;
        ld10 ld10Var = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ImmutableList.a aVar = bzq0Var.b;
            if (i2 >= length) {
                if (ld10Var != null) {
                    try {
                        aVar.a(ld10Var.a());
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw ParserException.b(e, null);
                    }
                }
                try {
                    return new czq0(bzq0Var);
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    throw ParserException.b(e2, null);
                }
            }
            String str4 = split[i2];
            if (!"".equals(str4)) {
                Matcher matcher = a.matcher(str4);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    String group2 = matcher.group(2);
                    group2.getClass();
                    switch (group.hashCode()) {
                        case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                            if (!group.equals("a")) {
                                continue;
                            } else if (z) {
                                continue;
                            } else {
                                Matcher matcher2 = c.matcher(group2);
                                if (!matcher2.matches()) {
                                    throw ParserException.b(null, "Malformed Attribute line: " + str4);
                                }
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                String group4 = matcher2.group(2);
                                String str5 = group4 != null ? group4 : "";
                                if (ld10Var != null) {
                                    ld10Var.e.put(group3, str5);
                                    break;
                                } else {
                                    bzq0Var.a.put(group3, str5);
                                    break;
                                }
                            }
                        case HProv.PP_REBOOT /* 98 */:
                            if (!group.equals("b")) {
                                continue;
                            } else if (!z) {
                                String[] split2 = group2.split(":\\s?", -1);
                                d6z.l(split2.length == 2);
                                int parseInt = Integer.parseInt(split2[1]);
                                if (ld10Var != null) {
                                    ld10Var.f = parseInt * 1000;
                                    break;
                                } else {
                                    bzq0Var.c = parseInt * 1000;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 99:
                            if (!group.equals("c")) {
                                continue;
                            } else if (!z) {
                                if (ld10Var != null) {
                                    ld10Var.h = group2;
                                    break;
                                } else {
                                    bzq0Var.h = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 101:
                            if (group.equals("e")) {
                                bzq0Var.k = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 105:
                            if (!group.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                                continue;
                            } else if (!z) {
                                if (ld10Var != null) {
                                    ld10Var.g = group2;
                                    break;
                                } else {
                                    bzq0Var.j = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case HProv.PP_SET_PIN /* 107 */:
                            if (!group.equals("k")) {
                                continue;
                            } else if (!z) {
                                if (ld10Var != null) {
                                    ld10Var.i = group2;
                                    break;
                                } else {
                                    bzq0Var.i = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 109:
                            if (group.equals("m")) {
                                if (ld10Var != null) {
                                    try {
                                        aVar.a(ld10Var.a());
                                    } catch (IllegalArgumentException | IllegalStateException e3) {
                                        throw ParserException.b(e3, null);
                                    }
                                }
                                Matcher matcher3 = d.matcher(group2);
                                if (!matcher3.matches()) {
                                    throw ParserException.b(null, "Malformed SDP media description line: ".concat(group2));
                                }
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                String group7 = matcher3.group(3);
                                group7.getClass();
                                String group8 = matcher3.group(4);
                                group8.getClass();
                                try {
                                    ld10Var = new ld10(group5, Integer.parseInt(group6), group7, Integer.parseInt(group8));
                                } catch (NumberFormatException e4) {
                                    lk91.k("Malformed SDP media description line: ".concat(group2), e4);
                                    ld10Var = null;
                                }
                                if (ld10Var != null) {
                                    z = false;
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 111:
                            if (group.equals("o")) {
                                bzq0Var.e = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 112:
                            if (group.equals("p")) {
                                bzq0Var.l = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 114:
                            str2 = "r";
                            break;
                        case HProv.PP_CACHE_SIZE /* 115 */:
                            if (group.equals("s")) {
                                bzq0Var.d = group2;
                                break;
                            } else {
                                continue;
                            }
                        case BuildConfig.API_LEVEL /* 116 */:
                            if (group.equals("t")) {
                                bzq0Var.f = group2;
                                break;
                            } else {
                                continue;
                            }
                        case HProv.PP_NK_SYNC /* 117 */:
                            if (group.equals("u")) {
                                bzq0Var.g = Uri.parse(group2);
                                break;
                            } else {
                                continue;
                            }
                        case HProv.PP_INFO /* 118 */:
                            if (!group.equals("v")) {
                                continue;
                            } else {
                                if (!"0".equals(group2)) {
                                    throw ParserException.b(null, "SDP version " + group2 + " is not supported.");
                                }
                                break;
                            }
                        case 122:
                            str2 = "z";
                            break;
                    }
                    group.equals(str2);
                } else {
                    Matcher matcher4 = b.matcher(str4);
                    if (!matcher4.matches() || !Objects.equals(matcher4.group(1), CoreConstants.PushMessage.SERVICE_TYPE)) {
                    }
                }
            }
            i2++;
        }
    }
}

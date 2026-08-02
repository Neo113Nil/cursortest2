package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes10.dex */
public abstract class ojl0 {
    public static final Pattern a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    public static final Pattern b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final Pattern d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    public static final Pattern e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    public static final Pattern f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    public static final String g = new String(new byte[]{10});
    public static final String h = new String(new byte[]{PKIBody._RP, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static ImmutableList b(String str) {
        if (str == null) {
            return ImmutableList.p();
        }
        ImmutableList.a aVar = new ImmutableList.a();
        int i = tw21.a;
        for (String str2 : str.split(",\\s?", -1)) {
            int a2 = a(str2);
            if (a2 != 0) {
                aVar.a(Integer.valueOf(a2));
            }
        }
        return aVar.g();
    }

    public static ek c(String str) {
        long parseInt;
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.b(null, str);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e2) {
                throw ParserException.b(e2, str);
            }
        } else {
            parseInt = 60000;
        }
        return new ek(group, parseInt);
    }

    public static ga0 d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i = tw21.a;
        String[] split = userInfo.split(":", 2);
        return new ga0(split[0], split[1], false);
    }

    public static lg e(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new lg(2, group, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new lg(1, group4, "", "");
        }
        throw ParserException.b(null, "Invalid WWW-Authenticate header " + str);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        d6z.l(encodedAuthority.contains("@"));
        int i = tw21.a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static ImmutableList g(pjl0 pjl0Var) {
        d6z.l(pjl0Var.c.b("CSeq") != null);
        ImmutableList.a aVar = new ImmutableList.a();
        Object[] objArr = {h(pjl0Var.b), pjl0Var.a, "RTSP/1.0"};
        int i = tw21.a;
        aVar.a(String.format(Locale.US, "%s %s %s", objArr));
        ImmutableListMultimap immutableListMultimap = pjl0Var.c.a;
        h221 it = immutableListMultimap.w.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ImmutableList f2 = immutableListMultimap.f(str);
            for (int i2 = 0; i2 < f2.size(); i2++) {
                aVar.a(String.format(Locale.US, "%s: %s", str, f2.get(i2)));
            }
        }
        aVar.a("");
        aVar.a(pjl0Var.d);
        return aVar.g();
    }

    public static String h(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                ny61.k();
                return null;
        }
    }
}

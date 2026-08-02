package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

/* compiled from: StringUtil.java */
/* loaded from: classes8.dex */
public final class sqm0 {
    public static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    public static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    public static final a e = new a();

    /* compiled from: StringUtil.java */
    public class a extends ThreadLocal<Stack<StringBuilder>> {
        @Override // java.lang.ThreadLocal
        public final Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    public static StringBuilder a() {
        Stack<StringBuilder> stack = e.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static boolean b(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean c(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 32 && codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13) {
                return false;
            }
        }
        return true;
    }

    public static String d(StringBuilder sb) {
        kir0.c(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static URL e(URL url, String str) throws MalformedURLException {
        String replaceAll = d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst(DomExceptionUtils.SEPARATOR);
        if (url2.getRef() != null) {
            StringBuilder b2 = ho8.b(replaceFirst, "#");
            b2.append(url2.getRef());
            replaceFirst = b2.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}

package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public abstract class if90 {
    public static final String[] a = {"https://", "http://"};
    public static final Pattern b = Pattern.compile("@[\\w]{8}-[\\w]{4}-[\\w]{4}-[\\w]{4}-[\\w]{12}");
    public static final Pattern c = Pattern.compile("(?<=^|\\s|[\\n\\r])/(?:[a-zA-Z0-9_]+)(?=[.\\^$?()\\[\\]{}\\\\/&<>\"'=!@|\\s\\-]|$)");

    public static ArrayList a(SpannableStringBuilder spannableStringBuilder, List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                arrayList.add(new wh21(spannableStringBuilder.getSpanStart(uRLSpan), Uri.parse(uRLSpan.getURL()), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan)));
            }
        }
        return arrayList;
    }

    public static final List b(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = b.matcher(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            arrayList.add(new cj10(charSequence.subSequence(start + 1, end).toString(), start, end));
        }
        return arrayList;
    }

    public static final Uri c(String str) {
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? Uri.parse("https://".concat(str)) : parse;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List d(String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        List list;
        Iterator it;
        int length;
        int i;
        int length2 = str.length();
        List list2 = EmptyList.a;
        if (length2 >= 3 && length2 <= 4096) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            char c2 = 0;
            int i6 = 0;
            while (i3 < length2) {
                char charAt = str.charAt(i3);
                int i7 = 1;
                if (charAt == ':') {
                    if (i4 == 0) {
                        i4 = 1;
                        if (charAt == '.') {
                            if (i5 == 0 && c2 != ' ') {
                                i5++;
                                if (charAt < '0' && charAt <= '9') {
                                    i6++;
                                    if (i6 >= 6) {
                                        spannableStringBuilder = new SpannableStringBuilder(str);
                                        ArrayList arrayList = new ArrayList();
                                        try {
                                            Linkify.addLinks(spannableStringBuilder, jl41.a, "https://", a, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                                            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                                            length = uRLSpanArr.length;
                                            i = 0;
                                            while (i < length) {
                                                URLSpan uRLSpan = uRLSpanArr[i];
                                                String url = uRLSpan.getURL();
                                                Stack stack = new Stack();
                                                String obj = gvu0.z0(url).toString();
                                                int i8 = i2;
                                                int i9 = i8;
                                                int i10 = i9;
                                                while (i8 < obj.length()) {
                                                    char charAt2 = obj.charAt(i8);
                                                    int i11 = i9 + 1;
                                                    int i12 = i2;
                                                    if (charAt2 != '(') {
                                                        if (charAt2 == ')') {
                                                            stack.push(Integer.valueOf(i9));
                                                        }
                                                    } else if (stack.isEmpty()) {
                                                        i10 = i11;
                                                    } else {
                                                        stack.pop();
                                                    }
                                                    i8++;
                                                    i9 = i11;
                                                    i2 = i12;
                                                }
                                                int i13 = i2;
                                                if (!stack.isEmpty()) {
                                                    i10 = ((Integer) stack.peek()).intValue() + 1;
                                                }
                                                String A0 = gvu0.A0(url.length() - i10, url);
                                                char[] cArr = new char[1];
                                                cArr[i13] = HexString.CHAR_COMMA;
                                                String n0 = evu0.n0(A0, cArr);
                                                int length3 = uRLSpan.getURL().length() - n0.length();
                                                if (length3 > 0) {
                                                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                                                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan) - length3;
                                                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                                                    spannableStringBuilder.removeSpan(uRLSpan);
                                                    spannableStringBuilder.setSpan(new URLSpan(n0), spanStart, spanEnd, spanFlags);
                                                }
                                                i++;
                                                i2 = i13;
                                            }
                                            URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(i2, spannableStringBuilder.length(), URLSpan.class);
                                            list = a(spannableStringBuilder, scc.g(Arrays.copyOf(uRLSpanArr2, uRLSpanArr2.length)));
                                        } catch (Exception unused) {
                                            list = list2;
                                        }
                                        arrayList.addAll(list);
                                        if (z) {
                                            try {
                                                Linkify.addLinks(spannableStringBuilder, 6);
                                                URLSpan[] uRLSpanArr3 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                                                list2 = a(spannableStringBuilder, scc.g(Arrays.copyOf(uRLSpanArr3, uRLSpanArr3.length)));
                                            } catch (Exception unused2) {
                                            }
                                            arrayList.addAll(list2);
                                        }
                                        xcc.q(arrayList, new oe7(7, new g990(i7)));
                                        ArrayList arrayList2 = new ArrayList();
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            wh21 wh21Var = (wh21) it.next();
                                            if (arrayList2.isEmpty() || ((wh21) a.Z(arrayList2)).b < wh21Var.a) {
                                                arrayList2.add(wh21Var);
                                            }
                                        }
                                        return arrayList2;
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                } else if (charAt != ' ' || i6 <= 0) {
                                    i6 = 0;
                                }
                                i3++;
                                c2 = charAt;
                            }
                        } else if (charAt != ' ' && c2 == '.' && i5 == 1) {
                            spannableStringBuilder = new SpannableStringBuilder(str);
                            ArrayList arrayList3 = new ArrayList();
                            Linkify.addLinks(spannableStringBuilder, jl41.a, "https://", a, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                            URLSpan[] uRLSpanArr4 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                            length = uRLSpanArr4.length;
                            i = 0;
                            while (i < length) {
                            }
                            URLSpan[] uRLSpanArr22 = (URLSpan[]) spannableStringBuilder.getSpans(i2, spannableStringBuilder.length(), URLSpan.class);
                            list = a(spannableStringBuilder, scc.g(Arrays.copyOf(uRLSpanArr22, uRLSpanArr22.length)));
                            arrayList3.addAll(list);
                            if (z) {
                            }
                            xcc.q(arrayList3, new oe7(7, new g990(i7)));
                            ArrayList arrayList22 = new ArrayList();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return arrayList22;
                        }
                        i5 = 0;
                        if (charAt < '0') {
                        }
                        if (charAt != ' ') {
                        }
                        i6 = 0;
                        i3++;
                        c2 = charAt;
                    }
                    i4 = 0;
                    if (charAt == '.') {
                    }
                    i5 = 0;
                    if (charAt < '0') {
                    }
                    if (charAt != ' ') {
                    }
                    i6 = 0;
                    i3++;
                    c2 = charAt;
                } else {
                    if (charAt == '/') {
                        if (i4 == 2) {
                            spannableStringBuilder = new SpannableStringBuilder(str);
                            ArrayList arrayList32 = new ArrayList();
                            Linkify.addLinks(spannableStringBuilder, jl41.a, "https://", a, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                            URLSpan[] uRLSpanArr42 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                            length = uRLSpanArr42.length;
                            i = 0;
                            while (i < length) {
                            }
                            URLSpan[] uRLSpanArr222 = (URLSpan[]) spannableStringBuilder.getSpans(i2, spannableStringBuilder.length(), URLSpan.class);
                            list = a(spannableStringBuilder, scc.g(Arrays.copyOf(uRLSpanArr222, uRLSpanArr222.length)));
                            arrayList32.addAll(list);
                            if (z) {
                            }
                            xcc.q(arrayList32, new oe7(7, new g990(i7)));
                            ArrayList arrayList222 = new ArrayList();
                            it = arrayList32.iterator();
                            while (it.hasNext()) {
                            }
                            return arrayList222;
                        }
                        if (i4 == 1) {
                            i4++;
                        }
                        i4 = 0;
                    }
                    if (charAt == '.') {
                    }
                    i5 = 0;
                    if (charAt < '0') {
                    }
                    if (charAt != ' ') {
                    }
                    i6 = 0;
                    i3++;
                    c2 = charAt;
                }
            }
        }
        return list2;
    }
}

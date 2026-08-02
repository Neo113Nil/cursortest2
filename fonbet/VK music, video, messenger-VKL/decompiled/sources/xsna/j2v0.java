package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: VkLinkParser.java */
@Deprecated
/* loaded from: classes17.dex */
public final class j2v0 {
    public static final Pattern b = Pattern.compile("'''(.*?)'''");
    public static final Pattern c = Pattern.compile("\\[(\\S+?)\\|(.+?)\\]");
    public static final Pattern d = Pattern.compile("'''\\[(\\S+?)\\|(.+?)\\]'''");
    public final ArrayList<String> a;

    /* compiled from: VkLinkParser.java */
    public static class a {
        public int a;
        public int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2 - 1;
        }
    }

    public j2v0(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.a = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public static boolean a(Matcher matcher, ArrayList<a> arrayList, int i) {
        int start = matcher.start() - i;
        int end = (matcher.end() - 1) - i;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            a aVar = arrayList.get(i2);
            int i3 = aVar.a;
            if ((start >= i3 && start <= aVar.b) || (end >= i3 && end <= aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public static void b(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i3 = aVar.a;
            if (i3 >= i) {
                aVar.a = i3 - i2;
                aVar.b -= i2;
            }
        }
    }
}

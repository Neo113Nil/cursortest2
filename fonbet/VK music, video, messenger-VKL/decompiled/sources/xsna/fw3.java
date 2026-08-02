package xsna;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fw3 {
    public static int a(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int b(int i, int i2, Set set) {
        return (set.hashCode() + i) * i2;
    }

    public static String c(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String d(CopyOnWriteArraySet copyOnWriteArraySet, StringBuilder sb) {
        sb.append(copyOnWriteArraySet.size());
        return sb.toString();
    }

    public static StringBuilder e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}

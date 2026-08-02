package xsna;

import com.airbnb.lottie.AsyncUpdates;
import java.util.HashSet;

/* compiled from: Logger.java */
/* loaded from: classes12.dex */
public final class n100 {
    public static final d100 a = new d100();

    public static void a() {
        a.getClass();
        AsyncUpdates asyncUpdates = tky.a;
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = d100.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = d100.a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}

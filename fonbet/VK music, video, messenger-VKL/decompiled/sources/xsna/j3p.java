package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: EditorAnalytics.kt */
/* loaded from: classes18.dex */
public final class j3p {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final LinkedHashMap b = new LinkedHashMap();
    public String c;
    public Integer d;

    /* compiled from: EditorAnalytics.kt */
    public static class a {
        public final String a;
        public boolean b = false;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: EditorAnalytics.kt */
    public static final class b extends a {
        public final ArrayList<String> c;

        public b() {
            super("sticker");
            this.c = new ArrayList<>();
        }
    }

    public final void a(String str, boolean z) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new a(str);
            linkedHashMap.put(str, obj);
        }
        ((a) obj).b = z;
    }
}

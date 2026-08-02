package sg.bigo.ads.bw;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class c {

    public static final class a {
        private static a a;
        private final C2448a b = new C2448a();

        /* renamed from: sg.bigo.ads.bw.c$a$a, reason: collision with other inner class name */
        public static class C2448a {
            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (a == null) {
                a = new a();
            }
            return a;
        }
    }
}

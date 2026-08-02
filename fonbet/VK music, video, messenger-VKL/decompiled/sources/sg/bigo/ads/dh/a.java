package sg.bigo.ads.dh;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class a {
    public final List<C2478a> a = new ArrayList();
    public final List<C2478a> b = new ArrayList();

    /* renamed from: sg.bigo.ads.dh.a$a, reason: collision with other inner class name */
    public static final class C2478a {
        public final String a;
        public final String b;
        public final int c;
        public final int d;

        @Nullable
        public final String e;

        public C2478a(String str, int i, int i2, @Nullable String str2, String str3) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.e) || "image/png".equalsIgnoreCase(this.e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.e);
        }
    }

    @Nullable
    public final C2478a a() {
        return a(this.a);
    }

    public static C2478a a(List<C2478a> list) {
        if (list == null) {
            return null;
        }
        for (C2478a c2478a : list) {
            if (c2478a != null) {
                return c2478a;
            }
        }
        return null;
    }
}

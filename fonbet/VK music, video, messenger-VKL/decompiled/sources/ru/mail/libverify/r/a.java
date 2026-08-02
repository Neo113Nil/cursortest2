package ru.mail.libverify.r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;
import ru.mail.libverify.p.e;

/* loaded from: classes9.dex */
public final class a {

    @Nullable
    final Integer a;

    @Nullable
    final String b;

    @Nullable
    final Map<String, String> c;

    @Nullable
    final e d;

    @Nullable
    final String e;

    @NonNull
    final ArrayList f;

    /* renamed from: ru.mail.libverify.r.a$a, reason: collision with other inner class name */
    public static class C2214a {
        private final ArrayList a = new ArrayList();

        @Nullable
        private Integer b;

        @Nullable
        private String c;

        @Nullable
        private Map<String, String> d;

        @Nullable
        private String e;

        @Nullable
        private e f;

        @NonNull
        public final C2214a a(@Nullable Integer num) {
            this.b = num;
            return this;
        }

        @NonNull
        public final C2214a b(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NonNull
        public final C2214a a(@Nullable String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public final C2214a a(@Nullable Map<String, String> map) {
            this.d = map;
            return this;
        }

        @NonNull
        public final C2214a a(@Nullable e eVar) {
            this.f = eVar;
            return this;
        }

        @NonNull
        public final C2214a a(@NonNull ArrayList arrayList) {
            this.a.addAll(arrayList);
            return this;
        }

        @NonNull
        public final a a() {
            if (this.f != null) {
                return new a(this, 0);
            }
            throw new IllegalArgumentException("environment is required");
        }
    }

    public /* synthetic */ a(C2214a c2214a, int i) {
        this(c2214a);
    }

    @Nullable
    public final String a() {
        return this.b;
    }

    @Nullable
    public final e b() {
        return this.d;
    }

    @NonNull
    public final ArrayList c() {
        return this.f;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.c;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    @Nullable
    public final Integer f() {
        return this.a;
    }

    private a(@NonNull C2214a c2214a) {
        this.a = c2214a.b;
        this.b = c2214a.c;
        this.c = c2214a.d;
        this.d = c2214a.f;
        this.e = c2214a.e;
        this.f = c2214a.a;
    }
}

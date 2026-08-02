package ru.mail.libverify.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public class a implements Gsonable {

    @Nullable
    @ru.mail.libverify.q0.b("cond_s")
    private final String condition;

    @NonNull
    @ru.mail.libverify.q0.b("config")
    private final Map<String, Object> map;

    @Nullable
    @ru.mail.libverify.q0.b(AnalyticsBaseParamsConstantsKt.SEGMENTS)
    private final Map<String, String> segments;

    @Nullable
    @ru.mail.libverify.q0.b("config_v")
    private final Integer version;

    /* renamed from: ru.mail.libverify.p.a$a, reason: collision with other inner class name */
    public static final class C2212a {

        @Nullable
        private Integer a;

        @Nullable
        private String b;
        private final HashMap c;

        @Nullable
        private Map<String, String> d;

        public /* synthetic */ C2212a(int i) {
            this();
        }

        private C2212a() {
            this.c = new HashMap();
        }

        @NonNull
        public final C2212a a(@Nullable Integer num) {
            this.a = num;
            return this;
        }

        @NonNull
        public final C2212a a(@Nullable String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public final C2212a a(@Nullable Map<String, String> map) {
            this.d = map;
            return this;
        }

        @NonNull
        public final a a() {
            return new a(this, 0);
        }

        @NonNull
        public final void a(@NonNull String str, @NonNull Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean)) {
                throw new IllegalArgumentException("Value of type " + obj.getClass() + " not supported");
            }
            this.c.put(str, obj);
        }
    }

    public /* synthetic */ a(C2212a c2212a, int i) {
        this(c2212a);
    }

    @NonNull
    public static C2212a f() {
        return new C2212a(0);
    }

    @NonNull
    public final Map<String, Object> a() {
        return Collections.unmodifiableMap(this.map);
    }

    public final boolean b() {
        Object obj = this.map.get("signatures");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @Nullable
    public final String c() {
        return this.condition;
    }

    @Nullable
    public final Map<String, String> d() {
        Map<String, String> map = this.segments;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    @Nullable
    public final Integer e() {
        return this.version;
    }

    @NonNull
    public final String toString() {
        return "";
    }

    public a() {
        this.version = 0;
        this.condition = "";
        this.map = Collections.EMPTY_MAP;
        this.segments = null;
    }

    private a(@NonNull C2212a c2212a) {
        this.version = c2212a.a;
        this.condition = c2212a.b;
        this.map = c2212a.c;
        this.segments = c2212a.d;
    }
}

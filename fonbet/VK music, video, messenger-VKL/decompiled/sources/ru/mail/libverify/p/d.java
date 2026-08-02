package ru.mail.libverify.p;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.u.w;

/* loaded from: classes9.dex */
public final class d {
    private static final int j = (int) TimeUnit.DAYS.toMinutes(1);
    public static final /* synthetic */ int k = 0;
    final w a;
    final String b;

    @NonNull
    final ArrayList c;

    @NonNull
    final ru.mail.libverify.p.b d;
    final int e;
    final e f;
    final String g;

    @Nullable
    final ru.mail.libverify.i0.a h;
    final ExecutorService i;

    public static final class a {
        private String a;
        private w b;

        @NonNull
        private ArrayList c = new ArrayList(4);

        @NonNull
        private ru.mail.libverify.p.b d = new b(0);
        private int e = d.j;
        private e f;
        private String g;

        @Nullable
        private ru.mail.libverify.i0.a h;
        private ExecutorService i;

        @NonNull
        public final a a(@NonNull w wVar) {
            this.b = wVar;
            return this;
        }

        @NonNull
        public final d b() {
            if (TextUtils.isEmpty(this.a)) {
                throw new IllegalArgumentException("appId is required");
            }
            if (this.f == null) {
                throw new IllegalArgumentException("environment is required");
            }
            if (this.h != null) {
                return new d(this, 0);
            }
            throw new IllegalArgumentException("timeProvider is required");
        }

        @NonNull
        public final a c() {
            this.f = e.a;
            return this;
        }

        @NonNull
        public final a d() {
            this.e = 1;
            return this;
        }

        @NonNull
        public final a a(@NonNull ExecutorService executorService) {
            this.i = executorService;
            return this;
        }

        @NonNull
        public final a a() {
            this.a = "3ecdaee4-89a8-4295-af14-0416aa595298";
            return this;
        }

        @NonNull
        public final a a(@NonNull ArrayList arrayList) {
            this.c = arrayList;
            return this;
        }

        @NonNull
        public final a a(@NonNull String str) {
            this.g = str;
            return this;
        }

        @NonNull
        public final a a(@Nullable ru.mail.libverify.i0.a aVar) {
            this.h = aVar;
            return this;
        }
    }

    public static class b extends ru.mail.libverify.p.b {
        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ d(a aVar, int i) {
        this(aVar);
    }

    private d(@NonNull a aVar) {
        this.b = aVar.a;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.a = aVar.b;
        this.i = aVar.i;
    }
}

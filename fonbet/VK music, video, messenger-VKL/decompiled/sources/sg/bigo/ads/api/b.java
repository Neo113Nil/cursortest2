package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public abstract class b<T extends b> {
    public final String a;
    public int b;
    public int c;
    public int d;
    public long e;
    public String f;

    @NonNull
    public final a g = new a(0);
    private final String h;

    public static class a implements h {
        public String a;

        @Nullable
        public final String b;

        @Nullable
        String c;

        @Nullable
        String d;

        @Nullable
        String e;
        public long f;
        int g;
        String h;
        int i;
        long j;
        public long k;
        private long l;
        private long m;

        private a() {
            this.b = UUID.randomUUID().toString();
            this.a = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.g = 0;
            this.i = 0;
            this.h = "";
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
        }

        public final void a() {
            if (this.l == 0) {
                this.l = System.currentTimeMillis();
            }
        }

        public final void b() {
            if (this.m == 0) {
                this.m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.h
        @Nullable
        public final String c() {
            return this.b;
        }

        @Override // sg.bigo.ads.api.core.h
        @Nullable
        public final String d() {
            return this.c;
        }

        @Override // sg.bigo.ads.api.core.h
        @Nullable
        public final String e() {
            return this.d;
        }

        @Override // sg.bigo.ads.api.core.h
        @Nullable
        public final String f() {
            return this.e;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String g() {
            return this.a;
        }

        @Override // sg.bigo.ads.api.core.h
        public final int h() {
            return this.g;
        }

        @Override // sg.bigo.ads.api.core.h
        public final String i() {
            return this.h;
        }

        @Override // sg.bigo.ads.api.core.h
        public final int j() {
            return this.i;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long k() {
            return this.f;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long l() {
            return this.j;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long m() {
            return this.k;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long n() {
            return this.l;
        }

        @Override // sg.bigo.ads.api.core.h
        public final long o() {
            return this.m;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public b(String str, @Nullable String str2) {
        this.h = str;
        this.a = str2;
    }

    @Nullable
    public T a() {
        return null;
    }

    @Nullable
    public sg.bigo.ads.api.core.c b() {
        if (r.a((CharSequence) this.h)) {
            return new sg.bigo.ads.api.core.c(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public abstract int c();

    public final void c(int i) {
        this.g.g = i;
    }

    @NonNull
    public final String d() {
        String str = this.h;
        return str != null ? str.trim() : "";
    }

    @Nullable
    public Map<String, Object> e() {
        return null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public n i() {
        return null;
    }

    public final void a(String str) {
        this.g.a = str;
    }

    public final void b(int i) {
        a aVar = this.g;
        if (aVar.j == 0) {
            aVar.i = i;
            aVar.j = System.currentTimeMillis();
        }
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        a aVar = this.g;
        aVar.c = str;
        aVar.d = str2;
        aVar.e = str3;
    }

    public final void b(String str) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.h = str;
        }
    }

    public boolean a(int i) {
        return i != c();
    }
}

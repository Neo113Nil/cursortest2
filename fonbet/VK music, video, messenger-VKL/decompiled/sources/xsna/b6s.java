package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* compiled from: FontWeight.kt */
/* loaded from: classes11.dex */
public final class b6s implements Comparable<b6s> {
    public static final b6s c;
    public static final b6s d;
    public static final b6s e;
    public static final b6s f;
    public static final b6s g;
    public static final b6s h;
    public static final b6s i;
    public static final b6s j;
    public static final b6s k;
    public static final b6s l;
    public static final List<b6s> m;
    public final int b;

    /* compiled from: FontWeight.kt */
    public static final class a {
        public static b6s a() {
            return b6s.c;
        }

        public static b6s b() {
            return b6s.d;
        }

        public static b6s c() {
            return b6s.e;
        }

        public static b6s d() {
            return b6s.f;
        }
    }

    static {
        b6s b6sVar = new b6s(100);
        b6s b6sVar2 = new b6s(200);
        b6s b6sVar3 = new b6s(300);
        b6s b6sVar4 = new b6s(400);
        c = b6sVar4;
        b6s b6sVar5 = new b6s(500);
        d = b6sVar5;
        b6s b6sVar6 = new b6s(600);
        e = b6sVar6;
        b6s b6sVar7 = new b6s(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        f = b6sVar7;
        b6s b6sVar8 = new b6s(800);
        b6s b6sVar9 = new b6s(900);
        g = b6sVar3;
        h = b6sVar4;
        i = b6sVar5;
        j = b6sVar6;
        k = b6sVar7;
        l = b6sVar9;
        m = e43.l(b6sVar, b6sVar2, b6sVar3, b6sVar4, b6sVar5, b6sVar6, b6sVar7, b6sVar8, b6sVar9);
    }

    public b6s(int i2) {
        this.b = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        vzw.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b6s b6sVar) {
        return epx.g(this.b, b6sVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6s) {
            return this.b == ((b6s) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FontWeight(weight="), this.b, ')');
    }
}

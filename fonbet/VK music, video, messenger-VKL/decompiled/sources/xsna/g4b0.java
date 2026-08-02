package xsna;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import one.video.statistics.ContentType;

/* compiled from: PlayerStatInfo.kt */
@ozl
/* loaded from: classes8.dex */
public final class g4b0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ContentType e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Map<String, Object> j;
    public long k = SystemClock.elapsedRealtime();

    public g4b0(String str, String str2, String str3, String str4, ContentType contentType, String str5, boolean z, boolean z2, boolean z3, Map<String, Object> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = contentType;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = map;
    }

    public final g4b0 a() {
        Random.b.getClass();
        return new g4b0(this.a, new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b0)) {
            return false;
        }
        g4b0 g4b0Var = (g4b0) obj;
        return epx.f(this.a, g4b0Var.a) && epx.f(this.b, g4b0Var.b) && epx.f(this.c, g4b0Var.c) && epx.f(this.d, g4b0Var.d) && this.e == g4b0Var.e && epx.f(this.f, g4b0Var.f) && this.g == g4b0Var.g && this.h == g4b0Var.h && this.i == g4b0Var.i && epx.f(this.j, g4b0Var.j);
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a(urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentType contentType = this.e;
        int hashCode2 = (hashCode + (contentType == null ? 0 : contentType.hashCode())) * 31;
        String str3 = this.f;
        return this.j.hashCode() + qoy.b(qoy.b(qoy.b((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder e = fw3.e("{");
        e.append(" \"vsid\": \"" + this.b + "\"");
        String str = this.a;
        if (str != null) {
            e.append(", \"vid\": \"" + str + "\"");
        }
        String str2 = this.d;
        if (str2 != null) {
            e.append(", \"cdn_host\": \"" + str2 + "\"");
        }
        String str3 = this.f;
        if (str3 != null) {
            e.append(", \"place\": \"" + str3 + "\"");
        }
        e.append(", \"params\": { ");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final dsg dsgVar = new dsg(6, e, ref$ObjectRef);
        this.j.forEach(new BiConsumer() { // from class: xsna.f4b0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                dsg.this.invoke(obj, obj2);
            }
        });
        e.append(" }");
        e.append(" }");
        return e.toString();
    }
}

package io.reactivex.rxjava3.schedulers;

import com.ironsource.X3;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import xsna.tk5;

/* compiled from: Timed.java */
/* loaded from: classes8.dex */
public final class b<T> {
    public final T a;
    public final long b;
    public final TimeUnit c;

    public b(T t, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(t, "value is null");
        this.a = t;
        this.b = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.convert(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Objects.equals(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.b);
        sb.append(", unit=");
        sb.append(this.c);
        sb.append(", value=");
        return tk5.c(sb, this.a, X3.j.e);
    }
}

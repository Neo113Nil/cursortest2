package defpackage;

/* loaded from: classes13.dex */
public final class j790 implements n790 {
    public final Integer a;

    public j790(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j790) && jl40.l(this.a, ((j790) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return vfc.o(new StringBuilder("MainUrl(httpErrorCode="), this.a, ')');
    }
}

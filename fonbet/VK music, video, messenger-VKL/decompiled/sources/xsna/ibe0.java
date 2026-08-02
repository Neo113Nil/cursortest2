package xsna;

import xsna.dbe0;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public final class ibe0 implements dbe0.f {
    public final String b;

    public ibe0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibe0) && epx.f(this.b, ((ibe0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Picker(coverPath="), this.b, ')');
    }
}

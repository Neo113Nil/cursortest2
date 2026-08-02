package defpackage;

import java.util.function.Consumer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ogn {
    public final Runnable a;
    public final Consumer b;
    public final Consumer c;
    public final Consumer d;

    public ogn() {
        this(new d82(1), new c90(3), new c90(4), new c90(5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogn)) {
            return false;
        }
        ogn ognVar = (ogn) obj;
        return jl40.l(this.a, ognVar.a) && jl40.l(this.b, ognVar.b) && jl40.l(this.c, ognVar.c) && jl40.l(this.d, ognVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EatskitShowingParams(onInitialReadyAction=" + this.a + ", requestErrorConsumer=" + this.b + ", failedAuthConsumer=" + this.c + ", failedPassportConsumer=" + this.d + Extension.C_BRAKE;
    }

    public ogn(Runnable runnable, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        this.a = runnable;
        this.b = consumer;
        this.c = consumer2;
        this.d = consumer3;
    }
}

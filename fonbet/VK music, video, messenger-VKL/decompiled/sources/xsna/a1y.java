package xsna;

import java.util.concurrent.atomic.DoubleAdder;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: JreDoubleAdder.java */
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class a1y implements w5o {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ a1y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.w5o
    public void add(double d) {
        ((DoubleAdder) this.c).add(d);
    }

    @Override // xsna.w5o
    public double b() {
        return ((DoubleAdder) this.c).sumThenReset();
    }

    @Override // xsna.w5o
    public double sum() {
        return ((DoubleAdder) this.c).sum();
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return ((DoubleAdder) this.c).toString();
            default:
                return super.toString();
        }
    }

    public a1y() {
        this.b = 0;
        this.c = new DoubleAdder();
    }
}

package xsna;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes8.dex */
public final class sl3 implements uki0<Float> {
    public final /* synthetic */ float[] a;

    public sl3(float[] fArr) {
        this.a = fArr;
    }

    @Override // xsna.uki0
    public final Iterator<Float> iterator() {
        return new vk3(this.a);
    }
}

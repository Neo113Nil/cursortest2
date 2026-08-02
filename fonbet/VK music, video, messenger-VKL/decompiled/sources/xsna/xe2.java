package xsna;

import android.util.Property;
import android.view.View;

/* compiled from: AnimExt.kt */
/* loaded from: classes4.dex */
public final class xe2 extends Property<Object, Float> {
    public final /* synthetic */ izs<Object, Float> a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ wzs<Object, Float, s3q0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(String str, izs izsVar, View view, wzs wzsVar) {
        super(Float.TYPE, str);
        this.a = izsVar;
        this.b = view;
        this.c = wzsVar;
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return this.a.invoke(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, java.lang.Object] */
    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        Float valueOf = Float.valueOf(f.floatValue());
        wzs<Object, Float, s3q0> wzsVar = this.c;
        ?? r0 = this.b;
        wzsVar.invoke(r0, valueOf);
        r0.invalidate();
    }
}

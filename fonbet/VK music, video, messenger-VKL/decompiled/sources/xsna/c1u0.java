package xsna;

import android.view.View;
import android.view.ViewStub;

/* compiled from: ViewStubViewProvider.kt */
/* loaded from: classes17.dex */
public final class c1u0<V extends View> {
    public final izs<Object, s3q0> a;
    public Object b;
    public final int c;
    public final int d;
    public final View e;

    public c1u0(int i, int i2, View view, izs<? super V, s3q0> izsVar) {
        this.a = izsVar;
        this.c = i;
        this.d = i2;
        this.e = view;
    }

    public final Object a() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        ViewStub viewStub = (ViewStub) this.e.findViewById(this.c);
        viewStub.setLayoutResource(this.d);
        View inflate = viewStub.inflate();
        this.b = inflate;
        this.a.invoke(inflate);
        return inflate;
    }

    public final boolean b() {
        return this.b != null;
    }

    public /* synthetic */ c1u0(int i, int i2, View view) {
        this(i, i2, view, new mcl0(14));
    }
}

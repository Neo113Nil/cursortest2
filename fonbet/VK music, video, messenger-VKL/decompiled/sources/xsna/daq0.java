package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class daq0 implements i9z {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ daq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.i9z
    public final void a(q8z q8zVar) {
        switch (this.b) {
            case 0:
                ((wzs) this.c).invoke(((hze) this.d).a, ((cna) this.e).b);
                break;
            default:
                ((qjc) this.c).f((Context) this.d, (View) this.e);
                break;
        }
    }
}

package xsna;

import java.util.List;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gqf implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ gqf(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (ttf.h.a) this.c.invoke(obj);
            default:
                return (List) this.c.invoke(obj);
        }
    }
}

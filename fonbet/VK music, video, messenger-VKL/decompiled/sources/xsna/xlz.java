package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xlz implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ xlz(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) this.c.invoke(obj);
            default:
                return (com.vk.search.params.impl.presentation.modal.location.mvi.model.a) this.c.invoke(obj);
        }
    }
}

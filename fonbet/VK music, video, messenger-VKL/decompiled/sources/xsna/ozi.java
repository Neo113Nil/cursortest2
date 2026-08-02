package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ozi implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ izs d;

    public /* synthetic */ ozi(int i, List list, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((com.vk.movika.sdk.base.logic.interactor.f) this.d).invoke(this.c.get(((Number) obj).intValue()));
            default:
                return ((yml0) this.d).invoke(this.c.get(((Number) obj).intValue()));
        }
    }
}

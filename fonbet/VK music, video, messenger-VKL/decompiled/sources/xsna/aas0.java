package xsna;

import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aas0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ aas0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                int i2 = VideoCatalogSearchRootVh.S;
                ((rzl0) izsVar).invoke(obj);
                break;
            case 1:
                ((qjg0) izsVar).invoke(obj);
                break;
            case 2:
                ((b8e) izsVar).invoke(obj);
                break;
            case 3:
                ((rzl0) izsVar).invoke(obj);
                break;
            case 4:
                ((zum) izsVar).invoke(obj);
                break;
            case 5:
                ((rzl0) izsVar).invoke(obj);
                break;
            case 6:
                ((w9l0) izsVar).invoke(obj);
                break;
            case 7:
                ((rzl0) izsVar).invoke(obj);
                break;
            default:
                ((aiw0) izsVar).invoke(obj);
                break;
        }
    }
}

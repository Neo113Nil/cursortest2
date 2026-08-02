package xsna;

import com.vk.topics.impl.fragments.BoardTopicsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gj7 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ gj7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                int i2 = BoardTopicsFragment.S0;
                izsVar.invoke(obj);
                break;
            default:
                izsVar.invoke(obj);
                break;
        }
    }
}

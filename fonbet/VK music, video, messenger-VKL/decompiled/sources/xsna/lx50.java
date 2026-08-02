package xsna;

import com.vk.newsfeed.common.util.NewsfeedViewPostCache;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lx50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ lx50(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((kx50) this.c).invoke(obj);
                break;
            default:
                ((NewsfeedViewPostCache.a) this.c).invoke(obj);
                break;
        }
    }
}

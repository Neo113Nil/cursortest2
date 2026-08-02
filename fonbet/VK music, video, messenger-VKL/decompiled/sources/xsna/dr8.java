package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class dr8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dr8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                break;
            case 1:
                break;
            case 2:
                mvh mvhVar = (mvh) this.c;
                super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.t();
                super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.U((List) obj, false);
                break;
            default:
                ((lq9) this.c).resumeWith(obj);
                break;
        }
        return s3q0.a;
    }

    public dr8(rf rfVar, wow wowVar) {
        this.b = 1;
        this.c = wowVar;
    }
}

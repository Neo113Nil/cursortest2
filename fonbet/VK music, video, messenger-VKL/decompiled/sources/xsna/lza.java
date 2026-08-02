package xsna;

import android.view.View;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.dto.shortvideo.ClipsAuthor;
import xsna.ixe;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lza implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lza(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((izs) this.c).invoke(new ixe.g((ClipsAuthor) ((rvd0) this.d).a, ((lvd0) this.e).b));
                break;
            case 2:
                break;
            case 3:
                izs izsVar = (izs) this.c;
                DraftShortVideoListView.d dVar = (DraftShortVideoListView.d) this.d;
                izsVar.invoke(new DraftShortVideoListView.c.b(((DraftShortVideoListView.d.a) dVar).b, (View) this.e));
                break;
            default:
                ((izs) this.c).invoke(new o9t.m(m6t.a((l6t) this.d, ((k6t) this.e).c)));
                break;
        }
        return s3q0.a;
    }
}

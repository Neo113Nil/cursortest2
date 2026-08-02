package xsna;

import android.content.DialogInterface;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import xsna.bh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j9a implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                n9a n9aVar = (n9a) this.c;
                boolean z = n9aVar.p;
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = n9aVar.n;
                if (z || !musicClipsSelectorCatalogRootVh.m.b.i.h()) {
                    musicClipsSelectorCatalogRootVh.m.b.i.stop(32);
                } else {
                    musicClipsSelectorCatalogRootVh.m.b.i.pause(6);
                    n9aVar.p = false;
                }
                pgn pgnVar = n9aVar.t;
                qcy<Object> qcyVar = n9a.x[0];
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
                if (cVar != null) {
                    cVar.dispose();
                }
                bh6.m.onNext(new bh6.b(dialogInterface));
                break;
            case 1:
                ((cb) this.c).invoke();
                break;
            default:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}

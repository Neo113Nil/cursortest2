package xsna;

import com.vk.newsfeed.impl.presenters.EntriesListPresenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gn7 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gn7(EntriesListPresenter entriesListPresenter, boolean z) {
        this.d = entriesListPresenter;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.d;
                if (!this.c) {
                    gzsVar.invoke();
                }
                break;
            default:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.d;
                entriesListPresenter.Y();
                if (this.c) {
                    entriesListPresenter.C();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gn7(boolean z, gzs gzsVar) {
        this.c = z;
        this.d = gzsVar;
    }
}

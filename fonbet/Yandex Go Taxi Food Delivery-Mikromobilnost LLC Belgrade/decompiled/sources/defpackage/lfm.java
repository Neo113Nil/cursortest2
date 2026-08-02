package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final /* synthetic */ class lfm implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ lfm(WeakReference weakReference, int i) {
        this.a = i;
        this.b = weakReference;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                mfm mfmVar = (mfm) weakReference.get();
                if (mfmVar != null) {
                    mfmVar.a();
                    break;
                }
                break;
            default:
                a9z a9zVar = (a9z) weakReference.get();
                if (a9zVar != null) {
                    a9zVar.a();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}

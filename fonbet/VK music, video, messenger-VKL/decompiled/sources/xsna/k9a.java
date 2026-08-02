package xsna;

import android.content.DialogInterface;
import xsna.bh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k9a implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                n9a n9aVar = (n9a) this.c;
                n9aVar.p = true;
                pgn pgnVar = n9aVar.t;
                qcy<Object> qcyVar = n9a.x[0];
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
                if (cVar != null) {
                    cVar.dispose();
                }
                bh6.m.onNext(new bh6.a(dialogInterface));
                break;
            default:
                ((xye) this.c).invoke(dialogInterface);
                break;
        }
    }
}

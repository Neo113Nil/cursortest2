package xsna;

import java.io.File;
import ru.ok.android.util.FileUtilKt;
import xsna.a3i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class k66 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                r0c r0cVar = (r0c) this.c;
                r0cVar.s0(r0cVar.u - 1);
                r0cVar.t0(r0cVar.v - 1);
                break;
            case 1:
                FileUtilKt.deleteSafely$default((File) this.c, null, 1, null);
                break;
            default:
                x2i x2iVar = ((j7h) this.c).g;
                if (x2iVar != null) {
                    x2iVar.mn(a3i.c.a);
                    break;
                }
                break;
        }
    }
}

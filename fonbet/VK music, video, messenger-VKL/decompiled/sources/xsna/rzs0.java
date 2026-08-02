package xsna;

import com.ironsource.V0;
import com.ironsource.W2;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rzs0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rzs0(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PrivateFiles.a b;
        switch (this.b) {
            case 0:
                c0t0 c0t0Var = (c0t0) this.d;
                long j = this.c;
                r6m r6mVar = r6m.a;
                b = e8r.a.b(r5, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
                String absolutePath = b.a.getAbsolutePath();
                r6mVar.getClass();
                if (r6m.b(absolutePath) - 52428800 <= j) {
                    fxc0.B().a();
                    c0t0Var.k = false;
                    break;
                } else {
                    c0t0Var.k = true;
                    break;
                }
            default:
                W2.a.a((V0) this.d, this.c);
                break;
        }
    }
}

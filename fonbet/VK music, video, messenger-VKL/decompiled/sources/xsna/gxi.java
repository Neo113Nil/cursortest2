package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.Source;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import xsna.ipz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class gxi implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gxi(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ixi ixiVar = (ixi) this.c;
                com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.d;
                uxi uxiVar = ixiVar.b;
                synchronized (uxiVar) {
                    FileOutputStream openFileOutput = uxiVar.a.openFileOutput(uxiVar.b, 0);
                    try {
                        openFileOutput.write(aVar.toString().getBytes(C.UTF8_NAME));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
            default:
                ipz.a aVar2 = (ipz.a) this.c;
                w920 w920Var = (w920) this.d;
                return new jpz((aVar2.b == Source.CACHE ? w920Var.a : w920Var.b).b(aVar2.a, aVar2.c), aVar2.b);
        }
    }
}

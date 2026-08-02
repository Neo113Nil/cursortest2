package xsna;

import android.content.Intent;
import android.util.SparseArray;
import com.vk.core.widget.LifecycleHandler;
import xsna.bcw0;
import xsna.dcw0;
import xsna.icw0;

/* compiled from: VoiceRecognitionControllerImpl.kt */
/* loaded from: classes7.dex */
public final class ecw0 extends b5z {
    public final /* synthetic */ bcw0 d;
    public final /* synthetic */ LifecycleHandler e;

    public ecw0(LifecycleHandler lifecycleHandler, bcw0 bcw0Var) {
        this.d = bcw0Var;
        this.e = lifecycleHandler;
    }

    @Override // xsna.b5z
    public final void d(String str, int i, int i2, Intent intent) {
        if (i == 34 && str.equals(String.valueOf(this.b))) {
            dcw0 dcw0Var = dcw0.a;
            dcw0.b f = dcw0.f(i, i2, intent);
            bcw0.a aVar = new bcw0.a(f != null ? f.a : null, icw0.a.a);
            bcw0 bcw0Var = this.d;
            bcw0Var.a(aVar);
            dcw0.c.remove(bcw0Var);
            LifecycleHandler lifecycleHandler = this.e;
            for (int size = lifecycleHandler.g.size() - 1; size >= 0; size--) {
                SparseArray<String> sparseArray = lifecycleHandler.g;
                if (str.equals(sparseArray.get(sparseArray.keyAt(size)))) {
                    lifecycleHandler.g.removeAt(size);
                }
            }
            lifecycleHandler.e(this);
        }
    }
}

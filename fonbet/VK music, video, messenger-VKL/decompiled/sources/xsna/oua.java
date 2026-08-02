package xsna;

import com.vk.core.exceptions.DisposableException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oua implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oua(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                pua puaVar = (pua) this.c;
                puaVar.g = null;
                bzb0 bzb0Var = puaVar.c.j.f;
                if (bzb0Var != null) {
                    bzb0Var.a();
                    break;
                }
                break;
            case 1:
                ftb ftbVar = (ftb) this.c;
                ftbVar.k = null;
                ftbVar.e.j();
                break;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", "process was canceled"}, 2));
                atomicBoolean.set(true);
                break;
            case 3:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 4:
                ((gzs) this.c).invoke();
                break;
            case 5:
                ((Ref$BooleanRef) this.c).element = true;
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}

package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sih implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sih(x5n x5nVar, boolean z) {
        this.d = x5nVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                wih.a aVar = (wih.a) this.d;
                if (!this.c) {
                    boolean z = aVar.F;
                    ViewPager2 viewPager2 = aVar.z;
                    if (!z && ((FragmentImpl) aVar.o.b).mo2getContext() != null) {
                        aVar.q6(viewPager2.getCurrentItem());
                        aVar.y.y0(viewPager2.getCurrentItem());
                        aVar.F = true;
                        break;
                    }
                }
                break;
            default:
                jse0 jse0Var = ((x5n) this.d).c;
                if (jse0Var != null) {
                    jse0Var.c(this.c);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sih(boolean z, wih.a aVar) {
        this.c = z;
        this.d = aVar;
    }
}

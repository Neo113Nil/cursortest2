package xsna;

import com.vk.core.fragments.BaseFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qt2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ qt2(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                break;
            default:
                int i2 = BaseFragment.R;
                gzsVar.invoke();
                break;
        }
    }
}

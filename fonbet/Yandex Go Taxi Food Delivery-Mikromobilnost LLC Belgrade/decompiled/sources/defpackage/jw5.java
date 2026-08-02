package defpackage;

import com.ybsdk.core.presentation.BindingFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class jw5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BindingFragment b;
    public final /* synthetic */ sls c;

    public /* synthetic */ jw5(BindingFragment bindingFragment, sls slsVar, int i) {
        this.a = i;
        this.b = bindingFragment;
        this.c = slsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sls slsVar = this.c;
        BindingFragment bindingFragment = this.b;
        switch (i) {
            case 0:
                BindingFragment.safePostDelayed$lambda$9(bindingFragment, slsVar);
                break;
            default:
                BindingFragment.safePost$lambda$8(bindingFragment, slsVar);
                break;
        }
    }
}

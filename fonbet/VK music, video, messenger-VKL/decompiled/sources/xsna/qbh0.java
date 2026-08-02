package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.vk.navigation.NavigationDelegateActivity;
import xsna.vbh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qbh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qbh0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.e5z, xsna.kbh0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.jbh0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                f5z f5zVar = (f5z) this.c;
                final View view = (View) this.d;
                final wh50 wh50Var = (wh50) this.e;
                final wh50 wh50Var2 = (wh50) this.f;
                ?? r5 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.jbh0
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        View view2 = view;
                        wh50Var.setValue(Boolean.valueOf(view2.isShown() && view2.isAttachedToWindow()));
                    }
                };
                ?? r2 = new androidx.lifecycle.l() { // from class: xsna.kbh0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        int i = vbh0.a.$EnumSwitchMapping$0[event.ordinal()];
                        wh50 wh50Var3 = wh50.this;
                        wh50Var3.setValue(Boolean.valueOf(i != 1 ? i != 2 ? ((Boolean) wh50Var3.getValue()).booleanValue() : false : true));
                    }
                };
                f5zVar.getLifecycle().addObserver(r2);
                view.getViewTreeObserver().addOnGlobalLayoutListener(r5);
                return new vbh0.c(f5zVar, r2, view, r5);
            default:
                ymj0 ymj0Var = (ymj0) this.c;
                zzl0 zzl0Var = (zzl0) this.d;
                hwi0 hwi0Var = (hwi0) this.f;
                NavigationDelegateActivity navigationDelegateActivity = ((ww50) obj).b;
                Object obj2 = this.e;
                ymj0Var.b(navigationDelegateActivity, (String) zzl0Var.invoke(obj2), (String) hwi0Var.invoke(obj2));
                return s3q0.a;
        }
    }
}

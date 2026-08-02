package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.h7u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class aw8 implements io.reactivex.rxjava3.core.a0, pcs {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aw8(FragmentActivity fragmentActivity, Ref$ObjectRef ref$ObjectRef, ew8 ew8Var, Ref$ObjectRef ref$ObjectRef2) {
        this.b = fragmentActivity;
        this.c = ref$ObjectRef;
        this.e = ew8Var;
        this.d = ref$ObjectRef2;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ubr0 ubr0Var = (ubr0) this.b;
        FragmentManager fragmentManager = (FragmentManager) this.c;
        iml0 iml0Var = (iml0) this.d;
        ubr0Var.a(bundle, fragmentManager, iml0Var, (fgu0) this.e);
        ubr0Var.b(bundle, iml0Var);
        if (bundle.getBoolean("DIALOG_IS_BANNER_AD_EVENT")) {
            ubr0Var.h.a(bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        dw20.a i;
        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        ew8 ew8Var = (ew8) this.e;
        Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
        if (!fxc0.B().J().Z0()) {
            i = new dw20.b(fragmentActivity, null).i((RecyclerView.Adapter) ref$ObjectRef.element, (r3 & 2) == 0, false);
            dw20.b h0 = ((dw20.b) i).h0(R.string.sett_clear_cache, new nh3(ew8Var, ref$ObjectRef2, yVar));
            u8 u8Var = new u8(ew8Var, yVar);
            h0.getClass();
            h0.d.Y0 = u8Var;
            yVar.a(new dw8(h0.a0(new defpackage.j(ew8Var, yVar)).I0("clearCache"), 0));
            return;
        }
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(fragmentActivity);
        c.g0(R.string.sett_clear_cache_confirmation_message);
        c.W(R.string.sett_clear_cache_confirmation_dismiss, new ij7(ew8Var, yVar));
        c.c0(R.string.sett_clear_cache_confirmation_confirm, new bw8(ew8Var, ref$ObjectRef2, yVar));
        final androidx.appcompat.app.d m = c.m();
        yVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.cw8
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                androidx.appcompat.app.d dVar = androidx.appcompat.app.d.this;
                if (dVar != null) {
                    dVar.hide();
                }
            }
        });
    }

    public /* synthetic */ aw8(ubr0 ubr0Var, FragmentManager fragmentManager, iml0 iml0Var, fgu0 fgu0Var) {
        this.b = ubr0Var;
        this.c = fragmentManager;
        this.d = iml0Var;
        this.e = fgu0Var;
    }
}

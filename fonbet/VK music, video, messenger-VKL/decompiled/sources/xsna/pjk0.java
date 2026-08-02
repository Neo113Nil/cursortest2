package xsna;

import android.view.View;
import com.vk.dto.specials.SpecialEvent;
import com.vk.dto.status.StatusImagePopup;
import com.vk.navigation.NavigationDelegateActivity;
import java.lang.ref.WeakReference;
import xsna.ljk0;

/* compiled from: SpecialEventsNavigationDelegate.kt */
/* loaded from: classes.dex */
public final class pjk0 {
    public final ni6 a;
    public final NavigationDelegateActivity b;
    public io.reactivex.rxjava3.disposables.c c;
    public a2e0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public SpecialEvent h;
    public mjk0 j;
    public WeakReference<View> k;
    public int l;
    public ljk0 i = ljk0.b.a;
    public final o8i m = new o8i(this, 3);
    public final zir n = new zir(this, 3);
    public final ek80 o = new ek80(this, 1);
    public final nwi p = new nwi(this, 1);
    public final njk0 q = new Runnable() { // from class: xsna.njk0
        @Override // java.lang.Runnable
        public final void run() {
            String id;
            pjk0 pjk0Var = pjk0.this;
            ljk0 ljk0Var = pjk0Var.i;
            boolean z = pjk0Var.g;
            if (!(ljk0Var instanceof ljk0.c) || !z) {
                if ((ljk0Var instanceof ljk0.a) && z) {
                    pjk0Var.e = false;
                    return;
                }
                return;
            }
            StatusImagePopup a = ((ljk0.c) ljk0Var).a();
            pjk0Var.i = ljk0.b.a;
            pjk0Var.g = false;
            pjk0Var.e = false;
            SpecialEvent specialEvent = pjk0Var.h;
            if (specialEvent == null || (id = specialEvent.getId()) == null) {
                return;
            }
            sjk0.a(pjk0Var.b, a, id);
        }
    };
    public final ojk0 r = new ojk0(this);

    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.njk0] */
    public pjk0(ni6 ni6Var, NavigationDelegateActivity navigationDelegateActivity) {
        this.a = ni6Var;
        this.b = navigationDelegateActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        hsx0 hsx0Var;
        Integer Ck;
        ni6 ni6Var = this.a;
        if ((ni6Var instanceof hsx0) && (Ck = ((hsx0) ni6Var).Ck()) != null) {
            return Ck.intValue();
        }
        if (ni6Var.A()) {
            fcn z = ni6Var.z();
            if (z instanceof hsx0) {
                hsx0Var = (hsx0) z;
            }
            hsx0Var = null;
        } else {
            androidx.lifecycle.f u = ni6Var.u();
            if (u instanceof hsx0) {
                hsx0Var = (hsx0) u;
            }
            hsx0Var = null;
        }
        Integer Ck2 = hsx0Var != null ? hsx0Var.Ck() : null;
        if (Ck2 != null) {
            return Ck2.intValue();
        }
        return 0;
    }

    public final void b(io.reactivex.rxjava3.disposables.c cVar) {
        if (cVar != null) {
            this.c = cVar;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.c;
        if (cVar2 != null) {
            a2e0 a2e0Var = new a2e0(new cck0(this, 1));
            this.d = a2e0Var;
            a2e0Var.b(cVar2);
            a2e0 a2e0Var2 = this.d;
            if (a2e0Var2 != null) {
                a2e0Var2.c(300L);
            }
        }
    }
}

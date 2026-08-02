package xsna;

import android.view.ViewGroup;

/* compiled from: VoipCallViewContactCallIsAnonNotificationDelegate.kt */
/* loaded from: classes7.dex */
public final class ekw0 {
    public static final int d = cn70.b(12);
    public final ViewGroup a;
    public io.reactivex.rxjava3.disposables.c b;
    public ikv0 c;

    public ekw0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(boolean z) {
        if (z) {
            io.reactivex.rxjava3.disposables.c cVar = this.b;
            if (cVar != null) {
                cVar.dispose();
            }
            com.vk.voip.ui.c.b.getClass();
            this.b = com.vk.voip.ui.c.W().b(true).a0(asu0.a.d()).subscribe(new z2v0(new fvq0(this, 19), 4));
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.b = null;
        ikv0 ikv0Var = this.c;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.c = null;
    }
}

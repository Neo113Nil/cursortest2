package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import defpackage.jhf0;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes11.dex */
public final class cmk implements Runnable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public cmk(j jVar, boolean z) {
        this.b = z;
        Objects.requireNonNull(jVar);
        this.c = jVar;
    }

    public void a(Handler handler) {
        if (this.b) {
            return;
        }
        handler.post(this);
        this.b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r5 != r1) goto L22;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                ((SwitchCompat) ((View) this.c)).setChecked(this.b);
                return;
            case 1:
                kp01 kp01Var = (kp01) this.c;
                int height = kp01Var.s.title().getHeight();
                View view = kp01Var.r;
                AnimatedListItemInputComponent animatedListItemInputComponent = kp01Var.s;
                view.setTop(animatedListItemInputComponent.title().getTop());
                if (this.b) {
                    view.setLeft(animatedListItemInputComponent.title().getLeft());
                    view.setRight(animatedListItemInputComponent.title().getLeft() + height);
                    return;
                } else {
                    view.setRight(animatedListItemInputComponent.title().getRight());
                    view.setLeft(animatedListItemInputComponent.title().getRight() - height);
                    return;
                }
            case 2:
                wt31 wt31Var = (wt31) this.c;
                synchronized (wt31Var.a) {
                    try {
                        jhf0 jhf0Var = wt31Var.a;
                        if (jhf0Var.b.b <= 0) {
                            Iterator it = jhf0Var.c.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                } else if (((jhf0.a) ((Map.Entry) it.next()).getValue()).b > 0) {
                                }
                            }
                        }
                        if (z) {
                            wt31Var.a.b();
                        }
                        wt31Var.a.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = false;
                return;
            default:
                j jVar = (j) this.c;
                g gVar = (g) jVar.b;
                boolean a = gVar.a();
                boolean z2 = gVar.R != null && gVar.R.booleanValue();
                boolean z3 = this.b;
                gVar.R = Boolean.valueOf(z3);
                if (z2 == z3) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.b(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (gVar.a() != a) {
                    boolean a2 = gVar.a();
                    if (gVar.R == null || !gVar.R.booleanValue()) {
                        z = false;
                        break;
                    }
                }
                y1a1 y1a1Var2 = gVar.y;
                g.g(y1a1Var2);
                y1a1Var2.E.c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(a));
                jVar.Yg();
                return;
        }
    }

    public cmk(TransferRequirementModalView transferRequirementModalView, kp01 kp01Var, boolean z) {
        this.c = kp01Var;
        this.b = z;
    }

    public cmk(View view, boolean z) {
        this.c = view;
        this.b = z;
    }

    public cmk(wt31 wt31Var) {
        this.c = wt31Var;
    }
}

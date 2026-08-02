package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.node.s;
import defpackage.ewd0;
import defpackage.kx91;
import defpackage.ny61;
import defpackage.tis0;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends ewd0 {
    public PointerInteropFilter.DispatchToViewState b = PointerInteropFilter.DispatchToViewState.Unknown;
    public tvd0 c;
    public final /* synthetic */ PointerInteropFilter d;

    public c(PointerInteropFilter pointerInteropFilter) {
        this.d = pointerInteropFilter;
    }

    public final void a(tvd0 tvd0Var, boolean z) {
        List a = tvd0Var.a();
        List list = a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((zvd0) a.get(i)).j()) {
                d(tvd0Var);
                return;
            }
        }
        s sVar = this.a;
        if (sVar == null) {
            ny61.r("layoutCoordinates not set");
            return;
        }
        long v = sVar.v(0L);
        final PointerInteropFilter pointerInteropFilter = this.d;
        e.c(tvd0Var, v, new tls() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    c cVar = c.this;
                    tls tlsVar = pointerInteropFilter.a;
                    cVar.b = ((Boolean) (tlsVar != null ? tlsVar : null).invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                } else {
                    tls tlsVar2 = pointerInteropFilter.a;
                    (tlsVar2 != null ? tlsVar2 : null).invoke(motionEvent);
                }
                return zy11.a;
            }
        });
        if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((zvd0) a.get(i2)).a();
                }
            }
            tis0 b = tvd0Var.b();
            if (b != null) {
                b.Z(!pointerInteropFilter.c);
            }
        }
    }

    public final void b() {
        if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            PointerInteropFilter pointerInteropFilter = this.d;
            e.a(uptimeMillis, new PointerInteropFilter$pointerInputFilter$1$onCancel$1(pointerInteropFilter));
            this.b = PointerInteropFilter.DispatchToViewState.Unknown;
            pointerInteropFilter.c = false;
            this.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(tvd0 tvd0Var, PointerEventPass pointerEventPass) {
        boolean z;
        boolean z2;
        PointerInteropFilter pointerInteropFilter;
        boolean z3;
        List a = tvd0Var.a();
        List list = a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zvd0 zvd0Var = (zvd0) a.get(i);
            if (kx91.b(zvd0Var) || kx91.d(zvd0Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!((zvd0) a.get(i2)).j()) {
                }
            }
            z2 = true;
            pointerInteropFilter = this.d;
            if (!pointerInteropFilter.c) {
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        zvd0 zvd0Var2 = (zvd0) a.get(i3);
                        if (kx91.b(zvd0Var2) || kx91.d(zvd0Var2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (this.b != PointerInteropFilter.DispatchToViewState.NotDispatching) {
                if (pointerEventPass == PointerEventPass.Initial && z3) {
                    this.c = tvd0Var;
                    a(tvd0Var, !z || pointerInteropFilter.c);
                }
                if (pointerEventPass == PointerEventPass.Main && z && tvd0Var == this.c && pointerInteropFilter.c) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((zvd0) a.get(i4)).a();
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && !z3 && tvd0Var != this.c) {
                    a(tvd0Var, true);
                }
            }
            if (pointerEventPass != PointerEventPass.Final) {
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        this.b = PointerInteropFilter.DispatchToViewState.Unknown;
                        pointerInteropFilter.c = false;
                        this.c = null;
                        break;
                    } else if (!kx91.d((zvd0) a.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (tvd0Var == this.c && z) {
                    int size6 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!((zvd0) a.get(i6)).j()) {
                            i6++;
                        } else if (!pointerInteropFilter.c) {
                            d(tvd0Var);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        ((zvd0) a.get(i7)).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        pointerInteropFilter = this.d;
        if (!pointerInteropFilter.c) {
        }
        z3 = true;
        if (this.b != PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pointerEventPass != PointerEventPass.Final) {
        }
    }

    public final void d(tvd0 tvd0Var) {
        if (this.b == PointerInteropFilter.DispatchToViewState.Dispatching) {
            s sVar = this.a;
            if (sVar == null) {
                ny61.r("layoutCoordinates not set");
                return;
            } else {
                long v = sVar.v(0L);
                final PointerInteropFilter pointerInteropFilter = this.d;
                e.b(tvd0Var, v, new tls() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        MotionEvent motionEvent = (MotionEvent) obj;
                        tls tlsVar = PointerInteropFilter.this.a;
                        if (tlsVar == null) {
                            tlsVar = null;
                        }
                        tlsVar.invoke(motionEvent);
                        return zy11.a;
                    }
                });
            }
        }
        this.b = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }
}

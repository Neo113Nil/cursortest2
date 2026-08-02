package xsna;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.vk.core.ui.tracking.UiTracker;

/* compiled from: EasterEggsUi.kt */
/* loaded from: classes14.dex */
public final class kvo implements androidx.lifecycle.l {
    public final bpn0 b = new bpn0(new x5(16));
    public final hv1 c;
    public final /* synthetic */ nvo d;

    /* compiled from: EasterEggsUi.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kvo(lvo lvoVar, nvo nvoVar) {
        this.d = nvoVar;
        this.c = new hv1(lvoVar, 4);
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        nvo nvoVar = this.d;
        if (i == 1) {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.a(nvoVar);
            return;
        }
        bpn0 bpn0Var = this.b;
        hv1 hv1Var = this.c;
        if (i == 2) {
            ((Handler) bpn0Var.getValue()).post(hv1Var);
            return;
        }
        if (i == 3) {
            ((Handler) bpn0Var.getValue()).removeCallbacks(hv1Var);
        } else {
            if (i != 4) {
                return;
            }
            UiTracker uiTracker2 = UiTracker.a;
            UiTracker.g(nvoVar);
        }
    }
}

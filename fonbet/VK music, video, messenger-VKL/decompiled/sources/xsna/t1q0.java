package xsna;

import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import xsna.q0q0;

/* compiled from: UiTrackingPath.kt */
/* loaded from: classes.dex */
public final class t1q0 {
    public UiTrackingScreen b;
    public UiTrackingScreen c;
    public WeakReference<Fragment> a = new WeakReference<>(null);
    public final LinkedList<UiTrackingScreen> d = new LinkedList<>();
    public final int e = 16;
    public final q0q0 f = new q0q0(this);

    public final Stack<UiTrackingScreen> a() {
        ArrayList arrayList = this.f.b;
        if (!arrayList.isEmpty()) {
            return ((q0q0.a) j5g.i0(arrayList)).d;
        }
        L.G("WTF? Is there no active activity?");
        return new Stack<>();
    }

    public final UiTrackingScreen b() {
        return !a().isEmpty() ? a().peek() : this.c;
    }

    public final UiTrackingScreen c() {
        return !a().isEmpty() ? a().pop() : this.c;
    }

    public final void d(UiTrackingScreen uiTrackingScreen, boolean z) {
        if (uiTrackingScreen.d != UiTrackingScreen.Companion.DialogType.DIALOG_ALERT && !uiTrackingScreen.d()) {
            UiTrackingScreen uiTrackingScreen2 = this.b;
            this.c = uiTrackingScreen2;
            if (uiTrackingScreen2 != null) {
                q0q0.a aVar = (q0q0.a) j5g.b0(e43.h(r0) - 1, this.f.b);
                if (aVar != null && aVar.c.contains(uiTrackingScreen2)) {
                    aVar.b = uiTrackingScreen2;
                }
            }
        } else if (z) {
            a().push(this.b);
        }
        e(uiTrackingScreen);
    }

    @ozl
    public final void e(UiTrackingScreen uiTrackingScreen) {
        this.b = uiTrackingScreen;
        if (uiTrackingScreen.d != UiTrackingScreen.Companion.DialogType.DIALOG_ALERT && !uiTrackingScreen.d()) {
            LinkedList<UiTrackingScreen> linkedList = this.d;
            if (!epx.f(j5g.k0(linkedList), uiTrackingScreen)) {
                linkedList.addLast(uiTrackingScreen);
                while (linkedList.size() > this.e) {
                    linkedList.pollFirst();
                }
            }
        }
        ArrayList arrayList = this.f.b;
        if (arrayList.isEmpty()) {
            return;
        }
        q0q0.a aVar = (q0q0.a) j5g.i0(arrayList);
        aVar.b = uiTrackingScreen;
        aVar.c.add(uiTrackingScreen);
    }
}

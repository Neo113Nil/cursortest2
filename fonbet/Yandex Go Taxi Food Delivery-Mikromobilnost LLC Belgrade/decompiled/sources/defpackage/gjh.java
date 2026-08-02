package defpackage;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import flex.feature.navigation.fragments.DocumentEngineDialogFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class gjh implements o3l0 {
    public final Handler A = new Handler(Looper.getMainLooper());
    public final FragmentManager a;
    public final int b;
    public final ejh c;
    public final oyl w;
    public final cjh x;
    public final l190 y;
    public final ukr z;

    public gjh(FragmentManager fragmentManager, int i, ejh ejhVar, oyl oylVar, cjh cjhVar, qgh qghVar, vkr vkrVar) {
        this.a = fragmentManager;
        this.b = i;
        this.c = ejhVar;
        this.w = oylVar;
        this.x = cjhVar;
        this.y = qghVar;
        this.z = vkrVar;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public boolean backward(boolean z, Map map) {
        FragmentManager fragmentManager = this.a;
        if (fragmentManager.c.f().isEmpty()) {
            return false;
        }
        if (z) {
            a aVar = new a(fragmentManager);
            aVar.i(tmg0.slide_in_right, tmg0.slide_out_to_right, tmg0.slide_in_left, tmg0.slide_out_to_left);
            aVar.m();
        }
        fragmentManager.V();
        return fragmentManager.c.f().size() > 1;
    }

    @Override // defpackage.o3l0
    public final boolean dismiss(boolean z, kr krVar, Map map) {
        FragmentManager fragmentManager = this.a;
        if (krVar != null) {
            Iterator it = kotlin.collections.a.O0(fragmentManager.c.f()).iterator();
            Object obj = null;
            while (true) {
                irv irvVar = (irv) it;
                if (!irvVar.c.hasNext()) {
                    break;
                }
                Object next = irvVar.next();
                hrv hrvVar = (hrv) next;
                int i = hrvVar.a;
                Fragment fragment = (Fragment) hrvVar.b;
                if (i != scc.f(fragmentManager.c.f()) && (fragment instanceof zu)) {
                    obj = next;
                }
            }
            hrv hrvVar2 = (hrv) obj;
            Object obj2 = hrvVar2 != null ? (Fragment) hrvVar2.b : null;
            zu zuVar = obj2 instanceof zu ? (zu) obj2 : null;
            if (zuVar != null) {
                zuVar.dispatchAction(krVar);
            }
        }
        Fragment fragment2 = (Fragment) kotlin.collections.a.b0(fragmentManager.c.f());
        if (!(fragment2 instanceof DialogFragment)) {
            return backward(z, map);
        }
        Dialog dialog = ((DialogFragment) fragment2).getDialog();
        if (dialog instanceof BottomSheetDialog) {
            ((BottomSheetDialog) dialog).setDismissWithAnimation(z);
        }
        this.A.post(new oxe(21, this));
        return !fragmentManager.c.f().isEmpty();
    }

    @Override // defpackage.o3l0
    public boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map) {
        Fragment a = this.c.a(u1mVar, ywlVar, map);
        FragmentManager fragmentManager = this.a;
        a h = g8e.h(fragmentManager, fragmentManager);
        if (z) {
            h.i(tmg0.slide_in_left, tmg0.slide_out_to_left, tmg0.slide_in_right, tmg0.slide_out_to_right);
        }
        h.f(this.b, a, null, 1);
        Object obj = ((LinkedHashMap) map).get("flexNavigationBackstackTag");
        h.c(obj != null ? obj.toString() : null);
        h.p = true;
        h.l(true, true);
        return true;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    public final boolean hideOverlay(String str, boolean z, Map map) {
        l190 l190Var = this.y;
        tkr evictOverlay = l190Var != null ? l190Var.evictOverlay(str) : null;
        if (evictOverlay == null) {
            return true;
        }
        evictOverlay.hideOverlay(false);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        DocumentEngineDialogFragment a = this.w.a(u1mVar, ywlVar, z2, z, map);
        FragmentManager fragmentManager = this.a;
        a h = g8e.h(fragmentManager, fragmentManager);
        Object obj = ((LinkedHashMap) map).get("flexNavigationBackstackTag");
        h.c(obj != null ? obj.toString() : null);
        h.p = true;
        return a.show(h, (String) null) >= 0;
    }

    @Override // defpackage.o3l0
    public final boolean showOverlay(String str, ywl ywlVar, Map map) {
        tkr overlay;
        l190 l190Var = this.y;
        if (l190Var == null) {
            h5z0.a.d("showOverlay is called while overlayManager is null", new Object[0]);
            return false;
        }
        ukr ukrVar = this.z;
        if (ukrVar == null) {
            h5z0.a.d("showOverlay is called while flexOverlayControllerFactory is null", new Object[0]);
            return false;
        }
        tkr create = ukrVar.create(new xjg(this, str, false, 6));
        if (l190Var.contains(str) && (overlay = l190Var.getOverlay(str)) != null) {
            overlay.hideOverlay(true);
        }
        l190Var.addOverlay(str, create);
        create.showOverlay(ywlVar);
        return true;
    }

    @Override // defpackage.o3l0
    public final boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar) {
        BottomSheetDialogFragment create = this.x.create(u1mVar, ywlVar, z, z2, z3, z4, f, z5, map);
        create.getLifecycle().a(new fjh(0, new jhd(27, krVar, this)));
        FragmentManager fragmentManager = this.a;
        a h = g8e.h(fragmentManager, fragmentManager);
        Object obj = map.get("flexNavigationBackstackTag");
        h.c(obj != null ? obj.toString() : null);
        h.p = true;
        return create.show(h, (String) null) >= 0;
    }
}

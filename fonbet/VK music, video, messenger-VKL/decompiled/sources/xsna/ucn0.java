package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import java.util.HashMap;
import xsna.zif0;

/* compiled from: SuperAppWidgetBaseHolder.kt */
/* loaded from: classes6.dex */
public abstract class ucn0<Item extends zif0> extends hf6<Item> implements b2q0<Item> {
    public final wxt0 m;
    public final HashMap<View, VKImageController<View>> n;
    public Item o;

    static {
        iah0.a(24);
    }

    public ucn0(View view, wxt0 wxt0Var) {
        super(view);
        this.m = wxt0Var;
        this.n = new HashMap<>();
    }

    public static void a6(ucn0 ucn0Var, ViewGroup viewGroup, String str, int i, boolean z, int i2) {
        ucn0Var.b6(viewGroup).f(str, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, (i2 & 8) != 0 ? false : z, i, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65514));
    }

    @Override // xsna.b2q0
    public final Object A5() {
        return this.o;
    }

    @Override // xsna.hf6
    public final void V5(Item item) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.o = item;
        super.V5(item);
        wxt0 wxt0Var = this.m;
        if (wxt0Var != null) {
            wxt0Var.a(this, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        }
    }

    public final VKImageController<View> b6(ViewGroup viewGroup) {
        HashMap<View, VKImageController<View>> hashMap = this.n;
        VKImageController<View> vKImageController = hashMap.get(viewGroup);
        if (vKImageController != null) {
            return vKImageController;
        }
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(viewGroup.getContext());
        hashMap.put(viewGroup, create);
        viewGroup.addView(((com.vk.core.ui.image.c) create).getView());
        return create;
    }
}

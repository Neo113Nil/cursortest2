package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes13.dex */
public final class sln0 implements zm {
    public final /* synthetic */ SwipeDismissBehavior b;

    public sln0(SwipeDismissBehavior swipeDismissBehavior) {
        this.b = swipeDismissBehavior;
    }

    @Override // xsna.zm
    public final boolean a(@NonNull View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.b;
        if (!swipeDismissBehavior.D(view)) {
            return false;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        com.google.android.material.snackbar.e eVar = swipeDismissBehavior.c;
        if (eVar != null) {
            eVar.a(view);
        }
        return true;
    }
}

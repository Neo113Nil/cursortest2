package xsna;

import android.view.ContextThemeWrapper;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photogallery.GallerySelectionStrategy;
import com.vk.photogallery.view.CoordinatorLayoutWithContextMenuDelegate;
import com.vkontakte.android.R;
import java.util.List;
import xsna.sx40;
import xsna.w2t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m17 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((izs) obj4).invoke(new sx40.c0(swe0.g(an10.b(((Number) ((wh50) obj3).getValue()).floatValue() * 100), 0, 100)));
                ((wh50) obj2).setValue(Boolean.FALSE);
                eyx eyxVar = (eyx) ((wh50) obj).getValue();
                if (eyxVar != null) {
                    eyxVar.b(null);
                }
                break;
            case 1:
                q1t0 q1t0Var = (q1t0) obj4;
                u95 u95Var = (u95) obj2;
                t95 t95Var = (t95) obj;
                boolean z = ((r1t0) obj3).a;
                boolean z2 = u95Var.e;
                boolean z3 = u95Var.f;
                com.vk.repository.internal.repos.stickers.suggests.a aVar = t95Var.b;
                izs<Boolean, s3q0> izsVar = t95Var.a;
                gzs<s3q0> gzsVar = t95Var.c;
                rg50 rg50Var = q1t0Var.g;
                q1t0Var.c(false);
                q1t0Var.f(false);
                aVar.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                if (!z) {
                    q1t0Var.d(false);
                    q1t0Var.b(false);
                    izsVar.invoke(Boolean.FALSE);
                    q1t0Var.e(false);
                    if (!z3) {
                        gzsVar.invoke();
                    }
                } else if (z3) {
                    wak0 wak0Var = (wak0) rg50Var;
                    wak0Var.C(wak0Var.getIntValue() + 1);
                } else if (z2) {
                    gzsVar.invoke();
                }
                break;
            default:
                com.vk.photogallery.c cVar = new com.vk.photogallery.c(new ContextThemeWrapper((FragmentActivity) obj4, R.style.PhotoGalleryViewerTheme), new a7u0((w2t.a) obj), (List) obj3, (GallerySelectionStrategy) obj2);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, 67239968, 1);
                layoutParams.softInputMode = 17;
                layoutParams.dimAmount = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                WindowManager windowManager = cVar.e;
                CoordinatorLayoutWithContextMenuDelegate coordinatorLayoutWithContextMenuDelegate = cVar.i;
                windowManager.addView(coordinatorLayoutWithContextMenuDelegate, layoutParams);
                t210 t210Var = new t210(cVar, 17);
                qcy<Object>[] qcyVarArr = bwt0.a;
                coordinatorLayoutWithContextMenuDelegate.addOnLayoutChangeListener(new lwt0(coordinatorLayoutWithContextMenuDelegate, t210Var, 50L));
                break;
        }
        return s3q0.a;
    }
}

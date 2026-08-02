package xsna;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.sdk.controller.v;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import java.util.Map;
import ru.ok.gleffects.EffectHolder;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ke9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ke9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        pne0 pne0Var = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((me9) obj2).b((ub9.a) obj);
                break;
            case 1:
                View view = (View) obj2;
                View findViewById = view.findViewById(R.id.hand);
                ImageView imageView = (ImageView) view.findViewById(R.id.like);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(syc.a(findViewById, View.SCALE_X), syc.a(findViewById, View.SCALE_Y), syc.b(findViewById, View.TRANSLATION_X, (-findViewById.getMeasuredWidth()) * 0.15f), syc.b(findViewById, View.TRANSLATION_Y, (-findViewById.getMeasuredHeight()) * 0.2f));
                animatorSet.start();
                findViewById.postDelayed(new mx5(1, view, imageView), 450L);
                view.postDelayed(new r44((syc) obj, 7), 2000L);
                break;
            case 2:
                ((EffectHolder) obj2).lambda$updateResourcepack$2((File) obj);
                break;
            case 3:
                ((azp) ((Map.Entry) obj2).getKey()).a((qxp) obj);
                break;
            case 4:
                com.vk.core.ui.bottomsheet.actionsheet.a aVar = (com.vk.core.ui.bottomsheet.actionsheet.a) obj2;
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
                dw20 dw20Var = aVar.e;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                aVar.e = null;
                if (aVar.d) {
                    aVar.b.invoke(modalActionSheetListItem);
                    break;
                }
                break;
            case 5:
                f4m.j(((an30) obj2).a());
                d3m.c((View) obj, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 6:
                ReefContentQuality reefContentQuality = (ReefContentQuality) obj;
                Reef m = ((hwl0) obj2).m();
                if (m != null) {
                    m.a(new ReefEvent.PlayerQualityChange(reefContentQuality, ReefEvent.PlayerQualityChange.Reason.MANUAL, null));
                    break;
                }
                break;
            case 7:
                nhn0 nhn0Var = (nhn0) obj2;
                try {
                    lgd0 lgd0Var = (lgd0) ((ora) obj).get();
                    nhn0Var.n = lgd0Var;
                    ?? c = lgd0Var != null ? lgd0Var.c(nl9.c) : 0;
                    lgd0 lgd0Var2 = nhn0Var.n;
                    boolean c2 = lgd0Var2 != null ? lgd0Var2.c(nl9.b) : false;
                    if (c == 0 && !c2) {
                        pne0 pne0Var2 = nhn0Var.q;
                        if (pne0Var2 != null) {
                            pne0Var = pne0Var2;
                        }
                        pne0Var.M0();
                        break;
                    }
                    nhn0Var.k = c;
                    nhn0Var.tn();
                } catch (Throwable th) {
                    xgx0.a.getClass();
                    xgx0.d(th);
                    return;
                }
            case 8:
                ((com.my.tracker.obfuscated.n0) obj2).a((List) obj);
                break;
            default:
                ((v.s) obj2).p((String) obj);
                break;
        }
    }
}

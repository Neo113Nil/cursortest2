package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e8x;
import xsna.jm80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class hm80 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hm80(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rvu rvuVar;
        ljz0 ljz0Var;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        DonutVideoAction donutVideoAction;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                jm80.a aVar = (jm80.a) obj;
                sws0 a = ((xws0) obj2).a();
                if (a != null) {
                    String str = aVar.a.a;
                    rws0 rws0Var = a.a;
                    e8x.a aVar2 = rws0Var.b;
                    Context context = rws0Var.a;
                    n0z0 n0z0Var = (n0z0) aVar2;
                    bsz0 bsz0Var = n0z0Var.d;
                    if (bsz0Var != null && (rvuVar = bsz0Var.y0) != null) {
                        Iterator it = ((ArrayList) rvuVar.c).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ljz0Var = (ljz0) it.next();
                                if (ljz0Var.a.equals(str)) {
                                }
                            } else {
                                ljz0Var = null;
                            }
                        }
                        if (ljz0Var != null) {
                            h8z0.e(ljz0Var.f, "click", 2, null);
                            n0z0Var.a.f(bsz0Var, ljz0Var.j, ljz0Var.k, ljz0Var.i, context);
                            break;
                        }
                    }
                }
                break;
            case 1:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) obj2;
                yg5 yg5Var = (yg5) obj;
                Handler handler = eVar.u;
                handler.removeCallbacksAndMessages(null);
                if (eVar.o.getVisibility() != 0) {
                    d3m.c(eVar.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (yg5Var.w0()) {
                        handler.postDelayed(new kyc(eVar, 9), 3000L);
                        break;
                    }
                } else {
                    d3m.e(eVar.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    break;
                }
                break;
            default:
                DonutVideoUiModel donutVideoUiModel = (DonutVideoUiModel) obj2;
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) obj;
                Object obj3 = VideoItemListSmallVh.c0;
                if (donutVideoUiModel != null && (descriptionChip = donutVideoUiModel.c) != null && (donutVideoAction = descriptionChip.e) != null) {
                    videoItemListSmallVh.j(donutVideoAction, DonutVideoClickSource.DESCRIPTION);
                    break;
                }
                break;
        }
    }
}

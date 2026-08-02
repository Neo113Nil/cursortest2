package xsna;

import android.os.Bundle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewsResponseDto;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.tdo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ql2 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.d, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.c, pcs, h9l, beg {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ql2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (MarketGetCommunityReviewsResponseDto) ((kxa) this.c).invoke(obj, obj2);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
        qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
        clipsGridFragment.mo().e2(false);
        int size = clipsGridFragment.lo().k.size();
        for (int i = 0; i < size; i++) {
            androidx.lifecycle.f h = clipsGridFragment.lo().h(i);
            SwipeRefreshLayout.f fVar = h instanceof SwipeRefreshLayout.f ? (SwipeRefreshLayout.f) h : null;
            if (fVar != null) {
                fVar.h();
            }
        }
    }

    @Override // xsna.beg
    public void n(boolean z) {
        com.vk.libvideo.live.impl.views.live.b bVar = (com.vk.libvideo.live.impl.views.live.b) this.c;
        if (z) {
            bVar.K2(true);
        } else {
            bVar.L2();
        }
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        DraftsListFragment draftsListFragment = (DraftsListFragment) this.c;
        qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
        if (tdo.a.a == null) {
            throw new NoWhenBranchMatchedException();
        }
        draftsListFragment.finish();
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new jp1((oga0) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((kxa) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return new Pair((String) this.c, null);
            case 1:
            case 8:
            case 11:
            case 13:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            default:
                return (io.reactivex.rxjava3.core.t) ((cyc) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.e) ((s6) this.c).invoke(obj);
            case 3:
                return (List) ((wq3) this.c).invoke(obj);
            case 4:
                return (Integer) ((wq3) this.c).invoke(obj);
            case 5:
                return (Boolean) ((wq3) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((wq3) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((s6) this.c).invoke(obj);
            case 9:
                return (xf20) ((wq3) this.c).invoke(obj);
            case 10:
                return (List) ((wq3) this.c).invoke(obj);
            case 12:
                return (e.h) ((s6) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((wq3) this.c).invoke(obj);
            case 15:
                return (f9n) ((hxl) this.c).invoke(obj);
            case 17:
                return (w1p0) ((wq3) this.c).invoke(obj);
            case 19:
                return (Boolean) ((wq3) this.c).invoke(obj);
            case 23:
                return (Boolean) ((hyu) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((hxl) this.c).invoke(obj);
            case 25:
                return (JSONObject) ((hyu) this.c).invoke(obj);
            case 26:
                return (be10) ((hyu) this.c).invoke(obj);
            case 27:
                return (b110) ((g110) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                break;
            case 16:
                break;
            case 20:
                break;
            default:
                int i2 = MiniAppCallPiPOverlayService.e;
                break;
        }
        return ((Boolean) ((hyu) obj2).invoke(obj)).booleanValue();
    }
}

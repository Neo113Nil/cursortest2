package xsna;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.knet.core.http.metric.HttpMetrics;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerMode;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vk.superapp.core.perf.BrowserPerfState;
import java.util.List;
import xsna.eam0;
import xsna.rv9;
import xsna.tra0;
import xsna.wk50;
import xsna.x9m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bwg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bwg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.vk.core.view.components.placeholder.VkPlaceholder] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) this.c;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.d;
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.e;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = CommunityCheckListFragment.Y;
                vkScreenSpinner.setVisibility(booleanValue ? 8 : 0);
                swipeRefreshLayout.setEnabled(true);
                swipeRefreshLayout.setRefreshing(booleanValue);
                ?? r12 = communityCheckListFragment.W;
                (r12 != 0 ? r12 : null).setVisibility(8);
                break;
            case 1:
                ((y2r) this.c).f((nj50) this.d, (qih0) obj, (wzs) this.e);
                break;
            case 2:
                UIBlock uIBlock = (UIBlock) this.c;
                zc40 zc40Var = (zc40) this.d;
                CatalogViewHolder catalogViewHolder = (CatalogViewHolder) this.e;
                n3a n3aVar = (n3a) obj;
                if ((n3aVar instanceof oon0) && uIBlock.h.contains(((oon0) n3aVar).a)) {
                    io.reactivex.rxjava3.core.q d = zc40Var.a.d(uIBlock.b, null, uIBlock.Kb(), false, null);
                    asu0 asu0Var = asu0.a;
                    zc40Var.d.b(d.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new c120(new cq3(21, zc40Var, catalogViewHolder), 6), kwg0.b()));
                }
                break;
            case 3:
                wjr0 wjr0Var = (wjr0) this.c;
                cy70 cy70Var = (cy70) this.d;
                ckv ckvVar = (ckv) this.e;
                HttpMetrics httpMetrics = (HttpMetrics) obj;
                mkv mkvVar = wjr0Var.a;
                if (mkvVar != null) {
                    cy70Var.c.a(httpMetrics, ckvVar, new pkv(mkvVar.d, mkvVar.getContentType(), Long.valueOf(mkvVar.getContentLength()), httpMetrics.k, mkvVar.f));
                    break;
                } else {
                    cy70Var.c.a(httpMetrics, ckvVar, null);
                    break;
                }
            case 4:
                aq80 aq80Var = (aq80) this.c;
                String str = (String) this.d;
                BrowserPerfState browserPerfState = (BrowserPerfState) this.e;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 104) {
                    aq80Var.U();
                } else {
                    com.vk.common.links.c.c(str, browserPerfState, th);
                    aq80Var.onError(th);
                }
                break;
            case 5:
                FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                gzs gzsVar = (gzs) this.d;
                String[] strArr = (String[]) this.e;
                PermissionHelper.A.onNext(new gy90(fragmentActivity, (List) obj));
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                PermissionHelper.a.getClass();
                PermissionHelper.w(strArr);
                break;
            case 6:
                fid0 fid0Var = (fid0) this.c;
                wk50.a aVar = (wk50.a) this.d;
                rv9.i.a aVar2 = (rv9.i.a) this.e;
                L.i((Throwable) obj);
                fid0Var.f(aVar, aVar2.b);
                a.C0919a c0919a = aVar2.b;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) fid0Var.d.remove("debounce_" + c0919a.a);
                if (cVar != null) {
                    cVar.dispose();
                }
                fid0Var.e.remove(c0919a);
                break;
            case 7:
                myl0 myl0Var = (myl0) this.c;
                t2l0 t2l0Var = (t2l0) this.d;
                xpa0 xpa0Var = (xpa0) this.e;
                Bitmap bitmap = (Bitmap) obj;
                myl0Var.d(bitmap, t2l0Var != null ? Integer.valueOf(t2l0Var.b) : null);
                Point U = xpa0Var.U();
                PipetteColorPicker pipetteColorPicker = myl0Var.d;
                PipetteColorPicker pipetteColorPicker2 = pipetteColorPicker != null ? pipetteColorPicker : null;
                bwt0.p0(pipetteColorPicker2, true);
                pipetteColorPicker2.setHasDynamicBackgroundColor(true);
                pipetteColorPicker2.d(bitmap, t2l0Var, U);
                break;
            case 8:
                p9m0 p9m0Var = (p9m0) this.c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                StoryPrivacyType storyPrivacyType = StoryPrivacyType.BEST_FRIENDS;
                p9m0Var.T(new x9m0.h(storyPrivacyType));
                p9m0Var.T(x9m0.e.b);
                p9m0Var.j.b(new eam0.c(false, true, new eam0.f(storyPrivacyType, null, list, list2)));
                break;
            case 9:
                tra0 tra0Var = (tra0) this.c;
                v6p0 v6p0Var = (v6p0) this.d;
                tra0 tra0Var2 = (tra0) this.e;
                tra0.a aVar3 = (tra0.a) obj;
                tra0.a.x(aVar3, tra0Var, 0, an10.b(v6p0Var.getState().b()));
                tra0.a.x(aVar3, tra0Var2, 0, an10.b(v6p0Var.getState().b()) + tra0Var.c);
                break;
            default:
                w5v0 w5v0Var = (w5v0) this.c;
                ContextWrapper contextWrapper = (ContextWrapper) this.d;
                yd50 yd50Var = (yd50) this.e;
                ikv0 ikv0Var = (ikv0) obj;
                u750 u750Var = w5v0Var.e;
                bpn0 bpn0Var = w5v0Var.d;
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_CANCEL_MY_MUSIC_DELETE, PlayerMode.AUDIO);
                if (yd50Var.b.isEmpty()) {
                    itg0.i(4, ((a630) bpn0Var.getValue()).e1(yd50Var.c, MusicPlaybackLaunchContext.d, true), null, new b1o0(7), new kpk0(9, w5v0Var, contextWrapper));
                } else {
                    ((a630) bpn0Var.getValue()).l0(yd50Var.b, yd50Var.a, MusicPlaybackLaunchContext.d, new u5v0(r2, w5v0Var, contextWrapper));
                }
                ikv0Var.a();
                break;
        }
        return s3q0.a;
    }
}

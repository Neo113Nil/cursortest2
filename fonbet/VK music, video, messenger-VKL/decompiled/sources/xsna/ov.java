package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.exoplayer.offline.DownloadHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartRootViewHolder;
import com.vk.libvideo.dialogs.AnimationDialog;
import com.vk.libvideo.live.impl.views.liveswipe.LiveViewPager;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import java.util.Iterator;
import org.webrtc.EglThread;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ov(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        dcn e;
        int i = 0;
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.c;
                fwVar.d.b();
                hg1.k(fwVar.a.i0.getDependencies().a.b(fwVar.a.i0.getCurrentStory(), fwVar.a.i0.getStoriesContainer().g.size()), fwVar.a.i0.getContext()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bw(fwVar, i), new cw(fwVar, i));
                break;
            case 1:
                ((AnimationDialog) this.c).eo();
                break;
            case 2:
                CuratorInfoVhOld curatorInfoVhOld = (CuratorInfoVhOld) this.c;
                dcn dcnVar = curatorInfoVhOld.l;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                ImageView imageView = curatorInfoVhOld.h;
                if (imageView == null) {
                    imageView = null;
                }
                Activity h = e3m.h(imageView.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    ImageView imageView2 = curatorInfoVhOld.h;
                    (imageView2 != null ? imageView2 : null).getGlobalVisibleRect(rect);
                    e = curatorInfoVhOld.d.e(h, rect, "audio:curator_page", new com.vk.movika.sdk.base.model.props.d(8));
                    curatorInfoVhOld.l = e;
                    break;
                }
                break;
            case 3:
                rsl.d((rsl) this.c);
                break;
            case 4:
                hao haoVar = (hao) this.c;
                DownloadHelper downloadHelper = haoVar.s;
                if (downloadHelper != null) {
                    downloadHelper.k();
                }
                haoVar.s = null;
                break;
            case 5:
                ((EglThread) this.c).lambda$onRenderWindowClose$3();
                break;
            case 6:
                EmptyCartRootViewHolder emptyCartRootViewHolder = (EmptyCartRootViewHolder) this.c;
                mzp0 mzp0Var = emptyCartRootViewHolder.p;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(emptyCartRootViewHolder.t, emptyCartRootViewHolder);
                break;
            case 7:
                ((LiveViewPager) this.c).c.o1();
                break;
            case 8:
                MaterialPreferenceFragment materialPreferenceFragment = MaterialPreferenceFragment.this;
                int i2 = MaterialPreferenceFragment.k0;
                materialPreferenceFragment.fo();
                break;
            case 9:
                mhy.d(((ModernSearchView) this.c).j);
                break;
            case 10:
                nx50 nx50Var = (nx50) this.c;
                qmg0 qmg0Var = nx50Var.v0;
                if (qmg0Var != null) {
                    qmg0Var.setCurrentItem(nx50Var.F, false);
                    break;
                }
                break;
            case 11:
                my70 my70Var = (my70) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Run fetchNext in idle callback"});
                }
                my70Var.h();
                break;
            case 12:
                ?? r0 = ((rbe0) this.c).h;
                ((Dialog) r0.getValue()).setCancelable(false);
                ((Dialog) r0.getValue()).show();
                break;
            case 13:
                SingleCatalogRootVh singleCatalogRootVh = (SingleCatalogRootVh) this.c;
                mzp0 mzp0Var2 = singleCatalogRootVh.t;
                if (mzp0Var2 != null) {
                    mzp0Var2.a();
                }
                g3a.a(singleCatalogRootVh.q, singleCatalogRootVh);
                break;
            case 14:
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.c;
                stickersDrawingViewGroup.e = null;
                stickersDrawingViewGroup.w();
                break;
            case 15:
                StopwatchView.a aVar = (StopwatchView.a) this.c;
                int i3 = StopwatchView.l;
                aVar.c();
                break;
            case 16:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                int i4 = StoryMediaPickerFragment.d0;
                storyMediaPickerFragment.lo();
                break;
            case 17:
                Iterator it = ((UserProfileDialogs) this.c).i.iterator();
                while (it.hasNext()) {
                    ((UserProfileDialogs.a) it.next()).a();
                }
                break;
            case 18:
                sqt0.c((sqt0) this.c);
                break;
            case 19:
                com.vk.superapp.verification.account.d dVar = (com.vk.superapp.verification.account.d) this.c;
                if (!f4m.h(dVar.getView())) {
                    BottomSheetBehavior<View> bottomSheetBehavior = dVar.O;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.X(4);
                    }
                    View view = dVar.getView();
                    if (view != null) {
                        f4m.j(view);
                        break;
                    }
                } else {
                    dVar.Fn();
                    break;
                }
                break;
            default:
                ((mjw0) this.c).i();
                break;
        }
    }
}

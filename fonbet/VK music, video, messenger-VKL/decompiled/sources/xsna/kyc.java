package xsna;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.offline.a;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bE;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.qvq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kyc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kyc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o7o o7oVar;
        switch (this.b) {
            case 0:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i = ClipFeedListFragment.a2;
                clipFeedListFragment.Do().getFeature().a(qvq.v.a.b);
                return;
            case 1:
                ((cfm) this.c).y();
                return;
            case 2:
                ((zdz) this.c).c();
                return;
            case 3:
                ModalPostCommonFragment modalPostCommonFragment = (ModalPostCommonFragment) this.c;
                ModalPostCommonFragment.io(modalPostCommonFragment);
                View view = modalPostCommonFragment.U;
                ModalBottomSheetBehavior H = view != null ? ModalBottomSheetBehavior.H(view) : null;
                if (H != null) {
                    H.E = true;
                    H.F = true;
                    return;
                }
                return;
            case 4:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                com.vk.media.ok.a aVar = bVar.h;
                if (aVar != null) {
                    aVar.u(false);
                }
                com.vk.media.ok.a aVar2 = bVar.h;
                if (aVar2 != null) {
                    aVar2.l();
                    return;
                }
                return;
            case 5:
                pj80 pj80Var = (pj80) this.c;
                View view2 = pj80Var.b;
                if (pj80Var.e.isAlive()) {
                    pj80Var.e.removeOnDrawListener(pj80Var);
                } else {
                    view2.getViewTreeObserver().removeOnDrawListener(pj80Var);
                }
                view2.removeOnAttachStateChangeListener(pj80Var);
                return;
            case 6:
                gm80 gm80Var = (gm80) this.c;
                gm80Var.e();
                if (gm80Var.d()) {
                    a.C0060a g = gm80Var.c.b.g(new int[0]);
                    while (g.moveToNext()) {
                        try {
                            try {
                                o7oVar = g.m();
                            } catch (IllegalStateException e) {
                                Log.e("OneVideoMigration", mnh0.A(e));
                                o7oVar = null;
                            }
                            if (o7oVar != null) {
                                gm80Var.f(o7oVar, new ekh(gm80Var, 23));
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ro.e(g, th);
                                throw th2;
                            }
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return;
                }
                return;
            case 7:
                SignalingTransport.b((SignalingTransport) this.c);
                return;
            case 8:
                StickersBottomSheetDialog stickersBottomSheetDialog = (StickersBottomSheetDialog) this.c;
                View view3 = stickersBottomSheetDialog.O;
                ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    View view4 = stickersBottomSheetDialog.P;
                    if (view4 != null) {
                        view4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    View view5 = stickersBottomSheetDialog.P;
                    marginLayoutParams.bottomMargin = view5 != null ? view5.getMeasuredHeight() : 0;
                    View view6 = stickersBottomSheetDialog.O;
                    if (view6 != null) {
                        view6.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                d3m.e(((com.vk.video.ad.e) this.c).o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                return;
            case 10:
                VideoToolbarView videoToolbarView = (VideoToolbarView) this.c;
                d3m.e(videoToolbarView.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                videoToolbarView.y = true;
                return;
            case 11:
                VoipMainMenuFragmentBase voipMainMenuFragmentBase = (VoipMainMenuFragmentBase) this.c;
                int i2 = VoipMainMenuFragmentBase.O;
                voipMainMenuFragmentBase.startPostponedEnterTransition();
                return;
            case 12:
                if (((tbu0) this.c).b()) {
                    return;
                }
                AtomicBoolean atomicBoolean = ou2.a;
                mgn0 mgn0Var = wgn0.a;
                return;
            case 13:
                bE bEVar = (bE) this.c;
                bEVar.B.c(aG.a);
                sby0 sby0Var = bEVar.e;
                aF aFVar = aF.a;
                sby0Var.j[aFVar.ordinal()] = true;
                sby0Var.f[aFVar.ordinal()] = null;
                sby0Var.g[aFVar.ordinal()] = null;
                return;
            case 14:
                ((ru.ok.android.webrtc.signaling.api.e) this.c).a();
                return;
            default:
                yads.x02.b((yads.x02) this.c);
                return;
        }
    }
}

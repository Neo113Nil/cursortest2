package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.f;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.sidecontrols.api.AnimatedSharingController;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import ru.ok.tracer.heap.dumps.HeapDumps;
import xsna.i340;
import xsna.ml2;
import xsna.wxi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        int intValue;
        TileBackgroundImage tileBackgroundImage;
        String str;
        VideoSeekPreviewImage.a aVar;
        int i = 1;
        Object obj = null;
        switch (this.b) {
            case 0:
                ((f.a) this.c).h6((AboutVideoItem.h) this.d);
                return;
            case 1:
                ml2 ml2Var = (ml2) this.c;
                AnimatedSharingController.Strategy strategy = (AnimatedSharingController.Strategy) this.d;
                ml2.a aVar2 = ml2Var.h;
                ml2.a.d dVar = ml2.a.d.a;
                if (epx.f(aVar2, dVar)) {
                    LottieAnimationView lottieAnimationView = ml2Var.e;
                    if (ml2Var.isAttachedToWindow() && ml2Var.getGlobalVisibleRect(new Rect()) && epx.f(ml2Var.h, dVar)) {
                        ml2Var.h = ml2.a.b.a;
                        ml2Var.e();
                        int size = ml2Var.k.size();
                        int i2 = 3;
                        if (strategy == AnimatedSharingController.Strategy.LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME) {
                            ?? r6 = ml2Var.q;
                            if (size > 3) {
                                size = 3;
                            }
                            Integer num = (Integer) r6.get(Integer.valueOf(size));
                            intValue = num != null ? num.intValue() : R.raw.sharing_control_2_avatar_animation_out_without_border;
                        } else {
                            ?? r62 = ml2Var.o;
                            if (size > 3) {
                                size = 3;
                            }
                            Integer num2 = (Integer) r62.get(Integer.valueOf(size));
                            intValue = num2 != null ? num2.intValue() : R.raw.sharing_control_1_avatar_animation_out;
                        }
                        lottieAnimationView.setImageAssetDelegate(new ll2(strategy, ml2Var.k, ml2Var));
                        lottieAnimationView.setAnimation(intValue);
                        lottieAnimationView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        lottieAnimationView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        lottieAnimationView.setVisibility(0);
                        ml2Var.m = false;
                        lottieAnimationView.U(new nl2(new j1(ml2Var, i2), new hd(ml2Var, 2)));
                        d3m.c(lottieAnimationView, (r15 & 1) != 0 ? 300L : 10L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        d3m.e(ml2Var.d, (r15 & 1) != 0 ? 300L : 10L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new o1(ml2Var, i), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wke.K0((wke) this.c, (List) this.d);
                return;
            case 3:
                HeapDumps.shrinkAndUpload$lambda$4((Context) this.c, (androidx.work.c) this.d);
                return;
            case 4:
                ((vjv) this.c).z((f8f0) this.d, null);
                return;
            case 5:
                uxi0 uxi0Var = (uxi0) this.c;
                i340 i340Var = (i340) this.d;
                wxi0 a = new vxi0(uxi0Var).a();
                if (!(a instanceof wxi0.a)) {
                    if (!(a instanceof wxi0.c) && !(a instanceof wxi0.d) && !epx.f(a, wxi0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                i340.f fVar = i340Var.h;
                UserId userId = ((wxi0.a) a).a;
                fVar.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(fVar.b);
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((com.vk.superapp.multiaccount.api.f) next).a().b, userId)) {
                            obj = next;
                        }
                    }
                }
                com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) obj;
                if (fVar2 != null) {
                    copyOnWriteArrayList.remove(fVar2);
                }
                fVar.b(copyOnWriteArrayList);
                return;
            case 6:
                izs izsVar = (izs) this.c;
                StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet = (StickyMusicPlayerBottomSheet) this.d;
                int i3 = StickyMusicPlayerBottomSheet.c0;
                izsVar.invoke(stickyMusicPlayerBottomSheet);
                return;
            case 7:
                hcn0 hcn0Var = (hcn0) this.c;
                TileBackground tileBackground = ((men0) this.d).c().o.b;
                if (tileBackground == null || (tileBackgroundImage = tileBackground.d) == null) {
                    return;
                }
                int Y = dhr0.Y(R.attr.vk_ui_separator_primary_alpha, hcn0Var.itemView.getContext());
                VkImage vkImage = hcn0Var.C;
                vkImage.setVisibility(0);
                vkImage.setCornerRadius(iah0.b(12.0f));
                vkImage.y0(iah0.b(0.33f), Y);
                vkImage.setDontLoadAgainIfSameResource(true);
                WebImage webImage = tileBackgroundImage.b;
                int i4 = fcn0.A;
                WebImageSize f = webImage.f(i4);
                if (f == null || (str = f.b) == null) {
                    return;
                }
                kci.o(vkImage, new bto0(str, hcn0Var.itemView.getWidth(), hcn0Var.itemView.getHeight(), i4, dhr0.Y(R.attr.vk_ui_background_modal, vkImage.getContext())));
                vkImage.o0(str, null);
                Boolean bool = (Boolean) (dhr0.M() ? bto0.i : bto0.j).get(str);
                if (bool != null) {
                    hcn0Var.i6(bool.booleanValue());
                }
                vkImage.setOnLoadCallback(new gcn0(str, hcn0Var));
                return;
            case 8:
                k6o0 k6o0Var = (k6o0) this.c;
                Object obj2 = this.d;
                exc0.i(obj2);
                synchronized (k6o0Var.c.a) {
                    k6o0Var.b.remove(obj2);
                    k6o0Var.a.remove(obj2);
                    ia0.c.a(obj2);
                }
                return;
            case 9:
                Exception exc = (Exception) this.c;
                VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.d;
                if (!(exc instanceof CancellationException) && (aVar = videoSeekPreviewImage.o) != null) {
                    aVar.b();
                }
                videoSeekPreviewImage.k = true;
                videoSeekPreviewImage.setImageDrawable(null);
                return;
            case 10:
                VideoView videoView = (VideoView) this.c;
                LinearLayout linearLayout = (LinearLayout) this.d;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                if (videoView.isAttachedToWindow()) {
                    videoView.addOnAttachStateChangeListener(new VideoView.i(videoView, videoView, linearLayout));
                    return;
                } else {
                    videoView.removeCallbacks(videoView.E0);
                    f4m.j(linearLayout);
                    return;
                }
            case 11:
                Ya.d((Ya) this.c, (LevelPlayAdInfo) this.d);
                return;
            default:
                yads.wc1.a((yads.wc1) this.c, (yads.g9) this.d);
                return;
        }
    }
}

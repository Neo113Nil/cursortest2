package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.accountmanager.di.VideoAccountHolderComponent;
import com.vk.auth.validation.b;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.mvi.VideoCatalogMviVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vkontakte.android.R;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.calls.sdk.net.signaling.WSSignaling;
import xsna.oyr0;
import xsna.yyb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ikk0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ikk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        Object parcelable;
        Integer num;
        View decorView;
        int width;
        Size L;
        View decorView2;
        int height;
        SSLSocketFactory sslSocketFactory_delegate$lambda$0;
        int i = this.b;
        int i2 = 0;
        r2 = null;
        Integer num2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = SpeedView.B;
                return (VkText) ((SpeedView) obj2).findViewById(R.id.speed_before_text);
            case 1:
                return ((StickersDrawingViewGroup) obj2).d;
            case 2:
                int i4 = StoryStatisticsViewersFragment.f0;
                return ((StoryReactionsComponent) m7m.d((StoryStatisticsViewersFragment) obj2).mo408a(fpf0.a(StoryReactionsComponent.class))).b();
            case 3:
                int i5 = StoryTemplateFragment.U;
                Bundle arguments = ((StoryTemplateFragment) obj2).getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable("camera_params", StoryCameraParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = arguments.getParcelable("camera_params");
                    obj = (StoryCameraParams) (parcelable2 instanceof StoryCameraParams ? parcelable2 : null);
                }
                return (StoryCameraParams) obj;
            case 4:
                uy9 uy9Var = (uy9) obj2;
                ((uov) uy9Var.c).setActionInProgress(false);
                ((uov) uy9Var.c).play();
                return s3q0.a;
            case 5:
                cmo0 cmo0Var = (cmo0) obj2;
                xpa0 xpa0Var = cmo0Var.e;
                s5l0 J = xpa0Var.J();
                Size L2 = xpa0Var.L();
                if (L2 != null) {
                    width = L2.getWidth();
                } else {
                    Window window = cmo0Var.getWindow();
                    if (window == null || (decorView = window.getDecorView()) == null) {
                        num = null;
                        L = xpa0Var.L();
                        if (L != null) {
                            Window window2 = cmo0Var.getWindow();
                            if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                                height = decorView2.getHeight();
                            }
                            J.a(num, num2);
                            return J;
                        }
                        height = L.getHeight();
                        num2 = Integer.valueOf(height);
                        J.a(num, num2);
                        return J;
                    }
                    width = decorView.getWidth();
                }
                num = Integer.valueOf(width);
                L = xpa0Var.L();
                if (L != null) {
                }
                num2 = Integer.valueOf(height);
                J.a(num, num2);
                return J;
            case 6:
                dcn dcnVar = (dcn) ((Ref$ObjectRef) obj2).element;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                return s3q0.a;
            case 7:
                int i6 = UserProfileFragment.p0;
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((UserProfileFragment) obj2)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 8:
                mqr0 mqr0Var = (mqr0) obj2;
                jj0 jj0Var = mqr0Var.l;
                yyb.a aVar = mqr0Var.o;
                jj0Var.u((aVar != null ? aVar : null).c());
                return s3q0.a;
            case 9:
                ((com.vk.video.ad.b) obj2).h.b(oyr0.b.a);
                return s3q0.a;
            case 10:
                ((r2s0) obj2).f.Ff("video_audio");
                return s3q0.a;
            case 11:
                return ((VideoAutoPlay) obj2).d1();
            case 12:
                ComposeView composeView = ((VideoCatalogMviVh) obj2).m;
                ViewParent parent = composeView != null ? composeView.getParent() : null;
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                if (recyclerView != null && recyclerView.getScrollState() == 0) {
                    i2 = 1;
                }
                return Boolean.valueOf(1 ^ i2);
            case 13:
                ((VideoCatalogSearchRootVh) obj2).w.d();
                return s3q0.a;
            case 14:
                return (VideoAppStabilityComponent) ((f8m) obj2).a(fpf0.a(VideoAppStabilityComponent.class));
            case 15:
                int i7 = VideoOfflineFragment.f1;
                return ((MultiAccountComponent) m7m.d((VideoOfflineFragment) obj2).a(fpf0.a(MultiAccountComponent.class))).a();
            case 16:
                return Boolean.valueOf(((VideoPlaylistRootVh) obj2).p.J().s1());
            case 17:
                hbt0 hbt0Var = (hbt0) obj2;
                return new ci5(hbt0Var.i, new cbt0(hbt0Var, i2), hbt0Var);
            case 18:
                ((androidx.appcompat.app.d) obj2).dismiss();
                return s3q0.a;
            case 19:
                return ((com.vk.superapp.browser.ui.a) obj2).un();
            case 20:
                return ((VideoAccountHolderComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj2)).a(fpf0.a(VideoAccountHolderComponent.class))).x9();
            case 21:
                ((b.a) obj2).dispose();
                return s3q0.a;
            case 22:
                return ((rew0) ((cdw0) obj2).n1.getValue()).f();
            case 23:
                sslSocketFactory_delegate$lambda$0 = WSSignaling.sslSocketFactory_delegate$lambda$0(null, (WSSignaling) obj2);
                return sslSocketFactory_delegate$lambda$0;
            default:
                return (TextView) ((com.vk.writebar.g) obj2).f().findViewById(R.id.writebar_duration);
        }
    }
}

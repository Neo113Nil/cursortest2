package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.ui.fragments.ImCreateConversationFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;
import java.io.File;
import kotlin.text.Regex;
import one.video.calls.sdk_private.bF;
import xsna.grt0;
import xsna.umm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ryc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ryc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Context context;
        qap qapVar;
        Bitmap bitmap;
        String str;
        grt0.a aVar;
        wds0 videoData;
        Uri uri;
        Bitmap v;
        int i = this.b;
        r2 = null;
        r2 = null;
        String str2 = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((syc) obj).d();
                break;
            case 1:
                ((LinearLayoutManager) obj).K(0, 0);
                break;
            case 2:
                ComposeView composeView = ((CommunityReviewsFragment) obj).h0;
                if (composeView != null) {
                    xo2.f(composeView, false, true, 300L);
                    break;
                }
                break;
            case 3:
                ((DashMediaSource) obj).A();
                break;
            case 4:
                ((gzs) obj).invoke();
                break;
            case 5:
                int i2 = ImCreateConversationFragment.t0;
                ((ImCreateConversationFragment) obj).finish();
                break;
            case 6:
                ((uy2) obj).invoke();
                break;
            case 7:
                RecyclerView recyclerView = ((pr20) obj).n;
                (recyclerView != null ? recyclerView : null).requestLayout();
                break;
            case 8:
                ((nfb0) obj).a.fullScroll(130);
                break;
            case 9:
                StoryBottomViewGroup.setActionItems$lambda$16((StoryBottomViewGroup) obj);
                break;
            case 10:
                int i3 = CatalogModalBottomSheetFragment.X;
                CatalogModalBottomSheetFragment.a.a(((e7m0) obj).b.getContext(), CatalogModalBottomSheetFragment.Content.STORY, null, 12);
                break;
            case 11:
                umm0 umm0Var = (umm0) obj;
                umm0.a aVar2 = umm0Var.a;
                StoryProgressView storyProgressView = umm0Var.b;
                if (aVar2.o()) {
                    o3e0 o3e0Var = umm0Var.c;
                    if (o3e0Var != null && (qapVar = o3e0Var.a) != null && !qapVar.d) {
                        qapVar.d = true;
                        qapVar.c = SystemClock.elapsedRealtime() - qapVar.a;
                        qapVar.a = 0L;
                    }
                    vmm0 vmm0Var = umm0Var.i;
                    vmm0Var.sendMessageDelayed(Message.obtain(vmm0Var, 0), 16L);
                    aVar2.y();
                    if (storyProgressView != null && (context = storyProgressView.getContext()) != null) {
                        bwt0.p0(storyProgressView, !qq2.d(context));
                        break;
                    }
                }
                break;
            case 12:
                ExpandableVkSearchView expandableVkSearchView = ((ToolbarRedesignVh) obj).x;
                if (expandableVkSearchView != null) {
                    expandableVkSearchView.setExpanded(false);
                    break;
                }
                break;
            case 13:
                VideoOnboardingVh videoOnboardingVh = (VideoOnboardingVh) obj;
                String str3 = videoOnboardingVh.c;
                if (str3 != null) {
                    videoOnboardingVh.b.b(new xxf0(str3), false);
                    break;
                }
                break;
            case 14:
                grt0 grt0Var = (grt0) obj;
                SimpleVideoView.k kVar = grt0Var.g;
                VKImageView vKImageView = grt0Var.l;
                SimpleVideoView simpleVideoView = grt0Var.r;
                if (kVar != null) {
                    kVar.p0(null);
                }
                String str4 = kd7.a;
                if (simpleVideoView != null) {
                    try {
                        bitmap = simpleVideoView.getBitmap();
                    } catch (Throwable unused) {
                        lht.a.a();
                        try {
                            bitmap = simpleVideoView.getBitmap();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (grt0Var.o == null && bitmap != null) {
                        v = grt0Var.v(bitmap);
                        grt0Var.o = v;
                        if (v != null && vKImageView != null) {
                            vKImageView.setImageBitmap(v);
                        }
                    }
                    str = grt0Var.i;
                    if (str.length() == 0) {
                        if (simpleVideoView != null && (videoData = simpleVideoView.getVideoData()) != null && (uri = videoData.a) != null) {
                            str2 = uri.toString();
                        }
                        str = str2;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str5 = (brm0.B(str, DomExceptionUtils.SEPARATOR, false) && (str = r9r.b(grt0Var.getContext(), Uri.parse(str))) == null) ? "" : str;
                    aVar = grt0Var.n;
                    if (aVar != null) {
                        if (!aVar.c) {
                            aVar.a = str5;
                            File file = new File(str5);
                            Regex regex = com.vk.core.files.a.a;
                            aVar.c = vhk0.g(file);
                        }
                        aVar.d = simpleVideoView != null ? simpleVideoView.getVideoWidth() : 0;
                        aVar.e = simpleVideoView != null ? simpleVideoView.getVideoHeight() : 0;
                    }
                    grt0Var.p();
                    if (vKImageView == null) {
                        vKImageView.setScaleType(ImageView.ScaleType.CENTER);
                        break;
                    }
                }
                bitmap = null;
                if (grt0Var.o == null) {
                    v = grt0Var.v(bitmap);
                    grt0Var.o = v;
                    if (v != null) {
                        vKImageView.setImageBitmap(v);
                    }
                }
                str = grt0Var.i;
                if (str.length() == 0) {
                }
                if (str == null) {
                }
                if (brm0.B(str, DomExceptionUtils.SEPARATOR, false)) {
                }
                aVar = grt0Var.n;
                if (aVar != null) {
                }
                grt0Var.p();
                if (vKImageView == null) {
                }
                break;
            default:
                ((bF) obj).q();
                break;
        }
    }
}

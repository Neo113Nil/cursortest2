package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.stat.NegotiationError;
import xsna.bbj0;
import xsna.c70;
import xsna.m010;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qn9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qn9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StoryCameraParams cameraParams;
        StorySharingInfo storySharingInfo;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                Activity activity = (Activity) obj;
                float f = CameraUIView.w1;
                g7j0 value = cameraUIView.getDeps().c.getValue();
                ImageView imageView = cameraUIView.f0;
                if (imageView != null && (cameraParams = cameraUIView.getCameraParams()) != null && (storySharingInfo = cameraParams.f) != null) {
                    value.d(activity, imageView, storySharingInfo);
                    break;
                }
                break;
            case 1:
                wih wihVar = (wih) obj2;
                wih.a aVar = (wih.a) obj;
                vjh vjhVar = aVar.y;
                Integer num = wihVar.g.f;
                int intValue = num != null ? num.intValue() : aVar.z.getCurrentItem();
                CommunityProfileContentItem x0 = vjhVar.x0(intValue);
                if ((x0 != null ? x0.f() : null) == CommunityProfileContentItem.State.RELOAD) {
                    aVar.q.l(x0, false);
                    aVar.s6(aVar.A, wihVar.g.e);
                    aVar.q6(intValue);
                    vjhVar.y0(intValue);
                    break;
                }
                break;
            case 2:
                DownloadService.g((DownloadService) obj, ((DownloadService.a) obj2).c.o);
                break;
            case 3:
                m010 m010Var = (m010) obj;
                RecyclerView recyclerView = ((MarketItemCommentsFragment) obj2).R;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(((m010.b) m010Var).a);
                    break;
                }
                break;
            case 4:
                c70.b bVar = new c70.b();
                bVar.g();
                bVar.k = ((Context) obj2).getString(R.string.share_album_disabled_from_closed_group);
                ((bbj0.a) obj).a(bVar.b()).c();
                break;
            case 5:
                yx50 yx50Var = (yx50) obj2;
                NavigationDelegateActivity navigationDelegateActivity = yx50Var.b;
                VkTooltip.a aVar2 = new VkTooltip.a(navigationDelegateActivity);
                aVar2.b = navigationDelegateActivity.getString(R.string.content_info_tooltip);
                aVar2.e = VkTooltip.Appearance.Inversion;
                aVar2.g = false;
                aVar2.f = VkTooltip.TooltipGravity.RIGHT;
                aVar2.a(f4m.c((View) obj));
                long currentTimeMillis = System.currentTimeMillis();
                yx50Var.w = currentTimeMillis;
                Preference.F(currentTimeMillis, "content_info_hint", "content_info_hint_show_time");
                break;
            case 6:
                ((PeerConnectionClient) obj2).c((NegotiationError) obj);
                break;
            case 7:
                Context context = (Context) obj2;
                Preference preference = Preference.a;
                im20 im20Var = new im20(TimeUnit.MINUTES.toMillis(5L), ((oyc0) obj).c.a.getBoolean("isEnabledPrefV2"));
                preference.getClass();
                List A = Preference.A(context, im20Var);
                if (!(A instanceof Collection) || !A.isEmpty()) {
                    Iterator it = A.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((kvj0) it.next()).a) {
                                new awj0(context, new iz3(26)).d();
                            }
                        }
                    }
                }
                Iterator it2 = A.iterator();
                while (it2.hasNext()) {
                    pt20.a((kvj0) it2.next());
                }
                break;
            case 8:
                ((VerificationController) obj2).lambda$requestIvrCall$16((VerificationApi.FailReason) obj);
                break;
            default:
                yads.w12.a((yads.w12) obj2, (yads.x12) obj);
                break;
        }
    }
}

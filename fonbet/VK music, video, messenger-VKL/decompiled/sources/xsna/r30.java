package xsna;

import android.app.Application;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.settings.impl.di.StoriesSettingsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;
import xsna.t4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        ?? r2 = this.c;
        switch (i) {
            case 0:
                v30 v30Var = (v30) r2;
                return new y60(new z60(v30Var.a, "action_with_offline_support.db", null, 2).getWritableDatabase(), v30Var.b);
            case 1:
                return ((QueueSyncComponent) ((AuthBridgeComponentImpl) r2).e.getValue()).i0();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoAdFreeSubscriptionComponent) r2.getValue()).t6();
            case 3:
                return new b3f(((AuthBridgeComponent) ((ClipsUploadVkComponentImpl) r2).a.getValue()).s());
            case 4:
                return new PhotosComponentImpl.a((Application) r2);
            case 5:
                return Boolean.valueOf(((h360) r2).c().b);
            case 6:
                return ((DonutPriceComponent) ((k7m) m7m.f((pb60) r2)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 7:
                return new fvl0(((StoriesSettingsComponentImpl) r2).a.s());
            case 8:
                VKApplication vKApplication = (VKApplication) r2;
                VKApplication.a aVar = VKApplication.c;
                t4a.a.a = new xhu0(eiu0.a, new bpn0(new z58(vKApplication)), new bpn0(new t0f(vKApplication)), new bpn0(new u0f(vKApplication, 9)), new bpn0(new zg9(vKApplication)), new bpn0(new b63(vKApplication)), new bpn0(new v0f(vKApplication)), new bpn0(new u35(vKApplication)), new bpn0(new w0f(vKApplication)), new bpn0(new via(vKApplication, 10)), new bpn0(new wa3(vKApplication)), new bpn0(new a68(vKApplication)), new bpn0(new ug9(vKApplication, 9)), new bpn0(new vg9(vKApplication)), new bpn0(new qn6(vKApplication)));
                eiu0.b.a();
                return s3q0.a;
            case 9:
                if (((qks0) r2).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_AUDIO_FOCUS_GAIN;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((uev0) r2)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            default:
                VoipCallComponentImpl voipCallComponentImpl = (VoipCallComponentImpl) r2;
                return new vmw0(voipCallComponentImpl.f, voipCallComponentImpl.e);
        }
    }
}

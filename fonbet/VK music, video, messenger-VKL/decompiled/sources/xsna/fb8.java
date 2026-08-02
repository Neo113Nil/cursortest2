package xsna;

import android.content.Context;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.core.traffic.TrafficLightAsyncImpl;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.multiaccount.impl.di.VkClientMultiAccountComponentImpl;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.rustore.di.RuStoreComponent;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.io.File;
import java.nio.ByteBuffer;
import xsna.bg7;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) this.c;
                qcy<Object>[] qcyVarArr = BridgeComponentImpl.I;
                return new iyv0(new j4h(), new kwm0(), profileFragmentProviderComponent);
            case 1:
                return ((CommunityAddressComponent) ((LinksBridgeComponentImpl) this.c).w.getValue()).a();
            case 2:
                MainActivity mainActivity = (MainActivity) this.c;
                String str = MainActivity.P;
                mainActivity.e2(mainActivity.getIntent(), null);
                return null;
            case 3:
                return new ulm(((ph20) this.c).b, dhr0.a);
            case 4:
                r360 r360Var = (r360) this.c;
                boolean z = pmr0.a;
                return Boolean.valueOf(!pmr0.a(r360Var.b));
            case 5:
                return (ClipsUploadSdkUploaderComponent) ((g8m) this.c).a(fpf0.a(ClipsUploadSdkUploaderComponent.class));
            case 6:
                return new File(((Context) this.c).getExternalCacheDir(), "nspk_search_banks_list");
            case 7:
                OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.c;
                bpn0 bpn0Var = offlineAudioComponentImpl.D;
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                boolean T = com.vk.toggle.d.T(k840.a.i.b());
                ai40 ai40Var = new ai40();
                return new xh40(T ? offlineAudioComponentImpl.I() : (i5q) bpn0Var.getValue(), (i5q) bpn0Var.getValue(), T ? new km80(offlineAudioComponentImpl.I(), ai40Var) : ai40Var, offlineAudioComponentImpl.Ff(), T);
            case 8:
                BridgeComponent bridgeComponent = (BridgeComponent) this.c;
                qcy<Object>[] qcyVarArr3 = PhotosComponentImpl.u;
                return new t0e0(bridgeComponent.s());
            case 9:
                return new AppContextDiComponent.a(((xxg0) this.c).a);
            case 10:
                ((TrafficLightAsyncImpl) this.c).b();
                return s3q0.a;
            case 11:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                bg7.g.getClass();
                new bg7.c();
                long currentTimeMillis = System.currentTimeMillis();
                final bg7.c.a aVar2 = new bg7.c.a(604800, currentTimeMillis);
                wf7 b = bg7.b.b(vKApplication);
                if (b != null) {
                    exc0.g("metaInf", "key cannot be null or empty");
                    ByteBuffer allocate = ByteBuffer.allocate(13);
                    allocate.put((byte) 1);
                    allocate.putInt(604800);
                    allocate.putLong(currentTimeMillis);
                    Task<Integer> storeBytes = b.storeBytes(new StoreBytesData("metaInf", allocate.array(), false));
                    if (storeBytes != null) {
                        storeBytes.addOnCompleteListener(new OnCompleteListener() { // from class: xsna.dg7
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                L l = L.a;
                                l.getClass();
                                if (L.m(LoggerOutputTarget.NONE)) {
                                    return;
                                }
                                L.u(l, L.LogType.i, new Object[]{"[Blockstore] save meta inf " + bg7.c.a.this});
                            }
                        });
                    }
                }
                return s3q0.a;
            case 12:
                return ((RuStoreComponent) ((k7m) m7m.f((qmr0) this.c)).a(fpf0.a(RuStoreComponent.class))).u6();
            default:
                VkClientMultiAccountComponentImpl vkClientMultiAccountComponentImpl = (VkClientMultiAccountComponentImpl) this.c;
                return new zku0(vkClientMultiAccountComponentImpl.a.J2(), vkClientMultiAccountComponentImpl.c.nc());
        }
    }
}

package xsna;

import android.app.Application;
import android.os.Trace;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.queue.di.QueueSyncComponentImpl;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jb3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jb3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return dwx0.h((Application) obj);
            case 1:
                return new mub0((ProfileFragmentProviderComponent) ((gxw) obj).c().a(fpf0.a(ProfileFragmentProviderComponent.class)));
            case 2:
                dky dkyVar = (dky) obj;
                return Boolean.valueOf(dkyVar.f.e.b.invoke().booleanValue() || dkyVar.e.a());
            case 3:
                return (AuthBridgeComponent) ((g8m) obj).a(fpf0.a(AuthBridgeComponent.class));
            case 4:
                return (TabbarSettingsComponent) m7m.a(((nx50) obj).b).a(fpf0.a(TabbarSettingsComponent.class));
            case 5:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return (NewsfeedMappersComponent) ((bpn0) obj).getValue();
            case 6:
                qcy<Object>[] qcyVarArr2 = OfflineAudioComponentImpl.M;
                return new bbo((dq40) ((OfflineAudioComponentImpl) obj).J.getValue());
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.uploadStorageManager"));
                try {
                    return new vcq0(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 8:
                VKApplication.a aVar = VKApplication.c;
                ((gzs) obj).invoke();
                return s3q0.a;
            case 9:
                return new QueueSyncComponentImpl.a(((jau0) obj).d);
            case 10:
                kzv0 kzv0Var = (kzv0) obj;
                return new gnz((o2i) kzv0Var.h.getValue(), (VideoApiHelperRepository) kzv0Var.i.getValue());
            default:
                xux0 xux0Var = (xux0) obj;
                xux0Var.getClass();
                mmp.a(xux0Var);
                return s3q0.a;
        }
    }
}

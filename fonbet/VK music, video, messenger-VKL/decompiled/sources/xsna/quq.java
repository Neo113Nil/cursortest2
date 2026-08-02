package xsna;

import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class quq implements DeviceIdProvider, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ Object b;

    public /* synthetic */ quq(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        db3 db3Var = (db3) this.b;
        VKApplication.a aVar = VKApplication.c;
        return (Boolean) db3Var.invoke(obj);
    }

    @Override // com.vk.push.core.remote.config.omicron.deviceid.DeviceIdProvider
    public String getDeviceId() {
        DeviceIdRepository deviceIdRepository;
        deviceIdRepository = ((FeatureManagerImpl) this.b).e;
        return deviceIdRepository.getDeviceIdBlocking();
    }
}

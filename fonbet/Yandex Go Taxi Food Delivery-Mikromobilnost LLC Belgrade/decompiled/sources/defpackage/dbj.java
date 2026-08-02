package defpackage;

import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProvider;

/* loaded from: classes7.dex */
public final /* synthetic */ class dbj implements DeviceIdProvider.Listener {
    @Override // ru.yandex.video.m3.player.provider.internal.DeviceIdProvider.Listener
    public final void onDeviceIdObtained(String str) {
        DeviceInfoProviderImpl.deviceId = str;
    }
}

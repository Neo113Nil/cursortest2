package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.kqw;

/* loaded from: classes2.dex */
public final class j0 implements kqw {
    @Override // defpackage.kqw
    public final Object a(int i) {
        SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AVDeviceType a = SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AVDeviceType.a(i);
        return a == null ? SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AVDeviceType.AV_DEVICE_TYPE_UNKNOWN : a;
    }
}

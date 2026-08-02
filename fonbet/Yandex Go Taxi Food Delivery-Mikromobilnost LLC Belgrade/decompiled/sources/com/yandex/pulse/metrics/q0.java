package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes2.dex */
public final class q0 implements hqw {
    public static final q0 a = new q0();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? null : SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AudioDescription.OutputMode.DIGITAL : SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AudioDescription.OutputMode.ANALOG) != null;
    }
}

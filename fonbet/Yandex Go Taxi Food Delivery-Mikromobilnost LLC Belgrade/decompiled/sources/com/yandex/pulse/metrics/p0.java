package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dqw;
import defpackage.fqw;

/* loaded from: classes2.dex */
public final class p0 implements fqw {
    @Override // defpackage.fqw
    public final dqw findValueByNumber(int i) {
        if (i == 0) {
            return SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AudioDescription.OutputMode.ANALOG;
        }
        if (i != 1) {
            return null;
        }
        return SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AudioDescription.OutputMode.DIGITAL;
    }
}

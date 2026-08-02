package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes2.dex */
public final class n0 implements hqw {
    public static final n0 a = new n0();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.ExternalAudioVideoDevice.AudioDescription.AudioFormat.a(i) != null;
    }
}

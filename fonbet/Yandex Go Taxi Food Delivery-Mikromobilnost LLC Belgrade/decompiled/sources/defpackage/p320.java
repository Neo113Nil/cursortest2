package defpackage;

import com.yandex.messaging.input.voice.record.DefaultVoiceRecordPlugin;
import com.yandex.messaging.input.voice.record.api.VoiceRecordController;

/* loaded from: classes15.dex */
public final class p320 extends r320 {
    public static final p320 a = new p320();

    public static final g0c d() {
        return qoi0.a(DefaultVoiceRecordPlugin.class);
    }

    @Override // defpackage.r320
    public final g0c a() {
        return qoi0.a(VoiceRecordController.class);
    }

    @Override // defpackage.r320
    public final sls b() {
        return new g320(7);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p320);
    }

    public final int hashCode() {
        return 792531703;
    }

    public final String toString() {
        return "VoiceRecordDefault";
    }
}

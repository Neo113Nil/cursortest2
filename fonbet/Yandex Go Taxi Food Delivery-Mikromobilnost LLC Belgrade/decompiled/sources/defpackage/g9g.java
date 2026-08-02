package defpackage;

import com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies;

/* loaded from: classes15.dex */
public final class g9g implements VoiceRecordPluginDependencies.Builder {
    public final z8g a;
    public final p8g b;
    public final d8g c;
    public final h8g d;

    public g9g(z8g z8gVar, p8g p8gVar, d8g d8gVar, h8g h8gVar) {
        this.a = z8gVar;
        this.b = p8gVar;
        this.c = d8gVar;
        this.d = h8gVar;
    }

    @Override // com.yandex.messaging.input.voice.record.VoiceRecordPluginDependencies.Builder
    public final VoiceRecordPluginDependencies build() {
        return new k8g(this.a, this.b, this.c, this.d);
    }
}

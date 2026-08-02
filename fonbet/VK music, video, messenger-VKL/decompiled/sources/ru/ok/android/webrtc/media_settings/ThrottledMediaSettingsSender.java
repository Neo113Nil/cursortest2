package ru.ok.android.webrtc.media_settings;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.f;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;
import xsna.bdz;

/* loaded from: classes9.dex */
public class ThrottledMediaSettingsSender implements MediaSettingsSender {
    public final MediaSettingsSender a;
    public final f b;
    public final c c;

    public ThrottledMediaSettingsSender(@NonNull MediaSettingsSender mediaSettingsSender) {
        this.a = mediaSettingsSender;
        f fVar = new f();
        this.b = fVar;
        m1 a0 = fVar.v0(50L, TimeUnit.MILLISECONDS).a0(a.b());
        Objects.requireNonNull(mediaSettingsSender);
        this.c = a0.subscribe(new bdz(mediaSettingsSender, 25));
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void release() {
        this.c.dispose();
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void send(@NonNull SignalingMediaSettings signalingMediaSettings) {
        this.b.onNext(signalingMediaSettings);
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void setActualSettings(@NonNull SignalingMediaSettings signalingMediaSettings) {
        this.a.setActualSettings(signalingMediaSettings);
    }
}

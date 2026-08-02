package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingCallSettings;", "", "camera", "", "mic", "skipConnectionScreen", "<init>", "(ZZZ)V", "getCamera", "()Z", "getMic", "getSkipConnectionScreen", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingCallSettings {

    @xuf0(tag = 1)
    private final boolean camera;

    @xuf0(tag = 2)
    private final boolean mic;

    @xuf0(tag = 3)
    private final boolean skipConnectionScreen;

    public MeetingCallSettings(@Json(name = "Camera") boolean z, @Json(name = "Mic") boolean z2, @Json(name = "SkipConnectionScreen") boolean z3) {
        this.camera = z;
        this.mic = z2;
        this.skipConnectionScreen = z3;
    }

    public static /* synthetic */ MeetingCallSettings copy$default(MeetingCallSettings meetingCallSettings, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = meetingCallSettings.camera;
        }
        if ((i & 2) != 0) {
            z2 = meetingCallSettings.mic;
        }
        if ((i & 4) != 0) {
            z3 = meetingCallSettings.skipConnectionScreen;
        }
        return meetingCallSettings.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCamera() {
        return this.camera;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMic() {
        return this.mic;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSkipConnectionScreen() {
        return this.skipConnectionScreen;
    }

    public final MeetingCallSettings copy(@Json(name = "Camera") boolean camera, @Json(name = "Mic") boolean mic, @Json(name = "SkipConnectionScreen") boolean skipConnectionScreen) {
        return new MeetingCallSettings(camera, mic, skipConnectionScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingCallSettings)) {
            return false;
        }
        MeetingCallSettings meetingCallSettings = (MeetingCallSettings) other;
        return this.camera == meetingCallSettings.camera && this.mic == meetingCallSettings.mic && this.skipConnectionScreen == meetingCallSettings.skipConnectionScreen;
    }

    public final boolean getCamera() {
        return this.camera;
    }

    public final boolean getMic() {
        return this.mic;
    }

    public final boolean getSkipConnectionScreen() {
        return this.skipConnectionScreen;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skipConnectionScreen) + unr0.e(Boolean.hashCode(this.camera) * 31, 31, this.mic);
    }

    public String toString() {
        boolean z = this.camera;
        boolean z2 = this.mic;
        return x4e.i(qv10.u("MeetingCallSettings(camera=", ", mic=", ", skipConnectionScreen=", z, z2), this.skipConnectionScreen, Extension.C_BRAKE);
    }
}

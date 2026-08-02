package ru.ok.android.webrtc.stat.audio;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.epx;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AudioErrorEvent {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public AudioErrorEvent(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public static /* synthetic */ AudioErrorEvent copy$default(AudioErrorEvent audioErrorEvent, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioErrorEvent.a;
        }
        if ((i & 2) != 0) {
            str2 = audioErrorEvent.b;
        }
        if ((i & 4) != 0) {
            str3 = audioErrorEvent.c;
        }
        if ((i & 8) != 0) {
            num = audioErrorEvent.d;
        }
        return audioErrorEvent.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final Integer component4() {
        return this.d;
    }

    public final AudioErrorEvent copy(String str, String str2, String str3, Integer num) {
        return new AudioErrorEvent(str, str2, str3, num);
    }

    public final String description() {
        return this.a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.b + StringUtils.PROCESS_POSTFIX_DELIMITER + this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioErrorEvent)) {
            return false;
        }
        AudioErrorEvent audioErrorEvent = (AudioErrorEvent) obj;
        return epx.f(this.a, audioErrorEvent.a) && epx.f(this.b, audioErrorEvent.b) && epx.f(this.c, audioErrorEvent.c) && epx.f(this.d, audioErrorEvent.d);
    }

    public final Integer getCode() {
        return this.d;
    }

    public final String getDomain() {
        return this.a;
    }

    public final String getReason() {
        return this.c;
    }

    public final String getSubDomain() {
        return this.b;
    }

    public int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Integer num = this.d;
        StringBuilder a = xe9.a("AudioErrorEvent(domain=", str, ", subDomain=", str2, ", reason=");
        a.append(str3);
        a.append(", code=");
        a.append(num);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ AudioErrorEvent(String str, String str2, String str3, Integer num, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : num);
    }
}

package defpackage;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes10.dex */
public final class j34 implements zyn {
    public final String a;
    public final int b;
    public final Timebase c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public j34(String str, int i, Timebase timebase, int i2, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = timebase;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // defpackage.zyn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.zyn
    public final Timebase b() {
        return this.c;
    }

    @Override // defpackage.zyn
    public final MediaFormat c() {
        int i = this.f;
        int i2 = this.g;
        String str = this.a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        createAudioFormat.setInteger("bitrate", this.d);
        int i3 = this.b;
        if (i3 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i3);
                return createAudioFormat;
            }
            createAudioFormat.setInteger("profile", i3);
        }
        return createAudioFormat;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j34) {
            j34 j34Var = (j34) obj;
            if (this.a.equals(j34Var.a) && this.b == j34Var.b && this.c.equals(j34Var.c) && this.d == j34Var.d && this.e == j34Var.e && this.f == j34Var.f && this.g == j34Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", captureSampleRate=");
        sb.append(this.e);
        sb.append(", encodeSampleRate=");
        sb.append(this.f);
        sb.append(", channelCount=");
        return oyr.m(this.g, "}", sb);
    }
}

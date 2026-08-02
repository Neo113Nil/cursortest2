package defpackage;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes10.dex */
public final class d94 implements zyn {
    public final String a;
    public final int b;
    public final Timebase c;
    public final Size d;
    public final int e;
    public final e94 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public d94(String str, int i, Timebase timebase, Size size, int i2, e94 e94Var, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = i;
        this.c = timebase;
        this.d = size;
        this.e = i2;
        this.f = e94Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
    }

    public static m d() {
        m mVar = new m();
        mVar.b = -1;
        mVar.i = 1;
        mVar.e = 2130708361;
        mVar.f = e94.d;
        return mVar;
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
        Size size = this.d;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", this.e);
        createVideoFormat.setInteger("bitrate", this.j);
        int i = this.h;
        createVideoFormat.setInteger("frame-rate", i);
        int i2 = this.g;
        if (i != i2) {
            createVideoFormat.setInteger("operating-rate", i2);
            createVideoFormat.setInteger("priority", 0);
        }
        createVideoFormat.setInteger("i-frame-interval", this.i);
        int i3 = this.b;
        if (i3 != -1) {
            createVideoFormat.setInteger("profile", i3);
        }
        e94 e94Var = this.f;
        int i4 = e94Var.a;
        if (i4 != 0) {
            createVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = e94Var.b;
        if (i5 != 0) {
            createVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = e94Var.c;
        if (i6 != 0) {
            createVideoFormat.setInteger("color-range", i6);
        }
        return createVideoFormat;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d94) {
            d94 d94Var = (d94) obj;
            if (this.a.equals(d94Var.a) && this.b == d94Var.b && this.c.equals(d94Var.c) && this.d.equals(d94Var.d) && this.e == d94Var.e && this.f.equals(d94Var.f) && this.g == d94Var.g && this.h == d94Var.h && this.i == d94Var.i && this.j == d94Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j ^ ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", captureFrameRate=");
        sb.append(this.g);
        sb.append(", encodeFrameRate=");
        sb.append(this.h);
        sb.append(", IFrameInterval=");
        sb.append(this.i);
        sb.append(", bitrate=");
        return oyr.m(this.j, "}", sb);
    }
}

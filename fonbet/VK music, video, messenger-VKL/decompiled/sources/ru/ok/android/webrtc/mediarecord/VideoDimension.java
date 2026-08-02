package ru.ok.android.webrtc.mediarecord;

import xsna.cgn;
import xsna.de;
import xsna.h5s;
import xsna.odj;

/* loaded from: classes9.dex */
public final class VideoDimension {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public VideoDimension(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static /* synthetic */ VideoDimension copy$default(VideoDimension videoDimension, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = videoDimension.a;
        }
        if ((i6 & 2) != 0) {
            i2 = videoDimension.b;
        }
        if ((i6 & 4) != 0) {
            i3 = videoDimension.c;
        }
        if ((i6 & 8) != 0) {
            i4 = videoDimension.d;
        }
        if ((i6 & 16) != 0) {
            i5 = videoDimension.e;
        }
        int i7 = i5;
        int i8 = i3;
        return videoDimension.copy(i, i2, i8, i4, i7);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final VideoDimension copy(int i, int i2, int i3, int i4, int i5) {
        return new VideoDimension(i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDimension)) {
            return false;
        }
        VideoDimension videoDimension = (VideoDimension) obj;
        return this.a == videoDimension.a && this.b == videoDimension.b && this.c == videoDimension.c && this.d == videoDimension.d && this.e == videoDimension.e;
    }

    public final int getFps() {
        return this.e;
    }

    public final int getLandscapeHeight() {
        return this.b;
    }

    public final int getLandscapeWidth() {
        return this.a;
    }

    public final int getPortraitHeight() {
        return this.d;
    }

    public final int getPortraitWidth() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.e) + de.v(this.d, de.v(this.c, de.v(this.b, Integer.hashCode(this.a) * 31)));
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        StringBuilder a = odj.a(i, i2, "VideoDimension(landscapeWidth=", ", landscapeHeight=", ", portraitWidth=");
        cgn.a(i3, i4, ", portraitHeight=", ", fps=", a);
        return h5s.c(i5, ")", a);
    }
}

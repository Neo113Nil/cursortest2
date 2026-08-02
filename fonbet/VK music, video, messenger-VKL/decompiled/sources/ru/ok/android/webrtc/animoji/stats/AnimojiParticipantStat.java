package ru.ok.android.webrtc.animoji.stats;

import android.util.Size;
import xsna.cgn;
import xsna.de;
import xsna.epx;
import xsna.odj;

/* loaded from: classes9.dex */
public final class AnimojiParticipantStat {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Size e;

    public AnimojiParticipantStat(int i, int i2, int i3, int i4, Size size) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = size;
    }

    public static /* synthetic */ AnimojiParticipantStat copy$default(AnimojiParticipantStat animojiParticipantStat, int i, int i2, int i3, int i4, Size size, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = animojiParticipantStat.a;
        }
        if ((i5 & 2) != 0) {
            i2 = animojiParticipantStat.b;
        }
        if ((i5 & 4) != 0) {
            i3 = animojiParticipantStat.c;
        }
        if ((i5 & 8) != 0) {
            i4 = animojiParticipantStat.d;
        }
        if ((i5 & 16) != 0) {
            size = animojiParticipantStat.e;
        }
        Size size2 = size;
        int i6 = i3;
        return animojiParticipantStat.copy(i, i2, i6, i4, size2);
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

    public final Size component5() {
        return this.e;
    }

    public final AnimojiParticipantStat copy(int i, int i2, int i3, int i4, Size size) {
        return new AnimojiParticipantStat(i, i2, i3, i4, size);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimojiParticipantStat)) {
            return false;
        }
        AnimojiParticipantStat animojiParticipantStat = (AnimojiParticipantStat) obj;
        return this.a == animojiParticipantStat.a && this.b == animojiParticipantStat.b && this.c == animojiParticipantStat.c && this.d == animojiParticipantStat.d && epx.f(this.e, animojiParticipantStat.e);
    }

    public final int getDispatchedBgColors() {
        return this.b;
    }

    public final int getDispatchedFrames() {
        return this.a;
    }

    public final int getDispatchedLandmarks() {
        return this.c;
    }

    public final int getDrawnFrames() {
        return this.d;
    }

    public final Size getRenderResolution() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode() + de.v(this.d, de.v(this.c, de.v(this.b, Integer.hashCode(this.a) * 31)));
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        Size size = this.e;
        StringBuilder a = odj.a(i, i2, "AnimojiParticipantStat(dispatchedFrames=", ", dispatchedBgColors=", ", dispatchedLandmarks=");
        cgn.a(i3, i4, ", drawnFrames=", ", renderResolution=", a);
        a.append(size);
        a.append(")");
        return a.toString();
    }
}

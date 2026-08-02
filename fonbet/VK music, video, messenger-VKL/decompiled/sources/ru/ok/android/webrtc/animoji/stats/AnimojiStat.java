package ru.ok.android.webrtc.animoji.stats;

import java.util.Map;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.cgn;
import xsna.de;
import xsna.epx;
import xsna.odj;
import xsna.urd0;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class AnimojiStat {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final int i;
    public final Map j;

    public AnimojiStat(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, Map<CallParticipant.ParticipantId, AnimojiParticipantStat> map) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
        this.i = i7;
        this.j = map;
    }

    public static /* synthetic */ AnimojiStat copy$default(AnimojiStat animojiStat, int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = animojiStat.a;
        }
        if ((i8 & 2) != 0) {
            i2 = animojiStat.b;
        }
        if ((i8 & 4) != 0) {
            i3 = animojiStat.c;
        }
        if ((i8 & 8) != 0) {
            i4 = animojiStat.d;
        }
        if ((i8 & 16) != 0) {
            i5 = animojiStat.e;
        }
        if ((i8 & 32) != 0) {
            i6 = animojiStat.f;
        }
        if ((i8 & 64) != 0) {
            z = animojiStat.g;
        }
        if ((i8 & 128) != 0) {
            str = animojiStat.h;
        }
        if ((i8 & 256) != 0) {
            i7 = animojiStat.i;
        }
        if ((i8 & 512) != 0) {
            map = animojiStat.j;
        }
        int i9 = i7;
        Map map2 = map;
        boolean z2 = z;
        String str2 = str;
        int i10 = i5;
        int i11 = i6;
        return animojiStat.copy(i, i2, i3, i4, i10, i11, z2, str2, i9, map2);
    }

    public final int component1() {
        return this.a;
    }

    public final Map<CallParticipant.ParticipantId, AnimojiParticipantStat> component10() {
        return this.j;
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

    public final int component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final String component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public final AnimojiStat copy(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, int i7, Map<CallParticipant.ParticipantId, AnimojiParticipantStat> map) {
        return new AnimojiStat(i, i2, i3, i4, i5, i6, z, str, i7, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimojiStat)) {
            return false;
        }
        AnimojiStat animojiStat = (AnimojiStat) obj;
        return this.a == animojiStat.a && this.b == animojiStat.b && this.c == animojiStat.c && this.d == animojiStat.d && this.e == animojiStat.e && this.f == animojiStat.f && this.g == animojiStat.g && epx.f(this.h, animojiStat.h) && this.i == animojiStat.i && epx.f(this.j, animojiStat.j);
    }

    public final int getBytesRecv() {
        return this.e;
    }

    public final int getBytesSent() {
        return this.a;
    }

    public final String getMlConfigPath() {
        return this.h;
    }

    public final boolean getMlEnabled() {
        return this.g;
    }

    public final int getMlLandmarks() {
        return this.i;
    }

    public final int getPackagesDropped() {
        return this.c;
    }

    public final int getPackagesQueued() {
        return this.d;
    }

    public final int getPackagesRecv() {
        return this.f;
    }

    public final int getPackagesSent() {
        return this.b;
    }

    public final Map<CallParticipant.ParticipantId, AnimojiParticipantStat> getParticipantStats() {
        return this.j;
    }

    public int hashCode() {
        return this.j.hashCode() + de.v(this.i, urd0.a(wn4.b(this.g, de.v(this.f, de.v(this.e, de.v(this.d, de.v(this.c, de.v(this.b, Integer.hashCode(this.a) * 31)))))), 31, this.h));
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        boolean z = this.g;
        String str = this.h;
        int i7 = this.i;
        Map map = this.j;
        StringBuilder a = odj.a(i, i2, "AnimojiStat(bytesSent=", ", packagesSent=", ", packagesDropped=");
        cgn.a(i3, i4, ", packagesQueued=", ", bytesRecv=", a);
        cgn.a(i5, i6, ", packagesRecv=", ", mlEnabled=", a);
        a.append(z);
        a.append(", mlConfigPath=");
        a.append(str);
        a.append(", mlLandmarks=");
        a.append(i7);
        a.append(", participantStats=");
        a.append(map);
        a.append(")");
        return a.toString();
    }
}

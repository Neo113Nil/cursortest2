package ru.ok.android.webrtc;

import xsna.cgn;
import xsna.epx;
import xsna.i5s;
import xsna.jax0;
import xsna.odj;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PeerVideoSettings {
    public static final Companion Companion = new Companion(null);
    public static final int IDEAL_BITS_PER_MACROBLOCK = 533;
    public static final String SOURCE_DEFAULT = "";
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final PeerVideoSettingsBitrateTable f;
    public final int g;
    public final int h;
    public final String i;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public PeerVideoSettings(int i, int i2, int i3, int i4, String str, PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, int i5, int i6, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = peerVideoSettingsBitrateTable;
        this.g = i5;
        this.h = i6;
        this.i = str2;
    }

    public static /* synthetic */ PeerVideoSettings copy$default(PeerVideoSettings peerVideoSettings, int i, int i2, int i3, int i4, String str, PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, int i5, int i6, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = peerVideoSettings.a;
        }
        if ((i7 & 2) != 0) {
            i2 = peerVideoSettings.b;
        }
        if ((i7 & 4) != 0) {
            i3 = peerVideoSettings.c;
        }
        if ((i7 & 8) != 0) {
            i4 = peerVideoSettings.d;
        }
        if ((i7 & 16) != 0) {
            str = peerVideoSettings.e;
        }
        if ((i7 & 32) != 0) {
            peerVideoSettingsBitrateTable = peerVideoSettings.f;
        }
        if ((i7 & 64) != 0) {
            i5 = peerVideoSettings.g;
        }
        if ((i7 & 128) != 0) {
            i6 = peerVideoSettings.h;
        }
        if ((i7 & 256) != 0) {
            str2 = peerVideoSettings.i;
        }
        int i8 = i6;
        String str3 = str2;
        PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable2 = peerVideoSettingsBitrateTable;
        int i9 = i5;
        String str4 = str;
        int i10 = i3;
        return peerVideoSettings.copy(i, i2, i10, i4, str4, peerVideoSettingsBitrateTable2, i9, i8, str3);
    }

    public final PeerVideoSettings copy(int i, int i2, int i3, int i4, String str, PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, int i5, int i6, String str2) {
        return new PeerVideoSettings(i, i2, i3, i4, str, peerVideoSettingsBitrateTable, i5, i6, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !PeerVideoSettings.class.equals(obj.getClass())) {
            return false;
        }
        PeerVideoSettings peerVideoSettings = (PeerVideoSettings) obj;
        if (this.a == peerVideoSettings.a && this.b == peerVideoSettings.b && this.c == peerVideoSettings.c && this.d == peerVideoSettings.d && this.h == peerVideoSettings.h && epx.f(this.i, peerVideoSettings.i) && epx.f(this.f, peerVideoSettings.f) && this.g == peerVideoSettings.g) {
            return epx.f(this.e, peerVideoSettings.e);
        }
        return false;
    }

    public final int getBadNetDimensionScale() {
        return this.g;
    }

    public final int getBitrateByVideoSize(int i, int i2) {
        return (int) (Math.min(((i * i2) / 256) * IDEAL_BITS_PER_MACROBLOCK, this.c * 1024) / 1024);
    }

    public final PeerVideoSettingsBitrateTable getBitrateTable() {
        return this.f;
    }

    public final String getDegradationPreference() {
        return this.e;
    }

    public final int getInitialMaxDimension() {
        return this.b;
    }

    public final int getMaxBitrateK() {
        return this.c;
    }

    public final int getMaxDimension() {
        return this.a;
    }

    public final int getMaxDimensionForBitrateTableCalc() {
        return this.b / this.g;
    }

    public final int getMaxFrameRate() {
        return this.d;
    }

    public final PeerVideoSettings getRestrictedBitrateVideoSettings(int i, int i2) {
        return new PeerVideoSettings(this.a, this.b, getBitrateByVideoSize(i, i2), this.d, this.e, this.f, this.g);
    }

    public final String getSource() {
        return this.i;
    }

    public final int getTemporalLayersCount() {
        return this.h;
    }

    public int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31;
        String str = this.e;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable = this.f;
        int hashCode2 = (((hashCode + (peerVideoSettingsBitrateTable != null ? peerVideoSettingsBitrateTable.hashCode() : 0)) * 31) + this.g) * 31;
        String str2 = this.i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.h;
        String str = this.e;
        PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable = this.f;
        int i6 = this.g;
        String str2 = this.i;
        StringBuilder a = odj.a(i, i2, "PeerVideoSettings{maxDimension=", ", initialMaxDimension=", ", maxBitrateK=");
        cgn.a(i3, i4, ", maxFrameRate=", ", temporalLayersCount=", a);
        jax0.a(i5, ", degradationPreference='", str, "', bitrateTable=", a);
        a.append(peerVideoSettingsBitrateTable);
        a.append(", mediaAdaptationScale=");
        a.append(i6);
        a.append(", source='");
        return i5s.a(a, str2, "'}");
    }

    public PeerVideoSettings(int i, int i2, int i3, int i4, String str, PeerVideoSettingsBitrateTable peerVideoSettingsBitrateTable, int i5) {
        this(i, i2, i3, i4, str, peerVideoSettingsBitrateTable, i5, 0, "");
    }
}

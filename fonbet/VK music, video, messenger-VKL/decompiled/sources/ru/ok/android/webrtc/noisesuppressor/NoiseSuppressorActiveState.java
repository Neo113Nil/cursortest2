package ru.ok.android.webrtc.noisesuppressor;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.cgn;
import xsna.de;
import xsna.epx;
import xsna.gp;
import xsna.gsi0;
import xsna.gzs;
import xsna.nyh0;
import xsna.ozl;
import xsna.s3q0;
import xsna.tsk;
import xsna.wn4;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class NoiseSuppressorActiveState {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final PeerConnectionFactory.EnhancerKind f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final Runnable n;
    public final EnhancerKind o;

    public static final class Builder {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public EnhancerKind f;
        public PeerConnectionFactory.EnhancerKind g;
        public String h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public gzs o;

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[EnhancerKind.values().length];
                try {
                    iArr[EnhancerKind.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnhancerKind.PIPELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnhancerKind.BASELINE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[PeerConnectionFactory.EnhancerKind.values().length];
                try {
                    iArr2[PeerConnectionFactory.EnhancerKind.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[PeerConnectionFactory.EnhancerKind.PIPELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[PeerConnectionFactory.EnhancerKind.BASELINE.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static final void a(gzs gzsVar) {
            gzsVar.invoke();
        }

        public final NoiseSuppressorActiveState build() {
            boolean z;
            tsk tskVar;
            boolean z2 = this.a;
            boolean z3 = this.b;
            boolean z4 = this.c;
            boolean z5 = this.d;
            boolean z6 = this.e;
            PeerConnectionFactory.EnhancerKind enhancerKind = this.g;
            String str = this.h;
            int i = this.i;
            int i2 = this.j;
            int i3 = this.k;
            int i4 = this.l;
            int i5 = this.m;
            boolean z7 = this.n;
            gzs gzsVar = this.o;
            if (gzsVar != null) {
                z = z2;
                tskVar = new tsk(gzsVar, 6);
            } else {
                z = z2;
                tskVar = null;
            }
            return new NoiseSuppressorActiveState(z, z3, z4, z5, z6, enhancerKind, str, i, i2, i3, i4, i5, z7, tskVar, this.f);
        }

        public final Builder setClientsideAnn(boolean z) {
            this.e = z;
            return this;
        }

        public final Builder setClientsidePlatform(boolean z) {
            this.d = z;
            return this;
        }

        public final Builder setEnhancerKind(EnhancerKind enhancerKind) {
            this.f = enhancerKind;
            int i = enhancerKind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enhancerKind.ordinal()];
            this.g = i != 1 ? i != 2 ? i != 3 ? null : PeerConnectionFactory.EnhancerKind.BASELINE : PeerConnectionFactory.EnhancerKind.PIPELINE : PeerConnectionFactory.EnhancerKind.NONE;
            return this;
        }

        public final Builder setFallbackStutterCountMillis(int i) {
            this.l = i;
            return this;
        }

        public final Builder setFallbackTimeLimitMillis(int i) {
            this.k = i;
            return this;
        }

        public final Builder setFallbackTimeframeMillis(int i) {
            this.m = i;
            return this;
        }

        public final Builder setFilePath(String str) {
            this.h = str;
            return this;
        }

        public final Builder setInputSampleRate(int i) {
            this.i = i;
            return this;
        }

        public final Builder setLogTimings(boolean z) {
            this.n = z;
            return this;
        }

        public final Builder setNoiseSuppressorStuttering(boolean z) {
            this.a = z;
            return this;
        }

        public final Builder setOutputSampleRate(int i) {
            this.j = i;
            return this;
        }

        public final Builder setServersideAnn(boolean z) {
            this.c = z;
            return this;
        }

        public final Builder setServersideBasic(boolean z) {
            this.b = z;
            return this;
        }

        public final Builder setonNoiseSuppressorDisabledDueToStutter(Runnable runnable) {
            if (runnable != null) {
                this.o = new a(runnable);
            }
            return this;
        }

        public final Builder setonNoiseSuppressorDisabledDueToStutter(gzs<s3q0> gzsVar) {
            this.o = gzsVar;
            return this;
        }

        @ozl
        public final Builder setEnhancerKind(PeerConnectionFactory.EnhancerKind enhancerKind) {
            EnhancerKind enhancerKind2;
            this.g = enhancerKind;
            int i = enhancerKind == null ? -1 : WhenMappings.$EnumSwitchMapping$1[enhancerKind.ordinal()];
            if (i == 1) {
                enhancerKind2 = EnhancerKind.NONE;
            } else if (i != 2) {
                enhancerKind2 = i != 3 ? null : EnhancerKind.BASELINE;
            } else {
                enhancerKind2 = EnhancerKind.PIPELINE;
            }
            this.f = enhancerKind2;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EnhancerKind {
        public static final EnhancerKind BASELINE;
        public static final EnhancerKind NONE;
        public static final EnhancerKind PIPELINE;
        public static final /* synthetic */ EnhancerKind[] b;
        public static final /* synthetic */ zrp c;
        public final int a;

        static {
            EnhancerKind enhancerKind = new EnhancerKind("NONE", 0, 0);
            NONE = enhancerKind;
            EnhancerKind enhancerKind2 = new EnhancerKind("BASELINE", 1, 1);
            BASELINE = enhancerKind2;
            EnhancerKind enhancerKind3 = new EnhancerKind("PIPELINE", 2, 2);
            PIPELINE = enhancerKind3;
            EnhancerKind[] enhancerKindArr = {enhancerKind, enhancerKind2, enhancerKind3};
            b = enhancerKindArr;
            c = new asp(enhancerKindArr);
        }

        public EnhancerKind(String str, int i, int i2) {
            this.a = i2;
        }

        public static zrp<EnhancerKind> getEntries() {
            return c;
        }

        public static EnhancerKind valueOf(String str) {
            return (EnhancerKind) Enum.valueOf(EnhancerKind.class, str);
        }

        public static EnhancerKind[] values() {
            return (EnhancerKind[]) b.clone();
        }

        public final int getValue() {
            return this.a;
        }
    }

    public NoiseSuppressorActiveState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z6, Runnable runnable, EnhancerKind enhancerKind2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = enhancerKind;
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = z6;
        this.n = runnable;
        this.o = enhancerKind2;
    }

    public final boolean component1() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    public final int component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    public final Runnable component14() {
        return this.n;
    }

    public final EnhancerKind component15() {
        return this.o;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final PeerConnectionFactory.EnhancerKind component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public final NoiseSuppressorActiveState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z6, Runnable runnable, EnhancerKind enhancerKind2) {
        return new NoiseSuppressorActiveState(z, z2, z3, z4, z5, enhancerKind, str, i, i2, i3, i4, i5, z6, runnable, enhancerKind2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoiseSuppressorActiveState)) {
            return false;
        }
        NoiseSuppressorActiveState noiseSuppressorActiveState = (NoiseSuppressorActiveState) obj;
        return this.a == noiseSuppressorActiveState.a && this.b == noiseSuppressorActiveState.b && this.c == noiseSuppressorActiveState.c && this.d == noiseSuppressorActiveState.d && this.e == noiseSuppressorActiveState.e && this.f == noiseSuppressorActiveState.f && epx.f(this.g, noiseSuppressorActiveState.g) && this.h == noiseSuppressorActiveState.h && this.i == noiseSuppressorActiveState.i && this.j == noiseSuppressorActiveState.j && this.k == noiseSuppressorActiveState.k && this.l == noiseSuppressorActiveState.l && this.m == noiseSuppressorActiveState.m && epx.f(this.n, noiseSuppressorActiveState.n) && this.o == noiseSuppressorActiveState.o;
    }

    public final boolean getClientsideAnn() {
        return this.e;
    }

    public final boolean getClientsidePlatform() {
        return this.d;
    }

    public final PeerConnectionFactory.EnhancerKind getEnhancerKind() {
        return this.f;
    }

    public final int getFallbackStutterCountMillis() {
        return this.k;
    }

    public final int getFallbackTimeLimitMillis() {
        return this.j;
    }

    public final int getFallbackTimeframeMillis() {
        return this.l;
    }

    public final String getFilePath() {
        return this.g;
    }

    public final int getInputSampleRate() {
        return this.h;
    }

    public final EnhancerKind getKind() {
        return this.o;
    }

    public final boolean getLogTimings() {
        return this.m;
    }

    public final boolean getNoiseSuppressorStuttering() {
        return this.a;
    }

    public final Runnable getOnNoiseSuppressorDisabledDueToStutter() {
        return this.n;
    }

    public final int getOutputSampleRate() {
        return this.i;
    }

    public final boolean getServersideAnn() {
        return this.c;
    }

    public final boolean getServersideBasic() {
        return this.b;
    }

    public int hashCode() {
        int b = wn4.b(this.e, wn4.b(this.d, wn4.b(this.c, wn4.b(this.b, Boolean.hashCode(this.a) * 31))));
        PeerConnectionFactory.EnhancerKind enhancerKind = this.f;
        int hashCode = (b + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.g;
        int b2 = wn4.b(this.m, de.v(this.l, de.v(this.k, de.v(this.j, de.v(this.i, de.v(this.h, (hashCode + (str == null ? 0 : str.hashCode())) * 31))))));
        Runnable runnable = this.n;
        int hashCode2 = (b2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        EnhancerKind enhancerKind2 = this.o;
        return hashCode2 + (enhancerKind2 != null ? enhancerKind2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        PeerConnectionFactory.EnhancerKind enhancerKind = this.f;
        String str = this.g;
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        int i5 = this.l;
        boolean z6 = this.m;
        Runnable runnable = this.n;
        EnhancerKind enhancerKind2 = this.o;
        StringBuilder c = gp.c("NoiseSuppressorActiveState(noiseSuppressorStuttering=", ", serversideBasic=", ", serversideAnn=", z, z2);
        gsi0.c(c, z3, ", clientsidePlatform=", z4, ", clientsideAnn=");
        c.append(z5);
        c.append(", enhancerKind=");
        c.append(enhancerKind);
        c.append(", filePath=");
        nyh0.a(i, str, ", inputSampleRate=", ", outputSampleRate=", c);
        cgn.a(i2, i3, ", fallbackTimeLimitMillis=", ", fallbackStutterCountMillis=", c);
        cgn.a(i4, i5, ", fallbackTimeframeMillis=", ", logTimings=", c);
        c.append(z6);
        c.append(", onNoiseSuppressorDisabledDueToStutter=");
        c.append(runnable);
        c.append(", kind=");
        c.append(enhancerKind2);
        c.append(")");
        return c.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NoiseSuppressorActiveState(boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, org.webrtc.PeerConnectionFactory.EnhancerKind r24, java.lang.String r25, int r26, int r27, int r28, int r29, int r30, boolean r31, java.lang.Runnable r32, ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState.EnhancerKind r33, int r34, xsna.zcl r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L9
            r1 = 0
            r15 = r1
            goto Lb
        L9:
            r15 = r31
        Lb:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto L13
            r16 = r2
            goto L15
        L13:
            r16 = r32
        L15:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L36
            r17 = r2
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r2 = r18
            goto L52
        L36:
            r17 = r33
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
        L52:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState.<init>(boolean, boolean, boolean, boolean, boolean, org.webrtc.PeerConnectionFactory$EnhancerKind, java.lang.String, int, int, int, int, int, boolean, java.lang.Runnable, ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState$EnhancerKind, int, xsna.zcl):void");
    }

    @ozl
    public static /* synthetic */ void getEnhancerKind$annotations() {
    }
}

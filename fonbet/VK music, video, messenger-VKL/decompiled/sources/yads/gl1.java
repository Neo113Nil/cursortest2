package yads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import xsna.emb;

/* loaded from: classes10.dex */
public final class gl1 extends nl1 implements al1 {
    public final Context G0;
    public final cl H0;
    public final jl I0;
    public int J0;
    public boolean K0;
    public nx0 L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public mo2 Q0;

    public gl1(Context context, ee0 ee0Var, pl1 pl1Var, boolean z, Handler handler, xn0 xn0Var, zb0 zb0Var) {
        super(1, ee0Var, pl1Var, z, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = zb0Var;
        this.H0 = new cl(handler, xn0Var);
        zb0Var.a(new fl1(this));
    }

    @Override // yads.nl1
    public final va0 a(jl1 jl1Var, nx0 nx0Var, nx0 nx0Var2) {
        va0 a = jl1Var.a(nx0Var, nx0Var2);
        int i = a.e;
        if (a(nx0Var2, jl1Var) > this.J0) {
            i |= 64;
        }
        int i2 = i;
        return new va0(jl1Var.a, nx0Var, nx0Var2, i2 != 0 ? 0 : a.d, i2);
    }

    @Override // yads.nl1
    public final void b(sa0 sa0Var) {
        if (!this.N0 || sa0Var.b(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(sa0Var.f - this.M0) > 500000) {
            this.M0 = sa0Var.f;
        }
        this.N0 = false;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // yads.nl1, yads.ro
    public final boolean f() {
        if (!this.x0) {
            return false;
        }
        zb0 zb0Var = (zb0) this.I0;
        if (!zb0Var.f()) {
            return true;
        }
        if (zb0Var.S) {
            return (zb0Var.f() && zb0Var.i.b(zb0Var.d())) ? false : true;
        }
        return false;
    }

    @Override // yads.nl1, yads.ro
    public final boolean g() {
        zb0 zb0Var = (zb0) this.I0;
        return (zb0Var.f() && zb0Var.i.b(zb0Var.d())) || super.g();
    }

    @Override // yads.al1
    public final ff2 getPlaybackParameters() {
        zb0 zb0Var = (zb0) this.I0;
        return zb0Var.k ? zb0Var.y : zb0Var.c().a;
    }

    @Override // yads.ro
    public final void h() {
        this.P0 = true;
        try {
            ((zb0) this.I0).b();
            try {
                this.B = null;
                this.C0 = C.TIME_UNSET;
                this.D0 = C.TIME_UNSET;
                this.E0 = 0;
                p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.B = null;
                this.C0 = C.TIME_UNSET;
                this.D0 = C.TIME_UNSET;
                this.E0 = 0;
                p();
                throw th;
            } finally {
            }
        }
    }

    @Override // yads.ro, yads.bg2
    public final void handleMessage(int i, Object obj) {
        if (i == 2) {
            jl jlVar = this.I0;
            float floatValue = ((Float) obj).floatValue();
            zb0 zb0Var = (zb0) jlVar;
            if (zb0Var.J != floatValue) {
                zb0Var.J = floatValue;
                zb0Var.k();
                return;
            }
            return;
        }
        if (i == 3) {
            pk pkVar = (pk) obj;
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.v.equals(pkVar)) {
                return;
            }
            zb0Var2.v = pkVar;
            if (zb0Var2.Y) {
                return;
            }
            zb0Var2.b();
            return;
        }
        if (i == 6) {
            ((zb0) this.I0).a((ql) obj);
            return;
        }
        switch (i) {
            case 9:
                jl jlVar2 = this.I0;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zb0 zb0Var3 = (zb0) jlVar2;
                ff2 ff2Var = zb0Var3.c().a;
                ub0 c = zb0Var3.c();
                if (!ff2Var.equals(c.a) || booleanValue != c.b) {
                    ub0 ub0Var = new ub0(ff2Var, booleanValue, C.TIME_UNSET, C.TIME_UNSET);
                    if (!zb0Var3.f()) {
                        zb0Var3.x = ub0Var;
                        break;
                    } else {
                        zb0Var3.w = ub0Var;
                        break;
                    }
                }
                break;
            case 10:
                jl jlVar3 = this.I0;
                int intValue = ((Integer) obj).intValue();
                zb0 zb0Var4 = (zb0) jlVar3;
                if (zb0Var4.W != intValue) {
                    zb0Var4.W = intValue;
                    zb0Var4.V = intValue != 0;
                    zb0Var4.b();
                    break;
                }
                break;
            case 11:
                this.Q0 = (mo2) obj;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.m0 = false;
                this.u.b();
                this.t.b();
                this.l0 = false;
                this.k0 = false;
                u();
            } finally {
                nk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            if (this.P0) {
                this.P0 = false;
                zb0 zb0Var = (zb0) this.I0;
                zb0Var.b();
                for (bl blVar : zb0Var.f) {
                    blVar.reset();
                }
                for (bl blVar2 : zb0Var.g) {
                    blVar2.reset();
                }
                zb0Var.U = false;
                zb0Var.a0 = false;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        ((zb0) this.I0).h();
    }

    @Override // yads.ro
    public final void k() {
        long a = ((zb0) this.I0).a(f());
        if (a != Long.MIN_VALUE) {
            if (!this.O0) {
                a = Math.max(this.M0, a);
            }
            this.M0 = a;
            this.O0 = false;
        }
        ((zb0) this.I0).g();
    }

    @Override // yads.nl1
    public final void s() {
        ((zb0) this.I0).G = true;
    }

    @Override // yads.nl1
    public final void v() {
        try {
            zb0 zb0Var = (zb0) this.I0;
            if (!zb0Var.S && zb0Var.f() && zb0Var.a()) {
                zb0Var.i();
                zb0Var.S = true;
            }
        } catch (il e) {
            throw a(IronSourceConstants.errorCode_isReadyException, e.d, e, e.c);
        }
    }

    @Override // yads.nl1
    public final float a(float f, nx0[] nx0VarArr) {
        int i = -1;
        for (nx0 nx0Var : nx0VarArr) {
            int i2 = nx0Var.A;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // yads.nl1
    public final boolean b(nx0 nx0Var) {
        return ((zb0) this.I0).a(nx0Var) != 0;
    }

    @Override // yads.nl1
    public final ArrayList a(pl1 pl1Var, nx0 nx0Var, boolean z) {
        return xl1.a(a(pl1Var, nx0Var, z, this.I0), nx0Var);
    }

    public static s51 a(pl1 pl1Var, nx0 nx0Var, boolean z, jl jlVar) {
        String str = nx0Var.m;
        if (str == null) {
            p51 p51Var = s51.c;
            return tn2.f;
        }
        if (((zb0) jlVar).a(nx0Var) != 0) {
            List a = xl1.a(MimeTypes.AUDIO_RAW, false, false);
            jl1 jl1Var = a.isEmpty() ? null : (jl1) a.get(0);
            if (jl1Var != null) {
                return s51.a(jl1Var);
            }
        }
        List decoderInfos = pl1Var.getDecoderInfos(str, z, false);
        String a2 = xl1.a(nx0Var);
        if (a2 == null) {
            return s51.a((Collection) decoderInfos);
        }
        List decoderInfos2 = pl1Var.getDecoderInfos(a2, z, false);
        p51 p51Var2 = s51.c;
        return new o51().a(decoderInfos).a(decoderInfos2).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("QVhPTiA3IG1pbmk=", 0), r7).equals(r6) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[LOOP:1: B:26:0x00b3->B:28:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    @Override // yads.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bl1 a(jl1 jl1Var, nx0 nx0Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        MediaFormat mediaFormat;
        List list;
        int i;
        nx0[] nx0VarArr = this.i;
        nx0VarArr.getClass();
        int a = a(nx0Var, jl1Var);
        if (nx0VarArr.length != 1) {
            for (nx0 nx0Var2 : nx0VarArr) {
                if (jl1Var.a(nx0Var, nx0Var2).d != 0) {
                    a = Math.max(a, a(nx0Var2, jl1Var));
                }
            }
        }
        this.J0 = a;
        String str = jl1Var.a;
        int i2 = mc3.a;
        if (i2 < 24) {
            byte[] decode = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
            Charset charset = emb.b;
            if (new String(decode, charset).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset).equals(mc3.c)) {
                String str2 = mc3.b;
                if (str2.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb2x0ZQ==", 0), charset)) || str2.startsWith(new String(Base64.decode("aGVyb3FsdGU=", 0), charset))) {
                    z = true;
                    this.K0 = z;
                    String str3 = jl1Var.c;
                    int i3 = this.J0;
                    mediaFormat = new MediaFormat();
                    mediaFormat.setString("mime", str3);
                    mediaFormat.setInteger("channel-count", nx0Var.z);
                    mediaFormat.setInteger("sample-rate", nx0Var.A);
                    list = nx0Var.o;
                    for (i = 0; i < list.size(); i++) {
                        mediaFormat.setByteBuffer(nh2.a("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
                    }
                    rm1.a(mediaFormat, "max-input-size", i3);
                    if (i2 >= 23) {
                        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                        if (f != -1.0f) {
                            if (i2 == 23) {
                                byte[] decode2 = Base64.decode("WlRFIEIyMDE3Rw==", 0);
                                Charset charset2 = emb.b;
                                String str4 = new String(decode2, charset2);
                                String str5 = mc3.d;
                                if (!str4.equals(str5)) {
                                }
                            }
                            mediaFormat.setFloat("operating-rate", f);
                        }
                    }
                    if (i2 <= 28 && "audio/ac4".equals(nx0Var.m)) {
                        mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), emb.b), 1);
                    }
                    if (i2 >= 24) {
                        jl jlVar = this.I0;
                        int i4 = nx0Var.z;
                        int i5 = nx0Var.A;
                        mx0 mx0Var = new mx0();
                        mx0Var.k = MimeTypes.AUDIO_RAW;
                        mx0Var.x = i4;
                        mx0Var.y = i5;
                        mx0Var.z = 4;
                        if (((zb0) jlVar).a(new nx0(mx0Var)) == 2) {
                            mediaFormat.setInteger("pcm-encoding", 4);
                        }
                    }
                    if (i2 >= 32) {
                        mediaFormat.setInteger("max-output-channel-count", 99);
                    }
                    this.L0 = (MimeTypes.AUDIO_RAW.equals(jl1Var.b) || MimeTypes.AUDIO_RAW.equals(nx0Var.m)) ? null : nx0Var;
                    return new bl1(jl1Var, mediaFormat, nx0Var, null, mediaCrypto);
                }
            }
        }
        z = false;
        this.K0 = z;
        String str32 = jl1Var.c;
        int i32 = this.J0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", nx0Var.z);
        mediaFormat.setInteger("sample-rate", nx0Var.A);
        list = nx0Var.o;
        while (i < list.size()) {
        }
        rm1.a(mediaFormat, "max-input-size", i32);
        if (i2 >= 23) {
        }
        if (i2 <= 28) {
            mediaFormat.setInteger(new String(Base64.decode("YWM0LWlzLXN5bmM=", 0), emb.b), 1);
        }
        if (i2 >= 24) {
        }
        if (i2 >= 32) {
        }
        this.L0 = (MimeTypes.AUDIO_RAW.equals(jl1Var.b) || MimeTypes.AUDIO_RAW.equals(nx0Var.m)) ? null : nx0Var;
        return new bl1(jl1Var, mediaFormat, nx0Var, null, mediaCrypto);
    }

    @Override // yads.ro
    public final al1 c() {
        return this;
    }

    @Override // yads.al1
    public final long a() {
        if (this.g == 2) {
            long a = ((zb0) this.I0).a(f());
            if (a != Long.MIN_VALUE) {
                if (!this.O0) {
                    a = Math.max(this.M0, a);
                }
                this.M0 = a;
                this.O0 = false;
            }
        }
        return this.M0;
    }

    @Override // yads.nl1
    public final void a(Exception exc) {
        ji1.b("MediaCodecAudioRenderer", ji1.a("Audio codec error", exc));
        this.H0.a(exc);
    }

    @Override // yads.nl1
    public final void a(String str, long j, long j2) {
        this.H0.a(str, j, j2);
    }

    @Override // yads.nl1
    public final void a(String str) {
        this.H0.a(str);
    }

    @Override // yads.ro
    public final void a(boolean z) {
        pa0 pa0Var = new pa0();
        this.B0 = pa0Var;
        this.H0.b(pa0Var);
        no2 no2Var = this.d;
        no2Var.getClass();
        if (no2Var.a) {
            zb0 zb0Var = (zb0) this.I0;
            zb0Var.getClass();
            if (mc3.a >= 21) {
                if (zb0Var.V) {
                    if (!zb0Var.Y) {
                        zb0Var.Y = true;
                        zb0Var.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.Y) {
                zb0Var2.Y = false;
                zb0Var2.b();
            }
        }
        jl jlVar = this.I0;
        zf2 zf2Var = this.f;
        zf2Var.getClass();
        ((zb0) jlVar).q = zf2Var;
    }

    @Override // yads.nl1
    public final va0 a(ox0 ox0Var) {
        va0 a = super.a(ox0Var);
        this.H0.a(ox0Var.b, a);
        return a;
    }

    @Override // yads.nl1
    public final void a(nx0 nx0Var, MediaFormat mediaFormat) {
        int b;
        int i;
        nx0 nx0Var2 = this.L0;
        int[] iArr = null;
        if (nx0Var2 != null) {
            nx0Var = nx0Var2;
        } else if (this.K != null) {
            if (MimeTypes.AUDIO_RAW.equals(nx0Var.m)) {
                b = nx0Var.B;
            } else if (mc3.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                b = mediaFormat.getInteger("pcm-encoding");
            } else {
                b = mediaFormat.containsKey("v-bits-per-sample") ? mc3.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            mx0 mx0Var = new mx0();
            mx0Var.k = MimeTypes.AUDIO_RAW;
            mx0Var.z = b;
            mx0Var.A = nx0Var.C;
            mx0Var.B = nx0Var.D;
            mx0Var.x = mediaFormat.getInteger("channel-count");
            mx0Var.y = mediaFormat.getInteger("sample-rate");
            nx0 nx0Var3 = new nx0(mx0Var);
            if (this.K0 && nx0Var3.z == 6 && (i = nx0Var.z) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < nx0Var.z; i2++) {
                    iArr[i2] = i2;
                }
            }
            nx0Var = nx0Var3;
        }
        try {
            ((zb0) this.I0).a(nx0Var, iArr);
        } catch (el e) {
            throw a(IronSourceConstants.errorCode_biddingDataException, e.b, (Exception) e, false);
        }
    }

    @Override // yads.nl1, yads.ro
    public final void a(long j, boolean z) {
        super.a(j, z);
        ((zb0) this.I0).b();
        this.M0 = j;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // yads.nl1
    public final boolean a(long j, long j2, el1 el1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, nx0 nx0Var) {
        byteBuffer.getClass();
        if (this.L0 != null && (i2 & 2) != 0) {
            el1Var.getClass();
            el1Var.a(false, i);
            return true;
        }
        if (z) {
            if (el1Var != null) {
                el1Var.a(false, i);
            }
            this.B0.f += i3;
            ((zb0) this.I0).G = true;
            return true;
        }
        try {
            if (!((zb0) this.I0).a(byteBuffer, j3, i3)) {
                return false;
            }
            if (el1Var != null) {
                el1Var.a(false, i);
            }
            this.B0.e += i3;
            return true;
        } catch (fl e) {
            throw a(IronSourceConstants.errorCode_biddingDataException, e.d, e, e.c);
        } catch (il e2) {
            throw a(IronSourceConstants.errorCode_isReadyException, nx0Var, e2, e2.c);
        }
    }

    @Override // yads.al1
    public final void a(ff2 ff2Var) {
        zb0 zb0Var = (zb0) this.I0;
        zb0Var.getClass();
        float f = ff2Var.b;
        int i = mc3.a;
        ff2 ff2Var2 = new ff2(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(ff2Var.c, 8.0f)));
        if (zb0Var.k && mc3.a >= 23) {
            zb0Var.a(ff2Var2);
            return;
        }
        boolean z = zb0Var.c().b;
        ub0 c = zb0Var.c();
        if (ff2Var2.equals(c.a) && z == c.b) {
            return;
        }
        ub0 ub0Var = new ub0(ff2Var2, z, C.TIME_UNSET, C.TIME_UNSET);
        if (zb0Var.f()) {
            zb0Var.w = ub0Var;
        } else {
            zb0Var.x = ub0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if ((r4.isEmpty() ? null : (yads.jl1) r4.get(0)) != null) goto L30;
     */
    @Override // yads.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(pl1 pl1Var, nx0 nx0Var) {
        boolean z;
        if (!"audio".equals(iu1.c(nx0Var.m))) {
            return ro.a(0, 0, 0);
        }
        int i = mc3.a >= 21 ? 32 : 0;
        int i2 = nx0Var.F;
        boolean z2 = true;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        if (z4 && ((zb0) this.I0).a(nx0Var) != 0) {
            if (z3) {
                List a = xl1.a(MimeTypes.AUDIO_RAW, false, false);
            }
            return ro.a(4, 8, i);
        }
        if (MimeTypes.AUDIO_RAW.equals(nx0Var.m) && ((zb0) this.I0).a(nx0Var) == 0) {
            return ro.a(1, 0, 0);
        }
        jl jlVar = this.I0;
        int i4 = nx0Var.z;
        int i5 = nx0Var.A;
        mx0 mx0Var = new mx0();
        mx0Var.k = MimeTypes.AUDIO_RAW;
        mx0Var.x = i4;
        mx0Var.y = i5;
        mx0Var.z = 2;
        if (((zb0) jlVar).a(new nx0(mx0Var)) != 0) {
            s51 a2 = a(pl1Var, nx0Var, false, this.I0);
            if (a2.isEmpty()) {
                return ro.a(1, 0, 0);
            }
            if (!z4) {
                return ro.a(2, 0, 0);
            }
            jl1 jl1Var = (jl1) a2.get(0);
            boolean a3 = jl1Var.a(nx0Var);
            if (!a3) {
                for (int i6 = 1; i6 < a2.size(); i6++) {
                    jl1 jl1Var2 = (jl1) a2.get(i6);
                    if (jl1Var2.a(nx0Var)) {
                        z = false;
                        jl1Var = jl1Var2;
                        break;
                    }
                }
            }
            z = true;
            z2 = a3;
            int i7 = z2 ? 4 : 3;
            if (z2 && jl1Var.b(nx0Var)) {
                i3 = 16;
            }
            return i7 | i3 | i | (jl1Var.g ? 64 : 0) | (z ? 128 : 0);
        }
        return ro.a(1, 0, 0);
    }

    public final int a(nx0 nx0Var, jl1 jl1Var) {
        int i;
        if (!ql2.a.a().equals(jl1Var.a) || (i = mc3.a) >= 24 || (i == 23 && mc3.d(this.G0))) {
            return nx0Var.n;
        }
        return -1;
    }
}

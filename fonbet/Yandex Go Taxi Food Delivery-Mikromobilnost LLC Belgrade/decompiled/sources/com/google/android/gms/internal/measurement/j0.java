package com.google.android.gms.internal.measurement;

import android.os.Build;
import defpackage.d7b1;
import defpackage.hw91;
import defpackage.i7b1;
import defpackage.jza1;
import defpackage.kya1;
import defpackage.o0b1;
import defpackage.vqa1;
import defpackage.z0b1;
import defpackage.zaa1;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class j0 extends a1 {
    private static final j0 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private z0b1 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private k0 zzQ;
    private o0b1 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private h0 zzaa;
    private String zzab;
    private z0b1 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private z zzal;
    private int zzam;
    private x zzan;
    private String zzao;
    private n0 zzap;
    private long zzaq;
    private String zzar;
    private c0 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private z0b1 zzf;
    private z0b1 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        j0 j0Var = new j0();
        zzat = j0Var;
        a1.o(j0.class, j0Var);
    }

    public j0() {
        d7b1 d7b1Var = d7b1.x;
        this.zzf = d7b1Var;
        this.zzg = d7b1Var;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = d7b1Var;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = jza1.x;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = d7b1Var;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    public static zaa1 W() {
        return (zaa1) zzat.j();
    }

    public static zaa1 X(j0 j0Var) {
        kya1 j = zzat.j();
        j.g(j0Var);
        return (zaa1) j;
    }

    public final String A() {
        return this.zzy;
    }

    public final long A0() {
        return this.zzae;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean B() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean B0() {
        return this.zzaf;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final long C() {
        return this.zzz;
    }

    public final boolean C0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void C1(boolean z) {
        this.zzb |= 131072;
        this.zzx = z;
    }

    public final boolean D() {
        return (this.zzb & 1048576) != 0;
    }

    public final String D0() {
        return this.zzag;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int E() {
        return this.zzA;
    }

    public final boolean E0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void E1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String F() {
        return this.zzB;
    }

    public final boolean F0() {
        return this.zzah;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String G() {
        return this.zzC;
    }

    public final boolean G0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void G1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final boolean H() {
        return (this.zzb & SelfTester_JCP.ENCRYPT_CNT) != 0;
    }

    public final String H0() {
        return this.zzai;
    }

    public final /* synthetic */ void H1(int i) {
        this.zzb |= 1048576;
        this.zzA = i;
    }

    public final boolean I() {
        return this.zzD;
    }

    public final int I0() {
        return this.zzaj;
    }

    public final /* synthetic */ void I1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final z0b1 J() {
        return this.zzE;
    }

    public final boolean J0() {
        return (this.zzd & SelfTester_JCP.ENCRYPT_CBC) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String K() {
        return this.zzF;
    }

    public final z K0() {
        z zVar = this.zzal;
        return zVar == null ? z.z() : zVar;
    }

    public final /* synthetic */ void K1(String str) {
        str.getClass();
        this.zzb |= SelfTester_JCP.ENCRYPT_CBC;
        this.zzC = str;
    }

    public final boolean L() {
        return (this.zzb & SelfTester_JCP.DECRYPT_CFB) != 0;
    }

    public final boolean L0() {
        return (this.zzd & SelfTester_JCP.ENCRYPT_CNT) != 0;
    }

    public final /* synthetic */ void L1() {
        this.zzb |= SelfTester_JCP.ENCRYPT_CNT;
        this.zzD = false;
    }

    public final int M() {
        return this.zzG;
    }

    public final int M0() {
        return this.zzam;
    }

    public final void M1(ArrayList arrayList) {
        z0b1 z0b1Var = this.zzE;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzE = z0b1Var.b0(size + size);
        }
        w0.f(arrayList, this.zzE);
    }

    public final boolean N() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void N1() {
        this.zzE = d7b1.x;
    }

    public final long O() {
        return this.zzK;
    }

    public final x O0() {
        x xVar = this.zzan;
        return xVar == null ? x.R() : xVar;
    }

    public final /* synthetic */ void O1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean P() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean P0() {
        return (this.zzd & SelfTester_JCP.DECRYPT_CBC) != 0;
    }

    public final /* synthetic */ void P1(int i) {
        this.zzb |= SelfTester_JCP.DECRYPT_CFB;
        this.zzG = i;
    }

    public final String Q() {
        return this.zzM;
    }

    public final n0 Q0() {
        n0 n0Var = this.zzap;
        return n0Var == null ? n0.t() : n0Var;
    }

    public final /* synthetic */ void Q1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean R() {
        return (this.zzb & 1) != 0;
    }

    public final int R0() {
        return this.zze;
    }

    public final List R1() {
        return this.zzf;
    }

    public final boolean S() {
        return (this.zzd & SelfTester_JCP.DECRYPT_CNT) != 0;
    }

    public final /* synthetic */ void S0(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    public final void S1() {
        z0b1 z0b1Var = this.zzf;
        if (((vqa1) z0b1Var).a) {
            return;
        }
        int size = z0b1Var.size();
        this.zzf = z0b1Var.b0(size + size);
    }

    public final long T() {
        return this.zzaq;
    }

    public final /* synthetic */ void T0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void T1() {
        z0b1 z0b1Var = this.zzg;
        if (((vqa1) z0b1Var).a) {
            return;
        }
        int size = z0b1Var.size();
        this.zzg = z0b1Var.b0(size + size);
    }

    public final boolean U() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void U0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int U1() {
        return this.zzf.size();
    }

    public final c0 V() {
        c0 c0Var = this.zzas;
        return c0Var == null ? c0.t() : c0Var;
    }

    public final /* synthetic */ void V0(int i) {
        this.zzd |= 2;
        this.zzO = i;
    }

    public final e0 V1(int i) {
        return (e0) this.zzf.get(i);
    }

    public final void W0(ArrayList arrayList) {
        List list = this.zzR;
        if (!((vqa1) list).a) {
            int size = list.size();
            this.zzR = ((jza1) list).b0(size + size);
        }
        w0.f(arrayList, this.zzR);
    }

    public final z0b1 W1() {
        return this.zzg;
    }

    public final /* synthetic */ void X0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int X1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void Y() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void Y0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final o0 Y1(int i) {
        return (o0) this.zzg.get(i);
    }

    public final /* synthetic */ void Z(int i, e0 e0Var) {
        S1();
        this.zzf.set(i, e0Var);
    }

    public final /* synthetic */ void Z0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean Z1() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void a0(e0 e0Var) {
        S1();
        this.zzf.add(e0Var);
    }

    public final /* synthetic */ void a1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long a2() {
        return this.zzh;
    }

    public final /* synthetic */ void b0(Iterable iterable) {
        S1();
        w0.f(iterable, this.zzf);
    }

    public final /* synthetic */ void b1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean b2() {
        return (this.zzb & 4) != 0;
    }

    public final void c0() {
        this.zzf = d7b1.x;
    }

    public final void c1(Set set) {
        z0b1 z0b1Var = this.zzac;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzac = z0b1Var.b0(size + size);
        }
        w0.f(set, this.zzac);
    }

    public final long c2() {
        return this.zzi;
    }

    public final /* synthetic */ void d0(int i) {
        S1();
        this.zzf.remove(i);
    }

    public final /* synthetic */ void d1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean d2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void e0(int i, o0 o0Var) {
        T1();
        this.zzg.set(i, o0Var);
    }

    public final /* synthetic */ void e1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long e2() {
        return this.zzj;
    }

    public final /* synthetic */ void f0(o0 o0Var) {
        T1();
        this.zzg.add(o0Var);
    }

    public final /* synthetic */ void f1(boolean z) {
        this.zzd |= 65536;
        this.zzaf = z;
    }

    public final boolean f2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void g0(int i) {
        T1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void g1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long g2() {
        return this.zzk;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void h1(boolean z) {
        this.zzd |= 262144;
        this.zzah = z;
    }

    public final boolean h2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void i0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long i2() {
        return this.zzl;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void j1(int i) {
        this.zzd |= 1048576;
        this.zzaj = i;
    }

    public final String j2() {
        return this.zzm;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void k1(z zVar) {
        this.zzal = zVar;
        this.zzd |= SelfTester_JCP.ENCRYPT_CBC;
    }

    public final String k2() {
        return this.zzn;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void l1(int i) {
        this.zzd |= SelfTester_JCP.ENCRYPT_CNT;
        this.zzam = i;
    }

    public final String l2() {
        return this.zzo;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void m1(x xVar) {
        this.zzan = xVar;
        this.zzd |= 16777216;
    }

    public final String m2() {
        return this.zzp;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void n1(n0 n0Var) {
        this.zzap = n0Var;
        this.zzd |= SelfTester_JCP.DECRYPT_CBC;
    }

    public final boolean n2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void o1(long j) {
        this.zzd |= SelfTester_JCP.DECRYPT_CNT;
        this.zzaq = j;
    }

    public final int o2() {
        return this.zzq;
    }

    public final /* synthetic */ void p0() {
        this.zzb |= 64;
        this.zzm = ConstantDeviceInfo.APP_PLATFORM;
    }

    public final /* synthetic */ void p1() {
        this.zzd |= SelfTester_JCP.IMITA;
        this.zzar = "";
    }

    public final String p2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", e0.class, "zzg", o0.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", a0.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", hw91.e, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new j0();
        }
        if (i2 == 4) {
            return new zaa1(zzat);
        }
        if (i2 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void q0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void q1(c0 c0Var) {
        this.zzas = c0Var;
        this.zzd |= 536870912;
    }

    public final String r() {
        return this.zzs;
    }

    public final boolean r0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void r1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String s() {
        return this.zzt;
    }

    public final int s0() {
        return this.zzO;
    }

    public final /* synthetic */ void s1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean t() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean t0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long u() {
        return this.zzu;
    }

    public final long u0() {
        return this.zzS;
    }

    public final /* synthetic */ void u1(int i) {
        this.zzb |= 1024;
        this.zzq = i;
    }

    public final boolean v() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean v0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long w() {
        return this.zzv;
    }

    public final String w0() {
        return this.zzV;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final String x() {
        return this.zzw;
    }

    public final boolean x0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean y() {
        return (this.zzb & 131072) != 0;
    }

    public final String y0() {
        return this.zzab;
    }

    public final /* synthetic */ void y1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean z() {
        return this.zzx;
    }

    public final boolean z0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void z1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }
}

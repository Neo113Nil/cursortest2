package yads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class zq implements q83 {
    public final int a;
    public final nx0 b;
    public final bl0 c = new bl0();
    public nx0 d;
    public q83 e;
    public long f;

    public zq(int i, int i2, nx0 nx0Var) {
        this.a = i2;
        this.b = nx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    @Override // yads.q83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nx0 nx0Var) {
        nx0 nx0Var2;
        String str;
        String str2;
        String str3;
        nx0 nx0Var3 = this.b;
        if (nx0Var3 != null) {
            if (nx0Var != nx0Var3) {
                int d = iu1.d(nx0Var.m);
                String str4 = nx0Var3.b;
                String str5 = nx0Var3.c;
                if (str5 == null) {
                    str5 = nx0Var.c;
                }
                String str6 = nx0Var.d;
                if ((d == 3 || d == 1) && (str = nx0Var3.d) != null) {
                    str6 = str;
                }
                int i = nx0Var.g;
                if (i == -1) {
                    i = nx0Var3.g;
                }
                int i2 = nx0Var.h;
                if (i2 == -1) {
                    i2 = nx0Var3.h;
                }
                String str7 = nx0Var.j;
                if (str7 == null) {
                    String str8 = nx0Var3.j;
                    String[] split = TextUtils.isEmpty(str8) ? new String[0] : str8.trim().split("(\\s*,\\s*)", -1);
                    if (split.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        int length = split.length;
                        int i3 = 0;
                        while (i3 < length) {
                            String str9 = split[i3];
                            int i4 = length;
                            if (d == iu1.d(iu1.a(str9))) {
                                if (sb.length() > 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(str9);
                            }
                            i3++;
                            length = i4;
                        }
                        if (sb.length() > 0) {
                            str3 = sb.toString();
                            if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                                str7 = str3;
                            }
                        }
                    }
                    str3 = null;
                    if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                    }
                }
                ut1 ut1Var = nx0Var.k;
                if (ut1Var == null) {
                    ut1Var = nx0Var3.k;
                } else {
                    ut1 ut1Var2 = nx0Var3.k;
                    if (ut1Var2 != null) {
                        tt1[] tt1VarArr = ut1Var2.b;
                        if (tt1VarArr.length != 0) {
                            ut1Var = new ut1((tt1[]) mc3.a((Object[]) ut1Var.b, (Object[]) tt1VarArr));
                        }
                    }
                }
                float f = nx0Var.t;
                if (f == -1.0f && d == 2) {
                    f = nx0Var3.t;
                }
                int i5 = nx0Var.e | nx0Var3.e;
                int i6 = nx0Var.f | nx0Var3.f;
                lk0 lk0Var = nx0Var3.p;
                lk0 lk0Var2 = nx0Var.p;
                ArrayList arrayList = new ArrayList();
                if (lk0Var != null) {
                    String str10 = lk0Var.d;
                    kk0[] kk0VarArr = lk0Var.b;
                    int length2 = kk0VarArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = i7;
                        kk0 kk0Var = kk0VarArr[i8];
                        int i9 = length2;
                        if (kk0Var.f != null) {
                            arrayList.add(kk0Var);
                        }
                        i7 = i8 + 1;
                        length2 = i9;
                    }
                    str2 = str10;
                } else {
                    str2 = null;
                }
                if (lk0Var2 != null) {
                    if (str2 == null) {
                        str2 = lk0Var2.d;
                    }
                    int size = arrayList.size();
                    kk0[] kk0VarArr2 = lk0Var2.b;
                    String str11 = str2;
                    int length3 = kk0VarArr2.length;
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = i10;
                        kk0 kk0Var2 = kk0VarArr2[i11];
                        int i12 = length3;
                        if (kk0Var2.f != null) {
                            UUID uuid = kk0Var2.c;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    arrayList.add(kk0Var2);
                                    break;
                                }
                                int i14 = i13;
                                if (((kk0) arrayList.get(i13)).c.equals(uuid)) {
                                    break;
                                } else {
                                    i13 = i14 + 1;
                                }
                            }
                        }
                        i10 = i11 + 1;
                        length3 = i12;
                    }
                    str2 = str11;
                }
                lk0 lk0Var3 = arrayList.isEmpty() ? null : new lk0(str2, false, (kk0[]) arrayList.toArray(new kk0[0]));
                mx0 mx0Var = new mx0(nx0Var);
                mx0Var.a = str4;
                mx0Var.b = str5;
                mx0Var.c = str6;
                mx0Var.d = i5;
                mx0Var.e = i6;
                mx0Var.f = i;
                mx0Var.g = i2;
                mx0Var.h = str7;
                mx0Var.i = ut1Var;
                mx0Var.n = lk0Var3;
                mx0Var.r = f;
                nx0Var2 = new nx0(mx0Var);
                this.d = nx0Var2;
                q83 q83Var = this.e;
                int i15 = mc3.a;
                q83Var.a(nx0Var2);
            }
            nx0Var.getClass();
        }
        nx0Var2 = nx0Var;
        this.d = nx0Var2;
        q83 q83Var2 = this.e;
        int i152 = mc3.a;
        q83Var2.a(nx0Var2);
    }

    @Override // yads.q83
    public final int a(l30 l30Var, int i, boolean z) {
        q83 q83Var = this.e;
        int i2 = mc3.a;
        return q83Var.b(l30Var, i, z);
    }

    @Override // yads.q83
    public final void a(int i, kc2 kc2Var) {
        q83 q83Var = this.e;
        int i2 = mc3.a;
        q83Var.a(i, kc2Var);
    }

    @Override // yads.q83
    public final void a(long j, int i, int i2, int i3, p83 p83Var) {
        long j2 = this.f;
        if (j2 != C.TIME_UNSET && j >= j2) {
            this.e = this.c;
        }
        q83 q83Var = this.e;
        int i4 = mc3.a;
        q83Var.a(j, i, i2, i3, p83Var);
    }
}

package defpackage;

import android.R;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class dpa1 {
    public static final void a(final u7k0 u7k0Var, rz20 rz20Var, final tls tlsVar, fid fidVar, int i) {
        int i2;
        rz20 rz20Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-491066927);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(u7k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            rz20Var2 = rz20Var;
            i2 |= btsVar.k(rz20Var2) ? 32 : 16;
        } else {
            rz20Var2 = rz20Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            cx20.a(null, rz20Var2, tnb1.e(new up2(up2.b), null, btsVar, 0), null, null, false, true, wwg.S(1588067495, true, new zls() { // from class: u6k0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5;
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    u7k0 u7k0Var2 = u7k0Var;
                    tls tlsVar2 = tlsVar;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            int i7 = 1;
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                crb1.a(null, wwg.S(820008105, true, new rhi0(i7, tlsVar2), btsVar2), null, null, null, wwg.S(-507976531, true, new o990(18, u7k0Var2, tlsVar2), btsVar2), null, btsVar2, 196656, 93);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16);
                            dmw0 dmw0Var = btsVar3.a;
                            if (!V) {
                                btsVar3.Y();
                                return zy11Var;
                            }
                            boolean k = btsVar3.k(tlsVar2);
                            Object Q = btsVar3.Q();
                            o430 o430Var = did.a;
                            if (k || Q == o430Var) {
                                Q = new gv40(23, tlsVar2);
                                btsVar3.o0(Q);
                            }
                            c530 c530Var = c530.a;
                            f530 b = xm91.b(c530Var, (tls) Q);
                            sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                            int hashCode = Long.hashCode(btsVar3.T);
                            r1b0 o = btsVar3.o();
                            f530 d = b.d(btsVar3, b);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (dmw0Var == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            wls wlsVar = d.f;
                            qje.W(btsVar3, wlsVar, a);
                            wls wlsVar2 = d.e;
                            qje.W(btsVar3, wlsVar2, o);
                            Integer valueOf = Integer.valueOf(hashCode);
                            wls wlsVar3 = d.g;
                            qje.W(btsVar3, wlsVar3, valueOf);
                            tls tlsVar3 = d.h;
                            qje.M(btsVar3, tlsVar3);
                            wls wlsVar4 = d.d;
                            qje.W(btsVar3, wlsVar4, d);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 16.0f));
                            f530 c = fj91.c(an91.m(c530Var, 12.0f, 0.0f, 2), IntrinsicSize.Max);
                            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
                            int hashCode2 = Long.hashCode(btsVar3.T);
                            r1b0 o2 = btsVar3.o();
                            f530 d2 = b.d(btsVar3, c);
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, wlsVar, a2);
                            qje.W(btsVar3, wlsVar2, o2);
                            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar3);
                            qje.W(btsVar3, wlsVar4, d2);
                            if (1.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            l7k0 l7k0Var = u7k0Var2.a;
                            boolean k2 = btsVar3.k(tlsVar2);
                            Object Q2 = btsVar3.Q();
                            if (k2 || Q2 == o430Var) {
                                Q2 = new v6k0(1, tlsVar2);
                                btsVar3.o0(Q2);
                            }
                            l9e.b(x2yVar, l7k0Var, (sls) Q2, btsVar3, 0);
                            sya1.a(wza1.i(), ljs0.m(an91.k(c530Var, 3.0f), 15.0f), null, AppColor$Palette.Text, btsVar3, 3120, 4);
                            if (1.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            l7k0 l7k0Var2 = u7k0Var2.b;
                            boolean k3 = btsVar3.k(tlsVar2);
                            Object Q3 = btsVar3.Q();
                            if (k3 || Q3 == o430Var) {
                                i5 = 2;
                                Q3 = new v6k0(2, tlsVar2);
                                btsVar3.o0(Q3);
                            } else {
                                i5 = 2;
                            }
                            l9e.b(x2yVar2, l7k0Var2, (sls) Q3, btsVar3, 0);
                            n.y(btsVar3, true, c530Var, 12.0f, btsVar3);
                            f530 m = an91.m(c530Var, 8.0f, 0.0f, i5);
                            t7k0 t7k0Var = u7k0Var2.c;
                            boolean k4 = btsVar3.k(tlsVar2);
                            Object Q4 = btsVar3.Q();
                            if (k4 || Q4 == o430Var) {
                                Q4 = new v6k0(3, tlsVar2);
                                btsVar3.o0(Q4);
                            }
                            sls slsVar2 = (sls) Q4;
                            boolean k5 = btsVar3.k(tlsVar2);
                            Object Q5 = btsVar3.Q();
                            if (k5 || Q5 == o430Var) {
                                Q5 = new v6k0(4, tlsVar2);
                                btsVar3.o0(Q5);
                            }
                            p0f0.b(m, t7k0Var, slsVar2, (sls) Q5, btsVar3, 6);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 4.0f));
                            f530 m2 = an91.m(c530Var, 8.0f, 0.0f, 2);
                            m7k0 m7k0Var = u7k0Var2.d;
                            boolean k6 = btsVar3.k(tlsVar2);
                            Object Q6 = btsVar3.Q();
                            if (k6 || Q6 == o430Var) {
                                Q6 = new gv40(22, tlsVar2);
                                btsVar3.o0(Q6);
                            }
                            q1b1.a(m2, m7k0Var, (tls) Q6, btsVar3, 6);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 8.0f));
                            apa1.d(u7k0Var2.e, u7k0Var2.f, tlsVar2, btsVar3, 0);
                            btsVar3.t(true);
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(R.string.common_name_suffixes, true, new zls() { // from class: u6k0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5;
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    u7k0 u7k0Var2 = u7k0Var;
                    tls tlsVar2 = tlsVar;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            int i7 = 1;
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                crb1.a(null, wwg.S(820008105, true, new rhi0(i7, tlsVar2), btsVar2), null, null, null, wwg.S(-507976531, true, new o990(18, u7k0Var2, tlsVar2), btsVar2), null, btsVar2, 196656, 93);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            boolean V = btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16);
                            dmw0 dmw0Var = btsVar3.a;
                            if (!V) {
                                btsVar3.Y();
                                return zy11Var;
                            }
                            boolean k = btsVar3.k(tlsVar2);
                            Object Q = btsVar3.Q();
                            o430 o430Var = did.a;
                            if (k || Q == o430Var) {
                                Q = new gv40(23, tlsVar2);
                                btsVar3.o0(Q);
                            }
                            c530 c530Var = c530.a;
                            f530 b = xm91.b(c530Var, (tls) Q);
                            sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                            int hashCode = Long.hashCode(btsVar3.T);
                            r1b0 o = btsVar3.o();
                            f530 d = b.d(btsVar3, b);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (dmw0Var == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            wls wlsVar = d.f;
                            qje.W(btsVar3, wlsVar, a);
                            wls wlsVar2 = d.e;
                            qje.W(btsVar3, wlsVar2, o);
                            Integer valueOf = Integer.valueOf(hashCode);
                            wls wlsVar3 = d.g;
                            qje.W(btsVar3, wlsVar3, valueOf);
                            tls tlsVar3 = d.h;
                            qje.M(btsVar3, tlsVar3);
                            wls wlsVar4 = d.d;
                            qje.W(btsVar3, wlsVar4, d);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 16.0f));
                            f530 c = fj91.c(an91.m(c530Var, 12.0f, 0.0f, 2), IntrinsicSize.Max);
                            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
                            int hashCode2 = Long.hashCode(btsVar3.T);
                            r1b0 o2 = btsVar3.o();
                            f530 d2 = b.d(btsVar3, c);
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, wlsVar, a2);
                            qje.W(btsVar3, wlsVar2, o2);
                            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar3);
                            qje.W(btsVar3, wlsVar4, d2);
                            if (1.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            l7k0 l7k0Var = u7k0Var2.a;
                            boolean k2 = btsVar3.k(tlsVar2);
                            Object Q2 = btsVar3.Q();
                            if (k2 || Q2 == o430Var) {
                                Q2 = new v6k0(1, tlsVar2);
                                btsVar3.o0(Q2);
                            }
                            l9e.b(x2yVar, l7k0Var, (sls) Q2, btsVar3, 0);
                            sya1.a(wza1.i(), ljs0.m(an91.k(c530Var, 3.0f), 15.0f), null, AppColor$Palette.Text, btsVar3, 3120, 4);
                            if (1.0f <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            x2y x2yVar2 = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            l7k0 l7k0Var2 = u7k0Var2.b;
                            boolean k3 = btsVar3.k(tlsVar2);
                            Object Q3 = btsVar3.Q();
                            if (k3 || Q3 == o430Var) {
                                i5 = 2;
                                Q3 = new v6k0(2, tlsVar2);
                                btsVar3.o0(Q3);
                            } else {
                                i5 = 2;
                            }
                            l9e.b(x2yVar2, l7k0Var2, (sls) Q3, btsVar3, 0);
                            n.y(btsVar3, true, c530Var, 12.0f, btsVar3);
                            f530 m = an91.m(c530Var, 8.0f, 0.0f, i5);
                            t7k0 t7k0Var = u7k0Var2.c;
                            boolean k4 = btsVar3.k(tlsVar2);
                            Object Q4 = btsVar3.Q();
                            if (k4 || Q4 == o430Var) {
                                Q4 = new v6k0(3, tlsVar2);
                                btsVar3.o0(Q4);
                            }
                            sls slsVar2 = (sls) Q4;
                            boolean k5 = btsVar3.k(tlsVar2);
                            Object Q5 = btsVar3.Q();
                            if (k5 || Q5 == o430Var) {
                                Q5 = new v6k0(4, tlsVar2);
                                btsVar3.o0(Q5);
                            }
                            p0f0.b(m, t7k0Var, slsVar2, (sls) Q5, btsVar3, 6);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 4.0f));
                            f530 m2 = an91.m(c530Var, 8.0f, 0.0f, 2);
                            m7k0 m7k0Var = u7k0Var2.d;
                            boolean k6 = btsVar3.k(tlsVar2);
                            Object Q6 = btsVar3.Q();
                            if (k6 || Q6 == o430Var) {
                                Q6 = new gv40(22, tlsVar2);
                                btsVar3.o0(Q6);
                            }
                            q1b1.a(m2, m7k0Var, (tls) Q6, btsVar3, 6);
                            oeb1.c(btsVar3, ljs0.e(c530Var, 8.0f));
                            apa1.d(u7k0Var2.e, u7k0Var2.f, tlsVar2, btsVar3, 0);
                            btsVar3.t(true);
                            return zy11Var;
                    }
                }
            }, btsVar), btsVar, (i2 & 112) | 114819072, 57);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(u7k0Var, rz20Var, tlsVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ti80 b(pv0 pv0Var) {
        dw1 dw1Var;
        Object obj;
        List list = pv0Var.h;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                v7v0 v7v0Var = (v7v0) obj;
                if (jl40.l(v7v0Var != null ? v7v0Var.a : null, pv0Var.a.B()) && v7v0Var.M != null) {
                    break;
                }
            }
            v7v0 v7v0Var2 = (v7v0) obj;
            if (v7v0Var2 != null) {
                dw1Var = v7v0Var2.M;
                if (dw1Var != null) {
                    String str = dw1Var.a;
                    String str2 = dw1Var.b;
                    String str3 = dw1Var.c;
                    if (str != null && l9e.f(str) && str2 != null && !evu0.J(str2)) {
                        return new si80(str, str2, str3);
                    }
                    if (str != null && l9e.f(str)) {
                        return new ri80(str, str3);
                    }
                    if (str2 != null && !evu0.J(str2)) {
                        return new qi80(str2, str3);
                    }
                }
                return null;
            }
        }
        dw1Var = null;
        if (dw1Var != null) {
        }
        return null;
    }

    public static final PlainAddress c(zgc0 zgc0Var, zzs zzsVar, String str) {
        AddressDTO addressDTO = new AddressDTO(zzsVar, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554398);
        zgc0Var.getClass();
        return new PlainAddress(addressDTO);
    }

    public static boolean d(qm7 qm7Var) {
        Boolean bool;
        CameraCharacteristics.Key key;
        try {
            CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            switch (qm7Var.a) {
                case 0:
                    key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                    break;
                default:
                    key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                    break;
            }
            bool = (Boolean) qm7Var.b.a(key);
        } catch (BufferUnderflowException e) {
            if (xbj.a.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                sgb1.g(3, "FlashAvailability");
            } else {
                sgb1.e("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            sgb1.g(5, "FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean e(ClassLoader classLoader, File file, File file2, boolean z, vuz vuzVar, String str, r100 r100Var) {
        ArrayList arrayList = new ArrayList();
        Field i = ora1.i(classLoader, "pathList");
        try {
            Object cast = Object.class.cast(i.get(classLoader));
            q991 f = ora1.f(Object.class, cast, "dexElements");
            List asList = Arrays.asList((Object[]) f.h());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : asList) {
                Field i2 = ora1.i(obj, str);
                try {
                    arrayList2.add((File) File.class.cast(i2.get(obj)));
                } catch (Exception e) {
                    String name = i2.getName();
                    String name2 = obj.getClass().getName();
                    String name3 = File.class.getName();
                    StringBuilder v = b64.v("Failed to get value of field ", name, " of type ", name2, " on object of type ");
                    v.append(name3);
                    throw new zzbl(v.toString(), e);
                }
            }
            if (arrayList2.contains(file2)) {
                return true;
            }
            try {
                f.l(Arrays.asList((Object[]) Object[].class.cast(ora1.j(cast.getClass(), "makePathElements", List.class, File.class, List.class).invoke(cast, new ArrayList(Collections.singleton(file2)), file, arrayList))));
                if (arrayList.isEmpty()) {
                    return true;
                }
                zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    IOException iOException = (IOException) arrayList.get(i3);
                    Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
                    } catch (Exception unused) {
                    }
                }
                ora1.f(IOException.class, cast, "dexElementsSuppressedExceptions").l(arrayList);
                throw zzbhVar;
            } catch (Exception e2) {
                throw new zzbl("Failed to invoke method makePathElements on an object of type " + cast.getClass(), e2);
            }
        } catch (Exception e3) {
            String name4 = i.getName();
            String name5 = classLoader.getClass().getName();
            String name6 = Object.class.getName();
            StringBuilder v2 = b64.v("Failed to get value of field ", name4, " of type ", name5, " on object of type ");
            v2.append(name6);
            throw new zzbl(v2.toString(), e3);
        }
    }
}

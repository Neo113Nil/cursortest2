package xsna;

import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Parcel;
import android.os.Trace;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.internal.measurement.zznt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Thumb;
import com.vk.media.pipeline.custom.utils.GLException;
import com.vk.promo.calls.CallsPromoActivity;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.zip.GZIPOutputStream;
import xsna.q630;

/* compiled from: SubscriptionButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class qxm0 implements h8d, q701, w420, bpv, gxp {
    public static final qxm0 b = new qxm0();
    public static final jai c = new jai(-1728778618, new mz2(0, 4), false);
    public static final jai d = new jai(-1294814974, new yx5(3), false);
    public static final qxm0 e = new qxm0();
    public static final zhf0 f = new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 10.0f);
    public static final /* synthetic */ qxm0 g = new qxm0();

    public static void A(ScheduledExecutorService scheduledExecutorService) {
        rdi.h = scheduledExecutorService;
    }

    public static final l5h0 B(j5h0 j5h0Var) {
        return new l5h0(j5h0Var);
    }

    public static final void C(Parcel parcel, boolean z) {
        parcel.writeByte(z ? (byte) 1 : (byte) 0);
    }

    public static void e(qxm0 qxm0Var, f100 f100Var, int i) {
        if ((i & 1) != 0) {
            f100Var = null;
        }
        qxm0Var.getClass();
        GLException m = m();
        if (m != null && f100Var != null) {
            f100Var.a("GlUtil", m);
        } else if (m != null) {
            throw m;
        }
    }

    public static final boolean f(gn30 gn30Var, byte b2) {
        byte b3 = gn30Var.a;
        if (!gn30Var.c) {
            return b2 == b3;
        }
        long j = b3;
        long j2 = gn30Var.b + j;
        long j3 = b2;
        return j <= j3 && j3 <= j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ImageList h(Thumb thumb) {
        if (thumb == null) {
            return new ImageList(null, 1, 0 == true ? 1 : 0);
        }
        int i = thumb.c;
        int i2 = thumb.d;
        String Ab = thumb.Ab(i, false);
        if (Ab == null) {
            Ab = "";
        }
        return new ImageList(new Image(i, i2, Ab, false));
    }

    public static final pg50 i(mgi0 mgi0Var, izs izsVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            igi0 a = mgi0Var.a();
            LayoutNode layoutNode = a.c;
            if (layoutNode.g() && layoutNode.e()) {
                zhf0 g2 = a.g();
                pg50 pg50Var = new pg50(48);
                vfi0 vfi0Var = new vfi0();
                vfi0Var.d(d370.I(g2));
                l(izsVar, pg50Var, new vfi0(), vfi0Var, a, a);
                return pg50Var;
            }
            return g9x.a;
        } finally {
            Trace.endSection();
        }
    }

    public static final void j(izs izsVar, pg50 pg50Var, vfi0 vfi0Var, vfi0 vfi0Var2, igi0 igi0Var, igi0 igi0Var2) {
        LayoutNode layoutNode = igi0Var2.c;
        LayoutNode layoutNode2 = igi0Var2.c;
        if (!layoutNode.g() || !layoutNode2.e() || vfi0Var2.a.isEmpty()) {
            if (igi0Var2.o()) {
                k(pg50Var, igi0Var, igi0Var2);
                return;
            }
            return;
        }
        zhf0 m = igi0Var2.m();
        if (m.g()) {
            fgi0 f2 = igi0Var2.f();
            if (f2 == null) {
                androidx.compose.ui.node.c cVar = layoutNode2.G.c;
                m = jgz.p(cVar).z(cVar, false);
            } else {
                q630.c z = f2.z();
                boolean z2 = zfi0.a(igi0Var2.d, wfi0.b) != null;
                if (!z.b.o) {
                    m = zhf0.e;
                } else if (z2) {
                    m = itl.d(z, 8).g2();
                } else {
                    androidx.compose.ui.node.o d2 = itl.d(z, 8);
                    m = jgz.p(d2).z(d2, false);
                }
            }
        }
        l9x I = d370.I(m);
        vfi0Var.d(I);
        if (vfi0Var.c(vfi0Var2)) {
            int i = igi0Var2.f;
            if (i == igi0Var.f) {
                i = -1;
            }
            pg50Var.k(i, new lgi0(igi0Var2, vfi0Var.b()));
            List j = igi0.j(4, igi0Var2);
            for (int size = j.size() - 1; -1 < size; size--) {
                if (!((Boolean) izsVar.invoke(j.get(size))).booleanValue()) {
                    j(izsVar, pg50Var, vfi0Var, vfi0Var2, igi0Var, (igi0) j.get(size));
                }
            }
            if (p(igi0Var2)) {
                vfi0Var2.a(I);
            }
        }
    }

    public static final void k(pg50 pg50Var, igi0 igi0Var, igi0 igi0Var2) {
        LayoutNode layoutNode;
        igi0 l = igi0Var2.l();
        zhf0 g2 = (l == null || (layoutNode = l.c) == null || !layoutNode.g()) ? f : l.g();
        int i = igi0Var2.f;
        if (i == igi0Var.f) {
            i = -1;
        }
        pg50Var.k(i, new lgi0(igi0Var2, d370.I(g2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(izs izsVar, pg50 pg50Var, vfi0 vfi0Var, vfi0 vfi0Var2, igi0 igi0Var, igi0 igi0Var2) {
        boolean z;
        boolean z2;
        vfi0 vfi0Var3;
        zhf0 g2;
        androidx.compose.ui.node.o oVar;
        boolean z3;
        izs izsVar2 = izsVar;
        pg50 pg50Var2 = pg50Var;
        vfi0 vfi0Var4 = vfi0Var2;
        igi0 igi0Var3 = igi0Var;
        int i = igi0Var3.f;
        LayoutNode layoutNode = igi0Var2.c;
        xfi0 xfi0Var = igi0Var2.d;
        LayoutNode layoutNode2 = igi0Var2.c;
        int i2 = igi0Var2.f;
        boolean z4 = (layoutNode.g() && layoutNode2.e()) ? false : true;
        if (vfi0Var4.a.isEmpty() && i2 != i) {
            return;
        }
        if (z4 && !igi0Var2.o()) {
            return;
        }
        l9x I = d370.I(igi0Var2.m());
        vfi0 vfi0Var5 = vfi0Var;
        vfi0Var5.d(I);
        if (i2 == i) {
            i2 = -1;
        }
        if (!vfi0Var.c(vfi0Var2)) {
            if (igi0Var2.o()) {
                k(pg50Var2, igi0Var3, igi0Var2);
                return;
            } else {
                if (i2 == -1) {
                    pg50Var2.k(i2, new lgi0(igi0Var2, vfi0Var.b()));
                    return;
                }
                return;
            }
        }
        pg50Var2.k(i2, new lgi0(igi0Var2, vfi0Var5.b()));
        List j = igi0.j(4, igi0Var2);
        if (xfi0Var.d) {
            igi0 l = igi0Var2.l();
            while (true) {
                oVar = null;
                oVar = null;
                if (l == null) {
                    z = true;
                    l = null;
                    break;
                }
                ph50<sgi0<?>, Object> ph50Var = l.d.b;
                z = true;
                if (ph50Var.b(ngi0.w) || ph50Var.b(ngi0.v)) {
                    break;
                } else {
                    l = l.l();
                }
            }
            if (l != null) {
                androidx.compose.ui.node.o d2 = igi0Var2.d();
                if (d2 != null) {
                    if (!d2.D1().o) {
                        d2 = null;
                    }
                }
                d2 = null;
                androidx.compose.ui.node.o d3 = l.d();
                if (d3 != null) {
                    if (!d3.D1().o) {
                        d3 = null;
                    }
                    if (d3 != null) {
                        oVar = d3;
                    }
                }
                if (d2 != null && oVar != null) {
                    zhf0 z5 = oVar.z(d2, false);
                    z3 = !z5.equals(z5.f(p490.e(0L, pli.w(oVar.d))));
                    if (z3) {
                        z2 = z;
                        if (z2) {
                            int size = j.size() - 1;
                            while (-1 < size) {
                                if (((Boolean) izsVar2.invoke(j.get(size))).booleanValue()) {
                                    vfi0Var3 = vfi0Var4;
                                } else {
                                    vfi0 vfi0Var6 = vfi0Var5;
                                    vfi0Var3 = vfi0Var4;
                                    l(izsVar2, pg50Var, vfi0Var6, vfi0Var3, igi0Var, (igi0) j.get(size));
                                }
                                size--;
                                izsVar2 = izsVar;
                                vfi0Var4 = vfi0Var3;
                                vfi0Var5 = vfi0Var;
                            }
                        } else {
                            vfi0 vfi0Var7 = new vfi0();
                            fgi0 f2 = igi0Var2.f();
                            if (f2 == null) {
                                androidx.compose.ui.node.c cVar = layoutNode2.G.c;
                                g2 = jgz.p(cVar).z(cVar, false);
                            } else {
                                q630.c z6 = f2.z();
                                boolean z7 = zfi0.a(xfi0Var, wfi0.b) != null ? z : false;
                                if (!z6.b.o) {
                                    g2 = zhf0.e;
                                } else if (z7) {
                                    g2 = itl.d(z6, 8).g2();
                                } else {
                                    androidx.compose.ui.node.o d4 = itl.d(z6, 8);
                                    g2 = jgz.p(d4).z(d4, false);
                                }
                            }
                            vfi0Var7.d(d370.I(g2));
                            int size2 = j.size() - 1;
                            while (-1 < size2) {
                                if (!((Boolean) izsVar2.invoke(j.get(size2))).booleanValue()) {
                                    j(izsVar2, pg50Var2, new vfi0(), vfi0Var7, igi0Var3, (igi0) j.get(size2));
                                }
                                size2--;
                                pg50Var2 = pg50Var;
                                igi0Var3 = igi0Var;
                            }
                        }
                        vfi0 vfi0Var8 = vfi0Var4;
                        if (p(igi0Var2)) {
                            return;
                        }
                        vfi0Var8.a(I);
                        return;
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
        } else {
            z = true;
        }
        z2 = false;
        if (z2) {
        }
        vfi0 vfi0Var82 = vfi0Var4;
        if (p(igi0Var2)) {
        }
    }

    public static GLException m() {
        StringBuilder sb = null;
        for (int glGetError = GLES20.glGetError(); glGetError != 0; glGetError = GLES20.glGetError()) {
            if (sb != null) {
                sb.append('\n');
            } else {
                sb = new StringBuilder();
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = et.a(glGetError, new StringBuilder("gl error=0x"));
            }
            sb.append(gluErrorString);
        }
        if (sb != null) {
            return new GLException(sb.toString());
        }
        return null;
    }

    public static void n(@Nullable InputStream inputStream, @NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        fng.c(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    fng.c(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final boolean o(igi0 igi0Var) {
        androidx.compose.ui.node.o d2 = igi0Var.d();
        xfi0 xfi0Var = igi0Var.d;
        if (d2 != null ? d2.Q1() : false) {
            return true;
        }
        sgi0<List<String>> sgi0Var = ngi0.a;
        if (xfi0Var.b.b(ngi0.q)) {
            return true;
        }
        return xfi0Var.b.b(ngi0.p);
    }

    public static final boolean p(igi0 igi0Var) {
        if (!o(igi0Var)) {
            xfi0 xfi0Var = igi0Var.d;
            if (xfi0Var.d) {
                return true;
            }
            ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
            Object[] objArr = ph50Var.b;
            Object[] objArr2 = ph50Var.c;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((sgi0) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static final void r(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(iah0.f().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.f().heightPixels, Integer.MIN_VALUE));
    }

    public static final long s(float f2, long j) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j : l5g.c(14, j, l5g.e(j) * f2);
    }

    public static final void t(Context context, String str) {
        if (epx.f(str, "voip_calls_promo_link") || pla.e().b().p(HintId.VOIP_PROMO_DESCRIPTION_SCREEN.getId()) != null) {
            int i = CallsPromoActivity.l;
            context.startActivity(new Intent(context, (Class<?>) CallsPromoActivity.class));
            pla.e().b().b(HintId.VOIP_PROMO_DESCRIPTION_SCREEN.getId());
        }
    }

    public static void u(File file, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ew50 ew50Var = (ew50) it.next();
            InputStream inputStream = null;
            try {
                inputStream = ew50Var.getStream();
                if (inputStream != null) {
                    n(inputStream, new File(file, ew50Var.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                fng.c(null);
                throw th;
            }
            fng.c(inputStream);
        }
    }

    public static final boolean v(Parcel parcel) {
        return parcel.readByte() != 0;
    }

    public static final long w(gn30 gn30Var, f7z f7zVar, byte b2) {
        if (gn30Var.c) {
            return b2 - gn30Var.a;
        }
        long j = gn30Var.b;
        if (j == 255) {
            return f7zVar.readByte() & 255;
        }
        if (j == 65535) {
            f7zVar.h(2L);
            return f7zVar.c.readShort() & 65535;
        }
        if (j == 4294967295L) {
            return f7zVar.readInt() & 4294967295L;
        }
        ro.d(16);
        throw new IllegalStateException("Unable to read size for tag type: 0x".concat(Integer.toString(b2, 16)));
    }

    public static final l800 x(n800[] n800VarArr, androidx.compose.runtime.a aVar) {
        aVar.T(-395574495);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-395574495, 8, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        int hashCode = Arrays.hashCode(n800VarArr);
        aVar.T(34468001);
        boolean o = aVar.o(hashCode);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            x = new l800(rl3.u0(n800VarArr));
            aVar.R(x);
        }
        l800 l800Var = (l800) x;
        aVar.b0();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.b0();
        return l800Var;
    }

    public static final n800 y(Object obj, Object obj2, String[] strArr, androidx.compose.runtime.a aVar) {
        aVar.T(-1788530187);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1788530187, 6, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        aVar.T(1613443961);
        boolean J = aVar.J(strArr);
        Object x = aVar.x();
        Object obj3 = a.C0011a.a;
        if (J || x == obj3) {
            x = new udy((String[]) Arrays.copyOf(strArr, strArr.length));
            aVar.R(x);
        }
        udy udyVar = (udy) x;
        aVar.b0();
        aVar.T(1613444012);
        boolean J2 = aVar.J(udyVar) | aVar.J(obj2);
        Object x2 = aVar.x();
        if (J2 || x2 == obj3) {
            x2 = new n800(obj, udyVar, obj2);
            aVar.R(x2);
        }
        n800 n800Var = (n800) x2;
        aVar.b0();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.b0();
        return n800Var;
    }

    public static final void z(View view, boolean z) {
        if (z) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            view.setAlpha(0.64f);
        }
    }

    @Override // xsna.gxp
    public by2 c(Throwable th) {
        return new by2(R.string.modal_post_donut_empty_error, 12, null);
    }

    @Override // xsna.w420
    public String g(vg6 vg6Var) {
        return vg6Var.c;
    }

    public int q(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        e(this, null, 3);
        GLES20.glShaderSource(glCreateShader, str);
        GLException m = m();
        if (m != null) {
            GLES20.glDeleteShader(glCreateShader);
            throw m;
        }
        GLES20.glCompileShader(glCreateShader);
        GLException m2 = m();
        if (m2 != null) {
            GLES20.glDeleteShader(glCreateShader);
            throw m2;
        }
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new GLException(com.vk.movika.sdk.base.model.history.b.b(i, "Shader compile failed, type=", ", ", glGetShaderInfoLog));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznt.zze());
    }

    @Override // xsna.bpv
    public List a(List list) {
        return list;
    }

    @Override // xsna.h8d
    public void b(z830 z830Var) {
    }
}

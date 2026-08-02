package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.security.keystore.KeyGenParameterSpec;
import android.view.View;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.security.crypto.MasterKey$KeyScheme;
import com.yandex.div.core.c;
import com.yandex.div.core.expression.variables.d;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div2.c3;
import com.yandex.go.image.api.domain.models.ImageSource;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b;
import com.yandex.go.navigation.api.MainScreenType;
import com.yandex.go.preorder.navigation.g;
import com.yandex.go.quark.dynamic.chat.a;
import flex.logger.FlexLogLevel;
import flex.network.cache.parsing.CacheMode;
import flex.theme.ThemedColor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.network.Request;

/* loaded from: classes9.dex */
public final class nfh implements bnj, eev, q3l0, b38, zme {
    public Object a;
    public Object b;
    public Object c;

    public nfh(CacheMode cacheMode, sls slsVar) {
        this.a = cacheMode;
        this.b = slsVar;
        this.c = new zjr(xfz.b(nfh.class.getSimpleName()));
    }

    public void A(i28 i28Var) {
        ((k28) this.c).a.c = i28Var;
    }

    public void B(fwi fwiVar) {
        ((k28) this.c).a.a = fwiVar;
    }

    public void C(MasterKey$KeyScheme masterKey$KeyScheme) {
        if (masterKey$KeyScheme.ordinal() != 0) {
            kbs.f(masterKey$KeyScheme, "Unsupported scheme: ");
        } else if (((KeyGenParameterSpec) this.b) == null) {
            this.c = masterKey$KeyScheme;
        } else {
            ny61.g("KeyScheme set after setting a KeyGenParamSpec");
        }
    }

    public void D(LayoutDirection layoutDirection) {
        ((k28) this.c).a.b = layoutDirection;
    }

    public void E(long j) {
        ((k28) this.c).a.d = j;
    }

    public void F(fw60 fw60Var) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        yp6 yp6Var = (yp6) this.a;
        fw60Var.a("-- BODY --");
        String str = (String) this.c;
        int i = 0;
        boolean z = str == null || ClidProvider.IDENTITY.equalsIgnoreCase(str);
        boolean equalsIgnoreCase = Request.PARAM_GZIP.equalsIgnoreCase(str);
        if (z) {
            G(fw60Var, yp6Var.c());
            return;
        }
        if (!equalsIgnoreCase) {
            r100.B(fw60Var, "Body with unknown encoding '" + str + "'.");
            return;
        }
        yp6 c = yp6Var.c();
        if (c.b >= 2) {
            yp6 yp6Var2 = new yp6();
            c.d(yp6Var2, 0L, 2L);
            byte[] B = yp6Var2.B(yp6Var2.b);
            if (B[0] == 31 && B[1] == -117) {
                yp6 yp6Var3 = new yp6();
                GZIPInputStream gZIPInputStream2 = null;
                try {
                    try {
                        try {
                            gZIPInputStream = new GZIPInputStream(new wp6(c, i));
                        } catch (IOException unused) {
                            return;
                        }
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    yp6Var3.G(gZIPInputStream);
                    G(fw60Var, yp6Var3);
                    gZIPInputStream.close();
                } catch (IOException unused3) {
                    gZIPInputStream2 = gZIPInputStream;
                    r100.B(fw60Var, "Failed to decode gzipped body buffer.");
                    if (gZIPInputStream2 != null) {
                        gZIPInputStream2.close();
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 == null) {
                        throw th;
                    }
                    try {
                        gZIPInputStream2.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                return;
            }
        }
        r100.B(fw60Var, "Content-encoding is GZIP, but the GZIP magic header is missing.");
    }

    public void G(fw60 fw60Var, yp6 yp6Var) {
        yp6 yp6Var2;
        yp6 yp6Var3;
        int i;
        try {
            wg10 wg10Var = (wg10) this.b;
            Charset a = wg10Var != null ? wg10Var.a(null) : null;
            if (a == null) {
                a = gw60.c;
            }
            if (jl40.l(gw60.c, a)) {
                try {
                    yp6Var2 = new yp6();
                    long j = yp6Var.b;
                    yp6Var3 = yp6Var;
                    yp6Var3.d(yp6Var2, 0L, j < 64 ? j : 64L);
                } catch (EOFException unused) {
                }
                for (i = 0; i < 16; i++) {
                    if (yp6Var2.I1()) {
                        break;
                    }
                    int U = yp6Var2.U();
                    if (Character.isISOControl(U) && !Character.isWhitespace(U)) {
                        r100.B(fw60Var, "Buffer did not contain UTF-8 plaintext, but should have had.");
                        return;
                    }
                }
            } else {
                yp6Var3 = yp6Var;
            }
            fw60Var.a(yp6Var3.T(yp6Var3.b, a));
        } catch (UnsupportedCharsetException unused2) {
            r100.B(fw60Var, "Charset is likely malformed.");
        }
    }

    @Override // defpackage.b38
    public tpr a() {
        return (ha2) this.c;
    }

    public void b(LayoutNode layoutNode, Invalidation invalidation) {
        gp50 gp50Var = (gp50) this.a;
        gp50 gp50Var2 = (gp50) this.b;
        gp50 gp50Var3 = (gp50) this.c;
        int i = kxi.a[invalidation.ordinal()];
        if (i == 1) {
            gp50Var.A(layoutNode);
            gp50Var3.A(layoutNode);
            return;
        }
        if (i == 2) {
            gp50Var2.A(layoutNode);
            gp50Var3.A(layoutNode);
            return;
        }
        if (i == 3) {
            if (layoutNode.A != null) {
                gp50Var3.A(layoutNode);
                return;
            } else {
                gp50Var.A(layoutNode);
                return;
            }
        }
        if (i != 4) {
            w511.b();
        } else if (layoutNode.A != null) {
            gp50Var3.A(layoutNode);
        } else {
            gp50Var2.A(layoutNode);
        }
    }

    public void c(ThemedColor themedColor) {
        exy0 exy0Var = (exy0) this.a;
        j();
        if (themedColor == null) {
            ((View) this.b).setBackgroundColor(exy0Var.a(null));
        } else {
            this.c = exy0Var.b(themedColor, new ihc(1, this));
        }
    }

    @Override // defpackage.eev
    public void d(m9o m9oVar) {
        ktk ktkVar = (ktk) this.a;
        Throwable th = m9oVar.c;
        btk btkVar = (btk) ktkVar.a.getAndSet(null);
        if (btkVar != null) {
            btkVar.d(th);
        }
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        return new wbh((Context) this.a, (i130) this.b, ouVar, (vbh) this.c);
    }

    public MainScreenType f(m950 m950Var) {
        if (m950Var instanceof b) {
            return MainScreenType.SuperAppMain;
        }
        g gVar = (g) this.b;
        ((ul51) ((qmp) this.a)).getClass();
        return (gVar.a() && (gVar.b instanceof jse0)) ? MainScreenType.MainScreenWithShortcuts : MainScreenType.NotMainScreen;
    }

    public lh1 g() {
        va90 va90Var;
        qh1 qh1Var = (qh1) this.a;
        if (qh1Var == null || (va90Var = (va90) this.b) == null) {
            kbs.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (qh1Var.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        ph1 ph1Var = qh1Var.d;
        ph1 ph1Var2 = ph1.e;
        if (ph1Var != ph1Var2 && ((Integer) this.c) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (ph1Var == ph1Var2 && ((Integer) this.c) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (ph1Var == ph1Var2) {
            u77.a(new byte[0]);
        } else if (ph1Var == ph1.d) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.c).intValue()).array());
        } else {
            if (ph1Var != ph1.c) {
                yci0.t(((qh1) this.a).d, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.c).intValue()).array());
        }
        return new lh1();
    }

    @Override // defpackage.bnj
    public void h(smj smjVar) {
        if ("dismiss_chat_directive".equals(smjVar.b())) {
            ((zwf0) this.a).c("AliceChatDismissHostDirectiveHandler", "Dismiss host requested");
            ((a) this.b).a();
        }
    }

    public m610 i() {
        MasterKey$KeyScheme masterKey$KeyScheme = (MasterKey$KeyScheme) this.c;
        if (masterKey$KeyScheme == null && ((KeyGenParameterSpec) this.b) == null) {
            ny61.g("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (masterKey$KeyScheme == MasterKey$KeyScheme.AES256_GCM) {
            this.b = new KeyGenParameterSpec.Builder((String) this.a, 3).setBlockModes(GostCipher.STR_GCM_MODE).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.b;
        if (keyGenParameterSpec != null) {
            return new m610(n610.a(keyGenParameterSpec), (KeyGenParameterSpec) this.b);
        }
        ny61.t("KeyGenParameterSpec was null after build() check");
        return null;
    }

    public void j() {
        dxy0 dxy0Var = (dxy0) this.c;
        if (dxy0Var != null) {
            dxy0Var.x();
        }
        this.c = null;
    }

    @Override // defpackage.eev
    public void k(t3v0 t3v0Var) {
        BitmapSource bitmapSource;
        ktk ktkVar = (ktk) this.b;
        Drawable j = cma1.j(t3v0Var.a, ((Context) ((am2) this.c).a).getResources());
        ImageSource b = vac.b(t3v0Var.c);
        btk btkVar = (btk) ktkVar.a.getAndSet(null);
        if (btkVar != null) {
            int i = jtk.a[b.ordinal()];
            if (i == 1) {
                bitmapSource = BitmapSource.NETWORK;
            } else if (i == 2) {
                bitmapSource = BitmapSource.MEMORY;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                bitmapSource = BitmapSource.DISK;
            }
            btkVar.f(new uhk(j, bitmapSource));
        }
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        yo40 yo40Var = (yo40) this.c;
        wg10 wg10Var = (wg10) this.a;
        String c = ((sbx) ((itu0) yo40Var.a)).c(obj, (KSerializer) this.b);
        int i = m5j0.a;
        return wms.a(c, wg10Var);
    }

    @Override // defpackage.bnj
    public Set m() {
        return (Set) this.c;
    }

    public boolean n(LayoutNode layoutNode) {
        return !(layoutNode.A == null) && (((SortedSet) ((gp50) this.a).b).contains(layoutNode) || ((SortedSet) ((gp50) this.b).b).contains(layoutNode));
    }

    public com.yandex.div.core.expression.a o(String str, m3k m3kVar, tvo tvoVar, l6o l6oVar) {
        egk d = m3kVar.d();
        d dVar = new d(tvoVar.c.k, tvoVar.d);
        List x = d.x();
        cxq0 cxq0Var = tvoVar.e.a;
        gp50 gp50Var = (gp50) cxq0Var.w;
        List list = x;
        if (list != null && !list.isEmpty()) {
            ArrayList f = jva1.f(x);
            if (!f.isEmpty()) {
                gp50Var = new gp50(17, new u1n(24, new com.yandex.div.evaluable.d(f), gp50Var));
            }
        }
        return p(d.d(), d.v(), dVar, (jb7) cxq0Var.c, gp50Var, (yvi0) cxq0Var.x, str, tvoVar.c, l6oVar);
    }

    @Override // defpackage.eev
    public void onCancel() {
    }

    @Override // defpackage.eev
    public void onStart() {
    }

    public com.yandex.div.core.expression.a p(List list, List list2, d dVar, jb7 jb7Var, gp50 gp50Var, yvi0 yvi0Var, String str, com.yandex.div.core.expression.local.b bVar, l6o l6oVar) {
        com.yandex.div.core.expression.variables.b bVar2;
        tvo tvoVar = new tvo(str, bVar, dVar, new mdo(new cxq0(dVar, jb7Var, gp50Var, yvi0Var, 17)), l6oVar, null);
        yuf0 yuf0Var = null;
        if (list != null) {
            Iterator it = list.iterator();
            bVar2 = null;
            while (it.hasNext()) {
                c3 c3Var = (c3) it.next();
                if ((c3Var instanceof dnl) && bVar2 == null) {
                    bVar2 = new com.yandex.div.core.expression.variables.b(tvoVar, bVar.k);
                }
                try {
                    c231 h0 = tje.h0(c3Var, tvoVar, bVar2 != null ? bVar2 : qtf0.a, l6oVar);
                    if (h0 != null) {
                        dVar.m(h0);
                    }
                } catch (VariableDeclarationException e) {
                    l6oVar.e(e);
                }
            }
        } else {
            bVar2 = null;
        }
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            yuf0Var = new yuf0(tvoVar, l6oVar, (c) this.b);
            yuf0Var.s(list2);
        }
        return new com.yandex.div.core.expression.a(tvoVar, bVar2, yuf0Var);
    }

    public i28 q() {
        return ((k28) this.c).a.c;
    }

    public fwi r() {
        return ((k28) this.c).a.a;
    }

    public wju s() {
        String h;
        zuj0 zuj0Var = (zuj0) this.a;
        dhe0 dhe0Var = (dhe0) this.c;
        if (dhe0Var.a.b() && dhe0Var.b.c()) {
            h = ((avj0) zuj0Var).h(kyh0.specify_the_system_address);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.specify_the_address);
        }
        return new wju(((avj0) zuj0Var).h(kyh0.cannot_see_address), h, ljc0.a);
    }

    public LayoutDirection t() {
        return ((k28) this.c).a.b;
    }

    public Map u(PackageInfo packageInfo) {
        LinkedHashMap linkedHashMap;
        int i;
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (cvu0.x(str, "android.permission", false)) {
                    try {
                        if (((PackageManager) this.c).getPermissionInfo(str, 0).getProtection() == 1) {
                            arrayList.add(str);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            int d = gw00.d(tcc.n(arrayList, 10));
            if (d < 16) {
                d = 16;
            }
            linkedHashMap = new LinkedHashMap(d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str2 = (String) next;
                try {
                    i = qke.h((Context) this.a, str2);
                } catch (Exception e) {
                    jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{str2}, 1)));
                    i = -1;
                }
                linkedHashMap.put(next, i == 0 ? "granted" : "denied");
            }
        } else {
            linkedHashMap = null;
        }
        return linkedHashMap == null ? kotlin.collections.b.f() : linkedHashMap;
    }

    public long v() {
        return ((k28) this.c).a.d;
    }

    public void w(float[] fArr) {
        RectF rectF = (RectF) this.b;
        View view = ((com.yandex.div.core.view2.divs.widgets.a) this.c).b;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Path path = (Path) this.a;
        path.reset();
        path.addRoundRect(rectF, (float[]) fArr.clone(), Path.Direction.CW);
        path.close();
    }

    public boolean x() {
        return !(((SortedSet) ((gp50) this.a).b).isEmpty() && ((SortedSet) ((gp50) this.c).b).isEmpty() && ((SortedSet) ((gp50) this.b).b).isEmpty());
    }

    public j820 y(n8j0 n8j0Var, boolean z) {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        Long l;
        Long l2;
        StackTraceElement stackTraceElement2;
        String num;
        CacheMode cacheMode = (CacheMode) this.a;
        zjr zjrVar = (zjr) this.c;
        leu leuVar = n8j0Var.c;
        ab7 H = jl40.H(leuVar);
        String str2 = "No line info";
        EmptyList emptyList = EmptyList.a;
        tjr tjrVar2 = tjr.d;
        if (H == null) {
            i3y a = xfz.a(new Pair("headers", leuVar));
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf == null || (str = valueOf.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            } else {
                tjrVar = tjrVar2;
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Parsed cache-control-header data is null", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            H = yw50.a;
        } else if (H.d.isEmpty()) {
            H = new ab7(H.a, H.b, H.c, Collections.singleton(CacheMode.DISK), H.e);
        }
        Set set = H.d;
        boolean z2 = H.a && set.contains(cacheMode);
        if (z2 || z) {
            Double d = H.b;
            if (d != null) {
                double doubleValue = d.doubleValue();
                ab7 ab7Var = yw50.a;
                l = Long.valueOf((long) (doubleValue * 1000.0d));
            } else {
                l = null;
            }
            Double d2 = H.c;
            if (d2 != null) {
                double doubleValue2 = d2.doubleValue();
                ab7 ab7Var2 = yw50.a;
                l2 = Long.valueOf((long) (doubleValue2 * 1000.0d));
            } else {
                l2 = null;
            }
            long longValue = ((Number) ((sls) this.b).invoke()).longValue();
            ab7 ab7Var3 = yw50.a;
            String a2 = leuVar.a("Document-Stale-If-Error");
            return new j820(l, l2, longValue, jl40.l(a2 != null ? evu0.k0(a2).toString() : null, "true"), !z2, set.contains(CacheMode.IN_MEMORY), H.e);
        }
        Pair pair = new Pair("cacheMode", cacheMode);
        Boolean bool = Boolean.FALSE;
        i3y a3 = xfz.a(pair, new Pair("saveForNextUse", bool));
        s7s0 s7s0Var2 = zjrVar.c.a;
        if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
            String fileName2 = stackTraceElement2.getFileName();
            String str3 = fileName2 != null ? fileName2 : "No file info";
            String methodName2 = stackTraceElement2.getMethodName();
            int lineNumber2 = stackTraceElement2.getLineNumber();
            Integer valueOf2 = Integer.valueOf(lineNumber2);
            if (lineNumber2 <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                str2 = num;
            }
            tjrVar2 = new tjr(str3, methodName2, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Cannot create cache metadata", a3, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        return null;
    }

    public void z() {
        try {
            PackageInfo packageInfo = ((PackageManager) this.c).getPackageInfo(((Context) this.a).getPackageName(), 4096);
            t61 t61Var = (t61) this.b;
            Map u = u(packageInfo);
            t61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("permissions", u);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            t61Var.a.a(sb2.q("permissions", hashMap), hashMap, 1, hashMap2);
        } catch (Exception e) {
            xby.l(jst.e, "PERMISSIONS:GET_PERMISSIONS_INFO:ERROR", null, e, "Failed to get permissions info for metrica event", 2);
        }
    }

    public nfh(rqo rqoVar, ijj0 ijj0Var, com.yandex.go.taxi.tariffs.repository.g gVar) {
        this.a = ijj0Var;
        this.b = gVar;
        this.c = kotlin.a.a(new zf2(rqoVar, 12));
    }

    public /* synthetic */ nfh(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public nfh(Context context) {
        context.getApplicationContext();
        this.a = "_androidx_security_master_key_";
    }

    public nfh(exy0 exy0Var, View view) {
        this.a = exy0Var;
        this.b = view;
    }
}

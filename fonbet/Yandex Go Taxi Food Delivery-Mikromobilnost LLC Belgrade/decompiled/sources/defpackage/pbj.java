package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.camera.core.f;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.g;
import androidx.camera.core.j;
import com.yandex.messaging.MessengerEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import io.flutter.plugins.camerax.ProxyLifecycleProvider;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.utils.c;
import yads.f5;
import yads.od3;
import yads.ve3;

/* loaded from: classes10.dex */
public final class pbj implements ha41, j581 {
    public Object A;
    public Object B;
    public Object a;
    public boolean b;
    public final Object c;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0207, code lost:
    
        r11 = "stabilization";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020a, code lost:
    
        r11 = "60 FPS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020d, code lost:
    
        r11 = "HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d5, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dd, code lost:
    
        if (defpackage.qt7.C(r11) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01df, code lost:
    
        r11 = "setVideoStabilizationEnabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e2, code lost:
    
        r11 = "setPreviewStabilizationEnabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e5, code lost:
    
        r11 = "setTargetFrameRateRange";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e8, code lost:
    
        r11 = "setDynamicRange";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0199, code lost:
    
        r3 = (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        if (r3 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
    
        r9 = new java.lang.StringBuilder("A ");
        r9.append(r3.name());
        r9.append(" value is set to ");
        r9.append(r0);
        r9.append(" despite using feature groups. Do not use APIs like ");
        r9.append(r0);
        r9.append(".Builder.");
        r10 = defpackage.iyq0.a;
        r0 = r10[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ca, code lost:
    
        if (r0 == 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cc, code lost:
    
        if (r0 == 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
    
        if (r0 == 3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d0, code lost:
    
        if (r0 != 4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d2, code lost:
    
        r11 = "setOutputFormat";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
    
        r9.append(r11);
        r9.append(" while using feature groups. If ");
        r11 = r10[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f8, code lost:
    
        if (r11 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
    
        if (r11 == 2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
    
        if (r11 == 3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
    
        if (r11 != 4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
    
        r11 = "JPEG_R output format";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020f, code lost:
    
        r9.append(r11);
        r9.append(" is required, instead set ");
        r10 = r10[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021d, code lost:
    
        if (r10 == 1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        if (r10 == 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0221, code lost:
    
        if (r10 == 3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0223, code lost:
    
        if (r10 == 4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0225, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0228, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        r10 = "GroupableFeature.IMAGE_ULTRA_HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0234, code lost:
    
        defpackage.w511.f(defpackage.oyr.t(r9, r10, " as either a required or preferred feature."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022c, code lost:
    
        r10 = "GroupableFeature.PREVIEW_STABILIZATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
    
        r10 = "GroupableFeature.FPS_60";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0232, code lost:
    
        r10 = "GroupableFeature.HDR_HLG10";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0203, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0206, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pbj(List list, xt31 xt31Var, List list2) {
        Object obj;
        boolean d;
        Object obj2 = lru0.a;
        this.c = xt31Var;
        this.w = list2;
        this.x = obj2;
        this.y = EmptySet.a;
        this.z = EmptyList.a;
        List I = a.I(list);
        this.A = I;
        this.a = new sbj(7);
        this.B = geb1.f();
        if (!obj2.equals(obj2)) {
            Iterator it = I.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f.d(xi21.p4)) {
                    ny61.g("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list3 = (List) this.z;
        Set set = (Set) this.y;
        if (!set.isEmpty() || !list3.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((b3u) it2.next()).a());
            }
            for (FeatureTypeInternal featureTypeInternal : a.I(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : set2) {
                    if (((b3u) obj3).a() == featureTypeInternal) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.size() > 1) {
                    vg10.r(arrayList2, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            if (a.I(list3).size() != list3.size()) {
                kbs.j("Duplicate values in preferredFeatures(", list3, 41);
                throw null;
            }
            LinkedHashSet U = a.U(set2, list3);
            if (!U.isEmpty()) {
                vg10.r(U, "requiredFeatures and preferredFeatures have duplicate values: ");
                throw null;
            }
            for (j jVar : (List) this.A) {
                UseCaseType.Companion.getClass();
                if (dj21.a(jVar) == UseCaseType.UNDEFINED) {
                    w511.g(jVar, " is not supported with feature group");
                    throw null;
                }
                String str = jVar instanceof g ? "Preview" : jVar instanceof w8v ? "ImageCapture" : jVar instanceof f ? "ImageAnalysis" : qt7.C(jVar) ? "VideoCapture" : "UseCase";
                Iterator<E> it3 = FeatureTypeInternal.a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    UseCaseType.Companion.getClass();
                    int i = cj21.b[((FeatureTypeInternal) obj).ordinal()];
                    if (i == 1) {
                        d = jVar.f.d(eav.l2);
                    } else if (i == 2) {
                        d = jVar.f.d(xi21.p4);
                    } else if (i == 3) {
                        d = jVar.f.d(xi21.u4) || jVar.f.d(xi21.w4);
                    } else {
                        if (i != 4) {
                            w511.b();
                            throw null;
                        }
                        d = jVar.f.d(x8v.y);
                    }
                    if (d) {
                        break;
                    }
                }
            }
            if (!((List) this.w).isEmpty()) {
                ny61.g("Effects aren't supported with feature group yet");
                throw null;
            }
        }
        this.b = true;
    }

    public sm7 A() {
        return new sm7(this);
    }

    public v83 B() {
        return new v83(this);
    }

    public v83 C() {
        return new v83(this);
    }

    public sm7 D() {
        return new sm7(this);
    }

    public n52 E() {
        return new n52(this);
    }

    public v83 F() {
        return new v83(this);
    }

    public sm7 G() {
        return new sm7(this);
    }

    public n52 H() {
        return new n52(this);
    }

    public sm7 I() {
        return new sm7(this);
    }

    public WebView J() {
        aj51 aj51Var = (aj51) ((i3y) this.y).getValue();
        if (aj51Var != null) {
            return ((boh) aj51Var).a;
        }
        return null;
    }

    public void K(String str) {
        if (jl40.l(((ye0) this.B).k(), str)) {
            return;
        }
        this.B = new fa41(str);
        aj51 aj51Var = (aj51) ((i3y) this.y).getValue();
        if (aj51Var != null) {
            ((boh) aj51Var).a.loadUrl(str);
        }
        fk01 fk01Var = (fk01) this.z;
        if (fk01Var != null) {
            fk01Var.invoke();
        }
    }

    public FileInputStream L(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pbj M() {
        FileInputStream fileInputStream;
        nil0[] nil0VarArr;
        nil0[] nil0VarArr2;
        FileInputStream L;
        AssetManager assetManager = (AssetManager) this.c;
        qef0 qef0Var = (qef0) this.x;
        pbj pbjVar = null;
        if (!this.b) {
            ny61.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return null;
        }
        byte[] bArr = (byte[]) this.y;
        if (bArr != null) {
            try {
                try {
                    fileInputStream = L(assetManager, "dexopt/baseline.prof");
                } catch (FileNotFoundException e) {
                    qef0Var.c(6, e);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    nil0VarArr2 = (nil0[]) this.B;
                    if (nil0VarArr2 != null) {
                        try {
                            L = L(assetManager, "dexopt/baseline.profm");
                            if (L == null) {
                            }
                        } catch (FileNotFoundException e2) {
                            qef0Var.c(9, e2);
                        } catch (IOException e3) {
                            qef0Var.c(7, e3);
                        } catch (IllegalStateException e4) {
                            this.B = null;
                            qef0Var.c(8, e4);
                        }
                        if (pbjVar == null) {
                        }
                    }
                    return this;
                } catch (IOException e5) {
                    qef0Var.c(7, e5);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    nil0VarArr2 = (nil0[]) this.B;
                    if (nil0VarArr2 != null) {
                    }
                    return this;
                }
                if (fileInputStream != null) {
                    try {
                    } catch (IOException e6) {
                        qef0Var.c(7, e6);
                        try {
                            fileInputStream.close();
                        } catch (IOException e7) {
                            qef0Var.c(7, e7);
                        }
                        nil0VarArr = null;
                        this.B = nil0VarArr;
                        nil0VarArr2 = (nil0[]) this.B;
                        if (nil0VarArr2 != null) {
                        }
                        return this;
                    } catch (IllegalStateException e8) {
                        qef0Var.c(8, e8);
                        fileInputStream.close();
                        nil0VarArr = null;
                        this.B = nil0VarArr;
                        nil0VarArr2 = (nil0[]) this.B;
                        if (nil0VarArr2 != null) {
                        }
                        return this;
                    }
                    if (!Arrays.equals(androidx.profileinstaller.a.a, e7a1.g(4, fileInputStream))) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    nil0VarArr = androidx.profileinstaller.a.g(fileInputStream, e7a1.g(4, fileInputStream), (String) this.a);
                    this.B = nil0VarArr;
                }
                nil0VarArr2 = (nil0[]) this.B;
                if (nil0VarArr2 != null && Build.VERSION.SDK_INT >= 31) {
                    L = L(assetManager, "dexopt/baseline.profm");
                    if (L == null) {
                        try {
                            if (!Arrays.equals(androidx.profileinstaller.a.b, e7a1.g(4, L))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            this.B = androidx.profileinstaller.a.d(L, e7a1.g(4, L), bArr, nil0VarArr2);
                            L.close();
                            pbjVar = this;
                        } finally {
                        }
                    } else if (L != null) {
                        L.close();
                    }
                    if (pbjVar == null) {
                        return pbjVar;
                    }
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e9) {
                    qef0Var.c(7, e9);
                }
            }
        }
        return this;
    }

    public void N(int i, Serializable serializable) {
        ((Executor) this.w).execute(new z50(this, i, serializable, 4));
    }

    public void O(qwf0 qwf0Var) {
        Context context = (Context) this.A;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(qwf0Var);
        } else {
            new Handler(Looper.getMainLooper()).post(qwf0Var);
        }
    }

    public void P(tls tlsVar) {
        this.a = tlsVar;
    }

    public void Q(fk01 fk01Var) {
        this.z = fk01Var;
    }

    public void R(sls slsVar) {
        this.A = slsVar;
    }

    public void S() {
        ByteArrayOutputStream byteArrayOutputStream;
        qef0 qef0Var = (qef0) this.x;
        nil0[] nil0VarArr = (nil0[]) this.B;
        byte[] bArr = (byte[]) this.y;
        if (nil0VarArr == null || bArr == null) {
            return;
        }
        if (!this.b) {
            ny61.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(androidx.profileinstaller.a.a);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            qef0Var.c(7, e);
        } catch (IllegalStateException e2) {
            qef0Var.c(8, e2);
        }
        if (androidx.profileinstaller.a.i(byteArrayOutputStream, bArr, nil0VarArr)) {
            this.z = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.B = null;
        } else {
            qef0Var.c(5, null);
            this.B = null;
            byteArrayOutputStream.close();
        }
    }

    public boolean T() {
        byte[] bArr = (byte[]) this.z;
        if (bArr != null) {
            if (!this.b) {
                ny61.r("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream((File) this.A);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock tryLock = channel.tryLock();
                                if (tryLock != null) {
                                    try {
                                        if (tryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr2);
                                                if (read <= 0) {
                                                    N(1, null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, read);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    N(6, e);
                    return false;
                } catch (IOException e2) {
                    N(7, e2);
                    return false;
                }
            } finally {
                this.z = null;
                this.B = null;
            }
        }
        return false;
    }

    @Override // defpackage.j581, defpackage.o071
    public void a() {
        if (this.b) {
            ((js81) this.y).a(ve3.e);
            ((hv81) this.A).a.k();
        }
    }

    @Override // defpackage.j581
    public void b(cf71 cf71Var) {
        i971 i971Var = (i971) this.a;
        this.b = false;
        js81 js81Var = (js81) this.y;
        js81Var.a(js81Var.a.contains(ve3.d) ? ve3.j : ve3.k);
        ((kzo) this.w).b();
        qv71 qv71Var = (qv71) this.x;
        qv71Var.a();
        if (!qv71Var.h) {
            qv71Var.h = true;
            String lowerCase = ((od3) cf71Var.b).name().toLowerCase(Locale.ROOT);
            String message = ((Throwable) cf71Var.c).getMessage();
            if (message == null) {
                message = "";
            }
            fp71 fp71Var = qv71Var.d;
            fp71Var.getClass();
            fp71Var.f(b.l(new Pair(ACSPConstants.STATUS, "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
        }
        hv81 hv81Var = (hv81) this.A;
        hv81Var.a.b(cf71Var);
        hv81Var.n();
        hlx0 hlx0Var = (hlx0) i971Var.b;
        ((eq71) hlx0Var.b).d();
        jm71 jm71Var = (jm71) hlx0Var.y;
        if (jm71Var != null) {
            jm71Var.mo24a();
        }
        ((bc71) this.c).a.i = null;
    }

    @Override // defpackage.j581
    public void c() {
        this.b = true;
        ((js81) this.y).a(ve3.e);
        kzo kzoVar = (kzo) this.w;
        if (!kzoVar.b) {
            kzoVar.b = true;
            ((xc71) kzoVar.w).a();
            ((Handler) kzoVar.x).post(new h3s0(12, kzoVar));
        }
        bc71 bc71Var = (bc71) this.c;
        hv81 hv81Var = (hv81) this.A;
        wvb1 wvb1Var = new wvb1();
        wvb1Var.b = hv81Var;
        ek71 ek71Var = bc71Var.a.a;
        ek71Var.v();
        wvb1Var.a = ek71Var.V == 0.0f;
        this.B = wvb1Var;
        hlx0 hlx0Var = (hlx0) ((i971) this.a).b;
        rr41 rr41Var = (rr41) hlx0Var.w;
        rr41Var.getClass();
        hn71 a = ((ip71) rr41Var.b).a();
        ((ge71) rr41Var.c).c(new zj71("video_ad_start", new LinkedHashMap((Map) a.b), (no61) a.c));
        jm71 jm71Var = (jm71) hlx0Var.y;
        if (jm71Var != null) {
            jm71Var.c();
        }
    }

    @Override // defpackage.j581
    public void d() {
        i971 i971Var = (i971) this.a;
        this.b = false;
        ((js81) this.y).a(ve3.g);
        hv81 hv81Var = (hv81) this.A;
        hv81Var.a.b();
        hv81Var.n();
        ((kzo) this.w).b();
        ((qv71) this.x).a();
        hlx0 hlx0Var = (hlx0) i971Var.b;
        rr41 rr41Var = (rr41) hlx0Var.w;
        rr41Var.getClass();
        hn71 a = ((ip71) rr41Var.b).a();
        Map map = (Map) a.b;
        ((ge71) rr41Var.c).c(new zj71("video_ad_complete", new LinkedHashMap(map), (no61) a.c));
        jm71 jm71Var = (jm71) hlx0Var.y;
        if (jm71Var != null) {
            jm71Var.b();
        }
        ((bc71) this.c).a.i = null;
    }

    @Override // defpackage.j581
    public void e() {
        hv81 hv81Var = (hv81) this.A;
        hv81Var.a.g();
        hv81Var.n();
        this.b = false;
        ((js81) this.y).a(ve3.f);
        ((kzo) this.w).b();
        ((qv71) this.x).a();
        jm71 jm71Var = (jm71) ((hlx0) ((i971) this.a).b).y;
        if (jm71Var != null) {
            jm71Var.b();
        }
        ((bc71) this.c).a.i = null;
    }

    @Override // defpackage.j581
    public void f() {
        ((js81) this.y).a(ve3.e);
        if (this.b) {
            ((hv81) this.A).a.c();
        }
        kzo kzoVar = (kzo) this.w;
        if (kzoVar.b) {
            return;
        }
        kzoVar.b = true;
        ((xc71) kzoVar.w).a();
        ((Handler) kzoVar.x).post(new h3s0(12, kzoVar));
    }

    public boolean g() {
        File file = (File) this.A;
        if (((byte[]) this.y) == null) {
            N(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    N(4, null);
                    return false;
                }
            } catch (IOException unused) {
                N(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            N(4, null);
            return false;
        }
        this.b = true;
        return true;
    }

    @Override // defpackage.j581
    public void h() {
        ((js81) this.y).a(ve3.d);
        ((e971) this.z).a(f5.z);
        eq71 eq71Var = ((bc71) ((sbm0) ((hlx0) ((i971) this.a).b).x).b).a;
        if (!eq71Var.j) {
            eq71Var.a.j(true);
        }
        if (eq71Var.k) {
            eq71Var.f();
        }
    }

    @Override // defpackage.j581
    public void i() {
        ((js81) this.y).a(ve3.h);
        if (this.b) {
            ((hv81) this.A).a.d();
        }
    }

    public rs10 j() {
        if (((hu7) this.x) == null) {
            this.x = new hu7(this);
        }
        return (hu7) this.x;
    }

    public Display k() {
        Display display;
        Context context = (Context) this.A;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        }
        display = activity.getDisplay();
        return display;
    }

    public w4u l() {
        return (w4u) this.w;
    }

    public pey m() {
        Object obj = (Context) this.A;
        if (obj instanceof pey) {
            return (pey) obj;
        }
        if (obj instanceof Activity) {
            return new ProxyLifecycleProvider((Activity) obj);
        }
        return null;
    }

    public ye0 n() {
        return (ye0) this.B;
    }

    public n52 o() {
        return new n52(this);
    }

    @Override // defpackage.j581
    public void onVolumeChanged(float f) {
        ((hv81) this.A).a.l(f);
        wvb1 wvb1Var = (wvb1) this.B;
        if (wvb1Var != null) {
            te71 te71Var = ((hv81) wvb1Var.b).a;
            boolean z = wvb1Var.a;
            if (f == 0.0f) {
                if (z) {
                    return;
                }
                wvb1Var.a = true;
                te71Var.o();
                return;
            }
            if (z) {
                wvb1Var.a = false;
                te71Var.a();
            }
        }
    }

    public sm7 p() {
        return new sm7(this);
    }

    public n52 q() {
        return new n52(this);
    }

    public n52 r() {
        return new n52(this);
    }

    public n52 s() {
        return new n52(this);
    }

    public it7 t() {
        return new it7(this);
    }

    public sm7 u() {
        return new sm7(this);
    }

    public v83 v() {
        return new v83(this);
    }

    public v83 w() {
        return new v83(this);
    }

    public v83 x() {
        return new v83(this);
    }

    public n52 y() {
        return new n52(this);
    }

    public n52 z() {
        return new n52(this);
    }

    public static void c(StringBuilder sb, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (sb.length() != 0) {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(charSequence);
    }

    @Override // defpackage.j581
    public void b() {
        if (this.b) {
            ((js81) this.y).a(ve3.i);
            ((hv81) this.A).a.f();
        }
    }

    public pbj(AppAnalyticsReporter appAnalyticsReporter, dj51 dj51Var, Context context, boolean z) {
        this.c = appAnalyticsReporter;
        this.w = dj51Var;
        this.x = context;
        this.b = z;
        this.y = kotlin.a.a(new ia41(this, 0));
        this.B = ea41.b;
    }

    public pbj(MessengerEnvironment messengerEnvironment, sml smlVar, g191 g191Var, p4t p4tVar, abe abeVar) {
        this.c = messengerEnvironment;
        this.w = smlVar;
        this.x = g191Var;
        this.y = p4tVar;
        this.z = abeVar;
    }

    public pbj(i581 i581Var, bc71 bc71Var, kzo kzoVar, qv71 qv71Var, js81 js81Var, e971 e971Var, hv81 hv81Var, i971 i971Var) {
        this.c = bc71Var;
        this.w = kzoVar;
        this.x = qv71Var;
        this.y = js81Var;
        this.z = e971Var;
        this.A = hv81Var;
        this.a = i971Var;
    }

    public pbj(AssetManager assetManager, Executor executor, qef0 qef0Var, String str, File file) {
        byte[] bArr;
        this.b = false;
        this.c = assetManager;
        this.w = executor;
        this.x = qef0Var;
        this.a = str;
        this.A = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = cq91.a;
        } else {
            bArr = (i == 29 || i == 30) ? cq91.b : null;
        }
        this.y = bArr;
    }

    public pbj(Context context, tt5 tt5Var, xuy0 xuy0Var) {
        this.c = tt5Var;
        this.w = new w4u(new sr4(21, new eu7(tt5Var)));
        this.y = new cs7();
        this.A = context;
        this.z = xuy0Var;
    }

    public /* synthetic */ pbj(List list) {
        this(list, (xt31) null, EmptyList.a);
    }

    public pbj(oju ojuVar) {
        this.B = ojuVar;
        View view = ojuVar.a;
        this.a = c.G(kyh0.pool_tariff_title, view);
        this.c = c.G(kyh0.content_description_tariff_bubble_notification_prefix, view);
        this.w = "";
        this.x = "";
        this.A = "";
    }
}

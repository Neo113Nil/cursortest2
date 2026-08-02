package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import coil3.c;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import com.airbnb.lottie.network.FileExtension;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.protobuf.b;
import com.google.protobuf.l;
import com.yandex.pulse.metrics.MetricsState;
import core.network.mapi.exception.MapiClientException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;

/* loaded from: classes.dex */
public final class gp50 implements uc41, nms, qeu, iy60, quy, x0b0 {
    public static final Object c = new Object();
    public static final o2f w = new o2f(7);
    public static gp50 x;
    public final /* synthetic */ int a;
    public final Object b;

    public gp50(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new AtomicInteger(0);
                break;
            case 14:
                this.b = new SortedSet(jl40.b);
                break;
            default:
                this.b = new ycs0();
                x = this;
                break;
        }
    }

    public static String C(String str, FileExtension fileExtension, boolean z) {
        String str2 = z ? ".temp" + fileExtension.extension : fileExtension.extension;
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return oyr.p("lottie_cache_", replaceAll, str2);
    }

    public void A(LayoutNode layoutNode) {
        if (!layoutNode.F()) {
            ixv.b("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.b).add(layoutNode);
    }

    public void B() {
        ((ttd) this.b).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ji10 D(gev gevVar, ii10 ii10Var, xis0 xis0Var, Scale scale) {
        boolean g;
        int abs;
        CachePolicy cachePolicy = gevVar.k;
        Precision precision = gevVar.s;
        if (cachePolicy.getReadEnabled()) {
            adi0 d = ((c) this.b).d();
            ji10 a = d != null ? d.a(ii10Var) : null;
            if (a != null) {
                q7v q7vVar = a.a;
                w06 w06Var = q7vVar instanceof w06 ? (w06) q7vVar : null;
                if (w06Var == null) {
                    g = true;
                } else {
                    Bitmap.Config config = w06Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    g = au50.g(gevVar, config);
                }
                if (g) {
                    String str = (String) ii10Var.b.get("coil#size");
                    if (str == null) {
                        Object obj = a.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!jl40.l(xis0Var, xis0.c) && precision != Precision.INEXACT)) {
                            int width = q7vVar.getWidth();
                            int height = q7vVar.getHeight();
                            xis0 xis0Var2 = q7vVar instanceof w06 ? (xis0) s8o.o(gevVar, kev.b) : xis0.c;
                            okj okjVar = xis0Var.a;
                            int i = okjVar instanceof kkj ? ((kkj) okjVar).a : Integer.MAX_VALUE;
                            okj okjVar2 = xis0Var2.a;
                            int min = Math.min(i, okjVar2 instanceof kkj ? ((kkj) okjVar2).a : Integer.MAX_VALUE);
                            okj okjVar3 = xis0Var.b;
                            int i2 = okjVar3 instanceof kkj ? ((kkj) okjVar3).a : Integer.MAX_VALUE;
                            okj okjVar4 = xis0Var2.b;
                            int min2 = Math.min(i2, okjVar4 instanceof kkj ? ((kkj) okjVar4).a : Integer.MAX_VALUE);
                            double d2 = min / width;
                            double d3 = min2 / height;
                            int i3 = mi10.a[((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? Scale.FIT : scale).ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                if (d2 < d3) {
                                    abs = Math.abs(min - width);
                                    if (abs > 1) {
                                        int i4 = mi10.b[precision.ordinal()];
                                        if (i4 != 1) {
                                            if (i4 != 2) {
                                                w511.b();
                                                return null;
                                            }
                                            if (d2 <= 1.0d) {
                                            }
                                        } else if (d2 == 1.0d) {
                                        }
                                    }
                                } else {
                                    abs = Math.abs(min2 - height);
                                    d2 = d3;
                                    if (abs > 1) {
                                    }
                                }
                            } else if (d2 > d3) {
                                abs = Math.abs(min - width);
                                if (abs > 1) {
                                }
                            } else {
                                abs = Math.abs(min2 - height);
                                d2 = d3;
                                if (abs > 1) {
                                }
                            }
                        }
                        return a;
                    }
                    if (str.equals(xis0Var.toString())) {
                        return a;
                    }
                }
            }
        }
        return null;
    }

    public File E(String str) {
        File file = new File(K(), C(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(K(), C(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(K(), C(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public m72 F() {
        rqo rqoVar = (rqo) this.b;
        m72.Companion.getClass();
        return (m72) ((jbh) rqoVar).e(m72.e).c();
    }

    public String G(String str) {
        if ("pickup_location".equals(str)) {
            return ((MainScreenBehavior) this.b).version;
        }
        return null;
    }

    public syj0 H(Uri uri, String str) {
        Intent intent = new Intent(str, uri);
        intent.addFlags(SelfTester_JCP.IMITA);
        return doa1.f(yqb1.g((Context) this.b, intent), uri);
    }

    public ii10 I(gev gevVar, Object obj, lg70 lg70Var, ago agoVar) {
        String str;
        CachePolicy cachePolicy = gevVar.k;
        Map map = gevVar.e;
        if (cachePolicy != CachePolicy.DISABLED) {
            List list = ((c) this.b).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    str = null;
                    break;
                }
                Pair pair = (Pair) list.get(i);
                pkx pkxVar = (pkx) pair.getFirst();
                if (((g0c) ((lfx) pair.getSecond())).e(obj) && (str = pkxVar.a(obj, lg70Var)) != null) {
                    break;
                }
                i++;
            }
            if (str != null) {
                if (((List) s8o.o(gevVar, kev.a)).isEmpty()) {
                    return new ii10(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", lg70Var.b.toString());
                return new ii10(str, linkedHashMap);
            }
        }
        return null;
    }

    public bix J(ByteString byteString) {
        hjv hjvVar = (hjv) this.b;
        try {
            w3 h = hjvVar.h();
            vt10 h2 = h.h(byteString);
            h.i(h2);
            vt10 b = h.b(h2);
            aix E = bix.E();
            String f = hjvVar.f();
            E.e();
            bix.x((bix) E.b, f);
            ByteString f2 = ((a) b).f();
            E.e();
            bix.y((bix) E.b, f2);
            KeyData$KeyMaterialType i = hjvVar.i();
            E.e();
            bix.z((bix) E.b, i);
            return (bix) E.b();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public File K() {
        File file = new File(((tpx) this.b).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0024: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x0024 */
    public JSONObject L() {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream3 = null;
        try {
            try {
                File file = (File) this.b;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(CommonUtils.j(fileInputStream));
                        fileInputStream3 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        CommonUtils.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    jSONObject = null;
                }
                CommonUtils.b(fileInputStream3, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                CommonUtils.b(fileInputStream3, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.b(fileInputStream3, "Error while closing settings cache file.");
            throw th;
        }
    }

    public boolean M(LayoutNode layoutNode) {
        if (!layoutNode.F()) {
            ixv.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.b).remove(layoutNode);
    }

    public vxi0 N(vxi0 vxi0Var) {
        Iterator it = kotlin.collections.a.x0((Set) this.b, new kp00()).iterator();
        while (it.hasNext()) {
            vxi0Var = ((jp00) it.next()).a(vxi0Var);
        }
        return vxi0Var;
    }

    public void O(int i, com.google.protobuf.ByteString byteString) {
        ((l) this.b).l(i, byteString);
    }

    public void P(int i, int i2) {
        ((l) this.b).m(i, i2);
    }

    public void Q(int i, long j) {
        ((l) this.b).o(i, j);
    }

    public void R(int i, Object obj, som0 som0Var) {
        l lVar = (l) this.b;
        lVar.v(i, 3);
        som0Var.j((b) obj, this);
        lVar.v(i, 4);
    }

    public void S(int i, int i2) {
        ((l) this.b).q(i, i2);
    }

    public void T(int i, long j) {
        ((l) this.b).y(i, j);
    }

    public void U(int i, Object obj, som0 som0Var) {
        b bVar = (b) obj;
        l lVar = (l) this.b;
        lVar.v(i, 2);
        lVar.x(bVar.getSerializedSize(som0Var));
        som0Var.j(bVar, this);
    }

    public void V(int i, Object obj) {
        boolean z = obj instanceof com.google.protobuf.ByteString;
        l lVar = (l) this.b;
        if (z) {
            lVar.t(i, (com.google.protobuf.ByteString) obj);
        } else {
            lVar.s(i, (wt10) obj);
        }
    }

    public File W(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(K(), C(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // defpackage.uc41
    public void a(ep41 ep41Var) {
    }

    @Override // defpackage.qeu
    public void b(hx hxVar, MapiClientException mapiClientException) {
        ((kqq) ((zpq) this.b).get()).e(new rnt(mapiClientException, 0));
    }

    @Override // defpackage.qeu
    public void c(u1m u1mVar, String str, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new pnt(4, str, th));
    }

    @Override // defpackage.qeu
    public void d(u1m u1mVar) {
        hst hstVar = jst.e;
        Objects.toString(u1mVar);
        hstVar.getClass();
    }

    @Override // defpackage.qeu
    public void e(kr krVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new pnt(0, krVar instanceof uug ? ((uug) krVar).a : qoi0.a(krVar.getClass()).d(), th));
    }

    @Override // defpackage.qeu
    public void f(u1m u1mVar, String str, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new pnt(2, str, th));
    }

    @Override // defpackage.qeu
    public void g(u1m u1mVar, String str) {
        ((kqq) ((zpq) this.b).get()).f(new xc8(str, 13));
    }

    @Override // defpackage.nms
    public com.yandex.div.evaluable.c h(String str, ArrayList arrayList) {
        return ((nms) this.b).h(str, arrayList);
    }

    @Override // defpackage.nms
    public com.yandex.div.evaluable.c i(String str, ArrayList arrayList) {
        return ((nms) this.b).i(str, arrayList);
    }

    @Override // defpackage.qeu
    public void j(u1m u1mVar, String str, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new pnt(3, str, th));
    }

    @Override // defpackage.qeu
    public void k(u1m u1mVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new snt(0, th));
    }

    @Override // defpackage.x0b0
    public void l(od20[] od20VarArr) {
        MetricsState metricsState = (MetricsState) this.b;
        qd20 qd20Var = metricsState.d;
        qd20Var.f();
        if (od20VarArr != null) {
            qd20Var.d(j73.d0(od20VarArr));
        }
        metricsState.a();
    }

    @Override // defpackage.qeu
    public void m(u1m u1mVar, String str) {
        ((kqq) ((zpq) this.b).get()).f(new xc8(str, 12));
    }

    @Override // defpackage.qeu
    public void n(IllegalArgumentException illegalArgumentException) {
        ((kqq) ((zpq) this.b).get()).e(new dnr(26, illegalArgumentException));
    }

    @Override // defpackage.qeu
    public void o(u1m u1mVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new qnt(th, u1mVar, 0));
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ((j18) this.b).b(new RuntimeException("request google pay availability failed", exc));
    }

    @Override // defpackage.qeu
    public void p(u1m u1mVar, String str, String str2, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new t7j(17, th, str2, str));
    }

    @Override // defpackage.qeu
    public void q(u1m u1mVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new qnt(th, u1mVar, 2));
    }

    @Override // defpackage.qeu
    public void r(u1m u1mVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new snt(1, th));
    }

    @Override // defpackage.x0b0
    public od20[] s() {
        MetricsState metricsState = (MetricsState) this.b;
        if (metricsState.d.j() > 0) {
            Object[] array = metricsState.d.l().toArray(new od20[0]);
            if (array != null) {
                return (od20[]) array;
            }
            ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return null;
    }

    @Override // defpackage.qeu
    public void t(hx hxVar, MapiClientException mapiClientException) {
        ((kqq) ((zpq) this.b).get()).e(new rnt(mapiClientException, 1));
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return ((SortedSet) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qeu
    public void u(u1m u1mVar, String str, String str2) {
        ((kqq) ((zpq) this.b).get()).f(new obh(str2, str, 1));
    }

    @Override // defpackage.qeu
    public void v(u1m u1mVar, String str, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new pnt(1, str, th));
    }

    @Override // defpackage.qeu
    public void w(u1m u1mVar, Throwable th) {
        ((kqq) ((zpq) this.b).get()).e(new qnt(th, u1mVar, 1));
    }

    @Override // defpackage.qeu
    public void x(u1m u1mVar, String str) {
        ((kqq) ((zpq) this.b).get()).f(new xc8(str, 11));
    }

    @Override // defpackage.qeu
    public void y(u1m u1mVar, String str, String str2, Exception exc) {
        ((kqq) ((zpq) this.b).get()).e(new t7j(16, exc, str2, str));
    }

    @Override // defpackage.uc41
    public lyj0 z(e8h e8hVar, u28 u28Var) {
        return e8hVar.a(u28Var);
    }

    public /* synthetic */ gp50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public gp50(rqo rqoVar) {
        this.a = 20;
        this.b = kotlin.a.a(new zf2(rqoVar, 2));
    }

    public /* synthetic */ gp50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public gp50(l lVar) {
        this.a = 8;
        rqw.a(lVar, "output");
        this.b = lVar;
        lVar.a = this;
    }

    public gp50(q1r q1rVar) {
        this.a = 6;
        this.b = new File(q1rVar.c, "com.crashlytics.settings.json");
    }

    public gp50(hjv hjvVar, Class cls) {
        this.a = 22;
        if (!((Map) hjvVar.b).keySet().contains(cls) && !Void.class.equals(cls)) {
            ny61.g(b64.l("Given internalKeyMananger ", hjvVar.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.b = hjvVar;
    }
}

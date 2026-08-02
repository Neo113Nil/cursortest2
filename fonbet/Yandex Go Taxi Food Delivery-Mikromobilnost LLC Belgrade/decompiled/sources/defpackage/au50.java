package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.i;
import androidx.lifecycle.Lifecycle;
import androidx.profileinstaller.ProfileInstallReceiver;
import coil.c;
import coil.graphics.DataSource;
import coil.intercept.b;
import coil.memory.MemoryCache$Key;
import coil.view.Scale;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import com.airbnb.lottie.network.FileExtension;
import com.yandex.go.analytics.AccountType;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes.dex */
public final class au50 implements al7, txi0, xbi0, hr20, ag7, qef0 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public Object b;

    public au50(String str, String str2, String str3, String str4, long j, String str5, String str6, List list, AccountType accountType, boolean z) {
        this.a = 10;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("userid", str);
        mapBuilder.put("phone_id", str2);
        mapBuilder.put("phone_pd_id", str3);
        mapBuilder.put("ongoing_orderids", list);
        mapBuilder.put("taxi_active_order_status", str4);
        mapBuilder.put("account_uid", Long.valueOf(j));
        mapBuilder.put("account_type", accountType.getEventValue());
        mapBuilder.put("have_plus_flg", Boolean.valueOf(z));
        mapBuilder.put("MainScreenVersion", str5);
        mapBuilder.put("superapp_session", str6);
        this.b = mapBuilder.j();
    }

    public static Lifecycle d(gev gevVar) {
        umf umfVar = gevVar.c;
        Object context = umfVar instanceof umf ? umfVar.a.getContext() : gevVar.a;
        while (!(context instanceof pey)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((pey) context).getLifecycle();
    }

    public static boolean g(gev gevVar, Bitmap.Config config) {
        if (!sb2.x(config)) {
            return true;
        }
        if (!((Boolean) s8o.o(gevVar, lev.e)).booleanValue()) {
            return false;
        }
        umf umfVar = gevVar.c;
        if (!(umfVar instanceof umf)) {
            return true;
        }
        View view = umfVar.a;
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    public static u3v0 i(b bVar, hev hevVar, MemoryCache$Key memoryCache$Key, ki10 ki10Var) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(hevVar.e().getResources(), ki10Var.a());
        DataSource dataSource = DataSource.MEMORY_CACHE;
        Object obj = ki10Var.b().get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = ki10Var.b().get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = m.a;
        if (bVar != null && bVar.e()) {
            z = true;
        }
        return new u3v0(bitmapDrawable, hevVar, dataSource, memoryCache$Key, str, booleanValue, z);
    }

    public void a(kwu kwuVar, boolean z, String str, wls wlsVar) {
        String str2;
        List<Pair> list;
        zwf0 zwf0Var = (zwf0) this.b;
        if (z) {
            ArrayList arrayList = new ArrayList();
            CookieManager cookieManager = CookieManager.getInstance();
            ListBuilder a = rcc.a();
            a.add(kwuVar.i);
            a.add(kwuVar.a + "://" + kwuVar.d + "/");
            Iterator it = a.I(a.j()).iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null && !evu0.J(cookie)) {
                    str2 = cookie;
                }
                if (str2 != null) {
                    zwf0Var.c("FileDownloadRequestConfigurator", "Resolved cookie from url=" + str3);
                    break;
                }
            }
            if (str2 == null) {
                zwf0Var.e("FileDownloadRequestConfigurator", "Cookie is missing for authenticated download url=" + kwuVar);
                list = arrayList;
            } else {
                zwf0Var.c("FileDownloadRequestConfigurator", "Adding cookie header for url=" + kwuVar);
                arrayList.add(new Pair("Cookie", str2));
                list = arrayList;
            }
        } else {
            list = EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).c());
        }
        zwf0Var.c("FileDownloadRequestConfigurator", "Applying " + str + " headers for url=" + kwuVar + Extension.COLON_SPACE + arrayList2);
        for (Pair pair : list) {
            wlsVar.invoke((String) pair.getFirst(), (String) pair.getSecond());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if ((r0.getResponseCode() / 100) == 2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public euz b(Context context, String str, String str2) {
        nsz nszVar;
        ieh a;
        HttpURLConnection httpURLConnection;
        euz euzVar;
        android.util.Pair pair;
        euz j;
        File E;
        boolean z = true;
        AutoCloseable autoCloseable = null;
        if (str2 != null) {
            try {
                E = ((gp50) this.b).E(str);
            } catch (FileNotFoundException unused) {
            }
            if (E != null) {
                FileInputStream fileInputStream = new FileInputStream(E);
                FileExtension fileExtension = E.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : E.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
                E.getAbsolutePath();
                lgz.a();
                pair = new android.util.Pair(fileExtension, fileInputStream);
                if (pair != null) {
                    FileExtension fileExtension2 = (FileExtension) pair.first;
                    InputStream inputStream = (InputStream) pair.second;
                    int i = zt50.a[fileExtension2.ordinal()];
                    if (i == 1) {
                        j = ssz.j(context, new ZipInputStream(inputStream), str2);
                    } else if (i != 2) {
                        j = ssz.d(inputStream, str2);
                    } else {
                        try {
                            j = ssz.d(new GZIPInputStream(inputStream), str2);
                        } catch (IOException e) {
                            j = new euz(e);
                        }
                    }
                    nszVar = j.a;
                }
            }
            pair = null;
            if (pair != null) {
            }
        }
        nszVar = null;
        if (nszVar != null) {
            return new euz(nszVar);
        }
        lgz.a();
        lgz.a();
        try {
            try {
                a = jeh.a(str);
                httpURLConnection = a.a;
            } catch (Exception e2) {
                euz euzVar2 = new euz(e2);
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException unused2) {
                        lgz.c("LottieFetchResult close failed ");
                    }
                }
                return euzVar2;
            }
        } finally {
        }
        z = false;
        if (z) {
            euzVar = e(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            nsz nszVar2 = euzVar.a;
            lgz.a();
        } else {
            euzVar = new euz(new IllegalArgumentException(a.a()));
        }
        try {
            a.close();
            return euzVar;
        } catch (IOException unused3) {
            lgz.c("LottieFetchResult close failed ");
            return euzVar;
        }
    }

    @Override // defpackage.qef0
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public euz e(Context context, String str, InputStream inputStream, String str2, String str3) {
        euz j;
        FileExtension fileExtension;
        gp50 gp50Var = (gp50) this.b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            lgz.a();
            FileExtension fileExtension2 = FileExtension.ZIP;
            j = str3 != null ? ssz.j(context, new ZipInputStream(new FileInputStream(gp50Var.W(str, inputStream, fileExtension2))), str) : ssz.j(context, new ZipInputStream(inputStream), null);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            lgz.a();
            fileExtension = FileExtension.GZIP;
            j = str3 != null ? ssz.d(new GZIPInputStream(new FileInputStream(gp50Var.W(str, inputStream, fileExtension))), str) : ssz.d(new GZIPInputStream(inputStream), null);
        } else {
            lgz.a();
            fileExtension = FileExtension.JSON;
            j = str3 != null ? ssz.d(new FileInputStream(gp50Var.W(str, inputStream, fileExtension).getAbsolutePath()), str) : ssz.d(inputStream, null);
        }
        if (str3 != null && j.a != null) {
            File file = new File(gp50Var.K(), gp50.C(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            lgz.a();
            if (!renameTo) {
                lgz.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + Extension.DOT_CHAR);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        if (java.lang.Math.abs(r9 - (r15 * r6)) > r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (r11 != r18) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r4 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        if (r11 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r3 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (java.lang.Math.abs(r8 - r2) > 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (java.lang.Math.abs(r9 - r6) > 1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ki10 f(hev hevVar, MemoryCache$Key memoryCache$Key, wis0 wis0Var, Scale scale) {
        double d;
        ki10 ki10Var;
        double d2;
        if (hevVar.s().getReadEnabled()) {
            bdi0 bdi0Var = (bdi0) ((c) this.b).c.getValue();
            ki10 a = bdi0Var != null ? bdi0Var.a(memoryCache$Key) : null;
            if (a != null) {
                boolean z = false;
                if (tig0.i(hevVar, mga1.d(a.a()))) {
                    Object obj = a.b().get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!xga1.e(wis0Var)) {
                        String str = memoryCache$Key.getExtras().get("coil#transformation_size");
                        if (str != null) {
                            z = str.equals(wis0Var.toString());
                        } else {
                            int width = a.a().getWidth();
                            int height = a.a().getHeight();
                            jh91 b = wis0Var.b();
                            int i = b instanceof lkj ? ((lkj) b).a : Integer.MAX_VALUE;
                            jh91 a2 = wis0Var.a();
                            int i2 = a2 instanceof lkj ? ((lkj) a2).a : Integer.MAX_VALUE;
                            double i3 = l76.i(width, height, i, i2, scale);
                            boolean a3 = i.a(hevVar);
                            if (a3) {
                                if (i3 > 1.0d) {
                                    d = 1.0d;
                                    d2 = 1.0d;
                                } else {
                                    d2 = i3;
                                    d = 1.0d;
                                }
                                ki10Var = null;
                                if (Math.abs(i - (width * d2)) > d) {
                                }
                                z = true;
                            } else {
                                d = 1.0d;
                                ki10Var = null;
                                if (i != Integer.MIN_VALUE) {
                                    if (i != Integer.MAX_VALUE) {
                                    }
                                }
                                if (i2 != Integer.MIN_VALUE) {
                                    if (i2 != Integer.MAX_VALUE) {
                                    }
                                }
                                z = true;
                            }
                        }
                    } else if (!booleanValue) {
                        ki10Var = null;
                        z = true;
                    }
                    return !z ? a : ki10Var;
                }
                ki10Var = null;
                if (!z) {
                }
            }
        }
        return null;
    }

    @Override // defpackage.hr20
    public String get(String str) {
        return ((kvj0) this.b).y.a(str);
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        if (qyy0.a()) {
            return this.b;
        }
        k();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MemoryCache$Key h(hev hevVar, Object obj, qg70 qg70Var, cgo cgoVar) {
        Map map;
        String str;
        Object[] objArr;
        MemoryCache$Key r = hevVar.r();
        if (r != null) {
            return r;
        }
        List list = ((c) this.b).h.c;
        int size = list.size();
        int i = 0;
        while (true) {
            map = null;
            objArr = 0;
            if (i >= size) {
                str = null;
                break;
            }
            Pair pair = (Pair) list.get(i);
            qkx qkxVar = (qkx) pair.getFirst();
            if (((Class) pair.getSecond()).isAssignableFrom(obj.getClass()) && (str = qkxVar.a(obj, qg70Var)) != null) {
                break;
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        List D = hevVar.D();
        Map a = hevVar.u().a();
        if (D.isEmpty() && a.isEmpty()) {
            return new MemoryCache$Key(str, map, 2, objArr == true ? 1 : 0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        if (!D.isEmpty()) {
            List D2 = hevVar.D();
            int size2 = D2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap.put(oyr.i(i2, "coil#transformation_"), ((pw01) D2.get(i2)).a());
            }
            linkedHashMap.put("coil#transformation_size", qg70Var.f().toString());
        }
        return new MemoryCache$Key(str, linkedHashMap);
    }

    public lg70 j(gev gevVar, xis0 xis0Var) {
        Context context = gevVar.a;
        coil3.size.Scale scale = gevVar.r;
        Precision precision = gevVar.s;
        r1r r1rVar = gevVar.f;
        CachePolicy cachePolicy = gevVar.k;
        CachePolicy cachePolicy2 = gevVar.l;
        CachePolicy cachePolicy3 = gevVar.m;
        uh uhVar = lev.a;
        Bitmap.Config config = (Bitmap.Config) s8o.o(gevVar, uhVar);
        uh uhVar2 = lev.f;
        boolean booleanValue = ((Boolean) s8o.o(gevVar, uhVar2)).booleanValue();
        uh uhVar3 = kev.a;
        boolean z = ((List) s8o.o(gevVar, uhVar3)).isEmpty() || j73.y(zx21.a, (Bitmap.Config) s8o.o(gevVar, uhVar));
        boolean z2 = !sb2.x((Bitmap.Config) s8o.o(gevVar, uhVar)) || g(gevVar, (Bitmap.Config) s8o.o(gevVar, uhVar));
        if (!z || !z2) {
            config = Bitmap.Config.ARGB_8888;
        }
        boolean z3 = booleanValue && ((List) s8o.o(gevVar, uhVar3)).isEmpty() && config != Bitmap.Config.ALPHA_8;
        g5p g5pVar = new g5p(kotlin.collections.b.n(gevVar.v.n.a, gevVar.t.a));
        if (config != ((Bitmap.Config) s8o.o(gevVar, uhVar))) {
            g5pVar.b(uhVar, config);
        }
        if (z3 != ((Boolean) s8o.o(gevVar, uhVar2)).booleanValue()) {
            g5pVar.b(uhVar2, Boolean.valueOf(z3));
        }
        return new lg70(context, xis0Var, scale, precision, r1rVar, cachePolicy, cachePolicy2, cachePolicy3, g5pVar.a());
    }

    public void k() {
        xby.t(jst.e, "MAPKIT:ACCESS_FROM_WORKING_THREAD", new IllegalStateException("Access from thread=" + Thread.currentThread()), "Access to field should be only from main thread", 2);
    }

    public void l(int i, ByteString byteString) {
        ((i) this.b).k(i, byteString);
    }

    public void m(int i, Object obj, tom0 tom0Var) {
        i iVar = (i) this.b;
        iVar.y(i, 3);
        tom0Var.h((xt10) obj, iVar.a);
        iVar.y(i, 4);
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.b;
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        switch (this.a) {
            case 8:
                ((j18) this.b).resumeWith(new Result.Failure(iOException));
                break;
            default:
                vh60 vh60Var = (vh60) this.b;
                ew2 ew2Var = vh60Var.d;
                Pair pair = new Pair(CRLReasonCodeExtension.REASON, "httpError");
                String message = iOException.getMessage();
                if (message == null) {
                    message = "";
                }
                ew2Var.c("wm_push_set_token_to_backend_error", kotlin.collections.b.i(pair, new Pair("error", message)));
                vh60Var.h.post(new vpa(this, iOException, 17));
                break;
        }
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        byte[] bytes;
        JSONObject f;
        switch (this.a) {
            case 8:
                ((j18) this.b).q(kvj0Var, tl7.b);
                break;
            default:
                vh60 vh60Var = (vh60) this.b;
                Handler handler = vh60Var.h;
                ew2 ew2Var = vh60Var.d;
                if (!kvj0Var.J) {
                    IllegalArgumentException b = m3b1.b(kvj0Var);
                    Pair pair = new Pair(CRLReasonCodeExtension.REASON, "backendError");
                    String message = b.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ew2Var.c("wm_push_set_token_to_backend_error", kotlin.collections.b.i(pair, new Pair("error", message)));
                    handler.post(new vpa(this, b, 16));
                    break;
                } else {
                    rvj0 rvj0Var = kvj0Var.z;
                    String str = null;
                    if (rvj0Var != null && (bytes = rvj0Var.bytes()) != null) {
                        String q = cvu0.q(bytes);
                        if (evu0.J(q)) {
                            q = null;
                        }
                        if (q != null && (f = hbb1.f(Constants.KEY_DATA, new JSONObject(q))) != null) {
                            str = hbb1.g("logout_token", f);
                        }
                    }
                    if (str != null) {
                        vh60Var.b.edit().putString("LOGOUT_TOKEN_KEY", str).apply();
                        ew2Var.b("wm_push_new_logout_token");
                    }
                    handler.post(new th60(vh60Var, this));
                    break;
                }
        }
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        return new g6d0(yv60Var);
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        if (!qyy0.a()) {
            k();
        }
        this.b = obj2;
    }

    public /* synthetic */ au50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public au50(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 18:
                LogoutAvailabilityForServiceOrdersExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).c(LogoutAvailabilityForServiceOrdersExperiment.e).a();
                break;
            default:
                this.b = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.AUTO_UPDATE_SOURCE_POINT);
                break;
        }
    }

    public au50(dne0 dne0Var, String str) {
        this.a = 12;
        this.b = dne0Var.a(str);
    }

    public au50(int i) {
        this.a = i;
        switch (i) {
            case 20:
                break;
            default:
                this.b = new AtomicReference(null);
                break;
        }
    }

    public au50(i iVar) {
        this.a = 9;
        tqw.a(iVar, "output");
        this.b = iVar;
        iVar.a = this;
    }

    public /* synthetic */ au50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public au50(zqg zqgVar, cot cotVar) {
        this.a = 21;
        this.b = cotVar;
    }

    public au50(z92 z92Var) {
        this.a = 1;
        Context context = z92Var.a;
        String str = z92Var.b;
        String str2 = z92Var.c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.b = z92Var.g;
            return;
        }
        ny61.g("keysetName cannot be null");
        throw null;
    }
}

package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import androidx.compose.runtime.f;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import androidx.core.app.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.RequestManager;
import com.yandex.images.ImageDownloadReporter$Status;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.internal.webview.MessengerWebView;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.xeo;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.embedding.android.g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import org.bouncycastle.operator.RuntimeOperatorException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.yx_platform_api.LocationEnabledStateChangesReceiver;
import ru.yandex.yx_platform_api.LocationEnabledStateChangesStreamHandler$onListen$2;

/* loaded from: classes11.dex */
public final class c9v implements xie, ca20, ryu0, vyu0, n7j0, zeo, al7, IMetadataController {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public c9v(ag1 ag1Var, d0c d0cVar, l920 l920Var) {
        this.a = 27;
        vbb vbbVar = new vbb();
        vbbVar.a = new hdu(new wdz());
        vbbVar.b = new hdu(new ity());
        m2v m2vVar = new m2v();
        m2vVar.a = d0cVar;
        m2vVar.b = l920Var;
        m2vVar.c = vbbVar;
        m2vVar.w = new ConcurrentHashMap();
        this.b = ag1Var;
        this.c = m2vVar;
    }

    public static ArrayList d(dny dnyVar) {
        ArrayList arrayList = new ArrayList();
        if (dnyVar.b) {
            arrayList.add("call");
        }
        if (dnyVar.a) {
            arrayList.add("done");
        }
        return arrayList;
    }

    public static void h(c9v c9vVar, String str) {
        ((Handler) c9vVar.c).post(new r7v(14, c9vVar, str));
    }

    @Override // defpackage.ryu0
    public boolean a(h2r h2rVar) {
        e1y o = o();
        gs90 gs90Var = o != null ? o.f : null;
        if (gs90Var == null || gs90Var.e()) {
            return true;
        }
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            return gs90Var.i(h2rVar);
        } catch (Throwable th) {
            try {
                o.getClass();
                throw th;
            } finally {
                tje.W(D, O, e);
            }
        }
    }

    @Override // defpackage.ryu0
    public syu0 apply() {
        i iVar = (i) this.b;
        e1y o = o();
        if (o != null) {
            iVar.b(o, false);
        }
        return iVar.d(this.c);
    }

    @Override // defpackage.ryu0
    public boolean b() {
        gs90 gs90Var;
        e1y o = o();
        if (o == null || (gs90Var = o.f) == null) {
            return true;
        }
        return gs90Var.e();
    }

    @Override // defpackage.n7j0
    public Set c() {
        HashSet hashSet = new HashSet();
        l((FragmentManager) this.b, hashSet);
        return hashSet;
    }

    @Override // defpackage.ryu0
    public void cancel() {
        e1y o = o();
        if ((o != null ? o.f : null) != null) {
            i.a((i) this.b, this.c);
        }
    }

    @Override // defpackage.vyu0
    public void e(uyu0 uyu0Var) {
        qy40 qy40Var = (qy40) this.c;
        qy40Var.a();
        zy40 zy40Var = uyu0Var.a;
        Object[] objArr = zy40Var.b;
        long[] jArr = zy40Var.c;
        int i = zy40Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object b = ((p5y) this.b).b(obj);
            int d = qy40Var.d(b);
            int i3 = d >= 0 ? qy40Var.c[d] : 0;
            if (i3 == 7) {
                uyu0Var.remove(obj);
            } else {
                qy40Var.g(b, i3 + 1);
            }
            i = i2;
        }
    }

    @Override // defpackage.vyu0
    public boolean f(Object obj, Object obj2) {
        p5y p5yVar = (p5y) this.b;
        return jl40.l(p5yVar.b(obj), p5yVar.b(obj2));
    }

    public ogz0 g(ArrayList arrayList) {
        Set a = ((jaa0) this.c).a();
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lea0 lea0Var = (lea0) it.next();
            if (lea0Var instanceof fl8) {
                if (lea0Var.e() && !((fl8) lea0Var).h) {
                    return new ogz0(((fga0) this.b).s());
                }
            } else if (lea0Var.e() && a.contains(lea0Var.c())) {
                return new ogz0(((fga0) this.b).s());
            }
        }
        return null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController
    public String getDeviceId() {
        try {
            String string = Settings.Secure.getString(((abe) ((ht10) this.b).b).a.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
            return string == null ? "empty" : string;
        } catch (Exception unused) {
            return "error";
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController
    public Object getMetaData(Continuation continuation) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        List W;
        ht10 ht10Var = (ht10) this.b;
        String str16 = MetaDataField.NOT_PERMISSIONS_VALUE;
        String str17 = "error";
        Context context = ((abe) ht10Var.b).a;
        try {
            str = String.valueOf(System.currentTimeMillis() / 1000);
        } catch (Exception unused) {
            str = "error";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
            str2 = string == null ? "empty" : string;
        } catch (Exception unused2) {
            str2 = "error";
        }
        try {
            String str18 = Build.PRODUCT;
            str3 = str18 == null ? "empty" : str18;
        } catch (Exception unused3) {
            str3 = "error";
        }
        try {
            if (uh91.c(uh91.b(context, Collections.singletonList("android.permission.READ_PHONE_STATE")))) {
                String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                str4 = networkOperatorName == null ? "empty" : networkOperatorName;
            } else {
                str4 = MetaDataField.NOT_PERMISSIONS_VALUE;
            }
        } catch (Exception unused4) {
            str4 = "error";
        }
        String str19 = "";
        String str20 = evu0.J("") ? "unknown" : "";
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            str5 = point.x + ";" + point.y;
        } catch (Exception unused5) {
            str5 = "error";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start().getInputStream(), uza.a), 8192);
            try {
                String x0 = cma1.x0(bufferedReader);
                bufferedReader.close();
                W = evu0.W(x0, new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
                String[] strArr = (String[]) W.toArray(new String[0]);
                String c = abe.c("Processor\t:", strArr);
                str6 = (c == null && (c = abe.c("model name\t:", strArr)) == null) ? "empty" : c;
            } finally {
            }
        } catch (Exception unused6) {
            str6 = "error";
        }
        try {
            str7 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(Calendar.getInstance().getTime());
        } catch (Exception unused7) {
            str7 = "error";
        }
        try {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            TimeZone timeZone = Calendar.getInstance().getTimeZone();
            if (locale == null || (str14 = locale.getCountry()) == null) {
                str14 = "";
            }
            if (locale == null || (str15 = locale.getLanguage()) == null) {
                str15 = "";
            }
            String displayName = timeZone.getDisplayName();
            if (displayName != null) {
                str19 = displayName;
            }
            str8 = str14 + ";" + str15 + ";" + str19;
        } catch (Exception unused8) {
            str8 = "error";
        }
        try {
            String str21 = Build.MANUFACTURER;
            str9 = str21 == null ? "empty" : str21;
        } catch (Exception unused9) {
            str9 = "error";
        }
        try {
            if (uh91.c(uh91.b(context, Collections.singletonList("android.permission.READ_PHONE_STATE")))) {
                String serial = Build.getSerial();
                str10 = serial == null ? "empty" : serial;
            } else {
                str10 = MetaDataField.NOT_PERMISSIONS_VALUE;
            }
        } catch (Exception unused10) {
            str10 = "error";
        }
        try {
            if (uh91.c(uh91.b(context, Collections.singletonList("android.permission.READ_PHONE_STATE")))) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                str11 = telephonyManager.getSimOperator() + ";" + telephonyManager.getSimOperatorName() + ";" + telephonyManager.getSimCountryIso() + ";" + telephonyManager.getSimSerialNumber();
            } else {
                str11 = MetaDataField.NOT_PERMISSIONS_VALUE;
            }
        } catch (Exception unused11) {
            str11 = "error";
        }
        try {
            if (uh91.c(uh91.b(context, Collections.singletonList("android.permission.READ_PHONE_STATE")))) {
                String imei = ((TelephonyManager) context.getSystemService("phone")).getImei();
                str12 = imei == null ? "empty" : imei;
            } else {
                str12 = MetaDataField.NOT_PERMISSIONS_VALUE;
            }
        } catch (Exception unused12) {
            str12 = "error";
        }
        try {
            str13 = "Android " + Build.VERSION.RELEASE;
        } catch (Exception unused13) {
            str13 = "error";
        }
        try {
            str17 = context.getResources().getDisplayMetrics().densityDpi + " Dpi";
        } catch (Exception unused14) {
        }
        String str22 = str17;
        Location location = (Location) ht10Var.c;
        if (location != null) {
            str16 = location.getLatitude() + ";" + location.getLongitude();
        }
        return new MetaData(str, str7, str16, str13, str4, "unknown", str5, str22, str20, str8, str10, str12, str2, str9, str3, str6, str11, "unknown");
    }

    @Override // defpackage.xie
    public OutputStream getOutputStream() {
        return (OutputStream) this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController
    public int getRootAvailable() {
        List W;
        List W2;
        List W3;
        String str = Build.TAGS;
        if (str != null && evu0.y(str, "test-keys", false)) {
            return 1;
        }
        if (nwk0.b("su")) {
            return 2;
        }
        if (nwk0.b("magisk")) {
            return 9;
        }
        try {
            List a = nwk0.a();
            if (a != null && !a.isEmpty()) {
                Iterator it = a.iterator();
                loop0: while (it.hasNext()) {
                    W = evu0.W((String) it.next(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
                    if (W.size() >= 4) {
                        String str2 = (String) W.get(1);
                        String str3 = (String) W.get(3);
                        int i = 0;
                        while (true) {
                            String[] strArr = nwk0.b;
                            if (i < 7) {
                                if (cvu0.t(str2, strArr[i], true)) {
                                    W3 = evu0.W(str3, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                                    Iterator it2 = W3.iterator();
                                    while (it2.hasNext()) {
                                        if (cvu0.t((String) it2.next(), "rw", true)) {
                                            break loop0;
                                        }
                                    }
                                }
                                i++;
                            } else if (W.size() >= 6) {
                                String str4 = (String) W.get(2);
                                String str5 = (String) W.get(5);
                                for (int i2 = 0; i2 < 7; i2++) {
                                    if (cvu0.t(str4, strArr[i2], true)) {
                                        W2 = evu0.W(evu0.l0(str5, '(', ')'), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                                        Iterator it3 = W2.iterator();
                                        while (it3.hasNext()) {
                                            if (cvu0.t((String) it3.next(), "rw", true)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return 3;
                    }
                }
            }
            return (nwk0.c("/system/xbin/which") || nwk0.c("/system/bin/which") || nwk0.c("which")) ? 5 : 0;
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            return 3;
        }
    }

    public void i(String str, PaymentMethod$Type paymentMethod$Type) {
        r0 r0Var = (r0) this.c;
        m6a0 m6a0Var = (m6a0) r0Var.getValue();
        m6a0 m6a0Var2 = m6a0Var != null ? new m6a0(paymentMethod$Type, str, m6a0Var.c) : new m6a0(paymentMethod$Type, str, null);
        r0Var.getClass();
        r0Var.m(null, m6a0Var2);
    }

    public Object j(Object obj) {
        Object obj2;
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.c).get(obj);
        if (weakReference == null || (obj2 = weakReference.get()) == null) {
            return null;
        }
        ((mzz) this.b).d(obj, obj2);
        return obj2;
    }

    public byte[] k() {
        return (byte[]) this.b;
    }

    public void l(FragmentManager fragmentManager, HashSet hashSet) {
        List f = fragmentManager.c.f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) f.get(i);
            l(fragment.getChildFragmentManager(), hashSet);
            wey weyVar = (wey) this.c;
            Lifecycle lifecycle = fragment.getLifecycle();
            weyVar.getClass();
            pw21.a();
            RequestManager requestManager = (RequestManager) weyVar.a.get(lifecycle);
            if (requestManager != null) {
                hashSet.add(requestManager);
            }
        }
    }

    public iwd m() {
        return (iwd) this.c;
    }

    public z910 n() {
        return (z910) ((oz40) this.c).getValue();
    }

    public e1y o() {
        i iVar = (i) this.b;
        LayoutNode layoutNode = (LayoutNode) iVar.C.d(this.c);
        if (layoutNode != null) {
            return (e1y) iVar.y.d(layoutNode);
        }
        return null;
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        LocationEnabledStateChangesStreamHandler$onListen$2 locationEnabledStateChangesStreamHandler$onListen$2 = (LocationEnabledStateChangesStreamHandler$onListen$2) this.c;
        if (locationEnabledStateChangesStreamHandler$onListen$2 != null) {
            ((Context) this.b).unregisterReceiver(locationEnabledStateChangesStreamHandler$onListen$2);
        }
        this.c = null;
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        ((Handler) this.b).post(new mkz(1, (yxf0) this.c));
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, final xeo xeoVar) {
        final Context context = (Context) this.b;
        LocationEnabledStateChangesStreamHandler$onListen$2 locationEnabledStateChangesStreamHandler$onListen$2 = (LocationEnabledStateChangesStreamHandler$onListen$2) this.c;
        if (locationEnabledStateChangesStreamHandler$onListen$2 != null) {
            context.unregisterReceiver(locationEnabledStateChangesStreamHandler$onListen$2);
        }
        LocationEnabledStateChangesReceiver locationEnabledStateChangesReceiver = new LocationEnabledStateChangesReceiver(context) { // from class: ru.yandex.yx_platform_api.LocationEnabledStateChangesStreamHandler$onListen$2
            @Override // ru.yandex.yx_platform_api.LocationEnabledStateChangesReceiver
            public void onLocationStateChanged(boolean isLocationEnabled) {
                xeo.this.success(Boolean.valueOf(isLocationEnabled));
            }
        };
        IntentFilter intentFilter = new IntentFilter("android.location.MODE_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(locationEnabledStateChangesReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(locationEnabledStateChangesReceiver, intentFilter);
        }
        this.c = locationEnabledStateChangesReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ba20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0445 -> B:165:0x045f). Please report as a decompilation issue!!! */
    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        String str;
        Context context;
        uya0 uya0Var;
        Object obj;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        ba20 ba20Var = null;
        ba20Var = null;
        ba20Var = null;
        ba20Var = null;
        ba20Var = null;
        switch (this.a) {
            case 7:
                h2t h2tVar = (h2t) this.c;
                if (((jkx) h2tVar.a) == null) {
                    ((ba20) da20Var).success((Map) this.b);
                    break;
                } else {
                    String str2 = x920Var.a;
                    str2.getClass();
                    if (str2.equals("getKeyboardState")) {
                        try {
                            this.b = Collections.unmodifiableMap(((g) ((jkx) h2tVar.a).a[0]).b);
                        } catch (IllegalStateException e) {
                            ((ba20) da20Var).error("error", e.getMessage(), null);
                        }
                        ((ba20) da20Var).success((Map) this.b);
                        break;
                    } else {
                        ((ba20) da20Var).notImplemented();
                        break;
                    }
                }
            case 28:
                fcj0 fcj0Var = (fcj0) this.b;
                zlr0 zlr0Var = (zlr0) this.c;
                if (!(x920Var.b instanceof Map)) {
                    ny61.g("Map arguments expected");
                    break;
                } else {
                    AtomicBoolean atomicBoolean = zlr0Var.b;
                    if (atomicBoolean.compareAndSet(true, false)) {
                        SharePlusPendingIntent.Companion.getClass();
                        SharePlusPendingIntent.result = "";
                        atomicBoolean.set(false);
                        zlr0Var.a = (ba20) da20Var;
                    } else {
                        ba20 ba20Var2 = zlr0Var.a;
                        if (ba20Var2 != null) {
                            ba20Var2.success("dev.fluttercommunity.plus/share/unavailable");
                        }
                        SharePlusPendingIntent.Companion.getClass();
                        SharePlusPendingIntent.result = "";
                        atomicBoolean.set(false);
                        zlr0Var.a = (ba20) da20Var;
                    }
                    try {
                        str = x920Var.a;
                    } catch (Throwable th) {
                        zlr0Var.b.set(true);
                        zlr0Var.a = ba20Var;
                        ?? message = th.getMessage();
                        ((ba20) da20Var).error("Share failed", message, th);
                        zlr0Var = message;
                        ba20Var = "Share failed";
                    }
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1811378728) {
                            if (hashCode != -743768819) {
                                if (hashCode == 109400031 && str.equals("share")) {
                                    fcj0Var.l((String) x920Var.a("text"), (String) x920Var.a("subject"));
                                    zlr0Var = zlr0Var;
                                    break;
                                }
                            } else if (str.equals("shareUri")) {
                                fcj0Var.l((String) x920Var.a(LaunchBrowserActivity.KEY_URI), null);
                                zlr0Var = zlr0Var;
                            }
                        } else if (str.equals("shareFiles")) {
                            fcj0Var.m((String) x920Var.a("text"), (String) x920Var.a("subject"), (List) x920Var.a("paths"), (List) x920Var.a("mimeTypes"));
                            zlr0Var = zlr0Var;
                        }
                    }
                    ((ba20) da20Var).notImplemented();
                    zlr0Var = zlr0Var;
                }
                break;
            default:
                context = (Context) this.b;
                uya0Var = (uya0) this.c;
                String str3 = x920Var.a;
                obj = x920Var.b;
                str3.getClass();
                switch (str3) {
                    case "checkServiceStatus":
                        int parseInt = Integer.parseInt(obj.toString());
                        if (context == null) {
                            ((ba20) da20Var).error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                            break;
                        } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                            if (parseInt == 21) {
                                ((ba20) da20Var).success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                                break;
                            } else if (parseInt == 8) {
                                PackageManager packageManager = context.getPackageManager();
                                if (packageManager.hasSystemFeature("android.hardware.telephony")) {
                                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                    if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                        Intent intent = new Intent("android.intent.action.CALL");
                                        intent.setData(Uri.parse("tel:123123"));
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            of = PackageManager.ResolveInfoFlags.of(0L);
                                            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                                        } else {
                                            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                        }
                                        if (queryIntentActivities.isEmpty()) {
                                            ((ba20) da20Var).success(2);
                                            break;
                                        } else if (telephonyManager.getSimState() != 5) {
                                            ((ba20) da20Var).success(0);
                                            break;
                                        } else {
                                            ((ba20) da20Var).success(1);
                                            break;
                                        }
                                    } else {
                                        ((ba20) da20Var).success(2);
                                        break;
                                    }
                                } else {
                                    ((ba20) da20Var).success(2);
                                    break;
                                }
                            } else if (parseInt == 16) {
                                ((ba20) da20Var).success(1);
                                break;
                            } else {
                                ((ba20) da20Var).success(2);
                                break;
                            }
                        } else {
                            LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                            ((ba20) da20Var).success(Integer.valueOf(locationManager != null ? locationManager.isLocationEnabled() : 0));
                            break;
                        }
                        break;
                    case "shouldShowRequestPermissionRationale":
                        int parseInt2 = Integer.parseInt(obj.toString());
                        Activity activity = uya0Var.c;
                        if (activity == null) {
                            ((ba20) da20Var).error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            break;
                        } else {
                            ArrayList c = g0b0.c(parseInt2, activity);
                            if (c == null) {
                                ((ba20) da20Var).success(Boolean.FALSE);
                                break;
                            } else if (c.isEmpty()) {
                                ((ba20) da20Var).success(Boolean.FALSE);
                                break;
                            } else {
                                ((ba20) da20Var).success(Boolean.valueOf(b.M(uya0Var.c, (String) c.get(0))));
                                break;
                            }
                        }
                    case "checkPermissionStatus":
                        ((ba20) da20Var).success(Integer.valueOf(uya0Var.a(Integer.parseInt(obj.toString()))));
                        break;
                    case "openAppSettings":
                        if (context == null) {
                            ((ba20) da20Var).error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                            break;
                        } else {
                            try {
                                Intent intent2 = new Intent();
                                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent2.addCategory("android.intent.category.DEFAULT");
                                intent2.setData(Uri.parse("package:" + context.getPackageName()));
                                intent2.addFlags(SelfTester_JCP.IMITA);
                                intent2.addFlags(1073741824);
                                intent2.addFlags(SelfTester_JCP.ENCRYPT_CNT);
                                context.startActivity(intent2);
                                ((ba20) da20Var).success(Boolean.TRUE);
                                break;
                            } catch (Exception unused) {
                                ((ba20) da20Var).success(Boolean.FALSE);
                                return;
                            }
                        }
                    case "requestPermissions":
                        List<Integer> list = (List) obj;
                        ba20 ba20Var3 = (ba20) da20Var;
                        y920 y920Var = new y920(ba20Var3);
                        if (uya0Var.w > 0) {
                            ba20Var3.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                            break;
                        } else if (uya0Var.c == null) {
                            ba20Var3.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                            break;
                        } else {
                            uya0Var.b = y920Var;
                            uya0Var.x = new HashMap();
                            uya0Var.w = 0;
                            ArrayList arrayList = new ArrayList();
                            for (Integer num : list) {
                                if (uya0Var.a(num.intValue()) != 1) {
                                    ArrayList c2 = g0b0.c(num.intValue(), uya0Var.c);
                                    if (c2 == null || c2.isEmpty()) {
                                        if (!uya0Var.x.containsKey(num)) {
                                            uya0Var.x.put(num, 0);
                                            if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                                uya0Var.x.put(num, 0);
                                            } else {
                                                uya0Var.x.put(num, 2);
                                            }
                                        }
                                    } else if (num.intValue() == 16) {
                                        uya0Var.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                    } else {
                                        int i = Build.VERSION.SDK_INT;
                                        if (i >= 30 && num.intValue() == 22) {
                                            uya0Var.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                        } else if (num.intValue() == 23) {
                                            uya0Var.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                        } else if (num.intValue() == 24) {
                                            uya0Var.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                        } else if (num.intValue() == 27) {
                                            uya0Var.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                        } else if (i >= 31 && num.intValue() == 34) {
                                            uya0Var.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                        } else if (num.intValue() != 37 && num.intValue() != 0) {
                                            arrayList.addAll(c2);
                                            uya0Var.w = c2.size() + uya0Var.w;
                                        } else if (uya0Var.b()) {
                                            arrayList.add("android.permission.WRITE_CALENDAR");
                                            arrayList.add("android.permission.READ_CALENDAR");
                                            uya0Var.w += 2;
                                        } else {
                                            uya0Var.x.put(num, 0);
                                        }
                                    }
                                } else if (!uya0Var.x.containsKey(num)) {
                                    uya0Var.x.put(num, 1);
                                }
                            }
                            if (arrayList.size() > 0) {
                                b.J(uya0Var.c, (String[]) arrayList.toArray(new String[0]), 24);
                            }
                            y920 y920Var2 = uya0Var.b;
                            if (y920Var2 != null && uya0Var.w == 0) {
                                y920Var2.a.success(uya0Var.x);
                                break;
                            }
                        }
                        break;
                    default:
                        ((ba20) da20Var).notImplemented();
                        break;
                }
        }
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        yxf0 yxf0Var = (yxf0) this.c;
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var != null) {
            rvj0Var.close();
        }
        boolean z = kvj0Var.J;
        Handler handler = (Handler) this.b;
        if (z) {
            handler.post(new mkz(0, yxf0Var));
        } else {
            handler.post(new mkz(1, yxf0Var));
        }
    }

    public void p(dny dnyVar, String str) {
        onr0 onr0Var = (onr0) this.c;
        String X = dnyVar != null ? a.X(d(dnyVar), ",", null, null, null, 62) : null;
        String str2 = dnyVar != null ? dnyVar.w : null;
        String str3 = dnyVar != null ? dnyVar.v : null;
        HashMap hashMap = new HashMap();
        if (X != null) {
            hashMap.put("button_list", X);
        }
        hashMap.put("button_name", str);
        if (str2 != null) {
            hashMap.put(ClidProvider.STATE, str2);
        }
        if (str3 != null) {
            hashMap.put("tariff_class", str3);
        }
        onr0Var.a.a("SharedOrderCard.Tapped", hashMap, 1, new HashMap());
    }

    public int q(int i) {
        z910 n = n();
        LayoutNode layoutNode = (LayoutNode) this.b;
        return n.g((s) layoutNode.a0.e, layoutNode.j(), i);
    }

    public int r(int i) {
        z910 n = n();
        LayoutNode layoutNode = (LayoutNode) this.b;
        return n.e((s) layoutNode.a0.e, layoutNode.j(), i);
    }

    public int s(int i) {
        z910 n = n();
        LayoutNode layoutNode = (LayoutNode) this.b;
        return n.i((s) layoutNode.a0.e, layoutNode.j(), i);
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController
    public void startLocationTracker() {
        ru.rt.ebs.cryptosdk.core.metadata.data.system.location.a aVar = (ru.rt.ebs.cryptosdk.core.metadata.data.system.location.a) this.c;
        aVar.w = new uk10(this);
        aVar.d();
    }

    @Override // ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController
    public void stopLocationTracker() {
        ((ru.rt.ebs.cryptosdk.core.metadata.data.system.location.a) this.c).e();
    }

    public int t(int i) {
        z910 n = n();
        LayoutNode layoutNode = (LayoutNode) this.b;
        return n.f((s) layoutNode.a0.e, layoutNode.j(), i);
    }

    public void u(dny dnyVar, String str) {
        onr0.b((onr0) this.c, null, dnyVar != null ? a.X(d(dnyVar), ",", null, null, null, 62) : null, str, dnyVar != null ? dnyVar.w : null, dnyVar != null ? dnyVar.v : null, 97);
    }

    public void v(String str, ImageDownloadReporter$Status imageDownloadReporter$Status) {
        Handler handler;
        w53 w53Var = (w53) this.b;
        l9v l9vVar = (l9v) w53Var.get(str);
        if (l9vVar == null) {
            h2t h2tVar = new h2t();
            h2tVar.a = new LinkedList();
            l9vVar = new l9v(str, h2tVar);
            w53Var.put(str, l9vVar);
        }
        wjm wjmVar = (wjm) this.c;
        LinkedList linkedList = (LinkedList) l9vVar.b.a;
        if (imageDownloadReporter$Status == ImageDownloadReporter$Status.FAILED || imageDownloadReporter$Status == ImageDownloadReporter$Status.SUCCEED_FROM_NETWORK) {
            u3c.a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            linkedList.add(Long.valueOf(currentTimeMillis));
            long j = currentTimeMillis - 60000;
            while (!linkedList.isEmpty() && ((Long) linkedList.peek()).longValue() < j) {
                linkedList.poll();
            }
            r4 = linkedList.size() >= 7;
            if (r4) {
                linkedList.clear();
            }
        }
        boolean z = r4;
        if (z) {
            String str2 = l9vVar.a;
            u3c.a.getClass();
            long currentTimeMillis2 = 43200000 + System.currentTimeMillis();
            ((ConcurrentHashMap) wjmVar.c).put(str2, Long.valueOf(currentTimeMillis2));
            if (!((AtomicBoolean) wjmVar.w).get() || (handler = (Handler) wjmVar.x) == null) {
                z83.j("Attempted to ban url before initializing banhammer");
            } else {
                handler.post(new kx6(wjmVar, str2, currentTimeMillis2, 4));
            }
        }
        if (z) {
            w53Var.remove(str);
        }
    }

    @Override // defpackage.xie
    public boolean verify(byte[] bArr) {
        try {
            i3 z = i3.z(bArr);
            boolean z2 = false;
            for (int i = 0; i != z.size(); i++) {
                Signature signature = ((Signature[]) this.b)[i];
                if (signature != null && !signature.verify(s1.y(z.A(i)).x())) {
                    z2 = true;
                }
            }
            return !z2;
        } catch (SignatureException e) {
            throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
        }
    }

    public void w(dny dnyVar, String str) {
        onr0.c((onr0) this.c, null, dnyVar != null ? a.X(d(dnyVar), ",", null, null, null, 62) : null, str, dnyVar != null ? dnyVar.w : null, dnyVar != null ? dnyVar.v : null, 69);
    }

    public void x(dny dnyVar, String str) {
        onr0.a((onr0) this.c, null, dnyVar != null ? a.X(d(dnyVar), ",", null, null, null, 62) : null, str, dnyVar != null ? dnyVar.w : null, dnyVar != null ? dnyVar.v : null, 195);
    }

    public void y(Object obj, Object obj2) {
        ((mzz) this.b).d(obj, obj2);
        ((ConcurrentHashMap) this.c).put(obj, new WeakReference(obj2));
    }

    public void z(z910 z910Var) {
        ((oz40) this.c).setValue(z910Var);
    }

    public /* synthetic */ c9v(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ c9v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public c9v(ht10 ht10Var, ru.rt.ebs.cryptosdk.core.metadata.data.system.location.a aVar, nwk0 nwk0Var) {
        this.a = 26;
        this.b = ht10Var;
        this.c = aVar;
    }

    public c9v(pey peyVar, sey seyVar, wtr wtrVar) {
        this.a = 22;
        this.b = seyVar;
        this.c = wtrVar;
    }

    public c9v(int i) {
        this.a = 23;
        this.b = new mzz(i);
        this.c = new ConcurrentHashMap();
    }

    public c9v(m6a0 m6a0Var, n6a0 n6a0Var) {
        this.a = 18;
        this.b = n6a0Var;
        this.c = bvf0.c(m6a0Var);
    }

    public c9v(Context context, zoy0 zoy0Var, uya0 uya0Var, jzz jzzVar) {
        this.a = 29;
        this.b = context;
        this.c = uya0Var;
    }

    public c9v(MessengerWebView messengerWebView, jm3 jm3Var, MessengerParams messengerParams) {
        this.a = 6;
        this.b = messengerWebView;
        this.c = new Handler(Looper.getMainLooper());
    }

    public c9v(h2t h2tVar) {
        this.a = 7;
        this.c = h2tVar;
        this.b = new HashMap();
    }

    public c9v(wjm wjmVar) {
        this.a = 1;
        this.b = new w53(64);
        this.c = wjmVar;
    }

    public c9v(LayoutNode layoutNode, z910 z910Var) {
        this.a = 3;
        this.b = layoutNode;
        this.c = f.j(z910Var);
    }

    public /* synthetic */ c9v(byte b, int i) {
        this.a = i;
    }

    public c9v(wey weyVar, FragmentManager fragmentManager) {
        this.a = 10;
        this.c = weyVar;
        this.b = fragmentManager;
    }

    public c9v(p5y p5yVar) {
        this.a = 9;
        this.b = p5yVar;
        this.c = kp60.a();
    }
}

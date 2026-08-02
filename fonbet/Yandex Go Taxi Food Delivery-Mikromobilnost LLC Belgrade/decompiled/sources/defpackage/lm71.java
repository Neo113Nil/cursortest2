package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.measurement.internal.g;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.vendor_api.google.GmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3;
import yads.tp0;
import yads.zm0;
import yads.zu0;

/* loaded from: classes7.dex */
public final class lm71 implements ap71, wb71, q481, av81, muy, d25, oy81, s191, usb1, qua1, vv4, z4z0, ewb1 {
    public final /* synthetic */ int a;
    public final Object b;

    public lm71(Context context, ge71 ge71Var) {
        this.a = 0;
        this.b = new vmn0(context.getApplicationContext(), ge71Var, 19);
    }

    public static String q(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            String optString = jSONObject.optString(str);
            if (optString != null && optString.length() != 0 && !optString.equals("null")) {
                return optString;
            }
            yx61.e("Native Ad json has not required attributes");
        }
        return null;
    }

    @Override // defpackage.wb71
    public void a(Map map) {
        z4m0 z4m0Var = (z4m0) this.b;
        ((v881) z4m0Var.c).b.putAll(map);
        cf71 cf71Var = (cf71) z4m0Var.w;
        o081 o081Var = (o081) cf71Var.c;
        if (o081Var != null) {
            for (uy71 uy71Var : ((se71) cf71Var.b).b) {
                i281 a = o081Var.a(uy71Var);
                if (a instanceof ny71) {
                    ((ny71) a).b(uy71Var.c);
                }
            }
        }
        Iterator it = ((CopyOnWriteArraySet) z4m0Var.A).iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    @Override // defpackage.q481
    public void b(dl61 dl61Var) {
        oj61 oj61Var = (oj61) this.b;
        if (oj61Var.r) {
            return;
        }
        oj61Var.p = null;
        oj61Var.q = null;
        oj61Var.a.h(dl61Var);
    }

    @Override // defpackage.q481
    public void c(hk61 hk61Var) {
        oj61 oj61Var = (oj61) this.b;
        if (oj61Var.r) {
            return;
        }
        oj61Var.q = hk61Var;
        oj61Var.h.post(new nj61(oj61Var, 1));
    }

    @Override // defpackage.usb1
    public Object d(Object obj) {
        zzvd zzvdVar = (zzvd) obj;
        zzvdVar.zzb();
        zzvdVar.zza();
        Matrix matrix = (Matrix) this.b;
        gjy0 gjy0Var = new gjy0(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
        l.a(zzvdVar.zzg(), new p391(matrix, 1));
        return gjy0Var;
    }

    @Override // defpackage.muy
    public void e(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 17:
                ModuleInstallStatusUpdate moduleInstallStatusUpdate = (ModuleInstallStatusUpdate) obj2;
                ykt yktVar = (ykt) ((d3w) obj);
                ag70 ag70Var = yktVar.c;
                GmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3 gmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3 = yktVar.b;
                int installState = moduleInstallStatusUpdate.getInstallState();
                if (installState == 3) {
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3.invoke(new RuntimeException("Downloading of " + ag70Var + " is canceled"));
                    break;
                } else if (installState == 4) {
                    yktVar.a.invoke(zy11.a);
                    break;
                } else if (installState == 5) {
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3.invoke(new RuntimeException("Failed to download " + ag70Var + " with code " + moduleInstallStatusUpdate.getErrorCode()));
                    break;
                }
                break;
            default:
                ((nut) obj).a.invoke((Location) obj2);
                break;
        }
    }

    @Override // defpackage.vv4
    public int f() {
        return ((zzu) this.b).zzd;
    }

    @Override // defpackage.oy81
    public void g(int i) {
        px81 px81Var = (px81) this.b;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            if (px81Var.E) {
                px81Var.E = false;
                px81Var.b.g(i);
                px81Var.D = null;
                px81Var.C = null;
            } else {
                px81Var.E = true;
                px81Var.w.onConnectionSuspended(i);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.vv4
    public int getFormat() {
        return ((zzu) this.b).zza;
    }

    @Override // defpackage.vv4
    public byte[] h() {
        return ((zzu) this.b).zzo;
    }

    @Override // defpackage.qua1
    public void i(int i, Throwable th, byte[] bArr) {
        y1a1 y1a1Var;
        y1a1 y1a1Var2;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        int i2 = i;
        g gVar = (g) this.b;
        y1a1 y1a1Var3 = gVar.y;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            g.g(y1a1Var3);
            y1a1Var3.C.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        if (th == null) {
            o5a1 o5a1Var = gVar.x;
            g.e(o5a1Var);
            o5a1Var.N.b(true);
            if (bArr == null || bArr.length == 0) {
                g.g(y1a1Var3);
                y1a1Var3.G.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(Constants.DEEPLINK, "");
                if (TextUtils.isEmpty(optString)) {
                    g.g(y1a1Var3);
                    y1a1Var3.G.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble(ClidProvider.TIMESTAMP, 0.0d);
                Bundle bundle2 = new Bundle();
                ieb1 ieb1Var = gVar.B;
                g.e(ieb1Var);
                g gVar2 = (g) ieb1Var.b;
                if (TextUtils.isEmpty(optString)) {
                    y1a1Var2 = y1a1Var3;
                } else {
                    Context context = gVar2.a;
                    y1a1Var2 = y1a1Var3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle2.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle2.putString("gad_source", optString4);
                            }
                            bundle2.putString("gclid", optString2);
                            bundle2.putString("_cis", "ddp");
                            gVar.F.Ng("auto", "_cmp", bundle2);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString(Constants.DEEPLINK, optString);
                                edit.putLong(ClidProvider.TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = gVar2.a;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    }
                                    makeBasic = BroadcastOptions.makeBasic();
                                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                    bundle = shareIdentityEnabled.toBundle();
                                    context2.sendBroadcast(intent, null, bundle);
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                y1a1 y1a1Var4 = ((g) ieb1Var.b).y;
                                g.g(y1a1Var4);
                                y1a1Var4.z.b(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        y1a1Var = y1a1Var2;
                        g.g(y1a1Var);
                        y1a1Var.z.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                g.g(y1a1Var2);
                y1a1Var = y1a1Var2;
                try {
                    y1a1Var.C.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    g.g(y1a1Var);
                    y1a1Var.z.b(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                y1a1Var = y1a1Var3;
            }
        }
        g.g(y1a1Var3);
        y1a1Var3.C.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    @Override // defpackage.oy81
    public void j(Bundle bundle) {
        px81 px81Var = (px81) this.b;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            px81Var.D = ConnectionResult.RESULT_SUCCESS;
            px81.j(px81Var);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.vv4
    public Rect k() {
        zzu zzuVar = (zzu) this.b;
        if (zzuVar.zze == null) {
            return null;
        }
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i >= pointArr.length) {
                return new Rect(i3, i4, i2, i5);
            }
            Point point = pointArr[i];
            i3 = Math.min(i3, point.x);
            i2 = Math.max(i2, point.x);
            i4 = Math.min(i4, point.y);
            i5 = Math.max(i5, point.y);
            i++;
        }
    }

    @Override // defpackage.wb71
    public void l(Bitmap bitmap, String str) {
    }

    @Override // defpackage.vv4
    public String m() {
        return ((zzu) this.b).zzb;
    }

    @Override // defpackage.vv4
    public Point[] n() {
        return ((zzu) this.b).zze;
    }

    @Override // defpackage.oy81
    public void o(ConnectionResult connectionResult) {
        px81 px81Var = (px81) this.b;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            px81Var.D = connectionResult;
            px81.j(px81Var);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface p(zu0 zu0Var) {
        Typeface typeface;
        ConcurrentHashMap concurrentHashMap = tq71.a;
        Typeface typeface2 = (Typeface) concurrentHashMap.get(zu0Var);
        if (typeface2 != null) {
            return typeface2;
        }
        File b = ((yz71) this.b).b(zu0Var);
        if (b.exists() && yz71.a(b)) {
            try {
                typeface = Typeface.createFromFile(b);
            } catch (Throwable unused) {
                b.delete();
            }
            if (typeface != null) {
                return null;
            }
            concurrentHashMap.put(zu0Var, typeface);
            return typeface;
        }
        b.delete();
        typeface = null;
        if (typeface != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.builders.SetBuilder] */
    public fj71 r(JSONObject jSONObject, zy2 zy2Var) {
        tp0 tp0Var;
        ArrayList arrayList;
        ?? r0;
        Object failure;
        JSONArray jSONArray;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                vmn0 vmn0Var = (vmn0) this.b;
                vmn0Var.getClass();
                sh81 sh81Var = (sh81) vmn0Var.b;
                String optString = jSONObject2.optString("type");
                if (optString == null || optString.length() == 0 || optString.equals("null")) {
                    yx61.e("Native Ad json has not required attributes");
                    return null;
                }
                Map map = (Map) vmn0Var.y;
                if (map == null) {
                    hb81 hb81Var = (hb81) vmn0Var.c;
                    jSONArray = optJSONArray;
                    map = b.i(new Pair("adtune", new tc71(sh81Var, hb81Var)), new Pair("divkit_adtune", new pi81((pp61) vmn0Var.w, (fp71) vmn0Var.x, hb81Var, zy2Var.b)), new Pair("close", new o681()), new Pair(Constants.DEEPLINK, new jh61((Context) vmn0Var.a, sh81Var)));
                    vmn0Var.y = map;
                } else {
                    jSONArray = optJSONArray;
                }
                gu71 gu71Var = (gu71) map.get(optString);
                if (gu71Var != null) {
                    arrayList2.add(gu71Var.a(jSONObject2));
                }
                i++;
                optJSONArray = jSONArray;
            }
            tp0Var = null;
            arrayList = arrayList2;
        } else {
            tp0Var = null;
            arrayList = null;
        }
        String q = q("falseClickUrl", jSONObject);
        tp0 tp0Var2 = q != null ? new tp0(q, jSONObject.optLong("falseClickInterval", 0L)) : tp0Var;
        ?? setBuilder = new SetBuilder();
        String q2 = q("trackingUrl", jSONObject);
        if (q2 != null) {
            setBuilder.add(q2);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (optJSONArray2 != null) {
            ListBuilder a = rcc.a();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    failure = optJSONArray2.getString(i2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    a.add((String) failure);
                }
            }
            r0 = a.j();
        } else {
            r0 = tp0Var;
        }
        if (r0 != 0) {
            setBuilder.addAll(r0);
        }
        return new fj71(arrayList, tp0Var2, a.J0(setBuilder.b()), q("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }

    public void s() {
        ((jy81) this.b).F.zar.post(new h3s0(22, this));
    }

    @Override // defpackage.ewb1
    public void zza() {
        c491 c491Var = (c491) this.b;
        c491Var.b("split-install-errors", new sl81(c491Var));
    }

    public lm71(TileOverlayOptions tileOverlayOptions) {
        zzaj zzajVar;
        this.a = 27;
        zzajVar = tileOverlayOptions.zza;
        this.b = zzajVar;
    }

    public lm71(dg61 dg61Var) {
        this.a = 2;
        this.b = new WeakReference(dg61Var);
    }

    public lm71(Context context) {
        this.a = 3;
        this.b = new yz71(context.getApplicationContext());
    }

    public /* synthetic */ lm71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public lm71(Context context, sh81 sh81Var) {
        this.a = 4;
        this.b = new hn71(context, sh81Var);
    }

    @Override // defpackage.ap71
    public void a() {
        ((jn71) ((cf71) this.b).b).f(new zm0(3, null, "Video load error occurred", 1001, null, -1, null, 4, false));
    }

    @Override // defpackage.av81
    public void a(zl61 zl61Var, long j, long j2) {
        boolean z;
        synchronized (oaa1.b) {
            z = oaa1.c;
        }
        com.monetization.ads.exo.source.dash.a aVar = (com.monetization.ads.exo.source.dash.a) this.b;
        if (!z) {
            aVar.a.a(new IOException(new ConcurrentModificationException()));
        } else {
            aVar.a();
        }
    }

    @Override // defpackage.s191
    public Object a(JSONObject jSONObject) {
        cu81 cu81Var = null;
        if (jSONObject.has("value")) {
            if (!jSONObject.isNull("value")) {
                yk61 yk61Var = (yk61) this.b;
                if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                    cu81Var = yk61Var.a.a(jSONObject.getJSONObject("value"));
                } else {
                    yx61.e("Native Ad json has not required attributes");
                    return null;
                }
            }
            return new gt81(cu81Var);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }

    @Override // defpackage.av81
    public void a(zl61 zl61Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.av81
    public m191 a(zl61 zl61Var, long j, long j2, IOException iOException, int i) {
        ((com.monetization.ads.exo.source.dash.a) this.b).a.a(iOException);
        return t671.d;
    }
}

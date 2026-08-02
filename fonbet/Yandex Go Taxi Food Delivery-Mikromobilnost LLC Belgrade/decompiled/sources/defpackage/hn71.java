package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.internal.identity.e;
import com.google.android.gms.internal.identity.zzv;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzb;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.banner.c;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.cb0;
import yads.cu;
import yads.jg0;
import yads.mp1;
import yads.pf1;
import yads.pf3;
import yads.q63;
import yads.qp1;
import yads.ro1;
import yads.t52;
import yads.tp0;
import yads.w4;
import yads.xp2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class hn71 implements ql61, ul81, vj81, jm81, u571, hw71, fx71, pui0, ek91 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public hn71(Context context, int i) {
        this.a = i;
        switch (i) {
            case 11:
                qd71 qd71Var = jg0.d == new pm71().a(context.getApplicationContext()) ? new qd71(1920, 1080, 6800) : new qd71(854, 480, 1000);
                i971 i971Var = new i971(16, qd71Var);
                this.b = qd71Var;
                this.c = i971Var;
                break;
            case 19:
                lv71 lv71Var = new lv71();
                this.b = context.getApplicationContext();
                this.c = lv71Var;
                break;
            case 23:
                pf1 a = s881.a(context, "FalseClickDataStorage");
                om81 om81Var = new om81();
                this.b = a;
                this.c = om81Var;
                break;
            case 24:
                hlx0 hlx0Var = new hlx0(context, 28);
                cr71 cr71Var = new cr71(context, 2);
                this.b = hlx0Var;
                this.c = cr71Var;
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                this.c = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.u571
    public u871 a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 14:
                return new g381((String) obj, new k571(), (SSLSocketFactory) this.c);
            default:
                return new so81((Context) obj, ((u571) this.c).a());
        }
    }

    @Override // defpackage.pui0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        atx0 atx0Var = (atx0) obj2;
        switch (i) {
            case 27:
                zm2 zm2Var = y591.k;
                r591 r591Var = new r591(0, atx0Var);
                PendingIntent pendingIntent = (PendingIntent) this.c;
                cvw.m(pendingIntent, "PendingIntent must be specified.");
                StatusCallback statusCallback = new StatusCallback(r591Var);
                ((zzv) ((cx91) obj).i()).zzi((zzb) obj3, pendingIntent, statusCallback);
                break;
            default:
                zm2 zm2Var2 = k991.k;
                ((e) obj).t((kzo) obj3, (LocationRequest) this.c, atx0Var);
                break;
        }
    }

    @Override // defpackage.vj81
    public void b(fj71 fj71Var, jq81 jq81Var) {
        t52 t52Var = (t52) this.b;
        cu cuVar = new cu(t52Var.getContext(), new pf3(fj71Var, jq81Var, (k781) this.c));
        t52Var.setOnTouchListener(cuVar);
        t52Var.setOnClickListener(cuVar);
        ImageView imageView = t52Var.a.b;
        if (imageView != null) {
            imageView.setOnTouchListener(cuVar);
            imageView.setOnClickListener(cuVar);
        }
    }

    @Override // defpackage.fx71
    public void c(w4 w4Var) {
        switch (this.a) {
            case 20:
                ((Handler) this.c).post(new hos0(12, this, w4Var));
                break;
            default:
                ((Handler) this.c).post(new hos0(14, this, w4Var));
                break;
        }
    }

    @Override // defpackage.hw71
    public ct71 d(Context context, j471 j471Var, bq71 bq71Var) {
        return new c(context, j471Var, bq71Var, (d881) this.b, (qp1) this.c);
    }

    @Override // defpackage.ek91
    public void e(ouy ouyVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fx71
    public void f() {
        switch (this.a) {
            case 20:
                ((Handler) this.c).post(new p881(4, this));
                break;
            default:
                ((Handler) this.c).post(new p881(6, this));
                break;
        }
    }

    @Override // defpackage.fx71
    public void g() {
        switch (this.a) {
            case 20:
                ((Handler) this.c).post(new hos0(11, this));
                break;
            default:
                ((Handler) this.c).post(new hos0(13, this));
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:10|(5:12|(4:15|(4:17|18|(5:20|21|22|23|(2:28|(1:33)(1:32))(1:27))|(3:37|38|39)(1:41))(1:42)|40|13)|43|44|(20:46|47|48|49|50|(1:52)|53|(2:54|(2:56|(1:58)(1:78))(2:79|80))|59|(1:61)|62|(1:64)(1:77)|65|66|(1:68)(1:76)|69|(1:75)|71|72|73))|84|47|48|49|50|(0)|53|(3:54|(0)(0)|78)|59|(0)|62|(0)(0)|65|66|(0)(0)|69|(0)|71|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c0, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ms71 h(JSONObject jSONObject) {
        MapBuilder mapBuilder;
        Object failure;
        Iterator<E> it;
        Object obj;
        cb0 cb0Var;
        String b;
        String optString;
        Object obj2;
        JSONObject jSONObject2 = jSONObject.has("deeplinkLaunchParams") ? jSONObject.getJSONObject("deeplinkLaunchParams") : jSONObject;
        String optString2 = jSONObject2.optString("package");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject("extras");
        nr41 nr41Var = (nr41) this.c;
        nr41Var.getClass();
        if (optJSONObject != null) {
            MapBuilder mapBuilder2 = new MapBuilder();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!optJSONObject.isNull(next)) {
                    Object obj3 = optJSONObject.get(next);
                    if (obj3 instanceof JSONObject) {
                        cf71 cf71Var = (cf71) nr41Var.b;
                        JSONObject jSONObject3 = (JSONObject) obj3;
                        String optString3 = jSONObject3.optString("type");
                        try {
                            obj2 = jSONObject3.get("value");
                        } catch (JSONException unused) {
                            obj2 = null;
                        }
                        obj3 = (jl40.l(optString3, "parcelable") && jl40.l(obj2, "null")) ? sz71.a : (jl40.l(optString3, "intent") && (obj2 instanceof JSONObject)) ? new fq71((Context) cf71Var.b, ((hn71) cf71Var.c).h((JSONObject) obj2)) : null;
                    }
                    if (obj3 != null) {
                        mapBuilder2.put(next, obj3);
                    }
                }
            }
            MapBuilder j = mapBuilder2.j();
            if (!j.isEmpty()) {
                mapBuilder = j;
                failure = Integer.valueOf(jSONObject2.getInt("flags"));
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Integer num = (Integer) failure;
                String b2 = cea1.b("launchMode", jSONObject2);
                cb0.b.getClass();
                it = cb0.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (cvu0.t(((cb0) obj).name(), b2, true)) {
                        break;
                    }
                }
                cb0Var = (cb0) obj;
                if (cb0Var == null) {
                    cb0Var = cb0.c;
                }
                b = cea1.b("className", jSONObject2);
                if (b != null) {
                    ((sh81) this.b).getClass();
                    optString = sh81.a("url", jSONObject);
                } else {
                    optString = jSONObject.optString("url");
                }
                String str = optString;
                String b3 = cea1.b("deeplinkType", jSONObject);
                JSONArray optJSONArray = jSONObject.optJSONArray("trackingUrls");
                ListBuilder a = optJSONArray != null ? null : w781.a(optJSONArray);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("fallbackTrackingUrls");
                return new ms71(optString2, str, mapBuilder, num, cb0Var, a, optJSONArray2 != null ? w781.a(optJSONArray2) : null, b3, b);
            }
        }
        mapBuilder = null;
        failure = Integer.valueOf(jSONObject2.getInt("flags"));
        if (failure instanceof Result.Failure) {
        }
        Integer num2 = (Integer) failure;
        String b22 = cea1.b("launchMode", jSONObject2);
        cb0.b.getClass();
        it = cb0.f.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        cb0Var = (cb0) obj;
        if (cb0Var == null) {
        }
        b = cea1.b("className", jSONObject2);
        if (b != null) {
        }
        String str2 = optString;
        String b32 = cea1.b("deeplinkType", jSONObject);
        JSONArray optJSONArray3 = jSONObject.optJSONArray("trackingUrls");
        if (optJSONArray3 != null) {
        }
        JSONArray optJSONArray22 = jSONObject.optJSONArray("fallbackTrackingUrls");
        return new ms71(optString2, str2, mapBuilder, num2, cb0Var, a, optJSONArray22 != null ? w781.a(optJSONArray22) : null, b32, b);
    }

    @Override // defpackage.fx71
    public void i() {
        switch (this.a) {
            case 20:
                ((Handler) this.c).post(new hos0(11, this));
                break;
            default:
                ((Handler) this.c).post(new hos0(13, this));
                break;
        }
    }

    public void j(Object obj, String str) {
        if (obj != null) {
            ((Map) this.b).put(str, obj);
        }
    }

    public void k(LinkedHashMap linkedHashMap, gg81 gg81Var) {
        if (gg81Var == null || !gg81Var.z0) {
            return;
        }
        fe81 fe81Var = (fe81) this.b;
        Pair pair = new Pair("ad_type", fe81Var.a.b);
        String str = fe81Var.c.a;
        if (str == null) {
            str = "";
        }
        ((ge71) this.c).c(new zj71("tracking_event", new LinkedHashMap(b.n(b.i(pair, new Pair("ad_unit_id", str)), linkedHashMap)), (no61) null));
    }

    public void l(List list, b081 b081Var, Map map) {
        ((l681) this.c).getClass();
        LinkedHashMap n = b.n(gw00.e(new Pair("{CLICK_DEST}", n381.a(b081Var))), map);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((pb81) this.b).a((String) it.next(), q63.c, n);
            }
        }
    }

    public void m(h881 h881Var) {
        synchronized (h881Var) {
        }
        ((Handler) this.b).post(new fe71(15, this, h881Var));
    }

    @Override // defpackage.ul81
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public rn7 a(si81 si81Var) {
        MediaCodec mediaCodec;
        String str = si81Var.a.a;
        rn7 rn7Var = null;
        try {
            dda1.i("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                rn7 rn7Var2 = new rn7(mediaCodec, (HandlerThread) ((j281) this.b).get(), (HandlerThread) ((j281) this.c).get());
                try {
                    dda1.h();
                    rn7Var2.f(si81Var.b, si81Var.d);
                    return rn7Var2;
                } catch (Exception e) {
                    e = e;
                    rn7Var = rn7Var2;
                    if (rn7Var != null) {
                        rn7Var.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }

    public void o(Exception exc) {
        ((Handler) this.b).post(new x191(this, exc, 6));
    }

    @Override // defpackage.jm81
    public boolean p(zp1 zp1Var, Class cls) {
        xp2 xp2Var = zp1Var.i;
        return xp2Var != null && xp2Var.b == mp1.e && MediatedBannerAdapter.class.isAssignableFrom(cls);
    }

    @Override // defpackage.jm81
    public a q(Context context, zp1 zp1Var) {
        MediatedNativeAdapter mediatedNativeAdapter = (MediatedNativeAdapter) ((rr41) this.b).i(context, zp1Var, MediatedNativeAdapter.class);
        if (mediatedNativeAdapter == null) {
            return null;
        }
        return new ro1(mediatedNativeAdapter, (ag81) this.c);
    }

    public void r(Object obj, String str) {
        Map map = (Map) this.b;
        if (obj == null) {
            map.put(str, StringUtils.UNDEFINED);
        } else {
            map.put(str, obj);
        }
    }

    @Override // defpackage.ek91
    public ouy zza() {
        return (ouy) this.b;
    }

    @Override // defpackage.ek91
    public void zzc() {
        ((atx0) this.c).c(null);
    }

    @Override // defpackage.ql61
    public Object a(Uri uri, ef71 ef71Var) {
        dh81 dh81Var = (dh81) ((tn81) this.b).a(uri, ef71Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? dh81Var : dh81Var.b(list);
    }

    public hn71(int i) {
        this.a = 9;
        j281 j281Var = new j281(i, 0);
        j281 j281Var2 = new j281(i, 1);
        this.b = j281Var;
        this.c = j281Var2;
    }

    public hn71(mf1 mf1Var) {
        db81 db81Var;
        this.a = 15;
        db81 db81Var2 = db81.d;
        if (db81Var2 == null) {
            synchronized (db81.c) {
                db81Var = db81.d;
                if (db81Var == null) {
                    db81Var = new db81();
                    db81.d = db81Var;
                }
            }
            db81Var2 = db81Var;
        }
        this.b = mf1Var;
        this.c = db81Var2;
    }

    public /* synthetic */ hn71(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public hn71(Context context, om71 om71Var) {
        p171 p171Var;
        this.a = 18;
        um81 um81Var = new um81(context, om71Var);
        p171 p171Var2 = p171.c;
        if (p171Var2 == null) {
            synchronized (p171.b) {
                p171Var = p171.c;
                if (p171Var == null) {
                    p171Var = new p171();
                    p171.c = p171Var;
                }
            }
            p171Var2 = p171Var;
        }
        this.b = um81Var;
        this.c = p171Var2;
    }

    public hn71(Context context, fe81 fe81Var, v981 v981Var) {
        this.a = 2;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        this.b = fe81Var;
        this.c = b;
    }

    public hn71(Context context, sh81 sh81Var) {
        this.a = 7;
        this.b = sh81Var;
        this.c = new nr41(context, this);
    }

    public hn71(ge71 ge71Var) {
        this.a = 3;
        o021 o021Var = new o021(ge71Var);
        ez71 ez71Var = new ez71();
        this.b = o021Var;
        this.c = ez71Var;
    }

    public hn71(cf71 cf71Var) {
        this.a = 20;
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = cf71Var;
        this.c = handler;
    }

    public hn71(cf71 cf71Var, byte b) {
        this.a = 22;
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = cf71Var;
        this.c = handler;
    }

    public hn71(List list) {
        this.a = 4;
        this.b = list;
    }

    public hn71(Map map, no61 no61Var) {
        this.a = 0;
        map = ym11.h(map) ? map : null;
        this.b = map == null ? new LinkedHashMap() : map;
        this.c = no61Var;
    }

    public hn71(ww71 ww71Var) {
        this.a = 25;
        kx71 kx71Var = new kx71();
        this.b = ww71Var;
        this.c = kx71Var;
    }

    public hn71(pb81 pb81Var) {
        this.a = 8;
        l681 l681Var = new l681();
        this.b = pb81Var;
        this.c = l681Var;
    }

    public hn71(fe81 fe81Var, v981 v981Var) {
        this.a = 21;
        vi71 vi71Var = new vi71(fe81Var, v981Var);
        this.b = v981Var;
        this.c = vi71Var;
    }

    public hn71(tp0 tp0Var, ArrayList arrayList, au2 au2Var) {
        this.a = 17;
        this.b = arrayList;
        this.c = au2Var;
    }

    public hn71(Context context, hn71 hn71Var) {
        this.a = 19;
        this.b = context.getApplicationContext();
        this.c = hn71Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    public /* synthetic */ hn71(int i, HashMap hashMap) {
        this((i & 1) != 0 ? b.f() : hashMap, (no61) null);
        this.a = 0;
    }
}

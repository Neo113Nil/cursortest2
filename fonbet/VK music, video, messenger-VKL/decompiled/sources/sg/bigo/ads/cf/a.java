package sg.bigo.ads.cf;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.n;
import sg.bigo.ads.an.o;
import sg.bigo.ads.common.utils.l;
import xsna.bd3;

/* loaded from: classes9.dex */
public final class a extends sg.bigo.ads.an.e {
    boolean a;
    boolean b;
    String c;
    public final sg.bigo.ads.cg.c g;
    public final sg.bigo.ads.cg.b h;
    public final sg.bigo.ads.cg.b i;
    final sg.bigo.ads.cg.f j;
    final sg.bigo.ads.cg.e k;
    public final sg.bigo.ads.cg.h l;
    public final sg.bigo.ads.cg.d m;
    private int n;
    private boolean o;

    public a(@NonNull Context context, sg.bigo.ads.ai.j jVar) {
        super(context);
        this.g = new sg.bigo.ads.cg.c(sg.bigo.ads.b.a());
        this.h = new sg.bigo.ads.cg.b(sg.bigo.ads.b.b(), "");
        this.i = new sg.bigo.ads.cg.b(sg.bigo.ads.b.c(), "");
        this.j = new sg.bigo.ads.cg.f();
        this.k = new sg.bigo.ads.cg.e();
        this.l = new sg.bigo.ads.cg.h();
        this.m = new sg.bigo.ads.cg.d(jVar);
        this.c = "SDK";
        this.o = false;
    }

    @Override // sg.bigo.ads.an.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @Override // sg.bigo.ads.an.e
    public final String b() {
        return "AntiBanConfig";
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    private static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        if (n.a(parcel, 4) < 4) {
            return;
        }
        this.n = n.a(parcel, 0);
        this.a = n.b(parcel, false);
        this.b = n.b(parcel, false);
        this.c = n.a(parcel, "SDK");
        n.b(parcel, this.g);
        n.b(parcel, this.h);
        n.b(parcel, this.i);
        n.b(parcel, this.j);
        n.b(parcel, this.k);
        n.b(parcel, this.l);
        n.b(parcel, this.m);
        this.o = n.b(parcel, true);
    }

    @NonNull
    public final g a(String str, String str2, Map<String, String> map, String str3, int i) {
        if (TextUtils.isEmpty(str)) {
            return g.a("", false, 4003, "config content is empty");
        }
        String trim = str.trim();
        boolean startsWith = trim.startsWith("{");
        final ArrayList arrayList = new ArrayList();
        if (!startsWith) {
            trim = sg.bigo.ads.bc.a.a(trim, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", new ValueCallback<Exception>() { // from class: sg.bigo.ads.cf.a.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Exception exc) {
                    Exception exc2 = exc;
                    if (exc2 != null) {
                        arrayList.add(exc2);
                    }
                }
            });
            if (TextUtils.isEmpty(trim)) {
                sg.bigo.ads.bn.a.a(0, "AntiBanUtils", "decrypt error, decrypted content is empty.");
                trim = null;
            }
        }
        String str4 = trim;
        if (!l.a((Collection) arrayList)) {
            this.b = true;
            return g.a(str4, startsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int optInt = jSONObject.optInt("version", 0);
            int i2 = this.n;
            if (!(optInt < i2 ? false : optInt == i2 ? this.o : true)) {
                return new g(str4, false, startsWith, 0, bd3.b(", remote version is ", this.n, optInt, new StringBuilder("local config version is ")));
            }
            boolean z = optInt == i2;
            this.n = optInt;
            this.a = startsWith;
            this.c = str2;
            this.g.a(a(jSONObject.optJSONObject("cfg_svr")), z, str3, i);
            this.h.a(a(jSONObject.optJSONObject("report_svr")), z, str3, i);
            this.i.a(a(jSONObject.optJSONObject("ad_svr")), z, str3, i);
            if (!z) {
                this.j.a(a(jSONObject.optJSONObject("third_pay_svr")));
                this.k.a(a(jSONObject.optJSONObject("third_free_svr")));
                sg.bigo.ads.cg.h hVar = this.l;
                JSONObject a = a(jSONObject.optJSONObject("uri_opt_timeout"));
                synchronized (hVar) {
                    hVar.a = a.optLong("getsdkconfig", 0L) * 1000;
                    hVar.b = a.optLong("getuniad", 0L) * 1000;
                    hVar.c = a.optLong("unicallback", 0L) * 1000;
                    hVar.d = a.optLong("getuniconfig", 0L) * 1000;
                    hVar.e = a.optLong("reportunibaina", 0L) * 1000;
                }
                sg.bigo.ads.cg.d dVar = this.m;
                JSONObject a2 = a(jSONObject.optJSONObject("req_pool_size"));
                synchronized (dVar) {
                    dVar.a = a2.optInt("sdk_config", 3);
                    dVar.b = a2.optInt("report", 2);
                    dVar.c = a2.optInt("config_ad", 12);
                    dVar.d = a2.optInt("callback", 3);
                    dVar.e = a2.optInt("vast_wrapper", 3);
                    dVar.f = a2.optInt("tracker", 10);
                    dVar.g = a2.optInt("creative", 5);
                }
                if (!l.a(map)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.o = false;
            return new g(str4, startsWith);
        } catch (JSONException e) {
            return g.a(str4, startsWith, 4005, Log.getStackTraceString(e));
        }
    }

    @Override // sg.bigo.ads.an.e
    public final void a(Context context) {
        super.a(context);
        if (this.f) {
            try {
                new File(o.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(o.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(4);
        parcel.writeInt(this.n);
        n.a(parcel, this.a);
        n.a(parcel, this.b);
        parcel.writeString(this.c);
        n.a(parcel, this.g);
        n.a(parcel, this.h);
        n.a(parcel, this.i);
        n.a(parcel, this.j);
        n.a(parcel, this.k);
        n.a(parcel, this.l);
        n.a(parcel, this.m);
        n.a(parcel, this.o);
    }

    public final boolean a(@NonNull String str, @NonNull String str2) {
        return this.i.a(str, str2) | this.g.a(str, str2) | this.h.a(str, str2);
    }
}

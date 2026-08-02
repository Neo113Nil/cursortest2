package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.H;
import xsna.t7x0;

/* loaded from: classes11.dex */
public final class nrn0 {
    public final owu a;
    public final mwg0 b;

    public nrn0(owu owuVar, mwg0 mwg0Var) {
        this.a = owuVar;
        this.b = mwg0Var;
    }

    public final t7x0 a() {
        String str;
        String string;
        slv slvVar = (slv) this.a.a;
        String g = xqm0.g("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = ((SQLiteDatabase) slvVar.b.getValue()).rawQuery(g, new String[0]);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("uuid");
            int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
            while (rawQuery.moveToNext()) {
                arrayList.add(new swx(rawQuery.getString(columnIndexOrThrow), rawQuery.getBlob(columnIndexOrThrow2)));
            }
            s3q0 s3q0Var = s3q0.a;
            rawQuery.close();
            List<swx> O0 = j5g.O0(arrayList);
            new H(O0);
            ArrayList arrayList2 = new ArrayList(c5g.u(O0, 10));
            for (swx swxVar : O0) {
                String str2 = swxVar.a;
                JSONObject jSONObject = new JSONObject(brm0.u(swxVar.b));
                String string2 = jSONObject.getString("name");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    q2z.a(next, jSONObject2.get(next).toString(), arrayList3);
                }
                arrayList2.add(new crk(str2, new jl20(string2, jSONObject.getLong("time"), pn00.s(arrayList3))));
            }
            if (arrayList2.isEmpty()) {
                return t7x0.a.a;
            }
            mwg0 mwg0Var = this.b;
            String packageName = ((Context) mwg0Var.b.a).getPackageName();
            uey0 uey0Var = mwg0Var.a;
            HttpsURLConnection httpsURLConnection = null;
            String string3 = ((SharedPreferences) uey0Var.a.a).getString("USER_ID_KEY", null);
            if (string3 == null) {
                string3 = null;
            }
            if (string3 == null) {
                synchronized (uey0.b) {
                    string = ((SharedPreferences) uey0Var.a.a).getString("USER_ID_KEY", null);
                    if (string == null) {
                        string = null;
                    }
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor edit = ((SharedPreferences) uey0Var.a.a).edit();
                        edit.putString("USER_ID_KEY", string);
                        edit.apply();
                    }
                }
                str = string;
            } else {
                str = string3;
            }
            moy0 moy0Var = (moy0) mwg0Var.d.b.getValue();
            String str3 = moy0Var != null ? moy0Var.a : null;
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                crk crkVar = (crk) it.next();
                arrayList4.add(new l690(packageName, crkVar.a, str, str3, crkVar.b));
            }
            icz0 icz0Var = (icz0) mwg0Var.c.a;
            try {
                String a = icz0Var.a(arrayList4);
                HttpsURLConnection b = icz0Var.b();
                OutputStream outputStream = b.getOutputStream();
                try {
                    outputStream.write(a.getBytes(emb.b));
                    outputStream.flush();
                    s3q0 s3q0Var2 = s3q0.a;
                    outputStream.close();
                    try {
                        new ru.rustore.sdk.metrics.internal.q(b.getURL(), b.getResponseCode(), a, b.getRequestProperty("X-Metrics-Request-Time"));
                        b.disconnect();
                        return new t7x0.b(arrayList2);
                    } catch (Throwable th) {
                        th = th;
                        httpsURLConnection = b;
                        try {
                            new ru.rustore.sdk.metrics.internal.r(th);
                            throw new MetricsException.NetworkError("Http request was failed", th);
                        } catch (Throwable th2) {
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th2;
                        }
                    }
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
                new ru.rustore.sdk.metrics.internal.r(th);
                throw new MetricsException.NetworkError("Http request was failed", th);
            }
        } finally {
        }
    }
}

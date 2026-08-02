package xsna;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import xsna.f3q;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes.dex */
public final class ny8 {
    public Object a;

    public dsk a() {
        Context context = (Context) this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        dsk dskVar = new dsk();
        dskVar.b = d6o.a(f3q.a.a);
        p6x p6xVar = new p6x(context);
        dskVar.c = p6xVar;
        dskVar.d = d6o.a(new ji20(p6xVar, new jbk(p6xVar)));
        p6x p6xVar2 = dskVar.c;
        dskVar.e = new w8h0(p6xVar2);
        e9e0<String> a = d6o.a(new p0q(p6xVar2));
        dskVar.f = a;
        e9e0<oyg0> a2 = d6o.a(new pyg0(dskVar.e, a));
        dskVar.g = a2;
        k8h0 k8h0Var = new k8h0();
        p6x p6xVar3 = dskVar.c;
        l8h0 l8h0Var = new l8h0(p6xVar3, a2, k8h0Var);
        e9e0<Executor> e9e0Var = dskVar.b;
        e9e0 e9e0Var2 = dskVar.d;
        dskVar.h = d6o.a(new app0(new zll(e9e0Var, e9e0Var2, l8h0Var, a2, a2), new xdq0(p6xVar3, e9e0Var2, a2, l8h0Var, e9e0Var, a2, a2), new vvx0(e9e0Var, a2, l8h0Var, a2)));
        return dskVar;
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        Throwable th;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(fng.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        fng.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fng.b(fileInputStream, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                jSONObject = null;
            }
            fng.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            fng.b(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }
}

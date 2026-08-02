package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class hch implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ich b;

    public /* synthetic */ hch(ich ichVar, int i) {
        this.a = i;
        this.b = ichVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                ich ichVar = this.b;
                synchronized (ichVar) {
                    try {
                        xeu xeuVar = (xeu) ichVar.a.get();
                        ArrayList a = xeuVar.a();
                        synchronized (xeuVar) {
                            i = 0;
                            xeuVar.a.a(new weu(i, xeuVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i < a.size()) {
                            yeu yeuVar = (yeu) a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", yeuVar.c());
                            jSONObject.put("dates", new JSONArray((Collection) yeuVar.b()));
                            jSONArray.put(jSONObject);
                            i++;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                ich ichVar2 = this.b;
                synchronized (ichVar2) {
                    xeu xeuVar2 = (xeu) ichVar2.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = ((gnh) ichVar2.c.get()).a();
                    synchronized (xeuVar2) {
                        xeuVar2.a.a(new veu(xeuVar2, xeuVar2.b(currentTimeMillis), a2, new kme0(a2), 0));
                    }
                }
                return null;
        }
    }
}

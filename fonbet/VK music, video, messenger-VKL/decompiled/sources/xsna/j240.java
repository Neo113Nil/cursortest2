package xsna;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import org.json.JSONObject;

/* compiled from: MultiAccountIdImpl.kt */
/* loaded from: classes11.dex */
public final class j240 implements com.vk.superapp.multiaccount.api.c {
    public final ExecutorService b;
    public volatile h240 c = h240.d;

    public j240(ExecutorService executorService) {
        this.b = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    public static h240 d(h240 h240Var) {
        File file = new File(dgn0.d().getFilesDir(), "MultiAccountId.txt");
        try {
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeBytes(new JSONObject().put("id", h240Var.a).put("created", h240Var.b).put("sent", h240Var.c).toString());
                s3q0 s3q0Var = s3q0.a;
                dataOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            h240Var = new Result.Failure(th);
        }
        Throwable a = Result.a(h240Var);
        if (a != null) {
            xgx0.a.getClass();
            xgx0.d(a);
        }
        if (h240Var instanceof Result.Failure) {
            h240Var = null;
        }
        return h240Var;
    }

    @Override // com.vk.superapp.multiaccount.api.c
    public final void a(izs<? super h240, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        this.b.submit(new i240(this, izsVar, izsVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056 A[Catch: all -> 0x005f, TryCatch #2 {all -> 0x005f, blocks: (B:6:0x0050, B:8:0x0056, B:9:0x0061, B:12:0x0067, B:18:0x004a, B:5:0x0021), top: B:4:0x0021, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h240 b() {
        h240 h240Var;
        Throwable a;
        File file = new File(dgn0.d().getFilesDir(), "MultiAccountId.txt");
        h240 h240Var2 = null;
        if (file.exists()) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(i7o0.h(dataInputStream), emb.b));
                    h240Var = new h240(jSONObject.getString("id"), jSONObject.optLong("created"), jSONObject.optBoolean("sent"));
                } finally {
                    a = Result.a(h240Var);
                    if (a != null) {
                    }
                    if (h240Var instanceof Result.Failure) {
                    }
                    h240Var2 = h240Var2;
                    dataInputStream.close();
                }
                a = Result.a(h240Var);
                if (a != null) {
                    xgx0.a.getClass();
                    xgx0.d(a);
                }
                if (h240Var instanceof Result.Failure) {
                    h240Var2 = h240Var;
                }
                h240Var2 = h240Var2;
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(dataInputStream, th);
                }
            }
        }
        if (h240Var2 == null && (h240Var2 = d(new h240(UUID.randomUUID().toString(), System.currentTimeMillis(), false))) == null) {
            throw new IllegalStateException("Unable to init multiacc id");
        }
        this.c = h240Var2;
        return h240Var2;
    }

    public final boolean c() {
        return !epx.f(this.c, h240.d);
    }

    @Override // com.vk.superapp.multiaccount.api.c
    public final h240 getValue() {
        return this.c;
    }
}

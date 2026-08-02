package xsna;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vk.core.preference.Preference;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.g6k;

/* compiled from: SettingsController.java */
/* loaded from: classes.dex */
public final class j1j0 implements SuccessContinuation<Void, Void> {
    public final /* synthetic */ g6k b;
    public final /* synthetic */ k1j0 c;

    public j1j0(k1j0 k1j0Var, g6k g6kVar) {
        this.c = k1j0Var;
        this.b = g6kVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Void r9) throws Exception {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) this.b.c.b.submit(new Callable() { // from class: xsna.i1j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k1j0 k1j0Var = j1j0.this.c;
                o04 o04Var = k1j0Var.f;
                k3j0 k3j0Var = k1j0Var.b;
                o04Var.getClass();
                g6k.a aVar = g6k.d;
                aVar.getClass();
                g6k.a.a(new c6k(aVar), d6k.i);
                try {
                    HashMap b = o04.b(k3j0Var);
                    ljv ljvVar = new ljv((String) o04Var.a, b);
                    ljvVar.c("User-Agent", "Crashlytics Android SDK/19.4.4");
                    ljvVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    o04.a(ljvVar, k3j0Var);
                    b.toString();
                    nkv b2 = ljvVar.b();
                    o04Var.getClass();
                    int b3 = b2.b();
                    if (b3 != 200 && b3 != 201 && b3 != 202 && b3 != 203) {
                        StringBuilder b4 = ji.b(b3, "Settings request failed; (status: ", ") from ");
                        b4.append((String) o04Var.a);
                        Log.e("FirebaseCrashlytics", b4.toString(), null);
                        return null;
                    }
                    try {
                        return new JSONObject(b2.a());
                    } catch (Exception unused) {
                        return null;
                    }
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            }
        }).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            k1j0 k1j0Var = this.c;
            d0j0 a = k1j0Var.c.a(jSONObject);
            ny8 ny8Var = k1j0Var.e;
            long j = a.c;
            ny8Var.getClass();
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) ny8Var.a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        fng.b(fileWriter, "Failed to close settings writer.");
                        jSONObject.toString();
                        String str = k1j0Var.b.f;
                        SharedPreferences.Editor edit = Preference.h(k1j0Var.a, 0, "com.google.firebase.crashlytics").edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        k1j0Var.h.set(a);
                        k1j0Var.i.get().trySetResult(a);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    fng.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                fng.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            fng.b(fileWriter, "Failed to close settings writer.");
            jSONObject.toString();
            String str2 = k1j0Var.b.f;
            SharedPreferences.Editor edit2 = Preference.h(k1j0Var.a, 0, "com.google.firebase.crashlytics").edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            k1j0Var.h.set(a);
            k1j0Var.i.get().trySetResult(a);
        }
        return Tasks.forResult(null);
    }
}

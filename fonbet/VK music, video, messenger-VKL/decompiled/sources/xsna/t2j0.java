package xsna;

import android.util.Log;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes.dex */
public final class t2j0 implements t9v {
    public final Object a;

    public /* synthetic */ t2j0(Object obj) {
        this.a = obj;
    }

    public d0j0 a(JSONObject jSONObject) throws JSONException {
        u2j0 v3j0Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            v3j0Var = new kml();
        } else {
            v3j0Var = new v3j0();
        }
        return v3j0Var.a((ozg0) this.a, jSONObject);
    }

    @Override // xsna.t9v
    public void b(String str, String str2, String str3) {
        OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.a;
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        offlineAudioComponentImpl.Ef().b(str, str2, str3);
    }

    @Override // xsna.t9v
    public void c(String str, float f, long j) {
    }
}

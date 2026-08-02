package sg.bigo.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.e;
import sg.bigo.ads.an.n;

/* loaded from: classes9.dex */
public final class a extends e {
    public static long a;
    public String b;
    public JSONObject c;

    public a(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.an.e
    public final String a() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.an.e
    public final String b() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.b);
        JSONObject jSONObject = this.c;
        parcel.writeString(jSONObject == null ? "" : jSONObject.toString());
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.b = n.a(parcel, "");
        try {
            String a2 = n.a(parcel, "");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            this.c = new JSONObject(a2);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}

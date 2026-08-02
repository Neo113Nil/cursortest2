package xsna;

import android.content.Context;
import com.vk.dto.music.Artist;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: SuperappGooglePayTransactionsBridgeImpl.kt */
/* loaded from: classes11.dex */
public final class sgn0 implements g1v {
    public static eau b;
    public static a0a d;
    public static final sgn0 a = new sgn0();
    public static final sgn0 c = new sgn0();

    public static ArrayList a(String str) {
        if (str == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(new Artist(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public void b(Context context, boolean z) {
        if (b == null) {
            b = new eau(context, z);
        }
    }

    public io.reactivex.rxjava3.core.x c() {
        eau eauVar = b;
        return eauVar != null ? eauVar.a() : io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
    }
}

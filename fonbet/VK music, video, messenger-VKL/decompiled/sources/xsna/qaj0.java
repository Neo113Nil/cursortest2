package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONArray;
import xsna.oxc0;

/* compiled from: SharedPreferencesExt.kt */
/* loaded from: classes.dex */
public final class qaj0 {
    public static final ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            i = wq.b(jSONArray, i, arrayList, i, 1);
        }
        return arrayList;
    }

    public static final paj0 b(Context context, izs izsVar) {
        oxc0.a aVar = new oxc0.a();
        izsVar.invoke(aVar);
        String str = aVar.a;
        String str2 = aVar.b;
        ArrayList arrayList = aVar.c;
        oxc0 oxc0Var = new oxc0(str, str2, arrayList);
        SharedPreferences h = Preference.h(context, 0, str);
        SharedPreferences h2 = Preference.h(context, 0, str2);
        ArrayList<oxc0.b> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        for (oxc0.b bVar : arrayList2) {
            arrayList3.add(new Pair(bVar.a, bVar));
        }
        return new paj0(pn00.s(arrayList3), oxc0Var, h, h2);
    }

    public static final void c(SharedPreferences sharedPreferences, String str, Object obj) {
        if (obj == null) {
            sharedPreferences.edit().putString(str, (String) obj).apply();
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (obj instanceof String) {
            sharedPreferences.edit().putString(str, (String) obj).apply();
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferences.edit().putInt(str, ((Number) obj).intValue()).apply();
            return;
        }
        if (obj instanceof Long) {
            sharedPreferences.edit().putLong(str, ((Number) obj).longValue()).apply();
            return;
        }
        if (obj instanceof Float) {
            sharedPreferences.edit().putFloat(str, ((Number) obj).floatValue()).apply();
            return;
        }
        if (obj instanceof Set) {
            sharedPreferences.edit().putStringSet(str, (Set) obj).apply();
            return;
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Unsupported type for value=" + obj + ", key=" + str);
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        edit.putString(str, jSONArray.toString()).apply();
    }
}

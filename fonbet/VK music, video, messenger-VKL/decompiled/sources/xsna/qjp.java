package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: EncryptedPreferenceMigration.kt */
/* loaded from: classes.dex */
public final class qjp {
    public final Context a;
    public final SharedPreferences b = Preference.f("vk_prefs_migration");

    /* compiled from: EncryptedPreferenceMigration.kt */
    public static final class a {
    }

    public qjp(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(String str, izs izsVar, SharedPreferences sharedPreferences) {
        String concat = "migrated_".concat(str);
        SharedPreferences sharedPreferences2 = this.b;
        if (sharedPreferences2.getBoolean(concat, false)) {
            return;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        boolean c = uz70.c();
        Context context = this.a;
        if (!c) {
            uz70.b(Preference.a, new b61(context, newSingleThreadExecutor, new xv8(2), new myc0(), new com.vk.movika.sdk.base.ui.v(2)));
        }
        Set<String> keySet = Preference.f("EncryptedPreference").getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) izsVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        SharedPreferences.Editor editor = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                sjp.b(context);
                String a2 = uz70.a(str2, "EncryptedPreference");
                if (editor == null) {
                    editor = sharedPreferences.edit();
                }
                editor.putString(str2, a2);
            } catch (Exception e) {
                L.j(e, go9.b("Failed to get ", str2));
            }
            try {
                sjp.b(context);
                b61 b61Var = uz70.a;
                Preference.C("EncryptedPreference", str2);
                b61 b61Var2 = uz70.a;
                if (b61Var2 == null) {
                    b61Var2 = null;
                }
                b61Var2.a.a(str2, null);
            } catch (Exception e2) {
                L.j(e2, go9.b("Failed to remove ", str2));
            }
        }
        if (editor != null) {
            editor.apply();
        }
        sharedPreferences2.edit().putBoolean("migrated_".concat(str), true).apply();
    }
}

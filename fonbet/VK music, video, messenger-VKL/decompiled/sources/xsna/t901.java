package xsna;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.ironsource.B5;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class t901 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ x901 d;

    public t901(x901 x901Var) {
        this.d = x901Var;
        exc0.f("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    public final Bundle a() {
        char c;
        if (this.c == null) {
            x901 x901Var = this.d;
            String string = x901Var.o().getString(this.a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString(B5.q);
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals(UcumUtils.UCUM_SECONDS)) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c != 2) {
                                k901 k901Var = ((mb01) x901Var.b).j;
                                mb01.k(k901Var);
                                k901Var.i.b(string3, "Unrecognized persisted bundle type. Type");
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            k901 k901Var2 = ((mb01) x901Var.b).j;
                            mb01.k(k901Var2);
                            k901Var2.i.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    k901 k901Var3 = ((mb01) x901Var.b).j;
                    mb01.k(k901Var3);
                    k901Var3.i.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        x901 x901Var = this.d;
        SharedPreferences.Editor edit = x901Var.o().edit();
        int size = bundle.size();
        String str = this.a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(B5.q, str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", UcumUtils.UCUM_SECONDS);
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            k901 k901Var = ((mb01) x901Var.b).j;
                            mb01.k(k901Var);
                            k901Var.i.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        k901 k901Var2 = ((mb01) x901Var.b).j;
                        mb01.k(k901Var2);
                        k901Var2.i.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle;
    }
}

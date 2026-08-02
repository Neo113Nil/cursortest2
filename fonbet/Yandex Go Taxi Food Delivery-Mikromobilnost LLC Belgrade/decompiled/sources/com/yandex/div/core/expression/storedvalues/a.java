package com.yandex.div.core.expression.storedvalues;

import com.yandex.div.data.StoredValue$Type;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.d;
import com.yandex.div.storage.f;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import defpackage.a9k;
import defpackage.alu0;
import defpackage.blu0;
import defpackage.clu0;
import defpackage.dlu0;
import defpackage.elu0;
import defpackage.flu0;
import defpackage.g3y;
import defpackage.g9i0;
import defpackage.glu0;
import defpackage.hg21;
import defpackage.i3y;
import defpackage.ilu0;
import defpackage.jlu0;
import defpackage.l6o;
import defpackage.sls;
import defpackage.unr0;
import defpackage.vgb1;
import defpackage.w511;
import defpackage.wwg;
import defpackage.yku0;
import defpackage.zku0;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class a {
    public final i3y a;

    public a(final g3y g3yVar) {
        this.a = kotlin.a.a(new sls() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$rawJsonRepository$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((DivStorageComponent) g3y.this.get()).getRawJsonRepository();
            }
        });
    }

    public static vgb1 b(JSONObject jSONObject, StoredValue$Type storedValue$Type, String str) {
        switch (jlu0.a[storedValue$Type.ordinal()]) {
            case 1:
                return new elu0(str, jSONObject.getString("value"));
            case 2:
                return new dlu0(str, jSONObject.getLong("value"));
            case 3:
                return new zku0(str, jSONObject.getBoolean("value"));
            case 4:
                return new clu0(str, jSONObject.getDouble("value"));
            case 5:
                return new alu0(str, wwg.B(jSONObject.getString("value")));
            case 6:
                String string = jSONObject.getString("value");
                hg21.c(string);
                return new glu0(str, string);
            case 7:
                return new yku0(str, jSONObject.getJSONArray("value"));
            case 8:
                return new blu0(str, jSONObject.getJSONObject("value"));
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        if (((java.lang.System.currentTimeMillis() / 1000) - r7.getLong(ru.yandex.common.clid.ClidProvider.TIMESTAMP)) >= r7.getLong("lifetime")) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        ((com.yandex.div.storage.d) r0.getValue()).a(new com.yandex.div.core.expression.storedvalues.StoredValuesController$getStoredValue$1(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (java.lang.System.currentTimeMillis() >= r7.getLong("expiration_time")) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vgb1 a(String str, l6o l6oVar, String str2, String str3) {
        JSONObject data;
        DivActionSetStoredValue$Scope.Converter.getClass();
        DivActionSetStoredValue$Scope a = a9k.a(str3);
        if (a == null) {
            l6oVar.e(new RuntimeException(unr0.l('\'', "Failed to get stored value '", str), new IllegalArgumentException(unr0.l('\'', "Unknown scope '", str3))));
            return null;
        }
        final String concat = "stored_value_".concat(str);
        int i = ilu0.a[a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            concat = ("card_" + str2 + '_').concat(concat);
        }
        i3y i3yVar = this.a;
        f b = ((d) i3yVar.getValue()).b(Collections.singletonList(concat));
        Iterator<T> it = b.g().iterator();
        while (it.hasNext()) {
            l6oVar.e((RawJsonRepositoryException) it.next());
        }
        g9i0 g9i0Var = (g9i0) kotlin.collections.a.R(b.h());
        if (g9i0Var != null && (data = g9i0Var.getData()) != null) {
            if (data.has(ClidProvider.TIMESTAMP) && data.has("lifetime")) {
            }
            if (data.has("expiration_time")) {
            }
            try {
                String string = data.getString("type");
                StoredValue$Type.Converter.getClass();
                StoredValue$Type a2 = flu0.a(string);
                if (a2 != null) {
                    return b(data, a2, str);
                }
                l6oVar.e(new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + string + '\'', null, 2));
                return null;
            } catch (JSONException e) {
                StringBuilder x = unr0.x("Stored value '", str, "' declaration failed: ");
                x.append(e.getMessage());
                l6oVar.e(new StoredValueDeclarationException(x.toString(), e));
            }
        }
        return null;
    }
}

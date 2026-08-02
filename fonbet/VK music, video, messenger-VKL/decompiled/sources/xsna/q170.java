package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.r2c;
import xsna.wk50;

/* compiled from: NextFieldNavigatorDelegate.kt */
/* loaded from: classes18.dex */
public final class q170 implements oj50<w8c, r2c, aw9> {
    public final wj50<h8c> a;

    public q170(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        FieldKey fieldKey;
        w8c w8cVar = (w8c) km50Var;
        r2c r2cVar = (r2c) kj50Var;
        if (r2cVar instanceof r2c.j) {
            com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = w8cVar.g;
            FieldKey fieldKey2 = ((r2c.j) r2cVar).b;
            FieldKey fieldKey3 = null;
            boolean z = false;
            loop0: for (Map.Entry<String, LinkedHashMap<String, b7r>> entry : fVar.a.entrySet()) {
                String key = entry.getKey();
                for (Map.Entry<String, b7r> entry2 : entry.getValue().entrySet()) {
                    String key2 = entry2.getKey();
                    b7r value = entry2.getValue();
                    if (value instanceof ppg0) {
                        for (Map.Entry<String, b7r> entry3 : ((ppg0) value).c.entrySet()) {
                            String key3 = entry3.getKey();
                            if (entry3.getValue() instanceof InputField) {
                                fieldKey = new FieldKey(key, key2, key3, null, 8, null);
                                if (fieldKey3 == null) {
                                    fieldKey3 = fieldKey;
                                }
                                if (!fieldKey.equals(fieldKey2)) {
                                    if (z) {
                                        fieldKey3 = fieldKey;
                                        break loop0;
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    } else if (value instanceof InputField) {
                        fieldKey = new FieldKey(key, key2, null, null, 12, null);
                        if (fieldKey3 == null) {
                            fieldKey3 = fieldKey;
                        }
                        if (!fieldKey.equals(fieldKey2)) {
                            if (z) {
                                fieldKey3 = fieldKey;
                                break loop0;
                            }
                        } else {
                            z = true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (fieldKey3 != null) {
                this.a.b(new h8c(fieldKey3, true));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}

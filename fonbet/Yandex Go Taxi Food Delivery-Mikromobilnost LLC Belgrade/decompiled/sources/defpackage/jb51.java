package defpackage;

import com.adjust.sdk.AdjustEvent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jb51 extends AdjustEvent {
    public final String a;
    public final HashMap b;

    public jb51(String str) {
        super(str);
        this.a = str;
        this.b = new HashMap();
    }

    @Override // com.adjust.sdk.AdjustEvent
    public final void setOrderId(String str) {
        super.setOrderId(str);
        synchronized (this) {
            HashMap hashMap = this.b;
            try {
                if (str != null) {
                    hashMap.put("transaction_id", str);
                } else {
                    hashMap.remove("transaction_id");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.AdjustEvent
    public final void setRevenue(double d, String str) {
        super.setRevenue(d, str);
        synchronized (this) {
            HashMap hashMap = this.b;
            try {
                if (str != null) {
                    hashMap.put("currency", str);
                } else {
                    hashMap.remove("currency");
                }
                this.b.put("value", Double.valueOf(d));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

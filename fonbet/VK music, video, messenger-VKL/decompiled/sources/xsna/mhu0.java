package xsna;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCardBind;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;

/* compiled from: VkCardBindList.kt */
/* loaded from: classes6.dex */
public final class mhu0 {
    public final Object a;

    public mhu0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public mhu0(JSONArray jSONArray) {
        Object obj;
        if (jSONArray != null) {
            obj = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                obj.add(new VkCardBind(jSONArray.getJSONObject(i)));
            }
        } else {
            obj = EmptyList.b;
        }
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhu0) && epx.f(this.a, ((mhu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("VkCardBindList(list="), this.a, ')');
    }
}

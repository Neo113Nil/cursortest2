package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.common.PaymentType;
import org.json.JSONObject;

/* compiled from: Purchase.java */
/* loaded from: classes18.dex */
public interface mge0 {
    @Nullable
    default String D8() {
        return null;
    }

    String L4();

    String R8();

    String W6();

    void cb(JSONObject jSONObject);

    boolean d1();

    int getId();

    String getType();

    boolean ma();

    String n();

    PaymentType u3();
}

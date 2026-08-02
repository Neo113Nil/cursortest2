package xsna;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.data.storage.ConnectYClientsData;

/* compiled from: ConnectYClientsReviewsStorage.kt */
/* loaded from: classes18.dex */
public final class q3j {
    public final UserId a;
    public final bpn0 b = new bpn0(new yv2(13));

    public q3j(UserId userId) {
        this.a = userId;
    }

    public final ConnectYClientsData a() {
        String string = ((SharedPreferences) this.b.getValue()).getString(String.valueOf(fkq0.a(this.a).b), "");
        if (string == null || drm0.N(string)) {
            return null;
        }
        try {
            return (ConnectYClientsData) new Gson().fromJson(string, ConnectYClientsData.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}

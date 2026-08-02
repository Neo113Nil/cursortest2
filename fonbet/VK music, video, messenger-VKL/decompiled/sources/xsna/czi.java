package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: ConfigurationFlag.java */
/* loaded from: classes13.dex */
public abstract class czi implements f5i0, i7d0 {
    public final /* synthetic */ int b;

    public /* synthetic */ czi(int i) {
        this.b = i;
    }

    public static kiw f(JSONObject jSONObject) {
        int optInt;
        int optInt2;
        String optString = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString) && (optInt = jSONObject.optInt("width")) > 0 && (optInt2 = jSONObject.optInt("height")) > 0) {
            return kiw.b(optInt, optInt2, optString);
        }
        return null;
    }

    @Override // xsna.f5i0
    public int b(int i) {
        int n = n(i);
        if (n == -1 || n(n) == -1) {
            return -1;
        }
        return n;
    }

    @Override // xsna.f5i0
    public int c(int i) {
        int m = m(i);
        if (m == -1 || m(m) == -1) {
            return -1;
        }
        return m;
    }

    @Override // xsna.f5i0
    public int d(int i) {
        return n(i);
    }

    @Override // xsna.f5i0
    public int e(int i) {
        return m(i);
    }

    @Nullable
    public String g() {
        return null;
    }

    @Nullable
    public String h() {
        return null;
    }

    public abstract String i(Context context);

    public abstract Set j();

    public abstract String k();

    public abstract io.reactivex.rxjava3.internal.operators.observable.j1 l(int i, int i2);

    public abstract int m(int i);

    public abstract int n(int i);

    public abstract io.reactivex.rxjava3.core.q o();

    public abstract io.reactivex.rxjava3.core.q p(String str);

    public w501 q() {
        ktz0 ktz0Var = (ktz0) this;
        Map map = ktz0Var.d;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        if (unmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        ktz0Var.d = unmodifiableMap;
        ktz0 ktz0Var2 = (ktz0) this;
        if (ktz0Var2.d != null) {
            return new w501(ktz0Var2.c, ktz0Var2.d);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    public String toString() {
        switch (this.b) {
            case 9:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    public czi(OneTimeDonutEventStatus oneTimeDonutEventStatus) {
        this.b = 5;
    }
}

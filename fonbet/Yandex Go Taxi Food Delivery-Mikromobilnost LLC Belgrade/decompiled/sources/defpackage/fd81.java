package defpackage;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class fd81 implements NativeAdAssets {
    public final m081 a;

    public fd81(m081 m081Var) {
        this.a = m081Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd81) && jl40.l(this.a, ((fd81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.a + Extension.C_BRAKE;
    }
}

package defpackage;

import com.yandex.mobile.ads.nativeads.NativeAdImage;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bq81 implements NativeAdImage {
    public final e781 a;

    public bq81(e781 e781Var) {
        this.a = e781Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq81) && jl40.l(this.a, ((bq81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.a + Extension.C_BRAKE;
    }
}

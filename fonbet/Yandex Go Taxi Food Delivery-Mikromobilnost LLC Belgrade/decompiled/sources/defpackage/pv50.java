package defpackage;

import com.yandex.images.NetworkUtils$ConnectionStrength;

/* loaded from: classes15.dex */
public final class pv50 {
    public final boolean a;
    public final NetworkUtils$ConnectionStrength b;

    public pv50(boolean z, NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength) {
        this.a = z;
        this.b = networkUtils$ConnectionStrength;
    }

    public final String toString() {
        return "NetworkInfo{isConnected=" + this.a + ", connectionStrength=" + this.b + '}';
    }
}

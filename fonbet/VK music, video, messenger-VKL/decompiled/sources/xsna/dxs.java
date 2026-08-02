package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.HashMap;

/* compiled from: FullscreenAdvertisementCache.kt */
/* loaded from: classes6.dex */
public final class dxs {
    public final HashMap a = new HashMap(AdvertisementType.i().size());

    /* compiled from: FullscreenAdvertisementCache.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public boolean d;
        public boolean e;
        public cxs f;
        public boolean g = true;
        public long h;

        public a(int i, int i2, String str, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = z;
        }

        public final boolean a(long j) {
            cxs cxsVar;
            return !this.g && (cxsVar = this.f) != null && cxsVar.isValid() && j < this.h;
        }
    }

    public final a a(AdvertisementType advertisementType) {
        return (a) this.a.get(advertisementType);
    }
}

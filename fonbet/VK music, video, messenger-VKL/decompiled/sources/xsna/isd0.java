package xsna;

import android.content.Context;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;

/* compiled from: ProductTileCtaButtonConfigFactory.kt */
/* loaded from: classes18.dex */
public interface isd0 {

    /* compiled from: ProductTileCtaButtonConfigFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final isd0 STUB = new C3078a();

        /* compiled from: ProductTileCtaButtonConfigFactory.kt */
        /* renamed from: xsna.isd0$a$a, reason: collision with other inner class name */
        public static final class C3078a implements isd0 {
            @Override // xsna.isd0
            public final hsd0 a(Context context, b bVar) {
                return new hsd0((ProductTileCtaButtonType) null, (String) null, false, 15);
            }
        }

        public final isd0 getSTUB() {
            return STUB;
        }
    }

    /* compiled from: ProductTileCtaButtonConfigFactory.kt */
    public static final class b {
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    hsd0 a(Context context, b bVar);
}

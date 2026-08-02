package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: AlbumItem.kt */
/* loaded from: classes18.dex */
public interface pi1 {

    /* compiled from: AlbumItem.kt */
    public interface a extends pi1 {

        /* compiled from: AlbumItem.kt */
        /* renamed from: xsna.pi1$a$a, reason: collision with other inner class name */
        public static final class C3513a implements a {
            public static final C3513a a = new C3513a();
            public static final uog0 b;

            static {
                float f = 8;
                b = vog0.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 6);
            }

            @Override // xsna.pi1
            public final uog0 b() {
                return b;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3513a);
            }

            public final int hashCode() {
                return 1936132148;
            }

            public final String toString() {
                return "BigItem";
            }
        }

        /* compiled from: AlbumItem.kt */
        public static final class b implements a {
            public static final b a = new b();
            public static final uog0 b = vog0.b(8);

            @Override // xsna.pi1
            public final uog0 b() {
                return b;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -833301365;
            }

            public final String toString() {
                return "MainItem";
            }
        }

        /* compiled from: AlbumItem.kt */
        public static final class c implements a {
            public static final c a = new c();

            @Override // xsna.pi1.a, xsna.pi1
            public final lg90 a(int i, androidx.compose.runtime.a aVar) {
                aVar.K(1847227427);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1847227427, i, -1, "com.vk.ecomm.design.compose.album.AlbumItemConfig.Large.ServiceItem.<get-albumIcon> (AlbumItem.kt:278)");
                }
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-506695262, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-NotePenOutline56> (VkIcons.kt:8116)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_note_pen_outline_56, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a2;
            }

            @Override // xsna.pi1
            public final uog0 b() {
                return vog0.b(8);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1165199081;
            }

            public final String toString() {
                return "ServiceItem";
            }
        }

        @Override // xsna.pi1
        default lg90 a(int i, androidx.compose.runtime.a aVar) {
            aVar.K(-399854017);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-399854017, i, -1, "com.vk.ecomm.design.compose.album.AlbumItemConfig.Large.<get-albumIcon> (AlbumItem.kt:260)");
            }
            qzu0.a.getClass();
            lg90 a0 = qzu0.a0(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return a0;
        }
    }

    /* compiled from: AlbumItem.kt */
    public interface b extends pi1 {

        /* compiled from: AlbumItem.kt */
        public static final class a implements b {
            public static final a a = new a();
            public static final uog0 b = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);

            @Override // xsna.pi1
            public final uog0 b() {
                return b;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 641643871;
            }

            public final String toString() {
                return "SmallBottom";
            }
        }

        /* compiled from: AlbumItem.kt */
        /* renamed from: xsna.pi1$b$b, reason: collision with other inner class name */
        public static final class C3514b implements b {
            public static final C3514b a = new C3514b();
            public static final uog0 b = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);

            @Override // xsna.pi1
            public final uog0 b() {
                return b;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3514b);
            }

            public final int hashCode() {
                return 429232801;
            }

            public final String toString() {
                return "SmallTop";
            }
        }

        @Override // xsna.pi1
        default lg90 a(int i, androidx.compose.runtime.a aVar) {
            aVar.K(1286544139);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1286544139, i, -1, "com.vk.ecomm.design.compose.album.AlbumItemConfig.Small.<get-albumIcon> (AlbumItem.kt:288)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-84666510, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-GoodsCollection24> (VkIcons.kt:3140)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_goods_collection_24, 0, aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return a2;
        }
    }

    lg90 a(int i, androidx.compose.runtime.a aVar);

    uog0 b();
}

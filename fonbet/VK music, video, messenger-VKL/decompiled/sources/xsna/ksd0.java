package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: ProductTileCtaButtonDelegate.kt */
/* loaded from: classes18.dex */
public interface ksd0 {

    /* compiled from: ProductTileCtaButtonDelegate.kt */
    public static final class b {
        public final long a;
        public final UserId b;
        public final String c;
        public final int d;
        public final String e;
        public final Image f;
        public final String g;
        public final Image h;
        public final String i;

        public b(long j, UserId userId, String str, int i, String str2, Image image, String str3, Image image2, String str4) {
            this.a = j;
            this.b = userId;
            this.c = str;
            this.d = i;
            this.e = str2;
            this.f = image;
            this.g = str3;
            this.h = image2;
            this.i = str4;
        }
    }

    /* compiled from: ProductTileCtaButtonDelegate.kt */
    public static final class c {
        public final View a;
        public final ProductTileCtaButtonType b;
        public final b c;
        public final String d;
        public final b e;
        public final Integer f;
        public final a g;
        public final izs<ProductTileCtaButtonType, s3q0> h;
        public final boolean i;

        /* compiled from: ProductTileCtaButtonDelegate.kt */
        public static final class a {
            public final CommonMarketStat$TypeRefSource a;
            public final String b;
            public final SearchStatsLoggingInfo c;

            public a(CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, SearchStatsLoggingInfo searchStatsLoggingInfo) {
                this.a = commonMarketStat$TypeRefSource;
                this.b = str;
                this.c = searchStatsLoggingInfo;
            }
        }

        /* compiled from: ProductTileCtaButtonDelegate.kt */
        public static final class b {
            public final String a;
            public final UserId b;
            public final String c;
            public final String d;
            public final boolean e;
            public final String f;

            public b(UserId userId, String str, String str2, String str3, String str4, boolean z) {
                this.a = str;
                this.b = userId;
                this.c = str2;
                this.d = str3;
                this.e = z;
                this.f = str4;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, ProductTileCtaButtonType productTileCtaButtonType, b bVar, String str, b bVar2, Integer num, a aVar, izs<? super ProductTileCtaButtonType, s3q0> izsVar, boolean z) {
            this.a = view;
            this.b = productTileCtaButtonType;
            this.c = bVar;
            this.d = str;
            this.e = bVar2;
            this.f = num;
            this.g = aVar;
            this.h = izsVar;
            this.i = z;
        }
    }

    void a(Context context, c cVar);

    /* compiled from: ProductTileCtaButtonDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ksd0 STUB = new C3201a();

        public final ksd0 getSTUB() {
            return STUB;
        }

        /* compiled from: ProductTileCtaButtonDelegate.kt */
        /* renamed from: xsna.ksd0$a$a, reason: collision with other inner class name */
        public static final class C3201a implements ksd0 {
            @Override // xsna.ksd0
            public final void a(Context context, c cVar) {
            }
        }
    }
}

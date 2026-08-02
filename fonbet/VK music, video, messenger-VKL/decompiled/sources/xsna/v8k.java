package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.model.CreateMarketItemReviewData;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CreateMarketItemReviewPatch.kt */
/* loaded from: classes18.dex */
public final class v8k extends s8k {
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final UserId g;
    public final String h;
    public final String i;
    public final float j;
    public final List<UploadImageModel> k;
    public final boolean l;
    public final boolean m;
    public final CreateMarketItemReviewData n;

    public v8k() {
        this(null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8k)) {
            return false;
        }
        v8k v8kVar = (v8k) obj;
        return epx.f(this.b, v8kVar.b) && epx.f(this.c, v8kVar.c) && epx.f(this.d, v8kVar.d) && epx.f(this.e, v8kVar.e) && epx.f(this.f, v8kVar.f) && epx.f(this.g, v8kVar.g) && epx.f(this.h, v8kVar.h) && epx.f(this.i, v8kVar.i) && Float.compare(this.j, v8kVar.j) == 0 && epx.f(this.k, v8kVar.k) && this.l == v8kVar.l && this.m == v8kVar.m && epx.f(this.n, v8kVar.n);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int b = qoy.b(qoy.b(fw3.a(io.reactivex.rxjava3.subjects.b.a(this.j, urd0.a(urd0.a(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g.b), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m);
        CreateMarketItemReviewData createMarketItemReviewData = this.n;
        return b + (createMarketItemReviewData != null ? createMarketItemReviewData.hashCode() : 0);
    }

    public final String toString() {
        return "Success(pros=" + this.b + ", cons=" + this.c + ", comment=" + this.d + ", productId=" + this.e + ", productImage=" + this.f + ", communityId=" + this.g + ", userName=" + this.h + ", productName=" + this.i + ", rating=" + this.j + ", reviewImages=" + this.k + ", isLoading=" + this.l + ", isError=" + this.m + ", initialState=" + this.n + ')';
    }

    public v8k(String str, String str2, String str3, Long l, String str4, UserId userId, String str5, String str6, float f, List<UploadImageModel> list, boolean z, boolean z2, CreateMarketItemReviewData createMarketItemReviewData) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = userId;
        this.h = str5;
        this.i = str6;
        this.j = f;
        this.k = list;
        this.l = z;
        this.m = z2;
        this.n = createMarketItemReviewData;
    }

    public v8k(Long l, String str, UserId userId, String str2, String str3, float f, List list, int i) {
        this("", "", "", (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str, (i & 32) != 0 ? UserId.d : userId, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? 0.0f : f, (i & 512) != 0 ? EmptyList.b : list, false, false, null);
    }
}

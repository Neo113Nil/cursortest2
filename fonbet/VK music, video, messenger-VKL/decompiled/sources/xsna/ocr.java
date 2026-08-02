package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.Correction;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.filters.model.FilterType;

/* compiled from: FilterDrawData.kt */
/* loaded from: classes3.dex */
public final class ocr {
    public final FilterItem a;
    public final umv b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public static final a j = new a();
    private static final ocr STUB = new ocr(new FilterItem(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15, null), cdi.g);

    /* compiled from: FilterDrawData.kt */
    public static final class a {
        public final ocr getSTUB() {
            return ocr.STUB;
        }
    }

    public ocr(FilterItem filterItem, umv umvVar) {
        this.a = filterItem;
        this.b = umvVar;
        boolean z = (filterItem.b == FilterType.NONE || filterItem.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
        this.c = z;
        Correction correction = filterItem.d;
        this.d = correction.l;
        this.e = correction.m;
        boolean z2 = correction.n;
        this.f = z2;
        boolean z3 = filterItem.e.j;
        this.g = z3;
        boolean z4 = z2 || z3 || z;
        this.h = z4;
        this.i = !z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocr)) {
            return false;
        }
        return epx.f(this.a, ((ocr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FilterDrawData(item=" + this.a + ", filter=" + this.b + ')';
    }
}

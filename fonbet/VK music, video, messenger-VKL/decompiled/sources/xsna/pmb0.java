package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: DeliveryPointsSheetError.kt */
/* loaded from: classes18.dex */
public abstract class pmb0 {
    public final tlo0.f a;
    public final tlo0 b;

    /* compiled from: DeliveryPointsSheetError.kt */
    public static final class a extends pmb0 {
        public static final a c = new a(tq.h(tlo0.Companion, R.string.ecomm_delivery_points_list_is_empty_reset_filters), new tlo0.f(R.string.ecomm_delivery_points_filters_reset_filters));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1622848010;
        }

        public final String toString() {
            return "EmptyFilteredPoints";
        }
    }

    /* compiled from: DeliveryPointsSheetError.kt */
    public static final class b extends pmb0 {
        public static final b c = new b(tq.h(tlo0.Companion, R.string.ecomm_delivery_points_enable_location_suggest), new tlo0.f(R.string.ecomm_delivery_points_grant_permissions));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -533643574;
        }

        public final String toString() {
            return "LocationUnavailable";
        }
    }

    /* compiled from: DeliveryPointsSheetError.kt */
    public static final class c extends pmb0 {
        public static final c c = new c(tq.h(tlo0.Companion, R.string.ecomm_delivery_points_loading_failed), new tlo0.f(R.string.ecomm_cart_retry));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2118618651;
        }

        public final String toString() {
            return "PointsLoadingFailed";
        }
    }

    /* compiled from: DeliveryPointsSheetError.kt */
    public static final class d extends pmb0 {
        public static final d c = new d(tq.h(tlo0.Companion, R.string.ecomm_delivery_points_radius_too_large), null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 440879607;
        }

        public final String toString() {
            return "TooHighRadius";
        }
    }

    public pmb0(tlo0.f fVar, tlo0.f fVar2) {
        this.a = fVar;
        this.b = fVar2;
    }
}

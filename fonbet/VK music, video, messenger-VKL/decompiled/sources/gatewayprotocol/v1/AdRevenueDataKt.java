package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import xsna.zcl;

/* compiled from: AdRevenueDataKt.kt */
/* loaded from: classes8.dex */
public final class AdRevenueDataKt {
    public static final AdRevenueDataKt INSTANCE = new AdRevenueDataKt();

    /* compiled from: AdRevenueDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRevenueEventRequestOuterClass.AdRevenueData.Builder _builder;

        /* compiled from: AdRevenueDataKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueData _build() {
            return this._builder.build();
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdUnitId() {
            this._builder.clearAdUnitId();
        }

        public final void clearCountryCode() {
            this._builder.clearCountryCode();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearNetworkName() {
            this._builder.clearNetworkName();
        }

        public final void clearRevenue() {
            this._builder.clearRevenue();
        }

        public final void clearThirdPartyAdPlacementId() {
            this._builder.clearThirdPartyAdPlacementId();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            return this._builder.getAdFormat();
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final String getAdUnitId() {
            return this._builder.getAdUnitId();
        }

        public final String getCountryCode() {
            return this._builder.getCountryCode();
        }

        public final ByteString getEventId() {
            return this._builder.getEventId();
        }

        public final String getNetworkName() {
            return this._builder.getNetworkName();
        }

        public final double getRevenue() {
            return this._builder.getRevenue();
        }

        public final String getThirdPartyAdPlacementId() {
            return this._builder.getThirdPartyAdPlacementId();
        }

        public final boolean hasAdUnitId() {
            return this._builder.hasAdUnitId();
        }

        public final boolean hasCountryCode() {
            return this._builder.hasCountryCode();
        }

        public final boolean hasNetworkName() {
            return this._builder.hasNetworkName();
        }

        public final boolean hasRevenue() {
            return this._builder.hasRevenue();
        }

        public final boolean hasThirdPartyAdPlacementId() {
            return this._builder.hasThirdPartyAdPlacementId();
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setAdUnitId(String str) {
            this._builder.setAdUnitId(str);
        }

        public final void setCountryCode(String str) {
            this._builder.setCountryCode(str);
        }

        public final void setEventId(ByteString byteString) {
            this._builder.setEventId(byteString);
        }

        public final void setNetworkName(String str) {
            this._builder.setNetworkName(str);
        }

        public final void setRevenue(double d) {
            this._builder.setRevenue(d);
        }

        public final void setThirdPartyAdPlacementId(String str) {
            this._builder.setThirdPartyAdPlacementId(str);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRevenueDataKt() {
    }
}

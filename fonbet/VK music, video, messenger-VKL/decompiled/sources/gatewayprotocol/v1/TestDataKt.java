package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TestDataOuterClass;
import xsna.zcl;

/* compiled from: TestDataKt.kt */
/* loaded from: classes8.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    /* compiled from: TestDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        /* compiled from: TestDataKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            return this._builder.build();
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final void clearForceGeoKey() {
            this._builder.clearForceGeoKey();
        }

        public final String getForceCampaignId() {
            return this._builder.getForceCampaignId();
        }

        public final String getForceCountry() {
            return this._builder.getForceCountry();
        }

        public final String getForceCountrySubdivision() {
            return this._builder.getForceCountrySubdivision();
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final String getForceGeoKey() {
            return this._builder.getForceGeoKey();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final boolean hasForceGeoKey() {
            return this._builder.hasForceGeoKey();
        }

        public final void setForceCampaignId(String str) {
            this._builder.setForceCampaignId(str);
        }

        public final void setForceCountry(String str) {
            this._builder.setForceCountry(str);
        }

        public final void setForceCountrySubdivision(String str) {
            this._builder.setForceCountrySubdivision(str);
        }

        public final void setForceExchangeTestMode(int i) {
            this._builder.setForceExchangeTestMode(i);
        }

        public final void setForceGeoKey(String str) {
            this._builder.setForceGeoKey(str);
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }
    }

    private TestDataKt() {
    }
}

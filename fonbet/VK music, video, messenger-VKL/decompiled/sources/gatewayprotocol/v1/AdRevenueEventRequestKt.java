package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.zcl;

/* compiled from: AdRevenueEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class AdRevenueEventRequestKt {
    public static final AdRevenueEventRequestKt INSTANCE = new AdRevenueEventRequestKt();

    /* compiled from: AdRevenueEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder _builder;

        /* compiled from: AdRevenueEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build() {
            return this._builder.build();
        }

        public final void clearAdRevenueData() {
            this._builder.clearAdRevenueData();
        }

        public final void clearAdRevenueOrigin() {
            this._builder.clearAdRevenueOrigin();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueData() {
            return this._builder.getAdRevenueData();
        }

        public final AdRevenueEventRequestOuterClass.AdRevenueOrigin getAdRevenueOrigin() {
            return this._builder.getAdRevenueOrigin();
        }

        public final int getAdRevenueOriginValue() {
            return this._builder.getAdRevenueOriginValue();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            return this._builder.getMediationProvider();
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final boolean hasAdRevenueData() {
            return this._builder.hasAdRevenueData();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAdRevenueData(AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData) {
            this._builder.setAdRevenueData(adRevenueData);
        }

        public final void setAdRevenueOrigin(AdRevenueEventRequestOuterClass.AdRevenueOrigin adRevenueOrigin) {
            this._builder.setAdRevenueOrigin(adRevenueOrigin);
        }

        public final void setAdRevenueOriginValue(int i) {
            this._builder.setAdRevenueOriginValue(i);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRevenueEventRequestKt() {
    }
}

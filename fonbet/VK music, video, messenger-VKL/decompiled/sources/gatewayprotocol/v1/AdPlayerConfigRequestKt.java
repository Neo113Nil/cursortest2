package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: AdPlayerConfigRequestKt.kt */
/* loaded from: classes8.dex */
public final class AdPlayerConfigRequestKt {
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    /* compiled from: AdPlayerConfigRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        /* compiled from: AdPlayerConfigRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: AdPlayerConfigRequestKt.kt */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            return this._builder.build();
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            return this._builder.getAdFormat();
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final ByteString getConfigurationToken() {
            return this._builder.getConfigurationToken();
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            return new DslMap(this._builder.getExtrasMap());
        }

        public final ByteString getImpressionOpportunityId() {
            return this._builder.getImpressionOpportunityId();
        }

        public final String getMediationAdUnitId() {
            return this._builder.getMediationAdUnitId();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            return this._builder.getMediationInfo();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            return AdPlayerConfigRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            return this._builder.getPlacementId();
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            this._builder.putAllExtras(map);
        }

        /* renamed from: putExtras, reason: merged with bridge method [inline-methods] */
        public final void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            this._builder.putExtras(str, str2);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String str) {
            this._builder.removeExtras(str);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setConfigurationToken(ByteString byteString) {
            this._builder.setConfigurationToken(byteString);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setMediationAdUnitId(String str) {
            this._builder.setMediationAdUnitId(str);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            this._builder.setMediationInfo(mediationInfo);
        }

        public final void setPlacementId(String str) {
            this._builder.setPlacementId(str);
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}

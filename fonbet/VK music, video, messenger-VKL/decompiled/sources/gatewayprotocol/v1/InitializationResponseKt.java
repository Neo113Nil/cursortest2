package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.ModuleOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: InitializationResponseKt.kt */
/* loaded from: classes8.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    /* compiled from: InitializationResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* compiled from: InitializationResponseKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        public static final class ModulesProxy extends DslProxy {
            private ModulesProxy() {
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        public static final class RequestUrlOverridesProxy extends DslProxy {
            private RequestUrlOverridesProxy() {
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            return this._builder.build();
        }

        /* renamed from: addAllModules, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllModules(DslList dslList, Iterable iterable) {
            this._builder.addAllModules(iterable);
        }

        /* renamed from: addAllRequestUrlOverrides, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllRequestUrlOverrides(DslList dslList, Iterable iterable) {
            this._builder.addAllRequestUrlOverrides(iterable);
        }

        /* renamed from: addAllScarEligibleFormats, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList dslList, Iterable iterable) {
            this._builder.addAllScarEligibleFormats(iterable);
        }

        /* renamed from: addModules, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignModules(DslList dslList, ModuleOuterClass.Module module) {
            this._builder.addModules(module);
        }

        /* renamed from: addRequestUrlOverrides, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignRequestUrlOverrides(DslList dslList, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            this._builder.addRequestUrlOverrides(requestUrlOverride);
        }

        /* renamed from: addScarEligibleFormats, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat adFormat) {
            this._builder.addScarEligibleFormats(adFormat);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final /* synthetic */ void clearModules(DslList dslList) {
            this._builder.clearModules();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearRequestUrlOverrides(DslList dslList) {
            this._builder.clearRequestUrlOverrides();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            return this._builder.getError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final /* synthetic */ DslList getModules() {
            return new DslList(this._builder.getModulesList());
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            return this._builder.getNativeConfiguration();
        }

        public final /* synthetic */ DslList getRequestUrlOverrides() {
            return new DslList(this._builder.getRequestUrlOverridesList());
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            return new DslList(this._builder.getScarEligibleFormatsList());
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            return new DslMap(this._builder.getScarPlacementsMap());
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            return this._builder.getUniversalRequestUrl();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            this._builder.putAllScarPlacements(map);
        }

        /* renamed from: putScarPlacements, reason: merged with bridge method [inline-methods] */
        public final void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            this._builder.putScarPlacements(str, placement);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String str) {
            this._builder.removeScarPlacements(str);
        }

        public final void setCountOfLastShownCampaigns(int i) {
            this._builder.setCountOfLastShownCampaigns(i);
        }

        public final void setError(ErrorOuterClass.Error error) {
            this._builder.setError(error);
        }

        public final /* synthetic */ void setModules(DslList dslList, int i, ModuleOuterClass.Module module) {
            this._builder.setModules(i, module);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            this._builder.setNativeConfiguration(nativeConfiguration);
        }

        public final /* synthetic */ void setRequestUrlOverrides(DslList dslList, int i, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            this._builder.setRequestUrlOverrides(i, requestUrlOverride);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i, AdFormatOuterClass.AdFormat adFormat) {
            this._builder.setScarEligibleFormats(i, adFormat);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        public final void setUniversalRequestUrl(String str) {
            this._builder.setUniversalRequestUrl(str);
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationResponseKt() {
    }
}

package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: UniversalRequestKt.kt */
/* loaded from: classes8.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    /* compiled from: UniversalRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        /* compiled from: UniversalRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            return this._builder.build();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            return this._builder.getPayload();
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            return this._builder.getSharedData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            this._builder.setPayload(payload);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            this._builder.setSharedData(sharedData);
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: UniversalRequestKt.kt */
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        /* compiled from: UniversalRequestKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            /* compiled from: UniversalRequestKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                return this._builder.build();
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearAdRevenueEventRequest() {
                this._builder.clearAdRevenueEventRequest();
            }

            public final void clearAudienceManagementRequest() {
                this._builder.clearAudienceManagementRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearLifecycleEventRequest() {
                this._builder.clearLifecycleEventRequest();
            }

            public final void clearMonitoringEventRequest() {
                this._builder.clearMonitoringEventRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearRewardedOffersRequest() {
                this._builder.clearRewardedOffersRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                return this._builder.getAdDataRefreshRequest();
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                return this._builder.getAdPlayerConfigRequest();
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                return this._builder.getAdRequest();
            }

            public final AdRevenueEventRequestOuterClass.AdRevenueEventRequest getAdRevenueEventRequest() {
                return this._builder.getAdRevenueEventRequest();
            }

            public final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                return this._builder.getAudienceManagementRequest();
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                return this._builder.getDiagnosticEventRequest();
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                return this._builder.getGetTokenEventRequest();
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                return this._builder.getInitializationCompletedEventRequest();
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return this._builder.getInitializationRequest();
            }

            public final LifecycleEventRequestOuterClass.LifecycleEventRequest getLifecycleEventRequest() {
                return this._builder.getLifecycleEventRequest();
            }

            public final MonitoringEventRequestOuterClass.MonitoringEventRequest getMonitoringEventRequest() {
                return this._builder.getMonitoringEventRequest();
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                return this._builder.getOperativeEvent();
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                return this._builder.getPrivacyUpdateRequest();
            }

            public final RewardedOffersRequestOuterClass.RewardedOffersRequest getRewardedOffersRequest() {
                return this._builder.getRewardedOffersRequest();
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                return this._builder.getTransactionEventRequest();
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                return this._builder.getValueCase();
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasAdRevenueEventRequest() {
                return this._builder.hasAdRevenueEventRequest();
            }

            public final boolean hasAudienceManagementRequest() {
                return this._builder.hasAudienceManagementRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasLifecycleEventRequest() {
                return this._builder.hasLifecycleEventRequest();
            }

            public final boolean hasMonitoringEventRequest() {
                return this._builder.hasMonitoringEventRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasRewardedOffersRequest() {
                return this._builder.hasRewardedOffersRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                this._builder.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                this._builder.setAdRequest(adRequest);
            }

            public final void setAdRevenueEventRequest(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest) {
                this._builder.setAdRevenueEventRequest(adRevenueEventRequest);
            }

            public final void setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                this._builder.setAudienceManagementRequest(audienceManagementRequest);
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                this._builder.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                this._builder.setGetTokenEventRequest(getTokenEventRequest);
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                this._builder.setInitializationRequest(initializationRequest);
            }

            public final void setLifecycleEventRequest(LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest) {
                this._builder.setLifecycleEventRequest(lifecycleEventRequest);
            }

            public final void setMonitoringEventRequest(MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest) {
                this._builder.setMonitoringEventRequest(monitoringEventRequest);
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                this._builder.setOperativeEvent(operativeEventRequest);
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            public final void setRewardedOffersRequest(RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest) {
                this._builder.setRewardedOffersRequest(rewardedOffersRequest);
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                this._builder.setTransactionEventRequest(transactionEventRequest);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    /* compiled from: UniversalRequestKt.kt */
    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        /* compiled from: UniversalRequestKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            /* compiled from: UniversalRequestKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                return this._builder.build();
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final Timestamp getAppStartTime() {
                return this._builder.getAppStartTime();
            }

            public final ByteString getCurrentState() {
                return this._builder.getCurrentState();
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                return this._builder.getDeveloperConsent();
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                return this._builder.getLimitedSessionToken();
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            public final PiiOuterClass.Pii getPii() {
                return this._builder.getPii();
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final Timestamp getSdkStartTime() {
                return this._builder.getSdkStartTime();
            }

            public final ByteString getSessionToken() {
                return this._builder.getSessionToken();
            }

            public final TestDataOuterClass.TestData getTestData() {
                return this._builder.getTestData();
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                return this._builder.getTimestamps();
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final void setAppStartTime(Timestamp timestamp) {
                this._builder.setAppStartTime(timestamp);
            }

            public final void setCurrentState(ByteString byteString) {
                this._builder.setCurrentState(byteString);
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                this._builder.setDeveloperConsent(developerConsent);
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                this._builder.setLimitedSessionToken(limitedSessionToken);
            }

            public final void setPii(PiiOuterClass.Pii pii) {
                this._builder.setPii(pii);
            }

            public final void setSdkStartTime(Timestamp timestamp) {
                this._builder.setSdkStartTime(timestamp);
            }

            public final void setSessionToken(ByteString byteString) {
                this._builder.setSessionToken(byteString);
            }

            public final void setTestData(TestDataOuterClass.TestData testData) {
                this._builder.setTestData(testData);
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                this._builder.setTimestamps(timestamps);
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }
        }

        private SharedDataKt() {
        }
    }

    private UniversalRequestKt() {
    }

    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m278initializepayload(izs<? super PayloadKt.Dsl, s3q0> izsVar) {
        PayloadKt.Dsl _create = PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m279initializesharedData(izs<? super SharedDataKt.Dsl, s3q0> izsVar) {
        SharedDataKt.Dsl _create = SharedDataKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}

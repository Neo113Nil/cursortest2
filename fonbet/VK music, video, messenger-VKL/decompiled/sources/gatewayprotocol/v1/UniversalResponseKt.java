package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: UniversalResponseKt.kt */
/* loaded from: classes8.dex */
public final class UniversalResponseKt {
    public static final UniversalResponseKt INSTANCE = new UniversalResponseKt();

    /* compiled from: UniversalResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalResponseOuterClass.UniversalResponse.Builder _builder;

        /* compiled from: UniversalResponseKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse _build() {
            return this._builder.build();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final ErrorOuterClass.Error getError() {
            return this._builder.getError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            return UniversalResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final MutableDataOuterClass.MutableData getMutableData() {
            return this._builder.getMutableData();
        }

        public final MutableDataOuterClass.MutableData getMutableDataOrNull(Dsl dsl) {
            return UniversalResponseKtKt.getMutableDataOrNull(dsl._builder);
        }

        public final UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            return this._builder.getPayload();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final void setError(ErrorOuterClass.Error error) {
            this._builder.setError(error);
        }

        public final void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            this._builder.setMutableData(mutableData);
        }

        public final void setPayload(UniversalResponseOuterClass.UniversalResponse.Payload payload) {
            this._builder.setPayload(payload);
        }

        private Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: UniversalResponseKt.kt */
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        /* compiled from: UniversalResponseKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            /* compiled from: UniversalResponseKt.kt */
            public static final class Companion {
                public /* synthetic */ Companion(zcl zclVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder, zcl zclVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse.Payload _build() {
                return this._builder.build();
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final void clearAudienceManagementResponse() {
                this._builder.clearAudienceManagementResponse();
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final void clearRewardedOffersResponse() {
                this._builder.clearRewardedOffersResponse();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                return this._builder.getAdDataRefreshResponse();
            }

            public final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                return this._builder.getAdPlayerConfigResponse();
            }

            public final AdResponseOuterClass.AdResponse getAdResponse() {
                return this._builder.getAdResponse();
            }

            public final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                return this._builder.getAudienceManagementResponse();
            }

            public final InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                return this._builder.getInitializationResponse();
            }

            public final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                return this._builder.getPrivacyUpdateResponse();
            }

            public final RewardedOffersResponseOuterClass.RewardedOffersResponse getRewardedOffersResponse() {
                return this._builder.getRewardedOffersResponse();
            }

            public final UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                return this._builder.getValueCase();
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final boolean hasAudienceManagementResponse() {
                return this._builder.hasAudienceManagementResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            public final boolean hasRewardedOffersResponse() {
                return this._builder.hasRewardedOffersResponse();
            }

            public final void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                this._builder.setAdDataRefreshResponse(adDataRefreshResponse);
            }

            public final void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                this._builder.setAdPlayerConfigResponse(adPlayerConfigResponse);
            }

            public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                this._builder.setAdResponse(adResponse);
            }

            public final void setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                this._builder.setAudienceManagementResponse(audienceManagementResponse);
            }

            public final void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                this._builder.setInitializationResponse(initializationResponse);
            }

            public final void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                this._builder.setPrivacyUpdateResponse(privacyUpdateResponse);
            }

            public final void setRewardedOffersResponse(RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse) {
                this._builder.setRewardedOffersResponse(rewardedOffersResponse);
            }

            private Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    private UniversalResponseKt() {
    }

    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalResponseOuterClass.UniversalResponse.Payload m281initializepayload(izs<? super PayloadKt.Dsl, s3q0> izsVar) {
        PayloadKt.Dsl _create = PayloadKt.Dsl.Companion._create(UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}

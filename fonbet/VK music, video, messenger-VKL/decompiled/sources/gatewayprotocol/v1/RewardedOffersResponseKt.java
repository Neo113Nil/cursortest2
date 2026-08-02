package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import xsna.zcl;

/* compiled from: RewardedOffersResponseKt.kt */
/* loaded from: classes8.dex */
public final class RewardedOffersResponseKt {
    public static final RewardedOffersResponseKt INSTANCE = new RewardedOffersResponseKt();

    /* compiled from: RewardedOffersResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder _builder;

        /* compiled from: RewardedOffersResponseKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ RewardedOffersResponseOuterClass.RewardedOffersResponse _build() {
            return this._builder.build();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearRewardedOffers() {
            this._builder.clearRewardedOffers();
        }

        public final void clearRewardedOffersVersion() {
            this._builder.clearRewardedOffersVersion();
        }

        public final ErrorOuterClass.Error getError() {
            return this._builder.getError();
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            return RewardedOffersResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getRewardedOffers() {
            return this._builder.getRewardedOffers();
        }

        public final int getRewardedOffersVersion() {
            return this._builder.getRewardedOffersVersion();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setError(ErrorOuterClass.Error error) {
            this._builder.setError(error);
        }

        public final void setRewardedOffers(ByteString byteString) {
            this._builder.setRewardedOffers(byteString);
        }

        public final void setRewardedOffersVersion(int i) {
            this._builder.setRewardedOffersVersion(i);
        }

        private Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private RewardedOffersResponseKt() {
    }
}

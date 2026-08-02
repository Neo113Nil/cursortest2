package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import xsna.zcl;

/* compiled from: RewardedOffersRequestKt.kt */
/* loaded from: classes8.dex */
public final class RewardedOffersRequestKt {
    public static final RewardedOffersRequestKt INSTANCE = new RewardedOffersRequestKt();

    /* compiled from: RewardedOffersRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder _builder;

        /* compiled from: RewardedOffersRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ RewardedOffersRequestOuterClass.RewardedOffersRequest _build() {
            return this._builder.build();
        }

        public final void clearCursor() {
            this._builder.clearCursor();
        }

        public final void clearEntryPoint() {
            this._builder.clearEntryPoint();
        }

        public final ByteString getCursor() {
            return this._builder.getCursor();
        }

        public final RewardedOffersRequestOuterClass.RewardedOffersEntryPoint getEntryPoint() {
            return this._builder.getEntryPoint();
        }

        public final int getEntryPointValue() {
            return this._builder.getEntryPointValue();
        }

        public final void setCursor(ByteString byteString) {
            this._builder.setCursor(byteString);
        }

        public final void setEntryPoint(RewardedOffersRequestOuterClass.RewardedOffersEntryPoint rewardedOffersEntryPoint) {
            this._builder.setEntryPoint(rewardedOffersEntryPoint);
        }

        public final void setEntryPointValue(int i) {
            this._builder.setEntryPointValue(i);
        }

        private Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private RewardedOffersRequestKt() {
    }
}

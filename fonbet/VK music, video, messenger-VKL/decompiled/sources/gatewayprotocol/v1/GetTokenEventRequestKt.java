package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import xsna.zcl;

/* compiled from: GetTokenEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    /* compiled from: GetTokenEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        /* compiled from: GetTokenEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            return this._builder.build();
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final ByteString getBanner() {
            return this._builder.getBanner();
        }

        public final ByteString getInterstitial() {
            return this._builder.getInterstitial();
        }

        public final ByteString getRewarded() {
            return this._builder.getRewarded();
        }

        public final ByteString getTokenId() {
            return this._builder.getTokenId();
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(ByteString byteString) {
            this._builder.setBanner(byteString);
        }

        public final void setInterstitial(ByteString byteString) {
            this._builder.setInterstitial(byteString);
        }

        public final void setRewarded(ByteString byteString) {
            this._builder.setRewarded(byteString);
        }

        public final void setTokenId(ByteString byteString) {
            this._builder.setTokenId(byteString);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private GetTokenEventRequestKt() {
    }
}

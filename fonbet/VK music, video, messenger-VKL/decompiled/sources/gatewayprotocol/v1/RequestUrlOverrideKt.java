package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import xsna.zcl;

/* compiled from: RequestUrlOverrideKt.kt */
/* loaded from: classes8.dex */
public final class RequestUrlOverrideKt {
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* compiled from: RequestUrlOverrideKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* compiled from: RequestUrlOverrideKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            return this._builder.build();
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final InitializationResponseOuterClass.RequestType getRequestType() {
            return this._builder.getRequestType();
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        public final String getUrl() {
            return this._builder.getUrl();
        }

        public final void setRequestType(InitializationResponseOuterClass.RequestType requestType) {
            this._builder.setRequestType(requestType);
        }

        public final void setRequestTypeValue(int i) {
            this._builder.setRequestTypeValue(i);
        }

        public final void setUrl(String str) {
            this._builder.setUrl(str);
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestUrlOverrideKt() {
    }
}

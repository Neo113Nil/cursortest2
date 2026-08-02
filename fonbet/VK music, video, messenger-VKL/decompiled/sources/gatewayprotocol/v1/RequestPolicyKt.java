package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.zcl;

/* compiled from: RequestPolicyKt.kt */
/* loaded from: classes8.dex */
public final class RequestPolicyKt {
    public static final RequestPolicyKt INSTANCE = new RequestPolicyKt();

    /* compiled from: RequestPolicyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestPolicy.Builder _builder;

        /* compiled from: RequestPolicyKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestPolicy _build() {
            return this._builder.build();
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        public final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            return this._builder.getRetryPolicy();
        }

        public final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            return this._builder.getTimeoutPolicy();
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        public final void setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            this._builder.setRetryPolicy(requestRetryPolicy);
        }

        public final void setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            this._builder.setTimeoutPolicy(requestTimeoutPolicy);
        }

        private Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestPolicyKt() {
    }
}

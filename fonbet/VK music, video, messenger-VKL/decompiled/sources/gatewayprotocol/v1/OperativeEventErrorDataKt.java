package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import xsna.zcl;

/* compiled from: OperativeEventErrorDataKt.kt */
/* loaded from: classes8.dex */
public final class OperativeEventErrorDataKt {
    public static final OperativeEventErrorDataKt INSTANCE = new OperativeEventErrorDataKt();

    /* compiled from: OperativeEventErrorDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OperativeEventRequestOuterClass.OperativeEventErrorData.Builder _builder;

        /* compiled from: OperativeEventErrorDataKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventErrorData _build() {
            return this._builder.build();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final ByteString getErrorToken() {
            return this._builder.getErrorToken();
        }

        public final OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            return this._builder.getErrorType();
        }

        public final int getErrorTypeValue() {
            return this._builder.getErrorTypeValue();
        }

        public final String getMessage() {
            return this._builder.getMessage();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final void setErrorToken(ByteString byteString) {
            this._builder.setErrorToken(byteString);
        }

        public final void setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType) {
            this._builder.setErrorType(operativeEventErrorType);
        }

        public final void setErrorTypeValue(int i) {
            this._builder.setErrorTypeValue(i);
        }

        public final void setMessage(String str) {
            this._builder.setMessage(str);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventErrorDataKt() {
    }
}

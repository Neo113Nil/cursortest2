package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import xsna.zcl;

/* compiled from: ErrorKt.kt */
/* loaded from: classes8.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: ErrorKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        /* compiled from: ErrorKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            return this._builder.build();
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            return this._builder.getErrorCode();
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        public final String getErrorText() {
            return this._builder.getErrorText();
        }

        public final ByteString getErrorToken() {
            return this._builder.getErrorToken();
        }

        public final void setErrorCode(ErrorOuterClass.PublicErrorCode publicErrorCode) {
            this._builder.setErrorCode(publicErrorCode);
        }

        public final void setErrorCodeValue(int i) {
            this._builder.setErrorCodeValue(i);
        }

        public final void setErrorText(String str) {
            this._builder.setErrorText(str);
        }

        public final void setErrorToken(ByteString byteString) {
            this._builder.setErrorToken(byteString);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}

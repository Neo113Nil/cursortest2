package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import xsna.zcl;

/* compiled from: PrivacyUpdateRequestKt.kt */
/* loaded from: classes8.dex */
public final class PrivacyUpdateRequestKt {
    public static final PrivacyUpdateRequestKt INSTANCE = new PrivacyUpdateRequestKt();

    /* compiled from: PrivacyUpdateRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder _builder;

        /* compiled from: PrivacyUpdateRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build() {
            return this._builder.build();
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            return this._builder.getContent();
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString byteString) {
            this._builder.setContent(byteString);
        }

        public final void setVersion(int i) {
            this._builder.setVersion(i);
        }

        private Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private PrivacyUpdateRequestKt() {
    }
}

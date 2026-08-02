package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import xsna.zcl;

/* compiled from: PiiKt.kt */
/* loaded from: classes8.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    /* compiled from: PiiKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        /* compiled from: PiiKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            return this._builder.build();
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearAppsetId() {
            this._builder.clearAppsetId();
        }

        public final void clearFid() {
            this._builder.clearFid();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            return this._builder.getAdvertisingId();
        }

        public final String getAppsetId() {
            return this._builder.getAppsetId();
        }

        public final String getFid() {
            return this._builder.getFid();
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            return this._builder.getOpenAdvertisingTrackingId();
        }

        public final ByteString getVendorId() {
            return this._builder.getVendorId();
        }

        public final boolean hasAppsetId() {
            return this._builder.hasAppsetId();
        }

        public final boolean hasFid() {
            return this._builder.hasFid();
        }

        public final void setAdvertisingId(ByteString byteString) {
            this._builder.setAdvertisingId(byteString);
        }

        public final void setAppsetId(String str) {
            this._builder.setAppsetId(str);
        }

        public final void setFid(String str) {
            this._builder.setFid(str);
        }

        public final void setOpenAdvertisingTrackingId(ByteString byteString) {
            this._builder.setOpenAdvertisingTrackingId(byteString);
        }

        public final void setVendorId(ByteString byteString) {
            this._builder.setVendorId(byteString);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }
    }

    private PiiKt() {
    }
}

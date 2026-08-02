package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import xsna.ozl;
import xsna.zcl;

/* compiled from: TransactionDataKt.kt */
/* loaded from: classes8.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    /* compiled from: TransactionDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        /* compiled from: TransactionDataKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            return this._builder.build();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            return this._builder.getEventId();
        }

        public final String getJwsRepresentation() {
            return this._builder.getJwsRepresentation();
        }

        public final String getProduct() {
            return this._builder.getProduct();
        }

        public final String getProductId() {
            return this._builder.getProductId();
        }

        public final String getReceipt() {
            return this._builder.getReceipt();
        }

        public final String getSignature() {
            return this._builder.getSignature();
        }

        public final Timestamp getTimestamp() {
            return this._builder.getTimestamp();
        }

        public final String getTransaction() {
            return this._builder.getTransaction();
        }

        public final String getTransactionId() {
            return this._builder.getTransactionId();
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            return this._builder.getTransactionState();
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString byteString) {
            this._builder.setEventId(byteString);
        }

        public final void setJwsRepresentation(String str) {
            this._builder.setJwsRepresentation(str);
        }

        public final void setProduct(String str) {
            this._builder.setProduct(str);
        }

        public final void setProductId(String str) {
            this._builder.setProductId(str);
        }

        public final void setReceipt(String str) {
            this._builder.setReceipt(str);
        }

        public final void setSignature(String str) {
            this._builder.setSignature(str);
        }

        public final void setTimestamp(Timestamp timestamp) {
            this._builder.setTimestamp(timestamp);
        }

        public final void setTransaction(String str) {
            this._builder.setTransaction(str);
        }

        public final void setTransactionId(String str) {
            this._builder.setTransactionId(str);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState transactionState) {
            this._builder.setTransactionState(transactionState);
        }

        public final void setTransactionStateValue(int i) {
            this._builder.setTransactionStateValue(i);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        @ozl
        public static /* synthetic */ void getReceipt$annotations() {
        }
    }

    private TransactionDataKt() {
    }
}

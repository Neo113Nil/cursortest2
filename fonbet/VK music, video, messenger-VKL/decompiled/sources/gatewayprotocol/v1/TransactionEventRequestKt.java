package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import xsna.zcl;

/* compiled from: TransactionEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class TransactionEventRequestKt {
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    /* compiled from: TransactionEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        /* compiled from: TransactionEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: TransactionEventRequestKt.kt */
        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            return this._builder.build();
        }

        /* renamed from: addAllTransactionData, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllTransactionData(DslList dslList, Iterable iterable) {
            this._builder.addAllTransactionData(iterable);
        }

        /* renamed from: addTransactionData, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData transactionData) {
            this._builder.addTransactionData(transactionData);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            this._builder.clearTransactionData();
        }

        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            return this._builder.getAppStore();
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final String getCustomStore() {
            return this._builder.getCustomStore();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final String getGooglePlayBillingLibraryVersion() {
            return this._builder.getGooglePlayBillingLibraryVersion();
        }

        public final TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            return this._builder.getOrigin();
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final ByteString getReceipt() {
            return this._builder.getReceipt();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            return this._builder.getStoreKitVersion();
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final /* synthetic */ DslList getTransactionData() {
            return new DslList(this._builder.getTransactionDataList());
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAppStore(TransactionEventRequestOuterClass.StoreType storeType) {
            this._builder.setAppStore(storeType);
        }

        public final void setAppStoreValue(int i) {
            this._builder.setAppStoreValue(i);
        }

        public final void setCustomStore(String str) {
            this._builder.setCustomStore(str);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setGooglePlayBillingLibraryVersion(String str) {
            this._builder.setGooglePlayBillingLibraryVersion(str);
        }

        public final void setOrigin(TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
            this._builder.setOrigin(transactionOrigin);
        }

        public final void setOriginValue(int i) {
            this._builder.setOriginValue(i);
        }

        public final void setReceipt(ByteString byteString) {
            this._builder.setReceipt(byteString);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setStoreKitVersion(TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion) {
            this._builder.setStoreKitVersion(storeKitVersion);
        }

        public final void setStoreKitVersionValue(int i) {
            this._builder.setStoreKitVersionValue(i);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i, TransactionEventRequestOuterClass.TransactionData transactionData) {
            this._builder.setTransactionData(i, transactionData);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionEventRequestKt() {
    }
}

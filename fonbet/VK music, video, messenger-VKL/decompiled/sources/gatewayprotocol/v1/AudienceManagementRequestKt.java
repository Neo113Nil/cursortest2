package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.zcl;

/* compiled from: AudienceManagementRequestKt.kt */
/* loaded from: classes8.dex */
public final class AudienceManagementRequestKt {
    public static final AudienceManagementRequestKt INSTANCE = new AudienceManagementRequestKt();

    /* compiled from: AudienceManagementRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder _builder;

        /* compiled from: AudienceManagementRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementRequestOuterClass.AudienceManagementRequest _build() {
            return this._builder.build();
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final ByteString getAudienceManagementData() {
            return this._builder.getAudienceManagementData();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            return this._builder.getSessionCounters();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAudienceManagementData(ByteString byteString) {
            this._builder.setAudienceManagementData(byteString);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        private Dsl(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AudienceManagementRequestKt() {
    }
}

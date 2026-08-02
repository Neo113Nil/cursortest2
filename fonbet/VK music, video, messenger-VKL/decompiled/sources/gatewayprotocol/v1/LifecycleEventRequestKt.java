package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import xsna.zcl;

/* compiled from: LifecycleEventRequestKt.kt */
/* loaded from: classes8.dex */
public final class LifecycleEventRequestKt {
    public static final LifecycleEventRequestKt INSTANCE = new LifecycleEventRequestKt();

    /* compiled from: LifecycleEventRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder _builder;

        /* compiled from: LifecycleEventRequestKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ LifecycleEventRequestOuterClass.LifecycleEventRequest _build() {
            return this._builder.build();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearLifecycleEventType() {
            this._builder.clearLifecycleEventType();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            return this._builder.getDynamicDeviceInfo();
        }

        public final ByteString getEventId() {
            return this._builder.getEventId();
        }

        public final LifecycleEventRequestOuterClass.LifecycleEventType getLifecycleEventType() {
            return this._builder.getLifecycleEventType();
        }

        public final int getLifecycleEventTypeValue() {
            return this._builder.getLifecycleEventTypeValue();
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            return this._builder.getStaticDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setEventId(ByteString byteString) {
            this._builder.setEventId(byteString);
        }

        public final void setLifecycleEventType(LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType) {
            this._builder.setLifecycleEventType(lifecycleEventType);
        }

        public final void setLifecycleEventTypeValue(int i) {
            this._builder.setLifecycleEventTypeValue(i);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        private Dsl(LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private LifecycleEventRequestKt() {
    }
}

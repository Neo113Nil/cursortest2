package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import xsna.zcl;

/* compiled from: DebugSettingsKt.kt */
/* loaded from: classes8.dex */
public final class DebugSettingsKt {
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    /* compiled from: DebugSettingsKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        /* compiled from: DebugSettingsKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            return this._builder.build();
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setCleanCache(boolean z) {
            this._builder.setCleanCache(z);
        }

        public final void setEnableTracing(boolean z) {
            this._builder.setEnableTracing(z);
        }

        public final void setWebviewInspectable(boolean z) {
            this._builder.setWebviewInspectable(z);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }
    }

    private DebugSettingsKt() {
    }
}

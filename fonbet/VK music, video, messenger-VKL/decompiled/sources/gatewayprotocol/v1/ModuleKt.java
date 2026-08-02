package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ModuleOuterClass;
import xsna.zcl;

/* compiled from: ModuleKt.kt */
/* loaded from: classes8.dex */
public final class ModuleKt {
    public static final ModuleKt INSTANCE = new ModuleKt();

    /* compiled from: ModuleKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ModuleOuterClass.Module.Builder _builder;

        /* compiled from: ModuleKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ModuleOuterClass.Module.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ModuleOuterClass.Module.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ ModuleOuterClass.Module _build() {
            return this._builder.build();
        }

        public final void clearConfig() {
            this._builder.clearConfig();
        }

        public final void clearInitializerClass() {
            this._builder.clearInitializerClass();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final ByteString getConfig() {
            return this._builder.getConfig();
        }

        public final String getInitializerClass() {
            return this._builder.getInitializerClass();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final void setConfig(ByteString byteString) {
            this._builder.setConfig(byteString);
        }

        public final void setInitializerClass(String str) {
            this._builder.setInitializerClass(str);
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        private Dsl(ModuleOuterClass.Module.Builder builder) {
            this._builder = builder;
        }
    }

    private ModuleKt() {
    }
}

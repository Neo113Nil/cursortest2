package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import xsna.zcl;

/* compiled from: DeveloperConsentOptionKt.kt */
/* loaded from: classes8.dex */
public final class DeveloperConsentOptionKt {
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    /* compiled from: DeveloperConsentOptionKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        /* compiled from: DeveloperConsentOptionKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            return this._builder.build();
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomType() {
            return this._builder.getCustomType();
        }

        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            return this._builder.getType();
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            return this._builder.getValue();
        }

        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final void setCustomType(String str) {
            this._builder.setCustomType(str);
        }

        public final void setType(DeveloperConsentOuterClass.DeveloperConsentType developerConsentType) {
            this._builder.setType(developerConsentType);
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        public final void setValue(DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoice) {
            this._builder.setValue(developerConsentChoice);
        }

        public final void setValueValue(int i) {
            this._builder.setValueValue(i);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentOptionKt() {
    }
}

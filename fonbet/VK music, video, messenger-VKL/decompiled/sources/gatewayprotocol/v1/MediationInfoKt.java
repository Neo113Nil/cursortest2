package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import xsna.zcl;

/* compiled from: MediationInfoKt.kt */
/* loaded from: classes8.dex */
public final class MediationInfoKt {
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    /* compiled from: MediationInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        /* compiled from: MediationInfoKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            return this._builder.build();
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final String getAdapterVersion() {
            return this._builder.getAdapterVersion();
        }

        public final String getCustomName() {
            return this._builder.getCustomName();
        }

        public final ClientInfoOuterClass.MediationProvider getProvider() {
            return this._builder.getProvider();
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        public final String getVersion() {
            return this._builder.getVersion();
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(String str) {
            this._builder.setAdapterVersion(str);
        }

        public final void setCustomName(String str) {
            this._builder.setCustomName(str);
        }

        public final void setProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this._builder.setProvider(mediationProvider);
        }

        public final void setProviderValue(int i) {
            this._builder.setProviderValue(i);
        }

        public final void setVersion(String str) {
            this._builder.setVersion(str);
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private MediationInfoKt() {
    }
}

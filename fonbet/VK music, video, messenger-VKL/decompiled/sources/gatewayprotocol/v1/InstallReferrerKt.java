package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import xsna.zcl;

/* compiled from: InstallReferrerKt.kt */
/* loaded from: classes8.dex */
public final class InstallReferrerKt {
    public static final InstallReferrerKt INSTANCE = new InstallReferrerKt();

    /* compiled from: InstallReferrerKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InstallReferrer.Builder _builder;

        /* compiled from: InstallReferrerKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InstallReferrer _build() {
            return this._builder.build();
        }

        public final void clearClickTime() {
            this._builder.clearClickTime();
        }

        public final void clearInstallTime() {
            this._builder.clearInstallTime();
        }

        public final void clearInstantExperienceLunch() {
            this._builder.clearInstantExperienceLunch();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final long getClickTime() {
            return this._builder.getClickTime();
        }

        public final long getInstallTime() {
            return this._builder.getInstallTime();
        }

        public final boolean getInstantExperienceLunch() {
            return this._builder.getInstantExperienceLunch();
        }

        public final String getUrl() {
            return this._builder.getUrl();
        }

        public final void setClickTime(long j) {
            this._builder.setClickTime(j);
        }

        public final void setInstallTime(long j) {
            this._builder.setInstallTime(j);
        }

        public final void setInstantExperienceLunch(boolean z) {
            this._builder.setInstantExperienceLunch(z);
        }

        public final void setUrl(String str) {
            this._builder.setUrl(str);
        }

        private Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
            this._builder = builder;
        }
    }

    private InstallReferrerKt() {
    }
}

package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import xsna.ozl;
import xsna.zcl;

/* compiled from: DiagnosticTagKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticTagKt {
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    /* compiled from: DiagnosticTagKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        /* compiled from: DiagnosticTagKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: DiagnosticTagKt.kt */
        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            return this._builder.build();
        }

        /* renamed from: addAllTagType, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllTagType(DslList dslList, Iterable iterable) {
            this._builder.addAllTagType(iterable);
        }

        /* renamed from: addTagType, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            this._builder.addTagType(diagnosticTagType);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            this._builder.clearTagType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomTagType() {
            return this._builder.getCustomTagType();
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        public final String getStringValue() {
            return this._builder.getStringValue();
        }

        public final /* synthetic */ DslList getTagType() {
            return new DslList(this._builder.getTagTypeList());
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTagType getType() {
            return this._builder.getType();
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            return this._builder.getValueCase();
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final void setCustomTagType(String str) {
            this._builder.setCustomTagType(str);
        }

        public final void setIntValue(int i) {
            this._builder.setIntValue(i);
        }

        public final void setStringValue(String str) {
            this._builder.setStringValue(str);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            this._builder.setTagType(i, diagnosticTagType);
        }

        public final void setType(DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            this._builder.setType(diagnosticTagType);
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }

        @ozl
        public static /* synthetic */ void getTagType$annotations() {
        }
    }

    private DiagnosticTagKt() {
    }
}

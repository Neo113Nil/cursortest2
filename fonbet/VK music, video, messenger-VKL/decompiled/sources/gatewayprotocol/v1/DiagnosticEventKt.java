package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.Map;
import xsna.zcl;

/* compiled from: DiagnosticEventKt.kt */
/* loaded from: classes8.dex */
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* compiled from: DiagnosticEventKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* compiled from: DiagnosticEventKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: DiagnosticEventKt.kt */
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* compiled from: DiagnosticEventKt.kt */
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        /* compiled from: DiagnosticEventKt.kt */
        public static final class TagsProxy extends DslProxy {
            private TagsProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            return this._builder.build();
        }

        /* renamed from: addAllTags, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllTags(DslList dslList, Iterable iterable) {
            this._builder.addAllTags(iterable);
        }

        /* renamed from: addTags, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignTags(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            this._builder.addTags(diagnosticTag);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            this._builder.clearStringTags();
        }

        public final /* synthetic */ void clearTags(DslList dslList) {
            this._builder.clearTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            return this._builder.getAdFormat();
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            return this._builder.getAdType();
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        public final String getCustomEventType() {
            return this._builder.getCustomEventType();
        }

        public final ByteString getErrorToken() {
            return this._builder.getErrorToken();
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            return this._builder.getEventType();
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        public final ByteString getImpressionOpportunityId() {
            return this._builder.getImpressionOpportunityId();
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            return new DslMap(this._builder.getIntTagsMap());
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            return this._builder.getPlacementId();
        }

        public final String getReason() {
            return this._builder.getReason();
        }

        public final String getReasonDebug() {
            return this._builder.getReasonDebug();
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            return new DslMap(this._builder.getStringTagsMap());
        }

        public final /* synthetic */ DslList getTags() {
            return new DslList(this._builder.getTagsList());
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            return this._builder.getTimestamps();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            this._builder.putAllStringTags(map);
        }

        /* renamed from: putIntTags, reason: merged with bridge method [inline-methods] */
        public final void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String str, int i) {
            this._builder.putIntTags(str, i);
        }

        /* renamed from: putStringTags, reason: merged with bridge method [inline-methods] */
        public final void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String str, String str2) {
            this._builder.putStringTags(str, str2);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String str) {
            this._builder.removeIntTags(str);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String str) {
            this._builder.removeStringTags(str);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
            this._builder.setAdType(diagnosticAdType);
        }

        public final void setAdTypeValue(int i) {
            this._builder.setAdTypeValue(i);
        }

        public final void setCustomEventType(String str) {
            this._builder.setCustomEventType(str);
        }

        public final void setErrorToken(ByteString byteString) {
            this._builder.setErrorToken(byteString);
        }

        public final void setEventId(int i) {
            this._builder.setEventId(i);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            this._builder.setEventType(diagnosticEventType);
        }

        public final void setEventTypeValue(int i) {
            this._builder.setEventTypeValue(i);
        }

        public final void setHeaderBiddingTokenNumber(int i) {
            this._builder.setHeaderBiddingTokenNumber(i);
        }

        public final void setImpressionOpportunityId(ByteString byteString) {
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setIsHeaderBidding(boolean z) {
            this._builder.setIsHeaderBidding(z);
        }

        public final void setPlacementId(String str) {
            this._builder.setPlacementId(str);
        }

        public final void setReason(String str) {
            this._builder.setReason(str);
        }

        public final void setReasonDebug(String str) {
            this._builder.setReasonDebug(str);
        }

        public final /* synthetic */ void setTags(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag) {
            this._builder.setTags(i, diagnosticTag);
        }

        public final void setTimeValue(double d) {
            this._builder.setTimeValue(d);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            this._builder.setTimestamps(timestamps);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventKt() {
    }
}

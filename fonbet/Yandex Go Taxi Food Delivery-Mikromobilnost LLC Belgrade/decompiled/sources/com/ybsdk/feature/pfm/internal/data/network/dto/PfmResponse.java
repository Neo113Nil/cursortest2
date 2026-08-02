package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.fcb0;
import defpackage.gcb0;
import defpackage.hcb0;
import defpackage.icb0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kcb0;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.JCSP;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001:\u001c./0123456789:;<=>?@ABCDEFGHIBO\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0001\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\b\u0003\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0015R'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019¨\u0006J"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse;", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;", "funFact", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "transactions", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;", "filters", "", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/SectionKey;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Analytics;", "analytics", "cursor", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "component3", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;", "component4", "()Ljava/util/Map;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;Ljava/util/Map;Ljava/lang/String;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;", "getFunFact", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "getTransactions", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;", "getFilters", "Ljava/util/Map;", "getAnalytics", "Ljava/lang/String;", "getCursor", "FunFactData", "FunFactDivItem", "TransactionsData", "TransactionListItem", "FeedFilters", "Filter", "FilterMode", "FilterContentType", "gcb0", "FilterInnerContentType", "hcb0", "FeedFilterInnerContent", "DateFilterPreselectedDates", "PfmBottomSheetContentType", "fcb0", "SelectableListItem", "ToggleListItem", "PfmMoney", "Spoiler", "TextType", "PfmText", "PfmNodeTextContentType", "jcb0", "kcb0", "NodeType", "Analytics", "Node", "icb0", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PfmResponse {
    private final Map<String, Analytics> analytics;
    private final String cursor;
    private final FeedFilters filters;
    private final FunFactData funFact;
    private final TransactionsData transactions;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Analytics;", "", "root", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Node;", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Node;)V", "getRoot", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Node;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {
        private final Node root;

        public Analytics(@Json(name = "root") Node node) {
            this.root = node;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, Node node, int i, Object obj) {
            if ((i & 1) != 0) {
                node = analytics.root;
            }
            return analytics.copy(node);
        }

        /* renamed from: component1, reason: from getter */
        public final Node getRoot() {
            return this.root;
        }

        public final Analytics copy(@Json(name = "root") Node root) {
            return new Analytics(root);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Analytics) && jl40.l(this.root, ((Analytics) other).root);
        }

        public final Node getRoot() {
            return this.root;
        }

        public int hashCode() {
            return this.root.hashCode();
        }

        public String toString() {
            return "Analytics(root=" + this.root + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$DateFilterPreselectedDates;", "", "startInclusive", "Ljava/util/Calendar;", "endExclusive", "<init>", "(Ljava/util/Calendar;Ljava/util/Calendar;)V", "getStartInclusive", "()Ljava/util/Calendar;", "getEndExclusive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DateFilterPreselectedDates {
        private final Calendar endExclusive;
        private final Calendar startInclusive;

        public DateFilterPreselectedDates(@Json(name = "start_inclusive") Calendar calendar, @Json(name = "end_exclusive") Calendar calendar2) {
            this.startInclusive = calendar;
            this.endExclusive = calendar2;
        }

        public static /* synthetic */ DateFilterPreselectedDates copy$default(DateFilterPreselectedDates dateFilterPreselectedDates, Calendar calendar, Calendar calendar2, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = dateFilterPreselectedDates.startInclusive;
            }
            if ((i & 2) != 0) {
                calendar2 = dateFilterPreselectedDates.endExclusive;
            }
            return dateFilterPreselectedDates.copy(calendar, calendar2);
        }

        /* renamed from: component1, reason: from getter */
        public final Calendar getStartInclusive() {
            return this.startInclusive;
        }

        /* renamed from: component2, reason: from getter */
        public final Calendar getEndExclusive() {
            return this.endExclusive;
        }

        public final DateFilterPreselectedDates copy(@Json(name = "start_inclusive") Calendar startInclusive, @Json(name = "end_exclusive") Calendar endExclusive) {
            return new DateFilterPreselectedDates(startInclusive, endExclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateFilterPreselectedDates)) {
                return false;
            }
            DateFilterPreselectedDates dateFilterPreselectedDates = (DateFilterPreselectedDates) other;
            return jl40.l(this.startInclusive, dateFilterPreselectedDates.startInclusive) && jl40.l(this.endExclusive, dateFilterPreselectedDates.endExclusive);
        }

        public final Calendar getEndExclusive() {
            return this.endExclusive;
        }

        public final Calendar getStartInclusive() {
            return this.startInclusive;
        }

        public int hashCode() {
            return this.endExclusive.hashCode() + (this.startInclusive.hashCode() * 31);
        }

        public String toString() {
            return "DateFilterPreselectedDates(startInclusive=" + this.startInclusive + ", endExclusive=" + this.endExclusive + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "title", "Lfcb0;", "content", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Lfcb0;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "component2", "()Lfcb0;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Lfcb0;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "getTitle", "Lfcb0;", "getContent", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedFilterInnerContent {
        private final fcb0 content;
        private final PfmResponse$PfmTextContent$Plain title;

        public FeedFilterInnerContent(@Json(name = "title") PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, @Json(name = "content") fcb0 fcb0Var) {
            this.title = pfmResponse$PfmTextContent$Plain;
            this.content = fcb0Var;
        }

        public static /* synthetic */ FeedFilterInnerContent copy$default(FeedFilterInnerContent feedFilterInnerContent, PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, fcb0 fcb0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                pfmResponse$PfmTextContent$Plain = feedFilterInnerContent.title;
            }
            if ((i & 2) != 0) {
                fcb0Var = feedFilterInnerContent.content;
            }
            return feedFilterInnerContent.copy(pfmResponse$PfmTextContent$Plain, fcb0Var);
        }

        /* renamed from: component1, reason: from getter */
        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final fcb0 getContent() {
            return this.content;
        }

        public final FeedFilterInnerContent copy(@Json(name = "title") PfmResponse$PfmTextContent$Plain title, @Json(name = "content") fcb0 content) {
            return new FeedFilterInnerContent(title, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedFilterInnerContent)) {
                return false;
            }
            FeedFilterInnerContent feedFilterInnerContent = (FeedFilterInnerContent) other;
            return jl40.l(this.title, feedFilterInnerContent.title) && jl40.l(this.content, feedFilterInnerContent.content);
        }

        public final fcb0 getContent() {
            return this.content;
        }

        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.content.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "FeedFilterInnerContent(title=" + this.title + ", content=" + this.content + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilters;", "", "content", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Filter;", "<init>", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedFilters {
        private final List<Filter> content;

        public FeedFilters(@Json(name = "content") List<Filter> list) {
            this.content = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeedFilters copy$default(FeedFilters feedFilters, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = feedFilters.content;
            }
            return feedFilters.copy(list);
        }

        public final List<Filter> component1() {
            return this.content;
        }

        public final FeedFilters copy(@Json(name = "content") List<Filter> content) {
            return new FeedFilters(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeedFilters) && jl40.l(this.content, ((FeedFilters) other).content);
        }

        public final List<Filter> getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return tse0.k("FeedFilters(content=", Extension.C_BRAKE, this.content);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Filter;", "", "", "logId", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;", "filterMode", "Lgcb0;", "filterContent", "Lhcb0;", "innerContent", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;Lgcb0;Lhcb0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;", "component3", "()Lgcb0;", "component4", "()Lhcb0;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;Lgcb0;Lhcb0;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Filter;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLogId", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;", "getFilterMode", "Lgcb0;", "getFilterContent", "Lhcb0;", "getInnerContent", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {
        private final gcb0 filterContent;
        private final FilterMode filterMode;
        private final hcb0 innerContent;
        private final String logId;

        public Filter(@Json(name = "log_id") String str, @Json(name = "filter_mode") FilterMode filterMode, @Json(name = "filter_content") gcb0 gcb0Var, @Json(name = "inner_content") hcb0 hcb0Var) {
            this.logId = str;
            this.filterMode = filterMode;
            this.filterContent = gcb0Var;
            this.innerContent = hcb0Var;
        }

        public static /* synthetic */ Filter copy$default(Filter filter, String str, FilterMode filterMode, gcb0 gcb0Var, hcb0 hcb0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = filter.logId;
            }
            if ((i & 2) != 0) {
                filterMode = filter.filterMode;
            }
            if ((i & 4) != 0) {
                gcb0Var = filter.filterContent;
            }
            if ((i & 8) != 0) {
                hcb0Var = filter.innerContent;
            }
            return filter.copy(str, filterMode, gcb0Var, hcb0Var);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogId() {
            return this.logId;
        }

        /* renamed from: component2, reason: from getter */
        public final FilterMode getFilterMode() {
            return this.filterMode;
        }

        /* renamed from: component3, reason: from getter */
        public final gcb0 getFilterContent() {
            return this.filterContent;
        }

        /* renamed from: component4, reason: from getter */
        public final hcb0 getInnerContent() {
            return this.innerContent;
        }

        public final Filter copy(@Json(name = "log_id") String logId, @Json(name = "filter_mode") FilterMode filterMode, @Json(name = "filter_content") gcb0 filterContent, @Json(name = "inner_content") hcb0 innerContent) {
            return new Filter(logId, filterMode, filterContent, innerContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return jl40.l(this.logId, filter.logId) && this.filterMode == filter.filterMode && jl40.l(this.filterContent, filter.filterContent) && jl40.l(this.innerContent, filter.innerContent);
        }

        public final gcb0 getFilterContent() {
            return this.filterContent;
        }

        public final FilterMode getFilterMode() {
            return this.filterMode;
        }

        public final hcb0 getInnerContent() {
            return this.innerContent;
        }

        public final String getLogId() {
            return this.logId;
        }

        public int hashCode() {
            return this.innerContent.hashCode() + ((this.filterContent.hashCode() + ((this.filterMode.hashCode() + (this.logId.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Filter(logId=" + this.logId + ", filterMode=" + this.filterMode + ", filterContent=" + this.filterContent + ", innerContent=" + this.innerContent + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "", "<init>", "(Ljava/lang/String;I)V", "ICON", "TITLE", "ICON_AND_TITLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterContentType[] $VALUES;
        public static final FilterContentType ICON = new FilterContentType("ICON", 0);
        public static final FilterContentType TITLE = new FilterContentType("TITLE", 1);
        public static final FilterContentType ICON_AND_TITLE = new FilterContentType("ICON_AND_TITLE", 2);

        private static final /* synthetic */ FilterContentType[] $values() {
            return new FilterContentType[]{ICON, TITLE, ICON_AND_TITLE};
        }

        static {
            FilterContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FilterContentType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FilterContentType valueOf(String str) {
            return (FilterContentType) Enum.valueOf(FilterContentType.class, str);
        }

        public static FilterContentType[] values() {
            return (FilterContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "", "<init>", "(Ljava/lang/String;I)V", "CUSTOM", "DATE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterInnerContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterInnerContentType[] $VALUES;
        public static final FilterInnerContentType CUSTOM = new FilterInnerContentType("CUSTOM", 0);
        public static final FilterInnerContentType DATE = new FilterInnerContentType("DATE", 1);

        private static final /* synthetic */ FilterInnerContentType[] $values() {
            return new FilterInnerContentType[]{CUSTOM, DATE};
        }

        static {
            FilterInnerContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FilterInnerContentType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FilterInnerContentType valueOf(String str) {
            return (FilterInnerContentType) Enum.valueOf(FilterInnerContentType.class, str);
        }

        public static FilterInnerContentType[] values() {
            return (FilterInnerContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterMode;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SELECTABLE", "SELECTABLE_AND_RESETTABLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FilterMode[] $VALUES;
        public static final FilterMode IDLE = new FilterMode("IDLE", 0);
        public static final FilterMode SELECTABLE = new FilterMode("SELECTABLE", 1);
        public static final FilterMode SELECTABLE_AND_RESETTABLE = new FilterMode("SELECTABLE_AND_RESETTABLE", 2);

        private static final /* synthetic */ FilterMode[] $values() {
            return new FilterMode[]{IDLE, SELECTABLE, SELECTABLE_AND_RESETTABLE};
        }

        static {
            FilterMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private FilterMode(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FilterMode valueOf(String str) {
            return (FilterMode) Enum.valueOf(FilterMode.class, str);
        }

        public static FilterMode[] values() {
            return (FilterMode[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactData;", "", "backgroundBlurColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "divkitItem", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactDivItem;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactDivItem;)V", "getBackgroundBlurColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getDivkitItem", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactDivItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FunFactData {
        private final Themes<String> backgroundBlurColor;
        private final FunFactDivItem divkitItem;

        public FunFactData(@Json(name = "background_blur_color") Themes<String> themes, @Json(name = "divkit_item") FunFactDivItem funFactDivItem) {
            this.backgroundBlurColor = themes;
            this.divkitItem = funFactDivItem;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FunFactData copy$default(FunFactData funFactData, Themes themes, FunFactDivItem funFactDivItem, int i, Object obj) {
            if ((i & 1) != 0) {
                themes = funFactData.backgroundBlurColor;
            }
            if ((i & 2) != 0) {
                funFactDivItem = funFactData.divkitItem;
            }
            return funFactData.copy(themes, funFactDivItem);
        }

        public final Themes<String> component1() {
            return this.backgroundBlurColor;
        }

        /* renamed from: component2, reason: from getter */
        public final FunFactDivItem getDivkitItem() {
            return this.divkitItem;
        }

        public final FunFactData copy(@Json(name = "background_blur_color") Themes<String> backgroundBlurColor, @Json(name = "divkit_item") FunFactDivItem divkitItem) {
            return new FunFactData(backgroundBlurColor, divkitItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FunFactData)) {
                return false;
            }
            FunFactData funFactData = (FunFactData) other;
            return jl40.l(this.backgroundBlurColor, funFactData.backgroundBlurColor) && jl40.l(this.divkitItem, funFactData.divkitItem);
        }

        public final Themes<String> getBackgroundBlurColor() {
            return this.backgroundBlurColor;
        }

        public final FunFactDivItem getDivkitItem() {
            return this.divkitItem;
        }

        public int hashCode() {
            return this.divkitItem.hashCode() + (this.backgroundBlurColor.hashCode() * 31);
        }

        public String toString() {
            return "FunFactData(backgroundBlurColor=" + this.backgroundBlurColor + ", divkitItem=" + this.divkitItem + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FunFactDivItem;", "", "logId", "", "divJson", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getLogId", "()Ljava/lang/String;", "getDivJson", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FunFactDivItem {
        private final DivDataDto divJson;
        private final String logId;

        public FunFactDivItem(@Json(name = "log_id") String str, @Json(name = "div_json") DivDataDto divDataDto) {
            this.logId = str;
            this.divJson = divDataDto;
        }

        public static /* synthetic */ FunFactDivItem copy$default(FunFactDivItem funFactDivItem, String str, DivDataDto divDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = funFactDivItem.logId;
            }
            if ((i & 2) != 0) {
                divDataDto = funFactDivItem.divJson;
            }
            return funFactDivItem.copy(str, divDataDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogId() {
            return this.logId;
        }

        /* renamed from: component2, reason: from getter */
        public final DivDataDto getDivJson() {
            return this.divJson;
        }

        public final FunFactDivItem copy(@Json(name = "log_id") String logId, @Json(name = "div_json") DivDataDto divJson) {
            return new FunFactDivItem(logId, divJson);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FunFactDivItem)) {
                return false;
            }
            FunFactDivItem funFactDivItem = (FunFactDivItem) other;
            return jl40.l(this.logId, funFactDivItem.logId) && jl40.l(this.divJson, funFactDivItem.divJson);
        }

        public final DivDataDto getDivJson() {
            return this.divJson;
        }

        public final String getLogId() {
            return this.logId;
        }

        public int hashCode() {
            return this.divJson.hashCode() + (this.logId.hashCode() * 31);
        }

        public String toString() {
            return "FunFactDivItem(logId=" + this.logId + ", divJson=" + this.divJson + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Node;", "", "", "logId", "", "children", "Licb0;", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;Licb0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Licb0;", "copy", "(Ljava/lang/String;Ljava/util/List;Licb0;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Node;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLogId", "Ljava/util/List;", "getChildren", "Licb0;", "getContent", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Node {
        private final List<Node> children;
        private final icb0 content;
        private final String logId;

        public Node(@Json(name = "log_id") String str, @Json(name = "children") List<Node> list, @Json(name = "content") icb0 icb0Var) {
            this.logId = str;
            this.children = list;
            this.content = icb0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Node copy$default(Node node, String str, List list, icb0 icb0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = node.logId;
            }
            if ((i & 2) != 0) {
                list = node.children;
            }
            if ((i & 4) != 0) {
                icb0Var = node.content;
            }
            return node.copy(str, list, icb0Var);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogId() {
            return this.logId;
        }

        public final List<Node> component2() {
            return this.children;
        }

        /* renamed from: component3, reason: from getter */
        public final icb0 getContent() {
            return this.content;
        }

        public final Node copy(@Json(name = "log_id") String logId, @Json(name = "children") List<Node> children, @Json(name = "content") icb0 content) {
            return new Node(logId, children, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Node)) {
                return false;
            }
            Node node = (Node) other;
            return jl40.l(this.logId, node.logId) && jl40.l(this.children, node.children) && jl40.l(this.content, node.content);
        }

        public final List<Node> getChildren() {
            return this.children;
        }

        public final icb0 getContent() {
            return this.content;
        }

        public final String getLogId() {
            return this.logId;
        }

        public int hashCode() {
            return this.content.hashCode() + unr0.c(this.logId.hashCode() * 31, 31, this.children);
        }

        public String toString() {
            String str = this.logId;
            List<Node> list = this.children;
            icb0 icb0Var = this.content;
            StringBuilder r = xvz.r("Node(logId=", str, ", children=", list, ", content=");
            r.append(icb0Var);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW", JCSP.ROOT_STORE_NAME, "UNKNOWN", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class NodeType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NodeType[] $VALUES;
        public static final NodeType VIEW = new NodeType("VIEW", 0);
        public static final NodeType ROOT = new NodeType(JCSP.ROOT_STORE_NAME, 1);
        public static final NodeType UNKNOWN = new NodeType("UNKNOWN", 2);

        private static final /* synthetic */ NodeType[] $values() {
            return new NodeType[]{VIEW, ROOT, UNKNOWN};
        }

        static {
            NodeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private NodeType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static NodeType valueOf(String str) {
            return (NodeType) Enum.valueOf(NodeType.class, str);
        }

        public static NodeType[] values() {
            return (NodeType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTABLE", "TOGGLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PfmBottomSheetContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PfmBottomSheetContentType[] $VALUES;
        public static final PfmBottomSheetContentType SELECTABLE = new PfmBottomSheetContentType("SELECTABLE", 0);
        public static final PfmBottomSheetContentType TOGGLE = new PfmBottomSheetContentType("TOGGLE", 1);

        private static final /* synthetic */ PfmBottomSheetContentType[] $values() {
            return new PfmBottomSheetContentType[]{SELECTABLE, TOGGLE};
        }

        static {
            PfmBottomSheetContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PfmBottomSheetContentType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PfmBottomSheetContentType valueOf(String str) {
            return (PfmBottomSheetContentType) Enum.valueOf(PfmBottomSheetContentType.class, str);
        }

        public static PfmBottomSheetContentType[] values() {
            return (PfmBottomSheetContentType[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\"#\u0004$B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "", "Ljava/math/BigDecimal;", "amount", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;", "currency", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;", "signType", "<init>", "(Ljava/math/BigDecimal;Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;", "component3", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;", "copy", "(Ljava/math/BigDecimal;Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/a;", "getCurrency", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;", "getSignType", "SignType", "CurrencyType", "LoyaltyCurrencyType", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PfmMoney {
        private final BigDecimal amount;
        private final a currency;
        private final SignType signType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$CurrencyType;", "", "<init>", "(Ljava/lang/String;I)V", "FIAT", Card.CARD_TYPE_LOYALTY, "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CurrencyType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ CurrencyType[] $VALUES;
            public static final CurrencyType FIAT = new CurrencyType("FIAT", 0);
            public static final CurrencyType LOYALTY = new CurrencyType(Card.CARD_TYPE_LOYALTY, 1);

            private static final /* synthetic */ CurrencyType[] $values() {
                return new CurrencyType[]{FIAT, LOYALTY};
            }

            static {
                CurrencyType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private CurrencyType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static CurrencyType valueOf(String str) {
                return (CurrencyType) Enum.valueOf(CurrencyType.class, str);
            }

            public static CurrencyType[] values() {
                return (CurrencyType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$LoyaltyCurrencyType;", "", "<init>", "(Ljava/lang/String;I)V", "PLUS", "X5", "S7", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LoyaltyCurrencyType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ LoyaltyCurrencyType[] $VALUES;
            public static final LoyaltyCurrencyType PLUS = new LoyaltyCurrencyType("PLUS", 0);
            public static final LoyaltyCurrencyType X5 = new LoyaltyCurrencyType("X5", 1);
            public static final LoyaltyCurrencyType S7 = new LoyaltyCurrencyType("S7", 2);

            private static final /* synthetic */ LoyaltyCurrencyType[] $values() {
                return new LoyaltyCurrencyType[]{PLUS, X5, S7};
            }

            static {
                LoyaltyCurrencyType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private LoyaltyCurrencyType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static LoyaltyCurrencyType valueOf(String str) {
                return (LoyaltyCurrencyType) Enum.valueOf(LoyaltyCurrencyType.class, str);
            }

            public static LoyaltyCurrencyType[] values() {
                return (LoyaltyCurrencyType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmMoney$SignType;", "", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_CREDIT, Card.CARD_TYPE_DEBIT, "NEUTRAL", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SignType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ SignType[] $VALUES;
            public static final SignType CREDIT = new SignType(Card.CARD_TYPE_CREDIT, 0);
            public static final SignType DEBIT = new SignType(Card.CARD_TYPE_DEBIT, 1);
            public static final SignType NEUTRAL = new SignType("NEUTRAL", 2);

            private static final /* synthetic */ SignType[] $values() {
                return new SignType[]{CREDIT, DEBIT, NEUTRAL};
            }

            static {
                SignType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private SignType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static SignType valueOf(String str) {
                return (SignType) Enum.valueOf(SignType.class, str);
            }

            public static SignType[] values() {
                return (SignType[]) $VALUES.clone();
            }
        }

        public PfmMoney(@Json(name = "amount") BigDecimal bigDecimal, @Json(name = "currency") a aVar, @Json(name = "sign_type") SignType signType) {
            this.amount = bigDecimal;
            this.currency = aVar;
            this.signType = signType;
        }

        public static /* synthetic */ PfmMoney copy$default(PfmMoney pfmMoney, BigDecimal bigDecimal, a aVar, SignType signType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = pfmMoney.amount;
            }
            if ((i & 2) != 0) {
                aVar = pfmMoney.currency;
            }
            if ((i & 4) != 0) {
                signType = pfmMoney.signType;
            }
            return pfmMoney.copy(bigDecimal, aVar, signType);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final a getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final SignType getSignType() {
            return this.signType;
        }

        public final PfmMoney copy(@Json(name = "amount") BigDecimal amount, @Json(name = "currency") a currency, @Json(name = "sign_type") SignType signType) {
            return new PfmMoney(amount, currency, signType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PfmMoney)) {
                return false;
            }
            PfmMoney pfmMoney = (PfmMoney) other;
            return jl40.l(this.amount, pfmMoney.amount) && jl40.l(this.currency, pfmMoney.currency) && this.signType == pfmMoney.signType;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final a getCurrency() {
            return this.currency;
        }

        public final SignType getSignType() {
            return this.signType;
        }

        public int hashCode() {
            return this.signType.hashCode() + ((this.currency.hashCode() + (this.amount.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "PfmMoney(amount=" + this.amount + ", currency=" + this.currency + ", signType=" + this.signType + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "MULTIPLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PfmNodeTextContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PfmNodeTextContentType[] $VALUES;
        public static final PfmNodeTextContentType SINGLE = new PfmNodeTextContentType("SINGLE", 0);
        public static final PfmNodeTextContentType MULTIPLE = new PfmNodeTextContentType("MULTIPLE", 1);

        private static final /* synthetic */ PfmNodeTextContentType[] $values() {
            return new PfmNodeTextContentType[]{SINGLE, MULTIPLE};
        }

        static {
            PfmNodeTextContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PfmNodeTextContentType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static PfmNodeTextContentType valueOf(String str) {
            return (PfmNodeTextContentType) Enum.valueOf(PfmNodeTextContentType.class, str);
        }

        public static PfmNodeTextContentType[] values() {
            return (PfmNodeTextContentType[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "", "Lkcb0;", "content", "<init>", "(Lkcb0;)V", "component1", "()Lkcb0;", "copy", "(Lkcb0;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkcb0;", "getContent", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PfmText {
        private final kcb0 content;

        public PfmText(@Json(name = "content") kcb0 kcb0Var) {
            this.content = kcb0Var;
        }

        public static /* synthetic */ PfmText copy$default(PfmText pfmText, kcb0 kcb0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                kcb0Var = pfmText.content;
            }
            return pfmText.copy(kcb0Var);
        }

        /* renamed from: component1, reason: from getter */
        public final kcb0 getContent() {
            return this.content;
        }

        public final PfmText copy(@Json(name = "content") kcb0 content) {
            return new PfmText(content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PfmText) && jl40.l(this.content, ((PfmText) other).content);
        }

        public final kcb0 getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "PfmText(content=" + this.content + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\b\u0001\u0010\t\u001a\u00060\u0006j\u0002`\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\r\u0010\u0018\u001a\u00060\u0006j\u0002`\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\b\u0003\u0010\t\u001a\u00060\u0006j\u0002`\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u00060\u0006j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$SelectableListItem;", "", "title", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "icon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "subtitle", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "filterId", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/FilterId;", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;Ljava/lang/String;)V", "getTitle", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSubtitle", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "getFilterId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectableListItem {
        private final String filterId;
        private final Themes<String> icon;
        private final PfmText subtitle;
        private final PfmResponse$PfmTextContent$Plain title;

        public SelectableListItem(@Json(name = "title") PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, @Json(name = "icon") Themes<String> themes, @Json(name = "subtitle") PfmText pfmText, @Json(name = "filter_id") String str) {
            this.title = pfmResponse$PfmTextContent$Plain;
            this.icon = themes;
            this.subtitle = pfmText;
            this.filterId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectableListItem copy$default(SelectableListItem selectableListItem, PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, Themes themes, PfmText pfmText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                pfmResponse$PfmTextContent$Plain = selectableListItem.title;
            }
            if ((i & 2) != 0) {
                themes = selectableListItem.icon;
            }
            if ((i & 4) != 0) {
                pfmText = selectableListItem.subtitle;
            }
            if ((i & 8) != 0) {
                str = selectableListItem.filterId;
            }
            return selectableListItem.copy(pfmResponse$PfmTextContent$Plain, themes, pfmText, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        public final Themes<String> component2() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final PfmText getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFilterId() {
            return this.filterId;
        }

        public final SelectableListItem copy(@Json(name = "title") PfmResponse$PfmTextContent$Plain title, @Json(name = "icon") Themes<String> icon, @Json(name = "subtitle") PfmText subtitle, @Json(name = "filter_id") String filterId) {
            return new SelectableListItem(title, icon, subtitle, filterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectableListItem)) {
                return false;
            }
            SelectableListItem selectableListItem = (SelectableListItem) other;
            return jl40.l(this.title, selectableListItem.title) && jl40.l(this.icon, selectableListItem.icon) && jl40.l(this.subtitle, selectableListItem.subtitle) && jl40.l(this.filterId, selectableListItem.filterId);
        }

        public final String getFilterId() {
            return this.filterId;
        }

        public final Themes<String> getIcon() {
            return this.icon;
        }

        public final PfmText getSubtitle() {
            return this.subtitle;
        }

        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        public int hashCode() {
            int c = nnm.c(this.icon, this.title.hashCode() * 31, 31);
            PfmText pfmText = this.subtitle;
            return this.filterId.hashCode() + ((c + (pfmText == null ? 0 : pfmText.hashCode())) * 31);
        }

        public String toString() {
            return "SelectableListItem(title=" + this.title + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ", filterId=" + this.filterId + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$Spoiler;", "", "color", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Spoiler {
        private final Themes<String> color;

        public Spoiler(@Json(name = "color") Themes<String> themes) {
            this.color = themes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Spoiler copy$default(Spoiler spoiler, Themes themes, int i, Object obj) {
            if ((i & 1) != 0) {
                themes = spoiler.color;
            }
            return spoiler.copy(themes);
        }

        public final Themes<String> component1() {
            return this.color;
        }

        public final Spoiler copy(@Json(name = "color") Themes<String> color) {
            return new Spoiler(color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Spoiler) && jl40.l(this.color, ((Spoiler) other).color);
        }

        public final Themes<String> getColor() {
            return this.color;
        }

        public int hashCode() {
            Themes<String> themes = this.color;
            if (themes == null) {
                return 0;
            }
            return themes.hashCode();
        }

        public String toString() {
            return "Spoiler(color=" + this.color + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "", "<init>", "(Ljava/lang/String;I)V", "AMOUNT", "PLAIN", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextType[] $VALUES;
        public static final TextType AMOUNT = new TextType("AMOUNT", 0);
        public static final TextType PLAIN = new TextType("PLAIN", 1);

        private static final /* synthetic */ TextType[] $values() {
            return new TextType[]{AMOUNT, PLAIN};
        }

        static {
            TextType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TextType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TextType valueOf(String str) {
            return (TextType) Enum.valueOf(TextType.class, str);
        }

        public static TextType[] values() {
            return (TextType[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\r\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$ToggleListItem;", "", "title", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "filterId", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/FilterId;", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Ljava/lang/String;)V", "getTitle", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "getFilterId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleListItem {
        private final String filterId;
        private final PfmResponse$PfmTextContent$Plain title;

        public ToggleListItem(@Json(name = "title") PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, @Json(name = "filter_id") String str) {
            this.title = pfmResponse$PfmTextContent$Plain;
            this.filterId = str;
        }

        public static /* synthetic */ ToggleListItem copy$default(ToggleListItem toggleListItem, PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                pfmResponse$PfmTextContent$Plain = toggleListItem.title;
            }
            if ((i & 2) != 0) {
                str = toggleListItem.filterId;
            }
            return toggleListItem.copy(pfmResponse$PfmTextContent$Plain, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFilterId() {
            return this.filterId;
        }

        public final ToggleListItem copy(@Json(name = "title") PfmResponse$PfmTextContent$Plain title, @Json(name = "filter_id") String filterId) {
            return new ToggleListItem(title, filterId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToggleListItem)) {
                return false;
            }
            ToggleListItem toggleListItem = (ToggleListItem) other;
            return jl40.l(this.title, toggleListItem.title) && jl40.l(this.filterId, toggleListItem.filterId);
        }

        public final String getFilterId() {
            return this.filterId;
        }

        public final PfmResponse$PfmTextContent$Plain getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.filterId.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return "ToggleListItem(title=" + this.title + ", filterId=" + this.filterId + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionListItem;", "", "logId", "", "divJson", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "sectionKey", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getLogId", "()Ljava/lang/String;", "getDivJson", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getSectionKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransactionListItem {
        private final DivDataDto divJson;
        private final String logId;
        private final String sectionKey;

        public TransactionListItem(@Json(name = "log_id") String str, @Json(name = "div_json") DivDataDto divDataDto, @Json(name = "section_key") String str2) {
            this.logId = str;
            this.divJson = divDataDto;
            this.sectionKey = str2;
        }

        public static /* synthetic */ TransactionListItem copy$default(TransactionListItem transactionListItem, String str, DivDataDto divDataDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionListItem.logId;
            }
            if ((i & 2) != 0) {
                divDataDto = transactionListItem.divJson;
            }
            if ((i & 4) != 0) {
                str2 = transactionListItem.sectionKey;
            }
            return transactionListItem.copy(str, divDataDto, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogId() {
            return this.logId;
        }

        /* renamed from: component2, reason: from getter */
        public final DivDataDto getDivJson() {
            return this.divJson;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSectionKey() {
            return this.sectionKey;
        }

        public final TransactionListItem copy(@Json(name = "log_id") String logId, @Json(name = "div_json") DivDataDto divJson, @Json(name = "section_key") String sectionKey) {
            return new TransactionListItem(logId, divJson, sectionKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionListItem)) {
                return false;
            }
            TransactionListItem transactionListItem = (TransactionListItem) other;
            return jl40.l(this.logId, transactionListItem.logId) && jl40.l(this.divJson, transactionListItem.divJson) && jl40.l(this.sectionKey, transactionListItem.sectionKey);
        }

        public final DivDataDto getDivJson() {
            return this.divJson;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final String getSectionKey() {
            return this.sectionKey;
        }

        public int hashCode() {
            return this.sectionKey.hashCode() + ((this.divJson.hashCode() + (this.logId.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.logId;
            DivDataDto divDataDto = this.divJson;
            String str2 = this.sectionKey;
            StringBuilder sb = new StringBuilder("TransactionListItem(logId=");
            sb.append(str);
            sb.append(", divJson=");
            sb.append(divDataDto);
            sb.append(", sectionKey=");
            return oyr.t(sb, str2, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionsData;", "", "commonData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "items", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TransactionListItem;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;)V", "getCommonData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TransactionsData {
        private final DivDataDto commonData;
        private final List<TransactionListItem> items;

        public TransactionsData(@Json(name = "common_data") DivDataDto divDataDto, @Json(name = "items") List<TransactionListItem> list) {
            this.commonData = divDataDto;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TransactionsData copy$default(TransactionsData transactionsData, DivDataDto divDataDto, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                divDataDto = transactionsData.commonData;
            }
            if ((i & 2) != 0) {
                list = transactionsData.items;
            }
            return transactionsData.copy(divDataDto, list);
        }

        /* renamed from: component1, reason: from getter */
        public final DivDataDto getCommonData() {
            return this.commonData;
        }

        public final List<TransactionListItem> component2() {
            return this.items;
        }

        public final TransactionsData copy(@Json(name = "common_data") DivDataDto commonData, @Json(name = "items") List<TransactionListItem> items) {
            return new TransactionsData(commonData, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionsData)) {
                return false;
            }
            TransactionsData transactionsData = (TransactionsData) other;
            return jl40.l(this.commonData, transactionsData.commonData) && jl40.l(this.items, transactionsData.items);
        }

        public final DivDataDto getCommonData() {
            return this.commonData;
        }

        public final List<TransactionListItem> getItems() {
            return this.items;
        }

        public int hashCode() {
            DivDataDto divDataDto = this.commonData;
            return this.items.hashCode() + ((divDataDto == null ? 0 : divDataDto.hashCode()) * 31);
        }

        public String toString() {
            return "TransactionsData(commonData=" + this.commonData + ", items=" + this.items + Extension.C_BRAKE;
        }
    }

    public PfmResponse(@Json(name = "fun_fact") FunFactData funFactData, @Json(name = "transactions") TransactionsData transactionsData, @Json(name = "filters") FeedFilters feedFilters, @Json(name = "analytics") Map<String, Analytics> map, @Json(name = "cursor") String str) {
        this.funFact = funFactData;
        this.transactions = transactionsData;
        this.filters = feedFilters;
        this.analytics = map;
        this.cursor = str;
    }

    public static /* synthetic */ PfmResponse copy$default(PfmResponse pfmResponse, FunFactData funFactData, TransactionsData transactionsData, FeedFilters feedFilters, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            funFactData = pfmResponse.funFact;
        }
        if ((i & 2) != 0) {
            transactionsData = pfmResponse.transactions;
        }
        if ((i & 4) != 0) {
            feedFilters = pfmResponse.filters;
        }
        if ((i & 8) != 0) {
            map = pfmResponse.analytics;
        }
        if ((i & 16) != 0) {
            str = pfmResponse.cursor;
        }
        String str2 = str;
        FeedFilters feedFilters2 = feedFilters;
        return pfmResponse.copy(funFactData, transactionsData, feedFilters2, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final FunFactData getFunFact() {
        return this.funFact;
    }

    /* renamed from: component2, reason: from getter */
    public final TransactionsData getTransactions() {
        return this.transactions;
    }

    /* renamed from: component3, reason: from getter */
    public final FeedFilters getFilters() {
        return this.filters;
    }

    public final Map<String, Analytics> component4() {
        return this.analytics;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final PfmResponse copy(@Json(name = "fun_fact") FunFactData funFact, @Json(name = "transactions") TransactionsData transactions, @Json(name = "filters") FeedFilters filters, @Json(name = "analytics") Map<String, Analytics> analytics, @Json(name = "cursor") String cursor) {
        return new PfmResponse(funFact, transactions, filters, analytics, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse)) {
            return false;
        }
        PfmResponse pfmResponse = (PfmResponse) other;
        return jl40.l(this.funFact, pfmResponse.funFact) && jl40.l(this.transactions, pfmResponse.transactions) && jl40.l(this.filters, pfmResponse.filters) && jl40.l(this.analytics, pfmResponse.analytics) && jl40.l(this.cursor, pfmResponse.cursor);
    }

    public final Map<String, Analytics> getAnalytics() {
        return this.analytics;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final FeedFilters getFilters() {
        return this.filters;
    }

    public final FunFactData getFunFact() {
        return this.funFact;
    }

    public final TransactionsData getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        FunFactData funFactData = this.funFact;
        int hashCode = (this.transactions.hashCode() + ((funFactData == null ? 0 : funFactData.hashCode()) * 31)) * 31;
        FeedFilters feedFilters = this.filters;
        int d = unr0.d((hashCode + (feedFilters == null ? 0 : feedFilters.hashCode())) * 31, 31, this.analytics);
        String str = this.cursor;
        return d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        FunFactData funFactData = this.funFact;
        TransactionsData transactionsData = this.transactions;
        FeedFilters feedFilters = this.filters;
        Map<String, Analytics> map = this.analytics;
        String str = this.cursor;
        StringBuilder sb = new StringBuilder("PfmResponse(funFact=");
        sb.append(funFactData);
        sb.append(", transactions=");
        sb.append(transactionsData);
        sb.append(", filters=");
        sb.append(feedFilters);
        sb.append(", analytics=");
        sb.append(map);
        sb.append(", cursor=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}

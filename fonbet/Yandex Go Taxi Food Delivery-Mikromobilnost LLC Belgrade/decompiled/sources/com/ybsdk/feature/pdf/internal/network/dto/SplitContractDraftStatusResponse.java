package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse;", "", "link", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Link;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Status;", "<init>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Link;Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Status;)V", "getLink", "()Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Link;", "getStatus", "()Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Link", "Status", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitContractDraftStatusResponse {
    private final Link link;
    private final Status status;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Link;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {
        private final String url;

        public Link(@Json(name = "url") String str) {
            this.url = str;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            return link.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Link copy(@Json(name = "url") String url) {
            return new Link(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && jl40.l(this.url, ((Link) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return oyr.p("Link(url=", this.url, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PROCESSING = new Status("PROCESSING", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PROCESSING, SUCCESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public SplitContractDraftStatusResponse(@Json(name = "link") Link link, @Json(name = "status") Status status) {
        this.link = link;
        this.status = status;
    }

    public static /* synthetic */ SplitContractDraftStatusResponse copy$default(SplitContractDraftStatusResponse splitContractDraftStatusResponse, Link link, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            link = splitContractDraftStatusResponse.link;
        }
        if ((i & 2) != 0) {
            status = splitContractDraftStatusResponse.status;
        }
        return splitContractDraftStatusResponse.copy(link, status);
    }

    /* renamed from: component1, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final SplitContractDraftStatusResponse copy(@Json(name = "link") Link link, @Json(name = "status") Status status) {
        return new SplitContractDraftStatusResponse(link, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitContractDraftStatusResponse)) {
            return false;
        }
        SplitContractDraftStatusResponse splitContractDraftStatusResponse = (SplitContractDraftStatusResponse) other;
        return jl40.l(this.link, splitContractDraftStatusResponse.link) && this.status == splitContractDraftStatusResponse.status;
    }

    public final Link getLink() {
        return this.link;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        Link link = this.link;
        return this.status.hashCode() + ((link == null ? 0 : link.hashCode()) * 31);
    }

    public String toString() {
        return "SplitContractDraftStatusResponse(link=" + this.link + ", status=" + this.status + Extension.C_BRAKE;
    }
}

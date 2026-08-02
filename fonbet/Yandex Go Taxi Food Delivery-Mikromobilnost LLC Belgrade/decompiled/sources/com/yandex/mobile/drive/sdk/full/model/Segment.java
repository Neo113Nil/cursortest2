package com.yandex.mobile.drive.sdk.full.model;

import com.adjust.sdk.Constants;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/Segment;", "", "Lcom/yandex/mobile/drive/sdk/full/model/Meta;", Constants.REFERRER_API_META, "Lcom/yandex/mobile/drive/sdk/full/model/SegmentSession;", "session", "", "carNumber", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/model/Meta;Lcom/yandex/mobile/drive/sdk/full/model/SegmentSession;Ljava/lang/String;)V", "Lcom/yandex/mobile/drive/sdk/full/model/Meta;", "b", "()Lcom/yandex/mobile/drive/sdk/full/model/Meta;", "Lcom/yandex/mobile/drive/sdk/full/model/SegmentSession;", "c", "()Lcom/yandex/mobile/drive/sdk/full/model/SegmentSession;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Segment {

    @ysq0("car_number")
    private final String carNumber;

    @ysq0(Constants.REFERRER_API_META)
    private final Meta meta;

    @ysq0("session")
    private final SegmentSession session;

    public Segment(Meta meta, SegmentSession segmentSession, String str) {
        this.meta = meta;
        this.session = segmentSession;
        this.carNumber = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCarNumber() {
        return this.carNumber;
    }

    /* renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* renamed from: c, reason: from getter */
    public final SegmentSession getSession() {
        return this.session;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj;
        return jl40.l(this.meta, segment.meta) && jl40.l(this.session, segment.session) && jl40.l(this.carNumber, segment.carNumber);
    }

    public final int hashCode() {
        Meta meta = this.meta;
        int hashCode = (meta == null ? 0 : meta.hashCode()) * 31;
        SegmentSession segmentSession = this.session;
        int hashCode2 = (hashCode + (segmentSession == null ? 0 : segmentSession.hashCode())) * 31;
        String str = this.carNumber;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Meta meta = this.meta;
        SegmentSession segmentSession = this.session;
        String str = this.carNumber;
        StringBuilder sb = new StringBuilder("Segment(meta=");
        sb.append(meta);
        sb.append(", session=");
        sb.append(segmentSession);
        sb.append(", carNumber=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}

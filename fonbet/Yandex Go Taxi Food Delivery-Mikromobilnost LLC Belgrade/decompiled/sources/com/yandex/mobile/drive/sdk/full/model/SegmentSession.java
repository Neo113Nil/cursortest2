package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/SegmentSession;", "", "Lcom/yandex/mobile/drive/sdk/full/model/SessionSpecials;", "specials", "", "current_performing", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/model/SessionSpecials;Ljava/lang/String;)V", "Lcom/yandex/mobile/drive/sdk/full/model/SessionSpecials;", "b", "()Lcom/yandex/mobile/drive/sdk/full/model/SessionSpecials;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SegmentSession {

    @ysq0("current_performing")
    private final String current_performing;

    @ysq0("specials")
    private final SessionSpecials specials;

    public SegmentSession(SessionSpecials sessionSpecials, String str) {
        this.specials = sessionSpecials;
        this.current_performing = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCurrent_performing() {
        return this.current_performing;
    }

    /* renamed from: b, reason: from getter */
    public final SessionSpecials getSpecials() {
        return this.specials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentSession)) {
            return false;
        }
        SegmentSession segmentSession = (SegmentSession) obj;
        return jl40.l(this.specials, segmentSession.specials) && jl40.l(this.current_performing, segmentSession.current_performing);
    }

    public final int hashCode() {
        SessionSpecials sessionSpecials = this.specials;
        int hashCode = (sessionSpecials == null ? 0 : sessionSpecials.hashCode()) * 31;
        String str = this.current_performing;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SegmentSession(specials=" + this.specials + ", current_performing=" + this.current_performing + Extension.C_BRAKE;
    }
}

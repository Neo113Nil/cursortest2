package com.yandex.mobile.drive.sdk.full.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/CurrentOffer;", "", "", "offer_id", "type", "finish", "finishArea", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getType", "a", "b", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CurrentOffer {

    @ysq0("finish")
    private final String finish;

    @ysq0("finish_area")
    private final String finishArea;

    @ysq0("offer_id")
    private final String offer_id;

    @ysq0("type")
    private final String type;

    public CurrentOffer(String str, String str2, String str3, String str4) {
        this.offer_id = str;
        this.type = str2;
        this.finish = str3;
        this.finishArea = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getFinish() {
        return this.finish;
    }

    /* renamed from: b, reason: from getter */
    public final String getFinishArea() {
        return this.finishArea;
    }

    /* renamed from: c, reason: from getter */
    public final String getOffer_id() {
        return this.offer_id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentOffer)) {
            return false;
        }
        CurrentOffer currentOffer = (CurrentOffer) obj;
        return jl40.l(this.offer_id, currentOffer.offer_id) && jl40.l(this.type, currentOffer.type) && jl40.l(this.finish, currentOffer.finish) && jl40.l(this.finishArea, currentOffer.finishArea);
    }

    public final int hashCode() {
        String str = this.offer_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.finish;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.finishArea;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.offer_id;
        String str2 = this.type;
        return g8e.r(b64.v("CurrentOffer(offer_id=", str, ", type=", str2, ", finish="), this.finish, ", finishArea=", this.finishArea, Extension.C_BRAKE);
    }
}

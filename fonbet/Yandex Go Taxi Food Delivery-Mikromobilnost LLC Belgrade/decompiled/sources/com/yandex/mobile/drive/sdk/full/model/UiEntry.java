package com.yandex.mobile.drive.sdk.full.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/UiEntry;", "", "", "title", "subtitle", "iconUrl", "carNumber", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "b", "a", "c", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiEntry {

    @ysq0("car_number")
    private final String carNumber;

    @ysq0("icon")
    private final String iconUrl;

    @ysq0("price")
    private final String price;

    @ysq0("subtitle")
    private final String subtitle;

    @ysq0("title")
    private final String title;

    public UiEntry(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.iconUrl = str3;
        this.carNumber = str4;
        this.price = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getCarNumber() {
        return this.carNumber;
    }

    /* renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiEntry)) {
            return false;
        }
        UiEntry uiEntry = (UiEntry) obj;
        return jl40.l(this.title, uiEntry.title) && jl40.l(this.subtitle, uiEntry.subtitle) && jl40.l(this.iconUrl, uiEntry.iconUrl) && jl40.l(this.carNumber, uiEntry.carNumber) && jl40.l(this.price, uiEntry.price);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.carNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.iconUrl;
        String str4 = this.carNumber;
        String str5 = this.price;
        StringBuilder v = b64.v("UiEntry(title=", str, ", subtitle=", str2, ", iconUrl=");
        g8e.D(v, str3, ", carNumber=", str4, ", price=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}

package com.yandex.mobile.drive.sdk.full.model;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.ysq0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/Car;", "", "", "number", "", "view", "modelName", "modelShortName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getView", "()Ljava/lang/Integer;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Car {
    public String a;
    public String b;

    @ysq0("number")
    private final String number;

    @ysq0("view")
    private final Integer view;

    public Car(String str, Integer num, String str2, String str3) {
        this.number = str;
        this.view = num;
        this.a = str2;
        this.b = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public final void b(List list) {
        Integer num;
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (num = this.view) == null || num.intValue() < 0 || this.view.intValue() >= list.size()) {
            return;
        }
        this.a = ((Model) list.get(this.view.intValue())).getName();
        this.b = ((Model) list.get(this.view.intValue())).getShortName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        return jl40.l(this.number, car.number) && jl40.l(this.view, car.view) && jl40.l(this.a, car.a) && jl40.l(this.b, car.b);
    }

    public final int hashCode() {
        String str = this.number;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.view;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.a;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.b;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.number;
        Integer num = this.view;
        return g8e.r(n.q("Car(number=", num, str, ", view=", ", modelName="), this.a, ", modelShortName=", this.b, Extension.C_BRAKE);
    }
}

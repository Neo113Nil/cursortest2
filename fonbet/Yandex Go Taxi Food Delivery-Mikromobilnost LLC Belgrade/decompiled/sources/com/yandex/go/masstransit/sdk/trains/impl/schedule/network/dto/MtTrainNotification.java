package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainNotification;", "", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainNotification {
    public static final p Companion = new p();
    public static final MtTrainNotification c = new MtTrainNotification(0);
    public final FormattedText a;
    public final String b;

    public /* synthetic */ MtTrainNotification(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainNotification)) {
            return false;
        }
        MtTrainNotification mtTrainNotification = (MtTrainNotification) obj;
        return jl40.l(this.a, mtTrainNotification.a) && jl40.l(this.b, mtTrainNotification.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainNotification(title=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }

    public MtTrainNotification() {
        this(0);
    }

    public MtTrainNotification(int i) {
        this.a = FormattedText.c;
        this.b = "";
    }
}

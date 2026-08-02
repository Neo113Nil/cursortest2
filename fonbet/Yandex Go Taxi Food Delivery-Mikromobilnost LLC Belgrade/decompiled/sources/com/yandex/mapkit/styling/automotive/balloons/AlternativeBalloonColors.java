package com.yandex.mapkit.styling.automotive.balloons;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/mapkit/styling/automotive/balloons/AlternativeBalloonColors;", "", "backgroundDay", "", "backgroundNight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundNight", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/yandex/mapkit/styling/automotive/balloons/AlternativeBalloonColors;", "equals", "", "other", "hashCode", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AlternativeBalloonColors {
    private final Integer backgroundDay;
    private final Integer backgroundNight;

    public AlternativeBalloonColors(Integer num, Integer num2) {
        this.backgroundDay = num;
        this.backgroundNight = num2;
    }

    public static /* synthetic */ AlternativeBalloonColors copy$default(AlternativeBalloonColors alternativeBalloonColors, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = alternativeBalloonColors.backgroundDay;
        }
        if ((i & 2) != 0) {
            num2 = alternativeBalloonColors.backgroundNight;
        }
        return alternativeBalloonColors.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getBackgroundDay() {
        return this.backgroundDay;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getBackgroundNight() {
        return this.backgroundNight;
    }

    public final AlternativeBalloonColors copy(Integer backgroundDay, Integer backgroundNight) {
        return new AlternativeBalloonColors(backgroundDay, backgroundNight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeBalloonColors)) {
            return false;
        }
        AlternativeBalloonColors alternativeBalloonColors = (AlternativeBalloonColors) other;
        return jl40.l(this.backgroundDay, alternativeBalloonColors.backgroundDay) && jl40.l(this.backgroundNight, alternativeBalloonColors.backgroundNight);
    }

    public final Integer getBackgroundDay() {
        return this.backgroundDay;
    }

    public final Integer getBackgroundNight() {
        return this.backgroundNight;
    }

    public int hashCode() {
        Integer num = this.backgroundDay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.backgroundNight;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AlternativeBalloonColors(backgroundDay=" + this.backgroundDay + ", backgroundNight=" + this.backgroundNight + Extension.C_BRAKE;
    }
}

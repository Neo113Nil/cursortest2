package com.yandex.mapkit.styling.automotive.balloons;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yandex/mapkit/styling/automotive/balloons/SummaryBalloonColors;", "", "selectedBackgroundDay", "", "selectedBackgroundNight", "unselectedBackgroundDay", "unselectedBackgroundNight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSelectedBackgroundDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedBackgroundNight", "getUnselectedBackgroundDay", "getUnselectedBackgroundNight", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/yandex/mapkit/styling/automotive/balloons/SummaryBalloonColors;", "equals", "", "other", "hashCode", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SummaryBalloonColors {
    private final Integer selectedBackgroundDay;
    private final Integer selectedBackgroundNight;
    private final Integer unselectedBackgroundDay;
    private final Integer unselectedBackgroundNight;

    public SummaryBalloonColors(Integer num, Integer num2, Integer num3, Integer num4) {
        this.selectedBackgroundDay = num;
        this.selectedBackgroundNight = num2;
        this.unselectedBackgroundDay = num3;
        this.unselectedBackgroundNight = num4;
    }

    public static /* synthetic */ SummaryBalloonColors copy$default(SummaryBalloonColors summaryBalloonColors, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = summaryBalloonColors.selectedBackgroundDay;
        }
        if ((i & 2) != 0) {
            num2 = summaryBalloonColors.selectedBackgroundNight;
        }
        if ((i & 4) != 0) {
            num3 = summaryBalloonColors.unselectedBackgroundDay;
        }
        if ((i & 8) != 0) {
            num4 = summaryBalloonColors.unselectedBackgroundNight;
        }
        return summaryBalloonColors.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSelectedBackgroundDay() {
        return this.selectedBackgroundDay;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedBackgroundNight() {
        return this.selectedBackgroundNight;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getUnselectedBackgroundDay() {
        return this.unselectedBackgroundDay;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getUnselectedBackgroundNight() {
        return this.unselectedBackgroundNight;
    }

    public final SummaryBalloonColors copy(Integer selectedBackgroundDay, Integer selectedBackgroundNight, Integer unselectedBackgroundDay, Integer unselectedBackgroundNight) {
        return new SummaryBalloonColors(selectedBackgroundDay, selectedBackgroundNight, unselectedBackgroundDay, unselectedBackgroundNight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryBalloonColors)) {
            return false;
        }
        SummaryBalloonColors summaryBalloonColors = (SummaryBalloonColors) other;
        return jl40.l(this.selectedBackgroundDay, summaryBalloonColors.selectedBackgroundDay) && jl40.l(this.selectedBackgroundNight, summaryBalloonColors.selectedBackgroundNight) && jl40.l(this.unselectedBackgroundDay, summaryBalloonColors.unselectedBackgroundDay) && jl40.l(this.unselectedBackgroundNight, summaryBalloonColors.unselectedBackgroundNight);
    }

    public final Integer getSelectedBackgroundDay() {
        return this.selectedBackgroundDay;
    }

    public final Integer getSelectedBackgroundNight() {
        return this.selectedBackgroundNight;
    }

    public final Integer getUnselectedBackgroundDay() {
        return this.unselectedBackgroundDay;
    }

    public final Integer getUnselectedBackgroundNight() {
        return this.unselectedBackgroundNight;
    }

    public int hashCode() {
        Integer num = this.selectedBackgroundDay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.selectedBackgroundNight;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.unselectedBackgroundDay;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.unselectedBackgroundNight;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "SummaryBalloonColors(selectedBackgroundDay=" + this.selectedBackgroundDay + ", selectedBackgroundNight=" + this.selectedBackgroundNight + ", unselectedBackgroundDay=" + this.unselectedBackgroundDay + ", unselectedBackgroundNight=" + this.unselectedBackgroundNight + Extension.C_BRAKE;
    }
}

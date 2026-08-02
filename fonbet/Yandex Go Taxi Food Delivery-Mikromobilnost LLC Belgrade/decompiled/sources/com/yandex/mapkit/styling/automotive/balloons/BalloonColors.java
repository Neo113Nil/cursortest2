package com.yandex.mapkit.styling.automotive.balloons;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "", "alternative", "Lcom/yandex/mapkit/styling/automotive/balloons/AlternativeBalloonColors;", "manoeuvre", "Lcom/yandex/mapkit/styling/automotive/balloons/ManoeuvreBalloonColors;", "summary", "Lcom/yandex/mapkit/styling/automotive/balloons/SummaryBalloonColors;", "<init>", "(Lcom/yandex/mapkit/styling/automotive/balloons/AlternativeBalloonColors;Lcom/yandex/mapkit/styling/automotive/balloons/ManoeuvreBalloonColors;Lcom/yandex/mapkit/styling/automotive/balloons/SummaryBalloonColors;)V", "getAlternative", "()Lcom/yandex/mapkit/styling/automotive/balloons/AlternativeBalloonColors;", "getManoeuvre", "()Lcom/yandex/mapkit/styling/automotive/balloons/ManoeuvreBalloonColors;", "getSummary", "()Lcom/yandex/mapkit/styling/automotive/balloons/SummaryBalloonColors;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BalloonColors {
    private final AlternativeBalloonColors alternative;
    private final ManoeuvreBalloonColors manoeuvre;
    private final SummaryBalloonColors summary;

    public BalloonColors(AlternativeBalloonColors alternativeBalloonColors, ManoeuvreBalloonColors manoeuvreBalloonColors, SummaryBalloonColors summaryBalloonColors) {
        this.alternative = alternativeBalloonColors;
        this.manoeuvre = manoeuvreBalloonColors;
        this.summary = summaryBalloonColors;
    }

    public static /* synthetic */ BalloonColors copy$default(BalloonColors balloonColors, AlternativeBalloonColors alternativeBalloonColors, ManoeuvreBalloonColors manoeuvreBalloonColors, SummaryBalloonColors summaryBalloonColors, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeBalloonColors = balloonColors.alternative;
        }
        if ((i & 2) != 0) {
            manoeuvreBalloonColors = balloonColors.manoeuvre;
        }
        if ((i & 4) != 0) {
            summaryBalloonColors = balloonColors.summary;
        }
        return balloonColors.copy(alternativeBalloonColors, manoeuvreBalloonColors, summaryBalloonColors);
    }

    /* renamed from: component1, reason: from getter */
    public final AlternativeBalloonColors getAlternative() {
        return this.alternative;
    }

    /* renamed from: component2, reason: from getter */
    public final ManoeuvreBalloonColors getManoeuvre() {
        return this.manoeuvre;
    }

    /* renamed from: component3, reason: from getter */
    public final SummaryBalloonColors getSummary() {
        return this.summary;
    }

    public final BalloonColors copy(AlternativeBalloonColors alternative, ManoeuvreBalloonColors manoeuvre, SummaryBalloonColors summary) {
        return new BalloonColors(alternative, manoeuvre, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalloonColors)) {
            return false;
        }
        BalloonColors balloonColors = (BalloonColors) other;
        return jl40.l(this.alternative, balloonColors.alternative) && jl40.l(this.manoeuvre, balloonColors.manoeuvre) && jl40.l(this.summary, balloonColors.summary);
    }

    public final AlternativeBalloonColors getAlternative() {
        return this.alternative;
    }

    public final ManoeuvreBalloonColors getManoeuvre() {
        return this.manoeuvre;
    }

    public final SummaryBalloonColors getSummary() {
        return this.summary;
    }

    public int hashCode() {
        AlternativeBalloonColors alternativeBalloonColors = this.alternative;
        int hashCode = (alternativeBalloonColors == null ? 0 : alternativeBalloonColors.hashCode()) * 31;
        ManoeuvreBalloonColors manoeuvreBalloonColors = this.manoeuvre;
        int hashCode2 = (hashCode + (manoeuvreBalloonColors == null ? 0 : manoeuvreBalloonColors.hashCode())) * 31;
        SummaryBalloonColors summaryBalloonColors = this.summary;
        return hashCode2 + (summaryBalloonColors != null ? summaryBalloonColors.hashCode() : 0);
    }

    public String toString() {
        return "BalloonColors(alternative=" + this.alternative + ", manoeuvre=" + this.manoeuvre + ", summary=" + this.summary + Extension.C_BRAKE;
    }
}

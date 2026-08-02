package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0084\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010\u0015J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b8\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010&R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b<\u0010\u001f¨\u0006="}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "Landroid/os/Parcelable;", "", "scoreText", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "scoreFilledTextColor", "scoreUnfilledTextColor", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "scoreStyledTexts", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "scoreTextIcons", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "progressPercent", "progressColor", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/core/data/common/PlusThemedColor;DLcom/yandex/plus/core/data/common/PlusThemedColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()D", "component8", "copy", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/core/data/common/PlusThemedColor;DLcom/yandex/plus/core/data/common/PlusThemedColor;)Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScoreText", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getScoreFilledTextColor", "getScoreUnfilledTextColor", "Ljava/util/List;", "getScoreStyledTexts", "getScoreTextIcons", "getBackgroundColor", CA20Status.STATUS_REQUEST_D, "getProgressPercent", "getProgressColor", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GiftProgress implements Parcelable {
    public static final Parcelable.Creator<GiftProgress> CREATOR = new Creator();
    private final PlusThemedColor<PlusColor> backgroundColor;
    private final PlusThemedColor<PlusColor> progressColor;
    private final double progressPercent;
    private final PlusThemedColor<PlusColor> scoreFilledTextColor;
    private final List<ShortcutStyledText> scoreStyledTexts;
    private final String scoreText;
    private final List<ShortcutTextIcon> scoreTextIcons;
    private final PlusThemedColor<PlusColor> scoreUnfilledTextColor;

    public GiftProgress(String str, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, List<ShortcutStyledText> list, List<ShortcutTextIcon> list2, PlusThemedColor<PlusColor> plusThemedColor3, double d, PlusThemedColor<PlusColor> plusThemedColor4) {
        this.scoreText = str;
        this.scoreFilledTextColor = plusThemedColor;
        this.scoreUnfilledTextColor = plusThemedColor2;
        this.scoreStyledTexts = list;
        this.scoreTextIcons = list2;
        this.backgroundColor = plusThemedColor3;
        this.progressPercent = d;
        this.progressColor = plusThemedColor4;
    }

    public static /* synthetic */ GiftProgress copy$default(GiftProgress giftProgress, String str, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, List list, List list2, PlusThemedColor plusThemedColor3, double d, PlusThemedColor plusThemedColor4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftProgress.scoreText;
        }
        if ((i & 2) != 0) {
            plusThemedColor = giftProgress.scoreFilledTextColor;
        }
        if ((i & 4) != 0) {
            plusThemedColor2 = giftProgress.scoreUnfilledTextColor;
        }
        if ((i & 8) != 0) {
            list = giftProgress.scoreStyledTexts;
        }
        if ((i & 16) != 0) {
            list2 = giftProgress.scoreTextIcons;
        }
        if ((i & 32) != 0) {
            plusThemedColor3 = giftProgress.backgroundColor;
        }
        if ((i & 64) != 0) {
            d = giftProgress.progressPercent;
        }
        if ((i & 128) != 0) {
            plusThemedColor4 = giftProgress.progressColor;
        }
        PlusThemedColor plusThemedColor5 = plusThemedColor4;
        double d2 = d;
        List list3 = list2;
        PlusThemedColor plusThemedColor6 = plusThemedColor3;
        return giftProgress.copy(str, plusThemedColor, plusThemedColor2, list, list3, plusThemedColor6, d2, plusThemedColor5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScoreText() {
        return this.scoreText;
    }

    public final PlusThemedColor<PlusColor> component2() {
        return this.scoreFilledTextColor;
    }

    public final PlusThemedColor<PlusColor> component3() {
        return this.scoreUnfilledTextColor;
    }

    public final List<ShortcutStyledText> component4() {
        return this.scoreStyledTexts;
    }

    public final List<ShortcutTextIcon> component5() {
        return this.scoreTextIcons;
    }

    public final PlusThemedColor<PlusColor> component6() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public final PlusThemedColor<PlusColor> component8() {
        return this.progressColor;
    }

    public final GiftProgress copy(String scoreText, PlusThemedColor<PlusColor> scoreFilledTextColor, PlusThemedColor<PlusColor> scoreUnfilledTextColor, List<ShortcutStyledText> scoreStyledTexts, List<ShortcutTextIcon> scoreTextIcons, PlusThemedColor<PlusColor> backgroundColor, double progressPercent, PlusThemedColor<PlusColor> progressColor) {
        return new GiftProgress(scoreText, scoreFilledTextColor, scoreUnfilledTextColor, scoreStyledTexts, scoreTextIcons, backgroundColor, progressPercent, progressColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftProgress)) {
            return false;
        }
        GiftProgress giftProgress = (GiftProgress) other;
        return jl40.l(this.scoreText, giftProgress.scoreText) && jl40.l(this.scoreFilledTextColor, giftProgress.scoreFilledTextColor) && jl40.l(this.scoreUnfilledTextColor, giftProgress.scoreUnfilledTextColor) && jl40.l(this.scoreStyledTexts, giftProgress.scoreStyledTexts) && jl40.l(this.scoreTextIcons, giftProgress.scoreTextIcons) && jl40.l(this.backgroundColor, giftProgress.backgroundColor) && Double.compare(this.progressPercent, giftProgress.progressPercent) == 0 && jl40.l(this.progressColor, giftProgress.progressColor);
    }

    public final PlusThemedColor<PlusColor> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final PlusThemedColor<PlusColor> getProgressColor() {
        return this.progressColor;
    }

    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public final PlusThemedColor<PlusColor> getScoreFilledTextColor() {
        return this.scoreFilledTextColor;
    }

    public final List<ShortcutStyledText> getScoreStyledTexts() {
        return this.scoreStyledTexts;
    }

    public final String getScoreText() {
        return this.scoreText;
    }

    public final List<ShortcutTextIcon> getScoreTextIcons() {
        return this.scoreTextIcons;
    }

    public final PlusThemedColor<PlusColor> getScoreUnfilledTextColor() {
        return this.scoreUnfilledTextColor;
    }

    public int hashCode() {
        return this.progressColor.hashCode() + unr0.a(vfc.c(this.backgroundColor, unr0.c(unr0.c(vfc.c(this.scoreUnfilledTextColor, vfc.c(this.scoreFilledTextColor, this.scoreText.hashCode() * 31, 31), 31), 31, this.scoreStyledTexts), 31, this.scoreTextIcons), 31), 31, this.progressPercent);
    }

    public String toString() {
        return "GiftProgress(scoreText=" + this.scoreText + ", scoreFilledTextColor=" + this.scoreFilledTextColor + ", scoreUnfilledTextColor=" + this.scoreUnfilledTextColor + ", scoreStyledTexts=" + this.scoreStyledTexts + ", scoreTextIcons=" + this.scoreTextIcons + ", backgroundColor=" + this.backgroundColor + ", progressPercent=" + this.progressPercent + ", progressColor=" + this.progressColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scoreText);
        dest.writeParcelable(this.scoreFilledTextColor, flags);
        dest.writeParcelable(this.scoreUnfilledTextColor, flags);
        Iterator t = vfc.t(dest, this.scoreStyledTexts);
        while (t.hasNext()) {
            ((ShortcutStyledText) t.next()).writeToParcel(dest, flags);
        }
        Iterator t2 = vfc.t(dest, this.scoreTextIcons);
        while (t2.hasNext()) {
            ((ShortcutTextIcon) t2.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.backgroundColor, flags);
        dest.writeDouble(this.progressPercent);
        dest.writeParcelable(this.progressColor, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GiftProgress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftProgress createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(GiftProgress.class.getClassLoader());
            PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(GiftProgress.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i2 != readInt2) {
                i2 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new GiftProgress(readString, plusThemedColor, plusThemedColor2, arrayList, arrayList2, (PlusThemedColor) parcel.readParcelable(GiftProgress.class.getClassLoader()), parcel.readDouble(), (PlusThemedColor) parcel.readParcelable(GiftProgress.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftProgress[] newArray(int i) {
            return new GiftProgress[i];
        }
    }
}

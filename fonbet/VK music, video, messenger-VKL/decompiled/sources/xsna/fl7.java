package xsna;

import com.vk.dto.stickers.bonus.StickersBonusHistoryRecord;

/* compiled from: BonusHistoryItem.kt */
/* loaded from: classes5.dex */
public final class fl7 implements hfz {
    public final StickersBonusHistoryRecord b;

    public fl7(StickersBonusHistoryRecord stickersBonusHistoryRecord) {
        this.b = stickersBonusHistoryRecord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl7) && epx.f(this.b, ((fl7) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BonusHistoryItem(record=" + this.b + ')';
    }
}

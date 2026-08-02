package xsna;

/* compiled from: Stickers.kt */
/* loaded from: classes15.dex */
public interface dh9 extends blj {
    @Override // xsna.nov
    default boolean getCanStickToSafeZoneGuideLines() {
        return false;
    }

    @Override // xsna.nov
    default int getMovePointersCount() {
        return 2;
    }

    @Override // xsna.nov
    default int getStickerLayerType() {
        return 1;
    }
}

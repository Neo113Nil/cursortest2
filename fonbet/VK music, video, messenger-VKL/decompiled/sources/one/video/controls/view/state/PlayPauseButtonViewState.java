package one.video.controls.view.state;

import xsna.asp;
import xsna.gp;
import xsna.l2u0;
import xsna.qoy;
import xsna.zrp;

/* compiled from: PlayPauseButtonViewState.kt */
/* loaded from: classes8.dex */
public final class PlayPauseButtonViewState implements l2u0 {
    public static final PlayPauseButtonViewState d = new PlayPauseButtonViewState(false, false, ImageType.PLAY);
    public final boolean a;
    public final boolean b;
    public final ImageType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlayPauseButtonViewState.kt */
    public static final class ImageType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageType[] $VALUES;
        public static final ImageType PAUSE;
        public static final ImageType PLAY;

        static {
            ImageType imageType = new ImageType("PLAY", 0);
            PLAY = imageType;
            ImageType imageType2 = new ImageType("PAUSE", 1);
            PAUSE = imageType2;
            ImageType[] imageTypeArr = {imageType, imageType2};
            $VALUES = imageTypeArr;
            $ENTRIES = new asp(imageTypeArr);
        }

        public ImageType() {
            throw null;
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }
    }

    public PlayPauseButtonViewState(boolean z, boolean z2, ImageType imageType) {
        this.a = z;
        this.b = z2;
        this.c = imageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayPauseButtonViewState)) {
            return false;
        }
        PlayPauseButtonViewState playPauseButtonViewState = (PlayPauseButtonViewState) obj;
        return this.a == playPauseButtonViewState.a && this.b == playPauseButtonViewState.b && this.c == playPauseButtonViewState.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        StringBuilder c = gp.c("PlayPauseButtonViewState(isVisible=", ", isInAnimation=", ", imageType=", this.a, this.b);
        c.append(this.c);
        c.append(")");
        return c.toString();
    }
}

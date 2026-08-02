package xsna;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;

/* compiled from: MusicPlayerInformerMapper.kt */
/* loaded from: classes3.dex */
public final class mx40 {

    /* compiled from: MusicPlayerInformerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtistArtistPromoDto.TypeDto.values().length];
            try {
                iArr[ArtistArtistPromoDto.TypeDto.CONCERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArtistArtistPromoDto.TypeDto.MERCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

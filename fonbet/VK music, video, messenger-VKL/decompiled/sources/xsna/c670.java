package xsna;

import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;

/* compiled from: NonMusicBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class c670 {

    /* compiled from: NonMusicBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogAudioContentCard.EntityType.values().length];
            try {
                iArr[CatalogAudioContentCard.EntityType.PODCASTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogAudioContentCard.EntityType.AUDIOBOOKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

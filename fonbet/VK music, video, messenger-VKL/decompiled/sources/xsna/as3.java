package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix$ArtistMixState;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class as3 implements s2a {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r2a a(CatalogBlockState catalogBlockState) {
        String url;
        ArrayList arrayList;
        ImageSize imageSize;
        ArrayList arrayList2;
        ImageSize imageSize2;
        ArrayList arrayList3;
        ArtistMix$ArtistMixState artistMix$ArtistMixState = (ArtistMix$ArtistMixState) catalogBlockState;
        int a = iah0.a(PsExtractor.VIDEO_STREAM_MASK);
        int a2 = iah0.a(158);
        BlockId blockId = artistMix$ArtistMixState.b;
        String str = artistMix$ArtistMixState.e;
        String str2 = artistMix$ArtistMixState.g;
        Image image = artistMix$ArtistMixState.i;
        String str3 = null;
        if (image != null && (arrayList3 = image.b) != null) {
            ImageSize imageSize3 = (ImageSize) ixj0.c(arrayList3, a, a);
            url = imageSize3 != null ? imageSize3.getUrl() : null;
        }
        Image image2 = artistMix$ArtistMixState.h;
        url = (image2 == null || (arrayList = image2.b) == null || (imageSize = (ImageSize) ixj0.c(arrayList, a, a)) == null) ? null : imageSize.getUrl();
        if (image != null && (arrayList2 = image.b) != null && (imageSize2 = (ImageSize) ixj0.c(arrayList2, a2, a2)) != null) {
            str3 = imageSize2.getUrl();
        }
        return new ds3(blockId, str, new PlayPauseButtonState(artistMix$ArtistMixState.f, PlayPauseButtonState.Size.SIZE_48), str2, url, str3);
    }
}

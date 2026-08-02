package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.albumauthor.AlbumTitleSubtitleAvatar$State;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vk1 implements s2a {
    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        AlbumTitleSubtitleAvatar$State albumTitleSubtitleAvatar$State = (AlbumTitleSubtitleAvatar$State) catalogBlockState;
        String str = albumTitleSubtitleAvatar$State.b;
        String str2 = albumTitleSubtitleAvatar$State.d;
        int i = albumTitleSubtitleAvatar$State.e;
        mno0 a = i > 0 ? nno0.a(R.plurals.followers_count, i, Collections.singletonList(uqm0.e(i))) : nno0.b(R.string.video_catalog_playlist_zero_subscribers);
        Image image = albumTitleSubtitleAvatar$State.f;
        return new al1(str, str2, a, image != null ? smw.f(image) : null, albumTitleSubtitleAvatar$State.g);
    }
}

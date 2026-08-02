package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import java.util.Map;

/* compiled from: PhotosGetAlbumsAndTags.kt */
/* loaded from: classes14.dex */
public final class wea0 {
    public final PhotosGetAlbums.a a;
    public final TagsSuggestions b;
    public final Map<UserId, Owner> c;

    public wea0(PhotosGetAlbums.a aVar, TagsSuggestions tagsSuggestions, Map<UserId, Owner> map) {
        this.a = aVar;
        this.b = tagsSuggestions;
        this.c = map;
    }
}

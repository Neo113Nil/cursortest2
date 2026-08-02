package xsna;

import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final class zkc0 implements izs<PostingState.Editing, wow<LocalAlbum>> {
    public static final zkc0 b = new zkc0();

    @Override // xsna.izs
    public final wow<LocalAlbum> invoke(PostingState.Editing editing) {
        List list = editing.f.c;
        if (list == null) {
            list = EmptyList.b;
        }
        return new wow<>(list);
    }
}

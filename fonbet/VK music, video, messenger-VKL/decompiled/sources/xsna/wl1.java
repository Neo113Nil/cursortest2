package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wl1(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((PhotoAlbum) obj).b == this.c);
            default:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, Integer.valueOf(this.c), null, null, null, null, null, 0, 66584575);
        }
    }
}

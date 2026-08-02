package xsna;

import android.view.View;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ pg1(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                int i2 = AlbumDetailsFragment.p0;
                lda0.a(view, 0.75f, true);
                break;
            default:
                int i3 = AlbumsFragment.j0;
                lda0.a(view, 0.9f, true);
                break;
        }
        return s3q0.a;
    }
}

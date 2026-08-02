package xsna;

import android.view.View;
import com.vk.photos.root.albums.presentation.AlbumsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vm1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ vm1(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                int i2 = AlbumsFragment.j0;
                lda0.a(view, 0.9f, false);
                break;
            default:
                view.setVisibility(4);
                break;
        }
        return s3q0.a;
    }
}

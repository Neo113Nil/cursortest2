package xsna;

import android.content.Context;
import android.view.View;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ vg1(View view, int i) {
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
                lda0.a(view, 0.75f, false);
                return s3q0.a;
            default:
                Context context = view.getContext();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.bg_rounded_corners_8, context);
        }
    }
}

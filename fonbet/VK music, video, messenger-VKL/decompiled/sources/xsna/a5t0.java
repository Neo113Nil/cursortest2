package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class a5t0 implements gzs<s3q0> {
    public final /* synthetic */ View b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ VideoPlaylistPlaceHolder e;

    public a5t0(View view, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, VideoPlaylistPlaceHolder videoPlaylistPlaceHolder) {
        this.b = view;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = videoPlaylistPlaceHolder;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        View view = this.b;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            int a = y8g0.a(R.dimen.video_catalog_empty_playlist_button_top_margin);
            VideoPlaylistPlaceHolder videoPlaylistPlaceHolder = this.e;
            View view2 = videoPlaylistPlaceHolder.C;
            if (view2 != null) {
                f4m.t(a, view2);
            }
            View view3 = videoPlaylistPlaceHolder.D;
            if (view3 != null) {
                f4m.t(a, view3);
            }
            View view4 = videoPlaylistPlaceHolder.E;
            if (view4 != null) {
                f4m.t(y8g0.a(R.dimen.video_catalog_empty_playlist_title_top_margin), view4);
            }
        }
        return s3q0.a;
    }
}

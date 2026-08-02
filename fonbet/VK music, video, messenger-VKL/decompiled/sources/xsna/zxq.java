package xsna;

import android.view.View;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.libvideo.ui.SimilarVideoBigView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zxq implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ zxq(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                int i2 = FeedDigestHeader.n;
                gzsVar.invoke();
                break;
            default:
                int i3 = SimilarVideoBigView.f;
                gzsVar.invoke();
                break;
        }
    }
}

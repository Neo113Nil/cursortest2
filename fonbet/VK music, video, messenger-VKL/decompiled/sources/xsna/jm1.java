package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: AlbumsEmptyView.kt */
/* loaded from: classes17.dex */
public final class jm1 extends FrameLayout {
    public a b;
    public final LayoutInflater c;
    public final bpn0 d;
    public final bpn0 e;

    /* compiled from: AlbumsEmptyView.kt */
    public interface a {
    }

    public jm1(Context context) {
        super(context, null, 0);
        this.c = LayoutInflater.from(context);
        this.d = new bpn0(new ac(this, 4));
        this.e = new bpn0(new f5(this, 4));
        View findViewById = getOwnerEmptyView().findViewById(R.id.tv_add_album);
        bwt0.p0(findViewById, true);
        jjc.g(findViewById, new ec(this, 4));
    }

    private final View getOtherUserEmptyView() {
        return (View) this.e.getValue();
    }

    private final View getOwnerEmptyView() {
        return (View) this.d.getValue();
    }

    public final a getAddAlbumListener() {
        return this.b;
    }

    public final void h0(boolean z) {
        removeAllViews();
        addView(z ? getOwnerEmptyView() : getOtherUserEmptyView());
    }

    public final void setAddAlbumListener(a aVar) {
        this.b = aVar;
    }

    public final void setIconVisible(boolean z) {
        ImageView imageView = (ImageView) findViewById(R.id.image);
        if (imageView != null) {
            bwt0.p0(imageView, z);
        }
    }
}

package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsFullDescriptionView.kt */
/* loaded from: classes4.dex */
public final class zg1 extends FrameLayout implements w8i {
    public gzs<s3q0> b;
    public gzs<s3q0> c;
    public final TextView d;
    public final VkLinkedText e;
    public final View f;
    public final bpn0 g;

    public zg1(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.album_details_full_description_view, this);
        setBackgroundResource(R.drawable.album_details_full_description_view_bg);
        this.d = (TextView) findViewById(R.id.album_name);
        VkLinkedText vkLinkedText = (VkLinkedText) findViewById(R.id.album_description);
        this.e = vkLinkedText;
        View findViewById = findViewById(R.id.iv_navigation);
        this.f = findViewById;
        this.g = new bpn0(new sa0(this, 3));
        bwt0.i0(findViewById, new g20(this, 1));
        vkLinkedText.setOnLinkClickListenerWithoutLock(new yg1(this, 0));
    }

    private final qdz getLinksBridge() {
        return (qdz) this.g.getValue();
    }

    public final gzs<s3q0> getOnCloseClickListener() {
        return this.b;
    }

    public final gzs<s3q0> getOnDescriptionLinkClickListener() {
        return this.c;
    }

    public final void setAlbumDescription(String str) {
        this.e.setText(getLinksBridge().a().m(str));
    }

    public final void setAlbumName(String str) {
        this.d.setText(str);
    }

    public final void setOnCloseClickListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setOnDescriptionLinkClickListener(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }
}

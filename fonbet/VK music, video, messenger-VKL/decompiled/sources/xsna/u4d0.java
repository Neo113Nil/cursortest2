package xsna;

import android.view.View;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: PreviewMediaStoreEntryHolder.kt */
/* loaded from: classes5.dex */
public final class u4d0 extends vif0<MediaStoreEntry> {
    public final t4d0 n;
    public final MediaStoreItemSmallView o;

    public u4d0(View view, nu0 nu0Var) {
        super(view);
        this.n = nu0Var;
        view.setClipToOutline(true);
        bwt0.i0(view, new d2y(this, 22));
        MediaStoreItemSmallView mediaStoreItemSmallView = (MediaStoreItemSmallView) view.findViewById(R.id.picker_photo);
        this.o = mediaStoreItemSmallView;
        mediaStoreItemSmallView.setRatio(1.0f);
    }

    @Override // xsna.vif0
    public final void i6(MediaStoreEntry mediaStoreEntry) {
        MediaStoreItemSmallView mediaStoreItemSmallView = this.o;
        mediaStoreItemSmallView.W0(mediaStoreEntry);
        mediaStoreItemSmallView.x = null;
        mediaStoreItemSmallView.w = null;
    }
}

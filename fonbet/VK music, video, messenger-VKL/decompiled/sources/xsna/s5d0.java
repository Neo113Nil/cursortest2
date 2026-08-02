package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: PreviewTemplateEditorEntryHolder.kt */
/* loaded from: classes5.dex */
public final class s5d0 extends vif0<a8f> {
    public final t4d0 n;
    public final MediaStoreItemSmallView o;
    public final TextView p;
    public final View q;

    public s5d0(View view, rx0 rx0Var) {
        super(view);
        this.n = rx0Var;
        MediaStoreItemSmallView mediaStoreItemSmallView = (MediaStoreItemSmallView) view.findViewById(R.id.picker_photo);
        this.o = mediaStoreItemSmallView;
        this.p = (TextView) view.findViewById(R.id.clips_template_editor_fragment_item_duration);
        this.q = view.findViewById(R.id.clips_template_editor_fragment_item_background);
        view.setOutlineProvider(new s0w0(iah0.b(8.0f), 6));
        view.setClipToOutline(true);
        bwt0.i0(view, new qi00(this, 28));
        mediaStoreItemSmallView.setRatio(1.7777778f);
        mediaStoreItemSmallView.setOutlineProvider(new s0w0(iah0.b(8.0f), 6));
        mediaStoreItemSmallView.setClipToOutline(true);
    }

    @Override // xsna.vif0
    public final void i6(a8f a8fVar) {
        MediaStoreEntry mediaStoreEntry = a8fVar.b;
        View view = this.q;
        MediaStoreItemSmallView mediaStoreItemSmallView = this.o;
        if (mediaStoreEntry != null) {
            f4m.j(view);
            mediaStoreItemSmallView.setVisibility(0);
            mediaStoreItemSmallView.W0(mediaStoreEntry);
            mediaStoreItemSmallView.x = null;
            mediaStoreItemSmallView.w = null;
        } else {
            view.setVisibility(0);
            mediaStoreItemSmallView.x = null;
            mediaStoreItemSmallView.w = null;
            f4m.j(mediaStoreItemSmallView);
        }
        this.p.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r6.c / 1000.0f)}, 1)));
    }
}

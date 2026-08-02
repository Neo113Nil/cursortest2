package xsna;

import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import com.vkontakte.android.R;
import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;

/* compiled from: OneVideoSeekbarRecordViewNewBinding.java */
/* loaded from: classes8.dex */
public final class kn80 implements xtt0 {

    @NonNull
    public final OneVideoSeekBarView a;

    @NonNull
    public final CompositeSeekBarView b;

    public kn80(@NonNull OneVideoSeekBarView oneVideoSeekBarView, @NonNull CompositeSeekBarView compositeSeekBarView) {
        this.a = oneVideoSeekBarView;
        this.b = compositeSeekBarView;
    }

    @NonNull
    public static kn80 a(@NonNull LayoutInflater layoutInflater, @NonNull OneVideoSeekBarView oneVideoSeekBarView) {
        layoutInflater.inflate(R.layout.one_video_seekbar_record_view_new, oneVideoSeekBarView);
        CompositeSeekBarView compositeSeekBarView = (CompositeSeekBarView) k9q0.j(R.id.seek_bar, oneVideoSeekBarView);
        if (compositeSeekBarView != null) {
            return new kn80(oneVideoSeekBarView, compositeSeekBarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(oneVideoSeekBarView.getResources().getResourceName(R.id.seek_bar)));
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}

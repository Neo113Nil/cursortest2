package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import one.video.controls.view.LiveLabelView;
import one.video.controls.view.LiveTimeView;
import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;

/* compiled from: OneVideoSeekbarLiveViewNewBinding.java */
/* loaded from: classes8.dex */
public final class jn80 implements xtt0 {

    @NonNull
    public final OneVideoSeekBarView a;

    @NonNull
    public final LiveLabelView b;

    @NonNull
    public final LiveTimeView c;

    @NonNull
    public final CompositeSeekBarView d;

    public jn80(@NonNull OneVideoSeekBarView oneVideoSeekBarView, @NonNull LiveLabelView liveLabelView, @NonNull LiveTimeView liveTimeView, @NonNull CompositeSeekBarView compositeSeekBarView) {
        this.a = oneVideoSeekBarView;
        this.b = liveLabelView;
        this.c = liveTimeView;
        this.d = compositeSeekBarView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}

package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.controls.view.OptimizedTimeView;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import one.video.controls.view.seekpreview.SeekPreviewLayout;

/* compiled from: OneVideoSeekPreviewLayoutBinding.java */
/* loaded from: classes8.dex */
public final class in80 implements xtt0 {

    @NonNull
    public final SeekPreviewLayout a;

    @NonNull
    public final SeekPreviewImageView b;

    @NonNull
    public final OptimizedTimeView c;

    @NonNull
    public final AppCompatTextView d;

    public in80(@NonNull SeekPreviewLayout seekPreviewLayout, @NonNull SeekPreviewImageView seekPreviewImageView, @NonNull OptimizedTimeView optimizedTimeView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = seekPreviewLayout;
        this.b = seekPreviewImageView;
        this.c = optimizedTimeView;
        this.d = appCompatTextView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}

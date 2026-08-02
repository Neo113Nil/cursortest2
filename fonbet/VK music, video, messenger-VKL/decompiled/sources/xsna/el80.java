package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.controls.view.OptimizedTimeView;
import one.video.controls.view.seekpreview.FullSeekPreviewLayout;
import one.video.controls.view.seekpreview.SeekPreviewImageView;

/* compiled from: OneVideoFullSeekPreviewLayoutBinding.java */
/* loaded from: classes8.dex */
public final class el80 implements xtt0 {

    @NonNull
    public final FullSeekPreviewLayout a;

    @NonNull
    public final SeekPreviewImageView b;

    @NonNull
    public final OptimizedTimeView c;

    @NonNull
    public final AppCompatTextView d;

    public el80(@NonNull FullSeekPreviewLayout fullSeekPreviewLayout, @NonNull SeekPreviewImageView seekPreviewImageView, @NonNull OptimizedTimeView optimizedTimeView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = fullSeekPreviewLayout;
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

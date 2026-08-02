package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import defpackage.i18;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/media/ImageReader;", "kotlin.jvm.PlatformType", "it", "Lzy11;", "onImageAvailable", "(Landroid/media/ImageReader;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class LayerSnapshotV22$toBitmap$2$image$1$1 implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ i18 $continuation;

    public LayerSnapshotV22$toBitmap$2$image$1$1(i18 i18Var) {
        this.$continuation = i18Var;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.$continuation.resumeWith(imageReader.acquireLatestImage());
    }
}

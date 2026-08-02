package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import defpackage.k6w;
import defpackage.tse;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/TextureView$SurfaceTextureListener;", "Ltse;", "scope", "<init>", "(Ltse;)V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "width", "height", "Lzy11;", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "surface", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "Lk6w;", "surfaceSize", "J", "getSurfaceSize-YbymL2g", "()J", "setSurfaceSize-ozmzZPI", "(J)V", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "Landroid/view/Surface;", "surfaceTextureSurface", "Landroid/view/Surface;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(tse tseVar) {
        super(tseVar);
        this.surfaceSize = 0L;
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSurfaceSize() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        if (!k6w.a(this.surfaceSize, 0L)) {
            long j = this.surfaceSize;
            int i = (int) (j >> 32);
            height = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            surfaceTexture.setDefaultBufferSize(i, height);
            width = i;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        dispatchSurfaceDestroyed(this.surfaceTextureSurface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
        if (!k6w.a(this.surfaceSize, 0L)) {
            long j = this.surfaceSize;
            int i = (int) (j >> 32);
            height = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            surfaceTexture.setDefaultBufferSize(i, height);
            width = i;
        }
        dispatchSurfaceChanged(this.surfaceTextureSurface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m27setSurfaceSizeozmzZPI(long j) {
        this.surfaceSize = j;
    }
}

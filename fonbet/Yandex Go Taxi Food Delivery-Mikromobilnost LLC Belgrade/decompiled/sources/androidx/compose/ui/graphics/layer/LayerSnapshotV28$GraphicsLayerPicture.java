package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Picture;
import defpackage.s72;
import defpackage.t72;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"androidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture", "Landroid/graphics/Picture;", "Landroidx/compose/ui/graphics/layer/a;", "graphicsLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/a;)V", "", "width", "height", "Landroid/graphics/Canvas;", "beginRecording", "(II)Landroid/graphics/Canvas;", "Lzy11;", "endRecording", "()V", "getWidth", "()I", "getHeight", "", "requiresHardwareAcceleration", "()Z", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/layer/a;", "getGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/a;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class LayerSnapshotV28$GraphicsLayerPicture extends Picture {
    private final a graphicsLayer;

    public LayerSnapshotV28$GraphicsLayerPicture(a aVar) {
        this.graphicsLayer = aVar;
    }

    @Override // android.graphics.Picture
    public Canvas beginRecording(int width, int height) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public void draw(Canvas canvas) {
        a aVar = this.graphicsLayer;
        Canvas canvas2 = t72.a;
        s72 s72Var = new s72();
        s72Var.a = canvas;
        aVar.c(s72Var, null);
    }

    @Override // android.graphics.Picture
    public void endRecording() {
    }

    public final a getGraphicsLayer() {
        return this.graphicsLayer;
    }

    @Override // android.graphics.Picture
    public int getHeight() {
        return (int) (this.graphicsLayer.u & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // android.graphics.Picture
    public int getWidth() {
        return (int) (this.graphicsLayer.u >> 32);
    }

    @Override // android.graphics.Picture
    public boolean requiresHardwareAcceleration() {
        return true;
    }
}

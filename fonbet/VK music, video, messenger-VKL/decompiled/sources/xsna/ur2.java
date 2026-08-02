package xsna;

import android.content.Context;
import android.os.Handler;
import ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface;
import ru.ok.call_effects.AnimojiEffect;

/* compiled from: AnimojiRenderAdapter.kt */
/* loaded from: classes7.dex */
public final class ur2 implements AnimojiRenderInterface {
    public final AnimojiEffect b;

    public ur2(Context context) {
        this.b = new AnimojiEffect(context);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final void acceptBgColor(int i) {
        this.b.setBgColor(i);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final void acceptLandmarks(float[] fArr) {
        this.b.setLandmarks(fArr);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final void acceptSvg(byte[] bArr, int i) {
        this.b.setSvg(bArr, i);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.release();
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final void draw(int i, int i2) {
        this.b.render(i, i2);
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final AnimojiRenderInterface.DrawResult getResult() {
        AnimojiEffect animojiEffect = this.b;
        Integer outTextureId = animojiEffect.outTextureId();
        if (outTextureId != null) {
            return new AnimojiRenderInterface.DrawResult(outTextureId.intValue(), animojiEffect.outWidth(), animojiEffect.outHeight());
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface
    public final void init(Handler handler, String str) {
        this.b.init(handler, str);
    }
}

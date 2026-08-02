package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.voip.b;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import java.io.File;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.ConfigurationBuilder;

/* compiled from: FrameEffectsProcessor.kt */
/* loaded from: classes7.dex */
public final class dfs {
    public final gj9 a;
    public final CallEffects b;
    public final obh c;

    /* compiled from: FrameEffectsProcessor.kt */
    public static final class a {
        public final VideoFrame a;

        public a(VideoFrame videoFrame) {
            this.a = videoFrame;
        }

        public final VideoFrame a() {
            return this.a;
        }
    }

    public dfs(Context context, CallEffectsDependency callEffectsDependency, gj9 gj9Var, boolean z) {
        PrivateFiles.a b;
        this.a = gj9Var;
        new io.reactivex.rxjava3.disposables.b();
        this.c = new obh(callEffectsDependency, 9);
        b = e8r.a.b(r0, PrivateSubdir.GPU_TFL_CACHE.h(), true);
        File file = new File(b.a.getAbsolutePath());
        if (!file.exists()) {
            file.mkdir();
        }
        this.b = new CallEffects(context, new bqz0(callEffectsDependency), new xo9(), new cap(), new ConfigurationBuilder(z, true), file);
    }

    public final a a(VideoFrame videoFrame) {
        a aVar = new a(videoFrame);
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            return aVar;
        }
        CallEffects callEffects = this.b;
        if (!callEffects.isEnabled()) {
            return aVar;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        TextureBufferImpl textureBufferImpl = buffer instanceof TextureBufferImpl ? (TextureBufferImpl) buffer : null;
        if (textureBufferImpl == null) {
            return aVar;
        }
        callEffects.setMirroringParameters(new CallEffects.MirroringParameters(false, false, false, false));
        CallEffects.Result applyEffectToFrame = callEffects.applyEffectToFrame(new CallEffects.Frame(textureBufferImpl.getTextureId(), new Size(textureBufferImpl.getWidth(), textureBufferImpl.getHeight()), videoFrame.getRotation(), textureBufferImpl.getTransformMatrix(), this.a.e()));
        return applyEffectToFrame == null ? aVar : new a(new VideoFrame(new TextureBufferImpl(applyEffectToFrame.getSize().getWidth(), applyEffectToFrame.getSize().getHeight(), VideoFrame.TextureBuffer.Type.RGB, applyEffectToFrame.getTextureId(), applyEffectToFrame.getTransformMatrix(), textureBufferImpl.getToI420Handler(), textureBufferImpl.getYuvConverter(), (Runnable) null), 0, videoFrame.getTimestampNs()));
    }

    public final void b() {
        this.b.clearGLResources();
    }

    public final void c(BeautyFilterIntensity beautyFilterIntensity) {
        BeautyFilterIntensity beautyFilterIntensity2 = BeautyFilterIntensity.DISABLED;
        CallEffects callEffects = this.b;
        if (beautyFilterIntensity == beautyFilterIntensity2) {
            callEffects.setBeautyFilter(null);
        } else {
            callEffects.setBeautyFilter(new CallEffects.BeautyFilter(beautyFilterIntensity.i()));
        }
    }

    public final void d(b.a aVar) {
        CallEffects.Effect effect = aVar != null ? new CallEffects.Effect(aVar.a, aVar.b) : null;
        CallEffects callEffects = this.b;
        callEffects.setEffect(effect);
        if (callEffects.isEnabled()) {
            return;
        }
        callEffects.clearGLResources();
    }

    public final void e(dpt dptVar) {
        CallEffects callEffects = this.b;
        callEffects.setGesturesConsumer(dptVar);
        if (callEffects.isEnabled()) {
            return;
        }
        callEffects.clearGLResources();
    }

    public final void f(boolean z) {
        CallEffects callEffects = this.b;
        callEffects.setGesturesRecognitionEnabled(z);
        if (callEffects.isEnabled()) {
            return;
        }
        callEffects.clearGLResources();
    }

    public final void g(b.a aVar) {
        CallEffects.Effect effect = aVar != null ? new CallEffects.Effect(aVar.a, aVar.b) : null;
        String absolutePath = f9t.p().getAbsolutePath();
        CallEffects callEffects = this.b;
        callEffects.setMaskEngineModelPath(absolutePath);
        callEffects.setMask(effect);
        if (callEffects.isEnabled()) {
            return;
        }
        callEffects.clearGLResources();
    }
}

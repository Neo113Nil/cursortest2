package xsna;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: VoipVideoEffectsDelegate.kt */
/* loaded from: classes7.dex */
public interface i3x0 {

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface a {
        UserId a();

        boolean b();

        boolean isCallActive();
    }

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface b {
        void a();

        io.reactivex.rxjava3.internal.operators.observable.y b();

        void c(boolean z);

        void d(TextureView textureView);

        gj9 e();

        TextureViewRenderer f(Context context, ehl ehlVar);
    }

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface c {
        boolean a();
    }

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface d {
        public static final a a = a.a;

        /* compiled from: VoipVideoEffectsDelegate.kt */
        public static final class a {
            public static final /* synthetic */ a a = new a();
            public static final int b = View.generateViewId();
            public static final int c = View.generateViewId();
        }
    }

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface e {
        boolean a();
    }

    /* compiled from: VoipVideoEffectsDelegate.kt */
    public interface f {
        void b();

        void c();
    }

    z0w0 a();

    y0w0 b();

    x0w0 getBackground();

    c getConfiguration();

    a1w0 h();
}

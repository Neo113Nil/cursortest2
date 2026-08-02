package xsna;

import android.net.Uri;
import com.vk.im.engine.models.camera.VideoParams;

/* compiled from: StoryConverter.kt */
/* loaded from: classes2.dex */
public interface s0m0 {

    /* compiled from: StoryConverter.kt */
    public static final class a {
        public static final C3645a a = new C3645a();

        /* compiled from: StoryConverter.kt */
        /* renamed from: xsna.s0m0$a$a, reason: collision with other inner class name */
        public static final class C3645a implements s0m0 {
            @Override // xsna.s0m0
            public final Uri a(VideoParams videoParams, yjt yjtVar) {
                return Uri.fromFile(videoParams.b);
            }
        }
    }

    Uri a(VideoParams videoParams, yjt yjtVar);
}

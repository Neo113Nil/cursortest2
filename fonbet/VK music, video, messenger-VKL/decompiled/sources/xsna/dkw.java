package xsna;

import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import kotlin.Pair;

/* compiled from: ImageLoader.kt */
/* loaded from: classes17.dex */
public final class dkw {
    public static final a a = new a();
    public static final pqo b = new pqo(new uw3(17));

    /* compiled from: ImageLoader.kt */
    public static final class a implements ClipsComposeImageLoader {
        @Override // com.vk.clips.sdk.common.provider.ClipsComposeImageLoader
        public final Pair<ClipsComposeImageLoader.LoadingState, lg90> a(String str, androidx.compose.runtime.a aVar, int i) {
            aVar.K(1354883794);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1354883794, i, -1, "com.vk.clips.viewer.edit.presentation.compose.util.ImageLoaderDefault.<no name provided>.rememberImageBitmap (ImageLoader.kt:11)");
            }
            Pair<ClipsComposeImageLoader.LoadingState, lg90> pair = new Pair<>(ClipsComposeImageLoader.LoadingState.Placeholder, ugp.g);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return pair;
        }
    }
}

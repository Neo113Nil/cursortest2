package xsna;

import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.chs;

/* compiled from: ComposeImageLoaderImpl.kt */
/* loaded from: classes16.dex */
public final class upi implements ClipsComposeImageLoader {
    @Override // com.vk.clips.sdk.common.provider.ClipsComposeImageLoader
    public final Pair<ClipsComposeImageLoader.LoadingState, lg90> a(String str, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1738288510);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1738288510, i, -1, "com.vk.clips.editor.mapper.utils.ComposeImageLoaderImpl.rememberImageBitmap (ComposeImageLoaderImpl.kt:11)");
        }
        Pair m = fwu0.m(str, null, null, null, null, null, aVar, i & 14, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        Pair<ClipsComposeImageLoader.LoadingState, lg90> pair = new Pair<>(((chs) m.i()) instanceof chs.e ? ClipsComposeImageLoader.LoadingState.Loaded : ClipsComposeImageLoader.LoadingState.Placeholder, m.j());
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return pair;
    }
}

package xsna;

import android.content.Context;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import xsna.oap;

/* compiled from: ClipsUploadUiVkNavigatorImpl.kt */
/* loaded from: classes17.dex */
public final class tkf implements ClipsUploadUiVkNavigator {
    public final ClipsUploadScreenStaticConfig a;

    public tkf(ClipsUploadScreenStaticConfig clipsUploadScreenStaticConfig) {
        this.a = clipsUploadScreenStaticConfig;
    }

    @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator
    public final void a(Context context, Integer num, ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull) {
        ClipsUploadFragmentImpl.a aVar = new ClipsUploadFragmentImpl.a(new oap.a(clipUploadDataFull), this.a);
        bpn0 bpn0Var = enj.a;
        aVar.h(e3m.h(context), num.intValue());
    }

    @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator
    public final void b(Context context, Integer num, ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact) {
        ClipsUploadFragmentImpl.a aVar = new ClipsUploadFragmentImpl.a(new oap.b(clipUploadDataCompact), this.a);
        bpn0 bpn0Var = enj.a;
        aVar.h(e3m.h(context), num.intValue());
    }
}

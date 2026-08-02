package xsna;

import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import xsna.e6w0;
import xsna.n6w0;

/* compiled from: VmojiCharacterView.kt */
/* loaded from: classes7.dex */
public final class b8w0 implements n6w0.a {
    public final /* synthetic */ VmojiCharacterFragment.c a;

    public b8w0(VmojiCharacterFragment.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.n6w0.a
    public final void a(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
        this.a.invoke(new e6w0.r(vmojiStickerPackPreviewModel));
    }

    public final void b(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel, boolean z) {
        this.a.invoke(new e6w0.k(vmojiStickerPackPreviewModel, z));
    }
}

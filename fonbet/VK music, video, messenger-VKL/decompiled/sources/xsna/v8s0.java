package xsna;

import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v8s0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        dw20 dw20Var = VideoCatalogAlbumBottomSheet.a.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        VideoCatalogAlbumBottomSheet.a.b = null;
    }
}

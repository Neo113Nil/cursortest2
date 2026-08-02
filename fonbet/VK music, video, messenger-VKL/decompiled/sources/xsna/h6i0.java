package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;

/* compiled from: SelectAlbumBottomSheet.kt */
/* loaded from: classes4.dex */
public final class h6i0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ ModalBottomSheetBehavior.d a;
    public final /* synthetic */ n6i0 b;

    public h6i0(ModalBottomSheetBehavior.d dVar, n6i0 n6i0Var) {
        this.a = dVar;
        this.b = n6i0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        ModalBottomSheetBehavior.d dVar = this.a;
        if (dVar != null) {
            dVar.a(view, f);
        }
        n6i0 n6i0Var = this.b;
        bqa bqaVar = n6i0Var.i;
        bqaVar.getClass();
        bqaVar.c = (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f * 0.26999998f : f * 0.73f) + 0.73f;
        n6i0Var.e.getRecyclerView().invalidateItemDecorations();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        n6i0 n6i0Var = this.b;
        AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = n6i0Var.e;
        bqa bqaVar = n6i0Var.i;
        ModalBottomSheetBehavior.d dVar = this.a;
        if (dVar != null) {
            dVar.b(i, view);
        }
        if (i == 3) {
            bqaVar.c = 1.0f;
            albumsSettingsRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
        } else {
            if (i != 4) {
                return;
            }
            bqaVar.c = 0.73f;
            albumsSettingsRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
        }
    }
}

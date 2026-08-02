package xsna;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class gnc0 implements ActionMode.Callback {
    public final /* synthetic */ enc0 a;

    public gnc0(enc0 enc0Var) {
        this.a = enc0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        enc0 enc0Var = this.a;
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
        if (mediaPickerBottomSheetBehavior == null || mediaPickerBottomSheetBehavior.k != 5) {
            f4m.v(0, enc0Var.n);
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}

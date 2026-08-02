package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.ui.checkaccess.CheckAccessBottomSheetFragment;

/* compiled from: VkCheckAccessBottomSheetRouter.kt */
/* loaded from: classes15.dex */
public final class oju0 {
    public final Context a;
    public final FragmentManager b;

    public oju0(Context context, FragmentManager fragmentManager) {
        this.a = context;
        this.b = fragmentManager;
    }

    public final void a(String str, boolean z) {
        CheckAccessBottomSheetFragment.CloseWithErrorResult closeWithErrorResult = new CheckAccessBottomSheetFragment.CloseWithErrorResult(str, z);
        Bundle bundle = new Bundle();
        bundle.putParcelable("close_with_error", closeWithErrorResult);
        s3q0 s3q0Var = s3q0.a;
        this.b.k0(bundle, "key_check_access_result");
    }
}

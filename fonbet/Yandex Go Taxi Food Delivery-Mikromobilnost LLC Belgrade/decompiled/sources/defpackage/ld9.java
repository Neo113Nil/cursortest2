package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.g;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ld9 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        bd9 bd9Var = (bd9) obj;
        u8j0 u8j0Var = bd9Var.a;
        if (u8j0Var instanceof t8j0) {
            return id9.a;
        }
        if (u8j0Var instanceof r8j0) {
            return new jd9(((sc9) ((r8j0) u8j0Var).a).a, bd9Var.c);
        }
        if (!(u8j0Var instanceof s8j0)) {
            w511.b();
            return null;
        }
        Throwable th = ((s8j0) u8j0Var).a;
        BottomSheetDialogView.State.a aVar = new BottomSheetDialogView.State.a(gao.f(th, gao.a), gao.b(th, gao.b), new g(gao.c(th), BottomSheetDialogView.State.ImageScale.FIT_CENTER, null, null, 28), null, Integer.valueOf(kp50.r(41)), Integer.valueOf(ModuleDescriptor.MODULE_VERSION), 72);
        Text.Resource resource = gao.c;
        if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
            resource = gao.f;
        } else {
            boolean z = th instanceof FailDataException;
        }
        return new hd9(new BottomSheetDialogView.State(aVar, new YbButtonView.a(resource, null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068));
    }
}

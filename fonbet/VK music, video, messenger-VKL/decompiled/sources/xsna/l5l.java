package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l5l implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l5l(nx50 nx50Var, FragmentImpl fragmentImpl, boolean z) {
        this.d = nx50Var;
        this.e = fragmentImpl;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        File parentFile;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                if (!this.c && (parentFile = new File((String) wh50Var.getValue()).getParentFile()) != null) {
                    wh50Var.setValue(parentFile.getAbsolutePath());
                    if (!((List) wh50Var2.getValue()).isEmpty()) {
                        wh50Var2.setValue(j5g.T(1, (List) wh50Var2.getValue()));
                    }
                }
                break;
            default:
                nx50 nx50Var = (nx50) this.d;
                NavigationDelegateActivity navigationDelegateActivity = nx50Var.b;
                FragmentImpl fragmentImpl = (FragmentImpl) this.e;
                if (!com.vk.toggle.d.J()) {
                    nx50.Z0(nx50Var, fragmentImpl, 2);
                } else if (nx50Var.q.a(fragmentImpl) != R.id.fragment_without_bottom_bar_wrapper) {
                    nx50.Z0(nx50Var, fragmentImpl, 2);
                } else if (!this.c) {
                    nx50Var.U0(nx50Var.w0());
                }
                if (fragmentImpl instanceof vds) {
                    navigationDelegateActivity.setRequestedOrientation(((vds) fragmentImpl).Q0());
                } else {
                    navigationDelegateActivity.setRequestedOrientation(-1);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l5l(boolean z, wh50 wh50Var, wh50 wh50Var2) {
        this.c = z;
        this.d = wh50Var;
        this.e = wh50Var2;
    }
}

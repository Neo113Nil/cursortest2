package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.llu0;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class klu0 implements gzs {
    public final /* synthetic */ llu0 b;
    public final /* synthetic */ MultiAccountEntryPoint c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ FragmentManager e;

    public /* synthetic */ klu0(llu0 llu0Var, MultiAccountEntryPoint multiAccountEntryPoint, Context context, FragmentManager fragmentManager) {
        this.b = llu0Var;
        this.c = multiAccountEntryPoint;
        this.d = context;
        this.e = fragmentManager;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        llu0 llu0Var = this.b;
        MultiAccountEntryPoint multiAccountEntryPoint = this.c;
        int i = llu0.a.$EnumSwitchMapping$0[llu0Var.d(multiAccountEntryPoint).ordinal()];
        if (i == 1) {
            ArrayList e = llu0Var.b.e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((usi0.a) it.next()).c().a);
            }
            llu0Var.i(this.d, arrayList, multiAccountEntryPoint);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            llu0Var.j(this.e, multiAccountEntryPoint, SwitcherLaunchMode.DefaultMode.b, SwitcherUiMode.Ecoplate.b);
        }
        return s3q0.a;
    }
}

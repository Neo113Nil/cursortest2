package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.permission.PermissionHelper;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((fw) obj).e.b();
                break;
            case 1:
                ((bzd) obj).d.a();
                break;
            case 2:
                dialogInterface.dismiss();
                ((DebugMockApiResponsesFragment.c) obj).invoke();
                break;
            case 3:
                GeoFragment geoFragment = (GeoFragment) obj;
                yl00 yl00Var = geoFragment.b0;
                if (yl00Var != null) {
                    PermissionHelper.a.getClass();
                    yl00Var.c();
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context requireContext = geoFragment.requireContext();
                permissionHelper.getClass();
                geoFragment.startActivityForResult(PermissionHelper.m(requireContext), 101);
                break;
            case 4:
                dvt dvtVar = (dvt) obj;
                dvtVar.j();
                dvtVar.q();
                break;
            case 5:
                ImportContactsFragment importContactsFragment = (ImportContactsFragment) obj;
                int i3 = ImportContactsFragment.Q;
                if (importContactsFragment.getLifecycle().getCurrentState().a(Lifecycle.State.CREATED)) {
                    PermissionHelper permissionHelper2 = PermissionHelper.a;
                    Context requireContext2 = importContactsFragment.requireContext();
                    permissionHelper2.getClass();
                    PermissionHelper.l(permissionHelper2, requireContext2, PermissionHelper.b, null, null, 28);
                    break;
                }
                break;
            default:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b bVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b) obj;
                qcy<Object>[] qcyVarArr = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                dialogInterface.dismiss();
                a.C0952a c0952a = a.C0952a.b;
                bVar.getClass();
                xn50.a.c(bVar, c0952a);
                break;
        }
    }
}

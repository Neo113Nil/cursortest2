package xsna;

import android.view.View;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.im.ui.fragments.ImContactsListFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uzv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uzv(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ImContactsListFragment imContactsListFragment = (ImContactsListFragment) obj;
                qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
                g2v.c().getClass();
                szv.a(k9u0.a, imContactsListFragment.kn(), z ? ContactsPermissionMessage.EDU : ContactsPermissionMessage.DEFAULT, new jpf(imContactsListFragment, 28), null, null, 24);
                break;
            default:
                View view = (View) obj;
                g6z.c(view, view, z, false, 48);
                break;
        }
        return s3q0.a;
    }
}

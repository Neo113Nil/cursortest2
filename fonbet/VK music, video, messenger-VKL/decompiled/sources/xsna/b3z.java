package xsna;

import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import xsna.smu0;

/* compiled from: LibverifyCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public final class b3z implements smu0.a {
    public final /* synthetic */ c3z a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ dgm c;
    public final /* synthetic */ tvj d;

    public b3z(c3z c3zVar, String[] strArr, dgm dgmVar, tvj tvjVar) {
        this.a = c3zVar;
        this.b = strArr;
        this.c = dgmVar;
        this.d = tvjVar;
    }

    @Override // xsna.smu0.a
    public final void a() {
        PermissionHelper.a.k(this.a.kn(), this.b, R.string.vk_permissions_call_log, this.c, new g1j(this.d, 19));
    }

    @Override // xsna.smu0.a
    public final void b() {
        this.d.invoke();
    }

    @Override // xsna.smu0.a
    public final void onCancel() {
        this.d.invoke();
    }
}

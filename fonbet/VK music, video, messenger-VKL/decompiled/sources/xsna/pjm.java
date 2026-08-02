package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.core.fragments.FragmentImpl;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.permission.PermissionHelper;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ui90;
import xsna.ym30;

/* compiled from: DialogScreenshotTracker.kt */
/* loaded from: classes2.dex */
public final class pjm implements ym30.a, ui90.a {
    public final Context a;
    public final ChatFragment b;
    public final pqb c;
    public final a1w d;
    public final Window e;
    public final com.vk.movika.sdk.base.logic.interactor.h f;
    public final wm1 g;
    public final bpn0 h = new bpn0(new r5i(this, 4));
    public io.reactivex.rxjava3.disposables.c i;
    public boolean j;
    public i5v0 k;
    public Object l;
    public boolean m;

    public pjm(Context context, ChatFragment chatFragment, pqb pqbVar, a1w a1wVar, Window window, com.vk.movika.sdk.base.logic.interactor.h hVar, wm1 wm1Var) {
        this.a = context;
        this.b = chatFragment;
        this.c = pqbVar;
        this.d = a1wVar;
        this.e = window;
        this.f = hVar;
        this.g = wm1Var;
    }

    @Override // xsna.ym30.a
    public final void a(Collection<? extends Msg> collection) {
        h();
        if (d() || !this.j) {
            return;
        }
        boolean l = com.vk.im.engine.utils.a.l((Dialog) this.f.invoke(), collection);
        if (l && !this.m && c()) {
            e(true);
        } else if (this.m) {
            if (l && c()) {
                return;
            }
            e(false);
        }
    }

    @Override // xsna.ui90.a
    public final void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
        this.l = fragmentImpl2;
        Collection<? extends Msg> collection = (Collection) this.g.invoke();
        if (collection == null) {
            collection = EmptyList.b;
        }
        a(collection);
    }

    public final boolean c() {
        com.vk.core.fragments.a aVar = (com.vk.core.fragments.a) this.c.get();
        return aVar != null && aVar.j(this.b);
    }

    public final boolean d() {
        Dialog dialog;
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr = PermissionHelper.d;
        permissionHelper.getClass();
        return PermissionHelper.b(this.a, strArr) && (dialog = (Dialog) this.f.invoke()) != null && dialog.Gb();
    }

    public final void e(boolean z) {
        this.m = z;
        Window window = this.e;
        if (z) {
            if (window != null) {
                window.addFlags(8192);
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (window != null) {
                window.clearFlags(8192);
            }
        }
    }

    public final void f(com.vk.im.ui.components.msg_list.a aVar) {
        com.vk.core.fragments.a aVar2 = (com.vk.core.fragments.a) this.c.get();
        if (aVar2 != null) {
            aVar2.z(this);
        }
        this.j = true;
        aVar.k0 = this;
        this.k = aVar;
        h();
    }

    public final void g() {
        com.vk.core.fragments.a aVar = (com.vk.core.fragments.a) this.c.get();
        if (aVar != null) {
            aVar.u(this);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
        i5v0 i5v0Var = this.k;
        if (i5v0Var != null) {
            i5v0Var.Z0(null);
        }
        this.k = null;
        if (this.m) {
            e(false);
        }
        this.j = false;
    }

    public final void h() {
        if (!d()) {
            if (!this.j || this.i == null) {
                return;
            }
            g();
            return;
        }
        if (this.j && this.i == null) {
            this.i = io.reactivex.rxjava3.kotlin.c.f(2, ((zdh0) this.h.getValue()).c().a0(asu0.a.d()), null, new com.vk.movika.sdk.base.observable.i(25), new fgh(this, 6));
        }
        if (this.m) {
            e(false);
        }
    }
}

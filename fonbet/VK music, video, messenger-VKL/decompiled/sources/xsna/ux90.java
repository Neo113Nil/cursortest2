package xsna;

import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.HashSet;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: PermissionHandler.kt */
/* loaded from: classes6.dex */
public final class ux90 implements VkUiPermissionsHandler {
    public final long a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final HashSet<String> c;
    public w73 d;

    /* compiled from: PermissionHandler.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public ux90(long j) {
        this.a = j;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        this.c = new HashSet<>();
        if (j > 0) {
            bVar.b(c().subscribe(new yeq(new k990(1), 1), new wx00(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 9)));
        }
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiPermissionsHandler
    public final boolean a(VkUiPermissionsHandler.Permissions permissions) {
        return this.c.contains(permissions.h());
    }

    @Override // com.vk.superapp.base.js.bridge.VkUiPermissionsHandler
    public final io.reactivex.rxjava3.internal.operators.observable.b0 b(VkUiPermissionsHandler.Permissions permissions) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 a2 = vdx0Var.n().a(this.a, permissions.h());
        uk40 uk40Var = new uk40(new ju(17, this, permissions), 6);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a2.E(uk40Var, lVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.core.q<w73> c() {
        io.reactivex.rxjava3.core.q T;
        w73 w73Var = this.d;
        if (w73Var != null) {
            return io.reactivex.rxjava3.core.q.T(w73Var);
        }
        long j = InternalMiniApps.ACCOUNT.h().a;
        long j2 = this.a;
        if (j2 != j && j2 != InternalMiniApps.BLOCKED.h().a) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            if (wdx0Var.k()) {
                vdx0 vdx0Var = e370.e;
                T = (vdx0Var != null ? vdx0Var : null).n().b(j2);
                vk40 vk40Var = new vk40(new h440(this, 7), 12);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return T.E(vk40Var, lVar, kVar, kVar);
            }
        }
        EmptyList emptyList = EmptyList.b;
        T = io.reactivex.rxjava3.core.q.T(new w73(emptyList, emptyList, null, null));
        vk40 vk40Var2 = new vk40(new h440(this, 7), 12);
        a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(vk40Var2, lVar2, kVar2, kVar2);
    }
}

package xsna;

import android.accounts.Account;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AccountManagerRepositoryProxy.kt */
/* loaded from: classes.dex */
public final class pp implements mp {
    public final jp a;
    public final dp b;

    public pp(jp jpVar, dp dpVar) {
        this.a = jpVar;
        this.b = dpVar;
    }

    @Override // xsna.mp
    public final hp a(UserId userId) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return this.a.a(userId);
        }
        xgx0.a.getClass();
        xgx0.f("AccountManager is not enabled");
        return null;
    }

    @Override // xsna.mp
    public final List<hp> b() {
        List<hp> list = EmptyList.b;
        if (((Boolean) this.b.invoke()).booleanValue()) {
            list = this.a.b();
        } else {
            xgx0.a.getClass();
            xgx0.f("AccountManager is not enabled");
        }
        return list;
    }

    @Override // xsna.mp
    public final boolean c(UserId userId) {
        Boolean bool = Boolean.FALSE;
        if (((Boolean) this.b.invoke()).booleanValue()) {
            bool = Boolean.valueOf(this.a.c(userId));
        } else {
            xgx0.a.getClass();
            xgx0.f("AccountManager is not enabled");
        }
        return bool.booleanValue();
    }

    @Override // xsna.mp
    public final Account d(hp hpVar) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return this.a.d(hpVar);
        }
        xgx0.a.getClass();
        xgx0.f("AccountManager is not enabled");
        return null;
    }

    @Override // xsna.mp
    public final hp e(UserId userId) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return this.a.e(userId);
        }
        xgx0.a.getClass();
        xgx0.f("AccountManager is not enabled");
        return null;
    }

    @Override // xsna.mp
    public final List<hp> f() {
        List<hp> list = EmptyList.b;
        if (((Boolean) this.b.invoke()).booleanValue()) {
            list = this.a.f();
        } else {
            xgx0.a.getClass();
            xgx0.f("AccountManager is not enabled");
        }
        return list;
    }

    @Override // xsna.mp
    public final Account g(hp hpVar) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return this.a.g(hpVar);
        }
        xgx0.a.getClass();
        xgx0.f("AccountManager is not enabled");
        return null;
    }
}

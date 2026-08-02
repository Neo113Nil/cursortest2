package xsna;

import com.google.gson.Gson;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: TabbarRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class fun0 implements eun0 {
    public static final Gson c = new Gson();
    public static final TabbarState d = new TabbarState(e43.l(new TabbarItem("home", null, null, false, null, 30, null), new TabbarItem("overview", null, null, false, null, 30, null), new TabbarItem("im", null, null, false, null, 30, null), new TabbarItem("clips", null, null, true, null, 22, null), new TabbarItem("empty", null, null, true, null, 22, null), new TabbarItem("hub", null, null, false, null, 30, null)), Boolean.FALSE);
    public TabbarState a;
    public UserId b;

    @Override // xsna.eun0
    public final UserId a() {
        return this.b;
    }

    @Override // xsna.eun0
    public final TabbarState b() {
        TabbarState tabbarState = this.a;
        this.a = null;
        return tabbarState;
    }

    @Override // xsna.eun0
    public final TabbarState c() {
        String s;
        Object failure;
        s = Preference.s("tabbar_storage", "tabbar_state", new String());
        try {
            failure = (TabbarState) c.fromJson(s, TabbarState.class);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        TabbarState tabbarState = d;
        if (a != null) {
            failure = tabbarState;
        }
        TabbarState tabbarState2 = (TabbarState) failure;
        return tabbarState2 == null ? tabbarState : tabbarState2;
    }

    @Override // xsna.eun0
    public final void d() {
        Preference.C("tabbar_storage", "tabbar_pinned_group");
    }

    @Override // xsna.eun0
    public final void e(TabbarState tabbarState) {
        Object obj;
        if (tabbarState.d().isEmpty()) {
            return;
        }
        Preference.H("tabbar_storage", "tabbar_state", c.toJson(tabbarState));
        Iterator<T> it = tabbarState.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TabbarItem) obj).b != null) {
                    break;
                }
            }
        }
        if (((TabbarItem) obj) != null) {
            this.a = tabbarState;
        }
    }

    @Override // xsna.eun0
    public final void f(UserId userId) {
        Preference.H("tabbar_storage", "tabbar_pinned_group", String.valueOf(userId.b));
    }

    @Override // xsna.eun0
    public final void g(UserId userId) {
        this.b = userId;
    }

    @Override // xsna.eun0
    public final UserId h() {
        String s;
        s = Preference.s("tabbar_storage", "tabbar_pinned_group", new String());
        Long n = arm0.n(s);
        if (n != null) {
            return new UserId(n.longValue());
        }
        return null;
    }

    @Override // xsna.eun0
    public final void i() {
        this.a = null;
    }

    @Override // xsna.eun0
    public final io.reactivex.rxjava3.internal.operators.observable.f0 j(List list) {
        return rsg0.W(yfb.x(ad0.F(alk.b(), list)), 7);
    }
}

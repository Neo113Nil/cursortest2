package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity;
import java.util.ArrayList;

/* compiled from: TabbarSuggestActivity.kt */
/* loaded from: classes6.dex */
public final class pwn0 implements own0 {
    public final /* synthetic */ TabbarSuggestActivity a;
    public final /* synthetic */ rvn0 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TabbarSuggestState d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public pwn0(TabbarSuggestActivity tabbarSuggestActivity, rvn0 rvn0Var, ArrayList arrayList, TabbarSuggestState tabbarSuggestState, int i, String str) {
        this.a = tabbarSuggestActivity;
        this.b = rvn0Var;
        this.c = arrayList;
        this.d = tabbarSuggestState;
        this.e = i;
        this.f = str;
    }

    @Override // xsna.own0
    public final void a() {
        this.a.finish();
        this.b.f();
    }

    @Override // xsna.own0
    public final void b() {
        if (jjc.d().a()) {
            return;
        }
        this.b.e(this.e, this.d, this.f, this.c);
        new Handler(Looper.getMainLooper()).postDelayed(new or4(this.a, 14), 100L);
    }

    @Override // xsna.own0
    public final void onClose() {
        this.a.finish();
    }
}

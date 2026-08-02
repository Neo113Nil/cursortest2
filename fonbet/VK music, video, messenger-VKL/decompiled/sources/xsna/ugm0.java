package xsna;

import androidx.preference.Preference;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import java.util.List;
import xsna.h1o0;
import xsna.h8z0;
import xsna.hjz0;
import xsna.hox;
import xsna.s8z0;
import xsna.uon0;
import xsna.vyw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ugm0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, uon0.a, zbs, VkCheckboxItem.a, Preference.c, s8z0.a, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ugm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        switch (this.b) {
            case 10:
                r2z0 r2z0Var = (r2z0) this.c;
                hjz0.a aVar = r2z0Var.a;
                String str = r2z0Var.k.F;
                yil0.d(aVar);
                break;
            default:
                hcy0 hcy0Var = ((baz0) this.c).l;
                pdz0.this.g.a.a.a(new hox.a());
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Boolean) ((x620) obj2).invoke(obj);
            case 1:
            case 3:
            default:
                int i2 = VideoOfflineFragment.f1;
                return (List) ((yka0) obj2).invoke(obj);
            case 2:
                return (h1o0.c.b) ((mcj0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((x620) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.checkbox.VkCheckboxItem.a
    public void b(boolean z) {
        d2x0 d2x0Var = (d2x0) this.c;
        int i = d2x0.j1;
        xn50.a.c(d2x0Var, new vyw0.a(z));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        boolean b;
        b = ru.mail.libverify.k.a.b((ru.mail.libverify.k.a) this.c, preference);
        return b;
    }

    @Override // xsna.uon0.a
    public Object execute() {
        ((qdq0) this.c).i.m();
        return null;
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((bly0) this.c).f = z9z0Var;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((x620) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ ugm0(baz0 baz0Var, m6z0 m6z0Var) {
        this.b = 11;
        this.c = baz0Var;
    }
}

package defpackage;

import com.yandex.go.navigator.settings.BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public abstract class aa5 extends ad5 {
    public final z95 A;
    public final String x;
    public final b y;
    public final pwy0 z;

    public aa5(String str, b bVar, pwy0 pwy0Var, z95 z95Var) {
        super(ebr0.class);
        this.x = str;
        this.y = bVar;
        this.z = pwy0Var;
        this.A = z95Var;
    }

    public void Kg(y95 y95Var) {
        per0 binding;
        Bg(y95Var);
        binding = y95Var.a.getBinding();
        binding.c.setText(this.x);
        tje.N(Jg(), null, null, new BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1(this.z.a(), null, this, y95Var), 3);
    }
}

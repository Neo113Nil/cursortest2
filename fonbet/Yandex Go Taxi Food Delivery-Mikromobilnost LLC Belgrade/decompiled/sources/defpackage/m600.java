package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.repositories.e;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class m600 {
    public final wq21 a;
    public final e b;
    public final pwy0 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final g e;
    public final zuj0 f;

    public m600(wq21 wq21Var, e eVar, pwy0 pwy0Var, ru.yandex.taxi.widget.utils.e eVar2, g gVar, zuj0 zuj0Var) {
        this.a = wq21Var;
        this.b = eVar;
        this.c = pwy0Var;
        this.d = eVar2;
        this.e = gVar;
        this.f = zuj0Var;
    }

    public static final r600 a(m600 m600Var, boolean z, Drawable drawable) {
        return new r600(z, drawable, ((UserPhotoUploadingExperiment) m600Var.a.a().b()).b ? j600.a : k600.a);
    }
}

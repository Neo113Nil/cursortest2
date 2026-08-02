package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.experiments.ExperimentName;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom_Impl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class bro extends yqo {
    public final ExperimentsDatabaseRoom_Impl a;
    public final mqo c = new mqo();
    public final aro b = new aro(0, this);

    public bro(ExperimentsDatabaseRoom_Impl experimentsDatabaseRoom_Impl) {
        this.a = experimentsDatabaseRoom_Impl;
    }

    @Override // defpackage.yqo
    public final void a() {
        a.b(this.a, false, true, new l0o(12));
    }

    @Override // defpackage.yqo
    public final List b() {
        return (List) a.b(this.a, true, false, new dzm(11, this));
    }

    @Override // defpackage.yqo
    public final nqo c(ExperimentName experimentName) {
        return (nqo) a.b(this.a, true, false, new t8j(29, this, experimentName));
    }

    @Override // defpackage.yqo
    public final void d(ArrayList arrayList) {
        a.b(this.a, false, true, new zqo(this, arrayList, 0));
    }

    @Override // defpackage.yqo
    public final void e(ArrayList arrayList) {
        a.b(this.a, false, true, new zqo(this, arrayList, 1));
    }
}

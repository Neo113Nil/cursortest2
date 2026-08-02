package defpackage;

import android.os.Bundle;
import ru.yandex.taxi.search.view.a;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactoryCreator;

/* loaded from: classes12.dex */
public final /* synthetic */ class ag9 implements gpg, dx4, kds {
    public final /* synthetic */ sls a;

    public /* synthetic */ ag9(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.gpg
    public hpg c() {
        hpg create$lambda$4$lambda$3;
        create$lambda$4$lambda$3 = DefaultDataSourceFactoryCreator.create$lambda$4$lambda$3(this.a);
        return create$lambda$4$lambda$3;
    }

    @Override // defpackage.dx4
    public void o(a aVar, pv0 pv0Var) {
        this.a.invoke();
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        this.a.invoke();
    }
}

package defpackage;

import ru.yandex.taxi.favorites.edit.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class mgp implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ mgp(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return new yt3(tje.r(prg0.favorite_map_preview_title_size_min, r4.getContext()), tje.r(prg0.favorite_map_preview_title_size_max, r4.getContext()), 2, aVar.f);
            case 1:
                return new pry0(new auy0(aVar.f));
            default:
                aVar.k.run();
                return zy11.a;
        }
    }
}

package defpackage;

import defpackage.lmu0;
import defpackage.mmu0;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.stories.data.repositories.a;

/* loaded from: classes10.dex */
public final class mmu0 {
    public final pav a;
    public final a b;

    public mmu0(pav pavVar, ru.yandex.taxi.stories.data.caching.a aVar) {
        this.a = pavVar;
        this.b = new a(aVar, new wls() { // from class: ru.yandex.taxi.stories.data.repositories.images.a
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return tje.h((tse) obj, null, null, new StoriesImagesRepositoryImpl$downloadRepository$1$1(mmu0.this, (lmu0) obj2, null), 3);
            }
        });
    }
}

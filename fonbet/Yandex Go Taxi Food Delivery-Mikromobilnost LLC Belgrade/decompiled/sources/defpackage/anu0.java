package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;
import ru.yandex.taxi.stories.data.caching.a;

/* loaded from: classes10.dex */
public final class anu0 {
    public final mmu0 a;
    public final rlu0 b;
    public final a c;

    public anu0(mmu0 mmu0Var, rlu0 rlu0Var, a aVar) {
        this.a = mmu0Var;
        this.b = rlu0Var;
        this.c = aVar;
    }

    public final void a(Story story) {
        story.getClass();
        ArrayList s = story.s(PromotionBackground.Type.ANIMATION);
        s.addAll(story.t(Story.PageMediaType.ANIMATION));
        ArrayList arrayList = new ArrayList();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!cvu0.x((String) next, "file://", false)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            this.b.b.b(new qlu0(story.b, str));
        }
    }

    public final void b(Story story, boolean z) {
        zmu0 zmu0Var = new zmu0(this, story, 0);
        story.getClass();
        ArrayList s = story.s(PromotionBackground.Type.IMAGE);
        s.addAll(story.t(Story.PageMediaType.IMAGE));
        Iterator it = s.iterator();
        while (it.hasNext()) {
            zmu0Var.invoke((String) it.next());
            if (z) {
                Story.e eVar = story.i.c;
                String str = null;
                if (eVar != null) {
                    d dVar = PromotionBackground.Companion;
                    List list = eVar.a;
                    PromotionBackground.Type type = PromotionBackground.Type.IMAGE;
                    dVar.getClass();
                    String b = d.b(list, type);
                    if (b != null && b.length() != 0) {
                        str = b;
                    }
                }
                if (str != null) {
                    zmu0Var.invoke(str);
                }
            }
        }
    }
}

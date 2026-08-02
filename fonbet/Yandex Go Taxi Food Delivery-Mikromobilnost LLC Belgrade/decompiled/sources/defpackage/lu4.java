package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.stories.domain.a;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes5.dex */
public final /* synthetic */ class lu4 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Story b;
    public final /* synthetic */ c c;

    public /* synthetic */ lu4(c cVar, Story story) {
        this.c = cVar;
        this.b = story;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.c;
        Story story = this.b;
        switch (i) {
            case 0:
                duc ducVar = cVar.i;
                ((dae0) ducVar.a).d(story.b);
                break;
            default:
                vby vbyVar = xby.d;
                String.format("show story %s", Arrays.copyOf(new Object[]{story.b}, 1));
                vbyVar.getClass();
                cVar.b.k(story.b, null, Promotion.Type.STORY, Promotion.a.contains(story.m()), cVar.r, story.e);
                jpu0 jpu0Var = cVar.j;
                lu4 lu4Var = new lu4(cVar, story);
                ((pep0) jpu0Var.c).f(new pw1(10, (a) jpu0Var.a.get(), lu4Var), new npu0((x3) new kpu0(story), ((cay0) jpu0Var.b.j).b(), (Float) null, false, HProv.PP_SAME_MEDIA), hxx.a);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ lu4(Story story, c cVar) {
        this.b = story;
        this.c = cVar;
    }
}

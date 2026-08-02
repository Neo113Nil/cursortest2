package xsna;

import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.cck;
import xsna.ig3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kh3 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kh3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                rh3 rh3Var = (rh3) obj2;
                Photo photo = (Photo) obj;
                if (i == 130) {
                    rh3Var.C(new ig3.l(photo, true));
                    break;
                } else if (i == 131) {
                    rh3Var.C(new ig3.l(photo, false));
                    break;
                }
                break;
            default:
                fck fckVar = (fck) obj2;
                NewsEntry newsEntry = (NewsEntry) obj;
                qcy<Object>[] qcyVarArr = fck.t1;
                if (epx.f(k9q0.o(newsEntry), ((b25) fckVar.j1.getValue()).c())) {
                    fckVar.eo().b(new cck.e(newsEntry));
                    break;
                }
                break;
        }
    }
}

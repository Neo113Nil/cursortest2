package xsna;

import com.vk.dto.articles.Article;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pme0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pme0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Article article = (Article) this.d;
                ((Integer) obj).intValue();
                article.n = this.c;
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var != null) {
                    dw20Var.Pn(-2);
                    break;
                }
                break;
            default:
                ((com.vk.video.ui.discovery.minimizable.related_videos.c) this.d).e.invoke(new c.s0.i(new m.b(this.c)));
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import com.vk.dto.newsfeed.entries.Post;
import xsna.l6w;
import xsna.v6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y6w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y6w(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((d7w) this.c).c(new l6w.b.g(((v6w.a.c) ((v6w.a) this.d)).b));
                break;
            default:
                xzb0 xzb0Var = (xzb0) this.c;
                ((p870) xzb0Var.l.getValue()).e(102, (Post) this.d);
                break;
        }
    }
}

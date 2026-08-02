package xsna;

import com.vk.dto.stickers.StickerItem;
import java.util.List;

/* compiled from: StickerSearcher.kt */
/* loaded from: classes5.dex */
public final class b6l0 {
    public final kcl0 a;
    public final List<StickerItem> b;
    public final fdi c = new fdi();
    public final bpn0 d = new bpn0(new gqh0(this, 3));
    public volatile c6l0 e;

    /* compiled from: StickerSearcher.kt */
    public static final class a {
        public final String a;
        public final List<StickerItem> b;
        public final List<StickerItem> c;

        public a(String str, List<StickerItem> list, List<StickerItem> list2) {
            this.a = str;
            this.b = list;
            this.c = list2;
        }
    }

    public b6l0(kcl0 kcl0Var) {
        this.a = kcl0Var;
        this.b = kcl0Var.i();
    }

    public final List<StickerItem> a(List<StickerItem> list) {
        i5g i5gVar = new i5g(list);
        c6l0 c6l0Var = this.e;
        if (c6l0Var == null) {
            c6l0Var = null;
        }
        return rli0.B(new fhn(rli0.m(new qli0(i5gVar, c6l0Var)), new wx30(12)));
    }
}

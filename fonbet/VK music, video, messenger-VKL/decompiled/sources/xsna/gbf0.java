package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: RecommendationsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class gbf0 implements fcn, m0q0, c.m<StickerPackRecommendationBlock> {
    public final rdf0 b;
    public final cy0 c;
    public final ContextUser d;
    public final String e;
    public dw20 f;
    public String g;
    public final a h;
    public bd5 i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public dcl0<hfz> k;
    public Integer l;

    /* compiled from: RecommendationsBottomSheet.kt */
    public static final class a extends sxm implements vic {
        public final f9l0 i;
        public final ContextUser j;
        public final GiftData k;
        public final String l;

        public a(f9l0 f9l0Var, ContextUser contextUser, GiftData giftData, String str) {
            this.i = f9l0Var;
            this.j = contextUser;
            this.k = giftData;
            this.l = str;
            x0(odf0.class, new uh40(this, 18));
        }

        public final void J0(cbf0 cbf0Var) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = cbf0Var.c.iterator();
            while (it.hasNext()) {
                arrayList.add(new odf0((StickerStockItem) it.next(), this.j, this.k, this.l));
            }
            setItems(arrayList);
        }

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public gbf0(rdf0 rdf0Var, cy0 cy0Var, ContextUser contextUser, f9l0 f9l0Var, GiftData giftData, String str) {
        this.b = rdf0Var;
        this.c = cy0Var;
        this.d = contextUser;
        this.e = str;
        this.h = new a(f9l0Var, contextUser, giftData, str);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> O9(String str, com.vk.lists.c cVar) {
        String str2 = this.g;
        if (str2 == null) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        if (str == null || str.equals("0")) {
            str = null;
        }
        return this.b.b(str2, str);
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> hj(com.vk.lists.c cVar, boolean z) {
        String str = this.g;
        if (str != null) {
            this.b.a.remove(str);
        }
        return O9(null, cVar);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickerPackRecommendationBlock> qVar, boolean z, com.vk.lists.c cVar) {
        this.j.b(qVar.subscribe(new a960(new com.vk.libvideo.design.view.video.a(26, this, cVar), 15), kwg0.b()));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.STICKER_PACK_RECOMENDATIONS_ALL;
    }
}

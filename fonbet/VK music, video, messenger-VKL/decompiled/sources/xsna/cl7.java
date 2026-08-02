package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecord;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecords;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BonusHistoryBottomSheet.kt */
/* loaded from: classes5.dex */
public final class cl7 implements fcn, c.m<StickersBonusHistoryRecords>, m0q0 {
    public dw20 b;
    public final a c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final bpn0 e;

    /* compiled from: BonusHistoryBottomSheet.kt */
    public static final class a extends sxm implements vic {
        public final void J0(List<StickersBonusHistoryRecord> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new fl7((StickersBonusHistoryRecord) it.next()));
            }
            setItems(arrayList);
        }

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    public cl7() {
        a aVar = new a();
        aVar.x0(fl7.class, new sm(4));
        this.c = aVar;
        this.d = new io.reactivex.rxjava3.disposables.b();
        this.e = new bpn0(new h13(2));
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
    public final io.reactivex.rxjava3.core.q<StickersBonusHistoryRecords> O9(String str, com.vk.lists.c cVar) {
        return ((v8l0) this.e.getValue()).a(20, str);
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<StickersBonusHistoryRecords> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<StickersBonusHistoryRecords> qVar, boolean z, com.vk.lists.c cVar) {
        this.d.b(qVar.subscribe(new defpackage.n(new al7(cVar, z, this), 9), kwg0.b()));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.STICKERS_BONUS_HISTORY;
    }
}

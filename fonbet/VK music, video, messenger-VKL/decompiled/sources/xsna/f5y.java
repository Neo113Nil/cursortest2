package xsna;

import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.keyboard.StickersView;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.subscription.api.SubscribeStatus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f5y implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0255, code lost:
    
        r1 = r4.h.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025f, code lost:
    
        if ((r1 instanceof com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
    
        r1 = com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem.f((com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem) r1, r10, r2, false, 478);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0271, code lost:
    
        r5 = new java.util.ArrayList(r4.h);
        r5.set(r8, r1);
        r4.setItems(r5);
        r1 = r10.b;
        r4.L0(r1, r18);
        r4.P0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0298, code lost:
    
        if (r3.l.getCurrentItem() != r3.m.getItemPosition(r3.w)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029a, code lost:
    
        r4.N0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026b, code lost:
    
        r1 = new xsna.kgy(r10, r2, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [xsna.sfy] */
    @Override // io.reactivex.rxjava3.functions.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z;
        int i;
        int i2;
        com.vk.stickers.keyboard.page.a aVar;
        ArrayList arrayList;
        ofy ofyVar;
        StickerStockItem Q0;
        Object obj2;
        int i3 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                ((qb6) obj3).invoke(obj);
                return;
            case 1:
                ((s8w) obj3).invoke(obj);
                return;
            case 2:
                ((u620) obj3).invoke(obj);
                return;
            case 3:
                ((fju) obj3).invoke(obj);
                return;
            case 4:
                ((ztj) obj3).invoke(obj);
                return;
            case 5:
                ((qb6) obj3).invoke(obj);
                return;
            case 6:
                ((fju) obj3).invoke(obj);
                return;
            case 7:
                ((pyz) obj3).invoke(obj);
                return;
            case 8:
                ((k650) obj3).invoke(obj);
                return;
            case 9:
                ((p7x) obj3).invoke(obj);
                return;
            case 10:
                ((qb6) obj3).invoke(obj);
                return;
            case 11:
                ((s8w) obj3).invoke(obj);
                return;
            case 12:
                ((fju) obj3).invoke(obj);
                return;
            case 13:
                ((xv2) obj3).invoke(obj);
                return;
            case 14:
                ((cae) obj3).invoke(obj);
                return;
            case 15:
                ((fju) obj3).invoke(obj);
                return;
            case 16:
                ((fju) obj3).invoke(obj);
                return;
            case 17:
                ((qb6) obj3).invoke(obj);
                return;
            case 18:
                ((qb6) obj3).invoke(obj);
                return;
            case 19:
                ((cya0) obj3).invoke(obj);
                return;
            case 20:
                ((ftm) obj3).invoke(obj);
                return;
            case 21:
                ((d5l0) obj3).invoke(obj);
                return;
            case 22:
                StickersView stickersView = (StickersView) obj3;
                ral0 ral0Var = stickersView.z;
                com.vk.stickers.keyboard.navigation.a aVar2 = stickersView.v;
                if ((obj instanceof c790) && (Q0 = stickersView.g.Q0(((c790) obj).a)) != null) {
                    int i4 = Q0.b;
                    Iterator it = aVar2.h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            hfz hfzVar = (hfz) obj2;
                            if (!(hfzVar instanceof ngy) || ((ngy) hfzVar).e().b != i4) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ngy ngyVar = (ngy) (obj2 instanceof ngy ? obj2 : null);
                    boolean T0 = ((kcl0) aVar2.j.b).T0(Q0);
                    if (ngyVar != null && ngyVar.d()) {
                        Iterator<? extends hfz> it2 = aVar2.h.iterator();
                        int i5 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                hfz next = it2.next();
                                if (!(next instanceof ngy) || !next.equals(ngyVar)) {
                                    i5++;
                                }
                            } else {
                                i5 = -1;
                            }
                        }
                        if (i5 >= 0) {
                            hfz hfzVar2 = aVar2.h.get(i5);
                            if (hfzVar2 instanceof ngy) {
                                ArrayList arrayList2 = new ArrayList(aVar2.h);
                                arrayList2.set(i5, ((ngy) hfzVar2).c(T0));
                                aVar2.setItems(arrayList2);
                            }
                        }
                    }
                    sal0 sal0Var = ral0Var.c;
                    if (sal0Var != null) {
                        com.vk.stickers.keyboard.page.a aVar3 = sal0Var.c;
                        Iterator<? extends hfz> it3 = aVar3.h.iterator();
                        int i6 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                hfz next2 = it3.next();
                                if (next2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.page.BaseKeyboardItem");
                                }
                                rf6 rf6Var = (rf6) next2;
                                if (rf6Var.a() != i4 || !com.vk.stickers.keyboard.page.a.P0(rf6Var)) {
                                    i6++;
                                }
                            } else {
                                i6 = -1;
                            }
                        }
                        aVar3.notifyItemChanged(i6);
                    }
                }
                if (!(obj instanceof htm0)) {
                    return;
                }
                htm0 htm0Var = (htm0) obj;
                StickerStockItem stickerStockItem = htm0Var.a;
                StickerStockItem stickerStockItem2 = htm0Var.b;
                sal0 sal0Var2 = ral0Var.c;
                if (sal0Var2 != null) {
                    com.vk.stickers.keyboard.page.a aVar4 = sal0Var2.c;
                    aVar4.getClass();
                    List<StickerItem> list = stickerStockItem2.g;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(aVar4.L0((StickerItem) it4.next(), stickerStockItem2.b, stickerStockItem2, "keyboard"));
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    Iterator<? extends hfz> it5 = aVar4.h.iterator();
                    int i7 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            hfz next3 = it5.next();
                            if (next3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.page.BaseKeyboardItem");
                            }
                            rf6 rf6Var2 = (rf6) next3;
                            if (rf6Var2.a() == stickerStockItem.b && com.vk.stickers.keyboard.page.a.P0(rf6Var2)) {
                                i2 = i7;
                            } else {
                                i7++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (stickerStockItem2.k) {
                        aVar = aVar4;
                        arrayList = arrayList4;
                        z = true;
                        ofyVar = new sfy(stickerStockItem2.d, stickerStockItem2.b, stickerStockItem2, aVar4.r, aVar4.t, 8);
                    } else {
                        aVar = aVar4;
                        arrayList = arrayList4;
                        z = true;
                        String str = stickerStockItem2.B;
                        ofyVar = new ofy(stickerStockItem2, !(str != null && str.length() > 0));
                    }
                    ArrayList arrayList5 = new ArrayList(aVar.h);
                    arrayList5.set(i2, ofyVar);
                    aVar.setItems(arrayList5);
                    aVar.K0(i2 + 1, arrayList);
                    aVar.R0();
                } else {
                    z = true;
                }
                ArrayList arrayList6 = ral0Var.d;
                if (arrayList6 != null) {
                    arrayList6.set(arrayList6.indexOf(stickerStockItem), stickerStockItem2);
                }
                StickerStockItem stickerStockItem3 = htm0Var.a;
                boolean T02 = ((kcl0) aVar2.j.b).T0(stickerStockItem2);
                Iterator<? extends hfz> it6 = aVar2.h.iterator();
                int i8 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        hfz next4 = it6.next();
                        if (next4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.navigation.KeyboardNavigationItem");
                        }
                        if (((jgy) next4).getId() == stickerStockItem3.b) {
                            i = i8;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                break;
            case 23:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                ((qhg0) obj3).invoke(obj);
                return;
            case 24:
                ((p7x) obj3).invoke(obj);
                return;
            case 25:
                ((qhg0) obj3).invoke(obj);
                return;
            case 26:
                ((f6m0) obj3).invoke(obj);
                return;
            case 27:
                ((qhg0) obj3).invoke(obj);
                return;
            case 28:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_MEMBER, (UserId) obj3, null, Peer.Type.GROUP, 4));
                return;
            default:
                l4o0 l4o0Var = (l4o0) obj3;
                l4o0Var.f();
                l4o0Var.g.post(new js2(5, l4o0Var, l4o0.d((List) obj)));
                return;
        }
    }
}

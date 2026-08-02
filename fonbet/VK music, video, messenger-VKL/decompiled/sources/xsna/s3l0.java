package xsna;

import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.api.generated.stickers.dto.StickersSubscribePackAuthorRefDto;
import com.vk.api.generated.stickers.dto.StickersUnSubscribePackAuthorRefDto;
import com.vk.api.generated.store.dto.StoreStockItemFieldsDto;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.stickers.details.AuthorSubscriptionRef;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.details.holders.PackStylesListHolder;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.f3l0;

/* compiled from: StickerDetailsPresenter.kt */
/* loaded from: classes6.dex */
public final class s3l0 implements i3l0 {
    public final StickerDetailsFragment b;
    public final rdf0 c;
    public d790 d;
    public VmojiAvatarModel e;
    public d790 f;
    public boolean g;
    public final ArrayList h = new ArrayList();
    public f3l0.a i = new f3l0.a.C2847a(0);
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();

    public s3l0(StickerDetailsFragment stickerDetailsFragment, rdf0 rdf0Var) {
        this.b = stickerDetailsFragment;
        this.c = rdf0Var;
    }

    @Override // xsna.i3l0
    public final void B(StickerStockItem stickerStockItem) {
        Object obj;
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qai0) obj).a.b == stickerStockItem.b) {
                    break;
                }
            }
        }
        qai0 qai0Var = (qai0) obj;
        if (qai0Var != null) {
            qai0Var.b = !qai0Var.b;
        }
        d790 d790Var = this.d;
        if (d790Var == null) {
            d790Var = null;
        }
        if (d790Var.b.contains(stickerStockItem)) {
            d790 d790Var2 = this.d;
            if (d790Var2 == null) {
                d790Var2 = null;
            }
            d790Var2.b.remove(stickerStockItem);
        } else {
            d790 d790Var3 = this.d;
            if (d790Var3 == null) {
                d790Var3 = null;
            }
            d790Var3.b.add(0, stickerStockItem);
        }
        d790 d790Var4 = this.d;
        z(d790Var4 != null ? d790Var4 : null, false);
    }

    @Override // xsna.i3l0
    public final void N(StickerStockItem stickerStockItem, AuthorSubscriptionRef authorSubscriptionRef) {
        StickersSubscribePackAuthorRefDto stickersSubscribePackAuthorRefDto;
        StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto;
        boolean f = epx.f(stickerStockItem.S, Boolean.TRUE);
        StickerDetailsFragment stickerDetailsFragment = this.b;
        if (f) {
            AuthorSubscriptionRef.Companion.getClass();
            int i = AuthorSubscriptionRef.a.C1793a.$EnumSwitchMapping$0[authorSubscriptionRef.ordinal()];
            if (i == 1) {
                stickersUnSubscribePackAuthorRefDto = StickersUnSubscribePackAuthorRefDto.AUTOTESTS;
            } else if (i == 2) {
                stickersUnSubscribePackAuthorRefDto = StickersUnSubscribePackAuthorRefDto.PACK_DETAILS;
            } else if (i == 3) {
                stickersUnSubscribePackAuthorRefDto = StickersUnSubscribePackAuthorRefDto.PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stickersUnSubscribePackAuthorRefDto = StickersUnSubscribePackAuthorRefDto.PACK_RECOMMENDATIONS_AUTHOR_PACKS;
            }
            p6q0 p6q0Var = new p6q0(new wf9(stickerDetailsFragment, stickerStockItem, stickersUnSubscribePackAuthorRefDto, 7));
            wx20.c(p6q0Var, stickerDetailsFragment.requireContext(), qjg.a(p6q0Var), 0, 0, 28);
            return;
        }
        AuthorSubscriptionRef.Companion.getClass();
        int i2 = AuthorSubscriptionRef.a.C1793a.$EnumSwitchMapping$0[authorSubscriptionRef.ordinal()];
        if (i2 == 1) {
            stickersSubscribePackAuthorRefDto = StickersSubscribePackAuthorRefDto.AUTOTESTS;
        } else if (i2 == 2) {
            stickersSubscribePackAuthorRefDto = StickersSubscribePackAuthorRefDto.PACK_DETAILS;
        } else if (i2 == 3) {
            stickersSubscribePackAuthorRefDto = StickersSubscribePackAuthorRefDto.PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            stickersSubscribePackAuthorRefDto = StickersSubscribePackAuthorRefDto.PACK_RECOMMENDATIONS_AUTHOR_PACKS;
        }
        int i3 = stickerStockItem.b;
        tfx tfxVar = new tfx("stickers.subscribePackAuthor", new bz60(9), new oyh0(2));
        tfx.l(tfxVar, "pack_id", i3, 0, 0, 12);
        if (stickersSubscribePackAuthorRefDto != null) {
            tfx.o(tfxVar, "ref", stickersSubscribePackAuthorRefDto.i(), 0, 0, 12);
        }
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(tfxVar));
        asu0 asu0Var = asu0.a;
        this.j.b(hg1.n(w0.q(asu0Var.c()).m(asu0Var.d()), stickerDetailsFragment.getActivity(), false, null, 62).subscribe(new o3y(new nm1(25, this, stickerStockItem), 20), new c2y(new rj60(this, 24), 29)));
    }

    @Override // xsna.i3l0
    public final void N0() {
        this.j.b(x().subscribe());
    }

    @Override // xsna.i3l0
    public final void R(StickerStockItem stickerStockItem) {
        int i = stickerStockItem.b;
        boolean f = epx.f(stickerStockItem.R, Boolean.TRUE);
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        StickerDetailsFragment stickerDetailsFragment = this.b;
        if (f) {
            String str = stickerStockItem.O;
            String str2 = str == null ? X3.i.U : str;
            tfx tfxVar = new tfx("stickers.removePackFromWishlist", new sq(24), new tq(25));
            tfx.l(tfxVar, "pack_id", i, 0, 0, 12);
            tfx.o(tfxVar, "wishes_block_type", "sticker_pack_detailed", 0, 0, 12);
            tfx.o(tfxVar, "ref_screen", str2, 0, 0, 12);
            io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(tfxVar));
            asu0 asu0Var = asu0.a;
            bVar.b(hg1.n(w0.q(asu0Var.c()).m(asu0Var.d()), stickerDetailsFragment.getActivity(), false, null, 62).subscribe(new g600(new dvh0(3, stickerStockItem, this), 24), new lkz(new xd40(this, 20), 18)));
            return;
        }
        String str3 = stickerStockItem.O;
        String str4 = str3 == null ? X3.i.U : str3;
        tfx tfxVar2 = new tfx("stickers.addPackToWishlist", new alb0(5), new zy60(10));
        tfx.l(tfxVar2, "pack_id", i, 0, 0, 12);
        tfx.o(tfxVar2, "wishes_block_type", "sticker_pack_detailed", 0, 0, 12);
        tfx.o(tfxVar2, "ref_screen", str4, 0, 0, 12);
        io.reactivex.rxjava3.internal.operators.observable.f0 w02 = rsg0.w0(yfb.x(tfxVar2));
        asu0 asu0Var2 = asu0.a;
        bVar.b(hg1.n(w02.q(asu0Var2.c()).m(asu0Var2.d()), stickerDetailsFragment.getActivity(), false, null, 62).subscribe(new ow40(new eci0(3, stickerStockItem, this), 17), new s440(new kb40(this, 26), 14)));
    }

    @Override // xsna.i3l0
    public final boolean T1() {
        return this.d != null;
    }

    @Override // xsna.i3l0
    public final void W5(StickerStockItem stickerStockItem, StickersUnSubscribePackAuthorRefDto stickersUnSubscribePackAuthorRefDto) {
        int i = stickerStockItem.b;
        tfx tfxVar = new tfx("stickers.unSubscribePackAuthor", new az60(5), new jr(29));
        tfx.l(tfxVar, "pack_id", i, 0, 0, 12);
        if (stickersUnSubscribePackAuthorRefDto != null) {
            tfx.o(tfxVar, "ref", stickersUnSubscribePackAuthorRefDto.i(), 0, 0, 12);
        }
        this.j.b(hg1.n(rsg0.w0(yfb.x(tfxVar)).m(asu0.a.d()), this.b.getActivity(), false, null, 62).subscribe(new bqs(new na7(25, stickerStockItem, this), 27), new o7y(new ut30(this, 18), 17)));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.y5l0
    public final List<StickerItem> b() {
        ArrayList arrayList = new ArrayList();
        d790 d790Var = this.f;
        if (!this.g || d790Var == null) {
            d790 d790Var2 = this.d;
            if (d790Var2 == null) {
                d790Var2 = null;
            }
            arrayList.addAll(d790Var2.a.g);
            d790 d790Var3 = this.d;
            Iterator it = (d790Var3 != null ? d790Var3 : null).b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((StickerStockItem) it.next()).g);
            }
        } else {
            arrayList.addAll(d790Var.a.g);
            Iterator it2 = d790Var.b.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(((StickerStockItem) it2.next()).g);
            }
        }
        return arrayList;
    }

    @Override // xsna.i3l0
    public final void c5(FragmentActivity fragmentActivity, boolean z) {
        this.g = z;
        if (!z) {
            d790 d790Var = this.d;
            z(d790Var != null ? d790Var : null, false);
            return;
        }
        d790 d790Var2 = this.f;
        if (d790Var2 != null) {
            z(d790Var2, false);
            return;
        }
        d790 d790Var3 = this.d;
        if (d790Var3 == null) {
            d790Var3 = null;
        }
        this.j.b(hg1.m(rsg0.T(new kil0(d790Var3.a.b, null)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), fragmentActivity, 0L, false, 62).subscribe(new ljs(new f0z(this, 29), 25), new j3z(new r820(this, 26), 18)));
    }

    @Override // xsna.y5l0
    public final int g(StickerItem stickerItem) {
        return ((ArrayList) b()).indexOf(stickerItem);
    }

    @Override // xsna.i3l0
    public final void g1(StickerStockItem stickerStockItem, VmojiAvatarModel vmojiAvatarModel) {
        this.e = vmojiAvatarModel;
        Integer num = stickerStockItem.L;
        io.reactivex.rxjava3.core.q T = (stickerStockItem.Ib() || stickerStockItem.Hb() || num == null) ? io.reactivex.rxjava3.core.q.T(stickerStockItem) : rsg0.y0(new kil0(num.intValue(), null), null, null, 3);
        tl30 tl30Var = new tl30(new defpackage.v(21, this, stickerStockItem), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.j.b(T.E(tl30Var, lVar, kVar, kVar).L(new hhj0(new rxz(this, 27), 1), false).L(new utg0(new pod0(this, 8), 3), false).subscribe(new n1r(new m360(this, 18), 22), new uu60(new b7(27, this, stickerStockItem), 18)));
    }

    @Override // xsna.i3l0
    public final void j0(StickerStockItem stickerStockItem) {
        Object obj;
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qai0) obj).a.b == stickerStockItem.b) {
                    break;
                }
            }
        }
        qai0 qai0Var = (qai0) obj;
        if (qai0Var != null) {
            qai0Var.b = false;
        }
        d790 d790Var = this.d;
        if (d790Var == null) {
            d790Var = null;
        }
        d790Var.b.remove(stickerStockItem);
        d790 d790Var2 = this.d;
        z(d790Var2 != null ? d790Var2 : null, false);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        this.j.e();
    }

    @Override // xsna.cc6
    public final void onResume() {
        if (T1()) {
            d790 d790Var = this.f;
            if ((!this.g || d790Var == null) && (d790Var = this.d) == null) {
                d790Var = null;
            }
            z(d790Var, false);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 x() {
        d790 d790Var = this.d;
        if (d790Var == null) {
            d790Var = null;
        }
        StickerStockItem stickerStockItem = d790Var.a;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = (stickerStockItem.Ib() ? io.reactivex.rxjava3.core.q.T(EmptyList.b) : rsg0.T(new sil0(stickerStockItem.J, StoreStockItemFieldsDto.WISHLISTS_STATUS.i())).a0(io.reactivex.rxjava3.android.schedulers.a.b())).F(new qw40(new pf40(this, 22), 14));
        rkz rkzVar = new rkz(new aj50(this, 26), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return F.E(rkzVar, lVar, kVar, kVar);
    }

    public final void z(d790 d790Var, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((qai0) next).a.h) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        int i2 = -1;
        if (z) {
            int i3 = 0;
            if (arrayList2.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayList2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((qai0) it2.next()).b && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i == 1) {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((qai0) it3.next()).b) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 >= size) {
                    i2++;
                }
            }
        }
        this.b.jo(d790Var, this.e, Boolean.valueOf(this.g), arrayList2, PackStylesListHolder.State.DATA, size, i2, this.i);
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}

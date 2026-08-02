package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.api.generated.vmoji.dto.VmojiProductPurchaseResultDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiProductPreviewModel;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.product.VmojiProductsFragment;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.dw20;
import xsna.e6w0;
import xsna.p7w0;
import xsna.sf90;
import xsna.tzp0;
import xsna.z7w0;

/* compiled from: VmojiCharacterFeature.kt */
/* loaded from: classes7.dex */
public final class m6w0 extends wk50<i8w0, z7w0, e6w0, p7w0> {
    public final w6w0 f;
    public final y7w0 g;
    public final Context h;
    public VmojiAvatar i;

    public m6w0(v7w0 v7w0Var, w6w0 w6w0Var, y7w0 y7w0Var, Context context, VmojiAvatar vmojiAvatar) {
        super(e6w0.g.b, v7w0Var);
        this.f = w6w0Var;
        this.g = y7w0Var;
        this.h = context;
        this.i = vmojiAvatar;
    }

    @Override // xsna.wk50
    public final void N(z7w0 z7w0Var, e6w0 e6w0Var) {
        String str;
        String str2;
        String str3;
        z7w0 z7w0Var2 = z7w0Var;
        e6w0 e6w0Var2 = e6w0Var;
        if (e6w0Var2 instanceof e6w0.g) {
            w6w0 w6w0Var = this.f;
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            io.reactivex.rxjava3.subjects.f<icl0> fVar = y8l0.a.a;
            si60 si60Var = new si60(new pst0(this, 2), 18);
            fVar.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, si60Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pw40(new vhs0(this, 8), 22));
            bVar.b(subscribe);
            bVar.b(subscribe);
            if (z7w0Var2 instanceof z7w0.a) {
                return;
            }
            T(new p7w0.c.C3496c(w6w0Var.e));
            bVar.b(a7f0.a.f(this, w6w0Var.c(this.i.getId(), this.i.Ab()).l(new adz(new x6w0(1, w6w0Var, w6w0.class, "toInitLoadResult", "toInitLoadResult(Lcom/vk/vmoji/character/mvi/VmojiCharacterInteractor$LoadResult;)Lcom/vk/vmoji/character/mvi/VmojiCharacterPatch$InitLoad$Result;", 0), 19)), new vgs0(this, 7), new cbt0(this, 8), 1));
            return;
        }
        if (e6w0Var2 instanceof e6w0.m) {
            if ((z7w0Var2 instanceof z7w0.a) && (((z7w0.a) z7w0Var2).g instanceof z7w0.a.AbstractC4164a.C4165a)) {
                T(p7w0.f.c.b);
                w6w0 w6w0Var2 = this.f;
                this.e.b(a7f0.a.f(this, w6w0Var2.c(this.i.getId(), this.i.Ab()).l(new he40(new y6w0(1, w6w0Var2, w6w0.class, "toReloadResult", "toReloadResult(Lcom/vk/vmoji/character/mvi/VmojiCharacterInteractor$LoadResult;)Lcom/vk/vmoji/character/mvi/VmojiCharacterPatch$Reload$Result;", 0), 22)), new bjm0(this, 18), new ksg0(this, 27), 1));
                return;
            }
            return;
        }
        if (e6w0Var2 instanceof e6w0.h) {
            e6w0.h hVar = (e6w0.h) e6w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar = (z7w0.a) z7w0Var2;
                if (aVar.g instanceof z7w0.a.AbstractC4164a.C4165a) {
                    if (!(hVar instanceof e6w0.h.b) || (aVar.h instanceof sf90.b)) {
                        sf90 sf90Var = aVar.h;
                        if ((sf90Var instanceof sf90.b) && ((str3 = sf90Var.a) == null || str3.length() == 0)) {
                            return;
                        }
                        T(p7w0.d.c.b);
                        this.e.b(a7f0.a.f(this, w6w0.d(this.f, null, null, aVar.h.a, 3).l(new a840(new hwi0(19), 16)), new fuc0(this, 28), new j6l0(this, 27), 1));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (e6w0Var2 instanceof e6w0.i) {
            e6w0.i iVar = (e6w0.i) e6w0Var2;
            if (z7w0Var2 instanceof z7w0.a) {
                z7w0.a aVar2 = (z7w0.a) z7w0Var2;
                if (aVar2.g instanceof z7w0.a.AbstractC4164a.C4165a) {
                    sf90 sf90Var2 = aVar2.i.get(iVar.b);
                    if (((iVar instanceof e6w0.i.b) && !(sf90Var2 instanceof sf90.b)) || sf90Var2 == null || (str2 = sf90Var2.a) == null) {
                        return;
                    }
                    T(new p7w0.e.c(iVar.b));
                    this.e.b(a7f0.a.f(this, rsg0.w0(yfb.x(this.f.a.f(str2))).l(new hi70(new t810(29), 15)).l(new u9c0(new egt0(iVar, 7), 8)), new q9i0(this, 12), new dnh0(17, this, iVar), 1));
                    return;
                }
                return;
            }
            return;
        }
        if (e6w0Var2 instanceof e6w0.l) {
            T(p7w0.g.b);
            return;
        }
        if (e6w0Var2 instanceof e6w0.n) {
            VmojiProductModel vmojiProductModel = ((e6w0.n) e6w0Var2).b;
            if (epx.f(vmojiProductModel.f, VmojiProductModel.State.CrownWithCheck.b)) {
                return;
            }
            VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel = vmojiProductModel.i;
            if (vmojiProductUnlockInfoModel == null) {
                T(new p7w0.h(vmojiProductModel));
                return;
            }
            y7w0 y7w0Var = this.g;
            View view = y7w0Var.a.getView();
            if (view != null) {
                view.post(new te9(9, y7w0Var, vmojiProductUnlockInfoModel));
            }
            T(p7w0.a.b);
            return;
        }
        if (e6w0Var2 instanceof e6w0.e) {
            T(p7w0.a.b);
            return;
        }
        if (e6w0Var2 instanceof e6w0.b) {
            VmojiProductModel vmojiProductModel2 = ((e6w0.b) e6w0Var2).b;
            this.e.b(hg1.m(this.f.a(vmojiProductModel2.b, null), this.h, 0L, false, 62).subscribe(new dh40(new btl0(4, this, vmojiProductModel2), 26), new aas0(new w9l0(15), 6)));
            return;
        }
        if (e6w0Var2 instanceof e6w0.c) {
            VmojiProductModel vmojiProductModel3 = ((e6w0.c) e6w0Var2).b;
            this.e.b(hg1.m(this.f.a(vmojiProductModel3.b, Boolean.TRUE), this.h, 0L, false, 62).subscribe(new h8l0(new tbs0(5, this, vmojiProductModel3), 11)));
            return;
        }
        if (e6w0Var2 instanceof e6w0.f) {
            this.g.a(this.i.Ab(), this.i.Bb());
            return;
        }
        if (e6w0Var2 instanceof e6w0.d) {
            y7w0 y7w0Var2 = this.g;
            y7w0Var2.getClass();
            d6w0.a(b6m.e(), y7w0Var2.c, "keyboard_create", "create", 8);
            return;
        }
        if (e6w0Var2 instanceof e6w0.a) {
            this.g.a.finish();
            return;
        }
        if (e6w0Var2 instanceof e6w0.j) {
            y7w0 y7w0Var3 = this.g;
            e6w0.j jVar = (e6w0.j) e6w0Var2;
            boolean Cb = jVar.b.Cb();
            boolean z = jVar.c;
            lfa lfaVar = new lfa(28, this, e6w0Var2);
            y7w0Var3.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new brj0(0, 0, null, R.string.vmoji_character_action_recreate, null, false, false, null, 0, null, null, null, null, null, 131062));
            brj0 brj0Var = Cb ? new brj0(2, 0, null, R.string.vmoji_character_action_delete, null, false, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126966) : z ? new brj0(1, 0, null, R.string.vmoji_character_action_show, null, false, false, null, 0, null, TitleColorAttr.DEFAULT, null, null, null, 126966) : null;
            if (brj0Var != null) {
                arrayList.add(brj0Var);
            }
            dw20 a = new dw20.b(y7w0Var3.c, new tzp0.c(null, false)).P(arrayList, new vxv0(1, y7w0Var3, lfaVar)).a();
            y7w0Var3.b = a;
            a.Td(y7w0Var3.a.getChildFragmentManager(), "CurrentBottomSheet");
            return;
        }
        if (e6w0Var2 instanceof e6w0.k) {
            e6w0.k kVar = (e6w0.k) e6w0Var2;
            y7w0 y7w0Var4 = this.g;
            boolean z2 = kVar.c;
            pm90 pm90Var = new pm90(13, this, kVar);
            y7w0Var4.getClass();
            dw20 a2 = new dw20.b(y7w0Var4.a.requireContext(), new tzp0.c(null, false)).P(e43.o(z2 ? new brj0(3, 0, null, R.string.vmoji_character_action_show, null, false, false, null, 0, null, null, null, null, null, 131062) : new brj0(4, 0, null, R.string.vmoji_character_action_hide, null, false, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126966)), new dq1(y7w0Var4, pm90Var, z2, 5)).a();
            y7w0Var4.b = a2;
            a2.Td(y7w0Var4.a.getChildFragmentManager(), "CurrentBottomSheet");
            return;
        }
        if (e6w0Var2 instanceof e6w0.r) {
            y7w0 y7w0Var5 = this.g;
            VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = ((e6w0.r) e6w0Var2).b;
            String Ab = this.i.Ab();
            y7w0Var5.getClass();
            b6m.e().d(y7w0Var5.c, vmojiStickerPackPreviewModel.b, Ab);
            return;
        }
        if (e6w0Var2 instanceof e6w0.q) {
            y7w0 y7w0Var6 = this.g;
            RecommendationsBlockModel recommendationsBlockModel = ((e6w0.q) e6w0Var2).b;
            String Ab2 = this.i.Ab();
            y7w0Var6.getClass();
            VmojiRecommendationsFragment.a aVar3 = new VmojiRecommendationsFragment.a(VmojiRecommendationsFragment.class, null, null);
            Bundle bundle = aVar3.j;
            bundle.putParcelable("arg_recommendations_block", recommendationsBlockModel);
            if (Ab2 != null) {
                bundle.putString("arg_current_character_id", Ab2);
            }
            aVar3.l(y7w0Var6.a);
            return;
        }
        if (e6w0Var2 instanceof e6w0.s) {
            VmojiProductPreviewModel vmojiProductPreviewModel = ((e6w0.s) e6w0Var2).b.j;
            if (vmojiProductPreviewModel == null || (str = vmojiProductPreviewModel.c) == null) {
                return;
            }
            this.e.b(hg1.m(rsg0.T(yfb.x(this.f.a.d(str))), this.h, 0L, false, 62).subscribe(new hmq0(new ohq0(3, this, e6w0Var2), 9)));
            return;
        }
        if (e6w0Var2 instanceof e6w0.p) {
            y7w0 y7w0Var7 = this.g;
            VmojiCharacterModel vmojiCharacterModel = ((e6w0.p) e6w0Var2).b;
            y7w0Var7.getClass();
            VmojiProductsFragment.a aVar4 = new VmojiProductsFragment.a(VmojiProductsFragment.class, null, null);
            aVar4.j.putParcelable("arg_character", vmojiCharacterModel);
            aVar4.l(y7w0Var7.a);
            return;
        }
        if (!(e6w0Var2 instanceof e6w0.o)) {
            throw new NoWhenBranchMatchedException();
        }
        String str4 = "https://" + a0a.d + "/vmoji" + this.i.getId();
        w6w0 w6w0Var3 = this.f;
        String id = this.i.getId();
        String name = this.i.getName();
        w6w0Var3.a.getClass();
        tfx tfxVar = new tfx("vmoji.getAvatarStoryData", new pq(28), new iun0(9));
        tfx.o(tfxVar, "avatar_id", id, 0, 0, 12);
        this.e.b(hg1.m(rsg0.T(yfb.x(tfxVar)).U(new nit(new jp5(28, w6w0Var3, name), 26)), this.h, 0L, false, 62).subscribe(new cgu0(new aqt0(1, this, str4), 4)));
    }

    public final void U(VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto, VmojiProductModel vmojiProductModel) {
        String string;
        VmojiAvatar vmojiAvatar;
        C(e6w0.e.b);
        C(e6w0.m.b);
        t6g0 t6g0Var = t6g0.b;
        VmojiAvatarModel p = t6g0.d().p();
        String Ab = (p == null || (vmojiAvatar = p.b) == null) ? null : vmojiAvatar.Ab();
        y7w0 y7w0Var = this.g;
        y7w0Var.getClass();
        VmojiProductPurchaseResultDto e = vmojiPurchaseProductResponseDto.e();
        if (e == null || (string = e.getMessage()) == null) {
            string = y7w0Var.c.getString(R.string.vmoji_character_buy_snackbar_text);
        }
        String str = string;
        View view = y7w0Var.a.getView();
        if (view != null) {
            view.post(new lhi0(y7w0Var, str, Ab, vmojiProductModel, 1));
        }
    }
}

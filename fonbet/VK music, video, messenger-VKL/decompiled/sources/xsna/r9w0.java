package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.vk.api.generated.vmoji.dto.VmojiProductPurchaseResultDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiProductPreviewModel;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import com.vk.vmoji.character.product.VmojiProductsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.baw0;
import xsna.ikv0;
import xsna.o9w0;
import xsna.v9w0;

/* compiled from: VmojiProductsFeature.kt */
/* loaded from: classes7.dex */
public final class r9w0 extends wk50<gaw0, baw0, o9w0, v9w0> {
    public final w6w0 f;
    public final aaw0 g;
    public final Context h;

    public r9w0(y9w0 y9w0Var, w6w0 w6w0Var, aaw0 aaw0Var, Context context) {
        super(o9w0.e.b, y9w0Var);
        this.f = w6w0Var;
        this.g = aaw0Var;
        this.h = context;
    }

    @Override // xsna.wk50
    public final void N(baw0 baw0Var, o9w0 o9w0Var) {
        String str;
        baw0 baw0Var2 = baw0Var;
        o9w0 o9w0Var2 = o9w0Var;
        if (o9w0Var2 instanceof o9w0.e) {
            if (baw0Var2 instanceof baw0.a) {
                T(new v9w0.a(((baw0.a) baw0Var2).c));
                return;
            }
            return;
        }
        boolean z = o9w0Var2 instanceof o9w0.a;
        aaw0 aaw0Var = this.g;
        if (z) {
            aaw0Var.a.finish();
            return;
        }
        boolean z2 = o9w0Var2 instanceof o9w0.f;
        w6w0 w6w0Var = this.f;
        if (z2) {
            if (baw0Var2 instanceof baw0.a) {
                baw0.a aVar = (baw0.a) baw0Var2;
                if (aVar.e instanceof baw0.a.AbstractC2601a.C2602a) {
                    T(v9w0.c.C3875c.b);
                    a7f0.a.f(this, w6w0Var.b(aVar.b).l(new awi0(new p9w0(0), 12)), new u5p0(this, 14), new qzl0(this, 18), 1);
                    return;
                }
                return;
            }
            return;
        }
        if (o9w0Var2 instanceof o9w0.g) {
            VmojiProductModel vmojiProductModel = ((o9w0.g) o9w0Var2).b;
            if (epx.f(vmojiProductModel.f, VmojiProductModel.State.CrownWithCheck.b)) {
                return;
            }
            VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel = vmojiProductModel.i;
            if (vmojiProductUnlockInfoModel == null) {
                T(new v9w0.d(vmojiProductModel));
                return;
            }
            View view = aaw0Var.a.getView();
            if (view != null) {
                view.post(new h12(14, aaw0Var, vmojiProductUnlockInfoModel));
            }
            T(v9w0.b.b);
            return;
        }
        if (o9w0Var2 instanceof o9w0.d) {
            T(v9w0.b.b);
            return;
        }
        if (o9w0Var2 instanceof o9w0.b) {
            hg1.m(w6w0Var.a(((o9w0.b) o9w0Var2).b.b, null), this.h, 0L, false, 62).subscribe(new l8u0(new i2s0(2, this, o9w0Var2), 1), new wks0(new h2h0(16), 2));
            return;
        }
        if (o9w0Var2 instanceof o9w0.c) {
            hg1.m(w6w0Var.a(((o9w0.c) o9w0Var2).b.b, Boolean.TRUE), this.h, 0L, false, 62).subscribe(new q9w0(new kpk0(10, this, o9w0Var2), 0));
            return;
        }
        if (!(o9w0Var2 instanceof o9w0.h)) {
            throw new NoWhenBranchMatchedException();
        }
        VmojiProductPreviewModel vmojiProductPreviewModel = ((o9w0.h) o9w0Var2).b.j;
        if (vmojiProductPreviewModel == null || (str = vmojiProductPreviewModel.c) == null) {
            return;
        }
        hg1.m(rsg0.T(yfb.x(w6w0Var.a.d(str))), this.h, 0L, false, 62).subscribe(new f2u(new c1o0(10, this, o9w0Var2), 28));
    }

    public final void U(VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto, final VmojiProductModel vmojiProductModel) {
        final String string;
        VmojiAvatar vmojiAvatar;
        C(o9w0.d.b);
        C(o9w0.f.b);
        t6g0 t6g0Var = t6g0.b;
        VmojiAvatarModel p = t6g0.d().p();
        final String Ab = (p == null || (vmojiAvatar = p.b) == null) ? null : vmojiAvatar.Ab();
        final aaw0 aaw0Var = this.g;
        aaw0Var.getClass();
        VmojiProductPurchaseResultDto e = vmojiPurchaseProductResponseDto.e();
        if (e == null || (string = e.getMessage()) == null) {
            string = aaw0Var.b.getString(R.string.vmoji_character_buy_snackbar_text);
        }
        View view = aaw0Var.a.getView();
        if (view != null) {
            view.post(new Runnable() { // from class: xsna.z9w0
                @Override // java.lang.Runnable
                public final void run() {
                    aaw0 aaw0Var2 = aaw0.this;
                    Context context = aaw0Var2.b;
                    VmojiProductsFragment vmojiProductsFragment = aaw0Var2.a;
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_legacy_accent), (Size) null, 12);
                    aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                    aVar.o = Integer.valueOf(cn70.b(8));
                    aVar.e = TimeUnit.SECONDS.toMillis(2L);
                    String str = Ab;
                    if (str != null) {
                        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, aaw0Var2.b.getString(R.string.vmoji_character_buy_snackbar_edit), new q66(aaw0Var2, str, vmojiProductModel));
                    }
                    aVar.f = vmojiProductsFragment.getView();
                    aVar.p(vmojiProductsFragment.kn().getWindow());
                }
            });
        }
    }
}

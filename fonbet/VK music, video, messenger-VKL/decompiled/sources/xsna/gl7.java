package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.stickers.bonus.StickersBonus;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import xsna.ikv0;

/* compiled from: BonusPointsSnackbar.kt */
/* loaded from: classes5.dex */
public final class gl7 implements fcn {
    public ikv0 b;

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    public final void a(Context context, StickersBonusResult stickersBonusResult) {
        if (stickersBonusResult.b) {
            Iterator<T> it = stickersBonusResult.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((StickersBonus) it.next()).b;
            }
            if (i == 0) {
                return;
            }
            StickersBonusBalance stickersBonusBalance = stickersBonusResult.c;
            Integer num = stickersBonusBalance.f;
            boolean z = (num != null ? num.intValue() : 0) <= stickersBonusBalance.b;
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_sticker_energy_product_28, (Integer) null, (Size) null, 14);
            aVar.u = new ikv0.d(context.getString(R.string.stickers_bonus_points_snackbar_title, Integer.valueOf(i)), context.getString(R.string.stickers_bonus_points_snackbar_subtitle), new ikv0.d.a(context.getString(z ? R.string.stickers_bonus_points_snackbar_buy : R.string.stickers_bonus_points_snackbar_more), null, new defpackage.s(3, context, this), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            this.b = pkv0.f(aVar);
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        ikv0 ikv0Var = this.b;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}

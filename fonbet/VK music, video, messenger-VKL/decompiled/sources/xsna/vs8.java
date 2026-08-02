package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.api.generated.vmoji.dto.VmojiProductPurchaseConfirmationDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: BuyConfirmationDialog.kt */
/* loaded from: classes7.dex */
public final class vs8 implements fcn {
    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final Context context, VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto, gzs<s3q0> gzsVar) {
        VmojiProductPurchaseConfirmationDto d = vmojiPurchaseProductResponseDto.d();
        if (d != null) {
            String string = d.d().g().d() == 0 ? context.getString(R.string.vmoji_get_free_message) : context.getString(R.string.vmoji_buy_message, enj.f(R.plurals.vmoji_cost_count, d.d().g().d(), context), enj.f(R.plurals.vmoji_votes_count, d.A7(), context));
            int i = h7u0.p;
            h7u0.a c = h7u0.b.c(context);
            c.h0(context.getString(R.string.vmoji_confirmation));
            c.a.f = string;
            c.W(R.string.cancel, new ss8(0));
            c.c0(R.string.ok, new ts8(gzsVar, 0));
            c.a0(new DialogInterface.OnDismissListener() { // from class: xsna.us8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object obj = context;
                    if (obj instanceof ey50) {
                        ((ey50) obj).Y().H(vs8.this);
                    }
                }
            });
            c.m();
            if (context instanceof ey50) {
                ((ey50) context).Y().S(this);
            }
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.fcn
    public final void dismiss() {
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
    }
}

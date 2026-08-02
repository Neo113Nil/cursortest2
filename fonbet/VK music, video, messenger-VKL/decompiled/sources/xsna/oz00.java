package xsna;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.h7u0;
import xsna.ujd0;

/* compiled from: MarketGoodDialogsRouterImpl.kt */
/* loaded from: classes18.dex */
public final class oz00 implements kz00 {
    @Override // xsna.kz00
    public final void a(Context context, boolean z, xyh xyhVar) {
        Pair pair = z ? new Pair(Integer.valueOf(R.string.product_card_remove_service_dialog_title), Integer.valueOf(R.string.product_card_remove_service_dialog_description)) : new Pair(Integer.valueOf(R.string.product_card_remove_product_dialog_title), Integer.valueOf(R.string.product_card_remove_product_dialog_description));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(intValue);
        c.U(intValue2);
        c.c0(R.string.delete, new lz00(0, xyhVar));
        c.W(R.string.cancel, new mz00());
        c.m();
    }

    @Override // xsna.kz00
    public final void b(Context context, jz00 jz00Var) {
        StringBuilder sb = new StringBuilder("tel:");
        String str = jz00Var.a;
        Intent intent = new Intent("android.intent.action.DIAL", rf3.c(str, sb));
        boolean z = intent.resolveActivity(context.getPackageManager()) != null;
        boolean z2 = ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 1;
        boolean z3 = jz00Var.d;
        if (z3 && z && z2) {
            d(context, str, intent);
            return;
        }
        if (!z3) {
            String str2 = jz00Var.e;
            if (str2 != null) {
                String str3 = jz00Var.f;
                if (str3 == null) {
                    str3 = "";
                }
                UserId userId = jz00Var.g;
                new ujd0.a(str2, str3, userId != null ? new ie3(15, new wik(jz00Var, 20), userId) : null, context).I0(null);
                return;
            }
            return;
        }
        String str4 = jz00Var.b;
        Image image = jz00Var.c;
        View inflate = e3m.b(context).inflate(R.layout.market_copy_phone_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.phone_text_view);
        TextView textView2 = (TextView) inflate.findViewById(R.id.owner_name_text_view);
        TextView textView3 = (TextView) inflate.findViewById(R.id.copy_phone_button);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) inflate.findViewById(R.id.photo_image_view);
        vKCircleImageView.y0(iah0.b(0.5f), e3m.f(R.attr.vk_ui_image_border_alpha, context));
        bwt0.S(vKCircleImageView, new rh4(18, vKCircleImageView, image));
        textView.setText(str);
        textView2.setText(str4);
        textView3.setOnClickListener(new nz00(this, context, str, new dw20.b(context, null).m(R.attr.vk_ui_background_content).D0(inflate, false).I0(null)));
    }

    @Override // xsna.kz00
    public final void c(Context context, InaccessibilityMessage inaccessibilityMessage, UserId userId, izs<? super UserId, s3q0> izsVar) {
        new ujd0.a(inaccessibilityMessage.b, inaccessibilityMessage.c, userId != null ? new ie3(15, izsVar, userId) : null, context).I0(null);
    }

    @Override // xsna.kz00
    public final void d(Context context, String str, Intent intent) {
        View inflate = e3m.b(context).inflate(R.layout.market_call_phone_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.phone_text_view)).setText(context.getString(R.string.market_call_phone, str));
        inflate.setOnClickListener(new kkc(context, intent, new dw20.b(context, null).m(R.attr.vk_ui_background_content).D0(inflate, false).I0(null), 1));
    }
}

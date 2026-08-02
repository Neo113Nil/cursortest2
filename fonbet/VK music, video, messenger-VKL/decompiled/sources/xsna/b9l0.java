package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.nge0;

/* compiled from: StickersBuyConfirmDialog.kt */
/* loaded from: classes5.dex */
public final class b9l0 implements fcn {
    public androidx.appcompat.app.d b;

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final Context context, nge0.a aVar, StickersBonusResult stickersBonusResult, izs<? super Boolean, s3q0> izsVar) {
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stickers_buy_confirm_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        textView.setText(context.getString(R.string.stickers_buy_confirm_description, enj.f(R.plurals.stickers_buy_confirm_price, aVar.a, context), enj.f(R.plurals.balance_votes, aVar.b, context)));
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.enable_bonus);
        View findViewById = inflate.findViewById(R.id.separator);
        TextView textView2 = (TextView) inflate.findViewById(R.id.help);
        Boolean bool = stickersBonusResult.e;
        if (bool == null) {
            f4m.q(cn70.b(27), textView);
            f4m.j(checkBox);
            f4m.j(findViewById);
            f4m.j(textView2);
        } else {
            checkBox.setChecked(bool.equals(Boolean.TRUE));
            f4m.q(0, textView);
            checkBox.setVisibility(0);
            findViewById.setVisibility(0);
            textView2.setVisibility(0);
        }
        String string = context.getString(R.string.stickers_bonus_catalog_points_join_help_1);
        String string2 = context.getString(R.string.stickers_bonus_catalog_points_join_help, string);
        SpannableString spannableString = new SpannableString(string2);
        int K = drm0.K(0, 6, string2, string, false);
        spannableString.setSpan(new hdz(new ajd0(context, 8)), K, string.length() + K, 33);
        textView2.setText(spannableString);
        jjc.g(inflate.findViewById(R.id.cancel), new z8l0(this, i));
        jjc.g(inflate.findViewById(R.id.buy), new wh9(izsVar, checkBox, this, 9));
        int i2 = h7u0.p;
        h7u0.a a = h7u0.b.a(context);
        a.f = inflate;
        a.a0(new DialogInterface.OnDismissListener() { // from class: xsna.a9l0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object obj = context;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(b9l0.this);
                }
            }
        });
        this.b = a.m();
        if (context instanceof ey50) {
            ((ey50) context).Y().S(this);
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        androidx.appcompat.app.d dVar = this.b;
        if (dVar != null) {
            dVar.dismiss();
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

package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.address.repository.f;

/* loaded from: classes6.dex */
public final class bw0 implements pyv {
    public final hbm a;
    public final tk51 b;
    public final f c;

    public bw0(hbm hbmVar, tk51 tk51Var, f fVar) {
        this.a = hbmVar;
        this.b = tk51Var;
        this.c = fVar;
    }

    @Override // defpackage.pyv
    public final Drawable a(String str, boolean z) {
        tk51 tk51Var = this.b;
        Drawable a = z ? tk51Var.a(yyg0.ic_address_search) : tk51Var.b.d ? tk51Var.a(f1h0.ic_destination_pin_two_flag_24) : (tk51Var.c.g() && tk51Var.b.a()) ? tk51Var.a(f1h0.ic_destination_pin_two_flag_24) : tk51Var.a(zyg0.ic_disabled_destination_point);
        if (str != null && str.length() != 0) {
            hbm hbmVar = this.a;
            if (!z) {
                return hbmVar.a(str, a);
            }
            hbmVar.getClass();
            Integer S = q5z.S(str);
            if (S != null) {
                int intValue = S.intValue();
                if (a == null) {
                    return null;
                }
                a.mutate();
                a.setTint(intValue);
                return a;
            }
        }
        return a;
    }

    @Override // defpackage.pyv
    public final Drawable b(String str, boolean z) {
        BitmapDrawable bitmapDrawable = this.c.e;
        if (bitmapDrawable != null && !z) {
            return bitmapDrawable;
        }
        tk51 tk51Var = this.b;
        Drawable a = z ? (Drawable) tk51Var.d.getValue() : tk51Var.b.d ? tk51Var.a(q2h0.ic_transport_source) : (tk51Var.c.g() && tk51Var.b.a()) ? tk51Var.a(f1h0.ic_source_pin_24) : tk51Var.a(mzg0.ic_order_card_source);
        if (str != null && str.length() != 0) {
            hbm hbmVar = this.a;
            if (!z) {
                return hbmVar.a(str, a);
            }
            hbmVar.getClass();
            Integer S = q5z.S(str);
            if (S != null) {
                int intValue = S.intValue();
                if (a == null) {
                    return null;
                }
                a.mutate();
                a.setTint(intValue);
                return a;
            }
        }
        return a;
    }
}

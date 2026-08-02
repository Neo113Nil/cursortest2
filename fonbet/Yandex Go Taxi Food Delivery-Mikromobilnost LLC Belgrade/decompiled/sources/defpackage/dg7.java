package defpackage;

import com.yandex.go.taxi.order.models.api.objects.ButtonModifierDTO;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;

/* loaded from: classes14.dex */
public final class dg7 {
    public final ButtonModifierDTO a;
    public final String b;
    public final boolean c;

    public dg7(ButtonModifierDTO buttonModifierDTO, String str, boolean z) {
        this.a = buttonModifierDTO;
        this.b = str;
        this.c = z;
    }

    public final Dialog a() {
        ButtonModifierDTO buttonModifierDTO = this.a;
        return buttonModifierDTO != null ? buttonModifierDTO.d : new Dialog(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dg7.class.equals(obj.getClass())) {
            dg7 dg7Var = (dg7) obj;
            ButtonModifierDTO buttonModifierDTO = dg7Var.a;
            if (this.c == dg7Var.c && jl40.l(this.b, dg7Var.b)) {
                ButtonModifierDTO buttonModifierDTO2 = this.a;
                if (!jl40.l(buttonModifierDTO2, buttonModifierDTO)) {
                    if (buttonModifierDTO2 != null) {
                        Dialog dialog = buttonModifierDTO2.d;
                        if (buttonModifierDTO != null && buttonModifierDTO2.a == buttonModifierDTO.a && jl40.l(buttonModifierDTO2.e, buttonModifierDTO.e)) {
                            boolean z = buttonModifierDTO2.b;
                            boolean z2 = buttonModifierDTO.b;
                            Dialog dialog2 = buttonModifierDTO.d;
                            if (z != z2 || !jl40.l(buttonModifierDTO2.c, buttonModifierDTO.c) || !jl40.l(dialog.a, dialog2.a) || !jl40.l(dialog.b, dialog2.b) || !jl40.l(dialog.c, dialog2.c)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.c ? 1 : 0);
        ButtonModifierDTO buttonModifierDTO = this.a;
        if (buttonModifierDTO == null) {
            return hashCode * 31;
        }
        int i = hashCode * 31;
        ButtonModifierDTO.ButtonName buttonName = buttonModifierDTO.a;
        int b = (unr0.b((i + (buttonName != null ? buttonName.hashCode() : 0)) * 31, 31, buttonModifierDTO.e) + (buttonModifierDTO.b ? 1 : 0)) * 31;
        String str = buttonModifierDTO.c;
        return buttonModifierDTO.d.c.hashCode() + unr0.b(unr0.b((b + (str != null ? str.hashCode() : 0)) * 31, 31, buttonModifierDTO.d.a), 31, buttonModifierDTO.d.b);
    }
}

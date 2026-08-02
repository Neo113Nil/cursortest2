package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;

/* loaded from: classes14.dex */
public final class i331 {
    public final Context a;
    public final SharedPreferences b;
    public VaultPaletteDto c;

    public i331(Context context) {
        this.a = context;
        this.b = context.getSharedPreferences("vault_palette_prefs", 0);
    }

    public static GradientDrawable a(Context context, String str, String str2) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        Integer S = q5z.S(str);
        int intValue = S != null ? S.intValue() : context.getColor(hpg0.vault_first_gradient_color);
        Integer S2 = q5z.S(str2);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{intValue, S2 != null ? S2.intValue() : context.getColor(hpg0.vault_second_gradient_color)});
        gradientDrawable.setDither(true);
        return gradientDrawable;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.widget.SeparatorView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class mrq0 extends xok {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        char c;
        int i;
        h8l h8lVar = (h8l) n15Var;
        Context context = divView.getContext();
        SeparatorView separatorView = new SeparatorView(context);
        String str = h8lVar.z;
        str.getClass();
        switch (str.hashCode()) {
            case 108:
                if (str.equals("l")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109:
                if (str.equals("m")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case HProv.PP_CACHE_SIZE /* 115 */:
                if (str.equals("s")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3828:
                if (str.equals("xl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3835:
                if (str.equals("xs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 119155:
                if (str.equals("xxs")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1386124388:
                if (str.equals("match_parent")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = atg0.div_separator_height_l;
                break;
            case 1:
                i = atg0.div_separator_height_m;
                break;
            case 2:
                i = atg0.div_separator_height_s;
                break;
            case 3:
                i = atg0.div_separator_height_xl;
                break;
            case 4:
                i = atg0.div_separator_height_xs;
                break;
            case 5:
                i = atg0.div_separator_height_xxs;
                break;
            case 6:
                i = atg0.div_padding_zero;
                break;
            default:
                z83.j("Unsupported size ".concat(str));
                i = atg0.div_separator_height_m;
                break;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, xok.e(i, context));
        layoutParams.weight = "match_parent".equals(str) ? h8lVar.A : 0.0f;
        separatorView.setLayoutParams(layoutParams);
        g8a1.h(atg0.div_horizontal_padding, 2, separatorView);
        g8a1.h(atg0.div_horizontal_padding, 4, separatorView);
        if (h8lVar.y) {
            separatorView.setDividerGravity(8388613);
            separatorView.setDividerColor(h8lVar.x);
            separatorView.setDividerHeightResource(atg0.div_separator_delimiter_height);
        }
        return separatorView;
    }
}

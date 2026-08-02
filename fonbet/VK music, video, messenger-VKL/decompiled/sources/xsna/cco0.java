package xsna;

import com.vk.dto.stories.model.TextBackgroundInfo;
import com.vkontakte.android.R;

/* compiled from: TextBackgroundStyles.java */
/* loaded from: classes15.dex */
public final class cco0 extends bco0 {
    public cco0() {
        this.a = R.drawable.vk_icon_text_style_3_large_48;
        this.b = TextBackgroundInfo.Outline.LINE;
        this.c = 255;
    }

    @Override // xsna.ix5
    public final int getId() {
        return 1;
    }

    @Override // xsna.bco0
    public final String i() {
        return "solid";
    }

    @Override // xsna.bco0
    public final int j(imo0 imo0Var) {
        Boolean bool = imo0Var.j;
        return bool == null ? (n8g.f(imo0Var.g) > 0.5d ? 1 : (n8g.f(imo0Var.g) == 0.5d ? 0 : -1)) >= 0 : bool.booleanValue() ? -16777216 : -1;
    }
}

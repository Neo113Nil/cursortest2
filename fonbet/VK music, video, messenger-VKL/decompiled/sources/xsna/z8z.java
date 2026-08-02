package xsna;

import android.content.Context;
import android.graphics.Typeface;
import com.vk.dto.common.Attachment;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LinkChipSpan.kt */
/* loaded from: classes4.dex */
public final class z8z extends eb6 {
    public final boolean l;

    public z8z(Attachment attachment, boolean z) {
        super(attachment, z);
        this.l = z;
    }

    @Override // xsna.db6
    public final int j() {
        return iah0.a(20);
    }

    @Override // xsna.db6
    public final float k() {
        return cn70.e() * 15.0f;
    }

    @Override // xsna.db6
    public final Typeface l() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        FontFamily fontFamily = FontFamily.REGULAR;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 15.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(15.0f);
        }
        return cqi.a(Font.Companion, fontFamily, f, context);
    }

    @Override // xsna.db6
    public final apo m() {
        apo apoVar = new apo(R.attr.vk_ui_text_link);
        apoVar.c(this.l);
        return apoVar;
    }

    @Override // xsna.db6
    public final CharSequence n(int i, CharSequence charSequence) {
        return erm0.C0(i, charSequence);
    }

    @Override // xsna.db6
    public final CharSequence p(CharSequence charSequence) {
        return charSequence;
    }
}

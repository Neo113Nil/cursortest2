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

/* compiled from: FileChipSpan.kt */
/* loaded from: classes4.dex */
public final class b8r extends eb6 {
    public final String l;
    public final String m;
    public final boolean n;

    public b8r(String str, String str2, Attachment attachment, boolean z) {
        super(attachment, z);
        this.l = str;
        this.m = str2;
        this.n = z;
    }

    @Override // xsna.db6
    public final int j() {
        return iah0.a(16);
    }

    @Override // xsna.db6
    public final float k() {
        return cn70.e() * 13.0f;
    }

    @Override // xsna.db6
    public final Typeface l() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 13.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(13.0f);
        }
        return cqi.a(Font.Companion, fontFamily, f, context);
    }

    @Override // xsna.db6
    public final apo m() {
        apo apoVar = new apo(R.attr.vk_ui_text_secondary);
        apoVar.c(this.n);
        return apoVar;
    }

    @Override // xsna.db6
    public final CharSequence n(int i, CharSequence charSequence) {
        int length = (charSequence.length() - i) + 1;
        if (length < 0) {
            length = 0;
        }
        String str = this.l;
        int length2 = str.length();
        String str2 = this.m;
        return length2 >= str2.length() ? v1v.a((char) 8230, erm0.w0(length, str), str2) : v1v.a((char) 8230, str, erm0.v0(length, str2));
    }

    @Override // xsna.db6
    public final CharSequence o(CharSequence charSequence) {
        return this.l;
    }

    @Override // xsna.db6
    public final CharSequence p(CharSequence charSequence) {
        String str = this.l;
        int length = str.length();
        String str2 = this.m;
        if (length >= str2.length()) {
            return "…" + str2 + str;
        }
        return str + (char) 8230 + str2;
    }

    @Override // xsna.db6
    public final CharSequence q() {
        String str = this.m;
        String concat = str.length() == 0 ? "" : ".".concat(str);
        if (!this.n || concat.length() <= 0) {
            return null;
        }
        return concat;
    }

    @Override // xsna.db6
    public final boolean t() {
        return this.n;
    }
}

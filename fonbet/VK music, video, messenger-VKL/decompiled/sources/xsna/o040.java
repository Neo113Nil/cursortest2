package xsna;

import android.text.SpannableStringBuilder;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.ui.formatters.linkparser.LinkType;
import java.util.Iterator;
import java.util.Map;
import xsna.r040;
import xsna.zdw;

/* compiled from: MsgTextBuilder.kt */
/* loaded from: classes2.dex */
public final class o040 {
    public final r040 a;
    public final baz b;
    public final ucp c;

    /* compiled from: MsgTextBuilder.kt */
    public static final class a implements vaz {
        @Override // xsna.vaz
        public final Object a(String str) {
            return null;
        }

        @Override // xsna.vaz
        public final Object b(String str) {
            return null;
        }

        @Override // xsna.vaz
        public final Object c(k320 k320Var) {
            return new Object();
        }

        @Override // xsna.vaz
        public final Object d(String str) {
            return null;
        }

        @Override // xsna.vaz
        public final Object e(String str) {
            return null;
        }

        @Override // xsna.vaz
        public final Object f(String str) {
            return null;
        }

        @Override // xsna.vaz
        public final Object h(String str, String str2, boolean z) {
            return null;
        }
    }

    public o040() {
        r040 r040Var;
        zdw zdwVar = i7o0.b;
        zdw.c cVar = (zdwVar == null ? null : zdwVar).l;
        this.a = (cVar == null || (r040Var = cVar.a) == null) ? r040.a.a.getSTUB() : r040Var;
        this.b = new baz(0);
        this.c = ucp.a;
        new pj90();
    }

    public static CharSequence a(o040 o040Var, CharSequence charSequence, int i) {
        return o040Var.c(charSequence, false, (i & 4) != 0, true);
    }

    public static CharSequence b(o040 o040Var, CharSequence charSequence, MsgTextFormat msgTextFormat, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        return o040Var.c(o040Var.a.a(charSequence, msgTextFormat), z, true, z2);
    }

    public final CharSequence c(CharSequence charSequence, boolean z, boolean z2, boolean z3) {
        baz bazVar = this.b;
        boolean a2 = bazVar.a(charSequence);
        CharSequence charSequence2 = charSequence;
        if (a2) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            cvk cvkVar = bazVar.b;
            Iterator<Map.Entry<LinkType, ij90>> it = bazVar.c.entrySet().iterator();
            while (it.hasNext()) {
                ij90 value = it.next().getValue();
                if (value instanceof pj90) {
                    ((pj90) value).getClass();
                    pj90.d(valueOf, cvkVar, z2);
                } else if (!(value instanceof nj90) || z3) {
                    value.b(valueOf, cvkVar, true);
                }
            }
            baz.b(valueOf, bazVar.a, (ohl[]) valueOf.getSpans(0, valueOf.length() - 1, ohl.class));
            charSequence2 = valueOf;
        }
        ucp ucpVar = this.c;
        if (!z) {
            ucpVar.getClass();
            return ucp.i(charSequence2);
        }
        Float valueOf2 = Float.valueOf(iah0.a(47));
        ucpVar.getClass();
        return ucp.j(charSequence2, valueOf2);
    }
}

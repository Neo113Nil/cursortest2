package xsna;

import com.vk.dto.messages.MsgTextFormat;

/* compiled from: FormattedText.kt */
/* loaded from: classes6.dex */
public final class c9s {
    public final CharSequence a;
    public final MsgTextFormat b;

    public c9s(CharSequence charSequence, MsgTextFormat msgTextFormat) {
        this.a = charSequence;
        this.b = msgTextFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9s)) {
            return false;
        }
        c9s c9sVar = (c9s) obj;
        return epx.f(this.a, c9sVar.a) && epx.f(this.b, c9sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormattedText(text=" + ((Object) this.a) + ", format=" + this.b + ')';
    }
}

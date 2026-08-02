package xsna;

import com.vk.dto.messages.MsgTextFormat;

/* compiled from: MsgTextFormatFormatterImpl.kt */
/* loaded from: classes11.dex */
public final class s040 implements r040 {
    @Override // xsna.r040
    public final CharSequence a(CharSequence charSequence, MsgTextFormat msgTextFormat) {
        if (charSequence.length() == 0 || msgTextFormat.isEmpty()) {
            return charSequence;
        }
        bpn0 bpn0Var = t420.a;
        return f9t.j(new wh9(charSequence, t420.a(charSequence, msgTextFormat.getItems()), this, 6));
    }
}

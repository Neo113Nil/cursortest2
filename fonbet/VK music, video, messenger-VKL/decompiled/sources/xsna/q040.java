package xsna;

import android.text.Editable;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.ui.views.RichEditText;

/* compiled from: MsgTextFormatFeatureImpl.kt */
/* loaded from: classes11.dex */
public final class q040 implements p040 {
    public final bpn0 a = new bpn0(new mn8(6));

    @Override // xsna.p040
    public final void a(RichEditText richEditText) {
        new e9s(new tp1(this, 17)).a(richEditText);
    }

    @Override // xsna.p040
    public final MsgTextFormat b(Editable editable) {
        return xho0.a(editable);
    }
}

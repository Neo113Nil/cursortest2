package xsna;

import com.vk.voip.ui.group_selector.ui.a;

/* compiled from: VoipGroupSelectorContentView.kt */
/* loaded from: classes7.dex */
public final class uow0 extends xsj0 {
    public final /* synthetic */ sow0 b;

    public uow0(sow0 sow0Var) {
        this.b = sow0Var;
    }

    @Override // xsna.xsj0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.c.a(new a.h.b(charSequence));
    }
}

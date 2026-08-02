package xsna;

import android.text.Editable;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.a;
import xsna.xn50;

/* compiled from: InteractiveOpinionSticker.kt */
/* loaded from: classes6.dex */
public final class lbx extends rno0 {
    public final /* synthetic */ kbx b;

    public lbx(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = this.b.e;
        if (fVar != null) {
            xn50.a.c(fVar, new a.d(editable.toString()));
        }
    }
}

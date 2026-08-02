package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;

/* loaded from: classes2.dex */
public final class oh8 extends jz4 {
    public final ymu c;
    public final pm5 d;
    public final boolean e;
    public final boolean f;
    public final lir g;

    public oh8(ymu ymuVar, pm5 pm5Var, boolean z, boolean z2, lir lirVar) {
        super(hg8.Companion.serializer());
        this.c = ymuVar;
        this.d = pm5Var;
        this.e = z;
        this.f = z2;
        this.g = lirVar;
    }

    @Override // defpackage.jz4
    public final void a(View view, yzh yzhVar) {
        ((CardInputView) view).setActionHandler(yzhVar);
    }

    @Override // defpackage.jz4
    public final View b(Context context, Object obj, qnh qnhVar) {
        return new CardInputView(context, (wb8) this.d.b, (hg8) obj, this.c, this.e, this.f, this.g);
    }
}

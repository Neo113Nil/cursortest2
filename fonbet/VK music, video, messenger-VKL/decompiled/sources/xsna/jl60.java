package xsna;

import android.view.View;
import com.vk.dto.hints.Hint;

/* compiled from: NewsfeedHintHelper.kt */
/* loaded from: classes4.dex */
public final class jl60 implements x6v {
    public final /* synthetic */ ed60 a;
    public final /* synthetic */ Hint b;

    public jl60(ed60 ed60Var, Hint hint) {
        this.a = ed60Var;
        this.b = hint;
    }

    @Override // xsna.x6v
    public final void b(String str) {
        hl60.e.remove(this.b.b);
        this.a.b(str);
    }

    @Override // xsna.x6v
    public final void onClick() {
    }

    @Override // xsna.x6v
    public final void a(View view, String str) {
    }
}

package xsna;

import android.view.View;
import com.vk.dto.hints.Hint;

/* compiled from: NewsfeedHintHelper.kt */
/* loaded from: classes4.dex */
public final class il60 implements x6v {
    public final /* synthetic */ x6v a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Hint c;

    public il60(x6v x6vVar, boolean z, Hint hint) {
        this.a = x6vVar;
        this.b = z;
        this.c = hint;
    }

    @Override // xsna.x6v
    public final void a(View view, String str) {
        x6v x6vVar = this.a;
        if (x6vVar != null) {
            x6vVar.a(view, str);
        }
    }

    @Override // xsna.x6v
    public final void b(String str) {
        Hint hint = this.c;
        String str2 = hint.b;
        if (this.b) {
            pla.e().b().s(hint);
        }
        hl60.f.remove(str2);
        hl60.e.remove(str2);
        x6v x6vVar = this.a;
        if (x6vVar != null) {
            x6vVar.b(str);
        }
    }

    @Override // xsna.x6v
    public final void onClick() {
        x6v x6vVar = this.a;
        if (x6vVar != null) {
            x6vVar.onClick();
        }
    }
}

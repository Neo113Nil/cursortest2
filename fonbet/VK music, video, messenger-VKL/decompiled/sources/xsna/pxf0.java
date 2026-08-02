package xsna;

import com.vk.dto.common.id.UserId;
import java.util.HashSet;
import xsna.j6c0;
import xsna.qn60;

/* compiled from: RemovePostByIdEditorAction.kt */
/* loaded from: classes4.dex */
public final class pxf0 implements qn60.b {
    public final int a;
    public final UserId b;

    public pxf0(int i, UserId userId) {
        this.a = i;
        this.b = userId;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        HashSet c = aVar.c(new j6c0.a(this.b, this.a));
        if (c == null) {
            return;
        }
        aVar.i(c);
    }
}

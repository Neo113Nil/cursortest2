package xsna;

import com.vk.dto.common.id.UserId;
import java.util.HashSet;
import xsna.cb60;
import xsna.qn60;

/* compiled from: RemoveNewsEntryByOwnerIdEditorAction.kt */
/* loaded from: classes4.dex */
public final class lxf0 implements qn60.b {
    public final UserId a;

    public lxf0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        HashSet c = aVar.c(new cb60.a(this.a));
        if (c == null) {
            return;
        }
        aVar.i(c);
    }
}

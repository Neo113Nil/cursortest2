package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.o34;

/* compiled from: AbstractAttachUploader.kt */
/* loaded from: classes7.dex */
public abstract class pc implements o34 {
    public final g94 a;
    public final CopyOnWriteArrayList<o34.a> b = new CopyOnWriteArrayList<>();

    public pc(g94 g94Var) {
        this.a = g94Var;
    }

    public final ArrayList a() {
        List<Attachment> all = this.a.getAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (obj instanceof ju90) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // xsna.o34
    public void d(ju90<?> ju90Var) {
        e(ju90Var);
    }

    @Override // xsna.o34
    public void b(UserId userId, boolean z) {
    }
}

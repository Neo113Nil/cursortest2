package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class l9l0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<j5l0> b = StickersDatabase.a.b().F().b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(sdy.l((j5l0) it.next()));
        }
        return arrayList;
    }
}

package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: SuggestsDBStorage.kt */
/* loaded from: classes5.dex */
public final class p6n0 {
    public final q6n0 a;

    public p6n0() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        this.a = StickersDatabase.a.b().H();
    }

    public final ArrayList a() {
        List<dxm> c = this.a.c();
        ArrayList arrayList = new ArrayList(c5g.u(c, 10));
        for (dxm dxmVar : c) {
            arrayList.add(new StickersDictionaryItemLight(dxmVar.a, dxmVar.b, dxmVar.c));
        }
        return arrayList;
    }
}

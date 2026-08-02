package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class hoj implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ List c;

    public hoj(com.vk.movika.sdk.base.observable.i iVar, ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((Pair) this.c.get(((Number) obj).intValue())).i();
            default:
                return qjg.a((MusicDto) this.c.get(((Number) obj).intValue()));
        }
    }

    public hoj(List list) {
        this.c = list;
    }
}

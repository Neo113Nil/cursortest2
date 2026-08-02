package com.yandex.go.feed_video.domain.manager;

import defpackage.id10;
import defpackage.jl40;
import defpackage.nk2;
import defpackage.ny61;
import defpackage.ptw;
import defpackage.qh2;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

/* loaded from: classes.dex */
public final class a {
    public final b a;
    public final tse b;
    public id10 c = new id10();
    public String d;
    public boolean e;
    public List f;
    public List g;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
        EmptyList emptyList = EmptyList.a;
        this.f = emptyList;
        this.g = emptyList;
    }

    public final void a(id10 id10Var) {
        ArrayList arrayList = id10Var.a;
        Integer num = (Integer) kotlin.collections.a.b0(id10Var.c);
        int intValue = num != null ? num.intValue() : 0;
        int i = 6;
        List J0 = kotlin.collections.a.J0(arrayList.subList(Math.max(0, intValue - 3), Math.min(intValue + 6, scc.f(arrayList)) + 1));
        boolean isEmpty = J0.isEmpty();
        tse tseVar = this.b;
        if (!isEmpty && !jl40.l(this.f, J0)) {
            this.f = J0;
            tje.N(tseVar, null, null, new ListVideoPlayerManager$withPlayerManager$1(this, new qh2(J0, 7), null), 3);
        }
        List list = id10Var.c;
        ArrayList arrayList2 = id10Var.a;
        ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add((MediaData) arrayList2.get(((Number) it.next()).intValue()));
        }
        if (jl40.l(this.g, arrayList3)) {
            return;
        }
        this.g = arrayList3;
        tje.N(tseVar, null, null, new ListVideoPlayerManager$withPlayerManager$1(this, new nk2(arrayList3, i), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ListVideoPlayerManager$getPlayer$1 listVideoPlayerManager$getPlayer$1;
        int i;
        if (continuationImpl instanceof ListVideoPlayerManager$getPlayer$1) {
            listVideoPlayerManager$getPlayer$1 = (ListVideoPlayerManager$getPlayer$1) continuationImpl;
            int i2 = listVideoPlayerManager$getPlayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                listVideoPlayerManager$getPlayer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = listVideoPlayerManager$getPlayer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = listVideoPlayerManager$getPlayer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    listVideoPlayerManager$getPlayer$1.label = 1;
                    obj = this.a.a(listVideoPlayerManager$getPlayer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((ListYandexPlayerManager) obj).getPlayer();
            }
        }
        listVideoPlayerManager$getPlayer$1 = new ListVideoPlayerManager$getPlayer$1(this, continuationImpl);
        Object obj2 = listVideoPlayerManager$getPlayer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = listVideoPlayerManager$getPlayer$1.label;
        if (i != 0) {
        }
        return ((ListYandexPlayerManager) obj2).getPlayer();
    }

    public final void c(ListYandexPlayer listYandexPlayer) {
        tje.N(this.b, null, null, new ListVideoPlayerManager$withPlayerManager$1(this, new ptw(18, listYandexPlayer), null), 3);
    }
}

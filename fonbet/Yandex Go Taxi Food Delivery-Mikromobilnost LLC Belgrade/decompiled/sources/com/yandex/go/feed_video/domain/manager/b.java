package com.yandex.go.feed_video.domain.manager;

import androidx.fragment.app.FragmentActivity;
import defpackage.i3y;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ppr;
import defpackage.rs2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayerManager;

/* loaded from: classes.dex */
public final class b {
    public final FragmentActivity a;
    public final String b;
    public final i3y c;

    public b(FragmentActivity fragmentActivity, rs2 rs2Var) {
        this.a = fragmentActivity;
        rs2Var.getClass();
        this.b = "ru.yandex.taxi";
        this.c = kotlin.a.a(new ppr(22, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ListYandexPlayerManagerProvider$get$1 listYandexPlayerManagerProvider$get$1;
        int i;
        if (continuationImpl instanceof ListYandexPlayerManagerProvider$get$1) {
            listYandexPlayerManagerProvider$get$1 = (ListYandexPlayerManagerProvider$get$1) continuationImpl;
            int i2 = listYandexPlayerManagerProvider$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                listYandexPlayerManagerProvider$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = listYandexPlayerManagerProvider$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = listYandexPlayerManagerProvider$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = (noh) this.c.getValue();
                    listYandexPlayerManagerProvider$get$1.label = 1;
                    obj = nohVar.k(listYandexPlayerManagerProvider$get$1);
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
                ListYandexPlayerManager listYandexPlayerManager = (ListYandexPlayerManager) obj;
                listYandexPlayerManager.setCurrentActivity(this.a);
                return listYandexPlayerManager;
            }
        }
        listYandexPlayerManagerProvider$get$1 = new ListYandexPlayerManagerProvider$get$1(this, continuationImpl);
        Object obj2 = listYandexPlayerManagerProvider$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = listYandexPlayerManagerProvider$get$1.label;
        if (i != 0) {
        }
        ListYandexPlayerManager listYandexPlayerManager2 = (ListYandexPlayerManager) obj2;
        listYandexPlayerManager2.setCurrentActivity(this.a);
        return listYandexPlayerManager2;
    }
}

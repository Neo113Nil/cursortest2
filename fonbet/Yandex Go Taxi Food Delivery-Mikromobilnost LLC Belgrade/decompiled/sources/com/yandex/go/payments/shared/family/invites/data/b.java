package com.yandex.go.payments.shared.family.invites.data;

import defpackage.am2;
import defpackage.eex;
import defpackage.ny61;
import defpackage.owx;
import defpackage.p53;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.go.utils.storage.json.a a;

    public b(eex eexVar) {
        am2 am2Var = new am2("family", "invites", EmptyList.a);
        KSerializer serializer = owx.c.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.a(am2Var, new p53(serializer, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        FamilyInvitesStorage$saveInvites$1 familyInvitesStorage$saveInvites$1;
        int i;
        if (continuationImpl instanceof FamilyInvitesStorage$saveInvites$1) {
            familyInvitesStorage$saveInvites$1 = (FamilyInvitesStorage$saveInvites$1) continuationImpl;
            int i2 = familyInvitesStorage$saveInvites$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyInvitesStorage$saveInvites$1.label = i2 - Integer.MIN_VALUE;
                Object obj = familyInvitesStorage$saveInvites$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyInvitesStorage$saveInvites$1.label;
                com.yandex.go.utils.storage.json.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    familyInvitesStorage$saveInvites$1.L$0 = list;
                    familyInvitesStorage$saveInvites$1.label = 1;
                    obj = aVar.a(familyInvitesStorage$saveInvites$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) familyInvitesStorage$saveInvites$1.L$0;
                    kotlin.b.b(obj);
                }
                Set M0 = kotlin.collections.a.M0((Iterable) obj);
                M0.addAll(list);
                List J0 = kotlin.collections.a.J0(M0);
                familyInvitesStorage$saveInvites$1.L$0 = null;
                familyInvitesStorage$saveInvites$1.L$1 = null;
                familyInvitesStorage$saveInvites$1.label = 2;
                Object d = aVar.d(J0, familyInvitesStorage$saveInvites$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        familyInvitesStorage$saveInvites$1 = new FamilyInvitesStorage$saveInvites$1(this, continuationImpl);
        Object obj2 = familyInvitesStorage$saveInvites$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInvitesStorage$saveInvites$1.label;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
        if (i != 0) {
        }
        Set M02 = kotlin.collections.a.M0((Iterable) obj2);
        M02.addAll(list);
        List J02 = kotlin.collections.a.J0(M02);
        familyInvitesStorage$saveInvites$1.L$0 = null;
        familyInvitesStorage$saveInvites$1.L$1 = null;
        familyInvitesStorage$saveInvites$1.label = 2;
        Object d2 = aVar2.d(J02, familyInvitesStorage$saveInvites$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}

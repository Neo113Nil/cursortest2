package com.yandex.messaging.internal.storage.folders;

import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$updateFoldersBucket$$inlined$makeCall$1;
import defpackage.at2;
import defpackage.axr;
import defpackage.bxr;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.dwr;
import defpackage.fse;
import defpackage.gbb1;
import defpackage.gw00;
import defpackage.gwr;
import defpackage.hwr;
import defpackage.iwr;
import defpackage.iyj0;
import defpackage.k020;
import defpackage.kse;
import defpackage.kwr;
import defpackage.l020;
import defpackage.lqo;
import defpackage.myj0;
import defpackage.nwr;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.to3;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.x400;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class d {
    public final k020 a;
    public final lqo b;
    public final sb7 c;
    public final kse d;
    public final at2 e;
    public final j f;
    public final bxr g;

    public d(k020 k020Var, lqo lqoVar, sb7 sb7Var, kse kseVar, at2 at2Var, j jVar, bxr bxrVar) {
        this.a = k020Var;
        this.b = lqoVar;
        this.c = sb7Var;
        this.d = kseVar;
        this.e = at2Var;
        this.f = jVar;
        this.g = bxrVar;
    }

    public final tpr a(long j, String str) {
        return e.F(new rol0(new FoldersRepository$getFolderChatData$1(this, str, j, null)), this.d.e);
    }

    public final rol0 b(long j) {
        return new rol0(new FoldersRepository$getFoldersByOrganizationId$1(this, j, null));
    }

    public final tpr c(long j) {
        return e.F(new rol0(new FoldersRepository$getMainChatData$1(this, j, null)), this.d.e);
    }

    public final void d(FoldersBucket foldersBucket, l020 l020Var) {
        if (!this.b.a(tz10.O)) {
            return;
        }
        if (l020Var != null) {
            l020Var.Z(foldersBucket);
            return;
        }
        l020 C = this.a.C();
        try {
            C.Z(foldersBucket);
            C.s();
            C.close();
        } finally {
        }
    }

    public final Object e(long j, tls tlsVar, Continuation continuation) {
        bxr bxrVar = this.g;
        bxrVar.getClass();
        tje.f();
        long a = bxrVar.b.S().a("folders");
        k020 k020Var = bxrVar.a;
        gwr l = k020Var.b.l();
        List list = (List) androidx.room.util.a.b(l.a, true, false, new dwr(l, 1));
        gwr l2 = k020Var.b.l();
        Map map = (Map) androidx.room.util.a.b(l2.a, true, false, new dwr(l2, 0));
        Set keySet = map.keySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : keySet) {
            Long valueOf = Long.valueOf(((hwr) obj).c);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        List list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        for (Object obj3 : list2) {
            linkedHashMap2.put(Long.valueOf(((x400) obj3).a), obj3);
        }
        Set N0 = kotlin.collections.a.N0(v4r0.h(linkedHashMap.keySet(), linkedHashMap2.keySet()));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            x400 x400Var = (x400) linkedHashMap2.get(Long.valueOf(longValue));
            List list3 = (List) linkedHashMap.get(Long.valueOf(longValue));
            EmptyList emptyList = EmptyList.a;
            if (list3 == null) {
                list3 = emptyList;
            }
            List x0 = kotlin.collections.a.x0(list3, new axr());
            FoldersBucket.OrganizationFoldersData organizationFoldersData = new FoldersBucket.OrganizationFoldersData();
            FoldersBucket.MainFolderConfig mainFolderConfig = new FoldersBucket.MainFolderConfig();
            mainFolderConfig.excludedFolderIds = x400Var != null ? kotlin.collections.a.J0(x400Var.b) : emptyList;
            organizationFoldersData.mainFolder = mainFolderConfig;
            List list4 = x0;
            Iterator it2 = it;
            LinkedHashMap linkedHashMap4 = linkedHashMap;
            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                hwr hwrVar = (hwr) it3.next();
                List list5 = (List) map.get(hwrVar);
                if (list5 == null) {
                    list5 = emptyList;
                }
                Map map2 = map;
                FoldersBucket.FolderData folderData = new FoldersBucket.FolderData();
                Iterator it4 = it3;
                folderData.id = hwrVar.a;
                folderData.name = hwrVar.b;
                FoldersBucket.FolderIcon folderIcon = new FoldersBucket.FolderIcon();
                folderIcon.value = hwrVar.e;
                folderData.icon = folderIcon;
                folderData.includedChatIds = kotlin.collections.a.J0(hwrVar.f);
                folderData.excludedChatIds = kotlin.collections.a.J0(hwrVar.g);
                List list6 = list5;
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = list6.iterator();
                while (it5.hasNext()) {
                    Iterator it6 = it5;
                    Object next = it6.next();
                    List list7 = list6;
                    if (((nwr) next).d) {
                        arrayList2.add(next);
                    }
                    it5 = it6;
                    list6 = list7;
                }
                List list8 = list6;
                LinkedHashMap linkedHashMap5 = linkedHashMap2;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(((nwr) it7.next()).c);
                }
                folderData.includedFilterIds = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list8) {
                    if (!((nwr) obj4).d) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(((nwr) it8.next()).c);
                }
                folderData.excludedFilterIds = arrayList5;
                arrayList.add(folderData);
                map = map2;
                it3 = it4;
                linkedHashMap2 = linkedHashMap5;
            }
            organizationFoldersData.customFolders = arrayList;
            linkedHashMap3.put(Long.valueOf(longValue), organizationFoldersData);
            it = it2;
            linkedHashMap = linkedHashMap4;
            map = map;
        }
        FoldersBucket foldersBucket = new FoldersBucket();
        foldersBucket.version = a;
        foldersBucket.bucketName = "folders";
        foldersBucket.orgFolders = linkedHashMap3;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap3);
        FoldersBucket.OrganizationFoldersData organizationFoldersData2 = (FoldersBucket.OrganizationFoldersData) linkedHashMap6.get(new Long(j));
        if (organizationFoldersData2 == null) {
            return new iyj0(kwr.a);
        }
        tlsVar.invoke(organizationFoldersData2);
        linkedHashMap6.put(new Long(j), organizationFoldersData2);
        foldersBucket.orgFolders = linkedHashMap6;
        return f(foldersBucket, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(FoldersBucket foldersBucket, ContinuationImpl continuationImpl) {
        FoldersRepository$sendBucketUpdate$1 foldersRepository$sendBucketUpdate$1;
        int i;
        fse fseVar;
        if (continuationImpl instanceof FoldersRepository$sendBucketUpdate$1) {
            foldersRepository$sendBucketUpdate$1 = (FoldersRepository$sendBucketUpdate$1) continuationImpl;
            int i2 = foldersRepository$sendBucketUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                foldersRepository$sendBucketUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = foldersRepository$sendBucketUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = foldersRepository$sendBucketUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    foldersRepository$sendBucketUpdate$1.L$0 = this;
                    foldersRepository$sendBucketUpdate$1.L$1 = foldersBucket;
                    foldersRepository$sendBucketUpdate$1.label = 1;
                    obj = gbb1.c(this.f, foldersRepository$sendBucketUpdate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (d) foldersRepository$sendBucketUpdate$1.L$0;
                        kotlin.b.b(obj);
                        oyj0 oyj0Var = (oyj0) obj;
                        if (oyj0Var instanceof myj0) {
                            FoldersBucket foldersBucket2 = (FoldersBucket) ((BucketsData) ((myj0) oyj0Var).a).a(FoldersBucket.class);
                            if (foldersBucket2 != null) {
                                this.d(foldersBucket2, null);
                            }
                            return new myj0(zy11.a);
                        }
                        if (oyj0Var instanceof iyj0) {
                            return new iyj0(iwr.a);
                        }
                        w511.b();
                        return null;
                    }
                    foldersBucket = (FoldersBucket) foldersRepository$sendBucketUpdate$1.L$1;
                    this = (d) foldersRepository$sendBucketUpdate$1.L$0;
                    kotlin.b.b(obj);
                }
                to3 a = ((d9g) ((cl21) obj)).a();
                foldersRepository$sendBucketUpdate$1.L$0 = this;
                foldersRepository$sendBucketUpdate$1.L$1 = null;
                foldersRepository$sendBucketUpdate$1.label = 2;
                fseVar = foldersRepository$sendBucketUpdate$1.get_context();
                if (fseVar == null) {
                    fseVar = foldersRepository$sendBucketUpdate$1.get_context();
                }
                obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$updateFoldersBucket$$inlined$makeCall$1(null, a, foldersBucket), foldersRepository$sendBucketUpdate$1);
            }
        }
        foldersRepository$sendBucketUpdate$1 = new FoldersRepository$sendBucketUpdate$1(this, continuationImpl);
        Object obj2 = foldersRepository$sendBucketUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = foldersRepository$sendBucketUpdate$1.label;
        if (i != 0) {
        }
        to3 a2 = ((d9g) ((cl21) obj2)).a();
        foldersRepository$sendBucketUpdate$1.L$0 = this;
        foldersRepository$sendBucketUpdate$1.L$1 = null;
        foldersRepository$sendBucketUpdate$1.label = 2;
        fseVar = foldersRepository$sendBucketUpdate$1.get_context();
        if (fseVar == null) {
        }
        obj2 = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$updateFoldersBucket$$inlined$makeCall$1(null, a2, foldersBucket), foldersRepository$sendBucketUpdate$1);
    }
}

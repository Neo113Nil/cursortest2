package com.yandex.messaging.internal.storage.folders;

import defpackage.hwr;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvr;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxvr;", "<anonymous>", "(Ltse;)Lxvr;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.folders.FoldersRepository$loadFolderChatData$2", f = "FoldersRepository.kt", l = {HProv.PP_SAME_MEDIA, HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FoldersRepository$loadFolderChatData$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $folderId;
    final /* synthetic */ long $organizationId;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldersRepository$loadFolderChatData$2(d dVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$folderId = str;
        this.$organizationId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FoldersRepository$loadFolderChatData$2 foldersRepository$loadFolderChatData$2 = new FoldersRepository$loadFolderChatData$2(this.this$0, this.$folderId, this.$organizationId, continuation);
        foldersRepository$loadFolderChatData$2.L$0 = obj;
        return foldersRepository$loadFolderChatData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldersRepository$loadFolderChatData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        Set set;
        Object k;
        Set set2;
        String str;
        noh nohVar;
        long j;
        Object k2;
        long j2;
        String str2;
        HashSet hashSet;
        Set set3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h3 = tje.h(tseVar, null, null, new FoldersRepository$loadFolderChatData$2$folderDeferred$1(this.this$0, this.$folderId, this.$organizationId, null), 3);
            h = tje.h(tseVar, null, null, new FoldersRepository$loadFolderChatData$2$includedChatsDeferred$1(this.this$0, this.$folderId, this.$organizationId, null), 3);
            h2 = tje.h(tseVar, null, null, new FoldersRepository$loadFolderChatData$2$excludedChatsDeferred$1(this.this$0, this.$folderId, this.$organizationId, null), 3);
            this.L$0 = h;
            this.L$1 = h2;
            this.label = 1;
            s = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = this.J$0;
                    ?? r3 = (Set) this.L$3;
                    String str3 = (String) this.L$2;
                    set3 = (Set) this.L$1;
                    Set set4 = (Set) this.L$0;
                    kotlin.b.b(obj);
                    set = set4;
                    hashSet = r3;
                    k2 = obj;
                    str2 = str3;
                    j2 = j3;
                    return new xvr(str2, j2, set3, set, hashSet, kotlin.collections.a.H0((Iterable) k2));
                }
                j = this.J$0;
                String str4 = (String) this.L$3;
                Set set5 = (Set) this.L$2;
                Set set6 = (Set) this.L$1;
                noh nohVar2 = (noh) this.L$0;
                kotlin.b.b(obj);
                nohVar = nohVar2;
                set2 = set5;
                set = set6;
                str = str4;
                k = obj;
                HashSet H0 = kotlin.collections.a.H0((Iterable) k);
                this.L$0 = set;
                this.L$1 = set2;
                this.L$2 = str;
                this.L$3 = H0;
                this.J$0 = j;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    j2 = j;
                    str2 = str;
                    hashSet = H0;
                    set3 = set2;
                    return new xvr(str2, j2, set3, set, hashSet, kotlin.collections.a.H0((Iterable) k2));
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$1;
            ?? r6 = (noh) this.L$0;
            kotlin.b.b(obj);
            h = r6;
            s = obj;
        }
        hwr hwrVar = (hwr) s;
        if (hwrVar == null) {
            return null;
        }
        String str5 = this.$folderId;
        long j4 = this.$organizationId;
        Set set7 = hwrVar.f;
        set = hwrVar.g;
        this.L$0 = h2;
        this.L$1 = set;
        this.L$2 = set7;
        this.L$3 = str5;
        this.J$0 = j4;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            set2 = set7;
            str = str5;
            nohVar = h2;
            j = j4;
            HashSet H02 = kotlin.collections.a.H0((Iterable) k);
            this.L$0 = set;
            this.L$1 = set2;
            this.L$2 = str;
            this.L$3 = H02;
            this.J$0 = j;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}

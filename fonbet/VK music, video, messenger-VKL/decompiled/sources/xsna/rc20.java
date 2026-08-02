package xsna;

import com.vk.api.generated.messages.dto.MessagesGetMessageReadPeersResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageViewsRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class rc20 {
    public final ezv a;
    public final mjg b;

    public rc20(ezv ezvVar, mjg mjgVar, pli pliVar) {
        this.a = ezvVar;
        this.b = mjgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(List list, ContinuationImpl continuationImpl) {
        pc20 pc20Var;
        int i;
        Iterator it;
        if (continuationImpl instanceof pc20) {
            pc20Var = (pc20) continuationImpl;
            int i2 = pc20Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pc20Var.label = i2 - Integer.MIN_VALUE;
                Object obj = pc20Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pc20Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        long longValue = ((Number) it2.next()).longValue();
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList.add(Peer.a.b(longValue));
                    }
                    e1w<ProfilesInfo> d = this.b.d(new e1e0(arrayList, Source.ACTUAL, true));
                    pc20Var.L$0 = list;
                    pc20Var.L$1 = null;
                    pc20Var.label = 1;
                    obj = this.a.a(this, d, pc20Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) pc20Var.L$0;
                    kotlin.a.a(obj);
                }
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                ArrayList arrayList2 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    qtd0 Cb = profilesInfo.Cb(new Long(((Number) it.next()).longValue()));
                    if (Cb != null) {
                        arrayList2.add(Cb);
                    }
                }
                return arrayList2;
            }
        }
        pc20Var = new pc20(this, continuationImpl);
        Object obj2 = pc20Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pc20Var.label;
        if (i != 0) {
        }
        ProfilesInfo profilesInfo2 = (ProfilesInfo) obj2;
        ArrayList arrayList22 = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, long j, int i2, int i3, ContinuationImpl continuationImpl) {
        qc20 qc20Var;
        int i4;
        List<UserId> d;
        ?? r7;
        if (continuationImpl instanceof qc20) {
            qc20Var = (qc20) continuationImpl;
            int i5 = qc20Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                qc20Var.label = i5 - Integer.MIN_VALUE;
                Object obj = qc20Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = qc20Var.label;
                if (i4 != 0) {
                    kotlin.a.a(obj);
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    fj30 fj30Var = new fj30(i, i2, i3, Peer.a.b(j));
                    qc20Var.I$0 = i;
                    qc20Var.J$0 = j;
                    qc20Var.I$1 = i2;
                    qc20Var.I$2 = i3;
                    qc20Var.label = 1;
                    obj = this.a.a(this, fj30Var, qc20Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                MessagesGetMessageReadPeersResponseDto messagesGetMessageReadPeersResponseDto = (MessagesGetMessageReadPeersResponseDto) obj;
                Integer e = messagesGetMessageReadPeersResponseDto.e();
                int intValue = e == null ? e.intValue() : 0;
                d = messagesGetMessageReadPeersResponseDto.d();
                if (d == null) {
                    List<UserId> list = d;
                    r7 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r7.add(Long.valueOf(((UserId) it.next()).b));
                    }
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = EmptyList.b;
                }
                return new jc20(intValue, r7);
            }
        }
        qc20Var = new qc20(this, continuationImpl);
        Object obj2 = qc20Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = qc20Var.label;
        if (i4 != 0) {
        }
        MessagesGetMessageReadPeersResponseDto messagesGetMessageReadPeersResponseDto2 = (MessagesGetMessageReadPeersResponseDto) obj2;
        Integer e2 = messagesGetMessageReadPeersResponseDto2.e();
        if (e2 == null) {
        }
        d = messagesGetMessageReadPeersResponseDto2.d();
        if (d == null) {
        }
        if (r7 == 0) {
        }
        return new jc20(intValue, r7);
    }
}

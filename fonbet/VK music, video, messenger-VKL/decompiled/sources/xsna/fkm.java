package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.api.generated.groups.dto.GroupsGroupTagDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogTagsStorageManagerImpl;
import com.vk.im.engine.models.dialogs.DialogTag;
import com.vk.log.L;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DialogTagsGetCmd.kt */
/* loaded from: classes18.dex */
public final class fkm extends me6<List<? extends DialogTag>> {
    public static final long c = TimeUnit.HOURS.toMillis(2);
    public static final /* synthetic */ int d = 0;
    public final Source b;

    /* compiled from: DialogTagsGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fkm(Source source) {
        this.b = source;
    }

    @Override // xsna.me6
    public final Object e(w2w w2wVar, spj<? super List<? extends DialogTag>> spjVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f(w2wVar, (ContinuationImpl) spjVar);
            }
            if (i == 3) {
                return g(w2wVar, (ContinuationImpl) spjVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        DialogTagsStorageManagerImpl b = w2wVar.I0().b().b();
        Cursor d2 = b.b.b().d("SELECT * FROM " + b.a.a, null);
        ArrayList arrayList = new ArrayList(d2.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d2.moveToFirst()) {
                    while (!d2.isAfterLast()) {
                        arrayList.add(new DialogTag(fl3.A(d2, DialogTagsStorageManagerImpl.Column.ID.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.NAME.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.COLOR.getKey())));
                        d2.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d2.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkm) && this.b == ((fkm) obj).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(w2w w2wVar, ContinuationImpl continuationImpl) {
        gkm gkmVar;
        int i;
        Cursor d2;
        try {
            if (continuationImpl instanceof gkm) {
                gkmVar = (gkm) continuationImpl;
                int i2 = gkmVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gkmVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = gkmVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gkmVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        long g = w2wVar.I0().k().g("tags_request_time");
                        if (w2wVar.f1() - g < c) {
                            DialogTagsStorageManagerImpl b = w2wVar.I0().b().b();
                            d2 = b.b.b().d("SELECT * FROM " + b.a.a, null);
                            ArrayList arrayList = new ArrayList(d2.getCount());
                            Trace.beginSection(ndp0.f("Cursor.forEach"));
                            try {
                                try {
                                    if (d2.moveToFirst()) {
                                        while (!d2.isAfterLast()) {
                                            arrayList.add(new DialogTag(fl3.A(d2, DialogTagsStorageManagerImpl.Column.ID.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.NAME.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.COLOR.getKey())));
                                            d2.moveToNext();
                                        }
                                    }
                                    return arrayList;
                                } finally {
                                }
                            } finally {
                            }
                        }
                        gkmVar.L$0 = w2wVar;
                        gkmVar.J$0 = g;
                        gkmVar.label = 1;
                        obj = g(w2wVar, gkmVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        w2wVar = (w2w) gkmVar.L$0;
                        kotlin.a.a(obj);
                    }
                    return (List) obj;
                }
            }
            if (i != 0) {
            }
            return (List) obj;
        } catch (Throwable th) {
            L.E(th, new Object[0]);
            DialogTagsStorageManagerImpl b2 = w2wVar.I0().b().b();
            d2 = b2.b.b().d("SELECT * FROM " + b2.a.a, null);
            ArrayList arrayList2 = new ArrayList(d2.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d2.moveToFirst()) {
                        while (!d2.isAfterLast()) {
                            arrayList2.add(new DialogTag(fl3.A(d2, DialogTagsStorageManagerImpl.Column.ID.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.NAME.getKey()), fl3.E(d2, DialogTagsStorageManagerImpl.Column.COLOR.getKey())));
                            d2.moveToNext();
                        }
                    }
                    return arrayList2;
                } finally {
                }
            } finally {
            }
        }
        gkmVar = new gkm(this, continuationImpl);
        Object obj3 = gkmVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gkmVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d A[LOOP:0: B:11:0x0097->B:13:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(w2w w2wVar, ContinuationImpl continuationImpl) {
        hkm hkmVar;
        int i;
        if (continuationImpl instanceof hkm) {
            hkmVar = (hkm) continuationImpl;
            int i2 = hkmVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hkmVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hkmVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hkmVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Peer Q0 = w2wVar.Q0();
                    hkmVar.L$0 = w2wVar;
                    hkmVar.label = 1;
                    UserId userId = new UserId(Q0.d);
                    tfx tfxVar = new tfx("groups.getTagList", new eq0(14), new eq(14));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    iz2 A = yfb.A(tfxVar);
                    A.n = false;
                    obj = evj.p(A, hkmVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w2wVar = (w2w) hkmVar.L$0;
                    kotlin.a.a(obj);
                }
                w2wVar.I0().k().j("tags_request_time", w2wVar.f1());
                List<GroupsGroupTagDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GroupsGroupTagDto groupsGroupTagDto : list) {
                    arrayList.add(new DialogTag(groupsGroupTagDto.getId(), groupsGroupTagDto.e(), groupsGroupTagDto.d().i()));
                }
                DialogTagsStorageManagerImpl b = w2wVar.I0().b().b();
                b.b.b().h(new td0(14, b, arrayList));
                w2wVar.e1(this, q2o0.b);
                return arrayList;
            }
        }
        hkmVar = new hkm(this, continuationImpl);
        Object obj2 = hkmVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hkmVar.label;
        if (i != 0) {
        }
        w2wVar.I0().k().j("tags_request_time", w2wVar.f1());
        List<GroupsGroupTagDto> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        while (r14.hasNext()) {
        }
        DialogTagsStorageManagerImpl b2 = w2wVar.I0().b().b();
        b2.b.b().h(new td0(14, b2, arrayList2));
        w2wVar.e1(this, q2o0.b);
        return arrayList2;
    }

    @Override // xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogTagsGetCmd(source=" + this.b + ", awaitNetwork=false)";
    }
}

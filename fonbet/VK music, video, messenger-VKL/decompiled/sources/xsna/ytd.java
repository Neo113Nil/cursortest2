package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsDraftSyncCoordinatorImpl.kt */
/* loaded from: classes14.dex */
public final class ytd implements std {
    public final mhd a;
    public final ClipsDraftPersistentStore b;
    public final ClipsDraftComponent c;
    public final hpj d;
    public final bpn0 e;

    public ytd(mhd mhdVar, ClipsDraftPersistentStore clipsDraftPersistentStore, ClipsDraftComponent clipsDraftComponent) {
        ovj b = hqu0.b();
        this.a = mhdVar;
        this.b = clipsDraftPersistentStore;
        this.c = clipsDraftComponent;
        this.d = zvj.a(b.plus(whn0.a()));
        this.e = new bpn0(new mh(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(ytd ytdVar, ClipsDraftVk clipsDraftVk, ContinuationImpl continuationImpl) {
        utd utdVar;
        int i;
        ytdVar.getClass();
        if (continuationImpl instanceof utd) {
            utdVar = (utd) continuationImpl;
            int i2 = utdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utdVar.label = i2 - Integer.MIN_VALUE;
                Object obj = utdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = utdVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (ytdVar.f()) {
                        ClipsDraftVk.b bVar = ClipsDraftVk.d;
                        otd D = vua0.D(new ClipsDraft(clipsDraftVk.b, clipsDraftVk.c.e5()));
                        ClipsDraftComponent clipsDraftComponent = ytdVar.c;
                        utdVar.L$0 = null;
                        utdVar.L$1 = null;
                        utdVar.label = 1;
                        if (clipsDraftComponent.y9(D, false, utdVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        ytdVar.b.getClass();
                        ClipsDraftPersistentStore.b(clipsDraftVk);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.TRUE;
            }
        }
        utdVar = new utd(ytdVar, continuationImpl);
        Object obj2 = utdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = utdVar.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    @Override // xsna.std
    public final void a(ClipsDraftVk clipsDraftVk, v5 v5Var) {
        myc0.h(this.d, null, null, new ttd(this, clipsDraftVk, v5Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[LOOP:0: B:11:0x0054->B:13:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.std
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        wtd wtdVar;
        int i;
        if (continuationImpl instanceof wtd) {
            wtdVar = (wtd) continuationImpl;
            int i2 = wtdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtdVar.label = i2 - Integer.MIN_VALUE;
                Object obj = wtdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wtdVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!f()) {
                        this.b.getClass();
                        return ClipsDraftPersistentStore.m();
                    }
                    wtdVar.label = 1;
                    obj = this.c.qe(wtdVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Iterable<otd> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                for (otd otdVar : iterable) {
                    ClipsDraftVk.b bVar = ClipsDraftVk.d;
                    arrayList.add(ClipsDraftVk.a.a(q6x.D(otdVar)));
                }
                return arrayList;
            }
        }
        wtdVar = new wtd(this, continuationImpl);
        Object obj2 = wtdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wtdVar.label;
        if (i != 0) {
        }
        Iterable<otd> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
        while (r5.hasNext()) {
        }
        return arrayList2;
    }

    @Override // xsna.std
    public final void c(String str) {
        myc0.h(this.d, null, null, new xtd(this, false, false, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.std
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        vtd vtdVar;
        int i;
        otd otdVar;
        if (continuationImpl instanceof vtd) {
            vtdVar = (vtd) continuationImpl;
            int i2 = vtdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtdVar.label = i2 - Integer.MIN_VALUE;
                Object obj = vtdVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vtdVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!f()) {
                        this.b.getClass();
                        return ClipsDraftPersistentStore.l(str);
                    }
                    vtdVar.L$0 = null;
                    vtdVar.label = 1;
                    obj = this.c.Q7(str, vtdVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                otdVar = (otd) obj;
                if (otdVar != null) {
                    return null;
                }
                ClipsDraft D = q6x.D(otdVar);
                ClipsDraftVk.b bVar = ClipsDraftVk.d;
                return ClipsDraftVk.a.a(D);
            }
        }
        vtdVar = new vtd(this, continuationImpl);
        Object obj2 = vtdVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vtdVar.label;
        if (i != 0) {
        }
        otdVar = (otd) obj2;
        if (otdVar != null) {
        }
    }

    public final boolean f() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }
}

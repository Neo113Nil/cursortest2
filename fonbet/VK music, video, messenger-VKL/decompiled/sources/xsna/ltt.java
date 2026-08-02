package xsna;

import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.domain.exception.EmptyPollsError;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.fqt;
import xsna.yeg0;

/* compiled from: GetPollsOperation.kt */
/* loaded from: classes6.dex */
public final class ltt extends pc6<a, List<? extends UxPollsPoll>> {
    public final yeg0 a;
    public final fqt b;
    public final hqt c;

    /* compiled from: GetPollsOperation.kt */
    public static abstract class a {

        /* compiled from: GetPollsOperation.kt */
        /* renamed from: xsna.ltt$a$a, reason: collision with other inner class name */
        public static final class C3298a extends a {
            public final blq0 a;
            public final String b;
            public final boolean c;
            public final List<Long> d;
            public final String e;

            public C3298a(blq0 blq0Var, String str, boolean z, List<Long> list, String str2) {
                this.a = blq0Var;
                this.b = str;
                this.c = z;
                this.d = list;
                this.e = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3298a)) {
                    return false;
                }
                C3298a c3298a = (C3298a) obj;
                return epx.f(this.a, c3298a.a) && epx.f(this.b, c3298a.b) && this.c == c3298a.c && epx.f(this.d, c3298a.d) && epx.f(this.e, c3298a.e);
            }

            public final int hashCode() {
                int a = fw3.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
                String str = this.e;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("IdParams(userData=");
                sb.append(this.a);
                sb.append(", project=");
                sb.append(this.b);
                sb.append(", allowRequest=");
                sb.append(this.c);
                sb.append(", ids=");
                sb.append(this.d);
                sb.append(", notifier=");
                return ho8.a(sb, this.e, ')');
            }
        }

        /* compiled from: GetPollsOperation.kt */
        public static final class b extends a {
            public final blq0 a;
            public final String b;
            public final boolean c;
            public final List<String> d;
            public final String e;

            public b(blq0 blq0Var, String str, boolean z, List<String> list, String str2) {
                this.a = blq0Var;
                this.b = str;
                this.c = z;
                this.d = list;
                this.e = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                int a = fw3.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
                String str = this.e;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TriggerParams(userData=");
                sb.append(this.a);
                sb.append(", project=");
                sb.append(this.b);
                sb.append(", allowRequest=");
                sb.append(this.c);
                sb.append(", triggers=");
                sb.append(this.d);
                sb.append(", notifier=");
                return ho8.a(sb, this.e, ')');
            }
        }
    }

    public ltt(yeg0 yeg0Var, fqt fqtVar, hqt hqtVar) {
        this.a = yeg0Var;
        this.b = fqtVar;
        this.c = hqtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a.C3298a c3298a, ContinuationImpl continuationImpl) {
        mtt mttVar;
        int i;
        List list;
        if (continuationImpl instanceof mtt) {
            mttVar = (mtt) continuationImpl;
            int i2 = mttVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mttVar.label = i2 - Integer.MIN_VALUE;
                Object obj = mttVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mttVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    asl b = this.b.b(mttVar.getContext(), new fqt.a.C2889a(c3298a.d));
                    mttVar.L$0 = c3298a;
                    mttVar.label = 1;
                    obj = b.J(mttVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        list = (List) obj;
                        return list;
                    }
                    c3298a = (a.C3298a) mttVar.L$0;
                    kotlin.a.a(obj);
                }
                List list2 = (List) obj;
                boolean N = drm0.N((CharSequence) this.c.a());
                int i3 = !N ? 1 : 0;
                if (c3298a.c) {
                    return list2;
                }
                if (N) {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                list = list2;
                if (list.isEmpty()) {
                    asl b2 = this.a.b(mttVar.getContext(), new yeg0.a.C4099a(c3298a.b, c3298a.e, c3298a.d, c3298a.a));
                    mttVar.L$0 = null;
                    mttVar.L$1 = null;
                    mttVar.I$0 = i3;
                    mttVar.I$1 = 0;
                    mttVar.label = 2;
                    obj = b2.J(mttVar);
                }
                return list;
            }
        }
        mttVar = new mtt(this, continuationImpl);
        Object obj2 = mttVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mttVar.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        boolean N2 = drm0.N((CharSequence) this.c.a());
        int i32 = !N2 ? 1 : 0;
        if (c3298a.c) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // xsna.pc6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, ContinuationImpl continuationImpl) {
        ntt nttVar;
        int i;
        List list;
        List list2;
        if (continuationImpl instanceof ntt) {
            nttVar = (ntt) continuationImpl;
            int i2 = nttVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nttVar.label = i2 - Integer.MIN_VALUE;
                Object obj = nttVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nttVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (aVar == null) {
                        throw new ParamsAreRequiredException("Params should be passed");
                    }
                    if (aVar instanceof a.b) {
                        nttVar.L$0 = null;
                        nttVar.label = 1;
                        obj = f((a.b) aVar, nttVar);
                    } else {
                        if (!(aVar instanceof a.C3298a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nttVar.L$0 = null;
                        nttVar.label = 2;
                        obj = d((a.C3298a) aVar, nttVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    list = (List) obj;
                }
                list2 = list;
                if (list2.isEmpty()) {
                    return list2;
                }
                throw new EmptyPollsError();
            }
        }
        nttVar = new ntt(this, continuationImpl);
        Object obj3 = nttVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nttVar.label;
        if (i != 0) {
        }
        list2 = list;
        if (list2.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(a.b bVar, ContinuationImpl continuationImpl) {
        ott ottVar;
        int i;
        List list;
        if (continuationImpl instanceof ott) {
            ottVar = (ott) continuationImpl;
            int i2 = ottVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ottVar.label = i2 - Integer.MIN_VALUE;
                Object obj = ottVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ottVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    asl b = this.b.b(ottVar.getContext(), new fqt.a.b(bVar.d));
                    ottVar.L$0 = bVar;
                    ottVar.label = 1;
                    obj = b.J(ottVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        list = (List) obj;
                        return list;
                    }
                    bVar = (a.b) ottVar.L$0;
                    kotlin.a.a(obj);
                }
                List list2 = (List) obj;
                boolean N = drm0.N((CharSequence) this.c.a());
                int i3 = !N ? 1 : 0;
                if (bVar.c) {
                    return list2;
                }
                if (N) {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                list = list2;
                if (list.isEmpty()) {
                    asl b2 = this.a.b(ottVar.getContext(), new yeg0.a.b(bVar.b, bVar.e, bVar.d, bVar.a));
                    ottVar.L$0 = null;
                    ottVar.L$1 = null;
                    ottVar.I$0 = i3;
                    ottVar.I$1 = 0;
                    ottVar.label = 2;
                    obj = b2.J(ottVar);
                }
                return list;
            }
        }
        ottVar = new ott(this, continuationImpl);
        Object obj2 = ottVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ottVar.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        boolean N2 = drm0.N((CharSequence) this.c.a());
        int i32 = !N2 ? 1 : 0;
        if (bVar.c) {
        }
    }
}

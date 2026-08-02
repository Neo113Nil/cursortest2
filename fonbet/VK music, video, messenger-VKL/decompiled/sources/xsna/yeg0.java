package xsna;

import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsConfig;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.dx8;
import xsna.weg0;
import xsna.xeg0;

/* compiled from: RetrievePollsOperation.kt */
/* loaded from: classes6.dex */
public final class yeg0 extends pc6<a, List<? extends UxPollsPoll>> {
    public final dx8 a;
    public final xeg0 b;
    public final weg0 c;
    public final h6o0 d;
    public final g6o0 e;

    /* compiled from: RetrievePollsOperation.kt */
    public static abstract class a {

        /* compiled from: RetrievePollsOperation.kt */
        /* renamed from: xsna.yeg0$a$a, reason: collision with other inner class name */
        public static final class C4099a extends a {
            public final blq0 a;
            public final String b;
            public final List<Long> c;
            public final String d;

            public C4099a(String str, String str2, List list, blq0 blq0Var) {
                this.a = blq0Var;
                this.b = str;
                this.c = list;
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4099a)) {
                    return false;
                }
                C4099a c4099a = (C4099a) obj;
                return epx.f(this.a, c4099a.a) && epx.f(this.b, c4099a.b) && epx.f(this.c, c4099a.c) && epx.f(this.d, c4099a.d);
            }

            public final int hashCode() {
                int a = fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("IdParams(userData=");
                sb.append(this.a);
                sb.append(", project=");
                sb.append(this.b);
                sb.append(", ids=");
                sb.append(this.c);
                sb.append(", notifier=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: RetrievePollsOperation.kt */
        public static final class b extends a {
            public final blq0 a;
            public final String b;
            public final List<String> c;
            public final String d;

            public b(String str, String str2, List list, blq0 blq0Var) {
                this.a = blq0Var;
                this.b = str;
                this.c = list;
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int a = fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TriggerParams(userData=");
                sb.append(this.a);
                sb.append(", project=");
                sb.append(this.b);
                sb.append(", triggers=");
                sb.append(this.c);
                sb.append(", notifier=");
                return ho8.a(sb, this.d, ')');
            }
        }
    }

    public yeg0(dx8 dx8Var, xeg0 xeg0Var, weg0 weg0Var, h6o0 h6o0Var, g6o0 g6o0Var) {
        this.a = dx8Var;
        this.b = xeg0Var;
        this.c = weg0Var;
        this.d = h6o0Var;
        this.e = g6o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.pc6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a aVar, ContinuationImpl continuationImpl) {
        zeg0 zeg0Var;
        int i;
        asl b;
        String e;
        if (continuationImpl instanceof zeg0) {
            zeg0Var = (zeg0) continuationImpl;
            int i2 = zeg0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeg0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zeg0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeg0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (aVar == null) {
                        throw new ParamsAreRequiredException("Params should be passed");
                    }
                    if (aVar instanceof a.b) {
                        a.b bVar = (a.b) aVar;
                        b = this.b.b(zeg0Var.getContext(), new xeg0.a(bVar.b, bVar.d, bVar.c, bVar.a));
                    } else {
                        if (!(aVar instanceof a.C4099a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a.C4099a c4099a = (a.C4099a) aVar;
                        b = this.c.b(zeg0Var.getContext(), new weg0.a(c4099a.b, c4099a.d, c4099a.c, c4099a.a));
                    }
                    zeg0Var.L$0 = aVar;
                    zeg0Var.label = 1;
                    obj = b.J(zeg0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) zeg0Var.L$0;
                    kotlin.a.a(obj);
                }
                UxPollsGetResponse uxPollsGetResponse = (UxPollsGetResponse) obj;
                myc0.h(zvj.a(zeg0Var.getContext()), null, null, new lf6(this.a, new dx8.a(uxPollsGetResponse.e(), !(aVar instanceof a.b) ? ((a.b) aVar).c : EmptyList.b), null), 3);
                UxPollsConfig d = uxPollsGetResponse.d();
                e = d == null ? d.e() : null;
                if (e != null) {
                    throw new ParamsAreRequiredException("URL should be passed");
                }
                ((n5r0) this.d.b).j(e);
                UxPollsConfig d2 = uxPollsGetResponse.d();
                List<BaseRequestParam> d3 = d2 != null ? d2.d() : null;
                if (d3 == null) {
                    throw new ParamsAreRequiredException("Translations should be passed");
                }
                ((n5r0) this.e.b).i(d3);
                return uxPollsGetResponse.e();
            }
        }
        zeg0Var = new zeg0(this, continuationImpl);
        Object obj2 = zeg0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeg0Var.label;
        if (i != 0) {
        }
        UxPollsGetResponse uxPollsGetResponse2 = (UxPollsGetResponse) obj2;
        if (!(aVar instanceof a.b)) {
        }
        myc0.h(zvj.a(zeg0Var.getContext()), null, null, new lf6(this.a, new dx8.a(uxPollsGetResponse2.e(), !(aVar instanceof a.b) ? ((a.b) aVar).c : EmptyList.b), null), 3);
        UxPollsConfig d4 = uxPollsGetResponse2.d();
        if (d4 == null) {
        }
        if (e != null) {
        }
    }
}

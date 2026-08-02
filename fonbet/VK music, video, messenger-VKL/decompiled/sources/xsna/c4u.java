package xsna;

import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.ecomm.market.good.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.kjf0;

/* compiled from: GoodCommentsAndReviewsBlockInteractor.kt */
/* loaded from: classes18.dex */
public final class c4u {
    public final t410 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.c(16));
    public final io.reactivex.rxjava3.subjects.d<com.vk.ecomm.market.good.b> c = io.reactivex.rxjava3.subjects.d.O0(b.a.a);

    /* compiled from: GoodCommentsAndReviewsBlockInteractor.kt */
    public static final class a {
        public final b110 a;
        public final MarketGetItemReviewsResponseDto b;
        public final boolean c;

        public a(b110 b110Var, MarketGetItemReviewsResponseDto marketGetItemReviewsResponseDto, boolean z) {
            this.a = b110Var;
            this.b = marketGetItemReviewsResponseDto;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            b110 b110Var = this.a;
            int hashCode = (b110Var == null ? 0 : b110Var.hashCode()) * 31;
            MarketGetItemReviewsResponseDto marketGetItemReviewsResponseDto = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (marketGetItemReviewsResponseDto != null ? marketGetItemReviewsResponseDto.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadCommentsAndReviewsResponse(comments=");
            sb.append(this.a);
            sb.append(", reviews=");
            sb.append(this.b);
            sb.append(", isTitleVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public c4u(t410 t410Var) {
        this.a = t410Var;
    }

    public static a b(b110 b110Var, MarketGetItemReviewsResponseDto marketGetItemReviewsResponseDto, cxo cxoVar) {
        return (b110Var == null || marketGetItemReviewsResponseDto == null || (b110Var.c.isEmpty() && !cxoVar.s)) ? marketGetItemReviewsResponseDto != null ? new a(null, marketGetItemReviewsResponseDto, true) : (b110Var == null || (b110Var.c.isEmpty() && !cxoVar.s)) ? new a(null, null, false) : new a(b110Var, null, true) : new a(b110Var, marketGetItemReviewsResponseDto, false);
    }

    public static void c(cxo cxoVar) {
        cxoVar.c.a(cxoVar, kjf0.a.a(33, Boolean.FALSE));
        ArrayList arrayList = cxoVar.n;
        Object obj = null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((kjf0.a) next).a == 33) {
                    obj = next;
                    break;
                }
            }
            obj = (kjf0.a) obj;
        }
        if (obj != null) {
            ArrayList arrayList2 = cxoVar.n;
            if ((arrayList2 != null ? arrayList2.indexOf(obj) : -1) != -1) {
                ArrayList arrayList3 = cxoVar.n;
                if (arrayList3 != null) {
                    arrayList3.remove(obj);
                }
                ArrayList arrayList4 = cxoVar.n;
                if (arrayList4 != null) {
                    ArrayList c = io.reactivex.rxjava3.internal.operators.observable.n0.c(arrayList4);
                    jid0 jid0Var = cxoVar.G;
                    if (jid0Var != null) {
                        jid0Var.c = c;
                        jid0Var.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public static void d(cxo cxoVar) {
        q310 q310Var = cxoVar.L;
        a5u a5uVar = cxoVar.c;
        if (q310Var == null) {
            a5uVar.a(cxoVar, kjf0.a.c(25, cxoVar.J));
            return;
        }
        q310 q310Var2 = new q310(rl3.I(new c8u[]{cxoVar.J, cxoVar.K}));
        cxoVar.L = q310Var2;
        a5uVar.a(cxoVar, kjf0.a.c(30, q310Var2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r2.isEmpty() == false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kjf0.a a(cxo cxoVar) {
        Pair pair = new Pair(cxoVar.J, cxoVar.K);
        h8u h8uVar = (h8u) pair.d();
        i010 i010Var = (i010) pair.g();
        if (b210.a(cxoVar.r, ((Boolean) this.b.getValue()).booleanValue())) {
            h8u h8uVar2 = cxoVar.J;
            List<hfz> list = h8uVar2 != null ? h8uVar2.j : null;
            if (list != null) {
            }
            return null;
        }
        if (h8uVar != null && i010Var != null) {
            q310 q310Var = new q310(e43.l(h8uVar, i010Var));
            cxoVar.L = q310Var;
            return kjf0.a.c(30, q310Var);
        }
        if (h8uVar != null) {
            return kjf0.a.c(25, h8uVar);
        }
        if (i010Var != null) {
            return kjf0.a.c(29, i010Var);
        }
        return null;
    }
}

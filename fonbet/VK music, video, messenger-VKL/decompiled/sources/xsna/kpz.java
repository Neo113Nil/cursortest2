package xsna;

import android.graphics.Bitmap;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.chromium.net.NetError;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.s6r;

/* compiled from: LoadIconsToCacheUseCase.kt */
@b6l(c = "com.vk.geo.impl.usecase.LoadIconsToCacheUseCase$execute$2", f = "LoadIconsToCacheUseCase.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class kpz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Map<do00, List<Pair<String, VisibleStyle>>> $urls;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lpz this$0;

    /* compiled from: LoadIconsToCacheUseCase.kt */
    @b6l(c = "com.vk.geo.impl.usecase.LoadIconsToCacheUseCase$execute$2$groupIcons$3$1", f = "LoadIconsToCacheUseCase.kt", l = {52, 54}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Triple<? extends do00, ? extends Bitmap, ? extends VisibleStyle>>, Object> {
        final /* synthetic */ do00 $marker;
        final /* synthetic */ String $url;
        final /* synthetic */ int $visibleStyle;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ lpz this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lpz lpzVar, int i, String str, do00 do00Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = lpzVar;
            this.$visibleStyle = i;
            this.$url = str;
            this.$marker = do00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$visibleStyle, this.$url, this.$marker, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Triple<? extends do00, ? extends Bitmap, ? extends VisibleStyle>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if (r8 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        
            if (r8 == r1) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zvj.e(yvjVar);
                int b = (int) (((rpv) this.this$0.c.getValue()).f.c.b(this.$visibleStyle & NetError.ERR_SOCKET_SET_SEND_BUFFER_SIZE_ERROR, null) >> 32);
                if (VisibleStyle.C(this.$visibleStyle)) {
                    s6r s6rVar = (s6r) this.this$0.b.getValue();
                    String str = this.$url;
                    this.L$0 = null;
                    this.I$0 = b;
                    this.label = 1;
                    s6r.a aVar = s6r.a;
                    s6rVar.getClass();
                    obj = s6r.a(b, b, str, false, this);
                } else {
                    s6r s6rVar2 = (s6r) this.this$0.b.getValue();
                    String str2 = this.$url;
                    this.L$0 = null;
                    this.I$0 = b;
                    this.label = 2;
                    s6r.a aVar2 = s6r.a;
                    s6rVar2.getClass();
                    obj = s6r.a(b, b, str2, false, this);
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                kotlin.a.a(obj);
                bitmap = (Bitmap) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                bitmap = (Bitmap) obj;
            }
            return new Triple(this.$marker, bitmap, new VisibleStyle(this.$visibleStyle));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kpz(Map<do00, ? extends List<Pair<String, VisibleStyle>>> map, lpz lpzVar, spj<? super kpz> spjVar) {
        super(2, spjVar);
        this.$urls = map;
        this.this$0 = lpzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        kpz kpzVar = new kpz(this.$urls, this.this$0, spjVar);
        kpzVar.L$0 = obj;
        return kpzVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kpz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long currentTimeMillis = System.currentTimeMillis();
            Map<do00, List<Pair<String, VisibleStyle>>> map = this.$urls;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"start loading group icons " + map.size()});
            }
            Map<do00, List<Pair<String, VisibleStyle>>> map2 = this.$urls;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<do00, List<Pair<String, VisibleStyle>>> entry : map2.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                do00 do00Var = (do00) entry2.getKey();
                List list = (List) entry2.getValue();
                ListBuilder e = e43.e();
                e.add(new Pair(do00Var, list.get(0)));
                if (list.size() > 1) {
                    e.add(new Pair(do00Var, list.get(1)));
                }
                arrayList.add(e.g());
            }
            ArrayList v = c5g.v(arrayList);
            lpz lpzVar = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = v.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                do00 do00Var2 = (do00) pair.d();
                Pair pair2 = (Pair) pair.g();
                String str = (String) pair2.d();
                int i2 = ((VisibleStyle) pair2.g()).b;
                zvj.e(yvjVar);
                asl b = (((rpv) lpzVar.c.getValue()).c(i2, do00Var2.b) != null || str.length() == 0) ? null : myc0.b(yvjVar, hqu0.b().plus(lpzVar.a), null, new a(lpzVar, i2, str, do00Var2, null), 2);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            this.L$0 = yvjVar;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            obj = fto0.e(arrayList2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            kotlin.a.a(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Triple triple : (Iterable) obj) {
            if (triple.j() == null) {
                triple = null;
            }
            if (triple != null) {
                arrayList3.add(triple);
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"finish loading group icons " + (System.currentTimeMillis() - j) + UcumUtils.UCUM_MILLISECODS});
        }
        zvj.e(yvjVar);
        rpv rpvVar = (rpv) this.this$0.c.getValue();
        rpvVar.getClass();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Triple triple2 = (Triple) it2.next();
            rpvVar.g((do00) triple2.d(), (Bitmap) triple2.g(), ((VisibleStyle) triple2.h()).b, null);
        }
        return s3q0.a;
    }
}

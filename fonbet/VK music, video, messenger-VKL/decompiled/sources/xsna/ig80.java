package xsna;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoCtaClickTypeDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.entity.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qf80;
import xsna.qg80;

/* compiled from: OnboardingPromoInlineActor.kt */
/* loaded from: classes4.dex */
public final class ig80 extends bl50<OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, on50, bwj, dwj, qf80> {
    public final kg80 c;
    public final sj50<OnboardingPromoState, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> d;

    /* compiled from: OnboardingPromoInlineActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingPromoCtaClickTypeDo.values().length];
            try {
                iArr[OnboardingPromoCtaClickTypeDo.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingPromoCtaClickTypeDo.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnboardingPromoCtaClickTypeDo.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OnboardingPromoInlineActor.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.store.OnboardingPromoInlineActor$init$1", f = "OnboardingPromoInlineActor.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: OnboardingPromoInlineActor.kt */
        @b6l(c = "com.vk.onboardingpromo.impl.ui.store.OnboardingPromoInlineActor$init$1$1", f = "OnboardingPromoInlineActor.kt", l = {46}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            int I$4;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            int label;
            final /* synthetic */ ig80 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ig80 ig80Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.this$0 = ig80Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009b -> B:5:0x009f). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                OnboardingPromoDo onboardingPromoDo;
                Iterator it;
                int i;
                int i2;
                Collection collection;
                int i3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    kotlin.a.a(obj);
                    OnboardingPromoDo onboardingPromoDo2 = ((OnboardingPromoState) this.this$0.b.getCurrentState()).c;
                    List<OnboardingPromoSlideDo> j = onboardingPromoDo2.j();
                    ArrayList arrayList = new ArrayList(c5g.u(j, 10));
                    onboardingPromoDo = onboardingPromoDo2;
                    it = j.iterator();
                    i = 0;
                    i2 = 0;
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.I$2;
                    i3 = this.I$1;
                    i2 = this.I$0;
                    collection = (Collection) this.L$7;
                    OnboardingPromoSlideDo onboardingPromoSlideDo = (OnboardingPromoSlideDo) this.L$6;
                    it = (Iterator) this.L$4;
                    Collection collection2 = (Collection) this.L$3;
                    onboardingPromoDo = (OnboardingPromoDo) this.L$0;
                    kotlin.a.a(obj);
                    List list = (List) obj;
                    collection.add(new OnboardingPromoState.CachedMedia(onboardingPromoSlideDo.getType(), String.valueOf(com.vk.core.files.a.N((File) j5g.Y(list))), String.valueOf(com.vk.core.files.a.N((File) j5g.i0(list)))));
                    i = i5;
                    collection = collection2;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i6 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        OnboardingPromoSlideDo onboardingPromoSlideDo2 = (OnboardingPromoSlideDo) next;
                        long g = onboardingPromoDo.g();
                        this.L$0 = onboardingPromoDo;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = collection;
                        this.L$4 = it;
                        this.L$5 = null;
                        this.L$6 = onboardingPromoSlideDo2;
                        this.L$7 = collection;
                        this.I$0 = i2;
                        this.I$1 = i3;
                        this.I$2 = i6;
                        this.I$3 = i;
                        this.I$4 = 0;
                        this.label = 1;
                        obj = tg80.a(g, onboardingPromoSlideDo2, i, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        onboardingPromoSlideDo = onboardingPromoSlideDo2;
                        i5 = i6;
                        collection2 = collection;
                        List list2 = (List) obj;
                        collection.add(new OnboardingPromoState.CachedMedia(onboardingPromoSlideDo.getType(), String.valueOf(com.vk.core.files.a.N((File) j5g.Y(list2))), String.valueOf(com.vk.core.files.a.N((File) j5g.i0(list2)))));
                        i = i5;
                        collection = collection2;
                        if (it.hasNext()) {
                            ig80 ig80Var = this.this$0;
                            rdi.y(ig80Var, new yu1(18, (List) collection, ig80Var));
                            return s3q0.a;
                        }
                    }
                }
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = ig80.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            myc0.h(yvjVar, null, null, new a(ig80.this, null), 3);
            return s3q0.a;
        }
    }

    public ig80(kg80 kg80Var, sj50<OnboardingPromoState, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> sj50Var) {
        super(sj50Var);
        this.c = kg80Var;
        this.d = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<OnboardingPromoState, on50, ll50<on50, bwj, dwj>, jl50<OnboardingPromoState>, qf80> W() {
        return this.d;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new b(null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        com.vk.onboardingpromo.impl.ui.entity.a aVar = (com.vk.onboardingpromo.impl.ui.entity.a) lj50Var;
        boolean z = aVar instanceof a.g;
        kg80 kg80Var = this.c;
        if (z) {
            SharedPreferences.Editor edit = kg80Var.c().b().edit();
            edit.putBoolean("is_promo_seen_once", true);
            edit.apply();
            return;
        }
        if (!(aVar instanceof a.d)) {
            if (aVar instanceof a.f) {
                a.f fVar = (a.f) aVar;
                qg80 qg80Var = fVar.b;
                rdi.y(this, new c230(((qg80Var instanceof qg80.c) || (qg80Var instanceof qg80.b)) ? new OnboardingPromoState.CurrentSlide(qg80Var, Long.valueOf(fVar.c)) : new OnboardingPromoState.CurrentSlide(null, null, 3, null), 9));
                return;
            } else if (aVar instanceof a.c) {
                g3q.a(this, new jg80(this, null));
                c(qf80.a.a);
                return;
            } else {
                if (aVar instanceof a.e) {
                    a.e eVar = (a.e) aVar;
                    rdi.y(this, new owv(eVar, 19));
                    com.vk.libvideo.autoplay.e eVar2 = com.vk.libvideo.autoplay.e.a;
                    com.vk.libvideo.autoplay.e.f(eVar.b);
                    return;
                }
                return;
            }
        }
        OnboardingPromoDo onboardingPromoDo = ((OnboardingPromoState) this.b.getCurrentState()).c;
        int i = a.$EnumSwitchMapping$0[onboardingPromoDo.f().e().d().e().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                g3q.a(this, new jg80(this, null));
                c(qf80.a.a);
                return;
            }
        }
        bpn0 bpn0Var = xwk.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        maz e = ((qdz) bpn0Var.getValue()).e();
        FragmentActivity a2 = kg80Var.a();
        List<String> d = onboardingPromoDo.f().e().d().d();
        String str = d != null ? (String) j5g.Y(d) : null;
        if (str == null) {
            str = "";
        }
        maz.c(e, a2, str, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, false, false, null, null, null, 67100671), null, null, 24);
        g3q.a(this, new jg80(this, null));
        c(qf80.a.a);
    }
}

package xsna;

import com.vk.ecomm.product_list.presentation.j;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.juz;
import xsna.lj50;
import xsna.lm50;
import xsna.lsr;
import xsna.nb9;
import xsna.pk50;
import xsna.s3q0;
import xsna.spj;

/* compiled from: BindingScope.kt */
/* loaded from: classes3.dex */
public final class h47<ViewState extends lm50, ViewAction extends lj50, ViewEvent extends pk50> implements g47<ViewState, ViewAction, ViewEvent> {
    public final a<ViewState, ViewAction, ViewEvent> a;
    public final b<ViewState, ViewAction, ViewEvent> b;

    /* compiled from: BindingScope.kt */
    public static final class a<ViewState extends lm50, ViewAction extends lj50, ViewEvent extends pk50> {
        public xy<ViewAction> a;
        public ttk0<? extends ViewState> b;
        public ksr<? extends ViewEvent> c;
    }

    /* compiled from: BindingScope.kt */
    public static final class b<ViewState extends lm50, ViewAction extends lj50, ViewEvent extends pk50> {
        public wh50<xy<ViewAction>> a;
        public wh50<ttk0<ViewState>> b;
        public wh50<ksr<ViewEvent>> c;
    }

    public h47() {
        a<ViewState, ViewAction, ViewEvent> aVar = new a<>();
        aVar.a = null;
        aVar.b = null;
        aVar.c = null;
        this.a = aVar;
        wh50<xy<ViewAction>> b2 = androidx.compose.runtime.k.b(null);
        wh50<ttk0<ViewState>> b3 = androidx.compose.runtime.k.b(null);
        wh50<ksr<ViewEvent>> b4 = androidx.compose.runtime.k.b(null);
        b<ViewState, ViewAction, ViewEvent> bVar = new b<>();
        bVar.a = b2;
        bVar.b = b3;
        bVar.c = b4;
        this.b = bVar;
    }

    @Override // xsna.g47
    public final void a(nb9 nb9Var) {
        this.a.c = nb9Var;
    }

    @Override // xsna.g47
    public final void b(h1m h1mVar) {
        this.a.b = h1mVar;
    }

    @Override // xsna.g47
    public final void c(final nb9 nb9Var, final juz juzVar) {
        this.a.c = new ksr<pk50>() { // from class: com.vk.mvi.binder.compose.BindingScopeImpl$bindEvents$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.mvi.binder.compose.BindingScopeImpl$bindEvents$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;

                @b6l(c = "com.vk.mvi.binder.compose.BindingScopeImpl$bindEvents$$inlined$map$1$2", f = "BindingScope.kt", l = {50}, m = "emit")
                /* renamed from: com.vk.mvi.binder.compose.BindingScopeImpl$bindEvents$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, juz juzVar) {
                    this.b = lsrVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                anonymousClass1.label = 1;
                                if (this.b.emit((j) ((pk50) obj), anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super pk50> lsrVar, spj spjVar) {
                Object collect = nb9.this.collect(new AnonymousClass2(lsrVar, juzVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
    }

    @Override // xsna.g47
    public final void d(xy<ViewAction> xyVar) {
        this.a.a = xyVar;
    }

    @Override // xsna.g47
    public final void e(h1m h1mVar, izs izsVar) {
        this.a.b = new xm00(h1mVar, izsVar);
    }
}

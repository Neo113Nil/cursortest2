package xsna;

import androidx.car.app.hardware.common.CarZone;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.ok.android.api.json.JsonToken;

/* compiled from: ModifierExt.kt */
/* loaded from: classes17.dex */
public final class t630 implements PointerInputEventHandler {
    public static final t630 a = new t630();

    /* compiled from: ModifierExt.kt */
    @b6l(c = "com.vk.core.compose.ext.ModifierExtKt$disableSplitMotionEvents$1$1", f = "ModifierExt.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dmb0 $this_pointerInput;
        int label;

        /* compiled from: ModifierExt.kt */
        @b6l(c = "com.vk.core.compose.ext.ModifierExtKt$disableSplitMotionEvents$1$1$1", f = "ModifierExt.kt", l = {JsonToken.BOOLEAN}, m = "invokeSuspend")
        /* renamed from: xsna.t630$a$a, reason: collision with other inner class name */
        public static final class C3723a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            final /* synthetic */ Ref$LongRef $currentId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3723a(Ref$LongRef ref$LongRef, spj<? super C3723a> spjVar) {
                super(2, spjVar);
                this.$currentId = ref$LongRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3723a c3723a = new C3723a(this.$currentId, spjVar);
                c3723a.L$0 = obj;
                return c3723a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3723a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:39:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r12.label
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r12.L$0
                    xsna.eu5 r1 = (xsna.eu5) r1
                    kotlin.a.a(r13)
                    goto L2e
                L11:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L19:
                    kotlin.a.a(r13)
                    java.lang.Object r13 = r12.L$0
                    xsna.eu5 r13 = (xsna.eu5) r13
                    r1 = r13
                L21:
                    androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r12.L$0 = r1
                    r12.label = r2
                    java.lang.Object r13 = r1.I1(r13, r12)
                    if (r13 != r0) goto L2e
                    return r0
                L2e:
                    xsna.plb0 r13 = (xsna.plb0) r13
                    java.util.List<xsna.xlb0> r13 = r13.a
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    kotlin.jvm.internal.Ref$LongRef r3 = r12.$currentId
                    java.util.Iterator r13 = r13.iterator()
                L3a:
                    boolean r4 = r13.hasNext()
                    if (r4 == 0) goto L21
                    java.lang.Object r4 = r13.next()
                    xsna.xlb0 r4 = (xsna.xlb0) r4
                    boolean r5 = r4.d
                    long r6 = r4.a
                    r8 = -1
                    if (r5 == 0) goto L57
                    long r10 = r3.element
                    int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r10 != 0) goto L57
                    r3.element = r6
                    goto L3a
                L57:
                    if (r5 != 0) goto L62
                    long r10 = r3.element
                    int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                    if (r5 != 0) goto L62
                    r3.element = r8
                    goto L3a
                L62:
                    long r10 = r3.element
                    int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                    if (r5 == 0) goto L3a
                    int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r5 == 0) goto L3a
                    r4.a()
                    goto L3a
                */
                throw new UnsupportedOperationException("Method not decompiled: xsna.t630.a.C3723a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dmb0 dmb0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_pointerInput = dmb0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_pointerInput, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = -1L;
                dmb0 dmb0Var = this.$this_pointerInput;
                C3723a c3723a = new C3723a(ref$LongRef, null);
                this.label = 1;
                if (dmb0Var.Z0(c3723a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(dmb0Var, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}

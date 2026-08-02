package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ContentWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class umj implements PointerInputEventHandler {
    public static final umj a = new umj();

    /* compiled from: ContentWithBottomPlayer.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayerKt$ContentWithBottomPlayer$3$1$1", f = "ContentWithBottomPlayer.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0039 A[LOOP:0: B:6:0x0033->B:8:0x0039, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0026 -> B:5:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.L$0
                xsna.eu5 r0 = (xsna.eu5) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r4.label
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                kotlin.a.a(r5)
                goto L29
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.a.a(r5)
            L1c:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r0
                r4.label = r3
                java.lang.Object r5 = r0.I1(r5, r4)
                if (r5 != r1) goto L29
                return r1
            L29:
                xsna.plb0 r5 = (xsna.plb0) r5
                java.util.List<xsna.xlb0> r5 = r5.a
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L33:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L1c
                java.lang.Object r2 = r5.next()
                xsna.xlb0 r2 = (xsna.xlb0) r2
                r2.a()
                goto L33
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.umj.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object Z0 = dmb0Var.Z0(new a(2, null), spjVar);
        return Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? Z0 : s3q0.a;
    }
}

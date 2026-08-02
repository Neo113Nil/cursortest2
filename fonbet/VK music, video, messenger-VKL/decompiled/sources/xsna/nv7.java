package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.iw7;
import xsna.nv7;
import xsna.q630;

/* compiled from: BookingRecordsScreenMviView.kt */
/* loaded from: classes18.dex */
public final class nv7 extends i6v0<nw7, dv7> {

    /* compiled from: BookingRecordsScreenMviView.kt */
    @b6l(c = "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenMviView$ThemedContent$3$2$1", f = "BookingRecordsScreenMviView.kt", l = {112}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<BookingActionResult> $actionResult$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ mtk0<BookingActionResult> $result$delegate;
        final /* synthetic */ dlv0 $snackbarHostState;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(mtk0<? extends BookingActionResult> mtk0Var, Context context, dlv0 dlv0Var, wh50<BookingActionResult> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$result$delegate = mtk0Var;
            this.$context = context;
            this.$snackbarHostState = dlv0Var;
            this.$actionResult$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$result$delegate, this.$context, this.$snackbarHostState, this.$actionResult$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                BookingActionResult value = this.$result$delegate.getValue();
                if (value != null) {
                    Context context = this.$context;
                    dlv0 dlv0Var = this.$snackbarHostState;
                    wh50<BookingActionResult> wh50Var = this.$actionResult$delegate;
                    int i3 = BookingActionResult.b.$EnumSwitchMapping$0[value.ordinal()];
                    if (i3 == 1) {
                        i = R.string.booking_service_cancellation_success;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.booking_service_cancellation_failure;
                    }
                    String string = context.getString(i);
                    wh50Var.setValue(value);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    if (dlv0.d(dlv0Var, string, null, this, 30) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public nv7(Context context, f5z f5zVar) {
        super(context, f5zVar);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((nw7) ao50Var, izsVar, aVar, 512);
    }

    public final void h(nw7 nw7Var, final izs<? super dv7, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-91859511);
        int i2 = 2;
        int i3 = i | (M.J(nw7Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-91859511, i3, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenMviView.ThemedContent (BookingRecordsScreenMviView.kt:74)");
            }
            final wh50 d = d(jw7.a, new n0u0[]{nw7Var.a, nw7Var.b, nw7Var.c}, M, (i3 & 896) | 518);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            final dlv0 dlv0Var = (dlv0) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            final wh50 wh50Var = (wh50) x2;
            jai c = kai.c(-1968383070, new jd4(izsVar, i2), M);
            jai c2 = kai.c(601741988, new wd0(i2, dlv0Var, wh50Var), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c, null, c2, null, 0, ylu0Var.getBackground().g, 0L, kai.c(565148397, new yzs() { // from class: xsna.jv7
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(565148397, intValue, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenMviView.ThemedContent.<anonymous> (BookingRecordsScreenMviView.kt:89)");
                        }
                        fm50 fm50Var = (fm50) d.getValue();
                        boolean z = fm50Var instanceof kw7;
                        izs izsVar2 = izs.this;
                        Object obj4 = a.C0011a.a;
                        if (z) {
                            aVar2.K(64233434);
                            wh50 c3 = jk50.c(((kw7) fm50Var).a, aVar2);
                            com.vk.ecomm.onlinebooking.impl.common.a c4 = com.vk.ecomm.onlinebooking.impl.common.b.c(((iw7.a) c3.getValue()).b);
                            boolean J = aVar2.J(izsVar2) | aVar2.J(c3);
                            Object x3 = aVar2.x();
                            if (J || x3 == obj4) {
                                x3 = new com.vk.newsfeed.common.recycler.holders.attachments.a(5, izsVar2, c3);
                                aVar2.R(x3);
                            }
                            iq7.a(c4, (gzs) x3, aVar2, 0);
                            aVar2.j();
                        } else if (fm50Var instanceof lw7) {
                            aVar2.K(64507784);
                            zfr0.f(SpinnerState.Loading, txj0.d(q630.a.a, 1.0f), null, 0L, SpinnerSize.Size56, null, aVar2, 24630, 44);
                            aVar2.j();
                        } else if (fm50Var instanceof mw7) {
                            aVar2.K(64786133);
                            mw7 mw7Var = (mw7) fm50Var;
                            wh50 c5 = jk50.c(mw7Var.a, aVar2);
                            wh50 a2 = jk50.a(mw7Var.b, aVar2, 0, 3);
                            wh50 c6 = jk50.c(mw7Var.c, aVar2);
                            wh50 a3 = jk50.a(mw7Var.d, aVar2, 0, 3);
                            wh50 c7 = jk50.c(mw7Var.e, aVar2);
                            Context context = (Context) aVar2.r(AndroidCompositionLocals_androidKt.b);
                            BookingActionResult bookingActionResult = (BookingActionResult) a3.getValue();
                            boolean J2 = aVar2.J(a3) | aVar2.y(context);
                            Object x4 = aVar2.x();
                            if (J2 || x4 == obj4) {
                                nv7.a aVar3 = new nv7.a(a3, context, dlv0Var, wh50Var, null);
                                aVar2.R(aVar3);
                                x4 = aVar3;
                            }
                            bap.g(bookingActionResult, (wzs) x4, aVar2, 0);
                            if (((BookingRecord) a2.getValue()) != null) {
                                aVar2.K(65553011);
                                boolean J3 = aVar2.J(izsVar2);
                                Object x5 = aVar2.x();
                                if (J3 || x5 == obj4) {
                                    x5 = new lv7(izsVar2, 0);
                                    aVar2.R(x5);
                                }
                                gzs gzsVar = (gzs) x5;
                                boolean J4 = aVar2.J(izsVar2);
                                Object x6 = aVar2.x();
                                if (J4 || x6 == obj4) {
                                    x6 = new mv7(izsVar2, 0);
                                    aVar2.R(x6);
                                }
                                gzs gzsVar2 = (gzs) x6;
                                boolean J5 = aVar2.J(izsVar2);
                                Object x7 = aVar2.x();
                                if (J5 || x7 == obj4) {
                                    x7 = new ix2(izsVar2, 8);
                                    aVar2.R(x7);
                                }
                                alk.a(gzsVar, gzsVar2, (izs) x7, sni.s((BookingRecord) a2.getValue()), cq.b("cancel_record_confirmation_dialog", null, 3), aVar2, 0);
                                aVar2 = aVar2;
                            } else {
                                aVar2.K(59450165);
                            }
                            aVar2.j();
                            boolean isEmpty = ((wow) c5.getValue()).b.isEmpty();
                            if (isEmpty) {
                                aVar2.K(1941796799);
                                wv7.e(0, aVar2);
                                aVar2.j();
                            } else {
                                if (isEmpty) {
                                    throw alb0.c(1941795287, aVar2);
                                }
                                aVar2.K(1941798706);
                                wv7.f(0, aVar2, (String) c6.getValue(), ((wow) c5.getValue()).b, izsVar2, ((Boolean) c7.getValue()).booleanValue());
                                aVar2.j();
                            }
                            aVar2.j();
                        } else {
                            if (fm50Var instanceof jw7) {
                                aVar2.K(1941810929);
                            } else {
                                aVar2.K(59450165);
                            }
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309488, 373);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv7(this, nw7Var, izsVar, i, 0);
        }
    }
}

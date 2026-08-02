package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.core.fragments.FragmentImpl;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: VideoBottomSheetCallback.kt */
/* loaded from: classes2.dex */
public final class m6s0 {

    /* compiled from: _Sequences.kt */
    public static final class a implements izs<Object, Boolean> {
        public static final a b = new a();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof l6s0);
        }
    }

    /* compiled from: VideoBottomSheetCallback.kt */
    @b6l(c = "com.vk.libvideo.bottomsheet.VideoBottomSheetCallbackKt$findVideoBottomSheetCallbackHolder$1", f = "VideoBottomSheetCallback.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class b extends RestrictedSuspendLambda implements wzs<ali0<? super Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ fcn $dismissed;
        final /* synthetic */ ww50<?> $navigationDelegate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fcn fcnVar, Context context, ww50<?> ww50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$dismissed = fcnVar;
            this.$context = context;
            this.$navigationDelegate = ww50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$dismissed, this.$context, this.$navigationDelegate, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ali0<? super Object> ali0Var, spj<? super s3q0> spjVar) {
            return ((b) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
        
            if (r0.a(r10, r9) == r1) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0139, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0122, code lost:
        
            if (r10 == r1) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
        
            if (r0.a(r10, r9) == r1) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0096, code lost:
        
            if (com.vk.libvideo.api.minimizable.a.d(r2) == true) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x00a2, code lost:
        
            if (r0.a(r10, r9) == r1) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0053, code lost:
        
            if (r0.a(r10, r9) == r1) goto L93;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ww50<?> ww50Var;
            Object obj2;
            FragmentManager supportFragmentManager;
            int i;
            ali0 ali0Var = (ali0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                fcn fcnVar = this.$dismissed;
                fcn v = (fcnVar == null || (ww50Var = this.$navigationDelegate) == null) ? null : ww50Var.v(fcnVar);
                this.L$0 = ali0Var;
                this.label = 1;
            } else if (i2 == 1) {
                kotlin.a.a(obj);
            } else if (i2 == 2) {
                kotlin.a.a(obj);
                ww50<?> ww50Var2 = this.$navigationDelegate;
                FragmentImpl u = ww50Var2 != null ? ww50Var2.u() : null;
                this.L$0 = ali0Var;
                this.label = 3;
            } else if (i2 == 3) {
                kotlin.a.a(obj);
                Object obj3 = this.$dismissed;
                Fragment fragment = obj3 instanceof Fragment ? (Fragment) obj3 : null;
                uki0 uki0Var = ghp.a;
                if (fragment != null) {
                    try {
                        if (fragment.isAdded()) {
                            List<Fragment> f = fragment.getParentFragmentManager().c.f();
                            ListIterator<Fragment> listIterator = f.listIterator(f.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    i = -1;
                                    break;
                                }
                                if (epx.f(listIterator.previous(), fragment)) {
                                    i = listIterator.nextIndex();
                                    break;
                                }
                            }
                            if (i > 0) {
                                uki0Var = new bli0(new n6s0(i, f, null));
                            }
                        }
                    } catch (Exception e) {
                        L.i(e);
                    }
                }
                this.L$0 = ali0Var;
                this.label = 4;
                ali0Var.getClass();
                Object b = ali0Var.b(uki0Var.iterator(), this);
                if (b != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    b = s3q0.a;
                }
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                Context context = this.$context;
                Activity h = context != null ? e3m.h(context) : null;
                this.L$0 = null;
                this.label = 5;
            }
            Context context2 = this.$context;
            Activity h2 = context2 != null ? e3m.h(context2) : null;
            FragmentActivity fragmentActivity = h2 instanceof FragmentActivity ? (FragmentActivity) h2 : null;
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (obj2 = supportFragmentManager.H("VideoMinimizableFragmentTag")) != null) {
                ows0 ows0Var = obj2 instanceof ows0 ? (ows0) obj2 : null;
                if (ows0Var != null) {
                    io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3 = ows0Var.b3();
                    if (b3 != null) {
                        VideoMinimizableState P0 = b3.P0();
                        if (P0 != null) {
                        }
                    }
                }
            }
            obj2 = null;
            this.L$0 = ali0Var;
            this.label = 2;
        }
    }

    public static final l6s0 a(Context context, fcn fcnVar) {
        return (l6s0) rli0.n(rli0.j(new bli0(new b(fcnVar, context, context != null ? s200.v(context) : null, null)), a.b));
    }
}

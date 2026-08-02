package xsna;

import android.content.SharedPreferences;
import com.vk.internal.api.GsonHolder;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoDo;
import com.vk.onboardingpromo.impl.domain.objects.OnboardingPromoSlideDo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl$cacheOnboardingPromo$2", f = "OnboardingPromoRepositoryImpl.kt", l = {153, 155, 164, 165, 169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class vg80 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ OnboardingPromoDo $promoDo;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ xg80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg80(OnboardingPromoDo onboardingPromoDo, xg80 xg80Var, spj<? super vg80> spjVar) {
        super(2, spjVar);
        this.$promoDo = onboardingPromoDo;
        this.this$0 = xg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vg80 vg80Var = new vg80(this.$promoDo, this.this$0, spjVar);
        vg80Var.L$0 = obj;
        return vg80Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vg80) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        if (xsna.qsl.b(ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, r16) == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0225 -> B:19:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x014e -> B:20:0x015a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OnboardingPromoDo onboardingPromoDo;
        xg80 xg80Var;
        Iterator it;
        int i;
        int i2;
        SharedPreferences.Editor edit;
        Object b;
        String str;
        int i3;
        SharedPreferences.Editor editor;
        Iterator it2;
        Iterator it3;
        String str2;
        int i4;
        xg80 xg80Var2;
        Object obj2;
        int i5;
        OnboardingPromoDo onboardingPromoDo2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object f;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        int i11 = 0;
        if (i10 == 0) {
            kotlin.a.a(obj);
            if (this.$promoDo == null) {
                throw new IllegalStateException("Doesn't have any promo campaign to cache");
            }
            this.L$0 = yvjVar;
            this.label = 1;
        } else if (i10 == 1 || i10 == 2) {
            kotlin.a.a(obj);
        } else {
            if (i10 == 3) {
                int i12 = this.I$5;
                int i13 = this.I$4;
                i7 = this.I$3;
                int i14 = this.I$2;
                int i15 = this.I$1;
                int i16 = this.I$0;
                str2 = (String) this.L$10;
                it3 = (Iterator) this.L$8;
                it2 = (Iterator) this.L$4;
                xg80 xg80Var3 = (xg80) this.L$3;
                onboardingPromoDo2 = (OnboardingPromoDo) this.L$2;
                kotlin.a.a(obj);
                i8 = i12;
                i9 = i13;
                i5 = i14;
                i6 = i16;
                i4 = i15;
                obj2 = obj;
                xg80Var2 = xg80Var3;
                rf80 rf80Var = xg80Var2.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = onboardingPromoDo2;
                this.L$3 = xg80Var2;
                this.L$4 = it2;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = it3;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.I$0 = i6;
                this.I$1 = i4;
                this.I$2 = i5;
                this.I$3 = i7;
                this.I$4 = i9;
                this.I$5 = i8;
                this.label = 4;
                rf80Var.getClass();
                io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new dug0(str2, (File) obj2, true));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f = sd9.f(new io.reactivex.rxjava3.internal.operators.observable.i0(qVar.i0().r0(asu0.a.c()), new i630(new f6w(15), 7)).K(), this);
                if (f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (f != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.I$0;
                edit = (SharedPreferences.Editor) this.L$5;
                str = (String) this.L$4;
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) this.L$2;
                kotlin.a.a(obj);
                editor = editor2;
                b = obj;
                edit.putBoolean(str, ((Boolean) b).booleanValue());
                if (i3 == 0) {
                    editor.commit();
                } else {
                    editor.apply();
                }
                return s3q0.a;
            }
            int i17 = this.I$4;
            int i18 = this.I$3;
            int i19 = this.I$2;
            int i20 = this.I$1;
            int i21 = this.I$0;
            Iterator it4 = (Iterator) this.L$8;
            Iterator it5 = (Iterator) this.L$4;
            xg80 xg80Var4 = (xg80) this.L$3;
            OnboardingPromoDo onboardingPromoDo3 = (OnboardingPromoDo) this.L$2;
            kotlin.a.a(obj);
            int i22 = i20;
            i2 = i21;
            int i23 = i18;
            onboardingPromoDo = onboardingPromoDo3;
            xg80Var = xg80Var4;
            i = i19;
            Iterator it6 = it4;
            int i24 = i17;
            it = it5;
            i11 = 0;
            if (it6.hasNext()) {
                Pair pair = (Pair) it6.next();
                String str3 = (String) pair.d();
                String str4 = (String) pair.g();
                long g = onboardingPromoDo.g();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = onboardingPromoDo;
                this.L$3 = xg80Var;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = it6;
                this.L$9 = null;
                this.L$10 = str3;
                this.L$11 = null;
                this.L$12 = null;
                this.I$0 = i2;
                this.I$1 = i22;
                this.I$2 = i;
                this.I$3 = i23;
                this.I$4 = i24;
                this.I$5 = 0;
                this.label = 3;
                obj2 = tg80.c(i, str3, str4, g);
                if (obj2 != coroutineSingletons) {
                    it2 = it;
                    i9 = i24;
                    str2 = str3;
                    xg80Var2 = xg80Var;
                    it3 = it6;
                    i7 = i23;
                    i5 = i;
                    i6 = i2;
                    i4 = i22;
                    onboardingPromoDo2 = onboardingPromoDo;
                    i8 = 0;
                    rf80 rf80Var2 = xg80Var2.b;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = onboardingPromoDo2;
                    this.L$3 = xg80Var2;
                    this.L$4 = it2;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = it3;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = null;
                    this.I$0 = i6;
                    this.I$1 = i4;
                    this.I$2 = i5;
                    this.I$3 = i7;
                    this.I$4 = i9;
                    this.I$5 = i8;
                    this.label = 4;
                    rf80Var2.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.q qVar2 = new io.reactivex.rxjava3.internal.operators.observable.q(new dug0(str2, (File) obj2, true));
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    f = sd9.f(new io.reactivex.rxjava3.internal.operators.observable.i0(qVar2.i0().r0(asu0.a.c()), new i630(new f6w(15), 7)).K(), this);
                    if (f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        f = s3q0.a;
                    }
                    if (f != coroutineSingletons) {
                        onboardingPromoDo = onboardingPromoDo2;
                        i22 = i4;
                        i23 = i7;
                        i2 = i6;
                        xg80Var = xg80Var2;
                        i24 = i9;
                        it = it2;
                        i = i5;
                        it6 = it3;
                        i11 = 0;
                        if (it6.hasNext()) {
                            i = i22;
                            if (it.hasNext()) {
                                SharedPreferences b2 = this.this$0.b();
                                OnboardingPromoDo onboardingPromoDo4 = this.$promoDo;
                                edit = b2.edit();
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = edit;
                                this.L$3 = null;
                                this.L$4 = "is_fully_cached";
                                this.L$5 = edit;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.L$10 = null;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.I$0 = 0;
                                this.I$1 = 0;
                                this.I$2 = 0;
                                this.label = 5;
                                b = hg80.b(onboardingPromoDo4, this);
                                if (b != coroutineSingletons) {
                                    str = "is_fully_cached";
                                    i3 = 0;
                                    editor = edit;
                                    edit.putBoolean(str, ((Boolean) b).booleanValue());
                                    if (i3 == 0) {
                                    }
                                    return s3q0.a;
                                }
                            } else {
                                Object next = it.next();
                                i22 = i + 1;
                                if (i < 0) {
                                    e43.t();
                                    throw null;
                                }
                                it6 = tg80.b((OnboardingPromoSlideDo) next).iterator();
                                i23 = i11;
                                i24 = i23;
                                if (it6.hasNext()) {
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        while (!d260.b.a().d1() && zvj.f(yvjVar)) {
            this.L$0 = yvjVar;
            this.label = 2;
            if (qsl.b(10000L, this) == coroutineSingletons) {
                break;
            }
        }
        xg80 xg80Var5 = this.this$0;
        long g2 = this.$promoDo.g();
        hn70 hn70Var = xg80Var5.g;
        qcy<Object> qcyVar = xg80.h[0];
        hn70Var.b(g2);
        SharedPreferences b3 = this.this$0.b();
        OnboardingPromoDo onboardingPromoDo5 = this.$promoDo;
        SharedPreferences.Editor edit2 = b3.edit();
        edit2.putString("onboarding_promo", GsonHolder.a().toJson(onboardingPromoDo5));
        edit2.putBoolean("is_promo_seen_once", false);
        edit2.apply();
        List<OnboardingPromoSlideDo> j = this.$promoDo.j();
        onboardingPromoDo = this.$promoDo;
        xg80Var = this.this$0;
        it = j.iterator();
        i = 0;
        i2 = 0;
        if (it.hasNext()) {
        }
    }
}

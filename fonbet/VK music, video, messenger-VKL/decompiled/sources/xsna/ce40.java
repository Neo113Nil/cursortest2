package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicCatalogVkTabContent.kt */
/* loaded from: classes16.dex */
public final class ce40 extends nxv0 implements g380 {
    public static final /* synthetic */ int R = 0;
    public final ksr<Boolean> M;
    public final TextView N;
    public float O;
    public boolean P;
    public hpj Q;

    /* compiled from: MusicCatalogVkTabContent.kt */
    @b6l(c = "com.vk.catalog2.feature.music.holders.appbar.MusicCatalogVkTabContent$onAttachedToWindow$2", f = "MusicCatalogVkTabContent.kt", l = {41}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: MusicCatalogVkTabContent.kt */
        /* renamed from: xsna.ce40$a$a, reason: collision with other inner class name */
        public static final class C2661a<T> implements lsr {
            public final /* synthetic */ ce40 b;

            public C2661a(ce40 ce40Var) {
                this.b = ce40Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                boolean z = !((Boolean) obj).booleanValue();
                int i = ce40.R;
                this.b.Z4(z);
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ce40.this.new a(spjVar);
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
                ce40 ce40Var = ce40.this;
                ksr<Boolean> ksrVar = ce40Var.M;
                C2661a c2661a = new C2661a(ce40Var);
                this.label = 1;
                if (ksrVar.collect(c2661a, this) == coroutineSingletons) {
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

    public ce40(Context context, utk0 utk0Var) {
        super(context);
        this.M = utk0Var;
        this.N = (TextView) findViewById(R.id.title);
        this.O = isSelected() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Z4(this.P);
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.too0
    public final void Ng() {
        Z4(this.P);
    }

    public final void Z4(boolean z) {
        this.P = z;
        Pair pair = z ? new Pair(Integer.valueOf(R.attr.vk_ui_text_secondary), Integer.valueOf(R.attr.vk_ui_text_accent)) : new Pair(Integer.valueOf(R.attr.vk_ui_text_contrast), Integer.valueOf(R.attr.vk_ui_text_primary));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        TextView textView = this.N;
        if (textView != null) {
            textView.setTextColor(n8g.d(this.O, krv0.l(intValue), krv0.l(intValue2)));
        }
    }

    @Override // com.vk.core.view.components.tabs.d, xsna.fox
    public final void m0(int i, int i2) {
        this.O = (i2 - i) / getWidth();
        Z4(this.P);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(ie00.a.U().plus(iyx.a()));
        this.Q = a2;
        myc0.h(a2, null, null, new a(null), 3);
    }

    @Override // android.view.View, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        Z4(this.P);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hpj hpjVar = this.Q;
        if (hpjVar != null) {
            zvj.c(hpjVar, null);
        }
    }
}

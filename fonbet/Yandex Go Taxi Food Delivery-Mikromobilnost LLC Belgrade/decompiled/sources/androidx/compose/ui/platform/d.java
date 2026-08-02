package androidx.compose.ui.platform;

import android.view.View;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.fwc0;
import defpackage.hwc0;
import defpackage.ny61;
import defpackage.pay;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.vpy0;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d implements hwc0, tse {
    public final View a;
    public final vpy0 b;
    public final tse c;
    public final AtomicReference w = new AtomicReference(null);

    public d(View view, vpy0 vpy0Var, tse tseVar) {
        this.a = view;
        this.b = vpy0Var;
        this.c = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(final pay payVar, ContinuationImpl continuationImpl) {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        int i;
        if (continuationImpl instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) continuationImpl;
            int i2 = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidPlatformTextInputSession$startInputMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tls tlsVar = new tls() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2

                        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                        /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
                        final class AnonymousClass1 extends Lambda implements sls {
                            final /* synthetic */ d this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(d dVar) {
                                super(0);
                                this.this$0 = dVar;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                bvf0.j(this.this$0.c, null);
                                return zy11.a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            return new l(fwc0.this, new AnonymousClass1(this));
                        }
                    };
                    AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
                    androidPlatformTextInputSession$startInputMethod$1.label = 1;
                    if (androidx.compose.ui.b.e(this.w, tlsVar, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
        Object obj2 = androidPlatformTextInputSession$startInputMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}

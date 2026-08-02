package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import kotlin.LazyThreadSafetyMode;
import xsna.x65;

/* compiled from: BasePasswordAuthPresenter.kt */
/* loaded from: classes15.dex */
public abstract class zi6<V extends x65> extends p66<V> {
    public final Object x = msy.a(LazyThreadSafetyMode.NONE, new defpackage.f(this, 4));

    /* compiled from: BasePasswordAuthPresenter.kt */
    public class a extends p66<V>.a {
        public a() {
            super();
        }

        @Override // xsna.p66.a, xsna.e66, xsna.ipj0
        public final void f(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
            if (vggVar.b() != ApiErrorViewType.CUSTOM) {
                vggVar.c();
            } else {
                zi6.this.y0();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public abstract void y0();
}

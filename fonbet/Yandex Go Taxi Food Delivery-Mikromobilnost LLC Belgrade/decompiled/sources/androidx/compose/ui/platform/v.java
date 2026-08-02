package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import defpackage.bsq0;
import defpackage.bts;
import defpackage.bud;
import defpackage.did;
import defpackage.fid;
import defpackage.jl40;
import defpackage.o430;
import defpackage.ohh0;
import defpackage.pey;
import defpackage.rtd;
import defpackage.tls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class v implements rtd, androidx.lifecycle.q {
    public final AndroidComposeView a;
    public final bud b;
    public boolean c;
    public Lifecycle w;
    public wls x;

    public v(AndroidComposeView androidComposeView, bud budVar) {
        this.a = androidComposeView;
        this.b = budVar;
        ComposableSingletons$Wrapper_androidKt.a.getClass();
        this.x = ComposableSingletons$Wrapper_androidKt.b;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.c) {
                return;
            }
            a(this.x);
        }
    }

    public final void a(final wls wlsVar) {
        this.a.setOnReadyForComposition(new tls() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                final i iVar = (i) obj;
                if (!v.this.c) {
                    pey peyVar = iVar.c;
                    View view = iVar.a;
                    Lifecycle lifecycle = peyVar.getLifecycle();
                    v vVar = v.this;
                    vVar.x = wlsVar;
                    if (vVar.w == null) {
                        boolean l = jl40.l(Looper.myLooper(), view.getHandler().getLooper());
                        v vVar2 = v.this;
                        if (l) {
                            vVar2.w = lifecycle;
                            lifecycle.a(vVar2);
                        } else {
                            view.post(new bsq0(6, vVar2, lifecycle));
                        }
                    } else if (lifecycle.b().a(Lifecycle.State.CREATED)) {
                        final v vVar3 = v.this;
                        bud budVar = vVar3.b;
                        final wls wlsVar2 = wlsVar;
                        budVar.A(new androidx.compose.runtime.internal.a(-1723985096, new wls() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                fid fidVar = (fid) obj2;
                                int intValue = ((Number) obj3).intValue();
                                bts btsVar = (bts) fidVar;
                                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                                    v vVar4 = v.this;
                                    AndroidComposeView androidComposeView = vVar4.a;
                                    boolean e = btsVar.e(vVar4);
                                    v vVar5 = v.this;
                                    Object Q = btsVar.Q();
                                    o430 o430Var = did.a;
                                    if (e || Q == o430Var) {
                                        Q = new WrappedComposition$setContent$1$2$1$1(vVar5, null);
                                        btsVar.o0(Q);
                                    }
                                    zpn.e(btsVar, (wls) Q, androidComposeView);
                                    v vVar6 = v.this;
                                    AndroidComposeView androidComposeView2 = vVar6.a;
                                    boolean e2 = btsVar.e(vVar6);
                                    v vVar7 = v.this;
                                    Object Q2 = btsVar.Q();
                                    if (e2 || Q2 == o430Var) {
                                        Q2 = new WrappedComposition$setContent$1$2$2$1(vVar7, null);
                                        btsVar.o0(Q2);
                                    }
                                    zpn.e(btsVar, (wls) Q2, androidComposeView2);
                                    iVar.a(v.this.a, wlsVar2, btsVar, 0);
                                } else {
                                    btsVar.Y();
                                }
                                return zy11.a;
                            }
                        }, true));
                    }
                }
                return zy11.a;
            }
        });
    }

    @Override // defpackage.rtd
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(ohh0.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.w;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
            this.w = null;
        }
        this.b.dispose();
    }
}

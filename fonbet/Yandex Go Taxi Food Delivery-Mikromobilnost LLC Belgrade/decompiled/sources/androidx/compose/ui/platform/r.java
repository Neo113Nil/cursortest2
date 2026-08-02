package androidx.compose.ui.platform;

import android.view.View;
import defpackage.ixv;
import defpackage.ny61;
import defpackage.pey;
import defpackage.sls;
import defpackage.vng;
import defpackage.vp31;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class r implements vp31 {
    public static final r b = new r(0);
    public static final r c = new r(1);
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
    @Override // defpackage.vp31
    public final sls a(final AbstractComposeView abstractComposeView) {
        switch (this.a) {
            case 0:
                final ?? r2 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                        AbstractComposeView.this.disposeComposition();
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r2);
                return new sls() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        AbstractComposeView.this.removeOnAttachStateChangeListener(r2);
                        return zy11.a;
                    }
                };
            default:
                if (!abstractComposeView.isAttachedToWindow()) {
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                        /* JADX WARN: Type inference failed for: r3v6, types: [T, sls] */
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            pey o = vng.o(AbstractComposeView.this);
                            AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                            if (o != null) {
                                ref$ObjectRef.element = t.a(abstractComposeView2, o.getLifecycle());
                                AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                            } else {
                                ixv.c("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                                ny61.A();
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    abstractComposeView.addOnAttachStateChangeListener(r0);
                    ref$ObjectRef.element = new sls() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            AbstractComposeView.this.removeOnAttachStateChangeListener(r0);
                            return zy11.a;
                        }
                    };
                    return new sls() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            Ref$ObjectRef.this.element.invoke();
                            return zy11.a;
                        }
                    };
                }
                pey o = vng.o(abstractComposeView);
                if (o != null) {
                    return t.a(abstractComposeView, o.getLifecycle());
                }
                ixv.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                ny61.A();
                return null;
        }
    }
}

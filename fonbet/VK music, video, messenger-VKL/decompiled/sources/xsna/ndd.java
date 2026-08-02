package xsna;

import android.view.ViewGroup;
import xsna.vlp0;

/* compiled from: ClipTransitionAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class ndd {
    public final ViewGroup a;

    public ndd(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* compiled from: ClipTransitionAnimationsDelegate.kt */
    public final class a implements vlp0.i {
        public final com.vk.clips.design.view.component.description.a b;

        public a(com.vk.clips.design.view.component.description.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            this.b.a.I = true;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
            this.b.a.I = false;
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
        }
    }
}

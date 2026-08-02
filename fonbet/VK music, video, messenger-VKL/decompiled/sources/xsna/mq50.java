package xsna;

import android.view.View;

/* compiled from: MyTargetInternalAdStoryViewVideoTrackerDelegate.kt */
/* loaded from: classes6.dex */
public final class mq50 {
    public cjx a;
    public final a b;

    /* compiled from: MyTargetInternalAdStoryViewVideoTrackerDelegate.kt */
    public static final class a implements fjx {
        public final q7r a;

        public a(q7r q7rVar) {
            this.a = q7rVar;
        }

        @Override // xsna.fjx
        public final View a() {
            xaj0 xaj0Var = this.a.v;
            if (xaj0Var != null) {
                return xaj0Var.a;
            }
            return null;
        }

        @Override // xsna.fjx
        public final float getDuration() {
            return (this.a.v != null ? r0.getDuration() : 0L) / 1000;
        }

        @Override // xsna.fjx
        public final float getProgress() {
            o3e0 o3e0Var;
            umm0 umm0Var = this.a.i0.b;
            long j = 0;
            if (umm0Var != null && (o3e0Var = umm0Var.c) != null) {
                j = o3e0Var.a();
            }
            float f = j / 1000;
            float duration = getDuration();
            return ((double) (f / duration)) < 0.97d ? f : duration;
        }
    }

    public mq50(q7r q7rVar) {
        this.b = new a(q7rVar);
    }
}

package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.EnumSet;

/* compiled from: StoryFlexboxFactory.kt */
/* loaded from: classes6.dex */
public interface x2m0 {

    /* compiled from: StoryFlexboxFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final x2m0 STUB = new C3971a();

        /* compiled from: StoryFlexboxFactory.kt */
        /* renamed from: xsna.x2m0$a$a, reason: collision with other inner class name */
        public static final class C3971a implements x2m0 {
            @Override // xsna.x2m0
            public final ViewGroup a(Context context, EnumSet enumSet, r6i0 r6i0Var, boolean z) {
                return new FrameLayout(context);
            }
        }

        public final x2m0 getSTUB() {
            return STUB;
        }
    }

    /* compiled from: StoryFlexboxFactory.kt */
    public static final class b {
        public m2l0 a;
    }

    ViewGroup a(Context context, EnumSet enumSet, r6i0 r6i0Var, boolean z);
}

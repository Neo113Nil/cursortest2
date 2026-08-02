package xsna;

import com.vkontakte.android.R;

/* compiled from: MotionStateId.kt */
/* loaded from: classes7.dex */
public interface nb30 {

    /* compiled from: MotionStateId.kt */
    public static final class a {
        public static final C3393a a = new C3393a();
        public static final b b = new b();

        /* compiled from: MotionStateId.kt */
        /* renamed from: xsna.nb30$a$a, reason: collision with other inner class name */
        public static final class C3393a implements nb30 {
            @Override // xsna.nb30
            public final int h() {
                return R.id.view_transition;
            }
        }

        /* compiled from: MotionStateId.kt */
        public static final class b implements nb30 {
            @Override // xsna.nb30
            public final int h() {
                return -1;
            }
        }
    }

    int h();
}

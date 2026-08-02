package xsna;

import androidx.fragment.app.Fragment;

/* compiled from: ImItemListFragmentFactory.kt */
/* loaded from: classes2.dex */
public interface u5w {

    /* compiled from: ImItemListFragmentFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final u5w STUB = new C3785a();

        /* compiled from: ImItemListFragmentFactory.kt */
        /* renamed from: xsna.u5w$a$a, reason: collision with other inner class name */
        public static final class C3785a implements u5w {
            @Override // xsna.u5w
            public final Fragment a() {
                return new Fragment();
            }

            @Override // xsna.u5w
            public final Class<? extends Fragment> b() {
                return b.class;
            }
        }

        /* compiled from: ImItemListFragmentFactory.kt */
        public static final class b extends Fragment {
        }

        public final u5w getSTUB() {
            return STUB;
        }
    }

    Fragment a();

    Class<? extends Fragment> b();
}

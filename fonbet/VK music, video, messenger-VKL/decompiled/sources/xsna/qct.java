package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.games.model.GamesHeaderSectionInfo;

/* compiled from: GamesCatalogNavigatorProvider.kt */
/* loaded from: classes.dex */
public interface qct {

    /* compiled from: GamesCatalogNavigatorProvider.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final qct STUB = new C3557a();

        /* compiled from: GamesCatalogNavigatorProvider.kt */
        /* renamed from: xsna.qct$a$a, reason: collision with other inner class name */
        public static final class C3557a implements qct {
            @Override // xsna.qct
            public final Class<? extends FragmentImpl> a() {
                rdi.F(FragmentImpl.class);
                return FragmentImpl.class;
            }

            @Override // xsna.qct
            public final oz50 b() {
                oz50 oz50Var = new oz50(FragmentImpl.class, null, null);
                rdi.F(oz50Var);
                return oz50Var;
            }

            @Override // xsna.qct
            public final oz50 c(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str) {
                oz50 oz50Var = new oz50(FragmentImpl.class, null, null);
                rdi.F(oz50Var);
                return oz50Var;
            }
        }

        public final qct getSTUB() {
            return STUB;
        }
    }

    Class<? extends FragmentImpl> a();

    oz50 b();

    oz50 c(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str);
}

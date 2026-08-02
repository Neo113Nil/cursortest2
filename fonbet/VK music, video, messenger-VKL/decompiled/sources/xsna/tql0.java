package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;

/* compiled from: StoriesBlockHolderFactory.kt */
/* loaded from: classes6.dex */
public interface tql0 {

    /* compiled from: StoriesBlockHolderFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final tql0 STUB = new C3763a();

        /* compiled from: StoriesBlockHolderFactory.kt */
        /* renamed from: xsna.tql0$a$a, reason: collision with other inner class name */
        public static final class C3763a implements tql0 {
            @Override // xsna.tql0
            public final rql0 a(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str) {
                return new sql0(new RecyclerView(context), viewGroup);
            }

            @Override // xsna.tql0
            public final rql0 b(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str) {
                return new sql0(new RecyclerView(context), viewGroup);
            }
        }

        public final tql0 getSTUB() {
            return STUB;
        }
    }

    rql0 a(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str);

    rql0 b(Context context, ViewGroup viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, y4m0 y4m0Var, String str);
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;

/* compiled from: VkStepsManager.kt */
/* loaded from: classes11.dex */
public interface hmv0 {
    void a();

    void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar);

    void c(String str);

    void d(com.vk.superapp.ui.a aVar);

    void e(com.vk.superapp.ui.a aVar);

    boolean f(com.vk.superapp.ui.a aVar);

    void g(e9q0 e9q0Var);

    void h();

    ViewGroup i(LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var);

    /* compiled from: VkStepsManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final hmv0 STUB = new C3011a();

        public final hmv0 getSTUB() {
            return STUB;
        }

        /* compiled from: VkStepsManager.kt */
        /* renamed from: xsna.hmv0$a$a, reason: collision with other inner class name */
        public static final class C3011a implements hmv0 {
            @Override // xsna.hmv0
            public final boolean f(com.vk.superapp.ui.a aVar) {
                return false;
            }

            @Override // xsna.hmv0
            public final ViewGroup i(LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var) {
                return new FrameLayout(layoutInflater.getContext());
            }

            @Override // xsna.hmv0
            public final void a() {
            }

            @Override // xsna.hmv0
            public final void h() {
            }

            @Override // xsna.hmv0
            public final void c(String str) {
            }

            @Override // xsna.hmv0
            public final void d(com.vk.superapp.ui.a aVar) {
            }

            @Override // xsna.hmv0
            public final void e(com.vk.superapp.ui.a aVar) {
            }

            @Override // xsna.hmv0
            public final void g(e9q0 e9q0Var) {
            }

            @Override // xsna.hmv0
            public final void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar) {
            }
        }
    }
}

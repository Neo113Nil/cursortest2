package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;

/* compiled from: VkWorkoutManager.kt */
/* loaded from: classes11.dex */
public interface f2w0 {

    /* compiled from: VkWorkoutManager.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public static void a(f2w0 f2w0Var, Context context, ton0 ton0Var, izs izsVar, yzs yzsVar, SelectedDataSource selectedDataSource, int i) {
            SelectedDataSource selectedDataSource2;
            yzs yzsVar2;
            izs izsVar2 = izsVar;
            bvo0 bvo0Var = new bvo0();
            if ((i & 8) != 0) {
                izsVar2 = null;
            }
            if ((i & 16) != 0) {
                selectedDataSource2 = selectedDataSource;
                yzsVar2 = null;
            } else {
                selectedDataSource2 = selectedDataSource;
                yzsVar2 = yzsVar;
            }
            f2w0Var.d(context, ton0Var, bvo0Var, izsVar2, yzsVar2, selectedDataSource2);
        }
    }

    void a();

    void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar);

    void c(String str);

    void d(Context context, ton0 ton0Var, bvo0 bvo0Var, izs<? super Throwable, s3q0> izsVar, yzs<? super Integer, ? super String, ? super Long, s3q0> yzsVar, SelectedDataSource selectedDataSource);

    /* compiled from: VkWorkoutManager.kt */
    public static final class a {
        private static final f2w0 STUB = new C2845a();

        public static f2w0 a() {
            return STUB;
        }

        /* compiled from: VkWorkoutManager.kt */
        /* renamed from: xsna.f2w0$a$a, reason: collision with other inner class name */
        public static final class C2845a implements f2w0 {
            @Override // xsna.f2w0
            public final void a() {
            }

            @Override // xsna.f2w0
            public final void c(String str) {
            }

            @Override // xsna.f2w0
            public final void b(Context context, izs<? super SelectedDataSource, s3q0> izsVar) {
            }

            @Override // xsna.f2w0
            public final void d(Context context, ton0 ton0Var, bvo0 bvo0Var, izs<? super Throwable, s3q0> izsVar, yzs<? super Integer, ? super String, ? super Long, s3q0> yzsVar, SelectedDataSource selectedDataSource) {
            }
        }
    }
}

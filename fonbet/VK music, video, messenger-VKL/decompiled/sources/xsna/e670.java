package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LaunchContext;
import com.vk.profile.core.npo.OrganizationModalVariant;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NonProfitOrganizationBottomSheet.kt */
/* loaded from: classes5.dex */
public final class e670 extends jmu0 {
    public static final String j1 = i5s.a(new StringBuilder("https://"), a0a.d, "/faq24558");
    public final ComposeView h1;
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new re40(this, 4));

    /* compiled from: NonProfitOrganizationBottomSheet.kt */
    public static final class a extends kmu0 {
        public final OrganizationModalVariant h;

        public a(Context context, OrganizationModalVariant organizationModalVariant) {
            super(context, tzp0.a(null, 3));
            this.h = organizationModalVariant;
            I(true);
            int a = iah0.a(8);
            n0(a);
            p0(a);
            o0(a);
            m0(a);
            x(0);
            u(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            e670 e670Var = new e670(S0());
            Bundle bundle = new Bundle();
            bundle.putString("organization_modal_variant", this.h.name());
            e670Var.setArguments(bundle);
            return e670Var;
        }
    }

    /* compiled from: NonProfitOrganizationBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            e670.eo((e670) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: NonProfitOrganizationBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((e670) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public e670(ComposeView composeView) {
        this.h1 = composeView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final void eo(e670 e670Var) {
        maz mazVar = (maz) e670Var.i1.getValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Context context2 = context;
        maz.c(mazVar, context2, j1, LaunchContext.A, null, null, 24);
        e670Var.dismiss();
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-456521113);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-456521113, i, -1, "com.vk.profile.core.npo.NonProfitOrganizationBottomSheet.ThemedContent (NonProfitOrganizationBottomSheet.kt:38)");
        }
        rrv0.a(null, null, kai.c(1982986431, new com.vk.movika.tools.controls.seekbar.h(this, 10), M), M, 24576, 15);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.i(this, i, 11);
        }
    }
}

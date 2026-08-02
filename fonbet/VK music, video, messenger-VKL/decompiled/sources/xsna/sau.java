package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LaunchContext;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GovernmentOrganizationBottomSheet.kt */
/* loaded from: classes5.dex */
public final class sau extends jmu0 {
    public final ComposeView h1;

    /* compiled from: GovernmentOrganizationBottomSheet.kt */
    public static final class a extends kmu0 {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new sau(S0());
        }
    }

    /* compiled from: GovernmentOrganizationBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            sau.eo((sau) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: GovernmentOrganizationBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((sau) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    static {
        int i = ComposeView.n;
    }

    public sau(ComposeView composeView) {
        this.h1 = composeView;
    }

    public static final void eo(sau sauVar) {
        sauVar.getClass();
        maz e = xwk.d().e();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        maz.c(e, context, "https://vk.cc/ccVBnd", LaunchContext.A, null, null, 24);
        sauVar.dismiss();
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2121534198);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2121534198, i2, -1, "com.vk.profile.core.gov.GovernmentOrganizationBottomSheet.ThemedContent (GovernmentOrganizationBottomSheet.kt:24)");
            }
            rrv0.a(null, null, kai.c(1488039266, new dv4(this, 8), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oa5(this, i, 5);
        }
    }
}

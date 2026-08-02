package xsna;

import android.content.Context;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ify;
import xsna.l430;

/* compiled from: ModerationRouterImpl.kt */
/* loaded from: classes18.dex */
public final class n530 implements k530 {
    public static void e(Context context, gzs gzsVar) {
        int i = ify.a;
        if (!ify.e(ify.c)) {
            gzsVar.invoke();
        } else {
            ify.a(new a(gzsVar));
            mhy.b(context);
        }
    }

    @Override // xsna.k530
    public final void a(Context context, boolean z) {
        e(context, new cf6(context, z, 1));
    }

    @Override // xsna.k530
    public final void c(final Context context, c530 c530Var, final boolean z, final gzs<s3q0> gzsVar) {
        final d530 d530Var = c530Var.e;
        final UserId userId = d530Var.a;
        final Long l = d530Var.b;
        if (userId == null || l == null) {
            return;
        }
        e(context, new gzs(z, userId, l, gzsVar, context) { // from class: xsna.l530
            public final /* synthetic */ boolean c;
            public final /* synthetic */ UserId d;
            public final /* synthetic */ Long e;
            public final /* synthetic */ FunctionReferenceImpl f;
            public final /* synthetic */ Context g;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f = (FunctionReferenceImpl) gzsVar;
                this.g = context;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            @Override // xsna.gzs
            public final Object invoke() {
                ImageSize Cb;
                d530 d530Var2 = d530.this;
                h530 h530Var = d530Var2.c;
                String str = null;
                String str2 = h530Var != null ? h530Var.a : null;
                String str3 = h530Var != null ? h530Var.b : null;
                String str4 = h530Var != null ? h530Var.c : null;
                Image image = d530Var2.d;
                if (image != null && (Cb = image.Cb(iah0.a(72), true, false)) != null) {
                    str = Cb.d.d;
                }
                new b.a(this.c, this.d, this.e.longValue(), str2, str3, str4, str, this.f, this.g).I0("ModerationBlockedItemDialog");
                return s3q0.a;
            }
        });
    }

    @Override // xsna.k530
    public final void d(final Context context, final boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2) {
        e(context, new gzs() { // from class: xsna.m530
            @Override // xsna.gzs
            public final Object invoke() {
                l430.a aVar = new l430.a(context, z);
                aVar.f = gzsVar;
                aVar.g = gzsVar2;
                aVar.I0("ModerationConfirmAdultDialog");
                return s3q0.a;
            }
        });
    }

    /* compiled from: ModerationRouterImpl.kt */
    public static final class a implements ify.a {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
            this.b.invoke();
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }
}

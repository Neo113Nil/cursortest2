package xsna;

import android.content.Context;
import android.view.View;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.x530;

/* compiled from: ModerationRejectionBinder.kt */
/* loaded from: classes18.dex */
public final class j530 implements d430 {
    public final k530 a;
    public final boolean b;
    public final Context c;

    public j530(k530 k530Var, boolean z, Context context) {
        this.a = k530Var;
        this.b = z;
        this.c = context;
    }

    @Override // xsna.d430
    public final ModerationRestriction a(c530 c530Var) {
        return (c530Var.c && c530Var.b) ? ModerationRestriction.HARDBLOCK : ModerationRestriction.NONE;
    }

    @Override // xsna.d430
    public final boolean b(c530 c530Var, ModerationRestriction moderationRestriction, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        if (moderationRestriction != ModerationRestriction.HARDBLOCK) {
            return false;
        }
        this.a.c(this.c, c530Var, this.b, gzsVar2);
        return true;
    }

    @Override // xsna.d430
    public final boolean c(c530 c530Var, ModerationRestriction moderationRestriction, x530.a aVar) {
        return b(c530Var, moderationRestriction, aVar, aVar);
    }

    @Override // xsna.d430
    public final boolean d(final c530 c530Var, f530 f530Var, izs<? super ModerationRestriction, s3q0> izsVar, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2) {
        final ModerationRestriction a = a(c530Var);
        if (a == ModerationRestriction.NONE) {
            return false;
        }
        Integer num = c530Var.d;
        f530Var.o1(num);
        f530Var.k1(num).a.setOnClickListener(new View.OnClickListener(c530Var, a, gzsVar, gzsVar2) { // from class: xsna.i530
            public final /* synthetic */ c530 c;
            public final /* synthetic */ ModerationRestriction d;
            public final /* synthetic */ FunctionReferenceImpl e;
            public final /* synthetic */ FunctionReferenceImpl f;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.e = (FunctionReferenceImpl) gzsVar;
                this.f = (FunctionReferenceImpl) gzsVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j530.this.b(this.c, this.d, this.e, this.f);
            }
        });
        return true;
    }
}

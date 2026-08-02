package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import xsna.ee10;

/* compiled from: MarketShopConditionsRouterImpl.kt */
/* loaded from: classes18.dex */
public final class ne10 implements me10 {
    public dw20 a;
    public final a b = new a();

    /* compiled from: MarketShopConditionsRouterImpl.kt */
    public final class a implements fcn {
        public a() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = ne10.this.a;
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    @Override // xsna.me10
    public final void a(Context context, UserId userId, Long l, gzs<s3q0> gzsVar) {
        ee10.a aVar = new ee10.a(context, userId, l);
        aVar.a0(new jtb(this, context, gzsVar, 3));
        aVar.d0(new vf1(11, this, context));
        this.a = aVar.I0(null);
    }
}

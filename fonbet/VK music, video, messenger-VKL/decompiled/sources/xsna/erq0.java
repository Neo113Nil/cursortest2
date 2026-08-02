package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileLegoPrivateContentViewHolder.kt */
/* loaded from: classes5.dex */
public final class erq0 extends dri<UserProfileAdapterItem.j.d> {
    public static final a p = new a();
    public final wh50 n;
    public final wh50 o;

    /* compiled from: UserProfileLegoPrivateContentViewHolder.kt */
    public static final class a extends eri<erq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new erq0(composeView);
        }
    }

    public erq0(ComposeView composeView) {
        super(composeView);
        this.n = androidx.compose.runtime.k.b("");
        this.o = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ((zak0) this.n).setValue("");
        ((zak0) this.o).setValue(false);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> te1Var;
        androidx.compose.runtime.a M = aVar.M(852032749);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(852032749, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoPrivateContentViewHolder.Content (UserProfileLegoPrivateContentViewHolder.kt:30)");
            }
            String str = (String) ((zak0) this.n).getValue();
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    te1Var = new no3(this, i, 12);
                    s.d = te1Var;
                }
                return;
            }
            rrv0.a(null, null, kai.c(-1016131179, new f6g((byte) 0, 9), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            te1Var = new te1(this, i, 12);
            s.d = te1Var;
        }
    }
}

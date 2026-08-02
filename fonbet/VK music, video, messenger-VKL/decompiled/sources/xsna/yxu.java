package xsna;

import android.view.MotionEvent;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.sharing.api.dto.Target;
import com.vk.stickers.autosuggest.QuickStickerSuggestState;
import com.vk.writebar.WriteBar;
import java.net.URI;

/* compiled from: HeaderPostingViewRedesign.kt */
/* loaded from: classes4.dex */
public final class yxu implements f180, h1y0 {
    public final Object b;

    public /* synthetic */ yxu(Object obj) {
        this.b = obj;
    }

    @Override // xsna.h1y0
    public void H0() {
        ChatFragment.k kVar = ((kz30) this.b).K;
        if (kVar == null) {
            kVar = null;
        }
        ets0 ets0Var = ChatFragment.this.d1;
        if (ets0Var != null) {
            ets0Var.c();
        }
    }

    @Override // xsna.h1y0
    public void U1() {
        ChatFragment.k kVar = ((kz30) this.b).K;
        if (kVar == null) {
            kVar = null;
        }
        ets0 ets0Var = ChatFragment.this.d1;
        if (ets0Var != null) {
            ets0Var.e();
        }
    }

    @Override // xsna.h1y0
    public boolean a(MotionEvent motionEvent) {
        vu4 vu4Var = ((kz30) this.b).J;
        if (vu4Var == null) {
            vu4Var = null;
        }
        return vu4Var.c1(motionEvent);
    }

    @Override // xsna.f180
    public void b(Target target) {
        zxu zxuVar = (zxu) this.b;
        dw20 dw20Var = zxuVar.h;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        sxu sxuVar = zxuVar.j;
        if (sxuVar != null) {
            sxuVar.b(target);
        }
    }

    @Override // xsna.h1y0
    public void b0() {
        ChatFragment.k kVar = ((kz30) this.b).K;
        if (kVar == null) {
            kVar = null;
        }
        ets0 ets0Var = ChatFragment.this.d1;
        if (ets0Var != null) {
            ets0Var.a();
        }
    }

    @Override // xsna.h1y0
    public void c(boolean z) {
        xgy xgyVar;
        xgy xgyVar2;
        kz30 kz30Var = (kz30) this.b;
        int i = ify.a;
        int i2 = 1;
        if (ify.e(ify.c) || (((xgyVar = kz30Var.L) != null && xgyVar.e()) || ((xgyVar2 = kz30Var.N) != null && xgyVar2.e()))) {
            mhy.b(kz30Var.i);
            kz30.K(kz30Var.L);
            kz30.M(kz30Var.M);
            kz30.K(kz30Var.N);
            WriteBar writeBar = kz30Var.t;
            if (writeBar == null) {
                writeBar = null;
            }
            bwt0.j(writeBar, new h5b(kz30Var, z, i2));
        } else {
            ChatFragment.k kVar = kz30Var.K;
            if (kVar == null) {
                kVar = null;
            }
            kVar.h(z);
        }
        WriteBar writeBar2 = kz30Var.t;
        (writeBar2 != null ? writeBar2 : null).setQuickStickerSuggestState(QuickStickerSuggestState.DISABLED);
    }

    @Override // xsna.h1y0
    public void d() {
        vu4 vu4Var = ((kz30) this.b).J;
        if (vu4Var == null) {
            vu4Var = null;
        }
        vu4Var.b1(true);
    }

    public void e() {
        ((SignUpDataHolder) this.b).y = null;
    }

    public void f(String str) {
        ((SignUpDataHolder) this.b).y = str;
    }

    public yxu(URI uri, String str) {
        this.b = uri;
    }
}

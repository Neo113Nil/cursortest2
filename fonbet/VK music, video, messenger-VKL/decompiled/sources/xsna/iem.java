package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.b26;
import xsna.chu;
import xsna.e3m;

/* compiled from: DialogGroupCallBannerComponent.kt */
/* loaded from: classes2.dex */
public final class iem extends j8i {
    public final a1w i;
    public final kkm j;
    public final b26.e k;
    public kem l;
    public io.reactivex.rxjava3.disposables.c m;
    public final fhu n;
    public chu o = chu.a.a;

    /* compiled from: DialogGroupCallBannerComponent.kt */
    public final class a {
        public a() {
        }
    }

    public iem(a1w a1wVar, kkm kkmVar, b26.e eVar) {
        this.i = a1wVar;
        this.j = kkmVar;
        this.k = eVar;
        this.n = new fhu(a1wVar);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        kem kemVar = new kem(layoutInflater, viewGroup, this.j);
        this.l = kemVar;
        kemVar.e = new a();
        X0(this.o);
        kem kemVar2 = this.l;
        View view = kemVar2 != null ? kemVar2.a : null;
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.j8i
    public final void M0() {
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        this.m = null;
    }

    @Override // xsna.j8i
    public final void N0() {
        kem kemVar = this.l;
        if (kemVar != null) {
            kemVar.e = null;
        }
        this.l = null;
    }

    public final void X0(chu chuVar) {
        this.o = chuVar;
        boolean z = chuVar instanceof chu.b;
        b26.e eVar = this.k;
        if (!z) {
            if (!(chuVar instanceof chu.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kem kemVar = this.l;
            if (kemVar != null) {
                f4m.j(kemVar.b);
                kemVar.c.setVisibility(0);
            }
            b26.this.g(b26.a.GROUP_CALL, true, 0L);
            return;
        }
        chu.b bVar = (chu.b) chuVar;
        if (bVar.b.isEmpty()) {
            kem kemVar2 = this.l;
            if (kemVar2 != null) {
                f4m.j(kemVar2.b);
                kemVar2.c.setVisibility(0);
            }
        } else {
            kem kemVar3 = this.l;
            if (kemVar3 != null) {
                Context context = kemVar3.a.getContext();
                e3m.a aVar = e3m.a;
                Drawable a2 = m33.a(R.drawable.user_placeholder_icon, context);
                f4m.j(kemVar3.c);
                StackAvatarView stackAvatarView = kemVar3.b;
                stackAvatarView.setVisibility(0);
                stackAvatarView.d(new ulp0(new i5g(bVar.b), new h2w(28)), 3, a2);
            }
        }
        b26.n(b26.this, b26.a.GROUP_CALL, true);
    }
}

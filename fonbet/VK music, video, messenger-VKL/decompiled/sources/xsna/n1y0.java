package xsna;

import com.vk.api.generated.wall.dto.WallCreateCommentEntryPointDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;
import com.vk.toggle.features.ComFeatures;
import java.util.List;
import xsna.bja0;
import xsna.d9x0;

/* compiled from: WriteBarOverlayPresenter.kt */
/* loaded from: classes4.dex */
public final class n1y0 implements gm6, b3g0, f420 {
    public final WriteBarOverlayFragment b;
    public final o2i c;
    public UserId d = UserId.d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public String i;
    public String j;

    public n1y0(WriteBarOverlayFragment writeBarOverlayFragment, o2i o2iVar) {
        this.b = writeBarOverlayFragment;
        this.c = o2iVar;
    }

    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = wmi0.a.e("mentionProfiles").U(new bk1(new nk(27), 22));
        com.vk.newsfeed.impl.util.b bVar = new com.vk.newsfeed.impl.util.b(b420Var);
        int i = kwg0.a;
        U.subscribe(bVar, new iwg0());
        String str = b420Var.c;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '(' && charAt != ')') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        UserId userId = b420Var.a;
        u3g0 u3g0Var = this.b.T;
        if (u3g0Var != null) {
            u3g0Var.Nh(userId, sb2);
        }
    }

    @Override // xsna.b3g0
    public final String Y0() {
        int i = this.f;
        StringBuilder e = fw3.e(i != 1 ? i != 2 ? i != 6 ? "wall" : "clip" : "video" : "photo");
        e.append(this.d);
        e.append('_');
        e.append(this.e);
        return e.toString();
    }

    @Override // xsna.b3g0, xsna.ud60
    public final boolean Z() {
        return true;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.b3g0
    public final boolean f0() {
        return (this.f == 0 && hd60.a().a().e(m6r0.M) && this.g) ? false : true;
    }

    @Override // xsna.b3g0
    public final FragmentImpl g() {
        return this.b;
    }

    @Override // xsna.b3g0
    public final boolean g0() {
        UserId userId = this.d;
        int i = this.f;
        ComFeatures comFeatures = ComFeatures.COM_DEFAULT_AUTHOR;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures) && fkq0.b(userId)) {
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.b().g0(userId) && e43.l(0, 2, 6).contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.b3g0
    public final boolean i0() {
        return this.f == 0;
    }

    @Override // xsna.b3g0, xsna.tdg
    public final UserId p() {
        return this.d;
    }

    @Override // xsna.b3g0
    public final void r1(bja0.a aVar) {
        WriteBarOverlayFragment writeBarOverlayFragment = this.b;
        zhv0 zhv0Var = new zhv0(1, aVar, writeBarOverlayFragment);
        if (!ify.e(ify.c)) {
            zhv0Var.invoke();
            return;
        }
        ify.g(writeBarOverlayFragment);
        writeBarOverlayFragment.d0();
        writeBarOverlayFragment.ho(300L, zhv0Var);
    }

    @Override // xsna.b3g0
    public final void u0(String str, int i, List<? extends Attachment> list, UserId userId, boolean z, boolean z2) {
        UserId userId2 = this.d;
        int i2 = this.e;
        int i3 = this.f;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new d9x0(new d9x0.b(userId2, i2, i3), new d9x0.a(str, list), i, this.i, userId, false, false, this.j, this.h, 0L, i3 == 0 ? WallCreateCommentEntryPointDto.INLINE_COMMENT : null), null, null, 3);
        WriteBarOverlayFragment writeBarOverlayFragment = this.b;
        hg1.m(y0, writeBarOverlayFragment.getActivity(), 0L, false, 62);
        writeBarOverlayFragment.fo(y0.subscribe(new dbu0(new l99(z, this), 4), new o060(new m1y0(this, 0), 26)));
    }

    @Override // xsna.f420
    public final void S1() {
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.f420
    public final void e0() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }

    @Override // xsna.b3g0
    public final void s2() {
    }

    @Override // xsna.b3g0
    public final void b(String str) {
    }

    @Override // xsna.b3g0
    public final void h0(String str) {
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
    }

    @Override // xsna.f420
    public final void v5(Throwable th) {
    }

    @Override // xsna.f420
    public final void x4(boolean z) {
    }
}

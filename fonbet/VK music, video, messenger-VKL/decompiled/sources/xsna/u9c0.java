package xsna;

import androidx.preference.Preference;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.serialize.Serializer;
import com.vk.vmoji.character.product.VmojiProductsFragment;
import xsna.l7h0;
import xsna.o9w0;
import xsna.p7w0;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9c0 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, Preference.c, t8z0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u9c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
        fjz0 fjz0Var = (fjz0) this.c;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 2) {
            fjz0Var.d();
        } else {
            if (intValue != 3) {
                return;
            }
            fjz0Var.c();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.e) ((e810) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((edd) this.c).invoke(obj);
            case 2:
                return (mwc0) ((j5b0) this.c).invoke(obj);
            case 3:
                return (Serializer.StreamParcelable) ((n9w) this.c).invoke(obj);
            case 4:
                return (l7h0.b) ((e810) this.c).invoke(obj);
            case 5:
                return Boolean.valueOf(((rah0) this.c).a());
            case 6:
                return (io.reactivex.rxjava3.core.t) ((ape0) this.c).invoke(obj);
            case 7:
                return (j5n0) ((j5b0) this.c).invoke(obj);
            case 8:
                return (p7w0.e.b) ((egt0) this.c).invoke(obj);
            case 9:
            default:
                return (z0x0.c.b) ((mrw0) this.c).invoke(obj);
            case 10:
                return (sww0) ((btl0) this.c).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        boolean c;
        c = ru.mail.libverify.k.a.c((ru.mail.libverify.k.a) this.c, preference);
        return c;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((VmojiProductsFragment.b) this.c).invoke(o9w0.f.b);
    }
}

package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vkontakte.android.R;
import xsna.ozs0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class of1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ of1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                gg1 gg1Var = (gg1) obj2;
                gg1Var.n.i(((com.vk.photos.root.albumdetails.presentation.j) obj).m);
                f4z f4zVar = gg1Var.p;
                f4zVar.b(i.e.a);
                tlo0.Companion.getClass();
                gg1Var.b0(null, null, new tlo0.f(R.string.album_details_delete_album_success));
                f4zVar.b(i.a.a);
                break;
            case 1:
                pdl0 pdl0Var = (pdl0) obj2;
                UserId userId = (UserId) obj;
                pdl0Var.n.remove(userId);
                pdl0Var.m.remove(userId);
                break;
            default:
                d260.b.a().a().remove((ozs0.e) obj2);
                c63 c63Var = c63.a;
                c63.c((ozs0.d) obj);
                break;
        }
    }
}

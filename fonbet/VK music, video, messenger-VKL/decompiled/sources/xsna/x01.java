package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.avatarpicker.AvatarPickerActivity;
import com.vk.clips.design.view.author.a;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.socialgraph.init.PickAvatarFragment;
import one.video.controls.view.VideoEndView;
import one.video.controls.views.VideoShortActions;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.vk.superapp.api.dto.auth.UserItem] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                b11 b11Var = (b11) obj;
                Activity L = blk.L(b11Var.a);
                if (L != null) {
                    b11Var.c.a(L, new kd(b11Var, 1));
                    break;
                }
                break;
            case 1:
                ((a.d.C0561a) ((a.d) obj)).c.invoke();
                break;
            case 2:
                qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
                ((ImContactsListFragment) obj).finish();
                break;
            case 3:
                l4w l4wVar = (l4w) obj;
                j4w j4wVar = l4wVar.K;
                if (j4wVar == null) {
                    j4wVar = null;
                }
                if (!j4wVar.s()) {
                    fh5 fh5Var = l4wVar.A;
                    (fh5Var != null ? fh5Var : null).n0();
                    break;
                }
                break;
            case 4:
                PickAvatarFragment pickAvatarFragment = (PickAvatarFragment) obj;
                int i2 = PickAvatarFragment.P;
                int i3 = AvatarPickerActivity.g;
                pickAvatarFragment.startActivityForResult(AvatarPickerActivity.a.a(pickAvatarFragment.requireContext(), "avatar_social"), 13);
                break;
            case 5:
                ((cqc0) obj).X0(PostingVisibilityMode.UNAVAILABLE_FRIENDS);
                break;
            case 6:
                b7d0.Y6((b7d0) obj, view);
                break;
            case 7:
                bth0 bth0Var = (bth0) obj;
                if (!bth0Var.v.f) {
                    bth0Var.P4(bth0Var.H, bth0Var.u.d.a, new nt10(bth0Var, 20));
                    break;
                }
                break;
            case 8:
                k0r0 k0r0Var = (k0r0) obj;
                exi0 exi0Var = k0r0Var.l;
                ?? r0 = k0r0Var.q;
                exi0Var.invoke(r0 != 0 ? r0 : null);
                break;
            case 9:
                gzs<s3q0> gzsVar = ((VideoEndView) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                VideoShortActions.a aVar = ((VideoShortActions) obj).t;
                if (aVar != null) {
                    aVar.p();
                    break;
                }
                break;
        }
    }
}

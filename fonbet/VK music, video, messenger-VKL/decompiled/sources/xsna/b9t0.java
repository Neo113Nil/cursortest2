package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.picker.PickingImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoProfileRouterImpl.kt */
/* loaded from: classes6.dex */
public final class b9t0 implements a9t0 {
    public final s8t0 a;
    public final bja0 b;

    public b9t0(s8t0 s8t0Var, bja0 bja0Var) {
        this.a = s8t0Var;
        this.b = bja0Var;
    }

    @Override // xsna.a9t0
    public final void a(FragmentActivity fragmentActivity, UserId userId) {
        fxc0.B().q(fragmentActivity, userId, fkq0.b(userId));
    }

    @Override // xsna.a9t0
    public final void b(FragmentActivity fragmentActivity, Owner owner) {
        xwk.e().c(fragmentActivity, "https://".concat(a0a.d) + '/' + (fkq0.d(owner.b) ? "id" : "club") + fkq0.a(owner.b));
    }

    @Override // xsna.a9t0
    public final void c(FragmentActivity fragmentActivity) {
        this.a.getClass();
    }

    @Override // xsna.a9t0
    public final void d(FragmentActivity fragmentActivity) {
        o25.a().getClass();
    }

    @Override // xsna.a9t0
    public final void e(FragmentActivity fragmentActivity) {
        o25.a().getClass();
    }

    @Override // xsna.a9t0
    public final void f(FragmentActivity fragmentActivity, ArrayList arrayList, UserId userId) {
        PickingImpl.a a = this.b.a(fragmentActivity);
        GroupPickerInfo groupPickerInfo = a.b;
        groupPickerInfo.p = true;
        groupPickerInfo.i = true;
        groupPickerInfo.j = R.string.vk_video_profile_owner_change_title;
        groupPickerInfo.g = userId;
        groupPickerInfo.k = 3;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Target(new UserProfile((Owner) it.next())));
        }
        groupPickerInfo.o = p4g.q(arrayList2);
        fragmentActivity.startActivityForResult(a.b(), 1001);
    }

    @Override // xsna.a9t0
    public final void g(FragmentActivity fragmentActivity) {
        this.a.a().k(fragmentActivity);
    }
}

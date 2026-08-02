package xsna;

import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.yvu;

/* compiled from: ProfileActionFactory.kt */
/* loaded from: classes5.dex */
public final class std0 implements ProfileAction.a {
    @Override // com.vk.profile.user.api.domain.actions.ProfileAction.a
    public final List<ProfileAction> a(ExtendedUserProfile extendedUserProfile, boolean z) {
        ArrayList arrayList;
        List<ytd0> list;
        xtd0 xtd0Var = extendedUserProfile.N1;
        if (xtd0Var == null || (list = xtd0Var.a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                yvu a = ttd0.a(extendedUserProfile, (ytd0) it.next(), z);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction.a
    public final ArrayList b(ExtendedUserProfile extendedUserProfile, boolean z) {
        Iterable iterable = extendedUserProfile.M1;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g5g.y(((xtd0) it.next()).a, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            yvu a = ttd0.a(extendedUserProfile, (ytd0) it2.next(), z);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        return arrayList2;
    }

    @Override // com.vk.profile.user.api.domain.actions.ProfileAction.a
    public final List<ProfileAction> c(ExtendedUserProfile extendedUserProfile, int i) {
        yvu.j jVar;
        Object obj;
        Iterable iterable = extendedUserProfile.M1;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g5g.y(((xtd0) it.next()).a, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            jVar = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (epx.f(((ytd0) obj).b, ProfileAction.Type.PROFILE_QUESTION.h())) {
                break;
            }
        }
        ytd0 ytd0Var = (ytd0) obj;
        if (ytd0Var != null) {
            String str = ytd0Var.a;
            Integer num = ytd0Var.g;
            jVar = new yvu.j(str, false, num != null ? num.intValue() : 0, null, new ztu(R.string.user_profile_menu_questions, R.drawable.vk_icon_question_outline_28));
        }
        return rl3.I(new yvu[]{jVar, new yvu.f(i)});
    }
}

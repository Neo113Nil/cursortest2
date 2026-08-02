package xsna;

import android.content.Context;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: PrivacyUtilsImpl.kt */
/* loaded from: classes17.dex */
public final class vfd0 implements ufd0 {
    public final jed0 a = new jed0();
    public final bpn0 b = new bpn0(new yo80(3));

    public static n0r0 m(PrivacySetting privacySetting, PrivacyRules.UserListPrivacyRule userListPrivacyRule) {
        n0r0 n0r0Var = new n0r0(0);
        Iterator it = g5g.E(privacySetting.e, userListPrivacyRule.getClass()).iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((PrivacyRules.UserListPrivacyRule) it.next()).Cb().iterator();
            int i = 0;
            int i2 = 0;
            while (it2.hasNext()) {
                if (((UserId) it2.next()).b < 2000000000) {
                    i++;
                } else {
                    i2++;
                }
            }
            n0r0Var.a += i;
            n0r0Var.b += i2;
        }
        return n0r0Var;
    }

    public static String n(int i, int i2, Context context) {
        return (i == 0 || i2 == 0) ? i == 0 ? enj.f(R.plurals.privacy_live_friends_lists_can_not_see_count, i2, context) : enj.f(R.plurals.privacy_live_friends_can_not_see_count, i, context) : String.format(context.getString(R.string.live_clip_users_and_groups), Arrays.copyOf(new Object[]{enj.f(R.plurals.privacy_live_friends_can_not_see_count, i, context), enj.f(R.plurals.privacy_live_friends_lists_can_not_see_count, i2, context)}, 2));
    }

    public static String o(int i, int i2, Context context) {
        return (i == 0 || i2 == 0) ? i == 0 ? enj.f(R.plurals.privacy_live_friends_lists_can_see_count, i2, context) : enj.f(R.plurals.privacy_live_friends_can_see_count, i, context) : String.format(context.getString(R.string.live_clip_users_and_groups), Arrays.copyOf(new Object[]{enj.f(R.plurals.privacy_live_friends_can_see_count, i, context), enj.f(R.plurals.privacy_live_friends_lists_can_see_count, i2, context)}, 2));
    }

    @Override // xsna.ufd0
    public final ArrayList a(ArrayList arrayList, Set set) {
        Object obj;
        ArrayList<PrivacySetting> arrayList2;
        ArrayList<PrivacySetting> arrayList3;
        ArrayList arrayList4 = null;
        if (set != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ked0 ked0Var = (ked0) obj;
                if (epx.f(ked0Var.a, "lives") && (arrayList3 = ked0Var.b) != null && arrayList3.size() > 0) {
                    break;
                }
            }
            ked0 ked0Var2 = (ked0) obj;
            if (ked0Var2 != null && (arrayList2 = ked0Var2.b) != null) {
                arrayList4 = new ArrayList();
                Iterator<PrivacySetting> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    PrivacySetting next = it2.next();
                    if (set.contains(next.b)) {
                        arrayList4.add(next);
                    }
                }
            }
        }
        return arrayList4;
    }

    @Override // xsna.ufd0
    public final LinkedHashSet b() {
        return izi0.e("lives", "lives_replies");
    }

    @Override // xsna.ufd0
    public final String c(Context context) {
        return context.getString(R.string.privcay_live_group_who_will_see_title);
    }

    @Override // xsna.ufd0
    public final String d(Context context) {
        return context.getString(R.string.privacy_live_camera_only_me_title);
    }

    @Override // xsna.ufd0
    public final String e(Context context, klu kluVar) {
        if (kluVar instanceof mt1) {
            return context.getString(R.string.privcay_live_group_who_will_see_all_option_camera_title);
        }
        if (kluVar instanceof z120) {
            return context.getString(R.string.privcay_live_group_who_will_see_members_option_camera_title);
        }
        if (kluVar instanceof q5p) {
            return context.getString(R.string.privcay_live_group_who_will_see_admins_option_camera_title);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.ufd0
    public final String f(Context context, klu kluVar) {
        if (kluVar instanceof mt1) {
            return context.getString(R.string.privcay_live_group_who_will_see_all_option);
        }
        if (kluVar instanceof z120) {
            return context.getString(R.string.privcay_live_group_who_will_see_members_option);
        }
        if (kluVar instanceof q5p) {
            return context.getString(R.string.privcay_live_group_who_will_see_admins_option);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.ufd0
    public final io.reactivex.rxjava3.core.x<String> g(Context context, PrivacySetting privacySetting) {
        String str;
        n0r0 m = m(privacySetting, new PrivacyRules.Include());
        n0r0 m2 = m(privacySetting, new PrivacyRules.Exclude());
        int i = m.a;
        boolean z = true;
        boolean z2 = i > 0 || m.b > 0;
        if (m2.a <= 0 && m2.b <= 0) {
            z = false;
        }
        if (z2 || z) {
            String o = z2 ? o(i, m.b, context) : context.getString(R.string.live_clip_users_and_groups_all);
            if (z) {
                StringBuilder b = ho8.b(o, ", ");
                b.append(context.getString(R.string.live_clip_users_and_groups_exclude));
                b.append(' ');
                StringBuilder e = fw3.e(b.toString());
                e.append(n(m2.a, m2.b, context));
                str = e.toString();
            } else {
                str = o;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return io.reactivex.rxjava3.core.x.k(str);
        }
        jed0 jed0Var = this.a;
        jed0Var.getClass();
        return jed0Var.b(privacySetting.e);
    }

    @Override // xsna.ufd0
    public final Pair<n0r0, n0r0> h(PrivacySetting privacySetting) {
        return new Pair<>(m(privacySetting, new PrivacyRules.Include()), m(privacySetting, new PrivacyRules.Exclude()));
    }

    @Override // xsna.ufd0
    public final String i(Context context) {
        return context.getString(R.string.privcay_live_group_post_on_wall_title);
    }

    @Override // xsna.ufd0
    public final esw j() {
        return (esw) this.b.getValue();
    }

    @Override // xsna.ufd0
    public final String k(Context context, Pair<n0r0, n0r0> pair) {
        if (pair.i().a() && pair.j().a()) {
            return "";
        }
        n0r0 i = pair.i();
        n0r0 j = pair.j();
        if (i.a()) {
            return "" + context.getString(R.string.privacy_live_camera_all_title) + ", " + context.getString(R.string.privacy_live_camera_except_title) + " \n " + n(j.a, j.b, context);
        }
        if (j.a()) {
            return "" + enj.f(R.plurals.privacy_live_camera_will_see_plurals, i.a + i.b, context) + ' ' + context.getString(R.string.privacy_live_camera_will_see_only) + " \n" + o(i.a, i.b, context);
        }
        return "" + enj.f(R.plurals.privacy_live_camera_will_see_plurals, i.a + i.b, context) + " \n" + o(i.a, i.b, context) + ", " + context.getString(R.string.privacy_live_camera_except_title) + ' ' + n(j.a, j.b, context);
    }

    @Override // xsna.ufd0
    public final goz l() {
        return new goz();
    }
}

package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: CommunityStrikesControllerImpl.kt */
/* loaded from: classes17.dex */
public final class r2i implements o2i {
    public static final Map<Integer, Integer> c = on00.f(new Pair(0, Integer.valueOf(R.string.community_strike_error_default_header)));
    public final ExtendedProfilesRepository a;
    public final bpn0 b;

    public r2i(bpn0 bpn0Var, ExtendedProfilesRepository extendedProfilesRepository) {
        this.a = extendedProfilesRepository;
        this.b = bpn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static VKApiExecutionException e(Throwable th) {
        VKApiExecutionException vKApiExecutionException;
        VKApiExecutionException vKApiExecutionException2;
        Object obj;
        Throwable cause = th.getCause();
        if (th instanceof VKApiExecutionException) {
            vKApiExecutionException = (VKApiExecutionException) th;
            List<VKApiExecutionException> v = vKApiExecutionException.v();
            if (v != null) {
                Iterator it = v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((VKApiExecutionException) obj).s() == 13000) {
                        break;
                    }
                }
                VKApiExecutionException vKApiExecutionException3 = (VKApiExecutionException) obj;
                if (vKApiExecutionException3 != null) {
                    vKApiExecutionException = vKApiExecutionException3;
                }
            }
        } else if (cause instanceof VKApiExecutionException) {
            vKApiExecutionException = (VKApiExecutionException) cause;
            List<VKApiExecutionException> v2 = vKApiExecutionException.v();
            if (v2 != null) {
                Iterator it2 = v2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        vKApiExecutionException2 = 0;
                        break;
                    }
                    vKApiExecutionException2 = it2.next();
                    if (((VKApiExecutionException) vKApiExecutionException2).s() == 13000) {
                        break;
                    }
                }
                VKApiExecutionException vKApiExecutionException4 = vKApiExecutionException2;
                if (vKApiExecutionException4 != null) {
                    vKApiExecutionException = vKApiExecutionException4;
                }
            }
        } else {
            vKApiExecutionException = null;
        }
        if (vKApiExecutionException == null || vKApiExecutionException.s() != 13000) {
            return null;
        }
        return vKApiExecutionException;
    }

    @Override // xsna.o2i
    public final boolean a(Throwable th) {
        return e(th) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.o2i
    public final boolean b(Context context, UserId userId, ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType strikeRestrictionType) {
        ExtendedUserProfile L0 = this.a.L0(userId);
        ExtendedCommunityProfile.StrikesRestriction strikesRestriction = null;
        ExtendedCommunityProfile extendedCommunityProfile = L0 instanceof ExtendedCommunityProfile ? (ExtendedCommunityProfile) L0 : null;
        if (extendedCommunityProfile == null) {
            return true;
        }
        ArrayList arrayList = extendedCommunityProfile.S2;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ExtendedCommunityProfile.StrikesRestriction) next).a == strikeRestrictionType) {
                    strikesRestriction = next;
                    break;
                }
            }
            strikesRestriction = strikesRestriction;
        }
        if (strikesRestriction == null) {
            return true;
        }
        ((u2i) this.b.getValue()).a(context, strikesRestriction.b, strikesRestriction.c);
        return false;
    }

    @Override // xsna.o2i
    public final boolean d(Throwable th, boolean z) {
        VKApiExecutionException e = e(th);
        if (e == null) {
            return false;
        }
        i0q0.f(new p2i(e, z, this));
        return true;
    }
}

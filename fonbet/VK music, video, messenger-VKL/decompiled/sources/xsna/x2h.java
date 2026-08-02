package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.dto.profile.Address;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.z4h;

/* compiled from: CommunityExt.kt */
/* loaded from: classes5.dex */
public final class x2h {
    public static final CharSequence a(Address address, int i, Context context) {
        if (address == null) {
            return null;
        }
        String str = address.f;
        if (i > 1) {
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) his0.q(context.getResources().getQuantityString(R.plurals.address_plurals, i, Integer.valueOf(i)))).append((CharSequence) rik0.a).append((CharSequence) str);
            if (myc0.f(address.zb())) {
                append.append((CharSequence) ", ").append((CharSequence) address.zb());
            }
            return append;
        }
        StringBuilder sb = new StringBuilder(str);
        if (myc0.f(address.zb())) {
            sb.append(", ");
            sb.append(address.h);
        }
        return sb;
    }

    public static final String b(ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        CharSequence a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (z) {
            a = a(extendedCommunityProfile.W1, 1, context);
        } else {
            Address address = extendedCommunityProfile.V1;
            if (address == null) {
                address = extendedCommunityProfile.W1;
            }
            a = a(address, extendedCommunityProfile.Z1, context);
        }
        return a != null ? a.toString() : extendedCommunityProfile.s0;
    }

    public static final boolean c(ExtendedCommunityProfile extendedCommunityProfile) {
        z4h z4hVar = extendedCommunityProfile.g2;
        if (z4hVar != null) {
            List<z4h.a> list = z4hVar.a;
            if (!z4hVar.b && !list.isEmpty()) {
                if (w2h.a(extendedCommunityProfile)) {
                    return true;
                }
                List<z4h.a> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((z4h.a) it.next()).h) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

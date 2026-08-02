package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: MsgSearchHighlighter.kt */
/* loaded from: classes2.dex */
public final class mx30 {
    public static final mx30 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(mx30.class, "foundTokens", "getFoundTokens()Landroid/util/SparseIntArray;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new mx30();
        c = new wqo0(new yv2(20));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.vk.im.engine.models.messages.a a(com.vk.im.engine.models.messages.a aVar, ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, int i) {
        String Db;
        Iterator<T> it;
        if (i > 10 || (aVar.q7().size() > 10 && i != 0)) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (drm0.D(aVar.getBody(), (String) it2.next(), true)) {
                    break;
                }
            }
        }
        long ob = aVar.ob();
        int i2 = v120.$EnumSwitchMapping$0[aVar.y2().ordinal()];
        if (i2 == 1) {
            User user = (User) profilesSimpleInfo.b.get(Long.valueOf(ob));
            if (user != null) {
                Db = user.Db();
                if (Db != null) {
                }
                if (!arrayList.isEmpty()) {
                }
                it = aVar.q7().iterator();
                while (it.hasNext()) {
                }
                return null;
            }
            Db = null;
            if (Db != null) {
            }
            if (!arrayList.isEmpty()) {
            }
            it = aVar.q7().iterator();
            while (it.hasNext()) {
            }
            return null;
        }
        if (i2 == 2) {
            Contact contact = (Contact) profilesSimpleInfo.c.get(Long.valueOf(ob));
            if (contact != null) {
                Db = contact.c;
                if (Db != null) {
                }
                if (!arrayList.isEmpty()) {
                }
                it = aVar.q7().iterator();
                while (it.hasNext()) {
                }
                return null;
            }
            Db = null;
            if (Db != null) {
            }
            if (!arrayList.isEmpty()) {
            }
            it = aVar.q7().iterator();
            while (it.hasNext()) {
            }
            return null;
        }
        if (i2 == 3) {
            Email email = (Email) profilesSimpleInfo.d.get(Long.valueOf(ob));
            if (email != null) {
                Db = email.c;
                if (Db != null) {
                }
                if (!arrayList.isEmpty()) {
                }
                it = aVar.q7().iterator();
                while (it.hasNext()) {
                }
                return null;
            }
            Db = null;
            if (Db != null) {
            }
            if (!arrayList.isEmpty()) {
            }
            it = aVar.q7().iterator();
            while (it.hasNext()) {
            }
            return null;
        }
        if (i2 != 4) {
            Db = "";
        } else {
            Group group = (Group) profilesSimpleInfo.e.get(Long.valueOf(ob));
            if (group != null) {
                Db = group.c;
            }
            Db = null;
        }
        String str = Db != null ? Db : "";
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (drm0.D(str, (String) it3.next(), true)) {
                }
            }
        }
        it = aVar.q7().iterator();
        while (it.hasNext()) {
            a.getClass();
            com.vk.im.engine.models.messages.a a2 = a((NestedMsg) it.next(), arrayList, profilesSimpleInfo, i + 1);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
        return aVar;
    }

    public static SparseIntArray b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (SparseIntArray) wqo0Var.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r13 < 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, ArrayList arrayList2) {
        SpannableStringBuilder spannableStringBuilder2;
        int i;
        b().clear();
        Iterator it = arrayList2.iterator();
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            int K = drm0.K(0, 2, spannableStringBuilder, (String) it.next(), true);
            if (K >= 0) {
                if (K < i2) {
                    i2 = K;
                }
                b().put(i3, K);
            }
            i3 = i4;
        }
        if (i2 == Integer.MAX_VALUE) {
            if (spannableStringBuilder.length() < 80) {
                return;
            }
            int O = drm0.O(80, 4, spannableStringBuilder, " ");
            if (O > 40) {
                spannableStringBuilder.delete(O, spannableStringBuilder.length());
            } else {
                spannableStringBuilder.delete(79, spannableStringBuilder.length());
            }
            spannableStringBuilder.append("…");
            return;
        }
        if (spannableStringBuilder.length() > 80) {
            if (i2 > 0) {
                spannableStringBuilder2 = spannableStringBuilder;
                i = drm0.J(spannableStringBuilder2, " ", i2 - 40, 0, true, true) + 1;
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
            }
            i = 0;
            int i5 = i + 40;
            boolean z = i5 > spannableStringBuilder2.length();
            int min = Math.min(i5, spannableStringBuilder2.length());
            int length = (!z || min >= spannableStringBuilder2.length()) ? spannableStringBuilder2.length() : drm0.J(spannableStringBuilder2, " ", min, 0, true, true);
            if (length < spannableStringBuilder2.length()) {
                spannableStringBuilder2.delete(length, spannableStringBuilder2.length());
                spannableStringBuilder2.append("…");
            }
            if (i > 0) {
                spannableStringBuilder2.delete(0, i);
                spannableStringBuilder2.insert(0, "…");
                int size = b().size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = b().keyAt(i6);
                    int valueAt = b().valueAt(i6);
                    u4q0 u4q0Var = zik0.a;
                    b().put(keyAt, (valueAt - i) + 1);
                }
            }
        } else {
            spannableStringBuilder2 = spannableStringBuilder;
        }
        int size2 = b().size();
        for (int i7 = 0; i7 < size2; i7++) {
            String str = (String) arrayList.get(b().keyAt(i7));
            int valueAt2 = b().valueAt(i7);
            int length2 = str.length() + valueAt2;
            int max = Math.max(length2 - 2, 0);
            int min2 = Math.min(length2 + 10, spannableStringBuilder2.length());
            while (true) {
                if (max >= min2) {
                    max = -1;
                    break;
                }
                char charAt = spannableStringBuilder2.charAt(max);
                if (!Character.isLetter(charAt) && !Character.isDigit(charAt)) {
                    break;
                } else {
                    max++;
                }
            }
            if (max > 0) {
                length2 = max;
            } else if (min2 == spannableStringBuilder2.length()) {
                length2 = min2;
            }
            if (length2 <= spannableStringBuilder2.length() && valueAt2 < length2 && str.length() > 2) {
                SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(676498380), valueAt2, length2, 33);
            }
        }
    }
}

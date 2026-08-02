package xsna;

import android.app.Activity;
import android.text.TextPaint;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.cwb0;

/* compiled from: ReactionsHelperImpl.kt */
/* loaded from: classes2.dex */
public final class m5f0 implements l5f0 {
    public static final m5f0 a = new m5f0();

    public static ArrayList b(int i, List list) {
        int intValue;
        ArrayList o = e43.o(Integer.valueOf(w0f0.t));
        Iterator it = j5g.D0(new mhm(new nde((byte) 0, 8), 1), list).iterator();
        while (it.hasNext()) {
            int count = ((MsgReaction) it.next()).getCount();
            a.getClass();
            if (c(list)) {
                intValue = ((Number) m0f0.A.getValue()).intValue() + ((Number) m0f0.z.getValue()).intValue() + ((int) Math.ceil(((TextPaint) m0f0.s.getValue()).measureText(String.valueOf(count))));
            } else {
                int intValue2 = ((Number) m0f0.t.getValue()).intValue() * count;
                int intValue3 = ((Number) m0f0.u.getValue()).intValue();
                int i2 = count - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                intValue = ((Number) m0f0.x.getValue()).intValue() + (intValue3 * i2) + intValue2 + ((Number) m0f0.y.getValue()).intValue();
            }
            int intValue4 = ((Number) m0f0.w.getValue()).intValue() + ((Number) m0f0.v.getValue()).intValue() + intValue + w0f0.s;
            if (((Number) j5g.i0(o)).intValue() + intValue4 > i) {
                o.add(Integer.valueOf(w0f0.t + intValue4));
            } else {
                o.set(e43.h(o), Integer.valueOf(((Number) j5g.i0(o)).intValue() + intValue4));
            }
        }
        return o;
    }

    public static boolean c(List list) {
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((MsgReaction) it.next()).u2().isEmpty()) {
                if (!z || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((MsgReaction) it2.next()).getCount() > 3) {
                            return true;
                        }
                    }
                }
                Iterator it3 = list2.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    i += ((MsgReaction) it3.next()).getCount();
                }
                return i > 7;
            }
        }
        return true;
    }

    public static void d(Activity activity, boolean z, gzs gzsVar) {
        if (z) {
            bzb0.d(new bzb0(activity), new cwb0.a1(R.string.im_msg_reaction_is_incognito_alert_title, null, R.string.im_msg_reaction_is_incognito_alert_message, null, R.string.im_msg_reaction_is_incognito_alert_positive_button, null, R.string.im_msg_reaction_is_incognito_alert_negative_button, null, null, null, 938), gzsVar, null, null, 28);
        } else {
            gzsVar.invoke();
        }
    }

    @Override // xsna.l5f0
    public final Integer a(Collection<? extends Msg> collection, Collection<Integer> collection2) {
        if (collection.isEmpty() || collection2.isEmpty()) {
            return null;
        }
        Collection<? extends Msg> collection3 = collection;
        Iterator<T> it = collection3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = ((Msg) it.next()).d;
        while (it.hasNext()) {
            int i2 = ((Msg) it.next()).d;
            if (i > i2) {
                i = i2;
            }
        }
        Iterator<T> it2 = collection3.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = ((Msg) it2.next()).d;
        while (it2.hasNext()) {
            int i4 = ((Msg) it2.next()).d;
            if (i3 < i4) {
                i3 = i4;
            }
        }
        Collection<Integer> collection4 = collection2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection4) {
            if (((Number) obj).intValue() < i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection4) {
            int intValue = ((Number) obj2).intValue();
            if (i <= intValue && intValue <= i3) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : collection4) {
            if (((Number) obj3).intValue() > i3) {
                arrayList3.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            return (Integer) j5g.Y(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            return (Integer) j5g.n0(arrayList);
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return (Integer) j5g.q0(arrayList3);
    }
}

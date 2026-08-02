package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class in91 {
    public static final String[] a = {"😀️", "😃️", "😄️", "😁️", "😆️", "😅️", "😂️", "🤣️", "☺️", "😊️", "😇️", "🙂️", "🙃️", "😉️", "😌️", "😍️", "😘️", "😗️", "😙️", "😚️", "😋️", "😜️", "😝️", "😛️", "🤑️", "🤗️", "🤓️", "😎️", "🤡️", "🤠️", "😏️", "😒️", "😞️", "😔️", "😟️", "😕️", "🙁️", "☹️", "😣️", "😖️", "😫️", "😩️", "😤️", "😠️", "😡️", "😶️", "😐️", "😑️", "😯️", "😦️", "😧️", "😮️", "😲️", "😵️", "😳️", "😱️", "😨️", "😰️", "😢️", "😥️", "🤤️", "😭️", "😓️", "😪️", "😴️", "🙄️", "🤔️", "🤥️", "😬️", "🤐️", "🤢️", "🤧️", "😷️", "🤒️", "🤕️", "😈️", "👿️", "👹️", "👺️", "💩️", "👻️", "💀️", "☠️", "👽️", "👾️", "🤖️", "🎃️", "😺️", "😸️", "😹️", "😻️", "😼️", "😽️", "🙀️", "😿️", "😾️", "👐️", "🙌️", "👏️", "🙏️", "🤝️", "👍️", "👎️", "👊️", "✊️", "🤛️", "🤜️", "🤞️", "✌️", "🤘️", "👌️", "👈️", "👉️", "👆️", "👇️", "☝️", "✋️", "🤚️", "🖐️", "🖖️", "👋️", "🤙️", "💪️", "🖕️", "✍️", "🤳️", "💅️", "💍️", "💄️", "💋️", "👄️", "👅️", "👂️", "👃️", "👣️", "👁️", "👀️", "🗣️", "👤️", "👥️", "👶️", "👦️", "👧️", "👨️", "👩️", "👱\u200d♀️", "👱️", "👴️", "👵️", "👲️", "👳\u200d♀️", "👳️", "👮\u200d♀️", "👮️", "👷\u200d♀️", "👷️", "💂\u200d♀️", "💂️", "🕵️\u200d♀️", "🕵️", "👩\u200d⚕️", "👨\u200d⚕️", "👩\u200d🌾️", "👨\u200d🌾️", "👩\u200d🍳️", "👨\u200d🍳️", "👩\u200d🎓️", "👨\u200d🎓️", "👩\u200d🎤️", "👨\u200d🎤️", "👩\u200d🏫️", "👨\u200d🏫️", "👩\u200d🏭️", "👨\u200d🏭️", "👩\u200d💻️", "👨\u200d💻️", "👩\u200d💼️", "👨\u200d💼️", "👩\u200d🔧️", "👨\u200d🔧️", "👩\u200d🔬️", "👨\u200d🔬️", "👩\u200d🎨️", "👨\u200d🎨️", "👩\u200d🚒️", "👨\u200d🚒️", "👩\u200d✈️", "👨\u200d✈️", "👩\u200d🚀️", "👨\u200d🚀️", "👩\u200d⚖️", "👨\u200d⚖️", "🤶️", "🎅️", "👸️", "🤴️", "👰️", "🤵️", "👼️", "🤰️", "🙇\u200d♀️", "🙇️", "💁️", "💁\u200d♂️", "🙅️", "🙅\u200d♂️", "🙆️", "🙆\u200d♂️", "🙋️", "🙋\u200d♂️", "🤦️", "🤦\u200d♀️", "🤦\u200d♂️", "🤷️", "🤷\u200d♀️", "🤷\u200d♂️", "🙎️", "🙎\u200d♂️", "🙍️", "🙍\u200d♂️", "💇️", "💇\u200d♂️", "💆️", "💆\u200d♂️", "🕴️", "💃️", "🕺️", "👯️", "👯\u200d♂️", "🚶\u200d♀️", "🚶️", "🏃\u200d♀️", "🏃️", "👫️", "👭️", "👬️", "💑️", "👩\u200d❤️\u200d👩️", "👨\u200d❤️\u200d👨️", "💏️", "👩\u200d❤️\u200d💋\u200d👩️", "👨\u200d❤️\u200d💋\u200d👨️", "👪️", "👨\u200d👩\u200d👧️", "👨\u200d👩\u200d👧\u200d👦️", "👨\u200d👩\u200d👦\u200d👦️", "👨\u200d👩\u200d👧\u200d👧️", "👩\u200d👩\u200d👦️", "👩\u200d👩\u200d👧️", "👩\u200d👩\u200d👧\u200d👦️", "👩\u200d👩\u200d👦\u200d👦️", "👩\u200d👩\u200d👧\u200d👧️", "👨\u200d👨\u200d👦️", "👨\u200d👨\u200d👧️", "👨\u200d👨\u200d👧\u200d👦️", "👨\u200d👨\u200d👦\u200d👦️", "👨\u200d👨\u200d👧\u200d👧️", "👩\u200d👦️", "👩\u200d👧️", "👩\u200d👧\u200d👦️", "👩\u200d👦\u200d👦️", "👩\u200d👧\u200d👧️", "👨\u200d👦️", "👨\u200d👧️", "👨\u200d👧\u200d👦️", "👨\u200d👦\u200d👦️", "👨\u200d👧\u200d👧️", "👚️", "👕️", "👖️", "👔️", "👗️", "👙️", "👘️", "👠️", "👡️", "👢️", "👞️", "👟️", "👒️", "🎩️", "🎓️", "👑️", "⛑️", "🎒️", "👝️", "👛️", "👜️", "💼️", "👓️", "🕶️", "🌂️", "☂️", "👨\u200d👩\u200d👦️", "👩\u200d❤️\u200d👨️", "👩\u200d❤️\u200d💋\u200d👨️", "👮\u200d♂️", "👱\u200d♂️", "👳\u200d♂️", "👷\u200d♂️", "💂\u200d♂️", "🕵️\u200d♂️", "👯\u200d♀️", "🏃\u200d♂️", "💆\u200d♀️", "💇\u200d♀️", "🚶\u200d♂️", "💁\u200d♀️", "🙅\u200d♀️", "🙆\u200d♀️", "🙇\u200d♂️", "🙋\u200d♀️", "🙍\u200d♀️", "🙎\u200d♀️"};

    public static final void a(rs31 rs31Var, a aVar, fid fidVar, int i, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(457159271);
        int i3 = 18;
        if ((((((i2 & 1) == 0 && btsVar.e(rs31Var)) ? 4 : 2) | i) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
                int i4 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                btsVar.e0(307456715);
                btsVar.e0(930893235);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = new o851();
                    btsVar.o0(Q);
                }
                rs31Var = (o851) Q;
                btsVar.t(false);
                btsVar.e0(930898595);
                boolean e = btsVar.e(rs31Var);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new qq31(i3, rs31Var);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                zpn.a(zy11.a, (tls) Q2, btsVar);
                btsVar.t(false);
            }
            btsVar.u();
            sb2.b(f5z.a.a(rs31Var), aVar, btsVar, 56);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(rs31Var, aVar, i, i2);
        }
    }

    public static avc0 b() {
        return new avc0();
    }

    public static final boolean c(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (e((DrivingRoute) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(DrivingRoute drivingRoute) {
        return !e(drivingRoute);
    }

    public static final boolean e(DrivingRoute drivingRoute) {
        return drivingRoute.getMetadata().getFlags().getHasTolls();
    }
}

package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.bo0;
import xsna.zn0;

/* compiled from: AddToCallFailureNotifier.kt */
/* loaded from: classes7.dex */
public final class ao0 {
    public final Context a;
    public final gdp b = new gdp();

    public ao0(Context context) {
        this.a = context;
    }

    public final void a(bo0.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String string;
        int i;
        Set<zn0> set = cVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : set) {
            if (!(((zn0) obj5) instanceof zn0.a)) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof zn0.c) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof zn0.c)) {
            obj = null;
        }
        zn0.c cVar2 = (zn0.c) obj;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (obj2 instanceof zn0.e) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (!(obj2 instanceof zn0.e)) {
            obj2 = null;
        }
        zn0.e eVar = (zn0.e) obj2;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (obj3 instanceof zn0.f) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        if (!(obj3 instanceof zn0.f)) {
            obj3 = null;
        }
        zn0.f fVar = (zn0.f) obj3;
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj4 = it4.next();
                if (obj4 instanceof zn0.b) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        zn0.b bVar = (zn0.b) (obj4 instanceof zn0.b ? obj4 : null);
        Context context = this.a;
        if (cVar2 != null) {
            string = context.getString(R.string.voip_error_network);
        } else if (eVar != null) {
            string = context.getString(R.string.vkim_group_call_max_members_exceeded, 0);
        } else if (fVar != null) {
            ArrayList arrayList2 = fVar.a;
            string = context.getString(R.string.voip_error_cannot_invite_all);
            if (arrayList2.size() == 1) {
                whr0 whr0Var = (whr0) j5g.X(arrayList2);
                boolean z = whr0Var.c;
                if (z) {
                    i = R.string.voip_error_privacy_subtitle_f;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.voip_error_privacy_subtitle;
                }
                String str = whr0Var.q;
                if (str == null) {
                    str = whr0Var.e();
                }
                this.b.getClass();
                string = context.getString(i, gdp.a(str));
            }
        } else {
            string = bVar != null ? context.getString(R.string.voip_session_room_error_participant_already_in_call, bVar.a.e()) : context.getString(R.string.voip_error_cannot_invite_all);
        }
        enj.r(context.getApplicationContext(), string, 0);
    }
}

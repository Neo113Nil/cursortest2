package xsna;

import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.ui.components.chat_controls.ChatControls;
import java.util.ArrayList;
import xsna.ph90;

/* compiled from: ParamItem.kt */
/* loaded from: classes2.dex */
public final class qh90 {
    public static final ArrayList a(ChatControls chatControls, boolean z) {
        ArrayList arrayList = new ArrayList();
        String str = chatControls.b;
        if (str != null) {
            arrayList.add(new ph90.i(0, str, ChatPermissions.j));
        }
        String str2 = chatControls.c;
        if (str2 != null) {
            arrayList.add(new ph90.d(1, str2, ChatPermissions.j));
        }
        String str3 = chatControls.i;
        if (str3 != null) {
            if (z) {
                arrayList.add(new ph90.h(2, str3, ChatPermissions.l));
            } else {
                arrayList.add(new ph90.g(2, str3, ChatPermissions.j));
            }
        }
        String str4 = chatControls.d;
        if (str4 != null) {
            if (z) {
                arrayList.add(new ph90.f(3, str4, ChatPermissions.k));
            } else {
                arrayList.add(new ph90.e(3, str4, ChatPermissions.j));
            }
        }
        String str5 = chatControls.e;
        if (str5 != null) {
            arrayList.add(new ph90.k(4, str5, ChatPermissions.j));
        }
        String str6 = chatControls.f;
        if (str6 != null) {
            arrayList.add(new ph90.j(6, str6, ChatPermissions.j));
        }
        String str7 = chatControls.g;
        if (str7 != null) {
            arrayList.add(new ph90.a(7, str7, ChatPermissions.j));
        }
        String str8 = chatControls.h;
        if (str8 != null) {
            arrayList.add(new ph90.b(5, str8, ChatPermissions.k));
        }
        String str9 = chatControls.k;
        if (str9 != null) {
            arrayList.add(new ph90.l(9, str9, ph90.e));
        }
        String str10 = chatControls.m;
        if (str10 != null) {
            arrayList.add(new ph90.m(11, str10, ph90.e));
        }
        String str11 = chatControls.l;
        if (str11 != null) {
            arrayList.add(new ph90.n(10, str11, ph90.e));
        }
        if (chatControls.j != null) {
            arrayList.add(new ph90.c(8, epx.f(chatControls.j, Boolean.TRUE) ? "service" : "ordinary", ph90.d));
        }
        return arrayList;
    }
}

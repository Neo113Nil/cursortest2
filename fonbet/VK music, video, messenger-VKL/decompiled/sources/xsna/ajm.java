package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.u8m;

/* compiled from: DialogQuickActionsHelper.kt */
/* loaded from: classes2.dex */
public final class ajm {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((lse0) t).a), Integer.valueOf(((lse0) t2).a));
        }
    }

    public static final List<lse0> a(DialogExt dialogExt, com.vk.im.engine.models.c cVar, Peer peer, Context context) {
        ArrayList b = w8m.b(cVar, dialogExt, peer);
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            u8m u8mVar = (u8m) it.next();
            lse0 lse0Var = u8mVar instanceof u8m.e0 ? new lse0(1, R.drawable.vk_icon_message_unread_top_28, context.getString(R.string.vkim_dialogs_list_option_mark_as_unread)) : u8mVar instanceof u8m.d0 ? new lse0(2, R.drawable.vk_icon_message_outline_28, context.getString(R.string.vkim_dialogs_list_option_mark_as_read)) : u8mVar instanceof u8m.m0 ? new lse0(3, R.drawable.vk_icon_pin_outline_28, context.getString(R.string.vkim_dialogs_list_option_pin)) : u8mVar instanceof u8m.u0 ? new lse0(4, R.drawable.vk_icon_unpin_outline_28, context.getString(R.string.vkim_dialogs_list_option_unpin)) : u8mVar instanceof u8m.f0 ? new lse0(5, R.drawable.vk_icon_notification_disable_outline_28, context.getString(R.string.vkim_dialogs_list_option_notifications_off)) : u8mVar instanceof u8m.g0 ? new lse0(6, R.drawable.vk_icon_notifications_28, context.getString(R.string.vkim_dialogs_list_option_notifications_on)) : null;
            if (lse0Var != null) {
                arrayList.add(lse0Var);
            }
        }
        return j5g.D0(new a(), arrayList);
    }

    public static final u8m b(lse0 lse0Var) {
        switch (lse0Var.a) {
            case 1:
                return u8m.e0.b;
            case 2:
                return u8m.d0.b;
            case 3:
                return u8m.m0.b;
            case 4:
                return u8m.u0.b;
            case 5:
                return u8m.f0.b;
            case 6:
                return u8m.g0.b;
            default:
                return null;
        }
    }
}

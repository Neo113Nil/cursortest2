package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomsViewHolder.kt */
/* loaded from: classes7.dex */
public final class ixi0 {
    public final View a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public List<lvi0> h;
    public SessionRoomId.Room i;
    public Integer j;

    public ixi0(View view, po5 po5Var) {
        this.a = view;
        pwh0 pwh0Var = new pwh0(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, pwh0Var);
        this.c = msy.a(lazyThreadSafetyMode, new k75(15, po5Var, this));
        this.d = msy.a(lazyThreadSafetyMode, new a94(17, this, po5Var));
        this.e = msy.a(lazyThreadSafetyMode, new y4(19, this, po5Var));
        this.f = msy.a(lazyThreadSafetyMode, new dei0(this, 1));
        this.g = msy.a(lazyThreadSafetyMode, new yu60(this, 22));
        this.h = EmptyList.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(SessionRoomId.Room room) {
        int intValue;
        this.i = room;
        ?? r0 = this.d;
        rdi.B((TextView) r0.getValue(), room != null);
        TextView textView = (TextView) r0.getValue();
        Context context = this.a.getContext();
        if (room == null) {
            intValue = R.string.voip_session_room_select_room_to_join_title;
        } else {
            Integer num = this.j;
            intValue = num != null ? num.intValue() : R.string.voip_session_room_join_title;
        }
        textView.setText(context.getString(intValue));
        b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        zwi0 zwi0Var = (zwi0) this.c.getValue();
        List<lvi0> list = this.h;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (lvi0 lvi0Var : list) {
            arrayList.add(new axi0(lvi0Var, epx.f(lvi0Var.a.a, this.i)));
        }
        zwi0Var.setItems(arrayList);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.quark.debug.DebugSettingsView;

/* loaded from: classes15.dex */
public final /* synthetic */ class g45 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ g45(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((c) obj5).e0().f.a(((Long) obj).longValue(), (String) obj4, (String) obj3, (String) obj2);
                break;
            default:
                DebugSettingsView._init_$lambda$4(null, (Context) obj5, (EditText) obj4, (EditText) obj3, (DebugSettingsView) obj2, (EditText) obj, view);
                break;
        }
    }
}

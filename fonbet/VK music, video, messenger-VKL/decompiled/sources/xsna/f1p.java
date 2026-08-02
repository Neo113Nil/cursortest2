package xsna;

import android.widget.TextView;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: EditSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class f1p implements izs {
    public final /* synthetic */ g1p b;
    public final /* synthetic */ TextView c;

    public f1p(g1p g1pVar, TextView textView) {
        this.b = g1pVar;
        this.c = textView;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        g1p g1pVar;
        Object obj2;
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            g1pVar = this.b;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((f.a.b) obj2).a, g1pVar.g1)) {
                break;
            }
        }
        f.a.b bVar = (f.a.b) obj2;
        if (bVar != null) {
            String str = bVar.b;
            g1pVar.h1 = str;
            this.c.setText(str);
        }
        return s3q0.a;
    }
}

package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes15.dex */
public final class e3c {
    public final Context a;
    public final f3c b;
    public final g c;
    public final x22 d;

    public e3c(Context context, f3c f3cVar, g gVar, x22 x22Var) {
        this.a = context;
        this.b = f3cVar;
        this.c = gVar;
        this.d = x22Var;
    }

    public final boolean a(ClipData clipData) {
        ClipDescription description = clipData.getDescription();
        if (description != null && description.hasMimeType("image/*")) {
            ListBuilder a = rcc.a();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                a.add(clipData.getItemAt(i).getUri());
            }
            List M = a.M(a.j());
            ArrayList arrayList = new ArrayList();
            Iterator it = M.iterator();
            while (true) {
                AttachInfo attachInfo = null;
                if (!it.hasNext()) {
                    break;
                }
                Uri uri = (Uri) it.next();
                Context context = this.a;
                try {
                    attachInfo = juf0.b(context, uri);
                } catch (SecurityException e) {
                    this.d.reportError("clipboard_loading_error", e);
                    Toast.makeText(context, oyh0.loading_error, 0).show();
                }
                if (attachInfo != null) {
                    arrayList.add(attachInfo);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                this.c.c(arrayList2, null, null, null, null, null);
                return true;
            }
        }
        return false;
    }
}

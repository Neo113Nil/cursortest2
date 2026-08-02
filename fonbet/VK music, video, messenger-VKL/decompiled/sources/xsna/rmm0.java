package xsna;

import android.content.ClipData;
import android.content.Context;
import android.view.View;
import com.vk.log.L;
import com.vk.richcontent.api.MimeType;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.smm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rmm0 implements io.reactivex.rxjava3.core.s {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rmm0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(Object obj) {
        d7v0 d7v0Var = (d7v0) this.b;
        ClipData.Item item = (ClipData.Item) obj;
        Context context = ((View) this.c).getContext();
        d7v0Var.getClass();
        String type = item.getUri() != null ? context.getContentResolver().getType(item.getUri()) : item.getText() != null ? "text/plain" : item.getHtmlText() != null ? "text/html" : null;
        Set<MimeType> set = d7v0Var.a;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((MimeType) it.next()).a(type)) {
                    z = true;
                    break;
                }
            }
        }
        L.e("Item [" + item + "] with itemType [" + type + "] is supported = " + z);
        return z;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        smm0.a aVar = (smm0.a) this.b;
        otz otzVar = (otz) this.c;
        aVar.b.remove(otzVar);
        rVar.onNext(otzVar);
        rVar.onComplete();
    }
}

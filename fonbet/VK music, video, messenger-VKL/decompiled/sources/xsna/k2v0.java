package xsna;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.appcompat.app.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.kvv;

/* compiled from: VkLinkSpan.kt */
@ozl
/* loaded from: classes17.dex */
public final class k2v0 extends qku0 {
    public final ArrayList<String> g;

    public k2v0(ArrayList arrayList, String str, kvv.b.a aVar) {
        super(str, aVar);
        this.g = arrayList;
    }

    @Override // xsna.qku0
    public final void a() {
        if (jjc.b()) {
            return;
        }
        kvv.b.a aVar = this.c;
        String str = this.b;
        if (str == null) {
            aVar.getClass();
        } else {
            new qnl().a(kvv.b.this.itemView.getContext(), str, new io.reactivex.rxjava3.disposables.b());
        }
    }

    @Override // xsna.qku0
    public final void b(Context context) {
        String str = this.b;
        if (!brm0.B(str, "http", false)) {
            String concat = "https://".concat(str);
            if (brm0.B(str, "vkontakte://", false)) {
                return;
            }
            Iterator<T> it = this.g.iterator();
            while (it.hasNext()) {
                if (drm0.D(str, (String) it.next(), false)) {
                    return;
                }
            }
            if (!URLUtil.isHttpsUrl(concat)) {
                return;
            } else {
                str = concat;
            }
        }
        o8u0 o8u0Var = new o8u0(this, context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(context.getString(R.string.vk_open));
        arrayList2.add("open");
        arrayList.add(context.getString(R.string.vk_copy));
        arrayList2.add("copy");
        new d.a(context).setTitle(str).b((CharSequence[]) arrayList.toArray(new String[0]), new ebz(arrayList2, o8u0Var, context, str)).m();
    }
}

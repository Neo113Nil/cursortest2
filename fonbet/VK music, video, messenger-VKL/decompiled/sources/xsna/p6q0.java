package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: UnsubscribeAuthorMenu.kt */
/* loaded from: classes6.dex */
public final class p6q0 extends wx20 {
    public final gzs<s3q0> c;

    public p6q0(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        ListBuilder e = e43.e();
        e.add(new e520(1, 0, R.string.stickers_unsubscribe_author_menu, 1, true, 0, R.color.vk_red, true, null, 0, null, false, 7842));
        e.add(new e520(2, 0, R.string.stickers_cancel_unsubscribe_author_menu, 2, false, 0, 0, true, null, 0, null, false, 7922));
        return e.g();
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        int i = e520Var.a;
        if (i == 1) {
            this.c.invoke();
        } else {
            if (i != 2) {
                return;
            }
            d();
        }
    }
}

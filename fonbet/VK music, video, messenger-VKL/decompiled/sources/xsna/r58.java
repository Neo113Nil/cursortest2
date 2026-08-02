package xsna;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r58 implements izs {
    public final /* synthetic */ s58 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ androidx.appcompat.view.menu.f d;
    public final /* synthetic */ int e;

    public /* synthetic */ r58(s58 s58Var, UserId userId, androidx.appcompat.view.menu.f fVar, int i) {
        this.b = s58Var;
        this.c = userId;
        this.d = fVar;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable drawable = (Drawable) obj;
        Group C0 = this.b.b.C0(fkq0.a(this.c));
        String str = C0 != null ? C0.d : null;
        if (str == null) {
            str = "";
        }
        MenuItem item = this.d.getItem(this.e);
        item.setIcon(drawable);
        item.setTitle(str);
        item.setShowAsAction(1);
        return s3q0.a;
    }
}

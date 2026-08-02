package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.concurrent.Callable;

/* compiled from: stat.kt */
/* loaded from: classes15.dex */
public final class ksk0 {
    public static final void a(final gzs<s3q0> gzsVar) {
        io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.jsk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                gzs.this.invoke();
                return s3q0.a;
            }
        }).q(asu0.a.c());
        int i = kwg0.a;
        q.subscribe(new iwg0(), new iwg0());
    }

    public static final void b(gzs<MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem> gzsVar) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), gzsVar.invoke(), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}

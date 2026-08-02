package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ConfigureSessionRoomsListViewHolderAssignRandomly.kt */
/* loaded from: classes7.dex */
public final class j2j extends vfz<e2j> {
    public final nvg l;
    public final Object m;
    public final Object n;
    public final Object o;

    public j2j(ViewGroup viewGroup, nvg nvgVar) {
        super(R.layout.voip_session_rooms_admin_configure_room_list_item_assign_randomly, viewGroup);
        this.l = nvgVar;
        com.vk.movika.sdk.base.presenter.b bVar = new com.vk.movika.sdk.base.presenter.b(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, bVar);
        this.n = msy.a(lazyThreadSafetyMode, new qc(this, 29));
        this.o = msy.a(lazyThreadSafetyMode, new i5f(this, 10));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(e2j e2jVar) {
        e2j e2jVar2 = e2jVar;
        boolean z = e2jVar2.b;
        ?? r1 = this.n;
        ?? r2 = this.o;
        if (z) {
            bwt0.p0((View) r2.getValue(), true);
            bwt0.p0((View) r1.getValue(), false);
            return;
        }
        ((TextView) this.m.getValue()).setText(enj.f(R.plurals.voip_session_room_participant_count, e2jVar2.c, this.itemView.getContext()));
        bwt0.i0(this.itemView, new bv1(9, this, e2jVar2));
        bwt0.p0((View) r1.getValue(), true);
        bwt0.p0((View) r2.getValue(), false);
    }
}

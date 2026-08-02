package xsna;

import android.os.SystemClock;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b3t0;
import xsna.r2t0;
import xsna.x1t0;

/* compiled from: VideoPickerFeature.kt */
/* loaded from: classes4.dex */
public final class l2t0 extends wk50<i3t0, c3t0, x1t0, r2t0> {
    public final UserId f;
    public final xf90 g;
    public final a3t0 h;
    public final Integer i;
    public final x2j0 j;
    public final f4z k;
    public final j2t0 l;

    public l2t0(x2t0 x2t0Var, UserId userId, xf90 xf90Var, a3t0 a3t0Var, Integer num, x2j0 x2j0Var) {
        super(x1t0.e.b, x2t0Var);
        this.f = userId;
        this.g = xf90Var;
        this.h = a3t0Var;
        this.i = num;
        this.j = x2j0Var;
        this.k = new f4z();
        this.l = new j2t0(this);
    }

    @Override // xsna.wk50
    public final void N(c3t0 c3t0Var, x1t0 x1t0Var) {
        efc0 efc0Var;
        c3t0 c3t0Var2 = c3t0Var;
        x1t0 x1t0Var2 = x1t0Var;
        PickerTechMetrics pickerTechMetrics = c3t0Var2.g;
        if (x1t0Var2.equals(x1t0.e.b)) {
            return;
        }
        boolean equals = x1t0Var2.equals(x1t0.a.b);
        f4z f4zVar = this.k;
        xf90 xf90Var = this.g;
        if (equals) {
            xf90Var.d = this.l;
            f4zVar.b(new b3t0.c.a(xf90Var));
            return;
        }
        boolean z = x1t0Var2 instanceof x1t0.d;
        x2j0 x2j0Var = this.j;
        if (z) {
            x1t0.d dVar = (x1t0.d) x1t0Var2;
            if (dVar instanceof x1t0.d.c) {
                x1t0.d.c cVar = (x1t0.d.c) dVar;
                efc0 efc0Var2 = (efc0) x2j0Var.invoke();
                if (efc0Var2 != null) {
                    efc0Var2.C(new PostingAction.MediaPicker.Selection.ToggleVkVideoItemSelection(new MediaPickerSelectedItem.VkVideo(new VkMediaEntry$VkVideo(cVar.b)), SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            if (dVar instanceof x1t0.d.b) {
                x1t0.d.b bVar = (x1t0.d.b) dVar;
                T(new r2t0.b(bVar.b, bVar.c));
                return;
            } else {
                if (!(dVar instanceof x1t0.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new b3t0.b.a(((x1t0.d.a) dVar).b));
                return;
            }
        }
        if (x1t0Var2 instanceof x1t0.b) {
            if (!((x1t0.b) x1t0Var2).equals(x1t0.b.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            xf90Var.c.e();
            com.vk.lists.c cVar2 = xf90Var.b;
            if (cVar2 != null) {
                cVar2.v();
            }
            xf90Var.b = null;
            xf90Var.d = null;
            return;
        }
        if ((x1t0Var2 instanceof x1t0.c.a) || (x1t0Var2 instanceof x1t0.c.b)) {
            return;
        }
        if (x1t0Var2 instanceof a2t0) {
            T(new t2t0(((a2t0) x1t0Var2).b));
            return;
        }
        if (!(x1t0Var2 instanceof y1t0)) {
            if (!(x1t0Var2 instanceof z1t0)) {
                throw new NoWhenBranchMatchedException();
            }
            z1t0 z1t0Var = (z1t0) x1t0Var2;
            if ((pickerTechMetrics != null ? Long.valueOf(pickerTechMetrics.b) : null) == null || (efc0Var = (efc0) x2j0Var.invoke()) == null) {
                return;
            }
            efc0Var.C(new PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType.VIDEO_VK, new PickerTechMetrics(pickerTechMetrics.b, Long.valueOf(z1t0Var.b), null)));
            return;
        }
        if (c3t0Var2.h) {
            return;
        }
        C(new a2t0(SystemClock.elapsedRealtime()));
        T(s2t0.b);
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new slf(this, 4));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new k2y(new y89(com.vk.metrics.eventtracking.b.a, 10), 25));
        if (subscribe != null) {
            this.e.b(subscribe);
        }
    }

    @Override // xsna.wk50
    public final List<x1t0> Q(c3t0 c3t0Var, c3t0 c3t0Var2, r2t0 r2t0Var) {
        c3t0 c3t0Var3 = c3t0Var;
        c3t0 c3t0Var4 = c3t0Var2;
        r2t0 r2t0Var2 = r2t0Var;
        if (r2t0Var2 instanceof r2t0.a.C3595a) {
            Throwable th = ((r2t0.a.C3595a) r2t0Var2).b.a;
            return Collections.singletonList(new x1t0.c.a());
        }
        if (r2t0Var2 instanceof r2t0.a.c) {
            return Collections.singletonList(x1t0.c.b.b);
        }
        super.Q(c3t0Var3, c3t0Var4, r2t0Var2);
        return null;
    }

    public final wj50<b3t0> x() {
        return this.k;
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.CommonFeedStat$TypeActionButtonTypeItem;
import com.vk.stat.scheme.CommonFeedStat$TypeFeedActionButtonItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.fsi;
import xsna.lu;

/* compiled from: CompositeActionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class esi extends rp6<fsi, NewsEntry> implements View.OnClickListener, hsi {
    public final qmu0 E;
    public final Object F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public esi(ViewGroup viewGroup) {
        super(r1, viewGroup);
        qmu0 qmu0Var = new qmu0(viewGroup.getContext());
        qmu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        qmu0 qmu0Var2 = (qmu0) this.itemView;
        this.E = qmu0Var2;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new wv0(10));
        getContext();
        qmu0Var2.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, this.itemView.getContext()));
        qmu0Var2.setOnClickListener(this);
    }

    @Override // xsna.rp6
    public final void R6(fsi fsiVar) {
        nmu0 nmu0Var;
        fsi fsiVar2 = fsiVar;
        omu0 omu0Var = new omu0(fsiVar2.j);
        qmu0 qmu0Var = this.E;
        qmu0Var.b(omu0Var);
        fsi.a aVar = fsiVar2.k;
        if (aVar instanceof fsi.a.C2891a) {
            fsi.a.C2891a c2891a = (fsi.a.C2891a) aVar;
            nmu0Var = new nmu0(c2891a.b, c2891a.a, e3m.f(R.attr.vk_ui_background_content, this.itemView.getContext()), c2891a.c);
        } else {
            nmu0Var = null;
        }
        qmu0Var.a(nmu0Var);
        qmu0Var.c(b7(fsiVar2.l, false, false));
    }

    public final pmu0 b7(fsi.b bVar, boolean z, boolean z2) {
        Pair pair;
        if (!(bVar instanceof fsi.b.a)) {
            return null;
        }
        if (z) {
            ((fsi.b.a) bVar).getClass();
            pair = new Pair(Integer.valueOf(R.attr.vk_ui_background_content_inverse), Integer.valueOf(R.attr.vk_ui_text_contrast_themed));
        } else {
            pair = new Pair(Integer.valueOf(R.attr.vk_ui_background_content), Integer.valueOf(R.attr.vk_ui_text_primary));
        }
        return new pmu0(((fsi.b.a) bVar).a, new zqf(this, 8), ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), z2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fsi fsiVar = (fsi) this.C;
        if (fsiVar != null) {
            ActionButtonAttachment actionButtonAttachment = fsiVar.h;
            di60.w(actionButtonAttachment.h, this.itemView.getContext(), null, null, null, null, 62);
            lu luVar = (lu) this.F.getValue();
            NewsEntry newsEntry = fsiVar.i;
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            luVar.getClass();
            lu.a(newsEntry, actionButtonAttachment, i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hsi
    public final void y3() {
        fsi fsiVar = (fsi) this.C;
        if (fsiVar != null) {
            lu luVar = (lu) this.F.getValue();
            NewsEntry newsEntry = fsiVar.i;
            luVar.getClass();
            CommonFeedStat$TypeFeedActionButtonItem commonFeedStat$TypeFeedActionButtonItem = new CommonFeedStat$TypeFeedActionButtonItem(CommonFeedStat$TypeFeedActionButtonItem.Action.CHANGE_ACTION_BUTTON_COLOR, CommonFeedStat$TypeActionButtonTypeItem.VK_TICKET);
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.POST;
            long j = k9q0.o(newsEntry).b;
            SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(type, Long.valueOf(di60.n(newsEntry)), Long.valueOf(j), null, newsEntry.Cb().b, null, 40, null), null, commonFeedStat$TypeFeedActionButtonItem, 2);
            lu.a aVar = (lu.a) luVar.a.getValue();
            UiTracker uiTracker = UiTracker.a;
            aVar.f = UiTracker.c();
            aVar.g = b;
            aVar.q();
            this.E.c(b7(fsiVar.l, true, true));
        }
    }
}

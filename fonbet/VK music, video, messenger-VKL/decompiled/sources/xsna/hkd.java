package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.g8d;
import xsna.kkd;
import xsna.mut0;

/* compiled from: ClipsBottomSheetHelper.kt */
/* loaded from: classes17.dex */
public final class hkd {
    public final ikd a;
    public final nkd b;
    public final izs<ckd, Boolean> c;
    public final zp50 d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public hkd(ikd ikdVar, nkd nkdVar, izs<? super ckd, Boolean> izsVar, zp50 zp50Var) {
        this.a = ikdVar;
        this.b = nkdVar;
        this.c = izsVar;
        this.d = zp50Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new af0(7));
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, kotlin.Lazy] */
    public final bkd a(Activity activity, f5z f5zVar, boolean z) {
        ile ileVar;
        SchemeStat$TypeClipViewerItem.ScreenType screenType;
        ikd ikdVar = this.a;
        zp50 zp50Var = this.d;
        ekd ekdVar = new ekd(activity, ikdVar, f5zVar, zp50Var);
        g8d.a aVar = ikdVar.f;
        dz20 dz20Var = ikdVar.e;
        if (aVar != null) {
            if (aVar instanceof g8d.a.C2925a) {
                screenType = fzc.b(((g8d.a.C2925a) aVar).a);
            } else if (aVar instanceof g8d.a.b) {
                screenType = SchemeStat$TypeClipViewerItem.ScreenType.PROFILE;
            } else {
                if (!(aVar instanceof g8d.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                screenType = SchemeStat$TypeClipViewerItem.ScreenType.PROFILE;
            }
            ileVar = new ile(screenType);
        } else {
            ileVar = null;
        }
        sua suaVar = new sua();
        ListBuilder e = e43.e();
        e.add(zv0.b);
        e.add(new ird(suaVar, (ClipsDownloadComponent) ekdVar.p.getValue(), ileVar));
        xne a = ekdVar.a();
        bpn0 bpn0Var = ekdVar.r;
        e.add(new rwf0(suaVar, ileVar, a, (xlc) bpn0Var.getValue()));
        e.add(new fwf0(suaVar, ileVar));
        xne a2 = ekdVar.a();
        bpn0 bpn0Var2 = ekdVar.q;
        e.add(new c770(suaVar, a2, ileVar, (n11) bpn0Var2.getValue()));
        e.add(new xo0(suaVar, ileVar, (xlc) bpn0Var.getValue()));
        e.add(new b0p(suaVar, (xlc) bpn0Var.getValue()));
        e.add(new tyo(suaVar, ileVar, ekdVar.a(), (xlc) bpn0Var.getValue()));
        ?? r7 = ekdVar.n;
        e.add(new w4g0(suaVar, (pkd) r7.getValue(), ileVar, (n11) bpn0Var2.getValue(), ekdVar.a(), zp50Var));
        ?? r72 = ekdVar.f;
        e.add(new en8(suaVar, (zof) r72.getValue(), (ljt0) ekdVar.o.getValue()));
        mkd mkdVar = ekdVar.s;
        e.add(new eee0(suaVar, mkdVar));
        e.add(new c1p(suaVar, mkdVar));
        e.add(new w41(suaVar, ileVar, zp50Var));
        e.add(new ctj(suaVar, ileVar, zp50Var, (zof) r72.getValue()));
        e.add(new v0p(suaVar, ileVar, ekdVar.a()));
        e.add(new s6j0(ClipsBottomSheetOptions.SHARE.ordinal()));
        e.add(new eo0(suaVar, ((ClipsFavoritesComponent) ekdVar.l.getValue()).b(), ((BridgeComponent) ekdVar.m.getValue()).s()));
        e.add(new ajj0(suaVar, ekdVar.a(), ikdVar));
        e.add(new ljj0(suaVar, ileVar, ekdVar.a(), (xlc) bpn0Var.getValue()));
        e.add(new bjd(ClipsBottomSheetOptions.CLIPS_AUTO_SUBTITLES.ordinal()));
        e.add(new uid((zof) r72.getValue(), (zid) ekdVar.i.getValue(), suaVar));
        e.add(new pwf0(suaVar, (ClipsCoauthorsComponent) ekdVar.k.getValue(), f5zVar));
        e.add(new lla0(suaVar, ileVar, ekdVar.a()));
        e.add(new x4q0(suaVar, ileVar, ekdVar.a()));
        ((pkd) r7.getValue()).h().getClass();
        e.add(new qip0(ClipsBottomSheetOptions.TRAFFIC_SAVING.ordinal()));
        ListBuilder g = e.g();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
            if (!aVar2.hasNext()) {
                break;
            }
            Object next = aVar2.next();
            ckd ckdVar = (ckd) next;
            izs<ckd, Boolean> izsVar = this.c;
            if (izsVar != null ? izsVar.invoke(ckdVar).booleanValue() : true) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yu20 a3 = ((ckd) it.next()).a(ekdVar.b, ekdVar.c);
            if (a3 != null) {
                arrayList2.add(a3);
            }
        }
        List D0 = j5g.D0(new fa80(2), arrayList2);
        r80 r80Var = new r80();
        r80Var.a = arrayList;
        r80Var.b = ikdVar;
        r80Var.c = this.b;
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            okd okdVar = new okd(activity, D0, r80Var, z ? dhr0.a.v() : dhr0.C().c, dz20Var != null ? new gkd(dz20Var) : null);
            okdVar.a();
            return okdVar;
        }
        gkd gkdVar = dz20Var != null ? new gkd(dz20Var) : null;
        kkd kkdVar = new kkd(new kkd.a(activity, D0, r80Var, gkdVar));
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ComposeView composeView = new ComposeView(activity, null, 6);
        composeView.setViewCompositionStrategy(mut0.a.a);
        composeView.setContent(new jai(1527843214, new ax(kkdVar, viewGroup, composeView), true));
        if (gkdVar != null) {
            gkdVar.a();
        }
        viewGroup.addView(composeView);
        return kkdVar;
    }

    public /* synthetic */ hkd(ikd ikdVar, nkd nkdVar, izs izsVar, zp50 zp50Var, int i) {
        this(ikdVar, nkdVar, (i & 4) != 0 ? null : izsVar, (i & 8) != 0 ? null : zp50Var);
    }
}

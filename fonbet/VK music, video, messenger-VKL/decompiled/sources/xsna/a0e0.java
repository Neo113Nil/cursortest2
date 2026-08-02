package xsna;

import com.vk.log.L;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vk.stat.scheme.CommonProfileStat$ContentTabsEvent;
import com.vk.stat.scheme.CommonProfileStat$ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.d0e0;
import xsna.g0e0;
import xsna.nyd0;
import xsna.rnq0;
import xsna.zzd0;

/* compiled from: ProfileTabOptionsFeature.kt */
/* loaded from: classes5.dex */
public final class a0e0 extends wk50<j0e0, h0e0, zzd0, d0e0> {
    public final rnq0 f;
    public final Object g;
    public final lyd0 h;
    public final f4z i;

    public a0e0(f0e0 f0e0Var, rnq0 rnq0Var, List<? extends ProfileTabOptions> list, lyd0 lyd0Var) {
        super(new zzd0.c(list), f0e0Var);
        this.f = rnq0Var;
        this.g = list;
        this.h = lyd0Var;
        this.i = new f4z();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    @Override // xsna.wk50
    public final void N(h0e0 h0e0Var, zzd0 zzd0Var) {
        CommonProfileStat$ContentType commonProfileStat$ContentType;
        Object obj;
        Object obj2;
        h0e0 h0e0Var2 = h0e0Var;
        zzd0 zzd0Var2 = zzd0Var;
        if (zzd0Var2 instanceof zzd0.c) {
            T(new d0e0.b(((zzd0.c) zzd0Var2).b));
            return;
        }
        boolean equals = zzd0Var2.equals(zzd0.d.b);
        f4z f4zVar = this.i;
        if (equals) {
            f4zVar.b(g0e0.a.a);
            return;
        }
        if (zzd0Var2.equals(zzd0.a.b)) {
            f4zVar.b(g0e0.a.a);
            return;
        }
        if (!zzd0Var2.equals(zzd0.b.b)) {
            if (!(zzd0Var2 instanceof zzd0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new d0e0.a(((zzd0.e) zzd0Var2).b));
            return;
        }
        Iterable iterable = (Iterable) this.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (!(((ProfileTabOptions) obj3) instanceof ProfileTabOptions.DefaultOptions)) {
                arrayList.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            commonProfileStat$ContentType = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((ProfileTabOptions) obj).e()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ProfileTabOptions profileTabOptions = (ProfileTabOptions) obj;
        Iterator<T> it2 = h0e0Var2.b.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (((ProfileTabOptions) obj2).e()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        ProfileTabOptions profileTabOptions2 = (ProfileTabOptions) obj2;
        boolean z = profileTabOptions2 instanceof ProfileTabOptions.DefaultOptions;
        rnq0 rnq0Var = this.f;
        lyd0 lyd0Var = this.h;
        if (z) {
            if (profileTabOptions != null && dlj.a(profileTabOptions) != null) {
                nyd0.o(nyd0.this, new nyd0.f(null, null, null, null, null, null, null, null, null, null, null, new CommonProfileStat$ContentTabsEvent(CommonProfileStat$ContentTabsEvent.ContentTabsEventType.SAVE_TAB_SETTINGS, null, CommonProfileStat$ContentTabsEvent.TabMode.DISABLED, 2, null), 2047));
                rnq0Var.i(new rnq0.a(dlj.a(profileTabOptions), false, profileTabOptions.d(), profileTabOptions.g));
            }
        } else if (profileTabOptions2 != null && !profileTabOptions2.equals(profileTabOptions) && dlj.a(profileTabOptions2) != null) {
            nyd0.l b = lyd0Var.b();
            String a = dlj.a(profileTabOptions2);
            nyd0 nyd0Var = nyd0.this;
            CommonProfileStat$ContentTabsEvent.ContentTabsEventType contentTabsEventType = CommonProfileStat$ContentTabsEvent.ContentTabsEventType.SAVE_TAB_SETTINGS;
            CommonProfileStat$ContentTabsEvent.TabMode tabMode = CommonProfileStat$ContentTabsEvent.TabMode.ENABLED;
            switch (a.hashCode()) {
                case -1570552255:
                    if (a.equals("narratives")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.NARRATIVE;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case -1415163932:
                    if (a.equals("albums")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.ALBUMS;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case -1228877251:
                    if (a.equals("articles")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.ARTICLES;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case -989034367:
                    if (a.equals("photos")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.PHOTO;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case -816678056:
                    if (a.equals("videos")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.VIDEO;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case 3378743:
                    if (a.equals("nfts")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.NFTS;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case 98352451:
                    if (a.equals("gifts")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.GIFTS;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case 104263205:
                    if (a.equals("music")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.MUSIC;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                case 1725051003:
                    if (a.equals("short_videos")) {
                        commonProfileStat$ContentType = CommonProfileStat$ContentType.CLIPS;
                        break;
                    }
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
                default:
                    L.l("UNKNOWN TAB ".concat(a));
                    break;
            }
            nyd0.o(nyd0Var, new nyd0.f(null, null, null, null, null, null, null, null, null, null, null, new CommonProfileStat$ContentTabsEvent(contentTabsEventType, commonProfileStat$ContentType, tabMode), 2047));
            rnq0Var.n(new rnq0.a(dlj.a(profileTabOptions2), true, profileTabOptions2.d(), profileTabOptions2.g));
        }
        f4zVar.b(g0e0.a.a);
    }
}

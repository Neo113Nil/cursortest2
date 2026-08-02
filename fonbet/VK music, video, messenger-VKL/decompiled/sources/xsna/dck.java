package xsna;

import android.os.Bundle;
import com.vk.dto.common.VideoFile;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSearchType;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.cck;
import xsna.v1t0;
import xsna.yks0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dck implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dck(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        xtw xtwVar;
        int i3 = this.b;
        Object obj2 = this.c;
        int i4 = 0;
        switch (i3) {
            case 0:
                fck fckVar = (fck) obj2;
                zjm0 zjm0Var = (zjm0) obj;
                qcy<Object>[] qcyVarArr = fck.t1;
                if (epx.f(zjm0Var.j.b, ((b25) fckVar.j1.getValue()).c())) {
                    fckVar.eo().b(new cck.g(zjm0Var.g));
                    return;
                }
                return;
            case 1:
                FavesTabSearchFragment favesTabSearchFragment = (FavesTabSearchFragment) obj2;
                FavePage favePage = (FavePage) obj;
                FaveSearchType faveSearchType = favesTabSearchFragment.S;
                if (faveSearchType == null) {
                    faveSearchType = null;
                }
                if ((faveSearchType == FaveSearchType.FAVE_COMMUNITY) != epx.f(favePage.b, "group")) {
                    return;
                }
                if (i == 1208) {
                    String str = favesTabSearchFragment.c0;
                    if (str == null || str.length() == 0) {
                        xrq xrqVar = favesTabSearchFragment.Z;
                        if (xrqVar == null) {
                            xrqVar = null;
                        }
                        ((ArrayList) xrqVar.y0()).add(0, new z990(favePage, null));
                        xrq xrqVar2 = favesTabSearchFragment.Z;
                        (xrqVar2 != null ? xrqVar2 : null).notifyItemInserted(0);
                        return;
                    }
                    return;
                }
                if (i != 1209) {
                    return;
                }
                xrq xrqVar3 = favesTabSearchFragment.Z;
                if (xrqVar3 == null) {
                    xrqVar3 = null;
                }
                Iterator it = ((ArrayList) xrqVar3.y0()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        Object next = it.next();
                        xtwVar = new xtw(i4, next);
                        z990 z990Var = (z990) next;
                        if (!epx.f(z990Var != null ? z990Var.a : null, favePage)) {
                            i4 = i5;
                        }
                    } else {
                        xtwVar = null;
                    }
                }
                if (xtwVar != null) {
                    xrq xrqVar4 = favesTabSearchFragment.Z;
                    (xrqVar4 != null ? xrqVar4 : null).D0(xtwVar.a);
                    return;
                }
                return;
            default:
                yks0 yks0Var = (yks0) obj2;
                Set<yks0.a> set = yks0Var.f;
                if (i == 9) {
                    Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                    if (epx.f(bundle != null ? bundle.getString("type") : null, "video") && bundle.getLong("item_id") == yks0Var.e.o0() && epx.f(bundle.getParcelable("owner_id"), yks0Var.e.I0())) {
                        Iterator it2 = new HashSet(set).iterator();
                        while (it2.hasNext()) {
                            ((yks0.a) it2.next()).dismiss();
                        }
                        return;
                    }
                    return;
                }
                if (i != 102) {
                    if (i != 107) {
                        return;
                    }
                    u0q u0qVar = (u0q) obj;
                    if (u0qVar.a == yks0Var.e.o0() && epx.f(u0qVar.b, yks0Var.e.I0())) {
                        yks0Var.e.W8(u0qVar.c);
                        yks0Var.e.S5(u0qVar.d);
                        boolean O9 = yks0Var.e.O9();
                        boolean z = yks0Var.e.O9() || u0qVar.f;
                        yks0Var.e.f0(z);
                        yks0Var.e.s9(u0qVar.g);
                        ArrayList o = e43.o(new v1t0.e(yks0Var.e.l1()), new v1t0.d(yks0Var.e.O9()), new v1t0.g(yks0Var.e.W7()), new v1t0.f(yks0Var.e.v2()));
                        for (yks0.a aVar : set) {
                            if (O9 != z) {
                                aVar.L9(yks0Var.e, O9);
                            }
                            aVar.He(o, yks0Var.e);
                        }
                        return;
                    }
                    return;
                }
                NewsEntry newsEntry = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                if (newsEntry == null || newsEntry.zb() != 2) {
                    return;
                }
                String Bb = newsEntry.Bb();
                StringBuilder sb = new StringBuilder();
                sb.append(yks0Var.e.I0());
                sb.append('_');
                sb.append(yks0Var.e.o0());
                if (epx.f(Bb, sb.toString())) {
                    c6z c6zVar = newsEntry instanceof c6z ? (c6z) newsEntry : null;
                    if (c6zVar != null) {
                        if (c6zVar.J() != yks0Var.e.O9()) {
                            yks0Var.e.f0(c6zVar.J());
                            VideoFile videoFile = yks0Var.e;
                            videoFile.W8(videoFile.l1() + (c6zVar.J() ? 1 : -1));
                        }
                        if (c6zVar.i7() != yks0Var.e.W7()) {
                            yks0Var.e.S5(c6zVar.i7());
                            yks0Var.e.s9(c6zVar.x1());
                        }
                        if (c6zVar.E1() >= 0 && c6zVar.E1() != yks0Var.e.c1()) {
                            yks0Var.e.P2(c6zVar.E1());
                        }
                        List l = e43.l(new v1t0.e(yks0Var.e.l1()), new v1t0.d(yks0Var.e.O9()), new v1t0.g(yks0Var.e.W7()), new v1t0.f(yks0Var.e.v2()), new v1t0.a(yks0Var.e.c1()));
                        Iterator<T> it3 = set.iterator();
                        while (it3.hasNext()) {
                            ((yks0.a) it3.next()).He(l, yks0Var.e);
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

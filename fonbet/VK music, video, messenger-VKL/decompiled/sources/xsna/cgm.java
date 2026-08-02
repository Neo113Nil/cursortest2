package xsna;

import android.view.ViewGroup;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.dialogs.DialogItemView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hfr;
import xsna.jmm;
import xsna.zfm;

/* compiled from: DialogItemDelegate.kt */
/* loaded from: classes18.dex */
public final class cgm extends p1u0<zfm> {
    public final Object a;

    public cgm(jmm.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<zfm> vfzVar, zfm zfmVar, List list) {
        zfm zfmVar2 = zfmVar;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            vfzVar.i6(zfmVar2);
            return;
        }
        jmm jmmVar = (jmm) vfzVar;
        hfr.a aVar = new hfr.a(rli0.j(rli0.p(new i5g(list), new mo1(26)), kmm.b));
        while (aVar.hasNext()) {
            jmm.b bVar = (jmm.b) aVar.next();
            DialogItemView dialogItemView = jmmVar.m;
            if (bVar instanceof jmm.b.a) {
                jmmVar.h6(dialogItemView, ((jmm.b.a) bVar).a);
            } else if (bVar instanceof jmm.b.C3127b) {
                jmm.i6(dialogItemView, ((jmm.b.C3127b) bVar).a, null);
            } else if (bVar instanceof jmm.b.c) {
                Integer num = ((jmm.b.c) bVar).a;
                if (num != null) {
                    dialogItemView.setCasperIconColor(num.intValue());
                }
            } else if (bVar instanceof jmm.b.e) {
                jmm.j6(dialogItemView, ((jmm.b.e) bVar).a);
            } else if (bVar instanceof jmm.b.f) {
                jmm.l6(dialogItemView, ((jmm.b.f) bVar).a);
            } else if (bVar instanceof jmm.b.g) {
                jmm.o6(dialogItemView, ((jmm.b.g) bVar).a);
            } else if (bVar instanceof jmm.b.j) {
                jmm.b.j jVar = (jmm.b.j) bVar;
                dialogItemView.p(jVar.a, jVar.b);
            } else if (bVar instanceof jmm.b.k) {
                jmmVar.s = ((jmm.b.k) bVar).a;
                zfm.a aVar2 = jmmVar.r;
                if (aVar2 != null) {
                    jmmVar.q6(dialogItemView, aVar2, true);
                }
                zfm.a aVar3 = jmmVar.r;
                if (aVar3 != null) {
                    jmmVar.m6(dialogItemView, aVar3);
                }
            } else if (bVar instanceof jmm.b.i) {
                dialogItemView.setTime(((jmm.b.i) bVar).a.a);
            } else {
                if (!(bVar instanceof jmm.b.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                ImStoryState imStoryState = ((jmm.b.h) bVar).a;
                dialogItemView.setStories(imStoryState);
                if (imStoryState.i()) {
                    dialogItemView.setAvatarViewClickListener(new hmm(jmmVar, imStoryState, 0));
                } else {
                    dialogItemView.setAvatarViewClickListener(new w16(jmmVar, 4));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.jmm$a] */
    @Override // xsna.p1u0
    public final vfz<? extends zfm> b(ViewGroup viewGroup) {
        return new jmm(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof zfm;
    }
}

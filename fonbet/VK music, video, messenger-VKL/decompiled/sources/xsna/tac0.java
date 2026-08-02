package xsna;

import android.text.Editable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PosterConfigCategory;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PosterPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class tac0 implements qac0 {
    public final qdc0 b;
    public final rac0 c;
    public q420 d;
    public dvu e;
    public PosterSettings f;
    public List<xac0> g;
    public ArrayList h;
    public Integer i;
    public UserId j;
    public xac0 k;
    public PosterBackground m;
    public xac0 n;
    public PosterConfigCategory o;
    public Integer p;
    public PosterBackground q;
    public final boolean r;
    public boolean s;
    public int l = -1;
    public final sac0 t = new sac0(this);

    public tac0(qdc0 qdc0Var, uac0 uac0Var, ndc0 ndc0Var) {
        this.b = qdc0Var;
        this.c = uac0Var;
        this.r = ndc0Var.d;
    }

    public final void Z(int i) {
        rac0 rac0Var = this.c;
        rac0Var.w();
        int length = rac0Var.F5().length();
        if (i < 0 || length <= i) {
            i = length;
        }
        rac0Var.q2(i);
    }

    @Override // com.vk.dto.stories.model.mention.SelectionChangeEditText.a
    public final void b(int i, int i2) {
        if (i != i2) {
            return;
        }
        dvu dvuVar = this.e;
        if (dvuVar != null) {
            dvuVar.b(i);
        }
        q420 q420Var = this.d;
        if (q420Var == null) {
            q420Var = null;
        }
        q420Var.d(i);
    }

    public final void d0(int i, int i2, int i3, UserId userId) {
        rac0 rac0Var = this.c;
        if (i3 != 2) {
            rac0Var.U4(i, userId, i3 == 1);
        }
        rac0Var.d1(i2);
        rac0Var.E5((int) (i2 + 2281701376L));
        this.p = Integer.valueOf(i2);
        Editable editableText = rac0Var.l0().getEditableText();
        int length = editableText.length();
        this.t.getClass();
        for (Object obj : editableText.getSpans(0, length, i420.class)) {
            ((i420) obj).d1(i2);
        }
    }

    public final void e0(UserId userId, Integer num) {
        this.i = num;
        this.j = userId;
        List<xac0> list = this.g;
        int i = 0;
        if (list != null) {
            Iterator<xac0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                xac0 next = it.next();
                int i2 = next.a;
                if (num != null && i2 == num.intValue() && epx.f(next.b, userId)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.l = i;
        List<xac0> list2 = this.g;
        this.k = list2 != null ? (xac0) j5g.b0(i, list2) : null;
    }

    public final void g() {
        this.c.clearFocus();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.ik6
    public final void onStart() {
        boolean z = this.r;
        qdc0 qdc0Var = this.b;
        sac0 sac0Var = this.t;
        rac0 rac0Var = this.c;
        if (z) {
            this.e = new dvu(rac0Var.l0(), qdc0Var, sac0Var);
        }
        this.d = new q420(rac0Var.l0(), qdc0Var, sac0Var, 24);
    }

    public final void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void x(Owner owner) {
        String j = wlb0.j(owner);
        rac0 rac0Var = this.c;
        rac0Var.ih(owner.b, rac0Var.getContext().getString(R.string.masks_author, j));
    }

    public final void z(PosterConfigCategory posterConfigCategory) {
        String str;
        this.o = posterConfigCategory;
        if (posterConfigCategory == null || (str = posterConfigCategory.c) == null) {
            str = "";
        }
        this.c.vi(str);
    }

    @Override // xsna.qac0
    public final void z3(xac0 xac0Var, int i) {
        PosterConfigCategory posterConfigCategory;
        Object obj;
        PosterConfigCategory posterConfigCategory2;
        PosterBackground posterBackground;
        PosterBackground posterBackground2;
        List<PosterConfigCategory> list;
        List<PosterConfigCategory> list2;
        Object obj2;
        xac0 xac0Var2;
        int i2 = xac0Var.a;
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                posterConfigCategory = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int i3 = ((PosterBackground) obj).b;
                if (i3 == i2 && ((xac0Var2 = this.n) == null || i3 != xac0Var2.a)) {
                    break;
                }
            }
            PosterBackground posterBackground3 = (PosterBackground) obj;
            if (posterBackground3 == null) {
                return;
            }
            this.n = xac0Var;
            d0(posterBackground3.b, posterBackground3.d, i, posterBackground3.c);
            PosterSettings posterSettings = this.f;
            if (posterSettings == null || (list2 = posterSettings.b) == null) {
                posterConfigCategory2 = null;
            } else {
                Iterator<T> it2 = list2.iterator();
                loop1: while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    List<PosterBackground> list3 = ((PosterConfigCategory) obj2).d;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (PosterBackground posterBackground4 : list3) {
                            if (posterBackground4.b == i2 && epx.f(posterBackground4.c, xac0Var.b)) {
                                break loop1;
                            }
                        }
                    }
                }
                posterConfigCategory2 = (PosterConfigCategory) obj2;
            }
            if (posterConfigCategory2 == null && (((posterBackground = this.m) != null && i2 == posterBackground.b) || ((posterBackground2 = this.q) != null && i2 == posterBackground2.b))) {
                PosterSettings posterSettings2 = this.f;
                if (posterSettings2 != null && (list = posterSettings2.b) != null) {
                    posterConfigCategory = (PosterConfigCategory) j5g.b0(0, list);
                }
                posterConfigCategory2 = posterConfigCategory;
            }
            if (posterConfigCategory2 != null) {
                z(posterConfigCategory2);
            }
        }
    }

    @Override // xsna.ik6
    public final void onStop() {
    }
}

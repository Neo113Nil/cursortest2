package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.dialogs.DialogItemView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.hfr;
import xsna.yh00;

/* compiled from: ManagedGroupsAdapter.kt */
/* loaded from: classes3.dex */
public final class ci00 extends wx3 {
    public static final a k = new a();
    public final Drawable j;

    /* compiled from: ManagedGroupsAdapter.kt */
    public static final class a extends m.e<xh00> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(xh00 xh00Var, xh00 xh00Var2) {
            return xh00Var.equals(xh00Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(xh00 xh00Var, xh00 xh00Var2) {
            return xh00Var.b.d == xh00Var2.b.d;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(xh00 xh00Var, xh00 xh00Var2) {
            xh00 xh00Var3 = xh00Var;
            xh00 xh00Var4 = xh00Var2;
            String str = xh00Var4.d;
            String str2 = xh00Var4.c;
            ListBuilder e = e43.e();
            ImageList imageList = xh00Var3.e;
            ImageList imageList2 = xh00Var4.e;
            if (!epx.f(imageList, imageList2)) {
                e.add(new yh00.a.C4101a(imageList2));
            }
            if (!xh00Var3.c.equals(str2)) {
                e.add(new yh00.a.e(str2));
            }
            if (!xh00Var3.d.equals(str)) {
                e.add(new yh00.a.c(str));
            }
            int i = xh00Var3.f;
            int i2 = xh00Var4.f;
            if (i != i2) {
                e.add(new yh00.a.b(i2));
            }
            boolean z = xh00Var3.h;
            boolean z2 = xh00Var4.h;
            if (z != z2) {
                e.add(new yh00.a.d(z2));
            }
            return e.g();
        }
    }

    /* compiled from: ManagedGroupsAdapter.kt */
    public static final class b extends p1u0<xh00> {
        public final pi00 a;
        public final Drawable b;

        public b(pi00 pi00Var, Drawable drawable) {
            this.a = pi00Var;
            this.b = drawable;
        }

        @Override // xsna.p1u0
        public final void a(vfz<xh00> vfzVar, xh00 xh00Var, List list) {
            xh00 xh00Var2 = xh00Var;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                vfzVar.i6(xh00Var2);
                return;
            }
            yh00 yh00Var = (yh00) vfzVar;
            DialogItemView dialogItemView = yh00Var.n;
            DialogItemView dialogItemView2 = yh00Var.n;
            hfr.a aVar = new hfr.a(rli0.j(rli0.p(new i5g(list), new s6x(3)), zh00.c));
            while (aVar.hasNext()) {
                yh00.a aVar2 = (yh00.a) aVar.next();
                if (aVar2 instanceof yh00.a.C4101a) {
                    ImageList imageList = ((yh00.a.C4101a) aVar2).a;
                    Drawable drawable = yh00Var.m;
                    int i = DialogItemView.e;
                    dialogItemView2.f(imageList, drawable, false);
                } else if (aVar2 instanceof yh00.a.b) {
                    yh00.a.b bVar = (yh00.a.b) aVar2;
                    int i2 = bVar.a;
                    if (i2 > 0) {
                        dialogItemView2.r(i2, true);
                    } else {
                        dialogItemView2.u();
                    }
                    yh00Var.o = bVar.a;
                } else if (aVar2 instanceof yh00.a.c) {
                    yh00.a.c cVar = (yh00.a.c) aVar2;
                    dialogItemView.h(cVar.a, null);
                    yh00Var.q = cVar.a;
                } else if (aVar2 instanceof yh00.a.e) {
                    yh00.a.e eVar = (yh00.a.e) aVar2;
                    dialogItemView.p(eVar.a, false);
                    yh00Var.p = eVar.a;
                } else {
                    if (!(aVar2 instanceof yh00.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yh00.a.d dVar = (yh00.a.d) aVar2;
                    dialogItemView.setUnreadInMuted(dVar.a);
                    dialogItemView.setMutedVisible(dVar.a);
                }
            }
            if (list2.isEmpty()) {
                return;
            }
            yh00Var.h6();
        }

        @Override // xsna.p1u0
        public final vfz<? extends xh00> b(ViewGroup viewGroup) {
            return new yh00(viewGroup, this.a, this.b);
        }

        @Override // xsna.p1u0
        public final boolean c(hfz hfzVar) {
            return hfzVar instanceof xh00;
        }
    }

    public ci00(Context context, pi00 pi00Var) {
        super(k);
        Drawable b2 = new com.vk.im.ui.views.avatars.b(context, true).b();
        this.j = b2;
        y0(new b(pi00Var, b2));
    }
}

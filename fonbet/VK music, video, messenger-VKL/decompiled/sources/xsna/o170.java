package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;

/* compiled from: NewsfeedWatcherScrollController.kt */
/* loaded from: classes4.dex */
public final class o170 {
    public final ib60 a;
    public final p170 b;
    public final dui c;
    public final a4r d;
    public final ua4 e;
    public final ua4 f;
    public final boolean g;
    public pv60 h;

    public o170(mbs mbsVar, ib60 ib60Var, p170 p170Var, dui duiVar, a4r a4rVar, ua4 ua4Var, ua4 ua4Var2, boolean z, tr60 tr60Var) {
        this.a = ib60Var;
        this.b = p170Var;
        this.c = duiVar;
        this.d = a4rVar;
        this.e = ua4Var;
        this.f = ua4Var2;
        this.g = z;
        if (tr60Var.i) {
            mbsVar.a(new n170(this, mbsVar));
        }
    }

    public final void a(RecyclerView recyclerView) {
        pv60 pv60Var = new pv60(recyclerView);
        ib60 ib60Var = this.a;
        ib60Var.a(pv60Var, NewsEntryWatcherMode.NORMAL);
        this.h = pv60Var;
        a4r a4rVar = this.d;
        ib60Var.a(new pk60(a4rVar), NewsEntryWatcherMode.FAST);
        bb4 bb4Var = new bb4(this.e, new pyz(13));
        NewsEntryWatcherMode newsEntryWatcherMode = NewsEntryWatcherMode.HALF;
        ib60Var.a(bb4Var, newsEntryWatcherMode);
        if (com.vk.toggle.d.G()) {
            ib60Var.a(new bb4(this.f, new qey(17)), newsEntryWatcherMode);
        }
        ib60Var.a(new td60(a4rVar), NewsEntryWatcherMode.NORMAL);
        ib60Var.a(new gsi(a4rVar), NewsEntryWatcherMode.NORMAL);
        this.c.l(this.b);
        if (this.g) {
            ib60Var.a(new g7s(a4rVar), NewsEntryWatcherMode.NORMAL);
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.a.g(recyclerView);
        }
    }

    public final void c() {
        this.a.h();
    }
}

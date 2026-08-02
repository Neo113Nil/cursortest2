package xsna;

import android.content.Context;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vkontakte.android.R;
import xsna.fxe;

/* compiled from: ClipsMyDescriptionEditView.kt */
/* loaded from: classes17.dex */
public final class dme extends jmu0 {
    public static final /* synthetic */ int m1 = 0;
    public Context h1;
    public ClipsAuthor i1;
    public String j1;
    public jd k1;
    public g22 l1;

    /* compiled from: ClipsMyDescriptionEditView.kt */
    public static final class a extends kmu0 {
        public final ClipsAuthor h;
        public final fxe.a i;

        public a(Context context, ClipsAuthor clipsAuthor, fxe.a aVar) {
            super(context, new cme());
            this.h = clipsAuthor;
            this.i = aVar;
            F0(true);
            this.d.A = true;
            p0(0);
            m0(0);
            n0(0);
            o0(0);
            p(false);
            K0(16);
            a0(new sje(this, 1));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            dme dmeVar = new dme();
            dmeVar.h1 = this.c;
            dmeVar.i1 = this.h;
            fxe.a aVar = this.i;
            dmeVar.j1 = aVar.a.toString();
            dmeVar.k1 = aVar.c;
            dmeVar.l1 = aVar.b;
            return dmeVar;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1325448793);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1325448793, 8, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.ClipsMyDescriptionEditView.ThemedContent (ClipsMyDescriptionEditView.kt:53)");
        }
        dhr0 dhr0Var = dhr0.a;
        Context context = this.h1;
        if (context == null) {
            context = null;
        }
        new xnd(dhr0Var.c(context)).a(6, aVar, kai.c(1651437765, new com.vk.movika.tools.controls.seekbar.w(this, 2), aVar));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final String eo(int i) {
        if (i > 1000) {
            return l6g.a(i, "/1000");
        }
        ClipsAuthor clipsAuthor = this.i1;
        if (clipsAuthor == null) {
            clipsAuthor = null;
        }
        if (fkq0.d(clipsAuthor.b.b)) {
            Context context = this.h1;
            return (context != null ? context : null).getString(R.string.clip_grid_author_tell_about_yourself_title);
        }
        Context context2 = this.h1;
        return (context2 != null ? context2 : null).getString(R.string.clip_grid_author_tell_about_yourself_description);
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.gm50;
import xsna.lu4;
import xsna.wt4;

/* compiled from: AudioReactionsRenderExtension.kt */
/* loaded from: classes3.dex */
public final class hu4 implements gm50 {
    public final wt4 b;
    public final wt4.b c;
    public final View d;
    public final VkText e;
    public final FrameLayout f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final RecyclerView i;
    public final VkImageSimple j;
    public s2f0 k;

    public hu4(Context context, wt4 wt4Var, wt4.b bVar) {
        this.b = wt4Var;
        this.c = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_track_reactions, (ViewGroup) null, false);
        this.d = inflate;
        this.e = (VkText) inflate.findViewById(R.id.text_title);
        this.f = (FrameLayout) inflate.findViewById(R.id.progress_container);
        this.g = (LinearLayout) inflate.findViewById(R.id.error_layout);
        this.h = (LinearLayout) inflate.findViewById(R.id.content_layout);
        this.i = (RecyclerView) inflate.findViewById(R.id.rv_reactions);
        this.j = (VkImageSimple) inflate.findViewById(R.id.close);
    }

    public final void a(lu4.a aVar) {
        bwt0.p0(this.f, aVar.equals(lu4.a.c.a));
        bwt0.p0(this.g, aVar.equals(lu4.a.b.a));
        boolean z = aVar instanceof lu4.a.C3302a;
        bwt0.d0(this.h, !z);
        if (z) {
            lu4.a.C3302a c3302a = (lu4.a.C3302a) aVar;
            gm50.a.a(this, c3302a.a, new defpackage.c(3, this, c3302a.b));
        }
        bwt0.i0(this.j, new com.vk.movika.sdk.base.observable.o(this, 6));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}

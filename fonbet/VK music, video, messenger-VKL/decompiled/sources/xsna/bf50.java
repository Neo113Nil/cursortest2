package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.df50;
import xsna.gm50;
import xsna.ve50;

/* compiled from: MusicVkMixSettingsRenderExtension.kt */
/* loaded from: classes3.dex */
public final class bf50 implements gm50 {
    public final ve50 b;
    public final ve50.b c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final VkButton g;
    public final VkButton h;
    public final VkButton i;
    public final RecyclerView j;
    public final FrameLayout k;
    public final LinearLayout l;
    public final ScrollView m;
    public e4v0 n;

    public bf50(Context context, ve50 ve50Var, ve50.b bVar) {
        this.b = ve50Var;
        this.c = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_vk_mix_settings, (ViewGroup) null, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.text_title);
        this.f = (TextView) inflate.findViewById(R.id.text_subtitle);
        this.g = (VkButton) inflate.findViewById(R.id.button_accept);
        this.h = (VkButton) inflate.findViewById(R.id.button_cancel);
        this.i = (VkButton) inflate.findViewById(R.id.button_retry);
        this.j = (RecyclerView) inflate.findViewById(R.id.rv_settings);
        this.k = (FrameLayout) inflate.findViewById(R.id.progress_container);
        this.l = (LinearLayout) inflate.findViewById(R.id.error_layout);
        this.m = (ScrollView) inflate.findViewById(R.id.content_layout);
    }

    public final void a(df50.a aVar) {
        bwt0.p0(this.k, aVar.equals(df50.a.c.a));
        bwt0.p0(this.l, aVar.equals(df50.a.b.a));
        bwt0.i0(this.i, new ba40(this, 4));
        boolean z = aVar instanceof df50.a.C2730a;
        bwt0.d0(this.m, !z);
        if (z) {
            gm50.a.a(this, ((df50.a.C2730a) aVar).a, new af50(this, 0));
        }
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}

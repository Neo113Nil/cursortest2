package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.Map;
import yads.lv1;

/* loaded from: classes7.dex */
public final class ip61 implements dg61 {
    public final /* synthetic */ l071 a;
    public final /* synthetic */ lv1 b;

    public ip61(l071 l071Var, lv1 lv1Var) {
        this.a = l071Var;
        this.b = lv1Var;
    }

    @Override // defpackage.dg61
    public final void a(String str) {
        ui21 ui21Var;
        View.OnClickListener onClickListener;
        nr41 nr41Var = this.a.a;
        Uri parse = Uri.parse(str);
        if (jl40.l(parse.getScheme(), "light-bundles") && jl40.l(parse.getHost(), "click")) {
            String queryParameter = parse.getQueryParameter("assetName");
            if ((queryParameter == null && (queryParameter = parse.getQueryParameter("asset")) == null) || (ui21Var = ((t171) nr41Var.b).b) == null || (onClickListener = (View.OnClickListener) ui21Var.a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(this.b);
        }
    }

    @Override // defpackage.dg61
    public final void a(boolean z) {
    }

    @Override // defpackage.dg61
    public final void a() {
    }

    @Override // defpackage.dg61
    public final void a(lv1 lv1Var, Map map) {
    }
}

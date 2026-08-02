package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gko;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ParametersDescriptionViewImpl.kt */
/* loaded from: classes5.dex */
public final class vh90 extends uh90 {
    public final Object b;
    public final TextView c;
    public final View d;
    public final VkCell e;
    public gzs<s3q0> f;

    public vh90(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new nm0(26));
        this.b = a;
        this.f = new kk1(18);
        if (!((Boolean) a.getValue()).booleanValue()) {
            LayoutInflater.from(context).inflate(R.layout.search_feature_parameters_description_layout, this);
            dhr0.a.e0(R.attr.vk_ui_background_content, this);
            this.c = (TextView) bwt0.p(this, R.id.tv_subtitle, null, null, 6);
            this.d = bwt0.p(this, R.id.iv_close, null, null, 6);
            return;
        }
        VkCell vkCell = new VkCell(context, attributeSet, i);
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_filter_24, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(R.attr.vk_ui_stroke_accent_themed)), (tlo0.h) null, 8), null));
        gko.b bVar = gko.Companion;
        x7g x7gVar = new x7g(R.attr.vk_ui_icon_secondary);
        VkCell.Right.a aVar = null;
        vkCell.setRight(new VkCell.Right.d(aVar, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_24), (k1u0) new k1u0.a(x7gVar), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.accessibility_clear), false, (gzs) new c950(this, 12), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
        this.e = vkCell;
        addView(vkCell);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uh90
    public void setDescription(String str) {
        if (!((Boolean) this.b.getValue()).booleanValue()) {
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        VkCell vkCell = this.e;
        if (vkCell != null) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            VkCell.Middle.c cVar = null;
            Object[] objArr3 = 0 == true ? 1 : 0;
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vk_discover_search_parameters), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(str), (gzs) objArr2, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), cVar, (VkCell.Middle.Size) objArr3, 12));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uh90
    public void setOnCloseClickListener(gzs<s3q0> gzsVar) {
        if (((Boolean) this.b.getValue()).booleanValue()) {
            this.f = gzsVar;
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setOnClickListener(new qp4(gzsVar, 5));
        }
    }
}

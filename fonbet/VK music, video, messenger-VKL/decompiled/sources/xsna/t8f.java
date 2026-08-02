package xsna;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: ClipsTemplatesEditorFragmentItemHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes16.dex */
public final class t8f extends vif0<o7f> {
    public final izs<Integer, s3q0> n;
    public final View o;
    public final VkImageSimple p;
    public final VkText q;

    public t8f(ViewGroup viewGroup, j5 j5Var) {
        super(viewGroup, R.layout.clips_template_editor_fragment_item, 0);
        this.n = j5Var;
        View findViewById = this.itemView.findViewById(R.id.clips_template_editor_fragment_item_empty);
        this.o = findViewById;
        VkImageSimple vkImageSimple = (VkImageSimple) this.itemView.findViewById(R.id.clips_template_editor_fragment_item_preview);
        this.p = vkImageSimple;
        this.q = (VkText) this.itemView.findViewById(R.id.clips_template_editor_fragment_item_duration);
        View view = this.itemView;
        bwt0.m0(iah0.a(48), iah0.a(64), view);
        float f = 4;
        f4m.s(iah0.a(f), view);
        f4m.r(iah0.a(f), view);
        findViewById.setOutlineProvider(new s0w0(findViewById.getResources().getDimension(R.dimen.clips_template_editor_item_fragment_corner_radius), 6));
        findViewById.setClipToOutline(true);
        vkImageSimple.setOutlineProvider(new s0w0(vkImageSimple.getResources().getDimension(R.dimen.clips_template_editor_item_fragment_corner_radius), 6));
        vkImageSimple.setClipToOutline(true);
        bwt0.i0(this.itemView, new wje(this, 2));
    }

    @Override // xsna.vif0
    public final void i6(o7f o7fVar) {
        o7f o7fVar2 = o7fVar;
        if (o7fVar2 == null) {
            return;
        }
        Bitmap bitmap = o7fVar2.c;
        View view = this.o;
        VkImageSimple vkImageSimple = this.p;
        if (bitmap == null) {
            vkImageSimple.setImageBitmap(null);
            f4m.j(vkImageSimple);
            view.setVisibility(0);
        } else {
            f4m.j(view);
            vkImageSimple.setVisibility(0);
            vkImageSimple.setSelected(o7fVar2.d);
            vkImageSimple.setImageBitmap(bitmap);
        }
        this.q.setText(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(o7fVar2.b.d() / 1000.0f)}, 1)));
    }
}

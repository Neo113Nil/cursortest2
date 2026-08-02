package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VkSegmentContent.kt */
/* loaded from: classes17.dex */
public final class ajv0 extends LinearLayout implements too0 {
    public final TextView b;
    public final ImageView c;

    public ajv0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_segment_content, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(android.R.id.text1);
        textView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_headline2, context));
        textView.setIncludeFontPadding(false);
        this.b = textView;
        this.c = (ImageView) findViewById(android.R.id.icon);
        a();
        int a = e3m.a(R.dimen.vk_ui_spacing_size_xl, context);
        f4m.l(a, a, this);
        setOrientation(0);
        setGravity(17);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        getContext();
        int d = gpo0.d(R.attr.vk_ui_text_primary, this);
        this.b.setTextColor(new ColorStateList(new int[][]{new int[]{-16842913}, new int[]{android.R.attr.state_selected}}, new int[]{gpo0.d(R.attr.vk_ui_text_primary, this), d}));
        this.c.setImageTintList(i35.l(this));
    }
}

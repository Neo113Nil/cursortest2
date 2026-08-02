package xsna;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgPartChannelAttachStubDocPreviewHolder.kt */
/* loaded from: classes2.dex */
public final class vo30 extends hr30<AttachDoc, wo30> {
    public VKEnhancedImageView d;
    public Context e;
    public View f;
    public ShapeDrawable g;
    public final Object h;
    public final Object i;
    public final Object j;
    public TextView k;
    public TimeAndStatusView l;
    public final StringBuilder m;

    public vo30() {
        uw3 uw3Var = new uw3(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, uw3Var);
        this.i = msy.a(lazyThreadSafetyMode, new tzv(this, 11));
        this.j = msy.a(lazyThreadSafetyMode, new k7y(this, 12));
        this.m = new StringBuilder();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(wo30 wo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        wo30 wo30Var2 = wo30Var;
        AttachChannelStub attachChannelStub = wo30Var2.b;
        boolean z = wo30Var2.m;
        ?? r10 = this.j;
        if (z) {
            VKEnhancedImageView vKEnhancedImageView = this.d;
            if (vKEnhancedImageView == null) {
                vKEnhancedImageView = null;
            }
            vKEnhancedImageView.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            VKEnhancedImageView vKEnhancedImageView2 = this.d;
            if (vKEnhancedImageView2 == null) {
                vKEnhancedImageView2 = null;
            }
            vKEnhancedImageView2.setMaximumWidth(((Number) r10.getValue()).intValue());
        }
        int i = attachChannelStub.d;
        int i2 = attachChannelStub.c;
        double d = i / i2;
        if (d >= 1.0d) {
            VKEnhancedImageView vKEnhancedImageView3 = this.d;
            if (vKEnhancedImageView3 == null) {
                vKEnhancedImageView3 = null;
            }
            int g = swe0.g(i, vKEnhancedImageView3.getMinimumWidth(), ((Number) r10.getValue()).intValue());
            VKEnhancedImageView vKEnhancedImageView4 = this.d;
            if (vKEnhancedImageView4 == null) {
                vKEnhancedImageView4 = null;
            }
            vKEnhancedImageView4.setMinimumWidth(g);
            VKEnhancedImageView vKEnhancedImageView5 = this.d;
            if (vKEnhancedImageView5 == null) {
                vKEnhancedImageView5 = null;
            }
            vKEnhancedImageView5.setMinimumHeight((int) (g / d));
        } else {
            VKEnhancedImageView vKEnhancedImageView6 = this.d;
            if (vKEnhancedImageView6 == null) {
                vKEnhancedImageView6 = null;
            }
            int g2 = swe0.g(i2, vKEnhancedImageView6.getMinimumHeight(), ((Number) this.i.getValue()).intValue());
            VKEnhancedImageView vKEnhancedImageView7 = this.d;
            if (vKEnhancedImageView7 == null) {
                vKEnhancedImageView7 = null;
            }
            vKEnhancedImageView7.setMinimumHeight(g2);
            VKEnhancedImageView vKEnhancedImageView8 = this.d;
            if (vKEnhancedImageView8 == null) {
                vKEnhancedImageView8 = null;
            }
            vKEnhancedImageView8.setMinimumWidth((int) (g2 * d));
        }
        StringBuilder sb = this.m;
        sb.setLength(0);
        String str = attachChannelStub.h;
        if (!drm0.N(str)) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(" · ");
        }
        lar larVar = lar.a;
        long j = attachChannelStub.g;
        larVar.getClass();
        lar.b(j, sb);
        TextView textView = this.k;
        if (textView == null) {
            textView = null;
        }
        textView.setText(sb);
        jr30 jr30Var = wo30Var2.d;
        TimeAndStatusView timeAndStatusView = this.l;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, true);
        Context context = this.e;
        if (context == null) {
            context = null;
        }
        int m0 = wo30Var2.m0(context);
        Context context2 = this.e;
        if (context2 == null) {
            context2 = null;
        }
        int g3 = wo30Var2.g(context2);
        VKEnhancedImageView vKEnhancedImageView9 = this.d;
        if (vKEnhancedImageView9 == null) {
            vKEnhancedImageView9 = null;
        }
        vKEnhancedImageView9.Y0(m0, m0, g3, g3);
        float max = Math.max(m0, g3);
        ShapeDrawable shapeDrawable = this.g;
        if (shapeDrawable == null) {
            shapeDrawable = null;
        }
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = max;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_doc_preview_image, viewGroup, false);
        this.f = inflate;
        f4m.j(inflate.findViewById(R.id.selection_mask));
        View view = this.f;
        if (view == null) {
            view = null;
        }
        f4m.j(view.findViewById(R.id.upload));
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        this.e = view2.getContext();
        View view3 = this.f;
        if (view3 == null) {
            view3 = null;
        }
        this.k = (TextView) view3.findViewById(R.id.label_default);
        View view4 = this.f;
        if (view4 == null) {
            view4 = null;
        }
        this.l = (TimeAndStatusView) view4.findViewById(R.id.timeAndStatus);
        View view5 = this.f;
        if (view5 == null) {
            view5 = null;
        }
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view5.findViewById(R.id.image);
        this.d = vKEnhancedImageView;
        vKEnhancedImageView.setClipToOutline(true);
        VKEnhancedImageView vKEnhancedImageView2 = this.d;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(-1);
        this.g = shapeDrawable;
        VKEnhancedImageView vKEnhancedImageView3 = this.d;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        vKEnhancedImageView3.setBackground(shapeDrawable);
        VKEnhancedImageView vKEnhancedImageView4 = this.d;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        vKEnhancedImageView4.setImageDrawable((com.vk.core.view.shimmer.a) this.h.getValue());
        View view6 = this.f;
        if (view6 == null) {
            return null;
        }
        return view6;
    }
}

package xsna;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgPartChannelAttachStubPhotoHolder.kt */
/* loaded from: classes2.dex */
public final class xo30 extends hr30<Attach, wo30> {
    public Context d;
    public ShapeDrawable e;
    public FrameLayout f;
    public VKEnhancedImageView g;
    public TimeAndStatusView h;
    public final v5t i = new v5t(R.layout.vkim_msg_part_channel_attach_stub);
    public final Object j;
    public final Object k;

    public xo30() {
        x5 x5Var = new x5(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, x5Var);
        this.k = msy.a(lazyThreadSafetyMode, new enh(this, 28));
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.m);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(wo30 wo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        wo30 wo30Var2 = wo30Var;
        if (wo30Var2.l) {
            VKEnhancedImageView vKEnhancedImageView = this.g;
            if (vKEnhancedImageView == null) {
                vKEnhancedImageView = null;
            }
            vKEnhancedImageView.setMaximumHeight(Integer.MAX_VALUE);
        } else {
            VKEnhancedImageView vKEnhancedImageView2 = this.g;
            if (vKEnhancedImageView2 == null) {
                vKEnhancedImageView2 = null;
            }
            vKEnhancedImageView2.setMaximumHeight(((Number) this.k.getValue()).intValue());
        }
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        f14 e = wo30Var2.e(context);
        float max = Math.max(e.a, e.b);
        AttachChannelStub attachChannelStub = wo30Var2.b;
        int i = attachChannelStub.d;
        int i2 = attachChannelStub.c;
        VKEnhancedImageView vKEnhancedImageView3 = this.g;
        VKEnhancedImageView vKEnhancedImageView4 = vKEnhancedImageView3 == null ? null : vKEnhancedImageView3;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams = vKEnhancedImageView3.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        vKEnhancedImageView4.setLayoutParams(layoutParams);
        ShapeDrawable shapeDrawable = this.e;
        if (shapeDrawable == null) {
            shapeDrawable = null;
        }
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = max;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        jr30 jr30Var = wo30Var2.d;
        TimeAndStatusView timeAndStatusView = this.h;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        View c = this.i.c(layoutInflater, viewGroup);
        FrameLayout frameLayout = (FrameLayout) c.findViewById(R.id.stub_container);
        this.f = frameLayout;
        this.g = (VKEnhancedImageView) frameLayout.findViewById(R.id.stub_image);
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        this.h = (TimeAndStatusView) frameLayout2.findViewById(R.id.stub_time_status);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        frameLayout3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        FrameLayout frameLayout4 = this.f;
        if (frameLayout4 == null) {
            frameLayout4 = null;
        }
        frameLayout4.setClipToOutline(true);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(0);
        this.e = shapeDrawable;
        FrameLayout frameLayout5 = this.f;
        if (frameLayout5 == null) {
            frameLayout5 = null;
        }
        frameLayout5.setBackground(shapeDrawable);
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setMinimumWidth(0);
        VKEnhancedImageView vKEnhancedImageView2 = this.g;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setMinimumHeight(0);
        VKEnhancedImageView vKEnhancedImageView3 = this.g;
        VKEnhancedImageView vKEnhancedImageView4 = vKEnhancedImageView3 != null ? vKEnhancedImageView3 : null;
        ?? r5 = this.j;
        vKEnhancedImageView4.setImageDrawable((com.vk.core.view.shimmer.a) r5.getValue());
        ((com.vk.core.view.shimmer.a) r5.getValue()).c();
        return c;
    }
}

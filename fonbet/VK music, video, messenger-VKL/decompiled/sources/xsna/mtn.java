package xsna;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: DocStubViewHolder.kt */
/* loaded from: classes2.dex */
public final class mtn extends wr6 {
    public final VKEnhancedImageView d;
    public final TextView e;
    public final StringBuilder f;

    public mtn(View view) {
        super(view, 6);
        this.d = (VKEnhancedImageView) view.findViewById(R.id.image);
        this.e = (TextView) view.findViewById(R.id.label_default);
        this.f = new StringBuilder();
        f4m.j(view.findViewById(R.id.label_play));
        f4m.j(view.findViewById(R.id.upload));
        float d = e3m.d(R.attr.im_msg_part_corner_radius_big, view.getContext());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = d;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(-1);
        this.d.setBackground(shapeDrawable);
        this.d.setCornerRadius(d);
        this.d.setClipToOutline(true);
        this.d.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        VKEnhancedImageView vKEnhancedImageView = this.d;
        com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        aVar.b(((Shimmer.c) cVar.d()).a());
        aVar.c();
        vKEnhancedImageView.setImageDrawable(aVar);
    }

    @Override // xsna.wr6
    public final void b(Msg msg, NestedMsg nestedMsg, Attach attach, pk30 pk30Var) {
        AttachChannelStub attachChannelStub = (AttachChannelStub) attach;
        StringBuilder sb = this.f;
        sb.setLength(0);
        String str = attachChannelStub.h;
        if (!drm0.N(str)) {
            sb.append(str.toUpperCase(Locale.getDefault()));
            sb.append(" · ");
        }
        lar larVar = lar.a;
        long j = attachChannelStub.g;
        larVar.getClass();
        lar.b(j, sb);
        TextView textView = this.e;
        textView.setText(sb);
        textView.setVisibility(0);
    }

    @Override // xsna.wr6
    public final void f(xuj xujVar) {
        this.d.setCornerRadius(xujVar);
    }

    @Override // xsna.wr6
    public final void c(int i) {
    }

    @Override // xsna.wr6
    public final void d(int i) {
    }

    @Override // xsna.wr6
    public final void e(int i, int i2, int i3) {
    }
}

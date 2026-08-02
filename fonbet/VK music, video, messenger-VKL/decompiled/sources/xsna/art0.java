package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vkontakte.android.R;

/* compiled from: VideoViewHolder.java */
/* loaded from: classes2.dex */
public final class art0 extends wr6 {
    public final FrescoImageView d;
    public final TextView e;
    public final InteractiveDurationView f;
    public final r3e0 g;
    public final ek30 h;
    public final coo i;
    public final StringBuilder j;
    public final View k;
    public pk30 l;
    public io.reactivex.rxjava3.disposables.c m;
    public Msg n;
    public NestedMsg o;
    public AttachVideo p;

    /* compiled from: VideoViewHolder.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            art0 art0Var = art0.this;
            pk30 pk30Var = art0Var.l;
            if (pk30Var != null) {
                pk30Var.R(art0Var.p, art0Var.n, art0Var.o);
            }
        }
    }

    /* compiled from: VideoViewHolder.java */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            art0 art0Var = art0.this;
            pk30 pk30Var = art0Var.l;
            if (pk30Var == null) {
                return false;
            }
            pk30Var.X(art0Var.p, art0Var.n, art0Var.o);
            return true;
        }
    }

    public art0(View view) {
        super(view, 2);
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vkim_restriction_container);
        View e = fxc0.B().Q().e(context, iah0.a(2));
        this.k = e;
        viewGroup.addView(e);
        FrescoImageView frescoImageView = (FrescoImageView) view.findViewById(R.id.image);
        this.d = frescoImageView;
        this.e = (TextView) view.findViewById(R.id.label);
        this.f = (InteractiveDurationView) view.findViewById(R.id.interactive_duration);
        ek30 ek30Var = new ek30(context, 0);
        this.h = ek30Var;
        this.g = new r3e0((ProgressView) view.findViewById(R.id.upload), null, new rbe(this, 7));
        this.i = new coo(context);
        this.j = new StringBuilder();
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, context);
        frescoImageView.setPlaceholder(ek30Var);
        float f = d;
        fxc0.B().Q().a(e, f, f, f, f);
        frescoImageView.setCornerRadius(d);
        wng0.e(d, ek30Var);
        jjc.f(new a(), view);
        view.setOnLongClickListener(new b());
    }

    @Override // xsna.wr6
    public final void b(Msg msg, NestedMsg nestedMsg, Attach attach, pk30 pk30Var) {
        this.l = pk30Var;
        this.n = msg;
        this.o = nestedMsg;
        AttachVideo attachVideo = (AttachVideo) attach;
        this.p = attachVideo;
        VideoFile videoFile = attachVideo.b;
        fxc0.B().Q().d(this.k, videoFile, this.d, new fm3(this, 2), new brt0(this), null);
        StringBuilder sb = this.j;
        sb.setLength(0);
        int duration = this.p.b.getDuration();
        this.i.getClass();
        coo.b(duration, sb);
        boolean W9 = this.p.b.W9();
        InteractiveDurationView interactiveDurationView = this.f;
        TextView textView = this.e;
        if (W9) {
            interactiveDurationView.setVisibility(0);
            textView.setVisibility(4);
            interactiveDurationView.setTextDescriptionVisible(false);
            interactiveDurationView.setDurationText(sb);
        } else {
            interactiveDurationView.setVisibility(8);
            if (this.p.n.i() || fxc0.B().c(this.p.b)) {
                textView.setVisibility(4);
            } else {
                textView.setVisibility(0);
                if (TextUtils.isEmpty(this.p.getPlatform())) {
                    textView.setText(sb);
                } else {
                    textView.setText(this.p.getPlatform());
                }
            }
        }
        this.g.a(this.p);
        textView.setContentDescription("");
    }

    @Override // xsna.wr6
    public final void c(int i) {
        this.g.b(i);
    }

    @Override // xsna.wr6
    public final void d(int i) {
        this.g.c(i);
    }

    @Override // xsna.wr6
    public final void e(int i, int i2, int i3) {
        this.g.d(i, i2, i3);
    }

    @Override // xsna.wr6
    public final void f(xuj xujVar) {
        fxc0.B().Q().a(this.k, xujVar.a, xujVar.b, xujVar.d, xujVar.c);
        this.d.setCornerRadius(xujVar);
        this.h.d(xujVar);
    }
}

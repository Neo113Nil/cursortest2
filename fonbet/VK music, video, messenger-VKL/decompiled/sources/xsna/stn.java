package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vkontakte.android.R;

/* compiled from: DocViewHolder.java */
/* loaded from: classes2.dex */
public final class stn extends wr6 {
    public final VKEnhancedImageView d;
    public final TextView e;
    public final TextView f;
    public final r3e0 g;
    public final StringBuilder h;
    public final ek30 i;
    public pk30 j;
    public Msg k;
    public NestedMsg l;
    public AttachDoc m;

    /* compiled from: DocViewHolder.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            stn stnVar = stn.this;
            pk30 pk30Var = stnVar.j;
            if (pk30Var != null) {
                pk30Var.O(stnVar.m);
            }
        }
    }

    /* compiled from: DocViewHolder.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            stn stnVar = stn.this;
            pk30 pk30Var = stnVar.j;
            if (pk30Var != null) {
                pk30Var.R(stnVar.m, stnVar.k, stnVar.l);
            }
        }
    }

    /* compiled from: DocViewHolder.java */
    public class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            stn stnVar = stn.this;
            pk30 pk30Var = stnVar.j;
            if (pk30Var == null) {
                return false;
            }
            pk30Var.X(stnVar.m, stnVar.k, stnVar.l);
            return true;
        }
    }

    public stn(View view) {
        super(view, 3);
        Context context = view.getContext();
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view.findViewById(R.id.image);
        this.d = vKEnhancedImageView;
        this.e = (TextView) view.findViewById(R.id.label_default);
        this.f = (TextView) view.findViewById(R.id.label_play);
        this.g = new r3e0((ProgressView) view.findViewById(R.id.upload), null, new a());
        this.h = new StringBuilder();
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, context);
        ek30 ek30Var = new ek30(context, d);
        this.i = ek30Var;
        vKEnhancedImageView.setPlaceholder(ek30Var);
        vKEnhancedImageView.setCornerRadius(d);
        jjc.f(new b(), view);
        view.setOnLongClickListener(new c());
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override // xsna.wr6
    public final void b(Msg msg, NestedMsg nestedMsg, Attach attach, pk30 pk30Var) {
        this.j = pk30Var;
        this.k = msg;
        this.l = nestedMsg;
        AttachDoc attachDoc = (AttachDoc) attach;
        this.m = attachDoc;
        ImageList imageList = attachDoc.p;
        VKEnhancedImageView vKEnhancedImageView = this.d;
        vKEnhancedImageView.setLocalImage(imageList);
        vKEnhancedImageView.setRemoteImage(this.m.n);
        StringBuilder sb = this.h;
        sb.setLength(0);
        sb.append(this.m.j.toUpperCase());
        sb.append(" · ");
        lar larVar = lar.a;
        long j = this.m.h;
        larVar.getClass();
        lar.b(j, sb);
        boolean equalsIgnoreCase = "gif".equalsIgnoreCase(this.m.j);
        TextView textView = this.e;
        TextView textView2 = this.f;
        if (equalsIgnoreCase) {
            textView2.setText(sb);
            textView2.setVisibility(0);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else {
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            textView.setText(sb);
            textView.setVisibility(0);
        }
        this.g.a(this.m);
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
        this.i.d(xujVar);
        this.d.setCornerRadius(xujVar);
    }
}

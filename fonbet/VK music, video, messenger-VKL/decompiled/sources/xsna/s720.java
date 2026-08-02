package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ffj;
import xsna.tlo0;

/* compiled from: MenuItemViewHolder.kt */
/* loaded from: classes17.dex */
public final class s720<MenuKey> extends rxt0<ffj.c<MenuKey>> {
    public static final /* synthetic */ int q = 0;
    public final ImageView l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public ffj.c<MenuKey> p;

    public s720(View view, cde cdeVar) {
        super(view);
        this.l = (ImageView) view.findViewById(R.id.left_icon);
        this.m = (ImageView) view.findViewById(R.id.right_icon);
        this.n = (TextView) view.findViewById(R.id.title);
        this.o = (TextView) view.findViewById(R.id.detail);
        this.itemView.setOnClickListener(new j1l(1, this, cdeVar));
    }

    @Override // xsna.rxt0
    public final void V5(ffj ffjVar) {
        ffj.c<MenuKey> cVar = (ffj.c) ffjVar;
        this.p = cVar;
        ffj.c.a aVar = cVar.c;
        ImageView imageView = this.l;
        if (aVar != null) {
            imageView.setColorFilter(krv0.m(aVar.b.intValue(), this.itemView.getContext()));
            bwt0.m0(-2, -2, imageView);
            imageView.setImageResource(aVar.a);
        }
        f4m.E(imageView, aVar != null);
        f4m.E(this.m, false);
        tlo0.f fVar = cVar.a;
        Context context = this.itemView.getContext();
        fVar.getClass();
        this.n.setText(tlo0.b.a(fVar, context));
        TextView textView = this.o;
        textView.setText((CharSequence) null);
        f4m.E(textView, false);
    }
}

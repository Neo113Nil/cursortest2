package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.zez;

/* compiled from: ClipsListHashtagViewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class afz extends vif0<zez.a> implements View.OnClickListener {
    public final dfe n;
    public final TextView o;
    public final ImageView p;

    public afz(ViewGroup viewGroup, dfe dfeVar) {
        super(viewGroup, R.layout.clips_hashtag_view, 0);
        this.n = dfeVar;
        this.o = (TextView) this.itemView.findViewById(R.id.tv_clips_hashtag);
        this.p = (ImageView) this.itemView.findViewById(R.id.clips_hashtag_trending_icon);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(zez.a aVar) {
        zez.a aVar2 = aVar;
        String str = aVar2.a;
        if (!brm0.B(str, "#", false)) {
            str = "#".concat(str);
        }
        TextView textView = this.o;
        textView.setText(str);
        boolean z = aVar2.b;
        ImageView imageView = this.p;
        if (z) {
            f4m.r(iah0.a(42), textView);
            bwt0.p0(imageView, true);
        } else {
            f4m.r(iah0.a(0), textView);
            bwt0.p0(imageView, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zez.a aVar = (zez.a) this.m;
        o5f o5fVar = new o5f(aVar.a, aVar.b);
        getAdapterPosition();
        this.n.c(o5fVar);
    }
}

package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: GeoLocationItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class xkt extends vfz<ykt> {
    public final w8 l;
    public final ebx m;
    public final TextView n;
    public final Button o;
    public final ImageView p;
    public final k800 q;
    public boolean r;
    public Integer s;

    public xkt(ViewGroup viewGroup, w8 w8Var, ebx ebxVar) {
        super(R.layout.search_params_location_item, viewGroup);
        this.l = w8Var;
        this.m = ebxVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.icon);
        this.n = (TextView) this.itemView.findViewById(R.id.subtitle);
        Button button = (Button) this.itemView.findViewById(R.id.subtitle_action);
        this.o = button;
        this.p = (ImageView) this.itemView.findViewById(R.id.search_database_item_selected_indicator);
        k800 k800Var = new k800();
        this.q = k800Var;
        Context context = this.itemView.getContext();
        q700.h(context, R.raw.location_outline_animation_28, q700.o(R.raw.location_outline_animation_28, context)).b(new r800() { // from class: xsna.ukt
            @Override // xsna.r800
            public final void onResult(Object obj) {
                xkt.this.q.s((i700) obj);
            }
        });
        k800Var.c.addListener(new wkt(this));
        imageView.setImageDrawable(k800Var);
        button.addOnLayoutChangeListener(new vkt(this, 0));
    }

    @Override // xsna.vfz
    public final void W5(ykt yktVar) {
        ykt yktVar2 = yktVar;
        yktVar2.getClass();
        boolean z = yktVar2.e;
        String str = yktVar2.c;
        if (str == null) {
            Integer num = yktVar2.d;
            str = num != null ? this.itemView.getContext().getString(num.intValue()) : null;
        }
        TextView textView = this.n;
        textView.setText(str);
        textView.setMaxLines(z ? Integer.MAX_VALUE : 1);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        Integer num2 = this.s;
        k800 k800Var = this.q;
        if (num2 == null || 1 != num2.intValue()) {
            this.r = false;
            if (k800Var.m()) {
                k800Var.d();
                k800Var.t((int) k800Var.c.j());
            }
        }
        boolean z2 = yktVar2.g;
        if (z2 != this.r) {
            this.r = z2;
            if (z2 && !k800Var.m()) {
                k800Var.p();
            }
        }
        this.p.setVisibility(yktVar2.f ? 0 : z ? 4 : 8);
        Integer num3 = yktVar2.h;
        Button button = this.o;
        if (num3 != null) {
            button.setText(num3.intValue());
            button.setVisibility(0);
            button.setOnClickListener(new dkc(1, this, yktVar2));
        } else {
            button.setVisibility(8);
            button.setOnClickListener(null);
        }
        this.itemView.setOnClickListener(new ckc(1, this, yktVar2));
        this.s = 1;
    }
}

package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: PlaybackSpeedAdapter.kt */
/* loaded from: classes3.dex */
public final class pya0 extends zoj0<Integer, a> {
    public final int e = 26;
    public final d410 f;

    /* compiled from: PlaybackSpeedAdapter.kt */
    public static final class a extends vif0<Integer> {
        public final izs<Integer, String> n;
        public final TextView o;

        public a(ViewGroup viewGroup, d410 d410Var) {
            super(viewGroup, R.layout.music_playback_speed_control_item, 0);
            this.n = d410Var;
            this.o = (TextView) this.itemView.findViewById(R.id.text);
        }

        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(Integer num) {
            q6(num.intValue());
        }

        public final void q6(int i) {
            int i2 = (i + 10) % 5;
            TextView textView = this.o;
            if (i2 != 0) {
                textView.setVisibility(4);
            } else {
                textView.setText(this.n.invoke(Integer.valueOf(i)));
                textView.setVisibility(0);
            }
        }
    }

    public pya0(d410 d410Var) {
        this.f = d410Var;
        setHasStableIds(true);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).q6(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.f);
    }
}

package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.ec40;
import xsna.k840;

/* compiled from: MusicTrackHeaderAdapter.kt */
/* loaded from: classes3.dex */
public final class qb50 extends g940<MusicTrack, se50<MusicTrack>> {
    public final MusicTrack e;
    public final int f;
    public final ec40.a<MusicTrack> g;
    public final boolean h;
    public final List<ec40<MusicTrack>> i;

    public qb50(MusicTrack musicTrack, int i, ec40.a<MusicTrack> aVar, boolean z, List<ec40<MusicTrack>> list) {
        this.e = musicTrack;
        this.f = i;
        this.g = aVar;
        this.h = z;
        this.i = list;
    }

    @Override // xsna.g940, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K0 */
    public final void onBindViewHolder(se50<MusicTrack> se50Var, int i) {
        se50Var.V5("", false, 0, this.e);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ub50 ub50Var = new ub50(null);
        ub50Var.d();
        ub50Var.g = this.f;
        if (this.h) {
            ub50Var.j = new rb50(this);
        }
        return new a(LayoutInflater.from(viewGroup.getContext()), ub50Var.a(viewGroup), this.i, this.g, this.e, this.h);
    }

    /* compiled from: MusicTrackHeaderAdapter.kt */
    public static final class a extends cg40<MusicTrack> implements MusicCountDownTimer.a {
        public final com.vk.music.player.d o;
        public final View p;
        public final TextView q;

        public a(LayoutInflater layoutInflater, ow2 ow2Var, List list, ec40.a aVar, MusicTrack musicTrack, boolean z) {
            super(ow2Var);
            com.vk.music.player.d dVar = k840.a.f;
            TextView textView = null;
            dVar = dVar == null ? null : dVar;
            this.o = dVar;
            View findViewById = this.itemView.findViewById(R.id.top_divider);
            this.p = findViewById;
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.audio_bottom_sheet_header_remaining_time);
            if (textView2 != null) {
                bwt0.p0(textView2, dVar.b());
                if (findViewById != null) {
                    bwt0.p0(findViewById, dVar.b());
                }
                textView = textView2;
            }
            this.q = textView;
            this.itemView.addOnAttachStateChangeListener(new pb50(this));
            LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.actions_block);
            if (linearLayout != null) {
                bwt0.p0(linearLayout, !list.isEmpty());
                linearLayout.setWeightSum(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ec40 ec40Var = (ec40) it.next();
                    ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.music_bottom_sheet_header_audio_item, (ViewGroup) linearLayout, false);
                    int i = ec40Var.a;
                    int i2 = ec40Var.e;
                    imageView.setId(i);
                    int Y = dhr0.Y(ec40Var.f, imageView.getContext());
                    if (i2 != -1) {
                        imageView.setImageDrawable(new baf0(m33.a(i2, imageView.getContext()), Y));
                    }
                    imageView.setContentDescription(ec40Var.a(this.itemView.getContext()));
                    imageView.setTag(ec40Var);
                    imageView.setOnClickListener(new sch(5, aVar, ec40Var));
                    linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                }
            }
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.audion_actions);
            if (viewGroup != null) {
                viewGroup.setVisibility(z ? 0 : 8);
            }
            if (musicTrack.Vb()) {
                ((ThumbsImageView) this.itemView.findViewById(R.id.audio_image)).setEmptyPlaceholder(R.drawable.vk_icon_podcast_24);
            }
            s0(this.o.d.b);
        }

        @Override // xsna.se50
        public final /* bridge */ /* synthetic */ void b6(Object obj) {
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void n0() {
            TextView textView = this.q;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            View view = this.p;
            if (view != null) {
                bwt0.p0(view, false);
            }
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void s0(long j) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int hours = (int) timeUnit.toHours(j);
            int minutes = (int) timeUnit.toMinutes(j);
            String f = hours > 0 ? enj.f(R.plurals.music_hours, hours, this.itemView.getContext()) : minutes > 0 ? enj.f(R.plurals.music_minutes, minutes, this.itemView.getContext()) : enj.f(R.plurals.music_seconds, (int) timeUnit.toSeconds(j), this.itemView.getContext());
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(this.itemView.getContext().getString(R.string.music_sleep_timer_remaining_time, f));
            }
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void u0() {
        }
    }
}

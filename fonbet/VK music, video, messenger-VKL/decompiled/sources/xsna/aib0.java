package xsna;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.d6v0;
import xsna.ec40;
import xsna.k840;

/* compiled from: PodcastPageBottomSheet.kt */
/* loaded from: classes3.dex */
public final class aib0 extends dc40 {
    public final u2b0 e;
    public final PodcastInfo f;
    public final izs<Integer, s3q0> g;
    public final boolean h;
    public final c i;

    /* compiled from: PodcastPageBottomSheet.kt */
    public static final class a extends RecyclerView.Adapter<b> {
        public final PodcastInfo c;
        public final ze5<Integer> d;

        public a(PodcastInfo podcastInfo, ze5<Integer> ze5Var) {
            this.c = podcastInfo;
            this.d = ze5Var;
            setHasStableIds(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return R.id.music_action_go_to_community;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            bVar.V5(this.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(viewGroup, this.d);
        }
    }

    /* compiled from: PodcastPageBottomSheet.kt */
    public static final class c implements ec40.a<Integer> {
        public c() {
        }

        @Override // xsna.ec40.a
        public final boolean a(Integer num) {
            int intValue = num.intValue();
            izs<Integer, s3q0> izsVar = aib0.this.g;
            if (izsVar == null) {
                return true;
            }
            izsVar.invoke(Integer.valueOf(intValue));
            return true;
        }

        @Override // xsna.ec40.a
        public final boolean b(ec40<Integer> ec40Var) {
            int i = ec40Var.a;
            aib0 aib0Var = aib0.this;
            aib0Var.g.invoke(Integer.valueOf(i));
            if (i != R.id.music_action_setting_player_timer) {
                return true;
            }
            Handler handler = x93.a;
            c63 c63Var = c63.a;
            Activity b = c63.b();
            if (b == null) {
                return true;
            }
            com.vk.music.player.d dVar = k840.a.f;
            if (dVar == null) {
                dVar = null;
            }
            List<Long> list = d6v0.d;
            new e6v0(d6v0.a.a(dVar), dVar, aib0Var.b).d(b);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aib0(u2b0 u2b0Var, PodcastInfo podcastInfo, izs<? super Integer, s3q0> izsVar, boolean z) {
        super(false);
        this.e = u2b0Var;
        this.f = podcastInfo;
        this.g = izsVar;
        this.h = z;
        this.i = new c();
    }

    @Override // xsna.dc40
    public final List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity) {
        u2b0 u2b0Var = this.e;
        boolean z = this.h;
        PodcastInfo podcastInfo = this.f;
        ndv0 ndv0Var = new ndv0(podcastInfo, u2b0Var, z);
        ze5 ze5Var = new ze5(this.i, this);
        ArrayList arrayList = new ArrayList();
        if (podcastInfo != null) {
            arrayList.add(new a(podcastInfo, ze5Var));
        }
        fc40 fc40Var = new fc40(ze5Var, this.b);
        fc40Var.setItems(ndv0Var.a());
        arrayList.add(fc40Var);
        return arrayList;
    }

    /* compiled from: PodcastPageBottomSheet.kt */
    public static final class b extends vif0<PodcastInfo> implements MusicCountDownTimer.a {
        public final com.vk.music.player.d n;
        public final ThumbsImageView o;
        public final TextView p;
        public final TextView q;
        public final View r;
        public final View s;
        public final TextView t;

        public b(ViewGroup viewGroup, ze5 ze5Var) {
            super(viewGroup, R.layout.music_bottom_sheet_header_podcast_redesign, 0);
            com.vk.music.player.d dVar = k840.a.f;
            dVar = dVar == null ? null : dVar;
            this.n = dVar;
            this.o = (ThumbsImageView) this.itemView.findViewById(R.id.audio_image);
            this.p = (TextView) this.itemView.findViewById(R.id.audio_title);
            this.q = (TextView) this.itemView.findViewById(R.id.audio_artist);
            TextView textView = (TextView) this.itemView.findViewById(R.id.adult_content_tv);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.foreign_agent_notice_tv);
            View findViewById = this.itemView.findViewById(R.id.audion_actions);
            this.r = findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.top_divider);
            this.s = findViewById2;
            TextView textView3 = (TextView) this.itemView.findViewById(R.id.audio_bottom_sheet_header_remaining_time);
            bwt0.p0(textView3, dVar.b());
            if (findViewById2 != null) {
                bwt0.p0(findViewById2, dVar.b());
            }
            this.t = textView3;
            this.itemView.addOnAttachStateChangeListener(new bib0(this));
            bwt0.i0(this.itemView, new kn20(ze5Var, 21));
            bwt0.p0(findViewById, true);
            bwt0.p0(textView, false);
            bwt0.p0(textView2, false);
            s0(dVar.d.b);
        }

        @Override // xsna.vif0
        public final void i6(PodcastInfo podcastInfo) {
            PodcastInfo podcastInfo2 = podcastInfo;
            this.o.setThumb(podcastInfo2.h);
            this.p.setText(podcastInfo2.b);
            String str = podcastInfo2.c;
            TextView textView = this.q;
            textView.setText(str);
            bwt0.p0(textView, !(str == null || str.length() == 0));
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void n0() {
            TextView textView = this.t;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            View view = this.s;
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
            TextView textView = this.t;
            if (textView != null) {
                textView.setText(this.itemView.getContext().getString(R.string.music_sleep_timer_remaining_time, f));
            }
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void u0() {
        }
    }
}

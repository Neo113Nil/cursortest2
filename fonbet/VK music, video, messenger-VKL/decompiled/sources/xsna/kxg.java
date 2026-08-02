package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: CommunityContentPodcastsAdapter.kt */
/* loaded from: classes5.dex */
public final class kxg extends zoj0<MusicTrack, se50<MusicTrack>> implements fsv<MusicTrack> {
    public final u2b0 e;
    public final gr3 f;

    /* compiled from: CommunityContentPodcastsAdapter.kt */
    public static final class a extends m.e<MusicTrack> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(MusicTrack musicTrack, MusicTrack musicTrack2) {
            return musicTrack.equals(musicTrack2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(MusicTrack musicTrack, MusicTrack musicTrack2) {
            return musicTrack.b == musicTrack2.b;
        }
    }

    /* compiled from: CommunityContentPodcastsAdapter.kt */
    public static final class b extends se50<MusicTrack> {
        public final vch n;

        static {
            int i = vch.e;
        }

        public b(vch vchVar) {
            super(vchVar);
            this.n = vchVar;
        }

        @Override // xsna.se50
        public final void b6(MusicTrack musicTrack) {
            MusicTrack musicTrack2 = musicTrack;
            vch vchVar = this.n;
            bwt0.S(vchVar.getThumbs(), new t6(musicTrack2, 24));
            Context context = vchVar.getContext();
            String str = musicTrack2.d;
            String str2 = musicTrack2.e;
            Float valueOf = Float.valueOf(vchVar.getTitle().getTextSize());
            ucp ucpVar = ucp.a;
            CharSequence j = ucp.j(s490.d(context, str, str2, R.attr.vk_ui_text_secondary), valueOf);
            VkText title = vchVar.getTitle();
            if (musicTrack2.s) {
                SpannableString spannableString = new SpannableString(((Object) j) + "  ");
                Context context2 = vchVar.getContext();
                e3m.a aVar = e3m.a;
                Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2);
                if (a != null) {
                    a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
                }
                ImageSpan imageSpan = a != null ? new ImageSpan(a, 1) : null;
                if (imageSpan != null) {
                    spannableString.setSpan(imageSpan, j.length() + 1, j.length() + 2, 33);
                }
                j = spannableString;
            }
            title.setText(j);
            VkText durationView = vchVar.getDurationView();
            durationView.setText(pq3.a(musicTrack2.f, durationView.getContext()));
            durationView.setContentDescription(f870.p(durationView.getContext(), musicTrack2.f, musicTrack2.s));
            boolean B = musicTrack2.B();
            vchVar.getDurationView().setEnabled(!B);
            float f = B ? 0.5f : 1.0f;
            vchVar.getTitle().setAlpha(f);
            vchVar.getThumbs().setAlpha(f);
        }
    }

    public kxg(u2b0 u2b0Var, gr3 gr3Var) {
        super(new com.vk.lists.a(new a()));
        this.e = u2b0Var;
        this.f = gr3Var;
    }

    @Override // xsna.fsv
    public final void Ig(int i, MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        if (musicTrack2 != null) {
            this.f.invoke(musicTrack2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((se50) e0Var).V5("", false, i, this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ub50 ub50Var = new ub50(null);
        b bVar = new b(new vch(viewGroup.getContext()));
        ub50Var.f = 4;
        ub50Var.l = bVar;
        ub50Var.c = false;
        ub50Var.e(null);
        ub50Var.m = this.e;
        ub50Var.j = this;
        return ub50Var.a(null);
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}

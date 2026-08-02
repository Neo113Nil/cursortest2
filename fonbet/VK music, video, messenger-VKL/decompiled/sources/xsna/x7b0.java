package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.VKSnippetImageView;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.view.MusicRoundPlayView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PlaylistCarouselItemHolder.kt */
/* loaded from: classes4.dex */
public final class x7b0 extends vif0<PlaylistsCarouselItem> implements View.OnClickListener {
    public static final int x = iah0.a(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
    public final boolean n;
    public final u2b0 o;
    public final lbf0 p;
    public final VKSnippetImageView q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final MusicRoundPlayView u;
    public final yu60 v;
    public final bv40 w;

    /* compiled from: PlaylistCarouselItemHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            x7b0 x7b0Var = x7b0.this;
            x7b0Var.w.a(x7b0Var.u);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            x7b0.this.w.b();
        }
    }

    /* compiled from: PlaylistCarouselItemHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            x7b0 x7b0Var = (x7b0) this.receiver;
            int i = x7b0.x;
            Playlist playlist = ((PlaylistsCarouselItem) x7b0Var.m).b;
            return Boolean.valueOf(epx.f(playlist != null ? playlist.Ib() : null, x7b0Var.o.x0().Kb()));
        }
    }

    public x7b0(ViewGroup viewGroup, boolean z, u2b0 u2b0Var, lbf0 lbf0Var) {
        super(viewGroup, R.layout.discover_playlist_carousel_item_holder, 0);
        this.n = z;
        this.o = u2b0Var;
        this.p = lbf0Var;
        VKSnippetImageView vKSnippetImageView = (VKSnippetImageView) this.itemView.findViewById(R.id.iv_image);
        this.q = vKSnippetImageView;
        this.r = (TextView) this.itemView.findViewById(R.id.playlist_title);
        this.s = (TextView) this.itemView.findViewById(R.id.playlist_subtitle);
        this.t = (ImageView) this.itemView.findViewById(R.id.vk_music_logo);
        this.u = (MusicRoundPlayView) this.itemView.findViewById(R.id.play_view);
        this.v = new yu60(this, 7);
        this.w = new bv40(u2b0Var, new b(0, this, x7b0.class, "isSamePlaylist", "isSamePlaylist()Z", 0));
        ((ImageView) this.itemView.findViewById(R.id.button_hide)).setOnClickListener(this);
        ((ConstraintLayout) this.itemView.findViewById(R.id.card_container)).setOnClickListener(this);
        this.itemView.addOnAttachStateChangeListener(new a());
        vKSnippetImageView.setType(8);
        vKSnippetImageView.setClipToOutline(true);
        vKSnippetImageView.setOutlineProvider(new s0w0(cn70.a() * 12.0f, 6));
    }

    @Override // xsna.vif0
    public final void i6(PlaylistsCarouselItem playlistsCarouselItem) {
        String str;
        Thumb thumb;
        Playlist playlist = playlistsCarouselItem.b;
        if (playlist == null) {
            return;
        }
        Thumb thumb2 = playlist.m;
        int i = x;
        VKSnippetImageView vKSnippetImageView = this.q;
        if (thumb2 != null) {
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            vKSnippetImageView.o0(thumb2.Ab(i, false), null);
        } else {
            List<Thumb> list = playlist.p;
            if (list == null || (thumb = (Thumb) j5g.a0(list)) == null) {
                str = null;
            } else {
                Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                str = thumb.Ab(i, false);
            }
            vKSnippetImageView.o0(str, null);
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        ne3 ne3Var = new ne3(this, 10);
        MusicRoundPlayView musicRoundPlayView = this.u;
        musicRoundPlayView.setOnClickListener(ne3Var);
        TextView textView = this.r;
        boolean z = this.n;
        awt0.v(textView, z);
        textView.setText(playlist.h);
        TextView textView2 = this.s;
        awt0.v(textView2, z);
        textView2.setText(playlist.i);
        awt0.v(this.t, z);
        awt0.v(musicRoundPlayView, true);
        this.w.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jcr jcrVar = jcr.c;
        int intValue = ((Number) this.v.invoke()).intValue();
        int id = view.getId();
        lbf0 lbf0Var = this.p;
        if (id == R.id.button_hide) {
            lbf0Var.a(kci.d, this, intValue);
            return;
        }
        if (id != R.id.play_view) {
            if (id == R.id.card_container) {
                lbf0Var.a(xus.c, this, intValue);
                return;
            }
            return;
        }
        Playlist playlist = ((PlaylistsCarouselItem) this.m).b;
        if (epx.f(playlist != null ? playlist.Ib() : null, this.o.x0().Kb())) {
            lbf0Var.a(jcrVar, this, getPosition());
            return;
        }
        MusicRoundPlayView musicRoundPlayView = this.u;
        if (musicRoundPlayView == null || musicRoundPlayView.a()) {
            return;
        }
        this.w.c();
        lbf0Var.a(jcrVar, this, getPosition());
    }
}

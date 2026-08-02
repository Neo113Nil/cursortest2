package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.e3m;
import xsna.k840;

/* compiled from: ClipsGridHeaderMusicHolder.kt */
/* loaded from: classes17.dex */
public final class gde extends RecyclerView.e0 implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ qcy<Object>[] u = {new MutablePropertyReference1Impl(gde.class, "addTrack", "getAddTrack()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, gde.class, "removeTrack", "getRemoveTrack()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a), new MutablePropertyReference1Impl(gde.class, "musicBus", "getMusicBus()Lio/reactivex/rxjava3/disposables/Disposable;", 0)};
    public final u2b0 l;
    public final MusicRestrictionPopupDisplayer m;
    public final MusicPlaybackLaunchContext n;
    public final d o;
    public final VkCell p;
    public final pgn q;
    public final pgn r;
    public final pgn s;
    public MusicTrack t;

    /* compiled from: ClipsGridHeaderMusicHolder.kt */
    public final class a implements VkCell.d {
        public final Context a;
        public final VkImageSimple b;

        public a(gde gdeVar, Context context) {
            this.a = context;
            VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
            vkImageSimple.setPadding(cn70.b(8), cn70.b(6), cn70.b(8), cn70.b(6));
            vkImageSimple.setBackground(dhr0.w(R.drawable.bg_circle, vkImageSimple.getContext()));
            vkImageSimple.setBackgroundTintList(ColorStateList.valueOf(dhr0.Y(R.attr.vk_ui_background_secondary, vkImageSimple.getContext())));
            vkImageSimple.setImageTintList(ColorStateList.valueOf(dhr0.Y(R.attr.vk_ui_icon_medium, vkImageSimple.getContext())));
            vkImageSimple.setContentDescription(vkImageSimple.getContext().getString(R.string.music_button_play));
            jjc.g(vkImageSimple, new ll1(4, vkImageSimple, gdeVar));
            this.b = vkImageSimple;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof b) {
                int i = ((b) fVar).a;
                e3m.a aVar = e3m.a;
                this.b.setImageDrawable(m33.a(i, this.a));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: ClipsGridHeaderMusicHolder.kt */
    public static final class b implements VkCell.f {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MusicPlayButtonViewParams(iconRes="), this.a, ')');
        }
    }

    /* compiled from: ClipsGridHeaderMusicHolder.kt */
    public static final class c implements VkCell.e {
        public c() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(gde.this, context);
        }
    }

    /* compiled from: ClipsGridHeaderMusicHolder.kt */
    public static final class d extends e.a {
        public d() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            int i;
            gde gdeVar = gde.this;
            VkCell vkCell = gdeVar.p;
            if (playState == PlayState.PLAYING) {
                if (epx.f(fVar != null ? fVar.f() : null, gdeVar.t)) {
                    i = R.drawable.vk_icon_pause_24;
                    vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new b(i), VkCell.Left.Main.Size.Small), null));
                }
            }
            i = R.drawable.vk_icon_play_24;
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new b(i), VkCell.Left.Main.Size.Small), null));
        }
    }

    public gde(ViewGroup viewGroup) {
        super(new VkCell(viewGroup.getContext(), null, 6, 0));
        this.l = k840.a.g().b();
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        this.m = aVar != null ? aVar : null;
        this.n = MusicPlaybackLaunchContext.G;
        this.o = new d();
        VkCell vkCell = (VkCell) this.itemView;
        vkCell.setLeftMainPictureController(new c());
        this.p = vkCell;
        this.q = new pgn();
        this.r = new pgn();
        this.s = new pgn();
        vkCell.setId(R.id.clips_grid_header_music_cell);
        vkCell.setPadding(cn70.b(0), cn70.b(6), cn70.b(0), cn70.b(6));
        vkCell.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.l.P0(this.o, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l.n0(this.o);
        qcy<Object>[] qcyVarArr = u;
        qcy<Object> qcyVar = qcyVarArr[0];
        this.q.b(null);
        qcy<Object> qcyVar2 = qcyVarArr[1];
        this.r.b(null);
        qcy<Object> qcyVar3 = qcyVarArr[2];
        this.s.b(null);
    }
}

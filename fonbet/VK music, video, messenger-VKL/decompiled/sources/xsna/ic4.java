package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.common.im.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.r5b0;
import xsna.tlo0;

/* compiled from: AudioAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class ic4 extends p1u0<AudioAttachListItem> {
    public final op4 a;

    /* compiled from: AudioAttachViewTypeDelegate.kt */
    public static final class a extends vfz<AudioAttachListItem> {
        public static final int o = iah0.a(48);
        public final op4 l;
        public final VkCell m;
        public final coo n;

        public a(View view, op4 op4Var) {
            super(view);
            this.l = op4Var;
            VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_cell_item);
            this.m = vkCell;
            this.n = new coo(view.getContext());
            vkCell.setLeftMainViewController(c.a);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AudioAttachListItem audioAttachListItem) {
            CharSequence charSequence;
            AudioAttachListItem audioAttachListItem2 = audioAttachListItem;
            AttachAudio attachAudio = audioAttachListItem2.b;
            VkCell.Left.a aVar = VkCell.Left.Companion;
            d dVar = new d(audioAttachListItem2.e, attachAudio);
            int i = o;
            VkCell.Left.b a = VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(dVar, new Size(i, i)));
            VkCell vkCell = this.m;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            MusicTrack musicTrack = attachAudio.b;
            if (musicTrack.g != 0) {
                String str = musicTrack.d;
                charSequence = cqm0.c(dhr0.t.c(R.attr.vk_ui_text_tertiary), str != null ? str : "");
            } else {
                String str2 = musicTrack.d;
                charSequence = str2 != null ? str2 : "";
            }
            tlo0.h f = u11.f(tlo0.Companion, charSequence);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
            VkCell.Middle.e eVar = new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            e14.a.getClass();
            CharSequence a2 = e14.a(attachAudio);
            if (attachAudio.b.g != 0) {
                a2 = cqm0.c(dhr0.t.c(R.attr.vk_ui_text_tertiary), a2);
            }
            VkCell.Middle.d dVar2 = new VkCell.Middle.d(new tlo0.h(a2), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
            tlo0.f fVar = null;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, dVar2, null, 12));
            VkCell.Right.c cVar = VkCell.Right.Companion;
            int i2 = musicTrack.f;
            coo cooVar = this.n;
            CharSequence a3 = cooVar.a(i2);
            if (musicTrack.g != 0) {
                a3 = cqm0.c(dhr0.t.c(R.attr.vk_ui_text_tertiary), a3);
            }
            vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.e(new tlo0.h(a3), new tlo0.h(cooVar.c(musicTrack.f))), null, new VkCell.Right.ExtraAction.d(new com.vk.movika.tools.controls.seekbar.f(1, this, audioAttachListItem2), fVar, 6), null, 26));
            bwt0.i0(vkCell, new uf1(5, this, audioAttachListItem2));
        }
    }

    /* compiled from: AudioAttachViewTypeDelegate.kt */
    public static final class b implements VkCell.d {
        public final VkEnhancedImageView a;
        public final AppCompatImageView b;
        public final FrameLayout c;

        /* compiled from: AudioAttachViewTypeDelegate.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AudioAttachListItem.State.values().length];
                try {
                    iArr[AudioAttachListItem.State.EMPTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AudioAttachListItem.State.PLAYING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AudioAttachListItem.State.PAUSED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(Context context) {
            VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(context, null, 6, 0);
            vkEnhancedImageView.setBgFillDrawable(R.drawable.bg_music_placeholder);
            vkEnhancedImageView.setPlaceholder(R.drawable.bg_music_item_placeholder);
            vkEnhancedImageView.setCornerRadius(cn70.c(4));
            this.a = vkEnhancedImageView;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setImportantForAccessibility(2);
            e3m.a aVar = e3m.a;
            appCompatImageView.setBackground(m33.a(R.drawable.bg_music_dark_round_rect, context));
            r5b0.b bVar = new r5b0.b(context);
            bVar.a(R.integer.vkim_playing_drawable_rect_count);
            bVar.g(R.dimen.vkim_playing_drawable_rect_width);
            bVar.d(R.dimen.music_playing_drawable_rect_corners);
            bVar.e(R.dimen.vkim_playing_drawable_rect_height);
            bVar.f(R.dimen.vkim_playing_drawable_rect_min_height);
            bVar.c(R.color.vk_white);
            bVar.b(R.dimen.vkim_playing_drawable_rect_gap);
            bVar.j = new float[]{cn70.c(10), cn70.c(16), cn70.c(18), cn70.c(10)};
            appCompatImageView.setImageDrawable(new r5b0(bVar));
            this.b = appCompatImageView;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(vkEnhancedImageView, new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(appCompatImageView, new ViewGroup.LayoutParams(-1, -1));
            this.c = frameLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof d) {
                d dVar = (d) fVar;
                String Kb = dVar.b.b.Kb(iah0.a(48));
                if (Kb != null) {
                    this.a.setRemoteImage(new Image(Kb));
                }
                int i = a.$EnumSwitchMapping$0[dVar.a.ordinal()];
                AppCompatImageView appCompatImageView = this.b;
                if (i == 1) {
                    appCompatImageView.setVisibility(8);
                } else if (i == 2) {
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setActivated(true);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setActivated(false);
                }
                this.c.setAlpha(dVar.b.b.g != 0 ? 0.5f : 1.0f);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.c;
        }
    }

    /* compiled from: AudioAttachViewTypeDelegate.kt */
    public static final class c implements VkCell.e {
        public static final c a = new c();

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: AudioAttachViewTypeDelegate.kt */
    public static final class d implements VkCell.f {
        public final AudioAttachListItem.State a;
        public final AttachAudio b;

        public d(AudioAttachListItem.State state, AttachAudio attachAudio) {
            this.a = state;
            this.b = attachAudio;
        }
    }

    public ic4(op4 op4Var) {
        this.a = op4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AudioAttachListItem> b(ViewGroup viewGroup) {
        viewGroup.getContext();
        return new a(bwt0.I(R.layout.vkim_cell_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AudioAttachListItem;
    }
}

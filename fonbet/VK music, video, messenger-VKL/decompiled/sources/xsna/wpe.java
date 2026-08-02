package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.recycler.ClipItem$MultiSelectCheckboxState;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsPickerListClipViewHolder.kt */
/* loaded from: classes16.dex */
public final class wpe extends vfz<g0d> {
    public final izs<com.vk.clips.playlists.ui.picker.a, s3q0> l;
    public final int m;
    public final boolean n;
    public final VkImageSimple o;
    public final VkPicture p;
    public final VkText q;
    public final View r;
    public final View s;

    /* compiled from: ClipsPickerListClipViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipItem$MultiSelectCheckboxState.values().length];
            try {
                iArr[ClipItem$MultiSelectCheckboxState.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipItem$MultiSelectCheckboxState.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipItem$MultiSelectCheckboxState.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wpe(ClipsPlaylistPickerFragment.b bVar, int i, boolean z, ViewGroup viewGroup) {
        super(R.layout.clips_playlists_picker_clip_item, viewGroup);
        this.l = bVar;
        this.m = i;
        this.n = z;
        this.o = (VkImageSimple) this.itemView.findViewById(R.id.playlists_picker_checkbox);
        this.p = (VkPicture) this.itemView.findViewById(R.id.playlists_picker_clip_preview);
        this.q = (VkText) this.itemView.findViewById(R.id.playlists_picker_clip_count_views);
        this.r = this.itemView.findViewById(R.id.playlists_picker_private);
        this.s = this.itemView.findViewById(R.id.playlists_picker_shadow);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(g0d g0dVar) {
        g0d g0dVar2 = g0dVar;
        int i = g0dVar2.e;
        boolean z = g0dVar2.g;
        if (z) {
            this.itemView.setOnClickListener(new wad(1, this, g0dVar2));
        } else {
            this.itemView.setOnClickListener(null);
        }
        awt0.v(this.s, !z);
        int i2 = a.$EnumSwitchMapping$0[g0dVar2.b.ordinal()];
        if (i2 != 1) {
            VkImageSimple vkImageSimple = this.o;
            if (i2 == 2) {
                vkImageSimple.setImageResource(R.drawable.vk_icon_check_circle_shadow_40);
                d3m.c(this.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vkImageSimple.setImageResource(R.drawable.vk_icon_circle_outline_shadow_40);
                d3m.c(this.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        } else {
            d3m.e(this.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        ImageSize Cb = g0dVar2.d.Cb(iah0.f().widthPixels / this.m, true, false);
        this.p.o0(Cb != null ? Cb.d.d : null, null);
        this.q.setText(this.n ? uqm0.h(i) : uqm0.l(i));
        awt0.v(this.r, g0dVar2.f);
    }
}

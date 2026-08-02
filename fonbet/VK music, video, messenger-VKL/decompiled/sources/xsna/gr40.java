package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.chart.ChartIcon;
import com.vk.dto.music.chart.ChartInfo;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;

/* compiled from: MusicOrderedTrackHolder.kt */
/* loaded from: classes3.dex */
public final class gr40 extends cg40<MusicTrack> {
    public final u2b0 o;
    public final wzs<Integer, MusicTrack, Boolean> p;
    public final boolean q;
    public int r;
    public final TextView s;
    public final VKImageView t;

    /* compiled from: MusicOrderedTrackHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartInfo.ChartIconCode.values().length];
            try {
                iArr[ChartInfo.ChartIconCode.CROWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartInfo.ChartIconCode.NEW_RELEASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartInfo.ChartIconCode.NO_CHANGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartInfo.ChartIconCode.MOVED_DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChartInfo.ChartIconCode.MOVED_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gr40(se50<MusicTrack> se50Var, u2b0 u2b0Var, wzs<? super Integer, ? super MusicTrack, Boolean> wzsVar, boolean z) {
        super(se50Var);
        this.o = u2b0Var;
        this.p = wzsVar;
        this.q = z;
        this.r = -1;
        this.s = (TextView) this.itemView.findViewById(R.id.audio_number);
        this.t = (VKImageView) this.itemView.findViewById(R.id.audio_chart_indicator);
    }

    @Override // xsna.cg40, xsna.se50
    public final void V5(String str, boolean z, int i, Object obj) {
        ChartInfo.ChartIconCode chartIconCode;
        List<ChartIcon> list;
        ChartIcon chartIcon;
        MusicTrack musicTrack = (MusicTrack) obj;
        this.r = i;
        ChartInfo chartInfo = musicTrack.D;
        if (chartInfo == null || (chartIconCode = chartInfo.c) == null) {
            chartIconCode = ChartInfo.ChartIconCode.NONE;
        }
        Pair pair = null;
        String str2 = (chartInfo == null || (list = chartInfo.d) == null || (chartIcon = (ChartIcon) j5g.a0(list)) == null) ? null : chartIcon.b;
        VKImageView vKImageView = this.t;
        if (vKImageView != null) {
            bwt0.p0(vKImageView, chartIconCode != ChartInfo.ChartIconCode.NONE);
            Context context = vKImageView.getContext();
            int i2 = a.$EnumSwitchMapping$0[chartIconCode.ordinal()];
            if (i2 == 1) {
                pair = new Pair(uko.d(R.drawable.vk_icon_crown_16, R.color.vk_orange, context), Integer.valueOf(R.string.music_talkback_chart_icon_crown));
            } else if (i2 == 2) {
                pair = new Pair(uko.d(R.drawable.vk_icon_new_16, R.color.vk_azure_300, context), Integer.valueOf(R.string.music_talkback_chart_icon_new_release));
            } else if (i2 == 3) {
                pair = new Pair(uko.d(R.drawable.vk_icon_minus_16, R.color.vk_steel_gray_250, context), Integer.valueOf(R.string.music_talkback_chart_icon_no_changes));
            } else if (i2 == 4) {
                pair = new Pair(uko.d(R.drawable.vk_icon_arrow_triangle_down_16, R.color.vk_red_nice, context), Integer.valueOf(R.string.music_talkback_chart_icon_moved_down));
            } else if (i2 == 5) {
                pair = new Pair(uko.d(R.drawable.vk_icon_arrow_triangle_up_16, R.color.vk_green, context), Integer.valueOf(R.string.music_talkback_chart_icon_moved_up));
            }
            if (pair != null) {
                Drawable drawable = (Drawable) pair.d();
                vKImageView.setContentDescription(vKImageView.getContext().getString(((Number) pair.g()).intValue()));
                if (str2 != null) {
                    vKImageView.setPlaceholderImage(drawable);
                    vKImageView.load(str2);
                } else {
                    vKImageView.setImageDrawable(drawable);
                }
            }
        }
        super.V5(str, z, i, musicTrack);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        i6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cg40, xsna.se50
    public final void i6() {
        super.i6();
        MusicTrack musicTrack = (MusicTrack) this.l;
        if (musicTrack != null) {
            String valueOf = (this.q && this.p.invoke(Integer.valueOf(this.r), musicTrack).booleanValue()) ? null : String.valueOf(this.r + 1);
            TextView textView = this.s;
            textView.setText(valueOf);
            MusicTrack b = this.o.b();
            boolean z = false;
            if (b != null && b.B()) {
                z = true;
            }
            textView.setEnabled(!z);
        }
    }
}

package one.video.controls.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.PlayPauseButtonView;
import one.video.controls.view.state.PlayPauseButtonViewState;
import xsna.hlo;
import xsna.o7j;
import xsna.wn80;
import xsna.y3j;

/* compiled from: PlayPauseButtonView.kt */
/* loaded from: classes8.dex */
public final class PlayPauseButtonView extends AppCompatImageView {
    public static final /* synthetic */ int d = 0;
    public final y3j b;
    public hlo c;

    /* compiled from: PlayPauseButtonView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayPauseButtonViewState.ImageType.values().length];
            try {
                iArr[PlayPauseButtonViewState.ImageType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayPauseButtonViewState.ImageType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PlayPauseButtonView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hlo hloVar = this.c;
        if (hloVar != null) {
            hloVar.a(canvas, getWidth(), getHeight());
        }
        super.draw(canvas);
    }

    public final hlo getDrawer() {
        return this.c;
    }

    public final void setDrawer(hlo hloVar) {
        this.c = hloVar;
        invalidate();
    }

    public PlayPauseButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PlayPauseButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PlayPauseButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PlayPauseButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int i3 = wn80.a;
        setBackgroundResource(R.drawable.one_video_button_drawable);
        setImageResource(R.drawable.one_video_icon_play_button_64);
        this.b = new y3j(new o7j() { // from class: xsna.jva0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i4;
                PlayPauseButtonViewState playPauseButtonViewState = (PlayPauseButtonViewState) obj;
                int i5 = PlayPauseButtonView.d;
                PlayPauseButtonViewState.ImageType imageType = playPauseButtonViewState.c;
                boolean z = playPauseButtonViewState.b;
                PlayPauseButtonView playPauseButtonView = PlayPauseButtonView.this;
                if (!z) {
                    playPauseButtonView.setVisibility(playPauseButtonViewState.a ? 0 : 8);
                }
                if (playPauseButtonView.getVisibility() == 0) {
                    int i6 = wn80.a;
                    int i7 = PlayPauseButtonView.a.$EnumSwitchMapping$0[imageType.ordinal()];
                    if (i7 == 1) {
                        i4 = R.drawable.one_video_icon_play_button_64;
                    } else {
                        if (i7 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = R.drawable.one_video_icon_pause_button_64;
                    }
                    playPauseButtonView.setImageResource(i4);
                }
            }
        });
    }
}

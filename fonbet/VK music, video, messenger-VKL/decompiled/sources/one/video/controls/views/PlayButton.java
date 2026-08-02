package one.video.controls.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.R$styleable;
import xsna.asp;
import xsna.hlo;
import xsna.ozl;
import xsna.wn80;
import xsna.zrp;

/* compiled from: PlayButton.kt */
@ozl
/* loaded from: classes8.dex */
public final class PlayButton extends AppCompatImageView {
    public int b;
    public int c;
    public int d;
    public hlo e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlayButton.kt */
    public static final class IconType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType PAUSE;
        public static final IconType PLAY;
        public static final IconType REPLAY;

        static {
            IconType iconType = new IconType("PLAY", 0);
            PLAY = iconType;
            IconType iconType2 = new IconType("PAUSE", 1);
            PAUSE = iconType2;
            IconType iconType3 = new IconType("REPLAY", 2);
            REPLAY = iconType3;
            IconType[] iconTypeArr = {iconType, iconType2, iconType3};
            $VALUES = iconTypeArr;
            $ENTRIES = new asp(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    /* compiled from: PlayButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = -1;
        int i = wn80.a;
        setBackgroundResource(R.drawable.one_video_highlight_video_play);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            int i2 = obtainStyledAttributes.getInt(0, -1);
            setIconType(i2 != 0 ? i2 != 1 ? i2 != 2 ? IconType.PLAY : IconType.REPLAY : IconType.PAUSE : IconType.PLAY);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setIconTypeInternalNew(IconType iconType) {
        int i = a.$EnumSwitchMapping$0[iconType.ordinal()];
        if (i == 1) {
            setImageResource(R.drawable.one_video_icon_play_36_new);
        } else if (i == 2) {
            setImageResource(R.drawable.one_video_icon_pause_36_new);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setImageResource(R.drawable.one_video_icon_replay_36_new);
        }
    }

    private final void setIconTypeInternalOld(IconType iconType) {
        int i = a.$EnumSwitchMapping$0[iconType.ordinal()];
        if (i == 1) {
            setImageResource(R.drawable.one_video_ic_play_shadow_96);
        } else if (i == 2) {
            setImageResource(R.drawable.one_video_ic_pause_shadow_96);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setImageResource(R.drawable.one_video_vk_icon_replay_36);
        }
    }

    @Override // android.view.View
    public final void dispatchDrawableHotspotChanged(float f, float f2) {
        super.dispatchDrawableHotspotChanged(getWidth() >> 1, getHeight() >> 1);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hlo hloVar = this.e;
        if (hloVar != null) {
            hloVar.a(canvas, getWidth(), getHeight());
        }
        super.draw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(getWidth() >> 1, getHeight() >> 1);
    }

    public final hlo getDrawer() {
        return this.e;
    }

    public final int getTargetBackgroundResource() {
        return this.b;
    }

    public final int getTargetImageResource() {
        return this.c;
    }

    public final int getTargetTint() {
        return this.d;
    }

    public final void setDrawer(hlo hloVar) {
        this.e = hloVar;
        invalidate();
    }

    public final void setIconType(IconType iconType) {
        int i = wn80.a;
        setIconTypeInternalOld(iconType);
    }

    public final void setTargetBackgroundResource(int i) {
        this.b = i;
    }

    public final void setTargetImageResource(int i) {
        this.c = i;
    }

    public final void setTargetTint(int i) {
        this.d = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            if (this.b != 0 && getBackground() == null) {
                setBackgroundResource(this.b);
            }
            if (this.c != 0 && getDrawable() == null) {
                setImageResource(this.c);
                if (this.d != -1) {
                    setImageTintList(ColorStateList.valueOf(getContext().getColor(this.d)));
                }
            }
        }
        super.setVisibility(i);
    }
}

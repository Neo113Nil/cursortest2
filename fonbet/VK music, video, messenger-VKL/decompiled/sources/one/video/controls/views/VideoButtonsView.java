package one.video.controls.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.BlendModeCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.buttons.CastButton;
import one.video.transform.TransformController;
import xsna.dp2;
import xsna.m33;
import xsna.ozl;
import xsna.pe7;
import xsna.s3q0;
import xsna.xwp0;

/* compiled from: VideoButtonsView.kt */
@ozl
/* loaded from: classes8.dex */
public final class VideoButtonsView extends ConstraintLayout implements xwp0 {
    public final ImageView A;
    public final ImageView B;
    public boolean C;
    public boolean D;
    public boolean E;
    public xwp0.b F;
    public TransformController.ScaleType G;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final CastButton z;

    /* compiled from: VideoButtonsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ControlsIcon.values().length];
            try {
                iArr[ControlsIcon.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ControlsIcon.VK_LOGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ControlsIcon.RESIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ControlsIcon.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ControlsIcon.PICTURE_IN_PICTURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ControlsIcon.CHROME_CAST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ControlsIcon.SMART_CAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ControlsIcon.BUGREPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ControlsIcon.FEEDBACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransformController.ScaleType.values().length];
            try {
                iArr2[TransformController.ScaleType.CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TransformController.ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VideoButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.F = new xwp0.b();
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.one_video_buttons_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.resize);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.fullscreen);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.settings);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.vk_logo);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.pip);
        this.x = imageView5;
        ImageView imageView6 = (ImageView) findViewById(R.id.chrome_cast);
        this.y = imageView6;
        CastButton castButton = (CastButton) findViewById(R.id.smart_cast);
        this.z = castButton;
        ImageView imageView7 = (ImageView) findViewById(R.id.bugreport);
        this.A = imageView7;
        ImageView imageView8 = (ImageView) findViewById(R.id.one_video_share_feedback);
        this.B = imageView8;
        imageView.setTag("resize");
        imageView2.setTag("fullscreen");
        imageView3.setTag("settings");
        imageView4.setTag("vk_logo");
        imageView5.setTag("pip");
        imageView6.setTag("chrome_cast");
        castButton.setTag("smart_cast");
        imageView7.setTag("bugreport");
        imageView8.setTag("share_feedback");
        if (isInEditMode()) {
            setBackgroundColor(context.getColor(R.color.one_video_gray_old));
        }
    }

    public static void U4(int i, View view) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).width = i;
        bVar.O = i;
        view.setLayoutParams(bVar);
    }

    public final void P4(xwp0.a aVar) {
        boolean z = aVar.b;
        boolean z2 = this.C;
        boolean z3 = aVar.a;
        if (z2 != z3) {
            this.C = z3;
            int i = z3 ? 4 : 0;
            ImageView imageView = this.t;
            ImageView imageView2 = this.v;
            if (i == 0 && z) {
                if (this.D) {
                    dp2.c(imageView2, null, true, 15);
                } else {
                    dp2.b(imageView2, null, 31);
                }
                if (this.E) {
                    dp2.b(imageView, null, 31);
                } else {
                    dp2.c(imageView, null, true, 15);
                }
            } else {
                imageView2.setVisibility(!this.D ? i : 8);
                if (!this.E) {
                    i = 8;
                }
                imageView.setVisibility(i);
                s3q0 s3q0Var = s3q0.a;
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.x.setAlpha((!z3 || z) ? 1.0f : 0.0f);
            this.y.setAlpha((!z3 || z) ? 1.0f : 0.0f);
            this.z.setAlpha((!z3 || z) ? 1.0f : 0.0f);
            this.A.setAlpha((!z3 || z) ? 1.0f : 0.0f);
            if (!z3 || z) {
                f = 1.0f;
            }
            this.B.setAlpha(f);
            if (z3) {
                setAlpha(1.0f);
                dp2.b(this, null, 31);
            }
        }
    }

    public final void Q4(ControlsIcon controlsIcon, boolean z) {
        View view;
        switch (a.$EnumSwitchMapping$0[controlsIcon.ordinal()]) {
            case 1:
                view = this.v;
                break;
            case 2:
                view = this.w;
                break;
            case 3:
                view = this.t;
                break;
            case 4:
                view = this.u;
                break;
            case 5:
                view = this.x;
                break;
            case 6:
                view = this.y;
                break;
            case 7:
                view = this.z;
                break;
            case 8:
                view = this.A;
                break;
            case 9:
                view = this.B;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        view.setVisibility(z ? 0 : 8);
    }

    public final void T4(ImageView imageView, int i) {
        Drawable a2 = m33.a(i, getContext());
        if (a2 != null) {
            a2.setColorFilter(pe7.a(getContext().getColor(R.color.one_video_white), BlendModeCompat.SRC_IN));
        }
        imageView.setImageDrawable(a2);
    }

    public final void setButtonsClickListener(View.OnClickListener onClickListener) {
        this.u.setOnClickListener(onClickListener);
        this.v.setOnClickListener(onClickListener);
        this.w.setOnClickListener(onClickListener);
        this.t.setOnClickListener(onClickListener);
        this.x.setOnClickListener(onClickListener);
        this.y.setOnClickListener(onClickListener);
        this.A.setOnClickListener(onClickListener);
        this.B.setOnClickListener(onClickListener);
        this.z.setOnClickListener(onClickListener);
    }

    public final void setButtonsSize(int i) {
        U4(i, this.t);
        U4(i, this.u);
        U4(i, this.v);
        U4(i, this.w);
        U4(i, this.x);
        U4(i, this.y);
        U4(i, this.z);
        U4(i, this.A);
        U4(i, this.B);
    }

    @Override // xsna.xwp0
    public void setChromeCastActive(boolean z) {
        ImageView imageView = this.y;
        if (z) {
            imageView.getDrawable().setTint(getContext().getColor(R.color.one_video_blue_300));
        } else {
            imageView.getDrawable().setTint(getContext().getColor(R.color.one_video_white));
        }
    }

    @Override // xsna.xwp0
    public void setFullScreenMode(boolean z) {
        ImageView imageView = this.u;
        if (z) {
            T4(imageView, R.drawable.one_video_icon_fullscreen_exit_24);
            imageView.setContentDescription(getContext().getString(R.string.one_video_accessibility_normal_mode));
        } else {
            T4(imageView, R.drawable.one_video_icon_fullscreen_24);
            imageView.setContentDescription(getContext().getString(R.string.one_video_accessibility_full_screen_mode));
        }
    }

    public final void setResizeButtonVisibility(boolean z) {
        this.E = z;
        this.t.setVisibility(z ? 0 : 8);
    }

    public void setResizeUiConfig(xwp0.b bVar) {
        if (bVar.equals(this.F)) {
            return;
        }
        this.F = bVar;
        TransformController.ScaleType scaleType = this.G;
        int i = scaleType == null ? -1 : a.$EnumSwitchMapping$1[scaleType.ordinal()];
        if (i != -1) {
            ImageView imageView = this.t;
            if (i == 1) {
                this.F.getClass();
                T4(imageView, R.drawable.one_video_icon_video_fill_none_24);
                imageView.setContentDescription(getContext().getString(R.string.one_video_accessibility_resize_none));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.F.getClass();
                T4(imageView, R.drawable.one_video_icon_video_fill_24);
                imageView.setContentDescription(getContext().getString(R.string.one_video_accessibility_resize));
            }
        }
    }

    public final void setTechBugreportButtonVisibility(boolean z) {
        this.A.setVisibility(z ? 0 : 8);
    }
}

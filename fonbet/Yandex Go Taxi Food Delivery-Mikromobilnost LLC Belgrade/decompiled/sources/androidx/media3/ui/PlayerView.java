package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import defpackage.a9z0;
import defpackage.cuh0;
import defpackage.czc0;
import defpackage.d6z;
import defpackage.do31;
import defpackage.dyc0;
import defpackage.dzc0;
import defpackage.ezc0;
import defpackage.fe10;
import defpackage.hzc0;
import defpackage.i0i0;
import defpackage.i9h0;
import defpackage.j2i0;
import defpackage.lxc0;
import defpackage.myc0;
import defpackage.ny61;
import defpackage.o83;
import defpackage.q60;
import defpackage.q801;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.tw21;
import defpackage.ud30;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.w3h0;
import defpackage.w820;
import defpackage.wnb0;
import defpackage.wxc0;
import defpackage.x60;
import defpackage.xaj;
import defpackage.xxc0;
import defpackage.y8z0;
import defpackage.yo90;
import defpackage.ypg0;
import defpackage.yxc0;
import defpackage.z7o;
import defpackage.zxc0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class PlayerView extends FrameLayout implements x60 {
    public static final int ARTWORK_DISPLAY_MODE_FILL = 2;
    public static final int ARTWORK_DISPLAY_MODE_FIT = 1;
    public static final int ARTWORK_DISPLAY_MODE_OFF = 0;
    public static final int IMAGE_DISPLAY_MODE_FILL = 1;
    public static final int IMAGE_DISPLAY_MODE_FIT = 0;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private int artworkDisplayMode;
    private final ImageView artworkView;
    private final View bufferingView;
    private final ComponentListener componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private dzc0 controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private boolean enableComposeSurfaceSyncWorkaround;
    private z7o errorMessageProvider;
    private final TextView errorMessageView;
    private final Class<?> exoPlayerClazz;
    private ezc0 fullscreenButtonClickListener;
    private int imageDisplayMode;
    private final Object imageOutput;
    private final ImageView imageView;
    private boolean keepContentOnPlayerReset;
    private myc0 legacyControllerVisibilityListener;
    private final Handler mainLooperHandler;
    private final FrameLayout overlayFrameLayout;
    private zxc0 player;
    private final Method setImageOutputMethod;
    private int showBuffering;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final hzc0 surfaceSyncGroupV34;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private boolean useController;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        int i11;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.mainLooperHandler = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.surfaceSyncGroupV34 = null;
            this.imageView = null;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            this.exoPlayerClazz = null;
            this.setImageOutputMethod = null;
            this.imageOutput = null;
            ImageView imageView = new ImageView(context);
            if (tw21.a >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i12 = cuh0.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j2i0.PlayerView, i, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(j2i0.PlayerView_shutter_background_color);
                int color = obtainStyledAttributes.getColor(j2i0.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(j2i0.PlayerView_player_layout_id, i12);
                boolean z8 = obtainStyledAttributes.getBoolean(j2i0.PlayerView_use_artwork, true);
                int i13 = obtainStyledAttributes.getInt(j2i0.PlayerView_artwork_display_mode, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(j2i0.PlayerView_default_artwork, 0);
                int i14 = obtainStyledAttributes.getInt(j2i0.PlayerView_image_display_mode, 0);
                th = null;
                boolean z9 = obtainStyledAttributes.getBoolean(j2i0.PlayerView_use_controller, true);
                int i15 = obtainStyledAttributes.getInt(j2i0.PlayerView_surface_type, 1);
                int i16 = obtainStyledAttributes.getInt(j2i0.PlayerView_resize_mode, 0);
                i2 = obtainStyledAttributes.getInt(j2i0.PlayerView_show_timeout, 5000);
                boolean z10 = obtainStyledAttributes.getBoolean(j2i0.PlayerView_hide_on_touch, true);
                boolean z11 = obtainStyledAttributes.getBoolean(j2i0.PlayerView_auto_show, true);
                int integer = obtainStyledAttributes.getInteger(j2i0.PlayerView_show_buffering, 0);
                this.keepContentOnPlayerReset = obtainStyledAttributes.getBoolean(j2i0.PlayerView_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z12 = obtainStyledAttributes.getBoolean(j2i0.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                i5 = resourceId2;
                z2 = z10;
                z5 = hasValue;
                i6 = i16;
                z4 = z12;
                i3 = resourceId;
                z = z9;
                z3 = z11;
                z6 = z8;
                i8 = i14;
                i10 = i13;
                i9 = color;
                i7 = i15;
                i4 = integer;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i2 = 5000;
            i3 = i12;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            i9 = 0;
            i10 = 1;
            z5 = false;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i3, (ViewGroup) this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(i9h0.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i6);
        }
        View findViewById = findViewById(i9h0.exo_shutter);
        this.shutterView = findViewById;
        if (findViewById != null && z5) {
            findViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.surfaceView = th;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.surfaceView = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    int i17 = SphericalGLSurfaceView.a;
                    this.surfaceView = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.surfaceView.setLayoutParams(layoutParams);
                    this.surfaceView.setOnClickListener(componentListener);
                    this.surfaceView.setClickable(false);
                    aspectRatioFrameLayout.addView(this.surfaceView, 0);
                } catch (Exception e) {
                    ny61.h("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i7 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (tw21.a >= 34) {
                    surfaceView.setSurfaceLifecycle(2);
                }
                this.surfaceView = surfaceView;
            } else {
                try {
                    int i18 = VideoDecoderGLSurfaceView.a;
                    this.surfaceView = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    ny61.h("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            z7 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(componentListener);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.surfaceSyncGroupV34 = tw21.a == 34 ? new hzc0() : null;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(i9h0.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(i9h0.exo_overlay);
        this.imageView = (ImageView) findViewById(i9h0.exo_image);
        this.imageDisplayMode = i8;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new czc0(0, this));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.exoPlayerClazz = cls;
        this.setImageOutputMethod = method;
        this.imageOutput = obj;
        ImageView imageView2 = (ImageView) findViewById(i9h0.exo_artwork);
        this.artworkView = imageView2;
        this.artworkDisplayMode = (!z6 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i5 != 0) {
            this.defaultArtwork = getContext().getDrawable(i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(i9h0.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View findViewById2 = findViewById(i9h0.exo_buffering);
        this.bufferingView = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.showBuffering = i4;
        TextView textView = (TextView) findViewById(i9h0.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i9h0.exo_controller);
        View findViewById3 = findViewById(i9h0.exo_controller_placeholder);
        if (playerControlView != null) {
            this.controller = playerControlView;
            i11 = 0;
        } else if (findViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.controller = playerControlView2;
            playerControlView2.setId(i9h0.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            i11 = 0;
            this.controller = null;
        }
        PlayerControlView playerControlView3 = this.controller;
        this.controllerShowTimeoutMs = playerControlView3 != null ? i2 : i11;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z3;
        this.controllerHideDuringAds = z4;
        this.useController = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            playerControlView3.hideImmediately();
            this.controller.addVisibilityListener(this.componentListener);
        }
        if (z) {
            setClickable(true);
        }
        updateContentDescription();
    }

    public static /* synthetic */ dzc0 access$2000(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    public static /* synthetic */ ezc0 access$2100(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    private void clearImageOutput(zxc0 zxc0Var) {
        Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(zxc0Var.getClass())) {
            return;
        }
        try {
            Method method = this.setImageOutputMethod;
            method.getClass();
            method.invoke(zxc0Var, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ny61.j(e);
        }
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        int i = w3h0.exo_edit_mode_logo;
        int i2 = tw21.a;
        imageView.setImageDrawable(resources.getDrawable(i, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(ypg0.exo_edit_mode_background_color));
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        int i = w3h0.exo_edit_mode_logo;
        int i2 = tw21.a;
        imageView.setImageDrawable(resources.getDrawable(i, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(ypg0.exo_edit_mode_background_color, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSelectedImageTrack() {
        zxc0 zxc0Var = this.player;
        return zxc0Var != null && this.imageOutput != null && zxc0Var.isCommandAvailable(30) && zxc0Var.getCurrentTracks().c(4);
    }

    private boolean hasSelectedVideoTrack() {
        zxc0 zxc0Var = this.player;
        return zxc0Var != null && zxc0Var.isCommandAvailable(30) && zxc0Var.getCurrentTracks().c(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAndClearImage() {
        hideImage();
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    private boolean isImageSet() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        zxc0 zxc0Var = this.player;
        return zxc0Var != null && zxc0Var.isCommandAvailable(16) && this.player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        onImageAvailable((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onImageAvailable$1(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (hasSelectedVideoTrack()) {
            return;
        }
        showImage();
        closeShutter();
    }

    private void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.isFullyVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean shouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || shouldShowControllerIndefinitely) {
                showController(shouldShowControllerIndefinitely);
            }
        }
    }

    private void onImageAvailable(Bitmap bitmap) {
        this.mainLooperHandler.post(new yo90(13, this, bitmap));
    }

    private boolean setArtworkFromMediaMetadata(zxc0 zxc0Var) {
        byte[] bArr;
        if (zxc0Var == null || !zxc0Var.isCommandAvailable(18) || (bArr = zxc0Var.getMediaMetadata().f) == null) {
            return false;
        }
        return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean setDrawableArtwork(Drawable drawable) {
        if (this.artworkView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.artworkDisplayMode == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                onContentAspectRatioChanged(this.contentFrame, f);
                this.artworkView.setScaleType(scaleType);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        updateImageViewAspectRatio();
    }

    private void setImageOutput(zxc0 zxc0Var) {
        Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(zxc0Var.getClass())) {
            return;
        }
        try {
            Method method = this.setImageOutputMethod;
            method.getClass();
            Object obj = this.imageOutput;
            obj.getClass();
            method.invoke(zxc0Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ny61.j(e);
        }
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean shouldShowControllerIndefinitely() {
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null) {
            return true;
        }
        int playbackState = zxc0Var.getPlaybackState();
        if (!this.controllerAutoShow) {
            return false;
        }
        if (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().q()) {
            return false;
        }
        if (playbackState != 1 && playbackState != 4) {
            zxc0 zxc0Var2 = this.player;
            zxc0Var2.getClass();
            if (zxc0Var2.getPlayWhenReady()) {
                return false;
            }
        }
        return true;
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    private void showImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
            updateImageViewAspectRatio();
        }
    }

    public static void switchTargetView(zxc0 zxc0Var, PlayerView playerView, PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(zxc0Var);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.isFullyVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        zxc0 zxc0Var = this.player;
        do31 videoSize = zxc0Var != null ? zxc0Var.getVideoSize() : do31.d;
        int i = videoSize.a;
        int i2 = videoSize.b;
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.c) / i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.player.getPlayWhenReady() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateBuffering() {
        boolean z;
        if (this.bufferingView != null) {
            zxc0 zxc0Var = this.player;
            if (zxc0Var != null && zxc0Var.getPlaybackState() == 2) {
                int i = this.showBuffering;
                z = true;
                if (i != 2) {
                    if (i == 1) {
                    }
                }
                this.bufferingView.setVisibility(z ? 0 : 8);
            }
            z = false;
            this.bufferingView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.isFullyVisible()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(i0i0.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(i0i0.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
            } else {
                zxc0 zxc0Var = this.player;
                if (zxc0Var != null) {
                    zxc0Var.getPlayerError();
                }
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        zxc0 zxc0Var = this.player;
        boolean z2 = false;
        boolean z3 = (zxc0Var == null || !zxc0Var.isCommandAvailable(30) || zxc0Var.getCurrentTracks().a.isEmpty()) ? false : true;
        if (!this.keepContentOnPlayerReset && (!z3 || z)) {
            hideArtwork();
            closeShutter();
            hideAndClearImage();
        }
        if (z3) {
            boolean hasSelectedVideoTrack = hasSelectedVideoTrack();
            boolean hasSelectedImageTrack = hasSelectedImageTrack();
            if (!hasSelectedVideoTrack && !hasSelectedImageTrack) {
                closeShutter();
                hideAndClearImage();
            }
            View view = this.shutterView;
            if (view != null && view.getVisibility() == 4 && isImageSet()) {
                z2 = true;
            }
            if (hasSelectedImageTrack && !hasSelectedVideoTrack && z2) {
                closeShutter();
                showImage();
            } else if (hasSelectedVideoTrack && !hasSelectedImageTrack && z2) {
                hideAndClearImage();
            }
            if (hasSelectedVideoTrack || hasSelectedImageTrack || !useArtwork() || !(setArtworkFromMediaMetadata(zxc0Var) || setDrawableArtwork(this.defaultArtwork))) {
                hideArtwork();
            }
        }
    }

    private void updateImageViewAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.imageDisplayMode == 1) {
            f = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.imageView.getVisibility() == 0) {
            onContentAspectRatioChanged(this.contentFrame, f);
        }
        this.imageView.setScaleType(scaleType);
    }

    private boolean useArtwork() {
        if (this.artworkDisplayMode == 0) {
            return false;
        }
        d6z.z(this.artworkView);
        return true;
    }

    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        d6z.z(this.controller);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        hzc0 hzc0Var;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (tw21.a != 34 || (hzc0Var = this.surfaceSyncGroupV34) == null || !this.enableComposeSurfaceSyncWorkaround || (surfaceSyncGroup = hzc0Var.a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        hzc0Var.a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zxc0 zxc0Var = this.player;
        if (zxc0Var != null && zxc0Var.isCommandAvailable(16) && this.player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean isDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (isDpadKey && useController() && !this.controller.isFullyVisible()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (isDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public List<q60> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            arrayList.add(new q60(frameLayout, 0));
        }
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            arrayList.add(new q60(playerControlView, 0));
        }
        return ImmutableList.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        d6z.A(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.artworkDisplayMode;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public int getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public zxc0 getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        d6z.z(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.artworkDisplayMode != 0;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.hide();
        }
    }

    public boolean isControllerFullyVisible() {
        PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.isFullyVisible();
    }

    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        d6z.x(i == 0 || this.artworkView != null);
        if (this.artworkDisplayMode != i) {
            this.artworkDisplayMode = i;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setAspectRatioListener(o83 o83Var) {
        d6z.z(this.contentFrame);
        this.contentFrame.setAspectRatioListener(o83Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        d6z.z(this.controller);
        this.controller.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        d6z.z(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(dyc0 dyc0Var) {
        d6z.z(this.controller);
        this.controller.setOnFullScreenModeChangedListener(dyc0Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        d6z.z(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isFullyVisible()) {
            showController();
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(myc0 myc0Var) {
        d6z.z(this.controller);
        myc0 myc0Var2 = this.legacyControllerVisibilityListener;
        if (myc0Var2 == myc0Var) {
            return;
        }
        if (myc0Var2 != null) {
            this.controller.removeVisibilityListener(myc0Var2);
        }
        this.legacyControllerVisibilityListener = myc0Var;
        if (myc0Var != null) {
            this.controller.addVisibilityListener(myc0Var);
            setControllerVisibilityListener((dzc0) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        d6z.x(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.enableComposeSurfaceSyncWorkaround = z;
    }

    public void setErrorMessageProvider(z7o z7oVar) {
        if (z7oVar != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        d6z.z(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(ezc0 ezc0Var) {
        d6z.z(this.controller);
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setFullscreenButtonState(boolean z) {
        d6z.z(this.controller);
        this.controller.updateIsFullscreen(z);
    }

    public void setImageDisplayMode(int i) {
        d6z.x(this.imageView != null);
        if (this.imageDisplayMode != i) {
            this.imageDisplayMode = i;
            updateImageViewAspectRatio();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        if (r3 != false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(zxc0 zxc0Var) {
        boolean z = true;
        d6z.x(Looper.myLooper() == Looper.getMainLooper());
        d6z.l(zxc0Var == null || zxc0Var.getApplicationLooper() == Looper.getMainLooper());
        zxc0 zxc0Var2 = this.player;
        if (zxc0Var2 == zxc0Var) {
            return;
        }
        if (zxc0Var2 != null) {
            zxc0Var2.removeListener(this.componentListener);
            if (zxc0Var2.isCommandAvailable(27)) {
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    zxc0Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    zxc0Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            clearImageOutput(zxc0Var2);
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = zxc0Var;
        if (useController()) {
            this.controller.setPlayer(zxc0Var);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (zxc0Var == null) {
            hideController();
            return;
        }
        if (zxc0Var.isCommandAvailable(27)) {
            View view2 = this.surfaceView;
            if (view2 instanceof TextureView) {
                zxc0Var.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                zxc0Var.setVideoSurfaceView((SurfaceView) view2);
            }
            if (zxc0Var.isCommandAvailable(30)) {
                ImmutableList immutableList = zxc0Var.getCurrentTracks().a;
                int i = 0;
                loop0: while (true) {
                    if (i >= immutableList.size()) {
                        z = false;
                        break;
                    }
                    if (((q801) immutableList.get(i)).b.c == 2) {
                        q801 q801Var = (q801) immutableList.get(i);
                        for (int i2 = 0; i2 < q801Var.d.length; i2++) {
                            if (q801Var.d(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
            }
            updateAspectRatio();
        }
        if (this.subtitleView != null && zxc0Var.isCommandAvailable(28)) {
            this.subtitleView.setCues(zxc0Var.getCurrentCues().a);
        }
        zxc0Var.addListener(this.componentListener);
        setImageOutput(zxc0Var);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i) {
        d6z.z(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        d6z.z(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        d6z.z(this.controller);
        this.controller.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        d6z.x((z && this.controller == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        boolean useController = useController();
        PlayerControlView playerControlView = this.controller;
        if (useController) {
            playerControlView.setPlayer(this.player);
        } else if (playerControlView != null) {
            playerControlView.hide();
            this.controller.setPlayer(null);
        }
        updateContentDescription();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final class ComponentListener implements xxc0, View.OnClickListener, myc0, dyc0 {
        private Object lastPeriodUidWithTracks;
        private final y8z0 period = new y8z0();

        public ComponentListener() {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.toggleControllerVisibility();
        }

        @Override // defpackage.xxc0
        public void onCues(rdf rdfVar) {
            if (PlayerView.this.subtitleView != null) {
                PlayerView.this.subtitleView.setCues(rdfVar.a);
            }
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
        }

        @Override // defpackage.dyc0
        public void onFullScreenModeChanged(boolean z) {
            PlayerView.access$2100(PlayerView.this);
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaItemTransition(fe10 fe10Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
        }

        @Override // defpackage.xxc0
        public void onPlayWhenReadyChanged(boolean z, int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateControllerVisibility();
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
        }

        @Override // defpackage.xxc0
        public void onPlaybackStateChanged(int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateErrorMessage();
            PlayerView.this.updateControllerVisibility();
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        public void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
            if (PlayerView.this.isPlayingAd() && PlayerView.this.controllerHideDuringAds) {
                PlayerView.this.hideController();
            }
        }

        @Override // defpackage.xxc0
        public void onRenderedFirstFrame() {
            if (PlayerView.this.shutterView != null) {
                PlayerView.this.shutterView.setVisibility(4);
                boolean hasSelectedImageTrack = PlayerView.this.hasSelectedImageTrack();
                PlayerView playerView = PlayerView.this;
                if (hasSelectedImageTrack) {
                    playerView.hideImage();
                } else {
                    playerView.hideAndClearImage();
                }
            }
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public void onSurfaceSizeChanged(int i, int i2) {
            if (tw21.a == 34 && (PlayerView.this.surfaceView instanceof SurfaceView) && PlayerView.this.enableComposeSurfaceSyncWorkaround) {
                hzc0 hzc0Var = PlayerView.this.surfaceSyncGroupV34;
                hzc0Var.getClass();
                PlayerView.this.mainLooperHandler.post(new ud30(15, hzc0Var, (SurfaceView) PlayerView.this.surfaceView, new wnb0(9, PlayerView.this)));
            }
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
        }

        @Override // defpackage.xxc0
        public void onTracksChanged(r801 r801Var) {
            zxc0 zxc0Var = PlayerView.this.player;
            zxc0Var.getClass();
            a9z0 currentTimeline = zxc0Var.isCommandAvailable(17) ? zxc0Var.getCurrentTimeline() : a9z0.a;
            if (currentTimeline.q()) {
                this.lastPeriodUidWithTracks = null;
            } else if (!zxc0Var.isCommandAvailable(30) || zxc0Var.getCurrentTracks().a.isEmpty()) {
                Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int b = currentTimeline.b(obj);
                    if (b != -1) {
                        if (zxc0Var.getCurrentMediaItemIndex() == currentTimeline.g(b, this.period, false).c) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            } else {
                this.lastPeriodUidWithTracks = currentTimeline.g(zxc0Var.getCurrentPeriodIndex(), this.period, true).b;
            }
            PlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // defpackage.xxc0
        public void onVideoSizeChanged(do31 do31Var) {
            if (do31Var.equals(do31.d) || PlayerView.this.player == null || PlayerView.this.player.getPlaybackState() == 1) {
                return;
            }
            PlayerView.this.updateAspectRatio();
        }

        @Override // defpackage.myc0
        public void onVisibilityChange(int i) {
            PlayerView.this.updateContentDescription();
            PlayerView.access$2000(PlayerView.this);
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void setControllerVisibilityListener(dzc0 dzc0Var) {
        if (dzc0Var != null) {
            setControllerVisibilityListener((myc0) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}

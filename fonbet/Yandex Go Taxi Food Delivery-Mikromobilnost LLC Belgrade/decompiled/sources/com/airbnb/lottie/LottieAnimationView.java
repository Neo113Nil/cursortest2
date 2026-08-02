package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.auz;
import defpackage.b6v;
import defpackage.cuz;
import defpackage.eqn;
import defpackage.euz;
import defpackage.fbz;
import defpackage.g8e;
import defpackage.h8v;
import defpackage.hes0;
import defpackage.hog0;
import defpackage.jsz;
import defpackage.ksz;
import defpackage.lgz;
import defpackage.lsz;
import defpackage.mwa0;
import defpackage.nsz;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.psz;
import defpackage.puz;
import defpackage.qke;
import defpackage.r2i0;
import defpackage.six;
import defpackage.sly0;
import defpackage.ssz;
import defpackage.upx;
import defpackage.xtz;
import defpackage.y331;
import defpackage.zw21;
import defpackage.zxr;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipInputStream;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final xtz DEFAULT_FAILURE_LISTENER = new jsz();
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private nuz compositionTask;
    private xtz failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final xtz loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<auz> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final xtz wrappedFailureListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UserActionTaken {
        private static final /* synthetic */ UserActionTaken[] $VALUES;
        public static final UserActionTaken PLAY_OPTION;
        public static final UserActionTaken SET_ANIMATION;
        public static final UserActionTaken SET_IMAGE_ASSETS;
        public static final UserActionTaken SET_PROGRESS;
        public static final UserActionTaken SET_REPEAT_COUNT;
        public static final UserActionTaken SET_REPEAT_MODE;

        static {
            UserActionTaken userActionTaken = new UserActionTaken("SET_ANIMATION", 0);
            SET_ANIMATION = userActionTaken;
            UserActionTaken userActionTaken2 = new UserActionTaken("SET_PROGRESS", 1);
            SET_PROGRESS = userActionTaken2;
            UserActionTaken userActionTaken3 = new UserActionTaken("SET_REPEAT_MODE", 2);
            SET_REPEAT_MODE = userActionTaken3;
            UserActionTaken userActionTaken4 = new UserActionTaken("SET_REPEAT_COUNT", 3);
            SET_REPEAT_COUNT = userActionTaken4;
            UserActionTaken userActionTaken5 = new UserActionTaken("SET_IMAGE_ASSETS", 4);
            SET_IMAGE_ASSETS = userActionTaken5;
            UserActionTaken userActionTaken6 = new UserActionTaken("PLAY_OPTION", 5);
            PLAY_OPTION = userActionTaken6;
            $VALUES = new UserActionTaken[]{userActionTaken, userActionTaken2, userActionTaken3, userActionTaken4, userActionTaken5, userActionTaken6};
        }

        public static UserActionTaken valueOf(String str) {
            return (UserActionTaken) Enum.valueOf(UserActionTaken.class, str);
        }

        public static UserActionTaken[] values() {
            return (UserActionTaken[]) $VALUES.clone();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new lsz(this, 1);
        this.wrappedFailureListener = new lsz(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, hog0.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        nuz nuzVar = this.compositionTask;
        if (nuzVar != null) {
            nuzVar.d(this.loadedListener);
            nuz nuzVar2 = this.compositionTask;
            xtz xtzVar = this.wrappedFailureListener;
            synchronized (nuzVar2) {
                nuzVar2.b.remove(xtzVar);
            }
        }
    }

    private void clearComposition() {
        this.lottieDrawable.clearComposition();
    }

    private nuz fromAssets(String str) {
        int i = 1;
        if (isInEditMode()) {
            return new nuz(new eqn(2, this, str), true);
        }
        Object obj = null;
        if (!this.cacheComposition) {
            Context context = getContext();
            HashMap hashMap = ssz.a;
            return ssz.a(null, new psz(i, context.getApplicationContext(), str, obj), null);
        }
        Context context2 = getContext();
        HashMap hashMap2 = ssz.a;
        String o = g8e.o("asset_", str);
        return ssz.a(o, new psz(i, context2.getApplicationContext(), str, o), null);
    }

    private nuz fromRawRes(int i) {
        if (isInEditMode()) {
            return new nuz(new b6v(this, i, 1), true);
        }
        if (!this.cacheComposition) {
            return ssz.f(getContext(), i, null);
        }
        Context context = getContext();
        return ssz.f(context, i, ssz.n(i, context));
    }

    private void init(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r2i0.LottieAnimationView, i, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_cacheComposition, true);
        boolean hasValue = obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_rawRes);
        boolean hasValue2 = obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_fileName);
        boolean hasValue3 = obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_url);
        if (hasValue && hasValue2) {
            ny61.g("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(r2i0.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(r2i0.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(r2i0.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(r2i0.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(r2i0.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(r2i0.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(r2i0.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(r2i0.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(r2i0.LottieAnimationView_lottie_imageAssetsFolder));
        setProgressInternal(obtainStyledAttributes.getFloat(r2i0.LottieAnimationView_lottie_progress, 0.0f), obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_progress));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_colorFilter)) {
            addValueCallback(new six("**"), (six) cuz.I, new puz(new SimpleColorFilter(qke.m(obtainStyledAttributes.getResourceId(r2i0.LottieAnimationView_lottie_colorFilter, -1), getContext()).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_renderMode)) {
            int i2 = r2i0.LottieAnimationView_lottie_renderMode;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i3 = obtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (i3 >= RenderMode.values().length) {
                i3 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i3]);
        }
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_asyncUpdates)) {
            int i4 = r2i0.LottieAnimationView_lottie_asyncUpdates;
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int i5 = obtainStyledAttributes.getInt(i4, asyncUpdates.ordinal());
            if (i5 >= RenderMode.values().length) {
                i5 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[i5]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (obtainStyledAttributes.hasValue(r2i0.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(r2i0.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public euz lambda$fromAssets$2(String str) throws Exception {
        if (!this.cacheComposition) {
            return ssz.b(getContext(), str, null);
        }
        Context context = getContext();
        HashMap hashMap = ssz.a;
        return ssz.b(context, str, "asset_" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public euz lambda$fromRawRes$1(int i) throws Exception {
        if (!this.cacheComposition) {
            return ssz.g(getContext(), i, null);
        }
        Context context = getContext();
        return ssz.g(context, i, ssz.n(i, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$0(Throwable th) {
        Matrix matrix = zw21.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            lgz.c("Unable to load composition.");
        } else {
            ny61.h("Unable to parse composition", th);
        }
    }

    private void setCompositionTask(nuz nuzVar) {
        euz euzVar = nuzVar.d;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (euzVar != null && lottieDrawable == getDrawable() && lottieDrawable.getComposition() == euzVar.a) {
            return;
        }
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        nuzVar.b(this.loadedListener);
        nuzVar.a(this.wrappedFailureListener);
        this.compositionTask = nuzVar;
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.resumeAnimation();
        }
    }

    private void setProgressInternal(float f, boolean z) {
        if (z) {
            this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        }
        this.lottieDrawable.setProgress(f);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(auz auzVar) {
        if (getComposition() != null) {
            ((y331) auzVar).a();
        }
        return this.lottieOnCompositionLoadedListeners.add(auzVar);
    }

    public <T> void addValueCallback(six sixVar, T t, hes0 hes0Var) {
        this.lottieDrawable.addValueCallback(sixVar, (six) t, (puz) new ksz(hes0Var));
    }

    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.cancelAnimation();
    }

    public <T> void clearValueCallback(six sixVar, T t) {
        this.lottieDrawable.addValueCallback(sixVar, (six) t, (puz) null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        this.lottieDrawable.enableFeatureFlag(lottieFeatureFlag, z);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.lottieDrawable.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.getAsyncUpdatesEnabled();
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.getClipTextToBoundingBox();
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.getClipToCompositionBounds();
    }

    public nsz getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable == lottieDrawable) {
            return lottieDrawable.getComposition();
        }
        return null;
    }

    public long getDuration() {
        nsz composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    public mwa0 getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.getRenderMode();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.lottieDrawable.isFeatureFlagEnabled(lottieFeatureFlag);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.setRepeatCount(z ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.playAnimation();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgressInternal(savedState.progress, false);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.getProgress();
        savedState.isAnimating = this.lottieDrawable.isAnimatingOrWillAnimateOnVisible();
        savedState.imageAssetsFolder = this.lottieDrawable.getImageAssetsFolder();
        savedState.repeatMode = this.lottieDrawable.getRepeatMode();
        savedState.repeatCount = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.pauseAnimation();
    }

    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(auz auzVar) {
        return this.lottieOnCompositionLoadedListeners.remove(auzVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<six> resolveKeyPath(six sixVar) {
        return this.lottieDrawable.resolveKeyPath(sixVar);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(ssz.a(str, new eqn(3, inputStream, str), new fbz(5, inputStream)));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? ssz.h(getContext(), str) : ssz.i(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z);
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.lottieDrawable.setApplyingShadowToLayersEnabled(z);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.lottieDrawable.setAsyncUpdates(asyncUpdates);
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        this.lottieDrawable.setClipTextToBoundingBox(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.lottieDrawable.setClipToCompositionBounds(z);
    }

    public void setComposition(nsz nszVar) {
        AsyncUpdates asyncUpdates = upx.a;
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean composition = this.lottieDrawable.setComposition(nszVar);
        if (this.autoPlay) {
            this.lottieDrawable.playAnimation();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || composition) {
            if (!composition) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<auz> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                ((y331) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(xtz xtzVar) {
        this.failureListener = xtzVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(zxr zxrVar) {
        this.lottieDrawable.setFontAssetDelegate(zxrVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.lottieDrawable.setFontMap(map);
    }

    public void setFrame(int i) {
        this.lottieDrawable.setFrame(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.setIgnoreDisabledSystemAnimations(z);
    }

    public void setImageAssetDelegate(h8v h8vVar) {
        this.lottieDrawable.setImageAssetDelegate(h8vVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.animationResId = 0;
        this.animationName = null;
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.setMaintainOriginalImageBounds(z);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.setMaxFrame(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.setMaxProgress(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.setMinAndMaxProgress(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.setMinProgress(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.lottieDrawable.setOutlineMasksAndMattes(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(float f) {
        setProgressInternal(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.setSafeMode(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.setSpeed(f);
    }

    public void setTextDelegate(sly0 sly0Var) {
        this.lottieDrawable.setTextDelegate(sly0Var);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.lottieDrawable.setUseCompositionFrameRate(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.setMinAndMaxFrame(i, i2);
    }

    public <T> void addValueCallback(six sixVar, T t, puz puzVar) {
        this.lottieDrawable.addValueCallback(sixVar, (six) t, puzVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimation(int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(ssz.a(str, new eqn(4, zipInputStream, str), new fbz(6, zipInputStream)));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(ssz.i(getContext(), str, str2));
    }

    /* loaded from: classes10.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public /* synthetic */ SavedState(Parcel parcel, ksz kszVar) {
            this(parcel);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new lsz(this, 1);
        this.wrappedFailureListener = new lsz(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, hog0.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new lsz(this, 1);
        this.wrappedFailureListener = new lsz(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i);
    }
}

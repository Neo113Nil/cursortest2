package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.R$styleable;
import com.vk.core.view.components.text.VkText;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.srr;
import xsna.zqj;

/* compiled from: ClipsMusicTemplateControlsView.kt */
/* loaded from: classes17.dex */
public final class xle extends LinearLayout {
    public SdkClipVideoFile b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public zqj f;
    public izs<? super SdkVideoFile, s3q0> g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public xle(Context context) {
        super(context, null);
        this.c = R.layout.clip_music_template_controls;
        this.d = true;
        this.f = zqj.a.a;
        vle vleVar = new vle(context, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, vleVar);
        this.i = msy.a(lazyThreadSafetyMode, new wle(context, 0));
        this.j = msy.a(lazyThreadSafetyMode, new r20(context, 1));
        this.k = msy.a(lazyThreadSafetyMode, new bb(this, 20));
        int i = 18;
        this.l = msy.a(lazyThreadSafetyMode, new cb(this, i));
        this.m = msy.a(lazyThreadSafetyMode, new ey0(this, i));
        setOrientation(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.a, 0, 0);
        try {
            this.c = obtainStyledAttributes.getResourceId(1, this.c);
            this.d = obtainStyledAttributes.getBoolean(2, this.d);
            this.e = obtainStyledAttributes.getBoolean(0, this.e);
            obtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(this.c, (ViewGroup) this, true);
            if (this.e) {
                getSongView().setSelected(true);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static CharSequence b(SdkClipVideoFile sdkClipVideoFile) {
        SdkOwner s;
        SdkMusicTrack V = sdkClipVideoFile.V();
        if (!sdkClipVideoFile.k0()) {
            if (V != null) {
                CharSequence S6 = sdkClipVideoFile.S6();
                if (S6 != null) {
                    if (drm0.N(S6)) {
                        S6 = null;
                    }
                    if (S6 != null) {
                        return S6;
                    }
                }
                SdkMusicTrack V2 = sdkClipVideoFile.V();
                if (V2 != null) {
                    String str = V2.g;
                    if (!drm0.N(str)) {
                        return str;
                    }
                }
            } else if (!dgd.f(sdkClipVideoFile) && (s = sdkClipVideoFile.s()) != null) {
                return s.c;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Spannable getHashtagIconSpan() {
        return (Spannable) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Spannable getMusicIconSpan() {
        return (Spannable) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Spannable getMusicTrendIconSpan() {
        return (Spannable) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getOwnerView() {
        return (VkText) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSelectButtonView() {
        return (View) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getSongView() {
        return (VkText) this.k.getValue();
    }

    private final void setMusicTitle(CharSequence charSequence) {
        getSongView().setText(charSequence.toString());
        if (this.d) {
            return;
        }
        if (myc0.f(charSequence)) {
            getSongView().setVisibility(0);
        } else {
            getSongView().setVisibility(4);
        }
    }

    private final void setOwnerName(String str) {
        getOwnerView().setText(str);
    }

    public final void a(SdkVideoFile sdkVideoFile) {
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        if (sdkClipVideoFile == null) {
            return;
        }
        if (!epx.f(this.f, zqj.b.a)) {
            String r1 = sdkClipVideoFile.r1();
            SdkClipVideoFile sdkClipVideoFile2 = this.b;
            if (epx.f(r1, sdkClipVideoFile2 != null ? sdkClipVideoFile2.r1() : null)) {
                return;
            }
            this.b = sdkClipVideoFile;
            if (f4m.g(getSelectButtonView())) {
                getSelectButtonView().setVisibility(0);
            }
            String P = sdkClipVideoFile.P();
            CharSequence charSequence = "";
            if (P == null) {
                P = "";
            }
            setOwnerName(P);
            CharSequence c = c(sdkClipVideoFile);
            CharSequence b = b(sdkClipVideoFile);
            if (b != null && c != null) {
                charSequence = ((Object) b) + " — " + ((Object) c);
            } else if (b != null) {
                charSequence = b;
            } else if (c != null) {
                charSequence = c;
            }
            if (this.d && myc0.f(charSequence)) {
                charSequence = new SpannableStringBuilder().append((CharSequence) getMusicIconSpan()).append((CharSequence) rik0.b(7.2f)).append(charSequence);
            }
            setMusicTitle(charSequence);
            return;
        }
        String r12 = sdkClipVideoFile.r1();
        SdkClipVideoFile sdkClipVideoFile3 = this.b;
        if (epx.f(r12, sdkClipVideoFile3 != null ? sdkClipVideoFile3.r1() : null)) {
            return;
        }
        this.b = sdkClipVideoFile;
        if (f4m.g(getSelectButtonView())) {
            getSelectButtonView().setVisibility(0);
        }
        SdkTrendingHashtag sdkTrendingHashtag = (SdkTrendingHashtag) j5g.a0(sdkClipVideoFile.R0());
        String a = cqm0.a(sdkTrendingHashtag != null ? sdkTrendingHashtag.b : null);
        String U = a != null ? drm0.U(a, "#") : null;
        SdkMusicTrack V = sdkClipVideoFile.V();
        SdkMusicTrack V2 = (V == null || !V.k) ? null : sdkClipVideoFile.V();
        VkText songView = getSongView();
        FontFamily fontFamily = FontFamily.REGULAR;
        Float valueOf = Float.valueOf(16.0f);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        com.vk.typography.b.g(songView, fontFamily, valueOf, textSizeUnit);
        com.vk.typography.b.g(getOwnerView(), fontFamily, Float.valueOf(13.0f), textSizeUnit);
        if (U != null && V2 != null) {
            getSongView().setVisibility(0);
            getSongView().setText(d(U));
            bwt0.i0(getSongView(), new o43(9, this, sdkClipVideoFile));
            VkText ownerView = getOwnerView();
            CharSequence c2 = c(sdkClipVideoFile);
            CharSequence b2 = b(sdkClipVideoFile);
            if (c2 != null && c2.length() != 0 && b2 != null && b2.length() != 0) {
                c2 = new SpannableStringBuilder().append(c2).append((CharSequence) " · ").append(b2);
            } else if (c2 == null || c2.length() == 0) {
                c2 = (b2 == null || b2.length() == 0) ? null : b2;
            }
            ownerView.setText(c2 != null ? c2.toString() : null);
            getOwnerView().setVisibility(0);
            return;
        }
        if (U != null) {
            getSongView().setVisibility(0);
            getSongView().setText(d(U));
            bwt0.i0(getSongView(), new hl1(10, this, sdkClipVideoFile));
            f4m.j(getOwnerView());
            return;
        }
        if (V2 == null) {
            f4m.j(getSongView());
            getSongView().setOnClickListener(null);
            f4m.j(getOwnerView());
            return;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) getMusicTrendIconSpan()).append((CharSequence) rik0.b(4.0f)).append(c(sdkClipVideoFile));
        getSongView().setVisibility(0);
        VkText songView2 = getSongView();
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        songView2.setText(new SpannableString(append));
        getSongView().setOnClickListener(null);
        VkText ownerView2 = getOwnerView();
        CharSequence b3 = b(sdkClipVideoFile);
        ownerView2.setText(b3 != null ? b3.toString() : null);
        getOwnerView().setVisibility(0);
    }

    public final CharSequence c(SdkClipVideoFile sdkClipVideoFile) {
        SdkMusicTrack V = sdkClipVideoFile.V();
        if (sdkClipVideoFile.k0()) {
            return getContext().getText(R.string.clip_audio_restricted);
        }
        if (V == null) {
            return dgd.f(sdkClipVideoFile) ? getContext().getText(R.string.ads_sound) : getContext().getText(R.string.original_sound);
        }
        StringBuilder sb = new StringBuilder();
        CharSequence L5 = sdkClipVideoFile.L5();
        if (L5 == null) {
            L5 = "";
        }
        sb.append((Object) L5);
        sb.append(' ');
        String str = V.h;
        sb.append(str != null ? str : "");
        String obj = drm0.p0(sb.toString()).toString();
        if (drm0.N(obj)) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        SdkMusicTrack V2 = sdkClipVideoFile.V();
        if (V2 != null) {
            return V2.b;
        }
        return null;
    }

    public final SpannableString d(String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) getHashtagIconSpan()).append((CharSequence) rik0.b(5.5f)).append((CharSequence) str);
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        return new SpannableString(append);
    }

    public final void e() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 5), n8g.l(-16777216, 12), n8g.l(-16777216, 30), n8g.l(-16777216, 51), n8g.l(-16777216, 73), n8g.l(-16777216, 99), n8g.l(-16777216, 127), n8g.l(-16777216, 155), n8g.l(-16777216, 181), n8g.l(-16777216, 204), n8g.l(-16777216, 224), n8g.l(-16777216, 242), n8g.l(-16777216, 249), n8g.l(-16777216, 255)});
        gradientDrawable.setAlpha(127);
        gradientDrawable.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setBackground(gradientDrawable);
    }

    public final void setHashtagListener(izs<? super SdkVideoFile, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setOnSelectClickListener(izs<? super SdkClipVideoFile, s3q0> izsVar) {
        if (izsVar != null) {
            bwt0.i0(getSelectButtonView(), new g86(4, this, izsVar));
        } else {
            getSelectButtonView().setOnClickListener(null);
        }
    }

    public final void setSelectButtonText(String str) {
        View selectButtonView = getSelectButtonView();
        FloatingButtonView floatingButtonView = selectButtonView instanceof FloatingButtonView ? (FloatingButtonView) selectButtonView : null;
        if (floatingButtonView != null) {
            floatingButtonView.setMiddle(new srr.a(oq.d(tlo0.Companion, str)));
        }
    }

    public final void setTextAlpha(float f) {
        getSongView().setAlpha(f);
        getOwnerView().setAlpha(f);
    }

    public final void setType(zqj zqjVar) {
        this.f = zqjVar;
    }
}

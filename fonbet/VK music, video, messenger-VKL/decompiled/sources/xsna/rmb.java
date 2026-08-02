package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.drawable.IndeterminateHorizontalProgressDrawable;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.qmb;

/* compiled from: ChatAudioPlayerVC.kt */
/* loaded from: classes2.dex */
public final class rmb {
    public final qmb.b a;
    public final kkm b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final ProgressBar g;
    public boolean h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* compiled from: ChatAudioPlayerVC.kt */
    public static abstract class a {

        /* compiled from: ChatAudioPlayerVC.kt */
        /* renamed from: xsna.rmb$a$a, reason: collision with other inner class name */
        public static final class C3612a extends a {
            public final float a;
            public final String b;

            public C3612a(float f, String str) {
                this.a = f;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3612a)) {
                    return false;
                }
                C3612a c3612a = (C3612a) obj;
                return Float.compare(this.a, c3612a.a) == 0 && epx.f(this.b, c3612a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Float.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnPlayProgressChange(progress=");
                sb.append(this.a);
                sb.append(", duration=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: ChatAudioPlayerVC.kt */
        public static final class b extends a {
            public final String a;
            public final String b;
            public final boolean c;
            public final boolean d;

            public b(String str, String str2, boolean z, boolean z2) {
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnPlayStateChange(title=");
                sb.append(this.a);
                sb.append(", author=");
                sb.append(this.b);
                sb.append(", isPlaying=");
                sb.append(this.c);
                sb.append(", isAdvertisement=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }
    }

    public rmb(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, qmb.b bVar, kkm kkmVar) {
        View inflate;
        this.a = bVar;
        this.b = kkmVar;
        com.vk.movika.sdk.base.logic.processor.actions.f fVar = new com.vk.movika.sdk.base.logic.processor.actions.f(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, fVar);
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 15));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 15));
        this.l = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 9));
        this.m = msy.a(lazyThreadSafetyMode, new bu1(this, 7));
        if (viewStub == null) {
            inflate = layoutInflater.inflate(R.layout.vkim_chat_audio_player, viewGroup, false);
        } else {
            viewStub.setLayoutInflater(layoutInflater);
            viewStub.setLayoutResource(R.layout.vkim_chat_audio_player);
            inflate = viewStub.inflate();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.c = constraintLayout;
        this.d = (TextView) constraintLayout.findViewById(R.id.title);
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.close);
        this.e = (TextView) constraintLayout.findViewById(R.id.duration);
        ImageView imageView2 = (ImageView) constraintLayout.findViewById(R.id.play_pause);
        this.f = imageView2;
        ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(R.id.play_progress);
        this.g = progressBar;
        bwt0.i0(constraintLayout, new r7(this, 19));
        bwt0.i0(imageView, new za(this, 24));
        imageView2.setOnClickListener(new kn9(this, 1));
        kkmVar.d(imageView2, R.attr.vk_legacy_im_text_name);
        Context context = constraintLayout.getContext();
        e3m.a aVar = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.vkim_audio_msg_player_progress, context));
        IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable();
        int f = e3m.f(R.attr.vk_legacy_im_text_name, constraintLayout.getContext());
        if (indeterminateHorizontalProgressDrawable.a().getColor() != f) {
            indeterminateHorizontalProgressDrawable.a().setColor(f);
            indeterminateHorizontalProgressDrawable.invalidateSelf();
        }
        progressBar.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(a aVar) {
        boolean z = aVar instanceof a.b;
        ProgressBar progressBar = this.g;
        if (!z) {
            if (!(aVar instanceof a.C3612a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C3612a c3612a = (a.C3612a) aVar;
            this.e.setText(c3612a.b);
            float f = c3612a.a;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                progressBar.setIndeterminate(true);
                return;
            }
            float b = bn10.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            progressBar.setIndeterminate(false);
            progressBar.setMax(1000);
            progressBar.setProgress(an10.b(1000 * b), true);
            return;
        }
        a.b bVar = (a.b) aVar;
        boolean z2 = bVar.c;
        this.h = z2;
        ImageView imageView = this.f;
        if (z2) {
            imageView.setImageDrawable((Drawable) this.j.getValue());
            imageView.setContentDescription((String) this.k.getValue());
        } else {
            imageView.setImageDrawable((Drawable) this.i.getValue());
            imageView.setContentDescription((String) this.l.getValue());
        }
        String str = bVar.a;
        String str2 = bVar.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(dhr0.t.c(R.attr.vk_legacy_text_primary));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (str + " — "));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) str2);
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        this.d.setText(new SpannableString(append));
        if (bVar.d) {
            progressBar.setProgressTintList((ColorStateList) this.m.getValue());
            return;
        }
        kkm kkmVar = this.b;
        kkmVar.getClass();
        kkmVar.a(progressBar, "progressTint", new zl9(kkmVar, R.attr.vk_legacy_im_text_name));
    }
}

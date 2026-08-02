package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.Speed;
import com.vk.core.drawable.IndeterminateHorizontalProgressDrawable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.jr4;

/* compiled from: AudioMsgPlayerVc.kt */
/* loaded from: classes2.dex */
public final class rr4 {
    public final kkm a;
    public final jr4.c b;
    public final Context c;
    public final ViewGroup d;
    public final ImageView e;
    public final TextView f;
    public final ProgressBar g;
    public final TextView h;
    public final ViewGroup i;
    public final TextView j;
    public final coo k;
    public boolean l;
    public Speed m;

    /* compiled from: AudioMsgPlayerVc.kt */
    public interface a {

        /* compiled from: AudioMsgPlayerVc.kt */
        /* renamed from: xsna.rr4$a$a, reason: collision with other inner class name */
        public static final class C3626a {
            public static final /* synthetic */ int a = 0;

            /* compiled from: AudioMsgPlayerVc.kt */
            /* renamed from: xsna.rr4$a$a$a, reason: collision with other inner class name */
            public static final class C3627a implements a {
            }
        }

        static {
            int i = C3626a.a;
        }
    }

    /* compiled from: AudioMsgPlayerVc.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Speed.values().length];
            try {
                iArr[Speed.X1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Speed.X1_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Speed.X2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rr4(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, kkm kkmVar, jr4.c cVar) {
        View inflate;
        this.a = kkmVar;
        this.b = cVar;
        Context context = layoutInflater.getContext();
        this.c = context;
        if (viewStub == null) {
            inflate = layoutInflater.inflate(R.layout.vkim_audio_msg_player, viewGroup, false);
        } else {
            viewStub.setLayoutInflater(layoutInflater);
            viewStub.setLayoutResource(R.layout.vkim_audio_msg_player);
            inflate = viewStub.inflate();
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.d = viewGroup2;
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.play_pause);
        this.e = imageView;
        this.f = (TextView) viewGroup2.findViewById(R.id.title);
        ProgressBar progressBar = (ProgressBar) viewGroup2.findViewById(R.id.play_progress);
        this.g = progressBar;
        this.h = (TextView) viewGroup2.findViewById(R.id.duration);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.speed_container);
        this.i = viewGroup3;
        this.j = (TextView) viewGroup2.findViewById(R.id.speed_value);
        ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.close);
        this.k = new coo(context);
        Speed speed = Speed.X1;
        this.m = speed;
        bwt0.i0(viewGroup2, new k00(this, 4));
        bwt0.i0(imageView2, new l00(this, 3));
        imageView.setOnClickListener(new y01(this, 2));
        viewGroup3.setOnClickListener(new z01(this, 1));
        b(false);
        e(null);
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a(null);
        d(speed);
        kkmVar.d(imageView, R.attr.vk_legacy_im_text_name);
        e3m.a aVar = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.vkim_audio_msg_player_progress, context));
        IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable();
        int f = e3m.f(R.attr.vk_legacy_im_text_name, context);
        if (indeterminateHorizontalProgressDrawable.a().getColor() != f) {
            indeterminateHorizontalProgressDrawable.a().setColor(f);
            indeterminateHorizontalProgressDrawable.invalidateSelf();
        }
        progressBar.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
    }

    public final void a(Integer num) {
        TextView textView = this.h;
        if (num == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        int intValue = num.intValue();
        coo cooVar = this.k;
        textView.setText(cooVar.a(intValue));
        textView.setContentDescription(this.c.getString(R.string.vkim_audio_msg_player_accessibility_duration, cooVar.c(num.intValue())));
    }

    public final void b(boolean z) {
        this.l = z;
        Context context = this.c;
        ImageView imageView = this.e;
        if (z) {
            imageView.setImageResource(R.drawable.vk_icon_pause_24);
            imageView.setContentDescription(context.getString(R.string.vkim_audio_msg_player_accessibility_pause));
        } else {
            imageView.setImageResource(R.drawable.vk_icon_play_24);
            imageView.setContentDescription(context.getString(R.string.vkim_audio_msg_player_accessibility_play));
        }
    }

    public final void c(float f) {
        ProgressBar progressBar = this.g;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            progressBar.setIndeterminate(true);
            return;
        }
        float b2 = bn10.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        progressBar.setIndeterminate(false);
        progressBar.setMax(1000);
        progressBar.setProgress(an10.b(1000 * b2));
    }

    public final void d(Speed speed) {
        this.m = speed == null ? Speed.X1 : speed;
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.g(0);
        zmp0.a(this.d, mk5Var);
        this.i.setVisibility(speed == null ? 8 : 0);
        int i = speed == null ? -1 : b.$EnumSwitchMapping$0[speed.ordinal()];
        this.j.setText(i != 1 ? i != 2 ? i != 3 ? "?x" : "2x" : "1.5x" : "1x");
    }

    public final void e(String str) {
        TextView textView = this.f;
        textView.setText(str);
        textView.setContentDescription(this.c.getString(R.string.vkim_audio_msg_player_accessibility_author, str));
    }

    public final void f(float f, Integer num) {
        Integer num2;
        c(f);
        if (num != null) {
            num2 = Integer.valueOf((int) ((1 - swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * num.intValue()));
        } else {
            num2 = null;
        }
        a(num2);
    }
}

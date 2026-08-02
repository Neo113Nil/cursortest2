package xsna;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import one.video.player.OneVideoPlayer;
import one.video.view.debug.VideoDebugInfoView;

/* compiled from: VideoDebugView.kt */
/* loaded from: classes6.dex */
public final class ees0 extends FrameLayout implements fes0 {
    public final VideoDebugInfoView b;
    public final TextView c;
    public final ImageView d;
    public final des0 e;
    public a f;

    /* compiled from: VideoDebugView.kt */
    public static final class a {
        public final ces0 a;
        public final long b;
        public final long c;

        public a(ces0 ces0Var, long j, long j2) {
            this.a = ces0Var;
            this.b = j;
            this.c = j2;
        }

        public static a a(a aVar, ces0 ces0Var, long j, long j2, int i) {
            if ((i & 1) != 0) {
                ces0Var = aVar.a;
            }
            ces0 ces0Var2 = ces0Var;
            if ((i & 2) != 0) {
                j = aVar.b;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = aVar.c;
            }
            aVar.getClass();
            return new a(ces0Var2, j3, j2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(videoDebugInfo=");
            sb.append(this.a);
            sb.append(", currentBitrate=");
            sb.append(this.b);
            sb.append(", currentRTT=");
            return vu5.a(')', this.c, sb);
        }
    }

    public ees0(Context context) {
        super(context, null, 0);
        VideoDebugInfoView videoDebugInfoView = new VideoDebugInfoView(context, null, 0, 14, 0);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        videoDebugInfoView.setId(View.generateViewId());
        videoDebugInfoView.setBackgroundColor(0);
        this.b = videoDebugInfoView;
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.copy_text));
        textView.setTextColor(-1);
        textView.setBackground(m33.a(R.drawable.bg_copy_btn, context));
        textView.setClickable(true);
        textView.setFocusable(true);
        float f = 10;
        float f2 = 5;
        textView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        jjc.g(textView, new sf4(29, context, this));
        this.c = textView;
        ImageView imageView = new ImageView(context);
        imageView.setBackground(m33.a(R.drawable.ic_cancel_24_in_circle_bg_opaque, context));
        imageView.setAlpha(0.7f);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        this.d = imageView;
        this.e = new des0(this, context);
        this.f = new a(ces0.g, 0L, 0L);
        setBackgroundColor(Color.parseColor("#88000000"));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        View rootView = videoDebugInfoView.getRootView();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        float f3 = 16;
        marginLayoutParams.setMarginEnd(iah0.a(f3));
        s3q0 s3q0Var = s3q0.a;
        linearLayout.addView(rootView, marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, iah0.a(30));
        marginLayoutParams2.setMarginStart(iah0.a(f3));
        linearLayout.addView(textView, marginLayoutParams2);
        addView(linearLayout);
        float f4 = 24;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams.setMarginEnd(iah0.a(12));
        layoutParams.topMargin = iah0.a(f3);
        layoutParams.gravity = 53;
        addView(imageView, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(a aVar) {
        String str;
        if (epx.f(this.f, aVar)) {
            return;
        }
        this.f = aVar;
        StringBuilder sb = new StringBuilder();
        ces0 ces0Var = aVar.a;
        sb.append("Ondemand: " + ces0Var.c);
        sb.append('\n');
        VideoDebugInfoView videoDebugInfoView = this.b;
        OneVideoPlayer player = videoDebugInfoView.getPlayer();
        if (player == null || (str = Integer.valueOf(player.hashCode()).toString()) == null) {
            str = "null";
        }
        sb.append("PlayerId: ".concat(str));
        sb.append('\n');
        sb.append("Player pool size: " + ces0Var.e + '/' + ces0Var.f);
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(ces0Var.a);
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder("SessionId: ");
        String str2 = ces0Var.b;
        long j = 0;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            for (int i = 0; i < upperCase.length(); i++) {
                char charAt = upperCase.charAt(i);
                j = (j * 36) + (('0' > charAt || charAt >= ':') ? ('A' > charAt || charAt >= '[') ? 0 : charAt - '7' : charAt - '0');
            }
        }
        sb3.append(j);
        sb.append(sb3.toString());
        sb.append('\n');
        String str3 = ces0Var.d;
        if (str3 != null) {
            sb.append("interactive chapter id: ".concat(str3));
            sb.append('\n');
        }
        StringBuilder sb4 = new StringBuilder("Bandwidth: ");
        double d = aVar.b;
        double d2 = d / 1000000.0d;
        sb4.append(d2 >= 1.0d ? String.format(Locale.US, "%.2f Mbps", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)) : String.format(Locale.US, "%.2f Kbps", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1)));
        sb4.append(", RTT: ");
        sb4.append(y2r0.j0(aVar.c));
        sb4.append(" ms");
        sb.append(sb4.toString());
        sb.append('\n');
        videoDebugInfoView.setExtraLogInfo(sb.toString());
    }

    @Override // xsna.fes0
    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        View[] viewArr = {this.c, this.d};
        for (int i = 0; i < 2; i++) {
            int[] iArr = new int[2];
            viewArr[i].getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (motionEvent.getRawX() > i2 && motionEvent.getRawX() < r5.getWidth() + i2 && motionEvent.getRawY() > i3 && motionEvent.getRawY() < r5.getHeight() + i3) {
                return true;
            }
        }
        return false;
    }

    public ces0 getVideoDebugInfo() {
        return this.f.a;
    }

    @Override // xsna.fes0
    public void setOnHideBtnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    @Override // xsna.fes0
    public void setPlayer(OneVideoPlayer oneVideoPlayer) {
        VideoDebugInfoView videoDebugInfoView = this.b;
        OneVideoPlayer player = videoDebugInfoView.getPlayer();
        des0 des0Var = this.e;
        if (player != null) {
            player.r(des0Var);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.W(des0Var);
        }
        videoDebugInfoView.setPlayer(oneVideoPlayer);
    }

    @Override // xsna.fes0
    public void setVideoDebugInfo(ces0 ces0Var) {
        setState(a.a(this.f, ces0Var, 0L, 0L, 6));
    }

    @Override // xsna.fes0
    public final View b() {
        return this;
    }
}

package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.e3m;

/* compiled from: MusicListenedTrackHolder.kt */
/* loaded from: classes3.dex */
public final class wm40 extends cg40<MusicTrack> {
    public static final /* synthetic */ qcy<Object>[] w;
    public final u2b0 o;
    public final dhb0 p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public final ImageView t;
    public boolean u;
    public final a v;

    /* compiled from: Delegates.kt */
    public static final class a extends wq70<Long> {
        public a() {
            super(0L);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Long l, Long l2) {
            wm40.this.u = l.longValue() != 0 && l2.longValue() == 0;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(wm40.class, "currentTimePosition", "getCurrentTimePosition()J", 0);
        fpf0.a.getClass();
        w = new qcy[]{mutablePropertyReference1Impl};
    }

    public wm40(se50<MusicTrack> se50Var, u2b0 u2b0Var, dhb0 dhb0Var) {
        super(se50Var);
        this.o = u2b0Var;
        this.p = dhb0Var;
        this.q = (TextView) this.itemView.findViewById(R.id.audio_title);
        this.r = (TextView) this.itemView.findViewById(R.id.audio_duration);
        this.s = (ImageView) this.itemView.findViewById(R.id.image_explicit);
        this.t = (ImageView) this.itemView.findViewById(R.id.image_button_play);
        this.v = new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r1 == true) goto L28;
     */
    @Override // xsna.se50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b6(Object obj) {
        boolean z;
        Drawable drawable;
        boolean z2;
        MusicTrack musicTrack = (MusicTrack) obj;
        u2b0 u2b0Var = this.o;
        dhb0 dhb0Var = this.p;
        if (this.u && dhb0Var != null) {
            dhb0Var.a.put(musicTrack.Fb(), Boolean.TRUE);
        }
        TextView textView = this.q;
        if (textView != null) {
            f4m.r(musicTrack.s ? cn70.b(0) : cn70.b(6), textView);
        }
        ImageView imageView = this.s;
        if (imageView != null) {
            bwt0.p0(imageView, musicTrack.s);
        }
        TextView textView2 = this.r;
        LayerDrawable layerDrawable = null;
        if (textView2 != null) {
            Context context = textView2.getContext();
            if (dhb0Var != null) {
                String Fb = musicTrack.Fb();
                LinkedHashMap linkedHashMap = dhb0Var.a;
                Boolean bool = (Boolean) linkedHashMap.get(Fb);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    linkedHashMap.put(Fb, Boolean.FALSE);
                    z2 = false;
                }
                z = true;
            }
            z = false;
            if (z) {
                DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
                dateFormatSymbols.setShortMonths(context.getResources().getStringArray(R.array.months_short));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM", dateFormatSymbols);
                Drawable a2 = dhr0.t.a(R.drawable.vk_icon_check_12);
                if (a2 == null || (drawable = a2.mutate()) == null) {
                    drawable = null;
                } else {
                    e3m.a aVar = e3m.a;
                    drawable.setTint(context.getColor(R.color.vk_azure_300));
                }
                SimpleTimeZone simpleTimeZone = pvo0.a;
                xuo0.a.getClass();
                textView2.setText(context.getString(R.string.music_dot_delimiter, simpleDateFormat.format(new Date(xuo0.a())), context.getString(R.string.music_listening_done)));
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                long millis = TimeUnit.SECONDS.toMillis(u2b0Var.C1());
                Episode episode = musicTrack.w;
                long j = episode != null ? episode.d : 0L;
                if (u2b0Var.y0(musicTrack)) {
                    this.v.setValue(this, w[0], Long.valueOf(millis));
                } else {
                    millis = j;
                }
                textView2.setText(pq3.d(context, musicTrack.c0, millis));
            }
        }
        String Fb2 = musicTrack.Fb();
        ImageView imageView2 = this.t;
        if (imageView2 != null) {
            MusicTrack b = u2b0Var.b();
            Drawable a3 = ((!u2b0Var.m0().h() || !epx.f(Fb2, b != null ? b.Fb() : null)) ? PlayState.STOPPED : u2b0Var.m0()).h() ? dhr0.t.a(R.drawable.bg_circle_pause) : dhr0.t.a(R.drawable.bg_circle_play);
            Drawable mutate = a3 != null ? a3.mutate() : null;
            LayerDrawable layerDrawable2 = mutate instanceof LayerDrawable ? (LayerDrawable) mutate : null;
            if (layerDrawable2 != null) {
                Drawable findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.icon);
                if (findDrawableByLayerId != null) {
                    Context context2 = imageView2.getContext();
                    e3m.a aVar2 = e3m.a;
                    findDrawableByLayerId.setTint(context2.getColor(R.color.vk_white));
                }
                layerDrawable = layerDrawable2;
            }
            imageView2.setImageDrawable(layerDrawable);
        }
    }
}

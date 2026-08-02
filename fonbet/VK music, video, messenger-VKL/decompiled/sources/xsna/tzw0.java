package xsna;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.f5h0;
import xsna.mto0;
import xsna.zzw0;

/* compiled from: VoipSelectPlaylistHolder.kt */
/* loaded from: classes7.dex */
public final class tzw0 extends vfz<zzw0.f> {
    public final d810 l;
    public final TextView m;
    public final VKImageView n;
    public final VKImageView o;
    public final TextView p;
    public final TextView q;
    public final Object r;
    public zzw0.f s;

    public tzw0(ViewGroup viewGroup, d810 d810Var) {
        super(R.layout.voip_select_video_playlist_item, viewGroup);
        this.l = d810Var;
        this.m = (TextView) this.itemView.findViewById(R.id.playlist_title);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.playlist_preview);
        this.n = vKImageView;
        this.o = (VKImageView) this.itemView.findViewById(R.id.playlist_preview_bg);
        this.p = (TextView) this.itemView.findViewById(R.id.playlist_update_information);
        this.q = (TextView) this.itemView.findViewById(R.id.video_count);
        this.r = msy.a(LazyThreadSafetyMode.NONE, new y8p0(7));
        bwt0.i0(this.itemView, new dgu0(this, 4));
        vKImageView.setOnLoadCallback(new a());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(zzw0.f fVar) {
        String string;
        jwx jwxVar;
        zzw0.f fVar2 = fVar;
        this.s = fVar2;
        lvw0 lvw0Var = fVar2.b;
        this.m.setText(lvw0Var.c);
        Resources b6 = b6();
        long millis = TimeUnit.SECONDS.toMillis(lvw0Var.d);
        xuo0.a.getClass();
        if (xuo0.a() - millis < tni.l()) {
            string = b6.getString(R.string.video_album_updated_right_now);
        } else {
            ?? r3 = this.r;
            ((StringBuffer) r3.getValue()).setLength(0);
            mto0.a(millis, (StringBuffer) r3.getValue(), mto0.a.C3369a.g);
            string = b6.getString(R.string.video_album_updated, (StringBuffer) r3.getValue());
        }
        this.p.setText(string);
        VKImageView vKImageView = this.n;
        vKImageView.setVisibility(0);
        boolean z = lvw0Var.g;
        int i = lvw0Var.e;
        if (z) {
            bpn0 bpn0Var = VideoOverlayView.I;
            jwxVar = VideoOverlayView.b.c();
        } else {
            jwxVar = null;
        }
        vKImageView.setPostprocessor(jwxVar);
        ImageSize Cb = lvw0Var.f.Cb(vKImageView.getResources().getDimensionPixelSize(R.dimen.voip_playlist_preview_width), true, false);
        vKImageView.s0(Cb != null ? Cb.d.d : null);
        VKImageView vKImageView2 = this.o;
        vKImageView2.load(null);
        bwt0.p0(vKImageView2, false);
        boolean z2 = i > 0;
        TextView textView = this.q;
        bwt0.p0(textView, z2);
        textView.setText(String.valueOf(i));
    }

    /* compiled from: VoipSelectPlaylistHolder.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            tzw0.this.n.W();
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            f5h0.d dVar;
            lvw0 lvw0Var;
            Image image;
            ImageSize Cb;
            tzw0 tzw0Var = tzw0.this;
            VKImageView vKImageView = tzw0Var.n;
            zzw0.f fVar = tzw0Var.s;
            VKImageView vKImageView2 = tzw0Var.o;
            String str2 = (fVar == null || (lvw0Var = fVar.b) == null || (image = lvw0Var.f) == null || (Cb = image.Cb(vKImageView.getResources().getDimensionPixelSize(R.dimen.voip_playlist_preview_width), true, false)) == null) ? null : Cb.d.d;
            if (i2 > i) {
                bwt0.p0(vKImageView2, true);
                if (str2 != null) {
                    vKImageView2.s0(str2);
                }
                vKImageView.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                vKImageView.y0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                dVar = f5h0.g.a;
            } else {
                vKImageView.setCornerRadius(cn70.a() * 8.0f);
                vKImageView.y0(cn70.a() * 0.5f, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
                dVar = f5h0.f.a;
            }
            vKImageView.setActualScaleType(dVar);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }
}

package xsna;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: ScreencastPreviewView.kt */
/* loaded from: classes7.dex */
public final class rdh0 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final AvatarView b;
    public gzs<s3q0> c;
    public gzs<s3q0> d;
    public final AppCompatImageView e;

    public rdh0(l7s l7sVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(l7sVar).inflate(R.layout.voip_screencast_preview, (ViewGroup) null, false);
        this.a = viewGroup;
        this.b = (AvatarView) viewGroup.findViewById(R.id.screencast_preview_icon);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewGroup.findViewById(R.id.screencast_preview_stop);
        this.c = new pdh0(0);
        this.d = new qdh0(0);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewGroup.findViewById(R.id.screencast_preview_audio_share);
        this.e = appCompatImageView2;
        viewGroup.setOnClickListener(new o44(0));
        bwt0.i0(appCompatImageView, new qz40(this, 21));
        bwt0.i0(appCompatImageView2, new z6f0(this, 3));
    }
}

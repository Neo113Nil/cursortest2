package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MusicDynamicRestrictionPopup.kt */
/* loaded from: classes3.dex */
public final class sj40 extends com.vk.music.notifications.inapp.c implements View.OnClickListener {
    public final String i;
    public final int j;
    public final Image k;
    public final String l;
    public final rj40 m;
    public final boolean n;
    public final int o;

    /* compiled from: MusicDynamicRestrictionPopup.kt */
    public static final class a {
        public static sj40 a(Image image, String str, String str2, rj40 rj40Var) {
            return new sj40(str, 0, image, str2, rj40Var, false, 0, 194);
        }

        public static sj40 b(int i, String str, String str2, rj40 rj40Var, int i2) {
            return new sj40(str, i, null, str2, rj40Var, (i2 & 32) == 0, (i2 & 64) == 0 ? R.id.music_device_restriction_notification : 0, 4);
        }
    }

    public sj40(String str, int i, Image image, String str2, rj40 rj40Var, boolean z, int i2, int i3) {
        i = (i3 & 2) != 0 ? 0 : i;
        image = (i3 & 4) != 0 ? null : image;
        z = (i3 & 64) != 0 ? false : z;
        i2 = (i3 & 128) != 0 ? 0 : i2;
        this.i = str;
        this.j = i;
        this.k = image;
        this.l = str2;
        this.m = rj40Var;
        this.n = z;
        this.c = i2;
        this.o = R.layout.popup_music_restriction;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.o;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        String str;
        String str2;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.music_restriction_image);
        if (vKImageView != null) {
            int i = this.j;
            if (i != 0) {
                vKImageView.setImageResource(i);
            } else {
                Image image = this.k;
                if (image != null) {
                    ImageSize Cb = image.Cb(iah0.a(72), true, false);
                    vKImageView.load(Cb != null ? Cb.d.d : null);
                }
            }
        }
        ((TextView) view.findViewById(R.id.music_restriction_title)).setText(this.i);
        ey2.i((TextView) view.findViewById(R.id.music_restriction_content), this.l);
        TextView textView = (TextView) view.findViewById(R.id.music_restriction_primary_action_button);
        rj40 rj40Var = this.m;
        if (rj40Var == null || (str = rj40Var.a) == null || str.length() == 0 || (((str2 = rj40Var.b) == null || str2.length() == 0) && rj40Var.c == null)) {
            bwt0.p0(textView, false);
        } else {
            textView.setText(str);
            textView.setOnClickListener(this);
            bwt0.p0(textView, true);
        }
        bwt0.p0((TextView) view.findViewById(R.id.music_restriction_secondary_action_button), false);
        View findViewById = view.findViewById(R.id.music_restriction_image_btn_hide);
        if (findViewById != null) {
            bwt0.p0(findViewById, this.n);
            findViewById.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rj40 rj40Var;
        d();
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.music_restriction_primary_action_button || (rj40Var = this.m) == null) {
            return;
        }
        Context context = view.getContext();
        gzs<s3q0> gzsVar = rj40Var.c;
        String str = rj40Var.b;
        String str2 = rj40Var.a;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if ((str == null || str.length() == 0) && gzsVar == null) {
            return;
        }
        if (gzsVar != null) {
            gzsVar.invoke();
        } else if (str != null) {
            if (e3m.h(context) == null) {
                bn40.d("Trying to MusicDymamicPopup url link with not compat activity. This may cause a crash");
            }
            xwk.d().e().a(context, str);
        }
    }
}

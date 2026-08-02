package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vkontakte.android.R;
import xsna.a3p0;
import xsna.ngv0;
import xsna.pjd;
import xsna.tlo0;

/* compiled from: ClipsCompilationToolbar.kt */
/* loaded from: classes17.dex */
public final class vnd extends pjd {
    public boolean t;

    @Override // xsna.pjd, xsna.d3p0
    public final void b(a3p0 a3p0Var) {
        vgv0 vgv0Var;
        if (a3p0Var instanceof a3p0.a) {
            a3p0.a aVar = (a3p0.a) a3p0Var;
            ClipGridParams.Data data = aVar.a;
            if (data instanceof ClipGridParams.Data.ClipCompilation) {
                ClipGridParams.Data.ClipCompilation clipCompilation = (ClipGridParams.Data.ClipCompilation) data;
                String str = clipCompilation.b.c;
                this.i = str;
                Context context = this.h;
                this.j = context.getString(R.string.compilation_title);
                ClipsChallenge clipsChallenge = aVar.d;
                String str2 = null;
                if (str != null) {
                    tlo0.h d = oq.d(tlo0.Companion, str);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 2, 6);
                } else {
                    vgv0Var = null;
                }
                this.r.setMiddle(new pgv0(vgv0Var, null, null, null, null, null, 510));
                if (clipsChallenge != null) {
                    NotificationImage notificationImage = clipsChallenge.e;
                    if (notificationImage != null) {
                        str2 = notificationImage.Cb(e3m.a(R.dimen.clips_grid_header_icon_size, context));
                    }
                } else {
                    NotificationImage notificationImage2 = clipCompilation.b.f;
                    if (notificationImage2 != null) {
                        str2 = notificationImage2.Cb(72);
                    }
                }
                n(new pjd.a(R.drawable.vk_icon_cards_2_outline_32, str2));
                m(clipsChallenge);
                o(data);
                super.b(a3p0Var);
            }
        }
    }

    @Override // xsna.sjd
    public final boolean j() {
        return this.t;
    }
}

package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.Size;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class i3r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ i3r(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Drawable a = m33.a(R.drawable.bg_rounded_elevation_fill_16, this.c);
                Drawable mutate = a != null ? a.mutate() : null;
                if (mutate instanceof NinePatchDrawable) {
                    return (NinePatchDrawable) mutate;
                }
                return null;
            case 1:
                return this.c.getString(R.string.vkim_msg_list_time_tomorrow);
            default:
                Context context = this.c;
                ikv0.a aVar = new ikv0.a(context);
                aVar.e = 4000L;
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_horse_toy_outline_music_sa_28, Integer.valueOf(R.attr.vk_ui_icon_warning), (Size) null, 12);
                aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.music_snack_unavailable_kids_content_message), 1), (ikv0.d.b) (null == true ? 1 : 0), (ikv0.d.a) (null == true ? 1 : 0), 6);
                aVar.n();
                return s3q0.a;
        }
    }
}

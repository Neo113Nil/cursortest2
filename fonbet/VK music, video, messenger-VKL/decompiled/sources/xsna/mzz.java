package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.geo.GeoLocation;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;

/* compiled from: LocationVh.kt */
/* loaded from: classes2.dex */
public final class mzz extends vfz<uxz> {
    public final jxz l;
    public final int m;
    public uxz n;
    public final TextView o;
    public final TextView p;
    public final FrescoImageView q;
    public final TextView r;
    public final Drawable s;

    public mzz(View view, kkm kkmVar, jxz jxzVar, int i) {
        super(view);
        this.l = jxzVar;
        this.m = i;
        this.o = (TextView) this.itemView.findViewById(R.id.vkim_location_title);
        this.p = (TextView) this.itemView.findViewById(R.id.vkim_location_subtitle);
        this.q = (FrescoImageView) this.itemView.findViewById(R.id.vkim_location_ic);
        this.r = (TextView) this.itemView.findViewById(R.id.vkim_location_info);
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        this.s = m33.a(R.drawable.ic_send, context);
        bwt0.i0(this.itemView, new igh(this, 25));
        bwt0.k0(this.itemView, new dwg(this, 28));
        kkmVar.e(this.itemView, new fd4(this, 5));
    }

    @Override // xsna.vfz
    public final void W5(uxz uxzVar) {
        String string;
        uxz uxzVar2 = uxzVar;
        String str = uxzVar2.c;
        this.n = uxzVar2;
        GeoLocation geoLocation = uxzVar2.b;
        Context context = this.itemView.getContext();
        View view = this.itemView;
        view.setBackgroundResource(e3m.g(R.attr.selectableItemBackground, view.getContext()));
        EmptyList emptyList = EmptyList.b;
        FrescoImageView frescoImageView = this.q;
        frescoImageView.setRemoteImage((List<? extends fxj0>) emptyList);
        int i = geoLocation.b;
        int i2 = geoLocation.c;
        String str2 = geoLocation.k;
        String str3 = geoLocation.j;
        TextView textView = this.p;
        if (i == -1 || i == -2) {
            int i3 = this.m;
            if (i3 == 0) {
                frescoImageView.setPlaceholder(this.s);
            } else {
                frescoImageView.setPlaceholder(i3);
            }
            if (!g2v.c().f(context)) {
                textView.setVisibility(8);
            }
        } else if (str3 == null || str3.length() == 0) {
            frescoImageView.setPlaceholder(m33.a(R.drawable.vk_icon_place_circle_fill_gray_48, context));
        } else {
            frescoImageView.setRemoteImage(new ImageList(new Image(str3)));
        }
        this.o.setText(geoLocation.i);
        if (geoLocation.b >= 0) {
            int i4 = geoLocation.f;
            if (i4 >= 0) {
                StringBuilder sb = new StringBuilder(k7b0.e(i4, context));
                if (str2 != null && str2.length() != 0) {
                    sb.append(" · ".concat(str2));
                }
                string = sb.toString();
            } else {
                string = context.getString(R.string.vkim_address);
            }
            str = string;
        } else if (str.length() == 0) {
            str = context.getString(R.string.loading);
        }
        textView.setText(str);
        boolean z = i2 > 0;
        TextView textView2 = this.r;
        bwt0.p0(textView2, z);
        textView2.setText(String.valueOf(i2));
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.av20;
import xsna.dw20;

/* compiled from: CatalogDialogs.kt */
/* loaded from: classes16.dex */
public final class i4a {
    public static dw20 a;

    /* compiled from: CatalogDialogs.kt */
    public static final class a {
        public final int a;
        public final CharSequence b;
        public final Integer c;

        public a(int i, String str, Integer num) {
            this.a = i;
            this.b = str;
            this.c = num;
        }
    }

    /* compiled from: CatalogDialogs.kt */
    public static final class b extends s770 {
        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            a aVar = (a) obj;
            aVar.getClass();
            TextView textView = (TextView) hkpVar.f(R.id.action_text);
            textView.setText(aVar.b);
            Integer num = aVar.c;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            hkpVar.d(view.findViewById(R.id.action_text));
            View findViewById = view.findViewById(R.id.action_icon);
            ((ImageView) findViewById).setColorFilter(dhr0.t.c(R.attr.vk_legacy_accent));
            hkpVar.d(findViewById);
            ((ImageView) view.findViewById(R.id.action_check_icon)).setVisibility(8);
            return hkpVar;
        }
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case 3172656:
                if (str.equals("gift")) {
                    return R.drawable.vk_icon_gift_outline_28;
                }
                return 0;
            case 3322014:
                if (str.equals("list")) {
                    return R.drawable.vk_icon_list_outline_28;
                }
                return 0;
            case 3599307:
                if (str.equals("user")) {
                    return R.drawable.vk_icon_user_outline_28;
                }
                return 0;
            case 37109973:
                if (str.equals("request_in")) {
                    return R.drawable.vk_icon_user_incoming_outline_28;
                }
                return 0;
            case 1150415262:
                if (str.equals("request_out")) {
                    return R.drawable.vk_icon_user_outgoing_outline_28;
                }
                return 0;
            default:
                return 0;
        }
    }

    public static void b(Context context, List list, Integer num, izs izsVar) {
        if (num != null) {
            av20.a aVar = new av20.a();
            aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
            aVar.d = new k4a();
            aVar.e = new l4a(izsVar);
            av20 b2 = aVar.b();
            b2.setItems(list);
            dw20.b Z = ((dw20.b) dw20.a.k(new dw20.b(context, null), b2, 4)).Z(new h4a());
            Z.v0(num.intValue()).z0(8388611);
            Z.x(0);
            Z.B0(0);
            a = Z.I0("catalog_filters");
            return;
        }
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
            e.add(new ModalActionSheetListItem(i, ModalActionSheetListItem.Appearance.Default, catalogFilterData.c, null, null, a(catalogFilterData.d), null, catalogFilterData.e, false, 344));
            i = i2;
        }
        c0785a.b = e.g();
        c0785a.c = new qb6(2, izsVar, list);
        c0785a.a(context, "catalog_filters");
    }
}

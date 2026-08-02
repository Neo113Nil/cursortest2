package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.chromium.net.NetError;

/* compiled from: DiscoverMediaPhotoTransformer.kt */
/* loaded from: classes4.dex */
public final class l4n implements gn60<d3n, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(d3n d3nVar) {
        int w;
        int i;
        l3n l3nVar;
        y5n y5nVar;
        String str;
        List<String> list;
        List list2;
        Owner G;
        DiscoverGridItem discoverGridItem = d3nVar.b;
        i170 i170Var = d3nVar.c;
        s1c0 s1c0Var = i170Var.b;
        boolean z = s1c0Var.J;
        DiscoverMediaBlock discoverMediaBlock = d3nVar.a;
        xah0 xah0Var = s1c0Var.q;
        if (xah0Var == null) {
            sf2 sf2Var = new sf2();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            sf2Var.b = context;
            xah0Var = sf2Var.a();
        }
        String str2 = i170Var.c;
        boolean z2 = true;
        int a = z ? iah0.a(1) : iah0.a(2);
        int i2 = (int) (xah0Var.a * xah0Var.b);
        if (xah0Var.c) {
            i2 -= iah0.a(Math.max(64.0f, (r9 + NetError.ERR_DNS_MALFORMED_RESPONSE) / 2.0f));
        }
        int i3 = discoverMediaBlock.l;
        int i4 = i3 - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        int a2 = jq.a(i4, a, i2, i3);
        int i5 = epx.f(str2, "wall_group") ? 3 : 1;
        int i6 = discoverGridItem.e;
        int i7 = (a2 * i6) / i5;
        String str3 = discoverGridItem.f;
        int i8 = discoverGridItem.d;
        DiscoverGridItem.a aVar = discoverGridItem.g;
        String str4 = aVar.c;
        String str5 = aVar.a;
        if (str3 == null || str3.length() == 0 || !z) {
            if (str3 != null && str3.length() != 0) {
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                w = znk0.w(context2, str3);
                i = w;
            }
            i = 0;
        } else {
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            Integer r = znk0.r(context3, str3);
            if (r != null) {
                w = r.intValue();
                i = w;
            }
            i = 0;
        }
        boolean z3 = i != 0;
        Drawable b = (z3 && z) ? dhr0.u.b(i, R.attr.vk_ui_icon_contrast) : z3 ? dhr0.t.a(i) : null;
        if (b != null) {
            l3n l3nVar2 = new l3n();
            l3nVar2.a = b;
            l3nVar = l3nVar2;
        } else {
            l3nVar = null;
        }
        boolean z4 = ((str5 == null || str5.length() == 0) && (str4 == null || str4.length() == 0)) ? false : true;
        boolean z5 = i6 < 2 || i8 < 2;
        boolean z6 = ((str5 == null || str5.length() == 0) && (str4 == null || str4.length() == 0)) ? false : true;
        if (i6 >= 2 && i8 >= 2) {
            z2 = false;
        }
        if (!z6) {
            y5nVar = null;
        } else if (z2) {
            int b2 = cn70.b(8);
            FontFamily fontFamily = FontFamily.REGULAR;
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            y5nVar = new y5n(b2, fontFamily, 9.0f, textSizeUnit, cn70.b(12), cn70.e() * 3.0f, 0, 0.6f, cn70.b(12), fontFamily, 9.0f, textSizeUnit, cn70.e() * 3.0f);
        } else {
            int b3 = cn70.b(16);
            FontFamily fontFamily2 = FontFamily.BOLD;
            TextSizeUnit textSizeUnit2 = TextSizeUnit.SP;
            y5nVar = new y5n(b3, fontFamily2, 14.0f, textSizeUnit2, cn70.b(18), cn70.e() * 4.0f, cn70.b(4), 1.0f, cn70.b(16), FontFamily.REGULAR, 13.0f, textSizeUnit2, cn70.e() * 3.0f);
        }
        n6n n6nVar = z4 ? new n6n() : null;
        PhotoDiscoverGridItem photoDiscoverGridItem = (PhotoDiscoverGridItem) discoverGridItem;
        StringBuilder sb = new StringBuilder();
        Integer u = znk0.u(str3);
        sb.append(u != null ? y8g0.e(u.intValue()) : y8g0.e(R.string.accessibility_discover_media_photo));
        Parcelable parcelable = discoverGridItem.c;
        String str6 = (!(parcelable instanceof wee0) || (G = ((wee0) parcelable).G()) == null) ? null : G.c;
        if (str6 != null && str6.length() != 0) {
            sb.append(", ");
            sb.append(str6);
        }
        Parcelable parcelable2 = photoDiscoverGridItem.c;
        Context context4 = e43.a;
        if (context4 == null) {
            context4 = null;
        }
        Resources resources = context4.getResources();
        if (parcelable2 instanceof rsx0) {
            rsx0 rsx0Var = (rsx0) parcelable2;
            if (rsx0Var.D() > 0) {
                str = pvo0.k(rsx0Var.D(), resources, false);
                if (str != null && str.length() != 0) {
                    sb.append(", ");
                    sb.append(str);
                }
                String sb2 = sb.toString();
                String str7 = photoDiscoverGridItem.j.l.Fb(i7, false).d.d;
                list = discoverGridItem.h;
                if (list == null) {
                    List<String> list3 = list;
                    list2 = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        list2.add(new ean((String) it.next(), null, 2));
                    }
                } else {
                    list2 = EmptyList.b;
                }
                return Collections.singletonList(new k4n(str7, i, z3, z4, z5, sb2, n6nVar, l3nVar, y5nVar, list2));
            }
        }
        str = null;
        if (str != null) {
            sb.append(", ");
            sb.append(str);
        }
        String sb22 = sb.toString();
        String str72 = photoDiscoverGridItem.j.l.Fb(i7, false).d.d;
        list = discoverGridItem.h;
        if (list == null) {
        }
        return Collections.singletonList(new k4n(str72, i, z3, z4, z5, sb22, n6nVar, l3nVar, y5nVar, list2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((d3n) pair);
    }
}

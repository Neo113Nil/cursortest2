package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.newsfeed.common.discover.media.cells.holders.tags.DiscoverTagType;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.chromium.net.NetError;

/* compiled from: DiscoverMediaVideoTransformer.kt */
/* loaded from: classes4.dex */
public final class c6n implements gn60<d3n, wm60> {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new bv0(13));

    /* JADX WARN: Removed duplicated region for block: B:100:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef A[LOOP:0: B:78:0x01e9->B:80:0x01ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0248  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(d3n d3nVar) {
        int i;
        int w;
        Drawable b;
        l3n l3nVar;
        boolean z;
        y5n y5nVar;
        boolean z2;
        Iterable iterable;
        Iterator it;
        StringBuilder sb;
        String str;
        VideoFile videoFile;
        Context context;
        String str2;
        Owner G;
        VideoAttachment videoAttachment;
        DiscoverGridItem discoverGridItem = d3nVar.b;
        String str3 = discoverGridItem.f;
        i170 i170Var = d3nVar.c;
        s1c0 s1c0Var = i170Var.b;
        boolean z3 = s1c0Var.J;
        DiscoverMediaBlock discoverMediaBlock = d3nVar.a;
        xah0 xah0Var = s1c0Var.q;
        if (xah0Var == null) {
            sf2 sf2Var = new sf2();
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            sf2Var.b = context2;
            xah0Var = sf2Var.a();
        }
        String str4 = i170Var.c;
        int a = z3 ? iah0.a(1) : iah0.a(2);
        int i2 = (int) (xah0Var.a * xah0Var.b);
        if (xah0Var.c) {
            i2 -= iah0.a(Math.max(64.0f, (r10 + NetError.ERR_DNS_MALFORMED_RESPONSE) / 2.0f));
        }
        int i3 = discoverMediaBlock.l;
        int i4 = i3 - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        int a2 = jq.a(i4, a, i2, i3);
        int i5 = epx.f(str4, "wall_group") ? 3 : 1;
        int i6 = discoverGridItem.e;
        int i7 = (a2 * i6) / i5;
        int i8 = discoverGridItem.d;
        DiscoverGridItem.a aVar = discoverGridItem.g;
        String str5 = aVar.c;
        String str6 = aVar.a;
        if (str3 != null && str3.length() != 0 && z3) {
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            w = znk0.v(context3, str3);
        } else {
            if (str3 == null || str3.length() == 0) {
                i = 0;
                boolean z4 = i == 0;
                boolean z5 = i == 0;
                b = (!z5 && z3 && (i != R.drawable.vk_icon_live_badge_20 && i != R.drawable.vk_icon_lego_live_badge_20)) ? dhr0.u.b(i, R.attr.vk_ui_icon_contrast) : (z5 || !z3) ? z5 ? dhr0.t.a(i) : null : dhr0.u.a(i);
                if (b != null) {
                    l3n l3nVar2 = new l3n();
                    l3nVar2.a = b;
                    l3nVar = l3nVar2;
                } else {
                    l3nVar = null;
                }
                boolean z6 = (str6 == null && str6.length() != 0) || !(str5 == null || str5.length() == 0);
                boolean z7 = i6 >= 2 || i8 < 2;
                z = (str6 == null && str6.length() != 0) || !(str5 == null || str5.length() == 0);
                boolean z8 = i6 >= 2 || i8 < 2;
                if (!z) {
                    y5nVar = null;
                } else if (z8) {
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
                n6n n6nVar = z6 ? new n6n() : null;
                if (((Boolean) this.b.getValue()).booleanValue()) {
                    VideoDiscoverGridItem videoDiscoverGridItem = discoverGridItem instanceof VideoDiscoverGridItem ? (VideoDiscoverGridItem) discoverGridItem : null;
                    if (videoDiscoverGridItem != null && (videoAttachment = videoDiscoverGridItem.j) != null && di60.G(videoAttachment)) {
                        z2 = true;
                        iterable = discoverGridItem.h;
                        if (iterable == null) {
                            iterable = EmptyList.b;
                        }
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ean((String) it.next(), null, 2));
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        if (z2) {
                            arrayList2.add(new ean(null, DiscoverTagType.OZON_BADGE, 1));
                        }
                        VideoDiscoverGridItem videoDiscoverGridItem2 = (VideoDiscoverGridItem) discoverGridItem;
                        VideoAttachment videoAttachment2 = videoDiscoverGridItem2.j;
                        sb = new StringBuilder();
                        Integer u = znk0.u(str3);
                        sb.append(u == null ? y8g0.e(u.intValue()) : y8g0.e(R.string.accessibility_discover_media_video));
                        Parcelable parcelable = discoverGridItem.c;
                        str = ((parcelable instanceof wee0) || (G = ((wee0) parcelable).G()) == null) ? null : G.c;
                        if (str != null && str.length() != 0) {
                            sb.append(", ");
                            sb.append(str);
                        }
                        Parcelable parcelable2 = videoDiscoverGridItem2.c;
                        videoFile = videoAttachment2.k;
                        context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        Resources resources = context.getResources();
                        if (videoFile.b0() <= 0) {
                            str2 = pvo0.k(videoFile.b0(), resources, false);
                        } else {
                            if (parcelable2 instanceof rsx0) {
                                rsx0 rsx0Var = (rsx0) parcelable2;
                                if (rsx0Var.D() > 0) {
                                    str2 = pvo0.k(rsx0Var.D(), resources, false);
                                }
                            }
                            str2 = null;
                        }
                        if (str2 != null && str2.length() != 0) {
                            sb.append(", ");
                            sb.append(str2);
                        }
                        String sb2 = sb.toString();
                        Image image = videoAttachment2.k.getImage();
                        ImageSize imageSize = (ImageSize) ixj0.c(!image.Db() ? image.c : image.b, i7, i7);
                        return Collections.singletonList(new b6n(imageSize != null ? imageSize.d.d : null, i, z4, z6, z7, z2, sb2, n6nVar, l3nVar, y5nVar, arrayList2, videoDiscoverGridItem2));
                    }
                }
                z2 = false;
                iterable = discoverGridItem.h;
                if (iterable == null) {
                }
                Iterable iterable22 = iterable;
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(arrayList3);
                if (z2) {
                }
                VideoDiscoverGridItem videoDiscoverGridItem22 = (VideoDiscoverGridItem) discoverGridItem;
                VideoAttachment videoAttachment22 = videoDiscoverGridItem22.j;
                sb = new StringBuilder();
                Integer u2 = znk0.u(str3);
                sb.append(u2 == null ? y8g0.e(u2.intValue()) : y8g0.e(R.string.accessibility_discover_media_video));
                Parcelable parcelable3 = discoverGridItem.c;
                if (parcelable3 instanceof wee0) {
                }
                if (str != null) {
                    sb.append(", ");
                    sb.append(str);
                }
                Parcelable parcelable22 = videoDiscoverGridItem22.c;
                videoFile = videoAttachment22.k;
                context = e43.a;
                if (context == null) {
                }
                Resources resources2 = context.getResources();
                if (videoFile.b0() <= 0) {
                }
                if (str2 != null) {
                    sb.append(", ");
                    sb.append(str2);
                }
                String sb22 = sb.toString();
                Image image2 = videoAttachment22.k.getImage();
                ImageSize imageSize2 = (ImageSize) ixj0.c(!image2.Db() ? image2.c : image2.b, i7, i7);
                return Collections.singletonList(new b6n(imageSize2 != null ? imageSize2.d.d : null, i, z4, z6, z7, z2, sb22, n6nVar, l3nVar, y5nVar, arrayList22, videoDiscoverGridItem22));
            }
            Context context4 = e43.a;
            if (context4 == null) {
                context4 = null;
            }
            w = znk0.w(context4, str3);
        }
        i = w;
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i != R.drawable.vk_icon_live_badge_20) {
            if (!z5) {
            }
            if (b != null) {
            }
            if (str6 == null) {
            }
            if (i6 >= 2) {
            }
            if (str6 == null) {
            }
            if (i6 >= 2) {
            }
            if (!z) {
            }
            if (z6) {
            }
            if (((Boolean) this.b.getValue()).booleanValue()) {
            }
            z2 = false;
            iterable = discoverGridItem.h;
            if (iterable == null) {
            }
            Iterable iterable222 = iterable;
            ArrayList arrayList32 = new ArrayList(c5g.u(iterable222, 10));
            it = iterable222.iterator();
            while (it.hasNext()) {
            }
            ArrayList arrayList222 = new ArrayList(arrayList32);
            if (z2) {
            }
            VideoDiscoverGridItem videoDiscoverGridItem222 = (VideoDiscoverGridItem) discoverGridItem;
            VideoAttachment videoAttachment222 = videoDiscoverGridItem222.j;
            sb = new StringBuilder();
            Integer u22 = znk0.u(str3);
            sb.append(u22 == null ? y8g0.e(u22.intValue()) : y8g0.e(R.string.accessibility_discover_media_video));
            Parcelable parcelable32 = discoverGridItem.c;
            if (parcelable32 instanceof wee0) {
            }
            if (str != null) {
            }
            Parcelable parcelable222 = videoDiscoverGridItem222.c;
            videoFile = videoAttachment222.k;
            context = e43.a;
            if (context == null) {
            }
            Resources resources22 = context.getResources();
            if (videoFile.b0() <= 0) {
            }
            if (str2 != null) {
            }
            String sb222 = sb.toString();
            Image image22 = videoAttachment222.k.getImage();
            ImageSize imageSize22 = (ImageSize) ixj0.c(!image22.Db() ? image22.c : image22.b, i7, i7);
            return Collections.singletonList(new b6n(imageSize22 != null ? imageSize22.d.d : null, i, z4, z6, z7, z2, sb222, n6nVar, l3nVar, y5nVar, arrayList222, videoDiscoverGridItem222));
        }
        if (!z5) {
        }
        if (b != null) {
        }
        if (str6 == null) {
        }
        if (i6 >= 2) {
        }
        if (str6 == null) {
        }
        if (i6 >= 2) {
        }
        if (!z) {
        }
        if (z6) {
        }
        if (((Boolean) this.b.getValue()).booleanValue()) {
        }
        z2 = false;
        iterable = discoverGridItem.h;
        if (iterable == null) {
        }
        Iterable iterable2222 = iterable;
        ArrayList arrayList322 = new ArrayList(c5g.u(iterable2222, 10));
        it = iterable2222.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList2222 = new ArrayList(arrayList322);
        if (z2) {
        }
        VideoDiscoverGridItem videoDiscoverGridItem2222 = (VideoDiscoverGridItem) discoverGridItem;
        VideoAttachment videoAttachment2222 = videoDiscoverGridItem2222.j;
        sb = new StringBuilder();
        Integer u222 = znk0.u(str3);
        sb.append(u222 == null ? y8g0.e(u222.intValue()) : y8g0.e(R.string.accessibility_discover_media_video));
        Parcelable parcelable322 = discoverGridItem.c;
        if (parcelable322 instanceof wee0) {
        }
        if (str != null) {
        }
        Parcelable parcelable2222 = videoDiscoverGridItem2222.c;
        videoFile = videoAttachment2222.k;
        context = e43.a;
        if (context == null) {
        }
        Resources resources222 = context.getResources();
        if (videoFile.b0() <= 0) {
        }
        if (str2 != null) {
        }
        String sb2222 = sb.toString();
        Image image222 = videoAttachment2222.k.getImage();
        ImageSize imageSize222 = (ImageSize) ixj0.c(!image222.Db() ? image222.c : image222.b, i7, i7);
        return Collections.singletonList(new b6n(imageSize222 != null ? imageSize222.d.d : null, i, z4, z6, z7, z2, sb2222, n6nVar, l3nVar, y5nVar, arrayList2222, videoDiscoverGridItem2222));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((d3n) pair);
    }
}

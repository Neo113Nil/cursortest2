package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.community.entries.widget.Match;
import com.vk.dto.community.entries.widget.Team;
import com.vk.dto.community.entries.widget.Widget;
import com.vk.dto.community.entries.widget.WidgetCoverList;
import com.vk.dto.community.entries.widget.WidgetDonation;
import com.vk.dto.community.entries.widget.WidgetList;
import com.vk.dto.community.entries.widget.WidgetMatch;
import com.vk.dto.community.entries.widget.WidgetMatches;
import com.vk.dto.community.entries.widget.WidgetTable;
import com.vk.dto.community.entries.widget.WidgetText;
import com.vk.dto.community.entries.widget.WidgetTiles;
import com.vk.dto.money.MoneyTransfer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.pox0;

/* compiled from: WidgetStateMapper.kt */
/* loaded from: classes5.dex */
public final class qox0 {
    public static final rmx0 a(Widget widget) {
        return new rmx0(widget.c, widget.d, widget.g, widget.e, widget.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0232  */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v50, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pox0 b(Widget widget, Context context) {
        ?? r7;
        ?? r72;
        String str;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        String str5;
        Match.Score score;
        Match.Score score2;
        Team team;
        ImageSize Cb;
        Team team2;
        Team team3;
        Team team4;
        Team team5;
        Team team6;
        String str6;
        EmptyList emptyList;
        ?? r6;
        ?? r9;
        ImageSize Cb2;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (widget instanceof WidgetList) {
            WidgetList widgetList = (WidgetList) widget;
            int i2 = jnx0.o;
            rmx0 a = a(widgetList);
            ArrayList arrayList3 = widgetList.h;
            if (arrayList3 != null) {
                arrayList2 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    WidgetList.Item item = (WidgetList.Item) it.next();
                    Image image = item.b;
                    ImageSize Cb3 = image != null ? image.Cb(i2, true, false) : null;
                    arrayList2.add(new pox0.b.C3524b(Cb3 != null ? Cb3.d.d : null, item.c, item.d, item.f, item.g, item.j, item.k, item.l));
                }
            } else {
                arrayList2 = null;
            }
            return new pox0.c(a, arrayList2 != null ? new wow(arrayList2) : null);
        }
        if (widget instanceof WidgetCoverList) {
            WidgetCoverList widgetCoverList = (WidgetCoverList) widget;
            int i3 = iah0.f().widthPixels;
            rmx0 a2 = a(widgetCoverList);
            ArrayList arrayList4 = widgetCoverList.h;
            if (arrayList4 != null) {
                arrayList = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    WidgetCoverList.Item item2 = (WidgetCoverList.Item) it2.next();
                    Image image2 = item2.b;
                    ImageSize Cb4 = image2 != null ? image2.Cb(i3, true, false) : null;
                    arrayList.add(new pox0.b.a(Cb4 != null ? Cb4.d.d : null, item2.c, item2.d, item2.f, item2.g));
                }
            } else {
                arrayList = null;
            }
            return new pox0.c(a2, arrayList != null ? new wow(arrayList) : null);
        }
        if (widget instanceof WidgetTable) {
            WidgetTable widgetTable = (WidgetTable) widget;
            float f = vox0.o;
            rmx0 a3 = a(widgetTable);
            ArrayList arrayList5 = widgetTable.h;
            if (arrayList5 != null) {
                ?? arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    WidgetTable.HeadRowItem headRowItem = (WidgetTable.HeadRowItem) it3.next();
                    String str7 = headRowItem.b;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = headRowItem.c;
                    if (str8 != null) {
                        int hashCode = str8.hashCode();
                        if (hashCode != -1364013995) {
                            if (hashCode != 3317767) {
                                if (hashCode == 108511772 && str8.equals(TtmlNode.RIGHT)) {
                                    i = 6;
                                }
                            } else if (str8.equals(TtmlNode.LEFT)) {
                                i = 5;
                            }
                            arrayList6.add(new pox0.f.a(str7, i, headRowItem.d));
                        } else {
                            str8.equals(TtmlNode.CENTER);
                        }
                    }
                    i = 3;
                    arrayList6.add(new pox0.f.a(str7, i, headRowItem.d));
                }
                str6 = null;
                emptyList = arrayList6;
            } else {
                str6 = null;
                emptyList = EmptyList.b;
            }
            ArrayList arrayList7 = widgetTable.i;
            if (arrayList7 != null) {
                r6 = new ArrayList(c5g.u(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    ArrayList arrayList8 = ((WidgetTable.Row) it4.next()).b;
                    if (arrayList8 != null) {
                        r9 = new ArrayList(c5g.u(arrayList8, 10));
                        Iterator it5 = arrayList8.iterator();
                        while (it5.hasNext()) {
                            WidgetTable.RowItem rowItem = (WidgetTable.RowItem) it5.next();
                            String str9 = rowItem.b;
                            if (str9 == null) {
                                str9 = "";
                            }
                            String str10 = rowItem.c;
                            Image image3 = rowItem.d;
                            r9.add(new pox0.f.b.a(str9, str10, (image3 == null || (Cb2 = image3.Cb((int) f, true, false)) == null) ? str6 : Cb2.d.d));
                        }
                    } else {
                        r9 = EmptyList.b;
                    }
                    r6.add(new pox0.f.b(r9));
                }
            } else {
                r6 = EmptyList.b;
            }
            return new pox0.f(a3, emptyList, r6, f);
        }
        if (widget instanceof WidgetMatch) {
            WidgetMatch widgetMatch = (WidgetMatch) widget;
            int i4 = iah0.f().widthPixels / 3;
            rmx0 a4 = a(widgetMatch);
            Match match = widgetMatch.h;
            String str11 = (match == null || (team6 = match.b) == null) ? null : team6.b;
            String str12 = (match == null || (team5 = match.b) == null) ? null : team5.c;
            if (match != null && (team4 = match.b) != null) {
                Image image4 = team4.d;
                ImageSize Cb5 = image4 != null ? image4.Cb(i4, true, false) : null;
                if (Cb5 != null) {
                    str3 = Cb5.d.d;
                    t7o0 t7o0Var = new t7o0(str11, str12, str3);
                    String str13 = (match != null || (team3 = match.c) == null) ? null : team3.b;
                    String str14 = (match != null || (team2 = match.c) == null) ? null : team2.c;
                    if (match != null && (team = match.c) != null) {
                        Image image5 = team.d;
                        Cb = image5 == null ? image5.Cb(i4, true, false) : null;
                        if (Cb != null) {
                            str4 = Cb.d.d;
                            t7o0 t7o0Var2 = new t7o0(str13, str14, str4);
                            if (match != null) {
                                Image image6 = match.d;
                                ImageSize Cb6 = image6 != null ? image6.Cb(i4, true, false) : null;
                                if (Cb6 != null) {
                                    str5 = Cb6.d.d;
                                    return new pox0.d(a4, new al10(t7o0Var, t7o0Var2, str5, (match != null || (score2 = match.e) == null) ? null : score2.b, (match != null || (score = match.e) == null) ? null : score.c, match == null ? match.f : null, match == null ? match.g : null, match == null ? match.h : null, match == null ? match.i : null));
                                }
                            }
                            str5 = null;
                            return new pox0.d(a4, new al10(t7o0Var, t7o0Var2, str5, (match != null || (score2 = match.e) == null) ? null : score2.b, (match != null || (score = match.e) == null) ? null : score.c, match == null ? match.f : null, match == null ? match.g : null, match == null ? match.h : null, match == null ? match.i : null));
                        }
                    }
                    str4 = null;
                    t7o0 t7o0Var22 = new t7o0(str13, str14, str4);
                    if (match != null) {
                    }
                    str5 = null;
                    return new pox0.d(a4, new al10(t7o0Var, t7o0Var22, str5, (match != null || (score2 = match.e) == null) ? null : score2.b, (match != null || (score = match.e) == null) ? null : score.c, match == null ? match.f : null, match == null ? match.g : null, match == null ? match.h : null, match == null ? match.i : null));
                }
            }
            str3 = null;
            t7o0 t7o0Var3 = new t7o0(str11, str12, str3);
            if (match != null) {
            }
            if (match != null) {
            }
            if (match != null) {
                Image image52 = team.d;
                if (image52 == null) {
                }
                if (Cb != null) {
                }
            }
            str4 = null;
            t7o0 t7o0Var222 = new t7o0(str13, str14, str4);
            if (match != null) {
            }
            str5 = null;
            return new pox0.d(a4, new al10(t7o0Var3, t7o0Var222, str5, (match != null || (score2 = match.e) == null) ? null : score2.b, (match != null || (score = match.e) == null) ? null : score.c, match == null ? match.f : null, match == null ? match.g : null, match == null ? match.h : null, match == null ? match.i : null));
        }
        if (!(widget instanceof WidgetMatches)) {
            if (!(widget instanceof WidgetTiles)) {
                if (!(widget instanceof WidgetDonation)) {
                    if (!(widget instanceof WidgetText)) {
                        return null;
                    }
                    WidgetText widgetText = (WidgetText) widget;
                    return new pox0.g(a(widgetText), widgetText.h, widgetText.i);
                }
                WidgetDonation widgetDonation = (WidgetDonation) widget;
                String o = MoneyTransfer.o(widgetDonation.o);
                rmx0 a5 = a(widgetDonation);
                String str15 = widgetDonation.h;
                String str16 = widgetDonation.i;
                String str17 = widgetDonation.j;
                String str18 = widgetDonation.k;
                int i5 = widgetDonation.m;
                int i6 = widgetDonation.l;
                return new pox0.a(a5, str15, str16, str17, str18, i5 / i6, i5, i6, widgetDonation.n, o);
            }
            WidgetTiles widgetTiles = (WidgetTiles) widget;
            int a6 = iah0.a(128);
            rmx0 a7 = a(widgetTiles);
            ArrayList arrayList9 = widgetTiles.h;
            if (arrayList9 != null) {
                r7 = new ArrayList(c5g.u(arrayList9, 10));
                Iterator it6 = arrayList9.iterator();
                while (it6.hasNext()) {
                    WidgetTiles.Item item3 = (WidgetTiles.Item) it6.next();
                    String str19 = item3.c;
                    String str20 = item3.i;
                    String str21 = item3.d;
                    Image image7 = item3.b;
                    ImageSize Cb7 = image7 != null ? image7.Cb(a6, true, false) : null;
                    pox0.h.a.b bVar = Cb7 != null ? new pox0.h.a.b(Cb7.d.d, Cb7.E0()) : null;
                    String str22 = item3.g;
                    String str23 = item3.f;
                    r7.add(new pox0.h.a(str19, str20, str21, bVar, (str22 == null || str23 == null) ? null : new pox0.h.a.C3526a(str23, str22)));
                }
            } else {
                r7 = EmptyList.b;
            }
            return new pox0.h(a7, r7);
        }
        WidgetMatches widgetMatches = (WidgetMatches) widget;
        int i7 = nnx0.o;
        ArrayList arrayList10 = widgetMatches.h;
        rmx0 a8 = a(widgetMatches);
        if (arrayList10 != null) {
            r72 = new ArrayList(c5g.u(arrayList10, 10));
            Iterator it7 = arrayList10.iterator();
            int i8 = 0;
            while (it7.hasNext()) {
                Object next = it7.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    e43.t();
                    throw null;
                }
                Match match2 = (Match) next;
                boolean z = i8 != e43.h(arrayList10);
                Team team7 = match2.b;
                Match.Score score3 = match2.e;
                String str24 = team7 != null ? team7.b : null;
                if (str24 == null) {
                    str24 = "";
                }
                if (team7 != null) {
                    Image image8 = team7.d;
                    ImageSize Cb8 = image8 != null ? image8.Cb(i7, true, false) : null;
                    str = Cb8 != null ? Cb8.d.d : null;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                pox0.e.a.C3525a c3525a = new pox0.e.a.C3525a(str, str24);
                Team team8 = match2.c;
                String str25 = team8 != null ? team8.b : null;
                if (str25 == null) {
                    str25 = "";
                }
                if (team8 != null) {
                    Image image9 = team8.d;
                    ImageSize Cb9 = image9 != null ? image9.Cb(i7, true, false) : null;
                    str2 = Cb9 != null ? Cb9.d.d : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = null;
                }
                pox0.e.a.C3525a c3525a2 = new pox0.e.a.C3525a(str2, str25);
                String string = (score3 == null || (num = score3.b) == null || (num2 = score3.c) == null) ? context.getString(R.string.community_widget_matches_no_score) : (num == null || num2 == null) ? context.getString(R.string.community_widget_matches_no_score) : context.getString(R.string.community_widget_matches_score, num, num2);
                String str26 = match2.f;
                r72.add(new pox0.e.a(c3525a, c3525a2, str26 == null ? "" : str26, string, z));
                i8 = i9;
            }
        } else {
            r72 = EmptyList.b;
        }
        return new pox0.e(a8, r72);
    }
}

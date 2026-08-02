package xsna;

import android.graphics.Rect;
import com.ironsource.Ad;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.data.BorderType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: DigestDisplayItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class zxm {
    public final com.vk.newsfeed.common.util.j a;
    public final gf7 b;
    public final k2c0 c = new k2c0();

    public zxm(com.vk.newsfeed.common.util.j jVar, b25 b25Var) {
        this.a = jVar;
        this.b = new gf7(b25Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Digest digest, i170 i170Var, ArrayList arrayList, s1c0 s1c0Var) {
        Object obj;
        String str;
        int i;
        int b;
        Rect rect;
        u1c0 u1c0Var;
        int i2;
        Rect rect2;
        Rect rect3;
        String str2;
        String str3;
        int i3;
        ol60 ol60Var;
        Digest digest2 = digest;
        ArrayList arrayList2 = arrayList;
        Digest.Footer footer = digest2.l;
        String str4 = digest2.i;
        s1c0 s1c0Var2 = i170Var.b;
        List<DigestItem> list = digest2.m;
        int i4 = digest2.n & 2;
        String str5 = "inversed";
        gf7 gf7Var = this.b;
        if (i4 == 0 || list.isEmpty()) {
            Object obj2 = "inversed";
            if (digest2.e && list.isEmpty()) {
                arrayList2.add(gf7Var.a(digest2));
                arrayList2.add(new u1c0(284, digest2));
                u1c0 u1c0Var2 = new u1c0(285, digest2);
                u1c0Var2.h = (ol60) j5g.a0(Collections.singletonList(new dzj0(digest2, digest2.f)));
                arrayList2.add(u1c0Var2);
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            if (digest2.k != null) {
                if (s1c0Var2.p) {
                    arrayList2.add(gf7Var.a(digest2));
                } else {
                    arrayList2.add(new u1c0(85, digest2));
                }
            }
            int hashCode = str4.hashCode();
            if (hashCode != -902265784) {
                if (hashCode != 3181382) {
                    if (hashCode == 3322014 && str4.equals("list")) {
                        int i5 = 0;
                        for (Object obj3 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            DigestItem digestItem = (DigestItem) obj3;
                            String str6 = digestItem.b;
                            Object obj4 = obj2;
                            u1c0 u1c0Var3 = new u1c0(digestItem.g, digest2, str6.equals(obj4) ? 139 : str6.equals("spotlight") ? 154 : 87);
                            u1c0Var3.f = i5;
                            arrayList2.add(u1c0Var3);
                            i5 = i6;
                            obj2 = obj4;
                        }
                    }
                } else if (str4.equals("grid")) {
                    arrayList2.add(new u1c0(86, digest2));
                }
            } else if (str4.equals(Ad.d)) {
                Post post = (Post) digest2.q.get(0);
                com.vk.newsfeed.common.util.j jVar = this.a;
                arrayList2.add(jVar.i.b(post, digest2, s1c0Var));
                obj = "button";
                str = str4;
                jVar.d(post, digest2, i170Var.e, i170Var.c, arrayList2, i170Var.b);
                digest2 = digest;
                arrayList2 = arrayList;
                jVar.x(post, digest2, i170Var.b, i170Var.c, arrayList2);
                String str7 = footer == null ? footer.b : null;
                i = !epx.f(str7, obj) ? VersionConstants.PRODUCT_MAJOR_VERSION : epx.f(str7, "text") ? 88 : -1;
                if (i == -1) {
                    arrayList2.add(new u1c0(i, digest2));
                    return;
                } else {
                    if (str.equals("grid")) {
                        arrayList2.add(new p890(digest2, digest2, cn70.b(5)));
                        return;
                    }
                    return;
                }
            }
            str = str4;
            obj = "button";
            if (footer == null) {
            }
            if (!epx.f(str7, obj)) {
            }
            if (i == -1) {
            }
        } else {
            if (!epx.f(str4, "list")) {
                return;
            }
            arrayList2.add(gf7Var.a(digest2));
            int size = arrayList2.size();
            Iterator it = list.iterator();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                Iterator it2 = it;
                if (!it.hasNext()) {
                    String str8 = str4;
                    int size2 = arrayList2.size() - 1;
                    u1c0 u1c0Var4 = (u1c0) arrayList2.get(size);
                    int h = BorderType.TOP.h();
                    if (u1c0Var4 instanceof f28) {
                        p18 k = ((f28) u1c0Var4).k();
                        k.b = h | k.b;
                    }
                    u1c0 u1c0Var5 = (u1c0) arrayList2.get(size2);
                    int h2 = BorderType.BOTTOM.h();
                    if (u1c0Var5 instanceof f28) {
                        p18 k2 = ((f28) u1c0Var5).k();
                        k2.b = h2 | k2.b;
                    }
                    if (size <= size2) {
                        while (true) {
                            u1c0 u1c0Var6 = (u1c0) arrayList2.get(size);
                            if (u1c0Var6 instanceof f28) {
                                f28 f28Var = (f28) u1c0Var6;
                                int h3 = BorderType.MIDDLE.h();
                                p18 k3 = f28Var.k();
                                k3.b = h3 | k3.b;
                                this.c.getClass();
                                f28Var.i(0);
                                f28Var.b().bottom = 0;
                                f28Var.j(((u1c0) arrayList2.get(size)) instanceof f28 ? cn70.b(12) : 0);
                                p18 k4 = f28Var.k();
                                Rect rect4 = k4.a;
                                if (rect4 == null) {
                                    rect4 = new Rect();
                                    k4.a = rect4;
                                }
                                rect4.top = 0;
                                u1c0 u1c0Var7 = (u1c0) arrayList2.get(size);
                                if (u1c0Var7 instanceof f28) {
                                    int h4 = BorderType.BOTTOM.h();
                                    p18 p18Var = ((f28) u1c0Var7).q;
                                    if (p18Var != null && (p18Var.b & h4) != 0) {
                                        b = cn70.b(4);
                                        p18 k5 = f28Var.k();
                                        rect = k5.a;
                                        if (rect == null) {
                                            rect = new Rect();
                                            k5.a = rect;
                                        }
                                        rect.bottom = b;
                                        u1c0Var = (u1c0) arrayList2.get(size);
                                        if ((u1c0Var instanceof f28) && ((f28) u1c0Var).c != 287) {
                                            i2 = cn70.b(12);
                                            p18 k6 = f28Var.k();
                                            rect2 = k6.a;
                                            if (rect2 == null) {
                                                rect2 = new Rect();
                                                k6.a = rect2;
                                            }
                                            rect2.left = i2;
                                            rect3 = k6.a;
                                            if (rect3 == null) {
                                                rect3 = new Rect();
                                                k6.a = rect3;
                                            }
                                            rect3.right = i2;
                                        }
                                        i2 = 0;
                                        p18 k62 = f28Var.k();
                                        rect2 = k62.a;
                                        if (rect2 == null) {
                                        }
                                        rect2.left = i2;
                                        rect3 = k62.a;
                                        if (rect3 == null) {
                                        }
                                        rect3.right = i2;
                                    }
                                }
                                b = 0;
                                p18 k52 = f28Var.k();
                                rect = k52.a;
                                if (rect == null) {
                                }
                                rect.bottom = b;
                                u1c0Var = (u1c0) arrayList2.get(size);
                                if (u1c0Var instanceof f28) {
                                    i2 = cn70.b(12);
                                    p18 k622 = f28Var.k();
                                    rect2 = k622.a;
                                    if (rect2 == null) {
                                    }
                                    rect2.left = i2;
                                    rect3 = k622.a;
                                    if (rect3 == null) {
                                    }
                                    rect3.right = i2;
                                }
                                i2 = 0;
                                p18 k6222 = f28Var.k();
                                rect2 = k6222.a;
                                if (rect2 == null) {
                                }
                                rect2.left = i2;
                                rect3 = k6222.a;
                                if (rect3 == null) {
                                }
                                rect3.right = i2;
                            }
                            if (size == size2) {
                                break;
                            } else {
                                size++;
                            }
                        }
                    }
                    if (epx.f(footer != null ? footer.b : null, "button")) {
                        arrayList2.add(new u1c0(VersionConstants.PRODUCT_MAJOR_VERSION, digest2));
                        return;
                    }
                    if (epx.f(footer != null ? footer.b : null, "text")) {
                        arrayList2.add(new u1c0(88, digest2));
                        return;
                    } else {
                        if (epx.f(str8, "grid")) {
                            arrayList2.add(new p890(digest2, digest2, cn70.b(5)));
                            return;
                        }
                        return;
                    }
                }
                Object next = it2.next();
                int i9 = i7 + 1;
                if (i7 < 0) {
                    e43.t();
                    throw null;
                }
                DigestItem digestItem2 = (DigestItem) next;
                String str9 = digestItem2.b;
                Post post2 = digestItem2.g;
                if (str9.equals(str5)) {
                    str3 = str5;
                    f28 f28Var2 = new f28(post2, digest2, 286);
                    xah0 xah0Var = s1c0Var2.q;
                    if (xah0Var != null) {
                        str2 = str4;
                        ol60Var = (ol60) j5g.a0(new cyq().c(0, new Triple(digestItem2, digest2, xah0Var)));
                    } else {
                        str2 = str4;
                        ol60Var = null;
                    }
                    f28Var2.h = ol60Var;
                    i3 = i8 + 1;
                    f28Var2.f = i8;
                    arrayList2.add(f28Var2);
                } else {
                    str2 = str4;
                    str3 = str5;
                    if (str9.equals("spotlight")) {
                        f28 f28Var3 = new f28(post2, digest2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
                        xah0 xah0Var2 = s1c0Var2.q;
                        f28Var3.h = xah0Var2 != null ? (ol60) j5g.a0(new hyq().a(0, new Triple(digestItem2, digest2, xah0Var2))) : null;
                        i3 = i8 + 1;
                        f28Var3.f = i8;
                        arrayList2.add(f28Var3);
                    } else {
                        it = it2;
                        i7 = i9;
                        str5 = str3;
                        str4 = str2;
                    }
                }
                i8 = i3;
                it = it2;
                i7 = i9;
                str5 = str3;
                str4 = str2;
            }
        }
    }
}

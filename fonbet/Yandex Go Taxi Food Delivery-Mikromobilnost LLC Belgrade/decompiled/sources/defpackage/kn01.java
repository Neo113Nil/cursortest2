package defpackage;

import android.net.Uri;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferContactsUtils$Companion$ElementsType;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferListItemData$PartnerWithAction$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.common.a;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhonePlaceholder;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputState$SelectedPhone$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import com.ybsdk.widgets.common.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class kn01 implements ev31 {
    public final List a;
    public final ph01 b;
    public on01 c;

    public kn01(qh01 qh01Var) {
        l1z l1zVar = l1z.a;
        this.a = scc.g(l1zVar, l1zVar, l1zVar);
        this.b = new ph01((a) ((srb) qh01Var.a.a).get(), TransferContactsUtils$Companion$ElementsType.TRANSFERS);
    }

    public static boolean a(jfb0 jfb0Var, hn01 hn01Var) {
        jfb0 jfb0Var2;
        return jl40.l(jfb0Var.b(), (hn01Var == null || (jfb0Var2 = hn01Var.a) == null) ? null : jfb0Var2.b()) && hn01Var.b == TransferPhoneInputState$SelectedPhone$Status.CHECKING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0626  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.util.ArrayList, java.util.Collection] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        u8j0 u8j0Var;
        PhoneSelectionScenario phoneSelectionScenario;
        Integer num;
        Integer valueOf;
        EmptyList emptyList;
        boolean z;
        int i;
        String str;
        int i2;
        Text.Resource h;
        Pair pair;
        stz0 stz0Var;
        boolean z2;
        kao kaoVar;
        c cVar;
        int i3;
        Text.Constant i4;
        on01 on01Var;
        rbv f;
        boolean z3;
        boolean z4;
        List singletonList;
        boolean z5;
        List list;
        List singletonList2;
        List list2;
        List list3;
        Throwable th;
        List list4;
        List list5;
        ?? r15;
        EmptyList emptyList2;
        String a;
        boolean z6;
        zbv vnoVar;
        zbv n2v0Var;
        boolean z7;
        in01 in01Var = (in01) obj;
        omy0 omy0Var = omy0.b;
        u8j0 u8j0Var2 = in01Var.h;
        hn01 hn01Var = in01Var.e;
        u8j0 u8j0Var3 = in01Var.a;
        br51 br51Var = in01Var.j;
        u8j0 u8j0Var4 = in01Var.b;
        String str2 = in01Var.f;
        PhoneSelectionScenario phoneSelectionScenario2 = in01Var.k;
        u8j0 u8j0Var5 = in01Var.c;
        ?? r14 = this.a;
        EmptyList emptyList3 = EmptyList.a;
        ph01 ph01Var = this.b;
        Throwable th2 = null;
        if (u8j0Var5 == null) {
            u8j0 u8j0Var6 = in01Var.g;
            if ((u8j0Var6 instanceof t8j0) || (u8j0Var2 instanceof t8j0) || ((z3 = u8j0Var4 instanceof t8j0)) || (u8j0Var3 instanceof t8j0)) {
                u8j0Var = u8j0Var3;
                phoneSelectionScenario = phoneSelectionScenario2;
            } else {
                jfb0 jfb0Var = (jfb0) u8j0Var6.a();
                if (jfb0Var == null) {
                    u8j0Var = u8j0Var3;
                    phoneSelectionScenario = phoneSelectionScenario2;
                    singletonList = emptyList3;
                } else {
                    int i5 = jn01.a[phoneSelectionScenario2.ordinal()];
                    u8j0Var = u8j0Var3;
                    if (i5 == 1) {
                        z4 = jfb0Var.c() || jfb0Var.d();
                    } else {
                        if (i5 != 2) {
                            w511.b();
                            return null;
                        }
                        z4 = jfb0Var.c();
                    }
                    String c = jfb0Var.c() ? xi91.c(jfb0Var.b()) : jfb0Var.a();
                    boolean a2 = a(jfb0Var, hn01Var);
                    phoneSelectionScenario = phoneSelectionScenario2;
                    yi01 yi01Var = new yi01(jfb0Var, gly0.b);
                    Text.Constant i6 = g8e.i(Text.Companion, c);
                    Text.Resource resource = new Text.Resource(dzh0.ybsdk_transfer_transfer_copied_text);
                    int i7 = vxg0.ybsdk_transfer_ic_copy_with_background;
                    ph01Var.getClass();
                    singletonList = Collections.singletonList(new bj01(yi01Var, i6, resource, new vno(i7, 7), Integer.valueOf(z4 ? vxg0.ybsdk_ic_arrow_select : vxg0.ybsdk_ic_contact_ban), z4, !a2, a2));
                }
                jfb0 jfb0Var2 = (jfb0) u8j0Var2.a();
                if (jfb0Var2 == null) {
                    list = singletonList;
                    singletonList2 = emptyList3;
                } else {
                    int i8 = jn01.a[phoneSelectionScenario.ordinal()];
                    if (i8 == 1) {
                        z5 = jfb0Var2.c() || jfb0Var2.d();
                    } else {
                        if (i8 != 2) {
                            w511.b();
                            return null;
                        }
                        z5 = jfb0Var2.c();
                    }
                    String c2 = jfb0Var2.c() ? xi91.c(jfb0Var2.b()) : jfb0Var2.a();
                    list = singletonList;
                    Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_myself_title);
                    boolean a3 = a(jfb0Var2, hn01Var);
                    yi01 yi01Var2 = new yi01(jfb0Var2, omy0Var);
                    Text.Constant constant = new Text.Constant(c2);
                    ph01Var.getClass();
                    singletonList2 = Collections.singletonList(new bj01(yi01Var2, h2, constant, new n2v0(27, h2), Integer.valueOf(vxg0.ybsdk_ic_arrow_select), z5, !a3, a3));
                }
                boolean z8 = u8j0Var4 instanceof s8j0;
                List singletonList3 = z8 ? Collections.singletonList(ph01Var.a()) : emptyList3;
                if (z3) {
                    list2 = singletonList2;
                    list3 = singletonList3;
                } else {
                    if (!z8 && !(u8j0Var4 instanceof r8j0)) {
                        w511.b();
                        return null;
                    }
                    ?? r5 = (List) u8j0Var4.a();
                    EmptyList emptyList4 = r5;
                    if (r5 == 0) {
                        emptyList4 = emptyList3;
                    }
                    ?? r11 = (List) u8j0Var.a();
                    if (r11 != 0) {
                        emptyList3 = r11;
                    }
                    if (emptyList3.isEmpty()) {
                        list2 = singletonList2;
                        list3 = singletonList3;
                        th = null;
                        emptyList2 = emptyList4;
                    } else {
                        ArrayList arrayList = new ArrayList(emptyList4);
                        ?? arrayList2 = new ArrayList();
                        int i9 = 0;
                        for (Object obj2 : emptyList3) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                Throwable th3 = th2;
                                scc.m();
                                throw th3;
                            }
                            kqq0 kqq0Var = (kqq0) obj2;
                            Iterator it = arrayList.iterator();
                            int i11 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    list4 = singletonList2;
                                    list5 = singletonList3;
                                    i11 = -1;
                                    break;
                                }
                                list4 = singletonList2;
                                list5 = singletonList3;
                                if (jl40.l(((v9e) it.next()).b.b, kqq0Var.a)) {
                                    break;
                                }
                                i11++;
                                singletonList3 = list5;
                                singletonList2 = list4;
                            }
                            int i12 = i11;
                            if (i12 >= 0) {
                                arrayList2.add(arrayList.remove(i12));
                                r15 = th2;
                            } else {
                                com.google.i18n.phonenumbers.a aVar = jfb0.h;
                                jfb0 c3 = wi91.c(kqq0Var.a);
                                if (c3 != null) {
                                    String str3 = kqq0Var.b;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    r15 = th2;
                                    arrayList2.add(new v9e(str3, c3, r15));
                                } else {
                                    r15 = th2;
                                    x4c.g("Sender history contains wrong number", r15, oyr.i(i9, "position: "), r15, 10);
                                }
                            }
                            th2 = r15;
                            i9 = i10;
                            singletonList3 = list5;
                            singletonList2 = list4;
                        }
                        list2 = singletonList2;
                        list3 = singletonList3;
                        th = th2;
                        ycc.r(arrayList, arrayList2);
                        emptyList2 = arrayList2;
                    }
                    int i13 = jn01.a[phoneSelectionScenario.ordinal()];
                    if (i13 == 1) {
                        a = kfb0.a(str2);
                    } else {
                        if (i13 != 2) {
                            w511.b();
                            return th;
                        }
                        a = str2;
                    }
                    List b = ph01Var.b(a, emptyList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : b) {
                        v9e v9eVar = (v9e) obj3;
                        int i14 = jn01.a[phoneSelectionScenario.ordinal()];
                        if (i14 == 1) {
                            z7 = true;
                        } else {
                            if (i14 != 2) {
                                w511.b();
                                return null;
                            }
                            z7 = v9eVar.b.c();
                        }
                        if (z7) {
                            arrayList3.add(obj3);
                        }
                    }
                    r14 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        v9e v9eVar2 = (v9e) it2.next();
                        jfb0 jfb0Var3 = v9eVar2.b;
                        Uri uri = v9eVar2.c;
                        String str4 = v9eVar2.a;
                        String c4 = jfb0Var3.c() ? xi91.c(jfb0Var3.b()) : jfb0Var3.a();
                        String str5 = evu0.J(str4) ? c4 : str4;
                        if (evu0.J(str4)) {
                            c4 = null;
                        }
                        Iterator it3 = it2;
                        int i15 = jn01.a[phoneSelectionScenario.ordinal()];
                        if (i15 == 1) {
                            z6 = jfb0Var3.c() || jfb0Var3.d();
                        } else {
                            if (i15 != 2) {
                                w511.b();
                                return null;
                            }
                            z6 = jfb0Var3.c();
                        }
                        boolean a4 = a(jfb0Var3, hn01Var);
                        yi01 yi01Var3 = new yi01(jfb0Var3, omy0Var);
                        Text.Constant i16 = g8e.i(Text.Companion, str5);
                        Text.Constant constant2 = c4 != null ? new Text.Constant(c4) : null;
                        String uri2 = uri != null ? uri.toString() : null;
                        if (uri2 != null && !evu0.J(uri2)) {
                            n2v0Var = new r3k0(str4, String.valueOf(uri));
                        } else if (evu0.J(str4)) {
                            vnoVar = new vno(vxg0.ybsdk_default_avatar, 7);
                            r14.add(new bj01(yi01Var3, i16, constant2, vnoVar, Integer.valueOf(!z6 ? vxg0.ybsdk_ic_arrow_select : vxg0.ybsdk_ic_contact_ban), z6, !a4, a4));
                            it2 = it3;
                        } else {
                            n2v0Var = new n2v0(27, new Text.Constant(str4));
                        }
                        vnoVar = n2v0Var;
                        r14.add(new bj01(yi01Var3, i16, constant2, vnoVar, Integer.valueOf(!z6 ? vxg0.ybsdk_ic_arrow_select : vxg0.ybsdk_ic_contact_ban), z6, !a4, a4));
                        it2 = it3;
                    }
                }
                r14 = kotlin.collections.a.m0(list3, kotlin.collections.a.m0((Iterable) r14, kotlin.collections.a.m0(list2, list)));
            }
        } else {
            u8j0Var = u8j0Var3;
            phoneSelectionScenario = phoneSelectionScenario2;
            if (u8j0Var5 instanceof s8j0) {
                emptyList = emptyList3;
                z = true;
                boolean h3 = ph01Var.c.h(str2);
                int[] iArr = jn01.a;
                i = iArr[phoneSelectionScenario.ordinal()];
                if (i != 1) {
                    str = str2;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    str = h3 ? kfb0.e(str2) : str2;
                }
                Collection collection = (Collection) u8j0Var.a();
                i2 = jn01.b[((collection != null || collection.isEmpty()) ? in01Var.i : PhonePlaceholder.PHONE_OR_CONTACT).ordinal()];
                if (i2 != 1) {
                    h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_name_or_phone_placeholder);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    h = unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_phone_placeholder);
                }
                Text.Resource resource2 = h;
                if (z) {
                    int i17 = iArr[phoneSelectionScenario.ordinal()];
                    if (i17 == 1) {
                        String str6 = in01Var.l;
                        pair = new Pair(str6 != null ? g8e.i(Text.Companion, str6) : unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_crossborder_header_title), unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_crossborder_header_subtitle));
                    } else {
                        if (i17 != 2) {
                            w511.b();
                            return null;
                        }
                        pair = new Pair(unr0.h(Text.Companion, dzh0.ybsdk_transfer_transfer_phone_selection_title), new Text.Resource(dzh0.ybsdk_transfer_sbp_title));
                    }
                    Text text = (Text) pair.getFirst();
                    Text.Resource resource3 = (Text.Resource) pair.getSecond();
                    z2 = false;
                    stz0Var = new stz0(text, resource3, null, null, null, new ntz0(0), false, null, null, null, null, null, 32732);
                } else {
                    stz0Var = new stz0(Text.Empty.INSTANCE, null, null, null, null, new ntz0(0), false, null, null, null, null, null, 32734);
                    z2 = false;
                }
                stz0 stz0Var2 = stz0Var;
                if (!(u8j0Var5 instanceof s8j0)) {
                    kaoVar = r501.a(((s8j0) u8j0Var5).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
                } else {
                    if (!(u8j0Var5 instanceof r8j0) && !(u8j0Var5 instanceof t8j0) && u8j0Var5 != null) {
                        w511.b();
                        return null;
                    }
                    kaoVar = null;
                }
                if (br51Var == null) {
                    Text.Constant i18 = g8e.i(Text.Companion, br51Var.a);
                    String str7 = br51Var.b;
                    Text.Constant constant3 = str7 != null ? new Text.Constant(str7) : null;
                    ActionButtonEntity actionButtonEntity = br51Var.d;
                    Text text2 = actionButtonEntity != null ? actionButtonEntity.getText() : null;
                    ActionButtonEntity actionButtonEntity2 = br51Var.e;
                    Text text3 = actionButtonEntity2 != null ? actionButtonEntity2.getText() : null;
                    ThemedImageUrlEntity themedImageUrlEntity = br51Var.c;
                    cVar = new c(i18, constant3, (themedImageUrlEntity == null || (f = job1.f(themedImageUrlEntity, new ri01(27))) == null) ? null : new bks(f, new aks(kp50.r(200), kp50.r(120)), 4), true, text2, text3);
                } else {
                    cVar = null;
                }
                i3 = iArr[phoneSelectionScenario.ordinal()];
                if (i3 != 1) {
                    if (str2.length() == 0 || h3) {
                        i4 = g8e.i(Text.Companion, "+");
                    }
                    i4 = null;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    if (h3) {
                        i4 = g8e.i(Text.Companion, "+7 ");
                    }
                    i4 = null;
                }
                on01 on01Var2 = this.c;
                boolean z9 = vi01.a(on01Var2 == null ? on01Var2.a : null) == vi01.a(emptyList) ? true : z2;
                on01 on01Var3 = this.c;
                boolean c5 = vi01.c(on01Var3 == null ? on01Var3.a : null, emptyList);
                u8j0Var4.getClass();
                boolean z10 = u8j0Var4 instanceof t8j0;
                on01 on01Var4 = new on01(emptyList, str, i4, resource2, kaoVar, cVar, z9, c5, stz0Var2, !z10, (!z10 || (on01Var = this.c) == null || on01Var.j) ? z2 : true);
                this.c = on01Var4;
                return on01Var4;
            }
            if (!(u8j0Var5 instanceof t8j0)) {
                if (!(u8j0Var5 instanceof r8j0)) {
                    w511.b();
                    return null;
                }
                List<wi01> list6 = (List) ((r8j0) u8j0Var5).a;
                r14 = new ArrayList(tcc.n(list6, 10));
                for (wi01 wi01Var : list6) {
                    TransferListItemData$PartnerWithAction$Status transferListItemData$PartnerWithAction$Status = wi01Var.b;
                    b bVar = Text.Companion;
                    PartnerWithActionEntity partnerWithActionEntity = wi01Var.a;
                    Text.Constant i19 = g8e.i(bVar, partnerWithActionEntity.getTitle());
                    String description = partnerWithActionEntity.getDescription();
                    Text.Constant constant4 = description != null ? new Text.Constant(description) : null;
                    ThemedImageUrlEntity themedImage = partnerWithActionEntity.getThemedImage();
                    zbv qtwVar = themedImage != null ? new qtw(themedImage, 4) : new s2u0(20);
                    int i20 = si01.a[transferListItemData$PartnerWithAction$Status.ordinal()];
                    if (i20 == 1 || i20 == 2) {
                        num = null;
                    } else {
                        if (i20 == 3) {
                            valueOf = Integer.valueOf(txg0.ybsdk_ic_ban);
                        } else {
                            if (i20 != 4) {
                                w511.b();
                                return null;
                            }
                            valueOf = Integer.valueOf(nyg0.ybsdk_ic_check);
                        }
                        num = valueOf;
                    }
                    r14.add(new bj01(wi01Var, i19, constant4, qtwVar, num, transferListItemData$PartnerWithAction$Status != TransferListItemData$PartnerWithAction$Status.NOT_FOUND, transferListItemData$PartnerWithAction$Status == TransferListItemData$PartnerWithAction$Status.DEFAULT, transferListItemData$PartnerWithAction$Status == TransferListItemData$PartnerWithAction$Status.CHECKING));
                }
            }
        }
        z = false;
        emptyList = r14;
        boolean h32 = ph01Var.c.h(str2);
        int[] iArr2 = jn01.a;
        i = iArr2[phoneSelectionScenario.ordinal()];
        if (i != 1) {
        }
        Collection collection2 = (Collection) u8j0Var.a();
        i2 = jn01.b[((collection2 != null || collection2.isEmpty()) ? in01Var.i : PhonePlaceholder.PHONE_OR_CONTACT).ordinal()];
        if (i2 != 1) {
        }
        Text.Resource resource22 = h;
        if (z) {
        }
        stz0 stz0Var22 = stz0Var;
        if (!(u8j0Var5 instanceof s8j0)) {
        }
        if (br51Var == null) {
        }
        i3 = iArr2[phoneSelectionScenario.ordinal()];
        if (i3 != 1) {
        }
        on01 on01Var22 = this.c;
        if (vi01.a(on01Var22 == null ? on01Var22.a : null) == vi01.a(emptyList)) {
        }
        on01 on01Var32 = this.c;
        boolean c52 = vi01.c(on01Var32 == null ? on01Var32.a : null, emptyList);
        u8j0Var4.getClass();
        boolean z102 = u8j0Var4 instanceof t8j0;
        on01 on01Var42 = new on01(emptyList, str, i4, resource22, kaoVar, cVar, z9, c52, stz0Var22, !z102, (!z102 || (on01Var = this.c) == null || on01Var.j) ? z2 : true);
        this.c = on01Var42;
        return on01Var42;
    }
}

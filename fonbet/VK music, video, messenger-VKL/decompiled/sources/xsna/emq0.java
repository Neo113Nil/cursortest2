package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: UserProfileAdvertBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class emq0 extends dri<UserProfileAdapterItem.a> {
    public static final a q = new a();
    public final dmq0 n;
    public final wh50 o;
    public final boolean p;

    /* compiled from: UserProfileAdvertBannerViewHolder.kt */
    public static final class a extends eri<emq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new emq0(composeView, new dmq0(1, slq0Var, slq0.class, "send", "send(Lcom/vk/profile/user/impl/ui/UserProfileAction;)V", 0));
        }
    }

    /* compiled from: UserProfileAdvertBannerViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsBannerDto.ThemeDto.values().length];
            try {
                iArr[GroupsBannerDto.ThemeDto.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsBannerDto.ThemeDto.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsBannerDto.ThemeDto.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public emq0(ComposeView composeView, dmq0 dmq0Var) {
        super(composeView);
        this.n = dmq0Var;
        this.o = androidx.compose.runtime.k.b(null);
        this.p = dhr0.a.c(this.itemView.getContext());
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.a aVar = (UserProfileAdapterItem.a) obj;
        ((zak0) this.o).setValue(aVar != null ? aVar.c : null);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1099585608);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1099585608, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.Content (UserProfileAdvertBannerViewHolder.kt:62)");
            }
            yc0 yc0Var = (yc0) ((zak0) this.o).getValue();
            if (yc0Var == null) {
                M.K(39366959);
                M.j();
            } else {
                M.K(39366960);
                boolean y = M.y(this);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (y || x == c0012a) {
                    x = new gib0(this, 18);
                    M.R(x);
                }
                izs<? super String, s3q0> izsVar = (izs) x;
                boolean y2 = M.y(this);
                Object x2 = M.x();
                if (y2 || x2 == c0012a) {
                    x2 = new k7l0(this, 13);
                    M.R(x2);
                }
                t6(yc0Var, this.p, izsVar, (izs) x2, M, (i2 << 9) & 57344);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.q(this, i, 11);
        }
    }

    public final void s6(final fuv0 fuv0Var, final yc0 yc0Var, final boolean z, final ofc0 ofc0Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1717705751);
        int i2 = i | (M.J(fuv0Var) ? 4 : 2) | (M.J(yc0Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(ofc0Var) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1717705751, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertInformationTooltip (UserProfileAdvertBannerViewHolder.kt:250)");
            }
            zhf0 zhf0Var = (zhf0) ofc0Var.invoke();
            if (zhf0Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs(fuv0Var, yc0Var, z, ofc0Var, i) { // from class: xsna.bmq0
                        public final /* synthetic */ fuv0 c;
                        public final /* synthetic */ yc0 d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ ofc0 f;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(1);
                            emq0.this.s6(this.c, this.d, this.e, this.f, q630.a.a, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            rrv0.e(z, null, null, null, null, null, kai.c(777129996, new ote(fuv0Var, yc0Var, zhf0Var), M), M, ((i2 >> 6) & 14) | 1572864, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            final q630 q630Var3 = q630Var2;
            s2.d = new wzs(fuv0Var, yc0Var, z, ofc0Var, q630Var3, i) { // from class: xsna.cmq0
                public final /* synthetic */ fuv0 c;
                public final /* synthetic */ yc0 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ofc0 f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    emq0.this.s6(this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [T, xsna.wh50] */
    public final void t6(final yc0 yc0Var, final boolean z, final izs<? super String, s3q0> izsVar, final izs<? super String, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj;
        String url;
        String str;
        androidx.compose.runtime.a aVar2;
        boolean z2;
        Object obj2;
        Object obj3;
        androidx.compose.runtime.a M = aVar.M(-798384022);
        if ((i & 6) == 0) {
            i2 = (M.J(yc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-798384022, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertisingBanner (UserProfileAdvertBannerViewHolder.kt:95)");
            }
            final guv0 s = sdi.s(false, false, M, 6, 2);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            ref$ObjectRef.element = (wh50) x;
            GroupsBannerDto.IconPositionDto iconPositionDto = yc0Var.l;
            GroupsBannerDto.ThemeDto themeDto = yc0Var.k;
            List<BaseImageDto> list = yc0Var.j;
            boolean z3 = iconPositionDto == GroupsBannerDto.IconPositionDto.LEFT;
            int i3 = themeDto == null ? -1 : b.$EnumSwitchMapping$0[themeDto.ordinal()];
            if (i3 == 1) {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.LIGHT) {
                                break;
                            }
                        }
                    }
                    BaseImageDto baseImageDto = (BaseImageDto) obj;
                    if (baseImageDto != null) {
                        url = baseImageDto.getUrl();
                        str = url;
                    }
                }
                str = null;
            } else if (i3 != 2) {
                if (i3 == 3) {
                    BaseImageDto.ThemeDto themeDto2 = dhr0.M() ? BaseImageDto.ThemeDto.DARK : BaseImageDto.ThemeDto.LIGHT;
                    if (list != null) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            } else {
                                obj3 = it2.next();
                                if (((BaseImageDto) obj3).d() == themeDto2) {
                                    break;
                                }
                            }
                        }
                        BaseImageDto baseImageDto2 = (BaseImageDto) obj3;
                        if (baseImageDto2 != null) {
                            url = baseImageDto2.getUrl();
                            str = url;
                        }
                    }
                }
                str = null;
            } else {
                if (list != null) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it3.next();
                            if (((BaseImageDto) obj2).d() == BaseImageDto.ThemeDto.DARK) {
                                break;
                            }
                        }
                    }
                    BaseImageDto baseImageDto3 = (BaseImageDto) obj2;
                    if (baseImageDto3 != null) {
                        url = baseImageDto3.getUrl();
                        str = url;
                    }
                }
                str = null;
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new xlq0(0);
                M.R(x2);
            }
            final lg90 l = fwu0.l(null, str, (izs) x2, null, M, 24576, 45);
            int i4 = themeDto == null ? -1 : b.$EnumSwitchMapping$0[themeDto.ordinal()];
            if (i4 == 1) {
                aVar2 = M;
                z2 = false;
            } else if (i4 != 2) {
                z2 = dhr0.M();
                aVar2 = M;
            } else {
                aVar2 = M;
                z2 = true;
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            final String str2 = str;
            final boolean z4 = z3;
            rrv0.e(z2, null, null, null, null, null, kai.c(1610794087, new wzs() { // from class: xsna.ylq0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v3, types: [xsna.gzs] */
                /* JADX WARN: Type inference failed for: r14v3, types: [xsna.wzs] */
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v4, types: [xsna.gzs] */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r4v5, types: [xsna.wzs] */
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    String str3;
                    final boolean z5;
                    a.C0011a.C0012a c0012a2;
                    lg90 lg90Var;
                    lg90 lg90Var2;
                    Object obj6;
                    fuv0 fuv0Var;
                    Ref$ObjectRef ref$ObjectRef2;
                    String str4;
                    int i5;
                    long j;
                    lg90 lg90Var3;
                    Object obj7;
                    Object obj8;
                    ?? r15;
                    List<BaseImageDto> list2;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1610794087, intValue, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertisingBanner.<anonymous> (UserProfileAdvertBannerViewHolder.kt:137)");
                        }
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D = aVar4.D();
                        q630 c = qri.c(aVar4, q630.a.a);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d, cri.a.f);
                        k9q0.w(aVar4, D, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c, cri.a.d);
                        final yc0 yc0Var2 = yc0.this;
                        String str5 = yc0Var2.b;
                        String str6 = yc0Var2.g;
                        String str7 = yc0Var2.h;
                        String str8 = yc0Var2.i;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str9 = str5;
                        String str10 = yc0Var2.c;
                        boolean z6 = z4;
                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                        if (str8 == null || !z6) {
                            str3 = str10;
                            z5 = z6;
                            c0012a2 = c0012a3;
                            lg90Var = null;
                            aVar4.K(545804769);
                            aVar4.j();
                            lg90Var2 = null;
                        } else {
                            aVar4.K(545466621);
                            String str11 = yc0Var2.i;
                            Object x3 = aVar4.x();
                            if (x3 == c0012a3) {
                                x3 = new h2h0(9);
                                aVar4.R(x3);
                            }
                            str3 = str10;
                            c0012a2 = c0012a3;
                            z5 = z6;
                            lg90Var = null;
                            lg90 l2 = fwu0.l(null, str11, (izs) x3, null, aVar4, 24576, 45);
                            aVar4.j();
                            lg90Var2 = l2;
                        }
                        fuv0 fuv0Var2 = s;
                        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                        if (str7 != null) {
                            aVar4.K(545954499);
                            Object c2 = kai.c(801902942, new mq1(10, fuv0Var2, ref$ObjectRef3), aVar4);
                            aVar4.j();
                            obj6 = c2;
                        } else {
                            aVar4.K(547178689);
                            aVar4.j();
                            obj6 = lg90Var;
                        }
                        int i6 = str7 != null ? 2 : 3;
                        lg90 lg90Var4 = (yc0Var2.k == null || (list2 = yc0Var2.j) == null || list2.isEmpty()) ? lg90Var : l;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var.getBackground().g;
                        if (str8 == null || yc0Var2.l != GroupsBannerDto.IconPositionDto.RIGHT) {
                            fuv0Var = fuv0Var2;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            str4 = str6;
                            i5 = i6;
                            j = j2;
                            aVar4.K(548168705);
                            aVar4.j();
                            lg90Var3 = lg90Var;
                        } else {
                            aVar4.K(547853621);
                            String str12 = yc0Var2.i;
                            Object x4 = aVar4.x();
                            if (x4 == c0012a2) {
                                x4 = new u620(27);
                                aVar4.R(x4);
                            }
                            ref$ObjectRef2 = ref$ObjectRef3;
                            str4 = str6;
                            i5 = i6;
                            j = j2;
                            fuv0Var = fuv0Var2;
                            lg90Var3 = fwu0.l(null, str12, (izs) x4, null, aVar4, 24576, 45);
                            aVar4.j();
                        }
                        if (!yc0Var2.e.equals(Boolean.TRUE) || yc0Var2.d == null) {
                            aVar4.K(548382977);
                            aVar4.j();
                            obj7 = lg90Var;
                        } else {
                            aVar4.K(548303338);
                            izs izsVar3 = izsVar;
                            boolean J = aVar4.J(izsVar3) | aVar4.J(yc0Var2);
                            Object x5 = aVar4.x();
                            if (J || x5 == c0012a2) {
                                x5 = new a94(18, izsVar3, yc0Var2);
                                aVar4.R(x5);
                            }
                            aVar4.j();
                            obj7 = (gzs) x5;
                        }
                        String str13 = yc0Var2.f;
                        final izs izsVar4 = izsVar2;
                        if (str13 == null || str4 == null) {
                            aVar4.K(549657697);
                            aVar4.j();
                            obj8 = lg90Var;
                        } else {
                            aVar4.K(548555554);
                            final String str14 = str2;
                            Object c3 = kai.c(263097351, new wzs() { // from class: xsna.amq0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj9, Object obj10) {
                                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj9;
                                    int intValue2 = ((Integer) obj10).intValue();
                                    if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(263097351, intValue2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileAdvertBannerViewHolder.AdvertisingBanner.<anonymous>.<anonymous>.<anonymous> (UserProfileAdvertBannerViewHolder.kt:202)");
                                        }
                                        yc0 yc0Var3 = yc0.this;
                                        String str15 = yc0Var3.f;
                                        ButtonSize buttonSize = ButtonSize.Small;
                                        boolean z7 = z5;
                                        String str16 = str14;
                                        ButtonStyle buttonStyle = (z7 && str16 == null) ? ButtonStyle.Secondary : ButtonStyle.Primary;
                                        ButtonAppearance buttonAppearance = (z7 && str16 == null) ? ButtonAppearance.Accent : ButtonAppearance.Neutral;
                                        Object x6 = aVar6.x();
                                        a.C0011a.C0012a c0012a4 = a.C0011a.a;
                                        if (x6 == c0012a4) {
                                            x6 = new zlm0(5);
                                            aVar6.R(x6);
                                        }
                                        q630 b2 = egi0.b(q630.a.a, false, (izs) x6);
                                        izs izsVar5 = izsVar4;
                                        boolean J2 = aVar6.J(izsVar5) | aVar6.J(yc0Var3);
                                        Object x7 = aVar6.x();
                                        if (J2 || x7 == c0012a4) {
                                            x7 = new y4(27, izsVar5, yc0Var3);
                                            aVar6.R(x7);
                                        }
                                        bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, b2, null, false, false, null, null, null, str15, null, null, null, null, false, null, null, null, aVar6, 48, 0, 0, 4190176);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar6.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar4);
                            aVar4.j();
                            obj8 = c3;
                        }
                        if (str4 != null) {
                            aVar4.K(549770878);
                            boolean J2 = aVar4.J(izsVar4) | aVar4.J(yc0Var2);
                            Object x6 = aVar4.x();
                            if (J2 || x6 == c0012a2) {
                                x6 = new gd0(18, izsVar4, yc0Var2);
                                aVar4.R(x6);
                            }
                            aVar4.j();
                            r15 = (gzs) x6;
                        } else {
                            aVar4.K(549862049);
                            aVar4.j();
                            r15 = lg90Var;
                        }
                        Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                        com.vk.profile.design.compose.banner.a.a(str9, null, str3, obj6, i5, 2, 1, lg90Var4, new l5g(j), null, lg90Var2, lg90Var3, obj7, obj8, r15, aVar4, 18546688, 514);
                        androidx.compose.runtime.a aVar6 = aVar4;
                        if (fuv0Var.isVisible()) {
                            aVar6.K(549983693);
                            this.s6(fuv0Var, yc0Var2, z, new ofc0(ref$ObjectRef4, 17), null, aVar6, 0);
                            aVar6 = aVar6;
                        } else {
                            aVar6.K(539332341);
                        }
                        aVar6.j();
                        aVar6.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, aVar3), aVar3, 1572864, 62);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.zlq0
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    emq0.this.t6(yc0Var, z, izsVar, izsVar2, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

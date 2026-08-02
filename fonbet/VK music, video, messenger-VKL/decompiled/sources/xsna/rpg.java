package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.design.compose.banner.VkBannerDefaults;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityAdBannerComposeView.kt */
/* loaded from: classes5.dex */
public final class rpg extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final boolean p;

    /* compiled from: CommunityAdBannerComposeView.kt */
    public static final /* synthetic */ class a {
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

    public rpg(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(new qt0(16));
        this.o = androidx.compose.runtime.k.b(new e60(16));
        this.p = dhr0.a.c(context);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1931911697);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1931911697, i2, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.ThemedContent (CommunityAdBannerComposeView.kt:66)");
            }
            upg composeViewModel = getComposeViewModel();
            if (composeViewModel == null) {
                M.K(1019679342);
                M.j();
            } else {
                M.K(1019679343);
                C(composeViewModel.b, this.p, getOnHideClicked(), getOnUrlButtonClicked(), M, 32768 | ((i2 << 12) & 57344));
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
            s.d = new com.vk.movika.tools.controls.seekbar.h(this, i, 2);
        }
    }

    public final void B(final fuv0 fuv0Var, final zc0 zc0Var, final boolean z, final com.vk.movika.sdk.base.logic.processor.actions.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1306822506);
        int i2 = i | (M.J(fuv0Var) ? 4 : 2) | (M.J(zc0Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(dVar) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1306822506, i2, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertInformationTooltip (CommunityAdBannerComposeView.kt:243)");
            }
            zhf0 zhf0Var = (zhf0) dVar.invoke();
            if (zhf0Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs(fuv0Var, zc0Var, z, dVar, i) { // from class: xsna.npg
                        public final /* synthetic */ fuv0 c;
                        public final /* synthetic */ zc0 d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ com.vk.movika.sdk.base.logic.processor.actions.d f;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(262145);
                            rpg.this.B(this.c, this.d, this.e, this.f, q630.a.a, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            rrv0.e(z, null, null, null, null, null, kai.c(1668958905, new nn7(fuv0Var, zc0Var, zhf0Var), M), M, ((i2 >> 6) & 14) | 1572864, 62);
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
            s2.d = new wzs(fuv0Var, zc0Var, z, dVar, q630Var3, i) { // from class: xsna.opg
                public final /* synthetic */ fuv0 c;
                public final /* synthetic */ zc0 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ com.vk.movika.sdk.base.logic.processor.actions.d f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(262145);
                    rpg.this.B(this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [T, xsna.wh50] */
    public final void C(final zc0 zc0Var, final boolean z, final izs<? super String, s3q0> izsVar, final izs<? super String, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj;
        String url;
        String str;
        final guv0 guv0Var;
        boolean z2;
        Object obj2;
        Object obj3;
        androidx.compose.runtime.a M = aVar.M(281696023);
        if ((i & 6) == 0) {
            i2 = (M.J(zc0Var) ? 4 : 2) | i;
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
            i2 |= (32768 & i) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(281696023, i2, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertisingBanner (CommunityAdBannerComposeView.kt:84)");
            }
            guv0 s = sdi.s(false, false, M, 6, 2);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            ref$ObjectRef.element = (wh50) x;
            GroupsBannerDto.IconPositionDto iconPositionDto = zc0Var.l;
            GroupsBannerDto.ThemeDto themeDto = zc0Var.k;
            List<BaseImageDto> list = zc0Var.j;
            final boolean z3 = iconPositionDto == GroupsBannerDto.IconPositionDto.LEFT;
            int i3 = themeDto == null ? -1 : a.$EnumSwitchMapping$0[themeDto.ordinal()];
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
                x2 = new ot(16);
                M.R(x2);
            }
            final lg90 l = fwu0.l(null, str, (izs) x2, null, M, 24576, 45);
            int i4 = themeDto == null ? -1 : a.$EnumSwitchMapping$0[themeDto.ordinal()];
            if (i4 == 1) {
                guv0Var = s;
                z2 = false;
            } else if (i4 != 2) {
                z2 = dhr0.M();
                guv0Var = s;
            } else {
                guv0Var = s;
                z2 = true;
            }
            final String str2 = str;
            rrv0.e(z2, null, null, null, null, null, kai.c(1671238932, new wzs() { // from class: xsna.ppg
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v1, types: [xsna.gzs] */
                /* JADX WARN: Type inference failed for: r14v3, types: [xsna.wzs] */
                /* JADX WARN: Type inference failed for: r15v3, types: [xsna.gzs] */
                /* JADX WARN: Type inference failed for: r4v6, types: [xsna.wzs] */
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    String str3;
                    GroupsBannerDto.ThemeDto themeDto3;
                    final boolean z4;
                    a.C0011a.C0012a c0012a2;
                    lg90 lg90Var;
                    lg90 lg90Var2;
                    Object obj6;
                    Ref$ObjectRef ref$ObjectRef2;
                    lg90 lg90Var3;
                    a.C0011a.C0012a c0012a3;
                    fuv0 fuv0Var;
                    long j;
                    lg90 lg90Var4;
                    Object obj7;
                    Object obj8;
                    Object obj9;
                    List<BaseImageDto> list2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1671238932, intValue, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertisingBanner.<anonymous> (CommunityAdBannerComposeView.kt:127)");
                        }
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, q630.a.a);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        final zc0 zc0Var2 = zc0.this;
                        String str4 = zc0Var2.b;
                        String str5 = zc0Var2.g;
                        String str6 = zc0Var2.h;
                        String str7 = zc0Var2.i;
                        GroupsBannerDto.ThemeDto themeDto4 = zc0Var2.k;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str8 = str4;
                        String str9 = zc0Var2.c;
                        VkBannerDefaults.BackgroundMode backgroundMode = themeDto4 == GroupsBannerDto.ThemeDto.DARK ? VkBannerDefaults.BackgroundMode.Dark : VkBannerDefaults.BackgroundMode.Light;
                        boolean z5 = z3;
                        a.C0011a.C0012a c0012a4 = a.C0011a.a;
                        if (str7 == null || !z5) {
                            str3 = str9;
                            themeDto3 = themeDto4;
                            z4 = z5;
                            c0012a2 = c0012a4;
                            lg90Var = null;
                            aVar2.K(-1251720684);
                            aVar2.j();
                            lg90Var2 = null;
                        } else {
                            aVar2.K(-1252035768);
                            String str10 = zc0Var2.i;
                            Object x3 = aVar2.x();
                            if (x3 == c0012a4) {
                                x3 = new py(14);
                                aVar2.R(x3);
                            }
                            themeDto3 = themeDto4;
                            str3 = str9;
                            z4 = z5;
                            c0012a2 = c0012a4;
                            lg90Var = null;
                            lg90 l2 = fwu0.l(null, str10, (izs) x3, null, aVar2, 24576, 45);
                            aVar2.j();
                            lg90Var2 = l2;
                        }
                        fuv0 fuv0Var2 = guv0Var;
                        Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                        if (str6 != null) {
                            aVar2.K(-1251570954);
                            Object c2 = kai.c(2052851084, new qed(1, fuv0Var2, ref$ObjectRef3), aVar2);
                            aVar2.j();
                            obj6 = c2;
                        } else {
                            aVar2.K(-1250346764);
                            aVar2.j();
                            obj6 = lg90Var;
                        }
                        int i5 = str6 != null ? 2 : 3;
                        lg90 lg90Var5 = (themeDto3 == null || (list2 = zc0Var2.j) == null || list2.isEmpty()) ? lg90Var : l;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var.getBackground().g;
                        if (str7 == null || zc0Var2.l != GroupsBannerDto.IconPositionDto.RIGHT) {
                            ref$ObjectRef2 = ref$ObjectRef3;
                            lg90Var3 = lg90Var5;
                            c0012a3 = c0012a2;
                            fuv0Var = fuv0Var2;
                            j = j2;
                            aVar2.K(-1249356748);
                            aVar2.j();
                            lg90Var4 = lg90Var;
                        } else {
                            aVar2.K(-1249671832);
                            String str11 = zc0Var2.i;
                            Object x4 = aVar2.x();
                            c0012a3 = c0012a2;
                            if (x4 == c0012a3) {
                                x4 = new yy(15);
                                aVar2.R(x4);
                            }
                            lg90Var3 = lg90Var5;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            j = j2;
                            fuv0Var = fuv0Var2;
                            lg90Var4 = fwu0.l(null, str11, (izs) x4, null, aVar2, 24576, 45);
                            aVar2.j();
                        }
                        if (!zc0Var2.e.equals(Boolean.TRUE) || zc0Var2.d == null) {
                            aVar2.K(-1249142476);
                            aVar2.j();
                            obj7 = lg90Var;
                        } else {
                            aVar2.K(-1249222115);
                            izs izsVar3 = izsVar;
                            boolean J = aVar2.J(izsVar3) | aVar2.J(zc0Var2);
                            Object x5 = aVar2.x();
                            if (J || x5 == c0012a3) {
                                x5 = new j4(11, izsVar3, zc0Var2);
                                aVar2.R(x5);
                            }
                            aVar2.j();
                            obj7 = (gzs) x5;
                        }
                        String str12 = zc0Var2.f;
                        final izs izsVar4 = izsVar2;
                        if (str12 == null || str5 == null) {
                            aVar2.K(-1247867756);
                            aVar2.j();
                            obj8 = lg90Var;
                        } else {
                            aVar2.K(-1248969899);
                            final String str13 = str2;
                            Object c3 = kai.c(-2088765613, new wzs() { // from class: xsna.mpg
                                @Override // xsna.wzs
                                public final Object invoke(Object obj10, Object obj11) {
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj10;
                                    int intValue2 = ((Integer) obj11).intValue();
                                    if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-2088765613, intValue2, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertisingBanner.<anonymous>.<anonymous>.<anonymous> (CommunityAdBannerComposeView.kt:195)");
                                        }
                                        zc0 zc0Var3 = zc0.this;
                                        String str14 = zc0Var3.f;
                                        ButtonSize buttonSize = ButtonSize.Small;
                                        boolean z6 = z4;
                                        String str15 = str13;
                                        ButtonStyle buttonStyle = (z6 && str15 == null) ? ButtonStyle.Secondary : ButtonStyle.Primary;
                                        ButtonAppearance buttonAppearance = (z6 && str15 == null) ? ButtonAppearance.Accent : ButtonAppearance.Neutral;
                                        Object x6 = aVar4.x();
                                        a.C0011a.C0012a c0012a5 = a.C0011a.a;
                                        if (x6 == c0012a5) {
                                            x6 = new qm0(16);
                                            aVar4.R(x6);
                                        }
                                        q630 b = egi0.b(q630.a.a, false, (izs) x6);
                                        izs izsVar5 = izsVar4;
                                        boolean J2 = aVar4.J(izsVar5) | aVar4.J(zc0Var3);
                                        Object x7 = aVar4.x();
                                        if (J2 || x7 == c0012a5) {
                                            x7 = new yk(3, izsVar5, zc0Var3);
                                            aVar4.R(x7);
                                        }
                                        bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, b, null, false, false, null, null, null, str14, null, null, null, null, false, null, null, null, aVar4, 48, 0, 0, 4190176);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2);
                            aVar2.j();
                            obj8 = c3;
                        }
                        if (str5 != null) {
                            aVar2.K(-1247754575);
                            boolean J2 = aVar2.J(izsVar4) | aVar2.J(zc0Var2);
                            Object x6 = aVar2.x();
                            if (J2 || x6 == c0012a3) {
                                x6 = new uk(7, izsVar4, zc0Var2);
                                aVar2.R(x6);
                            }
                            aVar2.j();
                            obj9 = (gzs) x6;
                        } else {
                            aVar2.K(-1247663404);
                            aVar2.j();
                            obj9 = lg90Var;
                        }
                        Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
                        com.vk.profile.design.compose.banner.a.a(str8, null, str3, obj6, i5, 2, 1, lg90Var3, new l5g(j), backgroundMode, lg90Var2, lg90Var4, obj7, obj8, obj9, aVar2, 18546688, 2);
                        androidx.compose.runtime.a aVar4 = aVar2;
                        if (fuv0Var.isVisible()) {
                            aVar4.K(-1247541760);
                            this.B(fuv0Var, zc0Var2, z, new com.vk.movika.sdk.base.logic.processor.actions.d(ref$ObjectRef4, 25), null, aVar4, SQLiteDatabase.OPEN_PRIVATECACHE);
                            aVar4 = aVar4;
                        } else {
                            aVar4.K(-1257738776);
                        }
                        aVar4.j();
                        aVar4.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 1572864, 62);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.qpg
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    rpg.this.C(zc0Var, z, izsVar, izsVar2, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final upg getComposeViewModel() {
        return (upg) ((zak0) this.m).getValue();
    }

    public final izs<String, s3q0> getOnHideClicked() {
        return (izs) ((zak0) this.n).getValue();
    }

    public final izs<String, s3q0> getOnUrlButtonClicked() {
        return (izs) ((zak0) this.o).getValue();
    }

    public final void setComposeViewModel(upg upgVar) {
        ((zak0) this.m).setValue(upgVar);
    }

    public final void setOnHideClicked(izs<? super String, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }

    public final void setOnUrlButtonClicked(izs<? super String, s3q0> izsVar) {
        ((zak0) this.o).setValue(izsVar);
    }
}

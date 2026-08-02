package xsna;

import com.vk.api.generated.account.dto.AccountGetHelpHintsResponseDto;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.account.dto.AccountHelpHintDto;
import com.vk.api.generated.account.dto.AccountHelpHintResourceItemDto;
import com.vk.api.generated.account.dto.AccountInfoDownloadProfilerSettingsDto;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.account.dto.AccountInfoMarketAdult18plusDto;
import com.vk.api.generated.account.dto.AccountInfoMessagesCounterSettingsDto;
import com.vk.api.generated.account.dto.AccountInfoProfilerSettingsDto;
import com.vk.api.generated.account.dto.AccountInfoSettingsDto;
import com.vk.api.generated.account.dto.AccountInfoVideoPlayerDto;
import com.vk.api.generated.account.dto.AccountSubscriptionsItemsInfoDto;
import com.vk.api.generated.account.dto.AccountUserSettingsDto;
import com.vk.api.generated.account.dto.AccountUserSettingsVerificationStatusDto;
import com.vk.api.generated.audio.dto.AudioAdsConfigDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.money.dto.MoneyP2pParamsDto;
import com.vk.dto.CounterSettings;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.account.DownloadPattern;
import com.vk.dto.common.account.ProfilerConfig;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.EmailStatus;
import com.vk.im.engine.models.PhoneStatus;
import com.vk.im.engine.models.VerificationStatus;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.account.AccountRole;
import com.vk.im.engine.models.account.CommonConfig;
import com.vk.im.engine.models.account.MoneyConfig;
import com.vk.im.engine.models.account.NameChangeRequestInfo;
import com.vk.im.engine.models.account.SupportedLanguagesPair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bs;

/* compiled from: AccountInfoGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class uo extends com.vk.api.request.rx.batch.c<AccountInfoDto, AccountUserSettingsDto, List<? extends AccountGetUserObjectDto>, AccountGetHelpHintsResponseDto, AccountInfo> {
    public final long v;
    public final List<String> w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uo(long j) {
        super(r2, r3, yfb.x(bs.a.a((12 & 4) == 0 ? "nom" : null, (12 & 1) != 0 ? null : r4, r5)), yfb.x(bs.c(new es(), r0, 6)));
        List<String> list;
        HintCategories.Companion.getClass();
        list = HintCategories.DEFAULT$1;
        dz2 x = yfb.x(bs.a.b(null));
        dz2 x2 = yfb.x(new tfx("account.getProfileInfo", new tq(0), new ar(0)));
        gzs<s3q0> gzsVar = fkq0.a;
        List singletonList = Collections.singletonList(new UserId(j));
        List c0 = drm0.c0(ky2.b, new String[]{StringUtils.COMMA}, 0, 6);
        this.v = j;
        this.w = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x041e  */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object] */
    @Override // com.vk.api.request.rx.batch.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccountInfo K0(bv6<AccountInfoDto> bv6Var, bv6<AccountUserSettingsDto> bv6Var2, bv6<List<? extends AccountGetUserObjectDto>> bv6Var3, bv6<AccountGetHelpHintsResponseDto> bv6Var4) {
        ImageList imageList;
        AccountInfoDto accountInfoDto;
        AudioAdConfig audioAdConfig;
        VideoConfig videoConfig;
        AccountUserSettingsDto accountUserSettingsDto;
        ProfilerConfig profilerConfig;
        AccountSubscriptionsItemsInfoDto accountSubscriptionsItemsInfoDto;
        int i;
        AccountInfoSettingsDto s;
        int i2;
        AccountInfoSettingsDto s2;
        int i3;
        String K;
        int hashCode;
        AccountRole accountRole;
        String e;
        List<AccountInfoSettingsDto> W;
        String str;
        UserNameType a;
        List<String> o;
        EmptyList emptyList;
        ProfilerConfig profilerConfig2;
        LinkedHashMap linkedHashMap;
        AccountInfoSettingsDto accountInfoSettingsDto;
        String f;
        String f2;
        String f3;
        AccountSubscriptionsItemsInfoDto accountSubscriptionsItemsInfoDto2;
        String f4;
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        AccountInfoDto accountInfoDto2 = bv6Var.a;
        AccountUserSettingsDto accountUserSettingsDto2 = bv6Var2.a;
        AccountGetUserObjectDto accountGetUserObjectDto = (AccountGetUserObjectDto) j5g.Y(bv6Var3.a);
        AccountGetHelpHintsResponseDto accountGetHelpHintsResponseDto = bv6Var4.a;
        Long i4 = accountGetUserObjectDto.i();
        long j = this.v;
        long longValue = i4 != null ? i4.longValue() : j;
        String f5 = accountGetUserObjectDto.f();
        String str2 = f5 == null ? "" : f5;
        String j2 = accountGetUserObjectDto.j();
        String str3 = j2 == null ? "" : j2;
        String l = accountGetUserObjectDto.l();
        if (l == null) {
            l = defpackage.k0.a(j, "id");
        }
        String str4 = l;
        String i5 = accountUserSettingsDto2.i();
        String str5 = i5 == null ? "" : i5;
        String d = accountUserSettingsDto2.d();
        String str6 = d == null ? "" : d;
        new sm6();
        BaseSexDto n = accountGetUserObjectDto.n();
        if (n == null) {
            n = BaseSexDto.UNKNOWN;
        }
        UserSex a2 = sm6.a(n);
        BaseCountryDto d2 = accountGetUserObjectDto.d();
        int id = d2 != null ? d2.getId() : 0;
        String k = accountGetUserObjectDto.k();
        if (k != null) {
            AvatarSize avatarSize = AvatarSize.PHOTO_BASE;
            imageList = new ImageList(new Image(avatarSize.k(), avatarSize.k(), k, avatarSize.l()));
        } else {
            imageList = new ImageList(null, 1, null);
        }
        ImageList imageList2 = imageList;
        String e2 = accountGetUserObjectDto.e();
        String str7 = e2 == null ? "" : e2;
        Boolean p = accountGetUserObjectDto.p();
        boolean booleanValue = p != null ? p.booleanValue() : false;
        Boolean l2 = accountUserSettingsDto2.l();
        boolean booleanValue2 = l2 != null ? l2.booleanValue() : false;
        String l0 = accountInfoDto2.l0();
        String str8 = l0 == null ? "" : l0;
        String c = z23.c("\\D", accountInfoDto2.C(), "");
        AccountInfoDto.PhoneStatusDto D = accountInfoDto2.D();
        String i6 = D != null ? D.i() : null;
        if (i6 == null) {
            i6 = "";
        }
        PhoneStatus phoneStatus = i6.equals("validated") ? PhoneStatus.VALIDATED : i6.equals("waiting") ? PhoneStatus.WAITING : PhoneStatus.UNKNOWN;
        String f6 = accountInfoDto2.f();
        String i7 = accountInfoDto2.i();
        String str9 = i7 == null ? "" : i7;
        String j3 = accountInfoDto2.j();
        if (j3 == null) {
            j3 = "";
        }
        EmailStatus emailStatus = j3.equals("confirmed") ? EmailStatus.CONFIRMED : j3.equals("need_confirmation") ? EmailStatus.NEED_CONFIRMATION : EmailStatus.UNKNOWN;
        String e3 = accountInfoDto2.e();
        String str10 = e3 == null ? "" : e3;
        AudioAdsConfigDto d3 = accountInfoDto2.d();
        if (d3 != null) {
            List<AccountInfoSettingsDto> W2 = accountInfoDto2.W();
            int d4 = d3.d();
            int f7 = d3.f();
            List<String> g = d3.g();
            accountInfoDto = accountInfoDto2;
            ArrayList arrayList = new ArrayList(c5g.u(g, 10));
            for (String str11 : g) {
                AudioAdConfig.Type.Companion.getClass();
                AudioAdConfig.Type a3 = AudioAdConfig.Type.a.a(str11);
                if (a3 == null) {
                    throw new IllegalArgumentException("Illegal id value: ".concat(str11));
                }
                arrayList.add(a3);
            }
            List<String> e4 = d3.e();
            if (W2 != null) {
                Iterator it = W2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((AccountInfoSettingsDto) obj2).f(), "audio_ads")) {
                        break;
                    }
                }
                AccountInfoSettingsDto accountInfoSettingsDto2 = (AccountInfoSettingsDto) obj2;
                if (accountInfoSettingsDto2 != null) {
                    z2 = accountInfoSettingsDto2.d();
                    audioAdConfig = new AudioAdConfig(d4, f7, arrayList, e4, z2);
                }
            }
            z2 = false;
            audioAdConfig = new AudioAdConfig(d4, f7, arrayList, e4, z2);
        } else {
            accountInfoDto = accountInfoDto2;
            audioAdConfig = new AudioAdConfig(0, 0, null, null, false, 31, null);
        }
        AccountInfoVideoPlayerDto v0 = accountInfoDto.v0();
        if (v0 != null) {
            List<AccountInfoSettingsDto> W3 = accountInfoDto.W();
            int e5 = v0.e();
            VideoConfig.PlayerType.a aVar = VideoConfig.PlayerType.Companion;
            int f8 = v0.f();
            aVar.getClass();
            VideoConfig.PlayerType a4 = VideoConfig.PlayerType.a.a(f8);
            if (a4 == null) {
                a4 = VideoConfig.PlayerType.EXO;
            }
            VideoConfig.PlayerType playerType = a4;
            long d5 = v0.d();
            if (W3 != null) {
                Iterator it2 = W3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (epx.f(((AccountInfoSettingsDto) obj).f(), "video_discover")) {
                        break;
                    }
                }
                AccountInfoSettingsDto accountInfoSettingsDto3 = (AccountInfoSettingsDto) obj;
                if (accountInfoSettingsDto3 != null) {
                    z = accountInfoSettingsDto3.d();
                    videoConfig = new VideoConfig(e5, playerType, d5, false, z, 8, null);
                }
            }
            z = false;
            videoConfig = new VideoConfig(e5, playerType, d5, false, z, 8, null);
        } else {
            videoConfig = new VideoConfig(0, null, 0L, false, false, 31, null);
        }
        MoneyP2pParamsDto p2 = accountInfoDto.p();
        List<AccountInfoSettingsDto> W4 = accountInfoDto.W();
        int f9 = p2 != null ? p2.f() : 0;
        int e6 = p2 != null ? p2.e() : 0;
        String d6 = p2 != null ? p2.d() : null;
        String str12 = d6 == null ? "" : d6;
        boolean a5 = h730.a("payment_type", W4);
        boolean a6 = h730.a("money_p2p", W4);
        boolean a7 = h730.a("money_clubs_p2p", W4);
        boolean a8 = h730.a("money_requests_p2p", W4);
        boolean a9 = h730.a("wallet", W4);
        String y0 = accountInfoDto.y0();
        String str13 = y0 == null ? "" : y0;
        String D0 = accountInfoDto.D0();
        String str14 = D0 == null ? "" : D0;
        AccountInfoDto.VkPayAppIdDto w0 = accountInfoDto.w0();
        MoneyConfig moneyConfig = new MoneyConfig(f9, e6, str12, a5, a6, a7, a8, a9, str13, str14, w0 != null ? w0.i() : 0);
        AccountInfoProfilerSettingsDto G = accountInfoDto.G();
        if (G != null) {
            boolean d7 = G.d();
            List<AccountInfoDownloadProfilerSettingsDto> e7 = G.e();
            ArrayList arrayList2 = new ArrayList(c5g.u(e7, 10));
            Iterator it3 = e7.iterator();
            while (it3.hasNext()) {
                AccountInfoDownloadProfilerSettingsDto accountInfoDownloadProfilerSettingsDto = (AccountInfoDownloadProfilerSettingsDto) it3.next();
                arrayList2.add(new DownloadPattern(accountInfoDownloadProfilerSettingsDto.getType(), accountInfoDownloadProfilerSettingsDto.d(), accountInfoDownloadProfilerSettingsDto.e(), accountInfoDownloadProfilerSettingsDto.e()));
                it3 = it3;
                accountUserSettingsDto2 = accountUserSettingsDto2;
            }
            accountUserSettingsDto = accountUserSettingsDto2;
            profilerConfig = new ProfilerConfig(d7, arrayList2);
        } else {
            accountUserSettingsDto = accountUserSettingsDto2;
            profilerConfig = new ProfilerConfig(false, null, 3, null);
        }
        List<AccountInfoSettingsDto> W5 = accountInfoDto.W();
        AccountInfoSettingsDto s3 = d370.s("audio_background_limit", W5);
        boolean r = d370.r("webview_authorization", W5);
        boolean r2 = d370.r("stories", W5);
        boolean r3 = d370.r("story_replies", W5);
        boolean r4 = d370.r("stories_reposts", W5);
        AccountInfoSettingsDto s4 = d370.s("stories_photo_duration", W5);
        long j4 = 5000;
        if (s4 != null && (f4 = s4.f()) != null) {
            byte[] bArr = x2r0.a;
            try {
                j4 = Long.parseLong(f4);
            } catch (NumberFormatException unused) {
            }
        }
        long j5 = j4;
        boolean r5 = d370.r("masks", W5);
        boolean r6 = d370.r("animated_stickers", W5);
        boolean r7 = d370.r("calls", W5);
        boolean r8 = d370.r("vk_apps", W5);
        boolean r9 = d370.r("games", W5);
        boolean r10 = d370.r("camera_pingpong", W5);
        List<AccountSubscriptionsItemsInfoDto> a0 = accountInfoDto.a0();
        if (a0 != null) {
            Iterator it4 = a0.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    accountSubscriptionsItemsInfoDto2 = 0;
                    break;
                }
                accountSubscriptionsItemsInfoDto2 = it4.next();
                if (((AccountSubscriptionsItemsInfoDto) accountSubscriptionsItemsInfoDto2).getId() == 1) {
                    break;
                }
            }
            accountSubscriptionsItemsInfoDto = accountSubscriptionsItemsInfoDto2;
        } else {
            accountSubscriptionsItemsInfoDto = null;
        }
        boolean z3 = accountSubscriptionsItemsInfoDto != null;
        boolean r11 = d370.r("audio_ads", W5);
        boolean r12 = d370.r("audio_restrictions", W5);
        if (s3 != null) {
            AccountInfoSettingsDto accountInfoSettingsDto4 = s3.d() ? s3 : null;
            if (accountInfoSettingsDto4 != null && (f3 = accountInfoSettingsDto4.f()) != null) {
                i = Integer.parseInt(f3);
                int i8 = i;
                boolean r13 = d370.r("playlists_download", W5);
                boolean r14 = d370.r("audio_recommendations", W5);
                boolean r15 = d370.r("video_autoplay", W5);
                boolean r16 = d370.r("boom", W5);
                Boolean F = accountInfoDto.F();
                boolean booleanValue3 = F == null ? F.booleanValue() : false;
                boolean r17 = d370.r("bugs", W5);
                long intValue = accountInfoDto.R() == null ? r4.intValue() : 0L;
                long intValue2 = accountInfoDto.T() == null ? r4.intValue() : 0L;
                long intValue3 = accountInfoDto.M() != null ? r4.intValue() : 0L;
                Boolean Z = accountInfoDto.Z();
                boolean booleanValue4 = Z == null ? Z.booleanValue() : false;
                s = d370.s("messages_import_contacts", W5);
                if (s != null) {
                    if (!s.d()) {
                        s = null;
                    }
                    if (s != null && (f2 = s.f()) != null) {
                        i2 = Integer.parseInt(f2);
                        boolean z4 = i2 > 0;
                        s2 = d370.s("messages_show_banner_teacher_verification", W5);
                        if (s2 != null) {
                            if (!s2.d()) {
                                s2 = null;
                            }
                            if (s2 != null && (f = s2.f()) != null) {
                                i3 = Integer.parseInt(f);
                                CommonConfig commonConfig = new CommonConfig(r, r2, r3, r4, j5, r5, r6, r7, r8, r9, r10, z3, 0L, r11, r12, i8, r13, r14, r16, r15, booleanValue3, r17, intValue, intValue2, intValue3, booleanValue4, 0, z4, i3 <= 0, 67112960, null);
                                K = accountInfoDto.K();
                                if (K == null) {
                                    K = "";
                                }
                                hashCode = K.hashCode();
                                if (hashCode != -2082609364) {
                                    if (K.equals("app_developer")) {
                                        accountRole = AccountRole.DEVELOPER;
                                    }
                                    accountRole = AccountRole.UNKNOWN;
                                } else if (hashCode != -877169473) {
                                    if (hashCode == -782085250 && K.equals("worker")) {
                                        accountRole = AccountRole.WORKER;
                                    }
                                    accountRole = AccountRole.UNKNOWN;
                                } else {
                                    if (K.equals("tester")) {
                                        accountRole = AccountRole.TESTER;
                                    }
                                    accountRole = AccountRole.UNKNOWN;
                                }
                                AccountRole accountRole2 = accountRole;
                                int i9 = (int) accountUserSettingsDto.f().b;
                                String j6 = accountUserSettingsDto.j();
                                NameChangeRequestInfo.Status status = !epx.f(j6, "processing") ? NameChangeRequestInfo.Status.PROCESSING : epx.f(j6, "declined") ? NameChangeRequestInfo.Status.DECLINED : NameChangeRequestInfo.Status.UNKNOWN;
                                e = accountUserSettingsDto.e();
                                if (e == null) {
                                    e = "";
                                }
                                String g2 = accountUserSettingsDto.g();
                                NameChangeRequestInfo nameChangeRequestInfo = new NameChangeRequestInfo(i9, status, e, g2 != null ? g2 : "");
                                UserNameType.a aVar2 = UserNameType.Companion;
                                W = accountInfoDto.W();
                                if (W != null) {
                                    Iterator it5 = W.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            accountInfoSettingsDto = null;
                                            break;
                                        }
                                        ?? next = it5.next();
                                        if (epx.f(((AccountInfoSettingsDto) next).e().i(), "im_user_name_type")) {
                                            accountInfoSettingsDto = next;
                                            break;
                                        }
                                    }
                                    AccountInfoSettingsDto accountInfoSettingsDto5 = accountInfoSettingsDto;
                                    if (accountInfoSettingsDto5 != null) {
                                        str = accountInfoSettingsDto5.f();
                                        aVar2.getClass();
                                        a = UserNameType.a.a(str);
                                        if (a == null) {
                                            a = UserNameType.VK;
                                        }
                                        UserNameType userNameType = a;
                                        AccountInfoMessagesCounterSettingsDto n2 = accountInfoDto.n();
                                        boolean f10 = n2 != null ? n2.f() : false;
                                        AccountInfoMessagesCounterSettingsDto n3 = accountInfoDto.n();
                                        boolean e8 = n3 != null ? n3.e() : false;
                                        AccountInfoMessagesCounterSettingsDto n4 = accountInfoDto.n();
                                        CounterSettings counterSettings = new CounterSettings(f10, e8, n4 != null ? n4.d() : false);
                                        String valueOf = String.valueOf(accountInfoDto.k());
                                        o = accountInfoDto.o();
                                        if (o != null) {
                                            List<String> list = o;
                                            ?? arrayList3 = new ArrayList(c5g.u(list, 10));
                                            Iterator it6 = list.iterator();
                                            while (it6.hasNext()) {
                                                List c0 = drm0.c0((String) it6.next(), new String[]{"-"}, 0, 6);
                                                arrayList3.add(new SupportedLanguagesPair((String) c0.get(0), (String) c0.get(1)));
                                            }
                                            emptyList = arrayList3;
                                        } else {
                                            emptyList = EmptyList.b;
                                        }
                                        EmptyList emptyList2 = emptyList;
                                        boolean f11 = epx.f(accountGetUserObjectDto.g(), Boolean.TRUE);
                                        com.vk.dto.hints.a aVar3 = new com.vk.dto.hints.a(null);
                                        for (AccountHelpHintDto accountHelpHintDto : accountGetHelpHintsResponseDto.d()) {
                                            String id2 = accountHelpHintDto.getId();
                                            String title = accountHelpHintDto.getTitle();
                                            String description = accountHelpHintDto.getDescription();
                                            List<AccountHelpHintResourceItemDto> d8 = accountHelpHintDto.d();
                                            if (d8 != null) {
                                                profilerConfig2 = profilerConfig;
                                                linkedHashMap = new LinkedHashMap();
                                                for (AccountHelpHintResourceItemDto accountHelpHintResourceItemDto : d8) {
                                                    linkedHashMap.put(accountHelpHintResourceItemDto.d(), accountHelpHintResourceItemDto.e());
                                                    nameChangeRequestInfo = nameChangeRequestInfo;
                                                    accountGetUserObjectDto = accountGetUserObjectDto;
                                                }
                                            } else {
                                                profilerConfig2 = profilerConfig;
                                                linkedHashMap = null;
                                            }
                                            NameChangeRequestInfo nameChangeRequestInfo2 = nameChangeRequestInfo;
                                            AccountGetUserObjectDto accountGetUserObjectDto2 = accountGetUserObjectDto;
                                            aVar3.b.add(new Hint(id2, title, description, linkedHashMap));
                                            profilerConfig = profilerConfig2;
                                            nameChangeRequestInfo = nameChangeRequestInfo2;
                                            accountGetUserObjectDto = accountGetUserObjectDto2;
                                        }
                                        ProfilerConfig profilerConfig3 = profilerConfig;
                                        NameChangeRequestInfo nameChangeRequestInfo3 = nameChangeRequestInfo;
                                        AccountGetUserObjectDto accountGetUserObjectDto3 = accountGetUserObjectDto;
                                        AccountInfoMarketAdult18plusDto l3 = accountInfoDto.l();
                                        boolean d9 = l3 != null ? l3.d() : false;
                                        AccountInfoMarketAdult18plusDto l4 = accountInfoDto.l();
                                        or00 or00Var = new or00(d9, l4 != null ? l4.e() : false);
                                        Boolean u = accountGetUserObjectDto3.u();
                                        Boolean bool = Boolean.TRUE;
                                        boolean f12 = epx.f(u, bool);
                                        boolean f13 = epx.f(accountGetUserObjectDto3.o(), bool);
                                        Boolean u2 = accountGetUserObjectDto3.u();
                                        VerifyInfo verifyInfo = new VerifyInfo(f12, f13, u2 != null ? u2.booleanValue() : false, false, false, false, 56, null);
                                        AccountUserSettingsVerificationStatusDto k2 = accountUserSettingsDto.k();
                                        String i10 = k2 != null ? k2.i() : null;
                                        return new AccountInfo(longValue, false, str2, str3, str4, str5, str6, a2, id, imageList2, str8, c, phoneStatus, f6, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig3, commonConfig, accountRole2, nameChangeRequestInfo3, userNameType, 0L, counterSettings, valueOf, emptyList2, str7, booleanValue, booleanValue2, f11, aVar3, or00Var, false, verifyInfo, epx.f(i10, "verified") ? VerificationStatus.VERIFIED : epx.f(i10, "verified_change_data") ? VerificationStatus.VERIFIED_CHANGE_DATA : VerificationStatus.UNVERIFIED);
                                    }
                                }
                                str = null;
                                aVar2.getClass();
                                a = UserNameType.a.a(str);
                                if (a == null) {
                                }
                                UserNameType userNameType2 = a;
                                AccountInfoMessagesCounterSettingsDto n22 = accountInfoDto.n();
                                if (n22 != null) {
                                }
                                AccountInfoMessagesCounterSettingsDto n32 = accountInfoDto.n();
                                if (n32 != null) {
                                }
                                AccountInfoMessagesCounterSettingsDto n42 = accountInfoDto.n();
                                CounterSettings counterSettings2 = new CounterSettings(f10, e8, n42 != null ? n42.d() : false);
                                String valueOf2 = String.valueOf(accountInfoDto.k());
                                o = accountInfoDto.o();
                                if (o != null) {
                                }
                                EmptyList emptyList22 = emptyList;
                                boolean f112 = epx.f(accountGetUserObjectDto.g(), Boolean.TRUE);
                                com.vk.dto.hints.a aVar32 = new com.vk.dto.hints.a(null);
                                while (r3.hasNext()) {
                                }
                                ProfilerConfig profilerConfig32 = profilerConfig;
                                NameChangeRequestInfo nameChangeRequestInfo32 = nameChangeRequestInfo;
                                AccountGetUserObjectDto accountGetUserObjectDto32 = accountGetUserObjectDto;
                                AccountInfoMarketAdult18plusDto l32 = accountInfoDto.l();
                                if (l32 != null) {
                                }
                                AccountInfoMarketAdult18plusDto l42 = accountInfoDto.l();
                                or00 or00Var2 = new or00(d9, l42 != null ? l42.e() : false);
                                Boolean u3 = accountGetUserObjectDto32.u();
                                Boolean bool2 = Boolean.TRUE;
                                boolean f122 = epx.f(u3, bool2);
                                boolean f132 = epx.f(accountGetUserObjectDto32.o(), bool2);
                                Boolean u22 = accountGetUserObjectDto32.u();
                                VerifyInfo verifyInfo2 = new VerifyInfo(f122, f132, u22 != null ? u22.booleanValue() : false, false, false, false, 56, null);
                                AccountUserSettingsVerificationStatusDto k22 = accountUserSettingsDto.k();
                                if (k22 != null) {
                                }
                                return new AccountInfo(longValue, false, str2, str3, str4, str5, str6, a2, id, imageList2, str8, c, phoneStatus, f6, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig32, commonConfig, accountRole2, nameChangeRequestInfo32, userNameType2, 0L, counterSettings2, valueOf2, emptyList22, str7, booleanValue, booleanValue2, f112, aVar32, or00Var2, false, verifyInfo2, epx.f(i10, "verified") ? VerificationStatus.VERIFIED : epx.f(i10, "verified_change_data") ? VerificationStatus.VERIFIED_CHANGE_DATA : VerificationStatus.UNVERIFIED);
                            }
                        }
                        i3 = 0;
                        CommonConfig commonConfig2 = new CommonConfig(r, r2, r3, r4, j5, r5, r6, r7, r8, r9, r10, z3, 0L, r11, r12, i8, r13, r14, r16, r15, booleanValue3, r17, intValue, intValue2, intValue3, booleanValue4, 0, z4, i3 <= 0, 67112960, null);
                        K = accountInfoDto.K();
                        if (K == null) {
                        }
                        hashCode = K.hashCode();
                        if (hashCode != -2082609364) {
                        }
                        AccountRole accountRole22 = accountRole;
                        int i92 = (int) accountUserSettingsDto.f().b;
                        String j62 = accountUserSettingsDto.j();
                        if (!epx.f(j62, "processing")) {
                        }
                        e = accountUserSettingsDto.e();
                        if (e == null) {
                        }
                        String g22 = accountUserSettingsDto.g();
                        NameChangeRequestInfo nameChangeRequestInfo4 = new NameChangeRequestInfo(i92, status, e, g22 != null ? g22 : "");
                        UserNameType.a aVar22 = UserNameType.Companion;
                        W = accountInfoDto.W();
                        if (W != null) {
                        }
                        str = null;
                        aVar22.getClass();
                        a = UserNameType.a.a(str);
                        if (a == null) {
                        }
                        UserNameType userNameType22 = a;
                        AccountInfoMessagesCounterSettingsDto n222 = accountInfoDto.n();
                        if (n222 != null) {
                        }
                        AccountInfoMessagesCounterSettingsDto n322 = accountInfoDto.n();
                        if (n322 != null) {
                        }
                        AccountInfoMessagesCounterSettingsDto n422 = accountInfoDto.n();
                        CounterSettings counterSettings22 = new CounterSettings(f10, e8, n422 != null ? n422.d() : false);
                        String valueOf22 = String.valueOf(accountInfoDto.k());
                        o = accountInfoDto.o();
                        if (o != null) {
                        }
                        EmptyList emptyList222 = emptyList;
                        boolean f1122 = epx.f(accountGetUserObjectDto.g(), Boolean.TRUE);
                        com.vk.dto.hints.a aVar322 = new com.vk.dto.hints.a(null);
                        while (r3.hasNext()) {
                        }
                        ProfilerConfig profilerConfig322 = profilerConfig;
                        NameChangeRequestInfo nameChangeRequestInfo322 = nameChangeRequestInfo4;
                        AccountGetUserObjectDto accountGetUserObjectDto322 = accountGetUserObjectDto;
                        AccountInfoMarketAdult18plusDto l322 = accountInfoDto.l();
                        if (l322 != null) {
                        }
                        AccountInfoMarketAdult18plusDto l422 = accountInfoDto.l();
                        or00 or00Var22 = new or00(d9, l422 != null ? l422.e() : false);
                        Boolean u32 = accountGetUserObjectDto322.u();
                        Boolean bool22 = Boolean.TRUE;
                        boolean f1222 = epx.f(u32, bool22);
                        boolean f1322 = epx.f(accountGetUserObjectDto322.o(), bool22);
                        Boolean u222 = accountGetUserObjectDto322.u();
                        VerifyInfo verifyInfo22 = new VerifyInfo(f1222, f1322, u222 != null ? u222.booleanValue() : false, false, false, false, 56, null);
                        AccountUserSettingsVerificationStatusDto k222 = accountUserSettingsDto.k();
                        if (k222 != null) {
                        }
                        return new AccountInfo(longValue, false, str2, str3, str4, str5, str6, a2, id, imageList2, str8, c, phoneStatus, f6, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig322, commonConfig2, accountRole22, nameChangeRequestInfo322, userNameType22, 0L, counterSettings22, valueOf22, emptyList222, str7, booleanValue, booleanValue2, f1122, aVar322, or00Var22, false, verifyInfo22, epx.f(i10, "verified") ? VerificationStatus.VERIFIED : epx.f(i10, "verified_change_data") ? VerificationStatus.VERIFIED_CHANGE_DATA : VerificationStatus.UNVERIFIED);
                    }
                }
                i2 = 0;
                if (i2 > 0) {
                }
                s2 = d370.s("messages_show_banner_teacher_verification", W5);
                if (s2 != null) {
                }
                i3 = 0;
                CommonConfig commonConfig22 = new CommonConfig(r, r2, r3, r4, j5, r5, r6, r7, r8, r9, r10, z3, 0L, r11, r12, i8, r13, r14, r16, r15, booleanValue3, r17, intValue, intValue2, intValue3, booleanValue4, 0, z4, i3 <= 0, 67112960, null);
                K = accountInfoDto.K();
                if (K == null) {
                }
                hashCode = K.hashCode();
                if (hashCode != -2082609364) {
                }
                AccountRole accountRole222 = accountRole;
                int i922 = (int) accountUserSettingsDto.f().b;
                String j622 = accountUserSettingsDto.j();
                if (!epx.f(j622, "processing")) {
                }
                e = accountUserSettingsDto.e();
                if (e == null) {
                }
                String g222 = accountUserSettingsDto.g();
                NameChangeRequestInfo nameChangeRequestInfo42 = new NameChangeRequestInfo(i922, status, e, g222 != null ? g222 : "");
                UserNameType.a aVar222 = UserNameType.Companion;
                W = accountInfoDto.W();
                if (W != null) {
                }
                str = null;
                aVar222.getClass();
                a = UserNameType.a.a(str);
                if (a == null) {
                }
                UserNameType userNameType222 = a;
                AccountInfoMessagesCounterSettingsDto n2222 = accountInfoDto.n();
                if (n2222 != null) {
                }
                AccountInfoMessagesCounterSettingsDto n3222 = accountInfoDto.n();
                if (n3222 != null) {
                }
                AccountInfoMessagesCounterSettingsDto n4222 = accountInfoDto.n();
                CounterSettings counterSettings222 = new CounterSettings(f10, e8, n4222 != null ? n4222.d() : false);
                String valueOf222 = String.valueOf(accountInfoDto.k());
                o = accountInfoDto.o();
                if (o != null) {
                }
                EmptyList emptyList2222 = emptyList;
                boolean f11222 = epx.f(accountGetUserObjectDto.g(), Boolean.TRUE);
                com.vk.dto.hints.a aVar3222 = new com.vk.dto.hints.a(null);
                while (r3.hasNext()) {
                }
                ProfilerConfig profilerConfig3222 = profilerConfig;
                NameChangeRequestInfo nameChangeRequestInfo3222 = nameChangeRequestInfo42;
                AccountGetUserObjectDto accountGetUserObjectDto3222 = accountGetUserObjectDto;
                AccountInfoMarketAdult18plusDto l3222 = accountInfoDto.l();
                if (l3222 != null) {
                }
                AccountInfoMarketAdult18plusDto l4222 = accountInfoDto.l();
                or00 or00Var222 = new or00(d9, l4222 != null ? l4222.e() : false);
                Boolean u322 = accountGetUserObjectDto3222.u();
                Boolean bool222 = Boolean.TRUE;
                boolean f12222 = epx.f(u322, bool222);
                boolean f13222 = epx.f(accountGetUserObjectDto3222.o(), bool222);
                Boolean u2222 = accountGetUserObjectDto3222.u();
                VerifyInfo verifyInfo222 = new VerifyInfo(f12222, f13222, u2222 != null ? u2222.booleanValue() : false, false, false, false, 56, null);
                AccountUserSettingsVerificationStatusDto k2222 = accountUserSettingsDto.k();
                if (k2222 != null) {
                }
                return new AccountInfo(longValue, false, str2, str3, str4, str5, str6, a2, id, imageList2, str8, c, phoneStatus, f6, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig3222, commonConfig22, accountRole222, nameChangeRequestInfo3222, userNameType222, 0L, counterSettings222, valueOf222, emptyList2222, str7, booleanValue, booleanValue2, f11222, aVar3222, or00Var222, false, verifyInfo222, epx.f(i10, "verified") ? VerificationStatus.VERIFIED : epx.f(i10, "verified_change_data") ? VerificationStatus.VERIFIED_CHANGE_DATA : VerificationStatus.UNVERIFIED);
            }
        }
        i = -1;
        int i82 = i;
        boolean r132 = d370.r("playlists_download", W5);
        boolean r142 = d370.r("audio_recommendations", W5);
        boolean r152 = d370.r("video_autoplay", W5);
        boolean r162 = d370.r("boom", W5);
        Boolean F2 = accountInfoDto.F();
        if (F2 == null) {
        }
        boolean r172 = d370.r("bugs", W5);
        if (accountInfoDto.R() == null) {
        }
        if (accountInfoDto.T() == null) {
        }
        long intValue32 = accountInfoDto.M() != null ? r4.intValue() : 0L;
        Boolean Z2 = accountInfoDto.Z();
        if (Z2 == null) {
        }
        s = d370.s("messages_import_contacts", W5);
        if (s != null) {
        }
        i2 = 0;
        if (i2 > 0) {
        }
        s2 = d370.s("messages_show_banner_teacher_verification", W5);
        if (s2 != null) {
        }
        i3 = 0;
        CommonConfig commonConfig222 = new CommonConfig(r, r2, r3, r4, j5, r5, r6, r7, r8, r9, r10, z3, 0L, r11, r12, i82, r132, r142, r162, r152, booleanValue3, r172, intValue, intValue2, intValue32, booleanValue4, 0, z4, i3 <= 0, 67112960, null);
        K = accountInfoDto.K();
        if (K == null) {
        }
        hashCode = K.hashCode();
        if (hashCode != -2082609364) {
        }
        AccountRole accountRole2222 = accountRole;
        int i9222 = (int) accountUserSettingsDto.f().b;
        String j6222 = accountUserSettingsDto.j();
        if (!epx.f(j6222, "processing")) {
        }
        e = accountUserSettingsDto.e();
        if (e == null) {
        }
        String g2222 = accountUserSettingsDto.g();
        NameChangeRequestInfo nameChangeRequestInfo422 = new NameChangeRequestInfo(i9222, status, e, g2222 != null ? g2222 : "");
        UserNameType.a aVar2222 = UserNameType.Companion;
        W = accountInfoDto.W();
        if (W != null) {
        }
        str = null;
        aVar2222.getClass();
        a = UserNameType.a.a(str);
        if (a == null) {
        }
        UserNameType userNameType2222 = a;
        AccountInfoMessagesCounterSettingsDto n22222 = accountInfoDto.n();
        if (n22222 != null) {
        }
        AccountInfoMessagesCounterSettingsDto n32222 = accountInfoDto.n();
        if (n32222 != null) {
        }
        AccountInfoMessagesCounterSettingsDto n42222 = accountInfoDto.n();
        CounterSettings counterSettings2222 = new CounterSettings(f10, e8, n42222 != null ? n42222.d() : false);
        String valueOf2222 = String.valueOf(accountInfoDto.k());
        o = accountInfoDto.o();
        if (o != null) {
        }
        EmptyList emptyList22222 = emptyList;
        boolean f112222 = epx.f(accountGetUserObjectDto.g(), Boolean.TRUE);
        com.vk.dto.hints.a aVar32222 = new com.vk.dto.hints.a(null);
        while (r3.hasNext()) {
        }
        ProfilerConfig profilerConfig32222 = profilerConfig;
        NameChangeRequestInfo nameChangeRequestInfo32222 = nameChangeRequestInfo422;
        AccountGetUserObjectDto accountGetUserObjectDto32222 = accountGetUserObjectDto;
        AccountInfoMarketAdult18plusDto l32222 = accountInfoDto.l();
        if (l32222 != null) {
        }
        AccountInfoMarketAdult18plusDto l42222 = accountInfoDto.l();
        or00 or00Var2222 = new or00(d9, l42222 != null ? l42222.e() : false);
        Boolean u3222 = accountGetUserObjectDto32222.u();
        Boolean bool2222 = Boolean.TRUE;
        boolean f122222 = epx.f(u3222, bool2222);
        boolean f132222 = epx.f(accountGetUserObjectDto32222.o(), bool2222);
        Boolean u22222 = accountGetUserObjectDto32222.u();
        VerifyInfo verifyInfo2222 = new VerifyInfo(f122222, f132222, u22222 != null ? u22222.booleanValue() : false, false, false, false, 56, null);
        AccountUserSettingsVerificationStatusDto k22222 = accountUserSettingsDto.k();
        if (k22222 != null) {
        }
        return new AccountInfo(longValue, false, str2, str3, str4, str5, str6, a2, id, imageList2, str8, c, phoneStatus, f6, str9, emailStatus, str10, audioAdConfig, videoConfig, moneyConfig, profilerConfig32222, commonConfig222, accountRole2222, nameChangeRequestInfo32222, userNameType2222, 0L, counterSettings2222, valueOf2222, emptyList22222, str7, booleanValue, booleanValue2, f112222, aVar32222, or00Var2222, false, verifyInfo2222, epx.f(i10, "verified") ? VerificationStatus.VERIFIED : epx.f(i10, "verified_change_data") ? VerificationStatus.VERIFIED_CHANGE_DATA : VerificationStatus.UNVERIFIED);
    }
}

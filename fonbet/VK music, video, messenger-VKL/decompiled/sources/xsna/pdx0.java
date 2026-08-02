package xsna;

import com.google.gson.Gson;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionTypeDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseSendMessageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsPermissionsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionSendMessageMessageDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionSubscribeExtraDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetInternalActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetPermissionsDto;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionCall;
import com.vk.superapp.api.dto.widgets.actions.WebActionCallback;
import com.vk.superapp.api.dto.widgets.actions.WebActionLocalityPicker;
import com.vk.superapp.api.dto.widgets.actions.WebActionOnboardingRedesignV3;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenSection;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenWidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebActionRequestPermission;
import com.vk.superapp.api.dto.widgets.actions.WebActionSendMessage;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebActionVkInternal;
import com.vk.superapp.api.dto.widgets.actions.WebMessage;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeObjectType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: WebActionMapper.kt */
/* loaded from: classes6.dex */
public final class pdx0 {
    public static final bpn0 a = new bpn0(new tqf0(16));

    /* compiled from: WebActionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto.ExtraDto.values().length];
            try {
                iArr[SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto.ExtraDto.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto.ExtraDto.SHUFFLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSubscribeDto.ObjectTypeDto.values().length];
            try {
                iArr2[SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSubscribeDto.ObjectTypeDto.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SuperAppUniversalWidgetActionSubscribeExtraDto.ObjectTypeDto.values().length];
            try {
                iArr3[SuperAppUniversalWidgetActionSubscribeExtraDto.ObjectTypeDto.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[GroupsGroupTypeDto.values().length];
            try {
                iArr4[GroupsGroupTypeDto.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr4[GroupsGroupTypeDto.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[GroupsGroupTypeDto.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[GroupsGroupFullMemberStatusDto.values().length];
            try {
                iArr5[GroupsGroupFullMemberStatusDto.NOT_A_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr5[GroupsGroupFullMemberStatusDto.MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[GroupsGroupFullMemberStatusDto.NOT_SURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[GroupsGroupFullMemberStatusDto.DECLINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[GroupsGroupFullMemberStatusDto.HAS_SENT_A_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[GroupsGroupFullMemberStatusDto.INVITED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[GroupsGroupIsClosedDto.values().length];
            try {
                iArr6[GroupsGroupIsClosedDto.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[GroupsGroupIsClosedDto.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[GroupsGroupIsClosedDto.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[ExploreWidgetsBaseActionTypeDto.values().length];
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_MINI_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_GAMES_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_GAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_SECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.OPEN_NATIVE_APP.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.GRANT_ACCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.SEND_MESSAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.LOCALITY_PICKER.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.CALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[ExploreWidgetsBaseActionTypeDto.REDESIGN_V3_HEADER.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[ExploreWidgetsPermissionsDto.values().length];
            try {
                iArr8[ExploreWidgetsPermissionsDto.GEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[SuperAppUniversalWidgetPermissionsDto.values().length];
            try {
                iArr9[SuperAppUniversalWidgetPermissionsDto.GEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr9[SuperAppUniversalWidgetPermissionsDto.CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$8 = iArr9;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static WebAction a(ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto) {
        ?? r2;
        Boolean e;
        if (exploreWidgetsBaseActionDto != null) {
            switch (a.$EnumSwitchMapping$6[exploreWidgetsBaseActionDto.o().ordinal()]) {
                case 1:
                    String url = exploreWidgetsBaseActionDto.getUrl();
                    return new WebActionOpenUrl(url == null ? "" : url, WebActionOpenUrl.Target.f43default, a(exploreWidgetsBaseActionDto.f()), null, false, 0L, exploreWidgetsBaseActionDto.o().i(), 48, null);
                case 2:
                case 3:
                case 4:
                    long d = exploreWidgetsBaseActionDto.d() != null ? r0.d() : 0L;
                    String url2 = exploreWidgetsBaseActionDto.getUrl();
                    return new WebActionOpenVkApp(BuildConfig.FLAVOR, d, url2 == null ? "" : url2, null, null, a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 5:
                    String n = exploreWidgetsBaseActionDto.n();
                    return new WebActionOpenSection(n == null ? "" : n, a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 6:
                    String e2 = exploreWidgetsBaseActionDto.e();
                    String k = exploreWidgetsBaseActionDto.k();
                    return new WebActionOpenNativeApp(e2, k == null ? "" : k, a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 7:
                    List<ExploreWidgetsPermissionsDto> j = exploreWidgetsBaseActionDto.j();
                    if (j != null) {
                        List<ExploreWidgetsPermissionsDto> list = j;
                        r2 = new ArrayList(c5g.u(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (a.$EnumSwitchMapping$7[((ExploreWidgetsPermissionsDto) it.next()).ordinal()] != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r2.add(WebActionRequestPermission.Permission.GEO);
                        }
                    } else {
                        r2 = EmptyList.b;
                    }
                    return new WebActionRequestPermission(r2, a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 8:
                    long intValue = exploreWidgetsBaseActionDto.l() != null ? r6.intValue() : 0L;
                    ExploreWidgetsBaseSendMessageDto i = exploreWidgetsBaseActionDto.i();
                    String f = i != null ? i.f() : null;
                    if (f == null) {
                        f = "";
                    }
                    String d2 = i != null ? i.d() : null;
                    return new WebActionSendMessage(intValue, new WebMessage(f, d2 != null ? d2 : "", (i == null || (e = i.e()) == null) ? false : e.booleanValue()), a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 9:
                    return new WebActionLocalityPicker(a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 10:
                    Integer l = exploreWidgetsBaseActionDto.l();
                    return new WebActionCall(l != null ? l.intValue() : 0, a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
                case 11:
                    return new WebActionOnboardingRedesignV3(a(exploreWidgetsBaseActionDto.f()), null, exploreWidgetsBaseActionDto.o().i());
            }
        }
        return null;
    }

    public static WebAction b(SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Object obj) {
        WebSubscribeObjectType webSubscribeObjectType;
        WebSubscribeExtra.MemberStatus memberStatus;
        WebSubscribeExtra webSubscribeExtra;
        Boolean e;
        WebActionRequestPermission.Permission permission;
        WebActionVkInternal.Payload.Music.Extra extra;
        boolean z = superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionVkInternalDto;
        bpn0 bpn0Var = a;
        r5 = false;
        boolean z2 = false;
        WebSubscribeExtra.GroupClosedType groupClosedType = null;
        if (z) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionVkInternalDto superAppUniversalWidgetActionVkInternalDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionVkInternalDto) superAppUniversalWidgetActionDto;
            SuperAppUniversalWidgetActionDto e2 = superAppUniversalWidgetActionVkInternalDto.e();
            WebAction b = e2 != null ? b(e2, null) : null;
            String d = superAppUniversalWidgetActionVkInternalDto.d();
            SuperAppUniversalWidgetInternalActionDto f = superAppUniversalWidgetActionVkInternalDto.f();
            if (f instanceof SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionShareMeDto) {
                return new WebActionVkInternal(new WebActionVkInternal.Payload.ShareMe(((Gson) bpn0Var.getValue()).toJson(obj)), b, d, ((SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionShareMeDto) f).d().i());
            }
            if (f instanceof SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionLocalityPickerDto) {
                return new WebActionLocalityPicker(b, d, ((SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionLocalityPickerDto) f).d().i());
            }
            if (f instanceof SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionOpenAssistantDto) {
                throw new IllegalArgumentException("Failed to map action: " + superAppUniversalWidgetActionVkInternalDto);
            }
            if (!(f instanceof SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto)) {
                if (!(f instanceof SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionOnboardingDto)) {
                    if (f != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Failed to map action: " + superAppUniversalWidgetActionVkInternalDto);
                }
                SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionOnboardingDto superAppUniversalWidgetActionOnboardingDto = (SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionOnboardingDto) f;
                if (superAppUniversalWidgetActionOnboardingDto.d() == SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionOnboardingDto.NameDto.REDESIGN_V3_HEADER) {
                    return new WebActionOnboardingRedesignV3(null, null, superAppUniversalWidgetActionOnboardingDto.e().i());
                }
                throw new IllegalArgumentException("Failed to map onboarding action: " + superAppUniversalWidgetActionOnboardingDto);
            }
            SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto superAppUniversalWidgetActionMusicDto = (SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto) f;
            SuperAppUniversalWidgetInternalActionDto.SuperAppUniversalWidgetActionMusicDto.ExtraDto e3 = superAppUniversalWidgetActionMusicDto.e();
            if (e3 == null) {
                extra = WebActionVkInternal.Payload.Music.Extra.PLAY;
            } else {
                int i = a.$EnumSwitchMapping$0[e3.ordinal()];
                if (i == 1) {
                    extra = WebActionVkInternal.Payload.Music.Extra.PLAY;
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException("Failed to map extra: " + e3);
                    }
                    extra = WebActionVkInternal.Payload.Music.Extra.SHUFFLE;
                }
            }
            String d2 = superAppUniversalWidgetActionMusicDto.d();
            Integer f2 = superAppUniversalWidgetActionMusicDto.f();
            return new WebActionVkInternal(new WebActionVkInternal.Payload.Music(extra, d2, f2 != null ? f2.intValue() : 0), b, d, superAppUniversalWidgetActionMusicDto.g().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallbackDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallbackDto superAppUniversalWidgetActionCallbackDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallbackDto) superAppUniversalWidgetActionDto;
            return new WebActionCallback(superAppUniversalWidgetActionCallbackDto.e().toString(), null, superAppUniversalWidgetActionCallbackDto.d(), superAppUniversalWidgetActionCallbackDto.f().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallDto superAppUniversalWidgetActionCallDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionCallDto) superAppUniversalWidgetActionDto;
            return new WebActionCall(superAppUniversalWidgetActionCallDto.e(), null, superAppUniversalWidgetActionCallDto.d(), superAppUniversalWidgetActionCallDto.f().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionGrantAccessDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionGrantAccessDto superAppUniversalWidgetActionGrantAccessDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionGrantAccessDto) superAppUniversalWidgetActionDto;
            List<SuperAppUniversalWidgetPermissionsDto> e4 = superAppUniversalWidgetActionGrantAccessDto.e();
            ArrayList arrayList = new ArrayList(c5g.u(e4, 10));
            Iterator<T> it = e4.iterator();
            while (it.hasNext()) {
                int i2 = a.$EnumSwitchMapping$8[((SuperAppUniversalWidgetPermissionsDto) it.next()).ordinal()];
                if (i2 == 1) {
                    permission = WebActionRequestPermission.Permission.GEO;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    permission = WebActionRequestPermission.Permission.CONTACTS;
                }
                arrayList.add(permission);
            }
            return new WebActionRequestPermission(arrayList, null, superAppUniversalWidgetActionGrantAccessDto.d(), superAppUniversalWidgetActionGrantAccessDto.f().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenAppDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenAppDto superAppUniversalWidgetActionOpenAppDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenAppDto) superAppUniversalWidgetActionDto;
            return new WebActionOpenVkApp(null, superAppUniversalWidgetActionOpenAppDto.e().d(), superAppUniversalWidgetActionOpenAppDto.e().e(), null, superAppUniversalWidgetActionOpenAppDto.r(), null, superAppUniversalWidgetActionOpenAppDto.d(), superAppUniversalWidgetActionOpenAppDto.f().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenUrlDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenUrlDto superAppUniversalWidgetActionOpenUrlDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenUrlDto) superAppUniversalWidgetActionDto;
            return new WebActionOpenUrl(superAppUniversalWidgetActionOpenUrlDto.getUrl(), WebActionOpenUrl.Target.f43default, null, superAppUniversalWidgetActionOpenUrlDto.d(), superAppUniversalWidgetActionOpenUrlDto.e() != null, superAppUniversalWidgetActionOpenUrlDto.e() != null ? r1.intValue() : -1L, superAppUniversalWidgetActionOpenUrlDto.f().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSendMessageDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSendMessageDto superAppUniversalWidgetActionSendMessageDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSendMessageDto) superAppUniversalWidgetActionDto;
            long f3 = superAppUniversalWidgetActionSendMessageDto.f();
            SuperAppUniversalWidgetActionSendMessageMessageDto e5 = superAppUniversalWidgetActionSendMessageDto.e();
            String f4 = e5 != null ? e5.f() : null;
            if (f4 == null) {
                f4 = "";
            }
            String valueOf = String.valueOf(e5 != null ? e5.d() : null);
            if (e5 != null && (e = e5.e()) != null) {
                z2 = e.booleanValue();
            }
            return new WebActionSendMessage(f3, new WebMessage(f4, valueOf, z2), null, superAppUniversalWidgetActionSendMessageDto.d(), superAppUniversalWidgetActionSendMessageDto.g().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto) {
            SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto superAppUniversalWidgetActionOpenNativeAppDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto) superAppUniversalWidgetActionDto;
            return new WebActionOpenNativeApp(superAppUniversalWidgetActionOpenNativeAppDto.e(), superAppUniversalWidgetActionOpenNativeAppDto.g(), b(superAppUniversalWidgetActionOpenNativeAppDto.f(), null), superAppUniversalWidgetActionOpenNativeAppDto.d(), superAppUniversalWidgetActionOpenNativeAppDto.i().i());
        }
        if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionShareMeDto) {
            if (obj != null) {
                SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionShareMeDto superAppUniversalWidgetActionShareMeDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionShareMeDto) superAppUniversalWidgetActionDto;
                return new WebActionVkInternal(new WebActionVkInternal.Payload.ShareMe(((Gson) bpn0Var.getValue()).toJson(obj)), null, superAppUniversalWidgetActionShareMeDto.d(), superAppUniversalWidgetActionShareMeDto.e().i());
            }
            throw new IllegalArgumentException("Failed to map action: " + superAppUniversalWidgetActionDto);
        }
        if (!(superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSubscribeDto)) {
            if (superAppUniversalWidgetActionDto instanceof SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenSettingsDto) {
                SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenSettingsDto superAppUniversalWidgetActionOpenSettingsDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenSettingsDto) superAppUniversalWidgetActionDto;
                return new WebActionOpenWidgetSettings(null, superAppUniversalWidgetActionOpenSettingsDto.d(), superAppUniversalWidgetActionOpenSettingsDto.e().i());
            }
            throw new IllegalArgumentException("Unknown action: " + superAppUniversalWidgetActionDto);
        }
        SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSubscribeDto superAppUniversalWidgetActionSubscribeDto = (SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionSubscribeDto) superAppUniversalWidgetActionDto;
        if (a.$EnumSwitchMapping$1[superAppUniversalWidgetActionSubscribeDto.g().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        WebSubscribeObjectType webSubscribeObjectType2 = WebSubscribeObjectType.GROUP;
        long f5 = superAppUniversalWidgetActionSubscribeDto.f();
        SuperAppUniversalWidgetActionSubscribeExtraDto e6 = superAppUniversalWidgetActionSubscribeDto.e();
        if (e6 == null) {
            webSubscribeExtra = null;
            webSubscribeObjectType = webSubscribeObjectType2;
        } else {
            webSubscribeObjectType = webSubscribeObjectType2;
            if (a.$EnumSwitchMapping$2[e6.e().ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            GroupsGroupTypeDto f6 = e6.f();
            int i3 = f6 == null ? -1 : a.$EnumSwitchMapping$3[f6.ordinal()];
            WebSubscribeExtra.GroupType groupType = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : WebSubscribeExtra.GroupType.EVENT : WebSubscribeExtra.GroupType.PAGE : WebSubscribeExtra.GroupType.GROUP;
            boolean z3 = e6.i() == BaseBoolIntDto.YES;
            GroupsGroupFullMemberStatusDto d3 = e6.d();
            switch (d3 == null ? -1 : a.$EnumSwitchMapping$4[d3.ordinal()]) {
                case 1:
                    memberStatus = WebSubscribeExtra.MemberStatus.NOT_A_MEMBER;
                    break;
                case 2:
                    memberStatus = WebSubscribeExtra.MemberStatus.MEMBER;
                    break;
                case 3:
                    memberStatus = WebSubscribeExtra.MemberStatus.NOT_SURE;
                    break;
                case 4:
                    memberStatus = WebSubscribeExtra.MemberStatus.DECLINED;
                    break;
                case 5:
                    memberStatus = WebSubscribeExtra.MemberStatus.HAS_SENT_A_REQUEST;
                    break;
                case 6:
                    memberStatus = WebSubscribeExtra.MemberStatus.INVITED;
                    break;
                default:
                    memberStatus = null;
                    break;
            }
            GroupsGroupIsClosedDto g = e6.g();
            int i4 = g != null ? a.$EnumSwitchMapping$5[g.ordinal()] : -1;
            if (i4 == 1) {
                groupClosedType = WebSubscribeExtra.GroupClosedType.OPEN;
            } else if (i4 == 2) {
                groupClosedType = WebSubscribeExtra.GroupClosedType.CLOSED;
            } else if (i4 == 3) {
                groupClosedType = WebSubscribeExtra.GroupClosedType.PRIVATE;
            }
            webSubscribeExtra = new WebSubscribeExtra(webSubscribeObjectType, groupType, z3, memberStatus, groupClosedType);
        }
        return new WebActionSubscribe(webSubscribeObjectType, f5, webSubscribeExtra, null, superAppUniversalWidgetActionSubscribeDto.d(), superAppUniversalWidgetActionSubscribeDto.i().i());
    }
}

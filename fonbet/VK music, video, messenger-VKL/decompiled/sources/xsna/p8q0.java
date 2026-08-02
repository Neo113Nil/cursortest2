package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import com.vk.api.generated.account.dto.AccountPrivacySettingDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueDto;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.messages.dto.MessagesConfigDto;
import com.vk.api.generated.messages.dto.MessagesConfigItemDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarBackgroundDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarBackgroundFillColorDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarButtonDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarButtonPopupDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto;
import com.vk.api.generated.messages.dto.MessagesVideoMessagesBlacklistDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.account.BaseRule;
import com.vk.im.engine.models.account.PrivacySetting;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: UpdateMessagesConfigCmd.kt */
/* loaded from: classes2.dex */
public final class p8q0 extends le6<s3q0> {
    public final String b = "messages_getconfig_last_server_version";
    public final String c = "messages_getconfig_local_migration_version";
    public final int d = 9;

    /* compiled from: UpdateMessagesConfigCmd.kt */
    public static final class a {

        /* compiled from: UpdateMessagesConfigCmd.kt */
        /* renamed from: xsna.p8q0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3497a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;
            public static final /* synthetic */ int[] $EnumSwitchMapping$4;

            static {
                int[] iArr = new int[MessagesConversationBarButtonDto.LayoutDto.values().length];
                try {
                    iArr[MessagesConversationBarButtonDto.LayoutDto.SECONDARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessagesConversationBarButtonDto.LayoutDto.TERTIARY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[MessagesConversationBarButtonDto.StyleDto.values().length];
                try {
                    iArr2[MessagesConversationBarButtonDto.StyleDto.DESTRUCTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[MessagesConversationBarButtonDto.IconTypeDto.values().length];
                try {
                    iArr3[MessagesConversationBarButtonDto.IconTypeDto.GIFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr3[MessagesConversationBarButtonDto.IconTypeDto.GIFT_OUTLINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[MessagesConversationBarButtonDto.TypeDto.values().length];
                try {
                    iArr4[MessagesConversationBarButtonDto.TypeDto.CALLBACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr4[MessagesConversationBarButtonDto.TypeDto.GIFTS_LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr4[MessagesConversationBarButtonDto.TypeDto.EDU_ACCOUNT_LOGIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$3 = iArr4;
                int[] iArr5 = new int[InfoBar.Style.values().length];
                try {
                    iArr5[InfoBar.Style.OUTAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr5[InfoBar.Style.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$4 = iArr5;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static InfoBar a(Context context, MessagesConversationBarDto messagesConversationBarDto) {
            Integer num;
            String i;
            String str;
            EmptyList emptyList;
            String str2;
            ArrayList arrayList;
            InfoBar.Payload payload;
            List<BaseImageDto> d;
            InfoBar.Payload.GiftsBirthdays.InfoBarBirthdaysData infoBarBirthdaysData;
            List<BaseImageDto> d2;
            List<MessagesConversationBarBackgroundFillColorDto> e;
            List<BaseImageDto> f;
            InfoBar.ButtonType buttonType;
            String str3;
            InfoBar.PopUp popUp;
            int i2;
            InfoBar.ButtonIcon buttonIcon;
            String k = messagesConversationBarDto.k();
            String title = messagesConversationBarDto.getTitle();
            if (title == null) {
                title = "";
            }
            String o = messagesConversationBarDto.o();
            String n = messagesConversationBarDto.n();
            InfoBar.Style style = n != null ? n.equals("outage") ? InfoBar.Style.OUTAGE : InfoBar.Style.UNKNOWN : null;
            int i3 = style == null ? -1 : C3497a.$EnumSwitchMapping$4[style.ordinal()];
            int i4 = 2;
            int i5 = 1;
            if (i3 == -1) {
                num = null;
            } else if (i3 == 1) {
                num = Integer.valueOf(R.drawable.vk_icon_speedometer_max_outline_28);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                num = Integer.valueOf(R.drawable.vk_icon_messages_outline_28);
            }
            if (num != null) {
                i = lhg.a(num.intValue(), "res:/");
            } else {
                i = messagesConversationBarDto.i();
                if (i == null) {
                    i = "";
                }
            }
            String j = messagesConversationBarDto.j();
            if (j == null) {
                j = "";
            }
            Integer valueOf = messagesConversationBarDto.n() != null ? Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent)) : null;
            Integer valueOf2 = messagesConversationBarDto.n() != null ? Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.vk_enable_only_messenger_notifications_banner_icon_size)) : null;
            List<MessagesConversationBarButtonDto> e2 = messagesConversationBarDto.e();
            if (e2 != null) {
                List<MessagesConversationBarButtonDto> list = e2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (MessagesConversationBarButtonDto messagesConversationBarButtonDto : list) {
                    MessagesConversationBarButtonPopupDto j2 = messagesConversationBarButtonDto.j();
                    if (j2 != null) {
                        buttonType = InfoBar.ButtonType.POPUP;
                    } else {
                        int i6 = C3497a.$EnumSwitchMapping$3[messagesConversationBarButtonDto.n().ordinal()];
                        buttonType = i6 != i5 ? i6 != i4 ? i6 != 3 ? InfoBar.ButtonType.LINK : InfoBar.ButtonType.OPEN_EDU_AUTH : InfoBar.ButtonType.GIFTS_LINK : InfoBar.ButtonType.CALLBACK;
                    }
                    String l = messagesConversationBarButtonDto.l();
                    int i7 = C3497a.$EnumSwitchMapping$0[messagesConversationBarButtonDto.g().ordinal()];
                    InfoBar.ButtonLayout buttonLayout = i7 != i5 ? i7 != i4 ? InfoBar.ButtonLayout.PRIMARY : InfoBar.ButtonLayout.TERTIARY : InfoBar.ButtonLayout.SECONDARY;
                    if (j2 == null) {
                        str3 = title;
                        popUp = null;
                    } else {
                        str3 = title;
                        popUp = new InfoBar.PopUp(epx.f(j2.e(), "outage") ? InfoBar.Style.OUTAGE : InfoBar.Style.UNKNOWN, j2.getTitle(), j2.f(), j2.d());
                    }
                    MessagesConversationBarButtonDto.StyleDto k2 = messagesConversationBarButtonDto.k();
                    InfoBar.ButtonStyle buttonStyle = (k2 == null ? -1 : C3497a.$EnumSwitchMapping$1[k2.ordinal()]) == 1 ? InfoBar.ButtonStyle.DESTRUCTIVE : InfoBar.ButtonStyle.DEFAULT;
                    String i8 = messagesConversationBarButtonDto.i();
                    String str4 = i8 == null ? "" : i8;
                    String d3 = messagesConversationBarButtonDto.d();
                    String str5 = d3 == null ? "" : d3;
                    Boolean e3 = messagesConversationBarButtonDto.e();
                    boolean booleanValue = e3 != null ? e3.booleanValue() : false;
                    MessagesConversationBarButtonDto.IconTypeDto f2 = messagesConversationBarButtonDto.f();
                    int i9 = f2 == null ? -1 : C3497a.$EnumSwitchMapping$2[f2.ordinal()];
                    if (i9 != 1) {
                        i2 = 2;
                        buttonIcon = i9 != 2 ? InfoBar.ButtonIcon.UNKNOWN : InfoBar.ButtonIcon.GIFT_OUTLINE;
                    } else {
                        i2 = 2;
                        buttonIcon = InfoBar.ButtonIcon.GIFT;
                    }
                    arrayList2.add(new InfoBar.Button(l, buttonLayout, buttonType, buttonStyle, str4, str5, booleanValue, popUp, buttonIcon));
                    int i10 = i2;
                    i5 = 1;
                    i4 = i10;
                    title = str3;
                }
                str = title;
                emptyList = arrayList2;
            } else {
                str = title;
                emptyList = EmptyList.b;
            }
            EmptyList emptyList2 = emptyList;
            Boolean f3 = messagesConversationBarDto.f();
            boolean booleanValue2 = f3 != null ? f3.booleanValue() : false;
            MessagesConversationBarBackgroundDto d4 = messagesConversationBarDto.d();
            String g = d4 != null ? d4.g() : null;
            MessagesConversationBarBackgroundDto d5 = messagesConversationBarDto.d();
            String d6 = d5 != null ? d5.d() : null;
            MessagesConversationBarBackgroundDto d7 = messagesConversationBarDto.d();
            InfoBar.Image b = (d7 == null || (f = d7.f()) == null) ? null : b(f);
            MessagesConversationBarBackgroundDto d8 = messagesConversationBarDto.d();
            if (d8 == null || (e = d8.e()) == null) {
                str2 = k;
                arrayList = null;
            } else {
                List<MessagesConversationBarBackgroundFillColorDto> list2 = e;
                arrayList = new ArrayList(c5g.u(list2, 10));
                for (MessagesConversationBarBackgroundFillColorDto messagesConversationBarBackgroundFillColorDto : list2) {
                    String str6 = k;
                    String d9 = messagesConversationBarBackgroundFillColorDto.d();
                    InfoBar.Theme.a aVar = InfoBar.Theme.Companion;
                    MessagesConversationBarBackgroundFillColorDto.ThemeDto e4 = messagesConversationBarBackgroundFillColorDto.e();
                    String i11 = e4 != null ? e4.i() : null;
                    aVar.getClass();
                    arrayList.add(new InfoBar.Background.FillColors(d9, InfoBar.Theme.a.a(i11)));
                    k = str6;
                }
                str2 = k;
            }
            Integer num2 = valueOf;
            InfoBar.Background background = new InfoBar.Background(g, d6, b, arrayList);
            MessagesConversationBarPayloadDto l2 = messagesConversationBarDto.l();
            if (l2 instanceof MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsBirthdaysDto) {
                MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsBirthdaysDto messagesConversationBarPayloadGiftsBirthdaysDto = (MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsBirthdaysDto) l2;
                String i12 = messagesConversationBarPayloadGiftsBirthdaysDto.j().i();
                List<UsersUserDto> d10 = messagesConversationBarPayloadGiftsBirthdaysDto.d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d10, 10));
                for (UsersUserDto usersUserDto : d10) {
                    arrayList3.add(new InfoBar.Payload.GiftsBirthdays.User(usersUserDto.j(), usersUserDto.f(), usersUserDto.k(), usersUserDto.u()));
                    messagesConversationBarPayloadGiftsBirthdaysDto = messagesConversationBarPayloadGiftsBirthdaysDto;
                }
                MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsBirthdaysDto messagesConversationBarPayloadGiftsBirthdaysDto2 = messagesConversationBarPayloadGiftsBirthdaysDto;
                Boolean k3 = messagesConversationBarPayloadGiftsBirthdaysDto2.k();
                boolean booleanValue3 = k3 != null ? k3.booleanValue() : true;
                String g2 = messagesConversationBarPayloadGiftsBirthdaysDto2.g();
                List<UserId> f4 = messagesConversationBarPayloadGiftsBirthdaysDto2.f();
                if (f4 == null) {
                    f4 = EmptyList.b;
                }
                List<UserId> list3 = f4;
                MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto e5 = messagesConversationBarPayloadGiftsBirthdaysDto2.e();
                if (e5 != null) {
                    String title2 = e5.getTitle();
                    String d11 = e5.d();
                    List<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> e6 = e5.e();
                    ArrayList arrayList4 = new ArrayList(c5g.u(e6, 10));
                    Iterator it = e6.iterator();
                    while (it.hasNext()) {
                        MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto = (MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto) it.next();
                        String title3 = messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.getTitle();
                        Iterator it2 = it;
                        String str7 = title3 == null ? "" : title3;
                        List<UserId> d12 = messagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.d();
                        if (d12 == null) {
                            d12 = EmptyList.b;
                        }
                        arrayList4.add(new InfoBar.Payload.GiftsBirthdays.BirthdaysGroup(str7, d12));
                        it = it2;
                    }
                    infoBarBirthdaysData = new InfoBar.Payload.GiftsBirthdays.InfoBarBirthdaysData(title2, d11, arrayList4);
                } else {
                    infoBarBirthdaysData = null;
                }
                MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto i13 = messagesConversationBarPayloadGiftsBirthdaysDto2.i();
                payload = new InfoBar.Payload.GiftsBirthdays(i12, arrayList3, booleanValue3, g2, list3, infoBarBirthdaysData, (i13 == null || (d2 = i13.d()) == null) ? null : b(d2));
            } else if (l2 instanceof MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsHolidaysDto) {
                MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsHolidaysDto messagesConversationBarPayloadGiftsHolidaysDto = (MessagesConversationBarPayloadDto.MessagesConversationBarPayloadGiftsHolidaysDto) l2;
                String i14 = messagesConversationBarPayloadGiftsHolidaysDto.e().i();
                MessagesConversationBarPayloadGiftsHolidaysTrailingImageDto d13 = messagesConversationBarPayloadGiftsHolidaysDto.d();
                payload = new InfoBar.Payload.GiftsHolidays(i14, (d13 == null || (d = d13.d()) == null) ? null : b(d));
            } else if (l2 instanceof MessagesConversationBarPayloadDto.MessagesConversationBarPayloadMaxAdDto) {
                MessagesConversationBarPayloadDto.MessagesConversationBarPayloadMaxAdDto messagesConversationBarPayloadMaxAdDto = (MessagesConversationBarPayloadDto.MessagesConversationBarPayloadMaxAdDto) l2;
                payload = new InfoBar.Payload.MaxAd(messagesConversationBarPayloadMaxAdDto.g().i(), messagesConversationBarPayloadMaxAdDto.e(), messagesConversationBarPayloadMaxAdDto.d(), messagesConversationBarPayloadMaxAdDto.f());
            } else {
                payload = null;
            }
            return new InfoBar(str2, str, o, i, j, valueOf2, num2, false, emptyList2, booleanValue2, background, payload, messagesConversationBarDto.g(), 128, null);
        }

        public static InfoBar.Image b(List list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BaseImageDto baseImageDto = (BaseImageDto) it.next();
                Image image = new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE));
                if (baseImageDto.d() == BaseImageDto.ThemeDto.DARK) {
                    arrayList2.add(image);
                } else {
                    arrayList.add(image);
                }
            }
            return new InfoBar.Image(new ImageList(arrayList), new ImageList(arrayList2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        MessagesConfigDto messagesConfigDto;
        boolean booleanValue;
        String i;
        AccountPrivacyValueDto d;
        InfoBar b;
        int i2;
        if (!k9q0.p(w2wVar)) {
            rey k = w2wVar.I0().k();
            String str = this.c;
            int i3 = k.getInt(str, 0);
            String str2 = this.b;
            int i4 = this.d;
            Integer valueOf = (i3 < i4 || !((b = w2wVar.I0().b().d().b()) == null || b.k) || (i2 = w2wVar.I0().k().getInt(str2, 0)) <= 0) ? null : Integer.valueOf(i2);
            tfx tfxVar = new tfx("messages.getConfig", new iq(19), new jq(25));
            if (valueOf != null) {
                tfx.l(tfxVar, "version", valueOf.intValue(), 1, 0, 8);
            }
            MessagesConfigDto messagesConfigDto2 = (MessagesConfigDto) bz2.d(tfxVar);
            if (messagesConfigDto2.d() != null) {
                MessagesConfigItemDto d2 = messagesConfigDto2.d();
                mbw mbwVar = mbw.a;
                mbwVar.getClass();
                boolean z = mbw.c().getBoolean("is_ejd_banner_enabled", false);
                boolean b2 = mbwVar.b();
                Boolean k2 = d2.k();
                Boolean g = d2.g();
                MessagesVideoMessagesBlacklistDto l = d2.l();
                String d3 = l != null ? l.d() : null;
                Boolean i5 = d2.i();
                Boolean e = d2.e();
                if (k2 != null) {
                    mbw.c().edit().putBoolean("is_sbp_dialog_enabled", k2.booleanValue()).apply();
                }
                if (g != null) {
                    mbw.c().edit().putBoolean("is_ejd_banner_enabled", g.booleanValue()).apply();
                }
                if (e != null) {
                    mbw.c().edit().putBoolean("is_reset_counters_tooltip_enabled", e.booleanValue()).apply();
                }
                if (d3 != null) {
                    Size d4 = mbw.d(d3);
                    SharedPreferences.Editor edit = mbw.c().edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append(d4.getWidth());
                    sb.append('x');
                    sb.append(d4.getHeight());
                    edit.putString("round_camera_preview_target_size", sb.toString()).apply();
                }
                if (i5 != null) {
                    mbw.c().edit().putBoolean("is_modal_web_view_enabled", i5.booleanValue()).apply();
                }
                Boolean d5 = d2.d();
                if (d5 != null) {
                    boolean booleanValue2 = d5.booleanValue();
                    oo8 a2 = w2wVar.I0().r().a();
                    oo8 oo8Var = new oo8(booleanValue2, cq.a(w2wVar));
                    if (!epx.f(a2, oo8Var)) {
                        w2wVar.I0().r().b(oo8Var);
                        DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
                        w2wVar.e1(this, new v480(this, dialogsFilter, (xpp) w2wVar.L0(this, new qpm(dialogsFilter, Source.CACHE, false, this))));
                    }
                }
                AccountPrivacySettingDto j = d2.j();
                if (j != null) {
                    us r = w2wVar.I0().r();
                    String d6 = j.d();
                    String title = j.getTitle();
                    String e2 = j.e();
                    AccountPrivacySettingValueDto g2 = j.g();
                    messagesConfigDto = messagesConfigDto2;
                    AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto = g2 instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) g2 : null;
                    if (accountPrivacySettingValueCategoryDto == null || (d = accountPrivacySettingValueCategoryDto.d()) == null || (i = d.i()) == null) {
                        i = AccountPrivacyValueDto.ALL.i();
                    }
                    List singletonList = Collections.singletonList(new BaseRule(i));
                    List<AccountPrivacyValueDto> f = j.f();
                    ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                    Iterator<T> it = f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AccountPrivacyValueDto) it.next()).i());
                    }
                    r.d(new PrivacySetting(d6, title, e2, singletonList, arrayList));
                } else {
                    messagesConfigDto = messagesConfigDto2;
                }
                w2wVar.L0(this, new co(Source.NETWORK, true));
                MessagesConversationBarDto f2 = d2.f();
                if (f2 != null) {
                    InfoBar a3 = a.a(w2wVar.getContext(), f2);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    w2wVar.I0().u(new mp3(10, a3, ref$BooleanRef));
                    if (ref$BooleanRef.element) {
                        w2wVar.e1(this, new m580(false, (InfoBar) ((it80) w2wVar.L0(this, new tsm())).a));
                    }
                } else {
                    InfoBar b3 = w2wVar.I0().b().d().b();
                    if (b3 != null && !b3.k) {
                        w2wVar.I0().u(new mp3(10, (Object) null, new Ref$BooleanRef()));
                        w2wVar.e1(this, new m580(false, null));
                    }
                }
                Boolean g3 = d2.g();
                if (g3 != null && z != g3.booleanValue()) {
                    w2wVar.e1(this, new m580(false, (InfoBar) ((it80) w2wVar.L0(this, new tsm())).a));
                }
                Boolean e3 = d2.e();
                if (e3 != null && b2 != (booleanValue = e3.booleanValue())) {
                    w2wVar.e1(this, new wa80(booleanValue));
                }
                w2wVar.I0().k().putInt(str2, messagesConfigDto.e());
                w2wVar.I0().k().putInt(str, i4);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return p8q0.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 1014686915;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateMessagesConfigCmd";
    }
}

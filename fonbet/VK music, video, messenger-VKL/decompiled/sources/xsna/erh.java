package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.client.result.URIParsedResult;
import com.ironsource.Z3;
import com.vk.api.generated.apps.dto.AppsScopeDto;
import com.vk.api.generated.auth.dto.AuthAgreementLinkDto;
import com.vk.api.generated.auth.dto.AuthCodeAuthClientInfoDto;
import com.vk.api.generated.auth.dto.AuthCodeAuthDeviceInfoDto;
import com.vk.api.generated.auth.dto.AuthCodeAuthInfoDto;
import com.vk.api.generated.auth.dto.AuthCodeAuthUserDto;
import com.vk.api.generated.auth.dto.AuthIndexedCodeDto;
import com.vk.api.generated.auth.dto.AuthProcessAuthCodeResponseDto;
import com.vk.auth.main.TermsLink;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.base.ModalAuthOpenerInterface$AuthParams;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.gift.Gift;
import com.vk.dto.gift.GiftItem;
import com.vk.im.engine.models.messages.Msg;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stickers.gifts.GiftModalButtonType;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.superapp.api.dto.qr.ModalAuthFlowType;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c4r0;
import xsna.h7u0;
import xsna.m7z;
import xsna.otw0;
import xsna.sv20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class erh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ erh(SwitchCompat switchCompat, otw0 otw0Var, otw0.b bVar, TextView textView) {
        this.b = 8;
        this.c = switchCompat;
        this.d = bVar;
        this.e = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03af  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tv20 tv20Var;
        n55 n55Var;
        String str;
        boolean z;
        List<AuthIndexedCodeDto> list;
        EmptyList emptyList;
        List<mao0> list2;
        h6m h6mVar;
        String str2;
        String f;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<AuthAgreementLinkDto> d;
        List<AppsScopeDto> j;
        Boolean k;
        Integer g;
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return kn00.a((kn00) obj, ((d.i.c) ((d.i) obj4)).c ? (r8h) obj3 : null, null, null, 0, null, null, (kdh) obj2, 1789);
            case 1:
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj4;
                ModalAuthOpenerInterface$AuthParams modalAuthOpenerInterface$AuthParams = (ModalAuthOpenerInterface$AuthParams) obj3;
                tv20 tv20Var2 = (tv20) obj2;
                AuthProcessAuthCodeResponseDto authProcessAuthCodeResponseDto = (AuthProcessAuthCodeResponseDto) obj;
                AuthCodeAuthUserDto f2 = authProcessAuthCodeResponseDto.f();
                rtd0 rtd0Var = f2 != null ? new rtd0(f2.d(), f2.e(), f2.f(), f2.g()) : null;
                AuthCodeAuthInfoDto d2 = authProcessAuthCodeResponseDto.d();
                if (d2 != null) {
                    String g2 = d2.g();
                    if (g2 == null) {
                        g2 = "";
                    }
                    AuthCodeAuthDeviceInfoDto f3 = d2.f();
                    if (f3 != null) {
                        String i3 = f3.i();
                        if (i3 == null) {
                            i3 = "";
                        }
                        String e = f3.e();
                        if (e == null) {
                            e = "";
                        }
                        String f4 = f3.f();
                        if (f4 == null) {
                            f4 = "";
                        }
                        String g3 = f3.g();
                        if (g3 == null) {
                            g3 = "";
                        }
                        String d3 = f3.d();
                        h6mVar = new h6m(i3, e, f4, g3, d3 == null ? "" : d3);
                    } else {
                        h6mVar = new h6m("", "", "", "", "");
                    }
                    AuthCodeAuthClientInfoDto e2 = d2.e();
                    int intValue = (e2 == null || (g = e2.g()) == null) ? 0 : g.intValue();
                    String i4 = e2 != null ? e2.i() : null;
                    String str3 = i4 == null ? "" : i4;
                    if (e2 == null || (f = e2.e()) == null) {
                        if (e2 != null) {
                            f = e2.f();
                        } else {
                            str2 = null;
                            boolean booleanValue = (e2 != null || (k = e2.k()) == null) ? false : k.booleanValue();
                            if (e2 != null || (j = e2.j()) == null) {
                                tv20Var = tv20Var2;
                                arrayList = null;
                            } else {
                                List<AppsScopeDto> list3 = j;
                                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                                for (AppsScopeDto appsScopeDto : list3) {
                                    String i5 = appsScopeDto.d().i();
                                    String title = appsScopeDto.getTitle();
                                    tv20 tv20Var3 = tv20Var2;
                                    arrayList3.add(new VkAuthAppScope(i5, title == null ? "" : title, appsScopeDto.getDescription()));
                                    tv20Var2 = tv20Var3;
                                }
                                tv20Var = tv20Var2;
                                arrayList = arrayList3;
                            }
                            if (e2 != null || (d = e2.d()) == null) {
                                arrayList2 = null;
                            } else {
                                List<AuthAgreementLinkDto> list4 = d;
                                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                                for (AuthAgreementLinkDto authAgreementLinkDto : list4) {
                                    String d4 = authAgreementLinkDto.d();
                                    if (d4 == null) {
                                        d4 = "";
                                    }
                                    String e3 = authAgreementLinkDto.e();
                                    if (e3 == null) {
                                        e3 = "";
                                    }
                                    arrayList4.add(new mao0(d4, e3));
                                }
                                arrayList2 = arrayList4;
                            }
                            mlc mlcVar = new mlc(intValue, str3, str2, booleanValue, arrayList, arrayList2);
                            ModalAuthFlowType.a aVar = ModalAuthFlowType.Companion;
                            Integer i6 = d2.i();
                            int intValue2 = i6 == null ? i6.intValue() : 0;
                            aVar.getClass();
                            ModalAuthFlowType modalAuthFlowType = intValue2 != 1 ? ModalAuthFlowType.MvkAuthFlow : ModalAuthFlowType.QrAuthFlow;
                            String d5 = d2.d();
                            n55Var = new n55(g2, h6mVar, mlcVar, modalAuthFlowType, d5 != null ? "" : d5);
                        }
                    }
                    str2 = f;
                    if (e2 != null) {
                    }
                    if (e2 != null) {
                    }
                    tv20Var = tv20Var2;
                    arrayList = null;
                    if (e2 != null) {
                    }
                    arrayList2 = null;
                    mlc mlcVar2 = new mlc(intValue, str3, str2, booleanValue, arrayList, arrayList2);
                    ModalAuthFlowType.a aVar2 = ModalAuthFlowType.Companion;
                    Integer i62 = d2.i();
                    if (i62 == null) {
                    }
                    aVar2.getClass();
                    ModalAuthFlowType modalAuthFlowType2 = intValue2 != 1 ? ModalAuthFlowType.MvkAuthFlow : ModalAuthFlowType.QrAuthFlow;
                    String d52 = d2.d();
                    n55Var = new n55(g2, h6mVar, mlcVar2, modalAuthFlowType2, d52 != null ? "" : d52);
                } else {
                    tv20Var = tv20Var2;
                    n55Var = null;
                }
                List<AuthIndexedCodeDto> e4 = authProcessAuthCodeResponseDto.e();
                String str4 = modalAuthOpenerInterface$AuthParams.c;
                if (str4 == null) {
                    str4 = n55Var != null ? n55Var.e : null;
                    if (str4 == null) {
                        str = "";
                        if (n55Var != null) {
                            mlc mlcVar3 = n55Var.c;
                            if (rtd0Var != null) {
                                int i7 = sv20.a.$EnumSwitchMapping$0[n55Var.d.ordinal()];
                                if (i7 == 1 || i7 == 2) {
                                    z = modalAuthOpenerInterface$AuthParams.d;
                                } else {
                                    if (i7 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z = false;
                                }
                                ModalAuthFlowType modalAuthFlowType3 = n55Var.d;
                                String str5 = modalAuthOpenerInterface$AuthParams.b;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = mlcVar3 != null ? mlcVar3.b : null;
                                String str8 = str7 == null ? "" : str7;
                                String str9 = n55Var.a;
                                h6m h6mVar2 = n55Var.b;
                                String str10 = h6mVar2.a;
                                String str11 = h6mVar2.c;
                                String str12 = h6mVar2.b;
                                String str13 = rtd0Var.a;
                                String str14 = rtd0Var.d;
                                String str15 = h6mVar2.e;
                                String str16 = h6mVar2.d;
                                boolean z2 = mlcVar3 != null ? mlcVar3.d : false;
                                String str17 = rtd0Var.c;
                                String str18 = str17 == null ? "" : str17;
                                Integer valueOf = mlcVar3 != null ? Integer.valueOf(mlcVar3.a) : null;
                                String str19 = mlcVar3 != null ? mlcVar3.b : null;
                                String str20 = str19 == null ? "" : str19;
                                List<VkAuthAppScope> list5 = mlcVar3 != null ? mlcVar3.e : null;
                                String str21 = mlcVar3 != null ? mlcVar3.c : null;
                                String str22 = str21 == null ? "" : str21;
                                if (mlcVar3 == null || (list2 = mlcVar3.f) == null) {
                                    list = e4;
                                    emptyList = null;
                                } else {
                                    List<mao0> list6 = list2;
                                    ArrayList arrayList5 = new ArrayList(c5g.u(list6, 10));
                                    for (mao0 mao0Var : list6) {
                                        List<AuthIndexedCodeDto> list7 = e4;
                                        String str23 = mao0Var.a;
                                        arrayList5.add(new TermsLink(str23, str23, mao0Var.b));
                                        e4 = list7;
                                    }
                                    list = e4;
                                    emptyList = arrayList5;
                                }
                                if (emptyList == null) {
                                    emptyList = EmptyList.b;
                                }
                                ModalAuthInfo modalAuthInfo = new ModalAuthInfo(modalAuthFlowType3, str6, str, str8, str9, str10, str11, str16, str12, str13, str14, str18, str15, z2, new ConsentScreenInfo(valueOf, str20, str22, list5, emptyList), z);
                                List<String> list8 = ModalAuthHostActivity.h;
                                Intent intent = new Intent(appCompatActivity, (Class<?>) ModalAuthHostActivity.class);
                                intent.setFlags(603979776);
                                intent.putExtra("init_info", modalAuthInfo);
                                List<AuthIndexedCodeDto> list9 = list;
                                if (list9 != null && !list9.isEmpty()) {
                                    intent.putParcelableArrayListExtra("confirmation_codes", new ArrayList<>(list9));
                                }
                                appCompatActivity.startActivityForResult(intent, 1000);
                                tv20Var.b();
                                return s3q0.a;
                            }
                        }
                        qv20.i(appCompatActivity, new IllegalStateException("auth_info or profile must not be null"), str, null, null, null, null, null, false, Z3.l);
                        tv20Var.b();
                        return s3q0.a;
                    }
                }
                str = str4;
                if (n55Var != null) {
                }
                qv20.i(appCompatActivity, new IllegalStateException("auth_info or profile must not be null"), str, null, null, null, null, null, false, Z3.l);
                tv20Var.b();
                return s3q0.a;
            case 2:
                rj01 rj01Var = (rj01) obj3;
                e040 e040Var = (e040) obj2;
                for (Attach attach : (Collection) obj4) {
                    Msg v = rj01Var.v(attach.xb());
                    if (v instanceof com.vk.im.engine.models.messages.a) {
                        ((com.vk.im.engine.models.messages.a) v).L2(attach);
                        e040Var.o(v);
                    }
                }
                return s3q0.a;
            case 3:
                URIParsedResult uRIParsedResult = (URIParsedResult) obj4;
                rne0 rne0Var = (rne0) obj2;
                c4r0.a aVar3 = (c4r0.a) obj;
                ((cme0) obj3).e(e43.a(new rne0(aVar3 != null ? new iu5(aVar3.a, uRIParsedResult.getTitle(), aVar3.c) : uRIParsedResult, rne0Var.b, rne0Var.c, rne0Var.d, false)), false);
                return s3q0.a;
            case 4:
                com.vk.lists.c cVar = (com.vk.lists.c) obj4;
                gbf0 gbf0Var = (gbf0) obj3;
                Context context = (Context) obj2;
                g4l0 g4l0Var = (g4l0) obj;
                if ((g4l0Var instanceof s1l0) || (g4l0Var instanceof q1l0)) {
                    cVar.p(false);
                } else if (g4l0Var instanceof o690) {
                    if (((o690) g4l0Var).a) {
                        bd5 bd5Var = gbf0Var.i;
                        if (bd5Var == null) {
                            bd5Var = null;
                        }
                        bd5Var.b.setText(context.getString(R.string.stickers_unsubscribe_author));
                        bd5 bd5Var2 = gbf0Var.i;
                        (bd5Var2 != null ? bd5Var2 : null).b.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_check_outline_28));
                    } else {
                        bd5 bd5Var3 = gbf0Var.i;
                        if (bd5Var3 == null) {
                            bd5Var3 = null;
                        }
                        bd5Var3.b.setText(context.getString(R.string.stickers_subscribe_author));
                        bd5 bd5Var4 = gbf0Var.i;
                        (bd5Var4 != null ? bd5Var4 : null).b.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_add_outline_28));
                    }
                }
                return s3q0.a;
            case 5:
                rhq0 rhq0Var = (rhq0) obj4;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj3;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                GiftItem giftItem = (GiftItem) obj;
                Gift gift = giftItem.i;
                if ((gift != null ? gift.n : null) == GiftType.GIFT_CARD) {
                    boolean a = rhq0Var.c.a(bwd0.l(extendedUserProfile).c);
                    String str24 = giftItem.k;
                    if (str24 != null) {
                        g2v.d().a().x(fragmentActivity, str24, a ? "gifts_own" : "gifts", bwd0.l(extendedUserProfile).c.b);
                    }
                } else if (gift.l != null) {
                    int i8 = m7z.c;
                    m7z.a.a(fragmentActivity, gift, new jzt(GiftModalButtonType.SEND, bwd0.l(extendedUserProfile).c.b, gift.c, null, new xah(rhq0Var, fragmentActivity, extendedUserProfile, 7)));
                } else {
                    rhq0Var.e.c().a(fragmentActivity, extendedUserProfile.a, extendedUserProfile.b);
                }
                return s3q0.a;
            case 6:
                Context context2 = (Context) obj4;
                wzs wzsVar = (wzs) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                Throwable th = (Throwable) obj;
                w1s0 w1s0Var = w1s0.b;
                if (th != null) {
                    j03.j(context2, th);
                }
                if (wzsVar != null) {
                    wzsVar.invoke(videoFile, th);
                }
                return s3q0.a;
            case 7:
                VideoOverlayView.c.i iVar = (VideoOverlayView.c.i) obj3;
                com.vk.libvideo.design.view.overlay.b bVar = (com.vk.libvideo.design.view.overlay.b) obj2;
                View view = (View) obj;
                bpn0 bpn0Var = VideoOverlayView.I;
                if (((VideoOverlayView) obj4).getShowRedesign()) {
                    gzs<s3q0> gzsVar = iVar.d;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else {
                    Context c = g2u0.c(view);
                    String str25 = bVar.e;
                    if (c != null && str25 != null) {
                        if (dhr0.M()) {
                            dhr0.a.getClass();
                            int i9 = dhr0.u().c;
                            c = new l7s(c, dhr0.u().c);
                        }
                        int i10 = h7u0.p;
                        h7u0.a c2 = h7u0.b.c(c);
                        c2.h0(bVar.a);
                        c2.a.f = bVar.b;
                        c2.d0(str25, new zb5(iVar, i2));
                        c2.W(R.string.close, null);
                        c2.m();
                    }
                }
                return s3q0.a;
            default:
                otw0.b bVar2 = (otw0.b) obj3;
                TextView textView = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                int i11 = otw0.i1;
                ((SwitchCompat) obj4).setChecked(bool.booleanValue());
                Pair pair = bool.booleanValue() ? new Pair(Integer.valueOf(R.attr.vk_ui_icon_accent), bVar2.a) : new Pair(Integer.valueOf(R.attr.vk_ui_icon_negative), bVar2.b);
                int intValue3 = ((Number) pair.d()).intValue();
                Integer num = (Integer) pair.g();
                if (num != null) {
                    his0.w(textView, num.intValue(), intValue3);
                } else {
                    hno0.a(textView, dhr0.r(intValue3));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ erh(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ erh(sv20 sv20Var, AppCompatActivity appCompatActivity, ModalAuthOpenerInterface$AuthParams modalAuthOpenerInterface$AuthParams, tv20 tv20Var) {
        this.b = 1;
        this.c = appCompatActivity;
        this.d = modalAuthOpenerInterface$AuthParams;
        this.e = tv20Var;
    }
}

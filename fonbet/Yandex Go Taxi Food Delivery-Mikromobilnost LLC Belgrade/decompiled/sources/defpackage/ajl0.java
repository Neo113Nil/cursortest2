package defpackage;

import android.hardware.SensorManager;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspUdpUnsupportedTransportException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.SharingType;
import com.yandex.go.safety.center.contacts.a;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.instruction.SafetyCenterInstructionView;
import com.yandex.go.safety.center.instructions.SafetyCenterInstructionsView;
import com.yandex.go.safety.center.main.SafetyCenterMainView;
import com.yandex.go.safety.center.share.SafetyCenterShareView;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$TappedButton;
import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import com.yandex.go.scooters.background.ScootersBackgroundModalView;
import com.yandex.go.scooters.debt.ScootersDebtModalView;
import com.yandex.go.scooters.debt.b;
import com.yandex.go.scooters.insurance.analytics.InsuranceCloseReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.go.scooters.insurance.suggest.ScootersInsuranceSuggestModalView;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;
import com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingV2ModalView;
import com.yandex.go.scooters.qr.domain.ScootersQrDarknessInteractor$isDarkFlow$1$listener$1;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersCommentAndPhotosView;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.scooters.presentation.finish_info.d;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.finish_info.input.ScootersFinishInfoInputModalView;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes10.dex */
public final /* synthetic */ class ajl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ajl0(mjl0 mjl0Var, byte[] bArr, List list) {
        this.a = 1;
        this.b = mjl0Var;
        this.c = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0436 A[Catch: ParserException | IllegalArgumentException -> 0x02d5, ParserException | IllegalArgumentException -> 0x02d5, TryCatch #1 {ParserException | IllegalArgumentException -> 0x02d5, blocks: (B:93:0x02b5, B:95:0x02d8, B:97:0x02dd, B:98:0x02e0, B:100:0x02e8, B:102:0x02f0, B:104:0x0315, B:106:0x0338, B:108:0x0340, B:109:0x034b, B:111:0x0346, B:112:0x0350, B:114:0x0354, B:116:0x0358, B:119:0x036b, B:121:0x0371, B:123:0x0383, B:126:0x0386, B:129:0x038f, B:130:0x0396, B:131:0x0397, B:133:0x03b7, B:134:0x03ba, B:135:0x03bf, B:136:0x03c0, B:139:0x03ce, B:142:0x03da, B:145:0x03ed, B:146:0x03f4, B:147:0x03f5, B:149:0x03fd, B:151:0x0404, B:153:0x040c, B:154:0x041c, B:154:0x041c, B:160:0x042d, B:160:0x042d, B:162:0x0436, B:162:0x0436, B:165:0x0447, B:165:0x0447, B:166:0x044f, B:166:0x044f, B:170:0x0411, B:171:0x0418, B:171:0x0418, B:172:0x0400, B:173:0x0463, B:173:0x0463, B:175:0x0468, B:175:0x0468, B:179:0x047c, B:179:0x047c, B:181:0x0482, B:181:0x0482, B:184:0x048f, B:184:0x048f, B:186:0x0497, B:186:0x0497, B:188:0x04ac, B:188:0x04ac), top: B:85:0x02a7 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        ImmutableList g;
        ImmutableList p;
        int i;
        boolean z;
        xcn0 xcn0Var;
        b bVar;
        tls tlsVar;
        zno0 zno0Var;
        d dVar;
        kmn0 kmn0Var;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen;
        d dVar2;
        zsn0 zsn0Var;
        sls slsVar;
        switch (this.a) {
            case 0:
                o8g0 o8g0Var = (o8g0) this.b;
                ImmutableList immutableList = (ImmutableList) this.c;
                bjl0 bjl0Var = (bjl0) o8g0Var.b;
                bjl0Var.getClass();
                o3 o3Var = bjl0Var.z;
                SparseArray sparseArray = bjl0Var.y;
                Pattern pattern = ojl0.b;
                if (!pattern.matcher((CharSequence) immutableList.get(0)).matches()) {
                    Matcher matcher = ojl0.a.matcher((CharSequence) immutableList.get(0));
                    d6z.l(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    ojl0.a(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    Uri.parse(group2);
                    int indexOf = immutableList.indexOf("");
                    d6z.l(indexOf > 0);
                    List subList = immutableList.subList(1, indexOf);
                    cjl0 cjl0Var = new cjl0();
                    cjl0Var.b(subList);
                    djl0 djl0Var = new djl0(cjl0Var);
                    new mf1(ojl0.h).i(immutableList.subList(indexOf + 1, immutableList.size()));
                    String b = djl0Var.b("CSeq");
                    b.getClass();
                    int parseInt = Integer.parseInt(b);
                    bjl0 bjl0Var2 = (bjl0) o3Var.c;
                    o3 o3Var2 = new o3(405, new djl0(new cjl0(bjl0Var2.c, bjl0Var2.D, parseInt)), "");
                    djl0 djl0Var2 = (djl0) o3Var2.w;
                    int i2 = o3Var2.b;
                    d6z.l(djl0Var2.b("CSeq") != null);
                    ImmutableList.a aVar = new ImmutableList.a();
                    if (i2 == 200) {
                        str = "OK";
                    } else if (i2 == 461) {
                        str = "Unsupported Transport";
                    } else if (i2 == 500) {
                        str = "Internal Server Error";
                    } else if (i2 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i2 == 301) {
                        str = "Move Permanently";
                    } else if (i2 == 302) {
                        str = "Move Temporarily";
                    } else if (i2 == 400) {
                        str = "Bad Request";
                    } else if (i2 == 401) {
                        str = "Unauthorized";
                    } else if (i2 == 404) {
                        str = "Not Found";
                    } else {
                        if (i2 != 405) {
                            switch (i2) {
                                case NetworkRequestException.BANNED /* 454 */:
                                    str = "Session Not Found";
                                    break;
                                case 455:
                                    str = "Method Not Valid In This State";
                                    break;
                                case 456:
                                    str = "Header Field Not Valid";
                                    break;
                                case 457:
                                    str = "Invalid Range";
                                    break;
                                default:
                                    w511.q();
                                    g = null;
                                    break;
                            }
                            bjl0Var2.B.c(g);
                            o3Var.b = Math.max(o3Var.b, parseInt + 1);
                            return;
                        }
                        str = "Method Not Allowed";
                    }
                    int i3 = tw21.a;
                    Locale locale = Locale.US;
                    aVar.a("RTSP/1.0 " + i2 + " " + str);
                    ImmutableListMultimap immutableListMultimap = djl0Var2.a;
                    h221 it = immutableListMultimap.w.keySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        ImmutableList f = immutableListMultimap.f(str2);
                        for (int i4 = 0; i4 < f.size(); i4++) {
                            aVar.a(String.format(Locale.US, "%s: %s", str2, f.get(i4)));
                        }
                    }
                    aVar.a("");
                    aVar.a((String) o3Var2.c);
                    g = aVar.g();
                    bjl0Var2.B.c(g);
                    o3Var.b = Math.max(o3Var.b, parseInt + 1);
                    return;
                }
                Matcher matcher2 = pattern.matcher((CharSequence) immutableList.get(0));
                d6z.l(matcher2.matches());
                String group3 = matcher2.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3);
                int indexOf2 = immutableList.indexOf("");
                d6z.l(indexOf2 > 0);
                List subList2 = immutableList.subList(1, indexOf2);
                cjl0 cjl0Var2 = new cjl0();
                cjl0Var2.b(subList2);
                djl0 djl0Var3 = new djl0(cjl0Var2);
                String i5 = new mf1(ojl0.h).i(immutableList.subList(indexOf2 + 1, immutableList.size()));
                String b2 = djl0Var3.b("CSeq");
                b2.getClass();
                int parseInt3 = Integer.parseInt(b2);
                ngg nggVar = bjl0Var.a;
                pjl0 pjl0Var = (pjl0) sparseArray.get(parseInt3);
                if (pjl0Var == null) {
                    return;
                }
                sparseArray.remove(parseInt3);
                int i6 = pjl0Var.b;
                try {
                    if (parseInt2 != 200) {
                        if (parseInt2 == 401) {
                            if (bjl0Var.C == null || bjl0Var.J) {
                                bjl0.a(bjl0Var, new RtspMediaSource$RtspPlaybackException(ojl0.h(i6) + " " + parseInt2));
                                return;
                            }
                            ImmutableList f2 = djl0Var3.a.f(djl0.a("WWW-Authenticate"));
                            if (f2.isEmpty()) {
                                throw ParserException.b(null, "Missing WWW-Authenticate header in a 401 response.");
                            }
                            for (int i7 = 0; i7 < f2.size(); i7++) {
                                lg e = ojl0.e((String) f2.get(i7));
                                bjl0Var.G = e;
                                if (e.a == 2) {
                                    o3Var.J();
                                    bjl0Var.J = true;
                                    return;
                                }
                            }
                            o3Var.J();
                            bjl0Var.J = true;
                            return;
                        }
                        if (parseInt2 == 461) {
                            String str3 = ojl0.h(i6) + " " + parseInt2;
                            String b3 = pjl0Var.c.b("Transport");
                            b3.getClass();
                            bjl0.a(bjl0Var, (i6 != 10 || b3.contains("TCP")) ? new RtspMediaSource$RtspPlaybackException(str3) : new RtspMediaSource$RtspUdpUnsupportedTransportException(str3));
                            return;
                        }
                        if (parseInt2 != 301 && parseInt2 != 302) {
                            bjl0.a(bjl0Var, new RtspMediaSource$RtspPlaybackException(ojl0.h(i6) + " " + parseInt2));
                            return;
                        }
                        if (bjl0Var.H != -1) {
                            bjl0Var.H = 0;
                        }
                        String b4 = djl0Var3.b("Location");
                        if (b4 == null) {
                            nggVar.f("Redirection without new location.", null);
                            return;
                        }
                        Uri parse = Uri.parse(b4);
                        bjl0Var.A = ojl0.f(parse);
                        bjl0Var.C = ojl0.d(parse);
                        Uri uri = bjl0Var.A;
                        String str4 = bjl0Var.D;
                        o3Var.getClass();
                        o3Var.K(o3Var.t(2, str4, ImmutableMap.g(GlideBitmapDownloader.ACCEPT_HEADER, "application/sdp"), uri));
                        return;
                    }
                    switch (i6) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            o8g0Var.h(new yxf0(djl0Var3, dzq0.a(i5)));
                            return;
                        case 4:
                            ImmutableList l = ImmutableList.l(ojl0.b(djl0Var3.b("Public")));
                            if (bjl0Var.F != null) {
                                return;
                            }
                            if (!l.isEmpty() && !l.contains(2)) {
                                nggVar.f("DESCRIBE not supported.", null);
                                return;
                            }
                            Uri uri2 = bjl0Var.A;
                            String str5 = bjl0Var.D;
                            o3Var.getClass();
                            o3Var.K(o3Var.t(2, str5, ImmutableMap.g(GlideBitmapDownloader.ACCEPT_HEADER, "application/sdp"), uri2));
                            return;
                        case 5:
                            o8g0Var.l();
                            return;
                        case 6:
                            String b5 = djl0Var3.b("Range");
                            qjl0 a = b5 == null ? qjl0.c : qjl0.a(b5);
                            try {
                                String b6 = djl0Var3.b("RTP-Info");
                                p = b6 == null ? ImmutableList.p() : rjl0.a(bjl0Var.A, b6);
                            } catch (ParserException unused) {
                                p = ImmutableList.p();
                            }
                            ImmutableList l2 = ImmutableList.l(p);
                            int i8 = bjl0Var.H;
                            if (i8 != 1) {
                                i = 2;
                                if (i8 != 2) {
                                    z = false;
                                    d6z.x(z);
                                    bjl0Var.H = i;
                                    if (bjl0Var.F == null) {
                                        long j = bjl0Var.E / 2;
                                        zil0 zil0Var = new zil0(bjl0Var, j);
                                        bjl0Var.F = zil0Var;
                                        if (!zil0Var.c) {
                                            zil0Var.c = true;
                                            zil0Var.a.postDelayed(zil0Var, j);
                                        }
                                    }
                                    bjl0Var.L = -9223372036854775807L;
                                    bjl0Var.b.e(tw21.W(a.a), l2);
                                    return;
                                }
                            } else {
                                i = 2;
                            }
                            z = true;
                            d6z.x(z);
                            bjl0Var.H = i;
                            if (bjl0Var.F == null) {
                            }
                            bjl0Var.L = -9223372036854775807L;
                            bjl0Var.b.e(tw21.W(a.a), l2);
                            return;
                        case 10:
                            String b7 = djl0Var3.b("Session");
                            String b8 = djl0Var3.b("Transport");
                            if (b7 == null || b8 == null) {
                                throw ParserException.b(null, "Missing mandatory session or transport header");
                            }
                            ek c = ojl0.c(b7);
                            d6z.x(bjl0Var.H != -1);
                            bjl0Var.H = 1;
                            bjl0Var.D = c.a;
                            bjl0Var.E = c.b;
                            bjl0Var.c();
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                } catch (ParserException | IllegalArgumentException e2) {
                    bjl0.a(bjl0Var, new RtspMediaSource$RtspPlaybackException(e2));
                    return;
                }
            case 1:
                mjl0 mjl0Var = (mjl0) this.b;
                byte[] bArr = (byte[]) this.c;
                mjl0Var.getClass();
                try {
                    mjl0Var.a.write(bArr);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 2:
                ((a) this.b).F.a(((List) this.c).size(), !r1.z.t);
                return;
            case 3:
                SafetyCenterInstructionView.renderButtons$lambda$0((SafetyCenterInstructionView) this.b, (g4w) this.c);
                return;
            case 4:
                SafetyCenterInstructionsView.showModalContent$lambda$0((SafetyCenterInstructionsView) this.b, (SafetyCenterExperiment.Instruction) this.c);
                return;
            case 5:
                com.yandex.go.safety.center.main.a aVar2 = (com.yandex.go.safety.center.main.a) this.b;
                SafetyCenterConfig safetyCenterConfig = (SafetyCenterConfig) this.c;
                com.yandex.go.safety.center.analytics.a aVar3 = aVar2.H;
                SafetyCenterParams$Source safetyCenterParams$Source = aVar2.A.a;
                String str6 = aVar2.x.d.b;
                aVar3.g(safetyCenterParams$Source, !(str6 == null || str6.length() == 0), true, safetyCenterConfig.a.c == SharingType.BUTTON, safetyCenterConfig.c);
                return;
            case 6:
                SafetyCenterMainView.lambda$0$1((SafetyCenterMainView) this.b, (SafetyCenterExperiment.ButtonType) this.c);
                return;
            case 7:
                SafetyCenterShareView.showContacts$lambda$1((SafetyCenterShareView) this.b, (swe0) this.c);
                return;
            case 8:
                SavingsAccountFragment.renderContent$lambda$22$lambda$20((SavingsAccountFragment) this.b, (u761) this.c);
                return;
            case 9:
                SavingsDashboardFragmentV2.render$lambda$13((SavingsDashboardFragmentV2) this.b, (zbm0) this.c);
                return;
            case 10:
                SbpPartnersFragment.renderAccordingToViewState$lambda$15$lambda$14((mim0) this.b, (SbpPartnersFragment) this.c);
                return;
            case 11:
                ((ScootersBackgroundModalView) this.b).removeView((View) this.c);
                return;
            case 12:
                ScootersCardBottomComponent.setButtonClickListener$lambda$0((ScootersCardBottomComponent) this.b, (l3n0) this.c);
                return;
            case 13:
                ScootersCardV2ModalView.setOnBackPressedListener$lambda$0((ScootersCardV2ModalView) this.b, (Runnable) this.c);
                return;
            case 14:
                ScootersCommentAndPhotosView._set_onTryLoadPhotoListener_$lambda$0((sls) this.b, (ScootersCommentAndPhotosView) this.c);
                return;
            case 15:
                ScootersCommentAndPhotosView.updatePhotos$lambda$0((ScootersCommentAndPhotosView) this.b, (List) this.c);
                return;
            case 16:
                ScootersDebtModalView.setOnBackPressedListener$lambda$0((ScootersDebtModalView) this.b, (Runnable) this.c);
                return;
            case 17:
                ScootersDebtModalView scootersDebtModalView = (ScootersDebtModalView) this.b;
                hfa0 hfa0Var = (hfa0) this.c;
                xcn0Var = scootersDebtModalView.scootersDebtAnalytics;
                bVar = scootersDebtModalView.scootersDebtPresenter;
                xcn0.b(xcn0Var, ScootersDebtAnalytics$TappedButton.ChangePayment, r1b1.b(bVar.A.a));
                tlsVar = scootersDebtModalView.onPaymentClickedListener;
                tlsVar.invoke(hfa0Var.d());
                return;
            case 18:
                ScootersFinishInfoCard.createV2RecyclerViewAdapter$lambda$2$2$1((tls) this.b, (cmn0) this.c);
                return;
            case 19:
                ScootersFinishInfoCard.createV2RecyclerViewAdapter$lambda$2$1$1((wls) this.b, (bmn0) this.c);
                return;
            case 20:
                ScootersFinishInfoCard.createV1RecyclerViewAdapter$lambda$1$0$1((wls) this.b, (emn0) this.c);
                return;
            case 21:
                ScootersFinishInfoCard.createV1RecyclerViewAdapter$lambda$1$0$2((tls) this.b, (emn0) this.c);
                return;
            case 22:
                ScootersFinishInfoInputModalView.onAttachedToWindow$lambda$1$1((ScootersFinishInfoInputModalView) this.b, (nmn0) this.c);
                return;
            case 23:
                ScootersFinishInfoModalView.initDoneButton$lambda$0$0((ScootersFinishInfoModalView) this.b, (ButtonComponent) this.c);
                return;
            case 24:
                ScootersFinishInfoModalView scootersFinishInfoModalView = (ScootersFinishInfoModalView) this.b;
                amn0 amn0Var = (amn0) this.c;
                zno0Var = scootersFinishInfoModalView.scootersPromotionsAnalytics;
                ((boo0) zno0Var).b(amn0Var.d);
                dVar = scootersFinishInfoModalView.scootersFinishInfoPresenter;
                dVar.J.invoke(amn0Var.e);
                return;
            case 25:
                ScootersFinishInfoModalView scootersFinishInfoModalView2 = (ScootersFinishInfoModalView) this.b;
                xmn0 xmn0Var = (xmn0) this.c;
                kmn0Var = scootersFinishInfoModalView2.scootersFinishInfoAnalytics;
                feedbackSettingsParams$Screen = scootersFinishInfoModalView2.screen;
                String str7 = xmn0Var.e;
                Integer valueOf = Integer.valueOf(xmn0Var.f);
                kmn0Var.getClass();
                kmn0Var.a(feedbackSettingsParams$Screen, ScootersRideFeedbackAnalytics$Button.NewbieHelpItem, valueOf, str7);
                dVar2 = scootersFinishInfoModalView2.scootersFinishInfoPresenter;
                dVar2.J.invoke(xmn0Var.d);
                return;
            case 26:
                ScootersInsuranceSuggestModalView scootersInsuranceSuggestModalView = (ScootersInsuranceSuggestModalView) this.b;
                String str8 = (String) this.c;
                zsn0Var = scootersInsuranceSuggestModalView.scootersInsuranceAnalytics;
                zsn0Var.a(InsuranceCloseReason.REFUSE_BUTTON, ScootersInsuranceControl.BUTTON, str8, InsuranceScreen.PRE_BOOK);
                slsVar = scootersInsuranceSuggestModalView.onRefuse;
                slsVar.invoke();
                return;
            case 27:
                ((ViewTreeObserver) this.b).removeOnPreDrawListener((uid) this.c);
                return;
            case 28:
                ScootersPreselectionLoadingV2ModalView.setOnBackPressedListener$lambda$0((ScootersPreselectionLoadingV2ModalView) this.b, (Runnable) this.c);
                return;
            default:
                ((SensorManager) ((krl0) this.b).a).unregisterListener((ScootersQrDarknessInteractor$isDarkFlow$1$listener$1) this.c);
                return;
        }
    }

    public /* synthetic */ ajl0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

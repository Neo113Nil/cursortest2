package xsna;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.libvideo.video.queue.impl.di.VideoQueueComponentImpl;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.members.VoipDataProvider;
import java.util.Collections;
import kotlin.Pair;
import xsna.ou3;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pm60 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pm60(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WindowLayoutComponent a;
        IsBillingClientAvailable initialize$lambda$220$lambda$216;
        int i = 4;
        int i2 = 9;
        int i3 = 6;
        byte b = 0;
        switch (this.b) {
            case 0:
                vxq vxqVar = new vxq();
                vxqVar.b.add(new dyq());
                return vxqVar;
            case 1:
                return OKVoipEngine.b;
            case 2:
                FeedFeatures feedFeatures = FeedFeatures.DISCOVER_OZON_CLIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 3:
                return new vfa0();
            case 4:
                return new com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.c(Collections.singleton(PostingCreationEntryPoint.FeedPlus), new max0());
            case 5:
                return s3q0.a;
            case 6:
                PublishFragmentInternalComponent.a aVar = PublishFragmentInternalComponent.v;
                return new iee0();
            case 7:
                initialize$lambda$220$lambda$216 = ServiceProvider.initialize$lambda$220$lambda$216();
                return initialize$lambda$220$lambda$216;
            case 8:
                return ((UxPollsComponent) ((k7m) m7m.f(n7j0.c)).a(fpf0.a(UxPollsComponent.class))).o2();
            case 9:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 10:
                return s3q0.a;
            case 11:
                int i4 = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.c(dhr0.s());
            case 12:
                return io.reactivex.rxjava3.schedulers.a.c();
            case 13:
                return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.0f, 0.0f, 0.5f};
            case 14:
                qcy<Object>[] qcyVarArr = VideoQueueComponentImpl.c;
                return new itt0();
            case 15:
                return new a390();
            case 16:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                return s3q0.a;
            case 19:
                Pair pair = new Pair(VkTypographyToken.DisplayTitle1, new th5(b, i));
                Pair pair2 = new Pair(VkTypographyToken.DisplayTitle1SemiBold, new w4b(i3));
                int i5 = 8;
                Pair pair3 = new Pair(VkTypographyToken.DisplayTitle1Bold, new ug4(b, i5));
                int i6 = 10;
                Pair pair4 = new Pair(VkTypographyToken.DisplayTitle1Medium, new md8(b, i6));
                int i7 = 11;
                Pair pair5 = new Pair(VkTypographyToken.DisplayTitle1Normal, new z9g(i7));
                Pair pair6 = new Pair(VkTypographyToken.DisplayTitle2, new r1d(i2));
                Pair pair7 = new Pair(VkTypographyToken.DisplayTitle2SemiBold, new xpd(b, i7));
                Pair pair8 = new Pair(VkTypographyToken.DisplayTitle2Bold, new t8c(i2));
                Pair pair9 = new Pair(VkTypographyToken.DisplayTitle2Medium, new xpd(b, i6));
                Pair pair10 = new Pair(VkTypographyToken.DisplayTitle2Normal, new n21(i5));
                int i8 = 5;
                Pair pair11 = new Pair(VkTypographyToken.DisplayTitle3, new vx7(b, i8));
                Pair pair12 = new Pair(VkTypographyToken.DisplayTitle3SemiBold, new noi(b, i3));
                Pair pair13 = new Pair(VkTypographyToken.DisplayTitle3Bold, new jue(i3));
                Pair pair14 = new Pair(VkTypographyToken.DisplayTitle3Medium, new zdi(i8));
                Pair pair15 = new Pair(VkTypographyToken.DisplayTitle3Normal, new gre(7));
                Pair pair16 = new Pair(VkTypographyToken.DisplayTitle4, new fhi((byte) 0, 3));
                Pair pair17 = new Pair(VkTypographyToken.DisplayTitle4SemiBold, new hre(6));
                Pair pair18 = new Pair(VkTypographyToken.DisplayTitle4Bold, new a9b(9));
                Pair pair19 = new Pair(VkTypographyToken.DisplayTitle4Medium, new kli((byte) 0, 8));
                Pair pair20 = new Pair(VkTypographyToken.DisplayTitle4Normal, new oue(5));
                Pair pair21 = new Pair(VkTypographyToken.Title1, new pue(7));
                Pair pair22 = new Pair(VkTypographyToken.Title1Bold, new cc5(9));
                Pair pair23 = new Pair(VkTypographyToken.Title1SemiBold, new od1(8));
                Pair pair24 = new Pair(VkTypographyToken.Title1Medium, new e55((byte) 0, 6));
                Pair pair25 = new Pair(VkTypographyToken.Title1Normal, new tji(8));
                Pair pair26 = new Pair(VkTypographyToken.Title2, new woi(4));
                Pair pair27 = new Pair(VkTypographyToken.Title2Bold, new uni(6));
                Pair pair28 = new Pair(VkTypographyToken.Title2SemiBold, new nhi(9));
                Pair pair29 = new Pair(VkTypographyToken.Title2Medium, new rei(9));
                byte b2 = 0;
                Pair pair30 = new Pair(VkTypographyToken.Title2Normal, new tg4(b2, 6));
                Pair pair31 = new Pair(VkTypographyToken.Title3, new adf(b2, 6));
                Pair pair32 = new Pair(VkTypographyToken.Title3Bold, new wni(12));
                Pair pair33 = new Pair(VkTypographyToken.Title3SemiBold, new wci(6));
                Pair pair34 = new Pair(VkTypographyToken.Title3Medium, new qte(10));
                Pair pair35 = new Pair(VkTypographyToken.Title3Normal, new mw0((byte) 0, 8));
                Pair pair36 = new Pair(VkTypographyToken.Headline1, new zji(5));
                Pair pair37 = new Pair(VkTypographyToken.Headline1SemiBold, new bb9(8));
                Pair pair38 = new Pair(VkTypographyToken.Headline1Bold, new x7c(10));
                byte b3 = 0;
                Pair pair39 = new Pair(VkTypographyToken.Headline1Medium, new pv7(b3, 12));
                Pair pair40 = new Pair(VkTypographyToken.Headline1Normal, new gqg(b3, 8));
                Pair pair41 = new Pair(VkTypographyToken.Headline2, new a76(b3, 9));
                Pair pair42 = new Pair(VkTypographyToken.Headline2Medium, new b06(b3, 9));
                Pair pair43 = new Pair(VkTypographyToken.Headline2Bold, new b76(b3, 5));
                Pair pair44 = new Pair(VkTypographyToken.Headline2SemiBold, new nfi(b3, 4));
                Pair pair45 = new Pair(VkTypographyToken.Headline2Normal, new hne(6));
                Pair pair46 = new Pair(VkTypographyToken.Text, new e6g(7));
                Pair pair47 = new Pair(VkTypographyToken.TextSemiBold, new vv7(10));
                byte b4 = 0;
                Pair pair48 = new Pair(VkTypographyToken.TextBold, new dmi(b4, 6));
                Pair pair49 = new Pair(VkTypographyToken.TextMedium, new ldi(b4, 8));
                Pair pair50 = new Pair(VkTypographyToken.TextNormal, new nrb(6));
                byte b5 = 0;
                Pair pair51 = new Pair(VkTypographyToken.Paragraph, new a74(b5, 5));
                Pair pair52 = new Pair(VkTypographyToken.ParagraphSemiBold, new f6g(b5, 10));
                Pair pair53 = new Pair(VkTypographyToken.ParagraphBold, new bv4(b5, 10));
                Pair pair54 = new Pair(VkTypographyToken.ParagraphMedium, new lq2(11));
                byte b6 = 0;
                Pair pair55 = new Pair(VkTypographyToken.ParagraphNormal, new nq2(b6, 13));
                Pair pair56 = new Pair(VkTypographyToken.Subhead, new oq2(b6, 8));
                Pair pair57 = new Pair(VkTypographyToken.SubheadNormal, new kxa(b6, 9));
                Pair pair58 = new Pair(VkTypographyToken.SubheadBold, new g6g(4));
                Pair pair59 = new Pair(VkTypographyToken.SubheadSemiBold, new yh3(13));
                Pair pair60 = new Pair(VkTypographyToken.SubheadMedium, new x9d(6));
                Pair pair61 = new Pair(VkTypographyToken.Footnote, new bkh(13));
                Pair pair62 = new Pair(VkTypographyToken.FootnoteSemiBold, new aad(13));
                Pair pair63 = new Pair(VkTypographyToken.FootnoteBold, new zh3(9));
                Pair pair64 = new Pair(VkTypographyToken.FootnoteMedium, new uhd(12));
                Pair pair65 = new Pair(VkTypographyToken.FootnoteNormal, new d69((byte) 0, 9));
                Pair pair66 = new Pair(VkTypographyToken.FootnoteCaps, new uki(7));
                Pair pair67 = new Pair(VkTypographyToken.FootnoteCapsSemiBold, new whd(9));
                Pair pair68 = new Pair(VkTypographyToken.FootnoteCapsBold, new z2(12));
                Pair pair69 = new Pair(VkTypographyToken.FootnoteCapsMedium, new v3l(6));
                byte b7 = 0;
                Pair pair70 = new Pair(VkTypographyToken.FootnoteCapsNormal, new rc9(b7, 5));
                Pair pair71 = new Pair(VkTypographyToken.Caption1, new e69(b7, 8));
                Pair pair72 = new Pair(VkTypographyToken.Caption1SemiBold, new rv4(b7, 8));
                Pair pair73 = new Pair(VkTypographyToken.Caption1Bold, new k3i(7));
                Pair pair74 = new Pair(VkTypographyToken.Caption1Medium, new f21(7));
                Pair pair75 = new Pair(VkTypographyToken.Caption1Normal, new cf3(7));
                Pair pair76 = new Pair(VkTypographyToken.Caption1Caps, new ac1((byte) 0, 6));
                Pair pair77 = new Pair(VkTypographyToken.Caption1CapsSemiBold, new j89(8));
                byte b8 = 0;
                Pair pair78 = new Pair(VkTypographyToken.Caption1CapsBold, new j21(b8, 16));
                Pair pair79 = new Pair(VkTypographyToken.Caption1CapsMedium, new mz2(b8, 7));
                Pair pair80 = new Pair(VkTypographyToken.Caption1CapsNormal, new yx5(13));
                Pair pair81 = new Pair(VkTypographyToken.Caption2, new n21(9));
                Pair pair82 = new Pair(VkTypographyToken.Caption2Normal, new zh3(8));
                Pair pair83 = new Pair(VkTypographyToken.Caption2Bold, new tx3((byte) 0, 6));
                Pair pair84 = new Pair(VkTypographyToken.Caption2SemiBold, new uhd(11));
                Pair pair85 = new Pair(VkTypographyToken.Caption2Medium, new d69((byte) 0, 8));
                Pair pair86 = new Pair(VkTypographyToken.Caption2Caps, new uki(6));
                Pair pair87 = new Pair(VkTypographyToken.Caption2CapsSemiBold, new whd(8));
                Pair pair88 = new Pair(VkTypographyToken.Caption2CapsBold, new z2(11));
                Pair pair89 = new Pair(VkTypographyToken.Caption2CapsMedium, new v3l(5));
                byte b9 = 0;
                Pair pair90 = new Pair(VkTypographyToken.Caption2CapsNormal, new rc9(b9, 4));
                int i9 = 7;
                Pair pair91 = new Pair(VkTypographyToken.Caption3, new rv4(b9, i9));
                Pair pair92 = new Pair(VkTypographyToken.Caption3Normal, new qg3(i9));
                Pair pair93 = new Pair(VkTypographyToken.Caption3Bold, new k3i(6));
                Pair pair94 = new Pair(VkTypographyToken.Caption3SemiBold, new f21(6));
                Pair pair95 = new Pair(VkTypographyToken.Caption3Medium, new cf3(6));
                Pair pair96 = new Pair(VkTypographyToken.Caption3Caps, new ac1((byte) 0, 5));
                Pair pair97 = new Pair(VkTypographyToken.Caption3CapsSemiBold, new j89(7));
                byte b10 = 0;
                Pair pair98 = new Pair(VkTypographyToken.Caption3CapsBold, new j21(b10, 15));
                Pair pair99 = new Pair(VkTypographyToken.Caption3CapsMedium, new mz2(b10, 6));
                Pair pair100 = new Pair(VkTypographyToken.Caption3CapsNormal, new yx5(12));
                Pair pair101 = new Pair(VkTypographyToken.Label1, new nde((byte) 0, 9));
                Pair pair102 = new Pair(VkTypographyToken.Label1Bold, new hkb(13));
                Pair pair103 = new Pair(VkTypographyToken.Label1SemiBold, new aki((byte) 0, 7));
                Pair pair104 = new Pair(VkTypographyToken.Label1Medium, new c80(5));
                Pair pair105 = new Pair(VkTypographyToken.Label1Normal, new mq2(14));
                Pair pair106 = new Pair(VkTypographyToken.Label2, new tx3((byte) 0, 7));
                Pair pair107 = new Pair(VkTypographyToken.Label2SemiBold, new qg3(8));
                byte b11 = 0;
                Pair pair108 = new Pair(VkTypographyToken.Label2Bold, new vx7(b11, 6));
                Pair pair109 = new Pair(VkTypographyToken.Label2Medium, new e69(b11, 7));
                Pair pair110 = new Pair(VkTypographyToken.Label2Normal, new t8c(8));
                byte b12 = 0;
                Pair pair111 = new Pair(VkTypographyToken.Body, new u8c(b12, 5));
                Pair pair112 = new Pair(VkTypographyToken.BodyMedium, new zpb(b12, 9));
                Pair pair113 = new Pair(VkTypographyToken.BodyBold, new twa(b12, 8));
                Pair pair114 = new Pair(VkTypographyToken.BodySemiBold, new k8d(b12, 6));
                byte b13 = 0;
                return pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, pair64, pair65, pair66, pair67, pair68, pair69, pair70, pair71, pair72, pair73, pair74, pair75, pair76, pair77, pair78, pair79, pair80, pair81, pair82, pair83, pair84, pair85, pair86, pair87, pair88, pair89, pair90, pair91, pair92, pair93, pair94, pair95, pair96, pair97, pair98, pair99, pair100, pair101, pair102, pair103, pair104, pair105, pair106, pair107, pair108, pair109, pair110, pair111, pair112, pair113, pair114, new Pair(VkTypographyToken.BodyNormal, new log(15)), new Pair(VkTypographyToken.Headline, new kc4(b13, 9)), new Pair(VkTypographyToken.HeadlineSemiBold, new f07(b13, 13)), new Pair(VkTypographyToken.HeadlineBold, new xdi(5)), new Pair(VkTypographyToken.HeadlineMedium, new com.vk.movika.tools.controls.seekbar.o(9)), new Pair(VkTypographyToken.HeadlineNormal, new i60(14)));
            case 20:
                xuo0.a.getClass();
                return Long.valueOf(xuo0.a());
            case 21:
                return ou3.a.a("2:3");
            case 22:
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider != null) {
                    return voipDataProvider;
                }
                return null;
            default:
                try {
                    ClassLoader classLoader = upx0.class.getClassLoader();
                    szg0 szg0Var = classLoader != null ? new szg0(classLoader, new p7j(classLoader)) : null;
                    if (szg0Var == null || (a = szg0Var.a()) == null) {
                        return null;
                    }
                    p7j p7jVar = new p7j(classLoader);
                    rdq.a.getClass();
                    int a2 = rdq.a();
                    return a2 >= 9 ? new kdq(a, p7jVar) : a2 >= 6 ? new jdq(a, p7jVar) : a2 >= 2 ? new idq(a, p7jVar) : a2 == 1 ? new hdq(a, p7jVar) : new gdq();
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}

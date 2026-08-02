package xsna;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.market.dto.MarketItemSkuReviewDto;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.fullscreenvideo.design.view.top.TopControlsView;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;
import xsna.i8a0;
import xsna.igg0;
import xsna.iwa;
import xsna.jgg0;
import xsna.mwa;
import xsna.q630;
import xsna.vuw0;
import xsna.x7u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nx7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nx7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x041c  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.util.ArrayList] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Integer d;
        u7u u7uVar;
        String str;
        u7u u7uVar2;
        boolean y;
        Object x;
        boolean y2;
        Object x2;
        List<y2u0> list;
        lgg0 lgg0Var;
        us2 us2Var;
        tgg0 tgg0Var;
        u7u u7uVar3;
        boolean y3;
        Object x3;
        Object x4;
        ugg0 ugg0Var;
        ugg0 ugg0Var2;
        dce0 dce0Var;
        String str2;
        us2 us2Var2;
        ugg0 ugg0Var3;
        odo0 odo0Var;
        ugg0 ugg0Var4;
        odo0 odo0Var2;
        ugg0 ugg0Var5;
        odo0 odo0Var3;
        ?? r7;
        ugg0 ugg0Var6;
        List<y2u0> list2;
        ImageGalleryItem.ImageGalleryImageItem imageGalleryImageItem;
        ugg0 ugg0Var7;
        vhg0 vhg0Var;
        vhg0 vhg0Var2;
        vhg0 vhg0Var3;
        Float f;
        int i = this.b;
        int i2 = 11;
        int i3 = 9;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i4 = 7;
        int i5 = 2;
        r9 = false;
        boolean z = false;
        ?? r10 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                BookingServicesScreenFragment bookingServicesScreenFragment = (BookingServicesScreenFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2136581833, intValue, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment.onCreateView.<anonymous>.<anonymous> (BookingServicesScreenFragment.kt:102)");
                    }
                    nzw nzwVar = bookingServicesScreenFragment.R;
                    qcy<Object> qcyVar = BookingServicesScreenFragment.S[0];
                    ww7 ww7Var = (ww7) bu00.k(nzwVar);
                    boolean y4 = aVar.y(bookingServicesScreenFragment);
                    Object x5 = aVar.x();
                    if (y4 || x5 == c0012a) {
                        x5 = new im0(bookingServicesScreenFragment, i2);
                        aVar.R(x5);
                    }
                    gzs gzsVar = (gzs) x5;
                    TypedValue typedValue = krv0.a;
                    Context requireContext = bookingServicesScreenFragment.requireContext();
                    if (bookingServicesScreenFragment.requireArguments().getBoolean("force_dark_theme", false) && (d = krv0.d()) != null) {
                        requireContext = new l7s(requireContext, d.intValue());
                    }
                    boolean f2 = epx.f(krv0.i(requireContext), Boolean.TRUE);
                    boolean y5 = aVar.y(bookingServicesScreenFragment);
                    Object x6 = aVar.x();
                    if (y5 || x6 == c0012a) {
                        x6 = new jm0(bookingServicesScreenFragment, i5);
                        aVar.R(x6);
                    }
                    BookingServicesScreenKt.b(ww7Var, gzsVar, f2, (izs) x6, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                mwa mwaVar = (mwa) obj3;
                iwa.a aVar2 = (iwa.a) obj;
                t140 t140Var = (t140) obj2;
                ProfilesSimpleInfo profilesSimpleInfo = aVar2.b;
                ProfilesInfo profilesInfo = t140Var.b;
                profilesSimpleInfo.getClass();
                ProfilesSimpleInfo profilesSimpleInfo2 = new ProfilesSimpleInfo(profilesSimpleInfo);
                profilesSimpleInfo2.Hb(profilesInfo != null ? profilesInfo.Ob() : new ProfilesSimpleInfo());
                return new mwa.a((MsgFromChannel) t140Var.a.c.get(Integer.valueOf(mwaVar.c)), aVar2.a, profilesSimpleInfo2);
            case 2:
                ((Integer) obj2).getClass();
                com.vk.community.design.compose.onboarding.a.d((CommunityCreationOnboardingBlock) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                iea0 iea0Var = (iea0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1456413106, intValue2, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotoViewHolder.setupShimmers.<anonymous>.<anonymous> (CommunityProfileContentPhotoViewHolder.kt:217)");
                    }
                    tth.a(null, kai.c(-96904649, new gt7(iea0Var, r10 ? 1 : 0), aVar3), aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((e8q) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                x7u x7uVar = (x7u) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-16762212, intValue3, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.bind.<anonymous>.<anonymous> (GoodReviewItemComposeViewHolder.kt:77)");
                    }
                    q630 f3 = txj0.f(q630.a.a, 1.0f);
                    boolean y6 = aVar4.y(x7uVar);
                    Object x7 = aVar4.x();
                    if (y6 || x7 == c0012a) {
                        x7 = new m3g(x7uVar, 21);
                        aVar4.R(x7);
                    }
                    q630 c = ojc.c(f3, false, null, null, (gzs) x7, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1513267531, 0, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.createReviewBlockHeader (GoodReviewItemComposeViewHolder.kt:119)");
                    }
                    u7u u7uVar4 = x7uVar.o;
                    MarketItemSkuReviewDto.SourceDto sourceDto = u7uVar4 != null ? u7uVar4.j : null;
                    int i6 = sourceDto == null ? -1 : x7u.a.$EnumSwitchMapping$0[sourceDto.ordinal()];
                    if (i6 != -1) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        u7uVar = x7uVar.o;
                        str = "";
                        if (u7uVar != null || (r12 = u7uVar.e) == null) {
                            String str3 = "";
                        }
                        float floatValue = (u7uVar != null || (vhg0Var3 = u7uVar.h) == null || (f = vhg0Var3.b) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue();
                        u7uVar2 = x7uVar.o;
                        if (u7uVar2 != null || (vhg0Var2 = u7uVar2.h) == null || (r15 = vhg0Var2.a) == null) {
                            String str4 = "";
                        }
                        qgg0 qgg0Var = new qgg0(str3, str4, floatValue, (u7uVar2 != null || (vhg0Var = u7uVar2.h) == null) ? false : vhg0Var.f);
                        y = aVar4.y(x7uVar);
                        x = aVar4.x();
                        if (!y || x == c0012a) {
                            x = new bfm(x7uVar, 10);
                            aVar4.R(x);
                        }
                        gzs gzsVar2 = (gzs) x;
                        if (r10 == 0) {
                            gzsVar2 = null;
                        }
                        y2 = aVar4.y(x7uVar);
                        x2 = aVar4.x();
                        if (!y2 || x2 == c0012a) {
                            x2 = new qfj(x7uVar, 8);
                            aVar4.R(x2);
                        }
                        gzs gzsVar3 = (gzs) x2;
                        if (r10 == 0) {
                            gzsVar3 = null;
                        }
                        rgg0 B = d370.B(qgg0Var, gzsVar2, gzsVar3, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar4.K(-980077243);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-980077243, 0, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.createReviewBlockAttach (GoodReviewItemComposeViewHolder.kt:138)");
                        }
                        u7u u7uVar5 = x7uVar.o;
                        list = (u7uVar5 != null || (ugg0Var7 = u7uVar5.i) == null) ? null : ugg0Var7.a;
                        if (list != null || list.isEmpty()) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            lgg0Var = null;
                        } else {
                            u7u u7uVar6 = x7uVar.o;
                            if (u7uVar6 == null || (ugg0Var6 = u7uVar6.i) == null || (list2 = ugg0Var6.a) == null) {
                                r7 = 0;
                            } else {
                                r7 = new ArrayList();
                                for (y2u0 y2u0Var : list2) {
                                    ImageSize imageSize = (ImageSize) ixj0.b(y2u0Var.b);
                                    if (imageSize != null) {
                                        Integer num = y2u0Var.c;
                                        imageGalleryImageItem = new ImageGalleryItem.ImageGalleryImageItem(num != null ? num.intValue() : 0, null, imageSize.d.d, 2, null);
                                    } else {
                                        imageGalleryImageItem = null;
                                    }
                                    if (imageGalleryImageItem != null) {
                                        r7.add(imageGalleryImageItem);
                                    }
                                }
                            }
                            if (r7 == 0) {
                                r7 = EmptyList.b;
                            }
                            kgg0 kgg0Var = new kgg0(r7);
                            boolean y7 = aVar4.y(x7uVar);
                            Object x8 = aVar4.x();
                            if (y7 || x8 == c0012a) {
                                x8 = new w7u(x7uVar, r9 ? 1 : 0);
                                aVar4.R(x8);
                            }
                            lgg0 a = igg0.a.a(kgg0Var, (izs) x8, aVar4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            lgg0Var = a;
                        }
                        aVar4.K(-1416907535);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1416907535, 0, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.createReviewBlockTextBody (GoodReviewItemComposeViewHolder.kt:161)");
                        }
                        u7u u7uVar7 = x7uVar.o;
                        us2Var = (u7uVar7 != null || (ugg0Var5 = u7uVar7.i) == null || (odo0Var3 = ugg0Var5.c) == null) ? null : odo0Var3.b;
                        if (us2Var != null || us2Var.c.length() == 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            tgg0Var = null;
                        } else {
                            u7u u7uVar8 = x7uVar.o;
                            if (u7uVar8 == null || (ugg0Var4 = u7uVar8.i) == null || (odo0Var2 = ugg0Var4.c) == null || (us2Var2 = odo0Var2.b) == null) {
                                us2Var2 = new us2("");
                            }
                            u7u u7uVar9 = x7uVar.o;
                            boolean z2 = (u7uVar9 == null || (ugg0Var3 = u7uVar9.i) == null || (odo0Var = ugg0Var3.c) == null) ? false : odo0Var.c;
                            boolean y8 = aVar4.y(x7uVar);
                            Object x9 = aVar4.x();
                            if (y8 || x9 == c0012a) {
                                x9 = new pvh(x7uVar, i3);
                                aVar4.R(x9);
                            }
                            tgg0 a2 = jgg0.a.a(new sgg0(us2Var2, z2, (gzs) x9), aVar4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            tgg0Var = a2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(588912377, 0, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.createReviewBlockBottom (GoodReviewItemComposeViewHolder.kt:174)");
                        }
                        u7uVar3 = x7uVar.o;
                        if (u7uVar3 != null && (ugg0Var2 = u7uVar3.i) != null && (dce0Var = ugg0Var2.b) != null && (str2 = dce0Var.a) != null) {
                            str = str2;
                        }
                        if (u7uVar3 != null && (ugg0Var = u7uVar3.i) != null) {
                            z = ugg0Var.d;
                        }
                        mgg0 mgg0Var = new mgg0(str, z);
                        y3 = aVar4.y(x7uVar);
                        x3 = aVar4.x();
                        if (!y3 || x3 == c0012a) {
                            x3 = new obh(x7uVar, 12);
                            aVar4.R(x3);
                        }
                        gzs gzsVar4 = (gzs) x3;
                        x4 = aVar4.x();
                        if (x4 == c0012a) {
                            x4 = new ig(11);
                            aVar4.R(x4);
                        }
                        ngg0 B2 = f9t.B(mgg0Var, gzsVar4, (gzs) x4, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pgg0.a(B, B2, c, lgg0Var, tgg0Var, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                    r10 = 0;
                    u7uVar = x7uVar.o;
                    str = "";
                    if (u7uVar != null) {
                    }
                    String str32 = "";
                    if (u7uVar != null) {
                    }
                    u7uVar2 = x7uVar.o;
                    if (u7uVar2 != null) {
                    }
                    String str42 = "";
                    qgg0 qgg0Var2 = new qgg0(str32, str42, floatValue, (u7uVar2 != null || (vhg0Var = u7uVar2.h) == null) ? false : vhg0Var.f);
                    y = aVar4.y(x7uVar);
                    x = aVar4.x();
                    if (!y) {
                    }
                    x = new bfm(x7uVar, 10);
                    aVar4.R(x);
                    gzs gzsVar22 = (gzs) x;
                    if (r10 == 0) {
                    }
                    y2 = aVar4.y(x7uVar);
                    x2 = aVar4.x();
                    if (!y2) {
                    }
                    x2 = new qfj(x7uVar, 8);
                    aVar4.R(x2);
                    gzs gzsVar32 = (gzs) x2;
                    if (r10 == 0) {
                    }
                    rgg0 B3 = d370.B(qgg0Var2, gzsVar22, gzsVar32, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    aVar4.K(-980077243);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    u7u u7uVar52 = x7uVar.o;
                    list = (u7uVar52 != null || (ugg0Var7 = u7uVar52.i) == null) ? null : ugg0Var7.a;
                    if (list != null) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    aVar4.j();
                    lgg0Var = null;
                    aVar4.K(-1416907535);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    u7u u7uVar72 = x7uVar.o;
                    if (u7uVar72 != null) {
                    }
                    if (us2Var != null) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    aVar4.j();
                    tgg0Var = null;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    u7uVar3 = x7uVar.o;
                    if (u7uVar3 != null) {
                        str = str2;
                    }
                    if (u7uVar3 != null) {
                        z = ugg0Var.d;
                    }
                    mgg0 mgg0Var2 = new mgg0(str, z);
                    y3 = aVar4.y(x7uVar);
                    x3 = aVar4.x();
                    if (!y3) {
                    }
                    x3 = new obh(x7uVar, 12);
                    aVar4.R(x3);
                    gzs gzsVar42 = (gzs) x3;
                    x4 = aVar4.x();
                    if (x4 == c0012a) {
                    }
                    ngg0 B22 = f9t.B(mgg0Var2, gzsVar42, (gzs) x4, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    pgg0.a(B3, B22, c, lgg0Var, tgg0Var, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 6:
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i7 = MarketEditAlbumGoodVariantsFragment.M0;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-837681354, intValue4, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment.initToolbar.<anonymous>.<anonymous> (MarketEditAlbumGoodVariantsFragment.kt:78)");
                    }
                    Good good = marketEditAlbumGoodVariantsFragment.J0;
                    String str5 = (good == null ? null : good).d;
                    Object x10 = aVar5.x();
                    if (x10 == c0012a) {
                        x10 = new qfj(marketEditAlbumGoodVariantsFragment, 19);
                        aVar5.R(x10);
                    }
                    gzs gzsVar5 = (gzs) x10;
                    Object x11 = aVar5.x();
                    if (x11 == c0012a) {
                        x11 = new w4u(marketEditAlbumGoodVariantsFragment, i3);
                        aVar5.R(x11);
                    }
                    rx00.a(str5, gzsVar5, (gzs) x11, null, aVar5, Tensorflow.FRAME_WIDTH);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((co20) obj3).b(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((fm70) obj3).C(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ks80 ks80Var = (ks80) obj3;
                Set set = (Set) obj2;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ks80Var.f().g((String) it.next());
                }
                return set;
            case 10:
                ((z8a0) obj3).e.invoke(new i8a0.b((Throwable) obj, ((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 11:
                wdc0 wdc0Var = (wdc0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1623159857, intValue5, -1, "com.vk.newsfeed.impl.posting.PostingCtaAttachChoiceBottomSheetDelegate.view.<anonymous>.<anonymous>.<anonymous> (PostingCtaAttachChoiceBottomSheetDelegate.kt:61)");
                    }
                    rsx rsxVar = wdc0Var.a;
                    AttachmentType attachmentType = (AttachmentType) ((zak0) wdc0Var.d).getValue();
                    boolean y9 = aVar6.y(wdc0Var);
                    Object x12 = aVar6.x();
                    if (y9 || x12 == c0012a) {
                        x12 = new i750(wdc0Var, 13);
                        aVar6.R(x12);
                    }
                    izs izsVar = (izs) x12;
                    boolean y10 = aVar6.y(wdc0Var);
                    Object x13 = aVar6.x();
                    if (y10 || x13 == c0012a) {
                        x13 = new b290(wdc0Var, i4);
                        aVar6.R(x13);
                    }
                    ydc0.a(rsxVar, attachmentType, izsVar, (gzs) x13, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                fjl0.a((izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                return TopControlsView.z((TopControlsView) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
            case 14:
                ((Integer) obj2).getClass();
                ((xpq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                ((wtq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 16:
                int i8 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoMinimizableDiscoveryFragment) obj3).getFeature().C(new c.k0((VideoFile) obj, (String) obj2));
                return s3q0.a;
            case 17:
                ((Integer) obj2).getClass();
                t7u0.a((Alert$Button) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                puw0 puw0Var = (puw0) obj3;
                CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
                MessagesGetGroupsForCallResponseDto messagesGetGroupsForCallResponseDto = (MessagesGetGroupsForCallResponseDto) obj2;
                puw0Var.o.getClass();
                ArrayList a3 = qp90.a(callsGetHistoryResponseDto);
                xx1 xx1Var = puw0Var.n;
                List<UsersUserFullDto> j = callsGetHistoryResponseDto.j();
                xx1Var.getClass();
                LinkedHashMap n = xx1.n(j);
                LinkedHashMap l = xx1.l(callsGetHistoryResponseDto.e());
                LinkedHashMap i9 = xx1.i(callsGetHistoryResponseDto.d());
                LinkedHashMap l2 = xx1.l(messagesGetGroupsForCallResponseDto.d());
                Long i10 = callsGetHistoryResponseDto.i();
                return new vuw0.b(a3, n, l, l2, i9, i10 != null ? i10.longValue() : 0L, callsGetHistoryResponseDto.f(), messagesGetGroupsForCallResponseDto.getCount() > 0);
        }
    }

    public /* synthetic */ nx7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}

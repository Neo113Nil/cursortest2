package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.id.UserId;
import com.vk.feed.tool.compose.posting.step2cell.OnboardingType;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.Onboarding;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.fmc0;
import xsna.q630;
import xsna.wpc0;

/* compiled from: AttachmentPickersScreen.kt */
/* loaded from: classes4.dex */
public final class p74 {

    /* compiled from: AttachmentPickersScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Onboarding.values().length];
            try {
                iArr[Onboarding.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Onboarding.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Onboarding.SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wpc0.a.C3948a c3948a, PostEditingReason postEditingReason, ActionsAvailabilityState.Attachments attachments, PostingSettings postingSettings, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        int i3;
        izs<? super PostingAction, s3q0> izsVar2;
        izs<? super PostingAction, s3q0> izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-228529790);
        if ((i & 6) == 0) {
            i2 = (M.J(c3948a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(postEditingReason) : M.y(postEditingReason) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(attachments) : M.y(attachments) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(postingSettings) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar3) ? 16384 : 8192;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-228529790, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.AdditionalAttachmentsSection (AttachmentPickersScreen.kt:339)");
            }
            wh50 a2 = jk50.a(c3948a.j, M, 0, 3);
            wh50 c = jk50.c(c3948a.p, M);
            wh50 c2 = jk50.c(c3948a.l, M);
            wh50 a3 = jk50.a(c3948a.k, M, 0, 3);
            wh50 c3 = jk50.c(c3948a.o, M);
            wh50 a4 = jk50.a(c3948a.m, M, 0, 3);
            wh50 a5 = jk50.a(c3948a.y, M, 0, 3);
            wh50 a6 = jk50.a(c3948a.z, M, 0, 3);
            wh50 a7 = jk50.a(c3948a.O, M, 0, 3);
            wh50 a8 = jk50.a(c3948a.P, M, 0, 3);
            wh50 c4 = jk50.c(c3948a.U, M);
            if (((Boolean) c4.getValue()).booleanValue() && postingSettings.v) {
                M.K(-606789146);
                aVar3 = M;
                ftd0.c((osd0) c3.getValue(), attachments.j, izsVar3, (PostingHints) a8.getValue(), "PostingAddProductButton", aVar3, ((i4 >> 6) & 896) | 24576);
                if (postEditingReason.Ja()) {
                    izsVar3 = izsVar;
                    i3 = -622046912;
                    aVar3.K(-622046912);
                } else {
                    aVar3.K(-606474682);
                    List<ActionButton> list = (List) a6.getValue();
                    if (list == null) {
                        list = postingSettings.i;
                    }
                    i3 = -622046912;
                    izsVar3 = izsVar;
                    yx.a(list, (ActionButtonHints) a7.getValue(), (ActionButton) a5.getValue(), izsVar3, attachments.l, "PostingActionButtons", aVar3, ((i4 >> 3) & 7168) | 196608);
                    aVar3 = aVar3;
                }
                aVar3.j();
                f(0, aVar3);
            } else {
                aVar3 = M;
                i3 = -622046912;
                aVar3.K(-622046912);
            }
            aVar3.j();
            int i5 = (i4 >> 6) & 896;
            vqa0.a((PostingPlaceDto) a2.getValue(), ((wow) c.getValue()).b, izsVar3, aVar3, i5);
            int i6 = (i4 >> 3) & 7168;
            androidx.compose.runtime.a aVar4 = aVar3;
            ns40.a((ma40) c2.getValue(), attachments.g, attachments.h, izsVar3, aVar4, i6);
            brb0.a((PostingPollDto) a3.getValue(), postingSettings.b, attachments.i, izsVar, aVar4, i6);
            aVar2 = aVar4;
            if (postingSettings.v) {
                Boolean bool = (Boolean) c4.getValue();
                bool.getClass();
                if (bool.equals(Boolean.FALSE)) {
                    aVar2.K(-605702379);
                    ftd0.c((osd0) c3.getValue(), attachments.j, izsVar, (PostingHints) a8.getValue(), "PostingAddProductButton", aVar2, i5 | 24576);
                    izsVar2 = izsVar;
                    aVar2.j();
                    v9r.a((FileDto) a4.getValue(), izsVar2, aVar2, (i4 >> 9) & 112);
                    if (!postEditingReason.Ja()) {
                        Boolean bool2 = (Boolean) c4.getValue();
                        bool2.getClass();
                        if (bool2.equals(Boolean.FALSE)) {
                            aVar2.K(-605300278);
                            List<ActionButton> list2 = (List) a6.getValue();
                            if (list2 == null) {
                                list2 = postingSettings.i;
                            }
                            yx.a(list2, (ActionButtonHints) a7.getValue(), (ActionButton) a5.getValue(), izsVar2, attachments.l, "PostingActionButtons", aVar2, i6 | 196608);
                            aVar2 = aVar2;
                            aVar2.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    }
                    aVar2.K(i3);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
            }
            izsVar2 = izsVar;
            aVar2.K(i3);
            aVar2.j();
            v9r.a((FileDto) a4.getValue(), izsVar2, aVar2, (i4 >> 9) & 112);
            if (!postEditingReason.Ja()) {
            }
            aVar2.K(i3);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b74(c3948a, postEditingReason, attachments, postingSettings, izsVar, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0614  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(tcc0 tcc0Var, wpc0.a.C3948a c3948a, int i, s890 s890Var, izs izsVar, izs izsVar2, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        int i4;
        izs izsVar3;
        wpc0.a.C3948a c3948a2;
        androidx.compose.runtime.a aVar2;
        int i5;
        int i6;
        char c;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar3;
        boolean z;
        Object obj;
        androidx.compose.runtime.a aVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.a aVar5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj2;
        androidx.compose.runtime.a aVar6;
        int i21;
        int i22;
        Object x;
        String a2;
        OnboardingType onboardingType;
        String a3;
        izs izsVar4 = izsVar;
        gec0 gec0Var = tcc0Var.a;
        boolean z4 = tcc0Var.b;
        androidx.compose.runtime.a M = aVar.M(-1110616599);
        if ((i2 & 6) == 0) {
            i3 = (M.J(tcc0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(c3948a) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(s890Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            izsVar3 = izsVar2;
            i3 |= M.y(izsVar3) ? 131072 : 65536;
        } else {
            izsVar3 = izsVar2;
        }
        int i23 = i3;
        if (M.t(i23 & 1, (74899 & i23) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1110616599, i23, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.AttachmentPickersScreen (AttachmentPickersScreen.kt:58)");
            }
            jgh0 x2 = p490.x(M);
            wh50 c2 = jk50.c(c3948a.Q, M);
            wh50 c3 = jk50.c(c3948a.S, M);
            wh50 c4 = jk50.c(c3948a.R, M);
            wh50 c5 = jk50.c(c3948a.T, M);
            wh50 a4 = jk50.a(c3948a.V, M, 0, 3);
            q630.a aVar7 = q630.a.a;
            q630 D = p490.D(s200.C(aVar7, s890Var), x2, 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c6 = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar8 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar8);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c6, cri.a.d);
            wh50 c7 = jk50.c(c3948a.A, M);
            wh50 a6 = jk50.a(c3948a.t, M, 0, 3);
            wh50 c8 = jk50.c(c3948a.q, M);
            wh50 c9 = jk50.c(c3948a.w, M);
            wh50 c10 = jk50.c(c3948a.x, M);
            wh50 c11 = jk50.c(c3948a.r, M);
            wh50 c12 = jk50.c(c3948a.B, M);
            wh50 c13 = jk50.c(c3948a.F, M);
            wh50 c14 = jk50.c(c3948a.H, M);
            wh50 c15 = jk50.c(c3948a.J, M);
            wh50 c16 = jk50.c(c3948a.K, M);
            wh50 c17 = jk50.c(c3948a.L, M);
            wh50 c18 = jk50.c(c3948a.M, M);
            wh50 a7 = jk50.a(c3948a.G, M, 0, 3);
            int i24 = i23 >> 3;
            int i25 = i24 & 14;
            int i26 = i23 >> 6;
            c(c3948a, i4, izsVar4, izsVar3, M, (i24 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i26 & 896) | (i26 & 7168));
            int i27 = i23 & 57344;
            a(c3948a, (PostEditingReason) c12.getValue(), ((ActionsAvailabilityState) c10.getValue()).c, (PostingSettings) c11.getValue(), izsVar, M, i25 | i27);
            int i28 = i24 & 7168;
            izsVar4 = izsVar;
            e(c3948a, tcc0Var, (PostEditingReason) c12.getValue(), izsVar4, M, i25 | ((i23 << 3) & 112) | i28);
            boolean booleanValue = ((Boolean) jk50.c(c3948a.s, M).getValue()).booleanValue();
            Object obj3 = a.C0011a.a;
            if (booleanValue) {
                M.K(150338994);
                String N = d370.N(R.string.postpone_publication_when_to_publish, 0, M);
                Date date = (Date) a6.getValue();
                if (date == null) {
                    M.K(150559217);
                    M.j();
                    a3 = null;
                } else {
                    M.K(150559218);
                    a3 = gec0.a((Context) M.r(AndroidCompositionLocals_androidKt.b), date);
                    M.j();
                }
                if (a3 == null) {
                    a3 = zq.a(M, -964970885, R.string.postpone_publication_now, M, 0);
                } else {
                    M.K(-964974915);
                    M.j();
                }
                String str = a3;
                q630 E = ahn.E(aVar7, "PostingPostponedButton");
                boolean z5 = i27 == 16384;
                Object x3 = M.x();
                if (z5 || x3 == obj3) {
                    c = 2;
                    x3 = new tw(izsVar4, 2);
                    M.R(x3);
                } else {
                    c = 2;
                }
                gzs gzsVar = (gzs) x3;
                i5 = i27;
                i8 = 0;
                i6 = i23;
                qoc0.a(null, N, E, str, null, null, null, null, gzsVar, null, 0, 0, M, 390, 0, 3824);
                aVar3 = M;
                aVar3.j();
                z = true;
                i7 = 145243555;
            } else {
                i5 = i27;
                i6 = i23;
                c = 2;
                i7 = 145243555;
                i8 = 0;
                aVar3 = M;
                aVar3.K(145243555);
                aVar3.j();
                z = false;
            }
            if (z4) {
                aVar3.K(151028806);
                PrivacyViewState privacyViewState = (PrivacyViewState) a4.getValue();
                if (privacyViewState == null) {
                    aVar3.K(151062130);
                } else {
                    aVar3.K(151062131);
                    ced0.a(privacyViewState, izsVar4, ahn.E(aVar7, "PostingPrivacyButton"), aVar3, ((i6 >> 9) & 112) | 384);
                    s3q0 s3q0Var = s3q0.a;
                }
                aVar3.j();
                aVar3.j();
                obj = obj3;
                aVar4 = aVar3;
                i9 = i7;
                i10 = i8;
                i11 = 1;
                i12 = i5;
                i13 = 16384;
                z3 = z;
            } else {
                aVar3.K(151385182);
                if (!((Boolean) c9.getValue()).booleanValue() || ((PostEditingReason) c12.getValue()).Ja()) {
                    obj = obj3;
                    aVar4 = aVar3;
                    i9 = i7;
                    i10 = i8;
                    i11 = 1;
                    i12 = i5;
                    i13 = 16384;
                    aVar4.K(i9);
                    aVar4.j();
                    z2 = z;
                } else {
                    aVar3.K(151446376);
                    androidx.compose.runtime.a aVar9 = aVar3;
                    int i29 = i7;
                    i12 = i5;
                    i10 = i8;
                    i11 = 1;
                    ncd0.a(fkq0.b((UserId) c7.getValue()), (PrivacyPostType) c8.getValue(), ((ActionsAvailabilityState) c10.getValue()).i, izsVar4, "PostingPrivacyButton", aVar9, i28 | 24576);
                    aVar4 = aVar9;
                    aVar4.j();
                    obj = obj3;
                    i13 = 16384;
                    i9 = i29;
                    z2 = true;
                }
                aVar4.j();
                s3q0 s3q0Var2 = s3q0.a;
                z3 = z2;
            }
            boolean z6 = z3;
            if (((Boolean) c2.getValue()).booleanValue()) {
                aVar4.K(151923187);
                f(i10, aVar4);
                boolean booleanValue2 = ((Boolean) c5.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) c4.getValue()).booleanValue();
                int i30 = a.$EnumSwitchMapping$0[((Onboarding) c3.getValue()).ordinal()];
                if (i30 == i11) {
                    onboardingType = OnboardingType.NONE;
                } else if (i30 == 2) {
                    onboardingType = OnboardingType.TITLE;
                } else {
                    if (i30 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onboardingType = OnboardingType.SUBTITLE;
                }
                int i31 = i12 == i13 ? 1 : i10;
                Object x4 = aVar4.x();
                if (i31 != 0 || x4 == obj) {
                    x4 = new f74(izsVar4, i10);
                    aVar4.R(x4);
                }
                gzs gzsVar2 = (gzs) x4;
                int i32 = i12 == i13 ? 1 : i10;
                Object x5 = aVar4.x();
                if (i32 != 0 || x5 == obj) {
                    x5 = new g74(izsVar4, i10);
                    aVar4.R(x5);
                }
                izs izsVar5 = (izs) x5;
                androidx.compose.runtime.a aVar10 = aVar4;
                i14 = i12;
                i16 = 1;
                i15 = i10;
                c3948a2 = c3948a;
                dcm0.a(null, "RepostToStorySwitcher", booleanValue2, onboardingType, booleanValue3, R.string.story_repost_toggle_subtitle_2, gzsVar2, izsVar5, aVar10, 48);
                aVar5 = aVar10;
            } else {
                int i33 = i12;
                aVar5 = aVar4;
                i14 = i33;
                c3948a2 = c3948a;
                i15 = i10;
                i16 = i11;
                aVar5.K(i9);
            }
            aVar5.j();
            if (z4 || !((Boolean) c14.getValue()).booleanValue()) {
                aVar5.K(i9);
            } else {
                aVar5.K(152886729);
                f(i15, aVar5);
                g((i6 >> 9) & 112, aVar5, (String) a7.getValue(), izsVar4);
            }
            aVar5.j();
            if (z4 || !((Boolean) c13.getValue()).booleanValue()) {
                i17 = i9;
                aVar5.K(i17);
                aVar5.j();
            } else {
                aVar5.K(153072171);
                wh50 a8 = jk50.a(c3948a2.E, aVar5, i15, 3);
                String N2 = d370.N(R.string.open_post_for_all, i15, aVar5);
                Date date2 = (Date) a8.getValue();
                if (date2 == null) {
                    aVar5.K(153311025);
                    aVar5.j();
                    a2 = null;
                } else {
                    aVar5.K(153311026);
                    a2 = gec0.a((Context) aVar5.r(AndroidCompositionLocals_androidKt.b), date2);
                    aVar5.j();
                }
                if (a2 == null) {
                    a2 = zq.a(aVar5, -964882126, R.string.never_open, aVar5, i15);
                } else {
                    aVar5.K(-964886249);
                    aVar5.j();
                }
                String str2 = a2;
                q630 E2 = ahn.E(aVar7, "PostingOpenForAllButton");
                int i34 = i14 == 16384 ? i16 : i15;
                Object x6 = aVar5.x();
                if (i34 != 0 || x6 == obj) {
                    x6 = new h74(izsVar4, 0);
                    aVar5.R(x6);
                }
                androidx.compose.runtime.a aVar11 = aVar5;
                qoc0.a(null, N2, E2, str2, null, null, null, null, (gzs) x6, null, 0, 0, aVar11, 390, 0, 3824);
                aVar5 = aVar11;
                aVar5.j();
                i17 = 145243555;
            }
            if (z6) {
                aVar5.K(153716258);
                i18 = 0;
                f(0, aVar5);
            } else {
                i18 = 0;
                aVar5.K(i17);
            }
            aVar5.j();
            if (((Boolean) c15.getValue()).booleanValue()) {
                aVar5.K(153787961);
                i19 = i14;
                androidx.compose.runtime.a aVar12 = aVar5;
                obj2 = obj;
                i20 = i18;
                d(i28, aVar12, (String) c17.getValue(), (String) c18.getValue(), izsVar4, ((Boolean) c16.getValue()).booleanValue());
                izsVar4 = izsVar4;
                f(i20, aVar12);
                aVar6 = aVar12;
            } else {
                i19 = i14;
                androidx.compose.runtime.a aVar13 = aVar5;
                i20 = i18;
                obj2 = obj;
                aVar13.K(145243555);
                aVar6 = aVar13;
            }
            aVar6.j();
            String N3 = d370.N(R.string.additional_settings_screen_menu_point, i20, aVar6);
            q630 E3 = ahn.E(aVar7, "PostingSettingsButton");
            int i35 = i19 == 16384 ? i16 : i20;
            Object x7 = aVar6.x();
            if (i35 != 0 || x7 == obj2) {
                x7 = new i74(izsVar4, i20);
                aVar6.R(x7);
            }
            Object obj4 = obj2;
            int i36 = i20;
            qoc0.a(null, N3, E3, null, null, null, null, null, (gzs) x7, null, 0, 0, aVar6, 390, 0, 3832);
            aVar6.G();
            rz50.a(c3948a2, izsVar4, aVar6, i25 | ((i6 >> 9) & 112));
            boolean z7 = (!((Boolean) c2.getValue()).booleanValue() || ((Onboarding) c3.getValue()) == Onboarding.NONE) ? i36 : i16;
            if (z4) {
                PrivacyViewState privacyViewState2 = (PrivacyViewState) a4.getValue();
                if ((privacyViewState2 != null ? privacyViewState2.e : i36) != 0) {
                    i21 = i16;
                    if (z7 == 0 || i21 != 0) {
                        aVar6.K(2055776815);
                        s3q0 s3q0Var3 = s3q0.a;
                        int i37 = (aVar6.J(x2) ? 1 : 0) | (aVar6.l(z7) ? 1 : 0);
                        if (i19 != 16384) {
                            i16 = i36;
                        }
                        i22 = i37 | i16;
                        x = aVar6.x();
                        if (i22 == 0 || x == obj4) {
                            x = new o74(x2, z7, izsVar4, null);
                            aVar6.R(x);
                        }
                        bap.g(s3q0Var3, (wzs) x, aVar6, 6);
                    } else {
                        aVar6.K(2046300921);
                    }
                    aVar6.j();
                    aVar2 = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                        aVar2 = aVar6;
                    }
                }
            }
            i21 = i36;
            if (z7 == 0) {
            }
            aVar6.K(2055776815);
            s3q0 s3q0Var32 = s3q0.a;
            int i372 = (aVar6.J(x2) ? 1 : 0) | (aVar6.l(z7) ? 1 : 0);
            if (i19 != 16384) {
            }
            i22 = i372 | i16;
            x = aVar6.x();
            if (i22 == 0) {
            }
            x = new o74(x2, z7, izsVar4, null);
            aVar6.R(x);
            bap.g(s3q0Var32, (wzs) x, aVar6, 6);
            aVar6.j();
            aVar2 = aVar6;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            c3948a2 = c3948a;
            androidx.compose.runtime.a aVar14 = M;
            aVar14.h();
            aVar2 = aVar14;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j74(tcc0Var, c3948a2, i, s890Var, izsVar4, izsVar2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final wpc0.a.C3948a c3948a, final int i, izs<? super PostingAction, s3q0> izsVar, final izs<? super izs<? super fmc0.u, s3q0>, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        final izs<? super PostingAction, s3q0> izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1890770918);
        if ((i2 & 6) == 0) {
            i3 = (M.J(c3948a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar2) ? 2048 : 1024;
        }
        int i6 = i3;
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1890770918, i6, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.AttachmentsAndTextSection (AttachmentPickersScreen.kt:290)");
            }
            wh50 c = jk50.c(c3948a.d, M);
            wh50 a2 = jk50.a(c3948a.h, M, 0, 3);
            wh50 a3 = jk50.a(c3948a.g, M, 0, 3);
            wh50 c2 = jk50.c(c3948a.i, M);
            wh50 c3 = jk50.c(c3948a.f, M);
            wh50 c4 = jk50.c(c3948a.n, M);
            if (((wow) c.getValue()).b.isEmpty() && ((PostingLinkDto) a2.getValue()) == null && ((PostingArticleDto) a3.getValue()) == null) {
                M.K(-552288132);
                M.j();
                i5 = -552288132;
            } else {
                M.K(-539030827);
                int i7 = i6 << 12;
                i5 = -552288132;
                r4c0.a(((wow) c.getValue()).b, (mdc0) c2.getValue(), (PhotoVideoAttachmentsCropData) c3.getValue(), i4, (PostingLinkDto) a2.getValue(), (PostingArticleDto) a3.getValue(), izsVar3, izsVar2, M, ((i6 << 6) & 7168) | (i7 & 3670016) | (i7 & 29360128));
                izsVar3 = izsVar3;
                M.j();
            }
            int length = ((String) c4.getValue()).length();
            q630.a aVar2 = q630.a.a;
            if (length > 0) {
                M.K(-538615055);
                g8c0.a((i6 >> 3) & 112, M, (String) c4.getValue(), izsVar3);
                if (((wow) c.getValue()).b.isEmpty() && ((PostingLinkDto) a2.getValue()) == null && ((PostingArticleDto) a3.getValue()) == null && ((String) c4.getValue()).length() <= 0) {
                    M.K(i5);
                } else {
                    M.K(-538482623);
                    float f = 0;
                    iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, s200.G(aVar2, f, f, f, (float) 0.5d));
                }
                M.j();
                M.j();
            } else {
                if (((wow) c.getValue()).b.isEmpty() || ((String) c4.getValue()).length() != 0) {
                    M.K(i5);
                } else {
                    M.K(-538177955);
                    f9t.e(txj0.h(txj0.f(aVar2, 1.0f), 4), M, 6);
                }
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
            s.d = new wzs() { // from class: xsna.c74
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    p74.c(wpc0.a.C3948a.this, i, izsVar3, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, String str, String str2, izs izsVar, boolean z) {
        int i2;
        String str3;
        androidx.compose.runtime.a M = aVar.M(-528270583);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= M.J(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-528270583, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.AuthorSignSwitch (AttachmentPickersScreen.kt:239)");
            }
            q630 E = ahn.E(q630.a.a, "SignAuthorSetting");
            String N = d370.N(R.string.additional_settings_author_title, 0, M);
            String O = d370.O(R.string.additional_settings_author_sign_suggest, new Object[]{d370.O(R.string.additional_settings_author_sign_sign_from, new Object[]{str, str2}, M)}, M);
            boolean z2 = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new d74(izsVar, 0);
                M.R(x);
            }
            zov0.b(z, N, (izs) x, E, O, false, false, M, (i2 & 14) | 3072, 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e74(i, str3, str2, izsVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(wpc0.a.C3948a c3948a, tcc0 tcc0Var, PostEditingReason postEditingReason, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-184633677);
        if ((i & 6) == 0) {
            i2 = (M.J(c3948a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_RV_LOAD_DURING_SHOW) != 1026)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-184633677, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CoauthorsSection (AttachmentPickersScreen.kt:264)");
            }
            wh50 a2 = jk50.a(c3948a.u, M, 0, 3);
            wh50 c = jk50.c(c3948a.v, M);
            wh50 a3 = jk50.a(c3948a.I, M, 0, 3);
            if (((Boolean) jk50.c(c3948a.N, M).getValue()).booleanValue()) {
                M.K(1431785851);
                f(0, M);
                wow wowVar = (wow) a2.getValue();
                czf.a(i2 & 7168, M, (String) a3.getValue(), wowVar != null ? wowVar.b : null, izsVar, ((Boolean) c.getValue()).booleanValue());
                f(0, M);
                M.j();
            } else {
                M.K(1432057814);
                f(0, M);
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
            s.d = new z64(c3948a, tcc0Var, postEditingReason, izsVar, i, 0);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(812319523);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(812319523, i, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.Divider (AttachmentPickersScreen.kt:398)");
            }
            float f = 16;
            float f2 = 8;
            iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, s200.G(q630.a.a, f, f2, f, f2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a74(i);
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String O;
        String str2;
        androidx.compose.runtime.a M = aVar.M(912899296);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(912899296, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.DonutTeaserCell (AttachmentPickersScreen.kt:209)");
            }
            gzs gzsVar = null;
            if (str == null) {
                M.K(450154937);
                M.j();
                O = null;
            } else {
                M.K(450154938);
                O = d370.O(R.string.post_teaser_custom_text_prefix, new Object[]{str}, M);
                M.j();
            }
            String N = d370.N(R.string.post_teaser, 0, M);
            if (O == null) {
                str2 = zq.a(M, 1122906676, R.string.post_teaser_by_default, M, 0);
            } else {
                M.K(1122906180);
                M.j();
                str2 = O;
            }
            String N2 = d370.N(R.string.post_teaser_remove_custom_text, 0, M);
            Object obj = a.C0011a.a;
            if (O != null) {
                M.K(450725741);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == obj) {
                    x = new k74(izsVar, 0);
                    M.R(x);
                }
                gzsVar = (gzs) x;
                M.j();
            } else {
                M.K(450814246);
                M.j();
            }
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            boolean J = M.J(O);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new l74(O, 0);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
            q630 E = ahn.E(q630.a.a, "PostingDonutTeaserText");
            boolean z2 = (i2 & 112) == 32;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new m74(izsVar, 0);
                M.R(x3);
            }
            aVar2 = M;
            qoc0.a(null, N, E, str2, N2, a2, null, null, (gzs) x3, gzsVar, 1, 2, aVar2, 390, 54, PsExtractor.AUDIO_STREAM);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n74(str, izsVar, i, 0);
        }
    }
}

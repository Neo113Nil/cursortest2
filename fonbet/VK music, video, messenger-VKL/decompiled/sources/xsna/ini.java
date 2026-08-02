package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.music.Playlist;
import com.vk.stat.scheme.SchemeStat$EventItem;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;
import xsna.y050;
import xsna.zph0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ini implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ini(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        int i2 = 2;
        Object obj4 = a.C0011a.a;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                wh50 wh50Var = (wh50) obj5;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(jjVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1028025966, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$570417342.<anonymous>.<anonymous> (VkAccentTabRow.kt:665)");
                    }
                    boolean z = ((Number) wh50Var.getValue()).intValue() == 0;
                    Object x = aVar.x();
                    if (x == obj4) {
                        x = new jni(0, wh50Var);
                        aVar.R(x);
                    }
                    int i3 = ((intValue << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    jjVar.b(z, (gzs) x, nni.m, null, aVar, i3, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar.x();
                    if (x2 == obj4) {
                        x2 = new kni(0, wh50Var);
                        aVar.R(x2);
                    }
                    jjVar.b(z2, (gzs) x2, nni.n, null, aVar, i3, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x3 = aVar.x();
                    if (x3 == obj4) {
                        x3 = new lni(0, wh50Var);
                        aVar.R(x3);
                    }
                    jjVar.b(z3, (gzs) x3, nni.o, null, aVar, i3, 8);
                    boolean z4 = ((Number) wh50Var.getValue()).intValue() == 3;
                    Object x4 = aVar.x();
                    if (x4 == obj4) {
                        x4 = new mni(0, wh50Var);
                        aVar.R(x4);
                    }
                    jjVar.b(z4, (gzs) x4, nni.p, null, aVar, i3, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                axq axqVar = (axq) obj5;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(684163391, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:79)");
                    }
                    axqVar.j("Текст без анимации", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                v0r v0rVar = (v0r) obj5;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-423962046, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:152)");
                    }
                    v0rVar.n("аватар + вложение", aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                m8d0 m8d0Var = (m8d0) obj5;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1129510983, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.ItemsInCartBtn.<anonymous> (PrimaryBlockGoodsHeaderRightActionsImpl.kt:192)");
                }
                Integer num = (Integer) ((zak0) m8d0Var.a).getValue();
                int intValue5 = num != null ? num.intValue() : 0;
                boolean J = aVar4.J(m8d0Var);
                Object x5 = aVar4.x();
                if (J || x5 == obj4) {
                    x5 = new f550(m8d0Var, 17);
                    aVar4.R(x5);
                }
                m8d0Var.c(null, intValue5, (gzs) x5, (SemanticsConfiguration) ((zak0) m8d0Var.j).getValue(), aVar4, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 4:
                izs izsVar = (izs) obj5;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue6 & 1, (intValue6 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1750310832, intValue6, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.ItemsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDatabaseViewContent.kt:239)");
                    }
                    Boolean bool = Boolean.TRUE;
                    boolean J2 = aVar5.J(izsVar);
                    Object x6 = aVar5.x();
                    if (J2 || x6 == obj4) {
                        x6 = new zph0.d(izsVar, null);
                        aVar5.R(x6);
                    }
                    bap.g(bool, (wzs) x6, aVar5, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                huh0 huh0Var = (huh0) obj5;
                Context context = (Context) obj;
                UIBlockSearchHistory.UIBlockSearchHistoryPlaylist uIBlockSearchHistoryPlaylist = (UIBlockSearchHistory.UIBlockSearchHistoryPlaylist) obj2;
                SearchStatInfoProvider searchStatInfoProvider = (SearchStatInfoProvider) obj3;
                Playlist playlist = uIBlockSearchHistoryPlaylist.A;
                ((fl4) huh0Var.b.getValue()).U().a(context, new y050.b.a(playlist, uIBlockSearchHistoryPlaylist.f, uIBlockSearchHistoryPlaylist.b, searchStatInfoProvider.b(playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST, playlist.F, false), uIBlockSearchHistoryPlaylist.p.h()));
                return s3q0.a;
            case 6:
                String str = (String) obj5;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue7 & 1, (intValue7 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-929149933, intValue7, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:173)");
                    }
                    djo0.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar6, 0, 0, 131070);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                final TopBar$Middle.Cell.Middle.Text.Title title = (TopBar$Middle.Cell.Middle.Text.Title) obj5;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                aVar7.K(847944853);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(847944853, intValue8, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.overflowFade.<anonymous> (TopBar.kt:1328)");
                }
                Object x7 = aVar7.x();
                if (x7 == obj4) {
                    x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar7.R(x7);
                }
                final wh50 wh50Var2 = (wh50) x7;
                float f = m7p0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-886592342, 6, -1, "com.vk.core.compose.component.defaults.TopBarDefaults.Companion.<get-titleOverflowFadeGradient> (VkTopBarDefaults.kt:126)");
                }
                final ue2 a = dxu0.a(GradientDrawable.Orientation.LEFT_RIGHT, aVar7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                final float f2 = m7p0.d;
                boolean J3 = aVar7.J(title) | aVar7.J(a);
                Object x8 = aVar7.x();
                if (J3 || x8 == obj4) {
                    x8 = new izs(title, a, f2, wh50Var2) { // from class: xsna.b7p0
                        public final /* synthetic */ ue2 b;
                        public final /* synthetic */ float c;
                        public final /* synthetic */ wh50 d;

                        {
                            this.b = a;
                            this.c = f2;
                            this.d = wh50Var2;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj6) {
                            ggj ggjVar = (ggj) obj6;
                            if (((Boolean) this.d.getValue()).booleanValue()) {
                                yq9 a2 = ggjVar.a0().a();
                                float I0 = ggjVar.I0(this.c);
                                long a3 = mxj0.a(ggjVar.d(), I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                va2 va2Var = new va2();
                                va2 va2Var2 = new va2();
                                this.b.a(1.0f, a3, va2Var2);
                                va2Var2.i(8);
                                try {
                                    a2.r(p490.e(0L, ggjVar.d()), va2Var);
                                    ggjVar.s1();
                                    try {
                                        a2.e();
                                        a2.p(Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        a2.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0, Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)), va2Var2);
                                        a2.a();
                                        a2.a();
                                    } finally {
                                        a2.a();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } else {
                                ggjVar.s1();
                            }
                            return s3q0.a;
                        }
                    };
                    aVar7.R(x8);
                }
                q630 f3 = bu00.f(q630.a.a, (izs) x8);
                Object x9 = aVar7.x();
                if (x9 == obj4) {
                    x9 = new m0r(wh50Var2, i2);
                    aVar7.R(x9);
                }
                q630 i4 = dd80.i(f3, (yzs) x9);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return i4;
        }
    }
}

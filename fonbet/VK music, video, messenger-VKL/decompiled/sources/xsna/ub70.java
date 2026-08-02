package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.ha70;
import xsna.kb70;
import xsna.q630;
import xsna.tlo0;
import xsna.ub70;
import xsna.z06;

/* compiled from: NotificationList.kt */
/* loaded from: classes4.dex */
public final class ub70 {

    /* compiled from: NotificationList.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.view.common.NotificationListKt$NotificationList$1$1", f = "NotificationList.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<Boolean> $isScrollOnTop$delegate;
        final /* synthetic */ izs<Boolean, s3q0> $onScrollOnTopChanged;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, izs izsVar, mtk0 mtk0Var) {
            super(2, spjVar);
            this.$onScrollOnTopChanged = izsVar;
            this.$isScrollOnTop$delegate = mtk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(spjVar, this.$onScrollOnTopChanged, this.$isScrollOnTop$delegate);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            izs<Boolean, s3q0> izsVar = this.$onScrollOnTopChanged;
            Boolean value = this.$isScrollOnTop$delegate.getValue();
            value.booleanValue();
            izsVar.invoke(value);
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public b(t810 t810Var, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((kb70) this.b.b.get(num.intValue())).getKey();
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public c(xpt xptVar, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((kb70) this.b.b.get(num.intValue())).getClass();
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ izs d;

        public d(wow wowVar, izs izsVar, izs izsVar2) {
            this.b = wowVar;
            this.c = izsVar;
            this.d = izsVar2;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                kb70 kb70Var = (kb70) this.b.b.get(intValue);
                aVar2.K(-2116979803);
                ub70.d(ksyVar2, kb70Var, this.c, this.d, aVar2, i & 14);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-967815759);
        int i3 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-967815759, i3, -1, "com.vk.notifications.list.impl.presentation.base.view.common.MilkshakeNotificationBanner (NotificationList.kt:223)");
            }
            xl20 a2 = d16.b.a(d370.N(R.string.push_disabled_notifications_list_banner_title, 0, M), d370.N(R.string.push_disabled_notifications_list_banner_subtitle, 0, M), null, d16.a.C2697a.a(ButtonStyle.Link, ButtonAppearance.Accent, null, str, null, null, null, null, null, null, null, null, gzsVar2, M, ((i3 << 9) & 7168) | 54, ((i3 << 3) & 7168) | 24576, 8180), null, null, null, null, M, 100663296, 244);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-582295998, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-NotificationCircleFillGray28> (VkIcons.kt:8188)");
            } else {
                i2 = 0;
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_notification_circle_fill_gray_28, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            beu0.a(a2, s200.E(q630.a.a, 16, 8), null, null, null, null, null, a16.a(a3, 0L, 0L, null, M, 14), z06.b.a.a(gzsVar, d370.N(R.string.push_notifications_banner_close_button, i2, M), null, null, null, null, M, ((i3 >> 3) & 14) | 1572864, 60), null, null, null, M, 48, 0, 3708);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new s2(i, 2, str, gzsVar, gzsVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(izs<? super ha70, s3q0> izsVar, final izs<? super ha70, s3q0> izsVar2, final izs<? super ha70, s3q0> izsVar3, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-470888898);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.y(izsVar2) ? 32 : 16) | (M.y(izsVar3) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-470888898, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationBanner (NotificationList.kt:177)");
            }
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            final Activity h = e3m.h(context);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.valueOf(e(h)));
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            String a2 = ((Boolean) wh50Var.getValue()).booleanValue() ? zq.a(M, -1552649179, R.string.push_disabled_notifications_list_banner_button, M, 0) : zq.a(M, -1552646430, R.string.push_disabled_notifications_list_banner_button_to_settings, M, 0);
            boolean y = ((i2 & 112) == 32) | ((i2 & 896) == 256) | M.y(h) | M.y(context);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                gzs gzsVar = new gzs() { // from class: xsna.tb70
                    @Override // xsna.gzs
                    public final Object invoke() {
                        Activity activity = h;
                        if (ub70.e(activity)) {
                            wx0 wx0Var = new wx0(16, activity, wh50Var);
                            u2 u2Var = new u2(izsVar3, 3);
                            PermissionHelper permissionHelper = PermissionHelper.a;
                            permissionHelper.getClass();
                            PermissionHelper.l(permissionHelper, context, PermissionHelper.b, u2Var, new eqq(wx0Var, 26), 4);
                        } else {
                            izsVar2.invoke(ha70.z.a);
                        }
                        return s3q0.a;
                    }
                };
                M.R(gzsVar);
                x2 = gzsVar;
            }
            gzs gzsVar2 = (gzs) x2;
            M.K(-886524996);
            boolean z = (i2 & 14) == 4;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new nse(izsVar, 6);
                M.R(x3);
            }
            a(a2, (gzs) x3, gzsVar2, M, 0);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fx((izs) izsVar, (izs) izsVar2, (izs) izsVar3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final List list, final izs izsVar, final izs izsVar2, final izs izsVar3, final gzs gzsVar, final q630 q630Var, boolean z, xvy xvyVar, izs izsVar4, izs izsVar5, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        izs izsVar6;
        izs izsVar7;
        boolean z2;
        int i4;
        xvy xvyVar2;
        int i5;
        int i6;
        izs izsVar8;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final xvy xvyVar3;
        final izs izsVar9;
        final izs izsVar10;
        androidx.compose.runtime.f s;
        boolean z3;
        androidx.compose.runtime.a aVar3;
        xvy xvyVar4;
        izs izsVar11;
        int i11;
        izs izsVar12;
        boolean z4;
        izs izsVar13;
        boolean z5;
        boolean z6;
        Object x;
        boolean z7;
        Object x2;
        final boolean z8;
        final izs izsVar14;
        androidx.compose.runtime.a M = aVar.M(774176388);
        if ((i & 6) == 0) {
            i3 = (M.J(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            izsVar6 = izsVar;
            i3 |= M.y(izsVar6) ? 32 : 16;
        } else {
            izsVar6 = izsVar;
        }
        if ((i & 384) == 0) {
            izsVar7 = izsVar2;
            i3 |= M.y(izsVar7) ? 256 : 128;
        } else {
            izsVar7 = izsVar2;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i4 = i3 | 1572864;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if ((i2 & 128) == 0) {
            xvyVar2 = xvyVar;
            if (M.J(xvyVar2)) {
                i5 = 8388608;
                int i13 = i4 | i5;
                i6 = i2 & 256;
                if (i6 == 0) {
                    i7 = i13 | 100663296;
                    izsVar8 = izsVar4;
                } else {
                    izsVar8 = izsVar4;
                    i7 = i13 | (M.y(izsVar8) ? 67108864 : 33554432);
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                    i9 = i7 | 805306368;
                } else {
                    i9 = i7 | (M.y(izsVar5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
                }
                i10 = i9;
                if (M.t(i10 & 1, (i9 & 306783379) == 306783378)) {
                    aVar2 = M;
                    aVar2.h();
                    xvyVar3 = xvyVar;
                    izsVar9 = izsVar5;
                    izsVar10 = izsVar8;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        z3 = i12 != 0 ? false : z2;
                        if ((i2 & 128) != 0) {
                            xvy z9 = crx0.z(true, gzsVar, 0, M, ((i10 >> 9) & 112) | 6, 60);
                            aVar3 = M;
                            i10 &= -29360129;
                            xvyVar4 = z9;
                        } else {
                            aVar3 = M;
                            xvyVar4 = xvyVar;
                        }
                        if (i6 != 0) {
                            izsVar8 = null;
                        }
                        izsVar11 = izsVar8;
                        i11 = i10;
                        if (i8 != 0) {
                            izsVar12 = null;
                            aVar3.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(774176388, i11, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationList (NotificationList.kt:70)");
                            }
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (izsVar11 == null) {
                                aVar3.K(-484933739);
                                Object x3 = aVar3.x();
                                if (x3 == c0012a) {
                                    x3 = bbk0.b(new mk(16, xvyVar4, list));
                                    aVar3.R(x3);
                                }
                                mtk0 mtk0Var = (mtk0) x3;
                                Boolean bool = (Boolean) mtk0Var.getValue();
                                bool.getClass();
                                z4 = z3;
                                izsVar13 = izsVar12;
                                boolean z10 = (i11 & 234881024) == 67108864;
                                Object x4 = aVar3.x();
                                if (z10 || x4 == c0012a) {
                                    x4 = new a(null, izsVar11, mtk0Var);
                                    aVar3.R(x4);
                                }
                                z5 = false;
                                bap.g(bool, (wzs) x4, aVar3, 0);
                            } else {
                                z4 = z3;
                                izsVar13 = izsVar12;
                                z5 = false;
                                aVar3.K(-488387170);
                            }
                            aVar3.j();
                            z6 = (i11 & 7168) != 2048 ? true : z5;
                            x = aVar3.x();
                            if (!z6 || x == c0012a) {
                                x = new lyg(izsVar3, 2);
                                aVar3.R(x);
                            }
                            u770.a(xvyVar4, list, (izs) x, aVar3, ((i11 >> 21) & 14) | ((i11 << 3) & 112));
                            q630 d2 = txj0.d(q630Var, 1.0f);
                            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 5);
                            z7 = ((i11 & 14) != 4) | ((3670016 & i11) != 1048576) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((1879048192 & i11) == 536870912);
                            x2 = aVar3.x();
                            if (!z7 || x2 == c0012a) {
                                z8 = z4;
                                izsVar14 = izsVar13;
                                final izs izsVar15 = izsVar6;
                                final izs izsVar16 = izsVar7;
                                izs izsVar17 = new izs() { // from class: xsna.rb70
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        nvy nvyVar = (nvy) obj;
                                        List list2 = list;
                                        boolean z11 = j5g.k0(new wow(list2)) instanceof kb70.b;
                                        izs izsVar18 = izsVar15;
                                        if (!z11 && z8) {
                                            nvy.g(nvyVar, null, null, new jai(328525652, new nrv(izsVar18, 2), true), 3);
                                        }
                                        wow wowVar = new wow(list2);
                                        nvyVar.e(list2.size(), new ub70.b(new t810(7), wowVar), new ub70.c(new xpt(12), wowVar), new jai(802480018, new ub70.d(wowVar, izsVar18, izsVar16), true));
                                        izs izsVar19 = izsVar14;
                                        if (izsVar19 != null) {
                                            izsVar19.invoke(nvyVar);
                                        }
                                        return s3q0.a;
                                    }
                                };
                                aVar3.R(izsVar17);
                                x2 = izsVar17;
                            } else {
                                z8 = z4;
                                izsVar14 = izsVar13;
                            }
                            aVar2 = aVar3;
                            xvy xvyVar5 = xvyVar4;
                            lqy.a(d2, xvyVar5, n, null, null, null, false, null, (izs) x2, aVar2, (i11 >> 18) & 112, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            izsVar10 = izsVar11;
                            xvyVar3 = xvyVar5;
                            z2 = z8;
                            izsVar9 = izsVar14;
                        }
                        izsVar12 = izsVar5;
                        aVar3.S();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (izsVar11 == null) {
                        }
                        aVar3.j();
                        if ((i11 & 7168) != 2048) {
                        }
                        x = aVar3.x();
                        if (!z6) {
                        }
                        x = new lyg(izsVar3, 2);
                        aVar3.R(x);
                        u770.a(xvyVar4, list, (izs) x, aVar3, ((i11 >> 21) & 14) | ((i11 << 3) & 112));
                        q630 d22 = txj0.d(q630Var, 1.0f);
                        u890 n2 = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 5);
                        z7 = ((i11 & 14) != 4) | ((3670016 & i11) != 1048576) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((1879048192 & i11) == 536870912);
                        x2 = aVar3.x();
                        if (z7) {
                        }
                        z8 = z4;
                        izsVar14 = izsVar13;
                        final izs izsVar152 = izsVar6;
                        final izs izsVar162 = izsVar7;
                        izs izsVar172 = new izs() { // from class: xsna.rb70
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                nvy nvyVar = (nvy) obj;
                                List list2 = list;
                                boolean z11 = j5g.k0(new wow(list2)) instanceof kb70.b;
                                izs izsVar18 = izsVar152;
                                if (!z11 && z8) {
                                    nvy.g(nvyVar, null, null, new jai(328525652, new nrv(izsVar18, 2), true), 3);
                                }
                                wow wowVar = new wow(list2);
                                nvyVar.e(list2.size(), new ub70.b(new t810(7), wowVar), new ub70.c(new xpt(12), wowVar), new jai(802480018, new ub70.d(wowVar, izsVar18, izsVar162), true));
                                izs izsVar19 = izsVar14;
                                if (izsVar19 != null) {
                                    izsVar19.invoke(nvyVar);
                                }
                                return s3q0.a;
                            }
                        };
                        aVar3.R(izsVar172);
                        x2 = izsVar172;
                        aVar2 = aVar3;
                        xvy xvyVar52 = xvyVar4;
                        lqy.a(d22, xvyVar52, n2, null, null, null, false, null, (izs) x2, aVar2, (i11 >> 18) & 112, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        izsVar10 = izsVar11;
                        xvyVar3 = xvyVar52;
                        z2 = z8;
                        izsVar9 = izsVar14;
                    } else {
                        M.h();
                        if ((i2 & 128) != 0) {
                            i11 = i10 & (-29360129);
                            z3 = z2;
                            aVar3 = M;
                            izsVar11 = izsVar8;
                            xvyVar4 = xvyVar2;
                            izsVar12 = izsVar5;
                            aVar3.S();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            a.C0011a.C0012a c0012a22 = a.C0011a.a;
                            if (izsVar11 == null) {
                            }
                            aVar3.j();
                            if ((i11 & 7168) != 2048) {
                            }
                            x = aVar3.x();
                            if (!z6) {
                            }
                            x = new lyg(izsVar3, 2);
                            aVar3.R(x);
                            u770.a(xvyVar4, list, (izs) x, aVar3, ((i11 >> 21) & 14) | ((i11 << 3) & 112));
                            q630 d222 = txj0.d(q630Var, 1.0f);
                            u890 n22 = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 5);
                            z7 = ((i11 & 14) != 4) | ((3670016 & i11) != 1048576) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((1879048192 & i11) == 536870912);
                            x2 = aVar3.x();
                            if (z7) {
                            }
                            z8 = z4;
                            izsVar14 = izsVar13;
                            final izs izsVar1522 = izsVar6;
                            final izs izsVar1622 = izsVar7;
                            izs izsVar1722 = new izs() { // from class: xsna.rb70
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    nvy nvyVar = (nvy) obj;
                                    List list2 = list;
                                    boolean z11 = j5g.k0(new wow(list2)) instanceof kb70.b;
                                    izs izsVar18 = izsVar1522;
                                    if (!z11 && z8) {
                                        nvy.g(nvyVar, null, null, new jai(328525652, new nrv(izsVar18, 2), true), 3);
                                    }
                                    wow wowVar = new wow(list2);
                                    nvyVar.e(list2.size(), new ub70.b(new t810(7), wowVar), new ub70.c(new xpt(12), wowVar), new jai(802480018, new ub70.d(wowVar, izsVar18, izsVar1622), true));
                                    izs izsVar19 = izsVar14;
                                    if (izsVar19 != null) {
                                        izsVar19.invoke(nvyVar);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(izsVar1722);
                            x2 = izsVar1722;
                            aVar2 = aVar3;
                            xvy xvyVar522 = xvyVar4;
                            lqy.a(d222, xvyVar522, n22, null, null, null, false, null, (izs) x2, aVar2, (i11 >> 18) & 112, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            izsVar10 = izsVar11;
                            xvyVar3 = xvyVar522;
                            z2 = z8;
                            izsVar9 = izsVar14;
                        } else {
                            izsVar11 = izsVar8;
                            xvyVar4 = xvyVar2;
                            z3 = z2;
                            izsVar12 = izsVar5;
                            aVar3 = M;
                            i11 = i10;
                            aVar3.S();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            a.C0011a.C0012a c0012a222 = a.C0011a.a;
                            if (izsVar11 == null) {
                            }
                            aVar3.j();
                            if ((i11 & 7168) != 2048) {
                            }
                            x = aVar3.x();
                            if (!z6) {
                            }
                            x = new lyg(izsVar3, 2);
                            aVar3.R(x);
                            u770.a(xvyVar4, list, (izs) x, aVar3, ((i11 >> 21) & 14) | ((i11 << 3) & 112));
                            q630 d2222 = txj0.d(q630Var, 1.0f);
                            u890 n222 = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 5);
                            z7 = ((i11 & 14) != 4) | ((3670016 & i11) != 1048576) | ((i11 & 112) != 32) | ((i11 & 896) != 256) | ((1879048192 & i11) == 536870912);
                            x2 = aVar3.x();
                            if (z7) {
                            }
                            z8 = z4;
                            izsVar14 = izsVar13;
                            final izs izsVar15222 = izsVar6;
                            final izs izsVar16222 = izsVar7;
                            izs izsVar17222 = new izs() { // from class: xsna.rb70
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    nvy nvyVar = (nvy) obj;
                                    List list2 = list;
                                    boolean z11 = j5g.k0(new wow(list2)) instanceof kb70.b;
                                    izs izsVar18 = izsVar15222;
                                    if (!z11 && z8) {
                                        nvy.g(nvyVar, null, null, new jai(328525652, new nrv(izsVar18, 2), true), 3);
                                    }
                                    wow wowVar = new wow(list2);
                                    nvyVar.e(list2.size(), new ub70.b(new t810(7), wowVar), new ub70.c(new xpt(12), wowVar), new jai(802480018, new ub70.d(wowVar, izsVar18, izsVar16222), true));
                                    izs izsVar19 = izsVar14;
                                    if (izsVar19 != null) {
                                        izsVar19.invoke(nvyVar);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(izsVar17222);
                            x2 = izsVar17222;
                            aVar2 = aVar3;
                            xvy xvyVar5222 = xvyVar4;
                            lqy.a(d2222, xvyVar5222, n222, null, null, null, false, null, (izs) x2, aVar2, (i11 >> 18) & 112, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            izsVar10 = izsVar11;
                            xvyVar3 = xvyVar5222;
                            z2 = z8;
                            izsVar9 = izsVar14;
                        }
                    }
                }
                s = aVar2.s();
                if (s == null) {
                    final boolean z11 = z2;
                    s.d = new wzs() { // from class: xsna.sb70
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ub70.c(list, izsVar, izsVar2, izsVar3, gzsVar, q630Var, z11, xvyVar3, izsVar10, izsVar9, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            xvyVar2 = xvyVar;
        }
        i5 = 4194304;
        int i132 = i4 | i5;
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        i10 = i9;
        if (M.t(i10 & 1, (i9 & 306783379) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void d(ksy ksyVar, kb70 kb70Var, izs<? super snv, s3q0> izsVar, izs<? super String, s3q0> izsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2139585982);
        if ((i & 6) == 0) {
            i2 = (M.J(ksyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(kb70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2139585982, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationListItemContent (NotificationList.kt:126)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (kb70Var instanceof kb70.c) {
                M.K(-1147195910);
                M.K(-1147193337);
                gjs.a((kb70.c) kb70Var, izsVar, M, (i2 >> 3) & 112);
                M.j();
                M.j();
            } else {
                boolean z = kb70Var instanceof kb70.d;
                q630.a aVar2 = q630.a.a;
                if (z) {
                    M.K(-1203159442);
                    kb70.d dVar = (kb70.d) kb70Var;
                    boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
                    Object x = M.x();
                    if (z2 || x == a.C0011a.a) {
                        x = new s62(izsVar, izsVar2, kb70Var, 5);
                        M.R(x);
                    }
                    ma70.a(dVar, (izs) x, aVar2, M, 384);
                    M.j();
                } else if (kb70Var instanceof kb70.a) {
                    M.K(-1147181926);
                    M.K(-1202881155);
                    ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, s200.E(aVar2, 16, 8), M, 438, 0);
                    M.j();
                    M.j();
                } else if (kb70Var instanceof kb70.e) {
                    M.K(-1202599458);
                    String obj = ((kb70.e) kb70Var).a.a(context).toString();
                    float f = 16;
                    q630 E = ahn.E(s200.G(aVar2, f, 7, f, 9), "NotificationListTitleItem");
                    M.K(-1147160371);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.M;
                    M.j();
                    M.K(-1147156663);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    M.j();
                    yqv0.c(obj, E, j, null, null, 0, 1, null, 0, false, 0, 1, null, frv0Var, M, 0, 48, 6072);
                    M = M;
                    M.j();
                } else {
                    if (!(kb70Var instanceof kb70.b)) {
                        throw alb0.c(-1147196768, M);
                    }
                    M.K(-1202004692);
                    q630 b2 = ksyVar.b(aVar2);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c2 = qri.c(M, b2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    bgp.a(tlo0.b.a(((kb70.b) kb70Var).a, context).toString(), M, 0);
                    M.G();
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gw9(ksyVar, kb70Var, izsVar, izsVar2, i);
        }
    }

    public static final boolean e(Activity activity) {
        return (activity == null || !gz80.a(33) || activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) ? false : true;
    }
}

package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.kb70;
import xsna.la70;
import xsna.me70;
import xsna.phw;
import xsna.q630;
import xsna.tlo0;

/* compiled from: NotificationSettingList.kt */
/* loaded from: classes5.dex */
public final class ue70 {

    /* compiled from: NotificationSettingList.kt */
    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        /* compiled from: NotificationSettingList.kt */
        @b6l(c = "com.vk.settings.impl.presentation.base.view.NotificationSettingListKt$NotificationHintContent$1$1$1", f = "NotificationSettingList.kt", l = {170}, m = "invokeSuspend")
        /* renamed from: xsna.ue70$a$a, reason: collision with other inner class name */
        public static final class C3799a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public C3799a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3799a c3799a = new C3799a(2, spjVar);
                c3799a.L$0 = obj;
                return c3799a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3799a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0039 A[LOOP:0: B:6:0x0033->B:8:0x0039, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0026 -> B:5:0x0029). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = r4.L$0
                    xsna.eu5 r0 = (xsna.eu5) r0
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r4.label
                    r3 = 1
                    if (r2 == 0) goto L19
                    if (r2 != r3) goto L11
                    kotlin.a.a(r5)
                    goto L29
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.a.a(r5)
                L1c:
                    androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r4.L$0 = r0
                    r4.label = r3
                    java.lang.Object r5 = r0.I1(r5, r4)
                    if (r5 != r1) goto L29
                    return r1
                L29:
                    xsna.plb0 r5 = (xsna.plb0) r5
                    java.util.List<xsna.xlb0> r5 = r5.a
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Iterator r5 = r5.iterator()
                L33:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L1c
                    java.lang.Object r2 = r5.next()
                    xsna.xlb0 r2 = (xsna.xlb0) r2
                    r2.a()
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: xsna.ue70.a.C3799a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object Z0 = dmb0Var.Z0(new C3799a(2, null), spjVar);
            return Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? Z0 : s3q0.a;
        }
    }

    public static final void a(me70.c cVar, izs<? super le70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String str;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar.M(973796236);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(973796236, i2, -1, "com.vk.settings.impl.presentation.base.view.ManagedCommunityItemContent (NotificationSettingList.kt:209)");
            }
            Image image = cVar.d;
            if (image == null || (Cb = image.Cb(iah0.a(48), true, false)) == null || (str = Cb.d.d) == null) {
                str = "";
            }
            boolean z = false;
            phw a2 = phw.a.a(fwu0.l(str, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
            M.K(-484673244);
            com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(a2, Cell$Left.Main.Size.Small, null, null, null, null, null, M, 100663344, 252);
            M.j();
            M.K(-2139638121);
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(cVar.c, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.j();
            boolean z2 = cVar.e;
            plg0 plg0Var = new plg0(2);
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z4 = z3 | z;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                x = new u6(24, izsVar, cVar);
                M.R(x);
            }
            q630 a4 = d1p0.a(q630.a.a, z2, false, plg0Var, (izs) x, 10);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new z7w(12);
                M.R(x2);
            }
            wiu0.b(egi0.b(a4, true, (izs) x2), false, a3, Cell$Middle.a.a(Cell$Middle.d.b.a(cVar.b, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), b, null, null, M, 196608, 28), com.vk.core.compose.component.cell.content.n.a(cVar.e, null, false, null, M, 24576, 14), null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zw5(cVar, izsVar, i, 6);
        }
    }

    public static final void b(me70.d dVar, izs<? super le70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        String str;
        int i2;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar.M(1040513722);
        int i3 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040513722, i3, -1, "com.vk.settings.impl.presentation.base.view.NewPostsItemContent (NotificationSettingList.kt:245)");
            }
            Image image = dVar.c;
            if (image == null || (Cb = image.Cb(iah0.a(48), true, false)) == null || (str = Cb.d.d) == null) {
                str = "";
            }
            phw a2 = phw.a.a(fwu0.l(str, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
            M.K(1165748454);
            int i4 = 1;
            com.vk.core.compose.component.cell.content.t a3 = com.vk.core.compose.component.cell.content.e.a(a2, Cell$Left.Main.Size.Small, null, null, null, null, null, M, 100663344, 252);
            M.j();
            int i5 = i3 & 112;
            int i6 = i3 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.catalog2.common.ui.holders.a(21, izsVar, dVar);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(dVar.b, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            M.K(-793663038);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            } else {
                i2 = 0;
            }
            lg90 b = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            M.K(-793659481);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            M.j();
            String N = d370.N(R.string.accessibility_delete, i2, M);
            int i7 = i5 == 32 ? 1 : i2;
            if (i6 != 4) {
                i4 = i2;
            }
            int i8 = i7 | i4;
            Object x2 = M.x();
            if (i8 != 0 || x2 == c0012a) {
                x2 = new com.vk.catalog2.common.ui.holders.b(19, izsVar, dVar);
                M.R(x2);
            }
            wiu0.b(c, false, a3, a4, com.vk.core.compose.component.cell.content.p.a(b, j, 0L, N, (gzs) x2, null, M, 1572872, 36), null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hz7(dVar, izsVar, i, 5);
        }
    }

    public static final void c(me70.f fVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-628920113);
        int i2 = (M.J(fVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-628920113, i2, -1, "com.vk.settings.impl.presentation.base.view.NotificationHintContent (NotificationSettingList.kt:157)");
            }
            tlo0.Companion.getClass();
            de70 de70Var = new de70(tlo0.c.a, -1, false, new la70.a());
            s3q0 s3q0Var = s3q0.a;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = a.a;
                M.R(x);
            }
            q630 b = skn0.b(q630.a.a, s3q0Var, (PointerInputEventHandler) x);
            kb70.d a2 = kb70.d.a(fVar.a, Collections.singletonList(de70Var), null, null, 3967);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new viu(10);
                M.R(x2);
            }
            ma70.a(a2, (izs) x2, b, M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new te1(fVar, i, 6);
        }
    }

    public static final void d(me70.g gVar, izs<? super le70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-47092775);
        int i2 = (M.J(gVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-47092775, i2, -1, "com.vk.settings.impl.presentation.base.view.NotificationPushSettingStatusToggleContent (NotificationSettingList.kt:183)");
            }
            boolean z = gVar.a;
            boolean z2 = gVar.b;
            plg0 plg0Var = new plg0(2);
            boolean z3 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new g74(izsVar, 5);
                M.R(x);
            }
            q630 a2 = d1p0.a(q630.a.a, z, z2, plg0Var, (izs) x, 8);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new hyu(10);
                M.R(x2);
            }
            wiu0.b(egi0.b(a2, true, (izs) x2), gVar.b, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.notification_status_toggle_send_push, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), com.vk.core.compose.component.cell.content.n.a(gVar.a, null, gVar.b, null, M, 24576, 10), null, null, M, 0, 100);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ke4(gVar, izsVar, i, 5);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1875506965);
        int i2 = i | (M.y(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1875506965, i2, -1, "com.vk.settings.impl.presentation.base.view.NotificationSettingList (NotificationSettingList.kt:53)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7);
            boolean y = M.y(list) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new lx60(2, list, izsVar);
                M.R(x);
            }
            x1v0.a(d, null, n, null, null, null, false, null, (izs) x, M, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new opq(i, 4, list, izsVar, q630Var);
        }
    }
}

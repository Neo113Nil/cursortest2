package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zzor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.fave.dto.FaveGetExtendedItemTypeDto;
import com.vk.api.generated.fave.dto.FaveGetPagesTypeDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.masks.Mask;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.log.L;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CommunityAddDescriptionView.kt */
/* loaded from: classes5.dex */
public final class fdi implements reg0, q701, gn60, yg10 {
    public static final jai b = new jai(815330854, new m35(1), false);
    public static final fdi c = new fdi();
    public static final fdi d = new fdi();
    public static final /* synthetic */ fdi e = new fdi();
    public static aa2 f;
    public static d52 g;
    public static er9 h;

    public static final boolean A(rl50 rl50Var) {
        if (!(rl50Var instanceof xti)) {
            return rl50Var instanceof h7f0;
        }
        Iterable iterable = ((xti) rl50Var).c;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (A((rl50) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void B(String str) {
        L.e("FcmErrorLogger", str);
    }

    public static double[] C(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d7, d8, (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static final void D(View view, HapticHelper hapticHelper) {
        if (hapticHelper == HapticHelper.SUCCESS && gz80.a(30)) {
            view.performHapticFeedback(hapticHelper.h());
        } else if (hapticHelper == HapticHelper.LIGHT && gz80.a(34)) {
            view.performHapticFeedback(hapticHelper.h());
        } else {
            view.performHapticFeedback(HapticHelper.RIGID.h());
        }
    }

    public static final long E(xlb0 xlb0Var, boolean z) {
        long e2 = ov70.e(xlb0Var.c, xlb0Var.g);
        if (z || !xlb0Var.c()) {
            return e2;
        }
        return 0L;
    }

    public static final gxn F(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(432465476, 0, -1, "com.vk.donut.price.core.template.compose.provider.style.rememberDonutBannerPriceItemStyleProvider (DonutBannerItemStyleProvider.kt:61)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        iyk0 iyk0Var = rrv0.a;
        ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        boolean z = !ylu0Var2.s();
        boolean l = aVar.l(false) | aVar.J(ylu0Var) | aVar.l(z);
        Object x = aVar.x();
        if (l || x == a.C0011a.a) {
            x = new gxn(ylu0Var, z);
            aVar.R(x);
        }
        gxn gxnVar = (gxn) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gxnVar;
    }

    public static final void G(rl50 rl50Var, izs izsVar) {
        if (rl50Var instanceof xti) {
            Iterator it = ((xti) rl50Var).c.iterator();
            while (it.hasNext()) {
                G((rl50) it.next(), izsVar);
            }
        }
        h7f0 h7f0Var = rl50Var instanceof h7f0 ? (h7f0) rl50Var : null;
        if (h7f0Var != null) {
            izsVar.invoke(h7f0Var);
        }
    }

    public static void H(Bundle bundle, Boolean bool, Boolean bool2, Boolean bool3) {
        bundle.putBoolean("can_go_back", bool.booleanValue());
        if (bool2 != null) {
            bundle.putBoolean("has_drawer_entry_point", bool2.booleanValue());
        }
        if (bool3 != null) {
            bundle.putBoolean("need_show_profile_in_header", bool3.booleanValue());
        }
    }

    public static /* synthetic */ void I(fdi fdiVar, Bundle bundle, Boolean bool, Boolean bool2, int i) {
        if ((i & 4) != 0) {
            bool2 = null;
        }
        fdiVar.getClass();
        H(bundle, bool, bool2, null);
    }

    public static final void J(RectF rectF, RectF rectF2) {
        float width = rectF.width() / rectF.height();
        if (rectF2.width() / rectF2.height() > width) {
            rectF.left = rectF2.left;
            rectF.right = rectF2.right;
            float width2 = ((rectF2.width() / width) - rectF2.height()) / 2.0f;
            rectF.top = rectF2.top - width2;
            rectF.bottom = rectF2.bottom + width2;
            return;
        }
        rectF.top = rectF2.top;
        rectF.bottom = rectF2.bottom;
        float height = ((rectF2.height() * width) - rectF2.width()) / 2.0f;
        rectF.left = rectF2.left - height;
        rectF.right = rectF2.right + height;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(khh0 khh0Var, float f2, ContinuationImpl continuationImpl) {
        gfh0 gfh0Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof gfh0) {
            gfh0Var = (gfh0) continuationImpl;
            int i2 = gfh0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gfh0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = gfh0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gfh0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> hfh0Var = new hfh0(ref$FloatRef2, f2, null);
                    gfh0Var.L$0 = ref$FloatRef2;
                    gfh0Var.label = 1;
                    if (khh0Var.b(MutatePriority.Default, hfh0Var, gfh0Var) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$FloatRef = (Ref$FloatRef) gfh0Var.L$0;
                    kotlin.a.a(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        gfh0Var = new gfh0(continuationImpl);
        Object obj3 = gfh0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gfh0Var.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static final String M(Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            StringBuilder sb = new StringBuilder("album");
            AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
            sb.append(albumAttachment.g);
            sb.append('_');
            sb.append(albumAttachment.h);
            return sb.toString();
        }
        if (attachment instanceof PhotoAttachment) {
            StringBuilder sb2 = new StringBuilder("photo");
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            sb2.append(photoAttachment.g);
            sb2.append('_');
            sb2.append(photoAttachment.f);
            return sb2.toString();
        }
        if (attachment instanceof VideoAttachment) {
            StringBuilder sb3 = new StringBuilder("video");
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            sb3.append(videoAttachment.k.I0());
            sb3.append('_');
            sb3.append(videoAttachment.k.o0());
            return sb3.toString();
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return attachment.toString();
        }
        StringBuilder sb4 = new StringBuilder("doc");
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        sb4.append(documentAttachment.o);
        sb4.append('_');
        sb4.append(documentAttachment.k);
        return sb4.toString();
    }

    public static final float[] O(RectF rectF, float f2, float f3, Float f4, Float f5) {
        float f6 = rectF.left;
        float[] fArr = {f6, rectF.top, rectF.width() + f6, rectF.top, rectF.width() + rectF.left, rectF.height() + rectF.top, rectF.left, rectF.height() + rectF.top};
        Matrix matrix = new Matrix();
        matrix.preRotate(f3, f4 != null ? f4.floatValue() : rectF.centerX(), f5 != null ? f5.floatValue() : rectF.centerY());
        matrix.postScale(f2, f2, f4 != null ? f4.floatValue() : rectF.centerX(), f5 != null ? f5.floatValue() : rectF.centerY());
        matrix.mapPoints(fArr);
        return fArr;
    }

    public static int P(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static final m72 d(String str) {
        return new m72(Collections.singleton(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(y6p0 y6p0Var, float f2, float f3, xmk0 xmk0Var, ContinuationImpl continuationImpl) {
        uzm uzmVar;
        int i;
        if (continuationImpl instanceof uzm) {
            uzmVar = (uzm) continuationImpl;
            int i2 = uzmVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uzmVar.label = i2 - Integer.MIN_VALUE;
                uzm uzmVar2 = uzmVar;
                Object obj = uzmVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uzmVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (y6p0Var.a() < 0.01f || y6p0Var.a() == 1.0f) {
                        return new jmr0(0L);
                    }
                    if (y6p0Var.b() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y6p0Var.b() > y6p0Var.a) {
                        kq2 a = s1v.a(y6p0Var.b(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                        Float f4 = new Float(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : y6p0Var.a);
                        dhh dhhVar = new dhh(y6p0Var, 8);
                        uzmVar2.L$0 = null;
                        uzmVar2.L$1 = null;
                        uzmVar2.F$0 = f2;
                        uzmVar2.F$1 = f3;
                        uzmVar2.label = 1;
                        if (nkn0.f(a, f4, xmk0Var, false, dhhVar, uzmVar2, 4) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f3 = uzmVar2.F$1;
                    kotlin.a.a(obj);
                }
                return new jmr0(m200.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3));
            }
        }
        uzmVar = new uzm(continuationImpl);
        uzm uzmVar22 = uzmVar;
        Object obj2 = uzmVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uzmVar22.label;
        if (i != 0) {
        }
        return new jmr0(m200.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3));
    }

    public static final void f(Context context, Intent intent) {
        if (e3m.h(context) == null) {
            intent.addFlags(268435456);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(khh0 khh0Var, float f2, iq2 iq2Var, ContinuationImpl continuationImpl) {
        efh0 efh0Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof efh0) {
            efh0Var = (efh0) continuationImpl;
            int i2 = efh0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                efh0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = efh0Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = efh0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> ffh0Var = new ffh0(f2, iq2Var, ref$FloatRef2, null);
                    efh0Var.L$0 = ref$FloatRef2;
                    efh0Var.label = 1;
                    if (khh0Var.b(MutatePriority.Default, ffh0Var, efh0Var) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$FloatRef = (Ref$FloatRef) efh0Var.L$0;
                    kotlin.a.a(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        efh0Var = new efh0(continuationImpl);
        Object obj3 = efh0Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = efh0Var.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static boolean k(Bundle bundle, boolean z) {
        return bundle != null ? bundle.getBoolean("can_go_back") : z;
    }

    public static final boolean l(xlb0 xlb0Var) {
        return (xlb0Var.c() || xlb0Var.h || !xlb0Var.d) ? false : true;
    }

    public static final boolean m(xlb0 xlb0Var) {
        return !xlb0Var.h && xlb0Var.d;
    }

    public static final boolean n(xlb0 xlb0Var) {
        return (xlb0Var.c() || !xlb0Var.h || xlb0Var.d) ? false : true;
    }

    public static final boolean o(xlb0 xlb0Var) {
        return xlb0Var.h && !xlb0Var.d;
    }

    public static Object[] p(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static /* synthetic */ xy2 r(fdi fdiVar, FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto, Integer num, String str, Integer num2, Integer num3, String str2, Boolean bool, String str3, int i) {
        if ((i & 1) != 0) {
            faveGetExtendedItemTypeDto = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return fdiVar.q(faveGetExtendedItemTypeDto, num, str, num2, num3, str2, bool, null, str3);
    }

    public static final boolean t(Attachment attachment) {
        return attachment instanceof PhotoAttachment ? ((PhotoAttachment) attachment).l.Ib() : (attachment instanceof VideoAttachment) && ((VideoAttachment) attachment).k.O() != null;
    }

    public static final float u(Attachment attachment) {
        Image image;
        ArrayList arrayList;
        ImageSize imageSize;
        if (attachment instanceof PhotoAttachment) {
            ImageSize imageSize2 = (ImageSize) ixj0.b(((PhotoAttachment) attachment).l.y.b);
            float E0 = imageSize2 != null ? imageSize2.E0() : 0.0f;
            if (E0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return E0;
            }
            return 1.35f;
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            return ((videoAttachment.k.getWidth() > 0 ? videoAttachment.k.getWidth() : 360) * 1.0f) / (videoAttachment.k.getHeight() > 0 ? videoAttachment.k.getHeight() : 179);
        }
        if (attachment instanceof MarketAlbumAttachment) {
            Photo photo = ((MarketAlbumAttachment) attachment).f.e;
            float E02 = (photo == null || (image = photo.y) == null || (arrayList = image.b) == null || (imageSize = (ImageSize) ixj0.b(arrayList)) == null) ? 0.0f : imageSize.E0();
            if (E02 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return E02;
            }
            return 1.35f;
        }
        if (!(attachment instanceof DocumentAttachment)) {
            return 1.35f;
        }
        Image image2 = ((DocumentAttachment) attachment).s;
        ImageSize imageSize3 = (ImageSize) ixj0.b(image2 != null ? image2.b : null);
        float E03 = imageSize3 != null ? imageSize3.E0() : 0.0f;
        if (E03 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return E03;
        }
        return 1.35f;
    }

    public static final float v(Attachment attachment) {
        if (!(attachment instanceof VideoAttachment)) {
            return 0.83f;
        }
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        if (videoAttachment.k.getHeight() <= 0 || videoAttachment.k.getWidth() <= 0) {
            return 0.83f;
        }
        return videoAttachment.k.getWidth() / videoAttachment.k.getHeight();
    }

    public static final void w() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1518738839, 0, -1, "com.vk.core.compose.component.defaults.<get-VkHorizontalListItemDefaults> (HorizontalListItemDefaults.kt:18)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static gzs y(Bundle bundle, PropertyReference0Impl propertyReference0Impl, gzs gzsVar) {
        return bundle != null ? new o49(gzsVar, propertyReference0Impl, bundle.getBoolean("has_drawer_entry_point")) : propertyReference0Impl;
    }

    public static final boolean z(xlb0 xlb0Var, long j, long j2) {
        int i = xlb0Var.i == 1 ? 1 : 0;
        long j3 = xlb0Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public tfx L(List list, List list2) {
        tfx tfxVar = new tfx("stickers.getUGCPackLists", new zjh0(3), new bkh0(3));
        if (list != null) {
            tfxVar.i("owner_ids", list);
        }
        if (list2 != null) {
            tfxVar.i("owner_global_ids", list2);
        }
        return tfxVar;
    }

    public List N(int i, Triple triple) {
        float f2;
        NewsEntry newsEntry = (NewsEntry) triple.d();
        DocumentAttachment documentAttachment = (DocumentAttachment) triple.g();
        int intValue = ((Number) triple.h()).intValue();
        int i2 = documentAttachment.l;
        if (i2 == 0) {
            f2 = 1.0f;
        } else {
            float f3 = documentAttachment.m / i2;
            f2 = 1.5f;
            if (f3 <= 1.5f) {
                f2 = f3;
            }
        }
        return Collections.singletonList(new qp2(newsEntry, documentAttachment, documentAttachment.r, documentAttachment.t, documentAttachment.l, documentAttachment.m, documentAttachment.h, intValue, documentAttachment.f, documentAttachment.Fb(), f2, new ImageSize(documentAttachment.h, documentAttachment.l, documentAttachment.m, null, (char) 0, false, 56, null), documentAttachment.n));
    }

    @Override // xsna.yg10
    public void c() {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.j0().h0();
    }

    @Override // xsna.yg10
    public void i(int i, Mask mask) {
        if (mask.v) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.j0().i0();
        } else {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.j0().y0(mask);
        }
    }

    public tfx q(FaveGetExtendedItemTypeDto faveGetExtendedItemTypeDto, Integer num, String str, Integer num2, Integer num3, String str2, Boolean bool, String str3, String str4) {
        tfx tfxVar = new tfx("fave.get", new dn(16), new en(20));
        tfxVar.j("extended", true);
        if (faveGetExtendedItemTypeDto != null) {
            tfx.o(tfxVar, "item_type", faveGetExtendedItemTypeDto.i(), 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "tag_id", num.intValue(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 0, 8);
        }
        tfxVar.f(num3.intValue(), 1, 100, "count");
        if (str2 != null) {
            tfx.o(tfxVar, "fields", str2, 0, 0, 12);
        }
        tfxVar.j("is_from_snackbar", bool.booleanValue());
        if (str3 != null) {
            tfx.o(tfxVar, "filter", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "ref", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx s(Integer num, Integer num2, FaveGetPagesTypeDto faveGetPagesTypeDto, List list, Integer num3, String str) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("fave.getPages", new io.reactivex.rxjava3.internal.operators.observable.q1(22), new hr(15));
        tfxVar.f(num.intValue(), 0, 10000, SignalingProtocol.KEY_OFFSET);
        tfxVar.f(num2.intValue(), 1, 500, "count");
        if (faveGetPagesTypeDto != null) {
            tfx.o(tfxVar, "type", faveGetPagesTypeDto.i(), 0, 0, 12);
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "tag_id", num3.intValue(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        return tfxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return N(0, (Triple) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zzor.zzd());
    }

    @Override // xsna.yg10
    public void flush() {
    }

    @Override // xsna.yg10
    public void a(Mask mask) {
    }

    @Override // xsna.yg10
    public void b(Mask mask) {
    }

    @Override // xsna.yg10
    public void h(Mask mask) {
    }
}

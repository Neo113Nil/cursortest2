package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.internal.measurement.zzol;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.base.dto.BaseRequestParamDto;
import com.vk.api.generated.uxpolls.dto.UxpollsConfigDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.geo.impl.model.id.StringId;
import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsConfig;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: CommunityProfileContentPagerViewHolder.kt */
/* loaded from: classes5.dex */
public final class sdi implements q701 {
    public static final jai b = new jai(-834648532, new gbi(1), false);
    public static final jai c = new jai(1074658791, new whd(1), false);
    public static final jai d = new jai(-1088711444, new z2(3), false);
    public static final /* synthetic */ sdi e = new sdi();
    public static a8c f;

    public static final Object[] a(Object obj, Object obj2, Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length + 2];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static final rgt d(yy1 yy1Var) {
        rgt rgtVar = yy1Var instanceof rgt ? (rgt) yy1Var : null;
        if (rgtVar != null) {
            return rgtVar;
        }
        throw at.b("Inconsistent composition");
    }

    public static final wh50 e(sg50 sg50Var, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1692965168, i, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:80)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && aVar.J(sg50Var)) || (i & 6) == 4;
        Object x2 = aVar.x();
        if (z || x2 == c0012a) {
            x2 = new p2d0(sg50Var, wh50Var, null);
            aVar.R(x2);
        }
        bap.g(sg50Var, (wzs) x2, aVar, i2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static s8u0 f(sdi sdiVar, Context context, int i, boolean z) {
        s8u0 s8u0Var = new s8u0(0);
        String d2 = uqm0.d(i);
        VkTypographyToken vkTypographyToken = VkTypographyToken.Headline2Medium;
        int h = s8u0Var.h(new uav0(vkTypographyToken));
        try {
            int i2 = s8u0Var.i(new klv0(vkTypographyToken, VkColorToken.TextPrimary));
            try {
                if (z) {
                    d2 = i < 1000 ? context.getResources().getQuantityString(R.plurals.followers_count, i, d2) : context.getResources().getString(R.string.user_profile_celebrity_followers_formatted, d2);
                }
                s8u0Var.e(d2);
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i2);
                return s8u0Var;
            } catch (Throwable th) {
                s8u0Var.f(i2);
                throw th;
            }
        } finally {
            s8u0Var.f(h);
        }
    }

    public static uqr g() {
        float f2 = hhq.b;
        float f3 = hhq.e;
        float f4 = hhq.c;
        float f5 = hhq.d;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-241106249, 24576, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:549)");
        }
        uqr uqrVar = new uqr(f2, f3, f4, f5);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return uqrVar;
    }

    public static final RandomAccessFile h(String str) {
        String path;
        Uri parse = Uri.parse(str);
        if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(parse.getScheme())) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Cursor query = context.getContentResolver().query(parse, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    path = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    s3q0 s3q0Var = s3q0.a;
                    query.close();
                } finally {
                }
            }
        } else {
            path = parse.getPath();
        }
        if (path == null) {
            throw new FileNotFoundException(parse.toString());
        }
        File file = new File(path);
        if (file.exists()) {
            return new RandomAccessFile(file, "r");
        }
        throw new FileNotFoundException(parse.toString());
    }

    public static final void i(s470 s470Var, zk3 zk3Var) {
        if (s470Var instanceof xyy) {
            for (S s : ((xyy) s470Var).b) {
                zk3Var.put(new StringId(s.b), s);
            }
            return;
        }
        if (!(s470Var instanceof b670)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = ((b670) s470Var).b.iterator();
        while (it.hasNext()) {
            s470 s470Var2 = (s470) it.next();
            if (s470Var2 instanceof xyy) {
                i(s470Var2, zk3Var);
            }
        }
    }

    public static final int j(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean k(LayoutNode layoutNode) {
        if (layoutNode.i == null) {
            return false;
        }
        LayoutNode I = layoutNode.I();
        return (I != null ? I.i : null) == null || layoutNode.H.b;
    }

    public static final String l(Throwable th) {
        List n0 = rl3.n0(10, th.getStackTrace());
        ArrayList arrayList = new ArrayList(c5g.u(n0, 10));
        Iterator it = n0.iterator();
        while (it.hasNext()) {
            arrayList.add(((StackTraceElement) it.next()).toString());
        }
        return arrayList.toString();
    }

    public static final UxPollsGetResponse m(UxpollsGetResponseDto uxpollsGetResponseDto) {
        int count = uxpollsGetResponseDto.getCount();
        List<UxpollsPollDto> e2 = uxpollsGetResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        for (UxpollsPollDto uxpollsPollDto : e2) {
            arrayList.add(new UxPollsPoll(uxpollsPollDto.getId(), uxpollsPollDto.f(), uxpollsPollDto.d(), uxpollsPollDto.e(), null));
        }
        UxpollsConfigDto d2 = uxpollsGetResponseDto.d();
        UxPollsConfig uxPollsConfig = null;
        ArrayList arrayList2 = null;
        if (d2 != null) {
            String e3 = d2.e();
            List<BaseRequestParamDto> d3 = d2.d();
            if (d3 != null) {
                List<BaseRequestParamDto> list = d3;
                arrayList2 = new ArrayList(c5g.u(list, 10));
                for (BaseRequestParamDto baseRequestParamDto : list) {
                    arrayList2.add(new BaseRequestParam(baseRequestParamDto.d(), baseRequestParamDto.e()));
                }
            }
            uxPollsConfig = new UxPollsConfig(e3, arrayList2);
        }
        return new UxPollsGetResponse(count, arrayList, uxPollsConfig);
    }

    public static final q630 o(q630 q630Var, izs izsVar) {
        return q630Var.g(new mdy(izsVar, null));
    }

    public static final q630 p(q630 q630Var, izs izsVar) {
        return q630Var.g(new mdy(null, izsVar));
    }

    public static final boolean q(LinkedList linkedList, StoryCameraMode storyCameraMode) {
        return linkedList.size() == 1 && epx.f(j5g.Y(linkedList), storyCameraMode);
    }

    public static final int r(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 = (read & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = read & 255;
            }
            i3 |= i2;
        }
        return i3;
    }

    public static final guv0 s(boolean z, boolean z2, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-587444195, i, -1, "com.vk.core.compose.component.tooltip.rememberVkTooltipState (VkTooltipStateImpl.kt:37)");
        }
        boolean l = aVar.l(z2) | ((((i & 14) ^ 6) > 4 && aVar.l(z)) || (i & 6) == 4);
        Object x = aVar.x();
        if (l || x == a.C0011a.a) {
            x = new guv0(z, z2);
            aVar.R(x);
        }
        guv0 guv0Var = (guv0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return guv0Var;
    }

    public static final q630 t(q630 q630Var, khh0 khh0Var, Orientation orientation, e490 e490Var, boolean z, tpr tprVar, tg50 tg50Var, wa90 wa90Var) {
        float f2 = ubd.a;
        Orientation orientation2 = Orientation.Vertical;
        q630.a aVar = q630.a.a;
        return q630Var.g(orientation == orientation2 ? rte0.d(aVar, cpr0.a) : rte0.d(aVar, qfv.a)).g(new xgh0(orientation, wa90Var, tprVar, tg50Var, e490Var, khh0Var, z, false));
    }

    public static final void v(Throwable th, ViewGroup viewGroup) {
        cmf0.e(viewGroup.getContext(), s200.y(viewGroup.getContext()), j03.g(viewGroup.getContext(), th, R.string.error), 56);
    }

    public static final float w(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        return (float) (f2 * 57.29577951308232d);
    }

    public static final float x(float f2) {
        return Float.isNaN(f2) ? f2 : (float) (f2 * 0.017453292519943295d);
    }

    public static void y(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (((Double) list.get(0)).isInfinite() || ((Double) ji.a(1, list)).isInfinite()) {
            throw new IllegalArgumentException("invalid boundaries: contains explicit +/-Inf");
        }
    }

    public static void z(List list) {
        int i = 0;
        while (i < list.size() - 1) {
            Double d2 = (Double) list.get(i);
            i++;
            if (d2.compareTo((Double) list.get(i)) >= 0) {
                throw new IllegalArgumentException(go9.c("invalid boundaries: ", list));
            }
        }
    }

    public tfx n() {
        return new tfx("money.getNspkMembers", new t11(23), new u11(26));
    }

    public tfx u(long j, UserId userId, Integer num) {
        tfx tfxVar = new tfx("serverEffects.getGeneratedVideoInfo", new s11(26), new to(28));
        tfx.m(tfxVar, "generated_ov_id", j, 1L, 8);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "video_id", num.intValue(), 1, 0, 8);
        return tfxVar;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzol.zzc());
    }
}

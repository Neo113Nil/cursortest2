package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.text.Editable;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zzpd;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutPlatformDto;
import com.vk.api.generated.auth.dto.AuthValidateAccountSupportedWaysDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.media.pipeline.gl.GlException;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.commons.util.Optional;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: RemoveDownloadsButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class wwf0 implements io.reactivex.rxjava3.functions.l, q701, x420, xos, zag0 {
    public static final jai b = new jai(-1420755239, new t8c(1), false);
    public static final wwf0 c = new wwf0();
    public static final wwf0 d = new wwf0();
    public static final /* synthetic */ wwf0 e = new wwf0();
    public static wwf0 f;
    public static c1w0 g;

    public static final List d(xel0 xel0Var, int i, int i2, ArrayList arrayList, a9x a9xVar, int i3, int i4, int i5, int i6, izs izsVar) {
        int i7;
        xel0 xel0Var2 = xel0Var;
        if (xel0Var2 == null || arrayList.isEmpty() || a9xVar.b == 0) {
            return EmptyList.b;
        }
        ng50 b2 = xel0Var2.b(i, i2, a9xVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            int index = ((rty) obj).getIndex();
            int[] iArr = a9xVar.a;
            int i9 = a9xVar.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                if (iArr[i10] == index) {
                    arrayList3.add(obj);
                    break;
                }
                i10++;
            }
        }
        int[] iArr2 = b2.a;
        int i11 = b2.b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr2[i12];
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((rty) it.next()).getIndex() == i13) {
                    break;
                }
                i14++;
            }
            rty rtyVar = i14 == -1 ? (rty) izsVar.invoke(Integer.valueOf(i13)) : (rty) arrayList.remove(i14);
            ArrayList arrayList4 = arrayList3;
            int j = rtyVar.j();
            if (i14 == -1) {
                i7 = Integer.MIN_VALUE;
            } else {
                long o = rtyVar.o(0);
                i7 = (int) (rtyVar.h() ? o & 4294967295L : o >> 32);
            }
            int a = xel0Var2.a(arrayList4, i13, j, i7, i3);
            rtyVar.k();
            rtyVar.d(a, 0, i5, i6);
            arrayList2.add(rtyVar);
            i12++;
            xel0Var2 = xel0Var;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    public static xy2 e(znk0 znk0Var, String str, String str2, String str3) {
        ufx ufxVar = new ufx("auth.checkAccess", new at(5), new bt(4));
        if (str != null) {
            ufx.n(ufxVar, "token", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, LoginApiConstants.PARAM_NAME_PASSWORD, str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "code", str3, 0, 12);
        }
        return ufxVar;
    }

    public static xy2 f(znk0 znk0Var, String str, AuthExternalFlowOutPlatformDto authExternalFlowOutPlatformDto, String str2) {
        ufx ufxVar = new ufx("auth.externalFlowOut", new io.reactivex.rxjava3.subjects.b(7), new io.reactivex.rxjava3.subjects.c(7));
        ufx.n(ufxVar, "super_app_token", str, 0, 12);
        ufx.n(ufxVar, "platform", authExternalFlowOutPlatformDto.i(), 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, O6.e1, str2, 0, 12);
        }
        return ufxVar;
    }

    public static xy2 g(znk0 znk0Var, int i, String str, String str2, String str3, List list, String str4, String str5) {
        ufx ufxVar = new ufx("auth.getCredentialsForServiceMulti", new s11(3), new to(5));
        ufx.k(ufxVar, "app_id", i, 0, 8);
        ufx.n(ufxVar, "package", str, 0, 12);
        ufx.n(ufxVar, "timestamp", str2, 0, 12);
        ufx.n(ufxVar, "digest_hash", str3, 0, 12);
        if (list != null) {
            ufxVar.h("exchange_tokens", list);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "client_device_id", str4, 0, 12);
        }
        if (str5 != null) {
            ufx.n(ufxVar, "client_external_device_id", str5, 0, 12);
        }
        return ufxVar;
    }

    public static xy2 h(znk0 znk0Var, List list, Integer num) {
        ufx ufxVar = new ufx("auth.getExchangeTokensInfo", new xr(6), new io.reactivex.rxjava3.processors.b(6));
        if (list != null) {
            ufxVar.h("exchange_tokens", list);
        }
        ufx.k(ufxVar, "target_app_id", num.intValue(), 0, 12);
        return ufxVar;
    }

    public static xy2 i(znk0 znk0Var, String str, String str2) {
        ufx ufxVar = new ufx("auth.initPasswordCheck", new dt(5), new et(4));
        if (str != null) {
            ufx.n(ufxVar, "token", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "access_factor", str2, 0, 12);
        }
        return ufxVar;
    }

    public static xy2 j(znk0 znk0Var, int i, String str, List list, String str2, String str3, Boolean bool, int i2) {
        if ((i2 & 256) != 0) {
            str3 = null;
        }
        if ((i2 & 512) != 0) {
            bool = null;
        }
        ufx ufxVar = new ufx("auth.refreshTokens", new tf3(2), new uf3(2));
        ufx.k(ufxVar, "client_id", i, 0, 12);
        ufx.n(ufxVar, SharedKt.PARAM_CLIENT_SECRET, str, 0, 12);
        ufxVar.h("exchange_tokens", list);
        ufx.k(ufxVar, "active_index", 0, 0, 12);
        ufx.n(ufxVar, CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "all", 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, SignalingProtocol.KEY_INITIATOR, str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "validate_session", str3, 0, 12);
        }
        if (bool != null) {
            ufxVar.i("silent_auth_by_login", bool.booleanValue());
        }
        return ufxVar;
    }

    public static xy2 k(znk0 znk0Var, String str, Boolean bool, String str2, ArrayList arrayList, String str3, List list, List list2) {
        ufx ufxVar = new ufx("auth.validateAccount", new t11(3), new u11(9));
        if (str != null) {
            ufx.n(ufxVar, "login", str, 0, 12);
        }
        ufxVar.i("force_password", bool.booleanValue());
        if (str2 != null) {
            ufx.n(ufxVar, "super_app_token", str2, 0, 12);
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AuthValidateAccountSupportedWaysDto) it.next()).i());
        }
        ufxVar.h("supported_ways", arrayList2);
        if (str3 != null) {
            ufx.n(ufxVar, "trusted_hash", str3, 0, 12);
        }
        if (list != null) {
            ufxVar.h("accounts_trusted_hashes", list);
        }
        if (list2 != null) {
            ufxVar.h("exchange_tokens", list2);
        }
        return ufxVar;
    }

    public static xy2 l(znk0 znk0Var, Integer num) {
        ufx ufxVar = new ufx("auth.validatePhoneCheck", new v11(4), new w11(5));
        ufxVar.i("is_auth", false);
        if (num != null) {
            ufx.k(ufxVar, "app_id", num.intValue(), 0, 8);
        }
        return ufxVar;
    }

    public static xy2 m(znk0 znk0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8) {
        ufx ufxVar = new ufx("auth.validatePhoneConfirm", new r11(4), new sf3(3));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "phone", str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "code", str3, 0, 12);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "validate_session", str4, 0, 12);
        }
        if (str5 != null) {
            ufx.n(ufxVar, "validate_token", str5, 0, 12);
        }
        if (str6 != null) {
            ufx.n(ufxVar, "client_id", str6, 0, 12);
        }
        if (str7 != null) {
            ufx.n(ufxVar, "device_id", str7, 0, 12);
        }
        ufxVar.i("can_skip_password", bool.booleanValue());
        ufxVar.i("is_code_autocomplete", bool2.booleanValue());
        if (str8 != null) {
            ufx.n(ufxVar, "verification_type", str8, 0, 12);
        }
        return ufxVar;
    }

    public static void o(wwf0 wwf0Var, f100 f100Var, int i) {
        if ((i & 1) != 0) {
            f100Var = null;
        }
        wwf0Var.getClass();
        GlException r = r();
        if (r != null && f100Var != null) {
            f100Var.a("GlUtil", r);
        } else if (r != null) {
            throw r;
        }
    }

    public static void p(int i, int i2, f100 f100Var) {
        if ((i2 & 2) != 0) {
            f100Var = null;
        }
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        GlException r = r();
        if (r != null && f100Var != null) {
            f100Var.a("GlUtil", r);
        } else if (r != null) {
            throw r;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r2 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int q(ReactionsFeedMviState reactionsFeedMviState) {
        Iterator<E> it = FeedLikesFilter.h().iterator();
        int i = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(((FeedLikesFilter) next).i(), reactionsFeedMviState.b)) {
                break;
            }
            i++;
        }
    }

    public static GlException r() {
        StringBuilder sb = null;
        for (int glGetError = GLES20.glGetError(); glGetError != 0; glGetError = GLES20.glGetError()) {
            if (sb != null) {
                sb.append('\n');
            } else {
                sb = new StringBuilder();
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = et.a(glGetError, new StringBuilder("gl error=0x"));
            }
            sb.append(gluErrorString);
        }
        if (sb != null) {
            return new GlException(sb.toString());
        }
        return null;
    }

    public static wwf0 s() {
        if (f == null) {
            f = new wwf0();
        }
        return f;
    }

    public static com.vk.core.compose.component.cell.content.j0 t(jai jaiVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(374929233, 54, -1, "com.vk.core.compose.component.cell.content.SexyCell.SideSlot.Custom.Companion.invoke (SexyCell.kt:639)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1458446961, 54, -1, "com.vk.core.compose.component.cell.content.remember (LeftMainCustomImpl.kt:35)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new com.vk.core.compose.component.cell.content.j0(jaiVar);
            aVar.R(x);
        }
        com.vk.core.compose.component.cell.content.j0 j0Var = (com.vk.core.compose.component.cell.content.j0) x;
        ((zak0) j0Var.a).setValue(jaiVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j0Var;
    }

    public static LinkButton w(BaseLinkButtonDto baseLinkButtonDto) {
        Action b2;
        BaseLinkButtonActionDto e2 = baseLinkButtonDto.e();
        if (e2 == null || (b2 = wf6.b(e2)) == null) {
            return null;
        }
        String title = baseLinkButtonDto.getTitle();
        if (title == null) {
            title = "";
        }
        BaseLinkButtonStyleDto o = baseLinkButtonDto.o();
        return new LinkButton(title, b2, o != null ? o.name() : null);
    }

    public static final long x(long j, long j2) {
        int d2;
        int f2 = qko0.f(j);
        int e2 = qko0.e(j);
        if ((qko0.f(j2) < qko0.e(j)) && (qko0.f(j) < qko0.e(j2))) {
            if ((qko0.f(j2) <= qko0.f(j)) && (qko0.e(j) <= qko0.e(j2))) {
                f2 = qko0.f(j2);
                e2 = f2;
            } else {
                if ((qko0.f(j) <= qko0.f(j2)) && (qko0.e(j2) <= qko0.e(j))) {
                    d2 = qko0.d(j2);
                } else {
                    int f3 = qko0.f(j2);
                    if (f2 >= qko0.e(j2) || f3 > f2) {
                        e2 = qko0.f(j2);
                    } else {
                        f2 = qko0.f(j2);
                        d2 = qko0.d(j2);
                    }
                }
                e2 -= d2;
            }
        } else if (e2 > qko0.f(j2)) {
            f2 -= qko0.d(j2);
            d2 = qko0.d(j2);
            e2 -= d2;
        }
        return jgz.c(f2, e2);
    }

    @Override // xsna.zag0
    public void a(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return Optional.of((ConversationParams) obj);
    }

    @Override // xsna.xos
    public String c(String str) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getResources().getString(R.string.friends_recommend_from, str);
    }

    public void n(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        o(this, null, 3);
        GLES20.glTexParameteri(i, 10241, 9729);
        o(this, null, 3);
        GLES20.glTexParameteri(i, 10240, 9729);
        o(this, null, 3);
        GLES20.glTexParameteri(i, 10242, 33071);
        o(this, null, 3);
        GLES20.glTexParameteri(i, 10243, 33071);
        o(this, null, 3);
    }

    public int u(Bitmap bitmap) {
        if (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        o(this, null, 3);
        int i = iArr[0];
        if (i == 0) {
            throw new GlException("Wrong texId=0, egl context?");
        }
        try {
            n(3553, i);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GlException r = r();
            if (r != null) {
                p(i, 6, null);
                throw r;
            }
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GlException r2 = r();
            if (r2 != null) {
                p(i, 6, null);
                throw r2;
            }
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GlException r3 = r();
            if (r3 != null) {
                p(i, 6, null);
                throw r3;
            }
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GlException r4 = r();
            if (r4 != null) {
                p(i, 6, null);
                throw r4;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GlException r5 = r();
            if (r5 == null) {
                return i;
            }
            p(i, 6, null);
            throw r5;
        } catch (GlException e2) {
            p(i, 6, null);
            throw e2;
        }
    }

    public int v(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        o(this, null, 3);
        GLES20.glShaderSource(glCreateShader, str);
        GlException r = r();
        if (r != null) {
            GLES20.glDeleteShader(glCreateShader);
            throw r;
        }
        GLES20.glCompileShader(glCreateShader);
        GlException r2 = r();
        if (r2 != null) {
            GLES20.glDeleteShader(glCreateShader);
            throw r2;
        }
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new GlException(com.vk.movika.sdk.base.model.history.b.b(i, "Shader compile failed, type=", ", ", glGetShaderInfoLog));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpd.zzf());
    }

    @Override // xsna.x420
    public vg6 b(vg6 vg6Var, Editable editable) {
        return vg6Var;
    }
}

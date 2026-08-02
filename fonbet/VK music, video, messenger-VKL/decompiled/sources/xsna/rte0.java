package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.animation.PathInterpolator;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistPermissionsDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.podcast.dto.PodcastPodcastDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.emailactualization.EmailActualizationMetadataResult;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.libverify.mobile.id.MobileIdScreenType;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionExpandBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.podcast.Podcast;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.stickers.views.sticker.StickerAnimationState;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONObject;

/* compiled from: RadioBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class rte0 implements tg60 {
    public static final jai b = new jai(-1536715842, new zfi(0), false);
    public static final rte0 c = new rte0();
    public static final rte0 d = new rte0();
    public static final jtp0 e = new jtp0(new m4k0(9), new gxj0(8));
    public static final jtp0 f = new jtp0(new e750(27), new ygm0(7));
    public static final jtp0 g = new jtp0(new ubj0(7), new zzl0(8));
    public static final jtp0 h = new jtp0(new hwi0(12), new eni0(9));
    public static final jtp0 i = new jtp0(new tml0(5), new oi40(28));
    public static final jtp0 j = new jtp0(new ltl0(5), new jyq0(2));
    public static final jtp0 k = new jtp0(new kbq0(2), new weq0(2));
    public static final jtp0 l = new jtp0(new mcl0(10), new lwp0(3));
    public static final jtp0 m = new jtp0(new fyo0(4), new hyu(26));
    public static final Object n = new Object();

    public /* synthetic */ rte0() {
    }

    public static final Future A(final l7r0 l7r0Var, final nx2 nx2Var, ExecutorService executorService) {
        return executorService.submit(new Callable() { // from class: xsna.are0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l7r0Var.e(nx2Var);
            }
        });
    }

    public static final Object B(l7r0 l7r0Var, nx2 nx2Var, ExecutorService executorService) {
        Future A = A(l7r0Var, nx2Var, executorService);
        try {
            return A.get();
        } catch (InterruptedException e2) {
            A.cancel(true);
            throw e2;
        }
    }

    public static final List C(ArrayList arrayList, bi20 bi20Var) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UIBlockActionExpandBlock) {
                arrayList2.add(obj);
            }
        }
        UIBlockActionExpandBlock uIBlockActionExpandBlock = (UIBlockActionExpandBlock) j5g.a0(arrayList2);
        if (uIBlockActionExpandBlock == null) {
            return arrayList;
        }
        int i2 = uIBlockActionExpandBlock.B;
        if (!bi20Var.d.n() || i2 >= arrayList.size()) {
            return arrayList;
        }
        List H0 = j5g.H0(arrayList, i2);
        return j5g.u0(Collections.singletonList(uIBlockActionExpandBlock.Rb(j5g.S(arrayList, i2))), H0);
    }

    public static final ArrayList D(List list, bi20 bi20Var) {
        List list2 = list;
        List<UIBlockAction> list3 = bi20Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if ((uIBlockAction instanceof UIBlockActionOpenSection) && uIBlockAction.d.m()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((UIBlockActionOpenSection) ((UIBlockAction) it.next())).Rb(CatalogDataType.DATA_TYPE_ACTION));
        }
        return j5g.u0(arrayList2, list2);
    }

    public static final ArrayList E(ArrayList arrayList, bi20 bi20Var) {
        List<UIBlockAction> list = bi20Var.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            UIBlockAction uIBlockAction = (UIBlockAction) obj;
            if ((uIBlockAction instanceof UIBlockActionOpenUrl) && uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) ((UIBlockAction) it.next());
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
            Serializer.c<UIBlockActionOpenUrl> cVar = UIBlockActionOpenUrl.CREATOR;
            arrayList3.add(uIBlockActionOpenUrl.Sb(catalogDataType, null));
        }
        return j5g.u0(arrayList3, arrayList);
    }

    public static void F(File file, var varVar) {
        varVar.a(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    F(file2, varVar);
                } else {
                    varVar.b(file2);
                }
            }
        }
        varVar.c(file);
    }

    public static final d52 b(aa2 aa2Var) {
        Canvas canvas = e52.a;
        d52 d52Var = new d52();
        d52Var.a = new Canvas(ba2.a(aa2Var));
        return d52Var;
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence.length() < charSequence2.length()) {
            return c(charSequence2, charSequence);
        }
        if (charSequence.length() - charSequence2.length() != 1) {
            return false;
        }
        int length = charSequence2.length();
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            if (!z && charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                z = true;
            }
            if (z && charSequence.charAt(i2 + 1) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static final q630 d(q630 q630Var, r5j0 r5j0Var) {
        return rdu.c(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r5j0Var, 518143);
    }

    public static final q630 e(q630 q630Var) {
        return rdu.c(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 520191);
    }

    public static final void f(SpannableStringBuilder spannableStringBuilder) {
        qjc[] qjcVarArr = (qjc[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qjc.class);
        if (qjcVarArr != null) {
            for (qjc qjcVar : qjcVarArr) {
                qjcVar.g(true);
            }
        }
    }

    public static final ej90 h(ej90 ej90Var, boolean z) {
        if (!z) {
            return ej90Var;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ej90Var.a);
        f(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ej90Var.b);
        f(spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ej90Var.c);
        f(spannableStringBuilder3);
        s3q0 s3q0Var = s3q0.a;
        return new ej90(spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3);
    }

    public static PathInterpolator i(float f2, float f3, float f4, float f5) {
        return new PathInterpolator(f2, f3, f4, f5);
    }

    public static PathInterpolator j(Path path) {
        return new PathInterpolator(path);
    }

    public static boolean k(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                k(file2);
            }
        }
        return file.delete();
    }

    public static final a3m l(dh dhVar, ssi ssiVar, String str) {
        a3m a = dhVar.a(ssiVar, str);
        if (a != null) {
            return a;
        }
        cvk.z(str, dhVar.c());
        throw null;
    }

    public static final mmi0 m(dh dhVar, Encoder encoder, Object obj) {
        mmi0 b2 = dhVar.b(encoder, obj);
        if (b2 != null) {
            return b2;
        }
        rfc a = fpf0.a(obj.getClass());
        dcy c2 = dhVar.c();
        String l2 = a.l();
        if (l2 == null) {
            l2 = String.valueOf(a);
        }
        cvk.z(l2, c2);
        throw null;
    }

    public static final void n(VKApiExecutionException vKApiExecutionException, izs izsVar, izs izsVar2) {
        if (vKApiExecutionException.R()) {
            List<VKApiExecutionException> v = vKApiExecutionException.v();
            if (v != null) {
                Iterator<T> it = v.iterator();
                while (it.hasNext()) {
                    if (((Boolean) izsVar.invoke((VKApiExecutionException) it.next())).booleanValue()) {
                        return;
                    }
                }
            }
        } else if (((Boolean) izsVar.invoke(vKApiExecutionException)).booleanValue()) {
            return;
        }
        if (izsVar2 != null) {
            izsVar2.invoke(vKApiExecutionException);
        }
    }

    public static final EmailActualizationMetadataResult o(Bundle bundle) {
        Object failure;
        String string = bundle.getString("email_actualization_result_key");
        if (string == null) {
            return null;
        }
        try {
            failure = EmailActualizationMetadataResult.valueOf(string);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (EmailActualizationMetadataResult) (failure instanceof Result.Failure ? null : failure);
    }

    public static io.reactivex.rxjava3.core.q p() {
        Random random = txz.c;
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        long j2 = txz.a;
        sex0 sex0Var = e370.l;
        if (sex0Var == null) {
            sex0Var = null;
        }
        sex0Var.getClass();
        if (!oxz.f(context2)) {
            return io.reactivex.rxjava3.core.q.T(txz.c("3"));
        }
        sex0 sex0Var2 = e370.l;
        if (sex0Var2 == null) {
            sex0Var2 = null;
        }
        sex0Var2.getClass();
        if (!oxz.g(context2)) {
            return io.reactivex.rxjava3.core.q.T(txz.c("1"));
        }
        if (!txz.b()) {
            return io.reactivex.rxjava3.core.q.T(txz.c("4"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sex0 sex0Var3 = e370.l;
        (sex0Var3 != null ? sex0Var3 : null).getClass();
        int i2 = 1;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = oxz.e(context2).z0(1000L, TimeUnit.MILLISECONDS, new io.reactivex.rxjava3.internal.operators.observable.s0(new huu(i2))).a0(asu0.a.c()).U(new mj1(new qxz(context2, elapsedRealtime, j2), 26)).U(new tuz(new rxz(context2, 0), 1));
        y00 y00Var = new y00(new uuz(i2), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.p1(U.E(y00Var, lVar, kVar, kVar), new ql2(new hyu(3), 25));
    }

    public static final MobileIdScreenType q(CheckPresenterInfo checkPresenterInfo) {
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            return MobileIdScreenType.SIGN_UP;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            return MobileIdScreenType.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
            return MobileIdScreenType.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth) {
            return MobileIdScreenType.AUTH;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String r(String str) {
        if (str == null || drm0.N(str)) {
            return null;
        }
        List c0 = drm0.c0(str, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String str2 = (String) arrayList.get(0);
        if (arrayList.size() < 2) {
            return str2;
        }
        String str3 = (String) arrayList.get(1);
        if (!brm0.B(str3, "(", false) || !brm0.v(str3, ")", false)) {
            str3 = erm0.x0(str3) + ".";
        }
        return v1v.a(' ', str2, str3);
    }

    public static int s(Boolean bool, Integer num) {
        return ((num.hashCode() + 31) * 31) + bool.hashCode();
    }

    public static Group t(GroupsGroupDto groupsGroupDto) {
        Group group = new Group();
        group.c = groupsGroupDto.g();
        group.d = groupsGroupDto.i();
        String p = groupsGroupDto.p();
        if (p == null) {
            p = "";
        }
        group.h = p;
        BaseBoolIntDto D = groupsGroupDto.D();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        group.i = D == baseBoolIntDto;
        group.j = groupsGroupDto.G() == baseBoolIntDto;
        GroupsGroupAdminLevelDto d2 = groupsGroupDto.d();
        Integer valueOf = d2 != null ? Integer.valueOf(d2.i()) : null;
        group.s = valueOf != null ? valueOf.intValue() : 0;
        GroupsGroupIsClosedDto F = groupsGroupDto.F();
        Integer valueOf2 = F != null ? Integer.valueOf(F.i()) : null;
        group.m = valueOf2 != null ? valueOf2.intValue() : 0;
        group.o = groupsGroupDto.e();
        group.f = groupsGroupDto.o();
        group.e = zm00.c(groupsGroupDto.o(), groupsGroupDto.n(), groupsGroupDto.j(), groupsGroupDto.k());
        group.g = zm00.a(groupsGroupDto.o(), groupsGroupDto.n(), groupsGroupDto.j(), groupsGroupDto.k(), groupsGroupDto.l());
        group.p = zm00.d(groupsGroupDto.B());
        Integer u = groupsGroupDto.u();
        group.q = u != null ? u.intValue() : 0;
        Integer f2 = groupsGroupDto.f();
        group.r = f2 != null ? f2.intValue() : 0;
        group.y.b = groupsGroupDto.C() == baseBoolIntDto;
        group.D = groupsGroupDto.M() == baseBoolIntDto;
        group.n0 = epx.f(groupsGroupDto.K(), Boolean.TRUE);
        return group;
    }

    public static Podcast u(PodcastPodcastDto podcastPodcastDto) {
        UserId userId;
        ArrayList arrayList;
        Boolean l2;
        Boolean j2;
        AudioPlaylistPermissionsDto e2;
        List<AudioPhotoDto> k2;
        Integer f2;
        boolean z = false;
        int id = podcastPodcastDto != null ? podcastPodcastDto.getId() : 0;
        if (podcastPodcastDto == null || (userId = podcastPodcastDto.q()) == null) {
            userId = new UserId(0L);
        }
        UserId userId2 = userId;
        String g2 = podcastPodcastDto != null ? podcastPodcastDto.g() : null;
        if (g2 == null) {
            g2 = "";
        }
        int intValue = (podcastPodcastDto == null || (f2 = podcastPodcastDto.f()) == null) ? 0 : f2.intValue();
        if (podcastPodcastDto == null || (k2 = podcastPodcastDto.k()) == null) {
            arrayList = null;
        } else {
            List<AudioPhotoDto> list = k2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(sdy.r((AudioPhotoDto) it.next()));
            }
            arrayList = new ArrayList(arrayList2);
        }
        PlaylistPermissions p = (podcastPodcastDto == null || (e2 = podcastPodcastDto.e()) == null) ? null : gcd0.p(e2);
        boolean booleanValue = (podcastPodcastDto == null || (j2 = podcastPodcastDto.j()) == null) ? false : j2.booleanValue();
        String i2 = podcastPodcastDto != null ? podcastPodcastDto.i() : null;
        if (i2 == null) {
            i2 = "";
        }
        boolean h1 = podcastPodcastDto != null ? podcastPodcastDto.h1() : true;
        boolean U = podcastPodcastDto != null ? podcastPodcastDto.U() : false;
        String r = podcastPodcastDto != null ? podcastPodcastDto.r() : null;
        if (podcastPodcastDto != null && (l2 = podcastPodcastDto.l()) != null) {
            z = l2.booleanValue();
        }
        boolean z2 = z;
        String d2 = podcastPodcastDto != null ? podcastPodcastDto.d() : null;
        return new Podcast(id, userId2, g2, intValue, arrayList, p, booleanValue, i2, d2 == null ? "" : d2, h1, U, r, z2);
    }

    public static boolean v(int i2, long j2, Msg msg, c400 c400Var, f400 f400Var) {
        Map map = (Map) c400Var.j.get(Long.valueOf(j2));
        if ((map != null ? (Msg) map.get(Integer.valueOf(i2)) : null) != null) {
            return false;
        }
        if (msg != null) {
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel == null) {
                return false;
            }
            ArrayList Zb = msgFromChannel.Zb();
            if (Zb.isEmpty()) {
                return false;
            }
            Iterator it = Zb.iterator();
            while (it.hasNext()) {
                Attach attach = (Attach) it.next();
                if (!(attach instanceof AttachVideo) && !(attach instanceof AttachVideoMsg)) {
                }
            }
            return false;
        }
        f400Var.b(i2, j2);
        return true;
    }

    public static final String w(Throwable th) {
        String A = mnh0.A(th);
        return A.substring(0, Math.min(A.length(), 2000));
    }

    public static final rw6 x(efj efjVar, List list, float f2, z190 z190Var, PictureRadius pictureRadius, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i2) {
        efj efjVar2;
        List list2;
        float f3;
        z190 z190Var2;
        PictureRadius pictureRadius2;
        SemanticsConfiguration semanticsConfiguration2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1116470214, i2, -1, "com.vk.core.compose.component.banner.remember (BeforePictureImpl.kt:93)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            efjVar2 = efjVar;
            list2 = list;
            f3 = f2;
            z190Var2 = z190Var;
            pictureRadius2 = pictureRadius;
            semanticsConfiguration2 = semanticsConfiguration;
            rw6 rw6Var = new rw6(efjVar2, f3, list2, z190Var2, pictureRadius2, semanticsConfiguration2);
            aVar.R(rw6Var);
            x = rw6Var;
        } else {
            efjVar2 = efjVar;
            list2 = list;
            f3 = f2;
            z190Var2 = z190Var;
            pictureRadius2 = pictureRadius;
            semanticsConfiguration2 = semanticsConfiguration;
        }
        rw6 rw6Var2 = (rw6) x;
        ((zak0) rw6Var2.a).setValue(efjVar2);
        ((zak0) rw6Var2.c).setValue(new pco(f3));
        ((zak0) rw6Var2.d).setValue(new wow(list2));
        ((zak0) rw6Var2.f).setValue(pictureRadius2);
        ((zak0) rw6Var2.e).setValue(z190Var2);
        ((zak0) rw6Var2.g).setValue(null);
        ((zak0) rw6Var2.b).setValue(semanticsConfiguration2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rw6Var2;
    }

    public static final void y(ImStickerView imStickerView, ColorFilter colorFilter, tt30 tt30Var, d2l0 d2l0Var) {
        StickerAnimationState stickerAnimationState;
        imStickerView.setDarkTheme(Boolean.valueOf((tt30Var.f() && !tt30Var.g()) || (tt30Var.e() && tt30Var.g()) || tt30Var.c() || dhr0.M()));
        if (!tt30Var.p()) {
            colorFilter = null;
        }
        imStickerView.setColorFilter(colorFilter);
        if (d2l0Var == null || (stickerAnimationState = d2l0Var.c()) == null) {
            stickerAnimationState = StickerAnimationState.DISABLE;
        }
        imStickerView.setAnimationState(stickerAnimationState);
    }

    public static final void z(Context context, VKApiExecutionException vKApiExecutionException) {
        if (vKApiExecutionException == null || context == null) {
            return;
        }
        j03.i(context, vKApiExecutionException);
    }

    @Override // xsna.tg60
    public io.reactivex.rxjava3.internal.operators.observable.j1 a(vg60 vg60Var) {
        kf60 kf60Var = new kf60(vg60Var.d, vg60Var.a, vg60Var.b, vg60Var.e, vg60Var.k);
        kf60Var.f = vg60Var.h;
        kf60Var.g = vg60Var.i;
        kf60Var.h = vg60Var.j;
        kf60Var.k = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        kf60Var.i = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        kf60Var.j = jSONObject != null ? jSONObject.toString() : null;
        return rsg0.y0(kf60Var.a(), null, null, 3).U(new ie40(new hyu(9), 1));
    }

    public Uri g(w2w w2wVar, Uri uri, File file, f8r f8rVar, qr6 qr6Var) throws InterruptedException, ImEngineException {
        if (!f8rVar.b(w2wVar.getContext(), uri)) {
            return uri;
        }
        try {
            kb9 kb9Var = new kb9(new ksj(f8rVar, w2wVar, uri, file, qr6Var, 0));
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"ConvertUtils", "submit converting command with params filePathUri: " + uri + ", outputFile: " + file + ", queueName: im-file-convert"});
            }
            return (Uri) w2wVar.J0(this, kb9Var).await();
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ImEngineException("Unable to convert file", e3);
        }
    }

    public rte0(vg20 vg20Var) {
    }
}

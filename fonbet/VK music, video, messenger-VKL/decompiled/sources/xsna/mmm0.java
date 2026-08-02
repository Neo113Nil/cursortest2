package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.ui.components.contact.vc.UserProfileView;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.h;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeSuperappSnowItem;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Ref$LongRef;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import xsna.ab9;
import xsna.fxw0;
import xsna.gm50;
import xsna.iyq0;
import xsna.mmo0;
import xsna.mot0;
import xsna.sbo0;
import xsna.svq0;
import xsna.tra0;
import xsna.tww0;
import xsna.w1o0;
import xsna.xcw0;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mmm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mmm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v119, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v74, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [io.reactivex.rxjava3.internal.operators.single.d] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                return io.reactivex.rxjava3.core.q.O(((smm0) this.c).i);
            case 1:
                ((SuperAppAnimation) this.c).d();
                vvr0.c();
                new sbn0(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeSuperappSnowItem(SchemeStat$TypeSuperappSnowItem.Type.SHAKE), 3)).q();
                SuperAppAnimation.j = true;
                return s3q0.a;
            case 2:
                y9n0 y9n0Var = (y9n0) this.c;
                ?? d = ((Result) obj).d();
                return y9n0Var.g(d instanceof Result.Failure ? null : d);
            case 3:
                bn50 bn50Var = (bn50) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), new e2o0());
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new w1o0.a(bn50Var));
                return s3q0.a;
            case 4:
                sbo0 sbo0Var = (sbo0) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                sbo0.a aVar = sbo0Var.F;
                if (aVar != null) {
                    izs<? super sbo0.a, s3q0> izsVar = sbo0Var.B;
                    if (izsVar != null) {
                        izsVar.invoke(aVar);
                    }
                    sbo0.a aVar2 = sbo0Var.F;
                    if (aVar2 != null) {
                        aVar2.c = booleanValue;
                    }
                    itl.f(sbo0Var).R();
                    itl.f(sbo0Var).Q();
                    mio.a(sbo0Var);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 5:
                mmo0 mmo0Var = (mmo0) this.c;
                String str = ((us2) obj).c;
                mmo0.a aVar3 = mmo0Var.B;
                if (aVar3 == null) {
                    mmo0.a aVar4 = new mmo0.a(mmo0Var.p, str);
                    eh90 eh90Var = new eh90(str, mmo0Var.q, mmo0Var.r, mmo0Var.s, mmo0Var.t, mmo0Var.u, mmo0Var.v);
                    eh90Var.d(mmo0Var.i2().i);
                    aVar4.d = eh90Var;
                    mmo0Var.B = aVar4;
                } else if (!epx.f(str, aVar3.b)) {
                    aVar3.b = str;
                    eh90 eh90Var2 = aVar3.d;
                    if (eh90Var2 != null) {
                        eh90Var2.f(str, mmo0Var.q, mmo0Var.r, mmo0Var.s, mmo0Var.t, mmo0Var.u, mmo0Var.v);
                    }
                }
                itl.f(mmo0Var).R();
                itl.f(mmo0Var).Q();
                mio.a(mmo0Var);
                return Boolean.TRUE;
            case 6:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                h.a aVar5 = (h.a) obj;
                int i = UserProfileFragment.p0;
                gm50.a.a(userProfileFragment, aVar5.b, new j6l0(userProfileFragment, 12));
                gm50.a.a(userProfileFragment, aVar5.a, new bnc0(userProfileFragment, 17));
                gm50.a.a(userProfileFragment, aVar5.c, new xvl0(userProfileFragment, 9));
                int i2 = 6;
                gm50.a.a(userProfileFragment, aVar5.d, new mdk0(userProfileFragment, i2));
                gm50.a.a(userProfileFragment, aVar5.e, new sxl0(userProfileFragment, i2));
                gm50.a.a(userProfileFragment, aVar5.f, new ndg0(i2, aVar5, userProfileFragment));
                gm50.a.a(userProfileFragment, aVar5.g, new bl30(userProfileFragment, 28));
                gm50.a.a(userProfileFragment, aVar5.i, new ujm0(userProfileFragment, i2));
                return s3q0.a;
            case 7:
                ((isq0) this.c).c(new svq0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 8:
                UserProfileView userProfileView = (UserProfileView) this.c;
                int i3 = UserProfileView.N;
                userProfileView.getClass();
                return s3q0.a;
            case 9:
                ((hyq0) this.c).T(new iyq0.a((String) obj));
                return s3q0.a;
            case 10:
                return Boolean.valueOf(!g5g.D(((g2r0) this.c).c, true, new fuc0((kym0) obj, 21)));
            case 11:
                s22 s22Var = ((x6r0) this.c).f;
                s22Var.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    g5g.y(s22Var.c(null, (UIBlock) it.next()), arrayList);
                }
                return arrayList;
            case 12:
                ((VideoAuthorView) this.c).e.invoke(VideoAuthorView.Action.Notifications);
                return s3q0.a;
            case 13:
                return ((e520) i7o0.a(((av20) this.c).i).get(((Integer) obj).intValue())).k;
            case 14:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.l.f(booleanValue2));
                return s3q0.a;
            case 15:
                Context context = (Context) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarVh) this.c).o;
                VideoAlbum videoAlbum2 = videoAlbum != null ? videoAlbum : null;
                mot0.b(mot0.a.a, context, videoAlbum2.c, videoAlbum2.b, null, 24);
                return s3q0.a;
            case 16:
                ((kkt0) this.c).e.invoke();
                return s3q0.a;
            case 17:
                ((tra0.a) obj).q((tra0) this.c, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 18:
                peu0 peu0Var = (peu0) this.c;
                peu0Var.b = (wav0) obj;
                peu0Var.c = SystemClock.elapsedRealtime();
                return s3q0.a;
            case 19:
                yzu0 yzu0Var = (yzu0) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiException) {
                    yzu0Var.b.R0((VKApiException) th);
                }
                return s3q0.a;
            case 20:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.c;
                Throwable th2 = (Throwable) obj;
                io.reactivex.rxjava3.internal.operators.single.q i5 = io.reactivex.rxjava3.core.x.i(th2);
                if ((th2 instanceof IOException) || ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == -1)) {
                    long currentTimeMillis = 1000 - (System.currentTimeMillis() - ref$LongRef.element);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    i5 = new io.reactivex.rxjava3.internal.operators.single.d(i5, currentTimeMillis, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true);
                }
                return i5.q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b());
            case 21:
                return new d7w0((ViewGroup) obj, (b8w0) this.c);
            case 22:
                L.f("VoipCallHints", "Can't get info about screen share initiator " + ((CallMemberId) this.c), (Throwable) obj);
                return s3q0.a;
            case 23:
                com.vk.voip.ui.actions.feature.c cVar = (com.vk.voip.ui.actions.feature.c) this.c;
                djw0 djw0Var = (djw0) obj;
                cVar.g.onNext(djw0Var);
                cVar.f = djw0Var;
                return s3q0.a;
            case 24:
                rnw0 rnw0Var = (rnw0) this.c;
                MasksWrap masksWrap = rnw0Var.g;
                Mask mask = rnw0Var.p;
                if (mask == null) {
                    int i6 = MasksWrap.e0;
                    masksWrap.I(true);
                } else {
                    masksWrap.z(mask);
                }
                rnw0Var.f(mask != null ? mask.Db() : null);
                rnw0Var.d.b.invoke().tn();
                return s3q0.a;
            case 25:
                ((nrw0) this.c).q(new xcw0.l0(MediaDumpManager.Source.IN_ENTER_PROCESSING));
                return s3q0.a;
            case 26:
                fxw0.a aVar6 = (fxw0.a) obj;
                tww0.l lVar = (tww0.l) ((tww0) this.c);
                if (lVar instanceof tww0.l.b) {
                    return fxw0.a.a(aVar6, null, null, 0L, 0L, null, null, null, null, false, false, false, false, true, null, null, null, null, false, null, null, false, false, 33521663);
                }
                if (lVar instanceof tww0.l.a) {
                    return fxw0.a.a(aVar6, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33521663);
                }
                throw new NoWhenBranchMatchedException();
            default:
                lcx0 lcx0Var = (lcx0) this.c;
                ybx0 ybx0Var = (ybx0) obj;
                if (ybx0Var.c) {
                    dhw0 L = com.vk.voip.ui.c.b.L();
                    Context context2 = lcx0Var.c;
                    while (true) {
                        z = context2 instanceof FragmentActivity;
                        if (!z && (context2 instanceof ContextWrapper)) {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                    Activity activity = z ? (Activity) context2 : null;
                    if (L != null && activity != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) activity;
                        UserId userId = L.O ? L.M : null;
                        int i7 = ab9.q1;
                        new ab9.a(fragmentActivity, userId).I0("VoipSelectMovieDialogFragment");
                        com.vk.voip.ui.c.b.getClass();
                        ((ubx0) com.vk.voip.ui.c.z.getValue()).d();
                    }
                } else {
                    Toast.makeText(lcx0Var.c, !ybx0Var.d ? R.string.voip_watch_together_feature_disabled_media_option_click : R.string.voip_watch_together_feature_disabled_roles_click, 1).show();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ mmm0(www0 www0Var, tww0 tww0Var) {
        this.b = 26;
        this.c = tww0Var;
    }
}

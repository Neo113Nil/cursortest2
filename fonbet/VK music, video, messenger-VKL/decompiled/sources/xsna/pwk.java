package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.auth.validation.VkBanRouterInfo;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.feed.settings.impl.base.fragment.FilterListFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;
import xsna.a2y;
import xsna.acx;
import xsna.f6u;
import xsna.m5u;
import xsna.mt00;
import xsna.o0r0;
import xsna.o34;
import xsna.vzx;
import xsna.xn50;
import xsna.zbi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pwk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        Object obj2;
        Attach attach;
        Attachment b;
        Uri fromFile;
        FragmentActivity fragmentActivity;
        VkUiView view;
        Context B0;
        boolean z;
        int i = this.b;
        int i2 = 10;
        boolean z2 = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((rwk) obj3).c.b((SQLiteDatabase) obj);
                return s3q0.a;
            case 1:
                ebm ebmVar = (ebm) obj3;
                Throwable th = (Throwable) obj;
                ibm ibmVar = ebmVar.o;
                if (ibmVar != null) {
                    ibmVar.a(null);
                }
                if (ebmVar.o != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 2:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.L;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) obj3) {
                    if (!list.contains(Integer.valueOf(((Number) obj4).intValue()))) {
                        arrayList.add(obj4);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return bVar;
                }
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.addAll(arrayList);
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, arrayList2, 0, false, false, null, null, 0, null, 0, -1, 2097135);
            case 3:
                ((e4n) obj3).m = null;
                return s3q0.a;
            case 4:
                y9n y9nVar = (y9n) obj3;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = y9nVar.H;
                if (nonBouncedAppBarLayout == null || !nonBouncedAppBarLayout.f()) {
                    NonBouncedAppBarLayout nonBouncedAppBarLayout2 = y9nVar.H;
                    if (nonBouncedAppBarLayout2 != null) {
                        nonBouncedAppBarLayout2.h(true, true, true);
                    }
                    VkRecyclerPaginatedView vkRecyclerPaginatedView = y9nVar.K;
                    if (vkRecyclerPaginatedView != null && (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) != null) {
                        recyclerView.scrollToPosition(0);
                    }
                } else {
                    y9nVar.A();
                }
                return s3q0.a;
            case 5:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) obj3;
                int i3 = DisplayAudioBookChaptersFragment.b0;
                String i4 = ((l2v0) obj).i();
                if (i4 != null) {
                    maz.c(displayAudioBookChaptersFragment.go().p().e(), displayAudioBookChaptersFragment.requireContext(), i4, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 6:
                return new s840((ViewGroup) obj, ((f0p) obj3).N);
            case 7:
                wjp wjpVar = ((ikp) obj3).h;
                if (wjpVar != null) {
                    wjpVar.r1();
                }
                return s3q0.a;
            case 8:
                ((EnterProfilePresenter) obj3).e.e(AuthStatSender.Screen.NAME);
                return s3q0.a;
            case 9:
                return kfq.a((kfq) obj3, (Integer) obj);
            case 10:
                return v0r.p((v0r) obj3, (Context) obj, "Иван", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", false, 32);
            case 11:
                int i5 = FilterListFragment.R0;
                xwk.e().m(((FilterListFragment) obj3).requireContext(), ((UserProfile) obj).c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 12:
                return new o990((ViewGroup) obj, ((f3s) obj3).i);
            case 13:
                evs evsVar = (evs) obj3;
                evsVar.N().a(true);
                evsVar.a(new acx.g(!evsVar.l.a.a, true, false));
                return s3q0.a;
            case 14:
                List<lif0> list2 = (List) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                yv50 fo = ((GeoFragment) obj3).fo();
                Map<StringId, List<pub0>> map = fo.D;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"rects.size = " + list2.size()});
                }
                Iterator<List<pub0>> it = map.values().iterator();
                while (it.hasNext()) {
                    for (pub0 pub0Var : it.next()) {
                        pub0Var.getClass();
                        try {
                            pub0Var.a.zzo();
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    }
                }
                map.clear();
                s9u s9uVar = fo.F;
                if (s9uVar != null) {
                    map.clear();
                    for (lif0 lif0Var : list2) {
                        PolygonOptions polygonOptions = new PolygonOptions();
                        Random.b.getClass();
                        gg ggVar = Random.c;
                        polygonOptions.e = Color.argb(255, ggVar.k(256), ggVar.k(256), ggVar.k(256));
                        polygonOptions.d = cn70.c(1);
                        polygonOptions.g = VisibleStyle.k(268435464);
                        polygonOptions.b.addAll(Arrays.asList(new LatLng(lif0Var.k(), lif0Var.f()), new LatLng(lif0Var.k(), lif0Var.g()), new LatLng(lif0Var.l(), lif0Var.g()), new LatLng(lif0Var.l(), lif0Var.f()), new LatLng(lif0Var.k(), lif0Var.f())));
                        BoundingBox boundingBox = lif0Var instanceof BoundingBox ? (BoundingBox) lif0Var : null;
                        if (boundingBox != null) {
                            q7o.k(boundingBox);
                        }
                        try {
                            pub0 pub0Var2 = new pub0(s9uVar.a.r(polygonOptions));
                            try {
                                map.put(new StringId(pub0Var2.a.zzk()), Collections.singletonList(pub0Var2));
                            } catch (RemoteException e2) {
                                throw new RuntimeRemoteException(e2);
                            }
                        } catch (RemoteException e3) {
                            throw new RuntimeRemoteException(e3);
                        }
                    }
                }
                return s3q0.a;
            case 15:
                awt0.r((am) obj, ((View) obj3).getContext());
                return s3q0.a;
            case 16:
                GoodPreviewFragment goodPreviewFragment = (GoodPreviewFragment) obj3;
                ?? r2 = goodPreviewFragment.R;
                f6u f6uVar = (f6u) obj;
                int i6 = GoodPreviewFragment.X;
                if (f6uVar instanceof f6u.c) {
                    f6u.c cVar = (f6u.c) f6uVar;
                    Good good = cVar.a.a;
                    MarketFavable marketFavable = new MarketFavable(good.b, good.c, null, false, good.J, 8, null);
                    isq.b((isq) ((zqd0) r2.getValue()).g.getValue(), goodPreviewFragment.requireContext(), marketFavable, new zjm(2, goodPreviewFragment, f6uVar), null, null, true, null, null, 472);
                    mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, !cVar.b, CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, null, cVar.d, null, null, null, null, 8112));
                } else if (f6uVar instanceof f6u.a) {
                    UserId userId = (UserId) goodPreviewFragment.requireArguments().getParcelable("owner_id");
                    if (userId == null) {
                        userId = UserId.d;
                    }
                    xn50.a.c(goodPreviewFragment, new m5u.q(userId, goodPreviewFragment.requireArguments().getLong("good_id"), goodPreviewFragment.requireArguments().getInt("item_position")));
                } else {
                    if (!(f6uVar instanceof f6u.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sv9 sv9Var = (sv9) ((zqd0) r2.getValue()).j.getValue();
                    Throwable th2 = ((f6u.b) f6uVar).a;
                    if (!sv9Var.a(goodPreviewFragment.requireContext(), th2)) {
                        h03.b(th2);
                    }
                }
                return s3q0.a;
            case 17:
                ((jcu) obj3).d.invoke(ubu.b);
                return s3q0.a;
            case 18:
                tgu tguVar = (tgu) obj3;
                mfw0 mfw0Var = tguVar.s;
                if (((Boolean) obj).booleanValue()) {
                    View view2 = tguVar.itemView;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = mfw0Var.getState().b ? cn70.b(10) : cn70.b(0);
                    view2.setLayoutParams(marginLayoutParams);
                } else {
                    View view3 = tguVar.itemView;
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = (!mfw0Var.getState().b || ((zzz) tguVar.l.a).isHorizontal()) ? cn70.b(0) : tgu.z;
                    view3.setLayoutParams(marginLayoutParams2);
                }
                return s3q0.a;
            case 19:
                UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) obj3;
                UIBlock uIBlock = (UIBlock) obj;
                if ((uIBlock instanceof UIBlockGroupFilter) && epx.f(((UIBlockGroupFilter) uIBlock).z.b, uIBlockGroupFilter.z.b)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 20:
                return na8.a((int) sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-50, 50, 1)), ((DashedSeekBar) obj3).getContext().getString(R.string.editor_hue), " ");
            case 21:
                swv swvVar = (swv) obj3;
                b180 b180Var = (b180) obj;
                Attach attach2 = b180Var.b;
                ftx0 ftx0Var = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
                File i1 = ftx0Var != null ? ftx0Var.i1() : null;
                Iterator it2 = swvVar.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (epx.f(Uri.parse(((ju90) obj2).getUri()).getPath(), i1 != null ? i1.getPath() : null)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ju90<?> ju90Var = (ju90) obj2;
                if (ju90Var != null && (b180Var instanceof a180) && (b = wdw.b((attach = ((a180) b180Var).b), null, false, 6)) != null) {
                    Iterator<o34.a> it3 = swvVar.b.iterator();
                    while (it3.hasNext()) {
                        it3.next().c(ju90Var, b);
                    }
                    boolean z3 = attach instanceof AttachImage;
                    AttachImage attachImage = z3 ? (AttachImage) attach : null;
                    File file = attachImage != null ? attachImage.l : null;
                    String uri = (file == null || (fromFile = Uri.fromFile(file)) == null) ? null : fromFile.toString();
                    if (uri != null) {
                        AttachImage attachImage2 = z3 ? (AttachImage) attach : null;
                        swvVar.d.a(uri).a(new nt8(attachImage2 != null ? Long.valueOf(attachImage2.e) : null));
                    }
                }
                return s3q0.a;
            case 22:
                com.vk.update.core.a aVar = (com.vk.update.core.a) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.O(aVar.e), new ju1(new gzn(i2), 28)).x(new gv(new cqv(aVar, 3), 24));
                }
                aVar.i.invoke(Boolean.FALSE);
                return io.reactivex.rxjava3.internal.operators.observable.l1.b;
            case 23:
                JoinCallFragment joinCallFragment = (JoinCallFragment) obj3;
                vzx vzxVar = (vzx) obj;
                int i7 = JoinCallFragment.U;
                if (!(vzxVar instanceof vzx.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                enj.r(joinCallFragment.requireContext(), j03.g(joinCallFragment.mo2getContext(), ((vzx.a) vzxVar).a, R.string.error), 0);
                return s3q0.a;
            case 24:
                a2y a2yVar = (a2y) obj3;
                Throwable th3 = (Throwable) obj;
                xwv0 xwv0Var = (xwv0) a2yVar.c.invoke();
                if (xwv0Var == null || (view = xwv0Var.getView()) == null || (B0 = view.B0()) == null) {
                    fragmentActivity = null;
                } else {
                    while (true) {
                        z = B0 instanceof FragmentActivity;
                        if (!z && (B0 instanceof ContextWrapper)) {
                            B0 = ((ContextWrapper) B0).getBaseContext();
                        }
                    }
                    fragmentActivity = (FragmentActivity) (z ? (Activity) B0 : null);
                }
                if (fragmentActivity == null) {
                    par0.a.getClass();
                    par0.b("Activity is null, wtf?");
                    a2yVar.c(th3);
                    return s3q0.a;
                }
                a2y.b bVar2 = new a2y.b(1, a2yVar, a2y.class, "runAuth", "runAuth(Lio/reactivex/rxjava3/core/Observable;)V", 0);
                r55 r55Var = r55.a;
                umu0 umu0Var = r55.g;
                tmu0 tmu0Var = (umu0Var != null ? umu0Var : null).k;
                com.vk.auth.validation.a aVar2 = new com.vk.auth.validation.a(fragmentActivity);
                e4a0 e4a0Var = new e4a0(fragmentActivity, bVar2);
                if (th3 instanceof AuthException.DeactivatedUserException) {
                    th3 = AuthException.DeactivatedUserException.a((AuthException.DeactivatedUserException) th3, a2yVar.a);
                }
                VkAuthMetaInfo b2 = a2yVar.b();
                a2y.c cVar2 = new a2y.c(1, a2yVar, a2y.class, "onSuccess", "onSuccess(Lcom/vk/auth/api/models/AuthResult;)V", 0);
                a2y.d dVar = new a2y.d(0, a2yVar, a2y.class, "onUserDenied", "onUserDenied()V", 0);
                if (th3 instanceof AuthException.PhoneValidationRequiredException) {
                    AuthException.PhoneValidationRequiredException phoneValidationRequiredException = (AuthException.PhoneValidationRequiredException) th3;
                    q55.a(new d4a0(e4a0Var.a.getApplicationContext(), b2, phoneValidationRequiredException.h(), phoneValidationRequiredException.g(), bVar2, dVar));
                    VkValidatePhoneInfo a = VkValidatePhoneInfo.a.a(phoneValidationRequiredException.k(), phoneValidationRequiredException.j(), phoneValidationRequiredException.i(), phoneValidationRequiredException.d(), true);
                    if (a instanceof VkValidatePhoneInfo.ConfirmPhone) {
                        VkValidatePhoneInfo.ConfirmPhone confirmPhone = (VkValidatePhoneInfo.ConfirmPhone) a;
                        aVar2.D0(new PhoneValidationContract$ValidationDialogMetaInfo(confirmPhone.d, confirmPhone.c, confirmPhone.b, confirmPhone.e, confirmPhone.f));
                    } else {
                        com.vk.auth.validation.b.a(r55.d, fragmentActivity, a, 48);
                    }
                } else if (th3 instanceof AuthException.NeedSignUpException) {
                    AuthException.NeedSignUpException needSignUpException = (AuthException.NeedSignUpException) th3;
                    VkAdditionalSignUpData vkAdditionalSignUpData = new VkAdditionalSignUpData(needSignUpException.g(), needSignUpException.i(), needSignUpException.d(), needSignUpException.h(), b2, needSignUpException.k(), new SignUpAgreementInfo(needSignUpException.l(), needSignUpException.j()));
                    q55.a(new c1v0(dVar, cVar2));
                    aVar2.e(vkAdditionalSignUpData);
                } else if (th3 instanceof AuthException.DeactivatedUserException) {
                    AuthException.DeactivatedUserException deactivatedUserException = (AuthException.DeactivatedUserException) th3;
                    VkPassportRouterInfo vkPassportRouterInfo = new VkPassportRouterInfo(deactivatedUserException.d(), deactivatedUserException.g(), b2, deactivatedUserException.h(), null, 16, null);
                    q55.a(new e1v0(dVar, cVar2));
                    aVar2.c(vkPassportRouterInfo);
                } else if (th3 instanceof AuthException.BannedUserException) {
                    VkBanRouterInfo vkBanRouterInfo = new VkBanRouterInfo(((AuthException.BannedUserException) th3).d(), b2);
                    q55.a(new d1v0(dVar, cVar2));
                    aVar2.b(vkBanRouterInfo);
                } else if (th3 instanceof AuthException.VkEmailSignUpRequiredException) {
                    Serializer.c<CreateVkEmailRequiredData> cVar3 = CreateVkEmailRequiredData.CREATOR;
                    CreateVkEmailRequiredData a2 = CreateVkEmailRequiredData.a.a((AuthException.VkEmailSignUpRequiredException) th3, r55.h().e(), b2);
                    q55.a(new b1v0(dVar, cVar2));
                    aVar2.C0(a2);
                } else {
                    a2yVar.c(th3);
                }
                return s3q0.a;
            case 25:
                return new com.vk.stickers.keyboard.navigation.d((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) obj3).k);
            case 26:
                m1h0 m1h0Var = (m1h0) obj3;
                return Boolean.valueOf(m1h0Var != null ? m1h0Var.a(obj) : true);
            case 27:
                if2 if2Var = (if2) obj3;
                tdu tduVar = (tdu) obj;
                tduVar.A(((Number) if2Var.d()).floatValue());
                tduVar.B(((Number) if2Var.d()).floatValue());
                return s3q0.a;
            case 28:
                LinkVh linkVh = (LinkVh) obj3;
                linkVh.u = (Integer) obj;
                linkVh.a();
                return s3q0.a;
            default:
                ((zdo0) obj3).c(((ov70) obj).a, zbi0.a.a);
                return s3q0.a;
        }
    }
}

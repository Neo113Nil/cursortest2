package xsna;

import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsSliderItemVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ClipVideoFile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.b;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.money.MoneyWebViewFragment;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.fbo.a;
import xsna.j0j;
import xsna.k3z;
import xsna.npf;
import xsna.qn60;
import xsna.vnu;
import xsna.ybp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cqf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NetworkCapabilities failure;
        int i = this.b;
        int i2 = 4;
        boolean z = false;
        r6 = false;
        boolean z2 = false;
        z = false;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((iqf) obj2).C((npf.i) obj);
                return s3q0.a;
            case 1:
                Pair pair = (Pair) obj;
                ClipVideoFile clipVideoFile = (ClipVideoFile) pair.d();
                ceq0 ceq0Var = (ceq0) pair.g();
                if (!j5g.P(((ruf) obj2).a(), ceq0Var != null ? Integer.valueOf(ceq0Var.b()) : null) && fkq0.c(clipVideoFile.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                n2k0 n2k0Var = (n2k0) obj;
                izs<? super n2k0, s3q0> izsVar = ((k3g) obj2).d;
                if (izsVar != null) {
                    izsVar.invoke(n2k0Var);
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((NewsComment) ((iag) obj2)).i == ((NewsComment) ((cbg) obj).a).i);
            case 4:
                NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = ((CommentsOutherFragment) obj2).Z;
                if (newsEntryFeedbackCommentsFragment != null) {
                    lfg lfgVar = newsEntryFeedbackCommentsFragment.C0;
                    (lfgVar != null ? lfgVar : null).H7();
                }
                return s3q0.a;
            case 5:
                ((zak0) ((CommunitiesCatalogRootVh) obj2).Q.i).setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 6:
                ((dxg) obj2).e.invoke();
                return s3q0.a;
            case 7:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj2;
                communityNotificationSettingsFragment.setResult(-1, new Intent().putExtra("id", communityNotificationSettingsFragment.T));
                ((rj70) communityNotificationSettingsFragment.S.getValue()).b();
                communityNotificationSettingsFragment.ho(64L, new mag(communityNotificationSettingsFragment, i2));
                return s3q0.a;
            case 8:
                i1j i1jVar = (i1j) obj2;
                if (((View) obj).isEnabled()) {
                    i1jVar.e.invoke(j0j.a.b);
                }
                return s3q0.a;
            case 9:
                CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) obj2;
                int i4 = CreatePeopleTransferFragment.B0;
                MoneyWebViewFragment.wo(createPeopleTransferFragment, (String) obj);
                dw20 dw20Var = createPeopleTransferFragment.z0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 10:
                return (io.reactivex.rxjava3.core.q) obj2;
            case 11:
                try {
                    failure = ((whl) obj2).b().getNetworkCapabilities((Network) obj);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                NetworkCapabilities networkCapabilities = failure instanceof Result.Failure ? null : failure;
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 12:
                ArrayList arrayList = (ArrayList) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                int size = arrayList.size();
                int i5 = 0;
                for (Object obj3 : arrayList) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    xgl0Var.b().e().f(size - i5, ((com.vk.im.engine.models.dialogs.b) obj3).b);
                    i5 = i6;
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.b) it.next()).b));
                }
                return (Map) xgl0Var.u(new mmm(xgl0Var, arrayList2, z, z ? 1 : 0));
            case 13:
                cn o = ((b25) ((cwm) obj2).c).o();
                return new sr5(o.b, o.c, o.j);
            case 14:
                h8n h8nVar = (h8n) obj2;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                e9n e9nVar = h8nVar.f;
                e9nVar.b.a();
                qn60 qn60Var = e9nVar.a;
                aic aicVar = new aic();
                nn50 nn50Var = h8nVar.b;
                ArrayList u0 = j5g.u0(newsEntriesContainer.c, ((l8n) nn50Var.getCurrentState()).d);
                pn60 pn60Var = e9nVar.b;
                xc3 xc3Var = new xc3(u0, null, pn60Var, h8nVar.h, null, true, null);
                xwi xwiVar = new xwi(new t7q(((l8n) nn50Var.getCurrentState()).d, pn60Var, ((l8n) nn50Var.getCurrentState()).i), ((l8n) nn50Var.getCurrentState()).j);
                NewsEntry newsEntry = (NewsEntry) j5g.a0(((l8n) nn50Var.getCurrentState()).d);
                s1q s1qVar = e9nVar.i.f;
                return new io.reactivex.rxjava3.internal.operators.single.b(new g8n(qn60Var, new qn60.b[]{aicVar, xc3Var, xwiVar, new xwi(new k1g0(newsEntry, s1qVar, pn60Var), s1qVar != null)})).l(new ql2(new hxl(newsEntriesContainer, i3), 15));
            case 15:
                dwj dwjVar = (dwj) obj;
                dwjVar.m(myc0.h(dwjVar.getScope(), null, null, ((fbo) obj2).new a(null), 3));
                return null;
            case 16:
                String str = ((eq3) obj2).b;
                ((WebView) obj).loadDataWithBaseURL(str, zr.a("<head>\n      <meta name='viewport' content='width=device-width, initial-scale=1'>\n      <body style='margin:0px;padding:0px;'>\n      <iframe\n        width=\"100%\"\n        height=\"100%\"\n        src=\"", str, "\"\n        frameborder=\"0\"\n        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"\n        referrerpolicy=\"strict-origin-when-cross-origin\"\n        allowfullscreen\n      >\n      </iframe>\n      </body>\n      </head>"), "text/html", C.UTF8_NAME, null);
                return s3q0.a;
            case 17:
                ((VkEcosystemProfileButtonView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2).h.getValue()).setLogoStyle((LogoStyle) obj);
                return s3q0.a;
            case 18:
                ubp ubpVar = (ubp) obj2;
                ubpVar.a().i(ubpVar.c);
                ubpVar.j = true;
                ubpVar.d.invoke(new ybp.b(true, ubpVar.b));
                VkModal vkModal = ubpVar.h;
                if (vkModal != null) {
                    vkModal.a();
                }
                return s3q0.a;
            case 19:
                vtm vtmVar = vtm.this;
                DialogsFilter dialogsFilter = DialogsFilter.REQUESTS;
                DialogsFilterChangeSource dialogsFilterChangeSource = DialogsFilterChangeSource.LIST_EMPTY;
                xtm xtmVar = vtmVar.F;
                if (xtmVar != null) {
                    xtmVar.b(dialogsFilter, dialogsFilterChangeSource);
                }
                return s3q0.a;
            case 20:
                return ukq.P4((ukq) obj2);
            case 21:
                ((gzs) obj2).invoke();
                return Boolean.TRUE;
            case 22:
                FriendsSliderItemVh friendsSliderItemVh = (FriendsSliderItemVh) obj2;
                ny3 ny3Var = (ny3) obj;
                VkText vkText = (VkText) ny3Var.findViewById(R.id.title);
                vkText.setMaxLines(2);
                friendsSliderItemVh.e = vkText;
                friendsSliderItemVh.f = (VkAvatar) ny3Var.findViewById(R.id.avatar);
                ny3Var.setOnClickListener(new c98(friendsSliderItemVh, i3));
                return s3q0.a;
            case 23:
                GoodFragment goodFragment = (GoodFragment) obj2;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                L.j((Throwable) obj, "Failed to observe data loading");
                c4u a = goodFragment.Lo().a();
                cxo Po = goodFragment.Po();
                a.getClass();
                c4u.c(Po);
                goodFragment.Lo().a().c.onNext(b.a.a);
                return s3q0.a;
            case 24:
                GroupedNotificationListFragment groupedNotificationListFragment = (GroupedNotificationListFragment) obj2;
                vnu vnuVar = (vnu) obj;
                int i7 = GroupedNotificationListFragment.Y;
                if (vnuVar.equals(vnu.b.a)) {
                    groupedNotificationListFragment.finish();
                } else if (vnuVar instanceof vnu.c) {
                    ui70 ui70Var = (ui70) groupedNotificationListFragment.V.getValue();
                    groupedNotificationListFragment.requireContext();
                    vnu.c cVar = (vnu.c) vnuVar;
                    oz50 h = ui70Var.h(cVar.a, cVar.b);
                    if (h != null) {
                        h.g(2, groupedNotificationListFragment);
                    }
                } else {
                    if (!(vnuVar instanceof vnu.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ia70) groupedNotificationListFragment.X.getValue()).a(((vnu.a) vnuVar).a, groupedNotificationListFragment.requireContext());
                }
                return s3q0.a;
            case 25:
                com.vk.im.design.view.pagination.pin.c cVar2 = (com.vk.im.design.view.pagination.pin.c) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                m9b m9bVar = cVar2.j;
                bcr0<? extends ImageView> bcr0Var = cVar2.k;
                if (bcr0Var != null) {
                    return new com.vk.im.design.view.pagination.pin.a(m9bVar, bcr0Var, viewGroup);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                brw brwVar = (brw) obj2;
                arg0 arg0Var = new arg0((AppCompatActivity) obj, brwVar);
                brwVar.d = new bm01(arg0Var.f);
                return arg0Var;
            case 27:
                ((wzx) obj2).c.invoke(dzx.b);
                return s3q0.a;
            case 28:
                k3z k3zVar = (k3z) obj2;
                vbu0 vbu0Var = (vbu0) obj;
                CheckPresenterInfo checkPresenterInfo = k3zVar.z;
                k3zVar.F.c(vbu0Var.b != null);
                if (checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth) {
                    k3zVar.Z0();
                    SignUpDataHolder signUpDataHolder = k3zVar.p;
                    (signUpDataHolder != null ? signUpDataHolder : null).o = vbu0Var.a;
                    (signUpDataHolder != null ? signUpDataHolder : null).q = vbu0Var.d;
                    (signUpDataHolder != null ? signUpDataHolder : null).r = vbu0Var.e;
                    (signUpDataHolder != null ? signUpDataHolder : null).x = vbu0Var.f;
                    (signUpDataHolder != null ? signUpDataHolder : null).f = true;
                    (signUpDataHolder != null ? signUpDataHolder : null).J = vbu0Var.h;
                    SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = vbu0Var.j;
                    if (signUpIncompleteFieldsModel != null) {
                        (signUpDataHolder != null ? signUpDataHolder : null).w = signUpIncompleteFieldsModel;
                        if (signUpDataHolder == null) {
                            signUpDataHolder = null;
                        }
                        signUpDataHolder.u = signUpIncompleteFieldsModel.Ab();
                    }
                    int i8 = k3z.c.$EnumSwitchMapping$1[k3zVar.W.ordinal()];
                    if (i8 == 1) {
                        VerificationScreenData verificationScreenData = ((CheckPresenterInfo.MethodSelectorAuth) checkPresenterInfo).b;
                        com.vk.auth.main.e eVar = k3zVar.o;
                        if (eVar == null) {
                            eVar = null;
                        }
                        eVar.f(verificationScreenData, vbu0Var, k3zVar.w, null);
                        SignUpDataHolder signUpDataHolder2 = k3zVar.p;
                        (signUpDataHolder2 != null ? signUpDataHolder2 : null).e = verificationScreenData.b;
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FullscreenPasswordData fullscreenPasswordData = new FullscreenPasswordData(k3zVar.S, true, k3zVar.T, false, null, false, 48, null);
                        com.vk.auth.main.b bVar = k3zVar.d;
                        (bVar != null ? bVar : null).b1(fullscreenPasswordData);
                    }
                }
                return s3q0.a;
            default:
                return AlbumEntry.a((AlbumEntry) obj2, (List) obj, 0, 59);
        }
    }
}

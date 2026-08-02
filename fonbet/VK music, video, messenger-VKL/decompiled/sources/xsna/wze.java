package xsna;

import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.ui.community.CommunityPickerFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.multiaccount.api.AgeGroup;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.upload.impl.UploadNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.c0f;
import xsna.d4g0;
import xsna.fks;
import xsna.kyg;
import xsna.nxo;
import xsna.odn;
import xsna.tj50;
import xsna.uns;
import xsna.yyg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wze implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wze(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0147, code lost:
    
        if (r12.a().b.b == ((com.vk.superapp.multiaccount.api.SwitcherLaunchMode.SwitcherCallbackMode) r11).c.b) goto L57;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Throwable th;
        mxo mxoVar;
        boolean z;
        int i = this.b;
        Throwable th2 = null;
        boolean z2 = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tj50.a aVar = (tj50.a) obj;
                a0f a0fVar = (a0f) ((xze) obj2).e.getValue();
                a0fVar.getClass();
                int i2 = 12;
                la2 la2Var = new la2(i2);
                ao8 ao8Var = ao8.d;
                return new c0f.a(aVar.a(la2Var, ao8Var), aVar.a(new bz(i2), ao8Var), aVar.a(new g8(i2), ao8Var), aVar.a(new dz(a0fVar, 13), ao8Var), aVar.a(new com.vk.movika.sdk.base.observable.i(a0fVar, 15), ao8Var), aVar.a(new i8(23), ao8Var), aVar.a(new j60(i2), ao8Var));
            case 1:
                int i3 = com.vk.attachpicker.collages.a.k1;
                ((lds0) obj2).g();
                return s3q0.a;
            case 2:
                ((n4g) obj2).b.b(true);
                return s3q0.a;
            case 3:
                mdg mdgVar = (mdg) obj2;
                mdgVar.t8((NewsComment) obj);
                mdgVar.R7(true);
                return s3q0.a;
            case 4:
                String str = (String) obj;
                z8f z8fVar = ((tpg) obj2).h;
                if (z8fVar != null) {
                    z8fVar.invoke(str);
                }
                return s3q0.a;
            case 5:
                yyg yygVar = (yyg) obj2;
                UploadNotification.b bVar = (UploadNotification.b) obj;
                int i4 = bVar.a;
                int i5 = yyg.a.$EnumSwitchMapping$0[bVar.b.ordinal()];
                if (i5 == 1) {
                    yygVar.C(new kyg.d.b(i4));
                } else if (i5 == 2) {
                    Parcelable parcelable = bVar.e;
                    yygVar.C(new kyg.d.a(i4, parcelable instanceof Photo ? (Photo) parcelable : null));
                } else if (i5 == 3) {
                    yygVar.C(new kyg.d.g(i4));
                }
                return s3q0.a;
            case 6:
                VkSimpleButton vkSimpleButton = ((d2h) obj2).o1;
                (vkSimpleButton == null ? null : vkSimpleButton).setEnabled(false);
                return s3q0.a;
            case 7:
                UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = CommunityNameHistoryFragment.S;
                if (booleanValue) {
                    usableRecyclerPaginatedView.lb();
                } else {
                    usableRecyclerPaginatedView.e0();
                }
                return s3q0.a;
            case 8:
                int i7 = CommunityPickerFragment.T;
                ((CommunityPickerFragment) obj2).finish();
                return s3q0.a;
            case 9:
                arh arhVar = (arh) obj2;
                Throwable th3 = (Throwable) obj;
                mzp0 mzp0Var = arhVar.a.c;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                arhVar.h.invoke(new d.i.a(th3));
                return s3q0.a;
            case 10:
                ((osh) obj2).f.invoke(new d.n.a(true));
                return s3q0.a;
            case 11:
                ((zak0) ((ContextMenuScreenContent) obj2).l).setValue((ContextMenuScreenContent.OverlayPosition) obj);
                return s3q0.a;
            case 12:
                rdk rdkVar = (rdk) obj2;
                ((tdk) rdkVar.f.getValue()).e();
                par0.a.getClass();
                par0.d((Throwable) obj);
                rdkVar.a();
                return s3q0.a;
            case 13:
                zhf0 zhf0Var = (zhf0) obj;
                wh50 wh50Var = ((ygk) obj2).n;
                if (((zhf0) ((zak0) wh50Var).getValue()) == null) {
                    ((zak0) wh50Var).setValue(zhf0Var);
                }
                return s3q0.a;
            case 14:
                uvl uvlVar = (uvl) obj2;
                tvl tvlVar = uvlVar.m;
                if (tvlVar != null) {
                    uvlVar.l.a(new d4g0.c(tvlVar.b, tvlVar.c, tvlVar.g));
                }
                return s3q0.a;
            case 15:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj2).e;
                if (efmVar != null) {
                    efmVar.z();
                }
                return s3q0.a;
            case 16:
                bhm bhmVar = (bhm) obj2;
                hpm e = ((xgl0) obj).b().e();
                Peer peer = bhmVar.c;
                DialogMember dialogMember = bhmVar.e;
                Peer peer2 = bhmVar.d;
                com.vk.im.engine.models.dialogs.b c = e.c(peer.b);
                if ((c != null ? c.z : null) == null) {
                    return s3q0.a;
                }
                long j = peer.b;
                if (lnm.a(e, j, Collections.singletonList(peer2), null, 4).b.size() != 0) {
                    e.k(j, dialogMember);
                    return s3q0.a;
                }
                e.k(j, dialogMember);
                peer2.getClass();
                if (!peer2.Ab(Peer.Type.CONTACT)) {
                    e.W(1, j);
                }
                return s3q0.a;
            case 17:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, (PushSettings) obj2, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -8193, 2097151);
            case 18:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj2;
                return (rts) vdg0.c(cVar.d.n(cVar, new zrs(MobileOfficialAppsCoreNavStat$EventScreen.IM, Collections.singletonList(Source.CACHE), false)));
            case 19:
                ((ndn) obj2).T(odn.f.b);
                return s3q0.a;
            case 20:
                mxo mxoVar2 = (mxo) obj2;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    bon0 bon0Var = mxoVar2.l;
                    SwitcherUiMode switcherUiMode = bon0Var.a;
                    com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) j5g.Y(list);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    int i8 = 0;
                    for (Object obj3 : list2) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            Throwable th4 = th2;
                            e43.t();
                            throw th4;
                        }
                        com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) obj3;
                        AgeGroup.a aVar2 = AgeGroup.Companion;
                        AgeGroup ageGroup = fVar2.a().l;
                        aVar2.getClass();
                        boolean b = AgeGroup.a.b(fVar, ageGroup);
                        boolean z3 = (i8 != 0 || (switcherUiMode instanceof SwitcherUiMode.Ecoplate)) ? z2 : true;
                        SwitcherLaunchMode switcherLaunchMode = bon0Var.b;
                        boolean z4 = switcherLaunchMode instanceof SwitcherLaunchMode.SwitcherCallbackMode;
                        if (z4) {
                            th = th2;
                            mxoVar = mxoVar2;
                            break;
                        } else {
                            th = th2;
                            mxoVar = mxoVar2;
                        }
                        if ((switcherUiMode instanceof SwitcherUiMode.Ecoplate) || !z3 || z4) {
                            z = false;
                            boolean z5 = switcherUiMode instanceof SwitcherUiMode.EcoplateRestricted;
                            arrayList.add(new aon0(fVar2, new l0r0(z, (!z5 || (switcherUiMode instanceof SwitcherUiMode.EcoplateLK) || fVar2.a().d()) ? false : true, z3, z5 && !b, b)));
                            i8 = i9;
                            th2 = th;
                            mxoVar2 = mxoVar;
                            z2 = false;
                        }
                        z = true;
                        boolean z52 = switcherUiMode instanceof SwitcherUiMode.EcoplateRestricted;
                        arrayList.add(new aon0(fVar2, new l0r0(z, (!z52 || (switcherUiMode instanceof SwitcherUiMode.EcoplateLK) || fVar2.a().d()) ? false : true, z3, z52 && !b, b)));
                        i8 = i9;
                        th2 = th;
                        mxoVar2 = mxoVar;
                        z2 = false;
                    }
                    mxoVar2.T(new nxo.c(arrayList));
                }
                return s3q0.a;
            case 21:
                o200 o200Var = (o200) ((qop) obj2).a;
                if (o200Var != null) {
                    o200Var.J1();
                }
                return s3q0.a;
            case 22:
                opp oppVar = (opp) obj2;
                if (oppVar.M) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_BIRTHDAY, null, null, null, null, null, null, 254);
                    oppVar.M = false;
                }
                return s3q0.a;
            case 23:
                ((bcq) obj2).h.onNext(new Result(new Result.Failure((Throwable) obj)));
                return s3q0.a;
            case 24:
                ((m6r) obj2).a.d(new PostingAction.Fetch.SettingsLoadingState(LoadingState.ERROR, null, 2, null));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 25:
                fsr presenter = ((gsr) obj2).getPresenter();
                if (presenter != null) {
                    presenter.c0();
                }
                return s3q0.a;
            case 26:
                ((jzr) obj2).a();
                return s3q0.a;
            case 27:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((v1z) obj2).h).setValue(bool);
                return s3q0.a;
            case 28:
                gls glsVar = (gls) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                glsVar.T(new ils(usersUserFullDto));
                wj50<fks> wj50Var = glsVar.h;
                if (wj50Var != null) {
                    wj50Var.b(new fks.a(usersUserFullDto));
                }
                return s3q0.a;
            default:
                ((xms) obj2).j.b(new uns.c.a((Throwable) obj));
                return s3q0.a;
        }
    }
}

package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.easypromote.impl.presentation.b;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.core.serialize.Serializer;
import com.vk.design.demo.presentation.DesignDemoFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.profile.Address;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.instantjobs.InstantJob;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.b;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.e;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesListBehavior;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.bmt;
import xsna.ebm;
import xsna.jkq;
import xsna.l3s;
import xsna.szr;
import xsna.wpa0;
import xsna.y8g;
import xsna.yzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ifg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ifg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Dialog dialog;
        BusinessNotifyInfo Ab;
        int i = 10;
        int i2 = 14;
        switch (this.b) {
            case 0:
                lfg lfgVar = (lfg) this.c;
                int i3 = ((cbg) obj).c;
                lfgVar.getClass();
                return Boolean.valueOf(i3 == 428 || i3 == 430 || i3 == 450 || i3 == 431);
            case 1:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                Address address = (Address) obj;
                communityAddressesFragment.so(false);
                CommunityAddressesFragment.e eVar = communityAddressesFragment.new e();
                CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
                (communityAddressesListBehavior != null ? communityAddressesListBehavior : null).F();
                CommunityAddressesFragment.b bVar = communityAddressesFragment.new b(true, eVar, address);
                communityAddressesFragment.S = bVar;
                bVar.initialize();
                return s3q0.a;
            case 2:
                ((ush) this.c).f.invoke(new d.n.a(false));
                return s3q0.a;
            case 3:
                ((com.vk.profile.community.impl.ui.profile.f) this.c).o.setRefreshing(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 4:
                ((drk) this.c).b.invoke();
                return s3q0.a;
            case 5:
                ((DesignDemoFragment) this.c).R = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 6:
                cam camVar = (cam) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                hpm e = xgl0Var.b().e();
                Peer peer = camVar.d;
                e.h0(peer.b, true);
                com.vk.im.engine.models.dialogs.b c = e.c(peer.b);
                if (c == null) {
                    return null;
                }
                new sum(xgl0Var).a(c);
                return s3q0.a;
            case 7:
                ebm.a aVar = ((ibm) this.c).e;
                if (aVar != null) {
                    ebm ebmVar = ebm.this;
                    ypp yppVar = ebmVar.m.b;
                    if (yppVar != null && (dialog = (Dialog) yppVar.d) != null && (Ab = dialog.Ab()) != null) {
                        long j = Ab.b;
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        Peer b = Peer.a.b(j);
                        if (b != null) {
                            ebmVar.k.b().M(ebmVar.i, b);
                        }
                    }
                }
                return s3q0.a;
            case 8:
                afm afmVar = (afm) this.c;
                Throwable th = (Throwable) obj;
                afm.F.a(th);
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.d(th);
                }
                return s3q0.a;
            case 9:
                Toolbar toolbar = (Toolbar) obj;
                awt0.t(toolbar, new i5(i, toolbar, (kkm) this.c));
                return s3q0.a;
            case 10:
                Toast.makeText(((enm) this.c).itemView.getContext(), "End click listener!", 0).show();
                return s3q0.a;
            case 11:
                npx npxVar = npx.a;
                rtm rtmVar = (rtm) this.c;
                sxp sxpVar = (sxp) obj;
                io.reactivex.rxjava3.subjects.f<zsm> fVar = rtmVar.d;
                if (sxpVar.a() != rtmVar.b || sxpVar.a() == null) {
                    if (sxpVar instanceof i480) {
                        i480 i480Var = (i480) sxpVar;
                        fVar.onNext(new tpx(i480Var.d, i480Var.c));
                    } else {
                        if (sxpVar instanceof l480) {
                            new ArrayList(c5g.u(null, 10));
                            throw null;
                        }
                        if (sxpVar instanceof r480) {
                            fVar.onNext(new o580(((r480) sxpVar).c.k()));
                        } else if ((sxpVar instanceof g480) || (sxpVar instanceof OnCacheInvalidateEvent)) {
                            fVar.onNext(npxVar);
                        } else if (sxpVar instanceof p680) {
                            if (((p680) sxpVar).c) {
                                fVar.onNext(npxVar);
                            }
                        } else if (sxpVar instanceof g980) {
                            fVar.onNext(new h980(((g980) sxpVar).d));
                        } else if (sxpVar instanceof p980) {
                            fVar.onNext(new o980(((p980) sxpVar).d.keySet()));
                        }
                    }
                    rtmVar.c.b(new i5f(sxpVar, i2));
                }
                return s3q0.a;
            case 12:
                djo djoVar = (djo) this.c;
                djoVar.G.g = true;
                PipetteView pipetteView = djoVar.B;
                pipetteView.setVisibility(0);
                pipetteView.c((Bitmap) obj);
                djoVar.t(new wpa0.a(new y8g.c(pipetteView.getSelectedColor()), false));
                return s3q0.a;
            case 13:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(e.d.b);
                return s3q0.a;
            case 14:
                ((ffp) this.c).e.getClass();
                return s3q0.a;
            case 15:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) this.c;
                SimpleDate simpleDate = (SimpleDate) obj;
                vdx0 vdx0Var = e370.e;
                enterProfilePresenter.t.b(mnh0.C((vdx0Var != null ? vdx0Var : null).a().j(simpleDate.toString()), enterProfilePresenter.s, new defpackage.v(9, enterProfilePresenter, simpleDate), new lwh(enterProfilePresenter, 8), new ngl(new x34(enterProfilePresenter, i2), null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)));
                return s3q0.a;
            case 16:
                com.vk.ads.easypromote.impl.presentation.b bVar2 = (com.vk.ads.easypromote.impl.presentation.b) this.c;
                b.a aVar2 = com.vk.ads.easypromote.impl.presentation.b.k1;
                if (!(((jkq) obj) instanceof jkq.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.dismiss();
                return s3q0.a;
            case 17:
                return v0r.p((v0r) this.c, (Context) obj, "Иваааааааааааааааааааааааааааааааааааааааааааааааан", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", true, 32);
            case 18:
                ((tzr) this.c).a.onNext(szr.b.b);
                return s3q0.a;
            case 19:
                ((h3s) this.c).T((l3s.f.b) obj);
                return s3q0.a;
            case 20:
                fws fwsVar = (fws) this.c;
                GifWithQueryData gifWithQueryData = (GifWithQueryData) obj;
                fwsVar.a.f = false;
                if (((afi0) fwsVar.h.c).b().length() > 0) {
                    fwsVar.a.e = gifWithQueryData;
                    fwsVar.n.onNext(s3q0.a);
                }
                return s3q0.a;
            case 21:
                yv50 yv50Var = (yv50) this.c;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                s9u s9uVar = yv50Var.F;
                if (s9uVar != null) {
                    try {
                        vnv T0 = xa4.O().T0();
                        exc0.i(T0);
                        try {
                            s9uVar.a.d0(T0);
                        } catch (RemoteException e2) {
                            throw new RuntimeRemoteException(e2);
                        }
                    } catch (RemoteException e3) {
                        throw new RuntimeRemoteException(e3);
                    }
                }
                return s3q0.a;
            case 22:
                ((bmt.b) this.c).a();
                return s3q0.a;
            case 23:
                w2w w2wVar = (w2w) this.c;
                w2wVar.I0().j().b();
                w2wVar.I0().j().a();
                return s3q0.a;
            case 24:
                ImStickerView imStickerView = (ImStickerView) this.c;
                int i4 = ImStickerView.p;
                imStickerView.d(true);
                return s3q0.a;
            case 25:
                ClickablePoll clickablePoll = (ClickablePoll) obj;
                xjc xjcVar = ((q7r) ((zbx) this.c).b.c).Q;
                if (xjcVar != null) {
                    xjcVar.a(clickablePoll);
                }
                return s3q0.a;
            case 26:
                int i5 = JoinCallFragment.U;
                ((wzx) this.c).a((yzx.a) obj);
                return s3q0.a;
            case 27:
                gcp0 gcp0Var = (gcp0) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                gcp0Var.invoke(bool, Boolean.TRUE);
                return s3q0.a;
            case 28:
                a000 a000Var = (a000) this.c;
                Integer num = (Integer) obj;
                float f = (num != null && num.intValue() == 0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (num != null && num.intValue() == 1) ? 270.0f : (num != null && num.intValue() == 2) ? 180.0f : 90.0f;
                a000Var.i = f;
                a000Var.e(f);
                return s3q0.a;
            default:
                oh00 oh00Var = (oh00) this.c;
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof mh00) {
                    mh00 mh00Var = (mh00) instantJob;
                    if (mh00Var.h.containsAll(oh00Var.g) || !mh00Var.j) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
        }
    }
}

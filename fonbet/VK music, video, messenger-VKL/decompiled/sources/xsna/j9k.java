package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.Purchase;
import com.vk.api.generated.market.dto.MarketUserReviewsCommunitiesResponseObjectDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ClipSpinnerEntryPoint;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.Peer;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemLogoutButtonView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.i;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import kotlin.NoWhenBranchMatchedException;
import xsna.aiq0;
import xsna.pta;
import xsna.qvq;
import xsna.sb40;
import xsna.u430;
import xsna.ui00;
import xsna.wk50;
import xsna.x0r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0269, code lost:
    
        if (r1 <= (r14 != null ? r14.getTime() : Long.MAX_VALUE)) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ColorStateList valueOf;
        String concat;
        StringBuilder sb;
        int i;
        qvq dVar;
        long a;
        int i2 = 2;
        int i3 = 3;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        switch (this.b) {
            case 0:
                CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) this.c;
                ((sbv0) createPeopleTransferFragment.y0.getValue()).a(createPeopleTransferFragment.kn(), (VkPayInfo.VkPayState) obj, new sx0(createPeopleTransferFragment, 27));
                dw20 dw20Var = createPeopleTransferFragment.z0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 1:
                afm afmVar = (afm) this.c;
                int intValue = ((Integer) obj).intValue();
                a1w a1wVar = afmVar.i;
                a1wVar.r().getClass();
                if (intValue < 5) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    a1wVar.D(afmVar, new iim(Peer.a.b(afmVar.D.c)));
                } else {
                    com.vk.im.popup.a aVar = (com.vk.im.popup.a) afmVar.y.getValue();
                    Context B = afmVar.k.B();
                    com.vk.im.popup.a.d(aVar, new ula0(0, null, 0, a1wVar.r().h.n() ? enj.f(R.plurals.vkim_pin_im_item_limit_exceded_msg, 5, B) : enj.f(R.plurals.vkim_pin_dialog_limit_exceded_msg, 5, B), 0, null, R.string.close, 951), null, null, null, 14);
                }
                return s3q0.a;
            case 2:
                com.vk.im.engine.models.dialogs.c cVar2 = (com.vk.im.engine.models.dialogs.c) obj;
                DialogTheme P0 = ((alm) this.c).h.P0();
                return Boolean.valueOf(epx.f(P0 != null ? P0.b : null, cVar2));
            case 3:
                ((awq) this.c).e();
                return s3q0.a;
            case 4:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.c;
                int i4 = DiscoverSearchFragment.s0;
                eb10<?> T2 = ((MarketProductFilterComponent) m7m.d(discoverSearchFragment).mo408a(fpf0.a(MarketProductFilterComponent.class))).T2();
                if (T2 == null) {
                    T2 = null;
                }
                mcr a2 = T2 != null ? T2.a(discoverSearchFragment.kn()) : null;
                discoverSearchFragment.d0 = a2;
                if (a2 != null) {
                    a2.a(discoverSearchFragment.e0);
                }
                discoverSearchFragment.io().e();
                return s3q0.a;
            case 5:
                DocumentsListFragment documentsListFragment = (DocumentsListFragment) this.c;
                Throwable th = (Throwable) obj;
                int i5 = DocumentsListFragment.V;
                if (th instanceof VKApiExecutionException) {
                    rte0.z(documentsListFragment.getActivity(), (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 6:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f fVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) this.c;
                i.a.C1898a c1898a = (i.a.C1898a) obj;
                VkEcosystemProfileButtonView vkEcosystemProfileButtonView = (VkEcosystemProfileButtonView) fVar.h.getValue();
                ActionButtonsStyle actionButtonsStyle = c1898a.b;
                int i6 = c1898a.a;
                qqu0 qqu0Var = vkEcosystemProfileButtonView.d;
                qqu0Var.setStyleLight(actionButtonsStyle == ActionButtonsStyle.LIGHT);
                qqu0Var.setCornerRadius(i6);
                VkEcosystemLogoutButtonView vkEcosystemLogoutButtonView = (VkEcosystemLogoutButtonView) fVar.k.getValue();
                fdi fdiVar = fVar.j;
                Context context = fVar.c.getContext();
                fdiVar.getClass();
                ColorStateList valueOf2 = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_transparent_active, context));
                float[] fArr = new float[8];
                float f = i6;
                Arrays.fill(fArr, 0, 8, f);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(f);
                if (actionButtonsStyle == ActionButtonsStyle.DEFAULT) {
                    gradientDrawable.setStroke(iah0.a(1), e3m.f(R.attr.vk_ui_field_border_alpha, context));
                    valueOf = ColorStateList.valueOf(0);
                } else {
                    valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_content, context));
                }
                gradientDrawable.setColor(valueOf);
                vkEcosystemLogoutButtonView.setBackground(new RippleDrawable(valueOf2, gradientDrawable, new ShapeDrawable(new RoundRectShape(fArr, null, null))));
                return s3q0.a;
            case 7:
                pzo pzoVar = (pzo) obj;
                StringBuilder e = fw3.e(((pzo) this.c) == pzoVar ? " > " : "   ");
                if (pzoVar instanceof pgg) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    pgg pggVar = (pgg) pzoVar;
                    sb.append(pggVar.a.c.length());
                    sb.append(", newCursorPosition=");
                    i = pggVar.b;
                } else {
                    if (!(pzoVar instanceof kyi0)) {
                        if (pzoVar instanceof jyi0) {
                            concat = ((jyi0) pzoVar).toString();
                        } else if (pzoVar instanceof ivl) {
                            concat = ((ivl) pzoVar).toString();
                        } else if (pzoVar instanceof jvl) {
                            concat = ((jvl) pzoVar).toString();
                        } else if (pzoVar instanceof bzi0) {
                            concat = ((bzi0) pzoVar).toString();
                        } else if (pzoVar instanceof jhr) {
                            ((jhr) pzoVar).getClass();
                            concat = "FinishComposingTextCommand()";
                        } else if (pzoVar instanceof ey5) {
                            ((ey5) pzoVar).getClass();
                            concat = "BackspaceCommand()";
                        } else if (pzoVar instanceof jc30) {
                            ((jc30) pzoVar).getClass();
                            concat = "MoveCursorCommand(amount=0)";
                        } else if (pzoVar instanceof tul) {
                            ((tul) pzoVar).getClass();
                            concat = "DeleteAllCommand()";
                        } else {
                            String l = fpf0.a(pzoVar.getClass()).l();
                            if (l == null) {
                                l = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(l);
                        }
                        e.append(concat);
                        return e.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    kyi0 kyi0Var = (kyi0) pzoVar;
                    sb.append(kyi0Var.a.c.length());
                    sb.append(", newCursorPosition=");
                    i = kyi0Var.b;
                }
                concat = vu5.b(sb, i, ')');
                e.append(concat);
                return e.toString();
            case 8:
                return ((d6p) this.c).c((Dialog) obj).w();
            case 9:
                Activity activity = (Activity) this.c;
                ((Integer) obj).getClass();
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).b(activity, jeq0.g("https://www.gosuslugi.ru/help/faq/login/2"));
                activity.finish();
                return s3q0.a;
            case 10:
                return ukq.Q4((ukq) this.c);
            case 11:
                tyq tyqVar = (tyq) this.c;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(-711321815, new op7(tyqVar, c4 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1213371744, new lg0(tyqVar, c3 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1815524767, new com.vk.friends.requests.impl.allrequests.presentation.a(tyqVar, i3), true), 3);
                nvy.g(nvyVar, null, null, new jai(-549453982, new rp7(tyqVar, i2), true), 3);
                nvy.g(nvyVar, null, null, new jai(716616803, new syq(tyqVar, objArr4 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1982687588, new etp(tyqVar, c2 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1046208923, new x95(tyqVar, i2), true), 3);
                nvy.g(nvyVar, null, null, new jai(219861862, new kzi(tyqVar, i2), true), 3);
                nvy.g(nvyVar, null, null, new jai(1485932647, new iqp(tyqVar, c == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1542963864, new myq(tyqVar, objArr3 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1930402, new qyq(tyqVar, objArr2 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1268001187, new ryq(tyqVar, objArr == true ? 1 : 0), true), 3);
                return s3q0.a;
            case 12:
                wk50.a aVar2 = (wk50.a) this.c;
                x0r.a aVar3 = (x0r.a) obj;
                int i7 = aVar3 == null ? -1 : x0r.b.$EnumSwitchMapping$0[aVar3.ordinal()];
                if (i7 == 1) {
                    dVar = new qvq.j.d(ClipSpinnerEntryPoint.InlineNpsSendResult);
                } else if (i7 == 2) {
                    dVar = qvq.j.c.b;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = qvq.j.b.a.b;
                }
                aVar2.a(dVar);
                return s3q0.a;
            case 13:
                x3s x3sVar = (x3s) this.c;
                x3sVar.e2(new aiq0.m(false));
                x3sVar.e2(new aiq0.d.a(new pta.a.d(true)));
                return s3q0.a;
            case 14:
                FriendsFragment friendsFragment = (FriendsFragment) this.c;
                int i8 = FriendsFragment.q0;
                friendsFragment.s();
                return s3q0.a;
            case 15:
                FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) this.c;
                Calendar calendar = (Calendar) obj;
                Date date = futureDateTimePickerView.e;
                if (date != null) {
                    a = date.getTime();
                } else {
                    SimpleTimeZone simpleTimeZone = pvo0.a;
                    xuo0.a.getClass();
                    a = xuo0.a();
                }
                if (yl10.a(a, calendar.getTimeInMillis())) {
                    long timeInMillis = calendar.getTimeInMillis();
                    Date date2 = futureDateTimePickerView.f;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 16:
                ((l5u) this.c).e.invoke();
                return s3q0.a;
            case 17:
                i7u i7uVar = (i7u) this.c;
                i7uVar.j.setVisibility(8);
                View view = i7uVar.i;
                if (view != null) {
                    view.setVisibility(0);
                }
                RecyclerView recyclerView = i7uVar.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                i7uVar.g.setVisibility(8);
                return s3q0.a;
            case 18:
                com.vk.billing.h hVar = (com.vk.billing.h) this.c;
                Purchase purchase = (Purchase) obj;
                if (purchase != null) {
                    i0q0.j(new fwq(i2, hVar, purchase));
                }
                return s3q0.a;
            case 19:
                GroupCallGridContainerView groupCallGridContainerView = (GroupCallGridContainerView) this.c;
                int i9 = GroupCallGridContainerView.i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                GroupCallViewModel.b.getClass();
                GroupCallViewModel.o();
                groupCallGridContainerView.d.P4(GroupCallViewModel.p, booleanValue);
                groupCallGridContainerView.h.a();
                return s3q0.a;
            case 20:
                return Boolean.valueOf(epx.f((CallMemberId) obj, ((gzs) this.c).invoke()));
            case 21:
                ((haw) this.c).b.setPageScrolled(((Float) obj).floatValue());
                return s3q0.a;
            case 22:
                brw brwVar = (brw) this.c;
                jlv jlvVar = new jlv((AppCompatActivity) obj, brwVar);
                brwVar.d = new bm01(jlvVar.e);
                return jlvVar;
            case 23:
                ((wzx) this.c).c.invoke(ezx.b);
                return s3q0.a;
            case 24:
                hda hdaVar = (hda) obj;
                return jda.a(((k0z) this.c).b, hdaVar.a, hdaVar.b, false, false, 12);
            case 25:
                k3z k3zVar = (k3z) this.c;
                vgg vggVar = (vgg) obj;
                k3zVar.R0();
                p090 p090Var = k3zVar.F;
                Throwable th2 = vggVar.a;
                p090Var.b(th2);
                if (!k3zVar.S0(vggVar) && (th2 instanceof VKApiExecutionException)) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                    int s = vKApiExecutionException.s();
                    if (s != 5) {
                        if (s == 8) {
                            xyh xyhVar = new xyh(vggVar, 26);
                            zn70 zn70Var = k3zVar.q;
                            (zn70Var != null ? zn70Var : null).a(vKApiExecutionException.s(), vKApiExecutionException.C(), new j66(0, xyhVar));
                        } else if (s != 1110) {
                            vggVar.c();
                        } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                            k3zVar.e1();
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            vggVar.c();
                        }
                    } else if (f35.d(vKApiExecutionException)) {
                        sp.w((sjm) k3zVar.a, k3zVar.b, new p6y(k3zVar, i3));
                    }
                }
                return s3q0.a;
            case 26:
                li00 li00Var = (li00) this.c;
                ui00.a aVar4 = (ui00.a) obj;
                if (aVar4 instanceof ui00.a.C3807a) {
                    qcy<Object>[] qcyVarArr = ManagedGroupsInnerComponent.c;
                    return new io.reactivex.rxjava3.internal.operators.single.j(i2w.a().C(li00Var, new tyi0(((ui00.a.C3807a) aVar4).a)), new p98(li00Var, i3));
                }
                if (aVar4 instanceof ui00.a.b) {
                    ui00.a.b bVar = (ui00.a.b) aVar4;
                    qcy<Object>[] qcyVarArr2 = ManagedGroupsInnerComponent.c;
                    return new io.reactivex.rxjava3.internal.operators.single.j(i2w.a().C(li00Var, new l8q0(bVar.a, bVar.b)), new ki00(objArr5 == true ? 1 : 0, li00Var, bVar));
                }
                if (epx.f(aVar4, ui00.a.c.a)) {
                    return io.reactivex.rxjava3.core.x.k(s3q0.a);
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                MarketUserReviewsCommunitiesResponseObjectDto marketUserReviewsCommunitiesResponseObjectDto = (MarketUserReviewsCommunitiesResponseObjectDto) obj;
                Object obj2 = ((smg) this.c).a;
                int count = marketUserReviewsCommunitiesResponseObjectDto.getCount();
                int f2 = marketUserReviewsCommunitiesResponseObjectDto.f();
                List a3 = zs00.a(marketUserReviewsCommunitiesResponseObjectDto.d());
                Boolean e2 = marketUserReviewsCommunitiesResponseObjectDto.e();
                return new pr00(count, f2, e2 != null ? e2.booleanValue() : false, a3);
            case 28:
                l430 l430Var = (l430) this.c;
                u430 u430Var = (u430) obj;
                qcy<Object>[] qcyVarArr3 = l430.l1;
                if (u430Var instanceof u430.a) {
                    if (((u430.a) u430Var).a) {
                        gzs<s3q0> gzsVar = l430Var.k1;
                        if (gzsVar != null) {
                            gzsVar.invoke();
                        }
                        l430Var.dismiss();
                    } else {
                        gzs<s3q0> gzsVar2 = l430Var.j1;
                        if (gzsVar2 != null) {
                            gzsVar2.invoke();
                        }
                        l430Var.dismiss();
                    }
                } else {
                    if (!(u430Var instanceof u430.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h03.b(((u430.b) u430Var).a);
                }
                return s3q0.a;
            default:
                qb40 qb40Var = (qb40) this.c;
                Throwable th3 = (Throwable) obj;
                qb40Var.i.b(null);
                if ((th3 instanceof VKApiExecutionException) && ((VKApiExecutionException) th3).s() == 104) {
                    qb40Var.b(sb40.d.e.a);
                } else {
                    qb40Var.b(sb40.d.c.a);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ j9k(pzo pzoVar, cwm cwmVar) {
        this.b = 7;
        this.c = pzoVar;
    }
}

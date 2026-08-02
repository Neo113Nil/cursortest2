package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.money.createtransfer.chat.CreateChatTransferPresenter;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.ConversationFactoryParams;
import xsna.a5r;
import xsna.azb;
import xsna.c8p;
import xsna.ku9;
import xsna.pwh;
import xsna.s4r;
import xsna.tlo0;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v62, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.f h;
        tlo0.f fVar;
        s3q0 lambda$new$0;
        switch (this.b) {
            case 0:
                ((com.vk.superapp.browser.internal.ui.shortcats.a) this.c).g = (io.reactivex.rxjava3.disposables.c) obj;
                return s3q0.a;
            case 1:
                q2x0 q2x0Var = ((w60) this.c).f;
                if (q2x0Var != null) {
                    q2x0Var.a();
                }
                return s3q0.a;
            case 2:
                fj0 fj0Var = (fj0) this.c;
                int i = csr0.s;
                return new csr0(fj0Var.h.inflate(R.layout.vkim_dialog_mention_item, (ViewGroup) obj, false), fj0Var.i);
            case 3:
                ((AnimSearchQueryVh) this.c).e.invoke((String) obj);
                return s3q0.a;
            case 4:
                ((pt2) this.c).X0(x89.d.a);
                return s3q0.a;
            case 5:
                ta6 ta6Var = (ta6) this.c;
                String str = (String) obj;
                Object obj2 = ta6Var.o;
                ((l0c) (obj2 != null ? obj2 : null)).h();
                ta6Var.K.a(str, false);
                return s3q0.a;
            case 6:
                ((izs) ((zak0) ((ko7) this.c).d).getValue()).invoke(new a.InterfaceC0957a.b((String) obj));
                return s3q0.a;
            case 7:
                BotButton.VkApps vkApps = (BotButton.VkApps) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(vkApps.g.h()), "type");
                w9yVar.e(vkApps.h, "payload");
                w9yVar.c(Integer.valueOf(vkApps.i), TtmlNode.TAG_SPAN);
                w9yVar.c(Integer.valueOf(vkApps.j), "app_id");
                w9yVar.e(vkApps.k, "app_owner_id");
                w9yVar.e(vkApps.l, "hash");
                w9yVar.e(vkApps.m, "label");
                w9yVar.b(Boolean.valueOf(vkApps.n), "inline");
                w9yVar.d(Long.valueOf(vkApps.o.b), "author");
                return s3q0.a;
            case 8:
                bwt0.p0(((wf8) this.c).l, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 9:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) this.c).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 10:
                return io.reactivex.rxjava3.core.q.T((List) this.c);
            case 11:
                ku9.a aVar = (ku9.a) this.c;
                VideoFile videoFile = (VideoFile) obj;
                AboutVideoItem.e eVar = aVar.n;
                if (eVar == null) {
                    return s3q0.a;
                }
                aVar.l.invoke(videoFile, eVar.d);
                return s3q0.a;
            case 12:
                ((vsb) this.c).a.a();
                return s3q0.a;
            case 13:
                azb.a aVar2 = ((ryb) this.c).i;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new asr0(aVar2, viewGroup) : new zrr0(aVar2, viewGroup);
            case 14:
                com.vk.ecomm.cart.impl.checkout.feature.state.b bVar = ((w7c) this.c).d;
                q1n0 q1n0Var = ((w8c) obj).i;
                bVar.getClass();
                if (q1n0Var == null) {
                    return null;
                }
                if (q1n0Var.a) {
                    h = tq.h(tlo0.Companion, R.string.ecomm_checkout_my_orders);
                    fVar = new tlo0.f(R.string.ecomm_checkout_success_order_description_orders);
                } else {
                    h = tq.h(tlo0.Companion, R.string.ecomm_checkout_chat_with_seller);
                    fVar = new tlo0.f(R.string.ecomm_checkout_success_order_description_chat);
                }
                return new r1n0(h, fVar);
            case 15:
                tgi0 tgi0Var = (tgi0) this.c;
                qi90 qi90Var = (qi90) ((npp0) obj);
                qi90Var.q = true;
                qi90Var.p.invoke(tgi0Var);
                itl.f(qi90Var).R();
                return Boolean.FALSE;
            case 16:
                ((o1d) this.c).h.ai(new ClipViewerAnalyticsEvent.h.b((SdkClipVideoFile) obj));
                return s3q0.a;
            case 17:
                zld zldVar = ((cmd) this.c).C;
                if (zldVar != null) {
                    zldVar.q.a();
                }
                return s3q0.a;
            case 18:
                return new o3e((ViewGroup) obj, ((m3e) this.c).i);
            case 19:
                q7e q7eVar = ((d8e) this.c).g;
                s4r s4rVar = (s4r) obj;
                if (s4rVar instanceof s4r.b) {
                    q7eVar.a.a(new a5r.h(((s4r.b) s4rVar).a));
                } else {
                    if (!s4rVar.equals(s4r.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q7eVar.a.a(new a5r.h(""));
                }
                return s3q0.a;
            case 20:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.c;
                int i2 = ClipsGridDraftsListFragment.l0;
                if (((List) obj).isEmpty()) {
                    ((kof) clipsGridDraftsListFragment.g0.getValue()).b(v2u0.a);
                }
                return s3q0.a;
            case 21:
                upe upeVar = (upe) this.c;
                return new wpe(upeVar.i, upeVar.j, upeVar.k, (ViewGroup) obj);
            case 22:
                ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
                int i3 = ClipsTemplateEditorFragment.h0;
                clipsTemplateEditorFragment.eo().g();
                return s3q0.a;
            case 23:
                ((jwh) this.c).T(new pwh.a(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 24:
                lambda$new$0 = ((ConversationFactoryParams) this.c).lambda$new$0((gzs) obj);
                return lambda$new$0;
            case 25:
                puj pujVar = (puj) this.c;
                puj.l2(pujVar.t, ((us2) obj).c, pujVar.u, pujVar.v);
                return Boolean.TRUE;
            case 26:
                CreateChatTransferPresenter createChatTransferPresenter = (CreateChatTransferPresenter) this.c;
                ipm ipmVar = (ipm) obj;
                wpp<Long, Dialog> wppVar = ipmVar.a;
                ProfilesInfo profilesInfo = ipmVar.b;
                Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(createChatTransferPresenter.g.b));
                if (dialog == null) {
                    return s3q0.a;
                }
                ChatSettings Hb = dialog.Hb();
                createChatTransferPresenter.s = vtb.b(createChatTransferPresenter.s, null, izb.a(createChatTransferPresenter.s.b, false, null, false, Hb != null ? Hb.f : 0, 7), 1);
                CreateChatTransferFragment createChatTransferFragment = createChatTransferPresenter.o;
                TransferInputField transferInputField = createChatTransferFragment.p0;
                if (transferInputField != null) {
                    transferInputField.r1(dialog, profilesInfo);
                }
                createChatTransferFragment.setTitle(R.string.money_transfer_request_money);
                Object obj3 = createChatTransferFragment.m0;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                ((d7k) obj4).i();
                VKTabLayout vKTabLayout = createChatTransferFragment.y0;
                if (vKTabLayout != null) {
                    vKTabLayout.r();
                    vKTabLayout.setVisibility(0);
                    TabLayout.g p = vKTabLayout.p();
                    p.p(R.string.money_transfer_request_specific_amount);
                    vKTabLayout.h(p);
                    TabLayout.g p2 = vKTabLayout.p();
                    p2.p(R.string.money_transfer_request_no_limits);
                    vKTabLayout.h(p2);
                    vKTabLayout.f(new h7k(e43.l(MobileOfficialAppsCoreNavStat$EventScreen.CREATE_MONEY_CHAT_REQUEST, MobileOfficialAppsCoreNavStat$EventScreen.CREATE_MONEY_CHAT_REQUEST_UNLIMITED), createChatTransferFragment));
                    ViewGroup viewGroup2 = createChatTransferFragment.x0;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                    }
                    TransferInputField transferInputField2 = createChatTransferFragment.p0;
                    ViewGroup.LayoutParams layoutParams = transferInputField2 != null ? transferInputField2.getLayoutParams() : null;
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        float f = 16;
                        marginLayoutParams.setMargins(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(8));
                    }
                }
                createChatTransferFragment.oo();
                return s3q0.a;
            case 27:
                ((hpm) this.c).Z((com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 28:
                View view = (View) this.c;
                ((etv0) obj).b(false);
                view.performClick();
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                c8p.b bVar2 = c8p.n1;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
        }
    }
}

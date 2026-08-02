package xsna;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.b;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.polls.Poll;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.ImEditChatControlParamsFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.Set;
import xsna.as30;
import xsna.bex0;
import xsna.dr00;
import xsna.mzj;
import xsna.nbu;
import xsna.o2j;
import xsna.odn;
import xsna.pzx;
import xsna.qls;
import xsna.tj50;
import xsna.x6y.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k7f implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gvv0 view;
        Activity B0;
        gvv0 view2;
        io.reactivex.rxjava3.disposables.b D6;
        switch (this.b) {
            case 0:
                ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
                int intValue = ((Integer) obj).intValue();
                int i = ClipsTemplateEditorFragment.h0;
                clipsTemplateEditorFragment.eo().u(intValue);
                return s3q0.a;
            case 1:
                ((wcf) this.c).e((ugf) obj);
                return s3q0.a;
            case 2:
                ((w8) this.c).invoke(k15.z((SdkClipVideoFile) obj));
                return s3q0.a;
            case 3:
                d4h d4hVar = (d4h) this.c;
                ((d3h) d4hVar.c.invoke()).j(d4hVar.d, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 4:
                ((a2j) this.c).T(new o2j.q(false));
                return s3q0.a;
            case 5:
                qtd0 qtd0Var = (qtd0) obj;
                Set<Long> set = ((com.vk.im.ui.components.contacts.a) this.c).U;
                return Boolean.valueOf(set != null ? set.contains(Long.valueOf(qtd0Var.G3())) : false);
            case 6:
                ((czj) this.c).T(new mzj.b((qnt) obj, null, 2));
                return s3q0.a;
            case 7:
                ((scl) this.c).l.f(((vqt) obj).d);
                return s3q0.a;
            case 8:
                ((l2m) this.c).b.invoke((String) obj);
                return s3q0.a;
            case 9:
                Peer peer = (Peer) this.c;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar.z;
                if (chatSettings == null) {
                    return bVar;
                }
                Set R0 = j5g.R0(chatSettings.e);
                R0.remove(peer);
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, ChatSettings.zb(chatSettings, null, null, R0, 0, false, -9), null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16777217, 2097151);
            case 10:
                com.vk.im.engine.models.dialogs.d dVar = (com.vk.im.engine.models.dialogs.d) obj;
                ((com.vk.im.engine.internal.storage.delegates.dialogs.b) this.c).b.b().execSQL("UPDATE dialogs_history_count SET count = ? WHERE filter_id = ?", new String[]{String.valueOf(dVar.b), String.valueOf(dVar.a.i())});
                return s3q0.a;
            case 11:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, (PinnedMsg) this.c, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -262145, 2097151);
            case 12:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                gom0.a(gom0Var, l7n.b, new bo3(discoverSimilarFeedFragment, 8));
                int i2 = 5;
                gom0.a(gom0Var, m7n.b, new id4(discoverSimilarFeedFragment, i2));
                gom0.a(gom0Var, n7n.b, new jd4(discoverSimilarFeedFragment, 7));
                gom0.a(gom0Var, o7n.b, new yg7(discoverSimilarFeedFragment, 6));
                gom0.a(gom0Var, p7n.b, new zg7(discoverSimilarFeedFragment, i2));
                gom0.a(gom0Var, k7n.b, new w69(discoverSimilarFeedFragment, 4));
                return s3q0.a;
            case 13:
                ((ndn) this.c).T(odn.f.b);
                return s3q0.a;
            case 14:
                ((View) this.c).performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 15:
                ((afp) this.c).E.getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 16:
                return new qls.a(((tj50.a) obj).a(new lls(1, ((mls) this.c).d, iks.class, "toViewState", "toViewState(Lcom/vk/friends/impl/friendsandfollowers/tabs/domain/FriendsAndFollowersTabState$Content;)Lcom/vk/friends/impl/friendsandfollowers/tabs/presentation/FriendsAndFollowersTabViewState$FriendsAndFollowersList;", 0), ao8.d));
            case 17:
                xnt xntVar = (xnt) this.c;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = xntVar.h;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                xntVar.h = cVar;
                FragmentActivity activity = xntVar.b.getActivity();
                if (activity != null) {
                    ver0.b(activity, cVar);
                }
                return s3q0.a;
            case 18:
                ((jcu) this.c).d.invoke(nbu.e.b);
                return s3q0.a;
            case 19:
                DialogExt dialogExt = (DialogExt) obj;
                eqb eqbVar = ((ImEditChatControlParamsFragment) this.c).Q;
                (eqbVar != null ? eqbVar : null).X0(kq01.p(dialogExt.Cb().Hb()));
                return s3q0.a;
            case 20:
                ((c5w) this.c).e = false;
                return s3q0.a;
            case 21:
                ((gzs) this.c).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 22:
                dfw dfwVar = (dfw) this.c;
                Editable text = dfwVar.h.getText();
                if (text != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = text.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = text.charAt(i3);
                        if (Character.isDigit(charAt) || charAt == '+') {
                            sb.append(charAt);
                        }
                    }
                    String obj2 = sb.toString();
                    if (obj2 != null) {
                        myc0.h(dfwVar.e, null, null, new cfw(dfwVar, obj2, null), 3);
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 23:
                ((as30.a) this.c).b();
                return s3q0.a;
            case 24:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar3 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.c;
                cVar3.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar2 = cVar3.c;
                dVar2.e(false);
                dVar2.d((Poll) obj, true);
                return s3q0.a;
            case 25:
                ((kzx) this.c).T(new pzx.e(true));
                return s3q0.a;
            case 26:
                x6y x6yVar = (x6y) this.c;
                VkValidatePhoneInfo b = VkValidatePhoneInfo.a.b((AuthValidatePhoneCheckResponse) obj);
                if (b instanceof VkValidatePhoneInfo.Skip) {
                    bex0.a.b(x6yVar, JsApiMethodType.VALIDATE_PHONE, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("phone_validated", true), null, 12);
                } else if (epx.f(b, VkValidatePhoneInfo.Unknown.c)) {
                    bex0.a.a(x6yVar, JsApiMethodType.VALIDATE_PHONE, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                } else {
                    fvv0 M = x6yVar.M();
                    if (M != null && (view = M.getView()) != null && (B0 = view.B0()) != null) {
                        q55 q55Var = q55.a;
                        q55.a(x6yVar.new b());
                        b.a a = com.vk.auth.validation.b.a(r55.d, (FragmentActivity) B0, b, 56);
                        fvv0 M2 = x6yVar.M();
                        if (M2 != null && (view2 = M2.getView()) != null && (D6 = view2.D6()) != null) {
                            D6.b(a);
                        }
                    }
                }
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((snt) obj).b((lif0) ((dnz) this.c).c));
            case 28:
                nek0 nek0Var = (nek0) this.c;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                return s3q0.a;
            default:
                return com.vk.clips.sdk.shared.item.market_ads.b.o((com.vk.clips.sdk.shared.item.market_ads.b) this.c, (dr00.b) obj);
        }
    }

    public /* synthetic */ k7f(dt dtVar, dnz dnzVar) {
        this.b = 27;
        this.c = dnzVar;
    }
}

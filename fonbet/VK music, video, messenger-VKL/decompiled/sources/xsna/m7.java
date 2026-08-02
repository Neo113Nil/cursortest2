package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlPreviewTypeDto;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.bonus.StickersBonusRewardTerms;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.ui.BannedBottomSheet;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.gleffects.dto.UserInfo;
import xsna.acx;
import xsna.b4b;
import xsna.c5v0;
import xsna.dob;
import xsna.dw20;
import xsna.fi3;
import xsna.kuc;
import xsna.q7b;
import xsna.tj50;
import xsna.tlo0;
import xsna.tzp0;
import xsna.w19;
import xsna.xw0;
import xsna.zew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [xsna.rx5$a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.vk.core.view.components.placeholder.main.VkPlaceholder$b$c, xsna.c5v0$a$a] */
    /* JADX WARN: Type inference failed for: r4v14, types: [xsna.mw5] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.content.Context] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        o3c0 o3c0Var;
        Activity activity;
        gzs<s3q0> gzsVar;
        int i = this.b;
        int i2 = 7;
        int i3 = 12;
        int i4 = 0;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VideoFile videoFile = (VideoFile) obj;
                boolean i0 = videoFile.i0();
                int l1 = videoFile.l1();
                ((t8) obj2).getClass();
                AboutVideoItem.c0.a aVar = new AboutVideoItem.c0.a(i0 ? new AboutVideoItem.c0.b.C1213b(l1) : AboutVideoItem.c0.b.a.a, videoFile.O9());
                if (!BuildInfo.t() && !BuildInfo.g()) {
                    i4 = 1;
                }
                return new AboutVideoItem.c0(aVar, i4 != 0 ? new AboutVideoItem.c0.b.C1213b(videoFile.c1()) : AboutVideoItem.c0.b.a.a, videoFile.Fa() ? new AboutVideoItem.c0.b.C1213b(videoFile.W7()) : AboutVideoItem.c0.b.a.a);
            case 1:
                return Long.valueOf(((hud0) ((List) obj2).get(((Integer) obj).intValue())).getKey());
            case 2:
                om0 om0Var = (om0) obj2;
                NewsEntry newsEntry = (NewsEntry) obj;
                if (((Boolean) om0Var.f.getValue()).booleanValue() && (activity = (Activity) om0Var.b.a.get(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))))) != null && (newsEntry instanceof Post) && (activity instanceof LikesActivity)) {
                    LikesActivity likesActivity = (LikesActivity) activity;
                    if (likesActivity.f == LikesActivity.Position.DEFAULT) {
                        o3c0Var = new o3c0((Post) newsEntry, likesActivity);
                        return pn60.c(om0Var.d, newsEntry, o3c0Var, null, 12);
                    }
                }
                o3c0Var = null;
                return pn60.c(om0Var.d, newsEntry, o3c0Var, null, 12);
            case 3:
                ((com.vk.clips.sdk.shared.item.ads.c) obj2).getFeature().i.b(new xw0.e((String) obj));
                return s3q0.a;
            case 4:
                return hh3.a((hh3) obj, j5g.v0(fi3.c.b, !((zg3) obj2).h.c() ? Collections.singletonList(fi3.a.b) : EmptyList.b));
            case 5:
                MusicDto musicDto = (MusicDto) obj;
                dz2 x = yfb.x(new ix4().j(musicDto.b, AudioGetAudioPreviewUrlPreviewTypeDto.SNIPPET));
                x.n = true;
                return rsg0.W(x, 7).l(new rf1(new gr3(musicDto, (tp4) obj2), 3));
            case 6:
                Throwable th = (Throwable) obj;
                Iterator it = ((tx4) obj2).c.iterator();
                while (it.hasNext()) {
                    ((lck0) it.next()).q(th);
                }
                return s3q0.a;
            case 7:
                int i6 = rt5.r1;
                ((rt5) obj2).hide();
                return s3q0.a;
            case 8:
                rx5 rx5Var = (rx5) obj2;
                ?? r1 = rx5Var.l;
                mw5 mw5Var = rx5Var.m;
                r1.a(mw5Var != null ? mw5Var : 0);
                return s3q0.a;
            case 9:
                int i7 = BannedBottomSheet.R;
                ((BannedBottomSheet) obj2).dismiss();
                return s3q0.a;
            case 10:
                ((ef6) obj2).a(new acx.g(true, true, false));
                return s3q0.a;
            case 11:
                eb7 eb7Var = (eb7) obj2;
                VkPlaceholder vkPlaceholder = eb7Var.i;
                vkPlaceholder.setMiddle(new VkPlaceholder.b(r4, new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, j03.g(eb7Var.c, (Throwable) obj, R.string.error))), i5));
                VkPlaceholder.a.C0857a c0857a = null;
                vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vk_common_retry), (gzs) new com.vk.movika.sdk.base.logic.processor.actions.f(eb7Var, i2), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Link, (VkButton.Appearance) null, false, 444), c0857a, c0857a, null, 8));
                return s3q0.a;
            case 12:
                StickersBonusRewardTerms stickersBonusRewardTerms = (StickersBonusRewardTerms) obj;
                int i8 = BonusCatalogFragment.f0;
                final hjg0 hjg0Var = new hjg0();
                final ?? requireContext = ((BonusCatalogFragment) obj2).requireContext();
                View inflate = LayoutInflater.from(requireContext).inflate(R.layout.stickers_bonus_catalog_rules_dialog, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.rules);
                String str = stickersBonusRewardTerms.b;
                if (str == null) {
                    str = requireContext.getString(R.string.stickers_bonus_catalog_buy_terms_title);
                }
                textView.setText(xwk.d().a().m(stickersBonusRewardTerms.c));
                hjg0Var.b = new dw20.b(requireContext, new tzp0.c.a(new gjg0(), true)).w0(str).D0(inflate, false).c(new cpo(false, 0, 7)).Z(new DialogInterface.OnDismissListener() { // from class: xsna.fjg0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object obj3 = requireContext;
                        if (obj3 instanceof ey50) {
                            ((ey50) obj3).Y().H(hjg0.this);
                        }
                    }
                }).I0("reward_terms");
                if (requireContext instanceof ey50) {
                    ((ey50) requireContext).Y().S(hjg0Var);
                }
                return s3q0.a;
            case 13:
                String str2 = (String) obj;
                EditText editText = ((ke8) obj2).r;
                boolean isFocused = editText.isFocused();
                boolean f = epx.f(str2, editText.getText().toString());
                if (!isFocused && !f) {
                    int max = Math.max(0, Math.min(editText.getSelectionStart(), str2.length() - 1));
                    int max2 = Math.max(0, Math.min(editText.getSelectionEnd(), str2.length() - 1));
                    editText.setText(str2);
                    editText.setSelection(max, max2);
                }
                return s3q0.a;
            case 14:
                return ((Call) obj2).a((StatsObserver) obj);
            case 15:
                ((o29) obj2).b.invoke(w19.c.b);
                return s3q0.a;
            case 16:
                zew0.a aVar2 = zew0.k1;
                Context context = ((f69) obj2).a;
                zew0.a.b(aVar2, context, R.drawable.vk_icon_pin_outline_28, R.attr.vk_ui_icon_accent, context.getString(R.string.voip_you_were_pinned_by_admin_dialog_title), null, null, new zew0.b.c(R.string.voip_you_were_pinned_by_admin_dialog_positive_button), new zew0.c(R.string.voip_you_were_pinned_by_admin_dialog_negative_button), false, Sdk.SDKError.Reason.AD_EXPIRED_VALUE).Td((FragmentManager) obj, "");
                return s3q0.a;
            case 17:
                com.vk.voip.ui.settings.participants_view.c cVar = ((CallParticipantsFragment) obj2).S;
                cVar.q.b((CallParticipantsViewModel) obj);
                if (cVar.t) {
                    zmp0.b(cVar.h);
                    cVar.t = false;
                }
                return s3q0.a;
            case 18:
                ((m99) obj2).d(new u8((Boolean) obj, i3));
                return s3q0.a;
            case 19:
                return new a.c(((tj50.a) obj).a(new sf1((cy9) obj2, 15), ao8.d));
            case 20:
                hda hdaVar = (hda) obj;
                ListIterator listIterator = ((r9a) obj2).a.listIterator(0);
                while (true) {
                    ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                    if (!aVar3.hasNext()) {
                        return hdaVar;
                    }
                    hdaVar = ((ida) aVar3.next()).a(hdaVar);
                }
            case 21:
                ((com.vk.channels.impl.comments.e) obj2).m = null;
                return s3q0.a;
            case 22:
                DonutGroupSettingsDto donutGroupSettingsDto = (DonutGroupSettingsDto) obj;
                s2o.a.onNext(Boolean.valueOf(donutGroupSettingsDto.l()));
                ((wxa) obj2).f.onNext(donutGroupSettingsDto);
                return s3q0.a;
            case 23:
                b4b b4bVar = (b4b) obj;
                c4b c4bVar = ((ChannelMonetizationFragment) obj2).R;
                if (c4bVar != null) {
                    Context context2 = c4bVar.a;
                    qdz qdzVar = c4bVar.b;
                    if (b4bVar instanceof b4b.b) {
                        qdzVar.e().d(context2, Uri.parse("https://m.vk.ru/@donut-faq"), LaunchContext.A, null);
                    } else if (b4bVar instanceof b4b.e) {
                        UserId userId = ((b4b.e) b4bVar).a;
                        qdzVar.e().d(context2, Uri.parse(c4b.e + userId), LaunchContext.A, null);
                    } else if (b4bVar instanceof b4b.c) {
                        UserId userId2 = ((b4b.c) b4bVar).a;
                        qdzVar.e().d(context2, Uri.parse(c4b.f + userId2), LaunchContext.A, null);
                    } else if (b4bVar instanceof b4b.d) {
                        UserId userId3 = ((b4b.d) b4bVar).a;
                        int i9 = q7b.l1;
                        new q7b.a(context2, userId3).I0("ChannelPayoutBottomSheet");
                    } else if (b4bVar instanceof b4b.f) {
                        c4bVar.d = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_donut_coin_heart_120h), null, null, 12), new c5v0.b(i3, tq.h(tlo0.Companion, R.string.vkim_channels_monetization_donation_reaction_dialog_title), new tlo0.f(R.string.vkim_channels_monetization_donation_reaction_dialog_subtitle)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.vkim_channels_monetization_donation_reaction_dialog_button), new com.vk.movika.sdk.base.logic.processor.h(c4bVar, 10), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r4, 6), 20), null, false, 28).b(context2, "OnePaymentDonutEnabledModalDialog");
                    } else {
                        if (!(b4bVar instanceof b4b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c4bVar.c.invoke();
                    }
                }
                return s3q0.a;
            case 24:
                ecb ecbVar = ((mcb) obj2).c;
                rcb rcbVar = ecbVar.j;
                rcbVar.k();
                rcbVar.i();
                ecb.Y0(ecbVar, (Throwable) obj);
                RecyclerView recyclerView = rcbVar.k;
                (recyclerView != null ? recyclerView : null).removeOnItemTouchListener(rcbVar.m);
                ecbVar.t = false;
                ecbVar.a1();
                return s3q0.a;
            case 25:
                ynb ynbVar = (ynb) obj2;
                int i10 = ((dob.a) obj).a;
                View view = ynbVar.r;
                if (view != null) {
                    bwt0.i0(view, new snb(ynbVar, i10, i4));
                }
                return s3q0.a;
            case 26:
                int i11 = ClipDescription.M;
                gzs<s3q0> gzsVar2 = ((ClipDescription.a) obj2).d;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 27:
                ((h1d) obj2).b.a(new f5d(((Integer) obj).intValue()));
                return s3q0.a;
            case 28:
                kuc kucVar = (kuc) obj2;
                int i12 = ((ModalActionSheetListItem) obj).a;
                if (i12 == 1) {
                    kuc.a aVar4 = kucVar.e;
                    if (aVar4 != null && (gzsVar = aVar4.c) != null) {
                        gzsVar.invoke();
                    }
                } else if (i12 == 2) {
                    kucVar.d.c.invoke();
                }
                return s3q0.a;
            default:
                h1e h1eVar = (h1e) obj2;
                List<? extends UserInfo> list = (List) obj;
                h1eVar.c = list;
                h1eVar.a.d(list);
                h1eVar.d = true;
                return s3q0.a;
        }
    }
}

package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import com.vk.api.generated.friends.dto.FriendsAddResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorPendingItem;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.qrcode.d;
import com.vk.reefton.dto.ReefLocationSource;
import com.vk.reefton.literx.single.LambdaSingleObserver;
import com.vk.reefton.literx.single.SingleObserveOn;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.e3m;
import xsna.e8v0;
import xsna.pum;
import xsna.t310;
import xsna.uns;
import xsna.wk50;
import xsna.zph0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ync implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ync(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 7;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [xsna.znf0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Object failure;
        x7w x7wVar;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType = (ClipCoauthorsDecisionLaunchType) obj3;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj2;
                ClipCoauthorDecisionState clipCoauthorDecisionState = (ClipCoauthorDecisionState) ((gzs) obj4).invoke();
                if (clipCoauthorDecisionState != null) {
                    return clipCoauthorDecisionState;
                }
                if (epx.f(clipCoauthorsDecisionLaunchType, ClipCoauthorsDecisionLaunchType.AcceptRequest.b)) {
                    arrayList = loc.a(clipVideoFile);
                } else if (epx.f(clipCoauthorsDecisionLaunchType, ClipCoauthorsDecisionLaunchType.DeclineRequest.b)) {
                    arrayList = loc.a(clipVideoFile);
                } else {
                    if (!(clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<CoOwnerItem> list = clipVideoFile.N1;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list) {
                        CoOwnerItem coOwnerItem = (CoOwnerItem) obj5;
                        if (coOwnerItem.e && coOwnerItem.c == CoOwnerItem.StatusDto.APPROVED) {
                            arrayList2.add(obj5);
                        }
                    }
                    arrayList = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        Owner owner = ((CoOwnerItem) next).d;
                        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
                        clipsFeatures.getClass();
                        arrayList.add(new ClipCoauthorPendingItem(owner, !com.vk.toggle.b.A.a(clipsFeatures) && i2 == 0));
                        i2 = i3;
                    }
                }
                return new ClipCoauthorDecisionState(arrayList, clipCoauthorsDecisionLaunchType);
            case 1:
                neh nehVar = (neh) obj4;
                aj1 aj1Var = (aj1) obj3;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj2;
                VKList<Photo> vKList = (VKList) obj;
                Iterator<Photo> it2 = vKList.iterator();
                while (it2.hasNext()) {
                    it2.next().B = extendedUserProfile != null ? bwd0.l(extendedUserProfile) : null;
                }
                nehVar.d = vKList;
                nehVar.b.put(aj1Var, vKList);
                return s3q0.a;
            case 2:
                DialogsFilter dialogsFilter = (DialogsFilter) obj4;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj3;
                long j = bVar.b;
                sum sumVar = (sum) obj2;
                com.vk.im.engine.internal.storage.delegates.dialogs.b a = ((xgl0) obj).b().a();
                a.getClass();
                nrm f = a.f(new pum.a(dialogsFilter));
                if (f != null && f.c && bVar.d.compareTo(f.b) < 0) {
                    Pair e = com.vk.im.engine.internal.storage.delegates.dialogs.b.e(new pum.a(dialogsFilter));
                    int intValue = ((Number) e.d()).intValue();
                    DialogsFilter dialogsFilter2 = (DialogsFilter) e.g();
                    a.f.a(new Pair(Integer.valueOf(intValue), dialogsFilter2), new com.vk.movika.sdk.base.observable.u(23), new prm(a, dialogsFilter2, intValue));
                }
                try {
                    xgl0 xgl0Var = sumVar.a;
                    com.vk.im.engine.models.im_item.a meta = xgl0Var.j().getMeta();
                    if (meta != null && meta.e) {
                        ImItemType imItemType = ImItemType.DIALOG;
                        sew sewVar = xgl0Var.j().c(Collections.singletonList(new b5w(j, imItemType))).get(new b5w(j, imItemType));
                        if (sewVar != null && (x7wVar = sewVar.b) != null) {
                            x7w x7wVar2 = meta.a;
                            if (x7wVar2 == null) {
                                x7wVar2 = x7w.f;
                            }
                            if (x7wVar.compareTo(x7wVar2) <= 0) {
                                xgl0Var.j().f(com.vk.im.engine.models.im_item.a.a(meta, null, null, 111));
                            }
                        }
                    }
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 3:
                UsersUserFullDto.SocialButtonTypeDto socialButtonTypeDto = (UsersUserFullDto.SocialButtonTypeDto) obj4;
                xms xmsVar = (xms) obj3;
                f4z f4zVar = xmsVar.j;
                UserId userId = (UserId) obj2;
                if (((FriendsAddResponseDto) obj) != FriendsAddResponseDto.SEND || socialButtonTypeDto == null) {
                    f4zVar.b(uns.a.C3811a.a);
                } else {
                    f4zVar.b(new uns.c.C3813c(socialButtonTypeDto == UsersUserFullDto.SocialButtonTypeDto.FOLLOW));
                }
                xmsVar.T(new kns(userId));
                return s3q0.a;
            case 4:
                r210.e((wk50.a) obj3, false, (x410) obj2);
                ((r210) obj4).b.b(new t310.e(zwp.a((Throwable) obj)));
                return s3q0.a;
            case 5:
                s020 s020Var = (s020) obj4;
                o3p o3pVar = (o3p) obj3;
                i4p i4pVar = (i4p) obj2;
                o3p o3pVar2 = s020Var.g;
                if (o3pVar2 != null) {
                    s020Var.c.u().a(o3pVar2);
                }
                s020Var.g = o3pVar;
                s020Var.I(i4pVar);
                return s3q0.a;
            case 6:
                p1a0 p1a0Var = (p1a0) obj4;
                p1a0Var.e.set(true);
                ((View) obj3).performClick();
                ((etv0) obj).b(false);
                p1a0Var.d.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 7:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) obj3;
                d.b bVar2 = (d.b) obj2;
                Article article = (Article) obj;
                if (article != null) {
                    String str = article.f;
                    Owner owner2 = article.h;
                    if (!article.g()) {
                        bpn0 bpn0Var = vtk0.c;
                        ((gq3) (bpn0Var != null ? bpn0Var : null).getValue()).a(article);
                        return s3q0.a;
                    }
                    com.vk.newsfeed.common.recycler.holders.attachments.a aVar = new com.vk.newsfeed.common.recycler.holders.attachments.a(27, activity, article);
                    ig1 ig1Var = new ig1(29, activity, article);
                    Pair pair = new Pair(activity.getString(article.n ? R.string.favorites_remove : R.string.favorites_add), new p5(22, article, cVar));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) owner2.c);
                    if (!drm0.N(str)) {
                        SpannableString spannableString = new SpannableString("\n\n");
                        spannableString.setSpan(new AbsoluteSizeSpan(8, true), 0, spannableString.length(), 0);
                        spannableStringBuilder.append((CharSequence) spannableString);
                        spannableStringBuilder.append((CharSequence) str);
                    }
                    String string = activity.getString(R.string.qr_action_go_to_faves);
                    bbb0 bbb0Var = new bbb0(activity, 5);
                    d.a aVar2 = new d.a(string, bbb0Var, false);
                    com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                    String f2 = owner2.f(com.vk.qrcode.d.c);
                    e3m.a aVar3 = e3m.a;
                    Drawable a2 = m33.a(R.drawable.vk_icon_edit_circle_fill_blue_20, activity);
                    String h = com.vk.qrcode.d.h(activity, cVar);
                    Pair pair2 = new Pair(activity.getString(R.string.qr_action_open_article), ig1Var);
                    boolean z = article.n;
                    if (z) {
                        pair = new Pair(string, bbb0Var);
                    }
                    com.vk.qrcode.d.k(dVar, activity, bVar2, null, f2, null, aVar, a2, h, null, spannableStringBuilder, 5, null, pair2, pair, null, !z ? aVar2 : null, null, null, 1722984);
                }
                return s3q0.a;
            case 8:
                final com.vk.reefton.trackers.g gVar = (com.vk.reefton.trackers.g) obj4;
                final vof0 vof0Var = (vof0) obj3;
                final q7i q7iVar = (q7i) obj2;
                final tnf0 tnf0Var = (tnf0) obj;
                new SingleObserveOn(new puj0(tnf0Var), gVar.e).a(new LambdaSingleObserver(new izs() { // from class: xsna.znf0
                    @Override // xsna.izs
                    public final Object invoke(Object obj6) {
                        tnf0 tnf0Var2 = tnf0.i;
                        tnf0 tnf0Var3 = tnf0.this;
                        if (!epx.f(tnf0Var3, tnf0Var2)) {
                            com.vk.reefton.trackers.g gVar2 = gVar;
                            if (tnf0Var3 == null) {
                                tnf0 b = gVar2.b.b(ReefLocationSource.NETWORK);
                                if (b != null) {
                                    gVar2.f = fhr.a(gVar2.f, com.vk.reefton.trackers.g.g(b), null, 2);
                                }
                            } else {
                                gVar2.f = fhr.a(gVar2.f, com.vk.reefton.trackers.g.g(tnf0Var3), null, 2);
                            }
                            vof0Var.a(fhr.a(gVar2.f, null, null, 3));
                        }
                        q7iVar.onComplete();
                        return s3q0.a;
                    }
                }, new b810(gVar, 21)));
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj3;
                nvy nvyVar = (nvy) obj;
                List list2 = (List) ((mtk0) obj4).getValue();
                nvyVar.e(list2.size(), null, new zph0.e(list2), new jai(2039820996, new zph0.f(list2, izsVar, (zph0) obj2), true));
                nvy.g(nvyVar, null, null, new jai(1750310832, new ini(izsVar, 4), true), 3);
                return s3q0.a;
            case 10:
                izs izsVar2 = (izs) obj4;
                UserId userId2 = (UserId) obj3;
                Context context = (Context) obj2;
                if (izsVar2 != null) {
                    izsVar2.invoke(userId2);
                }
                if (context != null) {
                    xwk.e().h0().h(0, context, fkq0.e(userId2));
                    xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_NOT_MEMBER, fkq0.e(userId2), null, null, 12));
                }
                return s3q0.a;
            case 11:
                ((dks0) obj4).d((oon0) obj3, (qon0) obj2);
                return s3q0.a;
            default:
                ((y7w0) obj4).a((String) obj3, ((VmojiProductModel) obj2).k);
                return s3q0.a;
        }
    }

    public /* synthetic */ ync(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}

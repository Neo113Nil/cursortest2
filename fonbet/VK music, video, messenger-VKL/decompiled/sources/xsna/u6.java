package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.clips.design.view.interests.AvatarWithStepProgress;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.user.UserSex;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.h;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.newsfeed.common.util.a;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.pushes.receivers.c;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.akv;
import xsna.atb0;
import xsna.b4;
import xsna.e8v0;
import xsna.f0r;
import xsna.fz8;
import xsna.gm50;
import xsna.gob;
import xsna.le70;
import xsna.me70;
import xsna.npf;
import xsna.q22;
import xsna.wk50;
import xsna.xn50;
import xsna.ys8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d0  */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ImageSize Cb;
        String str;
        TextView textView;
        String quantityString;
        PhotoStripView photoStripView;
        boolean f;
        int childCount;
        int size;
        int size2;
        int i;
        Iterable iterable;
        int i2 = this.b;
        ArrayList arrayList = null;
        arrayList = null;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i2) {
            case 0:
                AboutVideoItem.j jVar = (AboutVideoItem.j) obj3;
                ((h.a) obj2).l.d(new b4.i0(jVar.b, jVar.c));
                return s3q0.a;
            case 1:
                View view = (View) obj2;
                View view2 = (View) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i3 = AlbumsFragment.j0;
                view.setVisibility(booleanValue ? 0 : 8);
                bwt0.p0(view2, !booleanValue);
                return s3q0.a;
            case 2:
                q22.a aVar = (q22.a) obj3;
                List list = (List) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
                bn40.f("Artist's popular successfully loaded");
                ((com.vk.catalog2.common.ui.mvp.auto.a) obj2).f(aVar.d, musicTrack, list, aVar.c, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, ShuffleMode.SHUFFLE_AUTO);
                return s3q0.a;
            case 3:
                return new Pair(((MusicTrack) obj).Fb(), new fz8.a((String) obj2, (String) obj3));
            case 4:
                CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory = (CatalogGetAudioSearchRequestFactory) obj3;
                io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k((hda) obj);
                return (((String) obj2).length() != 0 || ((Boolean) catalogGetAudioSearchRequestFactory.u.invoke()).booleanValue()) ? k : io.reactivex.rxjava3.core.x.B(k, (io.reactivex.rxjava3.core.b0) catalogGetAudioSearchRequestFactory.w.invoke(), new s41(new CatalogGetAudioSearchRequestFactory.b(2, (dja) catalogGetAudioSearchRequestFactory.x.getValue(), dja.class, "transform", "transform(Lcom/vk/catalog2/common/dto/api/CatalogResponse;Ljava/util/List;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 8));
            case 5:
                akv.a aVar2 = new akv.a();
                aVar2.a = (String) obj;
                aVar2.c((Uri) obj3, "file1", "image.jpg");
                aVar2.f = true;
                aVar2.e = ((g0b) obj2).b.getConfig().v;
                aVar2.d = 5;
                return new akv(aVar2);
            case 6:
                ((a6b) obj2).a.a((VkOnboardingCampaign) obj3, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 7:
                return ((jlb) obj2).a.e(String.valueOf(((UserId) obj3).b), (List) obj);
            case 8:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new fpb((gpb) obj2, (gob.a) obj, (epb) obj3, 0));
                return s3q0.a;
            case 9:
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj2;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj3;
                ClipsFavoriteFolderContentListViewState.b bVar2 = (ClipsFavoriteFolderContentListViewState.b) obj;
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                bVar.c.setVisibility(0);
                bVar.f.setVisibility(8);
                bVar.g.setVisibility(0);
                bVar.h.setVisibility(8);
                gm50.a.a(clipsFavoriteFolderContentListFragment, bVar2.a, new com.vk.voip.ui.menu.feature.a(clipsFavoriteFolderContentListFragment, 25));
                gm50.a.a(clipsFavoriteFolderContentListFragment, bVar2.b, new i50(clipsFavoriteFolderContentListFragment, 13));
                gm50.a.a(clipsFavoriteFolderContentListFragment, bVar2.c, new yx0(bVar, 29));
                ((v2e) clipsFavoriteFolderContentListFragment.U.getValue()).setItems(EmptyList.b);
                return s3q0.a;
            case 10:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) obj2;
                AvatarWithStepProgress avatarWithStepProgress = (AvatarWithStepProgress) obj3;
                ClipsInterestsViewState.a aVar3 = (ClipsInterestsViewState.a) obj;
                int i5 = ClipsInterestsFragment.Y;
                Image image = aVar3.a;
                if (image != null && (Cb = image.Cb(((Number) clipsInterestsFragment.V.getValue()).intValue(), true, false)) != null && (str = Cb.d.d) != null) {
                    avatarWithStepProgress.setImage(str);
                }
                avatarWithStepProgress.setProgress(aVar3.b);
                return s3q0.a;
            case 11:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj3;
                int intValue = ((Integer) obj).intValue();
                int i6 = ClipsWrapperFragment.Q0;
                npf.b bVar3 = new npf.b(intValue);
                clipsWrapperFragment.getClass();
                xn50.a.c(clipsWrapperFragment, bVar3);
                return s3q0.a;
            case 12:
                Context context = (Context) obj2;
                ynh ynhVar = (ynh) obj3;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                if (extendedCommunityProfile.G != null && (!r2.isEmpty())) {
                    arrayList = new ArrayList();
                    arrayList.add(new wr9(context.getString(R.string.group_links), Integer.valueOf(extendedCommunityProfile.G.size()), null, null, 28));
                    Iterator<ExtendedUserProfile.Link> it = extendedCommunityProfile.G.iterator();
                    while (it.hasNext()) {
                        ExtendedUserProfile.Link next = it.next();
                        arrayList.add(new y7j(next.c, next.d, next.e, R.drawable.vk_icon_link_24, new s1h(ynhVar, context, next, 0), next.b, extendedCommunityProfile.a.c, "link", 12));
                    }
                }
                return arrayList;
            case 13:
                ArrayList arrayList2 = ((wqh) obj2).b;
                wow wowVar = new wow(arrayList2);
                ((nvy) obj).e(arrayList2.size(), new mqh(new zj(18), wowVar), new nqh(wowVar), new jai(802480018, new oqh(wowVar, (izs) obj3), true));
                return s3q0.a;
            case 14:
                ((onk) obj2).c.a(((JSONObject) obj).toString(), (String) obj3);
                return s3q0.a;
            case 15:
                ((dcl) obj2).e = null;
                bn40.c((Throwable) obj, "BMSBM", "Failed getSubscription request");
                ((ys8.b) obj3).onError(dcl.c(false));
                return s3q0.a;
            case 16:
                ((fwm) obj2).a.a((VkOnboardingCampaign) obj3, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 17:
                ((ww5) obj2).invoke((Date) obj);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj3).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 18:
                return jnq.g((com.vk.lists.c) obj2, (jnq) obj3, (List) obj);
            case 19:
                ((f0r.k) obj2).h((wk50.a) obj3, (Throwable) obj);
                return s3q0.a;
            case 20:
                return new w6u((ViewGroup) obj, (sop) obj2, new bih((n5u) obj3, 19));
            case 21:
                String str2 = (String) obj3;
                ((l2y) obj2).w0().j(fco0.h(str2 != null ? str2 : "", (Throwable) obj));
                return s3q0.a;
            case 22:
                ((st10) obj2).a.a(new e.b.c(st10.d((List) obj), ((LocalAlbum) obj3).c));
                return s3q0.a;
            case 23:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.f((Context) obj2, (Intent) obj3, false);
                return s3q0.a;
            case 24:
                ((Boolean) obj).getClass();
                ((izs) obj2).invoke(new le70.j(((me70.c) obj3).a));
                return s3q0.a;
            case 25:
                PodcastAttachment podcastAttachment = (PodcastAttachment) obj2;
                boolean X = podcastAttachment.X();
                podcastAttachment.s0(!X);
                ((nhb0) obj3).b7(X);
                if (X) {
                    cvk.u(R.string.podcast_toast_fave_failed, false);
                } else {
                    cvk.u(R.string.podcast_toast_unfave_failed, false);
                }
                return s3q0.a;
            case 26:
                atb0.a aVar5 = (atb0.a) obj3;
                final Poll poll = (Poll) obj;
                zsb0 zsb0Var = ((msb0) obj2).i1;
                final zsb0 zsb0Var2 = zsb0Var != null ? zsb0Var : null;
                ImageView imageView = zsb0Var2.s;
                LinearLayout linearLayout = zsb0Var2.o;
                Context context2 = zsb0Var2.b;
                Owner owner = poll.w;
                List<PollOption> list2 = poll.f;
                imageView.setVisibility((owner != null || poll.t0() || poll.Ab()) ? 0 : 8);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: xsna.xsb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        hsb0 hsb0Var = new hsb0();
                        hsb0Var.b = Poll.this;
                        zsb0 zsb0Var3 = zsb0Var2;
                        hsb0Var.b(zsb0Var3.u);
                        hsb0Var.a(zsb0Var3.b, new a.AbstractC1374a.b(view3)).g();
                    }
                });
                int i7 = poll.h;
                TextView textView2 = zsb0Var2.f;
                int i8 = zsb0.x;
                textView2.setTextColor(e3m.f(i8, context2));
                TextView textView3 = zsb0Var2.g;
                textView3.setText(poll.d);
                textView3.setTextColor(e3m.f(i8, textView3.getContext()));
                TextView textView4 = zsb0Var2.l;
                bpn0 bpn0Var = csb0.a;
                Context context3 = textView4.getContext();
                long j = poll.k;
                boolean z = poll.i;
                String string = context3.getString(z ? R.string.poll_anonym : R.string.poll_public);
                String string2 = j <= 0 ? "" : poll.isExpired() ? context3.getString(R.string.poll_expired) : poll.isClosed() ? context3.getString(R.string.poll_closed) : csb0.c((int) j, false, false);
                if (string2.length() > 0) {
                    if (string2.length() > 0) {
                        string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                    }
                    string = context3.getString(R.string.poll_info_subtitle, string, string2);
                }
                textView4.setText(string);
                Context context4 = textView4.getContext();
                int i9 = zsb0.y;
                textView4.setTextColor(e3m.f(i9, context4));
                TextView textView5 = zsb0Var2.k;
                Context context5 = textView5.getContext();
                String string3 = poll.o ? context5.getString(R.string.poll_info_subtitle, context5.getString(R.string.poll_disable_unvote_title), "") : "";
                if (string3.length() > 0) {
                    textView5.setText(string3);
                    textView5.setTextColor(e3m.f(i9, textView5.getContext()));
                    textView5.setVisibility(0);
                } else {
                    textView5.setVisibility(8);
                }
                TextView textView6 = zsb0Var2.m;
                Context context6 = textView6.getContext();
                boolean z2 = o25.a().o().d == UserSex.FEMALE;
                if (i7 == 0 && poll.Bb()) {
                    quantityString = context6.getString(z2 ? R.string.poll_vote_first_female : R.string.poll_vote_first_male);
                } else {
                    if (i7 != 0) {
                        textView = textView6;
                        quantityString = context6.getResources().getQuantityString(R.plurals.poll_v3_voters, (int) uqm0.b(i7), uqm0.d(i7));
                        textView.setText(quantityString);
                        textView.setTextColor(e3m.f(i9, textView.getContext()));
                        textView.setVisibility(0);
                        photoStripView = zsb0Var2.n;
                        ArrayList Db = poll.Db();
                        if (!z || i7 < 3 || Db.size() < 3) {
                            photoStripView.setVisibility(8);
                        } else {
                            photoStripView.setPadding(iah0.a(2));
                            photoStripView.setOverlapOffset(0.8f);
                            photoStripView.setVisibility(0);
                            photoStripView.l(-1, rli0.A(rli0.y(rli0.m(new ulp0(new i5g(Db), new wo40(10))), 3)));
                        }
                        f = epx.f(aVar5.b.a(), Boolean.TRUE);
                        childCount = linearLayout.getChildCount();
                        size = list2.size();
                        int i10 = 4;
                        if (childCount >= size) {
                            int i11 = size - childCount;
                            for (int i12 = 0; i12 < i11; i12++) {
                                nsb0 nsb0Var = new nsb0(context2);
                                nsb0Var.setCornerRadius(iah0.a(10));
                                nsb0Var.setOnClickListener(new hmb(i10, zsb0Var2, poll));
                                nsb0Var.setOnLongClickListener(new arr(1, poll, zsb0Var2));
                                nsb0Var.setOnOptionCheckedListenerListener(new ysb0(zsb0Var2));
                                linearLayout.addView(nsb0Var, -1, -2);
                            }
                        } else if (childCount > size) {
                            while (size < childCount) {
                                linearLayout.getChildAt(size).setVisibility(8);
                                size++;
                            }
                        }
                        if (f) {
                            vvr0.c();
                        }
                        size2 = list2.size();
                        i = 0;
                        while (i < size2) {
                            View childAt = linearLayout.getChildAt(i);
                            if (childAt != null && (childAt instanceof nsb0)) {
                                nsb0 nsb0Var2 = (nsb0) childAt;
                                nsb0Var2.f.setVisibility(4);
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nsb0Var2.getLayoutParams();
                                marginLayoutParams.topMargin = i != 0 ? zsb0.v : 0;
                                int i13 = zsb0.w;
                                marginLayoutParams.setMarginStart(i13);
                                marginLayoutParams.setMarginEnd(i13);
                                nsb0Var2.setVisibility(0);
                                nsb0Var2.a(poll, list2.get(i), f);
                                nsb0Var2.setLayoutParams(marginLayoutParams);
                                nsb0Var2.setEnabled(true);
                                nsb0Var2.setClickable(poll.Bb());
                                s3q0 s3q0Var = s3q0.a;
                            }
                            i++;
                        }
                        ProgressBar progressBar = zsb0Var2.q;
                        progressBar.setVisibility(8);
                        progressBar.getIndeterminateDrawable().setColorFilter(e3m.f(zsb0.z, progressBar.getContext()), PorterDuff.Mode.MULTIPLY);
                        return s3q0.a;
                    }
                    quantityString = context6.getString(R.string.poll_no_votes);
                }
                textView = textView6;
                textView.setText(quantityString);
                textView.setTextColor(e3m.f(i9, textView.getContext()));
                textView.setVisibility(0);
                photoStripView = zsb0Var2.n;
                ArrayList Db2 = poll.Db();
                if (z) {
                }
                photoStripView.setVisibility(8);
                f = epx.f(aVar5.b.a(), Boolean.TRUE);
                childCount = linearLayout.getChildCount();
                size = list2.size();
                int i102 = 4;
                if (childCount >= size) {
                }
                if (f) {
                }
                size2 = list2.size();
                i = 0;
                while (i < size2) {
                }
                ProgressBar progressBar2 = zsb0Var2.q;
                progressBar2.setVisibility(8);
                progressBar2.getIndeterminateDrawable().setColorFilter(e3m.f(zsb0.z, progressBar2.getContext()), PorterDuff.Mode.MULTIPLY);
                return s3q0.a;
            case 27:
                mtk0 mtk0Var = (mtk0) obj2;
                ClipsSeekBar clipsSeekBar = (ClipsSeekBar) obj;
                if (((Boolean) ((wh50) obj3).getValue()).booleanValue()) {
                    return s3q0.a;
                }
                clipsSeekBar.setValue(((nwa0) mtk0Var.getValue()).b);
                return s3q0.a;
            case 28:
                kyd kydVar = (kyd) obj3;
                com.vk.clips.editor.state.model.b bVar4 = (com.vk.clips.editor.state.model.b) obj;
                huj0 huj0Var = ((guj0) obj2).c;
                return (com.vk.clips.editor.state.model.b) (huj0Var != null ? huj0Var : null).a(kydVar, bVar4);
            default:
                ddl0 ddl0Var = (ddl0) obj2;
                Context context7 = (Context) obj3;
                Collection<UserId> collection = ddl0Var.b.b;
                if (collection == null || (iterable = j5g.O0(collection)) == null) {
                    iterable = EmptyList.b;
                }
                String str3 = ddl0Var.d;
                if (str3 == null) {
                    str3 = "styles_selector";
                }
                String str4 = str3;
                zal0 a = g2v.d().a();
                Iterable iterable2 = iterable;
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((UserId) it2.next()).b));
                }
                a.u(context7, true, arrayList3, ddl0Var.c, str4);
                return s3q0.a;
        }
    }
}

package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.sdk.api.ExternApiConfigProviderImpl;
import ru.ok.android.sdk.api.config.SdkApiConfig;
import xsna.dis;
import xsna.egm;
import xsna.ish0;
import xsna.rv9;
import xsna.uvo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tx(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        CoverChooseState.CoverDestination coverDestination;
        s3q0 writeAsync$lambda$0;
        int i = this.b;
        int i2 = 0;
        com.vk.newsfeed.common.recycler.holders.a aVar = null;
        r3 = null;
        Date date = null;
        int i3 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                PostingAction postingAction = (PostingAction) obj2;
                izs izsVar = (izs) obj;
                if (postingAction != null) {
                    izsVar.invoke(postingAction);
                }
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                ux0 ux0Var = cVar.B;
                cjh0 o = cVar.g.o();
                yux yuxVar = cVar.l;
                boolean z = cVar.p;
                bb bbVar = new bb(cVar, 2);
                return new uy0(ux0Var, this.d, o, yuxVar, z, new qw0(new cb(cVar, 3), bbVar, bbVar, new ey0(cVar, i2), new eb(cVar, i3)), cVar.q);
            case 2:
                ((izs) obj).invoke((rl1) obj2);
                return s3q0.a;
            case 3:
                AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) obj;
                ((nt4) obj2).O.d(audioPlaylistAttachment.f, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g));
                return s3q0.a;
            case 4:
                ((izs) obj).invoke(new rv9.i.b((a.C0919a) obj2));
                return s3q0.a;
            case 5:
                return ((wgb) obj2).s + ": loadNextFromNetwork: load from network since=" + ((aeb) obj);
            case 6:
                ((io.reactivex.rxjava3.disposables.c) obj2).dispose();
                ((g3b) obj).invoke();
                return s3q0.a;
            case 7:
                k0h k0hVar = (k0h) obj;
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        qi6 qi6Var = (qi6) it.next();
                        com.vk.newsfeed.common.recycler.holders.a aVar2 = qi6Var instanceof com.vk.newsfeed.common.recycler.holders.a ? (com.vk.newsfeed.common.recycler.holders.a) qi6Var : null;
                        if (aVar2 != null) {
                            aVar = aVar2;
                        }
                    }
                }
                if (aVar == null) {
                    return s3q0.a;
                }
                View view = aVar.U;
                if (view.getVisibility() == 0 && !k0hVar.c) {
                    k0hVar.b.invoke(view, k0hVar);
                    k0hVar.c = true;
                }
                return s3q0.a;
            case 8:
                ((izs) obj).invoke((AdminLeaveAction) obj2);
                return s3q0.a;
            case 9:
                CoverChooseArguments coverChooseArguments = (CoverChooseArguments) obj;
                CoverChooseFragmentInternalComponent.a aVar3 = CoverChooseFragmentInternalComponent.e;
                CoverChooseState coverChooseState = (CoverChooseState) ((gzs) obj2).invoke();
                if (coverChooseState != null) {
                    return coverChooseState;
                }
                CoverChooseState.CoverDestination.Companion.getClass();
                if (coverChooseArguments instanceof CoverChooseArguments.VideoCoverChooseArguments) {
                    coverDestination = CoverChooseState.CoverDestination.VIDEO;
                } else {
                    if (!(coverChooseArguments instanceof CoverChooseArguments.AlbumCoverChooseArguments)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coverDestination = CoverChooseState.CoverDestination.ALBUM;
                }
                return new CoverChooseState(coverDestination, null, null, null, false, 30, null);
            case 10:
                izs izsVar2 = (izs) obj;
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj2;
                Date date2 = (Date) dateTimePickerState.j.getValue();
                if (date2 != null && ((Boolean) dateTimePickerState.e.getValue()).booleanValue()) {
                    date = date2;
                }
                izsVar2.invoke(date);
                return s3q0.a;
            case 11:
                hgm hgmVar = (hgm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImVkCounter imVkCounter = new ImVkCounter(hgmVar.d, 0);
                imVkCounter.setId(R.id.dialog_item_unread_reactions_icon);
                imVkCounter.setRenderMode(ImVkCounter.DrawMode.IMAGE);
                imVkCounter.setSize(VkCounter.Size.Medium);
                imVkCounter.setImageScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imVkCounter.setContentDescription(null);
                int i4 = hgmVar.k0;
                egm.b bVar = hgmVar.m;
                imVkCounter.setLayoutParams(egm.W(hgmVar, i4, i4, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                imVkCounter.setAppearance(new VkCounter.CounterAppearance.a(R.attr.vk_ui_background_accent_themed, R.attr.vk_ui_background_accent_themed));
                Pair pair = new Pair(Integer.valueOf(R.drawable.vk_icon_stars_16), Integer.valueOf(R.attr.vk_ui_icon_contrast_themed));
                imVkCounter.e(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
                bwt0.p0(imVkCounter, false);
                viewGroup.addView(imVkCounter);
                return imVkCounter;
            case 12:
                ((izs) obj).invoke(new uvo.c((DurationOption) obj2));
                return s3q0.a;
            case 13:
                writeAsync$lambda$0 = ExternApiConfigProviderImpl.writeAsync$lambda$0((ExternApiConfigProviderImpl) obj2, (SdkApiConfig) obj);
                return writeAsync$lambda$0;
            case 14:
                ((dis.b) obj2).l.b(((FriendItem) obj).b);
                return s3q0.a;
            case 15:
                ((GroupCardItemVh) obj2).r((Group) obj, true);
                return s3q0.a;
            case 16:
                maz.c(xwk.d().e(), (Activity) obj2, vm40.c((String) obj, null), LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 17:
                ArrayList arrayList = (ArrayList) obj2;
                rey reyVar = (rey) obj;
                String g0 = j5g.g0(arrayList, null, "(", ")", 0, new x50(24), 25);
                reyVar.b.execSQL("DELETE FROM key_value WHERE key IN " + g0);
                ReentrantLock reentrantLock = reyVar.d;
                reentrantLock.lock();
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        reyVar.c.remove((String) it2.next());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 18:
                return "onHistoryError: MsgHistory load error " + qjg.a((Throwable) obj2) + ", " + ((w920) obj).l();
            case 19:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_pinned_msg_time_etc), ((roa0) obj).f);
            case 20:
                return Boolean.valueOf(!epx.f(((hpb0) obj2).m(), ((Poll) obj).d));
            case 21:
                ish0[] ish0VarArr = (ish0[]) obj2;
                f4z f4zVar = ((vqh0) obj).g;
                if (ish0VarArr.length == 0) {
                    return s3q0.a;
                }
                int length = ish0VarArr.length;
                while (i2 < length) {
                    ish0VarArr[i2].toString();
                    i2++;
                }
                if (ish0VarArr.length == 1) {
                    f4zVar.b(rl3.L(ish0VarArr));
                } else {
                    f4zVar.b(new ish0.a(Arrays.asList(ish0VarArr)));
                }
                return s3q0.a;
            case 22:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj2;
                videoCatalogRootVh.U.remove((String) obj);
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar4 = videoCatalogRootVh.L0;
                if (!aVar4.b.a()) {
                    aVar4.e.a(true);
                    aVar4.h.a(true);
                }
                return s3q0.a;
            case 23:
                gzs gzsVar = (gzs) obj;
                if (((VkAuthPhoneView) obj2).f.isEnabled()) {
                    RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                    RegistrationElementsTracker.a.a(TrackingElement.Registration.PHONE_COUNTRY, null);
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                ((izs) obj).invoke(((FriendsAndFollowersBlockData) obj2).d);
                return s3q0.a;
        }
    }

    public /* synthetic */ tx(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = obj;
    }
}

package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockText;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.TextVh;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.engine.internal.storage.structure.DbMigrationException;
import com.vk.im.engine.internal.storage.structure.TooOldDbException;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.posting.presentation.video.f;
import com.vk.posting.presentation.video.model.VideoPickerFilter;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.browser_events.VkAppEvent;
import com.vk.toggle.features.VkcFeatures;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.ad.ux.ShoppableAdView;
import xsna.aiq0;
import xsna.b2l;
import xsna.bwq0;
import xsna.c9w0;
import xsna.cs;
import xsna.i8w0;
import xsna.m5m0;
import xsna.mot0;
import xsna.qs80;
import xsna.r1r0;
import xsna.svq0;
import xsna.tj50;
import xsna.u8r0;
import xsna.vim0;
import xsna.wwi0;
import xsna.x7j0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e9i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e9i0(defpackage.l lVar, abs0 abs0Var, Activity activity) {
        this.b = 20;
        this.c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebStoryBox webStoryBox;
        ArrayList<UIBlock> arrayList;
        int i = this.b;
        boolean z = false;
        r2 = false;
        r2 = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                g9i0 g9i0Var = (g9i0) obj2;
                g9i0Var.a.Z0(g9i0Var.e.getItem(((Integer) obj).intValue()).a);
                return s3q0.a;
            case 1:
                ((bei0) obj2).k(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 2:
                hxi0 hxi0Var = (hxi0) obj2;
                gxi0 gxi0Var = hxi0Var.e;
                wwi0 wwi0Var = (wwi0) obj;
                if (!wwi0Var.d) {
                    return gxi0Var;
                }
                wwi0.b bVar = wwi0Var.e;
                return bVar instanceof wwi0.b.C3961b ? new exi0(((wwi0.b.C3961b) bVar).a.a, z ? 1 : 0) : bVar instanceof wwi0.b.a ? hxi0Var.d : gxi0Var;
            case 3:
                b2l.a aVar = (b2l.a) obj2;
                int i2 = aVar.c;
                int i3 = aVar.b;
                if (i3 < 1) {
                    throw new TooOldDbException(efz.a(i3, i2, "Migration failed from version=", ", actual version="), new IllegalStateException());
                }
                int i4 = i3 + 1;
                int i5 = i3 + 1;
                if (i5 <= i2) {
                    int i6 = i4;
                    while (true) {
                        try {
                            izs<b2l.a, Boolean> izsVar = l1j0.b.get(Integer.valueOf(i5));
                            if (izsVar != null) {
                                try {
                                    if (!izsVar.invoke(aVar).booleanValue()) {
                                        i6 = i5;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw new DbMigrationException(efz.a(i5, i2, "Migration failed to version=", ", actual version="), th);
                                }
                            }
                            if (i5 != i2) {
                                i5++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i5 = i6;
                        }
                    }
                }
                return s3q0.a;
            case 4:
                e8j0 e8j0Var = (e8j0) obj2;
                x7j0.n nVar = new x7j0.n((StoryPrivacyType) obj);
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, nVar);
                return s3q0.a;
            case 5:
                ((ShoppableAdView) obj2).e.setAlpha(((Float) obj).floatValue());
                return s3q0.a;
            case 6:
                enj0 enj0Var = (enj0) obj2;
                enj0Var.c.e2(new aiq0.m(((Boolean) obj).booleanValue()));
                enj0Var.c.e2(aiq0.g.c.b);
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                ((rcl0) obj2).b.no(true);
                return s3q0.a;
            case 8:
                StoryGalleryActivity storyGalleryActivity = (StoryGalleryActivity) obj2;
                b.d dVar = (b.d) obj;
                StoryCameraParams storyCameraParams = storyGalleryActivity.z;
                if (storyCameraParams != null && (webStoryBox = storyCameraParams.u) != null && webStoryBox.Db()) {
                    nf9 nf9Var = nf9.b;
                    StoryCameraParams storyCameraParams2 = storyGalleryActivity.z;
                    nf9.n(dVar, storyCameraParams2 != null ? storyCameraParams2.Y : null);
                }
                return s3q0.a;
            case 9:
                m5m0 m5m0Var = (m5m0) obj2;
                VkFormField vkFormField = m5m0Var.f;
                String obj3 = m5m0Var.g.getEditableText().toString();
                if (m5m0Var.b.a(obj3)) {
                    vkFormField.setError(false);
                    izs<? super m5m0.a, s3q0> izsVar2 = m5m0Var.e;
                    if (izsVar2 != null) {
                        izsVar2.invoke(new m5m0.a(obj3, m5m0Var.h.getEditableText().toString(), m5m0Var.c));
                    }
                } else {
                    vkFormField.setError(true);
                }
                return s3q0.a;
            case 10:
                ((wim0) obj2).c.fo(vim0.a.b);
                return s3q0.a;
            case 11:
                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if ((uIBlock instanceof UIBlockActionFilter) && epx.f(uIBlock.c, uIBlockActionFilter.c)) {
                    UIBlockActionFilter uIBlockActionFilter2 = (UIBlockActionFilter) uIBlock;
                    if (epx.f(uIBlockActionFilter2.A, uIBlockActionFilter.A) && epx.f(uIBlockActionFilter2.B, uIBlockActionFilter.B)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                TextVh textVh = (TextVh) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (textVh.g != null && ((arrayList = uIBlockList.y) == null || !arrayList.isEmpty())) {
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String Fb = ((UIBlock) it.next()).Fb();
                            UIBlockText uIBlockText = textVh.g;
                            if (epx.f(Fb, uIBlockText != null ? uIBlockText.y : null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 13:
                ((wh50) obj2).setValue((String) obj);
                return s3q0.a;
            case 14:
                tuq0 tuq0Var = (tuq0) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    return EmptyList.b;
                }
                VkcFeatures vkcFeatures = VkcFeatures.MIGRATION_USERS_GET_TO_ACC_GET_3;
                vkcFeatures.getClass();
                if (!com.vk.toggle.b.A.a(vkcFeatures)) {
                    List list2 = (List) yfb.x(r1r0.a.b(tuq0Var.h.c, list, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)).u(0L);
                    if (list2 == null) {
                        return EmptyList.b;
                    }
                    List<UsersUserFullDto> list3 = list2;
                    j2r0 j2r0Var = tuq0Var.o;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (UsersUserFullDto usersUserFullDto : list3) {
                        j2r0Var.getClass();
                        arrayList2.add(j2r0.a(usersUserFullDto));
                    }
                    return arrayList2;
                }
                List singletonList = Collections.singletonList("photo_base");
                if ((1 & 12) != 0) {
                    list = null;
                }
                List list4 = (List) yfb.x(cs.a.a((12 & 4) == 0 ? "nom" : null, list, singletonList)).u(0L);
                if (list4 == null) {
                    return EmptyList.b;
                }
                List<AccountGetUserObjectDto> list5 = list4;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                for (AccountGetUserObjectDto accountGetUserObjectDto : list5) {
                    UserProfile userProfile = new UserProfile();
                    Long i7 = accountGetUserObjectDto.i();
                    userProfile.c = i7 != null ? new UserId(i7.longValue()) : new UserId(0L);
                    userProfile.d = accountGetUserObjectDto.f();
                    userProfile.f = accountGetUserObjectDto.j();
                    userProfile.e = userProfile.d + ' ' + userProfile.f;
                    userProfile.g = accountGetUserObjectDto.k();
                    arrayList3.add(userProfile);
                }
                return arrayList3;
            case 15:
                zvq0 zvq0Var = (zvq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                zvq0Var.w(wallWithCounters, true);
                zvq0Var.e(new bwq0.a.m(wallWithCounters.m()));
                zvq0Var.e(new bwq0.a.k(wallWithCounters.k()));
                zvq0Var.e(new bwq0.a.f(wallWithCounters.j()));
                zvq0Var.c(new svq0.b.r(wallWithCounters.k(), wallWithCounters.l()));
                return s3q0.a;
            case 16:
                u8r0 u8r0Var = (u8r0) obj2;
                VkAppEvent vkAppEvent = (VkAppEvent) obj;
                if ((vkAppEvent == null ? -1 : u8r0.b.$EnumSwitchMapping$0[vkAppEvent.ordinal()]) == 1) {
                    u8r0Var.m();
                    u8r0Var.a.j();
                }
                return s3q0.a;
            case 17:
                PorterDuffColorFilter porterDuffColorFilter = VKStickerImageView.p;
                ((VKStickerImageView) obj2).U0();
                return s3q0.a;
            case 18:
                ux00 ux00Var = new ux00(new gib0((Long) obj, 20), 27);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return ((io.reactivex.rxjava3.internal.operators.observable.b0) obj2).E(ux00Var, lVar, kVar, kVar);
            case 19:
                ((io.reactivex.rxjava3.core.r) obj2).onNext((List) obj);
                return s3q0.a;
            case 20:
                ((defpackage.l) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 21:
                ((io.reactivex.rxjava3.core.y) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 22:
                com.vk.posting.presentation.video.f fVar = (com.vk.posting.presentation.video.f) obj2;
                int i8 = f.a.$EnumSwitchMapping$0[((VideoPickerFilter) obj).ordinal()];
                if (i8 == 1) {
                    fVar.g.setTabSelected(true);
                    fVar.h.setTabSelected(false);
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar.h.setTabSelected(true);
                    fVar.g.setTabSelected(false);
                }
                return s3q0.a;
            case 23:
                Context context = (Context) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistPlaceHolder) obj2).t;
                mot0.b(mot0.a.a, context, videoAlbum.c, videoAlbum.b, null, 24);
                return s3q0.a;
            case 24:
                return VideoRelatedVideosFragment.io((VideoRelatedVideosFragment) obj2, (mbt0) obj);
            case 25:
                izs izsVar3 = (izs) obj2;
                Throwable th3 = (Throwable) obj;
                if (izsVar3 != null) {
                    izsVar3.invoke(new qs80.a(th3));
                }
                return s3q0.a;
            case 26:
                com.vk.fullscreenvideo.a aVar2 = (com.vk.fullscreenvideo.a) obj;
                izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar4 = ((VideoTopBarView) obj2).g;
                if (izsVar4 != null) {
                    izsVar4.invoke(aVar2);
                }
                return s3q0.a;
            case 27:
                lkr0 lkr0Var = ((j9u0) obj2).a;
                if (lkr0Var != null) {
                    lkr0Var.b();
                }
                return s3q0.a;
            case 28:
                return new i8w0.b(((tj50.a) obj).a(new u7w0(1, ((v7w0) obj2).e, b7w0.class, "toViewState", "toViewState(Lcom/vk/vmoji/character/mvi/VmojiCharacterState$Content;)Lcom/vk/vmoji/character/mvi/VmojiCharacterViewState$CharacterList;", 0), ao8.d));
            default:
                ((i9w0) obj2).c.invoke(c9w0.c.b);
                return s3q0.a;
        }
    }

    public /* synthetic */ e9i0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}

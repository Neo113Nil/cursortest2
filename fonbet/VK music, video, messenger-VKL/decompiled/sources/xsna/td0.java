package xsna;

import android.animation.AnimatorSet;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.SystemClock;
import android.os.Trace;
import android.widget.FrameLayout;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.user.RequestUserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogTagsStorageManagerImpl;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogTag;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.log.L;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Parameters;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Response;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.toggle.features.FeedFeatures;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.VideoAttachment;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aue;
import xsna.c610;
import xsna.dt20;
import xsna.e19;
import xsna.fcw;
import xsna.gcw;
import xsna.gss;
import xsna.kqe;
import xsna.lx9;
import xsna.mmx;
import xsna.ocz0;
import xsna.r9m;
import xsna.rv9;
import xsna.ute;
import xsna.v1j;
import xsna.w510;
import xsna.yx40;
import xsna.z4e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class td0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ td0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, i] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        UsersUserFullDto usersUserFullDto;
        kss kssVar;
        Boolean T2;
        BaseBoolIntDto D;
        FriendsFriendStatusStatusDto V0;
        BaseBoolIntDto g3;
        wjz0 content;
        lhz0 lhz0Var;
        gjx gjxVar;
        Image image;
        Image image2;
        VideoAttachment videoAttachment;
        VideoUrl videoUrl;
        String a;
        l0n d;
        int i = this.b;
        int i2 = 14;
        int i3 = 2;
        int i4 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((ae0) obj4).a.d.invoke((jd0) obj);
                ((gzs) obj3).invoke();
                return s3q0.a;
            case 1:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new wd1((Integer) obj4, (td1) obj3, null), 3));
            case 2:
                int i5 = BaseVkSearchView.P;
                ((BaseVkSearchView) obj4).postDelayed(new t12((gzs) obj3, i3), 100L);
                return s3q0.a;
            case 3:
                VkBlurView vkBlurView = (VkBlurView) obj;
                vkBlurView.setupWithContent((VkBlurContentView) obj4);
                vkBlurView.setBlurRadius(((vak0) ((bh7) obj3).d).getFloatValue());
                return s3q0.a;
            case 4:
                izs izsVar = (izs) obj4;
                Object obj5 = ((e19.a) obj3).l;
                izsVar.invoke(obj5 != null ? obj5 : null);
                return s3q0.a;
            case 5:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj4;
                yp9 yp9Var = (yp9) obj3;
                requestUserProfile.i0 = null;
                for (Object obj6 : (List) obj) {
                    UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) obj6;
                    if (epx.f(usersUserFullDto2.s1(), requestUserProfile.c) || epx.f(usersUserFullDto2.e(), requestUserProfile.t0)) {
                        obj2 = obj6;
                        usersUserFullDto = (UsersUserFullDto) obj2;
                        if (usersUserFullDto != null && (g3 = usersUserFullDto.g3()) != null) {
                            requestUserProfile.j = g3 != BaseBoolIntDto.YES;
                        }
                        if (usersUserFullDto != null && (V0 = usersUserFullDto.V0()) != null) {
                            requestUserProfile.v = V0.i();
                        }
                        if (usersUserFullDto != null && (D = usersUserFullDto.D()) != null) {
                            requestUserProfile.a0(D == BaseBoolIntDto.YES);
                        }
                        if (usersUserFullDto != null && (T2 = usersUserFullDto.T2()) != null) {
                            requestUserProfile.z = T2.booleanValue();
                        }
                        if (requestUserProfile.v == 2 && (kssVar = yp9Var.h) != null) {
                            kssVar.c(new gss.c(requestUserProfile.c));
                        }
                        g2r0 g2r0Var = yp9Var.d;
                        SubscribeStatus.a aVar = SubscribeStatus.Companion;
                        int i6 = requestUserProfile.v;
                        aVar.getClass();
                        kym0 kym0Var = new kym0(SubscribeStatus.a.a(i6), requestUserProfile.c, requestUserProfile.t0, null, 8);
                        g2r0Var.c.add(kym0Var);
                        g2r0Var.b.b(kym0Var);
                        return s3q0.a;
                    }
                }
                obj2 = null;
                usersUserFullDto = (UsersUserFullDto) obj2;
                if (usersUserFullDto != null) {
                    requestUserProfile.j = g3 != BaseBoolIntDto.YES;
                }
                if (usersUserFullDto != null) {
                    requestUserProfile.v = V0.i();
                }
                if (usersUserFullDto != null) {
                    requestUserProfile.a0(D == BaseBoolIntDto.YES);
                }
                if (usersUserFullDto != null) {
                    requestUserProfile.z = T2.booleanValue();
                }
                if (requestUserProfile.v == 2) {
                    kssVar.c(new gss.c(requestUserProfile.c));
                }
                g2r0 g2r0Var2 = yp9Var.d;
                SubscribeStatus.a aVar2 = SubscribeStatus.Companion;
                int i62 = requestUserProfile.v;
                aVar2.getClass();
                kym0 kym0Var2 = new kym0(SubscribeStatus.a.a(i62), requestUserProfile.c, requestUserProfile.t0, null, 8);
                g2r0Var2.c.add(kym0Var2);
                g2r0Var2.b.b(kym0Var2);
                return s3q0.a;
            case 6:
                ((yw9) obj4).e.invoke(new rv9.i.j(((lx9.m) obj3).a));
                return s3q0.a;
            case 7:
                io.reactivex.rxjava3.internal.operators.observable.b0 b0Var = (io.reactivex.rxjava3.internal.operators.observable.b0) obj4;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return b0Var;
                }
                io.reactivex.rxjava3.internal.operators.observable.k2 k2Var = new io.reactivex.rxjava3.internal.operators.observable.k2(b0Var, new br(new a60(i4), 10));
                qVar.getClass();
                return io.reactivex.rxjava3.core.q.q(qVar, k2Var);
            case 8:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) obj4;
                int i7 = ClipsEntryPointDraftsFragment.Y;
                ((v8f) clipsEntryPointDraftsFragment.X.getValue()).c(clipsEntryPointDraftsFragment.requireContext(), (Throwable) obj, ((ido) obj3).a, new e5(clipsEntryPointDraftsFragment, 27));
                return s3q0.a;
            case 9:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj4;
                pgn pgnVar = clipsFavoritesFoldersPickerFragment.S;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                z4e z4eVar = (z4e) obj;
                ClipsFavoritesFoldersPickerFragment.a aVar3 = ClipsFavoritesFoldersPickerFragment.V;
                if (z4eVar instanceof z4e.a) {
                    if (((z4e.a) z4eVar).a) {
                        qcy<Object>[] qcyVarArr = ClipsFavoritesFoldersPickerFragment.W;
                        qcy<Object> qcyVar = qcyVarArr[0];
                        if (((io.reactivex.rxjava3.disposables.c) pgnVar.b) == null) {
                            io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.q.B0(250L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jv(new j5(clipsFavoritesFoldersPickerFragment, 25), i2));
                            qcy<Object> qcyVar2 = qcyVarArr[0];
                            pgnVar.b(subscribe);
                        }
                    } else {
                        clipsFavoritesFoldersPickerFragment.dismiss();
                    }
                } else if (z4eVar instanceof z4e.b) {
                    gzs gzsVar = (gzs) ref$ObjectRef.element;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    ref$ObjectRef.element = null;
                } else {
                    if (!(z4eVar instanceof z4e.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ref$ObjectRef.element = new defpackage.i(clipsFavoritesFoldersPickerFragment, 26);
                }
                return s3q0.a;
            case 10:
                ((ste) obj4).j.b(ute.b.a);
                io.reactivex.rxjava3.subjects.f<kqe> fVar = iqe.a;
                iqe.a.onNext(new kqe.a(((aue.b) obj3).e.b));
                return s3q0.a;
            case 11:
                i3i i3iVar = (i3i) obj3;
                ((aug) obj4).l.invoke(i3iVar.b, i3iVar.c);
                return s3q0.a;
            case 12:
                ((gak) obj4).l.invoke(new v1j.v(true, ((fak) obj3).b));
                return s3q0.a;
            case 13:
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(((r9m) obj4).a.e());
                for (q9m q9mVar : (ArrayList) obj3) {
                    compileStatement.clearBindings();
                    compileStatement.bindString(r9m.a.NAME.h(), q9mVar.a);
                    compileStatement.bindString(r9m.a.LIGHT_THEME_DATA.h(), q9mVar.c);
                    compileStatement.bindString(r9m.a.DARK_THEME_DATA.h(), q9mVar.d);
                    compileStatement.bindLong(r9m.a.UPDATE_TIME.h(), q9mVar.b);
                    rdi.i(compileStatement, r9m.a.IS_HIDDEN.h(), q9mVar.e);
                    compileStatement.bindLong(r9m.a.SORT.h(), q9mVar.f);
                    compileStatement.executeInsert();
                }
                return s3q0.a;
            case 14:
                DialogTagsStorageManagerImpl dialogTagsStorageManagerImpl = (DialogTagsStorageManagerImpl) obj4;
                ArrayList<DialogTag> arrayList = (ArrayList) obj3;
                tgl0 tgl0Var = dialogTagsStorageManagerImpl.b;
                e0w b = tgl0Var.b();
                StringBuilder sb = new StringBuilder("SELECT ");
                sb.append(DialogTagsStorageManagerImpl.Column.ID);
                sb.append(" FROM ");
                sgl0 sgl0Var = dialogTagsStorageManagerImpl.a;
                sb.append(sgl0Var.a);
                Cursor d2 = b.d(sb.toString(), null);
                ArrayList arrayList2 = new ArrayList(d2.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d2.moveToFirst()) {
                            while (!d2.isAfterLast()) {
                                arrayList2.add(Integer.valueOf(fl3.A(d2, ChannelsDb.Column.ID.getKey())));
                                d2.moveToNext();
                            }
                        }
                        Trace.endSection();
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Integer.valueOf(((DialogTag) it.next()).b));
                        }
                        Iterator it2 = j5g.t0(arrayList2, j5g.S0(arrayList3)).iterator();
                        while (it2.hasNext()) {
                            int intValue = ((Number) it2.next()).intValue();
                            tgl0Var.b().f(sgl0Var.a, DialogTagsStorageManagerImpl.Column.ID.getKey() + " = ?", new Integer[]{Integer.valueOf(intValue)});
                        }
                        SQLiteStatement g = tgl0Var.b().g(sgl0Var.e());
                        for (DialogTag dialogTag : arrayList) {
                            g.clearBindings();
                            g.bindLong(DialogTagsStorageManagerImpl.Column.ID.ordinal() + 1, dialogTag.b);
                            g.bindString(DialogTagsStorageManagerImpl.Column.NAME.ordinal() + 1, dialogTag.c);
                            g.bindString(DialogTagsStorageManagerImpl.Column.COLOR.ordinal() + 1, dialogTag.d);
                            g.executeInsert();
                        }
                        return s3q0.a;
                    } finally {
                        d2.close();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 15:
                rmm rmmVar = (rmm) obj4;
                fcw.a aVar4 = (fcw.a) obj3;
                DialogExt a2 = ((ipm) obj).a(rmmVar.a.q().b);
                Dialog Cb = a2.Cb();
                List m = e43.m(Cb != null ? ((Boolean) rmmVar.b.invoke(Cb)).booleanValue() : false ? a2.Cb() : null);
                List<Dialog> list = m;
                HashMap hashMap = new HashMap(list.size());
                for (Dialog dialog : list) {
                    hashMap.put(dialog.Sb(), (Boolean) rmmVar.c.invoke(dialog));
                }
                return new gcw.b(m, hashMap, a2.b.Ob(), new ImSearchLocalRequestLoggingInfo(aVar4.a, aVar4.c, 0L, 0, aVar4.d, null, 0, false, 232, null));
            case 16:
                ((Canvas) obj).drawPath((Path) obj4, ((uup) obj3).b);
                return s3q0.a;
            case 17:
                jcu jcuVar = (jcu) obj4;
                AnimatorSet animatorSet = new AnimatorSet();
                jcuVar.t.a(false);
                animatorSet.playTogether(lkf0.a(jcuVar.o, jcuVar.t, r4.getWidth(), jcuVar.s, Anchor.End), lkf0.b(jcuVar.n, jcuVar.r, r5.getWidth(), (FrameLayout) obj3, Anchor.Start));
                animatorSet.addListener(new hcu((gzs) obj));
                animatorSet.start();
                return s3q0.a;
            case 18:
                d1v d1vVar = (d1v) obj4;
                Context context = (Context) obj3;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN) {
                    d1vVar.d.g(new e9q0(context, VkStepsSyncReason.APP_START, selectedDataSource));
                }
                return s3q0.a;
            case 19:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                HomeFragment2 homeFragment2 = (HomeFragment2) obj3;
                csj0 csj0Var = (csj0) obj;
                int i8 = HomeFragment2.x0;
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef2.element;
                if (vkContextMenu != null) {
                    vkContextMenu.e(new eg1(7, homeFragment2, csj0Var));
                }
                VkContextMenu vkContextMenu2 = (VkContextMenu) ref$ObjectRef2.element;
                if (vkContextMenu2 != null) {
                    vkContextMenu2.b();
                }
                return s3q0.a;
            case 20:
                com.vk.attachpicker.adapter.a aVar5 = (com.vk.attachpicker.adapter.a) obj3;
                jba0 jba0Var = ((v0x) obj4).m;
                if (jba0Var != null) {
                    jba0Var.a(aVar5);
                }
                return s3q0.a;
            case 21:
                myc0.h((yvj) obj4, null, null, new mmx.b((gho) obj3, null), 3);
                return s3q0.a;
            case 22:
                y1n0 X0 = ((p3y) obj4).X0();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String e = ((StorageSet$Parameters) obj3).e();
                X0.getClass();
                com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppStorageSet"), new StorageSet$Response(null, new StorageSet$Response.Data(booleanValue, e), e, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 23:
                g610 g610Var = (g610) obj4;
                x510 x510Var = (x510) obj3;
                List<a610> list2 = g610Var.d;
                int size = list2.size();
                for (int i9 = g610Var.c + 1; i9 < size; i9++) {
                    if (!list2.get(i9).g) {
                        x510Var.p.b(new w510.a(i9));
                        x510Var.T(new c610.e(i9));
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 24:
                dt20 dt20Var = (dt20) obj4;
                UploadNotification.b bVar = (UploadNotification.b) obj;
                l6u l6uVar = new l6u((io.reactivex.rxjava3.core.r) obj3, i2);
                int i10 = dt20.b.$EnumSwitchMapping$0[bVar.b.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        dt20Var.c = null;
                        l6uVar.invoke(bVar.f);
                    } else {
                        if (i10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        L.e("MlEnhanceDebug", "Image uploaded");
                        dt20Var.c = null;
                        try {
                            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) bVar.e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photosPhotoDto.q());
                            sb2.append('_');
                            sb2.append(photosPhotoDto.getId());
                            dt20Var.b = sb2.toString();
                            String str = dt20Var.b + '_' + photosPhotoDto.d();
                            dt20.a aVar6 = new dt20.a("photos.enhancePhoto");
                            aVar6.K("photo", str);
                            dt20Var.d = new jx2(aVar6, new et20(dt20Var, l6uVar)).a();
                        } catch (Throwable th2) {
                            l6uVar.invoke(th2);
                        }
                    }
                }
                return s3q0.a;
            case 25:
                ((pk30) obj4).L(((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d) obj3).c);
                return s3q0.a;
            case 26:
                oz ozVar = (oz) obj4;
                mp40 mp40Var = (mp40) obj3;
                yx40.a aVar7 = (yx40.a) obj;
                Notification notification = aVar7.a;
                Throwable th3 = aVar7.b;
                if (th3 != null) {
                    mp40Var.f.accept(new Pair(th3, Boolean.TRUE));
                }
                ozVar.accept(notification);
                return s3q0.a;
            case 27:
                ((izs) obj4).invoke(((izs) obj3).invoke(obj));
                return s3q0.a;
            case 28:
                NewsEntry newsEntry = (NewsEntry) obj4;
                bs50 bs50Var = (bs50) obj;
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) newsEntry;
                DisclaimerData disclaimerData = bs50Var.d;
                DisclaimerContent disclaimerContent = bs50Var.e;
                zu50 zu50Var = bs50Var.a;
                bp50 bp50Var = bs50Var.c;
                gjx gjxVar2 = bs50Var.b;
                ((cs50) obj3).c.getClass();
                if (!com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO) || gjxVar2 == null || (content = gjxVar2.getContent()) == null || (lhz0Var = content.g) == null) {
                    gjxVar = gjxVar2;
                    videoAttachment = null;
                } else {
                    ocz0.d dVar = lhz0Var.a;
                    VideoFileOld videoFileOld = new VideoFileOld();
                    videoFileOld.c = 0;
                    UserId userId = UserId.d;
                    videoFileOld.b = userId;
                    videoFileOld.d = userId;
                    videoFileOld.P0 = dVar.U;
                    videoFileOld.b0 = true;
                    videoFileOld.z = true;
                    wjz0 content2 = gjxVar2.getContent();
                    String str2 = content2 != null ? content2.a.f : null;
                    wjz0 content3 = gjxVar2.getContent();
                    String str3 = (content3 == null || (d = content3.d()) == null) ? null : d.c;
                    wjz0 content4 = gjxVar2.getContent();
                    String str4 = content4 != null ? content4.a.h : null;
                    wjz0 content5 = gjxVar2.getContent();
                    String str5 = content5 != null ? content5.a.r : null;
                    VideoAdsType videoAdsType = VideoAdsType.UNKNOWN;
                    wjz0 content6 = gjxVar2.getContent();
                    kbz0 kbz0Var = content6 != null ? content6.d : null;
                    if (kbz0Var != null) {
                        Serializer.c<Image> cVar = Image.CREATOR;
                        kiw kiwVar = kbz0Var.a;
                        gjxVar = gjxVar2;
                        image = Image.b.c(kiwVar.a, kiwVar.b, kiwVar.c, ImageSizeKey.SIZE_KEY_UNDEFINED);
                    } else {
                        gjxVar = gjxVar2;
                        image = null;
                    }
                    videoFileOld.c0 = new VideoAdInfo(str2, str3, str4, userId, null, str5, videoAdsType, false, null, null, "", image, null);
                    videoFileOld.A0 = SystemClock.elapsedRealtime();
                    videoFileOld.e = (int) dVar.D;
                    kbz0 kbz0Var2 = lhz0Var.b;
                    if (kbz0Var2 != null) {
                        Serializer.c<Image> cVar2 = Image.CREATOR;
                        kiw kiwVar2 = kbz0Var2.a;
                        image2 = Image.b.c(kiwVar2.a, kiwVar2.b, kiwVar2.c, ImageSizeKey.SIZE_KEY_UNDEFINED);
                    } else {
                        image2 = null;
                    }
                    if (image2 == null) {
                        image2 = Image.d;
                    }
                    videoFileOld.I0 = image2;
                    ArrayList arrayList4 = lhz0Var.c;
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        nnx nnxVar = (nnx) it3.next();
                        String format = nnxVar.getFormat();
                        if (format != null) {
                            switch (format.hashCode()) {
                                case -1113079323:
                                    if (format.equals("mp4_1080")) {
                                        videoUrl = VideoUrl.URL_1080;
                                        break;
                                    }
                                    break;
                                case -1113075603:
                                    if (format.equals("mp4_1440")) {
                                        videoUrl = VideoUrl.URL_1440;
                                        break;
                                    }
                                    break;
                                case -1113048633:
                                    if (format.equals("mp4_2160")) {
                                        videoUrl = VideoUrl.URL_2160;
                                        break;
                                    }
                                    break;
                                case 1211021280:
                                    if (format.equals("mp4_240")) {
                                        videoUrl = VideoUrl.URL_240;
                                        break;
                                    }
                                    break;
                                case 1211022303:
                                    if (format.equals("mp4_360")) {
                                        videoUrl = VideoUrl.URL_360;
                                        break;
                                    }
                                    break;
                                case 1211023326:
                                    if (format.equals("mp4_480")) {
                                        videoUrl = VideoUrl.URL_480;
                                        break;
                                    }
                                    break;
                                case 1211026023:
                                    if (format.equals("mp4_720")) {
                                        videoUrl = VideoUrl.URL_720;
                                        break;
                                    }
                                    break;
                            }
                            if (videoUrl != null && (a = nnxVar.a()) != null) {
                                if (!myc0.f(a)) {
                                    a = null;
                                }
                                if (a == null) {
                                    VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                                    VideoUrlStorage.d.b(hashMap2, videoUrl, a);
                                }
                            }
                        }
                        videoUrl = null;
                        if (videoUrl != null) {
                            if (!myc0.f(a)) {
                            }
                            if (a == null) {
                            }
                        }
                    }
                    videoFileOld.f = new VideoUrlStorage(hashMap2);
                    videoAttachment = new VideoAttachment(videoFileOld);
                }
                MyTargetNativeAdEntry Eb = MyTargetNativeAdEntry.Eb(myTargetNativeAdEntry, disclaimerData, disclaimerContent, videoAttachment, false, zu50Var, bp50Var, gjxVar, 1174783);
                Eb.c = newsEntry.c;
                Eb.g = newsEntry.g;
                Eb.h = newsEntry.h;
                return io.reactivex.rxjava3.core.q.T(Eb);
            default:
                ((c080) obj4).U(((i080) obj3).d);
                return s3q0.a;
        }
    }
}

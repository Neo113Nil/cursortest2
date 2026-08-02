package xsna;

import android.content.Intent;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.channels.impl.post_settings.visible_to_dons.VisibleToDonsPickerView;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.engine.models.users.User;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.VmojiPhotoUploadTask;
import com.vk.video.design.view.VideoControlsBarView;
import com.vk.vmoji.upload.VmojiPhotoUploadFragment;
import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vk.voip.ui.whiteboard.presentation.main.ui.b;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bex0;
import xsna.bw3;
import xsna.d9w0;
import xsna.e9w0;
import xsna.gm50;
import xsna.i3t0;
import xsna.i8s0;
import xsna.mno0;
import xsna.p1x0;
import xsna.rmw;
import xsna.z1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c4q0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4q0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 publicApiJob$lambda$1$lambda$0;
        int i = this.b;
        int i2 = 23;
        int i3 = 19;
        int i4 = 12;
        int i5 = 5;
        int i6 = 0;
        int i7 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                publicApiJob$lambda$1$lambda$0 = UnityAdsModule.publicApiJob$lambda$1$lambda$0((DiagnosticEventRepository) obj2, (Throwable) obj);
                return publicApiJob$lambda$1$lambda$0;
            case 1:
                ResumableAttachUploadInfo resumableAttachUploadInfo = (ResumableAttachUploadInfo) obj2;
                e0w e0wVar = (e0w) obj;
                e0wVar.execSQL("DELETE FROM resumable_upload WHERE attach_local_id = " + resumableAttachUploadInfo.d());
                SQLiteStatement compileStatement = e0wVar.compileStatement("\n                        INSERT INTO resumable_upload (attach_local_id, target_file,\n                        target_file_removable, is_prepared, content_filename, content_type,\n                        session_id, bytes_uploaded, bytes_total, upload_url) VALUES (?,?,?,?,?,?,?,?,?,?)\n                        ");
                compileStatement.bindLong(1, (long) resumableAttachUploadInfo.d());
                String l = resumableAttachUploadInfo.l();
                if (l == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                compileStatement.bindString(2, l);
                compileStatement.bindLong(3, resumableAttachUploadInfo.m() ? 1L : 0L);
                compileStatement.bindLong(4, resumableAttachUploadInfo.o() ? 1L : 0L);
                String i8 = resumableAttachUploadInfo.i();
                if (i8 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                compileStatement.bindString(5, i8);
                String j = resumableAttachUploadInfo.j();
                if (j == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                compileStatement.bindString(6, j);
                compileStatement.bindString(7, resumableAttachUploadInfo.k());
                compileStatement.bindLong(8, resumableAttachUploadInfo.h());
                compileStatement.bindLong(9, resumableAttachUploadInfo.g());
                String n = resumableAttachUploadInfo.n();
                if (n == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                compileStatement.bindString(10, n);
                compileStatement.executeInsert();
                compileStatement.clearBindings();
                compileStatement.close();
                return s3q0.a;
            case 2:
                i8s0 i8s0Var = (i8s0) obj2;
                nvy nvyVar = (nvy) obj;
                i8s0.a.b bVar = new i8s0.a.b("Medium");
                i8s0.a.c cVar = new i8s0.a.c("Default");
                i8s0.a.C3039a c3039a = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.g()));
                i8s0.a.c cVar2 = new i8s0.a.c("No Image");
                i8s0.a.C3039a c3039a2 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), true, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.g()));
                i8s0.a.c cVar3 = new i8s0.a.c("Placeholder");
                PlaceholderViewState e = i8s0.e();
                PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
                i8s0.a.C3039a c3039a3 = new i8s0.a.C3039a(new VideoCardViewState(a0Var.d(true, e), i8s0.g()));
                i8s0.a.c cVar4 = new i8s0.a.c("Donut");
                i8s0.a.C3039a c3039a4 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.d(), new PreviewViewState.l(new mno0.i("300 ₽/мес"), new mno0.i("")), null, null, null, null, null, null, null, 2032), i8s0.g()));
                i8s0.a.c cVar5 = new i8s0.a.c("Playlist");
                i8s0.a.C3039a c3039a5 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), i8s0.g()));
                i8s0.a.c cVar6 = new i8s0.a.c("Playlist / No Image");
                i8s0.a.C3039a c3039a6 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), i8s0.g()));
                i8s0.a.c cVar7 = new i8s0.a.c("Blur");
                i8s0.a.C3039a c3039a7 = new i8s0.a.C3039a(new VideoCardViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.f()), i8s0.g()));
                i8s0.a.c cVar8 = new i8s0.a.c("Blur / Donut");
                i8s0.a.C3039a c3039a8 = new i8s0.a.C3039a(new VideoCardViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PlaceholderViewState(null, new mno0.i("Откройте это и другие эксклюзивные видео автора"), new mno0.i("Поддержать за 300 ₽/мес"), new rmw.d(R.drawable.vk_icon_star_circle_fill_yellow_16), null, 17)), i8s0.g()));
                i8s0.a.c cVar9 = new i8s0.a.c("Live");
                i8s0.a.C3039a c3039a9 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), true, null, 4), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.g()));
                i8s0.a.c cVar10 = new i8s0.a.c("Live / Planned");
                i8s0.a.C3039a c3039a10 = new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), false, null, 4), new PreviewViewState.j(ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, new rmw.d(R.drawable.vk_icon_clock_outline_12), null, new mno0.i("22 сен в 15:30"), null, 40), null, new PreviewViewState.f(new mno0.i("Напомнить о старте"), new rmw.d(R.drawable.vk_icon_notification_28), 2), null, null, null, null, null, 2000), i8s0.g()));
                i8s0.a.c cVar11 = new i8s0.a.c("Skeleton");
                PreviewViewState f = PreviewViewState.a0.f(true);
                VideoCardViewState.d dVar = VideoCardViewState.d.a;
                List l2 = e43.l(bVar, cVar, c3039a, cVar2, c3039a2, cVar3, c3039a3, cVar4, c3039a4, cVar5, c3039a5, cVar6, c3039a6, cVar7, c3039a7, cVar8, c3039a8, cVar9, c3039a9, cVar10, c3039a10, cVar11, new i8s0.a.C3039a(new VideoCardViewState(f, dVar)));
                nvyVar.e(l2.size(), null, new b8d0(l2, 1), new jai(802480018, new c8d0(1, i8s0Var, l2), true));
                List l3 = e43.l(new i8s0.a.b("Small"), new i8s0.a.c("Default"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.h(false))), new i8s0.a.c("No Image"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), true, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.h(false))), new i8s0.a.c("Placeholder"), new i8s0.a.C3039a(new VideoCardViewState(a0Var.d(true, i8s0.e()), i8s0.h(false))), new i8s0.a.c("Donut"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.d(), new PreviewViewState.l(new mno0.i("300 ₽/мес"), new mno0.i("")), null, null, null, null, null, null, null, 2032), i8s0.h(false))), new i8s0.a.c("Playlist"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), i8s0.i())), new i8s0.a.c("Playlist / No Image"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), i8s0.i())), new i8s0.a.c("Blur"), new i8s0.a.C3039a(new VideoCardViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.f()), i8s0.h(false))), new i8s0.a.c("Live"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), true, null, 4), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.h(false))), new i8s0.a.c("Live / Inactive"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), false, null, 4), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.h(false))), new i8s0.a.c("Downloading"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.h(true))), new i8s0.a.c("Skeleton"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.f(true), dVar)));
                nvyVar.e(l3.size(), null, new x4z(l3, 1), new jai(802480018, new k8s0(l3, i8s0Var), true));
                List l4 = e43.l(new i8s0.a.b("Sharp"), new i8s0.a.c("Default"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), false, i8s0.d(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), i8s0.g())), new i8s0.a.c("Placeholder"), new i8s0.a.C3039a(new VideoCardViewState(a0Var.d(false, i8s0.e()), i8s0.g())), new i8s0.a.c("Blur"), new i8s0.a.C3039a(new VideoCardViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), false, i8s0.f()), i8s0.g())), new i8s0.a.c("Skeleton"), new i8s0.a.C3039a(new VideoCardViewState(PreviewViewState.a0.f(false), dVar)));
                nvyVar.e(l4.size(), null, new xgb0(l4, 1), new jai(802480018, new j8s0(l4, i8s0Var), true));
                nvy.g(nvyVar, null, null, new jai(774036376, new p3i(i8s0Var, i7), true), 3);
                return s3q0.a;
            case 3:
                gcs0 gcs0Var = (gcs0) obj2;
                gcs0Var.t8((NewsComment) obj);
                gcs0Var.R7(true);
                return s3q0.a;
            case 4:
                VideoControlsBarView.a aVar = ((VideoControlsBarView) obj2).b;
                if (aVar != null) {
                    aVar.e();
                }
                return s3q0.a;
            case 5:
                f3t0 f3t0Var = (f3t0) obj2;
                gm50.a.a(f3t0Var, ((i3t0.a) obj).a, new waf0(f3t0Var, i2));
                return s3q0.a;
            case 6:
                return ((yat0) obj2).a.a().U(new gs00(new xg3((List) obj, 1), i3));
            case 7:
                return VisibleToDonsPickerView.b((VisibleToDonsPickerView) obj2, (pp80) obj);
            case 8:
                ((giv0) obj2).a.Tn(((lru0) obj).a.I() ? 8 : 0);
                return s3q0.a;
            case 9:
                e9w0 e9w0Var = (e9w0) obj2;
                UploadNotification.b bVar2 = (UploadNotification.b) obj;
                int i9 = e9w0.a.$EnumSwitchMapping$0[bVar2.b.ordinal()];
                if (i9 == 1) {
                    d9w0.a aVar2 = e9w0Var.b;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                } else if (i9 == 2) {
                    Parcelable parcelable = bVar2.e;
                    VmojiPhotoUploadTask.UploadResult uploadResult = parcelable instanceof VmojiPhotoUploadTask.UploadResult ? (VmojiPhotoUploadTask.UploadResult) parcelable : null;
                    if (uploadResult == null) {
                        d9w0.a aVar3 = e9w0Var.b;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                    } else {
                        e9w0Var.c = null;
                        d9w0.a aVar4 = e9w0Var.b;
                        if (aVar4 != null) {
                            f2i f2iVar = d9w0.this.g;
                            String str = uploadResult.b;
                            f2iVar.getClass();
                            Intent intent = new Intent();
                            intent.putExtra("result_upload_data", str);
                            ((VmojiPhotoUploadFragment) f2iVar.b).Mf(-1, intent);
                        }
                    }
                }
                return s3q0.a;
            case 10:
                ((xjw0) obj2).getClass();
                return new it80(((bw3) obj) instanceof bw3.a ? vv3.a : null);
            case 11:
                p1x0 p1x0Var = (p1x0) obj2;
                z1x0.a aVar5 = (z1x0.a) obj;
                qtd0 qtd0Var = aVar5.e;
                SharingReason sharingReason = aVar5.d;
                if (!(qtd0Var instanceof User ? ((User) qtd0Var).P : qtd0Var instanceof Contact ? ((Contact) qtd0Var).n : true) && sharingReason != SharingReason.Expiration) {
                    return null;
                }
                int i10 = p1x0.a.$EnumSwitchMapping$0[sharingReason.ordinal()];
                if (i10 == 1) {
                    return p1x0Var.e;
                }
                if (i10 == 2) {
                    return p1x0Var.f;
                }
                if (i10 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                bex0.a.a(((qgx0) obj2).a, JsApiMethodType.GET_CLIENT_LOGS, VkAppsErrors.Client.UNKNOWN_ERROR, null, null, null, 60);
                return s3q0.a;
            default:
                WhiteboardFragment whiteboardFragment = (WhiteboardFragment) obj2;
                b.a aVar6 = (b.a) obj;
                int i11 = WhiteboardFragment.R;
                gm50.a.a(whiteboardFragment, aVar6.b, new iyd0(whiteboardFragment, 27));
                gm50.a.a(whiteboardFragment, aVar6.c, new rlx0(whiteboardFragment, i6));
                gm50.a.a(whiteboardFragment, aVar6.d, new ifw0(whiteboardFragment, i5));
                gm50.a.a(whiteboardFragment, aVar6.a, new i9u0(whiteboardFragment, i4));
                return s3q0.a;
        }
    }
}

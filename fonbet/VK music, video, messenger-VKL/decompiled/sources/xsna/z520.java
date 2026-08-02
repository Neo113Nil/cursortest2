package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatarchange.AvatarChangeActivity;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.permission.PermissionHelper;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.NftAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.concurrent.Callable;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.eeu0;
import xsna.h7u0;
import xsna.qfa0;

/* compiled from: MenuController.kt */
/* loaded from: classes6.dex */
public final class z520 implements tb0 {
    public final ImageViewer.a b;
    public final Activity c;
    public final String d;
    public final izs<Photo, s3q0> e;
    public final qfa0 f;
    public final UserId g;
    public io.reactivex.rxjava3.disposables.b h;
    public final p870 i;
    public final boolean j;
    public Photo k;
    public Photo l;
    public PhotoViewer m;

    /* compiled from: MenuController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: MenuController.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final b b = new b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public z520(ImageViewer.a aVar, Activity activity, String str, gqe0 gqe0Var, qfa0 qfa0Var, UserId userId) {
        this.b = aVar;
        this.c = activity;
        this.d = str;
        this.e = gqe0Var;
        this.f = qfa0Var;
        this.g = userId;
        ce60.b.getClass();
        this.i = p870.f();
        this.j = BuildInfo.s();
    }

    public final void a(e.b bVar, int i, int i2, ImageViewer.ControlsOptions.MenuItem menuItem, gzs gzsVar) {
        if (this.b.u().d.contains(menuItem)) {
            Activity activity = this.c;
            VkContextMenu.c.d(bVar, activity.getString(i), enj.c(i2, dhr0.t.c(R.attr.vk_ui_icon_accent_themed), activity), false, gzsVar, 28);
        }
    }

    public final qfa0.h b(UserId userId) {
        qfa0 qfa0Var = this.f;
        if (qfa0Var != null) {
            return qfa0Var.c(userId).e();
        }
        return null;
    }

    public final void c(Photo photo, boolean z) {
        if (photo != null) {
            if (z) {
                qfa0.h b2 = b(photo.e);
                if (b2 != null) {
                    b2.m(photo.c);
                }
            } else {
                qfa0.h b3 = b(photo.e);
                if (b3 != null) {
                    b3.a(photo.c);
                }
            }
            izs<Photo, s3q0> izsVar = this.e;
            if (izsVar != null) {
                izsVar.invoke(photo);
            }
        }
    }

    public final boolean d(AttachmentWithMedia attachmentWithMedia) {
        if (attachmentWithMedia instanceof PhotoAttachment) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachmentWithMedia;
            qfa0.h b2 = b(photoAttachment.l.e);
            if (b2 != null) {
                b2.c(photoAttachment.l, this.b.i());
            }
        }
        if (attachmentWithMedia == null) {
            return false;
        }
        fvr.l(this.c, attachmentWithMedia.Eb());
        cvk.u(R.string.link_copied, false);
        return true;
    }

    public final boolean e(Photo photo) {
        qfa0.h b2;
        if (photo != null && (b2 = b(photo.e)) != null) {
            b2.j(photo);
        }
        int i = 0;
        if (photo == null) {
            return false;
        }
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(this.c);
        c.g0(R.string.confirm);
        c.U(R.string.delete_photo_confirm);
        c.c0(R.string.yes, new u520(i, this, photo));
        c.W(R.string.no, null);
        c.m();
        return true;
    }

    public final boolean f(Photo photo) {
        qfa0.h b2;
        if (photo != null && (b2 = b(photo.e)) != null) {
            b2.b(photo.c);
        }
        if (photo == null) {
            return false;
        }
        int i = photo.d;
        if (i == -15) {
            q(photo, false);
            return true;
        }
        if (i != -7) {
            q(photo, true);
            return true;
        }
        p(photo);
        return true;
    }

    public final boolean g(Photo photo) {
        if (photo == null) {
            return false;
        }
        ImageSize imageSize = photo.J;
        if ((imageSize != null ? imageSize.d.d : null) == null) {
            return false;
        }
        qfa0.h b2 = b(photo.e);
        if (b2 != null) {
            b2.d(photo.c);
        }
        this.l = photo;
        ImageSize imageSize2 = photo.J;
        String str = imageSize2 != null ? imageSize2.d.d : null;
        if (str == null) {
            str = "";
        }
        UserId userId = photo.f;
        Regex regex = com.vk.common.links.c.a;
        Activity activity = this.c;
        activity.startActivityForResult(new Intent(activity, (Class<?>) AvatarChangeActivity.class).putExtra(X3.i.b, str).putExtra("thumb_uid", userId), 10987);
        return true;
    }

    public final boolean h(Photo photo) {
        if (photo == null) {
            return false;
        }
        qfa0.h b2 = b(photo.e);
        ImageViewer.a aVar = this.b;
        if (b2 != null) {
            b2.i(photo, aVar.i());
        }
        ob9 ob9Var = aVar instanceof ob9 ? (ob9) aVar : null;
        if (ob9Var == null || !ob9Var.k(photo)) {
            com.vk.common.links.c.d(this.c, photo.e, String.valueOf(photo.d), null, false);
            return true;
        }
        PhotoViewer photoViewer = this.m;
        if (photoViewer != null) {
            RectF rectF = PhotoViewer.U;
            photoViewer.g(true);
        }
        return true;
    }

    public final boolean i(Photo photo) {
        if (photo == null) {
            return false;
        }
        qfa0.h b2 = b(photo.e);
        if (b2 != null) {
            b2.h(photo.c, this.b.i());
        }
        int i = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K("photo");
        a2.D(photo.c);
        a2.G(photo.e);
        a2.I("photo");
        a2.k(this.c);
        return true;
    }

    public final void j(AttachmentWithMedia attachmentWithMedia) {
        String h;
        if (!(attachmentWithMedia instanceof PhotoAttachment)) {
            if (attachmentWithMedia instanceof DocumentAttachment) {
                DocumentAttachment documentAttachment = (DocumentAttachment) attachmentWithMedia;
                String str = documentAttachment.f;
                if (str == null) {
                    str = "document";
                }
                o(str, documentAttachment.g, true);
                return;
            }
            return;
        }
        PhotoAttachment photoAttachment = (PhotoAttachment) attachmentWithMedia;
        Photo photo = photoAttachment.l;
        Photo photo2 = photoAttachment.l;
        qfa0.h b2 = b(photo.e);
        if (b2 != null) {
            b2.n(photo2.c, this.b.i());
        }
        ImageSize imageSize = photo2.J;
        if (imageSize == null || (h = imageSize.d.d) == null) {
            h = ixj0.h(photo2.y.b);
        }
        if (h != null) {
            o("", h, false);
        }
    }

    public final boolean k(Photo photo) {
        int i = 0;
        if (photo == null) {
            return false;
        }
        qfa0.h b2 = b(photo.e);
        if (b2 != null) {
            b2.g(photo.c, this.b.i());
        }
        String str = this.d;
        if (str != null && str.length() != 0) {
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypePhotoSaveToAlbumMenuItem(str), 2)).q();
        }
        UserId userId = photo.e;
        int i2 = photo.c;
        String str2 = photo.v;
        pea0 pea0Var = new pea0("photos.copy");
        pea0Var.F(userId, "owner_id");
        pea0Var.C(i2, "photo_id");
        if (str2 != null) {
            pea0Var.K("access_key", str2);
        }
        io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(pea0Var, null, null, 3), this.c, 0L, false, 62).subscribe(new t520(new g53(25), i), new lav(a.b, 6));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        (bVar != null ? bVar : null).b(subscribe);
        return true;
    }

    public final boolean l(AttachmentWithMedia attachmentWithMedia) {
        DocumentAttachment documentAttachment = attachmentWithMedia instanceof DocumentAttachment ? (DocumentAttachment) attachmentWithMedia : null;
        if (documentAttachment == null) {
            return false;
        }
        io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(new ttn(documentAttachment.o, documentAttachment.k, documentAttachment.j), null, null, 3), this.c, 0L, false, 62).subscribe(new f40(new cd10(1), 29), new b00(b.b, 29));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        (bVar != null ? bVar : null).b(subscribe);
        return true;
    }

    public final boolean m(AttachmentWithMedia attachmentWithMedia, MenuItem menuItem, View view, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        qfa0.h b2;
        boolean z4 = attachmentWithMedia instanceof PhotoAttachment;
        PhotoAttachment photoAttachment = z4 ? (PhotoAttachment) attachmentWithMedia : null;
        Photo photo = photoAttachment != null ? photoAttachment.l : null;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.edit) {
            return f(photo);
        }
        if (itemId == R.id.delete) {
            return e(photo);
        }
        if (itemId == R.id.save) {
            j(attachmentWithMedia);
            return true;
        }
        if (itemId == R.id.copy_link) {
            return d(attachmentWithMedia);
        }
        if (itemId == R.id.attach_goods_item) {
            c(photo, false);
            return true;
        }
        if (itemId == R.id.attach_service_item) {
            c(photo, true);
            return true;
        }
        if (itemId == R.id.set_on_avatar) {
            return g(photo);
        }
        if (itemId == R.id.send_to_friend || itemId == R.id.share) {
            if (attachmentWithMedia != null) {
                kbj0.e(nr4.b(), this.c, attachmentWithMedia, false, null, false, null, 60);
                return true;
            }
        } else {
            if (itemId == R.id.save_to_album) {
                return k(photo);
            }
            if (itemId == R.id.save_to_documents) {
                return l(attachmentWithMedia);
            }
            if (itemId == R.id.go_to_album) {
                return h(photo);
            }
            if (itemId == R.id.report) {
                return i(photo);
            }
            if (itemId == R.id.overflow) {
                boolean z5 = attachmentWithMedia instanceof VideoAttachment;
                ImageViewer.a aVar = this.b;
                if (z5) {
                    ImageViewer.d r = aVar.r();
                    r3v0 r3v0Var = r instanceof r3v0 ? (r3v0) r : null;
                    if (r3v0Var != null) {
                        r3v0Var.a();
                        return true;
                    }
                } else {
                    if (view == null) {
                        throw new IllegalArgumentException("Attempt to show popup with null anchor view");
                    }
                    if (aVar.u().b) {
                        PhotoViewer photoViewer = this.m;
                        boolean z6 = photoViewer != null && photoViewer.c.v();
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        view.getContext();
                        e.b bVar = new e.b(view, null, null, l, 6);
                        bVar.w = R.layout.ds_internal_context_menu_item;
                        PhotoAttachment photoAttachment2 = z4 ? (PhotoAttachment) attachmentWithMedia : null;
                        Photo photo2 = photoAttachment2 != null ? photoAttachment2.l : null;
                        UserId userId = this.g;
                        if (photo2 != null) {
                            z2 = epx.f(userId, photo2.f) || xg5.a().d(photo2.e);
                        } else {
                            z2 = false;
                        }
                        boolean z7 = attachmentWithMedia instanceof NftAttachment;
                        a(bVar, R.string.open_photo_editor, R.drawable.vk_icon_sliders_outline_28, ImageViewer.ControlsOptions.MenuItem.OPEN_PHOTO_EDITOR, new pw(16, this, photo2));
                        if (photo2 != null && (b2 = b(photo2.e)) != null) {
                            b2.e(photo2.c);
                        }
                        boolean z8 = this.j;
                        if (photo2 != null) {
                            int i2 = photo2.d;
                            boolean z9 = i2 > 0 || i2 == -7 || i2 == -15 || i2 == -183;
                            boolean z10 = photo2.c != 0 && fkq0.d(userId) && z2;
                            if (!z7 && z10 && z9 && z8) {
                                z3 = z8;
                                i = -7;
                                a(bVar, R.string.edit, R.drawable.vk_icon_edit_outline_28, ImageViewer.ControlsOptions.MenuItem.EDIT, new ks2(18, this, photo2));
                            } else {
                                i = -7;
                                z3 = z8;
                            }
                            if (!z7 && !z6 && z10 && z3) {
                                a(bVar, R.string.photo_attach_good, R.drawable.vk_icon_market_add_badge_outline_28, ImageViewer.ControlsOptions.MenuItem.ATTACH_GOOD, new ew3(12, this, photo2));
                                a(bVar, R.string.photo_attach_market_service, R.drawable.vk_icon_notebook_add_badge_outline_28, ImageViewer.ControlsOptions.MenuItem.ATTACH_MARKET_SERVICE, new v43(12, this, photo2));
                            }
                            if (!z7 && photo2.I && z3) {
                                a(bVar, R.string.make_profile_photo, R.drawable.vk_icon_user_outline_28, ImageViewer.ControlsOptions.MenuItem.MAKE_PROFILE_PHOTO, new ag1(8, this, photo2));
                            }
                        } else {
                            i = -7;
                            z3 = z8;
                        }
                        if (photo2 == null || (!photo2.Ib() && z)) {
                            a(bVar, R.string.save_on_device, R.drawable.vk_icon_download_outline_28, ImageViewer.ControlsOptions.MenuItem.DOWNLOAD, new com.vk.movika.sdk.android.defaultplayer.container.e(16, this, attachmentWithMedia));
                        }
                        if (photo2 != null) {
                            boolean z11 = photo2.c != 0 && fkq0.d(userId);
                            boolean z12 = !photo2.Ib() && z;
                            if (z11) {
                                if (!epx.f(attachmentWithMedia != null ? attachmentWithMedia.q() : null, userId) && z12 && z3) {
                                    a(bVar, R.string.add_to_saved, R.drawable.vk_icon_list_add_outline_28, ImageViewer.ControlsOptions.MenuItem.ADD_TO_SAVED, new k75(11, this, photo2));
                                }
                            }
                        }
                        if ((attachmentWithMedia instanceof DocumentAttachment) && fkq0.d(userId)) {
                            if (!epx.f(attachmentWithMedia != null ? ((DocumentAttachment) attachmentWithMedia).q() : null, userId)) {
                                a(bVar, R.string.add_to_documents, R.drawable.vk_icon_add_outline_28, ImageViewer.ControlsOptions.MenuItem.ADD_TO_DOCUMENTS, new a94(11, this, attachmentWithMedia));
                            }
                            a(bVar, R.string.copy_link, R.drawable.vk_icon_copy_outline_28, ImageViewer.ControlsOptions.MenuItem.COPY_LINK, new cm(20, this, attachmentWithMedia));
                        }
                        if (photo2 != null) {
                            int i3 = photo2.d;
                            boolean z13 = i3 > 0 || i3 == -6 || i3 == i || i3 == -15;
                            if (!z7 && z13 && z3) {
                                a(bVar, R.string.photo_go_to_album, R.drawable.vk_icon_picture_outline_28, ImageViewer.ControlsOptions.MenuItem.GO_TO_ALBUM, new gd0(10, this, photo2));
                            }
                            boolean z14 = (z7 || z6 || photo2.c == 0 || !z3 || !z) ? false : true;
                            boolean z15 = (z7 || z6 || photo2.d <= 0 || z3 || !z) ? false : true;
                            if (z14 || z15) {
                                a(bVar, R.string.copy_link, R.drawable.vk_icon_copy_outline_28, ImageViewer.ControlsOptions.MenuItem.COPY_LINK, new j4(15, this, attachmentWithMedia));
                            }
                            boolean z16 = photo2.c != 0 && fkq0.d(userId);
                            if (!z6 && !z7 && z16 && z2) {
                                a(bVar, R.string.delete_photo, R.drawable.vk_icon_delete_outline_28, ImageViewer.ControlsOptions.MenuItem.DELETE_PHOTO, new s(13, this, photo2));
                            }
                            if (!epx.f(attachmentWithMedia != null ? attachmentWithMedia.q() : null, userId) && z16) {
                                a(bVar, R.string.report_content, R.drawable.vk_icon_report_outline_28, ImageViewer.ControlsOptions.MenuItem.REPORT_CONTENT, new k4(10, this, photo2));
                            }
                        }
                        boolean isEmpty = bVar.f.isEmpty();
                        Activity activity = this.c;
                        if (isEmpty) {
                            enj.q(R.string.vkim_chat_sharing_disabled_hint, 0, activity);
                            return true;
                        }
                        bVar.g(R.attr.vk_ui_icon_accent_themed);
                        bVar.e = activity;
                        bVar.j();
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void n(AttachmentWithMedia attachmentWithMedia, Menu menu) {
        PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
        Photo photo = photoAttachment != null ? photoAttachment.l : null;
        UserId userId = this.g;
        boolean z = photo != null && (epx.f(userId, photo.f) || xg5.a().d(photo.e));
        if (!this.b.u().b) {
            boolean z2 = photo != null && photo.c != 0 && fkq0.d(userId) && z;
            MenuItem findItem = menu.findItem(R.id.attach_goods_item);
            if (findItem != null) {
                findItem.setVisible(z2);
            }
            MenuItem findItem2 = menu.findItem(R.id.attach_service_item);
            if (findItem2 != null) {
                findItem2.setVisible(z2);
            }
        }
        MenuItem findItem3 = menu.findItem(R.id.share);
        if (findItem3 != null) {
            findItem3.setVisible((attachmentWithMedia == null || this.j || BuildInfo.t()) ? false : true);
        }
        MenuItem findItem4 = menu.findItem(R.id.set_on_avatar);
        if (findItem4 != null) {
            findItem4.setVisible(((attachmentWithMedia instanceof NftAttachment) || photo == null || !photo.I) ? false : true);
        }
    }

    public final void o(final String str, final String str2, final boolean z) {
        if (gz80.a(34)) {
            vao.b(this.c, str, str2, false, null, Boolean.TRUE, z);
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(this.c, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new gzs() { // from class: xsna.v520
            @Override // xsna.gzs
            public final Object invoke() {
                vao.b(z520.this.c, str, str2, false, null, Boolean.TRUE, z);
                return s3q0.a;
            }
        }, new kz0(28));
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        final PhotoAlbum photoAlbum;
        Photo photo;
        ImageSize imageSize;
        if (i2 != -1) {
            if (i == 1023) {
                this.k = null;
                return;
            } else {
                if (i != 10987) {
                    return;
                }
                this.l = null;
                return;
            }
        }
        if (i != 1023) {
            if (i != 10987 || intent == null || (photo = this.l) == null || (imageSize = photo.J) == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(X3.i.b);
            int i3 = 0;
            final boolean booleanExtra = intent.getBooleanExtra("post", false);
            final boolean booleanExtra2 = intent.getBooleanExtra("story", false);
            RectF rectF = new RectF(intent.getFloatExtra(TtmlNode.LEFT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("top", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra(TtmlNode.RIGHT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("bottom", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            io.reactivex.rxjava3.core.x n = hg1.n(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.n520
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z = booleanExtra2;
                    if (z) {
                        wxl0 wxl0Var = wxl0.b;
                        wxl0.a(booleanExtra, z, true);
                    }
                    return s3q0.a;
                }
            }), new pi0(new o520(photo, imageSize, booleanExtra, rectF), 26)), new lz(new p520(booleanExtra2, stringExtra, rectF, photo, this, booleanExtra), 20)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), this.c, false, null, 62);
            new q520(i3);
            io.reactivex.rxjava3.disposables.c subscribe = n.subscribe(new r520(), new s520(new sec(j03.a, 4), i3));
            io.reactivex.rxjava3.disposables.b bVar = this.h;
            (bVar != null ? bVar : null).b(subscribe);
            return;
        }
        final Photo photo2 = this.k;
        if (photo2 == null || intent == null || (photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album")) == null) {
            return;
        }
        UserId userId = photo2.e;
        int i4 = photo2.c;
        int i5 = photoAlbum.b;
        sfa0 sfa0Var = new sfa0("photos.move");
        sfa0Var.C(i4, "photo_ids");
        sfa0Var.F(userId, "owner_id");
        sfa0Var.C(i5, "target_album_id");
        io.reactivex.rxjava3.core.q m = hg1.m(rsg0.y0(sfa0Var, null, null, 3), this.c, 0L, false, 62);
        io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.x520
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ysg0<Object> ysg0Var = ysg0.b;
                Photo photo3 = Photo.this;
                ysg0Var.a(new zaa0(photo3.d, photo3.e, photo3.c));
                int i6 = photoAlbum.b;
                photo3.d = i6;
                ysg0Var.a(new s4a0(i6, photo3));
                PhotoViewer photoViewer = this.m;
                if (photoViewer != null) {
                    RectF rectF2 = PhotoViewer.U;
                    photoViewer.g(true);
                }
                cvk.u(R.string.photo_moved, false);
            }
        };
        int i6 = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe2 = m.subscribe(fVar, new iwg0());
        io.reactivex.rxjava3.disposables.b bVar2 = this.h;
        (bVar2 != null ? bVar2 : null).b(subscribe2);
    }

    public final void p(Photo photo) {
        int i = h7u0.p;
        Activity activity = this.c;
        h7u0.a a2 = h7u0.b.a(activity);
        a2.a0(new w520(this, 0));
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(a2);
        c2801a.f(R.string.edit_photo_description);
        c2801a.e(R.string.photo_descr);
        int i2 = 8;
        c2801a.m = 8;
        int i3 = 6;
        c2801a.s = new ah7(photo, i3);
        String string = activity.getString(R.string.save);
        q85 q85Var = new q85(i3, photo, this);
        c2801a.k = string;
        c2801a.t = q85Var;
        String string2 = activity.getString(R.string.cancel);
        aki akiVar = new aki((byte) 0, 5);
        c2801a.l = string2;
        c2801a.u = akiVar;
        PhotoViewer photoViewer = this.m;
        if (photoViewer != null) {
            PhotoViewerLayout photoViewerLayout = photoViewer.w;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) photoViewerLayout.getLayoutParams();
            layoutParams.flags = 1024;
            layoutParams.softInputMode = 20;
            if (photoViewerLayout.isAttachedToWindow()) {
                photoViewer.v.updateViewLayout(photoViewerLayout, layoutParams);
            }
        }
        i0q0.d(200L, new b04(c2801a, i2));
    }

    public final void q(final Photo photo, final boolean z) {
        Activity activity = this.c;
        h7u0.a aVar = new h7u0.a(activity);
        aVar.g0(R.string.edit_photo);
        ListBuilder e = e43.e();
        e.add(activity.getString(R.string.edit_photo_description));
        e.add(activity.getString(R.string.move_to_album));
        int i = photo.d;
        if (i != -15 && i != -183) {
            e.add(activity.getString(R.string.make_cover));
        }
        aVar.T((CharSequence[]) e.g().toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xsna.y520
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                z520 z520Var = z520.this;
                Photo photo2 = photo;
                if (i2 == 0) {
                    z520Var.p(photo2);
                    return;
                }
                if (i2 == 1) {
                    z520Var.k = photo2;
                    PhotoAlbumListFragment.f fVar = new PhotoAlbumListFragment.f();
                    Bundle bundle = fVar.j;
                    bundle.putBoolean("select_album", true);
                    bundle.putParcelable("uid", photo2.e);
                    Activity activity2 = z520Var.c;
                    bundle.putCharSequence("title", activity2.getString(R.string.move_to_album_title));
                    fVar.h(activity2, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
                    return;
                }
                if (i2 == 2 && z) {
                    UserId userId = photo2.e;
                    int i3 = photo2.c;
                    int i4 = photo2.d;
                    pfa0 pfa0Var = new pfa0("photos.makeCover");
                    pfa0Var.F(userId, "owner_id");
                    pfa0Var.C(i3, "photo_id");
                    pfa0Var.C(i4, "album_id");
                    io.reactivex.rxjava3.core.q m = hg1.m(rsg0.y0(pfa0Var, null, null, 3), z520Var.c, 0L, false, 62);
                    qs2 qs2Var = new qs2(photo2, 23);
                    int i5 = kwg0.a;
                    io.reactivex.rxjava3.disposables.c subscribe = m.subscribe(qs2Var, new iwg0());
                    io.reactivex.rxjava3.disposables.b bVar = z520Var.h;
                    (bVar != null ? bVar : null).b(subscribe);
                }
            }
        });
        aVar.m();
    }
}

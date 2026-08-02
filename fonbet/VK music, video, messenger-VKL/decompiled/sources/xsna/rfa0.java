package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumCreateEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumDetailsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumEditEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ArchiveEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentIdParam;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentType;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$OnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoTagsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotosSettingsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PickerEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PickerSelectionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PickerUploadEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$StringValueParam;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabAlbumsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabPhotosEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TabsEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$TypePhotosItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.qfa0;

/* compiled from: PhotosMetricsCollectorImpl.kt */
/* loaded from: classes4.dex */
public final class rfa0 implements qfa0 {
    public UserId a = UserId.d;
    public final bpn0 b = new bpn0(new fm20(this, 13));
    public final bpn0 c = new bpn0(new gd70(this, 7));
    public final bpn0 d = new bpn0(new v100(this, 17));
    public final bpn0 e = new bpn0(new fr20(this, 14));
    public final bpn0 f = new bpn0(new z260(this, 11));
    public final bpn0 g = new bpn0(new w100(this, 21));
    public final bpn0 h = new bpn0(new a040(this, 16));
    public final bpn0 i = new bpn0(new p6y(this, 21));
    public final bpn0 j = new bpn0(new hp30(this, 9));
    public final bpn0 k = new bpn0(new jw30(this, 9));
    public final bpn0 l = new bpn0(new so40(this, 8));
    public final bpn0 m = new bpn0(new k7z(this, 20));

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class a implements qfa0.a {
        public a() {
        }

        public static void a(a aVar, MobileOfficialAppsConPhotosStat$AlbumCreateEvent mobileOfficialAppsConPhotosStat$AlbumCreateEvent, MobileOfficialAppsConPhotosStat$AlbumEditEvent mobileOfficialAppsConPhotosStat$AlbumEditEvent, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent(MobileOfficialAppsConPhotosStat$ContentType.ALBUM, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumCreateEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumEditEvent), null, null, null, 3839), (i & 4) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, null, 4);
        }

        @Override // xsna.qfa0.a
        public final void b(int i) {
            a(this, null, new MobileOfficialAppsConPhotosStat$AlbumEditEvent(MobileOfficialAppsConPhotosStat$AlbumEditEvent.AlbumEditEventType.EDIT, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, 5);
        }

        @Override // xsna.qfa0.a
        public final void c(int i) {
            a(this, null, new MobileOfficialAppsConPhotosStat$AlbumEditEvent(MobileOfficialAppsConPhotosStat$AlbumEditEvent.AlbumEditEventType.DELETE, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, 5);
        }

        @Override // xsna.qfa0.a
        public final void d() {
            a(this, new MobileOfficialAppsConPhotosStat$AlbumCreateEvent(MobileOfficialAppsConPhotosStat$AlbumCreateEvent.AlbumCreateEventType.CLICK_TO_VIEW_PRIVACY), null, null, 2);
        }

        @Override // xsna.qfa0.a
        public final void e(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            a(this, new MobileOfficialAppsConPhotosStat$AlbumCreateEvent(MobileOfficialAppsConPhotosStat$AlbumCreateEvent.AlbumCreateEventType.CREATE_ALBUM), null, mobileOfficialAppsCoreNavStat$EventScreen, 2);
        }

        @Override // xsna.qfa0.a
        public final void f() {
            a(this, new MobileOfficialAppsConPhotosStat$AlbumCreateEvent(MobileOfficialAppsConPhotosStat$AlbumCreateEvent.AlbumCreateEventType.CLICK_TO_COMMENT_PRIVACY), null, null, 2);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class b implements qfa0.b {
        public b() {
        }

        public static void s(b bVar, MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$AlbumDetailsEvent(mobileOfficialAppsConPhotosStat$ContentType, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent), null, null, null, null, 3967), null, null, 6);
        }

        @Override // xsna.qfa0.b
        public final void a(int i) {
            s(this, null, new MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent(MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent.AlbumDetailsSinglePhotoActionEventType.OPEN, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, null, MobileOfficialAppsConPhotosStat$ContentType.PHOTO, 13);
        }

        @Override // xsna.qfa0.b
        public final void b(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.EDIT, i);
        }

        @Override // xsna.qfa0.b
        public final void c(Collection<? extends Photo> collection) {
            t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType.MOVE_TO_ALBUM, collection);
        }

        @Override // xsna.qfa0.b
        public final void d(Photo photo) {
            s(this, null, null, null, new MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent(MobileOfficialAppsConPhotosStat$AlbumDetailsDetailedActionEvent.AlbumDetailsDetailedActionEventType.LONGTAP, new MobileOfficialAppsConPhotosStat$ContentIdParam(photo.c), new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(photo.d))), MobileOfficialAppsConPhotosStat$ContentType.PHOTO, 7);
        }

        @Override // xsna.qfa0.b
        public final void e(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.CLICK_TO_DOTS, i);
        }

        @Override // xsna.qfa0.b
        public final void f(Collection<? extends Photo> collection) {
            t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType.DOWNLOAD, collection);
        }

        @Override // xsna.qfa0.b
        public final void g(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.CLICK_TO_SHARE, i);
        }

        @Override // xsna.qfa0.b
        public final void h(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.CLICK_TO_PICK, i);
        }

        @Override // xsna.qfa0.b
        public final void i(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.DELETE, i);
        }

        @Override // xsna.qfa0.b
        public final void j(Collection<? extends Photo> collection) {
            t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType.CLICK_TO_SHARE, collection);
        }

        @Override // xsna.qfa0.b
        public final void k(Collection<? extends Photo> collection) {
            t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType.DELETE, collection);
        }

        @Override // xsna.qfa0.b
        public final void l(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.CLICK_TO_CREATE, i);
        }

        @Override // xsna.qfa0.b
        public final void m(Collection<? extends Photo> collection) {
            t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType.ARCHIVATE, collection);
        }

        @Override // xsna.qfa0.b
        public final void n(int i) {
            s(this, null, new MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent(MobileOfficialAppsConPhotosStat$AlbumDetailsSinglePhotoActionEvent.AlbumDetailsSinglePhotoActionEventType.CLICK_TO_PICK, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, null, MobileOfficialAppsConPhotosStat$ContentType.PHOTO, 13);
        }

        @Override // xsna.qfa0.b
        public final void o(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.SORT_PHOTO, i);
        }

        @Override // xsna.qfa0.b
        public final void p(int i, int i2) {
            s(this, new MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.CLICK_TO_ADD_TO_STORY, new MobileOfficialAppsConPhotosStat$ContentIdParam(i), new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(i2))), null, null, null, MobileOfficialAppsConPhotosStat$ContentType.ALBUM, 14);
        }

        @Override // xsna.qfa0.b
        public final void q(int i) {
            r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType.DOWNLOAD, i);
        }

        public final void r(MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent.AlbumDetailsAlbumActionEventType albumDetailsAlbumActionEventType, int i) {
            s(this, new MobileOfficialAppsConPhotosStat$AlbumDetailsAlbumActionEvent(albumDetailsAlbumActionEventType, new MobileOfficialAppsConPhotosStat$ContentIdParam(i), null, 4, null), null, null, null, MobileOfficialAppsConPhotosStat$ContentType.ALBUM, 14);
        }

        public final void t(MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent.AlbumDetailsMultiplePhotosActionEventType albumDetailsMultiplePhotosActionEventType, Collection<? extends Photo> collection) {
            s(this, null, null, new MobileOfficialAppsConPhotosStat$AlbumDetailsMultiplePhotosActionEvent(albumDetailsMultiplePhotosActionEventType, rfa0.g(rfa0.this, collection)), null, MobileOfficialAppsConPhotosStat$ContentType.PHOTO, 11);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class c implements qfa0.c {
        public c() {
        }

        @Override // xsna.qfa0.c
        public final void a(int i) {
            b(MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.AlbumsSettingsEventType.CHANGE_ORDER, i);
        }

        public final void b(MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.AlbumsSettingsEventType albumsSettingsEventType, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, new MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent(albumsSettingsEventType, MobileOfficialAppsConPhotosStat$ContentType.ALBUM, new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(i))), null, null, null, null, null, null, 4063), null, null, 6);
        }

        @Override // xsna.qfa0.c
        public final void c(int i) {
            b(MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.AlbumsSettingsEventType.DELETE, i);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class d implements qfa0.d {
        public d() {
        }

        public static void b(d dVar, MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent, MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$ArchiveEvent(MobileOfficialAppsConPhotosStat$ContentType.PHOTO, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent), null, null, null, null, null, 4031), null, null, 6);
        }

        @Override // xsna.qfa0.d
        public final void a(int i) {
            f(MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.ArchiveSingleItemActionEventType.OPEN, i);
        }

        public final void c(MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.ArchiveMultipleItemsActionEventType archiveMultipleItemsActionEventType, Collection<? extends Photo> collection) {
            b(this, null, new MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent(archiveMultipleItemsActionEventType, rfa0.g(rfa0.this, collection)), null, 5);
        }

        @Override // xsna.qfa0.d
        public final void d(int i) {
            f(MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.ArchiveSingleItemActionEventType.LONGTAP, i);
        }

        @Override // xsna.qfa0.d
        public final void e(int i) {
            f(MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.ArchiveSingleItemActionEventType.CLICK_TO_PICK, i);
        }

        public final void f(MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent.ArchiveSingleItemActionEventType archiveSingleItemActionEventType, int i) {
            b(this, new MobileOfficialAppsConPhotosStat$ArchiveSingleItemActionEvent(archiveSingleItemActionEventType, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, null, 6);
        }

        @Override // xsna.qfa0.d
        public final void g(Collection<? extends Photo> collection) {
            c(MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.ArchiveMultipleItemsActionEventType.DOWNLOAD, collection);
        }

        @Override // xsna.qfa0.d
        public final void i(Collection<? extends Photo> collection) {
            c(MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.ArchiveMultipleItemsActionEventType.DELETE, collection);
        }

        @Override // xsna.qfa0.d
        public final void j(int i, Collection<? extends Photo> collection) {
            b(this, null, null, new MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent(MobileOfficialAppsConPhotosStat$ArchiveDetailedActionEvent.ArchiveDetailedActionEventType.RETURN_FROM_ARCHIVE, new MobileOfficialAppsConPhotosStat$ContentIdParam(i), rfa0.g(rfa0.this, collection)), 3);
        }

        @Override // xsna.qfa0.d
        public final void k(List list) {
            c(MobileOfficialAppsConPhotosStat$ArchiveMultipleItemsActionEvent.ArchiveMultipleItemsActionEventType.CLICK_TO_RETURN_FROM_ARCHIVE, list);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public static final class e {
        public final MobileOfficialAppsConPhotosStat$TabsEvent a;
        public final MobileOfficialAppsConPhotosStat$PickerEvent b;
        public final MobileOfficialAppsConPhotosStat$TabPhotosEvent c;
        public final MobileOfficialAppsConPhotosStat$TabAlbumsEvent d;
        public final MobileOfficialAppsConPhotosStat$PhotosSettingsEvent e;
        public final MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent f;
        public final MobileOfficialAppsConPhotosStat$ArchiveEvent g;
        public final MobileOfficialAppsConPhotosStat$AlbumDetailsEvent h;
        public final MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent i;
        public final MobileOfficialAppsConPhotosStat$PhotoViewerEvent j;
        public final MobileOfficialAppsConPhotosStat$OnboardingEvent k;
        public final MobileOfficialAppsConPhotosStat$PhotoTagsEvent l;

        public e() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g) && epx.f(this.h, eVar.h) && epx.f(this.i, eVar.i) && epx.f(this.j, eVar.j) && epx.f(this.k, eVar.k) && epx.f(this.l, eVar.l);
        }

        public final int hashCode() {
            MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent = this.a;
            int hashCode = (mobileOfficialAppsConPhotosStat$TabsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabsEvent.hashCode()) * 31;
            MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent = this.b;
            int hashCode2 = (hashCode + (mobileOfficialAppsConPhotosStat$PickerEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PickerEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent = this.c;
            int hashCode3 = (hashCode2 + (mobileOfficialAppsConPhotosStat$TabPhotosEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabPhotosEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent = this.d;
            int hashCode4 = (hashCode3 + (mobileOfficialAppsConPhotosStat$TabAlbumsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$TabAlbumsEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent = this.e;
            int hashCode5 = (hashCode4 + (mobileOfficialAppsConPhotosStat$PhotosSettingsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotosSettingsEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent = this.f;
            int hashCode6 = (hashCode5 + (mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent = this.g;
            int hashCode7 = (hashCode6 + (mobileOfficialAppsConPhotosStat$ArchiveEvent == null ? 0 : mobileOfficialAppsConPhotosStat$ArchiveEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent = this.h;
            int hashCode8 = (hashCode7 + (mobileOfficialAppsConPhotosStat$AlbumDetailsEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumDetailsEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent = this.i;
            int hashCode9 = (hashCode8 + (mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent == null ? 0 : mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent = this.j;
            int hashCode10 = (hashCode9 + (mobileOfficialAppsConPhotosStat$PhotoViewerEvent == null ? 0 : mobileOfficialAppsConPhotosStat$PhotoViewerEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent = this.k;
            int hashCode11 = (hashCode10 + (mobileOfficialAppsConPhotosStat$OnboardingEvent == null ? 0 : mobileOfficialAppsConPhotosStat$OnboardingEvent.hashCode())) * 31;
            MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent = this.l;
            return hashCode11 + (mobileOfficialAppsConPhotosStat$PhotoTagsEvent != null ? mobileOfficialAppsConPhotosStat$PhotoTagsEvent.hashCode() : 0);
        }

        public final String toString() {
            return "EventHolder(tabsEvent=" + this.a + ", pickerEvent=" + this.b + ", tabPhotosEvent=" + this.c + ", tabAlbumsEvent=" + this.d + ", photosSettingsEvent=" + this.e + ", albumsSettingsEvent=" + this.f + ", archiveEvent=" + this.g + ", albumDetailsEvent=" + this.h + ", albumCreateEditEvent=" + this.i + ", photoViewerEvent=" + this.j + ", onboardingEvent=" + this.k + ", photoTagsEvent=" + this.l + ')';
        }

        public e(MobileOfficialAppsConPhotosStat$TabsEvent mobileOfficialAppsConPhotosStat$TabsEvent, MobileOfficialAppsConPhotosStat$PickerEvent mobileOfficialAppsConPhotosStat$PickerEvent, MobileOfficialAppsConPhotosStat$TabPhotosEvent mobileOfficialAppsConPhotosStat$TabPhotosEvent, MobileOfficialAppsConPhotosStat$TabAlbumsEvent mobileOfficialAppsConPhotosStat$TabAlbumsEvent, MobileOfficialAppsConPhotosStat$PhotosSettingsEvent mobileOfficialAppsConPhotosStat$PhotosSettingsEvent, MobileOfficialAppsConPhotosStat$AlbumsSettingsEvent mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent, MobileOfficialAppsConPhotosStat$ArchiveEvent mobileOfficialAppsConPhotosStat$ArchiveEvent, MobileOfficialAppsConPhotosStat$AlbumDetailsEvent mobileOfficialAppsConPhotosStat$AlbumDetailsEvent, MobileOfficialAppsConPhotosStat$AlbumCreateEditEvent mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent, MobileOfficialAppsConPhotosStat$PhotoViewerEvent mobileOfficialAppsConPhotosStat$PhotoViewerEvent, MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent, MobileOfficialAppsConPhotosStat$PhotoTagsEvent mobileOfficialAppsConPhotosStat$PhotoTagsEvent, int i) {
            mobileOfficialAppsConPhotosStat$TabsEvent = (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$TabsEvent;
            mobileOfficialAppsConPhotosStat$PickerEvent = (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerEvent;
            mobileOfficialAppsConPhotosStat$TabPhotosEvent = (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosEvent;
            mobileOfficialAppsConPhotosStat$TabAlbumsEvent = (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsEvent;
            mobileOfficialAppsConPhotosStat$PhotosSettingsEvent = (i & 16) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotosSettingsEvent;
            mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent = (i & 32) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent;
            mobileOfficialAppsConPhotosStat$ArchiveEvent = (i & 64) != 0 ? null : mobileOfficialAppsConPhotosStat$ArchiveEvent;
            mobileOfficialAppsConPhotosStat$AlbumDetailsEvent = (i & 128) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumDetailsEvent;
            mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent = (i & 256) != 0 ? null : mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent;
            mobileOfficialAppsConPhotosStat$PhotoViewerEvent = (i & 512) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerEvent;
            mobileOfficialAppsConPhotosStat$OnboardingEvent = (i & 1024) != 0 ? null : mobileOfficialAppsConPhotosStat$OnboardingEvent;
            mobileOfficialAppsConPhotosStat$PhotoTagsEvent = (i & 2048) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsEvent;
            this.a = mobileOfficialAppsConPhotosStat$TabsEvent;
            this.b = mobileOfficialAppsConPhotosStat$PickerEvent;
            this.c = mobileOfficialAppsConPhotosStat$TabPhotosEvent;
            this.d = mobileOfficialAppsConPhotosStat$TabAlbumsEvent;
            this.e = mobileOfficialAppsConPhotosStat$PhotosSettingsEvent;
            this.f = mobileOfficialAppsConPhotosStat$AlbumsSettingsEvent;
            this.g = mobileOfficialAppsConPhotosStat$ArchiveEvent;
            this.h = mobileOfficialAppsConPhotosStat$AlbumDetailsEvent;
            this.i = mobileOfficialAppsConPhotosStat$AlbumCreateEditEvent;
            this.j = mobileOfficialAppsConPhotosStat$PhotoViewerEvent;
            this.k = mobileOfficialAppsConPhotosStat$OnboardingEvent;
            this.l = mobileOfficialAppsConPhotosStat$PhotoTagsEvent;
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class f implements qfa0.e {
        public f() {
        }

        @Override // xsna.qfa0.e
        public final void a() {
            f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType.CLICK_TO_ONBOARDING, null);
        }

        @Override // xsna.qfa0.e
        public final void b() {
            f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType.OPEN_CARD, 0);
        }

        @Override // xsna.qfa0.e
        public final void c() {
            f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType.CLICK_TO_QUESTION, null);
        }

        @Override // xsna.qfa0.e
        public final void d(int i) {
            f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType.NEXT_CARD, Integer.valueOf(i));
        }

        @Override // xsna.qfa0.e
        public final void e() {
            f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType.HIDE_ONBOARDING, null);
        }

        public final void f(MobileOfficialAppsConPhotosStat$OnboardingEvent.OnboardingEventType onboardingEventType, Integer num) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$OnboardingEvent(onboardingEventType, num != null ? new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(num.intValue())) : null), null, 3071), null, null, 6);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class g implements qfa0.f {
        public g() {
        }

        public static void d(g gVar, MobileOfficialAppsConPhotosStat$PickerSelectionEvent mobileOfficialAppsConPhotosStat$PickerSelectionEvent, MobileOfficialAppsConPhotosStat$PickerUploadEvent mobileOfficialAppsConPhotosStat$PickerUploadEvent, MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType, int i) {
            rfa0.h(rfa0.this, new e(null, new MobileOfficialAppsConPhotosStat$PickerEvent(mobileOfficialAppsConPhotosStat$ContentType, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerSelectionEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PickerUploadEvent), null, null, null, null, null, null, null, null, null, null, 4093), null, null, 6);
        }

        @Override // xsna.qfa0.f
        public final void a(int i) {
            d(this, null, new MobileOfficialAppsConPhotosStat$PickerUploadEvent(MobileOfficialAppsConPhotosStat$PickerUploadEvent.PickerUploadEventType.CLICK_TO_UPLOAD, new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(i))), MobileOfficialAppsConPhotosStat$ContentType.PHOTO, 1);
        }

        @Override // xsna.qfa0.f
        public final void b(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType) {
            d(this, new MobileOfficialAppsConPhotosStat$PickerSelectionEvent(MobileOfficialAppsConPhotosStat$PickerSelectionEvent.PickerSelectionEventType.CLICK_TO_CAMERA), null, mobileOfficialAppsConPhotosStat$ContentType, 2);
        }

        @Override // xsna.qfa0.f
        public final void c(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType) {
            d(this, new MobileOfficialAppsConPhotosStat$PickerSelectionEvent(MobileOfficialAppsConPhotosStat$PickerSelectionEvent.PickerSelectionEventType.PICK_FROM_GALLERY), null, mobileOfficialAppsConPhotosStat$ContentType, 2);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class h implements qfa0.g {
        public h() {
        }

        public static void f(h hVar, MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent, MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$PhotoTagsEvent((i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent), 2047), null, null, 6);
        }

        @Override // xsna.qfa0.g
        public final void a(int i) {
            f(this, null, new MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent(MobileOfficialAppsConPhotosStat$PhotoTagsDetailedEvent.PhotoTagsDetailedEventType.OPEN, MobileOfficialAppsConPhotosStat$ContentType.PHOTO, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), 1);
        }

        @Override // xsna.qfa0.g
        public final void b() {
            f(this, new MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent.PhotoTagsCommonEventType.DECLINE_ALL_TAGS), null, 2);
        }

        @Override // xsna.qfa0.g
        public final void c() {
            f(this, new MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent.PhotoTagsCommonEventType.ACCEPT_ALL_TAGS), null, 2);
        }

        @Override // xsna.qfa0.g
        public final void d() {
            f(this, new MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent.PhotoTagsCommonEventType.CLICK_TO_DOTS), null, 2);
        }

        @Override // xsna.qfa0.g
        public final void e() {
            f(this, new MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent(MobileOfficialAppsConPhotosStat$PhotoTagsCommonEvent.PhotoTagsCommonEventType.CLICK_TO_RECOGNIZED_PHOTOS), null, 2);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class i implements qfa0.h {
        public MobileOfficialAppsCoreNavStat$EventScreen a = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        public MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint b;

        public i() {
        }

        public static void q(i iVar, MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent, MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent, String str, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, null, null, null, null, null, null, new MobileOfficialAppsConPhotosStat$PhotoViewerEvent(iVar.a, MobileOfficialAppsConPhotosStat$ContentType.PHOTO, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent, iVar.b), null, null, 3583), null, str, 2);
        }

        @Override // xsna.qfa0.h
        public final void a(int i) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.ATTACH_GOOD, i, null);
        }

        @Override // xsna.qfa0.h
        public final void b(int i) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.EDIT, i, null);
        }

        @Override // xsna.qfa0.h
        public final void c(Photo photo, String str) {
            p(MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.PhotoViewerDetailedInfoEventType.COPY_LINK, photo, str);
        }

        @Override // xsna.qfa0.h
        public final void d(int i) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.SET_PROFILE_PHOTO, i, null);
        }

        @Override // xsna.qfa0.h
        public final void e(int i) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.CLICK_TO_DOTS, i, null);
        }

        @Override // xsna.qfa0.h
        public final void f(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.a = mobileOfficialAppsCoreNavStat$EventScreen;
        }

        @Override // xsna.qfa0.h
        public final void g(int i, String str) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.ADD_TO_SAVED, i, str);
        }

        @Override // xsna.qfa0.h
        public final void h(int i, String str) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.CLAIM, i, str);
        }

        @Override // xsna.qfa0.h
        public final void i(Photo photo, String str) {
            p(MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.PhotoViewerDetailedInfoEventType.GO_TO_ALBUM, photo, str);
        }

        @Override // xsna.qfa0.h
        public final void j(Photo photo) {
            p(MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.PhotoViewerDetailedInfoEventType.DELETE, photo, null);
        }

        @Override // xsna.qfa0.h
        public final void k(MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint) {
            this.b = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
        }

        @Override // xsna.qfa0.h
        public final void l(int i, String str) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.OPEN_COMMENTS, i, str);
        }

        @Override // xsna.qfa0.h
        public final void m(int i) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.ATTACH_SERVICE, i, null);
        }

        @Override // xsna.qfa0.h
        public final void n(int i, String str) {
            o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType.DOWNLOAD, i, str);
        }

        public final void o(MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent.PhotoViewerCommonInfoEventType photoViewerCommonInfoEventType, int i, String str) {
            q(this, new MobileOfficialAppsConPhotosStat$PhotoViewerCommonInfoEvent(photoViewerCommonInfoEventType, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, str, 2);
        }

        public final void p(MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent.PhotoViewerDetailedInfoEventType photoViewerDetailedInfoEventType, Photo photo, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(photo.c);
            sb.append('_');
            sb.append(photo.d);
            q(this, null, new MobileOfficialAppsConPhotosStat$PhotoViewerDetailedInfoEvent(photoViewerDetailedInfoEventType, new MobileOfficialAppsConPhotosStat$StringValueParam(sb.toString())), str, 1);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class j implements qfa0.i {
        public j() {
        }

        @Override // xsna.qfa0.i
        public final void a(int i) {
            d(MobileOfficialAppsConPhotosStat$PhotosSettingsEvent.PhotosSettingsEventType.GO_TO_ALBUM, Collections.singletonList(Integer.valueOf(i)));
        }

        @Override // xsna.qfa0.i
        public final void b(List<Integer> list) {
            d(MobileOfficialAppsConPhotosStat$PhotosSettingsEvent.PhotosSettingsEventType.ALBUM_OFF, list);
        }

        @Override // xsna.qfa0.i
        public final void c(List<Integer> list) {
            d(MobileOfficialAppsConPhotosStat$PhotosSettingsEvent.PhotosSettingsEventType.ALBUM_ON, list);
        }

        public final void d(MobileOfficialAppsConPhotosStat$PhotosSettingsEvent.PhotosSettingsEventType photosSettingsEventType, List<Integer> list) {
            rfa0.h(rfa0.this, new e(null, null, null, null, new MobileOfficialAppsConPhotosStat$PhotosSettingsEvent(photosSettingsEventType, MobileOfficialAppsConPhotosStat$ContentType.ALBUM, new MobileOfficialAppsConPhotosStat$StringValueParam(j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62))), null, null, null, null, null, null, null, 4079), null, null, 6);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class k implements qfa0.j {
        public k() {
        }

        public static void g(k kVar, MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent, MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent, int i) {
            rfa0.h(rfa0.this, new e(null, null, null, new MobileOfficialAppsConPhotosStat$TabAlbumsEvent(MobileOfficialAppsConPhotosStat$ContentType.ALBUM, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent), null, null, null, null, null, null, null, null, 4087), null, null, 6);
        }

        @Override // xsna.qfa0.j
        public final void a(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.OPEN, i);
        }

        @Override // xsna.qfa0.j
        public final void b(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.EDIT, i);
        }

        @Override // xsna.qfa0.j
        public final void c(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.DELETE, i);
        }

        @Override // xsna.qfa0.j
        public final void d(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.LONGTAP, i);
        }

        public final void e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType tabAlbumsSingleItemActionEventType, int i) {
            g(this, null, new MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent(tabAlbumsSingleItemActionEventType, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), 1);
        }

        @Override // xsna.qfa0.j
        public final void f() {
            g(this, new MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent(MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent.TabAlbumsNavigationEventType.CLICK_TO_CREATE), null, 2);
        }

        @Override // xsna.qfa0.j
        public final void h() {
            g(this, new MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent(MobileOfficialAppsConPhotosStat$TabAlbumsNavigationEvent.TabAlbumsNavigationEventType.CLICK_TO_SETTINGS), null, 2);
        }

        @Override // xsna.qfa0.j
        public final void i(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.DOWNLOAD, i);
        }

        @Override // xsna.qfa0.j
        public final void j(int i) {
            e(MobileOfficialAppsConPhotosStat$TabAlbumsSingleItemActionEvent.TabAlbumsSingleItemActionEventType.CLICK_TO_SHARE, i);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class l implements qfa0.k {
        public l() {
        }

        public static void q(l lVar, MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent, MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent, MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent, int i) {
            rfa0.h(rfa0.this, new e(null, null, new MobileOfficialAppsConPhotosStat$TabPhotosEvent(MobileOfficialAppsConPhotosStat$ContentType.PHOTO, (i & 1) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent, (i & 4) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent, (i & 8) != 0 ? null : mobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent), null, null, null, null, null, null, null, null, null, 4091), null, null, 6);
        }

        @Override // xsna.qfa0.k
        public final void a(int i) {
            p(MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.TabPhotosSingleItemActionEventType.OPEN, i);
        }

        @Override // xsna.qfa0.k
        public final void b(int i) {
            p(MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.TabPhotosSingleItemActionEventType.PIN, i);
        }

        @Override // xsna.qfa0.k
        public final void c(Collection<? extends Photo> collection) {
            o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType.MOVE_TO_ALBUM, collection);
        }

        @Override // xsna.qfa0.k
        public final void d(Photo photo) {
            q(this, null, null, null, new MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent(MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.TabPhotosDetailedActionEventType.LONGTAP, new MobileOfficialAppsConPhotosStat$ContentIdParam(photo.c), new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(photo.d))), 7);
        }

        @Override // xsna.qfa0.k
        public final void e(int i) {
            p(MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.TabPhotosSingleItemActionEventType.CLICK_TO_PICK, i);
        }

        @Override // xsna.qfa0.k
        public final void f() {
            q(this, new MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent(MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent.TabPhotosNavigationEventType.CLICK_TO_CREATE), null, null, null, 14);
        }

        @Override // xsna.qfa0.k
        public final void g(Collection<? extends Photo> collection) {
            o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType.DOWNLOAD, collection);
        }

        @Override // xsna.qfa0.k
        public final void h() {
            q(this, new MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent(MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent.TabPhotosNavigationEventType.CLICK_TO_SETTINGS), null, null, null, 14);
        }

        @Override // xsna.qfa0.k
        public final void i(Collection<? extends Photo> collection) {
            o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType.DELETE, collection);
        }

        @Override // xsna.qfa0.k
        public final void j(ArrayList arrayList) {
            o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType.ARCHIVATE, arrayList);
        }

        @Override // xsna.qfa0.k
        public final void k(Collection<? extends Photo> collection) {
            o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType.CLICK_TO_SHARE, collection);
        }

        @Override // xsna.qfa0.k
        public final void l() {
            q(this, new MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent(MobileOfficialAppsConPhotosStat$TabPhotosNavigationEvent.TabPhotosNavigationEventType.OPEN_ARCHIVE), null, null, null, 14);
        }

        @Override // xsna.qfa0.k
        public final void m(int i) {
            p(MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.TabPhotosSingleItemActionEventType.UNPIN, i);
        }

        @Override // xsna.qfa0.k
        public final void n(Photo photo) {
            q(this, null, null, null, new MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent(MobileOfficialAppsConPhotosStat$TabPhotosDetailedActionEvent.TabPhotosDetailedActionEventType.GO_TO_ALBUM, new MobileOfficialAppsConPhotosStat$ContentIdParam(photo.c), new MobileOfficialAppsConPhotosStat$StringValueParam(String.valueOf(photo.d))), 7);
        }

        public final void o(MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent.TabPhotosMultipleItemsActionEventType tabPhotosMultipleItemsActionEventType, Collection<? extends Photo> collection) {
            q(this, null, null, new MobileOfficialAppsConPhotosStat$TabPhotosMultipleItemsActionEvent(tabPhotosMultipleItemsActionEventType, rfa0.g(rfa0.this, collection)), null, 11);
        }

        public final void p(MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent.TabPhotosSingleItemActionEventType tabPhotosSingleItemActionEventType, int i) {
            q(this, null, new MobileOfficialAppsConPhotosStat$TabPhotosSingleItemActionEvent(tabPhotosSingleItemActionEventType, new MobileOfficialAppsConPhotosStat$ContentIdParam(i)), null, null, 13);
        }
    }

    /* compiled from: PhotosMetricsCollectorImpl.kt */
    public final class m implements qfa0.l {
        public m() {
        }

        @Override // xsna.qfa0.l
        public final void a(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType) {
            rfa0.h(rfa0.this, new e(new MobileOfficialAppsConPhotosStat$TabsEvent(MobileOfficialAppsConPhotosStat$TabsEvent.TabsEventType.CHANGE_TAB, mobileOfficialAppsConPhotosStat$ContentType), null, null, null, null, null, null, null, null, null, null, null, 4094), null, null, 6);
        }
    }

    public static final MobileOfficialAppsConPhotosStat$StringValueParam g(rfa0 rfa0Var, Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Photo) it.next()).c));
        }
        return new MobileOfficialAppsConPhotosStat$StringValueParam(j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
    }

    public static void h(rfa0 rfa0Var, e eVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, int i2) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = (i2 & 2) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen;
        String str2 = (i2 & 4) != 0 ? null : str;
        rfa0Var.getClass();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        if (epx.f(rfa0Var.a, UserId.d)) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("ownerId is not set for event " + eVar));
        }
        new bjc(c2, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str2, null, 46, null), new MobileOfficialAppsConPhotosStat$TypePhotosItem(rfa0Var.a.b, mobileOfficialAppsCoreNavStat$EventScreen2 == null ? c2 : mobileOfficialAppsCoreNavStat$EventScreen2, eVar.a, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h, eVar.i, eVar.j, eVar.k, eVar.l), 2)).q();
    }

    @Override // xsna.qfa0
    public final qfa0.e a() {
        return (qfa0.e) this.l.getValue();
    }

    @Override // xsna.qfa0
    public final qfa0.k b() {
        return (qfa0.k) this.d.getValue();
    }

    @Override // xsna.qfa0
    public final rfa0 c(UserId userId) {
        this.a = userId;
        return this;
    }

    @Override // xsna.qfa0
    public final qfa0.b d() {
        return (qfa0.b) this.i.getValue();
    }

    @Override // xsna.qfa0
    public final qfa0.h e() {
        return (qfa0.h) this.k.getValue();
    }

    @Override // xsna.qfa0
    public final qfa0.g f() {
        return (qfa0.g) this.m.getValue();
    }

    @Override // xsna.qfa0
    public final qfa0.l getTabs() {
        return (qfa0.l) this.b.getValue();
    }
}

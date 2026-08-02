package xsna;

import android.app.Activity;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import java.util.List;
import xsna.qe6;

/* compiled from: BaseImageViewer.kt */
/* loaded from: classes7.dex */
public final class re6<T> {
    public final qe6.a a;
    public final ImageViewer.a b;
    public final Activity c;
    public final List<T> d;
    public final izs<T, AttachmentWithMedia> e;
    public final izs<T, AttachWithImage> f;
    public final String g;
    public final String h;
    public final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint i;
    public final UserId j;
    public final Long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;

    public re6(qe6.a aVar, ImageViewer.a aVar2, Activity activity, List list, izs izsVar, izs izsVar2, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, UserId userId, Long l, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = activity;
        this.d = list;
        this.e = izsVar;
        this.f = izsVar2;
        this.g = str;
        this.h = str2;
        this.i = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
        this.j = userId;
        this.k = l;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = str3;
        this.p = z4;
    }

    public final Activity a() {
        return this.c;
    }

    public final ImageViewer.a b() {
        return this.b;
    }

    public final Long c() {
        return this.k;
    }

    public final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint d() {
        return this.i;
    }

    public final List<T> e() {
        return this.d;
    }

    public final PhotoViewer.b f() {
        return this.a;
    }

    public final String g() {
        return this.o;
    }

    public final String h() {
        return this.h;
    }

    public final boolean i() {
        return this.m;
    }

    public final boolean j() {
        return this.p;
    }

    public final izs<T, AttachWithImage> k() {
        return this.f;
    }

    public final izs<T, AttachmentWithMedia> l() {
        return this.e;
    }

    public final String m() {
        return this.g;
    }

    public final UserId n() {
        return this.j;
    }

    public final boolean o() {
        return this.l;
    }

    public final boolean p() {
        return this.n;
    }
}

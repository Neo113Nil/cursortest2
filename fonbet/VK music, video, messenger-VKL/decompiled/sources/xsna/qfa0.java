package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentType;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PhotosMetricsCollector.kt */
/* loaded from: classes4.dex */
public interface qfa0 {

    /* compiled from: PhotosMetricsCollector.kt */
    public interface a {
        void b(int i);

        void c(int i);

        void d();

        void e(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

        void f();
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface b {
        void a(int i);

        void b(int i);

        void c(Collection<? extends Photo> collection);

        void d(Photo photo);

        void e(int i);

        void f(Collection<? extends Photo> collection);

        void g(int i);

        void h(int i);

        void i(int i);

        void j(Collection<? extends Photo> collection);

        void k(Collection<? extends Photo> collection);

        void l(int i);

        void m(Collection<? extends Photo> collection);

        void n(int i);

        void o(int i);

        void p(int i, int i2);

        void q(int i);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface c {
        void a(int i);

        void c(int i);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface d {
        void a(int i);

        void d(int i);

        void e(int i);

        void g(Collection<? extends Photo> collection);

        void i(Collection<? extends Photo> collection);

        void j(int i, Collection<? extends Photo> collection);

        void k(List list);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface e {
        void a();

        void b();

        void c();

        void d(int i);

        void e();
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface f {
        void a(int i);

        void b(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType);

        void c(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface g {
        void a(int i);

        void b();

        void c();

        void d();

        void e();
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface h {
        void a(int i);

        void b(int i);

        void c(Photo photo, String str);

        void d(int i);

        void e(int i);

        void f(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

        void g(int i, String str);

        void h(int i, String str);

        void i(Photo photo, String str);

        void j(Photo photo);

        void k(MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint);

        void l(int i, String str);

        void m(int i);

        void n(int i, String str);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface i {
        void a(int i);

        void b(List<Integer> list);

        void c(List<Integer> list);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface j {
        void a(int i);

        void b(int i);

        void c(int i);

        void d(int i);

        void f();

        void h();

        void i(int i);

        void j(int i);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface k {
        void a(int i);

        void b(int i);

        void c(Collection<? extends Photo> collection);

        void d(Photo photo);

        void e(int i);

        void f();

        void g(Collection<? extends Photo> collection);

        void h();

        void i(Collection<? extends Photo> collection);

        void j(ArrayList arrayList);

        void k(Collection<? extends Photo> collection);

        void l();

        void m(int i);

        void n(Photo photo);
    }

    /* compiled from: PhotosMetricsCollector.kt */
    public interface l {
        void a(MobileOfficialAppsConPhotosStat$ContentType mobileOfficialAppsConPhotosStat$ContentType);
    }

    e a();

    k b();

    rfa0 c(UserId userId);

    b d();

    h e();

    g f();

    l getTabs();
}

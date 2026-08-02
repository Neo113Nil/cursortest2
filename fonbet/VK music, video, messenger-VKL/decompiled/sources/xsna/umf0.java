package xsna;

import android.net.Uri;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;

/* compiled from: ReefAnalytics.kt */
/* loaded from: classes3.dex */
public interface umf0 extends VkHttpCallFactory.a {
    void a();

    void b(int i);

    void c(long j);

    void d(ReefContentQuality reefContentQuality);

    void f(long j, long j2);

    void g();

    void h(String str, String str2, ReefContentType reefContentType);

    void i();

    void j();

    void k(long j, long j2);

    void l(Uri uri);

    void pause();

    void release();

    void start();
}

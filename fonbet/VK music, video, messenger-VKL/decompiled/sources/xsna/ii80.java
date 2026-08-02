package xsna;

import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.api.generated.photos.dto.PhotosVerticalizeCheckStatusResponseDto;
import com.vk.api.generated.photos.dto.PhotosVerticalizeErrorDto;
import com.vk.core.view.components.button.VkButton;
import com.vk.queue.events.PhotoVerticalizationQueueEvent$RestrictionsException;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.ctb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ii80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ii80(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj5;
                ji80 ji80Var = (ji80) obj4;
                uqb0 uqb0Var = (uqb0) obj3;
                ViewPager2 viewPager2 = (ViewPager2) obj2;
                ctb0.b bVar = (ctb0.b) obj;
                int i2 = ji80.n1;
                if (!(bVar instanceof ctb0.b.C2682b)) {
                    return s3q0.a;
                }
                ctb0.b.C2682b c2682b = (ctb0.b.C2682b) bVar;
                ArrayList arrayList = c2682b.b;
                textView.setText(String.format(ji80Var.co().b.h.e, Arrays.copyOf(new Object[]{Integer.valueOf(c2682b.a + 1), Integer.valueOf(arrayList.size())}, 2)));
                uqb0Var.setItems(arrayList);
                viewPager2.post(new vrl(4, viewPager2, bVar));
                VkButton vkButton = ji80Var.k1;
                if (vkButton != null) {
                    vkButton.setEnabled(c2682b.d);
                }
                VkButton vkButton2 = ji80Var.k1;
                if (vkButton2 != null) {
                    vkButton2.setText(c2682b.c);
                }
                return s3q0.a;
            case 1:
                myc0.h((yvj) obj5, null, null, new rxk0((vg7) obj4, ((Float) obj).floatValue(), (wh50) obj3, (wh50) obj2, null), 3);
                return s3q0.a;
            case 2:
                eqr0 eqr0Var = (eqr0) obj5;
                u5p0 u5p0Var = (u5p0) obj4;
                e9i0 e9i0Var = (e9i0) obj3;
                String str = (String) obj2;
                PhotosVerticalizeCheckStatusResponseDto photosVerticalizeCheckStatusResponseDto = (PhotosVerticalizeCheckStatusResponseDto) obj;
                PhotosVerticalizeErrorDto d = photosVerticalizeCheckStatusResponseDto.d();
                List<String> e = photosVerticalizeCheckStatusResponseDto.e();
                if (d != null) {
                    eqr0Var.a(photosVerticalizeCheckStatusResponseDto.f());
                    u5p0Var.invoke(new PhotoVerticalizationQueueEvent$RestrictionsException(d.d()));
                } else {
                    List<String> list = e;
                    if (list == null || list.isEmpty()) {
                        eqr0Var.b(str, ((Number) eqr0Var.i.getValue()).longValue(), e9i0Var, u5p0Var);
                    } else {
                        eqr0Var.a(photosVerticalizeCheckStatusResponseDto.f());
                        e9i0Var.invoke(e);
                    }
                }
                return s3q0.a;
            default:
                o5t0 o5t0Var = (o5t0) obj4;
                List list2 = (List) obj;
                VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist temporaryPlaylist = (VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) ((VideoDiscoveryRelatedVideosSourceArgs) obj3);
                return new c.s0.d(new mgs0(new VideoDiscoveryRelatedVideosSource.TemporaryPlaylist((String) obj2, o5t0Var.a, o5t0Var.b, temporaryPlaylist.h, temporaryPlaylist.j), list2.isEmpty() ? new m.b(false) : com.vk.video.ui.discovery.minimizable.related_videos.n.a(m.c.a, 0, new rbt0(0, list2.size(), list2.size(), 48, list2), ((com.vk.video.ui.discovery.minimizable.related_videos.k) obj5).d, null, null), null, null, false, false));
        }
    }
}

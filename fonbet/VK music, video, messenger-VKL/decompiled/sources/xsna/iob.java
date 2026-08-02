package xsna;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.os.Parcelable;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.video.dto.VideoContentDto;
import com.vk.api.generated.video.dto.VideoDiscoverBannerActionDto;
import com.vk.api.generated.video.dto.VideoDiscoverBannerDto;
import com.vk.api.generated.video.dto.VideoGetSimilarResponseDto;
import com.vk.api.generated.video.dto.VideoItemsInSimilarDto;
import com.vk.dto.video.Doc2DocItem;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.superapp.ui.views.horizontalscroll.MiniWidgetsSpreaderLayoutManagerV2;
import com.vk.video.ui.discovery.catalog.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.cg80;
import xsna.gob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iob implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iob(int i, Integer num) {
        this.b = 0;
        this.c = i;
        this.d = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Parcelable stub;
        Doc2DocItem.Banner.Action action;
        Doc2DocItem.Banner.Action action2;
        switch (this.b) {
            case 0:
                Integer num = (Integer) this.d;
                Pair pair = (Pair) obj;
                DialogExt dialogExt = (DialogExt) pair.d();
                t140 t140Var = (t140) pair.g();
                Object obj2 = t140Var.a.c.get(Integer.valueOf(this.c));
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Msg msg = (Msg) obj2;
                String str = null;
                if (num != null) {
                    Object obj3 = t140Var.a.c.get(Integer.valueOf(num.intValue()));
                    com.vk.im.engine.models.messages.a aVar = obj3 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) obj3 : null;
                    if (aVar != null) {
                        str = aVar.getBody();
                    }
                }
                dialogExt.b.Hb(t140Var.b);
                return new gob.a(msg, str, dialogExt);
            case 1:
                Range<Integer> bitrateRange = ((MediaCodecInfo) obj).getCapabilitiesForType((String) this.d).getVideoCapabilities().getBitrateRange();
                int i = this.c;
                return Integer.valueOf(Math.abs(bitrateRange.clamp(Integer.valueOf(i)).intValue() - i));
            case 2:
                View view = (View) obj;
                ((MiniWidgetsSpreaderLayoutManagerV2) this.d).getClass();
                int measuredWidth = view.getMeasuredWidth() + this.c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = measuredWidth;
                }
                return s3q0.a;
            case 3:
                return new cg80.h((Activity) this.d, this.c);
            default:
                com.vk.video.ui.discovery.catalog.d dVar = (com.vk.video.ui.discovery.catalog.d) this.d;
                VideoGetSimilarResponseDto videoGetSimilarResponseDto = (VideoGetSimilarResponseDto) obj;
                List<VideoItemsInSimilarDto> f = videoGetSimilarResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                for (VideoItemsInSimilarDto videoItemsInSimilarDto : f) {
                    ums0 ums0Var = ums0.a;
                    VideoContentDto e = videoItemsInSimilarDto.e();
                    List e2 = ums0.e(ums0Var, e != null ? e.d() : null, videoGetSimilarResponseDto.j(), videoGetSimilarResponseDto.e(), false, 52);
                    VideoDiscoverBannerDto d = videoItemsInSimilarDto.d();
                    if (!gsi0.b().j) {
                        d = null;
                    }
                    int i2 = d.a.$EnumSwitchMapping$0[videoItemsInSimilarDto.g().ordinal()];
                    if (i2 == 1) {
                        stub = new Doc2DocItem.Video(e2);
                    } else if (i2 == 2) {
                        stub = new Doc2DocItem.Carousel(e2, null, 2, null);
                    } else if (i2 == 3) {
                        stub = new Doc2DocItem.Floor(e2, null, 2, null);
                    } else if (i2 != 4 || d == null) {
                        stub = new Doc2DocItem.Stub(null, 1, null);
                    } else {
                        String title = d.getTitle();
                        String g = d.g();
                        String e3 = d.e();
                        VideoDiscoverBannerActionDto d2 = d.d();
                        VideoDiscoverBannerActionDto.TypeDto e4 = d2 != null ? d2.e() : null;
                        int i3 = e4 == null ? -1 : ggs0.$EnumSwitchMapping$0[e4.ordinal()];
                        if (i3 == 1) {
                            action = Doc2DocItem.Banner.Action.OPEN_URL;
                        } else if (i3 != 2) {
                            action2 = null;
                            VideoDiscoverBannerActionDto d3 = d.d();
                            stub = new Doc2DocItem.Banner(title, g, e3, action2, d3 != null ? d3.d() : null, d.f(), d.i(), d.j());
                        } else {
                            action = Doc2DocItem.Banner.Action.OPEN_SECTION;
                        }
                        action2 = action;
                        VideoDiscoverBannerActionDto d32 = d.d();
                        stub = new Doc2DocItem.Banner(title, g, e3, action2, d32 != null ? d32.d() : null, d.f(), d.i(), d.j());
                    }
                    arrayList.add(stub);
                }
                return dVar.a(this.c, videoGetSimilarResponseDto.getCount(), arrayList, videoGetSimilarResponseDto.d(), videoGetSimilarResponseDto.i(), videoGetSimilarResponseDto.g(), videoGetSimilarResponseDto.k());
        }
    }

    public /* synthetic */ iob(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}

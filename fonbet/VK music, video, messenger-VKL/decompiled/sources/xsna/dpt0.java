package xsna;

import android.content.Context;
import com.vk.dto.common.VideoUrl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dw20;

/* compiled from: VideoUrlsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class dpt0 extends dw20 {

    /* compiled from: VideoUrlsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final iz0 e;
        public final List<VideoUrl> f;
        public final io.reactivex.rxjava3.subjects.d<fpt0> g;
        public final dpt0 h;
        public final apt0 i;
        public final io.reactivex.rxjava3.disposables.c j;

        public a(Context context, iz0 iz0Var, List list) {
            super(context, null);
            this.e = iz0Var;
            this.f = list;
            this.g = io.reactivex.rxjava3.subjects.d.N0();
            this.h = new dpt0();
            sxl0 sxl0Var = new sxl0(this, 12);
            apt0 apt0Var = new apt0();
            apt0Var.y0(new ept0(sxl0Var));
            VideoUrl[] values = VideoUrl.values();
            ArrayList arrayList = new ArrayList();
            for (VideoUrl videoUrl : values) {
                if (!videoUrl.o()) {
                    arrayList.add(videoUrl);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                VideoUrl videoUrl2 = (VideoUrl) it.next();
                arrayList2.add(new fpt0(videoUrl2, this.f.contains(videoUrl2)));
            }
            apt0Var.setItems(arrayList2);
            this.i = apt0Var;
            this.j = this.g.subscribe(new bpt0(new kvm0(this, 13), 0));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            v0(R.string.video_urls_debug);
            F(new baf0(m33.a(R.drawable.vk_icon_info_circle_28, this.c), e3m.f(R.attr.vk_ui_icon_secondary, this.c)), null);
            w();
            b0(new bnc0(this, 24));
            i(this.i, (r3 & 2) == 0, false);
            o();
            h0(R.string.save, new afl0(this, 22));
            a0(new orj0(this, 26));
            c(new a470());
            return this.h;
        }
    }
}

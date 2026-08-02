package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.views.image_zhukov.ZhukovLayout;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Adapter.kt */
/* loaded from: classes2.dex */
public final class dj0 extends b6y0<wr6> {
    public final LayoutInflater b;
    public Msg e;
    public NestedMsg f;
    public pk30 g;
    public List<? extends Attach> c = EmptyList.b;
    public final HashMap<Integer, wr6> d = new HashMap<>();
    public final zuj h = new zuj();

    public dj0(Context context) {
        this.b = LayoutInflater.from(context);
    }

    @Override // xsna.b6y0
    public final int a() {
        return this.c.size();
    }

    @Override // xsna.b6y0
    public final void b(int i, e6y0 e6y0Var) {
        Image Ab;
        Attach attach = (Attach) j5g.b0(i, this.c);
        if (attach == null) {
            return;
        }
        if (attach instanceof AttachImage) {
            AttachImage attachImage = (AttachImage) attach;
            Ab = attachImage.r.Jb() ? attachImage.r.Ab() : attachImage.q.Ab();
        } else if (attach instanceof AttachVideo) {
            AttachVideo attachVideo = (AttachVideo) attach;
            Ab = attachVideo.f.Jb() ? attachVideo.f.Ab() : attachVideo.c.Ab();
        } else {
            if (!(attach instanceof AttachChannelStub)) {
                throw new IllegalStateException("Unknown attach: " + attach);
            }
            Ab = ((AttachChannelStub) attach).d().Ab();
        }
        if (Ab != null) {
            e6y0Var.a = Ab.b;
            e6y0Var.b = Ab.c;
            return;
        }
        AttachVideo attachVideo2 = attach instanceof AttachVideo ? (AttachVideo) attach : null;
        VideoRestriction O = attachVideo2 != null ? attachVideo2.b.O() : null;
        if (O == null) {
            e6y0Var.a = 0;
            e6y0Var.b = 0;
            return;
        }
        ImageSize imageSize = (ImageSize) ixj0.b(O.h.Fb());
        if (imageSize == null) {
            imageSize = (ImageSize) ixj0.b(O.g.Fb());
        }
        e6y0Var.a = imageSize != null ? imageSize.d.b : 200;
        e6y0Var.b = imageSize != null ? imageSize.d.c : 200;
    }

    @Override // xsna.b6y0
    public final int c(int i) {
        Attach attach = (Attach) j5g.b0(i, this.c);
        if (attach == null) {
            return 2;
        }
        int i2 = attach instanceof AttachImage ? ((AttachImage) attach).w != null ? 4 : 1 : 2;
        if (attach instanceof AttachChannelStub) {
            return 5;
        }
        return i2;
    }

    @Override // xsna.b6y0
    public final void d(wr6 wr6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        wr6 wr6Var2 = wr6Var;
        if (wr6Var2 != null) {
            this.h.a(wr6Var2, z, z2, z3, z4);
        }
    }

    @Override // xsna.b6y0
    public final void e(wr6 wr6Var, int i) {
        wr6 wr6Var2 = wr6Var;
        Attach attach = (Attach) j5g.b0(i, this.c);
        if (attach == null || wr6Var2 == null) {
            return;
        }
        wr6Var2.b(this.e, this.f, attach, this.g);
        this.d.put(Integer.valueOf(i), wr6Var2);
    }

    @Override // xsna.b6y0
    public final g6y0 f(ZhukovLayout zhukovLayout, int i) {
        LayoutInflater layoutInflater = this.b;
        if (i == 1) {
            return new wda0(layoutInflater.inflate(R.layout.vkim_msg_part_box_photovideo_photo, (ViewGroup) zhukovLayout, false));
        }
        if (i == 2) {
            return new art0(layoutInflater.inflate(R.layout.vkim_msg_part_box_photovideo_video, (ViewGroup) zhukovLayout, false));
        }
        if (i == 5) {
            return new osm0(layoutInflater.inflate(R.layout.vkim_msg_part_box_stub_media, (ViewGroup) zhukovLayout, false));
        }
        throw new IllegalStateException(lhg.a(i, "Unknown viewType: "));
    }
}

package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.image_zhukov.ZhukovLayout;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: ZhukovHolder.kt */
@ozl
/* loaded from: classes4.dex */
public final class c6y0 extends qi6<NewsEntry> implements i7o {
    public static final /* synthetic */ int G = 0;
    public final ZhukovLayout C;
    public final knw D;
    public final m680 E;
    public List<Attachment> F;

    /* compiled from: ZhukovHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return (Boolean) ((mcy) this.receiver).get();
        }
    }

    /* compiled from: ZhukovHolder.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            c6y0 c6y0Var = (c6y0) this.receiver;
            int i = c6y0.G;
            return Boolean.valueOf(c6y0Var.t);
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            c6y0 c6y0Var = (c6y0) this.receiver;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = c6y0.G;
            c6y0Var.t = booleanValue;
        }
    }

    public c6y0(ViewGroup viewGroup, f6y0 f6y0Var, h170 h170Var) {
        super(R.layout.attach_thumbs, viewGroup);
        ZhukovLayout zhukovLayout = (ZhukovLayout) this.itemView.findViewById(R.id.zhukov);
        this.C = zhukovLayout;
        knw knwVar = new knw(h170Var);
        this.D = knwVar;
        m680 m680Var = new m680(zhukovLayout, new p99(1, knwVar, knw.class, "getItemViewType", "getItemViewType(I)I", 0, 13), null, null, new lxh0(this, 26));
        this.E = m680Var;
        knwVar.f = m680Var;
        knwVar.g = m680Var;
        zhukovLayout.setPools(f6y0Var);
        zhukovLayout.setAdapter(knwVar);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Float f;
        boolean z = newsEntry instanceof Post;
        if (z) {
            f = ((Post) newsEntry).T;
        } else if (newsEntry instanceof PromoPost) {
            f = ((PromoPost) newsEntry).n.T;
        } else if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                f = ((Post) gmqVar).T;
            }
            f = null;
        } else {
            if (newsEntry instanceof Photos) {
                f = ((Photos) newsEntry).s;
            }
            f = null;
        }
        this.C.setMaximumHeight(f != null ? an10.b(f.floatValue() * iah0.u()) : e3m.a(R.dimen.post_attach_thumbs_height, this.itemView.getContext()));
        int i = z ? 10 : 5;
        List<Attachment> list = this.F;
        List<Attachment> subList = list != null ? list.size() > i ? list.subList(0, i) : list : null;
        knw knwVar = this.D;
        ArrayList arrayList = knwVar.d;
        arrayList.clear();
        List<Attachment> list2 = subList;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        knwVar.i = new kun(0, new lun(0, this, c6y0.class, "isAdvertisement", "isAdvertisement()Z", 2), mcy.class, "get", "get()Ljava/lang/Object;", 0, 6);
        ZhukovLayout zhukovLayout = knwVar.a;
        if (zhukovLayout != null) {
            zhukovLayout.c();
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.h = s6oVar;
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof w84) {
            this.F = ((w84) u1c0Var).q;
        }
        super.a6(u1c0Var);
        this.D.i = new a(0, new b(this, c6y0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
        NewsEntry newsEntry = u1c0Var.a;
        PostInteract postInteract = this.w;
        String str = this.u;
        s1c0 s1c0Var = this.x;
        m680 m680Var = this.E;
        m680Var.i = newsEntry;
        m680Var.j = postInteract;
        m680Var.k = str;
        m680Var.l = s1c0Var;
    }
}

package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.screen.a;
import com.vk.dto.common.Attachment;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.common.posting.attachments.AttachmentsNewsEntry;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a1u0;
import xsna.fmc0;
import xsna.ify;

/* compiled from: PostAttachmentsView.kt */
/* loaded from: classes4.dex */
public final class h0c0 {
    public final RecyclerView a;
    public final hb40 b;
    public final PostingFragment.f c;
    public final fnc0 d;
    public final Object e;
    public mdc0 f;
    public final pcc0 g;
    public int h;
    public final mu9 i;

    public h0c0(RecyclerView recyclerView, hb40 hb40Var, PostingFragment.f fVar, fnc0 fnc0Var) {
        this.a = recyclerView;
        this.b = hb40Var;
        this.c = fVar;
        this.d = fnc0Var;
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new u210(this, 13));
        this.e = a2;
        ybc0 ybc0Var = new ybc0();
        this.f = new mdc0(PhotoVideoDisplayMode.Carousel, true);
        this.h = iah0.a(248);
        this.i = new mu9(ybc0Var, hb40Var, new ko60(2));
        x8a x8aVar = new x8a(this);
        g0c0 g0c0Var = new g0c0(this);
        ybc0Var.a = new zq70().k();
        pcc0 pcc0Var = new pcc0(g0c0Var, new tzv(this, 25), ybc0Var, new k7y(this, 26), x8aVar, new g6b(ybc0Var), hb40Var, null, null, (a2o) a2.getValue(), new a1u0.a(false), 384);
        u1c0 u1c0Var = new u1c0(5, new AttachmentsNewsEntry(EmptyList.b));
        u1c0Var.g = "preview_holder";
        pcc0Var.x0(u1c0Var);
        pcc0Var.createViewHolder(recyclerView, pcc0Var.getItemViewType(0));
        pcc0Var.Q0(this.h);
        this.g = pcc0Var;
        recyclerView.setAdapter(pcc0Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
        new androidx.recyclerview.widget.r(new t84(pcc0Var)).l(recyclerView);
        recyclerView.addItemDecoration(new l2c0());
    }

    public static final void a(h0c0 h0c0Var, Attachment attachment) {
        int i;
        if (!hg10.l(h0c0Var.f)) {
            if (attachment instanceof PhotoAttachment) {
                h0c0Var.c(new defpackage.e0(19, h0c0Var, attachment));
                return;
            }
            return;
        }
        PostingAttachment b = com.vk.newsfeed.posting.impl.presentation.model.a.b(attachment);
        if (b == null) {
            return;
        }
        pcc0 pcc0Var = h0c0Var.g;
        if (pcc0Var != null) {
            a4d0 a4d0Var = pcc0Var.n.g;
            if (a4d0Var != null) {
                List<Attachment> list = a4d0Var.C;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof PhotoAttachment) {
                        arrayList.add(obj);
                    }
                }
                i = arrayList.indexOf(attachment);
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        h0c0Var.c.invoke(new fmc0.i.b(h0c0Var.b(i >= 0 ? i : 0)));
        h0c0Var.c(new defpackage.f0(21, h0c0Var, b));
    }

    public final a.c b(int i) {
        w3d0 w3d0Var;
        PhotoAttachment photoAttachment;
        View view;
        Object obj;
        a.c cVar = new a.c();
        pcc0 pcc0Var = this.g;
        if (pcc0Var != null) {
            val valVar = pcc0Var.n;
            a4d0 a4d0Var = valVar.g;
            if (a4d0Var != null) {
                Iterator<T> it = a4d0Var.C.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int i4 = i2 + 1;
                    if (((Attachment) it.next()) instanceof PhotoAttachment) {
                        if (i3 == i) {
                            View childAt = a4d0Var.J.getChildAt(i2);
                            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                            if (viewGroup != null) {
                                Iterator kxt0Var = new kxt0(viewGroup);
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    if (!kxt0Var.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = kxt0Var.next();
                                    View view2 = (View) obj;
                                    ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                                    kxt0 kxt0Var2 = viewGroup2 != null ? new kxt0(viewGroup2) : null;
                                    if (kxt0Var2 == null || !kxt0Var2.hasNext()) {
                                        while (!kxt0Var.hasNext() && !arrayList.isEmpty()) {
                                            kxt0Var = (Iterator) j5g.i0(arrayList);
                                            g5g.I(arrayList);
                                        }
                                    } else {
                                        arrayList.add(kxt0Var);
                                        kxt0Var = kxt0Var2;
                                    }
                                    if (((View) obj) instanceof w3d0) {
                                        break;
                                    }
                                }
                                view = (View) obj;
                            } else {
                                view = null;
                            }
                            if (view instanceof w3d0) {
                                w3d0Var = (w3d0) view;
                            }
                        } else {
                            i3++;
                        }
                    }
                    i2 = i4;
                }
            }
            w3d0Var = null;
            if (w3d0Var != null) {
                a4d0 a4d0Var2 = valVar.g;
                if (a4d0Var2 != null) {
                    List<Attachment> list = a4d0Var2.C;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof PhotoAttachment) {
                            arrayList2.add(obj2);
                        }
                    }
                    photoAttachment = (PhotoAttachment) j5g.b0(i, arrayList2);
                } else {
                    photoAttachment = null;
                }
                MediaStoreEntry i5 = photoAttachment != null ? w65.i(photoAttachment) : null;
                cVar.a = w3d0Var;
                cVar.b = w3d0Var;
                cVar.c = this.a.getRootView();
                cVar.d = i5;
                if (w3d0Var.c0()) {
                    cVar.e = w3d0Var.getImageWidth();
                    cVar.f = w3d0Var.getImageHeight();
                }
            }
        }
        return cVar;
    }

    public final void c(gzs<s3q0> gzsVar) {
        int i = ify.a;
        if (!ify.e(ify.c)) {
            gzsVar.invoke();
        } else {
            mhy.b(this.a.getContext());
            ify.a(new a(gzsVar));
        }
    }

    /* compiled from: PostAttachmentsView.kt */
    public static final class a implements ify.a {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            this.b.invoke();
            int i = ify.a;
            ify.g(this);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
        }
    }
}

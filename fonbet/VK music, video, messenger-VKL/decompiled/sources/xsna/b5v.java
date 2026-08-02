package xsna;

import android.app.ProgressDialog;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightLocalCustomCover;
import com.vk.dto.narratives.HighlightLocalStoryCover;
import com.vk.dto.narratives.HighlightRemoteCustomCover;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.lists.c;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HighlightEditPresenter.kt */
/* loaded from: classes3.dex */
public final class b5v extends ysi implements u4v {
    public final HighlightEditFragment c;
    public final UserId d;
    public final Collection<Integer> e;
    public final int f;
    public final String g;
    public final upl0 h;
    public final gu50 i;
    public final j6v j;
    public com.vk.lists.c k;
    public final ArrayList l = new ArrayList();
    public final ArrayList m;
    public HighlightCover n;
    public Photo o;
    public final a5v p;

    /* compiled from: HighlightEditPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public b5v(HighlightEditFragment highlightEditFragment, UserId userId, ArrayList arrayList, int i, String str, upl0 upl0Var, gu50 gu50Var, j6v j6vVar) {
        this.c = highlightEditFragment;
        this.d = userId;
        this.e = arrayList;
        this.f = i;
        this.g = str;
        this.h = upl0Var;
        this.i = gu50Var;
        this.j = j6vVar;
        this.m = arrayList != null ? new ArrayList(arrayList) : new ArrayList();
        this.p = new a5v(this);
    }

    @Override // xsna.u4v
    public final HighlightCover H6() {
        return this.n;
    }

    @Override // xsna.u4v
    public final void I5(int i, int i2) {
        ArrayList arrayList = this.m;
        arrayList.add(i2, arrayList.remove(i));
        j7();
    }

    @Override // xsna.u4v
    public final void L0(HighlightCover highlightCover) {
        String str;
        this.n = highlightCover;
        this.o = null;
        HighlightEditFragment highlightEditFragment = this.c;
        highlightEditFragment.getClass();
        if (highlightCover != null) {
            VKCircleImageView vKCircleImageView = highlightEditFragment.U;
            if (vKCircleImageView == null) {
                vKCircleImageView = null;
            }
            str = highlightCover.e(vKCircleImageView.getWidth());
        } else {
            str = null;
        }
        if (str == null) {
            VKCircleImageView vKCircleImageView2 = highlightEditFragment.U;
            if (vKCircleImageView2 == null) {
                vKCircleImageView2 = null;
            }
            vKCircleImageView2.o0(null, null);
            ImageView imageView = highlightEditFragment.W;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent)));
            View view = highlightEditFragment.V;
            (view != null ? view : null).setVisibility(4);
            return;
        }
        if (((highlightCover instanceof HighlightLocalStoryCover) || (highlightCover instanceof HighlightLocalCustomCover)) && highlightCover.d() != null) {
            mcr0.h(Uri.parse(str)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new el6(new u9(18, highlightCover.d(), highlightEditFragment), 28), new lf1(new v74(17, highlightEditFragment, str), 27));
        } else {
            VKCircleImageView vKCircleImageView3 = highlightEditFragment.U;
            if (vKCircleImageView3 == null) {
                vKCircleImageView3 = null;
            }
            vKCircleImageView3.o0(str, null);
        }
        ImageView imageView2 = highlightEditFragment.W;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageTintList(ColorStateList.valueOf(highlightEditFragment.requireContext().getColor(R.color.vk_white)));
        View view2 = highlightEditFragment.V;
        (view2 != null ? view2 : null).setVisibility(0);
    }

    @Override // xsna.u4v
    public final void O6(RectF rectF, String str) {
        ProgressDialog progressDialog = new ProgressDialog(this.c.getActivity());
        progressDialog.setMessage(y8g0.e(R.string.rx_loading));
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);
        progressDialog.show();
        L0(new HighlightLocalCustomCover(str, null, rectF, 2, null));
        ozg0.a().c(str, this.d, new mp3(15, this, progressDialog), new g84(16, this, progressDialog));
    }

    @Override // xsna.u4v
    public final void R4(int i, RectF rectF) {
        if (i == 0) {
            L0(null);
            return;
        }
        StoryEntry d = this.h.d(i, this.d);
        if (d != null) {
            L0(new HighlightLocalStoryCover(d, rectF));
        } else {
            L0(null);
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gm6
    public final void d() {
        HighlightEditFragment highlightEditFragment = this.c;
        RectF rectF = null;
        Object[] objArr = 0;
        UserId userId = this.d;
        upl0 upl0Var = this.h;
        Collection<Integer> collection = this.e;
        if (collection == null) {
            this.b.b(hg1.n(upl0Var.a(this.f, userId).m(io.reactivex.rxjava3.android.schedulers.a.b()), highlightEditFragment.getActivity(), false, null, 62).subscribe(new pf1(new vam(this, 15), 21), new x4v(a.b, 0)));
            return;
        }
        Integer num = (Integer) j5g.Z(collection);
        StoryEntry d = num != null ? upl0Var.d(num.intValue(), userId) : null;
        if (d != null) {
            L0(new HighlightLocalStoryCover(d, rectF, 2, objArr == true ? 1 : 0));
        }
        ArrayList c = upl0Var.c(userId, this.m);
        ArrayList arrayList = new ArrayList(c5g.u(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            arrayList.add(new z2m0((StoryEntry) it.next(), true));
        }
        highlightEditFragment.ko(userId, arrayList);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void j7() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.m;
            if (!hasNext) {
                break;
            }
            StoryEntry storyEntry = (StoryEntry) it.next();
            arrayList3.add(new z2m0(storyEntry, arrayList.contains(Integer.valueOf(storyEntry.c))));
        }
        HighlightEditFragment highlightEditFragment = this.c;
        ppl0 ppl0Var = (ppl0) highlightEditFragment.e0.getValue();
        ArrayList arrayList4 = ppl0Var.d;
        m.d a2 = androidx.recyclerview.widget.m.a(new npl0(arrayList4, arrayList3), true);
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        a2.b(ppl0Var);
        upl0 upl0Var = this.h;
        UserId userId = this.d;
        ArrayList c = upl0Var.c(userId, arrayList);
        ArrayList arrayList5 = new ArrayList(c5g.u(c, 10));
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            arrayList5.add(new z2m0((StoryEntry) it2.next(), true));
        }
        highlightEditFragment.ko(userId, arrayList5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    @Override // xsna.u4v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o4(String str) {
        Integer num;
        Photo photo;
        Integer valueOf;
        boolean z;
        io.reactivex.rxjava3.core.x b;
        String str2;
        ArrayList arrayList = this.m;
        if (arrayList.size() > 100) {
            cvk.u(R.string.stories_in_moment_limit, false);
            return;
        }
        HighlightEditFragment highlightEditFragment = this.c;
        highlightEditFragment.jo(false);
        Photo photo2 = this.o;
        if (photo2 != null) {
            valueOf = Integer.valueOf(photo2.c);
        } else {
            HighlightCover highlightCover = this.n;
            if (highlightCover == null) {
                num = null;
                int i = this.f;
                z = i != 0;
                if (z) {
                    String str3 = str;
                    if (num != null) {
                        HighlightCover highlightCover2 = this.n;
                        b = gu50.b(this.i, this.d, i, str3, arrayList, highlightCover2 != null ? highlightCover2.d() : null, null, num, 32);
                    } else {
                        HighlightCover highlightCover3 = this.n;
                        RectF d = highlightCover3 != null ? highlightCover3.d() : null;
                        HighlightCover highlightCover4 = this.n;
                        str3 = str3;
                        b = gu50.b(this.i, this.d, i, str3, arrayList, d, highlightCover4 != null ? up2.o(highlightCover4) : null, null, 64);
                    }
                    str2 = str3;
                } else if (num != null) {
                    HighlightCover highlightCover5 = this.n;
                    str2 = str;
                    b = gu50.e(this.i, this.d, str2, arrayList, highlightCover5 != null ? highlightCover5.d() : null, null, num, 16);
                } else {
                    str2 = str;
                    HighlightCover highlightCover6 = this.n;
                    RectF d2 = highlightCover6 != null ? highlightCover6.d() : null;
                    HighlightCover highlightCover7 = this.n;
                    b = gu50.e(this.i, this.d, str2, arrayList, d2, highlightCover7 != null ? up2.o(highlightCover7) : null, null, 32);
                }
                this.b.b(hg1.n(b, highlightEditFragment.getActivity(), false, null, 62).subscribe(new np3(new y4v(this, z, str2), 24), new pp3(new e2s(this, 2), 23)));
            }
            valueOf = highlightCover instanceof HighlightLocalCustomCover ? ((HighlightLocalCustomCover) highlightCover).c : (!(highlightCover instanceof HighlightRemoteCustomCover) || (photo = ((HighlightRemoteCustomCover) highlightCover).c) == null) ? null : Integer.valueOf(photo.c);
        }
        num = valueOf;
        int i2 = this.f;
        if (i2 != 0) {
        }
        if (z) {
        }
        this.b.b(hg1.n(b, highlightEditFragment.getActivity(), false, null, 62).subscribe(new np3(new y4v(this, z, str2), 24), new pp3(new e2s(this, 2), 23)));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        dispose();
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        com.vk.lists.c cVar = this.k;
        if (cVar != null) {
            cVar.v();
        }
        this.k = null;
    }

    @Override // xsna.u4v
    public final void s0(StoryEntry storyEntry, boolean z) {
        ArrayList arrayList = this.m;
        if (!z) {
            arrayList.remove(Integer.valueOf(storyEntry.c));
            HighlightCover highlightCover = this.n;
            if (highlightCover != null) {
                int i = storyEntry.c;
                Integer o = up2.o(highlightCover);
                if (o != null && i == o.intValue()) {
                    Integer num = (Integer) j5g.a0(arrayList);
                    R4(num != null ? num.intValue() : 0, null);
                }
            }
        } else if (!arrayList.contains(Integer.valueOf(storyEntry.c))) {
            arrayList.add(Integer.valueOf(storyEntry.c));
            if (this.n == null) {
                R4(storyEntry.c, null);
            }
        }
        j7();
    }

    @Override // xsna.u4v
    public final void t5(VkRecyclerPaginatedView vkRecyclerPaginatedView) {
        c.h hVar = new c.h(this.p);
        hVar.i = 100;
        this.k = com.vk.lists.f.a(hVar, vkRecyclerPaginatedView);
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}

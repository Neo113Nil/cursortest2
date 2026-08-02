package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.live.impl.views.liveswipe.LiveViewPager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: LiveSwipePagerAdapter.java */
/* loaded from: classes3.dex */
public final class nmz extends s1q0 {
    public pmz f;
    public mmz g;
    public String k;
    public boolean l;
    public long m;
    public boolean n;
    public LiveViewPager o;
    public pmz p;
    public dlz q;

    @Nullable
    public zet0 s;

    @Nullable
    public com.vk.video.ui.share.api.b t;
    public VideoAdvertisementsRepository u;

    @Nullable
    public fjs0 v;
    public List<VideoOwner> h = new ArrayList();
    public boolean i = false;
    public final HashSet j = new HashSet();
    public boolean r = false;

    public final void b(boolean z) {
        boolean z2 = !this.l && z;
        this.l = z;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            LiveView liveView = (LiveView) it.next();
            liveView.getPresenter().J0(z);
            if (z2) {
                liveView.getPresenter().a();
            }
            if (liveView.getUpcomingView() != null) {
                if (z) {
                    liveView.getUpcomingView().s4();
                } else {
                    liveView.getUpcomingView().t0();
                }
            }
        }
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
        LiveView liveView = (LiveView) obj;
        liveView.release();
        this.j.remove(liveView);
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.h.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        LiveView liveView = (LiveView) obj;
        Iterator<VideoOwner> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().c.equals(liveView.getPresenter().getModel().c)) {
                return i;
            }
            i++;
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        VideoOwner videoOwner = this.h.get(i);
        LiveView liveView = new LiveView(viewGroup.getContext());
        liveView.setTag(videoOwner.c);
        com.vk.libvideo.live.impl.views.live.b bVar = new com.vk.libvideo.live.impl.views.live.b(liveView);
        bVar.h0 = true;
        bVar.l0 = this.q;
        bVar.v0(new nnz(liveView));
        bVar.U = this.f.d();
        bVar.V = this.f.t();
        bVar.e0 = this.p;
        bVar.g0 = this.m;
        bVar.n0 = this.s;
        bVar.p0 = this.v;
        bVar.o0 = this.t;
        bVar.k0 = this.r;
        bVar.Y = this.u;
        liveView.setPresenter((oiz) bVar);
        liveView.setWindow(this.g.getWindow());
        liveView.setLayoutParams(new RecyclerView.p(-1, -1));
        liveView.getPresenter().e1(videoOwner);
        liveView.getPresenter().h2(this.k);
        liveView.getPresenter().J0(this.l);
        int i2 = 0;
        if (i != 0 || this.i) {
            liveView.getPresenter().w1(true);
            liveView.getPresenter().u0(false);
            liveView.getPresenter().j1();
        } else {
            this.o.setCurLiveView(liveView);
            liveView.getPresenter().u0(true);
            liveView.getPresenter().w1(this.n);
            liveView.getPresenter().setActive(true);
            liveView.getPresenter().B0();
            liveView.getPresenter().start();
            this.i = true;
        }
        viewGroup.addView(liveView);
        VideoFile videoFile = videoOwner.f;
        Context context = liveView.getContext();
        if ((context instanceof Activity) && videoFile != null) {
            Activity activity = (Activity) context;
            if (videoFile.getWidth() >= videoFile.getHeight() && t5m.a(activity)) {
                i2 = iah0.h(activity, false);
            }
            f4m.q(i2, liveView.D);
        }
        this.j.add(liveView);
        return liveView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}

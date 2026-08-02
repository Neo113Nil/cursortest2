package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.voip.ui.groupcalls.list.primary.tab.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.gbu0;
import xsna.is60;
import xsna.l6c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx40 implements io.reactivex.rxjava3.functions.l, ptk0, io.reactivex.rxjava3.core.s, a.b, bc80, gbu0.a, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xx40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        is60 is60Var = (is60) lm50Var;
        wd60 wd60Var = ((NewsfeedFragment) this.c).R;
        s3q0 s3q0Var = s3q0.a;
        if (is60Var instanceof is60.a) {
            wd60Var.b.r(s3q0Var, is60Var);
        } else {
            wd60Var.getClass();
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((pue) this.c).invoke(obj, obj2);
    }

    public float b(float f) {
        return ((ftk0) this.c).k.getDensity() * f;
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        ((io.reactivex.rxjava3.core.b) this.c).onComplete();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        ((k140) this.c).b = rVar;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 21:
                return ((Boolean) ((oan0) this.c).invoke(obj)).booleanValue();
            default:
                ((f3y0) this.c).getClass();
                return ((xvg0) obj) instanceof c790;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Pair) ((kdn) this.c).invoke(obj);
            case 1:
            case 4:
            case 6:
            case 7:
            case 9:
            case 16:
            default:
                return (it80) ((n9m0) this.c).invoke(obj);
            case 2:
                return (Bitmap) ((xsq) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((ja90) this.c).invoke(obj);
            case 5:
                return (l6c0.a) ((zb60) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((o82) this.c).invoke(obj);
            case 10:
                return (GetStoriesResponse) ((xsq) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((cq3) this.c).invoke(obj);
            case 12:
                return (Boolean) ((oan0) this.c).invoke(obj);
            case 13:
                return (VKList) ((dpm) this.c).invoke(obj);
            case 14:
                return (VideoAdvertisementsRepository.a) ((oan0) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.video.ui.discovery.minimizable.related_videos.j) this.c).invoke(obj);
            case 17:
                return (Boolean) ((oan0) this.c).invoke(obj);
            case 18:
                return (Bitmap) ((ja90) this.c).invoke(obj);
        }
    }
}

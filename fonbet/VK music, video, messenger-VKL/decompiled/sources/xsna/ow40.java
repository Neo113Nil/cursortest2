package xsna;

import com.vk.clips.design.view.timeline.TimelineVoiceoverView;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.qje0;
import xsna.qqd0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zl20) obj2).invoke(obj);
                break;
            case 1:
                ((mgz) obj2).invoke(obj);
                break;
            case 2:
                ((mgz) obj2).invoke(obj);
                break;
            case 3:
                ((sg60) obj2).e((vf60) obj);
                break;
            case 4:
                ((cm60) obj2).invoke(obj);
                break;
            case 5:
                ((kr60) obj2).c(new yo60.g.a((Throwable) obj));
                break;
            case 6:
                ((mgz) obj2).invoke(obj);
                break;
            case 7:
                ((mgz) obj2).invoke(obj);
                break;
            case 8:
                ((nk0) obj2).invoke(obj);
                break;
            case 9:
                ((mgz) obj2).invoke(obj);
                break;
            case 10:
                ((m9) obj2).invoke(obj);
                break;
            case 11:
                ((mgz) obj2).invoke(obj);
                break;
            case 12:
                ((zad0) obj2).invoke(obj);
                break;
            case 13:
                ((tqd0) obj2).e(new qqd0.d((tsd0) ((it80) obj).a));
                break;
            case 14:
                ((qje0.a) obj2).invoke(obj);
                break;
            case 15:
                ((ape0) obj2).invoke(obj);
                break;
            case 16:
                ((eci0) obj2).invoke(obj);
                break;
            case 17:
                ((eci0) obj2).invoke(obj);
                break;
            case 18:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) obj2;
                L.i((Throwable) obj);
                cmf0.a.c(bVar.getContext(), bVar.l0, R.string.story_loading_error);
                bVar.finish();
                break;
            case 19:
                ((ape0) obj2).invoke(obj);
                break;
            case 20:
                int i2 = TimelineVoiceoverView.v;
                ((ev60) obj2).invoke(obj);
                break;
            case 21:
                ((bua) obj2).invoke(obj);
                break;
            case 22:
                ((kti) obj2).invoke(obj);
                break;
            case 23:
                ((eci0) obj2).invoke(obj);
                break;
            case 24:
                ((defpackage.y) obj2).invoke(obj);
                break;
            case 25:
                isq0 isq0Var = (isq0) obj2;
                Pair pair = (Pair) obj;
                bwq0 bwq0Var = (bwq0) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                isq0Var.e(bwq0Var);
                isq0Var.E(booleanValue);
                isq0Var.z();
                isq0Var.t();
                break;
            case 26:
                ((ape0) obj2).invoke(obj);
                break;
            case 27:
                int i3 = VideoSeekPreviewImage.G;
                ((sxl0) obj2).invoke(obj);
                break;
            case 28:
                ((bnc0) obj2).invoke(obj);
                break;
            default:
                ((pst0) obj2).invoke(obj);
                break;
        }
    }
}

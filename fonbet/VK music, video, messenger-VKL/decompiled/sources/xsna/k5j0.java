package xsna;

import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.stories.StorySettingsActivity;
import kotlin.Pair;
import xsna.ezu0;
import xsna.mcj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class k5j0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((lxz) obj2).invoke(obj);
                break;
            case 1:
                ((mcj0) obj2).invoke(obj);
                break;
            case 2:
                ((sd1) obj2).invoke(obj);
                break;
            case 3:
                ((sd1) obj2).invoke(obj);
                break;
            case 4:
                ((mcj0) obj2).invoke(obj);
                break;
            case 5:
                int i2 = StorySettingsActivity.P;
                ((mcj0) obj2).invoke(obj);
                break;
            case 6:
                ((mcj0) obj2).invoke(obj);
                break;
            case 7:
                ((xbn0) obj2).invoke(obj);
                break;
            case 8:
                ((x620) obj2).invoke(obj);
                break;
            case 9:
                ((mcj0) obj2).invoke(obj);
                break;
            case 10:
                ((mcj0) obj2).invoke(obj);
                break;
            case 11:
                isq0 isq0Var = (isq0) obj2;
                Pair pair = (Pair) obj;
                bwq0 bwq0Var = (bwq0) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                isq0Var.e(bwq0Var);
                isq0Var.E(booleanValue);
                isq0Var.t();
                break;
            case 12:
                ((pm90) obj2).invoke(obj);
                break;
            case 13:
                ((qbr0) obj2).invoke(obj);
                break;
            case 14:
                ((mcj0) obj2).invoke(obj);
                break;
            case 15:
                ((sd1) obj2).invoke(obj);
                break;
            case 16:
                int i3 = VideoEmbedFragment.q0;
                ((mcj0) obj2).invoke(obj);
                break;
            case 17:
                ((pm90) obj2).invoke(obj);
                break;
            case 18:
                ((pm90) obj2).invoke(obj);
                break;
            case 19:
                fqu0 fqu0Var = (fqu0) obj2;
                mcj.a aVar = (mcj.a) obj;
                if (!aVar.a.isEmpty()) {
                    fqu0Var.invoke(aVar);
                    break;
                }
                break;
            case 20:
                ((ezu0.a) obj2).invoke(obj);
                break;
            case 21:
                ((mcj0) obj2).invoke(obj);
                break;
            case 22:
                ((whw0) obj2).invoke(obj);
                break;
            default:
                ((whw0) obj2).invoke(obj);
                break;
        }
    }
}

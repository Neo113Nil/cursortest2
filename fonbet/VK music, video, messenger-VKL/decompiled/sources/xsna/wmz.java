package xsna;

import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.group.Group;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wmz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wmz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().G0(((Group) obj2).c);
                break;
            case 1:
                int i2 = MasksWrap.e0;
                ((li10) obj2).invoke(obj);
                break;
            case 2:
                ((nt10) obj2).invoke(obj);
                break;
            case 3:
                ((ehu) obj2).invoke(obj);
                break;
            case 4:
                ((f630) obj2).invoke(obj);
                break;
            case 5:
                ((foh) obj2).invoke(obj);
                break;
            case 6:
                ((nt10) obj2).invoke(obj);
                break;
            case 7:
                ((ehu) obj2).invoke(obj);
                break;
            case 8:
                ((kb40) obj2).invoke(obj);
                break;
            case 9:
                ((nt10) obj2).invoke(obj);
                break;
            case 10:
                ((ehu) obj2).invoke(obj);
                break;
            case 11:
                ((dam) obj2).invoke(obj);
                break;
            case 12:
                ((ih4) obj2).invoke(obj);
                break;
            case 13:
                el50 el50Var = (el50) obj2;
                ib50 ib50Var = (ib50) obj;
                AudioBookChapter audioBookChapter = ib50Var.a.O;
                if (audioBookChapter != null) {
                    el50Var.D(el50Var, new v53(19, audioBookChapter, ib50Var));
                    break;
                }
                break;
            case 14:
                ((sca0) obj2).invoke(obj);
                break;
            case 15:
                ((nt10) obj2).invoke(obj);
                break;
            case 16:
                ((nt10) obj2).invoke(obj);
                break;
            case 17:
                ((kb40) obj2).invoke(obj);
                break;
            case 18:
                ((nt10) obj2).invoke(obj);
                break;
            case 19:
                ((wd3) obj2).invoke(obj);
                break;
            case 20:
                float f = ShutterButton.L;
                ((nt10) obj2).invoke(obj);
                break;
            case 21:
                ((ubj0) obj2).invoke(obj);
                break;
            case 22:
                ((nt10) obj2).invoke(obj);
                break;
            case 23:
                ((kb40) obj2).invoke(obj);
                break;
            case 24:
                ((zyl0) obj2).invoke(obj);
                break;
            case 25:
                ((wd3) obj2).invoke(obj);
                break;
            case 26:
                ((zyl0) obj2).invoke(obj);
                break;
            case 27:
                ((wgm0) obj2).invoke(obj);
                break;
            case 28:
                int i3 = VideoAlbumEditorFragment.l0;
                ((ape0) obj2).invoke(obj);
                break;
            default:
                ((zyl0) obj2).invoke(obj);
                break;
        }
    }
}

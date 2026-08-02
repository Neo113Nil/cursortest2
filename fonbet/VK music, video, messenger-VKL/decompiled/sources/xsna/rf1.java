package xsna;

import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.data.VKList;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import java.util.List;
import java.util.Optional;
import org.json.JSONObject;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import xsna.c4u;
import xsna.chp0;
import xsna.fih;
import xsna.rrt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rf1 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, Supplier1, io.reactivex.rxjava3.functions.d, mw, io.reactivex.rxjava3.functions.g, chp0.a, rrt.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.mw
    public void a(boolean z) {
        ((h1d) this.c).b.a(new k3d(z));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (String) ((a60) this.c).invoke(obj);
            case 2:
                return (VKList) ((wi3) this.c).invoke(obj);
            case 3:
                return (MusicDto) ((gr3) this.c).invoke(obj);
            case 4:
                return (List) ((ef5) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((x96) this.c).invoke(obj);
            case 6:
            case 7:
            case 11:
            case 15:
            case 16:
            case 18:
            case 19:
            case 24:
            case 25:
            default:
                return (c4u.a) ((n3i) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((p6a) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((gr3) this.c).invoke(obj);
            case 10:
                return (s3q0) ((gr3) this.c).invoke(obj);
            case 12:
                return (ClipsEditorMusicInfo) ((gr3) this.c).invoke(obj);
            case 13:
                return (List) ((a60) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((gr3) this.c).invoke(obj);
            case 17:
                return ((nuh) this.c).invoke(obj);
            case 20:
                return (wpp) ((a60) this.c).invoke(obj);
            case 21:
                return (Integer) ((n3i) this.c).c;
            case 22:
                return (it80) ((a60) this.c).invoke(obj);
            case 23:
                return (Optional) ((n3i) this.c).invoke(obj);
            case 26:
                return (JSONObject) ((j20) this.c).invoke(obj);
            case 27:
                return (List) ((zos) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (fih.b) ((dih) this.c).invoke(obj, obj2, obj3);
    }

    @Override // ru.ok.gl.util.Supplier1
    public Object get(Object obj) {
        kta ktaVar = ((com.vk.voip.call_effects.a) this.c).b.e;
        qcy<Object> qcyVar = c39.g[0];
        return new hao0(ktaVar.a(), (TensorflowModel) obj);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        j89 j89Var = (j89) this.c;
        int i = CallParticipantsFragment.W;
        return ((Boolean) j89Var.invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((Boolean) ((zx) obj2).invoke(obj)).booleanValue();
            case 16:
                int i2 = CommunityProfileFragment.k0;
                return ((Boolean) ((gr3) obj2).invoke(obj)).booleanValue();
            case 18:
                return ((Boolean) ((n3i) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((a60) obj2).invoke(obj)).booleanValue();
        }
    }
}

package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.calls.CallStartAction;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hdw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hdw(StoryEntry storyEntry, boolean z, Integer num) {
        this.b = 2;
        this.d = storyEntry;
        this.c = z;
        this.e = num;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ImStartGroupCallFragment imStartGroupCallFragment = (ImStartGroupCallFragment) obj3;
                int i2 = ImStartGroupCallFragment.f0;
                g2v.c().j().a(imStartGroupCallFragment.kn(), new DialogExt((Dialog) obj, new ProfilesInfo((List) obj2)), imStartGroupCallFragment.b0, this.c, o25.b(o25.a()) ? rl3.y0(new CallStartAction[]{new CallStartAction.a(false), new CallStartAction.b(false), new CallStartAction.d(), new CallStartAction.c()}) : EmptySet.b);
                imStartGroupCallFragment.finish();
                return s3q0.a;
            case 1:
                vh40 vh40Var = (vh40) obj3;
                Playlist playlist = (Playlist) obj2;
                Playlist playlist2 = (Playlist) obj;
                if (playlist2 == null) {
                    return io.reactivex.rxjava3.internal.operators.single.a0.b;
                }
                sg40 sg40Var = vh40Var.c;
                UserId c = o25.a().c();
                sg40Var.a.L(playlist);
                Future submit = sg40Var.n.submit(new lg40(sg40Var, c, playlist, z));
                int i3 = io.reactivex.rxjava3.core.g.b;
                return new io.reactivex.rxjava3.internal.operators.flowable.u0(new io.reactivex.rxjava3.internal.operators.flowable.x(submit)).l(new bk1(new ebx(playlist2, 10), 24));
            default:
                StoryEntry storyEntry = (StoryEntry) obj3;
                storyEntry.c0 = z;
                storyEntry.g0 = (Integer) obj2;
                return s3q0.a;
        }
    }

    public /* synthetic */ hdw(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }
}

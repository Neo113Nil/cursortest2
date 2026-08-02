package xsna;

import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xa40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((ab40) this.c).d((List) obj, true);
            case 1:
                jq40 jq40Var = (jq40) this.c;
                fa50 fa50Var = (fa50) obj;
                MusicTrack musicTrack = fa50Var.b;
                MusicTrack musicTrack2 = fa50Var.a;
                df5 df5Var = jq40Var.b;
                if (df5Var.m(musicTrack.Fb()) != null) {
                    df5Var.p(musicTrack2, musicTrack.Fb());
                }
                return s3q0.a;
            case 2:
                return new MusicTabsFiltersView.d((b2a) obj, (m7a) this.c);
            default:
                ((whe0) this.c).a = ((Boolean) obj).booleanValue();
                return s3q0.a;
        }
    }
}

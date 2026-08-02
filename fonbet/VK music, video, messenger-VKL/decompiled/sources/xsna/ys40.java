package xsna;

import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import com.vk.queue.sync.utils.InterruptionType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ys40 implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ ys40(xvy xvyVar, List list, boolean z, MusicPickerLoadingState musicPickerLoadingState) {
        this.d = xvyVar;
        this.e = list;
        this.c = z;
        this.f = musicPickerLoadingState;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                xvy xvyVar = (xvy) this.d;
                List list = (List) this.e;
                MusicPickerLoadingState musicPickerLoadingState = (MusicPickerLoadingState) this.f;
                xuy i = kci.i(xvyVar);
                Integer valueOf = i != null ? Integer.valueOf(i.getIndex()) : null;
                return Boolean.valueOf((valueOf == null || valueOf.intValue() < e43.h(new wow(list)) + (-5) || !this.c || musicPickerLoadingState == MusicPickerLoadingState.Loading || musicPickerLoadingState == MusicPickerLoadingState.NextPageLoading || musicPickerLoadingState == MusicPickerLoadingState.Error || musicPickerLoadingState == MusicPickerLoadingState.NextPageLoadingError) ? false : true);
            default:
                dox doxVar = (dox) this.d;
                ise0 ise0Var = (ise0) this.e;
                HashSet hashSet = (HashSet) this.f;
                InterruptionType j = sdy.j(this.c);
                if (j.i()) {
                    if (doxVar != null) {
                        doxVar.invoke("RELEASE_PREV_CONNECTION", Boolean.valueOf(j.h()));
                    }
                    z = false;
                } else {
                    ise0Var.a.c(ise0Var.b.a(hashSet).values());
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ys40(boolean z, dox doxVar, ise0 ise0Var, HashSet hashSet) {
        this.c = z;
        this.d = doxVar;
        this.e = ise0Var;
        this.f = hashSet;
    }
}

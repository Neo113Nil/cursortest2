package xsna;

import com.vk.music.ui.search.history.SearchHistoryItemViewParams$PlayingState;

/* compiled from: AddRoomToCallFeature.kt */
/* loaded from: classes7.dex */
public final class pn0 {
    public final Object a;
    public final Object b;

    public /* synthetic */ pn0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public pn0(int i) {
        switch (i) {
            case 3:
                this.a = new dqu();
                this.b = new j2r0();
                break;
            case 4:
                this.a = androidx.compose.runtime.k.b(new zuh0(0));
                this.b = androidx.compose.runtime.k.b(SearchHistoryItemViewParams$PlayingState.NONE);
                break;
            default:
                this.a = new vg20();
                this.b = new io.reactivex.rxjava3.disposables.b();
                break;
        }
    }
}

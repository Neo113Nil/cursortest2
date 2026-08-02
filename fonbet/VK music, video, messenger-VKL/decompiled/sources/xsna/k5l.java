package xsna;

import com.vk.debug.ui.dev.DebugFileManagerFragment;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import java.io.Serializable;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k5l implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;
    public final /* synthetic */ xzs h;
    public final /* synthetic */ izs i;

    public /* synthetic */ k5l(String str, String str2, DebugFileManagerFragment.b bVar, j20 j20Var, e5l e5lVar, mmf mmfVar, o1e o1eVar) {
        this.c = str;
        this.d = str2;
        this.e = bVar;
        this.f = j20Var;
        this.g = e5lVar;
        this.h = mmfVar;
        this.i = o1eVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                DebugFileManagerFragment.b bVar = (DebugFileManagerFragment.b) this.e;
                j20 j20Var = (j20) this.f;
                e5l e5lVar = (e5l) this.g;
                mmf mmfVar = (mmf) this.h;
                o1e o1eVar = (o1e) this.i;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1937702465, intValue, -1, "com.vk.debug.design.createFileManagerComposeView.<anonymous>.<anonymous>.<anonymous> (DebugFileManagerScreen.kt:70)");
                    }
                    w5l.a(this.c, str, bVar, j20Var, e5lVar, null, mmfVar, o1eVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ebi0.a((List) this.d, this.c, (MusicPickerListItem.MusicTrackItem.PlayingState) this.e, (q630) this.f, (izs) this.g, (gzs) this.h, this.i, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k5l(List list, String str, MusicPickerListItem.MusicTrackItem.PlayingState playingState, q630 q630Var, izs izsVar, gzs gzsVar, izs izsVar2, int i) {
        this.d = list;
        this.c = str;
        this.e = playingState;
        this.f = q630Var;
        this.g = izsVar;
        this.h = gzsVar;
        this.i = izsVar2;
    }
}

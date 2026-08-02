package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.compose.component.input.InputSelect$State;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class z1x implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1x(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                b2x b2xVar = (b2x) this.c;
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(wzsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2021822453, intValue, -1, "com.vk.core.compose.component.input.InputImpl.Content.<anonymous> (InputImpl.kt:94)");
                    }
                    wh50 j = sa30.j((sg50) ((zak0) b2xVar.m).getValue(), aVar, 0);
                    InputSelect$State inputSelect$State = (InputSelect$State) ((zak0) b2xVar.b).getValue();
                    boolean booleanValue = ((Boolean) j.getValue()).booleanValue();
                    boolean b = b2xVar.b();
                    s1v.k();
                    rqv0.a(inputSelect$State, booleanValue, b, s200.C(q630.a.a, on20.f), null, null, null, kai.c(302113338, new a2x(0, b2xVar, wzsVar), aVar), aVar, 12582912, 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                UIBlockList uIBlockList = (UIBlockList) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(968991672, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:201)");
                    }
                    ((epi) aVar2.r(fpi.a)).a(uIBlockList, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}

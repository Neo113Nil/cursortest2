package xsna;

import com.vk.dto.group.Group;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import java.util.List;
import xsna.kcl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class os40 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ os40(int i, qs40 qs40Var, MusicPickerList musicPickerList) {
        this.c = i;
        this.d = qs40Var;
        this.e = musicPickerList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qs40 qs40Var = (qs40) this.d;
                MusicPickerList musicPickerList = (MusicPickerList) this.e;
                Throwable th = (Throwable) obj;
                if (this.c == 0) {
                    qs40Var.T(new st40(musicPickerList, th));
                } else {
                    qs40Var.T(new yt40(musicPickerList, th));
                }
                break;
            case 1:
                c2l0 c2l0Var = (c2l0) this.d;
                String str = (String) this.e;
                k8l0 k8l0Var = c2l0Var.d;
                kcl0.e eVar = k8l0Var.b;
                int i = this.c;
                eVar.e(i, str);
                k8l0Var.f.a(i);
                List<StickerSuggestion> a = eVar.a(i);
                if (a != null) {
                    k8l0Var.a(a);
                }
                androidx.appcompat.app.d dVar = c2l0Var.e;
                if (dVar != null) {
                    dVar.dismiss();
                }
                break;
            default:
                q3n0 q3n0Var = (q3n0) this.d;
                Group group = (Group) this.e;
                Throwable th2 = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th2);
                q3n0.f(group, this.c);
                q3n0Var.a.o6();
                j03.l(th2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ os40(c2l0 c2l0Var, int i, String str) {
        this.d = c2l0Var;
        this.c = i;
        this.e = str;
    }

    public /* synthetic */ os40(q3n0 q3n0Var, Group group, int i) {
        this.d = q3n0Var;
        this.e = group;
        this.c = i;
    }
}

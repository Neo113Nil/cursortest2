package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ps40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ qs40 c;
    public final /* synthetic */ MusicPickerList d;

    public /* synthetic */ ps40(int i, qs40 qs40Var, MusicPickerList musicPickerList) {
        this.b = i;
        this.c = qs40Var;
        this.d = musicPickerList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        int i = this.b;
        qs40 qs40Var = this.c;
        MusicPickerList musicPickerList = this.d;
        if (i == 0) {
            qs40Var.T(new st40(musicPickerList, th));
        } else {
            qs40Var.T(new yt40(musicPickerList, th));
        }
        return s3q0.a;
    }
}

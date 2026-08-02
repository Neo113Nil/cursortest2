package xsna;

import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.playlist.display.audiobook.presentation.model.AudioBookLoadState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.odn;

/* compiled from: DisplayAudioBookChaptersReducer.kt */
/* loaded from: classes3.dex */
public final class pdn extends dm50<ken, odn, jen> {
    public final sdz d;
    public final xl40 e;

    /* compiled from: DisplayAudioBookChaptersReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioBookLoadState.values().length];
            try {
                iArr[AudioBookLoadState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBookLoadState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioBookLoadState.REFRESHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioBookLoadState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pdn(jen jenVar, sdz sdzVar, xl40 xl40Var) {
        super(jenVar);
        this.d = sdzVar;
        this.e = xl40Var;
    }

    @Override // xsna.dm50
    public final jen c(jen jenVar, odn odnVar) {
        jen jenVar2 = jenVar;
        odn odnVar2 = odnVar;
        if (odnVar2 instanceof odn.a) {
            odn.a aVar = (odn.a) odnVar2;
            return jen.a(jenVar2, AudioBookLoadState.COMPLETED, aVar.b, aVar.c, null, 52);
        }
        if (odnVar2 instanceof odn.f) {
            return jen.a(jenVar2, AudioBookLoadState.REFRESHING, null, false, null, 62);
        }
        ArrayList arrayList = null;
        if (odnVar2 instanceof odn.b) {
            return jen.a(jenVar2, null, AudioBook.zb(jenVar2.c, null, ((odn.b) odnVar2).b, 4128767), false, null, 61);
        }
        if (odnVar2 instanceof odn.e) {
            return jen.a(jenVar2, null, null, ((odn.e) odnVar2).b, null, 55);
        }
        if (odnVar2.equals(odn.c.b)) {
            return jen.a(jenVar2, AudioBookLoadState.LOADING, null, false, null, 62);
        }
        if (odnVar2 instanceof odn.d) {
            return jen.a(jenVar2, AudioBookLoadState.ERROR, null, false, ((odn.d) odnVar2).b, 30);
        }
        if (!(odnVar2 instanceof odn.g)) {
            throw new NoWhenBranchMatchedException();
        }
        List<AudioBookChapter> list = jenVar2.c.k;
        if (list != null) {
            List<AudioBookChapter> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (AudioBookChapter audioBookChapter : list2) {
                odn.g gVar = (odn.g) odnVar2;
                if (epx.f(com.vk.dto.music.audiobook.a.b(audioBookChapter), gVar.b)) {
                    audioBookChapter = AudioBookChapter.zb(audioBookChapter, 0, null, gVar.c, null, 767);
                }
                arrayList.add(audioBookChapter);
            }
        }
        return jen.a(jenVar2, null, AudioBook.zb(jenVar2.c, arrayList, false, 4193791), false, null, 61);
    }

    @Override // xsna.dm50
    public final ken d() {
        return new ken(e(new lrk(this, 4)), e(new od3(26)), e(new z13(14)));
    }

    @Override // xsna.dm50
    public final void h(jen jenVar, ken kenVar) {
        jen jenVar2 = jenVar;
        ken kenVar2 = kenVar;
        int i = a.$EnumSwitchMapping$0[jenVar2.b.ordinal()];
        if (i == 1) {
            f(kenVar2.c, jenVar2);
            return;
        }
        if (i == 2) {
            f(kenVar2.b, jenVar2);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f(kenVar2.a, jenVar2);
        }
    }
}
